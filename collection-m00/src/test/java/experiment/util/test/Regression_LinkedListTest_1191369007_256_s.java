package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_LinkedListTest_1191369007_256_s {

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

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test033");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = linkedListTestDriver4.getLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
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
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test034");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator4 = linkedListTestDriver3.iterator();
        boolean boolean6 = linkedListTestDriver3.contains((java.lang.Object) '#');
        boolean boolean8 = linkedListTestDriver3.add((java.lang.Object) (byte) 10);
        boolean boolean10 = linkedListTestDriver3.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean11 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver3);
        java.lang.Object obj12 = linkedListTestDriver3.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator14 = linkedListTestDriver13.iterator();
        boolean boolean16 = linkedListTestDriver13.contains((java.lang.Object) '#');
        boolean boolean18 = linkedListTestDriver13.add((java.lang.Object) (byte) 10);
        boolean boolean20 = linkedListTestDriver13.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj21 = linkedListTestDriver13.removeFirst();
        boolean boolean23 = linkedListTestDriver13.remove((java.lang.Object) (byte) 1);
        boolean boolean24 = linkedListTestDriver3.remove((java.lang.Object) linkedListTestDriver13);
        java.lang.Object obj25 = linkedListTestDriver3.getLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = linkedListTestDriver3.get((-1));
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
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 10 + "'", obj12, (byte) 10);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 10 + "'", obj21, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) 10 + "'", obj25, (byte) 10);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test035");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.contains((java.lang.Object) '#');
        boolean boolean4 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = linkedListTestDriver0.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test036");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator7 = linkedListTestDriver6.iterator();
        boolean boolean8 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = linkedListTestDriver6.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test037");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator6 = linkedListTestDriver5.iterator();
        linkedListTestDriver0.add(0, (java.lang.Object) iterator6);
        boolean boolean8 = linkedListTestDriver0.isEmpty();
        java.lang.Object obj9 = linkedListTestDriver0.removeLast();
        boolean boolean11 = linkedListTestDriver0.equals_CUT((java.lang.Object) (-1.0d));
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator14 = linkedListTestDriver13.iterator();
        boolean boolean16 = linkedListTestDriver13.add((java.lang.Object) false);
        linkedListTestDriver13.addFirst((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator20 = linkedListTestDriver19.iterator();
        boolean boolean21 = linkedListTestDriver13.remove((java.lang.Object) linkedListTestDriver19);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) (byte) 100, (java.lang.Object) boolean21);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 100; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + false + "'", obj9, false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test038");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator7 = linkedListTestDriver6.iterator();
        boolean boolean8 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver6);
        java.lang.Object obj9 = linkedListTestDriver0.getLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = linkedListTestDriver0.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + false + "'", obj9, false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test039");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator4 = linkedListTestDriver3.iterator();
        boolean boolean6 = linkedListTestDriver3.contains((java.lang.Object) '#');
        boolean boolean8 = linkedListTestDriver3.add((java.lang.Object) (byte) 10);
        boolean boolean10 = linkedListTestDriver3.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean11 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver3);
        java.lang.Object obj12 = linkedListTestDriver3.getLast();
        linkedListTestDriver3.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 10 + "'", obj12, (byte) 10);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test040");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = linkedListTestDriver0.toArray();
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = linkedListTestDriver0.equals_CUT(obj4);
        boolean boolean7 = linkedListTestDriver0.add((java.lang.Object) 0);
        java.lang.Object obj8 = linkedListTestDriver0.getFirst();
        java.lang.Object obj9 = null;
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.addLast(obj9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[hi!]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test041");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator6 = linkedListTestDriver5.iterator();
        linkedListTestDriver0.add(0, (java.lang.Object) iterator6);
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) (byte) 0);
        experiment.util.Iterator iterator10 = linkedListTestDriver0.iterator();
        java.lang.Object obj11 = linkedListTestDriver0.removeFirst();
        boolean boolean12 = linkedListTestDriver0.isEmpty();
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
        java.lang.Object obj38 = linkedListTestDriver16.getLast();
        boolean boolean39 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver16);
        java.lang.Object obj40 = linkedListTestDriver16.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver41 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator42 = linkedListTestDriver41.iterator();
        boolean boolean44 = linkedListTestDriver41.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver46 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator47 = linkedListTestDriver46.iterator();
        linkedListTestDriver41.add(0, (java.lang.Object) iterator47);
        boolean boolean49 = linkedListTestDriver41.isEmpty();
        java.lang.Object obj50 = linkedListTestDriver41.removeLast();
        boolean boolean51 = linkedListTestDriver16.equals_CUT(obj50);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj53 = linkedListTestDriver16.remove((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
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
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (byte) 10 + "'", obj38, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (byte) 10 + "'", obj40, (byte) 10);
        org.junit.Assert.assertNotNull(iterator42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(iterator47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + false + "'", obj50, false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test042");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator4 = linkedListTestDriver3.iterator();
        boolean boolean6 = linkedListTestDriver3.contains((java.lang.Object) '#');
        boolean boolean8 = linkedListTestDriver3.add((java.lang.Object) (byte) 10);
        boolean boolean10 = linkedListTestDriver3.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean11 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver3);
        java.lang.Object obj12 = linkedListTestDriver3.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator14 = linkedListTestDriver13.iterator();
        boolean boolean16 = linkedListTestDriver13.contains((java.lang.Object) '#');
        boolean boolean18 = linkedListTestDriver13.add((java.lang.Object) (byte) 10);
        boolean boolean20 = linkedListTestDriver13.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj21 = linkedListTestDriver13.removeFirst();
        boolean boolean23 = linkedListTestDriver13.remove((java.lang.Object) (byte) 1);
        boolean boolean24 = linkedListTestDriver3.remove((java.lang.Object) linkedListTestDriver13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = linkedListTestDriver13.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 10 + "'", obj12, (byte) 10);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 10 + "'", obj21, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test043");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator6 = linkedListTestDriver5.iterator();
        linkedListTestDriver0.add(0, (java.lang.Object) iterator6);
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) (byte) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator11 = linkedListTestDriver10.iterator();
        boolean boolean13 = linkedListTestDriver10.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator16 = linkedListTestDriver15.iterator();
        linkedListTestDriver10.add(0, (java.lang.Object) iterator16);
        boolean boolean18 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver10);
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator21 = linkedListTestDriver20.iterator();
        boolean boolean23 = linkedListTestDriver20.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator26 = linkedListTestDriver25.iterator();
        linkedListTestDriver20.add(0, (java.lang.Object) iterator26);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) (short) 100, (java.lang.Object) linkedListTestDriver20);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 100; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(iterator26);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test044");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.contains((java.lang.Object) '#');
        boolean boolean4 = linkedListTestDriver0.isEmpty();
        boolean boolean6 = linkedListTestDriver0.equals_CUT((java.lang.Object) (short) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator8 = linkedListTestDriver7.iterator();
        boolean boolean10 = linkedListTestDriver7.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator13 = linkedListTestDriver12.iterator();
        linkedListTestDriver7.add(0, (java.lang.Object) iterator13);
        boolean boolean16 = linkedListTestDriver7.remove((java.lang.Object) (byte) 0);
        experiment.util.Iterator iterator17 = linkedListTestDriver7.iterator();
        java.lang.Object obj18 = linkedListTestDriver7.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver7.contains((java.lang.Object) linkedListTestDriver19);
        boolean boolean21 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = linkedListTestDriver0.get(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test045");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        boolean boolean5 = linkedListTestDriver3.contains((java.lang.Object) (-1.0f));
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver3);
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator8 = linkedListTestDriver7.iterator();
        boolean boolean10 = linkedListTestDriver7.add((java.lang.Object) false);
        linkedListTestDriver7.addFirst((java.lang.Object) (byte) 1);
        boolean boolean14 = linkedListTestDriver7.contains((java.lang.Object) 100.0d);
        boolean boolean15 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver7);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator17 = linkedListTestDriver7.listIterator((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test046");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator7 = linkedListTestDriver6.iterator();
        boolean boolean8 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver6);
        java.lang.Object obj9 = linkedListTestDriver0.getLast();
        int int10 = linkedListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator12 = linkedListTestDriver0.listIterator((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + false + "'", obj9, false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test047");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator6 = linkedListTestDriver5.iterator();
        linkedListTestDriver0.add(0, (java.lang.Object) iterator6);
        java.lang.Object obj8 = linkedListTestDriver0.removeLast();
        boolean boolean10 = linkedListTestDriver0.remove((java.lang.Object) 1.0d);
        java.lang.Object obj11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = linkedListTestDriver0.contains(obj11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + false + "'", obj8, false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test048");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        boolean boolean5 = linkedListTestDriver3.contains((java.lang.Object) (-1.0f));
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver3);
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator8 = linkedListTestDriver7.iterator();
        boolean boolean10 = linkedListTestDriver7.add((java.lang.Object) false);
        linkedListTestDriver7.addFirst((java.lang.Object) (byte) 1);
        boolean boolean14 = linkedListTestDriver7.contains((java.lang.Object) 100.0d);
        boolean boolean15 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver7);
        boolean boolean16 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = linkedListTestDriver0.get(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test049");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator6 = linkedListTestDriver5.iterator();
        linkedListTestDriver0.add(0, (java.lang.Object) iterator6);
        java.lang.Object obj9 = linkedListTestDriver0.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator11 = linkedListTestDriver0.listIterator(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test050");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator6 = linkedListTestDriver5.iterator();
        linkedListTestDriver0.add(0, (java.lang.Object) iterator6);
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) (byte) 0);
        experiment.util.Iterator iterator10 = linkedListTestDriver0.iterator();
        java.lang.Object obj11 = linkedListTestDriver0.removeFirst();
        boolean boolean12 = linkedListTestDriver0.isEmpty();
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
        java.lang.Object obj38 = linkedListTestDriver16.getLast();
        boolean boolean39 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver16);
        java.lang.Object obj40 = linkedListTestDriver16.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver41 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator42 = linkedListTestDriver41.iterator();
        boolean boolean44 = linkedListTestDriver41.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver46 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator47 = linkedListTestDriver46.iterator();
        linkedListTestDriver41.add(0, (java.lang.Object) iterator47);
        boolean boolean49 = linkedListTestDriver41.isEmpty();
        java.lang.Object obj50 = linkedListTestDriver41.removeLast();
        boolean boolean51 = linkedListTestDriver16.equals_CUT(obj50);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator53 = linkedListTestDriver16.listIterator((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 1; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
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
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (byte) 10 + "'", obj38, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (byte) 10 + "'", obj40, (byte) 10);
        org.junit.Assert.assertNotNull(iterator42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(iterator47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + false + "'", obj50, false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test051");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 1);
        boolean boolean7 = linkedListTestDriver0.add((java.lang.Object) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        boolean boolean10 = linkedListTestDriver8.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator12 = linkedListTestDriver11.iterator();
        boolean boolean14 = linkedListTestDriver11.contains((java.lang.Object) '#');
        boolean boolean16 = linkedListTestDriver11.add((java.lang.Object) (byte) 10);
        boolean boolean18 = linkedListTestDriver11.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean19 = linkedListTestDriver8.contains((java.lang.Object) linkedListTestDriver11);
        java.lang.Object obj20 = linkedListTestDriver11.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator22 = linkedListTestDriver21.iterator();
        boolean boolean24 = linkedListTestDriver21.contains((java.lang.Object) '#');
        boolean boolean26 = linkedListTestDriver21.add((java.lang.Object) (byte) 10);
        boolean boolean28 = linkedListTestDriver21.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj29 = linkedListTestDriver21.removeFirst();
        boolean boolean31 = linkedListTestDriver21.remove((java.lang.Object) (byte) 1);
        boolean boolean32 = linkedListTestDriver11.remove((java.lang.Object) linkedListTestDriver21);
        experiment.util.LinkedListTestDriver linkedListTestDriver33 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator34 = linkedListTestDriver33.iterator();
        experiment.util.Iterator iterator35 = linkedListTestDriver33.iterator();
        linkedListTestDriver21.addFirst((java.lang.Object) linkedListTestDriver33);
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver33);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj39 = linkedListTestDriver0.get(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) 10 + "'", obj20, (byte) 10);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (byte) 10 + "'", obj29, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertNotNull(iterator35);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test052");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = linkedListTestDriver0.remove((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test053");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = linkedListTestDriver0.toArray();
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = linkedListTestDriver0.equals_CUT(obj4);
        boolean boolean7 = linkedListTestDriver0.add((java.lang.Object) 0);
        java.lang.Object obj8 = linkedListTestDriver0.getFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = linkedListTestDriver0.get(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[hi!]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test054");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.contains((java.lang.Object) '#');
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (byte) 10);
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj8 = linkedListTestDriver0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = linkedListTestDriver0.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 10 + "'", obj8, (byte) 10);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test055");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.contains((java.lang.Object) '#');
        boolean boolean4 = linkedListTestDriver0.isEmpty();
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator7 = linkedListTestDriver0.listIterator((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 97; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test056");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = linkedListTestDriver0.remove((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test057");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator4 = linkedListTestDriver3.iterator();
        boolean boolean6 = linkedListTestDriver3.contains((java.lang.Object) '#');
        boolean boolean8 = linkedListTestDriver3.add((java.lang.Object) (byte) 10);
        boolean boolean10 = linkedListTestDriver3.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean11 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver3);
        java.lang.Object obj12 = linkedListTestDriver3.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator14 = linkedListTestDriver13.iterator();
        boolean boolean16 = linkedListTestDriver13.contains((java.lang.Object) '#');
        boolean boolean18 = linkedListTestDriver13.add((java.lang.Object) (byte) 10);
        boolean boolean20 = linkedListTestDriver13.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj21 = linkedListTestDriver13.removeFirst();
        boolean boolean23 = linkedListTestDriver13.remove((java.lang.Object) (byte) 1);
        boolean boolean24 = linkedListTestDriver3.remove((java.lang.Object) linkedListTestDriver13);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator26 = linkedListTestDriver25.iterator();
        experiment.util.Iterator iterator27 = linkedListTestDriver25.iterator();
        linkedListTestDriver13.addFirst((java.lang.Object) linkedListTestDriver25);
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator30 = linkedListTestDriver29.iterator();
        boolean boolean32 = linkedListTestDriver29.add((java.lang.Object) false);
        linkedListTestDriver29.addFirst((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver35 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator36 = linkedListTestDriver35.iterator();
        boolean boolean37 = linkedListTestDriver29.remove((java.lang.Object) linkedListTestDriver35);
        boolean boolean38 = linkedListTestDriver25.contains((java.lang.Object) linkedListTestDriver29);
        java.lang.Object obj39 = null;
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver29.addLast(obj39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 10 + "'", obj12, (byte) 10);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 10 + "'", obj21, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test058");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) (-1.0d));
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        linkedListTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (-1.0d) + "'", obj3, (-1.0d));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test059");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = linkedListTestDriver0.toArray();
        int int4 = linkedListTestDriver0.size();
        int int5 = linkedListTestDriver0.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[hi!]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test060");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.contains((java.lang.Object) '#');
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = linkedListTestDriver0.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test061");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 1);
        boolean boolean7 = linkedListTestDriver0.add((java.lang.Object) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        boolean boolean10 = linkedListTestDriver8.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator12 = linkedListTestDriver11.iterator();
        boolean boolean14 = linkedListTestDriver11.contains((java.lang.Object) '#');
        boolean boolean16 = linkedListTestDriver11.add((java.lang.Object) (byte) 10);
        boolean boolean18 = linkedListTestDriver11.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean19 = linkedListTestDriver8.contains((java.lang.Object) linkedListTestDriver11);
        java.lang.Object obj20 = linkedListTestDriver11.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator22 = linkedListTestDriver21.iterator();
        boolean boolean24 = linkedListTestDriver21.contains((java.lang.Object) '#');
        boolean boolean26 = linkedListTestDriver21.add((java.lang.Object) (byte) 10);
        boolean boolean28 = linkedListTestDriver21.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj29 = linkedListTestDriver21.removeFirst();
        boolean boolean31 = linkedListTestDriver21.remove((java.lang.Object) (byte) 1);
        boolean boolean32 = linkedListTestDriver11.remove((java.lang.Object) linkedListTestDriver21);
        experiment.util.LinkedListTestDriver linkedListTestDriver33 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator34 = linkedListTestDriver33.iterator();
        experiment.util.Iterator iterator35 = linkedListTestDriver33.iterator();
        linkedListTestDriver21.addFirst((java.lang.Object) linkedListTestDriver33);
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver33);
        linkedListTestDriver0.clear();
        int int39 = linkedListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj41 = linkedListTestDriver0.get((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) 10 + "'", obj20, (byte) 10);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (byte) 10 + "'", obj29, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test062");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator4 = linkedListTestDriver3.iterator();
        boolean boolean6 = linkedListTestDriver3.contains((java.lang.Object) '#');
        boolean boolean8 = linkedListTestDriver3.add((java.lang.Object) (byte) 10);
        boolean boolean10 = linkedListTestDriver3.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean11 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver3);
        java.lang.Object obj12 = linkedListTestDriver3.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator14 = linkedListTestDriver13.iterator();
        boolean boolean16 = linkedListTestDriver13.contains((java.lang.Object) '#');
        boolean boolean18 = linkedListTestDriver13.add((java.lang.Object) (byte) 10);
        boolean boolean20 = linkedListTestDriver13.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj21 = linkedListTestDriver13.removeFirst();
        boolean boolean23 = linkedListTestDriver13.remove((java.lang.Object) (byte) 1);
        boolean boolean24 = linkedListTestDriver3.remove((java.lang.Object) linkedListTestDriver13);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator26 = linkedListTestDriver25.iterator();
        experiment.util.Iterator iterator27 = linkedListTestDriver25.iterator();
        linkedListTestDriver13.addFirst((java.lang.Object) linkedListTestDriver25);
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator30 = linkedListTestDriver29.iterator();
        boolean boolean32 = linkedListTestDriver29.add((java.lang.Object) false);
        linkedListTestDriver29.addFirst((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver35 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator36 = linkedListTestDriver35.iterator();
        boolean boolean37 = linkedListTestDriver29.remove((java.lang.Object) linkedListTestDriver35);
        boolean boolean38 = linkedListTestDriver25.contains((java.lang.Object) linkedListTestDriver29);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj40 = linkedListTestDriver29.remove(2);
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
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 10 + "'", obj12, (byte) 10);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 10 + "'", obj21, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test063");
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
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver4.add((int) 'a', (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 97; size: 0");
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
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test064");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.contains((java.lang.Object) '#');
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (byte) 10);
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj8 = linkedListTestDriver0.removeFirst();
        boolean boolean10 = linkedListTestDriver0.remove((java.lang.Object) (byte) 1);
        boolean boolean11 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = linkedListTestDriver0.getLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 10 + "'", obj8, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test065");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.contains((java.lang.Object) '#');
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (byte) 10);
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj8 = linkedListTestDriver0.removeFirst();
        boolean boolean10 = linkedListTestDriver0.remove((java.lang.Object) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 10 + "'", obj8, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test066");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 1);
        boolean boolean7 = linkedListTestDriver0.add((java.lang.Object) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator10 = linkedListTestDriver9.iterator();
        boolean boolean12 = linkedListTestDriver9.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator15 = linkedListTestDriver14.iterator();
        linkedListTestDriver9.add(0, (java.lang.Object) iterator15);
        boolean boolean18 = linkedListTestDriver9.remove((java.lang.Object) (byte) 0);
        experiment.util.Iterator iterator19 = linkedListTestDriver9.iterator();
        java.lang.Object obj20 = linkedListTestDriver9.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) (short) 10, obj20);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test067");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        experiment.util.Iterator iterator2 = linkedListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = linkedListTestDriver0.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertNotNull(iterator2);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test068");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator4 = linkedListTestDriver3.iterator();
        boolean boolean6 = linkedListTestDriver3.contains((java.lang.Object) '#');
        boolean boolean8 = linkedListTestDriver3.add((java.lang.Object) (byte) 10);
        boolean boolean10 = linkedListTestDriver3.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean11 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver3);
        java.lang.Object obj12 = linkedListTestDriver3.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator14 = linkedListTestDriver13.iterator();
        boolean boolean16 = linkedListTestDriver13.contains((java.lang.Object) '#');
        boolean boolean18 = linkedListTestDriver13.add((java.lang.Object) (byte) 10);
        boolean boolean20 = linkedListTestDriver13.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj21 = linkedListTestDriver13.removeFirst();
        boolean boolean23 = linkedListTestDriver13.remove((java.lang.Object) (byte) 1);
        boolean boolean24 = linkedListTestDriver3.remove((java.lang.Object) linkedListTestDriver13);
        java.lang.Object obj26 = linkedListTestDriver3.get(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = linkedListTestDriver3.remove((int) (byte) 1);
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
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 10 + "'", obj12, (byte) 10);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 10 + "'", obj21, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) 10 + "'", obj26, (byte) 10);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test069");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator7 = linkedListTestDriver6.iterator();
        boolean boolean8 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = linkedListTestDriver6.remove(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test070");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = linkedListTestDriver0.remove((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test071");
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
            java.lang.Object obj19 = linkedListTestDriver9.get(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test072");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 1);
        boolean boolean7 = linkedListTestDriver0.add((java.lang.Object) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        boolean boolean10 = linkedListTestDriver8.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator12 = linkedListTestDriver11.iterator();
        boolean boolean14 = linkedListTestDriver11.contains((java.lang.Object) '#');
        boolean boolean16 = linkedListTestDriver11.add((java.lang.Object) (byte) 10);
        boolean boolean18 = linkedListTestDriver11.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean19 = linkedListTestDriver8.contains((java.lang.Object) linkedListTestDriver11);
        java.lang.Object obj20 = linkedListTestDriver11.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator22 = linkedListTestDriver21.iterator();
        boolean boolean24 = linkedListTestDriver21.contains((java.lang.Object) '#');
        boolean boolean26 = linkedListTestDriver21.add((java.lang.Object) (byte) 10);
        boolean boolean28 = linkedListTestDriver21.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj29 = linkedListTestDriver21.removeFirst();
        boolean boolean31 = linkedListTestDriver21.remove((java.lang.Object) (byte) 1);
        boolean boolean32 = linkedListTestDriver11.remove((java.lang.Object) linkedListTestDriver21);
        experiment.util.LinkedListTestDriver linkedListTestDriver33 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator34 = linkedListTestDriver33.iterator();
        experiment.util.Iterator iterator35 = linkedListTestDriver33.iterator();
        linkedListTestDriver21.addFirst((java.lang.Object) linkedListTestDriver33);
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver33);
        linkedListTestDriver0.clear();
        int int39 = linkedListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj40 = linkedListTestDriver0.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) 10 + "'", obj20, (byte) 10);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (byte) 10 + "'", obj29, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test073");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator4 = linkedListTestDriver3.iterator();
        boolean boolean6 = linkedListTestDriver3.contains((java.lang.Object) '#');
        boolean boolean8 = linkedListTestDriver3.add((java.lang.Object) (byte) 10);
        boolean boolean10 = linkedListTestDriver3.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean11 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver3);
        java.lang.Object obj12 = linkedListTestDriver3.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator14 = linkedListTestDriver13.iterator();
        boolean boolean16 = linkedListTestDriver13.contains((java.lang.Object) '#');
        boolean boolean18 = linkedListTestDriver13.add((java.lang.Object) (byte) 10);
        boolean boolean20 = linkedListTestDriver13.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj21 = linkedListTestDriver13.removeFirst();
        boolean boolean23 = linkedListTestDriver13.remove((java.lang.Object) (byte) 1);
        boolean boolean24 = linkedListTestDriver3.remove((java.lang.Object) linkedListTestDriver13);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator26 = linkedListTestDriver25.iterator();
        experiment.util.Iterator iterator27 = linkedListTestDriver25.iterator();
        linkedListTestDriver13.addFirst((java.lang.Object) linkedListTestDriver25);
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator30 = linkedListTestDriver29.iterator();
        boolean boolean32 = linkedListTestDriver29.add((java.lang.Object) false);
        linkedListTestDriver29.addFirst((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver35 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator36 = linkedListTestDriver35.iterator();
        boolean boolean37 = linkedListTestDriver29.remove((java.lang.Object) linkedListTestDriver35);
        boolean boolean38 = linkedListTestDriver25.contains((java.lang.Object) linkedListTestDriver29);
        experiment.util.LinkedListTestDriver linkedListTestDriver40 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator41 = linkedListTestDriver40.iterator();
        boolean boolean43 = linkedListTestDriver40.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver45 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator46 = linkedListTestDriver45.iterator();
        linkedListTestDriver40.add(0, (java.lang.Object) iterator46);
        java.lang.Object obj49 = linkedListTestDriver40.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj50 = linkedListTestDriver25.set(0, (java.lang.Object) 0);
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
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 10 + "'", obj12, (byte) 10);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 10 + "'", obj21, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(iterator41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(iterator46);
        org.junit.Assert.assertNotNull(obj49);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test074");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator6 = linkedListTestDriver5.iterator();
        linkedListTestDriver0.add(0, (java.lang.Object) iterator6);
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) (byte) 0);
        experiment.util.Iterator iterator10 = linkedListTestDriver0.iterator();
        java.lang.Object obj11 = linkedListTestDriver0.getLast();
        int int12 = linkedListTestDriver0.size();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + false + "'", obj11, false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test075");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.contains((java.lang.Object) '#');
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (byte) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator7 = linkedListTestDriver6.iterator();
        boolean boolean9 = linkedListTestDriver6.contains((java.lang.Object) '#');
        linkedListTestDriver0.addFirst((java.lang.Object) '#');
        java.lang.Object obj11 = linkedListTestDriver0.removeFirst();
        boolean boolean13 = linkedListTestDriver0.remove((java.lang.Object) 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = linkedListTestDriver0.get((int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test076");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator6 = linkedListTestDriver5.iterator();
        linkedListTestDriver0.add(0, (java.lang.Object) iterator6);
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj10 = linkedListTestDriver0.getFirst();
        java.lang.Object[] objArray11 = linkedListTestDriver0.toArray();
        boolean boolean12 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator17 = linkedListTestDriver16.iterator();
        boolean boolean19 = linkedListTestDriver16.contains((java.lang.Object) '#');
        boolean boolean21 = linkedListTestDriver16.add((java.lang.Object) (byte) 10);
        boolean boolean23 = linkedListTestDriver16.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean24 = linkedListTestDriver13.contains((java.lang.Object) linkedListTestDriver16);
        java.lang.Object obj25 = linkedListTestDriver16.getLast();
        int int26 = linkedListTestDriver16.size();
        boolean boolean27 = linkedListTestDriver16.isEmpty();
        boolean boolean28 = linkedListTestDriver0.equals_CUT((java.lang.Object) boolean27);
        boolean boolean30 = linkedListTestDriver0.add((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass31 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) 10 + "'", obj25, (byte) 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test077");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator6 = linkedListTestDriver5.iterator();
        linkedListTestDriver0.add(0, (java.lang.Object) iterator6);
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj10 = linkedListTestDriver0.getFirst();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test078");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = linkedListTestDriver0.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test079");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = linkedListTestDriver0.toArray();
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = linkedListTestDriver0.equals_CUT(obj4);
        boolean boolean7 = linkedListTestDriver0.add((java.lang.Object) 0);
        java.lang.Object obj8 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator13 = linkedListTestDriver12.iterator();
        boolean boolean15 = linkedListTestDriver12.contains((java.lang.Object) '#');
        boolean boolean17 = linkedListTestDriver12.add((java.lang.Object) (byte) 10);
        boolean boolean19 = linkedListTestDriver12.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean20 = linkedListTestDriver9.contains((java.lang.Object) linkedListTestDriver12);
        java.lang.Object obj21 = linkedListTestDriver12.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator23 = linkedListTestDriver22.iterator();
        boolean boolean25 = linkedListTestDriver22.contains((java.lang.Object) '#');
        boolean boolean27 = linkedListTestDriver22.add((java.lang.Object) (byte) 10);
        boolean boolean29 = linkedListTestDriver22.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj30 = linkedListTestDriver22.removeFirst();
        boolean boolean32 = linkedListTestDriver22.remove((java.lang.Object) (byte) 1);
        boolean boolean33 = linkedListTestDriver12.remove((java.lang.Object) linkedListTestDriver22);
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator35 = linkedListTestDriver34.iterator();
        experiment.util.Iterator iterator36 = linkedListTestDriver34.iterator();
        linkedListTestDriver22.addFirst((java.lang.Object) linkedListTestDriver34);
        boolean boolean38 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver34);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj39 = linkedListTestDriver34.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[hi!]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 10 + "'", obj21, (byte) 10);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (byte) 10 + "'", obj30, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test080");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.contains((java.lang.Object) '#');
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = linkedListTestDriver0.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test081");
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
        java.lang.Object obj24 = linkedListTestDriver0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = linkedListTestDriver0.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
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
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test082");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator6 = linkedListTestDriver5.iterator();
        linkedListTestDriver0.add(0, (java.lang.Object) iterator6);
        java.lang.Object obj9 = linkedListTestDriver0.remove(0);
        java.lang.Object obj10 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        boolean boolean14 = linkedListTestDriver12.add((java.lang.Object) "hi!");
        java.lang.Object[] objArray15 = linkedListTestDriver12.toArray();
        java.lang.Object obj16 = new java.lang.Object();
        boolean boolean17 = linkedListTestDriver12.equals_CUT(obj16);
        boolean boolean19 = linkedListTestDriver12.add((java.lang.Object) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator22 = linkedListTestDriver21.iterator();
        boolean boolean24 = linkedListTestDriver21.contains((java.lang.Object) '#');
        boolean boolean26 = linkedListTestDriver21.add((java.lang.Object) (byte) 10);
        boolean boolean28 = linkedListTestDriver21.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj29 = linkedListTestDriver21.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator31 = linkedListTestDriver30.iterator();
        boolean boolean33 = linkedListTestDriver30.add((java.lang.Object) false);
        linkedListTestDriver30.addFirst((java.lang.Object) (byte) 1);
        boolean boolean37 = linkedListTestDriver30.contains((java.lang.Object) 100.0d);
        boolean boolean38 = linkedListTestDriver21.contains((java.lang.Object) linkedListTestDriver30);
        java.lang.Object obj39 = linkedListTestDriver12.set(0, (java.lang.Object) linkedListTestDriver21);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add(10, (java.lang.Object) linkedListTestDriver21);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[hi!]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (byte) 10 + "'", obj29, (byte) 10);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + "hi!" + "'", obj39, "hi!");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test083");
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
        linkedListTestDriver0.add(0, (java.lang.Object) 2);
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        boolean boolean23 = linkedListTestDriver21.add((java.lang.Object) "hi!");
        java.lang.Object[] objArray24 = linkedListTestDriver21.toArray();
        linkedListTestDriver0.addLast((java.lang.Object) objArray24);
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 10 + "'", obj8, (byte) 10);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[hi!]");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test084");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        experiment.util.Iterator iterator2 = linkedListTestDriver0.iterator();
        experiment.util.ListIterator listIterator4 = linkedListTestDriver0.listIterator(0);
        linkedListTestDriver0.clear();
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator9 = linkedListTestDriver8.iterator();
        boolean boolean11 = linkedListTestDriver8.contains((java.lang.Object) '#');
        boolean boolean13 = linkedListTestDriver8.add((java.lang.Object) (byte) 10);
        boolean boolean15 = linkedListTestDriver8.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj16 = linkedListTestDriver8.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator18 = linkedListTestDriver17.iterator();
        boolean boolean20 = linkedListTestDriver17.add((java.lang.Object) false);
        linkedListTestDriver17.addFirst((java.lang.Object) (byte) 1);
        boolean boolean24 = linkedListTestDriver17.contains((java.lang.Object) 100.0d);
        boolean boolean25 = linkedListTestDriver8.contains((java.lang.Object) linkedListTestDriver17);
        experiment.util.Iterator iterator26 = linkedListTestDriver8.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = linkedListTestDriver0.set((-1), (java.lang.Object) iterator26);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(listIterator4);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) 10 + "'", obj16, (byte) 10);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(iterator26);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test085");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        boolean boolean5 = linkedListTestDriver3.contains((java.lang.Object) (-1.0f));
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver3);
        java.lang.Object obj7 = linkedListTestDriver0.removeLast();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test086");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        experiment.util.Iterator iterator2 = linkedListTestDriver0.iterator();
        experiment.util.ListIterator listIterator4 = linkedListTestDriver0.listIterator(0);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = linkedListTestDriver0.get((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(listIterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test087");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator4 = linkedListTestDriver3.iterator();
        boolean boolean6 = linkedListTestDriver3.contains((java.lang.Object) '#');
        boolean boolean8 = linkedListTestDriver3.add((java.lang.Object) (byte) 10);
        boolean boolean10 = linkedListTestDriver3.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean11 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver3);
        java.lang.Object obj12 = linkedListTestDriver3.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator14 = linkedListTestDriver13.iterator();
        boolean boolean16 = linkedListTestDriver13.contains((java.lang.Object) '#');
        boolean boolean18 = linkedListTestDriver13.add((java.lang.Object) (byte) 10);
        boolean boolean20 = linkedListTestDriver13.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj21 = linkedListTestDriver13.removeFirst();
        boolean boolean23 = linkedListTestDriver13.remove((java.lang.Object) (byte) 1);
        boolean boolean24 = linkedListTestDriver3.remove((java.lang.Object) linkedListTestDriver13);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator26 = linkedListTestDriver25.iterator();
        experiment.util.Iterator iterator27 = linkedListTestDriver25.iterator();
        linkedListTestDriver13.addFirst((java.lang.Object) linkedListTestDriver25);
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator30 = linkedListTestDriver29.iterator();
        boolean boolean32 = linkedListTestDriver29.contains((java.lang.Object) '#');
        boolean boolean33 = linkedListTestDriver29.isEmpty();
        boolean boolean35 = linkedListTestDriver29.equals_CUT((java.lang.Object) (short) 1);
        boolean boolean36 = linkedListTestDriver13.add((java.lang.Object) linkedListTestDriver29);
        linkedListTestDriver13.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 10 + "'", obj12, (byte) 10);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 10 + "'", obj21, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test088");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.contains((java.lang.Object) '#');
        boolean boolean4 = linkedListTestDriver0.isEmpty();
        boolean boolean6 = linkedListTestDriver0.equals_CUT((java.lang.Object) (short) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator8 = linkedListTestDriver7.iterator();
        boolean boolean10 = linkedListTestDriver7.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator13 = linkedListTestDriver12.iterator();
        linkedListTestDriver7.add(0, (java.lang.Object) iterator13);
        boolean boolean16 = linkedListTestDriver7.remove((java.lang.Object) (byte) 0);
        experiment.util.Iterator iterator17 = linkedListTestDriver7.iterator();
        java.lang.Object obj18 = linkedListTestDriver7.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver7.contains((java.lang.Object) linkedListTestDriver19);
        boolean boolean21 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver19);
        java.lang.Object[] objArray22 = linkedListTestDriver19.toArray();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test089");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        experiment.util.Iterator iterator2 = linkedListTestDriver0.iterator();
        experiment.util.ListIterator listIterator4 = linkedListTestDriver0.listIterator(0);
        int int5 = linkedListTestDriver0.size();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(listIterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test090");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator7 = linkedListTestDriver6.iterator();
        boolean boolean8 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver6);
        java.lang.Object obj9 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator11 = linkedListTestDriver10.iterator();
        boolean boolean13 = linkedListTestDriver10.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator16 = linkedListTestDriver15.iterator();
        linkedListTestDriver10.add(0, (java.lang.Object) iterator16);
        java.lang.Object obj18 = linkedListTestDriver10.removeFirst();
        java.lang.Object obj19 = linkedListTestDriver10.getLast();
        java.lang.Object[] objArray20 = linkedListTestDriver10.toArray();
        boolean boolean21 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver10);
        java.lang.Object obj22 = linkedListTestDriver0.removeFirst();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + false + "'", obj9, false);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + false + "'", obj19, false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[false]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) 1 + "'", obj22, (byte) 1);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test091");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator6 = linkedListTestDriver5.iterator();
        linkedListTestDriver0.add(0, (java.lang.Object) iterator6);
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj10 = linkedListTestDriver0.getLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = linkedListTestDriver0.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test092");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = linkedListTestDriver4.set((int) (byte) 0, (java.lang.Object) 4);
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
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test093");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.contains((java.lang.Object) '#');
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (byte) 10);
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj8 = linkedListTestDriver0.removeFirst();
        boolean boolean10 = linkedListTestDriver0.remove((java.lang.Object) (byte) 1);
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator13 = linkedListTestDriver12.iterator();
        boolean boolean15 = linkedListTestDriver12.contains((java.lang.Object) '#');
        boolean boolean17 = linkedListTestDriver12.add((java.lang.Object) (byte) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator19 = linkedListTestDriver18.iterator();
        boolean boolean21 = linkedListTestDriver18.contains((java.lang.Object) '#');
        linkedListTestDriver12.addFirst((java.lang.Object) '#');
        java.lang.Object obj23 = linkedListTestDriver12.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        boolean boolean26 = linkedListTestDriver24.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver27 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator28 = linkedListTestDriver27.iterator();
        boolean boolean30 = linkedListTestDriver27.contains((java.lang.Object) '#');
        boolean boolean32 = linkedListTestDriver27.add((java.lang.Object) (byte) 10);
        boolean boolean34 = linkedListTestDriver27.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean35 = linkedListTestDriver24.contains((java.lang.Object) linkedListTestDriver27);
        java.lang.Object obj36 = linkedListTestDriver27.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator38 = linkedListTestDriver37.iterator();
        boolean boolean40 = linkedListTestDriver37.contains((java.lang.Object) '#');
        boolean boolean42 = linkedListTestDriver37.add((java.lang.Object) (byte) 10);
        boolean boolean44 = linkedListTestDriver37.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj45 = linkedListTestDriver37.removeFirst();
        boolean boolean47 = linkedListTestDriver37.remove((java.lang.Object) (byte) 1);
        boolean boolean48 = linkedListTestDriver27.remove((java.lang.Object) linkedListTestDriver37);
        experiment.util.LinkedListTestDriver linkedListTestDriver49 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator50 = linkedListTestDriver49.iterator();
        boolean boolean52 = linkedListTestDriver49.contains((java.lang.Object) '#');
        boolean boolean54 = linkedListTestDriver49.add((java.lang.Object) (byte) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver55 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator56 = linkedListTestDriver55.iterator();
        boolean boolean58 = linkedListTestDriver55.contains((java.lang.Object) '#');
        linkedListTestDriver49.addFirst((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver60 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator61 = linkedListTestDriver60.iterator();
        boolean boolean63 = linkedListTestDriver60.contains((java.lang.Object) '#');
        boolean boolean65 = linkedListTestDriver60.add((java.lang.Object) (byte) 10);
        boolean boolean67 = linkedListTestDriver60.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj68 = linkedListTestDriver60.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver69 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator70 = linkedListTestDriver69.iterator();
        boolean boolean72 = linkedListTestDriver69.add((java.lang.Object) false);
        linkedListTestDriver69.addFirst((java.lang.Object) (byte) 1);
        boolean boolean76 = linkedListTestDriver69.contains((java.lang.Object) 100.0d);
        boolean boolean77 = linkedListTestDriver60.contains((java.lang.Object) linkedListTestDriver69);
        experiment.util.Iterator iterator78 = linkedListTestDriver60.iterator();
        boolean boolean79 = linkedListTestDriver49.equals_CUT((java.lang.Object) iterator78);
        linkedListTestDriver27.addLast((java.lang.Object) iterator78);
        linkedListTestDriver12.addFirst((java.lang.Object) linkedListTestDriver27);
        boolean boolean82 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver27);
        experiment.util.Iterator iterator83 = linkedListTestDriver27.iterator();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 10 + "'", obj8, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) 10 + "'", obj23, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (byte) 10 + "'", obj36, (byte) 10);
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (byte) 10 + "'", obj45, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(iterator50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(iterator56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(iterator61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + obj68 + "' != '" + (byte) 10 + "'", obj68, (byte) 10);
        org.junit.Assert.assertNotNull(iterator70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(iterator78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(iterator83);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test094");
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
        java.lang.Object[] objArray24 = linkedListTestDriver0.toArray();
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
        org.junit.Assert.assertNotNull(objArray24);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test095");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.contains((java.lang.Object) '#');
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (byte) 10);
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj8 = linkedListTestDriver0.removeFirst();
        boolean boolean10 = linkedListTestDriver0.remove((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator12 = linkedListTestDriver11.iterator();
        boolean boolean13 = linkedListTestDriver0.add((java.lang.Object) iterator12);
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 10 + "'", obj8, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test096");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator6 = linkedListTestDriver5.iterator();
        linkedListTestDriver0.add(0, (java.lang.Object) iterator6);
        java.lang.Object obj9 = linkedListTestDriver0.remove((int) (short) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator11 = linkedListTestDriver10.iterator();
        boolean boolean13 = linkedListTestDriver10.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator16 = linkedListTestDriver15.iterator();
        linkedListTestDriver10.add(0, (java.lang.Object) iterator16);
        boolean boolean19 = linkedListTestDriver10.remove((java.lang.Object) (byte) 0);
        experiment.util.Iterator iterator20 = linkedListTestDriver10.iterator();
        java.lang.Object obj21 = linkedListTestDriver10.removeFirst();
        boolean boolean22 = linkedListTestDriver10.isEmpty();
        boolean boolean23 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver10);
        experiment.util.Iterator iterator24 = linkedListTestDriver0.iterator();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + false + "'", obj9, false);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(iterator24);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test097");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = linkedListTestDriver0.toArray();
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = linkedListTestDriver0.equals_CUT(obj4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = linkedListTestDriver0.get((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[hi!]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test098");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator4 = linkedListTestDriver3.iterator();
        boolean boolean6 = linkedListTestDriver3.contains((java.lang.Object) '#');
        boolean boolean8 = linkedListTestDriver3.add((java.lang.Object) (byte) 10);
        boolean boolean10 = linkedListTestDriver3.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean11 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver3);
        boolean boolean13 = linkedListTestDriver0.contains((java.lang.Object) false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = linkedListTestDriver0.get((int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test099");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator4 = linkedListTestDriver3.iterator();
        boolean boolean6 = linkedListTestDriver3.contains((java.lang.Object) '#');
        boolean boolean8 = linkedListTestDriver3.add((java.lang.Object) (byte) 10);
        boolean boolean10 = linkedListTestDriver3.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean11 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver3);
        java.lang.Object obj12 = linkedListTestDriver3.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator14 = linkedListTestDriver13.iterator();
        boolean boolean16 = linkedListTestDriver13.contains((java.lang.Object) '#');
        boolean boolean18 = linkedListTestDriver13.add((java.lang.Object) (byte) 10);
        boolean boolean20 = linkedListTestDriver13.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj21 = linkedListTestDriver13.removeFirst();
        boolean boolean23 = linkedListTestDriver13.remove((java.lang.Object) (byte) 1);
        boolean boolean24 = linkedListTestDriver3.remove((java.lang.Object) linkedListTestDriver13);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator26 = linkedListTestDriver25.iterator();
        boolean boolean28 = linkedListTestDriver25.contains((java.lang.Object) '#');
        boolean boolean30 = linkedListTestDriver25.add((java.lang.Object) (byte) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator32 = linkedListTestDriver31.iterator();
        boolean boolean34 = linkedListTestDriver31.contains((java.lang.Object) '#');
        linkedListTestDriver25.addFirst((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver36 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator37 = linkedListTestDriver36.iterator();
        boolean boolean39 = linkedListTestDriver36.contains((java.lang.Object) '#');
        boolean boolean41 = linkedListTestDriver36.add((java.lang.Object) (byte) 10);
        boolean boolean43 = linkedListTestDriver36.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj44 = linkedListTestDriver36.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver45 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator46 = linkedListTestDriver45.iterator();
        boolean boolean48 = linkedListTestDriver45.add((java.lang.Object) false);
        linkedListTestDriver45.addFirst((java.lang.Object) (byte) 1);
        boolean boolean52 = linkedListTestDriver45.contains((java.lang.Object) 100.0d);
        boolean boolean53 = linkedListTestDriver36.contains((java.lang.Object) linkedListTestDriver45);
        experiment.util.Iterator iterator54 = linkedListTestDriver36.iterator();
        boolean boolean55 = linkedListTestDriver25.equals_CUT((java.lang.Object) iterator54);
        linkedListTestDriver3.addLast((java.lang.Object) iterator54);
        java.lang.Object obj57 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean58 = linkedListTestDriver3.add(obj57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 10 + "'", obj12, (byte) 10);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 10 + "'", obj21, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + (byte) 10 + "'", obj44, (byte) 10);
        org.junit.Assert.assertNotNull(iterator46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(iterator54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test100");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator6 = linkedListTestDriver5.iterator();
        linkedListTestDriver0.add(0, (java.lang.Object) iterator6);
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj10 = linkedListTestDriver0.getFirst();
        java.lang.Object[] objArray11 = linkedListTestDriver0.toArray();
        experiment.util.Iterator iterator12 = linkedListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = linkedListTestDriver0.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test101");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator6 = linkedListTestDriver5.iterator();
        linkedListTestDriver0.add(0, (java.lang.Object) iterator6);
        java.lang.Class<?> wildcardClass8 = iterator6.getClass();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test102");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator4 = linkedListTestDriver3.iterator();
        boolean boolean6 = linkedListTestDriver3.contains((java.lang.Object) '#');
        boolean boolean8 = linkedListTestDriver3.add((java.lang.Object) (byte) 10);
        boolean boolean10 = linkedListTestDriver3.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean11 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver3);
        boolean boolean12 = linkedListTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test103");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator6 = linkedListTestDriver5.iterator();
        linkedListTestDriver0.add(0, (java.lang.Object) iterator6);
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) (byte) 0);
        experiment.util.Iterator iterator10 = linkedListTestDriver0.iterator();
        java.lang.Object obj11 = linkedListTestDriver0.removeFirst();
        boolean boolean12 = linkedListTestDriver0.isEmpty();
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
        java.lang.Object obj38 = linkedListTestDriver16.getLast();
        boolean boolean39 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver16);
        java.lang.Object obj40 = linkedListTestDriver16.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj41 = linkedListTestDriver16.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
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
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (byte) 10 + "'", obj38, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (byte) 10 + "'", obj40, (byte) 10);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test104");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator4 = linkedListTestDriver3.iterator();
        boolean boolean6 = linkedListTestDriver3.contains((java.lang.Object) '#');
        boolean boolean8 = linkedListTestDriver3.add((java.lang.Object) (byte) 10);
        boolean boolean10 = linkedListTestDriver3.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean11 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver3);
        java.lang.Object obj12 = linkedListTestDriver3.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator14 = linkedListTestDriver13.iterator();
        boolean boolean16 = linkedListTestDriver13.contains((java.lang.Object) '#');
        boolean boolean18 = linkedListTestDriver13.add((java.lang.Object) (byte) 10);
        boolean boolean20 = linkedListTestDriver13.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj21 = linkedListTestDriver13.removeFirst();
        boolean boolean23 = linkedListTestDriver13.remove((java.lang.Object) (byte) 1);
        boolean boolean24 = linkedListTestDriver3.remove((java.lang.Object) linkedListTestDriver13);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator26 = linkedListTestDriver25.iterator();
        experiment.util.Iterator iterator27 = linkedListTestDriver25.iterator();
        linkedListTestDriver13.addFirst((java.lang.Object) linkedListTestDriver25);
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator30 = linkedListTestDriver29.iterator();
        boolean boolean32 = linkedListTestDriver29.contains((java.lang.Object) '#');
        boolean boolean33 = linkedListTestDriver29.isEmpty();
        boolean boolean35 = linkedListTestDriver29.equals_CUT((java.lang.Object) (short) 1);
        boolean boolean36 = linkedListTestDriver13.add((java.lang.Object) linkedListTestDriver29);
        experiment.util.Iterator iterator37 = linkedListTestDriver13.iterator();
        java.lang.Object obj38 = linkedListTestDriver13.getLast();
        java.lang.Object obj40 = linkedListTestDriver13.remove((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 10 + "'", obj12, (byte) 10);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 10 + "'", obj21, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(obj40);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test105");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = linkedListTestDriver0.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test106");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        experiment.util.Iterator iterator2 = linkedListTestDriver0.iterator();
        experiment.util.ListIterator listIterator4 = linkedListTestDriver0.listIterator(0);
        linkedListTestDriver0.clear();
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        boolean boolean7 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(listIterator4);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test107");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator7 = linkedListTestDriver6.iterator();
        boolean boolean8 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver6);
        java.lang.Object obj9 = linkedListTestDriver0.getLast();
        int int10 = linkedListTestDriver0.size();
        java.lang.Object obj11 = linkedListTestDriver0.getFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = linkedListTestDriver0.get(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + false + "'", obj9, false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test108");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator6 = linkedListTestDriver5.iterator();
        linkedListTestDriver0.add(0, (java.lang.Object) iterator6);
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) (byte) 0);
        experiment.util.Iterator iterator10 = linkedListTestDriver0.iterator();
        java.lang.Object obj11 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver12);
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        boolean boolean16 = linkedListTestDriver14.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator18 = linkedListTestDriver17.iterator();
        boolean boolean20 = linkedListTestDriver17.contains((java.lang.Object) '#');
        boolean boolean22 = linkedListTestDriver17.add((java.lang.Object) (byte) 10);
        boolean boolean24 = linkedListTestDriver17.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean25 = linkedListTestDriver14.contains((java.lang.Object) linkedListTestDriver17);
        java.lang.Object obj26 = linkedListTestDriver17.getLast();
        int int27 = linkedListTestDriver17.size();
        boolean boolean28 = linkedListTestDriver17.isEmpty();
        boolean boolean29 = linkedListTestDriver12.contains((java.lang.Object) boolean28);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator31 = linkedListTestDriver12.listIterator((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) 10 + "'", obj26, (byte) 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test109");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator6 = linkedListTestDriver5.iterator();
        linkedListTestDriver0.add(0, (java.lang.Object) iterator6);
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj10 = linkedListTestDriver0.getFirst();
        java.lang.Object[] objArray11 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        boolean boolean14 = linkedListTestDriver12.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator16 = linkedListTestDriver15.iterator();
        boolean boolean18 = linkedListTestDriver15.contains((java.lang.Object) '#');
        boolean boolean20 = linkedListTestDriver15.add((java.lang.Object) (byte) 10);
        boolean boolean22 = linkedListTestDriver15.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean23 = linkedListTestDriver12.contains((java.lang.Object) linkedListTestDriver15);
        java.lang.Object obj24 = linkedListTestDriver15.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator26 = linkedListTestDriver25.iterator();
        boolean boolean28 = linkedListTestDriver25.contains((java.lang.Object) '#');
        boolean boolean30 = linkedListTestDriver25.add((java.lang.Object) (byte) 10);
        boolean boolean32 = linkedListTestDriver25.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj33 = linkedListTestDriver25.removeFirst();
        boolean boolean35 = linkedListTestDriver25.remove((java.lang.Object) (byte) 1);
        boolean boolean36 = linkedListTestDriver15.remove((java.lang.Object) linkedListTestDriver25);
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator38 = linkedListTestDriver37.iterator();
        experiment.util.Iterator iterator39 = linkedListTestDriver37.iterator();
        linkedListTestDriver25.addFirst((java.lang.Object) linkedListTestDriver37);
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver37);
        java.lang.Object obj42 = null;
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.addLast(obj42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) 10 + "'", obj24, (byte) 10);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (byte) 10 + "'", obj33, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertNotNull(iterator39);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test110");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator6 = linkedListTestDriver5.iterator();
        linkedListTestDriver0.add(0, (java.lang.Object) iterator6);
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) (byte) 0);
        experiment.util.Iterator iterator10 = linkedListTestDriver0.iterator();
        java.lang.Object obj11 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver12);
        int int14 = linkedListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = linkedListTestDriver0.get((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test111");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator6 = linkedListTestDriver5.iterator();
        linkedListTestDriver0.add(0, (java.lang.Object) iterator6);
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) (byte) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator11 = linkedListTestDriver10.iterator();
        boolean boolean13 = linkedListTestDriver10.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator16 = linkedListTestDriver15.iterator();
        linkedListTestDriver10.add(0, (java.lang.Object) iterator16);
        boolean boolean18 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = linkedListTestDriver0.remove((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test112");
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
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator19 = linkedListTestDriver18.iterator();
        boolean boolean21 = linkedListTestDriver18.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator24 = linkedListTestDriver23.iterator();
        linkedListTestDriver18.add(0, (java.lang.Object) iterator24);
        boolean boolean27 = linkedListTestDriver18.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj28 = linkedListTestDriver18.getFirst();
        boolean boolean29 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver18);
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator31 = linkedListTestDriver30.iterator();
        boolean boolean32 = linkedListTestDriver30.isEmpty();
        boolean boolean33 = linkedListTestDriver18.equals_CUT((java.lang.Object) linkedListTestDriver30);
        linkedListTestDriver30.clear();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 10 + "'", obj8, (byte) 10);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test113");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.contains((java.lang.Object) '#');
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (byte) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator7 = linkedListTestDriver6.iterator();
        boolean boolean9 = linkedListTestDriver6.contains((java.lang.Object) '#');
        linkedListTestDriver0.addFirst((java.lang.Object) '#');
        java.lang.Object obj11 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator13 = linkedListTestDriver12.iterator();
        boolean boolean15 = linkedListTestDriver12.add((java.lang.Object) false);
        linkedListTestDriver12.addFirst((java.lang.Object) (byte) 1);
        java.lang.Object[] objArray18 = linkedListTestDriver12.toArray();
        boolean boolean19 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver12);
        java.lang.Class<?> wildcardClass20 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '#' + "'", obj11, '#');
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[1, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[1, false]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test114");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.contains((java.lang.Object) '#');
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (byte) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator7 = linkedListTestDriver6.iterator();
        boolean boolean9 = linkedListTestDriver6.contains((java.lang.Object) '#');
        linkedListTestDriver0.addFirst((java.lang.Object) '#');
        java.lang.Object obj11 = linkedListTestDriver0.getLast();
        experiment.util.Iterator iterator12 = linkedListTestDriver0.iterator();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test115");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator4 = linkedListTestDriver3.iterator();
        boolean boolean6 = linkedListTestDriver3.contains((java.lang.Object) '#');
        boolean boolean8 = linkedListTestDriver3.add((java.lang.Object) (byte) 10);
        boolean boolean10 = linkedListTestDriver3.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean11 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver3);
        java.lang.Object obj12 = linkedListTestDriver3.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator14 = linkedListTestDriver13.iterator();
        boolean boolean16 = linkedListTestDriver13.contains((java.lang.Object) '#');
        boolean boolean18 = linkedListTestDriver13.add((java.lang.Object) (byte) 10);
        boolean boolean20 = linkedListTestDriver13.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj21 = linkedListTestDriver13.removeFirst();
        boolean boolean23 = linkedListTestDriver13.remove((java.lang.Object) (byte) 1);
        boolean boolean24 = linkedListTestDriver3.remove((java.lang.Object) linkedListTestDriver13);
        java.lang.Object obj26 = linkedListTestDriver3.get(0);
        java.lang.Object obj27 = linkedListTestDriver3.removeFirst();
        java.lang.Class<?> wildcardClass28 = linkedListTestDriver3.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 10 + "'", obj12, (byte) 10);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 10 + "'", obj21, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) 10 + "'", obj26, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (byte) 10 + "'", obj27, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test116");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator7 = linkedListTestDriver6.iterator();
        boolean boolean8 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver6);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator11 = linkedListTestDriver10.iterator();
        boolean boolean13 = linkedListTestDriver10.contains((java.lang.Object) '#');
        boolean boolean15 = linkedListTestDriver10.add((java.lang.Object) (byte) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator17 = linkedListTestDriver16.iterator();
        boolean boolean19 = linkedListTestDriver16.contains((java.lang.Object) '#');
        linkedListTestDriver10.addFirst((java.lang.Object) '#');
        linkedListTestDriver0.add((int) (short) 1, (java.lang.Object) '#');
        java.lang.Object obj22 = linkedListTestDriver0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = linkedListTestDriver0.set((int) (byte) 100, (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + false + "'", obj22, false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test117");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        boolean boolean5 = linkedListTestDriver3.contains((java.lang.Object) (-1.0f));
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver3);
        experiment.util.ListIterator listIterator8 = linkedListTestDriver0.listIterator((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(listIterator8);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test118");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        boolean boolean5 = linkedListTestDriver3.contains((java.lang.Object) (-1.0f));
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver3);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator10 = linkedListTestDriver9.iterator();
        boolean boolean12 = linkedListTestDriver9.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator15 = linkedListTestDriver14.iterator();
        linkedListTestDriver9.add(0, (java.lang.Object) iterator15);
        java.lang.Object obj17 = linkedListTestDriver9.removeLast();
        java.lang.Object obj18 = linkedListTestDriver0.set(0, (java.lang.Object) linkedListTestDriver9);
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator20 = linkedListTestDriver19.iterator();
        boolean boolean22 = linkedListTestDriver19.add((java.lang.Object) false);
        linkedListTestDriver19.addFirst((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator26 = linkedListTestDriver25.iterator();
        boolean boolean27 = linkedListTestDriver19.remove((java.lang.Object) linkedListTestDriver25);
        java.lang.Object obj28 = linkedListTestDriver19.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator30 = linkedListTestDriver29.iterator();
        boolean boolean32 = linkedListTestDriver29.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator35 = linkedListTestDriver34.iterator();
        linkedListTestDriver29.add(0, (java.lang.Object) iterator35);
        java.lang.Object obj37 = linkedListTestDriver29.removeFirst();
        java.lang.Object obj38 = linkedListTestDriver29.getLast();
        java.lang.Object[] objArray39 = linkedListTestDriver29.toArray();
        boolean boolean40 = linkedListTestDriver19.equals_CUT((java.lang.Object) linkedListTestDriver29);
        boolean boolean41 = linkedListTestDriver0.contains((java.lang.Object) boolean40);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + false + "'", obj17, false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + false + "'", obj28, false);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + false + "'", obj38, false);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[false]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test119");
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
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator19 = linkedListTestDriver18.iterator();
        boolean boolean21 = linkedListTestDriver18.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator24 = linkedListTestDriver23.iterator();
        linkedListTestDriver18.add(0, (java.lang.Object) iterator24);
        boolean boolean27 = linkedListTestDriver18.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj28 = linkedListTestDriver18.getFirst();
        boolean boolean29 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver18);
        java.lang.Object[] objArray30 = linkedListTestDriver0.toArray();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 10 + "'", obj8, (byte) 10);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test120");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator7 = linkedListTestDriver6.iterator();
        boolean boolean8 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver6);
        java.lang.Object obj9 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator11 = linkedListTestDriver10.iterator();
        boolean boolean13 = linkedListTestDriver10.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator16 = linkedListTestDriver15.iterator();
        linkedListTestDriver10.add(0, (java.lang.Object) iterator16);
        java.lang.Object obj18 = linkedListTestDriver10.removeFirst();
        java.lang.Object obj19 = linkedListTestDriver10.getLast();
        java.lang.Object[] objArray20 = linkedListTestDriver10.toArray();
        boolean boolean21 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver10);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        boolean boolean24 = linkedListTestDriver22.add((java.lang.Object) (-1.0d));
        boolean boolean26 = linkedListTestDriver22.contains((java.lang.Object) 1.0f);
        boolean boolean27 = linkedListTestDriver10.add((java.lang.Object) boolean26);
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + false + "'", obj9, false);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + false + "'", obj19, false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[false]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test121");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 1);
        java.lang.Object[] objArray6 = linkedListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = linkedListTestDriver0.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, false]");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test122");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean2 = linkedListTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass3 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test123");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 1);
        java.lang.Object[] objArray6 = linkedListTestDriver0.toArray();
        java.lang.Object obj7 = linkedListTestDriver0.getFirst();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, false]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 1 + "'", obj7, (byte) 1);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test124");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator4 = linkedListTestDriver3.iterator();
        boolean boolean6 = linkedListTestDriver3.contains((java.lang.Object) '#');
        boolean boolean8 = linkedListTestDriver3.add((java.lang.Object) (byte) 10);
        boolean boolean10 = linkedListTestDriver3.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean11 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver3);
        java.lang.Object obj12 = linkedListTestDriver3.getLast();
        java.lang.Object obj13 = linkedListTestDriver3.getLast();
        java.lang.Object obj14 = linkedListTestDriver3.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator16 = linkedListTestDriver15.iterator();
        boolean boolean18 = linkedListTestDriver15.contains((java.lang.Object) '#');
        boolean boolean20 = linkedListTestDriver15.add((java.lang.Object) (byte) 10);
        boolean boolean22 = linkedListTestDriver15.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj23 = linkedListTestDriver15.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator25 = linkedListTestDriver24.iterator();
        boolean boolean27 = linkedListTestDriver24.add((java.lang.Object) false);
        linkedListTestDriver24.addFirst((java.lang.Object) (byte) 1);
        boolean boolean31 = linkedListTestDriver24.contains((java.lang.Object) 100.0d);
        boolean boolean32 = linkedListTestDriver15.contains((java.lang.Object) linkedListTestDriver24);
        experiment.util.Iterator iterator33 = linkedListTestDriver15.iterator();
        boolean boolean34 = linkedListTestDriver3.add((java.lang.Object) iterator33);
        boolean boolean35 = linkedListTestDriver3.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 10 + "'", obj12, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 10 + "'", obj13, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) 10 + "'", obj14, (byte) 10);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) 10 + "'", obj23, (byte) 10);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test125");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = linkedListTestDriver0.toArray();
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = linkedListTestDriver0.equals_CUT(obj4);
        boolean boolean7 = linkedListTestDriver0.add((java.lang.Object) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator10 = linkedListTestDriver9.iterator();
        boolean boolean12 = linkedListTestDriver9.contains((java.lang.Object) '#');
        boolean boolean14 = linkedListTestDriver9.add((java.lang.Object) (byte) 10);
        boolean boolean16 = linkedListTestDriver9.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj17 = linkedListTestDriver9.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator19 = linkedListTestDriver18.iterator();
        boolean boolean21 = linkedListTestDriver18.add((java.lang.Object) false);
        linkedListTestDriver18.addFirst((java.lang.Object) (byte) 1);
        boolean boolean25 = linkedListTestDriver18.contains((java.lang.Object) 100.0d);
        boolean boolean26 = linkedListTestDriver9.contains((java.lang.Object) linkedListTestDriver18);
        java.lang.Object obj27 = linkedListTestDriver0.set(0, (java.lang.Object) linkedListTestDriver9);
        java.lang.Object obj28 = linkedListTestDriver0.removeLast();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[hi!]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 10 + "'", obj17, (byte) 10);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "hi!" + "'", obj27, "hi!");
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 0 + "'", obj28, 0);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test126");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = linkedListTestDriver0.toArray();
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = linkedListTestDriver0.equals_CUT(obj4);
        boolean boolean7 = linkedListTestDriver0.add((java.lang.Object) 0);
        java.lang.Object obj8 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator13 = linkedListTestDriver12.iterator();
        boolean boolean15 = linkedListTestDriver12.contains((java.lang.Object) '#');
        boolean boolean17 = linkedListTestDriver12.add((java.lang.Object) (byte) 10);
        boolean boolean19 = linkedListTestDriver12.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean20 = linkedListTestDriver9.contains((java.lang.Object) linkedListTestDriver12);
        java.lang.Object obj21 = linkedListTestDriver12.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator23 = linkedListTestDriver22.iterator();
        boolean boolean25 = linkedListTestDriver22.contains((java.lang.Object) '#');
        boolean boolean27 = linkedListTestDriver22.add((java.lang.Object) (byte) 10);
        boolean boolean29 = linkedListTestDriver22.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj30 = linkedListTestDriver22.removeFirst();
        boolean boolean32 = linkedListTestDriver22.remove((java.lang.Object) (byte) 1);
        boolean boolean33 = linkedListTestDriver12.remove((java.lang.Object) linkedListTestDriver22);
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator35 = linkedListTestDriver34.iterator();
        experiment.util.Iterator iterator36 = linkedListTestDriver34.iterator();
        linkedListTestDriver22.addFirst((java.lang.Object) linkedListTestDriver34);
        boolean boolean38 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver34);
        experiment.util.Iterator iterator39 = linkedListTestDriver0.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[hi!]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 10 + "'", obj21, (byte) 10);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (byte) 10 + "'", obj30, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(iterator39);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test127");
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
        experiment.util.Iterator iterator18 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        boolean boolean21 = linkedListTestDriver19.equals_CUT((java.lang.Object) 0.0f);
        boolean boolean22 = linkedListTestDriver0.contains((java.lang.Object) boolean21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = linkedListTestDriver0.removeLast();
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
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test128");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator7 = linkedListTestDriver6.iterator();
        boolean boolean8 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver6);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator11 = linkedListTestDriver10.iterator();
        boolean boolean13 = linkedListTestDriver10.contains((java.lang.Object) '#');
        boolean boolean15 = linkedListTestDriver10.add((java.lang.Object) (byte) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator17 = linkedListTestDriver16.iterator();
        boolean boolean19 = linkedListTestDriver16.contains((java.lang.Object) '#');
        linkedListTestDriver10.addFirst((java.lang.Object) '#');
        linkedListTestDriver0.add((int) (short) 1, (java.lang.Object) '#');
        java.lang.Object obj22 = linkedListTestDriver0.removeLast();
        experiment.util.Iterator iterator23 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator26 = linkedListTestDriver25.iterator();
        boolean boolean28 = linkedListTestDriver25.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator31 = linkedListTestDriver30.iterator();
        linkedListTestDriver25.add(0, (java.lang.Object) iterator31);
        boolean boolean34 = linkedListTestDriver25.remove((java.lang.Object) (byte) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver35 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator36 = linkedListTestDriver35.iterator();
        boolean boolean38 = linkedListTestDriver35.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver40 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator41 = linkedListTestDriver40.iterator();
        linkedListTestDriver35.add(0, (java.lang.Object) iterator41);
        boolean boolean43 = linkedListTestDriver25.contains((java.lang.Object) linkedListTestDriver35);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj44 = linkedListTestDriver0.set(2, (java.lang.Object) linkedListTestDriver25);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + false + "'", obj22, false);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(iterator41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test129");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator6 = linkedListTestDriver5.iterator();
        linkedListTestDriver0.add(0, (java.lang.Object) iterator6);
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) (byte) 0);
        experiment.util.Iterator iterator10 = linkedListTestDriver0.iterator();
        java.lang.Object obj11 = linkedListTestDriver0.removeFirst();
        java.lang.Object obj12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = linkedListTestDriver0.contains(obj12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test130");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator6 = linkedListTestDriver5.iterator();
        linkedListTestDriver0.add(0, (java.lang.Object) iterator6);
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj10 = linkedListTestDriver0.getFirst();
        experiment.util.Iterator iterator11 = linkedListTestDriver0.iterator();
        java.lang.Object obj12 = linkedListTestDriver0.removeFirst();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test131");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean2 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test132");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.contains((java.lang.Object) '#');
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (byte) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator7 = linkedListTestDriver6.iterator();
        boolean boolean9 = linkedListTestDriver6.contains((java.lang.Object) '#');
        linkedListTestDriver0.addFirst((java.lang.Object) '#');
        java.lang.Object obj11 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator13 = linkedListTestDriver12.iterator();
        boolean boolean15 = linkedListTestDriver12.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator18 = linkedListTestDriver17.iterator();
        linkedListTestDriver12.add(0, (java.lang.Object) iterator18);
        boolean boolean20 = linkedListTestDriver12.isEmpty();
        java.lang.Object obj21 = linkedListTestDriver12.removeLast();
        java.lang.Object obj22 = linkedListTestDriver12.getFirst();
        boolean boolean23 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver12);
        boolean boolean25 = linkedListTestDriver12.contains((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray26 = linkedListTestDriver12.toArray();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '#' + "'", obj11, '#');
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + false + "'", obj21, false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objArray26);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test133");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        experiment.util.Iterator iterator2 = linkedListTestDriver0.iterator();
        experiment.util.ListIterator listIterator4 = linkedListTestDriver0.listIterator(0);
        linkedListTestDriver0.clear();
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        boolean boolean7 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = linkedListTestDriver0.remove((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(listIterator4);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test134");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = linkedListTestDriver0.toArray();
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = linkedListTestDriver0.equals_CUT(obj4);
        boolean boolean7 = linkedListTestDriver0.add((java.lang.Object) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator10 = linkedListTestDriver9.iterator();
        boolean boolean12 = linkedListTestDriver9.contains((java.lang.Object) '#');
        boolean boolean14 = linkedListTestDriver9.add((java.lang.Object) (byte) 10);
        boolean boolean16 = linkedListTestDriver9.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj17 = linkedListTestDriver9.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator19 = linkedListTestDriver18.iterator();
        boolean boolean21 = linkedListTestDriver18.add((java.lang.Object) false);
        linkedListTestDriver18.addFirst((java.lang.Object) (byte) 1);
        boolean boolean25 = linkedListTestDriver18.contains((java.lang.Object) 100.0d);
        boolean boolean26 = linkedListTestDriver9.contains((java.lang.Object) linkedListTestDriver18);
        java.lang.Object obj27 = linkedListTestDriver0.set(0, (java.lang.Object) linkedListTestDriver9);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator29 = linkedListTestDriver0.listIterator((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[hi!]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 10 + "'", obj17, (byte) 10);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "hi!" + "'", obj27, "hi!");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test135");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        boolean boolean5 = linkedListTestDriver3.contains((java.lang.Object) (-1.0f));
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver3);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator10 = linkedListTestDriver9.iterator();
        boolean boolean12 = linkedListTestDriver9.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator15 = linkedListTestDriver14.iterator();
        linkedListTestDriver9.add(0, (java.lang.Object) iterator15);
        java.lang.Object obj17 = linkedListTestDriver9.removeLast();
        java.lang.Object obj18 = linkedListTestDriver0.set(0, (java.lang.Object) linkedListTestDriver9);
        boolean boolean19 = linkedListTestDriver0.isEmpty();
        java.lang.Object obj20 = linkedListTestDriver0.getLast();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + false + "'", obj17, false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test136");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator6 = linkedListTestDriver5.iterator();
        linkedListTestDriver0.add(0, (java.lang.Object) iterator6);
        boolean boolean8 = linkedListTestDriver0.isEmpty();
        java.lang.Object obj9 = linkedListTestDriver0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator11 = linkedListTestDriver0.listIterator((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 100; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + false + "'", obj9, false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test137");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator6 = linkedListTestDriver5.iterator();
        linkedListTestDriver0.add(0, (java.lang.Object) iterator6);
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj10 = linkedListTestDriver0.getFirst();
        java.lang.Object[] objArray11 = linkedListTestDriver0.toArray();
        boolean boolean12 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator17 = linkedListTestDriver16.iterator();
        boolean boolean19 = linkedListTestDriver16.contains((java.lang.Object) '#');
        boolean boolean21 = linkedListTestDriver16.add((java.lang.Object) (byte) 10);
        boolean boolean23 = linkedListTestDriver16.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean24 = linkedListTestDriver13.contains((java.lang.Object) linkedListTestDriver16);
        java.lang.Object obj25 = linkedListTestDriver16.getLast();
        int int26 = linkedListTestDriver16.size();
        boolean boolean27 = linkedListTestDriver16.isEmpty();
        boolean boolean28 = linkedListTestDriver0.equals_CUT((java.lang.Object) boolean27);
        boolean boolean30 = linkedListTestDriver0.add((java.lang.Object) 0.0f);
        boolean boolean31 = linkedListTestDriver0.isEmpty();
        java.lang.Object[] objArray32 = linkedListTestDriver0.toArray();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) 10 + "'", obj25, (byte) 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objArray32);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test138");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator6 = linkedListTestDriver5.iterator();
        linkedListTestDriver0.add(0, (java.lang.Object) iterator6);
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj10 = linkedListTestDriver0.getFirst();
        java.lang.Object[] objArray11 = linkedListTestDriver0.toArray();
        experiment.util.Iterator iterator12 = linkedListTestDriver0.iterator();
        experiment.util.Iterator iterator13 = linkedListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = linkedListTestDriver0.get((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(iterator13);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test139");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.contains((java.lang.Object) '#');
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (byte) 10);
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj8 = linkedListTestDriver0.removeFirst();
        boolean boolean10 = linkedListTestDriver0.remove((java.lang.Object) (byte) 1);
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator13 = linkedListTestDriver12.iterator();
        boolean boolean15 = linkedListTestDriver12.contains((java.lang.Object) '#');
        boolean boolean17 = linkedListTestDriver12.add((java.lang.Object) (byte) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator19 = linkedListTestDriver18.iterator();
        boolean boolean21 = linkedListTestDriver18.contains((java.lang.Object) '#');
        linkedListTestDriver12.addFirst((java.lang.Object) '#');
        java.lang.Object obj23 = linkedListTestDriver12.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        boolean boolean26 = linkedListTestDriver24.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver27 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator28 = linkedListTestDriver27.iterator();
        boolean boolean30 = linkedListTestDriver27.contains((java.lang.Object) '#');
        boolean boolean32 = linkedListTestDriver27.add((java.lang.Object) (byte) 10);
        boolean boolean34 = linkedListTestDriver27.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean35 = linkedListTestDriver24.contains((java.lang.Object) linkedListTestDriver27);
        java.lang.Object obj36 = linkedListTestDriver27.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator38 = linkedListTestDriver37.iterator();
        boolean boolean40 = linkedListTestDriver37.contains((java.lang.Object) '#');
        boolean boolean42 = linkedListTestDriver37.add((java.lang.Object) (byte) 10);
        boolean boolean44 = linkedListTestDriver37.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj45 = linkedListTestDriver37.removeFirst();
        boolean boolean47 = linkedListTestDriver37.remove((java.lang.Object) (byte) 1);
        boolean boolean48 = linkedListTestDriver27.remove((java.lang.Object) linkedListTestDriver37);
        experiment.util.LinkedListTestDriver linkedListTestDriver49 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator50 = linkedListTestDriver49.iterator();
        boolean boolean52 = linkedListTestDriver49.contains((java.lang.Object) '#');
        boolean boolean54 = linkedListTestDriver49.add((java.lang.Object) (byte) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver55 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator56 = linkedListTestDriver55.iterator();
        boolean boolean58 = linkedListTestDriver55.contains((java.lang.Object) '#');
        linkedListTestDriver49.addFirst((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver60 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator61 = linkedListTestDriver60.iterator();
        boolean boolean63 = linkedListTestDriver60.contains((java.lang.Object) '#');
        boolean boolean65 = linkedListTestDriver60.add((java.lang.Object) (byte) 10);
        boolean boolean67 = linkedListTestDriver60.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj68 = linkedListTestDriver60.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver69 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator70 = linkedListTestDriver69.iterator();
        boolean boolean72 = linkedListTestDriver69.add((java.lang.Object) false);
        linkedListTestDriver69.addFirst((java.lang.Object) (byte) 1);
        boolean boolean76 = linkedListTestDriver69.contains((java.lang.Object) 100.0d);
        boolean boolean77 = linkedListTestDriver60.contains((java.lang.Object) linkedListTestDriver69);
        experiment.util.Iterator iterator78 = linkedListTestDriver60.iterator();
        boolean boolean79 = linkedListTestDriver49.equals_CUT((java.lang.Object) iterator78);
        linkedListTestDriver27.addLast((java.lang.Object) iterator78);
        linkedListTestDriver12.addFirst((java.lang.Object) linkedListTestDriver27);
        boolean boolean82 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver27);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj83 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 10 + "'", obj8, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) 10 + "'", obj23, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (byte) 10 + "'", obj36, (byte) 10);
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (byte) 10 + "'", obj45, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(iterator50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(iterator56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(iterator61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + obj68 + "' != '" + (byte) 10 + "'", obj68, (byte) 10);
        org.junit.Assert.assertNotNull(iterator70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(iterator78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test140");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator6 = linkedListTestDriver5.iterator();
        linkedListTestDriver0.add(0, (java.lang.Object) iterator6);
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) (byte) 0);
        experiment.util.Iterator iterator10 = linkedListTestDriver0.iterator();
        java.lang.Object obj11 = linkedListTestDriver0.getLast();
        java.lang.Object obj13 = linkedListTestDriver0.get(1);
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + false + "'", obj11, false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + false + "'", obj13, false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test141");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = linkedListTestDriver0.toArray();
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = linkedListTestDriver0.equals_CUT(obj4);
        boolean boolean7 = linkedListTestDriver0.add((java.lang.Object) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator10 = linkedListTestDriver9.iterator();
        boolean boolean12 = linkedListTestDriver9.contains((java.lang.Object) '#');
        boolean boolean14 = linkedListTestDriver9.add((java.lang.Object) (byte) 10);
        boolean boolean16 = linkedListTestDriver9.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj17 = linkedListTestDriver9.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator19 = linkedListTestDriver18.iterator();
        boolean boolean21 = linkedListTestDriver18.add((java.lang.Object) false);
        linkedListTestDriver18.addFirst((java.lang.Object) (byte) 1);
        boolean boolean25 = linkedListTestDriver18.contains((java.lang.Object) 100.0d);
        boolean boolean26 = linkedListTestDriver9.contains((java.lang.Object) linkedListTestDriver18);
        java.lang.Object obj27 = linkedListTestDriver0.set(0, (java.lang.Object) linkedListTestDriver9);
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        boolean boolean30 = linkedListTestDriver28.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator32 = linkedListTestDriver31.iterator();
        boolean boolean34 = linkedListTestDriver31.contains((java.lang.Object) '#');
        boolean boolean36 = linkedListTestDriver31.add((java.lang.Object) (byte) 10);
        boolean boolean38 = linkedListTestDriver31.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean39 = linkedListTestDriver28.contains((java.lang.Object) linkedListTestDriver31);
        java.lang.Object obj40 = linkedListTestDriver31.getLast();
        java.lang.Object obj41 = linkedListTestDriver31.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver42 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator43 = linkedListTestDriver42.iterator();
        linkedListTestDriver31.addLast((java.lang.Object) iterator43);
        boolean boolean45 = linkedListTestDriver9.contains((java.lang.Object) iterator43);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj46 = linkedListTestDriver9.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[hi!]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 10 + "'", obj17, (byte) 10);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "hi!" + "'", obj27, "hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (byte) 10 + "'", obj40, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + (byte) 10 + "'", obj41, (byte) 10);
        org.junit.Assert.assertNotNull(iterator43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test142");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean2 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator4 = linkedListTestDriver3.iterator();
        boolean boolean6 = linkedListTestDriver3.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator9 = linkedListTestDriver8.iterator();
        linkedListTestDriver3.add(0, (java.lang.Object) iterator9);
        boolean boolean11 = linkedListTestDriver3.isEmpty();
        java.lang.Object obj12 = linkedListTestDriver3.removeLast();
        boolean boolean14 = linkedListTestDriver3.equals_CUT((java.lang.Object) (-1.0d));
        boolean boolean15 = linkedListTestDriver0.equals_CUT((java.lang.Object) boolean14);
        experiment.util.Iterator iterator16 = linkedListTestDriver0.iterator();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + false + "'", obj12, false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator16);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test143");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator6 = linkedListTestDriver5.iterator();
        linkedListTestDriver0.add(0, (java.lang.Object) iterator6);
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj10 = linkedListTestDriver0.getFirst();
        java.lang.Object[] objArray11 = linkedListTestDriver0.toArray();
        boolean boolean12 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator17 = linkedListTestDriver16.iterator();
        boolean boolean19 = linkedListTestDriver16.contains((java.lang.Object) '#');
        boolean boolean21 = linkedListTestDriver16.add((java.lang.Object) (byte) 10);
        boolean boolean23 = linkedListTestDriver16.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean24 = linkedListTestDriver13.contains((java.lang.Object) linkedListTestDriver16);
        java.lang.Object obj25 = linkedListTestDriver16.getLast();
        int int26 = linkedListTestDriver16.size();
        boolean boolean27 = linkedListTestDriver16.isEmpty();
        boolean boolean28 = linkedListTestDriver0.equals_CUT((java.lang.Object) boolean27);
        boolean boolean30 = linkedListTestDriver0.add((java.lang.Object) 0.0f);
        java.lang.Object obj31 = linkedListTestDriver0.removeLast();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) 10 + "'", obj25, (byte) 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 0.0f + "'", obj31, 0.0f);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test144");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator6 = linkedListTestDriver5.iterator();
        linkedListTestDriver0.add(0, (java.lang.Object) iterator6);
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj10 = linkedListTestDriver0.getFirst();
        experiment.util.Iterator iterator11 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray12 = linkedListTestDriver0.toArray();
        java.lang.Object[] objArray13 = linkedListTestDriver0.toArray();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test145");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = linkedListTestDriver0.toArray();
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = linkedListTestDriver0.equals_CUT(obj4);
        boolean boolean7 = linkedListTestDriver0.add((java.lang.Object) 0);
        java.lang.Object obj8 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator13 = linkedListTestDriver12.iterator();
        boolean boolean15 = linkedListTestDriver12.contains((java.lang.Object) '#');
        boolean boolean17 = linkedListTestDriver12.add((java.lang.Object) (byte) 10);
        boolean boolean19 = linkedListTestDriver12.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean20 = linkedListTestDriver9.contains((java.lang.Object) linkedListTestDriver12);
        java.lang.Object obj21 = linkedListTestDriver12.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator23 = linkedListTestDriver22.iterator();
        boolean boolean25 = linkedListTestDriver22.contains((java.lang.Object) '#');
        boolean boolean27 = linkedListTestDriver22.add((java.lang.Object) (byte) 10);
        boolean boolean29 = linkedListTestDriver22.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj30 = linkedListTestDriver22.removeFirst();
        boolean boolean32 = linkedListTestDriver22.remove((java.lang.Object) (byte) 1);
        boolean boolean33 = linkedListTestDriver12.remove((java.lang.Object) linkedListTestDriver22);
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator35 = linkedListTestDriver34.iterator();
        experiment.util.Iterator iterator36 = linkedListTestDriver34.iterator();
        linkedListTestDriver22.addFirst((java.lang.Object) linkedListTestDriver34);
        boolean boolean38 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver34);
        experiment.util.LinkedListTestDriver linkedListTestDriver39 = new experiment.util.LinkedListTestDriver();
        boolean boolean41 = linkedListTestDriver39.add((java.lang.Object) "hi!");
        java.lang.Object[] objArray42 = linkedListTestDriver39.toArray();
        java.lang.Object obj43 = new java.lang.Object();
        boolean boolean44 = linkedListTestDriver39.equals_CUT(obj43);
        boolean boolean46 = linkedListTestDriver39.add((java.lang.Object) 0);
        java.lang.Object obj47 = linkedListTestDriver39.getFirst();
        java.lang.Object obj48 = linkedListTestDriver39.removeFirst();
        boolean boolean49 = linkedListTestDriver34.add((java.lang.Object) linkedListTestDriver39);
        experiment.util.LinkedListTestDriver linkedListTestDriver50 = new experiment.util.LinkedListTestDriver();
        boolean boolean52 = linkedListTestDriver50.add((java.lang.Object) "hi!");
        java.lang.Object[] objArray53 = linkedListTestDriver50.toArray();
        java.lang.Object obj54 = new java.lang.Object();
        boolean boolean55 = linkedListTestDriver50.equals_CUT(obj54);
        boolean boolean56 = linkedListTestDriver34.contains(obj54);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[hi!]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 10 + "'", obj21, (byte) 10);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (byte) 10 + "'", obj30, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[hi!]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + "hi!" + "'", obj47, "hi!");
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + "hi!" + "'", obj48, "hi!");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[hi!]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test146");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.contains((java.lang.Object) '#');
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (byte) 10);
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj8 = linkedListTestDriver0.removeFirst();
        boolean boolean10 = linkedListTestDriver0.remove((java.lang.Object) (byte) 1);
        boolean boolean11 = linkedListTestDriver0.isEmpty();
        boolean boolean12 = linkedListTestDriver0.isEmpty();
        java.lang.Object[] objArray13 = linkedListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = linkedListTestDriver0.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 10 + "'", obj8, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test147");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        boolean boolean5 = linkedListTestDriver3.contains((java.lang.Object) (-1.0f));
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver3);
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator8 = linkedListTestDriver7.iterator();
        boolean boolean10 = linkedListTestDriver7.add((java.lang.Object) false);
        linkedListTestDriver7.addFirst((java.lang.Object) (byte) 1);
        boolean boolean14 = linkedListTestDriver7.contains((java.lang.Object) 100.0d);
        boolean boolean15 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver7);
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        boolean boolean18 = linkedListTestDriver16.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        boolean boolean21 = linkedListTestDriver19.contains((java.lang.Object) (-1.0f));
        linkedListTestDriver16.addFirst((java.lang.Object) linkedListTestDriver19);
        experiment.util.Iterator iterator23 = linkedListTestDriver16.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator26 = linkedListTestDriver25.iterator();
        boolean boolean28 = linkedListTestDriver25.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator31 = linkedListTestDriver30.iterator();
        linkedListTestDriver25.add(0, (java.lang.Object) iterator31);
        java.lang.Object obj33 = linkedListTestDriver25.removeLast();
        java.lang.Object obj34 = linkedListTestDriver16.set(0, (java.lang.Object) linkedListTestDriver25);
        boolean boolean35 = linkedListTestDriver7.add((java.lang.Object) linkedListTestDriver16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + false + "'", obj33, false);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test148");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = linkedListTestDriver0.toArray();
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = linkedListTestDriver0.equals_CUT(obj4);
        boolean boolean7 = linkedListTestDriver0.add((java.lang.Object) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator10 = linkedListTestDriver9.iterator();
        boolean boolean12 = linkedListTestDriver9.contains((java.lang.Object) '#');
        boolean boolean14 = linkedListTestDriver9.add((java.lang.Object) (byte) 10);
        boolean boolean16 = linkedListTestDriver9.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj17 = linkedListTestDriver9.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator19 = linkedListTestDriver18.iterator();
        boolean boolean21 = linkedListTestDriver18.add((java.lang.Object) false);
        linkedListTestDriver18.addFirst((java.lang.Object) (byte) 1);
        boolean boolean25 = linkedListTestDriver18.contains((java.lang.Object) 100.0d);
        boolean boolean26 = linkedListTestDriver9.contains((java.lang.Object) linkedListTestDriver18);
        java.lang.Object obj27 = linkedListTestDriver0.set(0, (java.lang.Object) linkedListTestDriver9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = linkedListTestDriver9.get((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[hi!]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 10 + "'", obj17, (byte) 10);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "hi!" + "'", obj27, "hi!");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test149");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator6 = linkedListTestDriver5.iterator();
        linkedListTestDriver0.add(0, (java.lang.Object) iterator6);
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj10 = linkedListTestDriver0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = linkedListTestDriver0.remove((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test150");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Class<?> wildcardClass1 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test151");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator4 = linkedListTestDriver3.iterator();
        boolean boolean6 = linkedListTestDriver3.contains((java.lang.Object) '#');
        boolean boolean8 = linkedListTestDriver3.add((java.lang.Object) (byte) 10);
        boolean boolean10 = linkedListTestDriver3.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean11 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver3);
        java.lang.Object obj12 = linkedListTestDriver3.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator14 = linkedListTestDriver13.iterator();
        boolean boolean16 = linkedListTestDriver13.contains((java.lang.Object) '#');
        boolean boolean18 = linkedListTestDriver13.add((java.lang.Object) (byte) 10);
        boolean boolean20 = linkedListTestDriver13.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj21 = linkedListTestDriver13.removeFirst();
        boolean boolean23 = linkedListTestDriver13.remove((java.lang.Object) (byte) 1);
        boolean boolean24 = linkedListTestDriver3.remove((java.lang.Object) linkedListTestDriver13);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator26 = linkedListTestDriver25.iterator();
        experiment.util.Iterator iterator27 = linkedListTestDriver25.iterator();
        linkedListTestDriver13.addFirst((java.lang.Object) linkedListTestDriver25);
        java.lang.Object obj29 = linkedListTestDriver13.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator31 = linkedListTestDriver30.iterator();
        boolean boolean33 = linkedListTestDriver30.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver35 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator36 = linkedListTestDriver35.iterator();
        linkedListTestDriver30.add(0, (java.lang.Object) iterator36);
        boolean boolean39 = linkedListTestDriver30.remove((java.lang.Object) (byte) 0);
        experiment.util.Iterator iterator40 = linkedListTestDriver30.iterator();
        java.lang.Object obj41 = linkedListTestDriver30.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver42 = new experiment.util.LinkedListTestDriver();
        boolean boolean43 = linkedListTestDriver30.contains((java.lang.Object) linkedListTestDriver42);
        int int44 = linkedListTestDriver30.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver45 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator46 = linkedListTestDriver45.iterator();
        boolean boolean48 = linkedListTestDriver45.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver50 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator51 = linkedListTestDriver50.iterator();
        linkedListTestDriver45.add(0, (java.lang.Object) iterator51);
        java.lang.Object obj54 = linkedListTestDriver45.remove(0);
        linkedListTestDriver30.addLast((java.lang.Object) linkedListTestDriver45);
        boolean boolean56 = linkedListTestDriver13.add((java.lang.Object) linkedListTestDriver30);
        java.lang.Object obj57 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean58 = linkedListTestDriver30.remove(obj57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 10 + "'", obj12, (byte) 10);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 10 + "'", obj21, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(iterator40);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(iterator46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(iterator51);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test152");
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
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test153");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        experiment.util.Iterator iterator2 = linkedListTestDriver0.iterator();
        experiment.util.ListIterator listIterator4 = linkedListTestDriver0.listIterator(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = linkedListTestDriver0.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(listIterator4);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test154");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.contains((java.lang.Object) '#');
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (byte) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator7 = linkedListTestDriver6.iterator();
        boolean boolean9 = linkedListTestDriver6.contains((java.lang.Object) '#');
        linkedListTestDriver0.addFirst((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator12 = linkedListTestDriver11.iterator();
        boolean boolean14 = linkedListTestDriver11.contains((java.lang.Object) '#');
        boolean boolean16 = linkedListTestDriver11.add((java.lang.Object) (byte) 10);
        boolean boolean18 = linkedListTestDriver11.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj19 = linkedListTestDriver11.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator21 = linkedListTestDriver20.iterator();
        boolean boolean23 = linkedListTestDriver20.add((java.lang.Object) false);
        linkedListTestDriver20.addFirst((java.lang.Object) (byte) 1);
        boolean boolean27 = linkedListTestDriver20.contains((java.lang.Object) 100.0d);
        boolean boolean28 = linkedListTestDriver11.contains((java.lang.Object) linkedListTestDriver20);
        experiment.util.Iterator iterator29 = linkedListTestDriver11.iterator();
        boolean boolean30 = linkedListTestDriver0.equals_CUT((java.lang.Object) iterator29);
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        boolean boolean33 = linkedListTestDriver31.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator35 = linkedListTestDriver34.iterator();
        boolean boolean37 = linkedListTestDriver34.contains((java.lang.Object) '#');
        boolean boolean39 = linkedListTestDriver34.add((java.lang.Object) (byte) 10);
        boolean boolean41 = linkedListTestDriver34.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean42 = linkedListTestDriver31.contains((java.lang.Object) linkedListTestDriver34);
        java.lang.Object obj43 = linkedListTestDriver34.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver44 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator45 = linkedListTestDriver44.iterator();
        boolean boolean47 = linkedListTestDriver44.contains((java.lang.Object) '#');
        boolean boolean49 = linkedListTestDriver44.add((java.lang.Object) (byte) 10);
        boolean boolean51 = linkedListTestDriver44.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj52 = linkedListTestDriver44.removeFirst();
        boolean boolean54 = linkedListTestDriver44.remove((java.lang.Object) (byte) 1);
        boolean boolean55 = linkedListTestDriver34.remove((java.lang.Object) linkedListTestDriver44);
        experiment.util.LinkedListTestDriver linkedListTestDriver56 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator57 = linkedListTestDriver56.iterator();
        experiment.util.Iterator iterator58 = linkedListTestDriver56.iterator();
        linkedListTestDriver44.addFirst((java.lang.Object) linkedListTestDriver56);
        java.lang.Object obj60 = linkedListTestDriver44.getLast();
        boolean boolean61 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver44);
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 10 + "'", obj19, (byte) 10);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (byte) 10 + "'", obj43, (byte) 10);
        org.junit.Assert.assertNotNull(iterator45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + (byte) 10 + "'", obj52, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(iterator57);
        org.junit.Assert.assertNotNull(iterator58);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test155");
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
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        boolean boolean26 = linkedListTestDriver24.equals_CUT((java.lang.Object) 0.0f);
        boolean boolean27 = linkedListTestDriver4.add((java.lang.Object) linkedListTestDriver24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = linkedListTestDriver24.remove((int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test156");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) (-1.0d));
        boolean boolean4 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.add((java.lang.Object) "hi!");
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.add((java.lang.Object) "hi!");
        java.lang.Object[] objArray12 = linkedListTestDriver9.toArray();
        java.lang.Object obj13 = new java.lang.Object();
        boolean boolean14 = linkedListTestDriver9.equals_CUT(obj13);
        linkedListTestDriver6.addLast(obj13);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) (byte) 10, (java.lang.Object) linkedListTestDriver6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[hi!]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test157");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) (-1.0d));
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        java.lang.Object[] objArray4 = linkedListTestDriver0.toArray();
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        java.lang.Class<?> wildcardClass7 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (-1.0d) + "'", obj3, (-1.0d));
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1.0]");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test158");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.contains((java.lang.Object) '#');
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (byte) 10);
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = linkedListTestDriver0.remove(obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test159");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = linkedListTestDriver0.toArray();
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = linkedListTestDriver0.equals_CUT(obj4);
        boolean boolean7 = linkedListTestDriver0.add((java.lang.Object) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator10 = linkedListTestDriver9.iterator();
        boolean boolean12 = linkedListTestDriver9.contains((java.lang.Object) '#');
        boolean boolean14 = linkedListTestDriver9.add((java.lang.Object) (byte) 10);
        boolean boolean16 = linkedListTestDriver9.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj17 = linkedListTestDriver9.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator19 = linkedListTestDriver18.iterator();
        boolean boolean21 = linkedListTestDriver18.add((java.lang.Object) false);
        linkedListTestDriver18.addFirst((java.lang.Object) (byte) 1);
        boolean boolean25 = linkedListTestDriver18.contains((java.lang.Object) 100.0d);
        boolean boolean26 = linkedListTestDriver9.contains((java.lang.Object) linkedListTestDriver18);
        java.lang.Object obj27 = linkedListTestDriver0.set(0, (java.lang.Object) linkedListTestDriver9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = linkedListTestDriver9.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[hi!]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 10 + "'", obj17, (byte) 10);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "hi!" + "'", obj27, "hi!");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test160");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.contains((java.lang.Object) '#');
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (byte) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator7 = linkedListTestDriver6.iterator();
        boolean boolean9 = linkedListTestDriver6.contains((java.lang.Object) '#');
        linkedListTestDriver0.addFirst((java.lang.Object) '#');
        java.lang.Object obj11 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        boolean boolean14 = linkedListTestDriver12.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator16 = linkedListTestDriver15.iterator();
        boolean boolean18 = linkedListTestDriver15.contains((java.lang.Object) '#');
        boolean boolean20 = linkedListTestDriver15.add((java.lang.Object) (byte) 10);
        boolean boolean22 = linkedListTestDriver15.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean23 = linkedListTestDriver12.contains((java.lang.Object) linkedListTestDriver15);
        java.lang.Object obj24 = linkedListTestDriver15.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator26 = linkedListTestDriver25.iterator();
        boolean boolean28 = linkedListTestDriver25.contains((java.lang.Object) '#');
        boolean boolean30 = linkedListTestDriver25.add((java.lang.Object) (byte) 10);
        boolean boolean32 = linkedListTestDriver25.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj33 = linkedListTestDriver25.removeFirst();
        boolean boolean35 = linkedListTestDriver25.remove((java.lang.Object) (byte) 1);
        boolean boolean36 = linkedListTestDriver15.remove((java.lang.Object) linkedListTestDriver25);
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator38 = linkedListTestDriver37.iterator();
        boolean boolean40 = linkedListTestDriver37.contains((java.lang.Object) '#');
        boolean boolean42 = linkedListTestDriver37.add((java.lang.Object) (byte) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver43 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator44 = linkedListTestDriver43.iterator();
        boolean boolean46 = linkedListTestDriver43.contains((java.lang.Object) '#');
        linkedListTestDriver37.addFirst((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver48 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator49 = linkedListTestDriver48.iterator();
        boolean boolean51 = linkedListTestDriver48.contains((java.lang.Object) '#');
        boolean boolean53 = linkedListTestDriver48.add((java.lang.Object) (byte) 10);
        boolean boolean55 = linkedListTestDriver48.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj56 = linkedListTestDriver48.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver57 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator58 = linkedListTestDriver57.iterator();
        boolean boolean60 = linkedListTestDriver57.add((java.lang.Object) false);
        linkedListTestDriver57.addFirst((java.lang.Object) (byte) 1);
        boolean boolean64 = linkedListTestDriver57.contains((java.lang.Object) 100.0d);
        boolean boolean65 = linkedListTestDriver48.contains((java.lang.Object) linkedListTestDriver57);
        experiment.util.Iterator iterator66 = linkedListTestDriver48.iterator();
        boolean boolean67 = linkedListTestDriver37.equals_CUT((java.lang.Object) iterator66);
        linkedListTestDriver15.addLast((java.lang.Object) iterator66);
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj71 = linkedListTestDriver15.get((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) 10 + "'", obj24, (byte) 10);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (byte) 10 + "'", obj33, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(iterator44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(iterator49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + (byte) 10 + "'", obj56, (byte) 10);
        org.junit.Assert.assertNotNull(iterator58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(iterator66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test161");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator4 = linkedListTestDriver3.iterator();
        boolean boolean6 = linkedListTestDriver3.contains((java.lang.Object) '#');
        boolean boolean8 = linkedListTestDriver3.add((java.lang.Object) (byte) 10);
        boolean boolean10 = linkedListTestDriver3.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean11 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver3);
        boolean boolean13 = linkedListTestDriver0.contains((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        boolean boolean16 = linkedListTestDriver14.add((java.lang.Object) "hi!");
        java.lang.Object[] objArray17 = linkedListTestDriver14.toArray();
        java.lang.Object obj18 = new java.lang.Object();
        boolean boolean19 = linkedListTestDriver14.equals_CUT(obj18);
        boolean boolean21 = linkedListTestDriver14.add((java.lang.Object) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator24 = linkedListTestDriver23.iterator();
        boolean boolean26 = linkedListTestDriver23.contains((java.lang.Object) '#');
        boolean boolean28 = linkedListTestDriver23.add((java.lang.Object) (byte) 10);
        boolean boolean30 = linkedListTestDriver23.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj31 = linkedListTestDriver23.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator33 = linkedListTestDriver32.iterator();
        boolean boolean35 = linkedListTestDriver32.add((java.lang.Object) false);
        linkedListTestDriver32.addFirst((java.lang.Object) (byte) 1);
        boolean boolean39 = linkedListTestDriver32.contains((java.lang.Object) 100.0d);
        boolean boolean40 = linkedListTestDriver23.contains((java.lang.Object) linkedListTestDriver32);
        java.lang.Object obj41 = linkedListTestDriver14.set(0, (java.lang.Object) linkedListTestDriver23);
        boolean boolean42 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[hi!]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (byte) 10 + "'", obj31, (byte) 10);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + "hi!" + "'", obj41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test162");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.contains((java.lang.Object) '#');
        boolean boolean4 = linkedListTestDriver0.isEmpty();
        linkedListTestDriver0.clear();
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = linkedListTestDriver0.get((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test163");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = linkedListTestDriver0.toArray();
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = linkedListTestDriver0.equals_CUT(obj4);
        boolean boolean7 = linkedListTestDriver0.add((java.lang.Object) 0);
        java.lang.Object obj8 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator13 = linkedListTestDriver12.iterator();
        boolean boolean15 = linkedListTestDriver12.contains((java.lang.Object) '#');
        boolean boolean17 = linkedListTestDriver12.add((java.lang.Object) (byte) 10);
        boolean boolean19 = linkedListTestDriver12.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean20 = linkedListTestDriver9.contains((java.lang.Object) linkedListTestDriver12);
        java.lang.Object obj21 = linkedListTestDriver12.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator23 = linkedListTestDriver22.iterator();
        boolean boolean25 = linkedListTestDriver22.contains((java.lang.Object) '#');
        boolean boolean27 = linkedListTestDriver22.add((java.lang.Object) (byte) 10);
        boolean boolean29 = linkedListTestDriver22.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj30 = linkedListTestDriver22.removeFirst();
        boolean boolean32 = linkedListTestDriver22.remove((java.lang.Object) (byte) 1);
        boolean boolean33 = linkedListTestDriver12.remove((java.lang.Object) linkedListTestDriver22);
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator35 = linkedListTestDriver34.iterator();
        experiment.util.Iterator iterator36 = linkedListTestDriver34.iterator();
        linkedListTestDriver22.addFirst((java.lang.Object) linkedListTestDriver34);
        boolean boolean38 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver34);
        experiment.util.LinkedListTestDriver linkedListTestDriver39 = new experiment.util.LinkedListTestDriver();
        boolean boolean41 = linkedListTestDriver39.add((java.lang.Object) "hi!");
        java.lang.Object[] objArray42 = linkedListTestDriver39.toArray();
        java.lang.Object obj43 = new java.lang.Object();
        boolean boolean44 = linkedListTestDriver39.equals_CUT(obj43);
        boolean boolean46 = linkedListTestDriver39.add((java.lang.Object) 0);
        java.lang.Object obj47 = linkedListTestDriver39.getFirst();
        java.lang.Object obj48 = linkedListTestDriver39.removeFirst();
        boolean boolean49 = linkedListTestDriver34.add((java.lang.Object) linkedListTestDriver39);
        experiment.util.LinkedListTestDriver linkedListTestDriver51 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator52 = linkedListTestDriver51.iterator();
        boolean boolean54 = linkedListTestDriver51.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver56 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator57 = linkedListTestDriver56.iterator();
        linkedListTestDriver51.add(0, (java.lang.Object) iterator57);
        java.lang.Object obj59 = linkedListTestDriver51.removeLast();
        java.lang.Object obj60 = linkedListTestDriver51.getLast();
        boolean boolean62 = linkedListTestDriver51.add((java.lang.Object) "");
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver39.add((int) (short) 100, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 100; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[hi!]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 10 + "'", obj21, (byte) 10);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (byte) 10 + "'", obj30, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[hi!]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + "hi!" + "'", obj47, "hi!");
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + "hi!" + "'", obj48, "hi!");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(iterator52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(iterator57);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + false + "'", obj59, false);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test164");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) (-1.0d));
        boolean boolean4 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = linkedListTestDriver0.set((int) '4', obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test165");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator7 = linkedListTestDriver6.iterator();
        boolean boolean8 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver6);
        java.lang.Object obj9 = linkedListTestDriver0.getLast();
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = linkedListTestDriver0.getLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + false + "'", obj9, false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test166");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (-1.0f));
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
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test167");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.contains((java.lang.Object) '#');
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (byte) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator7 = linkedListTestDriver6.iterator();
        boolean boolean9 = linkedListTestDriver6.contains((java.lang.Object) '#');
        linkedListTestDriver0.addFirst((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator12 = linkedListTestDriver11.iterator();
        boolean boolean14 = linkedListTestDriver11.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator17 = linkedListTestDriver16.iterator();
        linkedListTestDriver11.add(0, (java.lang.Object) iterator17);
        boolean boolean19 = linkedListTestDriver11.isEmpty();
        boolean boolean20 = linkedListTestDriver11.isEmpty();
        java.lang.Object obj21 = linkedListTestDriver11.getFirst();
        boolean boolean22 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver11);
        java.lang.Class<?> wildcardClass23 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test168");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator6 = linkedListTestDriver5.iterator();
        linkedListTestDriver0.add(0, (java.lang.Object) iterator6);
        boolean boolean8 = linkedListTestDriver0.isEmpty();
        boolean boolean9 = linkedListTestDriver0.isEmpty();
        java.lang.Object obj10 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver11.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator15 = linkedListTestDriver14.iterator();
        boolean boolean17 = linkedListTestDriver14.contains((java.lang.Object) '#');
        boolean boolean19 = linkedListTestDriver14.add((java.lang.Object) (byte) 10);
        boolean boolean21 = linkedListTestDriver14.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean22 = linkedListTestDriver11.contains((java.lang.Object) linkedListTestDriver14);
        java.lang.Object obj23 = linkedListTestDriver14.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator25 = linkedListTestDriver24.iterator();
        boolean boolean27 = linkedListTestDriver24.contains((java.lang.Object) '#');
        boolean boolean29 = linkedListTestDriver24.add((java.lang.Object) (byte) 10);
        boolean boolean31 = linkedListTestDriver24.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj32 = linkedListTestDriver24.removeFirst();
        boolean boolean34 = linkedListTestDriver24.remove((java.lang.Object) (byte) 1);
        boolean boolean35 = linkedListTestDriver14.remove((java.lang.Object) linkedListTestDriver24);
        experiment.util.LinkedListTestDriver linkedListTestDriver36 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator37 = linkedListTestDriver36.iterator();
        boolean boolean39 = linkedListTestDriver36.contains((java.lang.Object) '#');
        boolean boolean41 = linkedListTestDriver36.add((java.lang.Object) (byte) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver42 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator43 = linkedListTestDriver42.iterator();
        boolean boolean45 = linkedListTestDriver42.contains((java.lang.Object) '#');
        linkedListTestDriver36.addFirst((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver47 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator48 = linkedListTestDriver47.iterator();
        boolean boolean50 = linkedListTestDriver47.contains((java.lang.Object) '#');
        boolean boolean52 = linkedListTestDriver47.add((java.lang.Object) (byte) 10);
        boolean boolean54 = linkedListTestDriver47.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj55 = linkedListTestDriver47.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver56 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator57 = linkedListTestDriver56.iterator();
        boolean boolean59 = linkedListTestDriver56.add((java.lang.Object) false);
        linkedListTestDriver56.addFirst((java.lang.Object) (byte) 1);
        boolean boolean63 = linkedListTestDriver56.contains((java.lang.Object) 100.0d);
        boolean boolean64 = linkedListTestDriver47.contains((java.lang.Object) linkedListTestDriver56);
        experiment.util.Iterator iterator65 = linkedListTestDriver47.iterator();
        boolean boolean66 = linkedListTestDriver36.equals_CUT((java.lang.Object) iterator65);
        linkedListTestDriver14.addLast((java.lang.Object) iterator65);
        linkedListTestDriver0.addFirst((java.lang.Object) iterator65);
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) 10 + "'", obj23, (byte) 10);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (byte) 10 + "'", obj32, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(iterator43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(iterator48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + (byte) 10 + "'", obj55, (byte) 10);
        org.junit.Assert.assertNotNull(iterator57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(iterator65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test169");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.contains((java.lang.Object) '#');
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (byte) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator7 = linkedListTestDriver6.iterator();
        boolean boolean9 = linkedListTestDriver6.contains((java.lang.Object) '#');
        linkedListTestDriver0.addFirst((java.lang.Object) '#');
        java.lang.Object obj11 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        boolean boolean14 = linkedListTestDriver12.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator16 = linkedListTestDriver15.iterator();
        boolean boolean18 = linkedListTestDriver15.contains((java.lang.Object) '#');
        boolean boolean20 = linkedListTestDriver15.add((java.lang.Object) (byte) 10);
        boolean boolean22 = linkedListTestDriver15.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean23 = linkedListTestDriver12.contains((java.lang.Object) linkedListTestDriver15);
        java.lang.Object obj24 = linkedListTestDriver15.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator26 = linkedListTestDriver25.iterator();
        boolean boolean28 = linkedListTestDriver25.contains((java.lang.Object) '#');
        boolean boolean30 = linkedListTestDriver25.add((java.lang.Object) (byte) 10);
        boolean boolean32 = linkedListTestDriver25.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj33 = linkedListTestDriver25.removeFirst();
        boolean boolean35 = linkedListTestDriver25.remove((java.lang.Object) (byte) 1);
        boolean boolean36 = linkedListTestDriver15.remove((java.lang.Object) linkedListTestDriver25);
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator38 = linkedListTestDriver37.iterator();
        boolean boolean40 = linkedListTestDriver37.contains((java.lang.Object) '#');
        boolean boolean42 = linkedListTestDriver37.add((java.lang.Object) (byte) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver43 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator44 = linkedListTestDriver43.iterator();
        boolean boolean46 = linkedListTestDriver43.contains((java.lang.Object) '#');
        linkedListTestDriver37.addFirst((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver48 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator49 = linkedListTestDriver48.iterator();
        boolean boolean51 = linkedListTestDriver48.contains((java.lang.Object) '#');
        boolean boolean53 = linkedListTestDriver48.add((java.lang.Object) (byte) 10);
        boolean boolean55 = linkedListTestDriver48.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj56 = linkedListTestDriver48.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver57 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator58 = linkedListTestDriver57.iterator();
        boolean boolean60 = linkedListTestDriver57.add((java.lang.Object) false);
        linkedListTestDriver57.addFirst((java.lang.Object) (byte) 1);
        boolean boolean64 = linkedListTestDriver57.contains((java.lang.Object) 100.0d);
        boolean boolean65 = linkedListTestDriver48.contains((java.lang.Object) linkedListTestDriver57);
        experiment.util.Iterator iterator66 = linkedListTestDriver48.iterator();
        boolean boolean67 = linkedListTestDriver37.equals_CUT((java.lang.Object) iterator66);
        linkedListTestDriver15.addLast((java.lang.Object) iterator66);
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj71 = linkedListTestDriver0.get((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) 10 + "'", obj24, (byte) 10);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (byte) 10 + "'", obj33, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(iterator44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(iterator49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + (byte) 10 + "'", obj56, (byte) 10);
        org.junit.Assert.assertNotNull(iterator58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(iterator66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test170");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = linkedListTestDriver0.toArray();
        int int4 = linkedListTestDriver0.size();
        java.lang.Object obj5 = linkedListTestDriver0.removeLast();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[hi!]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "hi!" + "'", obj5, "hi!");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test171");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) (-1.0d));
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        java.lang.Object[] objArray4 = linkedListTestDriver0.toArray();
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (-1.0d) + "'", obj3, (-1.0d));
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1.0]");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test172");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.contains((java.lang.Object) '#');
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (byte) 10);
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj8 = linkedListTestDriver0.removeFirst();
        boolean boolean10 = linkedListTestDriver0.remove((java.lang.Object) (byte) 1);
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator13 = linkedListTestDriver12.iterator();
        boolean boolean15 = linkedListTestDriver12.contains((java.lang.Object) '#');
        boolean boolean17 = linkedListTestDriver12.add((java.lang.Object) (byte) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator19 = linkedListTestDriver18.iterator();
        boolean boolean21 = linkedListTestDriver18.contains((java.lang.Object) '#');
        linkedListTestDriver12.addFirst((java.lang.Object) '#');
        java.lang.Object obj23 = linkedListTestDriver12.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        boolean boolean26 = linkedListTestDriver24.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver27 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator28 = linkedListTestDriver27.iterator();
        boolean boolean30 = linkedListTestDriver27.contains((java.lang.Object) '#');
        boolean boolean32 = linkedListTestDriver27.add((java.lang.Object) (byte) 10);
        boolean boolean34 = linkedListTestDriver27.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean35 = linkedListTestDriver24.contains((java.lang.Object) linkedListTestDriver27);
        java.lang.Object obj36 = linkedListTestDriver27.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator38 = linkedListTestDriver37.iterator();
        boolean boolean40 = linkedListTestDriver37.contains((java.lang.Object) '#');
        boolean boolean42 = linkedListTestDriver37.add((java.lang.Object) (byte) 10);
        boolean boolean44 = linkedListTestDriver37.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj45 = linkedListTestDriver37.removeFirst();
        boolean boolean47 = linkedListTestDriver37.remove((java.lang.Object) (byte) 1);
        boolean boolean48 = linkedListTestDriver27.remove((java.lang.Object) linkedListTestDriver37);
        experiment.util.LinkedListTestDriver linkedListTestDriver49 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator50 = linkedListTestDriver49.iterator();
        boolean boolean52 = linkedListTestDriver49.contains((java.lang.Object) '#');
        boolean boolean54 = linkedListTestDriver49.add((java.lang.Object) (byte) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver55 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator56 = linkedListTestDriver55.iterator();
        boolean boolean58 = linkedListTestDriver55.contains((java.lang.Object) '#');
        linkedListTestDriver49.addFirst((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver60 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator61 = linkedListTestDriver60.iterator();
        boolean boolean63 = linkedListTestDriver60.contains((java.lang.Object) '#');
        boolean boolean65 = linkedListTestDriver60.add((java.lang.Object) (byte) 10);
        boolean boolean67 = linkedListTestDriver60.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj68 = linkedListTestDriver60.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver69 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator70 = linkedListTestDriver69.iterator();
        boolean boolean72 = linkedListTestDriver69.add((java.lang.Object) false);
        linkedListTestDriver69.addFirst((java.lang.Object) (byte) 1);
        boolean boolean76 = linkedListTestDriver69.contains((java.lang.Object) 100.0d);
        boolean boolean77 = linkedListTestDriver60.contains((java.lang.Object) linkedListTestDriver69);
        experiment.util.Iterator iterator78 = linkedListTestDriver60.iterator();
        boolean boolean79 = linkedListTestDriver49.equals_CUT((java.lang.Object) iterator78);
        linkedListTestDriver27.addLast((java.lang.Object) iterator78);
        linkedListTestDriver12.addFirst((java.lang.Object) linkedListTestDriver27);
        boolean boolean82 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver27);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj84 = linkedListTestDriver27.remove((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 10 + "'", obj8, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) 10 + "'", obj23, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (byte) 10 + "'", obj36, (byte) 10);
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (byte) 10 + "'", obj45, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(iterator50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(iterator56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(iterator61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + obj68 + "' != '" + (byte) 10 + "'", obj68, (byte) 10);
        org.junit.Assert.assertNotNull(iterator70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(iterator78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test173");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.contains((java.lang.Object) '#');
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (byte) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator7 = linkedListTestDriver6.iterator();
        boolean boolean9 = linkedListTestDriver6.contains((java.lang.Object) '#');
        linkedListTestDriver0.addFirst((java.lang.Object) '#');
        java.lang.Object obj11 = linkedListTestDriver0.removeFirst();
        boolean boolean13 = linkedListTestDriver0.remove((java.lang.Object) 1.0d);
        experiment.util.Iterator iterator14 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        boolean boolean18 = linkedListTestDriver16.equals_CUT((java.lang.Object) 0.0f);
        linkedListTestDriver16.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        boolean boolean22 = linkedListTestDriver20.equals_CUT((java.lang.Object) 0.0f);
        java.lang.Object[] objArray23 = linkedListTestDriver20.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator25 = linkedListTestDriver24.iterator();
        boolean boolean27 = linkedListTestDriver24.contains((java.lang.Object) '#');
        boolean boolean29 = linkedListTestDriver24.add((java.lang.Object) (byte) 10);
        boolean boolean31 = linkedListTestDriver24.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj32 = linkedListTestDriver24.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver33 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator34 = linkedListTestDriver33.iterator();
        boolean boolean36 = linkedListTestDriver33.add((java.lang.Object) false);
        linkedListTestDriver33.addFirst((java.lang.Object) (byte) 1);
        boolean boolean40 = linkedListTestDriver33.contains((java.lang.Object) 100.0d);
        boolean boolean41 = linkedListTestDriver24.contains((java.lang.Object) linkedListTestDriver33);
        experiment.util.Iterator iterator42 = linkedListTestDriver24.iterator();
        linkedListTestDriver20.addLast((java.lang.Object) linkedListTestDriver24);
        java.lang.Object obj44 = linkedListTestDriver20.removeLast();
        boolean boolean45 = linkedListTestDriver16.equals_CUT((java.lang.Object) linkedListTestDriver20);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add(10, (java.lang.Object) linkedListTestDriver16);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '#' + "'", obj11, '#');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (byte) 10 + "'", obj32, (byte) 10);
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(iterator42);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test174");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator4 = linkedListTestDriver3.iterator();
        boolean boolean6 = linkedListTestDriver3.contains((java.lang.Object) '#');
        boolean boolean8 = linkedListTestDriver3.add((java.lang.Object) (byte) 10);
        boolean boolean10 = linkedListTestDriver3.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean11 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver3);
        java.lang.Object obj12 = linkedListTestDriver3.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator14 = linkedListTestDriver13.iterator();
        boolean boolean16 = linkedListTestDriver13.contains((java.lang.Object) '#');
        boolean boolean18 = linkedListTestDriver13.add((java.lang.Object) (byte) 10);
        boolean boolean20 = linkedListTestDriver13.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj21 = linkedListTestDriver13.removeFirst();
        boolean boolean23 = linkedListTestDriver13.remove((java.lang.Object) (byte) 1);
        boolean boolean24 = linkedListTestDriver3.remove((java.lang.Object) linkedListTestDriver13);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        boolean boolean27 = linkedListTestDriver25.equals_CUT((java.lang.Object) 0.0f);
        java.lang.Object[] objArray28 = linkedListTestDriver25.toArray();
        boolean boolean29 = linkedListTestDriver3.add((java.lang.Object) objArray28);
        boolean boolean30 = linkedListTestDriver3.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 10 + "'", obj12, (byte) 10);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 10 + "'", obj21, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test175");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.contains((java.lang.Object) '#');
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (byte) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator7 = linkedListTestDriver6.iterator();
        boolean boolean9 = linkedListTestDriver6.contains((java.lang.Object) '#');
        linkedListTestDriver0.addFirst((java.lang.Object) '#');
        java.lang.Object obj11 = linkedListTestDriver0.removeFirst();
        boolean boolean13 = linkedListTestDriver0.remove((java.lang.Object) 1.0d);
        experiment.util.Iterator iterator14 = linkedListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = linkedListTestDriver0.remove((int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator14);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test176");
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
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        boolean boolean26 = linkedListTestDriver24.equals_CUT((java.lang.Object) 0.0f);
        boolean boolean27 = linkedListTestDriver4.add((java.lang.Object) linkedListTestDriver24);
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator30 = linkedListTestDriver29.iterator();
        boolean boolean32 = linkedListTestDriver29.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator35 = linkedListTestDriver34.iterator();
        linkedListTestDriver29.add(0, (java.lang.Object) iterator35);
        boolean boolean38 = linkedListTestDriver29.remove((java.lang.Object) (byte) 0);
        experiment.util.Iterator iterator39 = linkedListTestDriver29.iterator();
        java.lang.Object obj40 = linkedListTestDriver29.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver4.add((int) (byte) 100, obj40);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 100; size: 1");
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertNotNull(obj40);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test177");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 1);
        boolean boolean7 = linkedListTestDriver0.contains((java.lang.Object) 100.0d);
        java.lang.Object obj8 = linkedListTestDriver0.getLast();
        java.lang.Object[] objArray9 = linkedListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = linkedListTestDriver0.remove((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + false + "'", obj8, false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, false]");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test178");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator6 = linkedListTestDriver5.iterator();
        linkedListTestDriver0.add(0, (java.lang.Object) iterator6);
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator10 = linkedListTestDriver9.iterator();
        boolean boolean12 = linkedListTestDriver9.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator15 = linkedListTestDriver14.iterator();
        linkedListTestDriver9.add(0, (java.lang.Object) iterator15);
        java.lang.Object obj18 = linkedListTestDriver9.remove(0);
        java.lang.Object obj19 = linkedListTestDriver9.removeFirst();
        java.lang.Object[] objArray20 = linkedListTestDriver9.toArray();
        java.lang.Object obj21 = linkedListTestDriver0.set(0, (java.lang.Object) linkedListTestDriver9);
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + false + "'", obj19, false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test179");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator7 = linkedListTestDriver6.iterator();
        boolean boolean8 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver6);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator11 = linkedListTestDriver10.iterator();
        boolean boolean13 = linkedListTestDriver10.contains((java.lang.Object) '#');
        boolean boolean15 = linkedListTestDriver10.add((java.lang.Object) (byte) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator17 = linkedListTestDriver16.iterator();
        boolean boolean19 = linkedListTestDriver16.contains((java.lang.Object) '#');
        linkedListTestDriver10.addFirst((java.lang.Object) '#');
        linkedListTestDriver0.add((int) (short) 1, (java.lang.Object) '#');
        java.lang.Object obj22 = linkedListTestDriver0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = linkedListTestDriver0.get((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + false + "'", obj22, false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test180");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator4 = linkedListTestDriver3.iterator();
        boolean boolean6 = linkedListTestDriver3.contains((java.lang.Object) '#');
        boolean boolean8 = linkedListTestDriver3.add((java.lang.Object) (byte) 10);
        boolean boolean10 = linkedListTestDriver3.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean11 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver3);
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator13 = linkedListTestDriver12.iterator();
        boolean boolean15 = linkedListTestDriver12.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator18 = linkedListTestDriver17.iterator();
        linkedListTestDriver12.add(0, (java.lang.Object) iterator18);
        boolean boolean21 = linkedListTestDriver12.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj22 = linkedListTestDriver12.getFirst();
        java.lang.Object[] objArray23 = linkedListTestDriver12.toArray();
        boolean boolean24 = linkedListTestDriver12.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        boolean boolean27 = linkedListTestDriver25.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator29 = linkedListTestDriver28.iterator();
        boolean boolean31 = linkedListTestDriver28.contains((java.lang.Object) '#');
        boolean boolean33 = linkedListTestDriver28.add((java.lang.Object) (byte) 10);
        boolean boolean35 = linkedListTestDriver28.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean36 = linkedListTestDriver25.contains((java.lang.Object) linkedListTestDriver28);
        java.lang.Object obj37 = linkedListTestDriver28.getLast();
        int int38 = linkedListTestDriver28.size();
        boolean boolean39 = linkedListTestDriver28.isEmpty();
        boolean boolean40 = linkedListTestDriver12.equals_CUT((java.lang.Object) boolean39);
        boolean boolean42 = linkedListTestDriver12.add((java.lang.Object) 0.0f);
        boolean boolean43 = linkedListTestDriver12.isEmpty();
        boolean boolean44 = linkedListTestDriver3.add((java.lang.Object) boolean43);
        experiment.util.LinkedListTestDriver linkedListTestDriver46 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator47 = linkedListTestDriver46.iterator();
        boolean boolean49 = linkedListTestDriver46.contains((java.lang.Object) '#');
        boolean boolean51 = linkedListTestDriver46.add((java.lang.Object) (byte) 10);
        boolean boolean53 = linkedListTestDriver46.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj54 = linkedListTestDriver46.removeFirst();
        boolean boolean56 = linkedListTestDriver46.remove((java.lang.Object) (byte) 1);
        boolean boolean57 = linkedListTestDriver46.isEmpty();
        boolean boolean58 = linkedListTestDriver46.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver3.add((int) ' ', (java.lang.Object) boolean58);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 32; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (byte) 10 + "'", obj37, (byte) 10);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(iterator47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + (byte) 10 + "'", obj54, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test181");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.contains((java.lang.Object) '#');
        boolean boolean4 = linkedListTestDriver0.isEmpty();
        boolean boolean6 = linkedListTestDriver0.equals_CUT((java.lang.Object) (short) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator8 = linkedListTestDriver7.iterator();
        boolean boolean10 = linkedListTestDriver7.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator13 = linkedListTestDriver12.iterator();
        linkedListTestDriver7.add(0, (java.lang.Object) iterator13);
        boolean boolean16 = linkedListTestDriver7.remove((java.lang.Object) (byte) 0);
        experiment.util.Iterator iterator17 = linkedListTestDriver7.iterator();
        java.lang.Object obj18 = linkedListTestDriver7.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver7.contains((java.lang.Object) linkedListTestDriver19);
        boolean boolean21 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver19);
        java.lang.Object[] objArray22 = linkedListTestDriver0.toArray();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test182");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator7 = linkedListTestDriver6.iterator();
        boolean boolean8 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver6);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator11 = linkedListTestDriver10.iterator();
        boolean boolean13 = linkedListTestDriver10.contains((java.lang.Object) '#');
        boolean boolean15 = linkedListTestDriver10.add((java.lang.Object) (byte) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator17 = linkedListTestDriver16.iterator();
        boolean boolean19 = linkedListTestDriver16.contains((java.lang.Object) '#');
        linkedListTestDriver10.addFirst((java.lang.Object) '#');
        linkedListTestDriver0.add((int) (short) 1, (java.lang.Object) '#');
        java.lang.Object obj22 = linkedListTestDriver0.removeLast();
        java.lang.Object obj23 = linkedListTestDriver0.removeFirst();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + false + "'", obj22, false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) 1 + "'", obj23, (byte) 1);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test183");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        boolean boolean5 = linkedListTestDriver3.contains((java.lang.Object) (-1.0f));
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver3);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator10 = linkedListTestDriver9.iterator();
        boolean boolean12 = linkedListTestDriver9.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator15 = linkedListTestDriver14.iterator();
        linkedListTestDriver9.add(0, (java.lang.Object) iterator15);
        java.lang.Object obj17 = linkedListTestDriver9.removeLast();
        java.lang.Object obj18 = linkedListTestDriver0.set(0, (java.lang.Object) linkedListTestDriver9);
        boolean boolean19 = linkedListTestDriver0.isEmpty();
        java.lang.Object obj20 = linkedListTestDriver0.removeFirst();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + false + "'", obj17, false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test184");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        boolean boolean5 = linkedListTestDriver3.contains((java.lang.Object) (-1.0f));
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver3);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator10 = linkedListTestDriver9.iterator();
        boolean boolean12 = linkedListTestDriver9.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator15 = linkedListTestDriver14.iterator();
        linkedListTestDriver9.add(0, (java.lang.Object) iterator15);
        java.lang.Object obj17 = linkedListTestDriver9.removeLast();
        java.lang.Object obj18 = linkedListTestDriver0.set(0, (java.lang.Object) linkedListTestDriver9);
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator20 = linkedListTestDriver19.iterator();
        boolean boolean22 = linkedListTestDriver19.contains((java.lang.Object) '#');
        boolean boolean24 = linkedListTestDriver19.add((java.lang.Object) (byte) 10);
        boolean boolean26 = linkedListTestDriver19.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj27 = linkedListTestDriver19.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator29 = linkedListTestDriver28.iterator();
        boolean boolean31 = linkedListTestDriver28.add((java.lang.Object) false);
        linkedListTestDriver28.addFirst((java.lang.Object) (byte) 1);
        boolean boolean35 = linkedListTestDriver28.contains((java.lang.Object) 100.0d);
        boolean boolean36 = linkedListTestDriver19.contains((java.lang.Object) linkedListTestDriver28);
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator38 = linkedListTestDriver37.iterator();
        boolean boolean40 = linkedListTestDriver37.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver42 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator43 = linkedListTestDriver42.iterator();
        linkedListTestDriver37.add(0, (java.lang.Object) iterator43);
        boolean boolean46 = linkedListTestDriver37.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj47 = linkedListTestDriver37.getFirst();
        boolean boolean48 = linkedListTestDriver19.contains((java.lang.Object) linkedListTestDriver37);
        experiment.util.LinkedListTestDriver linkedListTestDriver49 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator50 = linkedListTestDriver49.iterator();
        boolean boolean51 = linkedListTestDriver49.isEmpty();
        boolean boolean52 = linkedListTestDriver37.equals_CUT((java.lang.Object) linkedListTestDriver49);
        boolean boolean53 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver37);
        java.lang.Object obj54 = linkedListTestDriver0.getFirst();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + false + "'", obj17, false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (byte) 10 + "'", obj27, (byte) 10);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(iterator43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(iterator50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(obj54);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test185");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean2 = linkedListTestDriver0.isEmpty();
        int int3 = linkedListTestDriver0.size();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test186");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        experiment.util.Iterator iterator2 = linkedListTestDriver0.iterator();
        experiment.util.ListIterator listIterator4 = linkedListTestDriver0.listIterator(0);
        linkedListTestDriver0.clear();
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        boolean boolean7 = linkedListTestDriver0.isEmpty();
        boolean boolean8 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(listIterator4);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test187");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator4 = linkedListTestDriver3.iterator();
        boolean boolean6 = linkedListTestDriver3.contains((java.lang.Object) '#');
        boolean boolean8 = linkedListTestDriver3.add((java.lang.Object) (byte) 10);
        boolean boolean10 = linkedListTestDriver3.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean11 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver3);
        java.lang.Object obj12 = linkedListTestDriver3.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator14 = linkedListTestDriver13.iterator();
        boolean boolean16 = linkedListTestDriver13.contains((java.lang.Object) '#');
        boolean boolean18 = linkedListTestDriver13.add((java.lang.Object) (byte) 10);
        boolean boolean20 = linkedListTestDriver13.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj21 = linkedListTestDriver13.removeFirst();
        boolean boolean23 = linkedListTestDriver13.remove((java.lang.Object) (byte) 1);
        boolean boolean24 = linkedListTestDriver3.remove((java.lang.Object) linkedListTestDriver13);
        java.lang.Object obj26 = linkedListTestDriver3.get(0);
        java.lang.Object obj27 = linkedListTestDriver3.removeFirst();
        boolean boolean29 = linkedListTestDriver3.contains((java.lang.Object) 10.0d);
        experiment.util.ListIterator listIterator31 = linkedListTestDriver3.listIterator(0);
        java.lang.Class<?> wildcardClass32 = listIterator31.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 10 + "'", obj12, (byte) 10);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 10 + "'", obj21, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) 10 + "'", obj26, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (byte) 10 + "'", obj27, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(listIterator31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test188");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator4 = linkedListTestDriver3.iterator();
        boolean boolean6 = linkedListTestDriver3.contains((java.lang.Object) '#');
        boolean boolean8 = linkedListTestDriver3.add((java.lang.Object) (byte) 10);
        boolean boolean10 = linkedListTestDriver3.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean11 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver3);
        java.lang.Object obj12 = linkedListTestDriver3.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator14 = linkedListTestDriver13.iterator();
        boolean boolean16 = linkedListTestDriver13.contains((java.lang.Object) '#');
        boolean boolean18 = linkedListTestDriver13.add((java.lang.Object) (byte) 10);
        boolean boolean20 = linkedListTestDriver13.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj21 = linkedListTestDriver13.removeFirst();
        boolean boolean23 = linkedListTestDriver13.remove((java.lang.Object) (byte) 1);
        boolean boolean24 = linkedListTestDriver3.remove((java.lang.Object) linkedListTestDriver13);
        java.lang.Object obj26 = linkedListTestDriver3.get(0);
        experiment.util.LinkedListTestDriver linkedListTestDriver27 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator28 = linkedListTestDriver27.iterator();
        boolean boolean30 = linkedListTestDriver27.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator33 = linkedListTestDriver32.iterator();
        linkedListTestDriver27.add(0, (java.lang.Object) iterator33);
        java.lang.Object obj36 = linkedListTestDriver27.remove(0);
        boolean boolean37 = linkedListTestDriver3.equals_CUT(obj36);
        experiment.util.LinkedListTestDriver linkedListTestDriver39 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator40 = linkedListTestDriver39.iterator();
        boolean boolean42 = linkedListTestDriver39.contains((java.lang.Object) '#');
        boolean boolean44 = linkedListTestDriver39.add((java.lang.Object) (byte) 10);
        boolean boolean46 = linkedListTestDriver39.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj47 = linkedListTestDriver39.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver48 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator49 = linkedListTestDriver48.iterator();
        boolean boolean51 = linkedListTestDriver48.add((java.lang.Object) false);
        linkedListTestDriver48.addFirst((java.lang.Object) (byte) 1);
        boolean boolean55 = linkedListTestDriver48.contains((java.lang.Object) 100.0d);
        boolean boolean56 = linkedListTestDriver39.contains((java.lang.Object) linkedListTestDriver48);
        experiment.util.LinkedListTestDriver linkedListTestDriver57 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator58 = linkedListTestDriver57.iterator();
        boolean boolean60 = linkedListTestDriver57.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver62 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator63 = linkedListTestDriver62.iterator();
        linkedListTestDriver57.add(0, (java.lang.Object) iterator63);
        boolean boolean66 = linkedListTestDriver57.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj67 = linkedListTestDriver57.getFirst();
        boolean boolean68 = linkedListTestDriver39.contains((java.lang.Object) linkedListTestDriver57);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver3.add((-1), (java.lang.Object) linkedListTestDriver57);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 10 + "'", obj12, (byte) 10);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 10 + "'", obj21, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) 10 + "'", obj26, (byte) 10);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(iterator40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + (byte) 10 + "'", obj47, (byte) 10);
        org.junit.Assert.assertNotNull(iterator49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(iterator58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(iterator63);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test189");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.contains((java.lang.Object) '#');
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (byte) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator7 = linkedListTestDriver6.iterator();
        boolean boolean9 = linkedListTestDriver6.contains((java.lang.Object) '#');
        linkedListTestDriver0.addFirst((java.lang.Object) '#');
        java.lang.Object obj11 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator13 = linkedListTestDriver12.iterator();
        boolean boolean15 = linkedListTestDriver12.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator18 = linkedListTestDriver17.iterator();
        linkedListTestDriver12.add(0, (java.lang.Object) iterator18);
        boolean boolean20 = linkedListTestDriver12.isEmpty();
        java.lang.Object obj21 = linkedListTestDriver12.removeLast();
        java.lang.Object obj22 = linkedListTestDriver12.getFirst();
        boolean boolean23 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver12);
        boolean boolean25 = linkedListTestDriver12.contains((java.lang.Object) (byte) -1);
        experiment.util.ListIterator listIterator27 = linkedListTestDriver12.listIterator(0);
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '#' + "'", obj11, '#');
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + false + "'", obj21, false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(listIterator27);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test190");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator7 = linkedListTestDriver6.iterator();
        boolean boolean8 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver6);
        java.lang.Object obj9 = linkedListTestDriver0.getFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = linkedListTestDriver0.get((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) 1 + "'", obj9, (byte) 1);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test191");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator7 = linkedListTestDriver6.iterator();
        boolean boolean8 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver6);
        java.lang.Object obj9 = linkedListTestDriver0.getLast();
        linkedListTestDriver0.clear();
        boolean boolean11 = linkedListTestDriver0.isEmpty();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + false + "'", obj9, false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test192");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator4 = linkedListTestDriver3.iterator();
        boolean boolean6 = linkedListTestDriver3.contains((java.lang.Object) '#');
        boolean boolean8 = linkedListTestDriver3.add((java.lang.Object) (byte) 10);
        boolean boolean10 = linkedListTestDriver3.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean11 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver3);
        boolean boolean13 = linkedListTestDriver3.add((java.lang.Object) 1.0d);
        java.lang.Object obj14 = linkedListTestDriver3.getFirst();
        int int15 = linkedListTestDriver3.size();
        java.lang.Class<?> wildcardClass16 = linkedListTestDriver3.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) 10 + "'", obj14, (byte) 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test193");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator6 = linkedListTestDriver5.iterator();
        linkedListTestDriver0.add(0, (java.lang.Object) iterator6);
        java.lang.Object obj9 = linkedListTestDriver0.remove((int) (short) 1);
        java.lang.Object obj11 = linkedListTestDriver0.get((int) (short) 0);
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + false + "'", obj9, false);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test194");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean2 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = linkedListTestDriver0.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test195");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator6 = linkedListTestDriver5.iterator();
        boolean boolean8 = linkedListTestDriver5.contains((java.lang.Object) '#');
        boolean boolean10 = linkedListTestDriver5.add((java.lang.Object) (byte) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator12 = linkedListTestDriver11.iterator();
        boolean boolean14 = linkedListTestDriver11.contains((java.lang.Object) '#');
        linkedListTestDriver5.addFirst((java.lang.Object) '#');
        java.lang.Object obj16 = linkedListTestDriver5.getLast();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add(100, (java.lang.Object) linkedListTestDriver5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 100; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[hi!]");
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) 10 + "'", obj16, (byte) 10);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test196");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator6 = linkedListTestDriver5.iterator();
        linkedListTestDriver0.add(0, (java.lang.Object) iterator6);
        java.lang.Object obj8 = linkedListTestDriver0.removeFirst();
        java.lang.Object obj9 = linkedListTestDriver0.getLast();
        java.lang.Object[] objArray10 = linkedListTestDriver0.toArray();
        java.lang.Object obj11 = linkedListTestDriver0.removeFirst();
        java.lang.Object obj12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = linkedListTestDriver0.remove(obj12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + false + "'", obj9, false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[false]");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + false + "'", obj11, false);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test197");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator6 = linkedListTestDriver5.iterator();
        linkedListTestDriver0.add(0, (java.lang.Object) iterator6);
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj10 = linkedListTestDriver0.getFirst();
        java.lang.Object[] objArray11 = linkedListTestDriver0.toArray();
        int int12 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator14 = linkedListTestDriver13.iterator();
        boolean boolean16 = linkedListTestDriver13.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator19 = linkedListTestDriver18.iterator();
        linkedListTestDriver13.add(0, (java.lang.Object) iterator19);
        java.lang.Object obj21 = linkedListTestDriver13.removeFirst();
        java.lang.Object obj22 = linkedListTestDriver13.getLast();
        java.lang.Object[] objArray23 = linkedListTestDriver13.toArray();
        boolean boolean24 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver13);
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + false + "'", obj22, false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[false]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test198");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator6 = linkedListTestDriver5.iterator();
        linkedListTestDriver0.add(0, (java.lang.Object) iterator6);
        java.lang.Object obj8 = linkedListTestDriver0.removeFirst();
        java.lang.Object obj9 = linkedListTestDriver0.getLast();
        java.lang.Object[] objArray10 = linkedListTestDriver0.toArray();
        java.lang.Object obj11 = linkedListTestDriver0.removeFirst();
        boolean boolean13 = linkedListTestDriver0.add((java.lang.Object) 10);
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + false + "'", obj9, false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[false]");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + false + "'", obj11, false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test199");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator6 = linkedListTestDriver5.iterator();
        linkedListTestDriver0.add(0, (java.lang.Object) iterator6);
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) (byte) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator11 = linkedListTestDriver10.iterator();
        boolean boolean13 = linkedListTestDriver10.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator16 = linkedListTestDriver15.iterator();
        linkedListTestDriver10.add(0, (java.lang.Object) iterator16);
        boolean boolean18 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver10);
        experiment.util.Iterator iterator19 = linkedListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator21 = linkedListTestDriver0.listIterator((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 35; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(iterator19);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test200");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator6 = linkedListTestDriver5.iterator();
        linkedListTestDriver0.add(0, (java.lang.Object) iterator6);
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) (byte) 0);
        experiment.util.Iterator iterator10 = linkedListTestDriver0.iterator();
        java.lang.Object obj11 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver12);
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        boolean boolean16 = linkedListTestDriver14.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator18 = linkedListTestDriver17.iterator();
        boolean boolean20 = linkedListTestDriver17.contains((java.lang.Object) '#');
        boolean boolean22 = linkedListTestDriver17.add((java.lang.Object) (byte) 10);
        boolean boolean24 = linkedListTestDriver17.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean25 = linkedListTestDriver14.contains((java.lang.Object) linkedListTestDriver17);
        java.lang.Object obj26 = linkedListTestDriver17.getLast();
        int int27 = linkedListTestDriver17.size();
        boolean boolean28 = linkedListTestDriver17.isEmpty();
        boolean boolean29 = linkedListTestDriver12.contains((java.lang.Object) boolean28);
        experiment.util.ListIterator listIterator31 = linkedListTestDriver12.listIterator(0);
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) 10 + "'", obj26, (byte) 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(listIterator31);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test201");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = linkedListTestDriver0.toArray();
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = linkedListTestDriver0.equals_CUT(obj4);
        boolean boolean7 = linkedListTestDriver0.add((java.lang.Object) 0);
        java.lang.Object obj8 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator10 = linkedListTestDriver9.iterator();
        boolean boolean12 = linkedListTestDriver9.contains((java.lang.Object) '#');
        boolean boolean14 = linkedListTestDriver9.add((java.lang.Object) (byte) 10);
        boolean boolean16 = linkedListTestDriver9.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj17 = linkedListTestDriver9.removeFirst();
        boolean boolean19 = linkedListTestDriver9.remove((java.lang.Object) (byte) 1);
        linkedListTestDriver9.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator22 = linkedListTestDriver21.iterator();
        boolean boolean24 = linkedListTestDriver21.contains((java.lang.Object) '#');
        boolean boolean26 = linkedListTestDriver21.add((java.lang.Object) (byte) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver27 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator28 = linkedListTestDriver27.iterator();
        boolean boolean30 = linkedListTestDriver27.contains((java.lang.Object) '#');
        linkedListTestDriver21.addFirst((java.lang.Object) '#');
        java.lang.Object obj32 = linkedListTestDriver21.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver33 = new experiment.util.LinkedListTestDriver();
        boolean boolean35 = linkedListTestDriver33.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver36 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator37 = linkedListTestDriver36.iterator();
        boolean boolean39 = linkedListTestDriver36.contains((java.lang.Object) '#');
        boolean boolean41 = linkedListTestDriver36.add((java.lang.Object) (byte) 10);
        boolean boolean43 = linkedListTestDriver36.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean44 = linkedListTestDriver33.contains((java.lang.Object) linkedListTestDriver36);
        java.lang.Object obj45 = linkedListTestDriver36.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver46 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator47 = linkedListTestDriver46.iterator();
        boolean boolean49 = linkedListTestDriver46.contains((java.lang.Object) '#');
        boolean boolean51 = linkedListTestDriver46.add((java.lang.Object) (byte) 10);
        boolean boolean53 = linkedListTestDriver46.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj54 = linkedListTestDriver46.removeFirst();
        boolean boolean56 = linkedListTestDriver46.remove((java.lang.Object) (byte) 1);
        boolean boolean57 = linkedListTestDriver36.remove((java.lang.Object) linkedListTestDriver46);
        experiment.util.LinkedListTestDriver linkedListTestDriver58 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator59 = linkedListTestDriver58.iterator();
        boolean boolean61 = linkedListTestDriver58.contains((java.lang.Object) '#');
        boolean boolean63 = linkedListTestDriver58.add((java.lang.Object) (byte) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver64 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator65 = linkedListTestDriver64.iterator();
        boolean boolean67 = linkedListTestDriver64.contains((java.lang.Object) '#');
        linkedListTestDriver58.addFirst((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver69 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator70 = linkedListTestDriver69.iterator();
        boolean boolean72 = linkedListTestDriver69.contains((java.lang.Object) '#');
        boolean boolean74 = linkedListTestDriver69.add((java.lang.Object) (byte) 10);
        boolean boolean76 = linkedListTestDriver69.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj77 = linkedListTestDriver69.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver78 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator79 = linkedListTestDriver78.iterator();
        boolean boolean81 = linkedListTestDriver78.add((java.lang.Object) false);
        linkedListTestDriver78.addFirst((java.lang.Object) (byte) 1);
        boolean boolean85 = linkedListTestDriver78.contains((java.lang.Object) 100.0d);
        boolean boolean86 = linkedListTestDriver69.contains((java.lang.Object) linkedListTestDriver78);
        experiment.util.Iterator iterator87 = linkedListTestDriver69.iterator();
        boolean boolean88 = linkedListTestDriver58.equals_CUT((java.lang.Object) iterator87);
        linkedListTestDriver36.addLast((java.lang.Object) iterator87);
        linkedListTestDriver21.addFirst((java.lang.Object) linkedListTestDriver36);
        boolean boolean91 = linkedListTestDriver9.equals_CUT((java.lang.Object) linkedListTestDriver36);
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[hi!]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 10 + "'", obj17, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (byte) 10 + "'", obj32, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (byte) 10 + "'", obj45, (byte) 10);
        org.junit.Assert.assertNotNull(iterator47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + (byte) 10 + "'", obj54, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(iterator59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(iterator65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(iterator70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertEquals("'" + obj77 + "' != '" + (byte) 10 + "'", obj77, (byte) 10);
        org.junit.Assert.assertNotNull(iterator79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(iterator87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test202");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.contains((java.lang.Object) '#');
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (byte) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator7 = linkedListTestDriver6.iterator();
        boolean boolean9 = linkedListTestDriver6.contains((java.lang.Object) '#');
        linkedListTestDriver0.addFirst((java.lang.Object) '#');
        java.lang.Object obj11 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator13 = linkedListTestDriver12.iterator();
        boolean boolean15 = linkedListTestDriver12.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator18 = linkedListTestDriver17.iterator();
        linkedListTestDriver12.add(0, (java.lang.Object) iterator18);
        boolean boolean20 = linkedListTestDriver12.isEmpty();
        java.lang.Object obj21 = linkedListTestDriver12.removeLast();
        java.lang.Object obj22 = linkedListTestDriver12.getFirst();
        boolean boolean23 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver12);
        java.lang.Object obj24 = linkedListTestDriver12.removeLast();
        int int25 = linkedListTestDriver12.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = linkedListTestDriver12.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '#' + "'", obj11, '#');
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + false + "'", obj21, false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test203");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.contains((java.lang.Object) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = linkedListTestDriver0.getLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test204");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator4 = linkedListTestDriver3.iterator();
        boolean boolean6 = linkedListTestDriver3.contains((java.lang.Object) '#');
        boolean boolean8 = linkedListTestDriver3.add((java.lang.Object) (byte) 10);
        boolean boolean10 = linkedListTestDriver3.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean11 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver3);
        java.lang.Object obj12 = linkedListTestDriver3.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator14 = linkedListTestDriver13.iterator();
        boolean boolean16 = linkedListTestDriver13.contains((java.lang.Object) '#');
        boolean boolean18 = linkedListTestDriver13.add((java.lang.Object) (byte) 10);
        boolean boolean20 = linkedListTestDriver13.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj21 = linkedListTestDriver13.removeFirst();
        boolean boolean23 = linkedListTestDriver13.remove((java.lang.Object) (byte) 1);
        boolean boolean24 = linkedListTestDriver3.remove((java.lang.Object) linkedListTestDriver13);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator26 = linkedListTestDriver25.iterator();
        experiment.util.Iterator iterator27 = linkedListTestDriver25.iterator();
        linkedListTestDriver13.addFirst((java.lang.Object) linkedListTestDriver25);
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator30 = linkedListTestDriver29.iterator();
        boolean boolean32 = linkedListTestDriver29.contains((java.lang.Object) '#');
        boolean boolean33 = linkedListTestDriver29.isEmpty();
        boolean boolean35 = linkedListTestDriver29.equals_CUT((java.lang.Object) (short) 1);
        boolean boolean36 = linkedListTestDriver13.add((java.lang.Object) linkedListTestDriver29);
        int int37 = linkedListTestDriver13.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 10 + "'", obj12, (byte) 10);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 10 + "'", obj21, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test205");
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
        linkedListTestDriver0.add(0, (java.lang.Object) 2);
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        boolean boolean23 = linkedListTestDriver21.add((java.lang.Object) "hi!");
        java.lang.Object[] objArray24 = linkedListTestDriver21.toArray();
        java.lang.Object obj25 = new java.lang.Object();
        boolean boolean26 = linkedListTestDriver21.equals_CUT(obj25);
        boolean boolean28 = linkedListTestDriver21.add((java.lang.Object) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator30 = linkedListTestDriver29.iterator();
        experiment.util.Iterator iterator31 = linkedListTestDriver29.iterator();
        boolean boolean32 = linkedListTestDriver21.remove((java.lang.Object) linkedListTestDriver29);
        linkedListTestDriver21.clear();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver21);
        experiment.util.LinkedListTestDriver linkedListTestDriver35 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator36 = linkedListTestDriver35.iterator();
        boolean boolean38 = linkedListTestDriver35.contains((java.lang.Object) '#');
        boolean boolean40 = linkedListTestDriver35.add((java.lang.Object) (byte) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver41 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator42 = linkedListTestDriver41.iterator();
        boolean boolean44 = linkedListTestDriver41.contains((java.lang.Object) '#');
        linkedListTestDriver35.addFirst((java.lang.Object) '#');
        java.lang.Object obj46 = linkedListTestDriver35.removeFirst();
        boolean boolean48 = linkedListTestDriver35.remove((java.lang.Object) 1.0d);
        experiment.util.Iterator iterator49 = linkedListTestDriver35.iterator();
        boolean boolean50 = linkedListTestDriver21.contains((java.lang.Object) iterator49);
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 10 + "'", obj8, (byte) 10);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[hi!]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(iterator42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + '#' + "'", obj46, '#');
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(iterator49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test206");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator6 = linkedListTestDriver5.iterator();
        linkedListTestDriver0.add(0, (java.lang.Object) iterator6);
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) (byte) 0);
        experiment.util.Iterator iterator10 = linkedListTestDriver0.iterator();
        java.lang.Object obj11 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator13 = linkedListTestDriver12.iterator();
        boolean boolean15 = linkedListTestDriver12.add((java.lang.Object) false);
        linkedListTestDriver12.addFirst((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator19 = linkedListTestDriver18.iterator();
        boolean boolean20 = linkedListTestDriver12.remove((java.lang.Object) linkedListTestDriver18);
        int int21 = linkedListTestDriver12.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator23 = linkedListTestDriver22.iterator();
        boolean boolean25 = linkedListTestDriver22.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver27 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator28 = linkedListTestDriver27.iterator();
        linkedListTestDriver22.add(0, (java.lang.Object) iterator28);
        java.lang.Object obj31 = linkedListTestDriver22.remove(0);
        boolean boolean32 = linkedListTestDriver12.equals_CUT((java.lang.Object) 0);
        linkedListTestDriver0.addFirst((java.lang.Object) 0);
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + false + "'", obj11, false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test207");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator6 = linkedListTestDriver5.iterator();
        linkedListTestDriver0.add(0, (java.lang.Object) iterator6);
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj10 = linkedListTestDriver0.getFirst();
        experiment.util.Iterator iterator11 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray12 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator14 = linkedListTestDriver13.iterator();
        boolean boolean16 = linkedListTestDriver13.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator19 = linkedListTestDriver18.iterator();
        linkedListTestDriver13.add(0, (java.lang.Object) iterator19);
        boolean boolean21 = linkedListTestDriver13.isEmpty();
        java.lang.Class<?> wildcardClass22 = linkedListTestDriver13.getClass();
        boolean boolean23 = linkedListTestDriver0.remove((java.lang.Object) wildcardClass22);
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test208");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 0.0f);
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test209");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.contains((java.lang.Object) '#');
        boolean boolean4 = linkedListTestDriver0.isEmpty();
        boolean boolean6 = linkedListTestDriver0.equals_CUT((java.lang.Object) (short) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator8 = linkedListTestDriver7.iterator();
        boolean boolean10 = linkedListTestDriver7.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator13 = linkedListTestDriver12.iterator();
        linkedListTestDriver7.add(0, (java.lang.Object) iterator13);
        boolean boolean16 = linkedListTestDriver7.remove((java.lang.Object) (byte) 0);
        experiment.util.Iterator iterator17 = linkedListTestDriver7.iterator();
        java.lang.Object obj18 = linkedListTestDriver7.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver7.contains((java.lang.Object) linkedListTestDriver19);
        boolean boolean21 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver19);
        java.lang.Object obj22 = null;
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.addLast(obj22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test210");
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
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator19 = linkedListTestDriver18.iterator();
        boolean boolean21 = linkedListTestDriver18.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator24 = linkedListTestDriver23.iterator();
        linkedListTestDriver18.add(0, (java.lang.Object) iterator24);
        boolean boolean27 = linkedListTestDriver18.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj28 = linkedListTestDriver18.getFirst();
        boolean boolean29 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver18);
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        boolean boolean32 = linkedListTestDriver30.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver33 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator34 = linkedListTestDriver33.iterator();
        boolean boolean36 = linkedListTestDriver33.contains((java.lang.Object) '#');
        boolean boolean38 = linkedListTestDriver33.add((java.lang.Object) (byte) 10);
        boolean boolean40 = linkedListTestDriver33.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean41 = linkedListTestDriver30.contains((java.lang.Object) linkedListTestDriver33);
        java.lang.Object obj42 = linkedListTestDriver33.getLast();
        java.lang.Object obj43 = linkedListTestDriver33.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver44 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator45 = linkedListTestDriver44.iterator();
        linkedListTestDriver33.addLast((java.lang.Object) iterator45);
        linkedListTestDriver18.addFirst((java.lang.Object) iterator45);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj49 = linkedListTestDriver18.get((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (byte) 10 + "'", obj42, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (byte) 10 + "'", obj43, (byte) 10);
        org.junit.Assert.assertNotNull(iterator45);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test211");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator4 = linkedListTestDriver3.iterator();
        boolean boolean6 = linkedListTestDriver3.contains((java.lang.Object) '#');
        boolean boolean8 = linkedListTestDriver3.add((java.lang.Object) (byte) 10);
        boolean boolean10 = linkedListTestDriver3.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean11 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver3);
        java.lang.Object obj12 = linkedListTestDriver3.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator14 = linkedListTestDriver13.iterator();
        boolean boolean16 = linkedListTestDriver13.contains((java.lang.Object) '#');
        boolean boolean18 = linkedListTestDriver13.add((java.lang.Object) (byte) 10);
        boolean boolean20 = linkedListTestDriver13.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj21 = linkedListTestDriver13.removeFirst();
        boolean boolean23 = linkedListTestDriver13.remove((java.lang.Object) (byte) 1);
        boolean boolean24 = linkedListTestDriver3.remove((java.lang.Object) linkedListTestDriver13);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator26 = linkedListTestDriver25.iterator();
        experiment.util.Iterator iterator27 = linkedListTestDriver25.iterator();
        linkedListTestDriver13.addFirst((java.lang.Object) linkedListTestDriver25);
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator30 = linkedListTestDriver29.iterator();
        boolean boolean32 = linkedListTestDriver29.contains((java.lang.Object) '#');
        boolean boolean33 = linkedListTestDriver29.isEmpty();
        boolean boolean35 = linkedListTestDriver29.equals_CUT((java.lang.Object) (short) 1);
        boolean boolean36 = linkedListTestDriver13.add((java.lang.Object) linkedListTestDriver29);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator38 = linkedListTestDriver13.listIterator((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 10 + "'", obj12, (byte) 10);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 10 + "'", obj21, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test212");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.contains((java.lang.Object) '#');
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (byte) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator7 = linkedListTestDriver6.iterator();
        boolean boolean9 = linkedListTestDriver6.contains((java.lang.Object) '#');
        linkedListTestDriver0.addFirst((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator12 = linkedListTestDriver11.iterator();
        boolean boolean14 = linkedListTestDriver11.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator17 = linkedListTestDriver16.iterator();
        linkedListTestDriver11.add(0, (java.lang.Object) iterator17);
        boolean boolean19 = linkedListTestDriver11.isEmpty();
        java.lang.Object obj20 = linkedListTestDriver11.removeLast();
        experiment.util.Iterator iterator21 = linkedListTestDriver11.iterator();
        boolean boolean22 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver11);
        boolean boolean23 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = linkedListTestDriver0.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test213");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator4 = linkedListTestDriver3.iterator();
        boolean boolean6 = linkedListTestDriver3.contains((java.lang.Object) '#');
        boolean boolean8 = linkedListTestDriver3.add((java.lang.Object) (byte) 10);
        boolean boolean10 = linkedListTestDriver3.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean11 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver3);
        java.lang.Object obj12 = linkedListTestDriver3.getLast();
        java.lang.Object obj13 = linkedListTestDriver3.getLast();
        java.lang.Object obj14 = linkedListTestDriver3.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator16 = linkedListTestDriver15.iterator();
        boolean boolean18 = linkedListTestDriver15.contains((java.lang.Object) '#');
        boolean boolean20 = linkedListTestDriver15.add((java.lang.Object) (byte) 10);
        boolean boolean22 = linkedListTestDriver15.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj23 = linkedListTestDriver15.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator25 = linkedListTestDriver24.iterator();
        boolean boolean27 = linkedListTestDriver24.add((java.lang.Object) false);
        linkedListTestDriver24.addFirst((java.lang.Object) (byte) 1);
        boolean boolean31 = linkedListTestDriver24.contains((java.lang.Object) 100.0d);
        boolean boolean32 = linkedListTestDriver15.contains((java.lang.Object) linkedListTestDriver24);
        experiment.util.Iterator iterator33 = linkedListTestDriver15.iterator();
        boolean boolean34 = linkedListTestDriver3.add((java.lang.Object) iterator33);
        experiment.util.LinkedListTestDriver linkedListTestDriver35 = new experiment.util.LinkedListTestDriver();
        boolean boolean37 = linkedListTestDriver35.add((java.lang.Object) (-1.0d));
        java.lang.Object obj38 = linkedListTestDriver35.getFirst();
        java.lang.Object[] objArray39 = linkedListTestDriver35.toArray();
        boolean boolean40 = linkedListTestDriver3.equals_CUT((java.lang.Object) objArray39);
        java.lang.Class<?> wildcardClass41 = objArray39.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 10 + "'", obj12, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 10 + "'", obj13, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) 10 + "'", obj14, (byte) 10);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) 10 + "'", obj23, (byte) 10);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (-1.0d) + "'", obj38, (-1.0d));
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test214");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator4 = linkedListTestDriver3.iterator();
        boolean boolean6 = linkedListTestDriver3.contains((java.lang.Object) '#');
        boolean boolean8 = linkedListTestDriver3.add((java.lang.Object) (byte) 10);
        boolean boolean10 = linkedListTestDriver3.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean11 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver3);
        java.lang.Object obj12 = linkedListTestDriver3.getLast();
        java.lang.Object obj13 = linkedListTestDriver3.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator15 = linkedListTestDriver14.iterator();
        linkedListTestDriver3.addLast((java.lang.Object) iterator15);
        java.lang.Object obj17 = linkedListTestDriver3.getFirst();
        java.lang.Object obj18 = linkedListTestDriver3.removeFirst();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 10 + "'", obj12, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 10 + "'", obj13, (byte) 10);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 10 + "'", obj17, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) 10 + "'", obj18, (byte) 10);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test215");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator4 = linkedListTestDriver3.iterator();
        boolean boolean6 = linkedListTestDriver3.contains((java.lang.Object) '#');
        boolean boolean8 = linkedListTestDriver3.add((java.lang.Object) (byte) 10);
        boolean boolean10 = linkedListTestDriver3.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean11 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver3);
        java.lang.Object obj12 = linkedListTestDriver3.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator14 = linkedListTestDriver13.iterator();
        boolean boolean16 = linkedListTestDriver13.contains((java.lang.Object) '#');
        boolean boolean18 = linkedListTestDriver13.add((java.lang.Object) (byte) 10);
        boolean boolean20 = linkedListTestDriver13.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj21 = linkedListTestDriver13.removeFirst();
        boolean boolean23 = linkedListTestDriver13.remove((java.lang.Object) (byte) 1);
        boolean boolean24 = linkedListTestDriver3.remove((java.lang.Object) linkedListTestDriver13);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator26 = linkedListTestDriver25.iterator();
        experiment.util.Iterator iterator27 = linkedListTestDriver25.iterator();
        linkedListTestDriver13.addFirst((java.lang.Object) linkedListTestDriver25);
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator30 = linkedListTestDriver29.iterator();
        boolean boolean32 = linkedListTestDriver29.contains((java.lang.Object) '#');
        boolean boolean33 = linkedListTestDriver29.isEmpty();
        boolean boolean35 = linkedListTestDriver29.equals_CUT((java.lang.Object) (short) 1);
        boolean boolean36 = linkedListTestDriver13.add((java.lang.Object) linkedListTestDriver29);
        experiment.util.Iterator iterator37 = linkedListTestDriver13.iterator();
        experiment.util.ListIterator listIterator39 = linkedListTestDriver13.listIterator((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 10 + "'", obj12, (byte) 10);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 10 + "'", obj21, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertNotNull(listIterator39);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test216");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.contains((java.lang.Object) '#');
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (byte) 10);
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj8 = linkedListTestDriver0.removeFirst();
        boolean boolean10 = linkedListTestDriver0.remove((java.lang.Object) (byte) 1);
        boolean boolean11 = linkedListTestDriver0.isEmpty();
        boolean boolean12 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = linkedListTestDriver0.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 10 + "'", obj8, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test217");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 0.0f);
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.equals_CUT((java.lang.Object) 0.0f);
        java.lang.Object[] objArray7 = linkedListTestDriver4.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator9 = linkedListTestDriver8.iterator();
        boolean boolean11 = linkedListTestDriver8.contains((java.lang.Object) '#');
        boolean boolean13 = linkedListTestDriver8.add((java.lang.Object) (byte) 10);
        boolean boolean15 = linkedListTestDriver8.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj16 = linkedListTestDriver8.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator18 = linkedListTestDriver17.iterator();
        boolean boolean20 = linkedListTestDriver17.add((java.lang.Object) false);
        linkedListTestDriver17.addFirst((java.lang.Object) (byte) 1);
        boolean boolean24 = linkedListTestDriver17.contains((java.lang.Object) 100.0d);
        boolean boolean25 = linkedListTestDriver8.contains((java.lang.Object) linkedListTestDriver17);
        experiment.util.Iterator iterator26 = linkedListTestDriver8.iterator();
        linkedListTestDriver4.addLast((java.lang.Object) linkedListTestDriver8);
        java.lang.Object obj28 = linkedListTestDriver4.removeLast();
        boolean boolean29 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver4);
        java.lang.Class<?> wildcardClass30 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) 10 + "'", obj16, (byte) 10);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test218");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.contains((java.lang.Object) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = linkedListTestDriver0.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test219");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator4 = linkedListTestDriver3.iterator();
        boolean boolean6 = linkedListTestDriver3.contains((java.lang.Object) '#');
        boolean boolean8 = linkedListTestDriver3.add((java.lang.Object) (byte) 10);
        boolean boolean10 = linkedListTestDriver3.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean11 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver3);
        boolean boolean13 = linkedListTestDriver3.add((java.lang.Object) 1.0d);
        java.lang.Object obj14 = linkedListTestDriver3.getFirst();
        int int15 = linkedListTestDriver3.size();
        java.lang.Object obj16 = linkedListTestDriver3.getFirst();
        java.lang.Object obj19 = linkedListTestDriver3.set((int) (byte) 0, (java.lang.Object) 1L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) 10 + "'", obj14, (byte) 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) 10 + "'", obj16, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 10 + "'", obj19, (byte) 10);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test220");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 1);
        boolean boolean7 = linkedListTestDriver0.contains((java.lang.Object) 100.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator9 = linkedListTestDriver8.iterator();
        boolean boolean11 = linkedListTestDriver8.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator14 = linkedListTestDriver13.iterator();
        linkedListTestDriver8.add(0, (java.lang.Object) iterator14);
        boolean boolean17 = linkedListTestDriver8.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj18 = linkedListTestDriver8.getFirst();
        java.lang.Object[] objArray19 = linkedListTestDriver8.toArray();
        int int20 = linkedListTestDriver8.size();
        boolean boolean21 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver8);
        java.lang.Class<?> wildcardClass22 = linkedListTestDriver8.getClass();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test221");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator4 = linkedListTestDriver3.iterator();
        boolean boolean6 = linkedListTestDriver3.contains((java.lang.Object) '#');
        boolean boolean8 = linkedListTestDriver3.add((java.lang.Object) (byte) 10);
        boolean boolean10 = linkedListTestDriver3.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean11 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver3);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator14 = linkedListTestDriver13.iterator();
        boolean boolean16 = linkedListTestDriver13.contains((java.lang.Object) '#');
        boolean boolean18 = linkedListTestDriver13.add((java.lang.Object) (byte) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator20 = linkedListTestDriver19.iterator();
        boolean boolean22 = linkedListTestDriver19.contains((java.lang.Object) '#');
        linkedListTestDriver13.addFirst((java.lang.Object) '#');
        java.lang.Object obj24 = linkedListTestDriver13.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        boolean boolean27 = linkedListTestDriver25.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator29 = linkedListTestDriver28.iterator();
        boolean boolean31 = linkedListTestDriver28.contains((java.lang.Object) '#');
        boolean boolean33 = linkedListTestDriver28.add((java.lang.Object) (byte) 10);
        boolean boolean35 = linkedListTestDriver28.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean36 = linkedListTestDriver25.contains((java.lang.Object) linkedListTestDriver28);
        java.lang.Object obj37 = linkedListTestDriver28.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver38 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator39 = linkedListTestDriver38.iterator();
        boolean boolean41 = linkedListTestDriver38.contains((java.lang.Object) '#');
        boolean boolean43 = linkedListTestDriver38.add((java.lang.Object) (byte) 10);
        boolean boolean45 = linkedListTestDriver38.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj46 = linkedListTestDriver38.removeFirst();
        boolean boolean48 = linkedListTestDriver38.remove((java.lang.Object) (byte) 1);
        boolean boolean49 = linkedListTestDriver28.remove((java.lang.Object) linkedListTestDriver38);
        experiment.util.LinkedListTestDriver linkedListTestDriver50 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator51 = linkedListTestDriver50.iterator();
        boolean boolean53 = linkedListTestDriver50.contains((java.lang.Object) '#');
        boolean boolean55 = linkedListTestDriver50.add((java.lang.Object) (byte) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver56 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator57 = linkedListTestDriver56.iterator();
        boolean boolean59 = linkedListTestDriver56.contains((java.lang.Object) '#');
        linkedListTestDriver50.addFirst((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver61 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator62 = linkedListTestDriver61.iterator();
        boolean boolean64 = linkedListTestDriver61.contains((java.lang.Object) '#');
        boolean boolean66 = linkedListTestDriver61.add((java.lang.Object) (byte) 10);
        boolean boolean68 = linkedListTestDriver61.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj69 = linkedListTestDriver61.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver70 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator71 = linkedListTestDriver70.iterator();
        boolean boolean73 = linkedListTestDriver70.add((java.lang.Object) false);
        linkedListTestDriver70.addFirst((java.lang.Object) (byte) 1);
        boolean boolean77 = linkedListTestDriver70.contains((java.lang.Object) 100.0d);
        boolean boolean78 = linkedListTestDriver61.contains((java.lang.Object) linkedListTestDriver70);
        experiment.util.Iterator iterator79 = linkedListTestDriver61.iterator();
        boolean boolean80 = linkedListTestDriver50.equals_CUT((java.lang.Object) iterator79);
        linkedListTestDriver28.addLast((java.lang.Object) iterator79);
        linkedListTestDriver13.addFirst((java.lang.Object) linkedListTestDriver28);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((-1), (java.lang.Object) linkedListTestDriver13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) 10 + "'", obj24, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (byte) 10 + "'", obj37, (byte) 10);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + (byte) 10 + "'", obj46, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(iterator51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(iterator57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(iterator62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + (byte) 10 + "'", obj69, (byte) 10);
        org.junit.Assert.assertNotNull(iterator71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(iterator79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test222");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        boolean boolean5 = linkedListTestDriver3.contains((java.lang.Object) (-1.0f));
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver3);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator10 = linkedListTestDriver9.iterator();
        boolean boolean12 = linkedListTestDriver9.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator15 = linkedListTestDriver14.iterator();
        linkedListTestDriver9.add(0, (java.lang.Object) iterator15);
        java.lang.Object obj17 = linkedListTestDriver9.removeLast();
        java.lang.Object obj18 = linkedListTestDriver0.set(0, (java.lang.Object) linkedListTestDriver9);
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator20 = linkedListTestDriver19.iterator();
        boolean boolean22 = linkedListTestDriver19.contains((java.lang.Object) '#');
        boolean boolean24 = linkedListTestDriver19.add((java.lang.Object) (byte) 10);
        boolean boolean26 = linkedListTestDriver19.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj27 = linkedListTestDriver19.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator29 = linkedListTestDriver28.iterator();
        boolean boolean31 = linkedListTestDriver28.add((java.lang.Object) false);
        linkedListTestDriver28.addFirst((java.lang.Object) (byte) 1);
        boolean boolean35 = linkedListTestDriver28.contains((java.lang.Object) 100.0d);
        boolean boolean36 = linkedListTestDriver19.contains((java.lang.Object) linkedListTestDriver28);
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator38 = linkedListTestDriver37.iterator();
        boolean boolean40 = linkedListTestDriver37.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver42 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator43 = linkedListTestDriver42.iterator();
        linkedListTestDriver37.add(0, (java.lang.Object) iterator43);
        boolean boolean46 = linkedListTestDriver37.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj47 = linkedListTestDriver37.getFirst();
        boolean boolean48 = linkedListTestDriver19.contains((java.lang.Object) linkedListTestDriver37);
        experiment.util.LinkedListTestDriver linkedListTestDriver49 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator50 = linkedListTestDriver49.iterator();
        boolean boolean51 = linkedListTestDriver49.isEmpty();
        boolean boolean52 = linkedListTestDriver37.equals_CUT((java.lang.Object) linkedListTestDriver49);
        boolean boolean53 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver37);
        java.lang.Class<?> wildcardClass54 = linkedListTestDriver37.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + false + "'", obj17, false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (byte) 10 + "'", obj27, (byte) 10);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(iterator43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(iterator50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test223");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator6 = linkedListTestDriver5.iterator();
        linkedListTestDriver0.add(0, (java.lang.Object) iterator6);
        java.lang.Object obj9 = linkedListTestDriver0.remove((int) (short) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver11.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator15 = linkedListTestDriver14.iterator();
        boolean boolean17 = linkedListTestDriver14.contains((java.lang.Object) '#');
        boolean boolean19 = linkedListTestDriver14.add((java.lang.Object) (byte) 10);
        boolean boolean21 = linkedListTestDriver14.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean22 = linkedListTestDriver11.contains((java.lang.Object) linkedListTestDriver14);
        java.lang.Object[] objArray23 = linkedListTestDriver14.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = linkedListTestDriver0.set((int) '#', (java.lang.Object) objArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + false + "'", obj9, false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[10]");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test224");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = linkedListTestDriver0.toArray();
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = linkedListTestDriver0.equals_CUT(obj4);
        boolean boolean7 = linkedListTestDriver0.add((java.lang.Object) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator9 = linkedListTestDriver8.iterator();
        experiment.util.Iterator iterator10 = linkedListTestDriver8.iterator();
        boolean boolean11 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver8);
        int int12 = linkedListTestDriver8.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[hi!]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test225");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator4 = linkedListTestDriver3.iterator();
        boolean boolean6 = linkedListTestDriver3.contains((java.lang.Object) '#');
        boolean boolean8 = linkedListTestDriver3.add((java.lang.Object) (byte) 10);
        boolean boolean10 = linkedListTestDriver3.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean11 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver3);
        java.lang.Object obj12 = linkedListTestDriver3.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator14 = linkedListTestDriver13.iterator();
        boolean boolean16 = linkedListTestDriver13.contains((java.lang.Object) '#');
        boolean boolean18 = linkedListTestDriver13.add((java.lang.Object) (byte) 10);
        boolean boolean20 = linkedListTestDriver13.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj21 = linkedListTestDriver13.removeFirst();
        boolean boolean23 = linkedListTestDriver13.remove((java.lang.Object) (byte) 1);
        boolean boolean24 = linkedListTestDriver3.remove((java.lang.Object) linkedListTestDriver13);
        java.lang.Object obj26 = linkedListTestDriver3.get(0);
        java.lang.Object obj27 = linkedListTestDriver3.removeFirst();
        boolean boolean29 = linkedListTestDriver3.contains((java.lang.Object) 10.0d);
        experiment.util.ListIterator listIterator31 = linkedListTestDriver3.listIterator(0);
        experiment.util.LinkedListTestDriver linkedListTestDriver33 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator34 = linkedListTestDriver33.iterator();
        boolean boolean36 = linkedListTestDriver33.add((java.lang.Object) false);
        linkedListTestDriver33.addFirst((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver39 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator40 = linkedListTestDriver39.iterator();
        boolean boolean41 = linkedListTestDriver33.remove((java.lang.Object) linkedListTestDriver39);
        java.lang.Object obj42 = linkedListTestDriver33.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver43 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator44 = linkedListTestDriver43.iterator();
        boolean boolean46 = linkedListTestDriver43.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver48 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator49 = linkedListTestDriver48.iterator();
        linkedListTestDriver43.add(0, (java.lang.Object) iterator49);
        java.lang.Object obj51 = linkedListTestDriver43.removeFirst();
        java.lang.Object obj52 = linkedListTestDriver43.getLast();
        java.lang.Object[] objArray53 = linkedListTestDriver43.toArray();
        boolean boolean54 = linkedListTestDriver33.equals_CUT((java.lang.Object) linkedListTestDriver43);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj55 = linkedListTestDriver3.set((int) (byte) 10, (java.lang.Object) linkedListTestDriver33);
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
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 10 + "'", obj12, (byte) 10);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 10 + "'", obj21, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) 10 + "'", obj26, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (byte) 10 + "'", obj27, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(listIterator31);
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(iterator40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + false + "'", obj42, false);
        org.junit.Assert.assertNotNull(iterator44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(iterator49);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + false + "'", obj52, false);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[false]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test226");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator6 = linkedListTestDriver5.iterator();
        linkedListTestDriver0.add(0, (java.lang.Object) iterator6);
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj10 = linkedListTestDriver0.getFirst();
        java.lang.Object[] objArray11 = linkedListTestDriver0.toArray();
        boolean boolean12 = linkedListTestDriver0.isEmpty();
        java.lang.Object obj13 = linkedListTestDriver0.removeFirst();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test227");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = linkedListTestDriver0.toArray();
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = linkedListTestDriver0.equals_CUT(obj4);
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator8 = linkedListTestDriver7.iterator();
        boolean boolean10 = linkedListTestDriver7.contains((java.lang.Object) '#');
        boolean boolean12 = linkedListTestDriver7.add((java.lang.Object) (byte) 10);
        boolean boolean14 = linkedListTestDriver7.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj15 = linkedListTestDriver7.removeFirst();
        java.lang.Object obj16 = linkedListTestDriver0.set((int) (byte) 0, obj15);
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver18.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator22 = linkedListTestDriver21.iterator();
        boolean boolean24 = linkedListTestDriver21.contains((java.lang.Object) '#');
        boolean boolean26 = linkedListTestDriver21.add((java.lang.Object) (byte) 10);
        boolean boolean28 = linkedListTestDriver21.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean29 = linkedListTestDriver18.contains((java.lang.Object) linkedListTestDriver21);
        java.lang.Object[] objArray30 = linkedListTestDriver21.toArray();
        boolean boolean31 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver21);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[hi!]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) 10 + "'", obj15, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "hi!" + "'", obj16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[10]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test228");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator4 = linkedListTestDriver3.iterator();
        boolean boolean6 = linkedListTestDriver3.contains((java.lang.Object) '#');
        boolean boolean8 = linkedListTestDriver3.add((java.lang.Object) (byte) 10);
        boolean boolean10 = linkedListTestDriver3.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean11 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver3);
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        boolean boolean14 = linkedListTestDriver12.equals_CUT((java.lang.Object) 0.0f);
        linkedListTestDriver12.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        boolean boolean18 = linkedListTestDriver16.equals_CUT((java.lang.Object) 0.0f);
        java.lang.Object[] objArray19 = linkedListTestDriver16.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator21 = linkedListTestDriver20.iterator();
        boolean boolean23 = linkedListTestDriver20.contains((java.lang.Object) '#');
        boolean boolean25 = linkedListTestDriver20.add((java.lang.Object) (byte) 10);
        boolean boolean27 = linkedListTestDriver20.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj28 = linkedListTestDriver20.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator30 = linkedListTestDriver29.iterator();
        boolean boolean32 = linkedListTestDriver29.add((java.lang.Object) false);
        linkedListTestDriver29.addFirst((java.lang.Object) (byte) 1);
        boolean boolean36 = linkedListTestDriver29.contains((java.lang.Object) 100.0d);
        boolean boolean37 = linkedListTestDriver20.contains((java.lang.Object) linkedListTestDriver29);
        experiment.util.Iterator iterator38 = linkedListTestDriver20.iterator();
        linkedListTestDriver16.addLast((java.lang.Object) linkedListTestDriver20);
        java.lang.Object obj40 = linkedListTestDriver16.removeLast();
        boolean boolean41 = linkedListTestDriver12.equals_CUT((java.lang.Object) linkedListTestDriver16);
        boolean boolean42 = linkedListTestDriver3.equals_CUT((java.lang.Object) linkedListTestDriver12);
        experiment.util.LinkedListTestDriver linkedListTestDriver44 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator45 = linkedListTestDriver44.iterator();
        boolean boolean47 = linkedListTestDriver44.contains((java.lang.Object) '#');
        boolean boolean49 = linkedListTestDriver44.add((java.lang.Object) (byte) 10);
        boolean boolean51 = linkedListTestDriver44.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj52 = linkedListTestDriver44.removeFirst();
        java.lang.Object obj53 = linkedListTestDriver3.set(0, obj52);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj55 = linkedListTestDriver3.get(4);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (byte) 10 + "'", obj28, (byte) 10);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(iterator45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + (byte) 10 + "'", obj52, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + (byte) 10 + "'", obj53, (byte) 10);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test229");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 1);
        boolean boolean7 = linkedListTestDriver0.contains((java.lang.Object) 100.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator9 = linkedListTestDriver8.iterator();
        boolean boolean11 = linkedListTestDriver8.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator14 = linkedListTestDriver13.iterator();
        linkedListTestDriver8.add(0, (java.lang.Object) iterator14);
        boolean boolean17 = linkedListTestDriver8.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj18 = linkedListTestDriver8.getFirst();
        java.lang.Object[] objArray19 = linkedListTestDriver8.toArray();
        int int20 = linkedListTestDriver8.size();
        boolean boolean21 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver8);
        java.lang.Object obj23 = linkedListTestDriver8.get(1);
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + false + "'", obj23, false);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test230");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        boolean boolean5 = linkedListTestDriver3.contains((java.lang.Object) (-1.0f));
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver3);
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator8 = linkedListTestDriver7.iterator();
        boolean boolean10 = linkedListTestDriver7.add((java.lang.Object) false);
        linkedListTestDriver7.addFirst((java.lang.Object) (byte) 1);
        boolean boolean14 = linkedListTestDriver7.contains((java.lang.Object) 100.0d);
        boolean boolean15 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver7);
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator17 = linkedListTestDriver16.iterator();
        boolean boolean19 = linkedListTestDriver16.add((java.lang.Object) false);
        linkedListTestDriver16.addFirst((java.lang.Object) (byte) 1);
        java.lang.Object[] objArray22 = linkedListTestDriver16.toArray();
        boolean boolean23 = linkedListTestDriver7.contains((java.lang.Object) objArray22);
        java.lang.Object obj24 = linkedListTestDriver7.removeLast();
        java.lang.Object obj25 = linkedListTestDriver7.removeFirst();
        java.lang.Object[] objArray26 = linkedListTestDriver7.toArray();
        boolean boolean27 = linkedListTestDriver7.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1, false]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + false + "'", obj24, false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) 1 + "'", obj25, (byte) 1);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test231");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 1);
        java.lang.Object[] objArray6 = linkedListTestDriver0.toArray();
        java.lang.Object obj8 = linkedListTestDriver0.get(1);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        boolean boolean12 = linkedListTestDriver10.add((java.lang.Object) "hi!");
        java.lang.Object[] objArray13 = linkedListTestDriver10.toArray();
        java.lang.Object obj14 = new java.lang.Object();
        boolean boolean15 = linkedListTestDriver10.equals_CUT(obj14);
        boolean boolean17 = linkedListTestDriver10.add((java.lang.Object) 0);
        java.lang.Object obj18 = linkedListTestDriver10.getFirst();
        java.lang.Object obj19 = linkedListTestDriver10.removeFirst();
        boolean boolean20 = linkedListTestDriver10.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) (byte) 10, (java.lang.Object) linkedListTestDriver10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, false]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + false + "'", obj8, false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[hi!]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "hi!" + "'", obj18, "hi!");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "hi!" + "'", obj19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test232");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator4 = linkedListTestDriver3.iterator();
        boolean boolean6 = linkedListTestDriver3.contains((java.lang.Object) '#');
        boolean boolean8 = linkedListTestDriver3.add((java.lang.Object) (byte) 10);
        boolean boolean10 = linkedListTestDriver3.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean11 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver3);
        java.lang.Object[] objArray12 = linkedListTestDriver3.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator14 = linkedListTestDriver13.iterator();
        boolean boolean16 = linkedListTestDriver13.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator19 = linkedListTestDriver18.iterator();
        linkedListTestDriver13.add(0, (java.lang.Object) iterator19);
        boolean boolean22 = linkedListTestDriver13.remove((java.lang.Object) (byte) 0);
        boolean boolean23 = linkedListTestDriver13.isEmpty();
        boolean boolean25 = linkedListTestDriver13.contains((java.lang.Object) "hi!");
        linkedListTestDriver3.addFirst((java.lang.Object) "hi!");
        java.lang.Object obj27 = linkedListTestDriver3.getLast();
        experiment.util.ListIterator listIterator29 = linkedListTestDriver3.listIterator((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[10]");
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (byte) 10 + "'", obj27, (byte) 10);
        org.junit.Assert.assertNotNull(listIterator29);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test233");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) (-1.0d));
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        java.lang.Object[] objArray4 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator6 = linkedListTestDriver5.iterator();
        boolean boolean8 = linkedListTestDriver5.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator11 = linkedListTestDriver10.iterator();
        linkedListTestDriver5.add(0, (java.lang.Object) iterator11);
        boolean boolean14 = linkedListTestDriver5.remove((java.lang.Object) (byte) 0);
        experiment.util.Iterator iterator15 = linkedListTestDriver5.iterator();
        java.lang.Object obj16 = linkedListTestDriver5.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        boolean boolean18 = linkedListTestDriver5.contains((java.lang.Object) linkedListTestDriver17);
        int int19 = linkedListTestDriver5.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator21 = linkedListTestDriver20.iterator();
        boolean boolean23 = linkedListTestDriver20.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator26 = linkedListTestDriver25.iterator();
        linkedListTestDriver20.add(0, (java.lang.Object) iterator26);
        java.lang.Object obj29 = linkedListTestDriver20.remove(0);
        linkedListTestDriver5.addLast((java.lang.Object) linkedListTestDriver20);
        boolean boolean31 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver20);
        java.lang.Object obj32 = linkedListTestDriver0.removeLast();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (-1.0d) + "'", obj3, (-1.0d));
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1.0]");
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (-1.0d) + "'", obj32, (-1.0d));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test234");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator4 = linkedListTestDriver3.iterator();
        boolean boolean6 = linkedListTestDriver3.contains((java.lang.Object) '#');
        boolean boolean8 = linkedListTestDriver3.add((java.lang.Object) (byte) 10);
        boolean boolean10 = linkedListTestDriver3.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean11 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver3);
        java.lang.Object obj12 = linkedListTestDriver3.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator14 = linkedListTestDriver13.iterator();
        boolean boolean16 = linkedListTestDriver13.contains((java.lang.Object) '#');
        boolean boolean18 = linkedListTestDriver13.add((java.lang.Object) (byte) 10);
        boolean boolean20 = linkedListTestDriver13.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj21 = linkedListTestDriver13.removeFirst();
        boolean boolean23 = linkedListTestDriver13.remove((java.lang.Object) (byte) 1);
        boolean boolean24 = linkedListTestDriver3.remove((java.lang.Object) linkedListTestDriver13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = linkedListTestDriver13.remove((int) (byte) 10);
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
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 10 + "'", obj12, (byte) 10);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 10 + "'", obj21, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test235");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.contains((java.lang.Object) '#');
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (byte) 10);
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj8 = linkedListTestDriver0.removeFirst();
        boolean boolean10 = linkedListTestDriver0.remove((java.lang.Object) (byte) 1);
        boolean boolean11 = linkedListTestDriver0.isEmpty();
        boolean boolean12 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator15 = linkedListTestDriver14.iterator();
        boolean boolean17 = linkedListTestDriver14.add((java.lang.Object) false);
        linkedListTestDriver14.addFirst((java.lang.Object) (byte) 1);
        linkedListTestDriver14.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = linkedListTestDriver0.set(0, (java.lang.Object) linkedListTestDriver14);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 10 + "'", obj8, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test236");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) (-1.0d));
        boolean boolean4 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        java.lang.Object obj5 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.contains((java.lang.Object) (-1.0f));
        linkedListTestDriver6.addFirst((java.lang.Object) linkedListTestDriver9);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator14 = linkedListTestDriver13.iterator();
        boolean boolean16 = linkedListTestDriver13.add((java.lang.Object) false);
        linkedListTestDriver13.addFirst((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator20 = linkedListTestDriver19.iterator();
        boolean boolean21 = linkedListTestDriver13.remove((java.lang.Object) linkedListTestDriver19);
        java.lang.Object obj22 = linkedListTestDriver13.getLast();
        int int23 = linkedListTestDriver13.size();
        java.lang.Object obj24 = linkedListTestDriver13.getFirst();
        boolean boolean25 = linkedListTestDriver9.contains((java.lang.Object) linkedListTestDriver13);
        boolean boolean26 = linkedListTestDriver13.isEmpty();
        boolean boolean27 = linkedListTestDriver0.equals_CUT((java.lang.Object) boolean26);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + false + "'", obj22, false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) 1 + "'", obj24, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test237");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 1);
        java.lang.Object[] objArray6 = linkedListTestDriver0.toArray();
        java.lang.Object obj7 = linkedListTestDriver0.removeFirst();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, false]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 1 + "'", obj7, (byte) 1);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test238");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.contains((java.lang.Object) '#');
        boolean boolean4 = linkedListTestDriver0.isEmpty();
        boolean boolean6 = linkedListTestDriver0.equals_CUT((java.lang.Object) (short) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator8 = linkedListTestDriver7.iterator();
        boolean boolean10 = linkedListTestDriver7.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator13 = linkedListTestDriver12.iterator();
        linkedListTestDriver7.add(0, (java.lang.Object) iterator13);
        boolean boolean16 = linkedListTestDriver7.remove((java.lang.Object) (byte) 0);
        experiment.util.Iterator iterator17 = linkedListTestDriver7.iterator();
        java.lang.Object obj18 = linkedListTestDriver7.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver7.contains((java.lang.Object) linkedListTestDriver19);
        boolean boolean21 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = linkedListTestDriver0.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test239");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator6 = linkedListTestDriver5.iterator();
        linkedListTestDriver0.add(0, (java.lang.Object) iterator6);
        java.lang.Object obj8 = linkedListTestDriver0.removeLast();
        java.lang.Object[] objArray9 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator11 = linkedListTestDriver10.iterator();
        boolean boolean13 = linkedListTestDriver10.contains((java.lang.Object) '#');
        boolean boolean15 = linkedListTestDriver10.add((java.lang.Object) (byte) 10);
        boolean boolean17 = linkedListTestDriver10.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj18 = linkedListTestDriver10.removeFirst();
        boolean boolean20 = linkedListTestDriver10.remove((java.lang.Object) (byte) 1);
        boolean boolean21 = linkedListTestDriver10.isEmpty();
        boolean boolean22 = linkedListTestDriver10.isEmpty();
        java.lang.Object[] objArray23 = linkedListTestDriver10.toArray();
        linkedListTestDriver0.addLast((java.lang.Object) objArray23);
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + false + "'", obj8, false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) 10 + "'", obj18, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test240");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 1);
        java.lang.Object[] objArray6 = linkedListTestDriver0.toArray();
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        boolean boolean14 = linkedListTestDriver12.contains((java.lang.Object) (-1.0f));
        linkedListTestDriver9.addFirst((java.lang.Object) linkedListTestDriver12);
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator17 = linkedListTestDriver16.iterator();
        boolean boolean19 = linkedListTestDriver16.add((java.lang.Object) false);
        linkedListTestDriver16.addFirst((java.lang.Object) (byte) 1);
        boolean boolean23 = linkedListTestDriver16.contains((java.lang.Object) 100.0d);
        boolean boolean24 = linkedListTestDriver9.contains((java.lang.Object) linkedListTestDriver16);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator26 = linkedListTestDriver25.iterator();
        boolean boolean28 = linkedListTestDriver25.add((java.lang.Object) false);
        linkedListTestDriver25.addFirst((java.lang.Object) (byte) 1);
        java.lang.Object[] objArray31 = linkedListTestDriver25.toArray();
        boolean boolean32 = linkedListTestDriver16.contains((java.lang.Object) objArray31);
        java.lang.Object obj33 = linkedListTestDriver16.removeLast();
        boolean boolean34 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver16);
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, false]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[1, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[1, false]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + false + "'", obj33, false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test241");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator4 = linkedListTestDriver3.iterator();
        boolean boolean6 = linkedListTestDriver3.contains((java.lang.Object) '#');
        boolean boolean8 = linkedListTestDriver3.add((java.lang.Object) (byte) 10);
        boolean boolean10 = linkedListTestDriver3.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean11 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver3);
        java.lang.Object obj12 = linkedListTestDriver3.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator14 = linkedListTestDriver13.iterator();
        boolean boolean16 = linkedListTestDriver13.contains((java.lang.Object) '#');
        boolean boolean18 = linkedListTestDriver13.add((java.lang.Object) (byte) 10);
        boolean boolean20 = linkedListTestDriver13.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj21 = linkedListTestDriver13.removeFirst();
        boolean boolean23 = linkedListTestDriver13.remove((java.lang.Object) (byte) 1);
        boolean boolean24 = linkedListTestDriver3.remove((java.lang.Object) linkedListTestDriver13);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator26 = linkedListTestDriver25.iterator();
        experiment.util.Iterator iterator27 = linkedListTestDriver25.iterator();
        linkedListTestDriver13.addFirst((java.lang.Object) linkedListTestDriver25);
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator30 = linkedListTestDriver29.iterator();
        boolean boolean32 = linkedListTestDriver29.contains((java.lang.Object) '#');
        boolean boolean33 = linkedListTestDriver29.isEmpty();
        boolean boolean35 = linkedListTestDriver29.equals_CUT((java.lang.Object) (short) 1);
        boolean boolean36 = linkedListTestDriver13.add((java.lang.Object) linkedListTestDriver29);
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        boolean boolean39 = linkedListTestDriver37.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver40 = new experiment.util.LinkedListTestDriver();
        boolean boolean42 = linkedListTestDriver40.contains((java.lang.Object) (-1.0f));
        linkedListTestDriver37.addFirst((java.lang.Object) linkedListTestDriver40);
        experiment.util.Iterator iterator44 = linkedListTestDriver37.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver46 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator47 = linkedListTestDriver46.iterator();
        boolean boolean49 = linkedListTestDriver46.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver51 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator52 = linkedListTestDriver51.iterator();
        linkedListTestDriver46.add(0, (java.lang.Object) iterator52);
        java.lang.Object obj54 = linkedListTestDriver46.removeLast();
        java.lang.Object obj55 = linkedListTestDriver37.set(0, (java.lang.Object) linkedListTestDriver46);
        linkedListTestDriver13.addFirst((java.lang.Object) linkedListTestDriver37);
        experiment.util.LinkedListTestDriver linkedListTestDriver58 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator59 = linkedListTestDriver58.iterator();
        boolean boolean61 = linkedListTestDriver58.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver63 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator64 = linkedListTestDriver63.iterator();
        linkedListTestDriver58.add(0, (java.lang.Object) iterator64);
        java.lang.Object obj67 = linkedListTestDriver58.remove((int) (short) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver68 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator69 = linkedListTestDriver68.iterator();
        boolean boolean71 = linkedListTestDriver68.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver73 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator74 = linkedListTestDriver73.iterator();
        linkedListTestDriver68.add(0, (java.lang.Object) iterator74);
        boolean boolean77 = linkedListTestDriver68.remove((java.lang.Object) (byte) 0);
        experiment.util.Iterator iterator78 = linkedListTestDriver68.iterator();
        java.lang.Object obj79 = linkedListTestDriver68.removeFirst();
        boolean boolean80 = linkedListTestDriver68.isEmpty();
        boolean boolean81 = linkedListTestDriver58.equals_CUT((java.lang.Object) linkedListTestDriver68);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver13.add((int) (short) 100, (java.lang.Object) boolean81);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 100; size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 10 + "'", obj12, (byte) 10);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 10 + "'", obj21, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(iterator44);
        org.junit.Assert.assertNotNull(iterator47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(iterator52);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + false + "'", obj54, false);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertNotNull(iterator59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(iterator64);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + false + "'", obj67, false);
        org.junit.Assert.assertNotNull(iterator69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(iterator74);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(iterator78);
        org.junit.Assert.assertNotNull(obj79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test242");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) (-1.0d));
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        java.lang.Object[] objArray4 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator6 = linkedListTestDriver5.iterator();
        boolean boolean8 = linkedListTestDriver5.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator11 = linkedListTestDriver10.iterator();
        linkedListTestDriver5.add(0, (java.lang.Object) iterator11);
        boolean boolean14 = linkedListTestDriver5.remove((java.lang.Object) (byte) 0);
        experiment.util.Iterator iterator15 = linkedListTestDriver5.iterator();
        java.lang.Object obj16 = linkedListTestDriver5.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        boolean boolean18 = linkedListTestDriver5.contains((java.lang.Object) linkedListTestDriver17);
        int int19 = linkedListTestDriver5.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator21 = linkedListTestDriver20.iterator();
        boolean boolean23 = linkedListTestDriver20.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator26 = linkedListTestDriver25.iterator();
        linkedListTestDriver20.add(0, (java.lang.Object) iterator26);
        java.lang.Object obj29 = linkedListTestDriver20.remove(0);
        linkedListTestDriver5.addLast((java.lang.Object) linkedListTestDriver20);
        boolean boolean31 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver20);
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        boolean boolean34 = linkedListTestDriver32.contains((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver35 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator36 = linkedListTestDriver35.iterator();
        boolean boolean38 = linkedListTestDriver35.contains((java.lang.Object) '#');
        boolean boolean40 = linkedListTestDriver35.add((java.lang.Object) (byte) 10);
        boolean boolean42 = linkedListTestDriver35.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean43 = linkedListTestDriver32.contains((java.lang.Object) linkedListTestDriver35);
        java.lang.Object obj44 = linkedListTestDriver35.getLast();
        java.lang.Object obj45 = linkedListTestDriver35.getLast();
        java.lang.Object obj46 = linkedListTestDriver35.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver47 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator48 = linkedListTestDriver47.iterator();
        boolean boolean50 = linkedListTestDriver47.contains((java.lang.Object) '#');
        boolean boolean52 = linkedListTestDriver47.add((java.lang.Object) (byte) 10);
        boolean boolean54 = linkedListTestDriver47.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj55 = linkedListTestDriver47.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver56 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator57 = linkedListTestDriver56.iterator();
        boolean boolean59 = linkedListTestDriver56.add((java.lang.Object) false);
        linkedListTestDriver56.addFirst((java.lang.Object) (byte) 1);
        boolean boolean63 = linkedListTestDriver56.contains((java.lang.Object) 100.0d);
        boolean boolean64 = linkedListTestDriver47.contains((java.lang.Object) linkedListTestDriver56);
        experiment.util.Iterator iterator65 = linkedListTestDriver47.iterator();
        boolean boolean66 = linkedListTestDriver35.add((java.lang.Object) iterator65);
        linkedListTestDriver0.addFirst((java.lang.Object) iterator65);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (-1.0d) + "'", obj3, (-1.0d));
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1.0]");
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + (byte) 10 + "'", obj44, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (byte) 10 + "'", obj45, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + (byte) 10 + "'", obj46, (byte) 10);
        org.junit.Assert.assertNotNull(iterator48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + (byte) 10 + "'", obj55, (byte) 10);
        org.junit.Assert.assertNotNull(iterator57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(iterator65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test243");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.contains((java.lang.Object) '#');
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (byte) 10);
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Object obj8 = linkedListTestDriver0.removeFirst();
        boolean boolean10 = linkedListTestDriver0.remove((java.lang.Object) (byte) 1);
        boolean boolean11 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = linkedListTestDriver0.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 10 + "'", obj8, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test244");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator7 = linkedListTestDriver6.iterator();
        boolean boolean8 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver6);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator11 = linkedListTestDriver10.iterator();
        boolean boolean13 = linkedListTestDriver10.contains((java.lang.Object) '#');
        boolean boolean15 = linkedListTestDriver10.add((java.lang.Object) (byte) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator17 = linkedListTestDriver16.iterator();
        boolean boolean19 = linkedListTestDriver16.contains((java.lang.Object) '#');
        linkedListTestDriver10.addFirst((java.lang.Object) '#');
        linkedListTestDriver0.add((int) (short) 1, (java.lang.Object) '#');
        java.lang.Object obj22 = linkedListTestDriver0.removeLast();
        experiment.util.Iterator iterator23 = linkedListTestDriver0.iterator();
        java.lang.Object obj24 = linkedListTestDriver0.getLast();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + false + "'", obj22, false);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + '#' + "'", obj24, '#');
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test245");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator6 = linkedListTestDriver5.iterator();
        linkedListTestDriver0.add(0, (java.lang.Object) iterator6);
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj10 = linkedListTestDriver0.getLast();
        int int11 = linkedListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator13 = linkedListTestDriver0.listIterator((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 35; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test246");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        experiment.util.Iterator iterator2 = linkedListTestDriver0.iterator();
        experiment.util.ListIterator listIterator4 = linkedListTestDriver0.listIterator(0);
        linkedListTestDriver0.clear();
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        boolean boolean7 = linkedListTestDriver0.isEmpty();
        linkedListTestDriver0.clear();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(listIterator4);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test247");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) (-1.0d));
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        java.lang.Object obj4 = linkedListTestDriver0.getFirst();
        java.lang.Object obj5 = linkedListTestDriver0.removeLast();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (-1.0d) + "'", obj3, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0d) + "'", obj4, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test248");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 1);
        java.lang.Object[] objArray6 = linkedListTestDriver0.toArray();
        java.lang.Object obj8 = linkedListTestDriver0.get(1);
        boolean boolean10 = linkedListTestDriver0.remove((java.lang.Object) 1.0f);
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, false]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + false + "'", obj8, false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test249");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator6 = linkedListTestDriver5.iterator();
        linkedListTestDriver0.add(0, (java.lang.Object) iterator6);
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) (byte) 0);
        experiment.util.Iterator iterator10 = linkedListTestDriver0.iterator();
        java.lang.Object obj11 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver12);
        int int14 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        boolean boolean18 = linkedListTestDriver16.add((java.lang.Object) "hi!");
        java.lang.Object[] objArray19 = linkedListTestDriver16.toArray();
        java.lang.Object obj20 = new java.lang.Object();
        boolean boolean21 = linkedListTestDriver16.equals_CUT(obj20);
        boolean boolean23 = linkedListTestDriver16.add((java.lang.Object) 0);
        java.lang.Object obj24 = linkedListTestDriver0.set(0, (java.lang.Object) 0);
        java.lang.Object obj25 = linkedListTestDriver0.getLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = linkedListTestDriver0.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[hi!]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + false + "'", obj24, false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 0 + "'", obj25, 0);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test250");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator7 = linkedListTestDriver6.iterator();
        boolean boolean8 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver6);
        int int9 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator11 = linkedListTestDriver10.iterator();
        boolean boolean13 = linkedListTestDriver10.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator16 = linkedListTestDriver15.iterator();
        linkedListTestDriver10.add(0, (java.lang.Object) iterator16);
        java.lang.Object obj19 = linkedListTestDriver10.remove(0);
        boolean boolean20 = linkedListTestDriver0.equals_CUT((java.lang.Object) 0);
        boolean boolean21 = linkedListTestDriver0.isEmpty();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test251");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator7 = linkedListTestDriver6.iterator();
        boolean boolean8 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver6);
        java.lang.Object obj9 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator11 = linkedListTestDriver10.iterator();
        boolean boolean13 = linkedListTestDriver10.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator16 = linkedListTestDriver15.iterator();
        linkedListTestDriver10.add(0, (java.lang.Object) iterator16);
        java.lang.Object obj18 = linkedListTestDriver10.removeFirst();
        java.lang.Object obj19 = linkedListTestDriver10.getLast();
        java.lang.Object[] objArray20 = linkedListTestDriver10.toArray();
        boolean boolean21 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver10);
        java.lang.Object[] objArray22 = linkedListTestDriver10.toArray();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + false + "'", obj9, false);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + false + "'", obj19, false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[false]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[false]");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test252");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator6 = linkedListTestDriver5.iterator();
        linkedListTestDriver0.add(0, (java.lang.Object) iterator6);
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) (byte) 0);
        experiment.util.Iterator iterator10 = linkedListTestDriver0.iterator();
        java.lang.Object obj11 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver12);
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator15 = linkedListTestDriver14.iterator();
        boolean boolean17 = linkedListTestDriver14.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator20 = linkedListTestDriver19.iterator();
        linkedListTestDriver14.add(0, (java.lang.Object) iterator20);
        boolean boolean22 = linkedListTestDriver14.isEmpty();
        java.lang.Object obj23 = linkedListTestDriver14.removeLast();
        java.lang.Object obj24 = linkedListTestDriver14.removeLast();
        boolean boolean25 = linkedListTestDriver12.equals_CUT(obj24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = linkedListTestDriver12.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + false + "'", obj23, false);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test253");
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
        experiment.util.Iterator iterator18 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        boolean boolean21 = linkedListTestDriver19.add((java.lang.Object) (-1.0d));
        java.lang.Object obj22 = linkedListTestDriver19.getFirst();
        java.lang.Object[] objArray23 = linkedListTestDriver19.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator25 = linkedListTestDriver24.iterator();
        boolean boolean27 = linkedListTestDriver24.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator30 = linkedListTestDriver29.iterator();
        linkedListTestDriver24.add(0, (java.lang.Object) iterator30);
        boolean boolean33 = linkedListTestDriver24.remove((java.lang.Object) (byte) 0);
        experiment.util.Iterator iterator34 = linkedListTestDriver24.iterator();
        java.lang.Object obj35 = linkedListTestDriver24.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver36 = new experiment.util.LinkedListTestDriver();
        boolean boolean37 = linkedListTestDriver24.contains((java.lang.Object) linkedListTestDriver36);
        int int38 = linkedListTestDriver24.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver39 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator40 = linkedListTestDriver39.iterator();
        boolean boolean42 = linkedListTestDriver39.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver44 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator45 = linkedListTestDriver44.iterator();
        linkedListTestDriver39.add(0, (java.lang.Object) iterator45);
        java.lang.Object obj48 = linkedListTestDriver39.remove(0);
        linkedListTestDriver24.addLast((java.lang.Object) linkedListTestDriver39);
        boolean boolean50 = linkedListTestDriver19.remove((java.lang.Object) linkedListTestDriver39);
        boolean boolean51 = linkedListTestDriver0.add((java.lang.Object) boolean50);
        experiment.util.LinkedListTestDriver linkedListTestDriver52 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator53 = linkedListTestDriver52.iterator();
        boolean boolean55 = linkedListTestDriver52.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver57 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator58 = linkedListTestDriver57.iterator();
        linkedListTestDriver52.add(0, (java.lang.Object) iterator58);
        java.lang.Object obj60 = linkedListTestDriver52.removeFirst();
        java.lang.Object obj61 = linkedListTestDriver52.getLast();
        java.lang.Object[] objArray62 = linkedListTestDriver52.toArray();
        boolean boolean63 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver52);
        java.lang.Object[] objArray64 = linkedListTestDriver0.toArray();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 10 + "'", obj8, (byte) 10);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (-1.0d) + "'", obj22, (-1.0d));
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[-1.0]");
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(iterator40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(iterator45);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(iterator53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(iterator58);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + false + "'", obj61, false);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[false]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(objArray64);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test254");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator6 = linkedListTestDriver5.iterator();
        linkedListTestDriver0.add(0, (java.lang.Object) iterator6);
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator9 = linkedListTestDriver8.iterator();
        boolean boolean11 = linkedListTestDriver8.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator14 = linkedListTestDriver13.iterator();
        linkedListTestDriver8.add(0, (java.lang.Object) iterator14);
        boolean boolean17 = linkedListTestDriver8.remove((java.lang.Object) (byte) 0);
        experiment.util.Iterator iterator18 = linkedListTestDriver8.iterator();
        java.lang.Object obj19 = linkedListTestDriver8.removeFirst();
        boolean boolean20 = linkedListTestDriver8.isEmpty();
        boolean boolean21 = linkedListTestDriver0.equals_CUT((java.lang.Object) boolean20);
        boolean boolean22 = linkedListTestDriver0.isEmpty();
        int int23 = linkedListTestDriver0.size();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test255");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator6 = linkedListTestDriver5.iterator();
        linkedListTestDriver0.add(0, (java.lang.Object) iterator6);
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj10 = linkedListTestDriver0.getFirst();
        experiment.util.Iterator iterator11 = linkedListTestDriver0.iterator();
        int int12 = linkedListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = linkedListTestDriver0.get((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1191369007_1024_0.test256");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        boolean boolean3 = linkedListTestDriver0.contains((java.lang.Object) '#');
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (byte) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator7 = linkedListTestDriver6.iterator();
        boolean boolean9 = linkedListTestDriver6.contains((java.lang.Object) '#');
        linkedListTestDriver0.addFirst((java.lang.Object) '#');
        java.lang.Object obj11 = linkedListTestDriver0.removeFirst();
        boolean boolean13 = linkedListTestDriver0.remove((java.lang.Object) 1.0d);
        experiment.util.Iterator iterator14 = linkedListTestDriver0.iterator();
        java.lang.Class<?> wildcardClass15 = iterator14.getClass();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '#' + "'", obj11, '#');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

}
