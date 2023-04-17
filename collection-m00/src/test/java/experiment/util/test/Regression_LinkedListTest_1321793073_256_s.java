package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_LinkedListTest_1321793073_256_s {

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

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test129");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj6 = linkedListTestDriver0.removeFirst();
        java.lang.Object[] objArray7 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        boolean boolean10 = linkedListTestDriver8.remove((java.lang.Object) (short) 0);
        boolean boolean12 = linkedListTestDriver8.contains((java.lang.Object) 0.0d);
        linkedListTestDriver0.addLast((java.lang.Object) boolean12);
        java.lang.Object obj14 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver16.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean21 = linkedListTestDriver16.equals_CUT((java.lang.Object) 10);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add(3, (java.lang.Object) linkedListTestDriver16);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 3; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0 + "'", obj6, 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test130");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0 + "'", obj12, 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test131");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver1.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver1.addFirst((java.lang.Object) 'a');
        boolean boolean7 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver1);
        java.lang.Object[] objArray8 = linkedListTestDriver1.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver9.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj13 = linkedListTestDriver9.removeFirst();
        boolean boolean15 = linkedListTestDriver9.add((java.lang.Object) 100L);
        java.lang.Object obj17 = linkedListTestDriver9.remove((int) (short) 0);
        linkedListTestDriver9.clear();
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
        experiment.util.Iterator iterator46 = linkedListTestDriver35.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver48 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver48.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean53 = linkedListTestDriver48.add((java.lang.Object) 1.0f);
        java.lang.Object obj54 = linkedListTestDriver48.removeLast();
        boolean boolean55 = linkedListTestDriver48.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver56 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray57 = linkedListTestDriver56.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver58 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver58.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver58.addFirst((java.lang.Object) 'a');
        experiment.util.Iterator iterator64 = linkedListTestDriver58.iterator();
        boolean boolean65 = linkedListTestDriver56.contains((java.lang.Object) iterator64);
        boolean boolean66 = linkedListTestDriver48.contains((java.lang.Object) linkedListTestDriver56);
        experiment.util.LinkedListTestDriver linkedListTestDriver67 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver67.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean72 = linkedListTestDriver67.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj73 = linkedListTestDriver67.removeFirst();
        linkedListTestDriver67.clear();
        boolean boolean75 = linkedListTestDriver48.remove((java.lang.Object) linkedListTestDriver67);
        linkedListTestDriver35.add(0, (java.lang.Object) linkedListTestDriver48);
        boolean boolean77 = linkedListTestDriver9.equals_CUT((java.lang.Object) linkedListTestDriver35);
        java.lang.Object[] objArray78 = linkedListTestDriver9.toArray();
        boolean boolean79 = linkedListTestDriver1.add((java.lang.Object) objArray78);
        java.lang.Object obj80 = linkedListTestDriver1.getFirst();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[a, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[a, 0]");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0 + "'", obj13, 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 100L + "'", obj17, 100L);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 'a' + "'", obj25, 'a');
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 1.0f + "'", obj33, 1.0f);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 0 + "'", obj34, 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 1.0f + "'", obj41, 1.0f);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 0 + "'", obj42, 0);
        org.junit.Assert.assertNotNull(iterator46);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + 1.0f + "'", obj54, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[]");
        org.junit.Assert.assertNotNull(iterator64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + obj73 + "' != '" + 0 + "'", obj73, 0);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray78), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray78), "[]");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertEquals("'" + obj80 + "' != '" + 'a' + "'", obj80, 'a');
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test132");
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
        linkedListTestDriver0.addLast((java.lang.Object) (-1));
        java.lang.Object obj28 = linkedListTestDriver0.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver30.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver30.addFirst((java.lang.Object) 'a');
        experiment.util.Iterator iterator36 = linkedListTestDriver30.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver37.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean42 = linkedListTestDriver37.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj43 = linkedListTestDriver37.removeFirst();
        boolean boolean44 = linkedListTestDriver37.isEmpty();
        boolean boolean45 = linkedListTestDriver37.isEmpty();
        boolean boolean46 = linkedListTestDriver30.contains((java.lang.Object) linkedListTestDriver37);
        experiment.util.LinkedListTestDriver linkedListTestDriver47 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray48 = linkedListTestDriver47.toArray();
        boolean boolean49 = linkedListTestDriver30.add((java.lang.Object) linkedListTestDriver47);
        java.lang.Object[] objArray50 = linkedListTestDriver47.toArray();
        linkedListTestDriver47.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver52 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver52.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean57 = linkedListTestDriver52.add((java.lang.Object) 1.0f);
        java.lang.Object obj58 = linkedListTestDriver52.removeLast();
        java.lang.Object obj59 = linkedListTestDriver52.getFirst();
        experiment.util.Iterator iterator60 = linkedListTestDriver52.iterator();
        boolean boolean61 = linkedListTestDriver47.remove((java.lang.Object) iterator60);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj62 = linkedListTestDriver0.set((int) (short) 10, (java.lang.Object) linkedListTestDriver47);
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
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (-1) + "'", obj28, (-1));
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + 0 + "'", obj43, 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + 1.0f + "'", obj58, 1.0f);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + 0 + "'", obj59, 0);
        org.junit.Assert.assertNotNull(iterator60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test133");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver1.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver1.addFirst((java.lang.Object) 'a');
        boolean boolean7 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver1);
        java.lang.Object[] objArray8 = linkedListTestDriver1.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver9.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver9.addFirst((java.lang.Object) 'a');
        java.lang.Object obj15 = linkedListTestDriver9.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver16.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj20 = linkedListTestDriver16.removeFirst();
        boolean boolean22 = linkedListTestDriver16.add((java.lang.Object) 100L);
        java.lang.Object obj24 = linkedListTestDriver16.remove((int) (short) 0);
        linkedListTestDriver16.clear();
        int int26 = linkedListTestDriver16.size();
        linkedListTestDriver9.addLast((java.lang.Object) int26);
        boolean boolean28 = linkedListTestDriver1.contains((java.lang.Object) linkedListTestDriver9);
        java.lang.Object obj29 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = linkedListTestDriver9.contains(obj29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[a, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[a, 0]");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 'a' + "'", obj15, 'a');
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 0 + "'", obj20, 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 100L + "'", obj24, 100L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test134");
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
        linkedListTestDriver71.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean76 = linkedListTestDriver71.add((java.lang.Object) 1.0f);
        java.lang.Object obj77 = linkedListTestDriver71.removeLast();
        experiment.util.ListIterator listIterator79 = linkedListTestDriver71.listIterator(1);
        boolean boolean80 = linkedListTestDriver14.equals_CUT((java.lang.Object) 1);
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
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertEquals("'" + obj77 + "' != '" + 1.0f + "'", obj77, 1.0f);
        org.junit.Assert.assertNotNull(listIterator79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test135");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) 1.0f);
        java.lang.Object obj7 = linkedListTestDriver0.remove(0);
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj12 = linkedListTestDriver8.removeFirst();
        boolean boolean14 = linkedListTestDriver8.add((java.lang.Object) 100L);
        java.lang.Object obj16 = linkedListTestDriver8.remove((int) (short) 0);
        linkedListTestDriver8.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver18.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver18.addFirst((java.lang.Object) 'a');
        java.lang.Object obj24 = linkedListTestDriver18.getFirst();
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
        linkedListTestDriver18.add(2, (java.lang.Object) linkedListTestDriver34);
        linkedListTestDriver34.clear();
        experiment.util.Iterator iterator45 = linkedListTestDriver34.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver47 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver47.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean52 = linkedListTestDriver47.add((java.lang.Object) 1.0f);
        java.lang.Object obj53 = linkedListTestDriver47.removeLast();
        boolean boolean54 = linkedListTestDriver47.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver55 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray56 = linkedListTestDriver55.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver57 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver57.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver57.addFirst((java.lang.Object) 'a');
        experiment.util.Iterator iterator63 = linkedListTestDriver57.iterator();
        boolean boolean64 = linkedListTestDriver55.contains((java.lang.Object) iterator63);
        boolean boolean65 = linkedListTestDriver47.contains((java.lang.Object) linkedListTestDriver55);
        experiment.util.LinkedListTestDriver linkedListTestDriver66 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver66.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean71 = linkedListTestDriver66.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj72 = linkedListTestDriver66.removeFirst();
        linkedListTestDriver66.clear();
        boolean boolean74 = linkedListTestDriver47.remove((java.lang.Object) linkedListTestDriver66);
        linkedListTestDriver34.add(0, (java.lang.Object) linkedListTestDriver47);
        boolean boolean76 = linkedListTestDriver8.equals_CUT((java.lang.Object) linkedListTestDriver34);
        java.lang.Object[] objArray77 = linkedListTestDriver8.toArray();
        boolean boolean78 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj79 = linkedListTestDriver8.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0 + "'", obj12, 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100L + "'", obj16, 100L);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 'a' + "'", obj24, 'a');
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 1.0f + "'", obj32, 1.0f);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 0 + "'", obj33, 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 1.0f + "'", obj40, 1.0f);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 0 + "'", obj41, 0);
        org.junit.Assert.assertNotNull(iterator45);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + 1.0f + "'", obj53, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[]");
        org.junit.Assert.assertNotNull(iterator63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + obj72 + "' != '" + 0 + "'", obj72, 0);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray77), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray77), "[]");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test136");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj4 = linkedListTestDriver0.removeFirst();
        boolean boolean6 = linkedListTestDriver0.add((java.lang.Object) 100L);
        java.lang.Object obj7 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean13 = linkedListTestDriver8.equals_CUT((java.lang.Object) 10);
        experiment.util.Iterator iterator14 = linkedListTestDriver8.iterator();
        java.lang.Object[] objArray15 = linkedListTestDriver8.toArray();
        int int16 = linkedListTestDriver8.size();
        boolean boolean17 = linkedListTestDriver8.isEmpty();
        boolean boolean18 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver8);
        linkedListTestDriver8.clear();
        experiment.util.Iterator iterator20 = linkedListTestDriver8.iterator();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0 + "'", obj4, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100L + "'", obj7, 100L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(iterator20);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test137");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj6 = linkedListTestDriver0.removeFirst();
        boolean boolean7 = linkedListTestDriver0.isEmpty();
        boolean boolean8 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator10 = linkedListTestDriver0.listIterator((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 100; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0 + "'", obj6, 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test138");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj6 = linkedListTestDriver0.removeFirst();
        boolean boolean7 = linkedListTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass8 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0 + "'", obj6, 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test139");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        experiment.util.ListIterator listIterator8 = linkedListTestDriver0.listIterator(1);
        java.lang.Object obj9 = linkedListTestDriver0.removeLast();
        int int10 = linkedListTestDriver0.size();
        int int11 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean17 = linkedListTestDriver12.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj18 = linkedListTestDriver12.removeFirst();
        experiment.util.Iterator iterator19 = linkedListTestDriver12.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) iterator19);
        linkedListTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertNotNull(listIterator8);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 0 + "'", obj18, 0);
        org.junit.Assert.assertNotNull(iterator19);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test140");
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
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test141");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj4 = linkedListTestDriver0.removeFirst();
        boolean boolean6 = linkedListTestDriver0.add((java.lang.Object) 100L);
        int int7 = linkedListTestDriver0.size();
        java.lang.Object obj8 = linkedListTestDriver0.getFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = linkedListTestDriver0.remove((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0 + "'", obj4, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100L + "'", obj8, 100L);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test142");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        experiment.util.ListIterator listIterator8 = linkedListTestDriver0.listIterator(1);
        java.lang.Object obj9 = linkedListTestDriver0.removeLast();
        int int10 = linkedListTestDriver0.size();
        int int11 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean17 = linkedListTestDriver12.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj18 = linkedListTestDriver12.removeFirst();
        experiment.util.Iterator iterator19 = linkedListTestDriver12.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) iterator19);
        java.lang.Object obj21 = linkedListTestDriver0.getLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = linkedListTestDriver0.get((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertNotNull(listIterator8);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 0 + "'", obj18, 0);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test143");
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
            experiment.util.ListIterator listIterator18 = linkedListTestDriver7.listIterator(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 0");
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
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test144");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj4 = linkedListTestDriver0.removeFirst();
        linkedListTestDriver0.clear();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        boolean boolean8 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10L);
        boolean boolean10 = linkedListTestDriver0.add((java.lang.Object) (short) -1);
        java.lang.Object obj11 = linkedListTestDriver0.removeLast();
        boolean boolean13 = linkedListTestDriver0.equals_CUT((java.lang.Object) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = linkedListTestDriver0.getLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0 + "'", obj4, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) -1 + "'", obj11, (short) -1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test145");
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
        linkedListTestDriver71.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean76 = linkedListTestDriver71.add((java.lang.Object) 1.0f);
        java.lang.Object obj77 = linkedListTestDriver71.removeLast();
        experiment.util.ListIterator listIterator79 = linkedListTestDriver71.listIterator(1);
        java.lang.Object obj80 = linkedListTestDriver71.removeLast();
        experiment.util.Iterator iterator81 = linkedListTestDriver71.iterator();
        linkedListTestDriver14.addFirst((java.lang.Object) iterator81);
        java.lang.Object[] objArray83 = linkedListTestDriver14.toArray();
        java.lang.Object[] objArray84 = linkedListTestDriver14.toArray();
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
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertEquals("'" + obj77 + "' != '" + 1.0f + "'", obj77, 1.0f);
        org.junit.Assert.assertNotNull(listIterator79);
        org.junit.Assert.assertEquals("'" + obj80 + "' != '" + 0 + "'", obj80, 0);
        org.junit.Assert.assertNotNull(iterator81);
        org.junit.Assert.assertNotNull(objArray83);
        org.junit.Assert.assertNotNull(objArray84);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test146");
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
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver29.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean34 = linkedListTestDriver29.add((java.lang.Object) 1.0f);
        java.lang.Object obj35 = linkedListTestDriver29.removeLast();
        boolean boolean36 = linkedListTestDriver29.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray38 = linkedListTestDriver37.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver39 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver39.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver39.addFirst((java.lang.Object) 'a');
        experiment.util.Iterator iterator45 = linkedListTestDriver39.iterator();
        boolean boolean46 = linkedListTestDriver37.contains((java.lang.Object) iterator45);
        boolean boolean47 = linkedListTestDriver29.contains((java.lang.Object) linkedListTestDriver37);
        experiment.util.LinkedListTestDriver linkedListTestDriver48 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver48.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean53 = linkedListTestDriver48.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj54 = linkedListTestDriver48.removeFirst();
        linkedListTestDriver48.clear();
        boolean boolean56 = linkedListTestDriver29.remove((java.lang.Object) linkedListTestDriver48);
        linkedListTestDriver16.add(0, (java.lang.Object) linkedListTestDriver29);
        java.lang.Object[] objArray58 = linkedListTestDriver16.toArray();
        java.lang.Object obj59 = linkedListTestDriver16.removeFirst();
        boolean boolean60 = linkedListTestDriver16.isEmpty();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 'a' + "'", obj6, 'a');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1.0f + "'", obj14, 1.0f);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0 + "'", obj15, 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 1.0f + "'", obj22, 1.0f);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 0 + "'", obj23, 0);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 1.0f + "'", obj35, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertNotNull(iterator45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + 0 + "'", obj54, 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test147");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj4 = linkedListTestDriver0.removeFirst();
        boolean boolean6 = linkedListTestDriver0.add((java.lang.Object) 100L);
        java.lang.Object obj8 = linkedListTestDriver0.remove((int) (short) 0);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver11.addFirst((java.lang.Object) 'a');
        experiment.util.Iterator iterator17 = linkedListTestDriver11.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver18.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean23 = linkedListTestDriver18.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj24 = linkedListTestDriver18.removeFirst();
        boolean boolean25 = linkedListTestDriver18.isEmpty();
        boolean boolean26 = linkedListTestDriver18.isEmpty();
        boolean boolean27 = linkedListTestDriver11.contains((java.lang.Object) linkedListTestDriver18);
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver28.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean33 = linkedListTestDriver28.add((java.lang.Object) (short) 10);
        linkedListTestDriver28.clear();
        linkedListTestDriver11.addFirst((java.lang.Object) linkedListTestDriver28);
        linkedListTestDriver11.clear();
        boolean boolean37 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj39 = linkedListTestDriver11.remove((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0 + "'", obj4, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100L + "'", obj8, 100L);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0 + "'", obj24, 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test148");
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
        linkedListTestDriver0.addLast((java.lang.Object) (-1));
        java.lang.Object obj28 = linkedListTestDriver0.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver30.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver30.addFirst((java.lang.Object) 'a');
        java.lang.Object obj36 = linkedListTestDriver30.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver38 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver38.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean43 = linkedListTestDriver38.add((java.lang.Object) 1.0f);
        java.lang.Object obj44 = linkedListTestDriver38.removeLast();
        java.lang.Object obj45 = linkedListTestDriver38.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver46 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver46.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean51 = linkedListTestDriver46.add((java.lang.Object) 1.0f);
        java.lang.Object obj52 = linkedListTestDriver46.removeLast();
        java.lang.Object obj53 = linkedListTestDriver46.getFirst();
        linkedListTestDriver38.addFirst((java.lang.Object) linkedListTestDriver46);
        linkedListTestDriver30.add(2, (java.lang.Object) linkedListTestDriver46);
        experiment.util.LinkedListTestDriver linkedListTestDriver57 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver57.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj61 = linkedListTestDriver57.removeFirst();
        linkedListTestDriver57.clear();
        boolean boolean63 = linkedListTestDriver57.isEmpty();
        boolean boolean65 = linkedListTestDriver57.equals_CUT((java.lang.Object) 10L);
        experiment.util.LinkedListTestDriver linkedListTestDriver66 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver66.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean71 = linkedListTestDriver66.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj72 = linkedListTestDriver66.removeFirst();
        java.lang.Object[] objArray73 = linkedListTestDriver66.toArray();
        experiment.util.Iterator iterator74 = linkedListTestDriver66.iterator();
        boolean boolean75 = linkedListTestDriver57.add((java.lang.Object) iterator74);
        linkedListTestDriver57.clear();
        java.lang.Object obj77 = linkedListTestDriver30.set((int) (short) 0, (java.lang.Object) linkedListTestDriver57);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj78 = linkedListTestDriver0.set((-1), (java.lang.Object) linkedListTestDriver57);
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
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (-1) + "'", obj28, (-1));
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 'a' + "'", obj36, 'a');
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 1.0f + "'", obj44, 1.0f);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + 0 + "'", obj45, 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 1.0f + "'", obj52, 1.0f);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + 0 + "'", obj53, 0);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + 0 + "'", obj61, 0);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + obj72 + "' != '" + 0 + "'", obj72, 0);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray73), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray73), "[]");
        org.junit.Assert.assertNotNull(iterator74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertEquals("'" + obj77 + "' != '" + 'a' + "'", obj77, 'a');
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test149");
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
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver17.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver17.addFirst((java.lang.Object) 'a');
        java.lang.Object obj23 = linkedListTestDriver17.getLast();
        linkedListTestDriver17.clear();
        boolean boolean26 = linkedListTestDriver17.contains((java.lang.Object) 10.0d);
        boolean boolean27 = linkedListTestDriver8.equals_CUT((java.lang.Object) boolean26);
        linkedListTestDriver8.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = linkedListTestDriver8.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1.0f + "'", obj14, 1.0f);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0 + "'", obj15, 0);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 0 + "'", obj23, 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test150");
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
        linkedListTestDriver0.addLast((java.lang.Object) (-1));
        boolean boolean28 = linkedListTestDriver0.isEmpty();
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0 + "'", obj13, 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test151");
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
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver29.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean34 = linkedListTestDriver29.add((java.lang.Object) 1.0f);
        java.lang.Object obj35 = linkedListTestDriver29.removeLast();
        boolean boolean36 = linkedListTestDriver29.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray38 = linkedListTestDriver37.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver39 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver39.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver39.addFirst((java.lang.Object) 'a');
        experiment.util.Iterator iterator45 = linkedListTestDriver39.iterator();
        boolean boolean46 = linkedListTestDriver37.contains((java.lang.Object) iterator45);
        boolean boolean47 = linkedListTestDriver29.contains((java.lang.Object) linkedListTestDriver37);
        experiment.util.LinkedListTestDriver linkedListTestDriver48 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver48.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean53 = linkedListTestDriver48.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj54 = linkedListTestDriver48.removeFirst();
        linkedListTestDriver48.clear();
        boolean boolean56 = linkedListTestDriver29.remove((java.lang.Object) linkedListTestDriver48);
        linkedListTestDriver16.add(0, (java.lang.Object) linkedListTestDriver29);
        java.lang.Object[] objArray58 = linkedListTestDriver16.toArray();
        java.lang.Object obj59 = linkedListTestDriver16.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj60 = linkedListTestDriver16.removeLast();
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 1.0f + "'", obj35, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertNotNull(iterator45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + 0 + "'", obj54, 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNotNull(obj59);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test152");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj6 = linkedListTestDriver0.removeFirst();
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = linkedListTestDriver0.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0 + "'", obj6, 0);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test153");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = linkedListTestDriver16.get((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
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
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test154");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver0.addFirst((java.lang.Object) 'a');
        java.lang.Object obj6 = linkedListTestDriver0.getFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = linkedListTestDriver0.remove((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 'a' + "'", obj6, 'a');
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test155");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = linkedListTestDriver16.removeLast();
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
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test156");
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
            java.lang.Object obj52 = linkedListTestDriver43.getLast();
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
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test157");
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
            java.lang.Object obj17 = linkedListTestDriver7.getLast();
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
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test158");
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
            experiment.util.ListIterator listIterator20 = linkedListTestDriver8.listIterator((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 100; size: 0");
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
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test159");
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
        java.lang.Object obj16 = linkedListTestDriver0.getLast();
        experiment.util.ListIterator listIterator18 = linkedListTestDriver0.listIterator((int) (short) 0);
        java.lang.Object obj19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = linkedListTestDriver0.remove(obj19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertNotNull(listIterator18);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test160");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        experiment.util.ListIterator listIterator8 = linkedListTestDriver0.listIterator(1);
        java.lang.Object obj9 = linkedListTestDriver0.removeLast();
        int int10 = linkedListTestDriver0.size();
        int int11 = linkedListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator13 = linkedListTestDriver0.listIterator((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertNotNull(listIterator8);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test161");
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
        boolean boolean17 = linkedListTestDriver8.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1.0f + "'", obj14, 1.0f);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0 + "'", obj15, 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test162");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver0.addFirst((java.lang.Object) 'a');
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        java.lang.Object[] objArray7 = linkedListTestDriver0.toArray();
        java.lang.Object obj8 = linkedListTestDriver0.removeLast();
        experiment.util.Iterator iterator9 = linkedListTestDriver0.iterator();
        java.lang.Object obj10 = linkedListTestDriver0.removeFirst();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0 + "'", obj6, 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[a, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[a, 0]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 'a' + "'", obj10, 'a');
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test163");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj6 = linkedListTestDriver0.removeFirst();
        java.lang.Object[] objArray7 = linkedListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0 + "'", obj6, 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test164");
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
        linkedListTestDriver0.addLast((java.lang.Object) (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = linkedListTestDriver0.get(10);
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
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test165");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = linkedListTestDriver0.get(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test166");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver0.addFirst((java.lang.Object) 'a');
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        linkedListTestDriver0.addLast((java.lang.Object) (short) -1);
        boolean boolean9 = linkedListTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0 + "'", obj6, 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test167");
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
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        boolean boolean18 = linkedListTestDriver16.remove((java.lang.Object) (short) 0);
        boolean boolean20 = linkedListTestDriver16.contains((java.lang.Object) 0.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray22 = linkedListTestDriver21.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver23.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean28 = linkedListTestDriver23.add((java.lang.Object) 1.0f);
        java.lang.Object obj29 = linkedListTestDriver23.removeLast();
        boolean boolean30 = linkedListTestDriver21.add((java.lang.Object) linkedListTestDriver23);
        java.lang.Object obj31 = linkedListTestDriver21.getFirst();
        boolean boolean32 = linkedListTestDriver16.equals_CUT((java.lang.Object) linkedListTestDriver21);
        boolean boolean33 = linkedListTestDriver0.equals_CUT((java.lang.Object) boolean32);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 0 + "'", obj10, 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 1.0f + "'", obj29, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test168");
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
        linkedListTestDriver0.addLast((java.lang.Object) (-1));
        java.lang.Object obj28 = linkedListTestDriver0.removeLast();
        java.lang.Object obj29 = linkedListTestDriver0.getFirst();
        java.lang.Object obj30 = linkedListTestDriver0.removeFirst();
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0 + "'", obj13, 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (-1) + "'", obj28, (-1));
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(obj30);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test169");
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
        linkedListTestDriver71.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean76 = linkedListTestDriver71.add((java.lang.Object) 1.0f);
        java.lang.Object obj77 = linkedListTestDriver71.removeLast();
        experiment.util.ListIterator listIterator79 = linkedListTestDriver71.listIterator(1);
        java.lang.Object obj80 = linkedListTestDriver71.removeLast();
        experiment.util.Iterator iterator81 = linkedListTestDriver71.iterator();
        linkedListTestDriver14.addFirst((java.lang.Object) iterator81);
        java.lang.Class<?> wildcardClass83 = iterator81.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertEquals("'" + obj77 + "' != '" + 1.0f + "'", obj77, 1.0f);
        org.junit.Assert.assertNotNull(listIterator79);
        org.junit.Assert.assertEquals("'" + obj80 + "' != '" + 0 + "'", obj80, 0);
        org.junit.Assert.assertNotNull(iterator81);
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test170");
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
        java.lang.Object obj21 = linkedListTestDriver0.get((int) (short) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray23 = linkedListTestDriver22.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver24.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean29 = linkedListTestDriver24.add((java.lang.Object) 1.0f);
        java.lang.Object obj30 = linkedListTestDriver24.removeLast();
        boolean boolean31 = linkedListTestDriver22.add((java.lang.Object) linkedListTestDriver24);
        java.lang.Object obj32 = linkedListTestDriver22.getLast();
        experiment.util.Iterator iterator33 = linkedListTestDriver22.iterator();
        boolean boolean34 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver22);
        java.lang.Class<?> wildcardClass35 = linkedListTestDriver22.getClass();
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
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0 + "'", obj21, 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 1.0f + "'", obj30, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test171");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = linkedListTestDriver0.remove((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test172");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj4 = linkedListTestDriver0.removeFirst();
        boolean boolean6 = linkedListTestDriver0.add((java.lang.Object) 100L);
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver7.addFirst((java.lang.Object) 'a');
        java.lang.Object obj13 = linkedListTestDriver7.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver14.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj18 = linkedListTestDriver14.removeFirst();
        boolean boolean20 = linkedListTestDriver14.add((java.lang.Object) 100L);
        java.lang.Object obj22 = linkedListTestDriver14.remove((int) (short) 0);
        linkedListTestDriver14.clear();
        int int24 = linkedListTestDriver14.size();
        linkedListTestDriver7.addLast((java.lang.Object) int24);
        java.lang.Object obj26 = linkedListTestDriver7.getFirst();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver7);
        linkedListTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0 + "'", obj4, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 'a' + "'", obj13, 'a');
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 0 + "'", obj18, 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 100L + "'", obj22, 100L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 'a' + "'", obj26, 'a');
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test173");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver0.addFirst((java.lang.Object) 'a');
        int int6 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray9 = linkedListTestDriver8.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean15 = linkedListTestDriver10.add((java.lang.Object) 1.0f);
        java.lang.Object obj16 = linkedListTestDriver10.removeLast();
        boolean boolean17 = linkedListTestDriver8.add((java.lang.Object) linkedListTestDriver10);
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver18.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj22 = linkedListTestDriver18.removeFirst();
        linkedListTestDriver18.clear();
        boolean boolean24 = linkedListTestDriver18.isEmpty();
        boolean boolean26 = linkedListTestDriver18.equals_CUT((java.lang.Object) 10L);
        experiment.util.Iterator iterator27 = linkedListTestDriver18.iterator();
        linkedListTestDriver8.addFirst((java.lang.Object) iterator27);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = linkedListTestDriver0.set((int) '4', (java.lang.Object) linkedListTestDriver8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 1.0f + "'", obj16, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 0 + "'", obj22, 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(iterator27);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test174");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        experiment.util.ListIterator listIterator8 = linkedListTestDriver0.listIterator(1);
        java.lang.Object obj9 = linkedListTestDriver0.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver10.addFirst((java.lang.Object) 'a');
        java.lang.Object obj17 = linkedListTestDriver10.get(0);
        boolean boolean18 = linkedListTestDriver0.equals_CUT((java.lang.Object) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = linkedListTestDriver0.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertNotNull(listIterator8);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 'a' + "'", obj17, 'a');
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test175");
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
        int int52 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver53 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray54 = linkedListTestDriver53.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver55 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver55.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean60 = linkedListTestDriver55.add((java.lang.Object) 1.0f);
        java.lang.Object obj61 = linkedListTestDriver55.removeLast();
        boolean boolean62 = linkedListTestDriver53.add((java.lang.Object) linkedListTestDriver55);
        linkedListTestDriver0.addFirst((java.lang.Object) boolean62);
        experiment.util.Iterator iterator64 = linkedListTestDriver0.iterator();
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
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 3 + "'", int52 == 3);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + 1.0f + "'", obj61, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(iterator64);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test176");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver2.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean7 = linkedListTestDriver2.add((java.lang.Object) 1.0f);
        java.lang.Object obj8 = linkedListTestDriver2.removeLast();
        boolean boolean9 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver2);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj15 = linkedListTestDriver10.get(0);
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
        experiment.util.LinkedListTestDriver linkedListTestDriver33 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver33.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver33.addFirst((java.lang.Object) 'a');
        java.lang.Object obj39 = linkedListTestDriver33.getLast();
        linkedListTestDriver33.clear();
        boolean boolean42 = linkedListTestDriver33.contains((java.lang.Object) 10.0d);
        boolean boolean43 = linkedListTestDriver24.equals_CUT((java.lang.Object) boolean42);
        linkedListTestDriver10.addLast((java.lang.Object) linkedListTestDriver24);
        boolean boolean45 = linkedListTestDriver2.add((java.lang.Object) linkedListTestDriver24);
        experiment.util.LinkedListTestDriver linkedListTestDriver46 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver46.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver46.addFirst((java.lang.Object) 'a');
        java.lang.Object obj52 = linkedListTestDriver46.getLast();
        boolean boolean53 = linkedListTestDriver2.remove((java.lang.Object) linkedListTestDriver46);
        experiment.util.LinkedListTestDriver linkedListTestDriver54 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver54.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean59 = linkedListTestDriver54.equals_CUT((java.lang.Object) 10);
        boolean boolean60 = linkedListTestDriver54.isEmpty();
        linkedListTestDriver46.addFirst((java.lang.Object) boolean60);
        java.lang.Object obj62 = linkedListTestDriver46.removeFirst();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1.0f + "'", obj8, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0 + "'", obj15, 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 1.0f + "'", obj22, 1.0f);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 0 + "'", obj23, 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 1.0f + "'", obj30, 1.0f);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 0 + "'", obj31, 0);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 0 + "'", obj39, 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 0 + "'", obj52, 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + false + "'", obj62, false);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test177");
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
        int int18 = linkedListTestDriver10.size();
        linkedListTestDriver0.addLast((java.lang.Object) int18);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertNotNull(listIterator8);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test178");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver2.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean7 = linkedListTestDriver2.add((java.lang.Object) 1.0f);
        java.lang.Object obj8 = linkedListTestDriver2.removeLast();
        boolean boolean9 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver2);
        java.lang.Object obj10 = linkedListTestDriver0.getFirst();
        java.lang.Object obj11 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray14 = linkedListTestDriver13.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver15.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean20 = linkedListTestDriver15.add((java.lang.Object) 1.0f);
        java.lang.Object obj21 = linkedListTestDriver15.removeLast();
        boolean boolean22 = linkedListTestDriver13.add((java.lang.Object) linkedListTestDriver15);
        java.lang.Object obj23 = linkedListTestDriver13.getFirst();
        java.lang.Object obj24 = linkedListTestDriver13.getFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = linkedListTestDriver0.set(100, obj24);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
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
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 1.0f + "'", obj21, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test179");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver2.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean7 = linkedListTestDriver2.add((java.lang.Object) 1.0f);
        java.lang.Object obj8 = linkedListTestDriver2.removeLast();
        boolean boolean9 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver2);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj15 = linkedListTestDriver10.get(0);
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
        experiment.util.LinkedListTestDriver linkedListTestDriver33 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver33.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver33.addFirst((java.lang.Object) 'a');
        java.lang.Object obj39 = linkedListTestDriver33.getLast();
        linkedListTestDriver33.clear();
        boolean boolean42 = linkedListTestDriver33.contains((java.lang.Object) 10.0d);
        boolean boolean43 = linkedListTestDriver24.equals_CUT((java.lang.Object) boolean42);
        linkedListTestDriver10.addLast((java.lang.Object) linkedListTestDriver24);
        boolean boolean45 = linkedListTestDriver2.add((java.lang.Object) linkedListTestDriver24);
        experiment.util.LinkedListTestDriver linkedListTestDriver46 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver46.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver46.addFirst((java.lang.Object) 'a');
        java.lang.Object obj52 = linkedListTestDriver46.getLast();
        boolean boolean53 = linkedListTestDriver2.remove((java.lang.Object) linkedListTestDriver46);
        java.lang.Class<?> wildcardClass54 = linkedListTestDriver46.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1.0f + "'", obj8, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0 + "'", obj15, 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 1.0f + "'", obj22, 1.0f);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 0 + "'", obj23, 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 1.0f + "'", obj30, 1.0f);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 0 + "'", obj31, 0);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 0 + "'", obj39, 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 0 + "'", obj52, 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test180");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver0.addFirst((java.lang.Object) 'a');
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        java.lang.Object obj7 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray10 = linkedListTestDriver9.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean16 = linkedListTestDriver11.add((java.lang.Object) 1.0f);
        java.lang.Object obj17 = linkedListTestDriver11.removeLast();
        boolean boolean18 = linkedListTestDriver9.add((java.lang.Object) linkedListTestDriver11);
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver19.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj24 = linkedListTestDriver19.get(0);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver25.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean30 = linkedListTestDriver25.add((java.lang.Object) 1.0f);
        java.lang.Object obj31 = linkedListTestDriver25.removeLast();
        java.lang.Object obj32 = linkedListTestDriver25.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver33 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver33.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean38 = linkedListTestDriver33.add((java.lang.Object) 1.0f);
        java.lang.Object obj39 = linkedListTestDriver33.removeLast();
        java.lang.Object obj40 = linkedListTestDriver33.getFirst();
        linkedListTestDriver25.addFirst((java.lang.Object) linkedListTestDriver33);
        experiment.util.LinkedListTestDriver linkedListTestDriver42 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver42.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver42.addFirst((java.lang.Object) 'a');
        java.lang.Object obj48 = linkedListTestDriver42.getLast();
        linkedListTestDriver42.clear();
        boolean boolean51 = linkedListTestDriver42.contains((java.lang.Object) 10.0d);
        boolean boolean52 = linkedListTestDriver33.equals_CUT((java.lang.Object) boolean51);
        linkedListTestDriver19.addLast((java.lang.Object) linkedListTestDriver33);
        boolean boolean54 = linkedListTestDriver11.add((java.lang.Object) linkedListTestDriver33);
        experiment.util.LinkedListTestDriver linkedListTestDriver55 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver55.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver55.addFirst((java.lang.Object) 'a');
        java.lang.Object obj61 = linkedListTestDriver55.getLast();
        boolean boolean62 = linkedListTestDriver11.remove((java.lang.Object) linkedListTestDriver55);
        experiment.util.LinkedListTestDriver linkedListTestDriver63 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver63.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver63.addFirst((java.lang.Object) 'a');
        experiment.util.Iterator iterator69 = linkedListTestDriver63.iterator();
        experiment.util.Iterator iterator70 = linkedListTestDriver63.iterator();
        boolean boolean71 = linkedListTestDriver55.equals_CUT((java.lang.Object) linkedListTestDriver63);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj72 = linkedListTestDriver0.set((int) (byte) 100, (java.lang.Object) linkedListTestDriver55);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0 + "'", obj6, 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 'a' + "'", obj7, 'a');
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 1.0f + "'", obj17, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0 + "'", obj24, 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 1.0f + "'", obj31, 1.0f);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 0 + "'", obj32, 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 1.0f + "'", obj39, 1.0f);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 0 + "'", obj40, 0);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 0 + "'", obj48, 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + 0 + "'", obj61, 0);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(iterator69);
        org.junit.Assert.assertNotNull(iterator70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test181");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver2.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean7 = linkedListTestDriver2.equals_CUT((java.lang.Object) 10);
        experiment.util.Iterator iterator8 = linkedListTestDriver2.iterator();
        java.lang.Object[] objArray9 = linkedListTestDriver2.toArray();
        boolean boolean10 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver2);
        java.lang.Class<?> wildcardClass11 = linkedListTestDriver2.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test182");
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
        java.lang.Object obj21 = linkedListTestDriver0.get(0);
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
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test183");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj6 = linkedListTestDriver0.removeFirst();
        java.lang.Object[] objArray7 = linkedListTestDriver0.toArray();
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) 100.0d);
        boolean boolean11 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj16 = linkedListTestDriver12.removeFirst();
        boolean boolean18 = linkedListTestDriver12.add((java.lang.Object) 100L);
        java.lang.Object obj20 = linkedListTestDriver12.remove((int) (short) 0);
        boolean boolean21 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = linkedListTestDriver0.remove((int) (short) 10);
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
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100L + "'", obj20, 100L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test184");
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
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray21 = linkedListTestDriver20.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver22.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean27 = linkedListTestDriver22.add((java.lang.Object) 1.0f);
        java.lang.Object obj28 = linkedListTestDriver22.removeLast();
        boolean boolean29 = linkedListTestDriver20.add((java.lang.Object) linkedListTestDriver22);
        java.lang.Object obj30 = linkedListTestDriver20.getFirst();
        java.lang.Object obj31 = linkedListTestDriver20.getFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = linkedListTestDriver8.set(0, (java.lang.Object) linkedListTestDriver20);
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
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 1.0f + "'", obj28, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(obj31);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test185");
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
        experiment.util.Iterator iterator69 = linkedListTestDriver0.iterator();
        linkedListTestDriver0.clear();
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
        org.junit.Assert.assertNotNull(iterator69);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test186");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj4 = linkedListTestDriver0.removeFirst();
        linkedListTestDriver0.clear();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        boolean boolean8 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10L);
        boolean boolean10 = linkedListTestDriver0.add((java.lang.Object) (short) -1);
        java.lang.Object obj11 = linkedListTestDriver0.removeLast();
        java.lang.Class<?> wildcardClass12 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0 + "'", obj4, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) -1 + "'", obj11, (short) -1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test187");
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
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver16.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean21 = linkedListTestDriver16.add((java.lang.Object) 1.0f);
        java.lang.Object obj22 = linkedListTestDriver16.removeLast();
        boolean boolean23 = linkedListTestDriver16.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray25 = linkedListTestDriver24.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver26.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver26.addFirst((java.lang.Object) 'a');
        experiment.util.Iterator iterator32 = linkedListTestDriver26.iterator();
        boolean boolean33 = linkedListTestDriver24.contains((java.lang.Object) iterator32);
        boolean boolean34 = linkedListTestDriver16.contains((java.lang.Object) linkedListTestDriver24);
        experiment.util.LinkedListTestDriver linkedListTestDriver35 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver35.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean40 = linkedListTestDriver35.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj41 = linkedListTestDriver35.removeFirst();
        linkedListTestDriver35.clear();
        boolean boolean43 = linkedListTestDriver16.remove((java.lang.Object) linkedListTestDriver35);
        linkedListTestDriver6.addLast((java.lang.Object) boolean43);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj46 = linkedListTestDriver6.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 0 + "'", obj10, 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 1.0f + "'", obj22, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 0 + "'", obj41, 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test188");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver0.addFirst((java.lang.Object) 'a');
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        int int7 = linkedListTestDriver0.size();
        java.lang.Object obj8 = linkedListTestDriver0.removeLast();
        linkedListTestDriver0.clear();
        experiment.util.Iterator iterator10 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver11.remove((java.lang.Object) (short) 0);
        boolean boolean15 = linkedListTestDriver11.contains((java.lang.Object) 0.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray17 = linkedListTestDriver16.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver18.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean23 = linkedListTestDriver18.add((java.lang.Object) 1.0f);
        java.lang.Object obj24 = linkedListTestDriver18.removeLast();
        boolean boolean25 = linkedListTestDriver16.add((java.lang.Object) linkedListTestDriver18);
        java.lang.Object obj26 = linkedListTestDriver16.getFirst();
        boolean boolean27 = linkedListTestDriver11.equals_CUT((java.lang.Object) linkedListTestDriver16);
        boolean boolean28 = linkedListTestDriver0.contains((java.lang.Object) boolean27);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator30 = linkedListTestDriver0.listIterator((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 35; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0 + "'", obj6, 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 1.0f + "'", obj24, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test189");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver2.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean7 = linkedListTestDriver2.add((java.lang.Object) 1.0f);
        java.lang.Object obj8 = linkedListTestDriver2.removeLast();
        boolean boolean9 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver2);
        java.lang.Object obj10 = linkedListTestDriver0.getFirst();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj17 = linkedListTestDriver12.get(0);
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver18.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean23 = linkedListTestDriver18.add((java.lang.Object) 1.0f);
        java.lang.Object obj24 = linkedListTestDriver18.removeLast();
        experiment.util.ListIterator listIterator26 = linkedListTestDriver18.listIterator(1);
        java.lang.Object obj27 = linkedListTestDriver18.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver28.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean33 = linkedListTestDriver28.equals_CUT((java.lang.Object) 10);
        experiment.util.Iterator iterator34 = linkedListTestDriver28.iterator();
        java.lang.Object[] objArray35 = linkedListTestDriver28.toArray();
        linkedListTestDriver18.addFirst((java.lang.Object) objArray35);
        experiment.util.Iterator iterator37 = linkedListTestDriver18.iterator();
        linkedListTestDriver12.addLast((java.lang.Object) iterator37);
        boolean boolean39 = linkedListTestDriver0.equals_CUT((java.lang.Object) iterator37);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj41 = linkedListTestDriver0.get(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
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
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0 + "'", obj17, 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 1.0f + "'", obj24, 1.0f);
        org.junit.Assert.assertNotNull(listIterator26);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0 + "'", obj27, 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[0]");
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test190");
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
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver25.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean30 = linkedListTestDriver25.equals_CUT((java.lang.Object) 10);
        boolean boolean32 = linkedListTestDriver25.add((java.lang.Object) (short) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver33 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver33.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean38 = linkedListTestDriver33.equals_CUT((java.lang.Object) 10);
        boolean boolean40 = linkedListTestDriver33.add((java.lang.Object) (short) 1);
        linkedListTestDriver33.clear();
        boolean boolean42 = linkedListTestDriver25.add((java.lang.Object) linkedListTestDriver33);
        boolean boolean43 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj45 = linkedListTestDriver0.get(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test191");
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
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver29.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean34 = linkedListTestDriver29.add((java.lang.Object) 1.0f);
        java.lang.Object obj35 = linkedListTestDriver29.removeLast();
        boolean boolean36 = linkedListTestDriver29.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray38 = linkedListTestDriver37.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver39 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver39.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver39.addFirst((java.lang.Object) 'a');
        experiment.util.Iterator iterator45 = linkedListTestDriver39.iterator();
        boolean boolean46 = linkedListTestDriver37.contains((java.lang.Object) iterator45);
        boolean boolean47 = linkedListTestDriver29.contains((java.lang.Object) linkedListTestDriver37);
        experiment.util.LinkedListTestDriver linkedListTestDriver48 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver48.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean53 = linkedListTestDriver48.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj54 = linkedListTestDriver48.removeFirst();
        linkedListTestDriver48.clear();
        boolean boolean56 = linkedListTestDriver29.remove((java.lang.Object) linkedListTestDriver48);
        linkedListTestDriver16.add(0, (java.lang.Object) linkedListTestDriver29);
        int int58 = linkedListTestDriver29.size();
        java.lang.Object obj59 = linkedListTestDriver29.removeLast();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 'a' + "'", obj6, 'a');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1.0f + "'", obj14, 1.0f);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0 + "'", obj15, 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 1.0f + "'", obj22, 1.0f);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 0 + "'", obj23, 0);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 1.0f + "'", obj35, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertNotNull(iterator45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + 0 + "'", obj54, 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + 0 + "'", obj59, 0);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test192");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10);
        int int6 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean12 = linkedListTestDriver7.equals_CUT((java.lang.Object) 10);
        boolean boolean14 = linkedListTestDriver7.add((java.lang.Object) (short) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver15.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean20 = linkedListTestDriver15.equals_CUT((java.lang.Object) 10);
        boolean boolean22 = linkedListTestDriver15.add((java.lang.Object) (short) 1);
        linkedListTestDriver15.clear();
        boolean boolean24 = linkedListTestDriver7.add((java.lang.Object) linkedListTestDriver15);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver25.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj29 = linkedListTestDriver25.removeFirst();
        boolean boolean31 = linkedListTestDriver25.add((java.lang.Object) 100L);
        java.lang.Object obj33 = linkedListTestDriver25.remove((int) (short) 0);
        linkedListTestDriver25.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver35 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver35.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver35.addFirst((java.lang.Object) 'a');
        java.lang.Object obj41 = linkedListTestDriver35.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver43 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver43.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean48 = linkedListTestDriver43.add((java.lang.Object) 1.0f);
        java.lang.Object obj49 = linkedListTestDriver43.removeLast();
        java.lang.Object obj50 = linkedListTestDriver43.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver51 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver51.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean56 = linkedListTestDriver51.add((java.lang.Object) 1.0f);
        java.lang.Object obj57 = linkedListTestDriver51.removeLast();
        java.lang.Object obj58 = linkedListTestDriver51.getFirst();
        linkedListTestDriver43.addFirst((java.lang.Object) linkedListTestDriver51);
        linkedListTestDriver35.add(2, (java.lang.Object) linkedListTestDriver51);
        linkedListTestDriver51.clear();
        experiment.util.Iterator iterator62 = linkedListTestDriver51.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver64 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver64.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean69 = linkedListTestDriver64.add((java.lang.Object) 1.0f);
        java.lang.Object obj70 = linkedListTestDriver64.removeLast();
        boolean boolean71 = linkedListTestDriver64.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver72 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray73 = linkedListTestDriver72.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver74 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver74.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver74.addFirst((java.lang.Object) 'a');
        experiment.util.Iterator iterator80 = linkedListTestDriver74.iterator();
        boolean boolean81 = linkedListTestDriver72.contains((java.lang.Object) iterator80);
        boolean boolean82 = linkedListTestDriver64.contains((java.lang.Object) linkedListTestDriver72);
        experiment.util.LinkedListTestDriver linkedListTestDriver83 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver83.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean88 = linkedListTestDriver83.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj89 = linkedListTestDriver83.removeFirst();
        linkedListTestDriver83.clear();
        boolean boolean91 = linkedListTestDriver64.remove((java.lang.Object) linkedListTestDriver83);
        linkedListTestDriver51.add(0, (java.lang.Object) linkedListTestDriver64);
        boolean boolean93 = linkedListTestDriver25.equals_CUT((java.lang.Object) linkedListTestDriver51);
        java.lang.Object[] objArray94 = linkedListTestDriver25.toArray();
        boolean boolean95 = linkedListTestDriver7.remove((java.lang.Object) linkedListTestDriver25);
        boolean boolean96 = linkedListTestDriver0.contains((java.lang.Object) boolean95);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0 + "'", obj29, 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 100L + "'", obj33, 100L);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 'a' + "'", obj41, 'a');
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 1.0f + "'", obj49, 1.0f);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 0 + "'", obj50, 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + 1.0f + "'", obj57, 1.0f);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + 0 + "'", obj58, 0);
        org.junit.Assert.assertNotNull(iterator62);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertEquals("'" + obj70 + "' != '" + 1.0f + "'", obj70, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray73), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray73), "[]");
        org.junit.Assert.assertNotNull(iterator80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertEquals("'" + obj89 + "' != '" + 0 + "'", obj89, 0);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(objArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray94), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray94), "[]");
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test193");
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
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver16.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean21 = linkedListTestDriver16.add((java.lang.Object) 1.0f);
        java.lang.Object obj22 = linkedListTestDriver16.removeLast();
        boolean boolean23 = linkedListTestDriver16.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray25 = linkedListTestDriver24.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver26.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver26.addFirst((java.lang.Object) 'a');
        experiment.util.Iterator iterator32 = linkedListTestDriver26.iterator();
        boolean boolean33 = linkedListTestDriver24.contains((java.lang.Object) iterator32);
        boolean boolean34 = linkedListTestDriver16.contains((java.lang.Object) linkedListTestDriver24);
        experiment.util.LinkedListTestDriver linkedListTestDriver35 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver35.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean40 = linkedListTestDriver35.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj41 = linkedListTestDriver35.removeFirst();
        linkedListTestDriver35.clear();
        boolean boolean43 = linkedListTestDriver16.remove((java.lang.Object) linkedListTestDriver35);
        linkedListTestDriver6.addLast((java.lang.Object) boolean43);
        experiment.util.LinkedListTestDriver linkedListTestDriver46 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver46.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean51 = linkedListTestDriver46.add((java.lang.Object) 1.0f);
        boolean boolean53 = linkedListTestDriver46.equals_CUT((java.lang.Object) 10.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver54 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver54.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean59 = linkedListTestDriver54.equals_CUT((java.lang.Object) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver60 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver60.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj64 = linkedListTestDriver60.removeFirst();
        linkedListTestDriver60.clear();
        boolean boolean66 = linkedListTestDriver60.isEmpty();
        boolean boolean68 = linkedListTestDriver60.equals_CUT((java.lang.Object) 10L);
        linkedListTestDriver54.addFirst((java.lang.Object) linkedListTestDriver60);
        linkedListTestDriver46.addFirst((java.lang.Object) linkedListTestDriver54);
        java.lang.Object obj71 = linkedListTestDriver46.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver6.add((int) (byte) 10, (java.lang.Object) linkedListTestDriver46);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 0 + "'", obj10, 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 1.0f + "'", obj22, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 0 + "'", obj41, 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + 0 + "'", obj64, 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(obj71);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test194");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean12 = linkedListTestDriver7.add((java.lang.Object) 1.0f);
        java.lang.Object obj13 = linkedListTestDriver7.removeLast();
        experiment.util.ListIterator listIterator15 = linkedListTestDriver7.listIterator(1);
        java.lang.Object obj16 = linkedListTestDriver7.removeLast();
        boolean boolean17 = linkedListTestDriver7.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) (short) 10, (java.lang.Object) boolean17);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 1.0f + "'", obj13, 1.0f);
        org.junit.Assert.assertNotNull(listIterator15);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test195");
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
        java.lang.Object[] objArray69 = linkedListTestDriver0.toArray();
        experiment.util.Iterator iterator70 = linkedListTestDriver0.iterator();
        java.lang.Class<?> wildcardClass71 = linkedListTestDriver0.getClass();
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
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray69), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray69), "[]");
        org.junit.Assert.assertNotNull(iterator70);
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test196");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver0.addFirst((java.lang.Object) 'a');
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        int int7 = linkedListTestDriver0.size();
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver9.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj13 = linkedListTestDriver9.removeFirst();
        boolean boolean15 = linkedListTestDriver9.add((java.lang.Object) 100L);
        java.lang.Object obj17 = linkedListTestDriver9.remove((int) (short) 0);
        linkedListTestDriver9.clear();
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
        experiment.util.Iterator iterator46 = linkedListTestDriver35.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver48 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver48.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean53 = linkedListTestDriver48.add((java.lang.Object) 1.0f);
        java.lang.Object obj54 = linkedListTestDriver48.removeLast();
        boolean boolean55 = linkedListTestDriver48.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver56 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray57 = linkedListTestDriver56.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver58 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver58.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver58.addFirst((java.lang.Object) 'a');
        experiment.util.Iterator iterator64 = linkedListTestDriver58.iterator();
        boolean boolean65 = linkedListTestDriver56.contains((java.lang.Object) iterator64);
        boolean boolean66 = linkedListTestDriver48.contains((java.lang.Object) linkedListTestDriver56);
        experiment.util.LinkedListTestDriver linkedListTestDriver67 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver67.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean72 = linkedListTestDriver67.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj73 = linkedListTestDriver67.removeFirst();
        linkedListTestDriver67.clear();
        boolean boolean75 = linkedListTestDriver48.remove((java.lang.Object) linkedListTestDriver67);
        linkedListTestDriver35.add(0, (java.lang.Object) linkedListTestDriver48);
        boolean boolean77 = linkedListTestDriver9.equals_CUT((java.lang.Object) linkedListTestDriver35);
        java.lang.Object[] objArray78 = linkedListTestDriver9.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver79 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver79.add((int) (short) 0, (java.lang.Object) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver83 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver83.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean88 = linkedListTestDriver83.add((java.lang.Object) 1.0f);
        java.lang.Object obj89 = linkedListTestDriver83.removeLast();
        java.lang.Object obj90 = linkedListTestDriver83.getFirst();
        experiment.util.Iterator iterator91 = linkedListTestDriver83.iterator();
        boolean boolean92 = linkedListTestDriver79.add((java.lang.Object) iterator91);
        linkedListTestDriver9.addFirst((java.lang.Object) iterator91);
        boolean boolean94 = linkedListTestDriver9.isEmpty();
        boolean boolean95 = linkedListTestDriver0.equals_CUT((java.lang.Object) boolean94);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0 + "'", obj6, 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0 + "'", obj13, 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 100L + "'", obj17, 100L);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 'a' + "'", obj25, 'a');
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 1.0f + "'", obj33, 1.0f);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 0 + "'", obj34, 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 1.0f + "'", obj41, 1.0f);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 0 + "'", obj42, 0);
        org.junit.Assert.assertNotNull(iterator46);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + 1.0f + "'", obj54, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[]");
        org.junit.Assert.assertNotNull(iterator64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + obj73 + "' != '" + 0 + "'", obj73, 0);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray78), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray78), "[]");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertEquals("'" + obj89 + "' != '" + 1.0f + "'", obj89, 1.0f);
        org.junit.Assert.assertEquals("'" + obj90 + "' != '" + 0 + "'", obj90, 0);
        org.junit.Assert.assertNotNull(iterator91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test197");
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
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver19.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver19.addFirst((java.lang.Object) 'a');
        experiment.util.Iterator iterator25 = linkedListTestDriver19.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver26.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean31 = linkedListTestDriver26.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj32 = linkedListTestDriver26.removeFirst();
        boolean boolean33 = linkedListTestDriver26.isEmpty();
        boolean boolean34 = linkedListTestDriver26.isEmpty();
        boolean boolean35 = linkedListTestDriver19.contains((java.lang.Object) linkedListTestDriver26);
        experiment.util.LinkedListTestDriver linkedListTestDriver36 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver36.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean41 = linkedListTestDriver36.add((java.lang.Object) 1.0f);
        java.lang.Object obj42 = linkedListTestDriver36.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver43 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver43.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver43.addFirst((java.lang.Object) 'a');
        experiment.util.Iterator iterator49 = linkedListTestDriver43.iterator();
        linkedListTestDriver36.addFirst((java.lang.Object) iterator49);
        experiment.util.Iterator iterator51 = linkedListTestDriver36.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver52 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver52.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean57 = linkedListTestDriver52.equals_CUT((java.lang.Object) 10);
        experiment.util.Iterator iterator58 = linkedListTestDriver52.iterator();
        java.lang.Object[] objArray59 = linkedListTestDriver52.toArray();
        linkedListTestDriver36.addFirst((java.lang.Object) objArray59);
        boolean boolean61 = linkedListTestDriver19.remove((java.lang.Object) linkedListTestDriver36);
        experiment.util.Iterator iterator62 = linkedListTestDriver36.iterator();
        boolean boolean63 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver36);
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
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 0 + "'", obj32, 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 1.0f + "'", obj42, 1.0f);
        org.junit.Assert.assertNotNull(iterator49);
        org.junit.Assert.assertNotNull(iterator51);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(iterator58);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[0]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(iterator62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test198");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        java.lang.Object obj7 = linkedListTestDriver0.getFirst();
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver9.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver9.addFirst((java.lang.Object) 'a');
        experiment.util.Iterator iterator15 = linkedListTestDriver9.iterator();
        java.lang.Object[] objArray16 = linkedListTestDriver9.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver17.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj21 = linkedListTestDriver17.removeFirst();
        linkedListTestDriver17.clear();
        boolean boolean24 = linkedListTestDriver17.remove((java.lang.Object) (byte) -1);
        linkedListTestDriver17.clear();
        boolean boolean26 = linkedListTestDriver9.remove((java.lang.Object) linkedListTestDriver17);
        boolean boolean27 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver17);
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver28.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean33 = linkedListTestDriver28.equals_CUT((java.lang.Object) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver34.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj38 = linkedListTestDriver34.removeFirst();
        linkedListTestDriver34.clear();
        boolean boolean40 = linkedListTestDriver34.isEmpty();
        boolean boolean42 = linkedListTestDriver34.equals_CUT((java.lang.Object) 10L);
        linkedListTestDriver28.addFirst((java.lang.Object) linkedListTestDriver34);
        boolean boolean44 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver28);
        experiment.util.LinkedListTestDriver linkedListTestDriver45 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver45.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver45.addFirst((java.lang.Object) 'a');
        experiment.util.Iterator iterator51 = linkedListTestDriver45.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver52 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver52.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean57 = linkedListTestDriver52.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj58 = linkedListTestDriver52.removeFirst();
        boolean boolean59 = linkedListTestDriver52.isEmpty();
        boolean boolean60 = linkedListTestDriver52.isEmpty();
        boolean boolean61 = linkedListTestDriver45.contains((java.lang.Object) linkedListTestDriver52);
        experiment.util.LinkedListTestDriver linkedListTestDriver62 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray63 = linkedListTestDriver62.toArray();
        boolean boolean64 = linkedListTestDriver45.add((java.lang.Object) linkedListTestDriver62);
        java.lang.Object[] objArray65 = linkedListTestDriver62.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) objArray65);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[a, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[a, 0]");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0 + "'", obj21, 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 0 + "'", obj38, 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(iterator51);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + 0 + "'", obj58, 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray65), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray65), "[]");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test199");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10);
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray7 = linkedListTestDriver0.toArray();
        int int8 = linkedListTestDriver0.size();
        boolean boolean9 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        boolean boolean12 = linkedListTestDriver10.remove((java.lang.Object) (short) 0);
        boolean boolean14 = linkedListTestDriver10.contains((java.lang.Object) 0.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray16 = linkedListTestDriver15.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver17.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean22 = linkedListTestDriver17.add((java.lang.Object) 1.0f);
        java.lang.Object obj23 = linkedListTestDriver17.removeLast();
        boolean boolean24 = linkedListTestDriver15.add((java.lang.Object) linkedListTestDriver17);
        java.lang.Object obj25 = linkedListTestDriver15.getFirst();
        boolean boolean26 = linkedListTestDriver10.equals_CUT((java.lang.Object) linkedListTestDriver15);
        boolean boolean27 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 1.0f + "'", obj23, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test200");
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
        linkedListTestDriver71.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean76 = linkedListTestDriver71.add((java.lang.Object) 1.0f);
        java.lang.Object obj77 = linkedListTestDriver71.removeLast();
        experiment.util.ListIterator listIterator79 = linkedListTestDriver71.listIterator(1);
        java.lang.Object obj80 = linkedListTestDriver71.removeLast();
        experiment.util.Iterator iterator81 = linkedListTestDriver71.iterator();
        linkedListTestDriver14.addFirst((java.lang.Object) iterator81);
        java.lang.Object[] objArray83 = linkedListTestDriver14.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj85 = linkedListTestDriver14.remove((int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertEquals("'" + obj77 + "' != '" + 1.0f + "'", obj77, 1.0f);
        org.junit.Assert.assertNotNull(listIterator79);
        org.junit.Assert.assertEquals("'" + obj80 + "' != '" + 0 + "'", obj80, 0);
        org.junit.Assert.assertNotNull(iterator81);
        org.junit.Assert.assertNotNull(objArray83);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test201");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj4 = linkedListTestDriver0.removeFirst();
        linkedListTestDriver0.clear();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        boolean boolean8 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10L);
        boolean boolean10 = linkedListTestDriver0.add((java.lang.Object) (short) -1);
        java.lang.Object[] objArray11 = linkedListTestDriver0.toArray();
        boolean boolean12 = linkedListTestDriver0.isEmpty();
        java.lang.Object obj13 = linkedListTestDriver0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = linkedListTestDriver0.get(0);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (short) -1 + "'", obj13, (short) -1);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test202");
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
        java.lang.Object obj26 = linkedListTestDriver0.remove(1);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator28 = linkedListTestDriver0.listIterator((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 2");
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
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 'a' + "'", obj26, 'a');
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test203");
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
        linkedListTestDriver71.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean76 = linkedListTestDriver71.add((java.lang.Object) 1.0f);
        java.lang.Object obj77 = linkedListTestDriver71.removeLast();
        experiment.util.ListIterator listIterator79 = linkedListTestDriver71.listIterator(1);
        java.lang.Object obj80 = linkedListTestDriver71.removeLast();
        experiment.util.Iterator iterator81 = linkedListTestDriver71.iterator();
        linkedListTestDriver14.addFirst((java.lang.Object) iterator81);
        java.lang.Object[] objArray83 = linkedListTestDriver14.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver84 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver84.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj88 = linkedListTestDriver84.removeFirst();
        linkedListTestDriver84.clear();
        boolean boolean90 = linkedListTestDriver84.isEmpty();
        boolean boolean92 = linkedListTestDriver84.equals_CUT((java.lang.Object) 10L);
        boolean boolean94 = linkedListTestDriver84.add((java.lang.Object) (short) -1);
        java.lang.Object obj95 = linkedListTestDriver84.removeLast();
        java.lang.Object[] objArray96 = linkedListTestDriver84.toArray();
        boolean boolean97 = linkedListTestDriver14.remove((java.lang.Object) linkedListTestDriver84);
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
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertEquals("'" + obj77 + "' != '" + 1.0f + "'", obj77, 1.0f);
        org.junit.Assert.assertNotNull(listIterator79);
        org.junit.Assert.assertEquals("'" + obj80 + "' != '" + 0 + "'", obj80, 0);
        org.junit.Assert.assertNotNull(iterator81);
        org.junit.Assert.assertNotNull(objArray83);
        org.junit.Assert.assertEquals("'" + obj88 + "' != '" + 0 + "'", obj88, 0);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertEquals("'" + obj95 + "' != '" + (short) -1 + "'", obj95, (short) -1);
        org.junit.Assert.assertNotNull(objArray96);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray96), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray96), "[]");
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test204");
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
        java.lang.Object[] objArray69 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver70 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver70.add((int) (short) 0, (java.lang.Object) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver74 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver74.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean79 = linkedListTestDriver74.add((java.lang.Object) 1.0f);
        java.lang.Object obj80 = linkedListTestDriver74.removeLast();
        java.lang.Object obj81 = linkedListTestDriver74.getFirst();
        experiment.util.Iterator iterator82 = linkedListTestDriver74.iterator();
        boolean boolean83 = linkedListTestDriver70.add((java.lang.Object) iterator82);
        linkedListTestDriver0.addFirst((java.lang.Object) iterator82);
        boolean boolean85 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver87 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray88 = linkedListTestDriver87.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver89 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver89.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver89.addFirst((java.lang.Object) 'a');
        experiment.util.Iterator iterator95 = linkedListTestDriver89.iterator();
        boolean boolean96 = linkedListTestDriver87.contains((java.lang.Object) iterator95);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj97 = linkedListTestDriver0.set((int) (short) 10, (java.lang.Object) boolean96);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray69), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray69), "[]");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertEquals("'" + obj80 + "' != '" + 1.0f + "'", obj80, 1.0f);
        org.junit.Assert.assertEquals("'" + obj81 + "' != '" + 0 + "'", obj81, 0);
        org.junit.Assert.assertNotNull(iterator82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(objArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray88), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray88), "[]");
        org.junit.Assert.assertNotNull(iterator95);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test205");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver0.addFirst((java.lang.Object) 'a');
        java.lang.Object obj6 = linkedListTestDriver0.removeFirst();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 'a' + "'", obj6, 'a');
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test206");
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
        java.lang.Object obj80 = linkedListTestDriver35.getFirst();
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
        org.junit.Assert.assertEquals("'" + obj80 + "' != '" + 0 + "'", obj80, 0);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test207");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver0.addFirst((java.lang.Object) 'a');
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        java.lang.Object[] objArray7 = linkedListTestDriver0.toArray();
        java.lang.Object obj8 = linkedListTestDriver0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator10 = linkedListTestDriver0.listIterator(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 3; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0 + "'", obj6, 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[a, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[a, 0]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test208");
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
        java.lang.Object obj20 = linkedListTestDriver0.removeFirst();
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
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 'a' + "'", obj20, 'a');
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test209");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver2.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean7 = linkedListTestDriver2.add((java.lang.Object) 1.0f);
        java.lang.Object obj8 = linkedListTestDriver2.removeLast();
        boolean boolean9 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver2);
        java.lang.Object obj10 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver11.addFirst((java.lang.Object) 'a');
        java.lang.Object obj17 = linkedListTestDriver11.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver19.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean24 = linkedListTestDriver19.add((java.lang.Object) 1.0f);
        java.lang.Object obj25 = linkedListTestDriver19.removeLast();
        java.lang.Object obj26 = linkedListTestDriver19.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver27 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver27.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean32 = linkedListTestDriver27.add((java.lang.Object) 1.0f);
        java.lang.Object obj33 = linkedListTestDriver27.removeLast();
        java.lang.Object obj34 = linkedListTestDriver27.getFirst();
        linkedListTestDriver19.addFirst((java.lang.Object) linkedListTestDriver27);
        linkedListTestDriver11.add(2, (java.lang.Object) linkedListTestDriver27);
        linkedListTestDriver27.clear();
        experiment.util.Iterator iterator38 = linkedListTestDriver27.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver40 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver40.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean45 = linkedListTestDriver40.add((java.lang.Object) 1.0f);
        java.lang.Object obj46 = linkedListTestDriver40.removeLast();
        boolean boolean47 = linkedListTestDriver40.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver48 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray49 = linkedListTestDriver48.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver50 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver50.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver50.addFirst((java.lang.Object) 'a');
        experiment.util.Iterator iterator56 = linkedListTestDriver50.iterator();
        boolean boolean57 = linkedListTestDriver48.contains((java.lang.Object) iterator56);
        boolean boolean58 = linkedListTestDriver40.contains((java.lang.Object) linkedListTestDriver48);
        experiment.util.LinkedListTestDriver linkedListTestDriver59 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver59.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean64 = linkedListTestDriver59.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj65 = linkedListTestDriver59.removeFirst();
        linkedListTestDriver59.clear();
        boolean boolean67 = linkedListTestDriver40.remove((java.lang.Object) linkedListTestDriver59);
        linkedListTestDriver27.add(0, (java.lang.Object) linkedListTestDriver40);
        java.lang.Object[] objArray69 = linkedListTestDriver27.toArray();
        java.lang.Object obj70 = linkedListTestDriver27.removeFirst();
        boolean boolean71 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver27);
        experiment.util.LinkedListTestDriver linkedListTestDriver73 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver73.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver73.addFirst((java.lang.Object) 'a');
        experiment.util.Iterator iterator79 = linkedListTestDriver73.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver80 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver80.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean85 = linkedListTestDriver80.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj86 = linkedListTestDriver80.removeFirst();
        boolean boolean87 = linkedListTestDriver80.isEmpty();
        boolean boolean88 = linkedListTestDriver80.isEmpty();
        boolean boolean89 = linkedListTestDriver73.contains((java.lang.Object) linkedListTestDriver80);
        experiment.util.LinkedListTestDriver linkedListTestDriver90 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver90.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean95 = linkedListTestDriver90.add((java.lang.Object) (short) 10);
        linkedListTestDriver90.clear();
        linkedListTestDriver73.addFirst((java.lang.Object) linkedListTestDriver90);
        experiment.util.Iterator iterator98 = linkedListTestDriver73.iterator();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver27.add(3, (java.lang.Object) linkedListTestDriver73);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 3; size: 0");
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
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 'a' + "'", obj17, 'a');
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 1.0f + "'", obj25, 1.0f);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0 + "'", obj26, 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 1.0f + "'", obj33, 1.0f);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 0 + "'", obj34, 0);
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 1.0f + "'", obj46, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[]");
        org.junit.Assert.assertNotNull(iterator56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + 0 + "'", obj65, 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertNotNull(obj70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(iterator79);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertEquals("'" + obj86 + "' != '" + 0 + "'", obj86, 0);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertNotNull(iterator98);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test210");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver2.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean7 = linkedListTestDriver2.add((java.lang.Object) 1.0f);
        java.lang.Object obj8 = linkedListTestDriver2.removeLast();
        boolean boolean9 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver2);
        int int10 = linkedListTestDriver2.size();
        java.lang.Object[] objArray11 = linkedListTestDriver2.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj17 = linkedListTestDriver12.get(0);
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
        experiment.util.LinkedListTestDriver linkedListTestDriver35 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver35.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver35.addFirst((java.lang.Object) 'a');
        java.lang.Object obj41 = linkedListTestDriver35.getLast();
        linkedListTestDriver35.clear();
        boolean boolean44 = linkedListTestDriver35.contains((java.lang.Object) 10.0d);
        boolean boolean45 = linkedListTestDriver26.equals_CUT((java.lang.Object) boolean44);
        linkedListTestDriver12.addLast((java.lang.Object) linkedListTestDriver26);
        boolean boolean47 = linkedListTestDriver2.contains((java.lang.Object) linkedListTestDriver12);
        experiment.util.LinkedListTestDriver linkedListTestDriver48 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver48.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver48.addFirst((java.lang.Object) 'a');
        experiment.util.Iterator iterator54 = linkedListTestDriver48.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver55 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver55.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean60 = linkedListTestDriver55.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj61 = linkedListTestDriver55.removeFirst();
        boolean boolean62 = linkedListTestDriver55.isEmpty();
        boolean boolean63 = linkedListTestDriver55.isEmpty();
        boolean boolean64 = linkedListTestDriver48.contains((java.lang.Object) linkedListTestDriver55);
        experiment.util.LinkedListTestDriver linkedListTestDriver65 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver65.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean70 = linkedListTestDriver65.add((java.lang.Object) (short) 10);
        linkedListTestDriver65.clear();
        linkedListTestDriver48.addFirst((java.lang.Object) linkedListTestDriver65);
        linkedListTestDriver2.addLast((java.lang.Object) linkedListTestDriver48);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1.0f + "'", obj8, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[0]");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0 + "'", obj17, 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 1.0f + "'", obj24, 1.0f);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 0 + "'", obj25, 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 1.0f + "'", obj32, 1.0f);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 0 + "'", obj33, 0);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 0 + "'", obj41, 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(iterator54);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + 0 + "'", obj61, 0);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test211");
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
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver16.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean21 = linkedListTestDriver16.add((java.lang.Object) 1.0f);
        java.lang.Object obj22 = linkedListTestDriver16.removeLast();
        boolean boolean23 = linkedListTestDriver16.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray25 = linkedListTestDriver24.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver26.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver26.addFirst((java.lang.Object) 'a');
        experiment.util.Iterator iterator32 = linkedListTestDriver26.iterator();
        boolean boolean33 = linkedListTestDriver24.contains((java.lang.Object) iterator32);
        boolean boolean34 = linkedListTestDriver16.contains((java.lang.Object) linkedListTestDriver24);
        experiment.util.LinkedListTestDriver linkedListTestDriver35 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver35.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean40 = linkedListTestDriver35.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj41 = linkedListTestDriver35.removeFirst();
        linkedListTestDriver35.clear();
        boolean boolean43 = linkedListTestDriver16.remove((java.lang.Object) linkedListTestDriver35);
        linkedListTestDriver6.addLast((java.lang.Object) boolean43);
        linkedListTestDriver6.addLast((java.lang.Object) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 0 + "'", obj10, 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 1.0f + "'", obj22, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 0 + "'", obj41, 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test212");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj4 = linkedListTestDriver0.removeFirst();
        linkedListTestDriver0.clear();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        boolean boolean8 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10L);
        experiment.util.Iterator iterator9 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj15 = linkedListTestDriver11.removeFirst();
        boolean boolean17 = linkedListTestDriver11.add((java.lang.Object) 100L);
        java.lang.Object obj19 = linkedListTestDriver11.remove((int) (short) 0);
        linkedListTestDriver11.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver21.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver21.addFirst((java.lang.Object) 'a');
        java.lang.Object obj27 = linkedListTestDriver21.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver29.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean34 = linkedListTestDriver29.add((java.lang.Object) 1.0f);
        java.lang.Object obj35 = linkedListTestDriver29.removeLast();
        java.lang.Object obj36 = linkedListTestDriver29.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver37.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean42 = linkedListTestDriver37.add((java.lang.Object) 1.0f);
        java.lang.Object obj43 = linkedListTestDriver37.removeLast();
        java.lang.Object obj44 = linkedListTestDriver37.getFirst();
        linkedListTestDriver29.addFirst((java.lang.Object) linkedListTestDriver37);
        linkedListTestDriver21.add(2, (java.lang.Object) linkedListTestDriver37);
        linkedListTestDriver37.clear();
        experiment.util.Iterator iterator48 = linkedListTestDriver37.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver50 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver50.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean55 = linkedListTestDriver50.add((java.lang.Object) 1.0f);
        java.lang.Object obj56 = linkedListTestDriver50.removeLast();
        boolean boolean57 = linkedListTestDriver50.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver58 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray59 = linkedListTestDriver58.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver60 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver60.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver60.addFirst((java.lang.Object) 'a');
        experiment.util.Iterator iterator66 = linkedListTestDriver60.iterator();
        boolean boolean67 = linkedListTestDriver58.contains((java.lang.Object) iterator66);
        boolean boolean68 = linkedListTestDriver50.contains((java.lang.Object) linkedListTestDriver58);
        experiment.util.LinkedListTestDriver linkedListTestDriver69 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver69.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean74 = linkedListTestDriver69.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj75 = linkedListTestDriver69.removeFirst();
        linkedListTestDriver69.clear();
        boolean boolean77 = linkedListTestDriver50.remove((java.lang.Object) linkedListTestDriver69);
        linkedListTestDriver37.add(0, (java.lang.Object) linkedListTestDriver50);
        boolean boolean79 = linkedListTestDriver11.equals_CUT((java.lang.Object) linkedListTestDriver37);
        experiment.util.Iterator iterator80 = linkedListTestDriver11.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj81 = linkedListTestDriver0.set((int) (byte) 100, (java.lang.Object) linkedListTestDriver11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0 + "'", obj4, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0 + "'", obj15, 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100L + "'", obj19, 100L);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 'a' + "'", obj27, 'a');
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 1.0f + "'", obj35, 1.0f);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 0 + "'", obj36, 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + 1.0f + "'", obj43, 1.0f);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 0 + "'", obj44, 0);
        org.junit.Assert.assertNotNull(iterator48);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + 1.0f + "'", obj56, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[]");
        org.junit.Assert.assertNotNull(iterator66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + obj75 + "' != '" + 0 + "'", obj75, 0);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(iterator80);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test213");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj4 = linkedListTestDriver0.removeFirst();
        linkedListTestDriver0.clear();
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0 + "'", obj4, 0);
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test214");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj6 = linkedListTestDriver0.removeFirst();
        java.lang.Object[] objArray7 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        boolean boolean10 = linkedListTestDriver8.remove((java.lang.Object) (short) 0);
        boolean boolean12 = linkedListTestDriver8.contains((java.lang.Object) 0.0d);
        linkedListTestDriver0.addLast((java.lang.Object) boolean12);
        linkedListTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0 + "'", obj6, 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test215");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver0.addFirst((java.lang.Object) 'a');
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        int int7 = linkedListTestDriver0.size();
        java.lang.Object obj8 = linkedListTestDriver0.removeLast();
        linkedListTestDriver0.clear();
        experiment.util.Iterator iterator10 = linkedListTestDriver0.iterator();
        boolean boolean11 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator13 = linkedListTestDriver0.listIterator((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 35; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0 + "'", obj6, 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test216");
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
        linkedListTestDriver0.clear();
        java.lang.Object[] objArray20 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver21.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean26 = linkedListTestDriver21.add((java.lang.Object) 1.0f);
        java.lang.Object obj27 = linkedListTestDriver21.removeLast();
        boolean boolean28 = linkedListTestDriver21.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray30 = linkedListTestDriver29.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver31.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver31.addFirst((java.lang.Object) 'a');
        experiment.util.Iterator iterator37 = linkedListTestDriver31.iterator();
        boolean boolean38 = linkedListTestDriver29.contains((java.lang.Object) iterator37);
        boolean boolean39 = linkedListTestDriver21.contains((java.lang.Object) linkedListTestDriver29);
        experiment.util.LinkedListTestDriver linkedListTestDriver40 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver40.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean45 = linkedListTestDriver40.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj46 = linkedListTestDriver40.removeFirst();
        linkedListTestDriver40.clear();
        boolean boolean48 = linkedListTestDriver21.remove((java.lang.Object) linkedListTestDriver40);
        java.lang.Object obj49 = linkedListTestDriver21.removeLast();
        boolean boolean50 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver21);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator52 = linkedListTestDriver21.listIterator((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 0");
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
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 1.0f + "'", obj27, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 0 + "'", obj46, 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 0 + "'", obj49, 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test217");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        java.lang.Object obj7 = linkedListTestDriver0.getLast();
        java.lang.Object obj8 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean15 = linkedListTestDriver10.equals_CUT((java.lang.Object) 10);
        boolean boolean17 = linkedListTestDriver10.add((java.lang.Object) (short) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver18.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean23 = linkedListTestDriver18.equals_CUT((java.lang.Object) 10);
        boolean boolean25 = linkedListTestDriver18.add((java.lang.Object) (short) 1);
        linkedListTestDriver18.clear();
        boolean boolean27 = linkedListTestDriver10.add((java.lang.Object) linkedListTestDriver18);
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver28.add((int) (short) 0, (java.lang.Object) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver32.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean37 = linkedListTestDriver32.add((java.lang.Object) 1.0f);
        java.lang.Object obj38 = linkedListTestDriver32.removeLast();
        java.lang.Object obj39 = linkedListTestDriver32.getFirst();
        experiment.util.Iterator iterator40 = linkedListTestDriver32.iterator();
        boolean boolean41 = linkedListTestDriver28.add((java.lang.Object) iterator40);
        linkedListTestDriver10.addLast((java.lang.Object) boolean41);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj43 = linkedListTestDriver0.set((int) 'a', (java.lang.Object) linkedListTestDriver10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 1.0f + "'", obj38, 1.0f);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 0 + "'", obj39, 0);
        org.junit.Assert.assertNotNull(iterator40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test218");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10);
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        java.lang.Object obj7 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver8.addFirst((java.lang.Object) 'a');
        experiment.util.Iterator iterator14 = linkedListTestDriver8.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver15.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean20 = linkedListTestDriver15.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj21 = linkedListTestDriver15.removeFirst();
        boolean boolean22 = linkedListTestDriver15.isEmpty();
        boolean boolean23 = linkedListTestDriver15.isEmpty();
        boolean boolean24 = linkedListTestDriver8.contains((java.lang.Object) linkedListTestDriver15);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray26 = linkedListTestDriver25.toArray();
        boolean boolean27 = linkedListTestDriver8.add((java.lang.Object) linkedListTestDriver25);
        java.lang.Object[] objArray28 = linkedListTestDriver25.toArray();
        linkedListTestDriver25.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver30.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean35 = linkedListTestDriver30.add((java.lang.Object) 1.0f);
        java.lang.Object obj36 = linkedListTestDriver30.removeLast();
        java.lang.Object obj37 = linkedListTestDriver30.getFirst();
        experiment.util.Iterator iterator38 = linkedListTestDriver30.iterator();
        boolean boolean39 = linkedListTestDriver25.remove((java.lang.Object) iterator38);
        linkedListTestDriver0.addLast((java.lang.Object) boolean39);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj42 = linkedListTestDriver0.remove((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0 + "'", obj21, 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 1.0f + "'", obj36, 1.0f);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 0 + "'", obj37, 0);
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test219");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj5 = linkedListTestDriver0.get(0);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean11 = linkedListTestDriver6.add((java.lang.Object) 1.0f);
        java.lang.Object obj12 = linkedListTestDriver6.removeLast();
        experiment.util.ListIterator listIterator14 = linkedListTestDriver6.listIterator(1);
        java.lang.Object obj15 = linkedListTestDriver6.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver16.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean21 = linkedListTestDriver16.equals_CUT((java.lang.Object) 10);
        experiment.util.Iterator iterator22 = linkedListTestDriver16.iterator();
        java.lang.Object[] objArray23 = linkedListTestDriver16.toArray();
        linkedListTestDriver6.addFirst((java.lang.Object) objArray23);
        experiment.util.Iterator iterator25 = linkedListTestDriver6.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) iterator25);
        experiment.util.LinkedListTestDriver linkedListTestDriver27 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver27.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean32 = linkedListTestDriver27.equals_CUT((java.lang.Object) 10);
        experiment.util.Iterator iterator33 = linkedListTestDriver27.iterator();
        java.lang.Object obj34 = linkedListTestDriver27.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver35 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver35.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean40 = linkedListTestDriver35.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj41 = linkedListTestDriver35.removeFirst();
        boolean boolean42 = linkedListTestDriver35.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver43 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver43.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj47 = linkedListTestDriver43.removeFirst();
        linkedListTestDriver43.clear();
        boolean boolean49 = linkedListTestDriver43.isEmpty();
        boolean boolean51 = linkedListTestDriver43.equals_CUT((java.lang.Object) (-1));
        boolean boolean52 = linkedListTestDriver35.equals_CUT((java.lang.Object) (-1));
        java.lang.Object[] objArray53 = linkedListTestDriver35.toArray();
        boolean boolean54 = linkedListTestDriver27.remove((java.lang.Object) objArray53);
        boolean boolean55 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver27);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator57 = linkedListTestDriver27.listIterator((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0 + "'", obj5, 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 1.0f + "'", obj12, 1.0f);
        org.junit.Assert.assertNotNull(listIterator14);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0 + "'", obj15, 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[0]");
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 0 + "'", obj34, 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 0 + "'", obj41, 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 0 + "'", obj47, 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test220");
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
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver25.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean30 = linkedListTestDriver25.equals_CUT((java.lang.Object) 10);
        boolean boolean32 = linkedListTestDriver25.add((java.lang.Object) (short) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver33 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver33.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean38 = linkedListTestDriver33.equals_CUT((java.lang.Object) 10);
        boolean boolean40 = linkedListTestDriver33.add((java.lang.Object) (short) 1);
        linkedListTestDriver33.clear();
        boolean boolean42 = linkedListTestDriver25.add((java.lang.Object) linkedListTestDriver33);
        boolean boolean43 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver25);
        java.lang.Object obj44 = linkedListTestDriver25.getLast();
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(obj44);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test221");
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
        linkedListTestDriver71.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean76 = linkedListTestDriver71.equals_CUT((java.lang.Object) 10);
        experiment.util.Iterator iterator77 = linkedListTestDriver71.iterator();
        java.lang.Object[] objArray78 = linkedListTestDriver71.toArray();
        boolean boolean79 = linkedListTestDriver14.remove((java.lang.Object) linkedListTestDriver71);
        experiment.util.LinkedListTestDriver linkedListTestDriver80 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver80.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean85 = linkedListTestDriver80.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj86 = linkedListTestDriver80.removeFirst();
        java.lang.Object[] objArray87 = linkedListTestDriver80.toArray();
        experiment.util.Iterator iterator88 = linkedListTestDriver80.iterator();
        linkedListTestDriver80.addLast((java.lang.Object) 100.0d);
        boolean boolean91 = linkedListTestDriver71.remove((java.lang.Object) 100.0d);
        java.lang.Object obj92 = linkedListTestDriver71.getFirst();
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
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(iterator77);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray78), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray78), "[0]");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertEquals("'" + obj86 + "' != '" + 0 + "'", obj86, 0);
        org.junit.Assert.assertNotNull(objArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray87), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray87), "[]");
        org.junit.Assert.assertNotNull(iterator88);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertEquals("'" + obj92 + "' != '" + 0 + "'", obj92, 0);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test222");
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
        boolean boolean22 = linkedListTestDriver17.add((java.lang.Object) 1.0f);
        java.lang.Object obj23 = linkedListTestDriver17.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver24.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver24.addFirst((java.lang.Object) 'a');
        experiment.util.Iterator iterator30 = linkedListTestDriver24.iterator();
        linkedListTestDriver17.addFirst((java.lang.Object) iterator30);
        experiment.util.Iterator iterator32 = linkedListTestDriver17.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver33 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver33.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean38 = linkedListTestDriver33.equals_CUT((java.lang.Object) 10);
        experiment.util.Iterator iterator39 = linkedListTestDriver33.iterator();
        java.lang.Object[] objArray40 = linkedListTestDriver33.toArray();
        linkedListTestDriver17.addFirst((java.lang.Object) objArray40);
        boolean boolean42 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver17);
        java.lang.Object obj43 = linkedListTestDriver17.removeLast();
        experiment.util.ListIterator listIterator45 = linkedListTestDriver17.listIterator(0);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0 + "'", obj13, 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 1.0f + "'", obj23, 1.0f);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[0]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + 0 + "'", obj43, 0);
        org.junit.Assert.assertNotNull(listIterator45);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test223");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver0.addFirst((java.lang.Object) 'a');
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray9 = linkedListTestDriver8.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean15 = linkedListTestDriver10.equals_CUT((java.lang.Object) 10);
        experiment.util.Iterator iterator16 = linkedListTestDriver10.iterator();
        java.lang.Object[] objArray17 = linkedListTestDriver10.toArray();
        boolean boolean18 = linkedListTestDriver8.contains((java.lang.Object) linkedListTestDriver10);
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver19.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean24 = linkedListTestDriver19.add((java.lang.Object) 1.0f);
        java.lang.Object obj25 = linkedListTestDriver19.removeLast();
        experiment.util.ListIterator listIterator27 = linkedListTestDriver19.listIterator(1);
        java.lang.Object obj28 = linkedListTestDriver19.removeLast();
        experiment.util.Iterator iterator29 = linkedListTestDriver19.iterator();
        linkedListTestDriver8.addLast((java.lang.Object) iterator29);
        int int31 = linkedListTestDriver8.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = linkedListTestDriver0.set(3, (java.lang.Object) linkedListTestDriver8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0 + "'", obj6, 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 1.0f + "'", obj25, 1.0f);
        org.junit.Assert.assertNotNull(listIterator27);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 0 + "'", obj28, 0);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test224");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10);
        boolean boolean7 = linkedListTestDriver0.add((java.lang.Object) (short) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj12 = linkedListTestDriver8.removeFirst();
        linkedListTestDriver8.clear();
        boolean boolean14 = linkedListTestDriver8.isEmpty();
        boolean boolean16 = linkedListTestDriver8.equals_CUT((java.lang.Object) 10L);
        boolean boolean18 = linkedListTestDriver8.add((java.lang.Object) (short) -1);
        java.lang.Object obj19 = linkedListTestDriver8.removeLast();
        boolean boolean21 = linkedListTestDriver8.equals_CUT((java.lang.Object) (-1.0d));
        linkedListTestDriver8.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver23.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean28 = linkedListTestDriver23.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj29 = linkedListTestDriver23.removeFirst();
        boolean boolean30 = linkedListTestDriver23.isEmpty();
        java.lang.Object[] objArray31 = linkedListTestDriver23.toArray();
        boolean boolean32 = linkedListTestDriver8.contains((java.lang.Object) linkedListTestDriver23);
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver8);
        experiment.util.Iterator iterator34 = linkedListTestDriver0.iterator();
        experiment.util.Iterator iterator35 = linkedListTestDriver0.iterator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0 + "'", obj12, 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (short) -1 + "'", obj19, (short) -1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0 + "'", obj29, 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertNotNull(iterator35);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test225");
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
        java.lang.Class<?> wildcardClass28 = linkedListTestDriver16.getClass();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 'a' + "'", obj6, 'a');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1.0f + "'", obj14, 1.0f);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0 + "'", obj15, 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 1.0f + "'", obj22, 1.0f);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 0 + "'", obj23, 0);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test226");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj6 = linkedListTestDriver0.removeFirst();
        linkedListTestDriver0.clear();
        java.lang.Class<?> wildcardClass8 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0 + "'", obj6, 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test227");
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
        int int17 = linkedListTestDriver0.size();
        java.lang.Object[] objArray18 = linkedListTestDriver0.toArray();
        boolean boolean19 = linkedListTestDriver0.isEmpty();
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0 + "'", obj13, 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[a, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[a, 0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test228");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver2.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver2.addFirst((java.lang.Object) 'a');
        experiment.util.Iterator iterator8 = linkedListTestDriver2.iterator();
        boolean boolean9 = linkedListTestDriver0.contains((java.lang.Object) iterator8);
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
        experiment.util.LinkedListTestDriver linkedListTestDriver56 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver56.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver56.addFirst((java.lang.Object) 'a');
        java.lang.Object obj62 = linkedListTestDriver56.getLast();
        boolean boolean63 = linkedListTestDriver12.remove((java.lang.Object) linkedListTestDriver56);
        boolean boolean64 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver12);
        java.lang.Object obj65 = linkedListTestDriver12.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver67 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver67.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver67.addFirst((java.lang.Object) 'a');
        java.lang.Object obj73 = linkedListTestDriver67.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver74 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver74.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj78 = linkedListTestDriver74.removeFirst();
        boolean boolean80 = linkedListTestDriver74.add((java.lang.Object) 100L);
        java.lang.Object obj82 = linkedListTestDriver74.remove((int) (short) 0);
        linkedListTestDriver74.clear();
        int int84 = linkedListTestDriver74.size();
        linkedListTestDriver67.addLast((java.lang.Object) int84);
        java.lang.Object obj86 = linkedListTestDriver67.getFirst();
        boolean boolean88 = linkedListTestDriver67.remove((java.lang.Object) (-1));
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver12.add(2, (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 2; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
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
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + 0 + "'", obj62, 0);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + 0 + "'", obj65, 0);
        org.junit.Assert.assertEquals("'" + obj73 + "' != '" + 'a' + "'", obj73, 'a');
        org.junit.Assert.assertEquals("'" + obj78 + "' != '" + 0 + "'", obj78, 0);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertEquals("'" + obj82 + "' != '" + 100L + "'", obj82, 100L);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertEquals("'" + obj86 + "' != '" + 'a' + "'", obj86, 'a');
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test229");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        java.lang.Object obj7 = linkedListTestDriver0.getFirst();
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        boolean boolean9 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean16 = linkedListTestDriver11.add((java.lang.Object) 1.0f);
        java.lang.Object obj17 = linkedListTestDriver11.removeLast();
        boolean boolean18 = linkedListTestDriver11.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray20 = linkedListTestDriver19.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver21.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver21.addFirst((java.lang.Object) 'a');
        experiment.util.Iterator iterator27 = linkedListTestDriver21.iterator();
        boolean boolean28 = linkedListTestDriver19.contains((java.lang.Object) iterator27);
        boolean boolean29 = linkedListTestDriver11.contains((java.lang.Object) linkedListTestDriver19);
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver30.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean35 = linkedListTestDriver30.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj36 = linkedListTestDriver30.removeFirst();
        linkedListTestDriver30.clear();
        boolean boolean38 = linkedListTestDriver11.remove((java.lang.Object) linkedListTestDriver30);
        boolean boolean39 = linkedListTestDriver11.isEmpty();
        boolean boolean41 = linkedListTestDriver11.add((java.lang.Object) 0L);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) '#', (java.lang.Object) boolean41);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 35; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 1.0f + "'", obj17, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 0 + "'", obj36, 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test230");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 10);
        linkedListTestDriver0.clear();
        boolean boolean8 = linkedListTestDriver0.equals_CUT((java.lang.Object) 100.0f);
        linkedListTestDriver0.addFirst((java.lang.Object) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator12 = linkedListTestDriver0.listIterator((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test231");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10);
        int int6 = linkedListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator8 = linkedListTestDriver0.listIterator((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test232");
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
        java.lang.Class<?> wildcardClass26 = iterator25.getClass();
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0 + "'", obj13, 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test233");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj6 = linkedListTestDriver0.removeFirst();
        boolean boolean7 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj12 = linkedListTestDriver8.removeFirst();
        linkedListTestDriver8.clear();
        boolean boolean14 = linkedListTestDriver8.isEmpty();
        boolean boolean16 = linkedListTestDriver8.equals_CUT((java.lang.Object) (-1));
        boolean boolean17 = linkedListTestDriver0.equals_CUT((java.lang.Object) (-1));
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver21.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver21.addFirst((java.lang.Object) 'a');
        java.lang.Object obj27 = linkedListTestDriver21.getLast();
        linkedListTestDriver19.add(0, (java.lang.Object) linkedListTestDriver21);
        boolean boolean29 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver21);
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver30.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver30.addFirst((java.lang.Object) 'a');
        experiment.util.Iterator iterator36 = linkedListTestDriver30.iterator();
        java.lang.Object[] objArray37 = linkedListTestDriver30.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver38 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver38.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj42 = linkedListTestDriver38.removeFirst();
        linkedListTestDriver38.clear();
        boolean boolean45 = linkedListTestDriver38.remove((java.lang.Object) (byte) -1);
        linkedListTestDriver38.clear();
        boolean boolean47 = linkedListTestDriver30.remove((java.lang.Object) linkedListTestDriver38);
        java.lang.Object obj48 = linkedListTestDriver30.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver49 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver49.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean54 = linkedListTestDriver49.add((java.lang.Object) 1.0f);
        java.lang.Object obj55 = linkedListTestDriver49.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver56 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver56.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver56.addFirst((java.lang.Object) 'a');
        experiment.util.Iterator iterator62 = linkedListTestDriver56.iterator();
        linkedListTestDriver49.addFirst((java.lang.Object) iterator62);
        experiment.util.Iterator iterator64 = linkedListTestDriver49.iterator();
        java.lang.Object obj65 = linkedListTestDriver49.getLast();
        experiment.util.ListIterator listIterator67 = linkedListTestDriver49.listIterator((int) (short) 0);
        boolean boolean68 = linkedListTestDriver30.remove((java.lang.Object) linkedListTestDriver49);
        linkedListTestDriver49.clear();
        boolean boolean70 = linkedListTestDriver21.add((java.lang.Object) linkedListTestDriver49);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0 + "'", obj6, 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0 + "'", obj12, 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0 + "'", obj27, 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[a, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[a, 0]");
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 0 + "'", obj42, 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 'a' + "'", obj48, 'a');
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + 1.0f + "'", obj55, 1.0f);
        org.junit.Assert.assertNotNull(iterator62);
        org.junit.Assert.assertNotNull(iterator64);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + 0 + "'", obj65, 0);
        org.junit.Assert.assertNotNull(listIterator67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test234");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        java.lang.Object obj7 = linkedListTestDriver0.getFirst();
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
        experiment.util.Iterator iterator34 = linkedListTestDriver9.iterator();
        linkedListTestDriver0.add((int) (short) 1, (java.lang.Object) linkedListTestDriver9);
        experiment.util.LinkedListTestDriver linkedListTestDriver36 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver36.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj40 = linkedListTestDriver36.removeFirst();
        linkedListTestDriver36.clear();
        boolean boolean42 = linkedListTestDriver36.isEmpty();
        boolean boolean44 = linkedListTestDriver36.equals_CUT((java.lang.Object) 10L);
        boolean boolean46 = linkedListTestDriver36.add((java.lang.Object) (short) -1);
        java.lang.Object obj47 = linkedListTestDriver36.removeLast();
        boolean boolean49 = linkedListTestDriver36.equals_CUT((java.lang.Object) (-1.0d));
        boolean boolean50 = linkedListTestDriver36.isEmpty();
        boolean boolean51 = linkedListTestDriver9.remove((java.lang.Object) boolean50);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 0 + "'", obj22, 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 0 + "'", obj40, 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + (short) -1 + "'", obj47, (short) -1);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test235");
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
        experiment.util.Iterator iterator38 = linkedListTestDriver20.iterator();
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
        org.junit.Assert.assertNotNull(iterator38);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test236");
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
        java.lang.Object[] objArray20 = linkedListTestDriver17.toArray();
        linkedListTestDriver17.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = linkedListTestDriver17.removeFirst();
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
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test237");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver2.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean7 = linkedListTestDriver2.add((java.lang.Object) 1.0f);
        java.lang.Object obj8 = linkedListTestDriver2.removeLast();
        boolean boolean9 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver2);
        java.lang.Object obj10 = linkedListTestDriver0.getFirst();
        java.lang.Object obj11 = linkedListTestDriver0.getFirst();
        java.lang.Object obj12 = linkedListTestDriver0.removeLast();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1.0f + "'", obj8, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test238");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator7 = linkedListTestDriver0.listIterator((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 97; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test239");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        java.lang.Object obj7 = linkedListTestDriver0.getLast();
        java.lang.Object obj8 = linkedListTestDriver0.getLast();
        boolean boolean9 = linkedListTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test240");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj6 = linkedListTestDriver0.removeFirst();
        java.lang.Object[] objArray7 = linkedListTestDriver0.toArray();
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) 100.0d);
        boolean boolean11 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj16 = linkedListTestDriver12.removeFirst();
        boolean boolean18 = linkedListTestDriver12.add((java.lang.Object) 100L);
        java.lang.Object obj20 = linkedListTestDriver12.remove((int) (short) 0);
        boolean boolean21 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver12);
        java.lang.Object[] objArray22 = linkedListTestDriver12.toArray();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0 + "'", obj6, 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100L + "'", obj20, 100L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test241");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver1.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver1.addFirst((java.lang.Object) 'a');
        boolean boolean7 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver1);
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray9 = linkedListTestDriver8.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean15 = linkedListTestDriver10.equals_CUT((java.lang.Object) 10);
        experiment.util.Iterator iterator16 = linkedListTestDriver10.iterator();
        java.lang.Object[] objArray17 = linkedListTestDriver10.toArray();
        boolean boolean18 = linkedListTestDriver8.contains((java.lang.Object) linkedListTestDriver10);
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver19.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean24 = linkedListTestDriver19.add((java.lang.Object) (short) 10);
        linkedListTestDriver19.clear();
        boolean boolean27 = linkedListTestDriver19.equals_CUT((java.lang.Object) 100.0f);
        linkedListTestDriver19.addFirst((java.lang.Object) 0.0f);
        boolean boolean30 = linkedListTestDriver10.equals_CUT((java.lang.Object) 0.0f);
        boolean boolean31 = linkedListTestDriver1.equals_CUT((java.lang.Object) linkedListTestDriver10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test242");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver1.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver1.addFirst((java.lang.Object) 'a');
        boolean boolean7 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver1);
        java.lang.Object[] objArray8 = linkedListTestDriver1.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver9.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver9.addFirst((java.lang.Object) 'a');
        java.lang.Object obj15 = linkedListTestDriver9.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver16.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj20 = linkedListTestDriver16.removeFirst();
        boolean boolean22 = linkedListTestDriver16.add((java.lang.Object) 100L);
        java.lang.Object obj24 = linkedListTestDriver16.remove((int) (short) 0);
        linkedListTestDriver16.clear();
        int int26 = linkedListTestDriver16.size();
        linkedListTestDriver9.addLast((java.lang.Object) int26);
        boolean boolean28 = linkedListTestDriver1.contains((java.lang.Object) linkedListTestDriver9);
        java.lang.Object[] objArray29 = linkedListTestDriver1.toArray();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[a, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[a, 0]");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 'a' + "'", obj15, 'a');
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 0 + "'", obj20, 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 100L + "'", obj24, 100L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[a, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[a, 0]");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test243");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj4 = linkedListTestDriver0.removeFirst();
        linkedListTestDriver0.clear();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        boolean boolean8 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10L);
        experiment.util.Iterator iterator9 = linkedListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = linkedListTestDriver0.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0 + "'", obj4, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test244");
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
        int int69 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver71 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver71.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean76 = linkedListTestDriver71.add((java.lang.Object) 1.0f);
        java.lang.Object obj77 = linkedListTestDriver71.removeLast();
        java.lang.Object obj78 = linkedListTestDriver71.getFirst();
        experiment.util.Iterator iterator79 = linkedListTestDriver71.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj80 = linkedListTestDriver0.set((int) (short) 100, (java.lang.Object) linkedListTestDriver71);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertEquals("'" + obj77 + "' != '" + 1.0f + "'", obj77, 1.0f);
        org.junit.Assert.assertEquals("'" + obj78 + "' != '" + 0 + "'", obj78, 0);
        org.junit.Assert.assertNotNull(iterator79);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test245");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        boolean boolean7 = linkedListTestDriver0.isEmpty();
        java.lang.Object obj8 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver9.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean14 = linkedListTestDriver9.add((java.lang.Object) 1.0f);
        java.lang.Object obj15 = linkedListTestDriver9.removeLast();
        java.lang.Object obj16 = linkedListTestDriver9.getFirst();
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
        experiment.util.Iterator iterator43 = linkedListTestDriver18.iterator();
        linkedListTestDriver9.add((int) (short) 1, (java.lang.Object) linkedListTestDriver18);
        boolean boolean45 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 1.0f + "'", obj15, 1.0f);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 0 + "'", obj31, 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(iterator43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test246");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj4 = linkedListTestDriver0.removeFirst();
        boolean boolean6 = linkedListTestDriver0.add((java.lang.Object) 100L);
        java.lang.Object obj8 = linkedListTestDriver0.remove((int) (short) 0);
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean15 = linkedListTestDriver10.equals_CUT((java.lang.Object) 10);
        boolean boolean17 = linkedListTestDriver10.add((java.lang.Object) (short) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver18.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean23 = linkedListTestDriver18.equals_CUT((java.lang.Object) 10);
        boolean boolean25 = linkedListTestDriver18.add((java.lang.Object) (short) 1);
        linkedListTestDriver18.clear();
        boolean boolean27 = linkedListTestDriver10.add((java.lang.Object) linkedListTestDriver18);
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver28.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj32 = linkedListTestDriver28.removeFirst();
        boolean boolean34 = linkedListTestDriver28.add((java.lang.Object) 100L);
        java.lang.Object obj36 = linkedListTestDriver28.remove((int) (short) 0);
        linkedListTestDriver28.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver38 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver38.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver38.addFirst((java.lang.Object) 'a');
        java.lang.Object obj44 = linkedListTestDriver38.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver46 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver46.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean51 = linkedListTestDriver46.add((java.lang.Object) 1.0f);
        java.lang.Object obj52 = linkedListTestDriver46.removeLast();
        java.lang.Object obj53 = linkedListTestDriver46.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver54 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver54.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean59 = linkedListTestDriver54.add((java.lang.Object) 1.0f);
        java.lang.Object obj60 = linkedListTestDriver54.removeLast();
        java.lang.Object obj61 = linkedListTestDriver54.getFirst();
        linkedListTestDriver46.addFirst((java.lang.Object) linkedListTestDriver54);
        linkedListTestDriver38.add(2, (java.lang.Object) linkedListTestDriver54);
        linkedListTestDriver54.clear();
        experiment.util.Iterator iterator65 = linkedListTestDriver54.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver67 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver67.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean72 = linkedListTestDriver67.add((java.lang.Object) 1.0f);
        java.lang.Object obj73 = linkedListTestDriver67.removeLast();
        boolean boolean74 = linkedListTestDriver67.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver75 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray76 = linkedListTestDriver75.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver77 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver77.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver77.addFirst((java.lang.Object) 'a');
        experiment.util.Iterator iterator83 = linkedListTestDriver77.iterator();
        boolean boolean84 = linkedListTestDriver75.contains((java.lang.Object) iterator83);
        boolean boolean85 = linkedListTestDriver67.contains((java.lang.Object) linkedListTestDriver75);
        experiment.util.LinkedListTestDriver linkedListTestDriver86 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver86.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean91 = linkedListTestDriver86.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj92 = linkedListTestDriver86.removeFirst();
        linkedListTestDriver86.clear();
        boolean boolean94 = linkedListTestDriver67.remove((java.lang.Object) linkedListTestDriver86);
        linkedListTestDriver54.add(0, (java.lang.Object) linkedListTestDriver67);
        boolean boolean96 = linkedListTestDriver28.equals_CUT((java.lang.Object) linkedListTestDriver54);
        java.lang.Object[] objArray97 = linkedListTestDriver28.toArray();
        boolean boolean98 = linkedListTestDriver10.remove((java.lang.Object) linkedListTestDriver28);
        boolean boolean99 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver28);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0 + "'", obj4, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100L + "'", obj8, 100L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 0 + "'", obj32, 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 100L + "'", obj36, 100L);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 'a' + "'", obj44, 'a');
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 1.0f + "'", obj52, 1.0f);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + 0 + "'", obj53, 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + 1.0f + "'", obj60, 1.0f);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + 0 + "'", obj61, 0);
        org.junit.Assert.assertNotNull(iterator65);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertEquals("'" + obj73 + "' != '" + 1.0f + "'", obj73, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray76), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray76), "[]");
        org.junit.Assert.assertNotNull(iterator83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertEquals("'" + obj92 + "' != '" + 0 + "'", obj92, 0);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertNotNull(objArray97);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray97), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray97), "[]");
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test247");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj4 = linkedListTestDriver0.removeFirst();
        boolean boolean6 = linkedListTestDriver0.add((java.lang.Object) 100L);
        java.lang.Object obj8 = linkedListTestDriver0.remove((int) (short) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean15 = linkedListTestDriver10.add((java.lang.Object) 1.0f);
        java.lang.Object obj16 = linkedListTestDriver10.removeLast();
        java.lang.Object obj17 = linkedListTestDriver10.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver18.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean23 = linkedListTestDriver18.add((java.lang.Object) 1.0f);
        java.lang.Object obj24 = linkedListTestDriver18.removeLast();
        java.lang.Object obj25 = linkedListTestDriver18.getFirst();
        linkedListTestDriver10.addFirst((java.lang.Object) linkedListTestDriver18);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) (short) -1, (java.lang.Object) linkedListTestDriver10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0 + "'", obj4, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100L + "'", obj8, 100L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 1.0f + "'", obj16, 1.0f);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0 + "'", obj17, 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 1.0f + "'", obj24, 1.0f);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 0 + "'", obj25, 0);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test248");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj6 = linkedListTestDriver0.removeFirst();
        boolean boolean7 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj12 = linkedListTestDriver8.removeFirst();
        linkedListTestDriver8.clear();
        boolean boolean14 = linkedListTestDriver8.isEmpty();
        boolean boolean16 = linkedListTestDriver8.equals_CUT((java.lang.Object) (-1));
        boolean boolean17 = linkedListTestDriver0.equals_CUT((java.lang.Object) (-1));
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver21.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver21.addFirst((java.lang.Object) 'a');
        java.lang.Object obj27 = linkedListTestDriver21.getLast();
        linkedListTestDriver19.add(0, (java.lang.Object) linkedListTestDriver21);
        boolean boolean29 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver21);
        experiment.util.ListIterator listIterator31 = linkedListTestDriver21.listIterator((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0 + "'", obj6, 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0 + "'", obj12, 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0 + "'", obj27, 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(listIterator31);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test249");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        boolean boolean7 = linkedListTestDriver0.isEmpty();
        java.lang.Object obj8 = linkedListTestDriver0.removeFirst();
        linkedListTestDriver0.addFirst((java.lang.Object) 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = linkedListTestDriver0.get(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test250");
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
        linkedListTestDriver14.clear();
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
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test251");
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
        int int17 = linkedListTestDriver0.size();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1.0f + "'", obj14, 1.0f);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0 + "'", obj15, 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test252");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver1.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver1.addFirst((java.lang.Object) 'a');
        boolean boolean7 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver1);
        java.lang.Object[] objArray8 = linkedListTestDriver1.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver9.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver9.addFirst((java.lang.Object) 'a');
        java.lang.Object obj15 = linkedListTestDriver9.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver16.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj20 = linkedListTestDriver16.removeFirst();
        boolean boolean22 = linkedListTestDriver16.add((java.lang.Object) 100L);
        java.lang.Object obj24 = linkedListTestDriver16.remove((int) (short) 0);
        linkedListTestDriver16.clear();
        int int26 = linkedListTestDriver16.size();
        linkedListTestDriver9.addLast((java.lang.Object) int26);
        boolean boolean28 = linkedListTestDriver1.contains((java.lang.Object) linkedListTestDriver9);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator30 = linkedListTestDriver1.listIterator((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[a, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[a, 0]");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 'a' + "'", obj15, 'a');
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 0 + "'", obj20, 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 100L + "'", obj24, 100L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test253");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        java.lang.Object obj7 = linkedListTestDriver0.getFirst();
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        boolean boolean9 = linkedListTestDriver0.isEmpty();
        java.lang.Object obj10 = linkedListTestDriver0.getFirst();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 0 + "'", obj10, 0);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test254");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 10);
        linkedListTestDriver0.clear();
        boolean boolean8 = linkedListTestDriver0.equals_CUT((java.lang.Object) 100.0f);
        linkedListTestDriver0.addFirst((java.lang.Object) 0.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean16 = linkedListTestDriver11.equals_CUT((java.lang.Object) 10);
        experiment.util.Iterator iterator17 = linkedListTestDriver11.iterator();
        java.lang.Object obj18 = linkedListTestDriver11.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver19.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver19.addFirst((java.lang.Object) 'a');
        experiment.util.Iterator iterator25 = linkedListTestDriver19.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver26.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean31 = linkedListTestDriver26.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj32 = linkedListTestDriver26.removeFirst();
        boolean boolean33 = linkedListTestDriver26.isEmpty();
        boolean boolean34 = linkedListTestDriver26.isEmpty();
        boolean boolean35 = linkedListTestDriver19.contains((java.lang.Object) linkedListTestDriver26);
        experiment.util.LinkedListTestDriver linkedListTestDriver36 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray37 = linkedListTestDriver36.toArray();
        boolean boolean38 = linkedListTestDriver19.add((java.lang.Object) linkedListTestDriver36);
        java.lang.Object[] objArray39 = linkedListTestDriver36.toArray();
        linkedListTestDriver36.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver41 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver41.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean46 = linkedListTestDriver41.add((java.lang.Object) 1.0f);
        java.lang.Object obj47 = linkedListTestDriver41.removeLast();
        java.lang.Object obj48 = linkedListTestDriver41.getFirst();
        experiment.util.Iterator iterator49 = linkedListTestDriver41.iterator();
        boolean boolean50 = linkedListTestDriver36.remove((java.lang.Object) iterator49);
        linkedListTestDriver11.addLast((java.lang.Object) boolean50);
        boolean boolean52 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver11);
        java.lang.Object[] objArray53 = linkedListTestDriver0.toArray();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 0 + "'", obj18, 0);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 0 + "'", obj32, 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 1.0f + "'", obj47, 1.0f);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 0 + "'", obj48, 0);
        org.junit.Assert.assertNotNull(iterator49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[0.0]");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test255");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj6 = linkedListTestDriver0.removeFirst();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean13 = linkedListTestDriver8.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj14 = linkedListTestDriver8.removeFirst();
        java.lang.Object[] objArray15 = linkedListTestDriver8.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver17.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean22 = linkedListTestDriver17.add((java.lang.Object) 1.0f);
        boolean boolean24 = linkedListTestDriver17.equals_CUT((java.lang.Object) 10.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver25.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean30 = linkedListTestDriver25.equals_CUT((java.lang.Object) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver31.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj35 = linkedListTestDriver31.removeFirst();
        linkedListTestDriver31.clear();
        boolean boolean37 = linkedListTestDriver31.isEmpty();
        boolean boolean39 = linkedListTestDriver31.equals_CUT((java.lang.Object) 10L);
        linkedListTestDriver25.addFirst((java.lang.Object) linkedListTestDriver31);
        linkedListTestDriver17.addFirst((java.lang.Object) linkedListTestDriver25);
        java.lang.Object obj42 = linkedListTestDriver17.removeFirst();
        linkedListTestDriver8.add((int) (short) 0, obj42);
        boolean boolean44 = linkedListTestDriver0.add((java.lang.Object) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0 + "'", obj6, 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0 + "'", obj14, 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 0 + "'", obj35, 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test256");
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
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver25.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean30 = linkedListTestDriver25.equals_CUT((java.lang.Object) 10);
        boolean boolean32 = linkedListTestDriver25.add((java.lang.Object) (short) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver33 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver33.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean38 = linkedListTestDriver33.equals_CUT((java.lang.Object) 10);
        boolean boolean40 = linkedListTestDriver33.add((java.lang.Object) (short) 1);
        linkedListTestDriver33.clear();
        boolean boolean42 = linkedListTestDriver25.add((java.lang.Object) linkedListTestDriver33);
        boolean boolean43 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver25);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator45 = linkedListTestDriver25.listIterator(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 100; size: 3");
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

}
