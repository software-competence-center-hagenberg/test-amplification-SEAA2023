package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_LinkedListTest_1191369007_32_s {

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
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test001");
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
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test002");
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
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test003");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj1 = linkedListTestDriver0.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test004");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = linkedListTestDriver0.get((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test005");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = linkedListTestDriver0.get((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test006");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = linkedListTestDriver0.remove((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test007");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.contains((java.lang.Object) '#');
        boolean boolean4 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = linkedListTestDriver0.get(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test008");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test009");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.contains((java.lang.Object) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = linkedListTestDriver0.set((int) (short) 100, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test010");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator4 = linkedListTestDriver3.iterator();
        boolean boolean6 = linkedListTestDriver3.contains((java.lang.Object) '#');
        boolean boolean8 = linkedListTestDriver3.add((java.lang.Object) (byte) 10);
        boolean boolean10 = linkedListTestDriver3.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean11 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver3);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) 'a', (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 97; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test011");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator4 = linkedListTestDriver3.iterator();
        boolean boolean6 = linkedListTestDriver3.contains((java.lang.Object) '#');
        boolean boolean8 = linkedListTestDriver3.add((java.lang.Object) (byte) 10);
        boolean boolean10 = linkedListTestDriver3.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean11 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver3);
        java.lang.Class<?> wildcardClass12 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test012");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.contains((java.lang.Object) '#');
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (byte) 10);
        java.lang.Class<?> wildcardClass6 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test013");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator6 = linkedListTestDriver5.iterator();
        linkedListTestDriver0.add(0, (java.lang.Object) iterator6);
        boolean boolean8 = linkedListTestDriver0.isEmpty();
        java.lang.Object obj9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = linkedListTestDriver0.equals_CUT(obj9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test014");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = linkedListTestDriver0.get((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test015");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.contains((java.lang.Object) '#');
        boolean boolean4 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = linkedListTestDriver0.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test016");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 0.0f);
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
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test017");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = linkedListTestDriver0.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test018");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.contains((java.lang.Object) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = linkedListTestDriver0.remove((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test019");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.contains((java.lang.Object) '#');
        boolean boolean4 = linkedListTestDriver0.isEmpty();
        boolean boolean6 = linkedListTestDriver0.equals_CUT((java.lang.Object) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = linkedListTestDriver0.getLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test020");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator6 = linkedListTestDriver5.iterator();
        linkedListTestDriver0.add(0, (java.lang.Object) iterator6);
        boolean boolean8 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator11 = linkedListTestDriver10.iterator();
        experiment.util.Iterator iterator12 = linkedListTestDriver10.iterator();
        experiment.util.ListIterator listIterator14 = linkedListTestDriver10.listIterator(0);
        linkedListTestDriver10.clear();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) (byte) 100, (java.lang.Object) linkedListTestDriver10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 100; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(listIterator14);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test021");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.contains((java.lang.Object) '#');
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (byte) 10);
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj8 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator10 = linkedListTestDriver9.iterator();
        boolean boolean12 = linkedListTestDriver9.add((java.lang.Object) false);
        linkedListTestDriver9.addFirst((java.lang.Object) (byte) 1);
        boolean boolean16 = linkedListTestDriver9.contains((java.lang.Object) 100.0d);
        boolean boolean17 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = linkedListTestDriver0.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 10 + "'", obj8, (byte) 10);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test022");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.contains((java.lang.Object) '#');
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (byte) 10);
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj8 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator10 = linkedListTestDriver9.iterator();
        boolean boolean12 = linkedListTestDriver9.add((java.lang.Object) false);
        linkedListTestDriver9.addFirst((java.lang.Object) (byte) 1);
        boolean boolean16 = linkedListTestDriver9.contains((java.lang.Object) 100.0d);
        boolean boolean17 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = linkedListTestDriver0.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 10 + "'", obj8, (byte) 10);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test023");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        experiment.util.Iterator iterator2 = linkedListTestDriver0.iterator();
        experiment.util.ListIterator listIterator4 = linkedListTestDriver0.listIterator(0);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 10L);
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(listIterator4);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test024");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 1);
        boolean boolean7 = linkedListTestDriver0.contains((java.lang.Object) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = linkedListTestDriver0.get(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test025");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator4 = linkedListTestDriver3.iterator();
        boolean boolean6 = linkedListTestDriver3.contains((java.lang.Object) '#');
        boolean boolean8 = linkedListTestDriver3.add((java.lang.Object) (byte) 10);
        boolean boolean10 = linkedListTestDriver3.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean11 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = linkedListTestDriver3.get(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test026");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 0.0f);
        java.lang.Object[] objArray3 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator5 = linkedListTestDriver4.iterator();
        boolean boolean7 = linkedListTestDriver4.contains((java.lang.Object) '#');
        boolean boolean9 = linkedListTestDriver4.add((java.lang.Object) (byte) 10);
        boolean boolean11 = linkedListTestDriver4.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj12 = linkedListTestDriver4.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator14 = linkedListTestDriver13.iterator();
        boolean boolean16 = linkedListTestDriver13.add((java.lang.Object) false);
        linkedListTestDriver13.addFirst((java.lang.Object) (byte) 1);
        boolean boolean20 = linkedListTestDriver13.contains((java.lang.Object) 100.0d);
        boolean boolean21 = linkedListTestDriver4.contains((java.lang.Object) linkedListTestDriver13);
        experiment.util.Iterator iterator22 = linkedListTestDriver4.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver4);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator26 = linkedListTestDriver25.iterator();
        boolean boolean28 = linkedListTestDriver25.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator31 = linkedListTestDriver30.iterator();
        linkedListTestDriver25.add(0, (java.lang.Object) iterator31);
        boolean boolean33 = linkedListTestDriver25.isEmpty();
        java.lang.Object obj34 = linkedListTestDriver25.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = linkedListTestDriver0.set((int) (short) 1, obj34);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 10 + "'", obj12, (byte) 10);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + false + "'", obj34, false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test027");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.contains((java.lang.Object) '#');
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (byte) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator7 = linkedListTestDriver6.iterator();
        boolean boolean9 = linkedListTestDriver6.contains((java.lang.Object) '#');
        linkedListTestDriver0.addFirst((java.lang.Object) '#');
        java.lang.Object obj11 = linkedListTestDriver0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = linkedListTestDriver0.remove((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '#' + "'", obj11, '#');
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test028");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 1);
        boolean boolean7 = linkedListTestDriver0.contains((java.lang.Object) 100.0d);
        linkedListTestDriver0.clear();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test029");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator6 = linkedListTestDriver5.iterator();
        linkedListTestDriver0.add(0, (java.lang.Object) iterator6);
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) (byte) 0);
        experiment.util.Iterator iterator10 = linkedListTestDriver0.iterator();
        java.lang.Object obj11 = linkedListTestDriver0.removeFirst();
        java.lang.Class<?> wildcardClass12 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test030");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator6 = linkedListTestDriver5.iterator();
        boolean boolean8 = linkedListTestDriver5.add((java.lang.Object) false);
        linkedListTestDriver5.addFirst((java.lang.Object) (byte) 1);
        boolean boolean12 = linkedListTestDriver5.add((java.lang.Object) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator17 = linkedListTestDriver16.iterator();
        boolean boolean19 = linkedListTestDriver16.contains((java.lang.Object) '#');
        boolean boolean21 = linkedListTestDriver16.add((java.lang.Object) (byte) 10);
        boolean boolean23 = linkedListTestDriver16.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean24 = linkedListTestDriver13.contains((java.lang.Object) linkedListTestDriver16);
        java.lang.Object obj25 = linkedListTestDriver16.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator27 = linkedListTestDriver26.iterator();
        boolean boolean29 = linkedListTestDriver26.contains((java.lang.Object) '#');
        boolean boolean31 = linkedListTestDriver26.add((java.lang.Object) (byte) 10);
        boolean boolean33 = linkedListTestDriver26.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj34 = linkedListTestDriver26.removeFirst();
        boolean boolean36 = linkedListTestDriver26.remove((java.lang.Object) (byte) 1);
        boolean boolean37 = linkedListTestDriver16.remove((java.lang.Object) linkedListTestDriver26);
        experiment.util.LinkedListTestDriver linkedListTestDriver38 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator39 = linkedListTestDriver38.iterator();
        experiment.util.Iterator iterator40 = linkedListTestDriver38.iterator();
        linkedListTestDriver26.addFirst((java.lang.Object) linkedListTestDriver38);
        linkedListTestDriver5.addLast((java.lang.Object) linkedListTestDriver38);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj43 = linkedListTestDriver0.set((int) '#', (java.lang.Object) linkedListTestDriver38);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[hi!]");
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) 10 + "'", obj25, (byte) 10);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (byte) 10 + "'", obj34, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertNotNull(iterator40);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test031");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 1);
        java.lang.Object[] objArray6 = linkedListTestDriver0.toArray();
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = linkedListTestDriver0.set((-1), (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, false]");
        org.junit.Assert.assertNotNull(iterator7);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test032");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) '4', (java.lang.Object) linkedListTestDriver7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 52; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

}
