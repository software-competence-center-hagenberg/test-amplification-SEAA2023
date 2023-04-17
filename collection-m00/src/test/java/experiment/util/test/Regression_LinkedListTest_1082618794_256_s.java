package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_LinkedListTest_1082618794_256_s {

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
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test001");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) ' ', (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 32; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test002");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) (byte) 10, (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test003");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
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
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test004");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = linkedListTestDriver0.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test005");
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
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test006");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        boolean boolean4 = linkedListTestDriver0.contains((java.lang.Object) true);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) 'a', (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 97; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test007");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.addFirst(obj3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test008");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) true);
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = linkedListTestDriver0.equals_CUT(obj3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test009");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test010");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = linkedListTestDriver0.remove((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test011");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        boolean boolean5 = linkedListTestDriver3.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver3.addLast((java.lang.Object) 100);
        boolean boolean8 = linkedListTestDriver3.isEmpty();
        java.lang.Class<?> wildcardClass9 = linkedListTestDriver3.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) wildcardClass9);
        int int11 = linkedListTestDriver0.size();
        java.lang.Object obj12 = linkedListTestDriver0.getLast();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) (short) 10, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "class experiment.util.LinkedListTestDriver");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test012");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = linkedListTestDriver0.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test013");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = linkedListTestDriver6.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test014");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = linkedListTestDriver0.remove((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test015");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = linkedListTestDriver0.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test016");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) true);
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = linkedListTestDriver0.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test017");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        boolean boolean5 = linkedListTestDriver3.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver3.addLast((java.lang.Object) 100);
        boolean boolean8 = linkedListTestDriver3.isEmpty();
        java.lang.Class<?> wildcardClass9 = linkedListTestDriver3.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) wildcardClass9);
        int int11 = linkedListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = linkedListTestDriver0.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test018");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        java.lang.Object[] objArray3 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver9.addLast((java.lang.Object) 100);
        boolean boolean14 = linkedListTestDriver9.isEmpty();
        java.lang.Class<?> wildcardClass15 = linkedListTestDriver9.getClass();
        linkedListTestDriver6.addLast((java.lang.Object) wildcardClass15);
        boolean boolean17 = linkedListTestDriver5.equals_CUT((java.lang.Object) wildcardClass15);
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver18.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator21 = linkedListTestDriver18.iterator();
        linkedListTestDriver5.addFirst((java.lang.Object) iterator21);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) '4', (java.lang.Object) linkedListTestDriver5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 52; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(iterator21);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test019");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        java.lang.Object[] objArray3 = linkedListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = linkedListTestDriver0.getLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test020");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        boolean boolean3 = linkedListTestDriver1.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver4.addLast((java.lang.Object) 100);
        boolean boolean9 = linkedListTestDriver4.isEmpty();
        java.lang.Class<?> wildcardClass10 = linkedListTestDriver4.getClass();
        linkedListTestDriver1.addLast((java.lang.Object) wildcardClass10);
        boolean boolean12 = linkedListTestDriver0.equals_CUT((java.lang.Object) wildcardClass10);
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) (byte) -1, (java.lang.Object) linkedListTestDriver14);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test021");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean4 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver9.addLast((java.lang.Object) 100);
        boolean boolean14 = linkedListTestDriver9.isEmpty();
        java.lang.Class<?> wildcardClass15 = linkedListTestDriver9.getClass();
        linkedListTestDriver6.addLast((java.lang.Object) wildcardClass15);
        boolean boolean17 = linkedListTestDriver5.equals_CUT((java.lang.Object) wildcardClass15);
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver18.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator21 = linkedListTestDriver18.iterator();
        linkedListTestDriver5.addFirst((java.lang.Object) iterator21);
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = linkedListTestDriver5.remove((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(iterator21);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test022");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        boolean boolean3 = linkedListTestDriver1.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver4.addLast((java.lang.Object) 100);
        boolean boolean9 = linkedListTestDriver4.isEmpty();
        java.lang.Class<?> wildcardClass10 = linkedListTestDriver4.getClass();
        linkedListTestDriver1.addLast((java.lang.Object) wildcardClass10);
        boolean boolean12 = linkedListTestDriver0.equals_CUT((java.lang.Object) wildcardClass10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test023");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        boolean boolean4 = linkedListTestDriver0.contains((java.lang.Object) true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = linkedListTestDriver0.remove((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test024");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator7 = linkedListTestDriver4.iterator();
        boolean boolean8 = linkedListTestDriver4.isEmpty();
        boolean boolean9 = linkedListTestDriver0.contains((java.lang.Object) boolean8);
        linkedListTestDriver0.addFirst((java.lang.Object) 10L);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator13 = linkedListTestDriver0.listIterator((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 35; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test025");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        int int5 = linkedListTestDriver0.size();
        int int6 = linkedListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = linkedListTestDriver0.remove((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test026");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        boolean boolean3 = linkedListTestDriver1.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver4.addLast((java.lang.Object) 100);
        boolean boolean9 = linkedListTestDriver4.isEmpty();
        java.lang.Class<?> wildcardClass10 = linkedListTestDriver4.getClass();
        linkedListTestDriver1.addLast((java.lang.Object) wildcardClass10);
        boolean boolean12 = linkedListTestDriver0.equals_CUT((java.lang.Object) wildcardClass10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = linkedListTestDriver0.get((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test027");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        boolean boolean4 = linkedListTestDriver0.contains((java.lang.Object) true);
        java.lang.Object[] objArray5 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver6.addLast((java.lang.Object) 100);
        boolean boolean11 = linkedListTestDriver6.isEmpty();
        java.lang.Class<?> wildcardClass12 = linkedListTestDriver6.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) wildcardClass12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = linkedListTestDriver0.remove((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test028");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = linkedListTestDriver0.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test029");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        java.lang.Object[] objArray3 = linkedListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) (short) -1, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test030");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test031");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = linkedListTestDriver0.get(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test032");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean4 = linkedListTestDriver0.isEmpty();
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = linkedListTestDriver0.remove(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test033");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        boolean boolean5 = linkedListTestDriver3.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver3.addLast((java.lang.Object) 100);
        boolean boolean8 = linkedListTestDriver3.isEmpty();
        java.lang.Class<?> wildcardClass9 = linkedListTestDriver3.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) wildcardClass9);
        int int11 = linkedListTestDriver0.size();
        java.lang.Object obj12 = linkedListTestDriver0.getLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = linkedListTestDriver0.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "class experiment.util.LinkedListTestDriver");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test034");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        boolean boolean5 = linkedListTestDriver3.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver3.addLast((java.lang.Object) 100);
        boolean boolean8 = linkedListTestDriver3.isEmpty();
        java.lang.Class<?> wildcardClass9 = linkedListTestDriver3.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) wildcardClass9);
        int int11 = linkedListTestDriver0.size();
        java.lang.Object obj12 = linkedListTestDriver0.getLast();
        java.lang.Object obj13 = linkedListTestDriver0.removeLast();
        java.lang.Object obj15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = linkedListTestDriver0.set(2, obj15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "class experiment.util.LinkedListTestDriver");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test035");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        linkedListTestDriver0.clear();
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.addLast(obj7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test036");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        boolean boolean4 = linkedListTestDriver0.contains((java.lang.Object) true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = linkedListTestDriver0.get((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test037");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        boolean boolean5 = linkedListTestDriver3.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver3.addLast((java.lang.Object) 100);
        boolean boolean8 = linkedListTestDriver3.isEmpty();
        java.lang.Class<?> wildcardClass9 = linkedListTestDriver3.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) wildcardClass9);
        int int11 = linkedListTestDriver0.size();
        java.lang.Object obj12 = linkedListTestDriver0.getLast();
        java.lang.Object obj13 = linkedListTestDriver0.removeLast();
        boolean boolean14 = linkedListTestDriver0.isEmpty();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        boolean boolean18 = linkedListTestDriver16.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver16.addLast((java.lang.Object) 100);
        boolean boolean21 = linkedListTestDriver16.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver16.addFirst((java.lang.Object) linkedListTestDriver22);
        experiment.util.Iterator iterator24 = linkedListTestDriver16.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) iterator24);
        java.lang.Class<?> wildcardClass26 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test038");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        boolean boolean5 = linkedListTestDriver3.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver3.addLast((java.lang.Object) 100);
        boolean boolean8 = linkedListTestDriver3.isEmpty();
        java.lang.Class<?> wildcardClass9 = linkedListTestDriver3.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) wildcardClass9);
        int int11 = linkedListTestDriver0.size();
        java.lang.Object obj12 = linkedListTestDriver0.getLast();
        boolean boolean13 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = linkedListTestDriver0.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test039");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        boolean boolean3 = linkedListTestDriver1.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver4.addLast((java.lang.Object) 100);
        boolean boolean9 = linkedListTestDriver4.isEmpty();
        java.lang.Class<?> wildcardClass10 = linkedListTestDriver4.getClass();
        linkedListTestDriver1.addLast((java.lang.Object) wildcardClass10);
        boolean boolean12 = linkedListTestDriver0.equals_CUT((java.lang.Object) wildcardClass10);
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test040");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
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
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test041");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        boolean boolean5 = linkedListTestDriver3.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver3.addLast((java.lang.Object) 100);
        boolean boolean8 = linkedListTestDriver3.isEmpty();
        java.lang.Class<?> wildcardClass9 = linkedListTestDriver3.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) wildcardClass9);
        int int11 = linkedListTestDriver0.size();
        java.lang.Object obj12 = linkedListTestDriver0.getLast();
        java.lang.Object obj13 = linkedListTestDriver0.removeLast();
        boolean boolean15 = linkedListTestDriver0.remove((java.lang.Object) (byte) 10);
        int int16 = linkedListTestDriver0.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test042");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        java.lang.Object obj10 = linkedListTestDriver0.remove((int) (byte) 0);
        experiment.util.Iterator iterator11 = linkedListTestDriver0.iterator();
        java.lang.Object obj12 = linkedListTestDriver0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = linkedListTestDriver0.getLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100 + "'", obj12, 100);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test043");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        int int5 = linkedListTestDriver0.size();
        int int6 = linkedListTestDriver0.size();
        boolean boolean8 = linkedListTestDriver0.add((java.lang.Object) (byte) -1);
        java.lang.Object obj9 = linkedListTestDriver0.removeFirst();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100 + "'", obj9, 100);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test044");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        java.lang.Object obj6 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver7.addLast((java.lang.Object) 100);
        boolean boolean12 = linkedListTestDriver7.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.addFirst((java.lang.Object) linkedListTestDriver13);
        experiment.util.Iterator iterator15 = linkedListTestDriver7.iterator();
        java.lang.Object obj17 = linkedListTestDriver7.remove((int) (byte) 0);
        boolean boolean18 = linkedListTestDriver0.add(obj17);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator20 = linkedListTestDriver0.listIterator((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100 + "'", obj6, 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test045");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        int int5 = linkedListTestDriver0.size();
        boolean boolean7 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.addFirst(obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test046");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
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
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test047");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        boolean boolean4 = linkedListTestDriver0.contains((java.lang.Object) true);
        java.lang.Object[] objArray5 = linkedListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = linkedListTestDriver0.remove((-1));
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
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test048");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean4 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver9.addLast((java.lang.Object) 100);
        boolean boolean14 = linkedListTestDriver9.isEmpty();
        java.lang.Class<?> wildcardClass15 = linkedListTestDriver9.getClass();
        linkedListTestDriver6.addLast((java.lang.Object) wildcardClass15);
        boolean boolean17 = linkedListTestDriver5.equals_CUT((java.lang.Object) wildcardClass15);
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver18.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator21 = linkedListTestDriver18.iterator();
        linkedListTestDriver5.addFirst((java.lang.Object) iterator21);
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        java.lang.Object obj24 = linkedListTestDriver0.removeFirst();
        int int25 = linkedListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = linkedListTestDriver0.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test049");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        boolean boolean4 = linkedListTestDriver0.contains((java.lang.Object) true);
        java.lang.Object[] objArray5 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        boolean boolean12 = linkedListTestDriver10.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver10.addLast((java.lang.Object) 100);
        boolean boolean15 = linkedListTestDriver10.isEmpty();
        java.lang.Class<?> wildcardClass16 = linkedListTestDriver10.getClass();
        linkedListTestDriver7.addLast((java.lang.Object) wildcardClass16);
        int int18 = linkedListTestDriver7.size();
        java.lang.Object obj19 = linkedListTestDriver7.getLast();
        linkedListTestDriver6.addFirst((java.lang.Object) linkedListTestDriver7);
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = linkedListTestDriver6.get((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "class experiment.util.LinkedListTestDriver");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test050");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        java.lang.Object obj6 = linkedListTestDriver0.getFirst();
        java.lang.Object[] objArray7 = linkedListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator9 = linkedListTestDriver0.listIterator(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 100; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100 + "'", obj6, 100);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100]");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test051");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean4 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver9.addLast((java.lang.Object) 100);
        boolean boolean14 = linkedListTestDriver9.isEmpty();
        java.lang.Class<?> wildcardClass15 = linkedListTestDriver9.getClass();
        linkedListTestDriver6.addLast((java.lang.Object) wildcardClass15);
        boolean boolean17 = linkedListTestDriver5.equals_CUT((java.lang.Object) wildcardClass15);
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver18.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator21 = linkedListTestDriver18.iterator();
        linkedListTestDriver5.addFirst((java.lang.Object) iterator21);
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        boolean boolean25 = linkedListTestDriver0.contains((java.lang.Object) 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = linkedListTestDriver0.get(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test052");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        java.lang.Object obj10 = linkedListTestDriver0.remove((int) (byte) 0);
        experiment.util.Iterator iterator11 = linkedListTestDriver0.iterator();
        java.lang.Object obj12 = linkedListTestDriver0.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        boolean boolean17 = linkedListTestDriver15.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver18.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver18.addLast((java.lang.Object) 100);
        boolean boolean23 = linkedListTestDriver18.isEmpty();
        java.lang.Class<?> wildcardClass24 = linkedListTestDriver18.getClass();
        linkedListTestDriver15.addLast((java.lang.Object) wildcardClass24);
        int int26 = linkedListTestDriver15.size();
        java.lang.Object obj27 = linkedListTestDriver15.getLast();
        linkedListTestDriver14.addFirst((java.lang.Object) linkedListTestDriver15);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add(10, (java.lang.Object) linkedListTestDriver15);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100 + "'", obj12, 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "class experiment.util.LinkedListTestDriver");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test053");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = linkedListTestDriver0.get((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test054");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        linkedListTestDriver0.clear();
        int int7 = linkedListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator9 = linkedListTestDriver0.listIterator((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 32; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test055");
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
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test056");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) (short) 1);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test057");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        int int6 = linkedListTestDriver0.size();
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) (byte) 1, obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test058");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean4 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver9.addLast((java.lang.Object) 100);
        boolean boolean14 = linkedListTestDriver9.isEmpty();
        java.lang.Class<?> wildcardClass15 = linkedListTestDriver9.getClass();
        linkedListTestDriver6.addLast((java.lang.Object) wildcardClass15);
        boolean boolean17 = linkedListTestDriver5.equals_CUT((java.lang.Object) wildcardClass15);
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver18.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator21 = linkedListTestDriver18.iterator();
        linkedListTestDriver5.addFirst((java.lang.Object) iterator21);
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        boolean boolean27 = linkedListTestDriver25.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver25.addLast((java.lang.Object) 100);
        boolean boolean30 = linkedListTestDriver25.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver25.addFirst((java.lang.Object) linkedListTestDriver31);
        boolean boolean33 = linkedListTestDriver31.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = linkedListTestDriver0.set((int) (short) 100, (java.lang.Object) linkedListTestDriver31);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test059");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        java.lang.Object[] objArray8 = linkedListTestDriver0.toArray();
        boolean boolean10 = linkedListTestDriver0.remove((java.lang.Object) 100L);
        boolean boolean12 = linkedListTestDriver0.equals_CUT((java.lang.Object) "hi!");
        boolean boolean13 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator15 = linkedListTestDriver0.listIterator((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 100; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test060");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        java.lang.Object[] objArray8 = linkedListTestDriver0.toArray();
        java.lang.Object obj9 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver11.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        boolean boolean16 = linkedListTestDriver14.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver14.addLast((java.lang.Object) 100);
        boolean boolean19 = linkedListTestDriver14.isEmpty();
        java.lang.Class<?> wildcardClass20 = linkedListTestDriver14.getClass();
        linkedListTestDriver11.addLast((java.lang.Object) wildcardClass20);
        int int22 = linkedListTestDriver11.size();
        java.lang.Object obj23 = linkedListTestDriver11.getLast();
        boolean boolean24 = linkedListTestDriver11.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) ' ', (java.lang.Object) linkedListTestDriver11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 32; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100 + "'", obj9, 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test061");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        boolean boolean3 = linkedListTestDriver1.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver4.addLast((java.lang.Object) 100);
        boolean boolean9 = linkedListTestDriver4.isEmpty();
        java.lang.Class<?> wildcardClass10 = linkedListTestDriver4.getClass();
        linkedListTestDriver1.addLast((java.lang.Object) wildcardClass10);
        boolean boolean12 = linkedListTestDriver0.equals_CUT((java.lang.Object) wildcardClass10);
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator15 = linkedListTestDriver0.listIterator(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 100; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test062");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean4 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver9.addLast((java.lang.Object) 100);
        boolean boolean14 = linkedListTestDriver9.isEmpty();
        java.lang.Class<?> wildcardClass15 = linkedListTestDriver9.getClass();
        linkedListTestDriver6.addLast((java.lang.Object) wildcardClass15);
        boolean boolean17 = linkedListTestDriver5.equals_CUT((java.lang.Object) wildcardClass15);
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver18.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator21 = linkedListTestDriver18.iterator();
        linkedListTestDriver5.addFirst((java.lang.Object) iterator21);
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        java.lang.Object obj24 = linkedListTestDriver0.removeFirst();
        int int25 = linkedListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test063");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        java.lang.Object[] objArray3 = linkedListTestDriver0.toArray();
        java.lang.Object[] objArray4 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver6.addLast((java.lang.Object) 100);
        int int11 = linkedListTestDriver6.size();
        boolean boolean13 = linkedListTestDriver6.contains((java.lang.Object) (byte) -1);
        boolean boolean14 = linkedListTestDriver6.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = linkedListTestDriver0.set((int) (short) 10, (java.lang.Object) linkedListTestDriver6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test064");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        boolean boolean5 = linkedListTestDriver3.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver3.addLast((java.lang.Object) 100);
        boolean boolean8 = linkedListTestDriver3.isEmpty();
        java.lang.Class<?> wildcardClass9 = linkedListTestDriver3.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) wildcardClass9);
        boolean boolean12 = linkedListTestDriver0.equals_CUT((java.lang.Object) (short) 1);
        java.lang.Object obj13 = linkedListTestDriver0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "class experiment.util.LinkedListTestDriver");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test065");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        boolean boolean5 = linkedListTestDriver3.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver3.addLast((java.lang.Object) 100);
        boolean boolean8 = linkedListTestDriver3.isEmpty();
        java.lang.Class<?> wildcardClass9 = linkedListTestDriver3.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) wildcardClass9);
        boolean boolean12 = linkedListTestDriver0.equals_CUT((java.lang.Object) (short) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver13.addFirst((java.lang.Object) true);
        linkedListTestDriver0.addLast((java.lang.Object) true);
        java.lang.Class<?> wildcardClass17 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test066");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean4 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver9.addLast((java.lang.Object) 100);
        boolean boolean14 = linkedListTestDriver9.isEmpty();
        java.lang.Class<?> wildcardClass15 = linkedListTestDriver9.getClass();
        linkedListTestDriver6.addLast((java.lang.Object) wildcardClass15);
        boolean boolean17 = linkedListTestDriver5.equals_CUT((java.lang.Object) wildcardClass15);
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver18.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator21 = linkedListTestDriver18.iterator();
        linkedListTestDriver5.addFirst((java.lang.Object) iterator21);
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        java.lang.Object obj24 = linkedListTestDriver0.removeFirst();
        int int25 = linkedListTestDriver0.size();
        boolean boolean26 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        boolean boolean30 = linkedListTestDriver28.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        boolean boolean33 = linkedListTestDriver31.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver31.addLast((java.lang.Object) 100);
        boolean boolean36 = linkedListTestDriver31.isEmpty();
        java.lang.Class<?> wildcardClass37 = linkedListTestDriver31.getClass();
        linkedListTestDriver28.addLast((java.lang.Object) wildcardClass37);
        int int39 = linkedListTestDriver28.size();
        java.lang.Object obj40 = linkedListTestDriver28.getLast();
        boolean boolean41 = linkedListTestDriver28.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver43 = new experiment.util.LinkedListTestDriver();
        boolean boolean45 = linkedListTestDriver43.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator46 = linkedListTestDriver43.iterator();
        boolean boolean47 = linkedListTestDriver43.isEmpty();
        experiment.util.Iterator iterator48 = linkedListTestDriver43.iterator();
        linkedListTestDriver28.add(0, (java.lang.Object) iterator48);
        experiment.util.LinkedListTestDriver linkedListTestDriver50 = new experiment.util.LinkedListTestDriver();
        boolean boolean52 = linkedListTestDriver50.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator53 = linkedListTestDriver50.iterator();
        boolean boolean54 = linkedListTestDriver50.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver55 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver56 = new experiment.util.LinkedListTestDriver();
        boolean boolean58 = linkedListTestDriver56.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver59 = new experiment.util.LinkedListTestDriver();
        boolean boolean61 = linkedListTestDriver59.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver59.addLast((java.lang.Object) 100);
        boolean boolean64 = linkedListTestDriver59.isEmpty();
        java.lang.Class<?> wildcardClass65 = linkedListTestDriver59.getClass();
        linkedListTestDriver56.addLast((java.lang.Object) wildcardClass65);
        boolean boolean67 = linkedListTestDriver55.equals_CUT((java.lang.Object) wildcardClass65);
        experiment.util.LinkedListTestDriver linkedListTestDriver68 = new experiment.util.LinkedListTestDriver();
        boolean boolean70 = linkedListTestDriver68.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator71 = linkedListTestDriver68.iterator();
        linkedListTestDriver55.addFirst((java.lang.Object) iterator71);
        linkedListTestDriver50.addLast((java.lang.Object) linkedListTestDriver55);
        java.lang.Object obj75 = linkedListTestDriver55.remove((int) (byte) 0);
        linkedListTestDriver28.addLast(obj75);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj77 = linkedListTestDriver0.set((int) (byte) 0, (java.lang.Object) linkedListTestDriver28);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertEquals(obj40.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj40), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj40), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(iterator46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(iterator48);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(iterator53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(iterator71);
        org.junit.Assert.assertNotNull(obj75);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test067");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        java.lang.Object[] objArray3 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver4.addLast((java.lang.Object) 100);
        boolean boolean9 = linkedListTestDriver4.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.addFirst((java.lang.Object) linkedListTestDriver10);
        experiment.util.Iterator iterator12 = linkedListTestDriver4.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        boolean boolean16 = linkedListTestDriver14.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        boolean boolean19 = linkedListTestDriver17.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver17.addLast((java.lang.Object) 100);
        boolean boolean22 = linkedListTestDriver17.isEmpty();
        java.lang.Class<?> wildcardClass23 = linkedListTestDriver17.getClass();
        linkedListTestDriver14.addLast((java.lang.Object) wildcardClass23);
        boolean boolean25 = linkedListTestDriver13.equals_CUT((java.lang.Object) wildcardClass23);
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        boolean boolean28 = linkedListTestDriver26.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator29 = linkedListTestDriver26.iterator();
        linkedListTestDriver13.addFirst((java.lang.Object) iterator29);
        boolean boolean31 = linkedListTestDriver4.add((java.lang.Object) linkedListTestDriver13);
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver13);
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        boolean boolean36 = linkedListTestDriver34.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver34.addLast((java.lang.Object) 100);
        boolean boolean39 = linkedListTestDriver34.isEmpty();
        linkedListTestDriver34.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver41 = new experiment.util.LinkedListTestDriver();
        boolean boolean43 = linkedListTestDriver41.equals_CUT((java.lang.Object) 1L);
        experiment.util.Iterator iterator44 = linkedListTestDriver41.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver45 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver46 = new experiment.util.LinkedListTestDriver();
        boolean boolean48 = linkedListTestDriver46.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver49 = new experiment.util.LinkedListTestDriver();
        boolean boolean51 = linkedListTestDriver49.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver49.addLast((java.lang.Object) 100);
        boolean boolean54 = linkedListTestDriver49.isEmpty();
        java.lang.Class<?> wildcardClass55 = linkedListTestDriver49.getClass();
        linkedListTestDriver46.addLast((java.lang.Object) wildcardClass55);
        boolean boolean57 = linkedListTestDriver45.equals_CUT((java.lang.Object) wildcardClass55);
        experiment.util.LinkedListTestDriver linkedListTestDriver58 = new experiment.util.LinkedListTestDriver();
        boolean boolean60 = linkedListTestDriver58.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator61 = linkedListTestDriver58.iterator();
        linkedListTestDriver45.addFirst((java.lang.Object) iterator61);
        boolean boolean63 = linkedListTestDriver41.equals_CUT((java.lang.Object) linkedListTestDriver45);
        java.lang.Object obj64 = linkedListTestDriver45.getLast();
        linkedListTestDriver34.addFirst(obj64);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj66 = linkedListTestDriver13.set(10, (java.lang.Object) linkedListTestDriver34);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(iterator44);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(iterator61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(obj64);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test068");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator7 = linkedListTestDriver4.iterator();
        boolean boolean8 = linkedListTestDriver4.isEmpty();
        boolean boolean9 = linkedListTestDriver0.contains((java.lang.Object) boolean8);
        linkedListTestDriver0.addFirst((java.lang.Object) 10L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = linkedListTestDriver0.remove((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test069");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        boolean boolean12 = linkedListTestDriver10.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver13.addLast((java.lang.Object) 100);
        boolean boolean18 = linkedListTestDriver13.isEmpty();
        java.lang.Class<?> wildcardClass19 = linkedListTestDriver13.getClass();
        linkedListTestDriver10.addLast((java.lang.Object) wildcardClass19);
        boolean boolean21 = linkedListTestDriver9.equals_CUT((java.lang.Object) wildcardClass19);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        boolean boolean24 = linkedListTestDriver22.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator25 = linkedListTestDriver22.iterator();
        linkedListTestDriver9.addFirst((java.lang.Object) iterator25);
        boolean boolean27 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver9);
        java.lang.Object obj28 = linkedListTestDriver9.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        boolean boolean31 = linkedListTestDriver29.equals_CUT((java.lang.Object) 1L);
        experiment.util.Iterator iterator32 = linkedListTestDriver29.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver33 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        boolean boolean36 = linkedListTestDriver34.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        boolean boolean39 = linkedListTestDriver37.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver37.addLast((java.lang.Object) 100);
        boolean boolean42 = linkedListTestDriver37.isEmpty();
        java.lang.Class<?> wildcardClass43 = linkedListTestDriver37.getClass();
        linkedListTestDriver34.addLast((java.lang.Object) wildcardClass43);
        boolean boolean45 = linkedListTestDriver33.equals_CUT((java.lang.Object) wildcardClass43);
        experiment.util.LinkedListTestDriver linkedListTestDriver46 = new experiment.util.LinkedListTestDriver();
        boolean boolean48 = linkedListTestDriver46.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator49 = linkedListTestDriver46.iterator();
        linkedListTestDriver33.addFirst((java.lang.Object) iterator49);
        boolean boolean51 = linkedListTestDriver29.equals_CUT((java.lang.Object) linkedListTestDriver33);
        java.lang.Object obj52 = linkedListTestDriver33.getLast();
        boolean boolean53 = linkedListTestDriver9.contains(obj52);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(iterator49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test070");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.equals_CUT((java.lang.Object) 1L);
        boolean boolean11 = linkedListTestDriver7.contains((java.lang.Object) true);
        java.lang.Object[] objArray12 = linkedListTestDriver7.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        boolean boolean16 = linkedListTestDriver14.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        boolean boolean19 = linkedListTestDriver17.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver17.addLast((java.lang.Object) 100);
        boolean boolean22 = linkedListTestDriver17.isEmpty();
        java.lang.Class<?> wildcardClass23 = linkedListTestDriver17.getClass();
        linkedListTestDriver14.addLast((java.lang.Object) wildcardClass23);
        int int25 = linkedListTestDriver14.size();
        java.lang.Object obj26 = linkedListTestDriver14.getLast();
        linkedListTestDriver13.addFirst((java.lang.Object) linkedListTestDriver14);
        linkedListTestDriver7.addFirst((java.lang.Object) linkedListTestDriver13);
        boolean boolean29 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver7);
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = linkedListTestDriver0.set(100, (java.lang.Object) linkedListTestDriver31);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test071");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        boolean boolean5 = linkedListTestDriver3.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver3.addLast((java.lang.Object) 100);
        boolean boolean8 = linkedListTestDriver3.isEmpty();
        java.lang.Class<?> wildcardClass9 = linkedListTestDriver3.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) wildcardClass9);
        boolean boolean12 = linkedListTestDriver0.equals_CUT((java.lang.Object) (short) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver13.addFirst((java.lang.Object) true);
        linkedListTestDriver0.addLast((java.lang.Object) true);
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver18.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver18.addLast((java.lang.Object) 100);
        boolean boolean23 = linkedListTestDriver18.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver18.addFirst((java.lang.Object) linkedListTestDriver24);
        experiment.util.Iterator iterator26 = linkedListTestDriver18.iterator();
        java.lang.Object obj28 = linkedListTestDriver18.remove((int) (byte) 0);
        linkedListTestDriver18.clear();
        java.lang.Object obj30 = linkedListTestDriver0.set((int) (short) 0, (java.lang.Object) linkedListTestDriver18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = linkedListTestDriver0.set((int) (short) 10, (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "class experiment.util.LinkedListTestDriver");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test072");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        boolean boolean12 = linkedListTestDriver10.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver13.addLast((java.lang.Object) 100);
        boolean boolean18 = linkedListTestDriver13.isEmpty();
        java.lang.Class<?> wildcardClass19 = linkedListTestDriver13.getClass();
        linkedListTestDriver10.addLast((java.lang.Object) wildcardClass19);
        boolean boolean21 = linkedListTestDriver9.equals_CUT((java.lang.Object) wildcardClass19);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        boolean boolean24 = linkedListTestDriver22.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator25 = linkedListTestDriver22.iterator();
        linkedListTestDriver9.addFirst((java.lang.Object) iterator25);
        boolean boolean27 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver9);
        boolean boolean29 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test073");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        java.lang.Object[] objArray3 = linkedListTestDriver0.toArray();
        java.lang.Object[] objArray4 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver6.addLast((java.lang.Object) 100);
        boolean boolean11 = linkedListTestDriver6.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addFirst((java.lang.Object) linkedListTestDriver12);
        java.lang.Object[] objArray14 = linkedListTestDriver6.toArray();
        java.lang.Object obj15 = linkedListTestDriver6.getLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = linkedListTestDriver0.set((int) (short) -1, obj15);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100 + "'", obj15, 100);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test074");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        boolean boolean4 = linkedListTestDriver0.contains((java.lang.Object) true);
        java.lang.Object[] objArray5 = linkedListTestDriver0.toArray();
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator8 = linkedListTestDriver0.listIterator((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test075");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        java.lang.Object obj9 = linkedListTestDriver0.getLast();
        int int10 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver11.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        boolean boolean16 = linkedListTestDriver14.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver14.addLast((java.lang.Object) 100);
        boolean boolean19 = linkedListTestDriver14.isEmpty();
        java.lang.Class<?> wildcardClass20 = linkedListTestDriver14.getClass();
        linkedListTestDriver11.addLast((java.lang.Object) wildcardClass20);
        int int22 = linkedListTestDriver11.size();
        java.lang.Object obj23 = linkedListTestDriver11.getLast();
        java.lang.Object obj24 = linkedListTestDriver11.removeLast();
        boolean boolean25 = linkedListTestDriver11.isEmpty();
        linkedListTestDriver11.clear();
        boolean boolean27 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver11);
        boolean boolean28 = linkedListTestDriver0.isEmpty();
        java.lang.Object obj29 = linkedListTestDriver0.removeLast();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100 + "'", obj9, 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(obj29);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test076");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        boolean boolean4 = linkedListTestDriver0.contains((java.lang.Object) true);
        java.lang.Object[] objArray5 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver6.addLast((java.lang.Object) 100);
        boolean boolean11 = linkedListTestDriver6.isEmpty();
        java.lang.Class<?> wildcardClass12 = linkedListTestDriver6.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) wildcardClass12);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) (byte) 100, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 100; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test077");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        java.lang.Object obj10 = linkedListTestDriver0.remove((int) (byte) 0);
        experiment.util.Iterator iterator11 = linkedListTestDriver0.iterator();
        int int12 = linkedListTestDriver0.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test078");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        boolean boolean5 = linkedListTestDriver3.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver3.addLast((java.lang.Object) 100);
        boolean boolean8 = linkedListTestDriver3.isEmpty();
        java.lang.Class<?> wildcardClass9 = linkedListTestDriver3.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) wildcardClass9);
        int int11 = linkedListTestDriver0.size();
        java.lang.Object obj12 = linkedListTestDriver0.getLast();
        java.lang.Object obj13 = linkedListTestDriver0.removeLast();
        boolean boolean14 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        boolean boolean17 = linkedListTestDriver15.equals_CUT((java.lang.Object) 1L);
        boolean boolean19 = linkedListTestDriver15.add((java.lang.Object) (short) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        boolean boolean23 = linkedListTestDriver21.remove((java.lang.Object) '#');
        java.lang.Object[] objArray24 = linkedListTestDriver21.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        boolean boolean27 = linkedListTestDriver25.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver25.addLast((java.lang.Object) 100);
        boolean boolean30 = linkedListTestDriver25.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver25.addFirst((java.lang.Object) linkedListTestDriver31);
        experiment.util.Iterator iterator33 = linkedListTestDriver25.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver35 = new experiment.util.LinkedListTestDriver();
        boolean boolean37 = linkedListTestDriver35.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver38 = new experiment.util.LinkedListTestDriver();
        boolean boolean40 = linkedListTestDriver38.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver38.addLast((java.lang.Object) 100);
        boolean boolean43 = linkedListTestDriver38.isEmpty();
        java.lang.Class<?> wildcardClass44 = linkedListTestDriver38.getClass();
        linkedListTestDriver35.addLast((java.lang.Object) wildcardClass44);
        boolean boolean46 = linkedListTestDriver34.equals_CUT((java.lang.Object) wildcardClass44);
        experiment.util.LinkedListTestDriver linkedListTestDriver47 = new experiment.util.LinkedListTestDriver();
        boolean boolean49 = linkedListTestDriver47.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator50 = linkedListTestDriver47.iterator();
        linkedListTestDriver34.addFirst((java.lang.Object) iterator50);
        boolean boolean52 = linkedListTestDriver25.add((java.lang.Object) linkedListTestDriver34);
        linkedListTestDriver21.addLast((java.lang.Object) linkedListTestDriver34);
        boolean boolean55 = linkedListTestDriver34.remove((java.lang.Object) (byte) 10);
        linkedListTestDriver15.add(0, (java.lang.Object) linkedListTestDriver34);
        boolean boolean57 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj59 = linkedListTestDriver0.remove((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(iterator50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test079");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.equals_CUT((java.lang.Object) 1L);
        experiment.util.Iterator iterator10 = linkedListTestDriver7.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        boolean boolean14 = linkedListTestDriver12.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        boolean boolean17 = linkedListTestDriver15.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver15.addLast((java.lang.Object) 100);
        boolean boolean20 = linkedListTestDriver15.isEmpty();
        java.lang.Class<?> wildcardClass21 = linkedListTestDriver15.getClass();
        linkedListTestDriver12.addLast((java.lang.Object) wildcardClass21);
        boolean boolean23 = linkedListTestDriver11.equals_CUT((java.lang.Object) wildcardClass21);
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        boolean boolean26 = linkedListTestDriver24.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator27 = linkedListTestDriver24.iterator();
        linkedListTestDriver11.addFirst((java.lang.Object) iterator27);
        boolean boolean29 = linkedListTestDriver7.equals_CUT((java.lang.Object) linkedListTestDriver11);
        java.lang.Object obj30 = linkedListTestDriver11.getLast();
        linkedListTestDriver0.addFirst(obj30);
        java.lang.Class<?> wildcardClass32 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test080");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        boolean boolean5 = linkedListTestDriver3.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver3.addLast((java.lang.Object) 100);
        boolean boolean8 = linkedListTestDriver3.isEmpty();
        java.lang.Class<?> wildcardClass9 = linkedListTestDriver3.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) wildcardClass9);
        int int11 = linkedListTestDriver0.size();
        java.lang.Object obj12 = linkedListTestDriver0.getLast();
        java.lang.Object obj13 = linkedListTestDriver0.removeFirst();
        boolean boolean14 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator16 = linkedListTestDriver0.listIterator((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test081");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) true);
        linkedListTestDriver0.clear();
        int int4 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver5.addLast((java.lang.Object) 100);
        boolean boolean10 = linkedListTestDriver5.isEmpty();
        java.lang.Object obj11 = linkedListTestDriver5.getFirst();
        java.lang.Object[] objArray12 = linkedListTestDriver5.toArray();
        boolean boolean13 = linkedListTestDriver0.remove((java.lang.Object) objArray12);
        linkedListTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100 + "'", obj11, 100);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test082");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        java.lang.Object[] objArray3 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver4.addLast((java.lang.Object) 100);
        boolean boolean9 = linkedListTestDriver4.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.addFirst((java.lang.Object) linkedListTestDriver10);
        experiment.util.Iterator iterator12 = linkedListTestDriver4.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        boolean boolean16 = linkedListTestDriver14.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        boolean boolean19 = linkedListTestDriver17.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver17.addLast((java.lang.Object) 100);
        boolean boolean22 = linkedListTestDriver17.isEmpty();
        java.lang.Class<?> wildcardClass23 = linkedListTestDriver17.getClass();
        linkedListTestDriver14.addLast((java.lang.Object) wildcardClass23);
        boolean boolean25 = linkedListTestDriver13.equals_CUT((java.lang.Object) wildcardClass23);
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        boolean boolean28 = linkedListTestDriver26.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator29 = linkedListTestDriver26.iterator();
        linkedListTestDriver13.addFirst((java.lang.Object) iterator29);
        boolean boolean31 = linkedListTestDriver4.add((java.lang.Object) linkedListTestDriver13);
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver13);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator34 = linkedListTestDriver13.listIterator((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test083");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        boolean boolean3 = linkedListTestDriver1.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver4.addLast((java.lang.Object) 100);
        boolean boolean9 = linkedListTestDriver4.isEmpty();
        java.lang.Class<?> wildcardClass10 = linkedListTestDriver4.getClass();
        linkedListTestDriver1.addLast((java.lang.Object) wildcardClass10);
        boolean boolean12 = linkedListTestDriver0.equals_CUT((java.lang.Object) wildcardClass10);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.equals_CUT((java.lang.Object) 1L);
        experiment.util.Iterator iterator16 = linkedListTestDriver13.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver18.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        boolean boolean23 = linkedListTestDriver21.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver21.addLast((java.lang.Object) 100);
        boolean boolean26 = linkedListTestDriver21.isEmpty();
        java.lang.Class<?> wildcardClass27 = linkedListTestDriver21.getClass();
        linkedListTestDriver18.addLast((java.lang.Object) wildcardClass27);
        boolean boolean29 = linkedListTestDriver17.equals_CUT((java.lang.Object) wildcardClass27);
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        boolean boolean32 = linkedListTestDriver30.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator33 = linkedListTestDriver30.iterator();
        linkedListTestDriver17.addFirst((java.lang.Object) iterator33);
        boolean boolean35 = linkedListTestDriver13.equals_CUT((java.lang.Object) linkedListTestDriver17);
        java.lang.Object obj36 = linkedListTestDriver17.getLast();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver17);
        experiment.util.LinkedListTestDriver linkedListTestDriver39 = new experiment.util.LinkedListTestDriver();
        boolean boolean41 = linkedListTestDriver39.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver39.addLast((java.lang.Object) 100);
        int int44 = linkedListTestDriver39.size();
        boolean boolean46 = linkedListTestDriver39.contains((java.lang.Object) (byte) -1);
        linkedListTestDriver39.clear();
        linkedListTestDriver39.clear();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver17.add((int) '#', (java.lang.Object) linkedListTestDriver39);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 35; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test084");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator6 = linkedListTestDriver0.listIterator(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 2; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test085");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        java.lang.Object[] objArray8 = linkedListTestDriver0.toArray();
        boolean boolean10 = linkedListTestDriver0.remove((java.lang.Object) 100L);
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver11.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        boolean boolean16 = linkedListTestDriver14.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver14.addLast((java.lang.Object) 100);
        boolean boolean19 = linkedListTestDriver14.isEmpty();
        java.lang.Class<?> wildcardClass20 = linkedListTestDriver14.getClass();
        linkedListTestDriver11.addLast((java.lang.Object) wildcardClass20);
        boolean boolean23 = linkedListTestDriver11.equals_CUT((java.lang.Object) (short) 1);
        java.lang.Object obj24 = linkedListTestDriver11.removeFirst();
        boolean boolean25 = linkedListTestDriver0.equals_CUT(obj24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = linkedListTestDriver0.remove((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test086");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        boolean boolean10 = linkedListTestDriver8.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver8.addLast((java.lang.Object) 100);
        boolean boolean13 = linkedListTestDriver8.isEmpty();
        java.lang.Class<?> wildcardClass14 = linkedListTestDriver8.getClass();
        linkedListTestDriver5.addLast((java.lang.Object) wildcardClass14);
        boolean boolean16 = linkedListTestDriver4.equals_CUT((java.lang.Object) wildcardClass14);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        boolean boolean19 = linkedListTestDriver17.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator20 = linkedListTestDriver17.iterator();
        linkedListTestDriver4.addFirst((java.lang.Object) iterator20);
        boolean boolean22 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver4);
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        boolean boolean26 = linkedListTestDriver24.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver24.addLast((java.lang.Object) 100);
        boolean boolean29 = linkedListTestDriver24.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver24.addFirst((java.lang.Object) linkedListTestDriver30);
        java.lang.Object[] objArray32 = linkedListTestDriver24.toArray();
        java.lang.Object obj33 = linkedListTestDriver24.getLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = linkedListTestDriver0.set((int) '4', (java.lang.Object) linkedListTestDriver24);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 100 + "'", obj33, 100);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test087");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        int int6 = linkedListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = linkedListTestDriver0.remove(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test088");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        java.lang.Object[] objArray8 = linkedListTestDriver0.toArray();
        java.lang.Object obj9 = linkedListTestDriver0.removeLast();
        boolean boolean10 = linkedListTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100 + "'", obj9, 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test089");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        boolean boolean5 = linkedListTestDriver3.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver3.addLast((java.lang.Object) 100);
        boolean boolean8 = linkedListTestDriver3.isEmpty();
        java.lang.Class<?> wildcardClass9 = linkedListTestDriver3.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) wildcardClass9);
        int int11 = linkedListTestDriver0.size();
        java.lang.Object obj12 = linkedListTestDriver0.getLast();
        java.lang.Object obj13 = linkedListTestDriver0.removeLast();
        boolean boolean14 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        boolean boolean17 = linkedListTestDriver15.equals_CUT((java.lang.Object) 1L);
        boolean boolean19 = linkedListTestDriver15.add((java.lang.Object) (short) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        boolean boolean23 = linkedListTestDriver21.remove((java.lang.Object) '#');
        java.lang.Object[] objArray24 = linkedListTestDriver21.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        boolean boolean27 = linkedListTestDriver25.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver25.addLast((java.lang.Object) 100);
        boolean boolean30 = linkedListTestDriver25.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver25.addFirst((java.lang.Object) linkedListTestDriver31);
        experiment.util.Iterator iterator33 = linkedListTestDriver25.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver35 = new experiment.util.LinkedListTestDriver();
        boolean boolean37 = linkedListTestDriver35.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver38 = new experiment.util.LinkedListTestDriver();
        boolean boolean40 = linkedListTestDriver38.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver38.addLast((java.lang.Object) 100);
        boolean boolean43 = linkedListTestDriver38.isEmpty();
        java.lang.Class<?> wildcardClass44 = linkedListTestDriver38.getClass();
        linkedListTestDriver35.addLast((java.lang.Object) wildcardClass44);
        boolean boolean46 = linkedListTestDriver34.equals_CUT((java.lang.Object) wildcardClass44);
        experiment.util.LinkedListTestDriver linkedListTestDriver47 = new experiment.util.LinkedListTestDriver();
        boolean boolean49 = linkedListTestDriver47.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator50 = linkedListTestDriver47.iterator();
        linkedListTestDriver34.addFirst((java.lang.Object) iterator50);
        boolean boolean52 = linkedListTestDriver25.add((java.lang.Object) linkedListTestDriver34);
        linkedListTestDriver21.addLast((java.lang.Object) linkedListTestDriver34);
        boolean boolean55 = linkedListTestDriver34.remove((java.lang.Object) (byte) 10);
        linkedListTestDriver15.add(0, (java.lang.Object) linkedListTestDriver34);
        boolean boolean57 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver15);
        boolean boolean58 = linkedListTestDriver15.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(iterator50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test090");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        java.lang.Object obj9 = linkedListTestDriver0.getLast();
        int int10 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver11.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        boolean boolean16 = linkedListTestDriver14.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver14.addLast((java.lang.Object) 100);
        boolean boolean19 = linkedListTestDriver14.isEmpty();
        java.lang.Class<?> wildcardClass20 = linkedListTestDriver14.getClass();
        linkedListTestDriver11.addLast((java.lang.Object) wildcardClass20);
        int int22 = linkedListTestDriver11.size();
        java.lang.Object obj23 = linkedListTestDriver11.getLast();
        java.lang.Object obj24 = linkedListTestDriver11.removeLast();
        boolean boolean25 = linkedListTestDriver11.isEmpty();
        linkedListTestDriver11.clear();
        boolean boolean27 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver11);
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        boolean boolean30 = linkedListTestDriver28.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver28.addLast((java.lang.Object) 100);
        int int33 = linkedListTestDriver28.size();
        int int34 = linkedListTestDriver28.size();
        boolean boolean36 = linkedListTestDriver28.add((java.lang.Object) (byte) -1);
        boolean boolean38 = linkedListTestDriver28.equals_CUT((java.lang.Object) (byte) 10);
        linkedListTestDriver11.addLast((java.lang.Object) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100 + "'", obj9, 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test091");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) (short) 1);
        java.lang.Object obj6 = linkedListTestDriver0.remove(0);
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test092");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        int int5 = linkedListTestDriver0.size();
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = linkedListTestDriver0.get((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100 + "'", obj6, 100);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test093");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver5.addLast((java.lang.Object) 100);
        boolean boolean10 = linkedListTestDriver5.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver5.addFirst((java.lang.Object) linkedListTestDriver11);
        java.lang.Object[] objArray13 = linkedListTestDriver5.toArray();
        boolean boolean15 = linkedListTestDriver5.remove((java.lang.Object) 100L);
        boolean boolean17 = linkedListTestDriver5.equals_CUT((java.lang.Object) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) (byte) 10, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test094");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        boolean boolean3 = linkedListTestDriver1.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver4.addLast((java.lang.Object) 100);
        boolean boolean9 = linkedListTestDriver4.isEmpty();
        java.lang.Class<?> wildcardClass10 = linkedListTestDriver4.getClass();
        linkedListTestDriver1.addLast((java.lang.Object) wildcardClass10);
        int int12 = linkedListTestDriver1.size();
        java.lang.Object obj13 = linkedListTestDriver1.getLast();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver1);
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        boolean boolean18 = linkedListTestDriver16.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator19 = linkedListTestDriver16.iterator();
        boolean boolean20 = linkedListTestDriver16.isEmpty();
        experiment.util.Iterator iterator21 = linkedListTestDriver16.iterator();
        linkedListTestDriver0.add(1, (java.lang.Object) linkedListTestDriver16);
        java.lang.Class<?> wildcardClass23 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test095");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        int int5 = linkedListTestDriver0.size();
        boolean boolean7 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        boolean boolean10 = linkedListTestDriver8.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator11 = linkedListTestDriver8.iterator();
        boolean boolean12 = linkedListTestDriver8.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        boolean boolean16 = linkedListTestDriver14.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        boolean boolean19 = linkedListTestDriver17.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver17.addLast((java.lang.Object) 100);
        boolean boolean22 = linkedListTestDriver17.isEmpty();
        java.lang.Class<?> wildcardClass23 = linkedListTestDriver17.getClass();
        linkedListTestDriver14.addLast((java.lang.Object) wildcardClass23);
        boolean boolean25 = linkedListTestDriver13.equals_CUT((java.lang.Object) wildcardClass23);
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        boolean boolean28 = linkedListTestDriver26.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator29 = linkedListTestDriver26.iterator();
        linkedListTestDriver13.addFirst((java.lang.Object) iterator29);
        linkedListTestDriver8.addLast((java.lang.Object) linkedListTestDriver13);
        java.lang.Object obj32 = linkedListTestDriver8.removeFirst();
        int int33 = linkedListTestDriver8.size();
        boolean boolean34 = linkedListTestDriver8.isEmpty();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver8);
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        boolean boolean39 = linkedListTestDriver37.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver37.addLast((java.lang.Object) 100);
        int int42 = linkedListTestDriver37.size();
        boolean boolean44 = linkedListTestDriver37.contains((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver45 = new experiment.util.LinkedListTestDriver();
        boolean boolean47 = linkedListTestDriver45.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator48 = linkedListTestDriver45.iterator();
        boolean boolean49 = linkedListTestDriver45.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver50 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver51 = new experiment.util.LinkedListTestDriver();
        boolean boolean53 = linkedListTestDriver51.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver54 = new experiment.util.LinkedListTestDriver();
        boolean boolean56 = linkedListTestDriver54.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver54.addLast((java.lang.Object) 100);
        boolean boolean59 = linkedListTestDriver54.isEmpty();
        java.lang.Class<?> wildcardClass60 = linkedListTestDriver54.getClass();
        linkedListTestDriver51.addLast((java.lang.Object) wildcardClass60);
        boolean boolean62 = linkedListTestDriver50.equals_CUT((java.lang.Object) wildcardClass60);
        experiment.util.LinkedListTestDriver linkedListTestDriver63 = new experiment.util.LinkedListTestDriver();
        boolean boolean65 = linkedListTestDriver63.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator66 = linkedListTestDriver63.iterator();
        linkedListTestDriver50.addFirst((java.lang.Object) iterator66);
        linkedListTestDriver45.addLast((java.lang.Object) linkedListTestDriver50);
        java.lang.Object obj69 = linkedListTestDriver45.removeFirst();
        int int70 = linkedListTestDriver45.size();
        boolean boolean71 = linkedListTestDriver45.isEmpty();
        linkedListTestDriver37.addLast((java.lang.Object) linkedListTestDriver45);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver8.add(1, (java.lang.Object) linkedListTestDriver45);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 1; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(iterator48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(iterator66);
        org.junit.Assert.assertNotNull(obj69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test096");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = linkedListTestDriver0.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test097");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) true);
        linkedListTestDriver0.clear();
        experiment.util.Iterator iterator4 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver5.addLast((java.lang.Object) 100);
        boolean boolean10 = linkedListTestDriver5.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver5.addFirst((java.lang.Object) linkedListTestDriver11);
        experiment.util.Iterator iterator13 = linkedListTestDriver5.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        boolean boolean17 = linkedListTestDriver15.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver18.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver18.addLast((java.lang.Object) 100);
        boolean boolean23 = linkedListTestDriver18.isEmpty();
        java.lang.Class<?> wildcardClass24 = linkedListTestDriver18.getClass();
        linkedListTestDriver15.addLast((java.lang.Object) wildcardClass24);
        boolean boolean26 = linkedListTestDriver14.equals_CUT((java.lang.Object) wildcardClass24);
        experiment.util.LinkedListTestDriver linkedListTestDriver27 = new experiment.util.LinkedListTestDriver();
        boolean boolean29 = linkedListTestDriver27.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator30 = linkedListTestDriver27.iterator();
        linkedListTestDriver14.addFirst((java.lang.Object) iterator30);
        boolean boolean32 = linkedListTestDriver5.add((java.lang.Object) linkedListTestDriver14);
        experiment.util.Iterator iterator33 = linkedListTestDriver14.iterator();
        java.lang.Object obj34 = linkedListTestDriver14.getFirst();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver14);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertNotNull(obj34);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test098");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        java.lang.Object obj10 = linkedListTestDriver0.remove((int) (byte) 0);
        experiment.util.Iterator iterator11 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        boolean boolean14 = linkedListTestDriver12.equals_CUT((java.lang.Object) 1L);
        boolean boolean16 = linkedListTestDriver12.add((java.lang.Object) (short) 1);
        boolean boolean17 = linkedListTestDriver0.equals_CUT((java.lang.Object) boolean16);
        java.lang.Object obj18 = linkedListTestDriver0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = linkedListTestDriver0.getLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100 + "'", obj18, 100);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test099");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        int int6 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = linkedListTestDriver0.remove((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test100");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        boolean boolean3 = linkedListTestDriver1.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver4.addLast((java.lang.Object) 100);
        boolean boolean9 = linkedListTestDriver4.isEmpty();
        java.lang.Class<?> wildcardClass10 = linkedListTestDriver4.getClass();
        linkedListTestDriver1.addLast((java.lang.Object) wildcardClass10);
        int int12 = linkedListTestDriver1.size();
        java.lang.Object obj13 = linkedListTestDriver1.getLast();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver1);
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        boolean boolean17 = linkedListTestDriver15.remove((java.lang.Object) '#');
        java.lang.Object[] objArray18 = linkedListTestDriver15.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        boolean boolean21 = linkedListTestDriver19.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver19.addLast((java.lang.Object) 100);
        boolean boolean24 = linkedListTestDriver19.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver19.addFirst((java.lang.Object) linkedListTestDriver25);
        experiment.util.Iterator iterator27 = linkedListTestDriver19.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        boolean boolean31 = linkedListTestDriver29.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        boolean boolean34 = linkedListTestDriver32.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver32.addLast((java.lang.Object) 100);
        boolean boolean37 = linkedListTestDriver32.isEmpty();
        java.lang.Class<?> wildcardClass38 = linkedListTestDriver32.getClass();
        linkedListTestDriver29.addLast((java.lang.Object) wildcardClass38);
        boolean boolean40 = linkedListTestDriver28.equals_CUT((java.lang.Object) wildcardClass38);
        experiment.util.LinkedListTestDriver linkedListTestDriver41 = new experiment.util.LinkedListTestDriver();
        boolean boolean43 = linkedListTestDriver41.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator44 = linkedListTestDriver41.iterator();
        linkedListTestDriver28.addFirst((java.lang.Object) iterator44);
        boolean boolean46 = linkedListTestDriver19.add((java.lang.Object) linkedListTestDriver28);
        linkedListTestDriver15.addLast((java.lang.Object) linkedListTestDriver28);
        experiment.util.LinkedListTestDriver linkedListTestDriver48 = new experiment.util.LinkedListTestDriver();
        boolean boolean50 = linkedListTestDriver48.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver48.addLast((java.lang.Object) 100);
        boolean boolean53 = linkedListTestDriver48.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver54 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver48.addFirst((java.lang.Object) linkedListTestDriver54);
        java.lang.Object[] objArray56 = linkedListTestDriver48.toArray();
        java.lang.Object obj57 = linkedListTestDriver48.removeLast();
        linkedListTestDriver28.addLast((java.lang.Object) linkedListTestDriver48);
        linkedListTestDriver1.addFirst((java.lang.Object) linkedListTestDriver28);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator61 = linkedListTestDriver1.listIterator(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 100; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(iterator44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + 100 + "'", obj57, 100);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test101");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        boolean boolean5 = linkedListTestDriver3.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver3.addLast((java.lang.Object) 100);
        boolean boolean8 = linkedListTestDriver3.isEmpty();
        java.lang.Class<?> wildcardClass9 = linkedListTestDriver3.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) wildcardClass9);
        int int11 = linkedListTestDriver0.size();
        java.lang.Object obj12 = linkedListTestDriver0.getLast();
        java.lang.Object obj13 = linkedListTestDriver0.removeFirst();
        boolean boolean14 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = linkedListTestDriver0.get((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test102");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) (short) 1);
        java.lang.Object obj5 = linkedListTestDriver0.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addFirst((java.lang.Object) true);
        linkedListTestDriver6.clear();
        int int10 = linkedListTestDriver6.size();
        boolean boolean11 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver6);
        int int12 = linkedListTestDriver6.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 1 + "'", obj5, (short) 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test103");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        boolean boolean5 = linkedListTestDriver3.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver3.addLast((java.lang.Object) 100);
        boolean boolean8 = linkedListTestDriver3.isEmpty();
        java.lang.Class<?> wildcardClass9 = linkedListTestDriver3.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) wildcardClass9);
        boolean boolean12 = linkedListTestDriver0.equals_CUT((java.lang.Object) (short) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver13.addFirst((java.lang.Object) true);
        linkedListTestDriver0.addLast((java.lang.Object) true);
        java.lang.Object obj17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = linkedListTestDriver0.remove(obj17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test104");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean4 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver9.addLast((java.lang.Object) 100);
        boolean boolean14 = linkedListTestDriver9.isEmpty();
        java.lang.Class<?> wildcardClass15 = linkedListTestDriver9.getClass();
        linkedListTestDriver6.addLast((java.lang.Object) wildcardClass15);
        boolean boolean17 = linkedListTestDriver5.equals_CUT((java.lang.Object) wildcardClass15);
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver18.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator21 = linkedListTestDriver18.iterator();
        linkedListTestDriver5.addFirst((java.lang.Object) iterator21);
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        boolean boolean27 = linkedListTestDriver25.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator28 = linkedListTestDriver25.iterator();
        boolean boolean29 = linkedListTestDriver25.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        boolean boolean33 = linkedListTestDriver31.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        boolean boolean36 = linkedListTestDriver34.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver34.addLast((java.lang.Object) 100);
        boolean boolean39 = linkedListTestDriver34.isEmpty();
        java.lang.Class<?> wildcardClass40 = linkedListTestDriver34.getClass();
        linkedListTestDriver31.addLast((java.lang.Object) wildcardClass40);
        boolean boolean42 = linkedListTestDriver30.equals_CUT((java.lang.Object) wildcardClass40);
        experiment.util.LinkedListTestDriver linkedListTestDriver43 = new experiment.util.LinkedListTestDriver();
        boolean boolean45 = linkedListTestDriver43.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator46 = linkedListTestDriver43.iterator();
        linkedListTestDriver30.addFirst((java.lang.Object) iterator46);
        linkedListTestDriver25.addLast((java.lang.Object) linkedListTestDriver30);
        experiment.util.Iterator iterator49 = linkedListTestDriver30.iterator();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add(100, (java.lang.Object) linkedListTestDriver30);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 100; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(iterator46);
        org.junit.Assert.assertNotNull(iterator49);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test105");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) (short) 1);
        java.lang.Object obj5 = linkedListTestDriver0.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addFirst((java.lang.Object) true);
        linkedListTestDriver6.clear();
        int int10 = linkedListTestDriver6.size();
        boolean boolean11 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = linkedListTestDriver6.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 1 + "'", obj5, (short) 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test106");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        java.lang.Object[] objArray3 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver4.addLast((java.lang.Object) 100);
        boolean boolean9 = linkedListTestDriver4.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.addFirst((java.lang.Object) linkedListTestDriver10);
        experiment.util.Iterator iterator12 = linkedListTestDriver4.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        boolean boolean16 = linkedListTestDriver14.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        boolean boolean19 = linkedListTestDriver17.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver17.addLast((java.lang.Object) 100);
        boolean boolean22 = linkedListTestDriver17.isEmpty();
        java.lang.Class<?> wildcardClass23 = linkedListTestDriver17.getClass();
        linkedListTestDriver14.addLast((java.lang.Object) wildcardClass23);
        boolean boolean25 = linkedListTestDriver13.equals_CUT((java.lang.Object) wildcardClass23);
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        boolean boolean28 = linkedListTestDriver26.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator29 = linkedListTestDriver26.iterator();
        linkedListTestDriver13.addFirst((java.lang.Object) iterator29);
        boolean boolean31 = linkedListTestDriver4.add((java.lang.Object) linkedListTestDriver13);
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver13);
        java.lang.Object[] objArray33 = linkedListTestDriver13.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver35 = new experiment.util.LinkedListTestDriver();
        boolean boolean37 = linkedListTestDriver35.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver35.addLast((java.lang.Object) 100);
        boolean boolean40 = linkedListTestDriver35.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver41 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver35.addFirst((java.lang.Object) linkedListTestDriver41);
        java.lang.Object[] objArray43 = linkedListTestDriver35.toArray();
        boolean boolean45 = linkedListTestDriver35.remove((java.lang.Object) 100L);
        experiment.util.LinkedListTestDriver linkedListTestDriver46 = new experiment.util.LinkedListTestDriver();
        boolean boolean48 = linkedListTestDriver46.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver49 = new experiment.util.LinkedListTestDriver();
        boolean boolean51 = linkedListTestDriver49.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver49.addLast((java.lang.Object) 100);
        boolean boolean54 = linkedListTestDriver49.isEmpty();
        java.lang.Class<?> wildcardClass55 = linkedListTestDriver49.getClass();
        linkedListTestDriver46.addLast((java.lang.Object) wildcardClass55);
        boolean boolean58 = linkedListTestDriver46.equals_CUT((java.lang.Object) (short) 1);
        java.lang.Object obj59 = linkedListTestDriver46.removeFirst();
        boolean boolean60 = linkedListTestDriver35.equals_CUT(obj59);
        experiment.util.LinkedListTestDriver linkedListTestDriver61 = new experiment.util.LinkedListTestDriver();
        boolean boolean63 = linkedListTestDriver61.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver61.addLast((java.lang.Object) 100);
        boolean boolean66 = linkedListTestDriver61.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver67 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver61.addFirst((java.lang.Object) linkedListTestDriver67);
        java.lang.Object[] objArray69 = linkedListTestDriver61.toArray();
        experiment.util.ListIterator listIterator71 = linkedListTestDriver61.listIterator((int) (byte) 0);
        boolean boolean72 = linkedListTestDriver35.contains((java.lang.Object) linkedListTestDriver61);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj73 = linkedListTestDriver13.set((int) (short) 10, (java.lang.Object) boolean72);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertEquals(obj59.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj59), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj59), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertNotNull(listIterator71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test107");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        boolean boolean5 = linkedListTestDriver3.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver3.addLast((java.lang.Object) 100);
        boolean boolean8 = linkedListTestDriver3.isEmpty();
        java.lang.Class<?> wildcardClass9 = linkedListTestDriver3.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) wildcardClass9);
        int int11 = linkedListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = linkedListTestDriver0.get((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test108");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        boolean boolean3 = linkedListTestDriver1.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver4.addLast((java.lang.Object) 100);
        boolean boolean9 = linkedListTestDriver4.isEmpty();
        java.lang.Class<?> wildcardClass10 = linkedListTestDriver4.getClass();
        linkedListTestDriver1.addLast((java.lang.Object) wildcardClass10);
        int int12 = linkedListTestDriver1.size();
        java.lang.Object obj13 = linkedListTestDriver1.getLast();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver1);
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        boolean boolean18 = linkedListTestDriver16.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator19 = linkedListTestDriver16.iterator();
        boolean boolean20 = linkedListTestDriver16.isEmpty();
        experiment.util.Iterator iterator21 = linkedListTestDriver16.iterator();
        linkedListTestDriver0.add(1, (java.lang.Object) linkedListTestDriver16);
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        boolean boolean26 = linkedListTestDriver24.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver27 = new experiment.util.LinkedListTestDriver();
        boolean boolean29 = linkedListTestDriver27.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver27.addLast((java.lang.Object) 100);
        boolean boolean32 = linkedListTestDriver27.isEmpty();
        java.lang.Class<?> wildcardClass33 = linkedListTestDriver27.getClass();
        linkedListTestDriver24.addLast((java.lang.Object) wildcardClass33);
        boolean boolean35 = linkedListTestDriver23.equals_CUT((java.lang.Object) wildcardClass33);
        experiment.util.LinkedListTestDriver linkedListTestDriver36 = new experiment.util.LinkedListTestDriver();
        boolean boolean38 = linkedListTestDriver36.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator39 = linkedListTestDriver36.iterator();
        linkedListTestDriver23.addFirst((java.lang.Object) iterator39);
        boolean boolean41 = linkedListTestDriver16.contains((java.lang.Object) iterator39);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test109");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        java.lang.Object[] objArray3 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver4.addLast((java.lang.Object) 100);
        boolean boolean9 = linkedListTestDriver4.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.addFirst((java.lang.Object) linkedListTestDriver10);
        experiment.util.Iterator iterator12 = linkedListTestDriver4.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        boolean boolean16 = linkedListTestDriver14.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        boolean boolean19 = linkedListTestDriver17.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver17.addLast((java.lang.Object) 100);
        boolean boolean22 = linkedListTestDriver17.isEmpty();
        java.lang.Class<?> wildcardClass23 = linkedListTestDriver17.getClass();
        linkedListTestDriver14.addLast((java.lang.Object) wildcardClass23);
        boolean boolean25 = linkedListTestDriver13.equals_CUT((java.lang.Object) wildcardClass23);
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        boolean boolean28 = linkedListTestDriver26.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator29 = linkedListTestDriver26.iterator();
        linkedListTestDriver13.addFirst((java.lang.Object) iterator29);
        boolean boolean31 = linkedListTestDriver4.add((java.lang.Object) linkedListTestDriver13);
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver13);
        java.lang.Object[] objArray33 = linkedListTestDriver13.toArray();
        java.lang.Object obj34 = linkedListTestDriver13.removeLast();
        boolean boolean35 = linkedListTestDriver13.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test110");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.equals_CUT((java.lang.Object) 1L);
        boolean boolean11 = linkedListTestDriver7.contains((java.lang.Object) true);
        java.lang.Object[] objArray12 = linkedListTestDriver7.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        boolean boolean16 = linkedListTestDriver14.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        boolean boolean19 = linkedListTestDriver17.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver17.addLast((java.lang.Object) 100);
        boolean boolean22 = linkedListTestDriver17.isEmpty();
        java.lang.Class<?> wildcardClass23 = linkedListTestDriver17.getClass();
        linkedListTestDriver14.addLast((java.lang.Object) wildcardClass23);
        int int25 = linkedListTestDriver14.size();
        java.lang.Object obj26 = linkedListTestDriver14.getLast();
        linkedListTestDriver13.addFirst((java.lang.Object) linkedListTestDriver14);
        linkedListTestDriver7.addFirst((java.lang.Object) linkedListTestDriver13);
        boolean boolean29 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = linkedListTestDriver7.remove((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test111");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        java.lang.Object[] objArray3 = linkedListTestDriver0.toArray();
        java.lang.Object[] objArray4 = linkedListTestDriver0.toArray();
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = linkedListTestDriver0.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test112");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        boolean boolean3 = linkedListTestDriver1.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver4.addLast((java.lang.Object) 100);
        boolean boolean9 = linkedListTestDriver4.isEmpty();
        java.lang.Class<?> wildcardClass10 = linkedListTestDriver4.getClass();
        linkedListTestDriver1.addLast((java.lang.Object) wildcardClass10);
        boolean boolean12 = linkedListTestDriver0.equals_CUT((java.lang.Object) wildcardClass10);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        boolean boolean18 = linkedListTestDriver16.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver16.addLast((java.lang.Object) 100);
        boolean boolean21 = linkedListTestDriver16.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver16.addFirst((java.lang.Object) linkedListTestDriver22);
        experiment.util.Iterator iterator24 = linkedListTestDriver16.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        boolean boolean28 = linkedListTestDriver26.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        boolean boolean31 = linkedListTestDriver29.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver29.addLast((java.lang.Object) 100);
        boolean boolean34 = linkedListTestDriver29.isEmpty();
        java.lang.Class<?> wildcardClass35 = linkedListTestDriver29.getClass();
        linkedListTestDriver26.addLast((java.lang.Object) wildcardClass35);
        boolean boolean37 = linkedListTestDriver25.equals_CUT((java.lang.Object) wildcardClass35);
        experiment.util.LinkedListTestDriver linkedListTestDriver38 = new experiment.util.LinkedListTestDriver();
        boolean boolean40 = linkedListTestDriver38.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator41 = linkedListTestDriver38.iterator();
        linkedListTestDriver25.addFirst((java.lang.Object) iterator41);
        boolean boolean43 = linkedListTestDriver16.add((java.lang.Object) linkedListTestDriver25);
        java.lang.Object[] objArray44 = linkedListTestDriver25.toArray();
        java.lang.Object[] objArray45 = linkedListTestDriver25.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj46 = linkedListTestDriver0.set((int) (byte) -1, (java.lang.Object) objArray45);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(iterator41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray45);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test113");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        java.lang.Object obj6 = linkedListTestDriver0.getFirst();
        java.lang.Object[] objArray7 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addLast((java.lang.Object) 10.0d);
        boolean boolean11 = linkedListTestDriver0.add((java.lang.Object) ' ');
        java.lang.Object obj12 = linkedListTestDriver0.removeFirst();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100 + "'", obj6, 100);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100 + "'", obj12, 100);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test114");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) true);
        java.lang.Object obj3 = linkedListTestDriver0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = linkedListTestDriver0.getLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + true + "'", obj3, true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test115");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        boolean boolean3 = linkedListTestDriver1.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver4.addLast((java.lang.Object) 100);
        boolean boolean9 = linkedListTestDriver4.isEmpty();
        java.lang.Class<?> wildcardClass10 = linkedListTestDriver4.getClass();
        linkedListTestDriver1.addLast((java.lang.Object) wildcardClass10);
        int int12 = linkedListTestDriver1.size();
        java.lang.Object obj13 = linkedListTestDriver1.getLast();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver1);
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = linkedListTestDriver0.set((int) (short) 100, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "class experiment.util.LinkedListTestDriver");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test116");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        boolean boolean4 = linkedListTestDriver0.contains((java.lang.Object) true);
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
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test117");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        java.lang.Object[] objArray8 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver9.addLast((java.lang.Object) 100);
        int int14 = linkedListTestDriver9.size();
        boolean boolean16 = linkedListTestDriver9.contains((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        boolean boolean19 = linkedListTestDriver17.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator20 = linkedListTestDriver17.iterator();
        boolean boolean21 = linkedListTestDriver17.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        boolean boolean25 = linkedListTestDriver23.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        boolean boolean28 = linkedListTestDriver26.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver26.addLast((java.lang.Object) 100);
        boolean boolean31 = linkedListTestDriver26.isEmpty();
        java.lang.Class<?> wildcardClass32 = linkedListTestDriver26.getClass();
        linkedListTestDriver23.addLast((java.lang.Object) wildcardClass32);
        boolean boolean34 = linkedListTestDriver22.equals_CUT((java.lang.Object) wildcardClass32);
        experiment.util.LinkedListTestDriver linkedListTestDriver35 = new experiment.util.LinkedListTestDriver();
        boolean boolean37 = linkedListTestDriver35.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator38 = linkedListTestDriver35.iterator();
        linkedListTestDriver22.addFirst((java.lang.Object) iterator38);
        linkedListTestDriver17.addLast((java.lang.Object) linkedListTestDriver22);
        java.lang.Object obj41 = linkedListTestDriver17.removeFirst();
        int int42 = linkedListTestDriver17.size();
        boolean boolean43 = linkedListTestDriver17.isEmpty();
        linkedListTestDriver9.addLast((java.lang.Object) linkedListTestDriver17);
        boolean boolean45 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test118");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator7 = linkedListTestDriver4.iterator();
        boolean boolean8 = linkedListTestDriver4.isEmpty();
        boolean boolean9 = linkedListTestDriver0.contains((java.lang.Object) boolean8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = linkedListTestDriver0.getLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test119");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        boolean boolean5 = linkedListTestDriver3.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver3.addLast((java.lang.Object) 100);
        boolean boolean8 = linkedListTestDriver3.isEmpty();
        java.lang.Class<?> wildcardClass9 = linkedListTestDriver3.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) wildcardClass9);
        int int11 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver13.addLast((java.lang.Object) 100);
        boolean boolean18 = linkedListTestDriver13.isEmpty();
        java.lang.Object obj19 = linkedListTestDriver13.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        boolean boolean22 = linkedListTestDriver20.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver20.addLast((java.lang.Object) 100);
        boolean boolean25 = linkedListTestDriver20.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver20.addFirst((java.lang.Object) linkedListTestDriver26);
        experiment.util.Iterator iterator28 = linkedListTestDriver20.iterator();
        java.lang.Object obj30 = linkedListTestDriver20.remove((int) (byte) 0);
        boolean boolean31 = linkedListTestDriver13.add(obj30);
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        boolean boolean34 = linkedListTestDriver32.equals_CUT((java.lang.Object) 1L);
        boolean boolean36 = linkedListTestDriver32.contains((java.lang.Object) true);
        java.lang.Object[] objArray37 = linkedListTestDriver32.toArray();
        boolean boolean38 = linkedListTestDriver13.remove((java.lang.Object) objArray37);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) (byte) -1, (java.lang.Object) objArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100 + "'", obj19, 100);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test120");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) (short) 100);
        java.lang.Object obj8 = linkedListTestDriver0.getFirst();
        java.lang.Object[] objArray9 = linkedListTestDriver0.toArray();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100 + "'", obj8, 100);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[100]");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test121");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        boolean boolean5 = linkedListTestDriver3.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver3.addLast((java.lang.Object) 100);
        boolean boolean8 = linkedListTestDriver3.isEmpty();
        java.lang.Class<?> wildcardClass9 = linkedListTestDriver3.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) wildcardClass9);
        int int11 = linkedListTestDriver0.size();
        java.lang.Object obj12 = linkedListTestDriver0.getLast();
        java.lang.Object obj13 = linkedListTestDriver0.removeFirst();
        boolean boolean14 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = linkedListTestDriver0.getLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test122");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) (short) 100);
        boolean boolean8 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        boolean boolean12 = linkedListTestDriver10.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver13.addLast((java.lang.Object) 100);
        boolean boolean18 = linkedListTestDriver13.isEmpty();
        java.lang.Class<?> wildcardClass19 = linkedListTestDriver13.getClass();
        linkedListTestDriver10.addLast((java.lang.Object) wildcardClass19);
        boolean boolean21 = linkedListTestDriver9.equals_CUT((java.lang.Object) wildcardClass19);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        boolean boolean24 = linkedListTestDriver22.equals_CUT((java.lang.Object) 1L);
        experiment.util.Iterator iterator25 = linkedListTestDriver22.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver27 = new experiment.util.LinkedListTestDriver();
        boolean boolean29 = linkedListTestDriver27.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        boolean boolean32 = linkedListTestDriver30.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver30.addLast((java.lang.Object) 100);
        boolean boolean35 = linkedListTestDriver30.isEmpty();
        java.lang.Class<?> wildcardClass36 = linkedListTestDriver30.getClass();
        linkedListTestDriver27.addLast((java.lang.Object) wildcardClass36);
        boolean boolean38 = linkedListTestDriver26.equals_CUT((java.lang.Object) wildcardClass36);
        experiment.util.LinkedListTestDriver linkedListTestDriver39 = new experiment.util.LinkedListTestDriver();
        boolean boolean41 = linkedListTestDriver39.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator42 = linkedListTestDriver39.iterator();
        linkedListTestDriver26.addFirst((java.lang.Object) iterator42);
        boolean boolean44 = linkedListTestDriver22.equals_CUT((java.lang.Object) linkedListTestDriver26);
        java.lang.Object obj45 = linkedListTestDriver26.getLast();
        linkedListTestDriver9.addLast((java.lang.Object) linkedListTestDriver26);
        boolean boolean47 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver9);
        linkedListTestDriver9.addLast((java.lang.Object) (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(iterator42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test123");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) (short) 100);
        boolean boolean8 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        boolean boolean12 = linkedListTestDriver10.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver13.addLast((java.lang.Object) 100);
        boolean boolean18 = linkedListTestDriver13.isEmpty();
        java.lang.Class<?> wildcardClass19 = linkedListTestDriver13.getClass();
        linkedListTestDriver10.addLast((java.lang.Object) wildcardClass19);
        boolean boolean21 = linkedListTestDriver9.equals_CUT((java.lang.Object) wildcardClass19);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        boolean boolean24 = linkedListTestDriver22.equals_CUT((java.lang.Object) 1L);
        experiment.util.Iterator iterator25 = linkedListTestDriver22.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver27 = new experiment.util.LinkedListTestDriver();
        boolean boolean29 = linkedListTestDriver27.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        boolean boolean32 = linkedListTestDriver30.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver30.addLast((java.lang.Object) 100);
        boolean boolean35 = linkedListTestDriver30.isEmpty();
        java.lang.Class<?> wildcardClass36 = linkedListTestDriver30.getClass();
        linkedListTestDriver27.addLast((java.lang.Object) wildcardClass36);
        boolean boolean38 = linkedListTestDriver26.equals_CUT((java.lang.Object) wildcardClass36);
        experiment.util.LinkedListTestDriver linkedListTestDriver39 = new experiment.util.LinkedListTestDriver();
        boolean boolean41 = linkedListTestDriver39.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator42 = linkedListTestDriver39.iterator();
        linkedListTestDriver26.addFirst((java.lang.Object) iterator42);
        boolean boolean44 = linkedListTestDriver22.equals_CUT((java.lang.Object) linkedListTestDriver26);
        java.lang.Object obj45 = linkedListTestDriver26.getLast();
        linkedListTestDriver9.addLast((java.lang.Object) linkedListTestDriver26);
        boolean boolean47 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver9);
        java.lang.Object obj49 = null;
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) (short) 100, obj49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(iterator42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test124");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        boolean boolean3 = linkedListTestDriver1.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver4.addLast((java.lang.Object) 100);
        boolean boolean9 = linkedListTestDriver4.isEmpty();
        java.lang.Class<?> wildcardClass10 = linkedListTestDriver4.getClass();
        linkedListTestDriver1.addLast((java.lang.Object) wildcardClass10);
        int int12 = linkedListTestDriver1.size();
        java.lang.Object obj13 = linkedListTestDriver1.getLast();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver1);
        experiment.util.Iterator iterator15 = linkedListTestDriver1.iterator();
        experiment.util.Iterator iterator16 = linkedListTestDriver1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = linkedListTestDriver1.remove((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(iterator16);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test125");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        java.lang.Object obj10 = linkedListTestDriver0.remove((int) (byte) 0);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = linkedListTestDriver0.remove((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test126");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        boolean boolean12 = linkedListTestDriver10.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver13.addLast((java.lang.Object) 100);
        boolean boolean18 = linkedListTestDriver13.isEmpty();
        java.lang.Class<?> wildcardClass19 = linkedListTestDriver13.getClass();
        linkedListTestDriver10.addLast((java.lang.Object) wildcardClass19);
        boolean boolean21 = linkedListTestDriver9.equals_CUT((java.lang.Object) wildcardClass19);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        boolean boolean24 = linkedListTestDriver22.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator25 = linkedListTestDriver22.iterator();
        linkedListTestDriver9.addFirst((java.lang.Object) iterator25);
        boolean boolean27 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver9);
        java.lang.Object[] objArray28 = linkedListTestDriver9.toArray();
        java.lang.Object[] objArray29 = linkedListTestDriver9.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        boolean boolean32 = linkedListTestDriver30.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver30.addLast((java.lang.Object) 100);
        boolean boolean35 = linkedListTestDriver30.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver36 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver30.addFirst((java.lang.Object) linkedListTestDriver36);
        experiment.util.Iterator iterator38 = linkedListTestDriver30.iterator();
        java.lang.Object obj40 = linkedListTestDriver30.remove((int) (byte) 0);
        experiment.util.Iterator iterator41 = linkedListTestDriver30.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver42 = new experiment.util.LinkedListTestDriver();
        boolean boolean44 = linkedListTestDriver42.equals_CUT((java.lang.Object) 1L);
        boolean boolean46 = linkedListTestDriver42.add((java.lang.Object) (short) 1);
        boolean boolean47 = linkedListTestDriver30.equals_CUT((java.lang.Object) boolean46);
        java.lang.Object obj48 = linkedListTestDriver30.removeLast();
        java.lang.Object[] objArray49 = linkedListTestDriver30.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver50 = new experiment.util.LinkedListTestDriver();
        boolean boolean52 = linkedListTestDriver50.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver50.addLast((java.lang.Object) 100);
        int int55 = linkedListTestDriver50.size();
        boolean boolean57 = linkedListTestDriver50.contains((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver58 = new experiment.util.LinkedListTestDriver();
        boolean boolean60 = linkedListTestDriver58.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator61 = linkedListTestDriver58.iterator();
        boolean boolean62 = linkedListTestDriver58.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver63 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver64 = new experiment.util.LinkedListTestDriver();
        boolean boolean66 = linkedListTestDriver64.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver67 = new experiment.util.LinkedListTestDriver();
        boolean boolean69 = linkedListTestDriver67.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver67.addLast((java.lang.Object) 100);
        boolean boolean72 = linkedListTestDriver67.isEmpty();
        java.lang.Class<?> wildcardClass73 = linkedListTestDriver67.getClass();
        linkedListTestDriver64.addLast((java.lang.Object) wildcardClass73);
        boolean boolean75 = linkedListTestDriver63.equals_CUT((java.lang.Object) wildcardClass73);
        experiment.util.LinkedListTestDriver linkedListTestDriver76 = new experiment.util.LinkedListTestDriver();
        boolean boolean78 = linkedListTestDriver76.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator79 = linkedListTestDriver76.iterator();
        linkedListTestDriver63.addFirst((java.lang.Object) iterator79);
        linkedListTestDriver58.addLast((java.lang.Object) linkedListTestDriver63);
        java.lang.Object obj82 = linkedListTestDriver58.removeFirst();
        int int83 = linkedListTestDriver58.size();
        boolean boolean84 = linkedListTestDriver58.isEmpty();
        linkedListTestDriver50.addLast((java.lang.Object) linkedListTestDriver58);
        boolean boolean86 = linkedListTestDriver30.contains((java.lang.Object) linkedListTestDriver50);
        boolean boolean87 = linkedListTestDriver9.equals_CUT((java.lang.Object) linkedListTestDriver50);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertNotNull(iterator41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 100 + "'", obj48, 100);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(iterator61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(iterator79);
        org.junit.Assert.assertNotNull(obj82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test127");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        boolean boolean3 = linkedListTestDriver1.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver4.addLast((java.lang.Object) 100);
        boolean boolean9 = linkedListTestDriver4.isEmpty();
        java.lang.Class<?> wildcardClass10 = linkedListTestDriver4.getClass();
        linkedListTestDriver1.addLast((java.lang.Object) wildcardClass10);
        boolean boolean12 = linkedListTestDriver0.equals_CUT((java.lang.Object) wildcardClass10);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator16 = linkedListTestDriver13.iterator();
        linkedListTestDriver0.addFirst((java.lang.Object) iterator16);
        java.lang.Object obj18 = linkedListTestDriver0.getFirst();
        java.lang.Object obj19 = linkedListTestDriver0.removeLast();
        int int20 = linkedListTestDriver0.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test128");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        boolean boolean3 = linkedListTestDriver1.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver4.addLast((java.lang.Object) 100);
        boolean boolean9 = linkedListTestDriver4.isEmpty();
        java.lang.Class<?> wildcardClass10 = linkedListTestDriver4.getClass();
        linkedListTestDriver1.addLast((java.lang.Object) wildcardClass10);
        int int12 = linkedListTestDriver1.size();
        java.lang.Object obj13 = linkedListTestDriver1.getLast();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver1);
        experiment.util.Iterator iterator15 = linkedListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator17 = linkedListTestDriver0.listIterator((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertNotNull(iterator15);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test129");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        experiment.util.Iterator iterator4 = linkedListTestDriver0.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(iterator4);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test130");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) (short) 100);
        boolean boolean8 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        boolean boolean12 = linkedListTestDriver10.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver13.addLast((java.lang.Object) 100);
        boolean boolean18 = linkedListTestDriver13.isEmpty();
        java.lang.Class<?> wildcardClass19 = linkedListTestDriver13.getClass();
        linkedListTestDriver10.addLast((java.lang.Object) wildcardClass19);
        boolean boolean21 = linkedListTestDriver9.equals_CUT((java.lang.Object) wildcardClass19);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        boolean boolean24 = linkedListTestDriver22.equals_CUT((java.lang.Object) 1L);
        experiment.util.Iterator iterator25 = linkedListTestDriver22.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver27 = new experiment.util.LinkedListTestDriver();
        boolean boolean29 = linkedListTestDriver27.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        boolean boolean32 = linkedListTestDriver30.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver30.addLast((java.lang.Object) 100);
        boolean boolean35 = linkedListTestDriver30.isEmpty();
        java.lang.Class<?> wildcardClass36 = linkedListTestDriver30.getClass();
        linkedListTestDriver27.addLast((java.lang.Object) wildcardClass36);
        boolean boolean38 = linkedListTestDriver26.equals_CUT((java.lang.Object) wildcardClass36);
        experiment.util.LinkedListTestDriver linkedListTestDriver39 = new experiment.util.LinkedListTestDriver();
        boolean boolean41 = linkedListTestDriver39.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator42 = linkedListTestDriver39.iterator();
        linkedListTestDriver26.addFirst((java.lang.Object) iterator42);
        boolean boolean44 = linkedListTestDriver22.equals_CUT((java.lang.Object) linkedListTestDriver26);
        java.lang.Object obj45 = linkedListTestDriver26.getLast();
        linkedListTestDriver9.addLast((java.lang.Object) linkedListTestDriver26);
        boolean boolean47 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver9);
        java.lang.Class<?> wildcardClass48 = linkedListTestDriver9.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(iterator42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test131");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        boolean boolean5 = linkedListTestDriver3.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver3.addLast((java.lang.Object) 100);
        boolean boolean8 = linkedListTestDriver3.isEmpty();
        java.lang.Class<?> wildcardClass9 = linkedListTestDriver3.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) wildcardClass9);
        int int11 = linkedListTestDriver0.size();
        java.lang.Object obj12 = linkedListTestDriver0.getLast();
        boolean boolean13 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = linkedListTestDriver0.get((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test132");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) (short) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.remove((java.lang.Object) '#');
        java.lang.Object[] objArray9 = linkedListTestDriver6.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        boolean boolean12 = linkedListTestDriver10.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver10.addLast((java.lang.Object) 100);
        boolean boolean15 = linkedListTestDriver10.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addFirst((java.lang.Object) linkedListTestDriver16);
        experiment.util.Iterator iterator18 = linkedListTestDriver10.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        boolean boolean22 = linkedListTestDriver20.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        boolean boolean25 = linkedListTestDriver23.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver23.addLast((java.lang.Object) 100);
        boolean boolean28 = linkedListTestDriver23.isEmpty();
        java.lang.Class<?> wildcardClass29 = linkedListTestDriver23.getClass();
        linkedListTestDriver20.addLast((java.lang.Object) wildcardClass29);
        boolean boolean31 = linkedListTestDriver19.equals_CUT((java.lang.Object) wildcardClass29);
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        boolean boolean34 = linkedListTestDriver32.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator35 = linkedListTestDriver32.iterator();
        linkedListTestDriver19.addFirst((java.lang.Object) iterator35);
        boolean boolean37 = linkedListTestDriver10.add((java.lang.Object) linkedListTestDriver19);
        linkedListTestDriver6.addLast((java.lang.Object) linkedListTestDriver19);
        boolean boolean40 = linkedListTestDriver19.remove((java.lang.Object) (byte) 10);
        linkedListTestDriver0.add(0, (java.lang.Object) linkedListTestDriver19);
        experiment.util.Iterator iterator42 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver44 = new experiment.util.LinkedListTestDriver();
        boolean boolean46 = linkedListTestDriver44.remove((java.lang.Object) '#');
        java.lang.Object[] objArray47 = linkedListTestDriver44.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver48 = new experiment.util.LinkedListTestDriver();
        boolean boolean50 = linkedListTestDriver48.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver48.addLast((java.lang.Object) 100);
        boolean boolean53 = linkedListTestDriver48.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver54 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver48.addFirst((java.lang.Object) linkedListTestDriver54);
        experiment.util.Iterator iterator56 = linkedListTestDriver48.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver57 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver58 = new experiment.util.LinkedListTestDriver();
        boolean boolean60 = linkedListTestDriver58.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver61 = new experiment.util.LinkedListTestDriver();
        boolean boolean63 = linkedListTestDriver61.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver61.addLast((java.lang.Object) 100);
        boolean boolean66 = linkedListTestDriver61.isEmpty();
        java.lang.Class<?> wildcardClass67 = linkedListTestDriver61.getClass();
        linkedListTestDriver58.addLast((java.lang.Object) wildcardClass67);
        boolean boolean69 = linkedListTestDriver57.equals_CUT((java.lang.Object) wildcardClass67);
        experiment.util.LinkedListTestDriver linkedListTestDriver70 = new experiment.util.LinkedListTestDriver();
        boolean boolean72 = linkedListTestDriver70.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator73 = linkedListTestDriver70.iterator();
        linkedListTestDriver57.addFirst((java.lang.Object) iterator73);
        boolean boolean75 = linkedListTestDriver48.add((java.lang.Object) linkedListTestDriver57);
        linkedListTestDriver44.addLast((java.lang.Object) linkedListTestDriver57);
        experiment.util.LinkedListTestDriver linkedListTestDriver77 = new experiment.util.LinkedListTestDriver();
        boolean boolean79 = linkedListTestDriver77.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver77.addLast((java.lang.Object) 100);
        boolean boolean82 = linkedListTestDriver77.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver83 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver77.addFirst((java.lang.Object) linkedListTestDriver83);
        java.lang.Object[] objArray85 = linkedListTestDriver77.toArray();
        java.lang.Object obj86 = linkedListTestDriver77.removeLast();
        linkedListTestDriver57.addLast((java.lang.Object) linkedListTestDriver77);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add(10, (java.lang.Object) linkedListTestDriver77);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(iterator42);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(iterator56);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(iterator73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertEquals("'" + obj86 + "' != '" + 100 + "'", obj86, 100);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test133");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) true);
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver5.addLast((java.lang.Object) 100);
        boolean boolean10 = linkedListTestDriver5.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver5.addFirst((java.lang.Object) linkedListTestDriver11);
        java.lang.Object[] objArray13 = linkedListTestDriver5.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        boolean boolean16 = linkedListTestDriver14.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver14.addLast((java.lang.Object) 100);
        boolean boolean19 = linkedListTestDriver14.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver14.addFirst((java.lang.Object) linkedListTestDriver20);
        experiment.util.Iterator iterator22 = linkedListTestDriver14.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        boolean boolean26 = linkedListTestDriver24.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver27 = new experiment.util.LinkedListTestDriver();
        boolean boolean29 = linkedListTestDriver27.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver27.addLast((java.lang.Object) 100);
        boolean boolean32 = linkedListTestDriver27.isEmpty();
        java.lang.Class<?> wildcardClass33 = linkedListTestDriver27.getClass();
        linkedListTestDriver24.addLast((java.lang.Object) wildcardClass33);
        boolean boolean35 = linkedListTestDriver23.equals_CUT((java.lang.Object) wildcardClass33);
        experiment.util.LinkedListTestDriver linkedListTestDriver36 = new experiment.util.LinkedListTestDriver();
        boolean boolean38 = linkedListTestDriver36.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator39 = linkedListTestDriver36.iterator();
        linkedListTestDriver23.addFirst((java.lang.Object) iterator39);
        boolean boolean41 = linkedListTestDriver14.add((java.lang.Object) linkedListTestDriver23);
        experiment.util.Iterator iterator42 = linkedListTestDriver23.iterator();
        linkedListTestDriver5.addLast((java.lang.Object) iterator42);
        experiment.util.LinkedListTestDriver linkedListTestDriver44 = new experiment.util.LinkedListTestDriver();
        boolean boolean46 = linkedListTestDriver44.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver44.addLast((java.lang.Object) 100);
        boolean boolean49 = linkedListTestDriver44.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver50 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver44.addFirst((java.lang.Object) linkedListTestDriver50);
        experiment.util.Iterator iterator52 = linkedListTestDriver44.iterator();
        java.lang.Object obj53 = linkedListTestDriver44.getLast();
        java.lang.Object obj54 = linkedListTestDriver44.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver55 = new experiment.util.LinkedListTestDriver();
        boolean boolean57 = linkedListTestDriver55.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver55.addLast((java.lang.Object) 100);
        boolean boolean60 = linkedListTestDriver55.isEmpty();
        linkedListTestDriver55.clear();
        linkedListTestDriver44.addFirst((java.lang.Object) linkedListTestDriver55);
        boolean boolean63 = linkedListTestDriver5.equals_CUT((java.lang.Object) linkedListTestDriver44);
        linkedListTestDriver0.add(0, (java.lang.Object) linkedListTestDriver5);
        linkedListTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(iterator42);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(iterator52);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + 100 + "'", obj53, 100);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + 100 + "'", obj54, 100);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test134");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean4 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver9.addLast((java.lang.Object) 100);
        boolean boolean14 = linkedListTestDriver9.isEmpty();
        java.lang.Class<?> wildcardClass15 = linkedListTestDriver9.getClass();
        linkedListTestDriver6.addLast((java.lang.Object) wildcardClass15);
        boolean boolean17 = linkedListTestDriver5.equals_CUT((java.lang.Object) wildcardClass15);
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver18.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator21 = linkedListTestDriver18.iterator();
        linkedListTestDriver5.addFirst((java.lang.Object) iterator21);
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        java.lang.Object obj25 = linkedListTestDriver5.remove((int) (byte) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        boolean boolean28 = linkedListTestDriver26.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        boolean boolean31 = linkedListTestDriver29.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver29.addLast((java.lang.Object) 100);
        boolean boolean34 = linkedListTestDriver29.isEmpty();
        java.lang.Class<?> wildcardClass35 = linkedListTestDriver29.getClass();
        linkedListTestDriver26.addLast((java.lang.Object) wildcardClass35);
        int int37 = linkedListTestDriver26.size();
        java.lang.Object obj38 = linkedListTestDriver26.getLast();
        java.lang.Object obj39 = linkedListTestDriver26.removeLast();
        boolean boolean40 = linkedListTestDriver26.isEmpty();
        linkedListTestDriver5.addLast((java.lang.Object) boolean40);
        experiment.util.LinkedListTestDriver linkedListTestDriver42 = new experiment.util.LinkedListTestDriver();
        boolean boolean44 = linkedListTestDriver42.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver45 = new experiment.util.LinkedListTestDriver();
        boolean boolean47 = linkedListTestDriver45.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver45.addLast((java.lang.Object) 100);
        boolean boolean50 = linkedListTestDriver45.isEmpty();
        java.lang.Class<?> wildcardClass51 = linkedListTestDriver45.getClass();
        linkedListTestDriver42.addLast((java.lang.Object) wildcardClass51);
        int int53 = linkedListTestDriver42.size();
        java.lang.Object obj54 = linkedListTestDriver42.getLast();
        java.lang.Object obj55 = linkedListTestDriver42.removeLast();
        boolean boolean56 = linkedListTestDriver42.isEmpty();
        linkedListTestDriver42.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver58 = new experiment.util.LinkedListTestDriver();
        boolean boolean60 = linkedListTestDriver58.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver61 = new experiment.util.LinkedListTestDriver();
        boolean boolean63 = linkedListTestDriver61.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver61.addLast((java.lang.Object) 100);
        boolean boolean66 = linkedListTestDriver61.isEmpty();
        java.lang.Class<?> wildcardClass67 = linkedListTestDriver61.getClass();
        linkedListTestDriver58.addLast((java.lang.Object) wildcardClass67);
        boolean boolean70 = linkedListTestDriver58.equals_CUT((java.lang.Object) (short) 1);
        java.lang.Object obj71 = linkedListTestDriver58.removeFirst();
        linkedListTestDriver42.addLast(obj71);
        boolean boolean73 = linkedListTestDriver5.contains((java.lang.Object) linkedListTestDriver42);
        java.lang.Class<?> wildcardClass74 = linkedListTestDriver5.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertEquals(obj38.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj38), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj38), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertEquals(obj39.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj39), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj39), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertEquals(obj54.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj54), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj54), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertEquals(obj55.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj55), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj55), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(obj71);
        org.junit.Assert.assertEquals(obj71.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj71), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj71), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test135");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        boolean boolean5 = linkedListTestDriver3.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver3.addLast((java.lang.Object) 100);
        boolean boolean8 = linkedListTestDriver3.isEmpty();
        java.lang.Class<?> wildcardClass9 = linkedListTestDriver3.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) wildcardClass9);
        int int11 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        boolean boolean14 = linkedListTestDriver12.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver12.addLast((java.lang.Object) 100);
        boolean boolean17 = linkedListTestDriver12.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addFirst((java.lang.Object) linkedListTestDriver18);
        java.lang.Object[] objArray20 = linkedListTestDriver12.toArray();
        java.lang.Object obj21 = linkedListTestDriver12.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        boolean boolean24 = linkedListTestDriver22.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver22.addLast((java.lang.Object) 100);
        boolean boolean27 = linkedListTestDriver22.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver22.addFirst((java.lang.Object) linkedListTestDriver28);
        experiment.util.Iterator iterator30 = linkedListTestDriver22.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        boolean boolean34 = linkedListTestDriver32.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver35 = new experiment.util.LinkedListTestDriver();
        boolean boolean37 = linkedListTestDriver35.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver35.addLast((java.lang.Object) 100);
        boolean boolean40 = linkedListTestDriver35.isEmpty();
        java.lang.Class<?> wildcardClass41 = linkedListTestDriver35.getClass();
        linkedListTestDriver32.addLast((java.lang.Object) wildcardClass41);
        boolean boolean43 = linkedListTestDriver31.equals_CUT((java.lang.Object) wildcardClass41);
        experiment.util.LinkedListTestDriver linkedListTestDriver44 = new experiment.util.LinkedListTestDriver();
        boolean boolean46 = linkedListTestDriver44.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator47 = linkedListTestDriver44.iterator();
        linkedListTestDriver31.addFirst((java.lang.Object) iterator47);
        boolean boolean49 = linkedListTestDriver22.add((java.lang.Object) linkedListTestDriver31);
        experiment.util.Iterator iterator50 = linkedListTestDriver31.iterator();
        boolean boolean51 = linkedListTestDriver12.remove((java.lang.Object) iterator50);
        linkedListTestDriver0.addFirst((java.lang.Object) boolean51);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100 + "'", obj21, 100);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(iterator47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(iterator50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test136");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        boolean boolean3 = linkedListTestDriver1.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver4.addLast((java.lang.Object) 100);
        boolean boolean9 = linkedListTestDriver4.isEmpty();
        java.lang.Class<?> wildcardClass10 = linkedListTestDriver4.getClass();
        linkedListTestDriver1.addLast((java.lang.Object) wildcardClass10);
        int int12 = linkedListTestDriver1.size();
        java.lang.Object obj13 = linkedListTestDriver1.getLast();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver1);
        experiment.util.Iterator iterator15 = linkedListTestDriver0.iterator();
        java.lang.Object obj16 = linkedListTestDriver0.getLast();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test137");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        boolean boolean5 = linkedListTestDriver3.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver3.addLast((java.lang.Object) 100);
        boolean boolean8 = linkedListTestDriver3.isEmpty();
        java.lang.Class<?> wildcardClass9 = linkedListTestDriver3.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) wildcardClass9);
        int int11 = linkedListTestDriver0.size();
        java.lang.Object obj12 = linkedListTestDriver0.getLast();
        java.lang.Object obj13 = linkedListTestDriver0.removeLast();
        boolean boolean15 = linkedListTestDriver0.remove((java.lang.Object) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = linkedListTestDriver0.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test138");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        java.lang.Object[] objArray8 = linkedListTestDriver0.toArray();
        boolean boolean10 = linkedListTestDriver0.contains((java.lang.Object) 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = linkedListTestDriver0.get((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test139");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator7 = linkedListTestDriver4.iterator();
        boolean boolean8 = linkedListTestDriver4.isEmpty();
        boolean boolean9 = linkedListTestDriver0.contains((java.lang.Object) boolean8);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        boolean boolean12 = linkedListTestDriver10.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver10.addLast((java.lang.Object) 100);
        boolean boolean15 = linkedListTestDriver10.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addFirst((java.lang.Object) linkedListTestDriver16);
        experiment.util.Iterator iterator18 = linkedListTestDriver10.iterator();
        java.lang.Object obj19 = linkedListTestDriver10.getLast();
        int int20 = linkedListTestDriver10.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        boolean boolean23 = linkedListTestDriver21.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        boolean boolean26 = linkedListTestDriver24.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver24.addLast((java.lang.Object) 100);
        boolean boolean29 = linkedListTestDriver24.isEmpty();
        java.lang.Class<?> wildcardClass30 = linkedListTestDriver24.getClass();
        linkedListTestDriver21.addLast((java.lang.Object) wildcardClass30);
        int int32 = linkedListTestDriver21.size();
        java.lang.Object obj33 = linkedListTestDriver21.getLast();
        java.lang.Object obj34 = linkedListTestDriver21.removeLast();
        boolean boolean35 = linkedListTestDriver21.isEmpty();
        linkedListTestDriver21.clear();
        boolean boolean37 = linkedListTestDriver10.add((java.lang.Object) linkedListTestDriver21);
        java.lang.Object obj38 = linkedListTestDriver10.removeFirst();
        boolean boolean39 = linkedListTestDriver0.contains(obj38);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator41 = linkedListTestDriver0.listIterator((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 52; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100 + "'", obj19, 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertEquals(obj33.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj33), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj33), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals(obj34.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj34), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj34), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test140");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        java.lang.Object obj9 = linkedListTestDriver0.getLast();
        int int10 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver11.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        boolean boolean16 = linkedListTestDriver14.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver14.addLast((java.lang.Object) 100);
        boolean boolean19 = linkedListTestDriver14.isEmpty();
        java.lang.Class<?> wildcardClass20 = linkedListTestDriver14.getClass();
        linkedListTestDriver11.addLast((java.lang.Object) wildcardClass20);
        int int22 = linkedListTestDriver11.size();
        java.lang.Object obj23 = linkedListTestDriver11.getLast();
        java.lang.Object obj24 = linkedListTestDriver11.removeLast();
        boolean boolean25 = linkedListTestDriver11.isEmpty();
        linkedListTestDriver11.clear();
        boolean boolean27 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver11);
        java.lang.Object obj28 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        boolean boolean31 = linkedListTestDriver29.equals_CUT((java.lang.Object) 1L);
        boolean boolean33 = linkedListTestDriver29.add((java.lang.Object) (short) 1);
        java.lang.Object obj35 = linkedListTestDriver29.remove(0);
        boolean boolean36 = linkedListTestDriver0.add(obj35);
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        boolean boolean39 = linkedListTestDriver37.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator40 = linkedListTestDriver37.iterator();
        boolean boolean41 = linkedListTestDriver37.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver42 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver43 = new experiment.util.LinkedListTestDriver();
        boolean boolean45 = linkedListTestDriver43.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver46 = new experiment.util.LinkedListTestDriver();
        boolean boolean48 = linkedListTestDriver46.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver46.addLast((java.lang.Object) 100);
        boolean boolean51 = linkedListTestDriver46.isEmpty();
        java.lang.Class<?> wildcardClass52 = linkedListTestDriver46.getClass();
        linkedListTestDriver43.addLast((java.lang.Object) wildcardClass52);
        boolean boolean54 = linkedListTestDriver42.equals_CUT((java.lang.Object) wildcardClass52);
        experiment.util.LinkedListTestDriver linkedListTestDriver55 = new experiment.util.LinkedListTestDriver();
        boolean boolean57 = linkedListTestDriver55.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator58 = linkedListTestDriver55.iterator();
        linkedListTestDriver42.addFirst((java.lang.Object) iterator58);
        linkedListTestDriver37.addLast((java.lang.Object) linkedListTestDriver42);
        java.lang.Object obj62 = linkedListTestDriver42.remove((int) (byte) 0);
        boolean boolean63 = linkedListTestDriver0.contains(obj62);
        experiment.util.LinkedListTestDriver linkedListTestDriver64 = new experiment.util.LinkedListTestDriver();
        boolean boolean66 = linkedListTestDriver64.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver64.addLast((java.lang.Object) 100);
        boolean boolean69 = linkedListTestDriver64.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver70 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver64.addFirst((java.lang.Object) linkedListTestDriver70);
        experiment.util.Iterator iterator72 = linkedListTestDriver64.iterator();
        java.lang.Object obj73 = linkedListTestDriver64.getLast();
        int int74 = linkedListTestDriver64.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver75 = new experiment.util.LinkedListTestDriver();
        boolean boolean77 = linkedListTestDriver75.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver78 = new experiment.util.LinkedListTestDriver();
        boolean boolean80 = linkedListTestDriver78.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver78.addLast((java.lang.Object) 100);
        boolean boolean83 = linkedListTestDriver78.isEmpty();
        java.lang.Class<?> wildcardClass84 = linkedListTestDriver78.getClass();
        linkedListTestDriver75.addLast((java.lang.Object) wildcardClass84);
        int int86 = linkedListTestDriver75.size();
        java.lang.Object obj87 = linkedListTestDriver75.getLast();
        java.lang.Object obj88 = linkedListTestDriver75.removeLast();
        boolean boolean89 = linkedListTestDriver75.isEmpty();
        linkedListTestDriver75.clear();
        boolean boolean91 = linkedListTestDriver64.add((java.lang.Object) linkedListTestDriver75);
        boolean boolean92 = linkedListTestDriver64.isEmpty();
        linkedListTestDriver0.addLast((java.lang.Object) boolean92);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100 + "'", obj9, 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (short) 1 + "'", obj35, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(iterator40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(iterator58);
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(iterator72);
        org.junit.Assert.assertEquals("'" + obj73 + "' != '" + 100 + "'", obj73, 100);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 2 + "'", int74 == 2);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(wildcardClass84);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 1 + "'", int86 == 1);
        org.junit.Assert.assertNotNull(obj87);
        org.junit.Assert.assertEquals(obj87.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj87), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj87), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertNotNull(obj88);
        org.junit.Assert.assertEquals(obj88.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj88), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj88), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test141");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        boolean boolean3 = linkedListTestDriver1.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver4.addLast((java.lang.Object) 100);
        boolean boolean9 = linkedListTestDriver4.isEmpty();
        java.lang.Class<?> wildcardClass10 = linkedListTestDriver4.getClass();
        linkedListTestDriver1.addLast((java.lang.Object) wildcardClass10);
        boolean boolean12 = linkedListTestDriver0.equals_CUT((java.lang.Object) wildcardClass10);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator16 = linkedListTestDriver13.iterator();
        linkedListTestDriver0.addFirst((java.lang.Object) iterator16);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator19 = linkedListTestDriver0.listIterator((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator16);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test142");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        int int5 = linkedListTestDriver0.size();
        boolean boolean7 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        boolean boolean10 = linkedListTestDriver8.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator11 = linkedListTestDriver8.iterator();
        boolean boolean12 = linkedListTestDriver8.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        boolean boolean16 = linkedListTestDriver14.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        boolean boolean19 = linkedListTestDriver17.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver17.addLast((java.lang.Object) 100);
        boolean boolean22 = linkedListTestDriver17.isEmpty();
        java.lang.Class<?> wildcardClass23 = linkedListTestDriver17.getClass();
        linkedListTestDriver14.addLast((java.lang.Object) wildcardClass23);
        boolean boolean25 = linkedListTestDriver13.equals_CUT((java.lang.Object) wildcardClass23);
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        boolean boolean28 = linkedListTestDriver26.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator29 = linkedListTestDriver26.iterator();
        linkedListTestDriver13.addFirst((java.lang.Object) iterator29);
        linkedListTestDriver8.addLast((java.lang.Object) linkedListTestDriver13);
        java.lang.Object obj32 = linkedListTestDriver8.removeFirst();
        int int33 = linkedListTestDriver8.size();
        boolean boolean34 = linkedListTestDriver8.isEmpty();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj37 = linkedListTestDriver0.get(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test143");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) true);
        linkedListTestDriver0.clear();
        experiment.util.Iterator iterator4 = linkedListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator4);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test144");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        java.lang.Object obj6 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.remove((java.lang.Object) '#');
        java.lang.Object[] objArray10 = linkedListTestDriver7.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver11.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver11.addLast((java.lang.Object) 100);
        boolean boolean16 = linkedListTestDriver11.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.addFirst((java.lang.Object) linkedListTestDriver17);
        experiment.util.Iterator iterator19 = linkedListTestDriver11.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        boolean boolean23 = linkedListTestDriver21.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        boolean boolean26 = linkedListTestDriver24.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver24.addLast((java.lang.Object) 100);
        boolean boolean29 = linkedListTestDriver24.isEmpty();
        java.lang.Class<?> wildcardClass30 = linkedListTestDriver24.getClass();
        linkedListTestDriver21.addLast((java.lang.Object) wildcardClass30);
        boolean boolean32 = linkedListTestDriver20.equals_CUT((java.lang.Object) wildcardClass30);
        experiment.util.LinkedListTestDriver linkedListTestDriver33 = new experiment.util.LinkedListTestDriver();
        boolean boolean35 = linkedListTestDriver33.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator36 = linkedListTestDriver33.iterator();
        linkedListTestDriver20.addFirst((java.lang.Object) iterator36);
        boolean boolean38 = linkedListTestDriver11.add((java.lang.Object) linkedListTestDriver20);
        linkedListTestDriver7.addLast((java.lang.Object) linkedListTestDriver20);
        java.lang.Object[] objArray40 = linkedListTestDriver20.toArray();
        linkedListTestDriver0.addLast((java.lang.Object) objArray40);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100 + "'", obj6, 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(objArray40);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test145");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        linkedListTestDriver0.clear();
        int int7 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        boolean boolean10 = linkedListTestDriver8.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver8.addLast((java.lang.Object) 100);
        int int13 = linkedListTestDriver8.size();
        boolean boolean14 = linkedListTestDriver0.contains((java.lang.Object) int13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test146");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        java.lang.Object[] objArray8 = linkedListTestDriver0.toArray();
        java.lang.Object obj9 = linkedListTestDriver0.removeLast();
        java.lang.Object obj10 = linkedListTestDriver0.removeFirst();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100 + "'", obj9, 100);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test147");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        boolean boolean3 = linkedListTestDriver1.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver4.addLast((java.lang.Object) 100);
        boolean boolean9 = linkedListTestDriver4.isEmpty();
        java.lang.Class<?> wildcardClass10 = linkedListTestDriver4.getClass();
        linkedListTestDriver1.addLast((java.lang.Object) wildcardClass10);
        int int12 = linkedListTestDriver1.size();
        java.lang.Object obj13 = linkedListTestDriver1.getLast();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver1);
        java.lang.Object[] objArray15 = linkedListTestDriver0.toArray();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test148");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        java.lang.Object obj9 = linkedListTestDriver0.getLast();
        java.lang.Object obj10 = linkedListTestDriver0.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver11.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver11.addLast((java.lang.Object) 100);
        boolean boolean16 = linkedListTestDriver11.isEmpty();
        linkedListTestDriver11.clear();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver11);
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        boolean boolean21 = linkedListTestDriver19.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver19.addLast((java.lang.Object) 100);
        int int24 = linkedListTestDriver19.size();
        int int25 = linkedListTestDriver19.size();
        boolean boolean26 = linkedListTestDriver11.add((java.lang.Object) linkedListTestDriver19);
        java.lang.Class<?> wildcardClass27 = linkedListTestDriver19.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100 + "'", obj9, 100);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100 + "'", obj10, 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test149");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean4 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver9.addLast((java.lang.Object) 100);
        boolean boolean14 = linkedListTestDriver9.isEmpty();
        java.lang.Class<?> wildcardClass15 = linkedListTestDriver9.getClass();
        linkedListTestDriver6.addLast((java.lang.Object) wildcardClass15);
        boolean boolean17 = linkedListTestDriver5.equals_CUT((java.lang.Object) wildcardClass15);
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver18.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator21 = linkedListTestDriver18.iterator();
        linkedListTestDriver5.addFirst((java.lang.Object) iterator21);
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        int int24 = linkedListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator26 = linkedListTestDriver0.listIterator(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test150");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = linkedListTestDriver6.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test151");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean4 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver9.addLast((java.lang.Object) 100);
        boolean boolean14 = linkedListTestDriver9.isEmpty();
        java.lang.Class<?> wildcardClass15 = linkedListTestDriver9.getClass();
        linkedListTestDriver6.addLast((java.lang.Object) wildcardClass15);
        boolean boolean17 = linkedListTestDriver5.equals_CUT((java.lang.Object) wildcardClass15);
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver18.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator21 = linkedListTestDriver18.iterator();
        linkedListTestDriver5.addFirst((java.lang.Object) iterator21);
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        java.lang.Object obj24 = linkedListTestDriver0.removeFirst();
        int int25 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver26.addFirst((java.lang.Object) true);
        linkedListTestDriver26.clear();
        int int30 = linkedListTestDriver26.size();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = linkedListTestDriver26.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test152");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        java.lang.Object obj6 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver7.addLast((java.lang.Object) 100);
        boolean boolean12 = linkedListTestDriver7.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.addFirst((java.lang.Object) linkedListTestDriver13);
        experiment.util.Iterator iterator15 = linkedListTestDriver7.iterator();
        java.lang.Object obj17 = linkedListTestDriver7.remove((int) (byte) 0);
        boolean boolean18 = linkedListTestDriver0.add(obj17);
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        boolean boolean21 = linkedListTestDriver19.equals_CUT((java.lang.Object) 1L);
        boolean boolean23 = linkedListTestDriver19.contains((java.lang.Object) true);
        java.lang.Object[] objArray24 = linkedListTestDriver19.toArray();
        boolean boolean25 = linkedListTestDriver0.remove((java.lang.Object) objArray24);
        java.lang.Object[] objArray26 = linkedListTestDriver0.toArray();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100 + "'", obj6, 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objArray26);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test153");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean4 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver9.addLast((java.lang.Object) 100);
        boolean boolean14 = linkedListTestDriver9.isEmpty();
        java.lang.Class<?> wildcardClass15 = linkedListTestDriver9.getClass();
        linkedListTestDriver6.addLast((java.lang.Object) wildcardClass15);
        boolean boolean17 = linkedListTestDriver5.equals_CUT((java.lang.Object) wildcardClass15);
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver18.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator21 = linkedListTestDriver18.iterator();
        linkedListTestDriver5.addFirst((java.lang.Object) iterator21);
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        java.lang.Object obj25 = linkedListTestDriver5.remove((int) (byte) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        boolean boolean28 = linkedListTestDriver26.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        boolean boolean31 = linkedListTestDriver29.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver29.addLast((java.lang.Object) 100);
        boolean boolean34 = linkedListTestDriver29.isEmpty();
        java.lang.Class<?> wildcardClass35 = linkedListTestDriver29.getClass();
        linkedListTestDriver26.addLast((java.lang.Object) wildcardClass35);
        int int37 = linkedListTestDriver26.size();
        java.lang.Object obj38 = linkedListTestDriver26.getLast();
        java.lang.Object obj39 = linkedListTestDriver26.removeLast();
        boolean boolean40 = linkedListTestDriver26.isEmpty();
        linkedListTestDriver5.addLast((java.lang.Object) boolean40);
        java.lang.Object obj42 = linkedListTestDriver5.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver44 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver45 = new experiment.util.LinkedListTestDriver();
        boolean boolean47 = linkedListTestDriver45.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver48 = new experiment.util.LinkedListTestDriver();
        boolean boolean50 = linkedListTestDriver48.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver48.addLast((java.lang.Object) 100);
        boolean boolean53 = linkedListTestDriver48.isEmpty();
        java.lang.Class<?> wildcardClass54 = linkedListTestDriver48.getClass();
        linkedListTestDriver45.addLast((java.lang.Object) wildcardClass54);
        boolean boolean56 = linkedListTestDriver44.equals_CUT((java.lang.Object) wildcardClass54);
        experiment.util.LinkedListTestDriver linkedListTestDriver57 = new experiment.util.LinkedListTestDriver();
        boolean boolean59 = linkedListTestDriver57.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator60 = linkedListTestDriver57.iterator();
        linkedListTestDriver44.addFirst((java.lang.Object) iterator60);
        linkedListTestDriver5.add(0, (java.lang.Object) iterator60);
        experiment.util.LinkedListTestDriver linkedListTestDriver63 = new experiment.util.LinkedListTestDriver();
        boolean boolean65 = linkedListTestDriver63.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver63.addLast((java.lang.Object) 100);
        boolean boolean68 = linkedListTestDriver63.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver69 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver63.addFirst((java.lang.Object) linkedListTestDriver69);
        java.lang.Object[] objArray71 = linkedListTestDriver63.toArray();
        boolean boolean73 = linkedListTestDriver63.remove((java.lang.Object) 100L);
        experiment.util.LinkedListTestDriver linkedListTestDriver74 = new experiment.util.LinkedListTestDriver();
        boolean boolean76 = linkedListTestDriver74.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver77 = new experiment.util.LinkedListTestDriver();
        boolean boolean79 = linkedListTestDriver77.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver77.addLast((java.lang.Object) 100);
        boolean boolean82 = linkedListTestDriver77.isEmpty();
        java.lang.Class<?> wildcardClass83 = linkedListTestDriver77.getClass();
        linkedListTestDriver74.addLast((java.lang.Object) wildcardClass83);
        boolean boolean86 = linkedListTestDriver74.equals_CUT((java.lang.Object) (short) 1);
        java.lang.Object obj87 = linkedListTestDriver74.removeFirst();
        boolean boolean88 = linkedListTestDriver63.equals_CUT(obj87);
        linkedListTestDriver5.addFirst(obj87);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertEquals(obj38.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj38), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj38), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertEquals(obj39.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj39), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj39), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + true + "'", obj42, true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(iterator60);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(wildcardClass83);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(obj87);
        org.junit.Assert.assertEquals(obj87.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj87), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj87), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test154");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        java.lang.Object[] objArray8 = linkedListTestDriver6.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver9.addLast((java.lang.Object) 100);
        boolean boolean14 = linkedListTestDriver9.isEmpty();
        java.lang.Object obj15 = linkedListTestDriver9.getFirst();
        java.lang.Object[] objArray16 = linkedListTestDriver9.toArray();
        linkedListTestDriver9.addLast((java.lang.Object) (byte) -1);
        boolean boolean19 = linkedListTestDriver6.contains((java.lang.Object) linkedListTestDriver9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = linkedListTestDriver6.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100 + "'", obj15, 100);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[100]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test155");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        java.lang.Object obj9 = linkedListTestDriver0.removeLast();
        java.lang.Object obj10 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        boolean boolean14 = linkedListTestDriver12.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver12.addLast((java.lang.Object) 100);
        boolean boolean17 = linkedListTestDriver12.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addFirst((java.lang.Object) linkedListTestDriver18);
        experiment.util.Iterator iterator20 = linkedListTestDriver12.iterator();
        java.lang.Object obj21 = linkedListTestDriver12.getLast();
        int int22 = linkedListTestDriver12.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        boolean boolean25 = linkedListTestDriver23.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        boolean boolean28 = linkedListTestDriver26.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver26.addLast((java.lang.Object) 100);
        boolean boolean31 = linkedListTestDriver26.isEmpty();
        java.lang.Class<?> wildcardClass32 = linkedListTestDriver26.getClass();
        linkedListTestDriver23.addLast((java.lang.Object) wildcardClass32);
        int int34 = linkedListTestDriver23.size();
        java.lang.Object obj35 = linkedListTestDriver23.getLast();
        java.lang.Object obj36 = linkedListTestDriver23.removeLast();
        boolean boolean37 = linkedListTestDriver23.isEmpty();
        linkedListTestDriver23.clear();
        boolean boolean39 = linkedListTestDriver12.add((java.lang.Object) linkedListTestDriver23);
        java.lang.Object obj40 = linkedListTestDriver12.getLast();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) (byte) 10, (java.lang.Object) linkedListTestDriver12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100 + "'", obj9, 100);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100 + "'", obj21, 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals(obj35.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj35), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj35), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertEquals(obj36.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj36), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj36), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(obj40);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test156");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) (short) 1);
        java.lang.Object obj5 = linkedListTestDriver0.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addFirst((java.lang.Object) true);
        linkedListTestDriver6.clear();
        int int10 = linkedListTestDriver6.size();
        boolean boolean11 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver6);
        experiment.util.Iterator iterator12 = linkedListTestDriver0.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 1 + "'", obj5, (short) 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test157");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        boolean boolean5 = linkedListTestDriver3.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver3.addLast((java.lang.Object) 100);
        boolean boolean8 = linkedListTestDriver3.isEmpty();
        java.lang.Class<?> wildcardClass9 = linkedListTestDriver3.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) wildcardClass9);
        int int11 = linkedListTestDriver0.size();
        java.lang.Object obj12 = linkedListTestDriver0.getLast();
        java.lang.Object obj13 = linkedListTestDriver0.removeFirst();
        boolean boolean14 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        boolean boolean18 = linkedListTestDriver16.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver16.addLast((java.lang.Object) 100);
        int int21 = linkedListTestDriver16.size();
        java.lang.Object obj22 = linkedListTestDriver16.getFirst();
        linkedListTestDriver16.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = linkedListTestDriver0.set((-1), (java.lang.Object) linkedListTestDriver16);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 100 + "'", obj22, 100);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test158");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) true);
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        boolean boolean5 = linkedListTestDriver3.remove((java.lang.Object) '#');
        java.lang.Object[] objArray6 = linkedListTestDriver3.toArray();
        boolean boolean7 = linkedListTestDriver0.contains((java.lang.Object) objArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = linkedListTestDriver0.remove((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test159");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        boolean boolean3 = linkedListTestDriver1.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver4.addLast((java.lang.Object) 100);
        boolean boolean9 = linkedListTestDriver4.isEmpty();
        java.lang.Class<?> wildcardClass10 = linkedListTestDriver4.getClass();
        linkedListTestDriver1.addLast((java.lang.Object) wildcardClass10);
        int int12 = linkedListTestDriver1.size();
        java.lang.Object obj13 = linkedListTestDriver1.getLast();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver1);
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = linkedListTestDriver0.get((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "class experiment.util.LinkedListTestDriver");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test160");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        boolean boolean12 = linkedListTestDriver10.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver13.addLast((java.lang.Object) 100);
        boolean boolean18 = linkedListTestDriver13.isEmpty();
        java.lang.Class<?> wildcardClass19 = linkedListTestDriver13.getClass();
        linkedListTestDriver10.addLast((java.lang.Object) wildcardClass19);
        boolean boolean21 = linkedListTestDriver9.equals_CUT((java.lang.Object) wildcardClass19);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        boolean boolean24 = linkedListTestDriver22.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator25 = linkedListTestDriver22.iterator();
        linkedListTestDriver9.addFirst((java.lang.Object) iterator25);
        boolean boolean27 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver9);
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        boolean boolean30 = linkedListTestDriver28.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver28.addLast((java.lang.Object) 100);
        boolean boolean33 = linkedListTestDriver28.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver28.addFirst((java.lang.Object) linkedListTestDriver34);
        java.lang.Object[] objArray36 = linkedListTestDriver28.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        boolean boolean39 = linkedListTestDriver37.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver37.addLast((java.lang.Object) 100);
        boolean boolean42 = linkedListTestDriver37.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver43 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver37.addFirst((java.lang.Object) linkedListTestDriver43);
        experiment.util.Iterator iterator45 = linkedListTestDriver37.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver46 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver47 = new experiment.util.LinkedListTestDriver();
        boolean boolean49 = linkedListTestDriver47.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver50 = new experiment.util.LinkedListTestDriver();
        boolean boolean52 = linkedListTestDriver50.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver50.addLast((java.lang.Object) 100);
        boolean boolean55 = linkedListTestDriver50.isEmpty();
        java.lang.Class<?> wildcardClass56 = linkedListTestDriver50.getClass();
        linkedListTestDriver47.addLast((java.lang.Object) wildcardClass56);
        boolean boolean58 = linkedListTestDriver46.equals_CUT((java.lang.Object) wildcardClass56);
        experiment.util.LinkedListTestDriver linkedListTestDriver59 = new experiment.util.LinkedListTestDriver();
        boolean boolean61 = linkedListTestDriver59.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator62 = linkedListTestDriver59.iterator();
        linkedListTestDriver46.addFirst((java.lang.Object) iterator62);
        boolean boolean64 = linkedListTestDriver37.add((java.lang.Object) linkedListTestDriver46);
        experiment.util.Iterator iterator65 = linkedListTestDriver46.iterator();
        linkedListTestDriver28.addLast((java.lang.Object) iterator65);
        boolean boolean67 = linkedListTestDriver9.equals_CUT((java.lang.Object) linkedListTestDriver28);
        java.lang.Class<?> wildcardClass68 = linkedListTestDriver28.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(iterator45);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(iterator62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(iterator65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test161");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        linkedListTestDriver0.clear();
        java.lang.Class<?> wildcardClass7 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test162");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean4 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver9.addLast((java.lang.Object) 100);
        boolean boolean14 = linkedListTestDriver9.isEmpty();
        java.lang.Class<?> wildcardClass15 = linkedListTestDriver9.getClass();
        linkedListTestDriver6.addLast((java.lang.Object) wildcardClass15);
        boolean boolean17 = linkedListTestDriver5.equals_CUT((java.lang.Object) wildcardClass15);
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver18.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator21 = linkedListTestDriver18.iterator();
        linkedListTestDriver5.addFirst((java.lang.Object) iterator21);
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        java.lang.Object obj25 = linkedListTestDriver5.remove((int) (byte) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        boolean boolean28 = linkedListTestDriver26.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        boolean boolean31 = linkedListTestDriver29.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver29.addLast((java.lang.Object) 100);
        boolean boolean34 = linkedListTestDriver29.isEmpty();
        java.lang.Class<?> wildcardClass35 = linkedListTestDriver29.getClass();
        linkedListTestDriver26.addLast((java.lang.Object) wildcardClass35);
        int int37 = linkedListTestDriver26.size();
        java.lang.Object obj38 = linkedListTestDriver26.getLast();
        java.lang.Object obj39 = linkedListTestDriver26.removeLast();
        boolean boolean40 = linkedListTestDriver26.isEmpty();
        linkedListTestDriver5.addLast((java.lang.Object) boolean40);
        java.lang.Class<?> wildcardClass42 = linkedListTestDriver5.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertEquals(obj38.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj38), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj38), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertEquals(obj39.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj39), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj39), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test163");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        experiment.util.ListIterator listIterator7 = linkedListTestDriver0.listIterator((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(listIterator7);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test164");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        boolean boolean4 = linkedListTestDriver0.contains((java.lang.Object) true);
        java.lang.Object[] objArray5 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        boolean boolean12 = linkedListTestDriver10.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver10.addLast((java.lang.Object) 100);
        boolean boolean15 = linkedListTestDriver10.isEmpty();
        java.lang.Class<?> wildcardClass16 = linkedListTestDriver10.getClass();
        linkedListTestDriver7.addLast((java.lang.Object) wildcardClass16);
        int int18 = linkedListTestDriver7.size();
        java.lang.Object obj19 = linkedListTestDriver7.getLast();
        linkedListTestDriver6.addFirst((java.lang.Object) linkedListTestDriver7);
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        int int22 = linkedListTestDriver0.size();
        java.lang.Object obj23 = linkedListTestDriver0.removeLast();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test165");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) (short) 100);
        java.lang.Object[] objArray8 = linkedListTestDriver0.toArray();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100]");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test166");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) true);
        java.lang.Class<?> wildcardClass3 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test167");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        java.lang.Object obj9 = linkedListTestDriver0.removeLast();
        java.lang.Object obj10 = linkedListTestDriver0.removeFirst();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100 + "'", obj9, 100);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test168");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        boolean boolean4 = linkedListTestDriver0.contains((java.lang.Object) true);
        java.lang.Object[] objArray5 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        boolean boolean12 = linkedListTestDriver10.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver10.addLast((java.lang.Object) 100);
        boolean boolean15 = linkedListTestDriver10.isEmpty();
        java.lang.Class<?> wildcardClass16 = linkedListTestDriver10.getClass();
        linkedListTestDriver7.addLast((java.lang.Object) wildcardClass16);
        int int18 = linkedListTestDriver7.size();
        java.lang.Object obj19 = linkedListTestDriver7.getLast();
        linkedListTestDriver6.addFirst((java.lang.Object) linkedListTestDriver7);
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        int int22 = linkedListTestDriver0.size();
        boolean boolean23 = linkedListTestDriver0.isEmpty();
        java.lang.Object obj24 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        boolean boolean27 = linkedListTestDriver25.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver25.addLast((java.lang.Object) 100);
        boolean boolean30 = linkedListTestDriver25.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver25.addFirst((java.lang.Object) linkedListTestDriver31);
        experiment.util.Iterator iterator33 = linkedListTestDriver25.iterator();
        java.lang.Object obj34 = linkedListTestDriver25.getLast();
        java.lang.Object obj35 = linkedListTestDriver25.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver36 = new experiment.util.LinkedListTestDriver();
        boolean boolean38 = linkedListTestDriver36.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver36.addLast((java.lang.Object) 100);
        boolean boolean41 = linkedListTestDriver36.isEmpty();
        linkedListTestDriver36.clear();
        linkedListTestDriver25.addFirst((java.lang.Object) linkedListTestDriver36);
        java.lang.Class<?> wildcardClass44 = linkedListTestDriver36.getClass();
        boolean boolean45 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver36);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 100 + "'", obj34, 100);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 100 + "'", obj35, 100);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test169");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) (short) 1);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.equals_CUT((java.lang.Object) 1L);
        experiment.util.Iterator iterator9 = linkedListTestDriver6.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver11.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        boolean boolean16 = linkedListTestDriver14.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver14.addLast((java.lang.Object) 100);
        boolean boolean19 = linkedListTestDriver14.isEmpty();
        java.lang.Class<?> wildcardClass20 = linkedListTestDriver14.getClass();
        linkedListTestDriver11.addLast((java.lang.Object) wildcardClass20);
        boolean boolean22 = linkedListTestDriver10.equals_CUT((java.lang.Object) wildcardClass20);
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        boolean boolean25 = linkedListTestDriver23.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator26 = linkedListTestDriver23.iterator();
        linkedListTestDriver10.addFirst((java.lang.Object) iterator26);
        boolean boolean28 = linkedListTestDriver6.equals_CUT((java.lang.Object) linkedListTestDriver10);
        boolean boolean29 = linkedListTestDriver0.add((java.lang.Object) boolean28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = linkedListTestDriver0.get((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 1 + "'", obj5, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test170");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.equals_CUT((java.lang.Object) 1L);
        boolean boolean11 = linkedListTestDriver7.contains((java.lang.Object) true);
        java.lang.Object[] objArray12 = linkedListTestDriver7.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        boolean boolean16 = linkedListTestDriver14.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        boolean boolean19 = linkedListTestDriver17.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver17.addLast((java.lang.Object) 100);
        boolean boolean22 = linkedListTestDriver17.isEmpty();
        java.lang.Class<?> wildcardClass23 = linkedListTestDriver17.getClass();
        linkedListTestDriver14.addLast((java.lang.Object) wildcardClass23);
        int int25 = linkedListTestDriver14.size();
        java.lang.Object obj26 = linkedListTestDriver14.getLast();
        linkedListTestDriver13.addFirst((java.lang.Object) linkedListTestDriver14);
        linkedListTestDriver7.addFirst((java.lang.Object) linkedListTestDriver13);
        boolean boolean29 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver7);
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        boolean boolean32 = linkedListTestDriver30.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver30.addLast((java.lang.Object) 100);
        boolean boolean35 = linkedListTestDriver30.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver36 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver30.addFirst((java.lang.Object) linkedListTestDriver36);
        experiment.util.Iterator iterator38 = linkedListTestDriver30.iterator();
        java.lang.Object obj39 = linkedListTestDriver30.getLast();
        java.lang.Object obj40 = linkedListTestDriver30.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver41 = new experiment.util.LinkedListTestDriver();
        boolean boolean43 = linkedListTestDriver41.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver41.addLast((java.lang.Object) 100);
        boolean boolean46 = linkedListTestDriver41.isEmpty();
        linkedListTestDriver41.clear();
        linkedListTestDriver30.addFirst((java.lang.Object) linkedListTestDriver41);
        java.lang.Class<?> wildcardClass49 = linkedListTestDriver41.getClass();
        boolean boolean50 = linkedListTestDriver7.contains((java.lang.Object) wildcardClass49);
        java.lang.Object obj51 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean52 = linkedListTestDriver7.contains(obj51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 100 + "'", obj39, 100);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 100 + "'", obj40, 100);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test171");
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
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test172");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        java.lang.Object obj10 = linkedListTestDriver0.remove((int) (byte) 0);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver13.addLast((java.lang.Object) 100);
        boolean boolean18 = linkedListTestDriver13.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver13.addFirst((java.lang.Object) linkedListTestDriver19);
        java.lang.Object[] objArray21 = linkedListTestDriver13.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        boolean boolean24 = linkedListTestDriver22.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver22.addLast((java.lang.Object) 100);
        boolean boolean27 = linkedListTestDriver22.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver22.addFirst((java.lang.Object) linkedListTestDriver28);
        experiment.util.Iterator iterator30 = linkedListTestDriver22.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        boolean boolean34 = linkedListTestDriver32.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver35 = new experiment.util.LinkedListTestDriver();
        boolean boolean37 = linkedListTestDriver35.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver35.addLast((java.lang.Object) 100);
        boolean boolean40 = linkedListTestDriver35.isEmpty();
        java.lang.Class<?> wildcardClass41 = linkedListTestDriver35.getClass();
        linkedListTestDriver32.addLast((java.lang.Object) wildcardClass41);
        boolean boolean43 = linkedListTestDriver31.equals_CUT((java.lang.Object) wildcardClass41);
        experiment.util.LinkedListTestDriver linkedListTestDriver44 = new experiment.util.LinkedListTestDriver();
        boolean boolean46 = linkedListTestDriver44.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator47 = linkedListTestDriver44.iterator();
        linkedListTestDriver31.addFirst((java.lang.Object) iterator47);
        boolean boolean49 = linkedListTestDriver22.add((java.lang.Object) linkedListTestDriver31);
        experiment.util.Iterator iterator50 = linkedListTestDriver31.iterator();
        linkedListTestDriver13.addLast((java.lang.Object) iterator50);
        boolean boolean52 = linkedListTestDriver0.remove((java.lang.Object) iterator50);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj53 = linkedListTestDriver0.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(iterator47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(iterator50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test173");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver7.addLast((java.lang.Object) 100);
        boolean boolean12 = linkedListTestDriver7.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.addFirst((java.lang.Object) linkedListTestDriver13);
        experiment.util.Iterator iterator15 = linkedListTestDriver7.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        boolean boolean19 = linkedListTestDriver17.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        boolean boolean22 = linkedListTestDriver20.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver20.addLast((java.lang.Object) 100);
        boolean boolean25 = linkedListTestDriver20.isEmpty();
        java.lang.Class<?> wildcardClass26 = linkedListTestDriver20.getClass();
        linkedListTestDriver17.addLast((java.lang.Object) wildcardClass26);
        boolean boolean28 = linkedListTestDriver16.equals_CUT((java.lang.Object) wildcardClass26);
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        boolean boolean31 = linkedListTestDriver29.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator32 = linkedListTestDriver29.iterator();
        linkedListTestDriver16.addFirst((java.lang.Object) iterator32);
        boolean boolean34 = linkedListTestDriver7.add((java.lang.Object) linkedListTestDriver16);
        java.lang.Object[] objArray35 = linkedListTestDriver16.toArray();
        linkedListTestDriver0.addLast((java.lang.Object) objArray35);
        experiment.util.LinkedListTestDriver linkedListTestDriver38 = new experiment.util.LinkedListTestDriver();
        boolean boolean40 = linkedListTestDriver38.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver38.addLast((java.lang.Object) 100);
        boolean boolean43 = linkedListTestDriver38.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver44 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver38.addFirst((java.lang.Object) linkedListTestDriver44);
        experiment.util.Iterator iterator46 = linkedListTestDriver38.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver47 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver48 = new experiment.util.LinkedListTestDriver();
        boolean boolean50 = linkedListTestDriver48.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver51 = new experiment.util.LinkedListTestDriver();
        boolean boolean53 = linkedListTestDriver51.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver51.addLast((java.lang.Object) 100);
        boolean boolean56 = linkedListTestDriver51.isEmpty();
        java.lang.Class<?> wildcardClass57 = linkedListTestDriver51.getClass();
        linkedListTestDriver48.addLast((java.lang.Object) wildcardClass57);
        boolean boolean59 = linkedListTestDriver47.equals_CUT((java.lang.Object) wildcardClass57);
        experiment.util.LinkedListTestDriver linkedListTestDriver60 = new experiment.util.LinkedListTestDriver();
        boolean boolean62 = linkedListTestDriver60.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator63 = linkedListTestDriver60.iterator();
        linkedListTestDriver47.addFirst((java.lang.Object) iterator63);
        boolean boolean65 = linkedListTestDriver38.add((java.lang.Object) linkedListTestDriver47);
        java.lang.Object[] objArray66 = linkedListTestDriver47.toArray();
        java.lang.Object[] objArray67 = linkedListTestDriver47.toArray();
        linkedListTestDriver0.add(1, (java.lang.Object) objArray67);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(iterator46);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(iterator63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertNotNull(objArray67);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test174");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        java.lang.Object obj10 = linkedListTestDriver0.remove((int) (byte) 0);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver13.addLast((java.lang.Object) 100);
        boolean boolean18 = linkedListTestDriver13.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver13.addFirst((java.lang.Object) linkedListTestDriver19);
        java.lang.Object[] objArray21 = linkedListTestDriver13.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        boolean boolean24 = linkedListTestDriver22.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver22.addLast((java.lang.Object) 100);
        boolean boolean27 = linkedListTestDriver22.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver22.addFirst((java.lang.Object) linkedListTestDriver28);
        experiment.util.Iterator iterator30 = linkedListTestDriver22.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        boolean boolean34 = linkedListTestDriver32.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver35 = new experiment.util.LinkedListTestDriver();
        boolean boolean37 = linkedListTestDriver35.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver35.addLast((java.lang.Object) 100);
        boolean boolean40 = linkedListTestDriver35.isEmpty();
        java.lang.Class<?> wildcardClass41 = linkedListTestDriver35.getClass();
        linkedListTestDriver32.addLast((java.lang.Object) wildcardClass41);
        boolean boolean43 = linkedListTestDriver31.equals_CUT((java.lang.Object) wildcardClass41);
        experiment.util.LinkedListTestDriver linkedListTestDriver44 = new experiment.util.LinkedListTestDriver();
        boolean boolean46 = linkedListTestDriver44.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator47 = linkedListTestDriver44.iterator();
        linkedListTestDriver31.addFirst((java.lang.Object) iterator47);
        boolean boolean49 = linkedListTestDriver22.add((java.lang.Object) linkedListTestDriver31);
        experiment.util.Iterator iterator50 = linkedListTestDriver31.iterator();
        linkedListTestDriver13.addLast((java.lang.Object) iterator50);
        boolean boolean52 = linkedListTestDriver0.remove((java.lang.Object) iterator50);
        experiment.util.ListIterator listIterator54 = linkedListTestDriver0.listIterator(0);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator56 = linkedListTestDriver0.listIterator((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(iterator47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(iterator50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(listIterator54);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test175");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        int int5 = linkedListTestDriver0.size();
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        int int7 = linkedListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = linkedListTestDriver0.getLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100 + "'", obj6, 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test176");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        boolean boolean3 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator5 = linkedListTestDriver0.listIterator((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 35; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test177");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        boolean boolean3 = linkedListTestDriver1.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver4.addLast((java.lang.Object) 100);
        boolean boolean9 = linkedListTestDriver4.isEmpty();
        java.lang.Class<?> wildcardClass10 = linkedListTestDriver4.getClass();
        linkedListTestDriver1.addLast((java.lang.Object) wildcardClass10);
        int int12 = linkedListTestDriver1.size();
        java.lang.Object obj13 = linkedListTestDriver1.getLast();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver1);
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        boolean boolean17 = linkedListTestDriver15.remove((java.lang.Object) '#');
        java.lang.Object[] objArray18 = linkedListTestDriver15.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        boolean boolean21 = linkedListTestDriver19.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver19.addLast((java.lang.Object) 100);
        boolean boolean24 = linkedListTestDriver19.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver19.addFirst((java.lang.Object) linkedListTestDriver25);
        experiment.util.Iterator iterator27 = linkedListTestDriver19.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        boolean boolean31 = linkedListTestDriver29.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        boolean boolean34 = linkedListTestDriver32.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver32.addLast((java.lang.Object) 100);
        boolean boolean37 = linkedListTestDriver32.isEmpty();
        java.lang.Class<?> wildcardClass38 = linkedListTestDriver32.getClass();
        linkedListTestDriver29.addLast((java.lang.Object) wildcardClass38);
        boolean boolean40 = linkedListTestDriver28.equals_CUT((java.lang.Object) wildcardClass38);
        experiment.util.LinkedListTestDriver linkedListTestDriver41 = new experiment.util.LinkedListTestDriver();
        boolean boolean43 = linkedListTestDriver41.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator44 = linkedListTestDriver41.iterator();
        linkedListTestDriver28.addFirst((java.lang.Object) iterator44);
        boolean boolean46 = linkedListTestDriver19.add((java.lang.Object) linkedListTestDriver28);
        linkedListTestDriver15.addLast((java.lang.Object) linkedListTestDriver28);
        experiment.util.LinkedListTestDriver linkedListTestDriver48 = new experiment.util.LinkedListTestDriver();
        boolean boolean50 = linkedListTestDriver48.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver48.addLast((java.lang.Object) 100);
        boolean boolean53 = linkedListTestDriver48.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver54 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver48.addFirst((java.lang.Object) linkedListTestDriver54);
        java.lang.Object[] objArray56 = linkedListTestDriver48.toArray();
        java.lang.Object obj57 = linkedListTestDriver48.removeLast();
        linkedListTestDriver28.addLast((java.lang.Object) linkedListTestDriver48);
        linkedListTestDriver1.addFirst((java.lang.Object) linkedListTestDriver28);
        java.lang.Object obj60 = linkedListTestDriver28.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver61 = new experiment.util.LinkedListTestDriver();
        boolean boolean63 = linkedListTestDriver61.equals_CUT((java.lang.Object) 1L);
        experiment.util.Iterator iterator64 = linkedListTestDriver61.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver65 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver66 = new experiment.util.LinkedListTestDriver();
        boolean boolean68 = linkedListTestDriver66.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver69 = new experiment.util.LinkedListTestDriver();
        boolean boolean71 = linkedListTestDriver69.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver69.addLast((java.lang.Object) 100);
        boolean boolean74 = linkedListTestDriver69.isEmpty();
        java.lang.Class<?> wildcardClass75 = linkedListTestDriver69.getClass();
        linkedListTestDriver66.addLast((java.lang.Object) wildcardClass75);
        boolean boolean77 = linkedListTestDriver65.equals_CUT((java.lang.Object) wildcardClass75);
        experiment.util.LinkedListTestDriver linkedListTestDriver78 = new experiment.util.LinkedListTestDriver();
        boolean boolean80 = linkedListTestDriver78.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator81 = linkedListTestDriver78.iterator();
        linkedListTestDriver65.addFirst((java.lang.Object) iterator81);
        boolean boolean83 = linkedListTestDriver61.equals_CUT((java.lang.Object) linkedListTestDriver65);
        java.lang.Object obj84 = linkedListTestDriver65.getLast();
        boolean boolean85 = linkedListTestDriver28.equals_CUT(obj84);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(iterator44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + 100 + "'", obj57, 100);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(iterator64);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(iterator81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(obj84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test178");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        boolean boolean12 = linkedListTestDriver10.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver13.addLast((java.lang.Object) 100);
        boolean boolean18 = linkedListTestDriver13.isEmpty();
        java.lang.Class<?> wildcardClass19 = linkedListTestDriver13.getClass();
        linkedListTestDriver10.addLast((java.lang.Object) wildcardClass19);
        boolean boolean21 = linkedListTestDriver9.equals_CUT((java.lang.Object) wildcardClass19);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        boolean boolean24 = linkedListTestDriver22.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator25 = linkedListTestDriver22.iterator();
        linkedListTestDriver9.addFirst((java.lang.Object) iterator25);
        boolean boolean27 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver9);
        java.lang.Object obj28 = linkedListTestDriver9.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        boolean boolean31 = linkedListTestDriver29.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver29.addLast((java.lang.Object) 100);
        boolean boolean34 = linkedListTestDriver29.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver35 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver29.addFirst((java.lang.Object) linkedListTestDriver35);
        java.lang.Object[] objArray37 = linkedListTestDriver29.toArray();
        boolean boolean39 = linkedListTestDriver29.remove((java.lang.Object) 100L);
        experiment.util.LinkedListTestDriver linkedListTestDriver40 = new experiment.util.LinkedListTestDriver();
        boolean boolean42 = linkedListTestDriver40.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver43 = new experiment.util.LinkedListTestDriver();
        boolean boolean45 = linkedListTestDriver43.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver43.addLast((java.lang.Object) 100);
        boolean boolean48 = linkedListTestDriver43.isEmpty();
        java.lang.Class<?> wildcardClass49 = linkedListTestDriver43.getClass();
        linkedListTestDriver40.addLast((java.lang.Object) wildcardClass49);
        boolean boolean52 = linkedListTestDriver40.equals_CUT((java.lang.Object) (short) 1);
        java.lang.Object obj53 = linkedListTestDriver40.removeFirst();
        boolean boolean54 = linkedListTestDriver29.equals_CUT(obj53);
        boolean boolean55 = linkedListTestDriver9.add((java.lang.Object) boolean54);
        int int56 = linkedListTestDriver9.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertEquals(obj53.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj53), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj53), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2 + "'", int56 == 2);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test179");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) (short) 100);
        java.lang.Object obj8 = linkedListTestDriver0.getFirst();
        java.lang.Object obj9 = linkedListTestDriver0.getLast();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator11 = linkedListTestDriver0.listIterator((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100 + "'", obj8, 100);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100 + "'", obj9, 100);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test180");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        boolean boolean12 = linkedListTestDriver10.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver13.addLast((java.lang.Object) 100);
        boolean boolean18 = linkedListTestDriver13.isEmpty();
        java.lang.Class<?> wildcardClass19 = linkedListTestDriver13.getClass();
        linkedListTestDriver10.addLast((java.lang.Object) wildcardClass19);
        boolean boolean21 = linkedListTestDriver9.equals_CUT((java.lang.Object) wildcardClass19);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        boolean boolean24 = linkedListTestDriver22.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator25 = linkedListTestDriver22.iterator();
        linkedListTestDriver9.addFirst((java.lang.Object) iterator25);
        boolean boolean27 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver9);
        java.lang.Object obj28 = linkedListTestDriver9.getLast();
        java.lang.Object obj29 = linkedListTestDriver9.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        boolean boolean33 = linkedListTestDriver31.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        boolean boolean36 = linkedListTestDriver34.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver34.addLast((java.lang.Object) 100);
        boolean boolean39 = linkedListTestDriver34.isEmpty();
        java.lang.Class<?> wildcardClass40 = linkedListTestDriver34.getClass();
        linkedListTestDriver31.addLast((java.lang.Object) wildcardClass40);
        int int42 = linkedListTestDriver31.size();
        java.lang.Object obj43 = linkedListTestDriver31.getLast();
        java.lang.Object obj44 = linkedListTestDriver31.removeLast();
        boolean boolean45 = linkedListTestDriver31.isEmpty();
        linkedListTestDriver31.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver47 = new experiment.util.LinkedListTestDriver();
        boolean boolean49 = linkedListTestDriver47.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver47.addLast((java.lang.Object) 100);
        boolean boolean52 = linkedListTestDriver47.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver53 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver47.addFirst((java.lang.Object) linkedListTestDriver53);
        experiment.util.Iterator iterator55 = linkedListTestDriver47.iterator();
        linkedListTestDriver31.addLast((java.lang.Object) iterator55);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver9.add((int) (short) 100, (java.lang.Object) iterator55);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 100; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertEquals(obj43.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj43), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj43), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertEquals(obj44.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj44), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj44), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(iterator55);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test181");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean4 = linkedListTestDriver0.isEmpty();
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = linkedListTestDriver0.get((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test182");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) true);
        java.lang.Object obj3 = linkedListTestDriver0.removeLast();
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + true + "'", obj3, true);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test183");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        boolean boolean3 = linkedListTestDriver1.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver4.addLast((java.lang.Object) 100);
        boolean boolean9 = linkedListTestDriver4.isEmpty();
        java.lang.Class<?> wildcardClass10 = linkedListTestDriver4.getClass();
        linkedListTestDriver1.addLast((java.lang.Object) wildcardClass10);
        int int12 = linkedListTestDriver1.size();
        java.lang.Object obj13 = linkedListTestDriver1.getLast();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver1);
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        boolean boolean17 = linkedListTestDriver15.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver15.addLast((java.lang.Object) 100);
        boolean boolean20 = linkedListTestDriver15.isEmpty();
        java.lang.Object obj21 = linkedListTestDriver15.getFirst();
        java.lang.Object[] objArray22 = linkedListTestDriver15.toArray();
        linkedListTestDriver1.addLast((java.lang.Object) objArray22);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100 + "'", obj21, 100);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[100]");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test184");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        java.lang.Object[] objArray3 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver4.addLast((java.lang.Object) 100);
        boolean boolean9 = linkedListTestDriver4.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.addFirst((java.lang.Object) linkedListTestDriver10);
        experiment.util.Iterator iterator12 = linkedListTestDriver4.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        boolean boolean16 = linkedListTestDriver14.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        boolean boolean19 = linkedListTestDriver17.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver17.addLast((java.lang.Object) 100);
        boolean boolean22 = linkedListTestDriver17.isEmpty();
        java.lang.Class<?> wildcardClass23 = linkedListTestDriver17.getClass();
        linkedListTestDriver14.addLast((java.lang.Object) wildcardClass23);
        boolean boolean25 = linkedListTestDriver13.equals_CUT((java.lang.Object) wildcardClass23);
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        boolean boolean28 = linkedListTestDriver26.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator29 = linkedListTestDriver26.iterator();
        linkedListTestDriver13.addFirst((java.lang.Object) iterator29);
        boolean boolean31 = linkedListTestDriver4.add((java.lang.Object) linkedListTestDriver13);
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver13);
        experiment.util.LinkedListTestDriver linkedListTestDriver33 = new experiment.util.LinkedListTestDriver();
        boolean boolean35 = linkedListTestDriver33.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver33.addLast((java.lang.Object) 100);
        boolean boolean38 = linkedListTestDriver33.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver39 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver33.addFirst((java.lang.Object) linkedListTestDriver39);
        java.lang.Object[] objArray41 = linkedListTestDriver33.toArray();
        java.lang.Object obj42 = linkedListTestDriver33.removeLast();
        linkedListTestDriver13.addLast((java.lang.Object) linkedListTestDriver33);
        java.lang.Object obj44 = linkedListTestDriver13.getFirst();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 100 + "'", obj42, 100);
        org.junit.Assert.assertNotNull(obj44);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test185");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        int int5 = linkedListTestDriver0.size();
        java.lang.Object obj6 = linkedListTestDriver0.getFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = linkedListTestDriver0.get((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100 + "'", obj6, 100);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test186");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        java.lang.Object obj10 = linkedListTestDriver0.remove((int) (byte) 0);
        experiment.util.Iterator iterator11 = linkedListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = linkedListTestDriver0.get((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test187");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean4 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        boolean boolean10 = linkedListTestDriver8.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver8.addLast((java.lang.Object) 100);
        boolean boolean13 = linkedListTestDriver8.isEmpty();
        java.lang.Class<?> wildcardClass14 = linkedListTestDriver8.getClass();
        linkedListTestDriver5.addLast((java.lang.Object) wildcardClass14);
        int int16 = linkedListTestDriver5.size();
        java.lang.Object obj17 = linkedListTestDriver5.getLast();
        java.lang.Object obj18 = linkedListTestDriver5.removeLast();
        boolean boolean19 = linkedListTestDriver5.isEmpty();
        linkedListTestDriver5.clear();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        java.lang.Class<?> wildcardClass22 = linkedListTestDriver5.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test188");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        boolean boolean12 = linkedListTestDriver10.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver13.addLast((java.lang.Object) 100);
        boolean boolean18 = linkedListTestDriver13.isEmpty();
        java.lang.Class<?> wildcardClass19 = linkedListTestDriver13.getClass();
        linkedListTestDriver10.addLast((java.lang.Object) wildcardClass19);
        boolean boolean21 = linkedListTestDriver9.equals_CUT((java.lang.Object) wildcardClass19);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        boolean boolean24 = linkedListTestDriver22.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator25 = linkedListTestDriver22.iterator();
        linkedListTestDriver9.addFirst((java.lang.Object) iterator25);
        boolean boolean27 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver9);
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        boolean boolean30 = linkedListTestDriver28.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver28.addLast((java.lang.Object) 100);
        boolean boolean33 = linkedListTestDriver28.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver28.addFirst((java.lang.Object) linkedListTestDriver34);
        java.lang.Object[] objArray36 = linkedListTestDriver28.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        boolean boolean39 = linkedListTestDriver37.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver37.addLast((java.lang.Object) 100);
        boolean boolean42 = linkedListTestDriver37.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver43 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver37.addFirst((java.lang.Object) linkedListTestDriver43);
        experiment.util.Iterator iterator45 = linkedListTestDriver37.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver46 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver47 = new experiment.util.LinkedListTestDriver();
        boolean boolean49 = linkedListTestDriver47.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver50 = new experiment.util.LinkedListTestDriver();
        boolean boolean52 = linkedListTestDriver50.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver50.addLast((java.lang.Object) 100);
        boolean boolean55 = linkedListTestDriver50.isEmpty();
        java.lang.Class<?> wildcardClass56 = linkedListTestDriver50.getClass();
        linkedListTestDriver47.addLast((java.lang.Object) wildcardClass56);
        boolean boolean58 = linkedListTestDriver46.equals_CUT((java.lang.Object) wildcardClass56);
        experiment.util.LinkedListTestDriver linkedListTestDriver59 = new experiment.util.LinkedListTestDriver();
        boolean boolean61 = linkedListTestDriver59.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator62 = linkedListTestDriver59.iterator();
        linkedListTestDriver46.addFirst((java.lang.Object) iterator62);
        boolean boolean64 = linkedListTestDriver37.add((java.lang.Object) linkedListTestDriver46);
        experiment.util.Iterator iterator65 = linkedListTestDriver46.iterator();
        linkedListTestDriver28.addLast((java.lang.Object) iterator65);
        boolean boolean67 = linkedListTestDriver9.equals_CUT((java.lang.Object) linkedListTestDriver28);
        experiment.util.LinkedListTestDriver linkedListTestDriver68 = new experiment.util.LinkedListTestDriver();
        boolean boolean70 = linkedListTestDriver68.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver68.addLast((java.lang.Object) 100);
        boolean boolean73 = linkedListTestDriver68.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver74 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver68.addFirst((java.lang.Object) linkedListTestDriver74);
        java.lang.Object[] objArray76 = linkedListTestDriver68.toArray();
        boolean boolean78 = linkedListTestDriver68.remove((java.lang.Object) 100L);
        boolean boolean80 = linkedListTestDriver68.equals_CUT((java.lang.Object) "hi!");
        boolean boolean81 = linkedListTestDriver28.contains((java.lang.Object) boolean80);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(iterator45);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(iterator62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(iterator65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test189");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        java.lang.Object obj6 = linkedListTestDriver0.getFirst();
        java.lang.Object[] objArray7 = linkedListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator9 = linkedListTestDriver0.listIterator((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100 + "'", obj6, 100);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100]");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test190");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        boolean boolean10 = linkedListTestDriver8.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator11 = linkedListTestDriver8.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        boolean boolean14 = linkedListTestDriver12.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator15 = linkedListTestDriver12.iterator();
        boolean boolean16 = linkedListTestDriver12.isEmpty();
        boolean boolean17 = linkedListTestDriver8.contains((java.lang.Object) boolean16);
        linkedListTestDriver0.addFirst((java.lang.Object) boolean16);
        java.lang.Object obj19 = linkedListTestDriver0.removeFirst();
        experiment.util.Iterator iterator20 = linkedListTestDriver0.iterator();
        java.lang.Object obj21 = linkedListTestDriver0.getFirst();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + true + "'", obj19, true);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100 + "'", obj21, 100);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test191");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) (short) 1);
        java.lang.Object obj5 = linkedListTestDriver0.removeLast();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 1 + "'", obj5, (short) 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test192");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        boolean boolean5 = linkedListTestDriver3.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver3.addLast((java.lang.Object) 100);
        boolean boolean8 = linkedListTestDriver3.isEmpty();
        java.lang.Class<?> wildcardClass9 = linkedListTestDriver3.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) wildcardClass9);
        int int11 = linkedListTestDriver0.size();
        java.lang.Object obj12 = linkedListTestDriver0.getLast();
        java.lang.Object obj13 = linkedListTestDriver0.removeLast();
        boolean boolean14 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        boolean boolean17 = linkedListTestDriver15.equals_CUT((java.lang.Object) 1L);
        boolean boolean19 = linkedListTestDriver15.contains((java.lang.Object) true);
        java.lang.Object[] objArray20 = linkedListTestDriver15.toArray();
        experiment.util.Iterator iterator21 = linkedListTestDriver15.iterator();
        linkedListTestDriver0.addFirst((java.lang.Object) iterator21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = linkedListTestDriver0.remove(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(iterator21);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test193");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        int int5 = linkedListTestDriver0.size();
        java.lang.Object[] objArray6 = linkedListTestDriver0.toArray();
        boolean boolean7 = linkedListTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test194");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.equals_CUT((java.lang.Object) 1L);
        experiment.util.Iterator iterator10 = linkedListTestDriver7.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        boolean boolean14 = linkedListTestDriver12.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        boolean boolean17 = linkedListTestDriver15.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver15.addLast((java.lang.Object) 100);
        boolean boolean20 = linkedListTestDriver15.isEmpty();
        java.lang.Class<?> wildcardClass21 = linkedListTestDriver15.getClass();
        linkedListTestDriver12.addLast((java.lang.Object) wildcardClass21);
        boolean boolean23 = linkedListTestDriver11.equals_CUT((java.lang.Object) wildcardClass21);
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        boolean boolean26 = linkedListTestDriver24.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator27 = linkedListTestDriver24.iterator();
        linkedListTestDriver11.addFirst((java.lang.Object) iterator27);
        boolean boolean29 = linkedListTestDriver7.equals_CUT((java.lang.Object) linkedListTestDriver11);
        java.lang.Object obj30 = linkedListTestDriver11.getLast();
        linkedListTestDriver0.addFirst(obj30);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator33 = linkedListTestDriver0.listIterator((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 100; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(obj30);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test195");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        boolean boolean10 = linkedListTestDriver8.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator11 = linkedListTestDriver8.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        boolean boolean14 = linkedListTestDriver12.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator15 = linkedListTestDriver12.iterator();
        boolean boolean16 = linkedListTestDriver12.isEmpty();
        boolean boolean17 = linkedListTestDriver8.contains((java.lang.Object) boolean16);
        linkedListTestDriver0.addFirst((java.lang.Object) boolean16);
        java.lang.Object obj19 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        boolean boolean22 = linkedListTestDriver20.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator23 = linkedListTestDriver20.iterator();
        boolean boolean24 = linkedListTestDriver20.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        boolean boolean27 = linkedListTestDriver25.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        boolean boolean30 = linkedListTestDriver28.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver28.addLast((java.lang.Object) 100);
        boolean boolean33 = linkedListTestDriver28.isEmpty();
        java.lang.Class<?> wildcardClass34 = linkedListTestDriver28.getClass();
        linkedListTestDriver25.addLast((java.lang.Object) wildcardClass34);
        int int36 = linkedListTestDriver25.size();
        java.lang.Object obj37 = linkedListTestDriver25.getLast();
        java.lang.Object obj38 = linkedListTestDriver25.removeLast();
        boolean boolean39 = linkedListTestDriver25.isEmpty();
        linkedListTestDriver25.clear();
        linkedListTestDriver20.addLast((java.lang.Object) linkedListTestDriver25);
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver25);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + true + "'", obj19, true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertEquals(obj37.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj37), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj37), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertEquals(obj38.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj38), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj38), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test196");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        boolean boolean3 = linkedListTestDriver1.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver4.addLast((java.lang.Object) 100);
        boolean boolean9 = linkedListTestDriver4.isEmpty();
        java.lang.Class<?> wildcardClass10 = linkedListTestDriver4.getClass();
        linkedListTestDriver1.addLast((java.lang.Object) wildcardClass10);
        int int12 = linkedListTestDriver1.size();
        java.lang.Object obj13 = linkedListTestDriver1.getLast();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver1);
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        boolean boolean18 = linkedListTestDriver16.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator19 = linkedListTestDriver16.iterator();
        boolean boolean20 = linkedListTestDriver16.isEmpty();
        experiment.util.Iterator iterator21 = linkedListTestDriver16.iterator();
        linkedListTestDriver0.add(1, (java.lang.Object) linkedListTestDriver16);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator24 = linkedListTestDriver16.listIterator((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 97; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(iterator21);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test197");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        java.lang.Object obj9 = linkedListTestDriver0.getLast();
        java.lang.Object obj10 = linkedListTestDriver0.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver11.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver11.addLast((java.lang.Object) 100);
        boolean boolean16 = linkedListTestDriver11.isEmpty();
        linkedListTestDriver11.clear();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver11);
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        boolean boolean21 = linkedListTestDriver19.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver19.addLast((java.lang.Object) 100);
        boolean boolean24 = linkedListTestDriver19.isEmpty();
        boolean boolean26 = linkedListTestDriver19.equals_CUT((java.lang.Object) (short) 100);
        boolean boolean27 = linkedListTestDriver19.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        boolean boolean31 = linkedListTestDriver29.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        boolean boolean34 = linkedListTestDriver32.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver32.addLast((java.lang.Object) 100);
        boolean boolean37 = linkedListTestDriver32.isEmpty();
        java.lang.Class<?> wildcardClass38 = linkedListTestDriver32.getClass();
        linkedListTestDriver29.addLast((java.lang.Object) wildcardClass38);
        boolean boolean40 = linkedListTestDriver28.equals_CUT((java.lang.Object) wildcardClass38);
        experiment.util.LinkedListTestDriver linkedListTestDriver41 = new experiment.util.LinkedListTestDriver();
        boolean boolean43 = linkedListTestDriver41.equals_CUT((java.lang.Object) 1L);
        experiment.util.Iterator iterator44 = linkedListTestDriver41.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver45 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver46 = new experiment.util.LinkedListTestDriver();
        boolean boolean48 = linkedListTestDriver46.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver49 = new experiment.util.LinkedListTestDriver();
        boolean boolean51 = linkedListTestDriver49.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver49.addLast((java.lang.Object) 100);
        boolean boolean54 = linkedListTestDriver49.isEmpty();
        java.lang.Class<?> wildcardClass55 = linkedListTestDriver49.getClass();
        linkedListTestDriver46.addLast((java.lang.Object) wildcardClass55);
        boolean boolean57 = linkedListTestDriver45.equals_CUT((java.lang.Object) wildcardClass55);
        experiment.util.LinkedListTestDriver linkedListTestDriver58 = new experiment.util.LinkedListTestDriver();
        boolean boolean60 = linkedListTestDriver58.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator61 = linkedListTestDriver58.iterator();
        linkedListTestDriver45.addFirst((java.lang.Object) iterator61);
        boolean boolean63 = linkedListTestDriver41.equals_CUT((java.lang.Object) linkedListTestDriver45);
        java.lang.Object obj64 = linkedListTestDriver45.getLast();
        linkedListTestDriver28.addLast((java.lang.Object) linkedListTestDriver45);
        boolean boolean66 = linkedListTestDriver19.remove((java.lang.Object) linkedListTestDriver28);
        linkedListTestDriver11.addLast((java.lang.Object) linkedListTestDriver28);
        experiment.util.LinkedListTestDriver linkedListTestDriver68 = new experiment.util.LinkedListTestDriver();
        boolean boolean70 = linkedListTestDriver68.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver71 = new experiment.util.LinkedListTestDriver();
        boolean boolean73 = linkedListTestDriver71.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver71.addLast((java.lang.Object) 100);
        boolean boolean76 = linkedListTestDriver71.isEmpty();
        java.lang.Class<?> wildcardClass77 = linkedListTestDriver71.getClass();
        linkedListTestDriver68.addLast((java.lang.Object) wildcardClass77);
        int int79 = linkedListTestDriver68.size();
        java.lang.Object obj80 = linkedListTestDriver68.getLast();
        boolean boolean81 = linkedListTestDriver68.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver83 = new experiment.util.LinkedListTestDriver();
        boolean boolean85 = linkedListTestDriver83.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator86 = linkedListTestDriver83.iterator();
        boolean boolean87 = linkedListTestDriver83.isEmpty();
        experiment.util.Iterator iterator88 = linkedListTestDriver83.iterator();
        linkedListTestDriver68.add(0, (java.lang.Object) iterator88);
        boolean boolean90 = linkedListTestDriver11.remove((java.lang.Object) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj92 = linkedListTestDriver11.get(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100 + "'", obj9, 100);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100 + "'", obj10, 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(iterator44);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(iterator61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 1 + "'", int79 == 1);
        org.junit.Assert.assertNotNull(obj80);
        org.junit.Assert.assertEquals(obj80.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj80), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj80), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(iterator86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(iterator88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test198");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.equals_CUT((java.lang.Object) 1L);
        boolean boolean9 = linkedListTestDriver5.contains((java.lang.Object) true);
        java.lang.Object[] objArray10 = linkedListTestDriver5.toArray();
        experiment.util.Iterator iterator11 = linkedListTestDriver5.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        boolean boolean14 = linkedListTestDriver12.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver12.addLast((java.lang.Object) 100);
        boolean boolean17 = linkedListTestDriver12.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addFirst((java.lang.Object) linkedListTestDriver18);
        experiment.util.Iterator iterator20 = linkedListTestDriver12.iterator();
        java.lang.Object obj21 = linkedListTestDriver12.getLast();
        java.lang.Object obj22 = linkedListTestDriver12.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        boolean boolean25 = linkedListTestDriver23.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver23.addLast((java.lang.Object) 100);
        boolean boolean28 = linkedListTestDriver23.isEmpty();
        linkedListTestDriver23.clear();
        linkedListTestDriver12.addFirst((java.lang.Object) linkedListTestDriver23);
        experiment.util.ListIterator listIterator32 = linkedListTestDriver23.listIterator(0);
        experiment.util.LinkedListTestDriver linkedListTestDriver33 = new experiment.util.LinkedListTestDriver();
        boolean boolean35 = linkedListTestDriver33.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver36 = new experiment.util.LinkedListTestDriver();
        boolean boolean38 = linkedListTestDriver36.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver36.addLast((java.lang.Object) 100);
        boolean boolean41 = linkedListTestDriver36.isEmpty();
        java.lang.Class<?> wildcardClass42 = linkedListTestDriver36.getClass();
        linkedListTestDriver33.addLast((java.lang.Object) wildcardClass42);
        int int44 = linkedListTestDriver33.size();
        java.lang.Object obj45 = linkedListTestDriver33.getLast();
        java.lang.Object obj46 = linkedListTestDriver33.removeFirst();
        boolean boolean47 = linkedListTestDriver33.isEmpty();
        linkedListTestDriver23.addFirst((java.lang.Object) boolean47);
        boolean boolean49 = linkedListTestDriver5.contains((java.lang.Object) linkedListTestDriver23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj50 = linkedListTestDriver0.set((int) (short) 10, (java.lang.Object) linkedListTestDriver23);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100 + "'", obj21, 100);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 100 + "'", obj22, 100);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(listIterator32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertEquals(obj45.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj45), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj45), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertEquals(obj46.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj46), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj46), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test199");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        boolean boolean3 = linkedListTestDriver1.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver4.addLast((java.lang.Object) 100);
        boolean boolean9 = linkedListTestDriver4.isEmpty();
        java.lang.Class<?> wildcardClass10 = linkedListTestDriver4.getClass();
        linkedListTestDriver1.addLast((java.lang.Object) wildcardClass10);
        boolean boolean12 = linkedListTestDriver0.equals_CUT((java.lang.Object) wildcardClass10);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.equals_CUT((java.lang.Object) 1L);
        experiment.util.Iterator iterator16 = linkedListTestDriver13.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver18.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        boolean boolean23 = linkedListTestDriver21.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver21.addLast((java.lang.Object) 100);
        boolean boolean26 = linkedListTestDriver21.isEmpty();
        java.lang.Class<?> wildcardClass27 = linkedListTestDriver21.getClass();
        linkedListTestDriver18.addLast((java.lang.Object) wildcardClass27);
        boolean boolean29 = linkedListTestDriver17.equals_CUT((java.lang.Object) wildcardClass27);
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        boolean boolean32 = linkedListTestDriver30.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator33 = linkedListTestDriver30.iterator();
        linkedListTestDriver17.addFirst((java.lang.Object) iterator33);
        boolean boolean35 = linkedListTestDriver13.equals_CUT((java.lang.Object) linkedListTestDriver17);
        java.lang.Object obj36 = linkedListTestDriver17.getLast();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver17);
        experiment.util.LinkedListTestDriver linkedListTestDriver39 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver40 = new experiment.util.LinkedListTestDriver();
        boolean boolean42 = linkedListTestDriver40.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver43 = new experiment.util.LinkedListTestDriver();
        boolean boolean45 = linkedListTestDriver43.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver43.addLast((java.lang.Object) 100);
        boolean boolean48 = linkedListTestDriver43.isEmpty();
        java.lang.Class<?> wildcardClass49 = linkedListTestDriver43.getClass();
        linkedListTestDriver40.addLast((java.lang.Object) wildcardClass49);
        boolean boolean51 = linkedListTestDriver39.equals_CUT((java.lang.Object) wildcardClass49);
        experiment.util.LinkedListTestDriver linkedListTestDriver52 = new experiment.util.LinkedListTestDriver();
        boolean boolean54 = linkedListTestDriver52.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator55 = linkedListTestDriver52.iterator();
        linkedListTestDriver39.addFirst((java.lang.Object) iterator55);
        linkedListTestDriver39.addLast((java.lang.Object) (short) 0);
        java.lang.Object obj59 = linkedListTestDriver17.set(0, (java.lang.Object) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(iterator55);
        org.junit.Assert.assertNotNull(obj59);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test200");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        java.lang.Object[] objArray3 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver4.addLast((java.lang.Object) 100);
        boolean boolean9 = linkedListTestDriver4.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.addFirst((java.lang.Object) linkedListTestDriver10);
        experiment.util.Iterator iterator12 = linkedListTestDriver4.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        boolean boolean16 = linkedListTestDriver14.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        boolean boolean19 = linkedListTestDriver17.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver17.addLast((java.lang.Object) 100);
        boolean boolean22 = linkedListTestDriver17.isEmpty();
        java.lang.Class<?> wildcardClass23 = linkedListTestDriver17.getClass();
        linkedListTestDriver14.addLast((java.lang.Object) wildcardClass23);
        boolean boolean25 = linkedListTestDriver13.equals_CUT((java.lang.Object) wildcardClass23);
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        boolean boolean28 = linkedListTestDriver26.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator29 = linkedListTestDriver26.iterator();
        linkedListTestDriver13.addFirst((java.lang.Object) iterator29);
        boolean boolean31 = linkedListTestDriver4.add((java.lang.Object) linkedListTestDriver13);
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver13);
        experiment.util.LinkedListTestDriver linkedListTestDriver33 = new experiment.util.LinkedListTestDriver();
        boolean boolean35 = linkedListTestDriver33.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver33.addLast((java.lang.Object) 100);
        boolean boolean38 = linkedListTestDriver33.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver39 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver33.addFirst((java.lang.Object) linkedListTestDriver39);
        java.lang.Object[] objArray41 = linkedListTestDriver33.toArray();
        java.lang.Object obj42 = linkedListTestDriver33.removeLast();
        linkedListTestDriver13.addLast((java.lang.Object) linkedListTestDriver33);
        java.lang.Object obj45 = linkedListTestDriver13.remove((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 100 + "'", obj42, 100);
        org.junit.Assert.assertNotNull(obj45);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test201");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean4 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver9.addLast((java.lang.Object) 100);
        boolean boolean14 = linkedListTestDriver9.isEmpty();
        java.lang.Class<?> wildcardClass15 = linkedListTestDriver9.getClass();
        linkedListTestDriver6.addLast((java.lang.Object) wildcardClass15);
        boolean boolean17 = linkedListTestDriver5.equals_CUT((java.lang.Object) wildcardClass15);
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver18.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator21 = linkedListTestDriver18.iterator();
        linkedListTestDriver5.addFirst((java.lang.Object) iterator21);
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        java.lang.Object obj24 = linkedListTestDriver0.removeFirst();
        int int25 = linkedListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = linkedListTestDriver0.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test202");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean4 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver9.addLast((java.lang.Object) 100);
        boolean boolean14 = linkedListTestDriver9.isEmpty();
        java.lang.Class<?> wildcardClass15 = linkedListTestDriver9.getClass();
        linkedListTestDriver6.addLast((java.lang.Object) wildcardClass15);
        boolean boolean17 = linkedListTestDriver5.equals_CUT((java.lang.Object) wildcardClass15);
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver18.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator21 = linkedListTestDriver18.iterator();
        linkedListTestDriver5.addFirst((java.lang.Object) iterator21);
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        experiment.util.Iterator iterator24 = linkedListTestDriver5.iterator();
        experiment.util.Iterator iterator25 = linkedListTestDriver5.iterator();
        java.lang.Object obj26 = linkedListTestDriver5.removeLast();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertNotNull(obj26);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test203");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        boolean boolean4 = linkedListTestDriver0.contains((java.lang.Object) true);
        java.lang.Object[] objArray5 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        boolean boolean12 = linkedListTestDriver10.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver10.addLast((java.lang.Object) 100);
        boolean boolean15 = linkedListTestDriver10.isEmpty();
        java.lang.Class<?> wildcardClass16 = linkedListTestDriver10.getClass();
        linkedListTestDriver7.addLast((java.lang.Object) wildcardClass16);
        int int18 = linkedListTestDriver7.size();
        java.lang.Object obj19 = linkedListTestDriver7.getLast();
        linkedListTestDriver6.addFirst((java.lang.Object) linkedListTestDriver7);
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        java.lang.Object obj22 = linkedListTestDriver0.removeLast();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test204");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        java.lang.Object[] objArray8 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver9.addLast((java.lang.Object) 100);
        boolean boolean14 = linkedListTestDriver9.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver9.addFirst((java.lang.Object) linkedListTestDriver15);
        experiment.util.Iterator iterator17 = linkedListTestDriver9.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        boolean boolean21 = linkedListTestDriver19.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        boolean boolean24 = linkedListTestDriver22.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver22.addLast((java.lang.Object) 100);
        boolean boolean27 = linkedListTestDriver22.isEmpty();
        java.lang.Class<?> wildcardClass28 = linkedListTestDriver22.getClass();
        linkedListTestDriver19.addLast((java.lang.Object) wildcardClass28);
        boolean boolean30 = linkedListTestDriver18.equals_CUT((java.lang.Object) wildcardClass28);
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        boolean boolean33 = linkedListTestDriver31.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator34 = linkedListTestDriver31.iterator();
        linkedListTestDriver18.addFirst((java.lang.Object) iterator34);
        boolean boolean36 = linkedListTestDriver9.add((java.lang.Object) linkedListTestDriver18);
        experiment.util.Iterator iterator37 = linkedListTestDriver18.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) iterator37);
        linkedListTestDriver0.addFirst((java.lang.Object) 100);
        java.lang.Object obj41 = linkedListTestDriver0.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver42 = new experiment.util.LinkedListTestDriver();
        boolean boolean44 = linkedListTestDriver42.remove((java.lang.Object) '#');
        java.lang.Object[] objArray45 = linkedListTestDriver42.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver46 = new experiment.util.LinkedListTestDriver();
        boolean boolean48 = linkedListTestDriver46.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver46.addLast((java.lang.Object) 100);
        boolean boolean51 = linkedListTestDriver46.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver52 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver46.addFirst((java.lang.Object) linkedListTestDriver52);
        experiment.util.Iterator iterator54 = linkedListTestDriver46.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver55 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver56 = new experiment.util.LinkedListTestDriver();
        boolean boolean58 = linkedListTestDriver56.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver59 = new experiment.util.LinkedListTestDriver();
        boolean boolean61 = linkedListTestDriver59.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver59.addLast((java.lang.Object) 100);
        boolean boolean64 = linkedListTestDriver59.isEmpty();
        java.lang.Class<?> wildcardClass65 = linkedListTestDriver59.getClass();
        linkedListTestDriver56.addLast((java.lang.Object) wildcardClass65);
        boolean boolean67 = linkedListTestDriver55.equals_CUT((java.lang.Object) wildcardClass65);
        experiment.util.LinkedListTestDriver linkedListTestDriver68 = new experiment.util.LinkedListTestDriver();
        boolean boolean70 = linkedListTestDriver68.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator71 = linkedListTestDriver68.iterator();
        linkedListTestDriver55.addFirst((java.lang.Object) iterator71);
        boolean boolean73 = linkedListTestDriver46.add((java.lang.Object) linkedListTestDriver55);
        linkedListTestDriver42.addLast((java.lang.Object) linkedListTestDriver55);
        java.lang.Object[] objArray75 = linkedListTestDriver55.toArray();
        boolean boolean76 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver55);
        java.lang.Object obj77 = linkedListTestDriver0.removeLast();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(iterator54);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(iterator71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(obj77);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test205");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        java.lang.Object obj6 = linkedListTestDriver0.getFirst();
        java.lang.Object[] objArray7 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addLast((java.lang.Object) 10.0d);
        java.lang.Object obj10 = linkedListTestDriver0.removeLast();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100 + "'", obj6, 100);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 10.0d + "'", obj10, 10.0d);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test206");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        boolean boolean3 = linkedListTestDriver1.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver4.addLast((java.lang.Object) 100);
        boolean boolean9 = linkedListTestDriver4.isEmpty();
        java.lang.Class<?> wildcardClass10 = linkedListTestDriver4.getClass();
        linkedListTestDriver1.addLast((java.lang.Object) wildcardClass10);
        boolean boolean12 = linkedListTestDriver0.equals_CUT((java.lang.Object) wildcardClass10);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.equals_CUT((java.lang.Object) 1L);
        experiment.util.Iterator iterator16 = linkedListTestDriver13.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver18.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        boolean boolean23 = linkedListTestDriver21.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver21.addLast((java.lang.Object) 100);
        boolean boolean26 = linkedListTestDriver21.isEmpty();
        java.lang.Class<?> wildcardClass27 = linkedListTestDriver21.getClass();
        linkedListTestDriver18.addLast((java.lang.Object) wildcardClass27);
        boolean boolean29 = linkedListTestDriver17.equals_CUT((java.lang.Object) wildcardClass27);
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        boolean boolean32 = linkedListTestDriver30.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator33 = linkedListTestDriver30.iterator();
        linkedListTestDriver17.addFirst((java.lang.Object) iterator33);
        boolean boolean35 = linkedListTestDriver13.equals_CUT((java.lang.Object) linkedListTestDriver17);
        java.lang.Object obj36 = linkedListTestDriver17.getLast();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver17);
        experiment.util.LinkedListTestDriver linkedListTestDriver38 = new experiment.util.LinkedListTestDriver();
        boolean boolean40 = linkedListTestDriver38.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver38.addLast((java.lang.Object) 100);
        boolean boolean43 = linkedListTestDriver38.isEmpty();
        linkedListTestDriver38.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver45 = new experiment.util.LinkedListTestDriver();
        boolean boolean47 = linkedListTestDriver45.equals_CUT((java.lang.Object) 1L);
        boolean boolean49 = linkedListTestDriver45.contains((java.lang.Object) true);
        java.lang.Object[] objArray50 = linkedListTestDriver45.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver51 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver52 = new experiment.util.LinkedListTestDriver();
        boolean boolean54 = linkedListTestDriver52.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver55 = new experiment.util.LinkedListTestDriver();
        boolean boolean57 = linkedListTestDriver55.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver55.addLast((java.lang.Object) 100);
        boolean boolean60 = linkedListTestDriver55.isEmpty();
        java.lang.Class<?> wildcardClass61 = linkedListTestDriver55.getClass();
        linkedListTestDriver52.addLast((java.lang.Object) wildcardClass61);
        int int63 = linkedListTestDriver52.size();
        java.lang.Object obj64 = linkedListTestDriver52.getLast();
        linkedListTestDriver51.addFirst((java.lang.Object) linkedListTestDriver52);
        linkedListTestDriver45.addFirst((java.lang.Object) linkedListTestDriver51);
        boolean boolean67 = linkedListTestDriver38.contains((java.lang.Object) linkedListTestDriver45);
        boolean boolean68 = linkedListTestDriver17.remove((java.lang.Object) boolean67);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator70 = linkedListTestDriver17.listIterator(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 2; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertEquals(obj64.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj64), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj64), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test207");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean4 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver9.addLast((java.lang.Object) 100);
        boolean boolean14 = linkedListTestDriver9.isEmpty();
        java.lang.Class<?> wildcardClass15 = linkedListTestDriver9.getClass();
        linkedListTestDriver6.addLast((java.lang.Object) wildcardClass15);
        boolean boolean17 = linkedListTestDriver5.equals_CUT((java.lang.Object) wildcardClass15);
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver18.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator21 = linkedListTestDriver18.iterator();
        linkedListTestDriver5.addFirst((java.lang.Object) iterator21);
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator25 = linkedListTestDriver0.listIterator((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(iterator21);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test208");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean4 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver9.addLast((java.lang.Object) 100);
        boolean boolean14 = linkedListTestDriver9.isEmpty();
        java.lang.Class<?> wildcardClass15 = linkedListTestDriver9.getClass();
        linkedListTestDriver6.addLast((java.lang.Object) wildcardClass15);
        boolean boolean17 = linkedListTestDriver5.equals_CUT((java.lang.Object) wildcardClass15);
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver18.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator21 = linkedListTestDriver18.iterator();
        linkedListTestDriver5.addFirst((java.lang.Object) iterator21);
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        java.lang.Object obj25 = linkedListTestDriver5.remove((int) (byte) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        boolean boolean28 = linkedListTestDriver26.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        boolean boolean31 = linkedListTestDriver29.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver29.addLast((java.lang.Object) 100);
        boolean boolean34 = linkedListTestDriver29.isEmpty();
        java.lang.Class<?> wildcardClass35 = linkedListTestDriver29.getClass();
        linkedListTestDriver26.addLast((java.lang.Object) wildcardClass35);
        int int37 = linkedListTestDriver26.size();
        java.lang.Object obj38 = linkedListTestDriver26.getLast();
        java.lang.Object obj39 = linkedListTestDriver26.removeLast();
        boolean boolean40 = linkedListTestDriver26.isEmpty();
        linkedListTestDriver5.addLast((java.lang.Object) boolean40);
        java.lang.Object obj42 = linkedListTestDriver5.getFirst();
        java.lang.Object[] objArray43 = linkedListTestDriver5.toArray();
        java.lang.Object obj45 = linkedListTestDriver5.get((int) (short) 0);
        java.lang.Object obj46 = linkedListTestDriver5.getLast();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertEquals(obj38.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj38), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj38), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertEquals(obj39.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj39), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj39), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + true + "'", obj42, true);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[true]");
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + true + "'", obj45, true);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + true + "'", obj46, true);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test209");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        java.lang.Object obj10 = linkedListTestDriver0.remove((int) (byte) 0);
        java.lang.Object obj11 = linkedListTestDriver0.getLast();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator13 = linkedListTestDriver0.listIterator(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100 + "'", obj11, 100);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test210");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        int int5 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver9.addLast((java.lang.Object) 100);
        boolean boolean14 = linkedListTestDriver9.isEmpty();
        java.lang.Class<?> wildcardClass15 = linkedListTestDriver9.getClass();
        linkedListTestDriver6.addLast((java.lang.Object) wildcardClass15);
        int int17 = linkedListTestDriver6.size();
        java.lang.Object obj18 = linkedListTestDriver6.getLast();
        java.lang.Object obj19 = linkedListTestDriver6.removeLast();
        boolean boolean20 = linkedListTestDriver6.isEmpty();
        linkedListTestDriver6.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        boolean boolean24 = linkedListTestDriver22.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver22.addLast((java.lang.Object) 100);
        boolean boolean27 = linkedListTestDriver22.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver22.addFirst((java.lang.Object) linkedListTestDriver28);
        experiment.util.Iterator iterator30 = linkedListTestDriver22.iterator();
        linkedListTestDriver6.addLast((java.lang.Object) iterator30);
        linkedListTestDriver0.addLast((java.lang.Object) iterator30);
        experiment.util.LinkedListTestDriver linkedListTestDriver33 = new experiment.util.LinkedListTestDriver();
        boolean boolean35 = linkedListTestDriver33.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver33.addLast((java.lang.Object) 100);
        boolean boolean38 = linkedListTestDriver33.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver39 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver33.addFirst((java.lang.Object) linkedListTestDriver39);
        experiment.util.Iterator iterator41 = linkedListTestDriver33.iterator();
        java.lang.Object obj42 = linkedListTestDriver33.getLast();
        int int43 = linkedListTestDriver33.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver44 = new experiment.util.LinkedListTestDriver();
        boolean boolean46 = linkedListTestDriver44.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver47 = new experiment.util.LinkedListTestDriver();
        boolean boolean49 = linkedListTestDriver47.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver47.addLast((java.lang.Object) 100);
        boolean boolean52 = linkedListTestDriver47.isEmpty();
        java.lang.Class<?> wildcardClass53 = linkedListTestDriver47.getClass();
        linkedListTestDriver44.addLast((java.lang.Object) wildcardClass53);
        int int55 = linkedListTestDriver44.size();
        java.lang.Object obj56 = linkedListTestDriver44.getLast();
        java.lang.Object obj57 = linkedListTestDriver44.removeLast();
        boolean boolean58 = linkedListTestDriver44.isEmpty();
        linkedListTestDriver44.clear();
        boolean boolean60 = linkedListTestDriver33.add((java.lang.Object) linkedListTestDriver44);
        java.lang.Object obj61 = linkedListTestDriver33.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver62 = new experiment.util.LinkedListTestDriver();
        boolean boolean64 = linkedListTestDriver62.equals_CUT((java.lang.Object) 1L);
        boolean boolean66 = linkedListTestDriver62.add((java.lang.Object) (short) 1);
        java.lang.Object obj68 = linkedListTestDriver62.remove(0);
        boolean boolean69 = linkedListTestDriver33.add(obj68);
        linkedListTestDriver0.addLast((java.lang.Object) boolean69);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj72 = linkedListTestDriver0.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(iterator41);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 100 + "'", obj42, 100);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertEquals(obj56.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj56), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj56), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertEquals(obj57.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj57), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj57), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertEquals("'" + obj68 + "' != '" + (short) 1 + "'", obj68, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test211");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean4 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver9.addLast((java.lang.Object) 100);
        boolean boolean14 = linkedListTestDriver9.isEmpty();
        java.lang.Class<?> wildcardClass15 = linkedListTestDriver9.getClass();
        linkedListTestDriver6.addLast((java.lang.Object) wildcardClass15);
        boolean boolean17 = linkedListTestDriver5.equals_CUT((java.lang.Object) wildcardClass15);
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver18.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator21 = linkedListTestDriver18.iterator();
        linkedListTestDriver5.addFirst((java.lang.Object) iterator21);
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        java.lang.Object obj24 = linkedListTestDriver0.removeFirst();
        int int25 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver26.addFirst((java.lang.Object) true);
        linkedListTestDriver26.clear();
        int int30 = linkedListTestDriver26.size();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver26);
        linkedListTestDriver0.clear();
        java.lang.Class<?> wildcardClass33 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test212");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        java.lang.Object[] objArray8 = linkedListTestDriver0.toArray();
        java.lang.Object[] objArray9 = linkedListTestDriver0.toArray();
        java.lang.Class<?> wildcardClass10 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test213");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        linkedListTestDriver0.clear();
        int int7 = linkedListTestDriver0.size();
        boolean boolean8 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = linkedListTestDriver0.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test214");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        java.lang.Object[] objArray8 = linkedListTestDriver0.toArray();
        boolean boolean10 = linkedListTestDriver0.remove((java.lang.Object) 100L);
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver11.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        boolean boolean16 = linkedListTestDriver14.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver14.addLast((java.lang.Object) 100);
        boolean boolean19 = linkedListTestDriver14.isEmpty();
        java.lang.Class<?> wildcardClass20 = linkedListTestDriver14.getClass();
        linkedListTestDriver11.addLast((java.lang.Object) wildcardClass20);
        boolean boolean23 = linkedListTestDriver11.equals_CUT((java.lang.Object) (short) 1);
        java.lang.Object obj24 = linkedListTestDriver11.removeFirst();
        boolean boolean25 = linkedListTestDriver0.equals_CUT(obj24);
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        boolean boolean28 = linkedListTestDriver26.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver26.addLast((java.lang.Object) 100);
        boolean boolean31 = linkedListTestDriver26.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver26.addFirst((java.lang.Object) linkedListTestDriver32);
        java.lang.Object[] objArray34 = linkedListTestDriver26.toArray();
        experiment.util.ListIterator listIterator36 = linkedListTestDriver26.listIterator((int) (byte) 0);
        boolean boolean37 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver26);
        experiment.util.LinkedListTestDriver linkedListTestDriver39 = new experiment.util.LinkedListTestDriver();
        boolean boolean41 = linkedListTestDriver39.remove((java.lang.Object) '#');
        java.lang.Object[] objArray42 = linkedListTestDriver39.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver43 = new experiment.util.LinkedListTestDriver();
        boolean boolean45 = linkedListTestDriver43.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver43.addLast((java.lang.Object) 100);
        boolean boolean48 = linkedListTestDriver43.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver49 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver43.addFirst((java.lang.Object) linkedListTestDriver49);
        experiment.util.Iterator iterator51 = linkedListTestDriver43.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver52 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver53 = new experiment.util.LinkedListTestDriver();
        boolean boolean55 = linkedListTestDriver53.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver56 = new experiment.util.LinkedListTestDriver();
        boolean boolean58 = linkedListTestDriver56.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver56.addLast((java.lang.Object) 100);
        boolean boolean61 = linkedListTestDriver56.isEmpty();
        java.lang.Class<?> wildcardClass62 = linkedListTestDriver56.getClass();
        linkedListTestDriver53.addLast((java.lang.Object) wildcardClass62);
        boolean boolean64 = linkedListTestDriver52.equals_CUT((java.lang.Object) wildcardClass62);
        experiment.util.LinkedListTestDriver linkedListTestDriver65 = new experiment.util.LinkedListTestDriver();
        boolean boolean67 = linkedListTestDriver65.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator68 = linkedListTestDriver65.iterator();
        linkedListTestDriver52.addFirst((java.lang.Object) iterator68);
        boolean boolean70 = linkedListTestDriver43.add((java.lang.Object) linkedListTestDriver52);
        linkedListTestDriver39.addLast((java.lang.Object) linkedListTestDriver52);
        java.lang.Object obj72 = linkedListTestDriver39.getLast();
        java.lang.Object obj73 = linkedListTestDriver39.getLast();
        java.lang.Object obj74 = linkedListTestDriver39.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj75 = linkedListTestDriver0.set(2, obj74);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(listIterator36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(iterator51);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(iterator68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(obj72);
        org.junit.Assert.assertNotNull(obj73);
        org.junit.Assert.assertNotNull(obj74);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test215");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        boolean boolean12 = linkedListTestDriver10.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver13.addLast((java.lang.Object) 100);
        boolean boolean18 = linkedListTestDriver13.isEmpty();
        java.lang.Class<?> wildcardClass19 = linkedListTestDriver13.getClass();
        linkedListTestDriver10.addLast((java.lang.Object) wildcardClass19);
        boolean boolean21 = linkedListTestDriver9.equals_CUT((java.lang.Object) wildcardClass19);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        boolean boolean24 = linkedListTestDriver22.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator25 = linkedListTestDriver22.iterator();
        linkedListTestDriver9.addFirst((java.lang.Object) iterator25);
        boolean boolean27 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver9);
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        boolean boolean30 = linkedListTestDriver28.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver28.addLast((java.lang.Object) 100);
        boolean boolean33 = linkedListTestDriver28.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver28.addFirst((java.lang.Object) linkedListTestDriver34);
        java.lang.Object[] objArray36 = linkedListTestDriver28.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        boolean boolean39 = linkedListTestDriver37.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver37.addLast((java.lang.Object) 100);
        boolean boolean42 = linkedListTestDriver37.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver43 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver37.addFirst((java.lang.Object) linkedListTestDriver43);
        experiment.util.Iterator iterator45 = linkedListTestDriver37.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver46 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver47 = new experiment.util.LinkedListTestDriver();
        boolean boolean49 = linkedListTestDriver47.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver50 = new experiment.util.LinkedListTestDriver();
        boolean boolean52 = linkedListTestDriver50.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver50.addLast((java.lang.Object) 100);
        boolean boolean55 = linkedListTestDriver50.isEmpty();
        java.lang.Class<?> wildcardClass56 = linkedListTestDriver50.getClass();
        linkedListTestDriver47.addLast((java.lang.Object) wildcardClass56);
        boolean boolean58 = linkedListTestDriver46.equals_CUT((java.lang.Object) wildcardClass56);
        experiment.util.LinkedListTestDriver linkedListTestDriver59 = new experiment.util.LinkedListTestDriver();
        boolean boolean61 = linkedListTestDriver59.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator62 = linkedListTestDriver59.iterator();
        linkedListTestDriver46.addFirst((java.lang.Object) iterator62);
        boolean boolean64 = linkedListTestDriver37.add((java.lang.Object) linkedListTestDriver46);
        experiment.util.Iterator iterator65 = linkedListTestDriver46.iterator();
        linkedListTestDriver28.addLast((java.lang.Object) iterator65);
        boolean boolean67 = linkedListTestDriver9.equals_CUT((java.lang.Object) linkedListTestDriver28);
        int int68 = linkedListTestDriver28.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(iterator45);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(iterator62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(iterator65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 3 + "'", int68 == 3);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test216");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        java.lang.Object[] objArray8 = linkedListTestDriver6.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.equals_CUT((java.lang.Object) 1L);
        boolean boolean13 = linkedListTestDriver9.contains((java.lang.Object) true);
        java.lang.Object[] objArray14 = linkedListTestDriver9.toArray();
        experiment.util.Iterator iterator15 = linkedListTestDriver9.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        boolean boolean18 = linkedListTestDriver16.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver16.addLast((java.lang.Object) 100);
        boolean boolean21 = linkedListTestDriver16.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver16.addFirst((java.lang.Object) linkedListTestDriver22);
        java.lang.Object[] objArray24 = linkedListTestDriver16.toArray();
        boolean boolean26 = linkedListTestDriver16.contains((java.lang.Object) 1L);
        experiment.util.LinkedListTestDriver linkedListTestDriver27 = new experiment.util.LinkedListTestDriver();
        boolean boolean29 = linkedListTestDriver27.equals_CUT((java.lang.Object) 1L);
        experiment.util.Iterator iterator30 = linkedListTestDriver27.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        boolean boolean34 = linkedListTestDriver32.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver35 = new experiment.util.LinkedListTestDriver();
        boolean boolean37 = linkedListTestDriver35.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver35.addLast((java.lang.Object) 100);
        boolean boolean40 = linkedListTestDriver35.isEmpty();
        java.lang.Class<?> wildcardClass41 = linkedListTestDriver35.getClass();
        linkedListTestDriver32.addLast((java.lang.Object) wildcardClass41);
        boolean boolean43 = linkedListTestDriver31.equals_CUT((java.lang.Object) wildcardClass41);
        experiment.util.LinkedListTestDriver linkedListTestDriver44 = new experiment.util.LinkedListTestDriver();
        boolean boolean46 = linkedListTestDriver44.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator47 = linkedListTestDriver44.iterator();
        linkedListTestDriver31.addFirst((java.lang.Object) iterator47);
        boolean boolean49 = linkedListTestDriver27.equals_CUT((java.lang.Object) linkedListTestDriver31);
        java.lang.Class<?> wildcardClass50 = linkedListTestDriver31.getClass();
        boolean boolean51 = linkedListTestDriver16.add((java.lang.Object) linkedListTestDriver31);
        boolean boolean52 = linkedListTestDriver9.remove((java.lang.Object) linkedListTestDriver31);
        boolean boolean53 = linkedListTestDriver6.add((java.lang.Object) linkedListTestDriver9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(iterator47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test217");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) (short) 1);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 1 + "'", obj5, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test218");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        boolean boolean3 = linkedListTestDriver1.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver4.addLast((java.lang.Object) 100);
        boolean boolean9 = linkedListTestDriver4.isEmpty();
        java.lang.Class<?> wildcardClass10 = linkedListTestDriver4.getClass();
        linkedListTestDriver1.addLast((java.lang.Object) wildcardClass10);
        int int12 = linkedListTestDriver1.size();
        java.lang.Object obj13 = linkedListTestDriver1.getLast();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver1);
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        boolean boolean17 = linkedListTestDriver15.remove((java.lang.Object) '#');
        java.lang.Object[] objArray18 = linkedListTestDriver15.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        boolean boolean21 = linkedListTestDriver19.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver19.addLast((java.lang.Object) 100);
        boolean boolean24 = linkedListTestDriver19.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver19.addFirst((java.lang.Object) linkedListTestDriver25);
        experiment.util.Iterator iterator27 = linkedListTestDriver19.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        boolean boolean31 = linkedListTestDriver29.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        boolean boolean34 = linkedListTestDriver32.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver32.addLast((java.lang.Object) 100);
        boolean boolean37 = linkedListTestDriver32.isEmpty();
        java.lang.Class<?> wildcardClass38 = linkedListTestDriver32.getClass();
        linkedListTestDriver29.addLast((java.lang.Object) wildcardClass38);
        boolean boolean40 = linkedListTestDriver28.equals_CUT((java.lang.Object) wildcardClass38);
        experiment.util.LinkedListTestDriver linkedListTestDriver41 = new experiment.util.LinkedListTestDriver();
        boolean boolean43 = linkedListTestDriver41.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator44 = linkedListTestDriver41.iterator();
        linkedListTestDriver28.addFirst((java.lang.Object) iterator44);
        boolean boolean46 = linkedListTestDriver19.add((java.lang.Object) linkedListTestDriver28);
        linkedListTestDriver15.addLast((java.lang.Object) linkedListTestDriver28);
        experiment.util.LinkedListTestDriver linkedListTestDriver48 = new experiment.util.LinkedListTestDriver();
        boolean boolean50 = linkedListTestDriver48.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver48.addLast((java.lang.Object) 100);
        boolean boolean53 = linkedListTestDriver48.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver54 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver48.addFirst((java.lang.Object) linkedListTestDriver54);
        java.lang.Object[] objArray56 = linkedListTestDriver48.toArray();
        java.lang.Object obj57 = linkedListTestDriver48.removeLast();
        linkedListTestDriver28.addLast((java.lang.Object) linkedListTestDriver48);
        linkedListTestDriver1.addFirst((java.lang.Object) linkedListTestDriver28);
        experiment.util.Iterator iterator60 = linkedListTestDriver28.iterator();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(iterator44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + 100 + "'", obj57, 100);
        org.junit.Assert.assertNotNull(iterator60);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test219");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean4 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver9.addLast((java.lang.Object) 100);
        boolean boolean14 = linkedListTestDriver9.isEmpty();
        java.lang.Class<?> wildcardClass15 = linkedListTestDriver9.getClass();
        linkedListTestDriver6.addLast((java.lang.Object) wildcardClass15);
        boolean boolean17 = linkedListTestDriver5.equals_CUT((java.lang.Object) wildcardClass15);
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver18.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator21 = linkedListTestDriver18.iterator();
        linkedListTestDriver5.addFirst((java.lang.Object) iterator21);
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        boolean boolean26 = linkedListTestDriver24.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver24.addLast((java.lang.Object) 100);
        boolean boolean29 = linkedListTestDriver24.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver24.addFirst((java.lang.Object) linkedListTestDriver30);
        experiment.util.Iterator iterator32 = linkedListTestDriver24.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver33 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        boolean boolean36 = linkedListTestDriver34.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        boolean boolean39 = linkedListTestDriver37.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver37.addLast((java.lang.Object) 100);
        boolean boolean42 = linkedListTestDriver37.isEmpty();
        java.lang.Class<?> wildcardClass43 = linkedListTestDriver37.getClass();
        linkedListTestDriver34.addLast((java.lang.Object) wildcardClass43);
        boolean boolean45 = linkedListTestDriver33.equals_CUT((java.lang.Object) wildcardClass43);
        experiment.util.LinkedListTestDriver linkedListTestDriver46 = new experiment.util.LinkedListTestDriver();
        boolean boolean48 = linkedListTestDriver46.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator49 = linkedListTestDriver46.iterator();
        linkedListTestDriver33.addFirst((java.lang.Object) iterator49);
        boolean boolean51 = linkedListTestDriver24.add((java.lang.Object) linkedListTestDriver33);
        java.lang.Object obj52 = linkedListTestDriver33.getLast();
        java.lang.Object obj53 = linkedListTestDriver33.getFirst();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver33);
        java.lang.Object obj55 = linkedListTestDriver33.getFirst();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(iterator49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertNotNull(obj55);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test220");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        java.lang.Object obj6 = linkedListTestDriver0.getFirst();
        java.lang.Object[] objArray7 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addLast((java.lang.Object) 10.0d);
        java.lang.Object obj10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = linkedListTestDriver0.equals_CUT(obj10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100 + "'", obj6, 100);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100]");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test221");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = linkedListTestDriver0.get(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test222");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        boolean boolean4 = linkedListTestDriver0.contains((java.lang.Object) true);
        java.lang.Object[] objArray5 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        boolean boolean12 = linkedListTestDriver10.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver10.addLast((java.lang.Object) 100);
        boolean boolean15 = linkedListTestDriver10.isEmpty();
        java.lang.Class<?> wildcardClass16 = linkedListTestDriver10.getClass();
        linkedListTestDriver7.addLast((java.lang.Object) wildcardClass16);
        int int18 = linkedListTestDriver7.size();
        java.lang.Object obj19 = linkedListTestDriver7.getLast();
        linkedListTestDriver6.addFirst((java.lang.Object) linkedListTestDriver7);
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        boolean boolean24 = linkedListTestDriver22.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver22.addLast((java.lang.Object) 100);
        int int27 = linkedListTestDriver22.size();
        boolean boolean28 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver22);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test223");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean4 = linkedListTestDriver0.isEmpty();
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        boolean boolean7 = linkedListTestDriver0.contains((java.lang.Object) 100.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        boolean boolean10 = linkedListTestDriver8.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver8.addLast((java.lang.Object) 100);
        boolean boolean13 = linkedListTestDriver8.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.addFirst((java.lang.Object) linkedListTestDriver14);
        java.lang.Object[] objArray16 = linkedListTestDriver8.toArray();
        java.lang.Object obj17 = linkedListTestDriver8.removeLast();
        boolean boolean18 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = linkedListTestDriver0.get(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 100 + "'", obj17, 100);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test224");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        boolean boolean5 = linkedListTestDriver3.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver3.addLast((java.lang.Object) 100);
        boolean boolean8 = linkedListTestDriver3.isEmpty();
        java.lang.Class<?> wildcardClass9 = linkedListTestDriver3.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) wildcardClass9);
        boolean boolean12 = linkedListTestDriver0.equals_CUT((java.lang.Object) (short) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver13.addFirst((java.lang.Object) true);
        linkedListTestDriver0.addLast((java.lang.Object) true);
        java.lang.Object obj17 = linkedListTestDriver0.removeLast();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + true + "'", obj17, true);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test225");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        java.lang.Object obj9 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver11.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver11.addLast((java.lang.Object) 100);
        boolean boolean16 = linkedListTestDriver11.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.addFirst((java.lang.Object) linkedListTestDriver17);
        java.lang.Object[] objArray19 = linkedListTestDriver11.toArray();
        java.lang.Object obj20 = linkedListTestDriver11.getLast();
        int int21 = linkedListTestDriver11.size();
        linkedListTestDriver11.clear();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add(100, (java.lang.Object) linkedListTestDriver11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 100; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100 + "'", obj9, 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100 + "'", obj20, 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test226");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        boolean boolean5 = linkedListTestDriver3.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver3.addLast((java.lang.Object) 100);
        boolean boolean8 = linkedListTestDriver3.isEmpty();
        java.lang.Class<?> wildcardClass9 = linkedListTestDriver3.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) wildcardClass9);
        int int11 = linkedListTestDriver0.size();
        java.lang.Object[] objArray12 = linkedListTestDriver0.toArray();
        int int13 = linkedListTestDriver0.size();
        boolean boolean14 = linkedListTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[class experiment.util.LinkedListTestDriver]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[class experiment.util.LinkedListTestDriver]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test227");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        java.lang.Object[] objArray8 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver9.addLast((java.lang.Object) 100);
        boolean boolean14 = linkedListTestDriver9.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver9.addFirst((java.lang.Object) linkedListTestDriver15);
        experiment.util.Iterator iterator17 = linkedListTestDriver9.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        boolean boolean21 = linkedListTestDriver19.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        boolean boolean24 = linkedListTestDriver22.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver22.addLast((java.lang.Object) 100);
        boolean boolean27 = linkedListTestDriver22.isEmpty();
        java.lang.Class<?> wildcardClass28 = linkedListTestDriver22.getClass();
        linkedListTestDriver19.addLast((java.lang.Object) wildcardClass28);
        boolean boolean30 = linkedListTestDriver18.equals_CUT((java.lang.Object) wildcardClass28);
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        boolean boolean33 = linkedListTestDriver31.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator34 = linkedListTestDriver31.iterator();
        linkedListTestDriver18.addFirst((java.lang.Object) iterator34);
        boolean boolean36 = linkedListTestDriver9.add((java.lang.Object) linkedListTestDriver18);
        experiment.util.Iterator iterator37 = linkedListTestDriver18.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) iterator37);
        experiment.util.LinkedListTestDriver linkedListTestDriver39 = new experiment.util.LinkedListTestDriver();
        boolean boolean41 = linkedListTestDriver39.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver39.addLast((java.lang.Object) 100);
        boolean boolean44 = linkedListTestDriver39.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver45 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver39.addFirst((java.lang.Object) linkedListTestDriver45);
        experiment.util.Iterator iterator47 = linkedListTestDriver39.iterator();
        java.lang.Object obj48 = linkedListTestDriver39.getLast();
        java.lang.Object obj49 = linkedListTestDriver39.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver50 = new experiment.util.LinkedListTestDriver();
        boolean boolean52 = linkedListTestDriver50.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver50.addLast((java.lang.Object) 100);
        boolean boolean55 = linkedListTestDriver50.isEmpty();
        linkedListTestDriver50.clear();
        linkedListTestDriver39.addFirst((java.lang.Object) linkedListTestDriver50);
        boolean boolean58 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver39);
        java.lang.Object obj59 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver60 = new experiment.util.LinkedListTestDriver();
        boolean boolean62 = linkedListTestDriver60.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver60.addLast((java.lang.Object) 100);
        boolean boolean65 = linkedListTestDriver60.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver66 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver60.addFirst((java.lang.Object) linkedListTestDriver66);
        experiment.util.Iterator iterator68 = linkedListTestDriver60.iterator();
        java.lang.Object obj69 = linkedListTestDriver60.getLast();
        java.lang.Object obj70 = linkedListTestDriver60.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver71 = new experiment.util.LinkedListTestDriver();
        boolean boolean73 = linkedListTestDriver71.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver71.addLast((java.lang.Object) 100);
        boolean boolean76 = linkedListTestDriver71.isEmpty();
        linkedListTestDriver71.clear();
        linkedListTestDriver60.addFirst((java.lang.Object) linkedListTestDriver71);
        experiment.util.LinkedListTestDriver linkedListTestDriver79 = new experiment.util.LinkedListTestDriver();
        boolean boolean81 = linkedListTestDriver79.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver79.addLast((java.lang.Object) 100);
        int int84 = linkedListTestDriver79.size();
        int int85 = linkedListTestDriver79.size();
        boolean boolean86 = linkedListTestDriver71.add((java.lang.Object) linkedListTestDriver79);
        linkedListTestDriver0.addLast((java.lang.Object) boolean86);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(iterator47);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 100 + "'", obj48, 100);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 100 + "'", obj49, 100);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(iterator68);
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + 100 + "'", obj69, 100);
        org.junit.Assert.assertEquals("'" + obj70 + "' != '" + 100 + "'", obj70, 100);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1 + "'", int84 == 1);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 1 + "'", int85 == 1);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test228");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        boolean boolean3 = linkedListTestDriver1.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver4.addLast((java.lang.Object) 100);
        boolean boolean9 = linkedListTestDriver4.isEmpty();
        java.lang.Class<?> wildcardClass10 = linkedListTestDriver4.getClass();
        linkedListTestDriver1.addLast((java.lang.Object) wildcardClass10);
        int int12 = linkedListTestDriver1.size();
        java.lang.Object obj13 = linkedListTestDriver1.getLast();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver1);
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        boolean boolean17 = linkedListTestDriver15.remove((java.lang.Object) '#');
        java.lang.Object[] objArray18 = linkedListTestDriver15.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        boolean boolean21 = linkedListTestDriver19.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver19.addLast((java.lang.Object) 100);
        boolean boolean24 = linkedListTestDriver19.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver19.addFirst((java.lang.Object) linkedListTestDriver25);
        experiment.util.Iterator iterator27 = linkedListTestDriver19.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        boolean boolean31 = linkedListTestDriver29.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        boolean boolean34 = linkedListTestDriver32.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver32.addLast((java.lang.Object) 100);
        boolean boolean37 = linkedListTestDriver32.isEmpty();
        java.lang.Class<?> wildcardClass38 = linkedListTestDriver32.getClass();
        linkedListTestDriver29.addLast((java.lang.Object) wildcardClass38);
        boolean boolean40 = linkedListTestDriver28.equals_CUT((java.lang.Object) wildcardClass38);
        experiment.util.LinkedListTestDriver linkedListTestDriver41 = new experiment.util.LinkedListTestDriver();
        boolean boolean43 = linkedListTestDriver41.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator44 = linkedListTestDriver41.iterator();
        linkedListTestDriver28.addFirst((java.lang.Object) iterator44);
        boolean boolean46 = linkedListTestDriver19.add((java.lang.Object) linkedListTestDriver28);
        linkedListTestDriver15.addLast((java.lang.Object) linkedListTestDriver28);
        experiment.util.LinkedListTestDriver linkedListTestDriver48 = new experiment.util.LinkedListTestDriver();
        boolean boolean50 = linkedListTestDriver48.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver48.addLast((java.lang.Object) 100);
        boolean boolean53 = linkedListTestDriver48.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver54 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver48.addFirst((java.lang.Object) linkedListTestDriver54);
        java.lang.Object[] objArray56 = linkedListTestDriver48.toArray();
        java.lang.Object obj57 = linkedListTestDriver48.removeLast();
        linkedListTestDriver28.addLast((java.lang.Object) linkedListTestDriver48);
        linkedListTestDriver1.addFirst((java.lang.Object) linkedListTestDriver28);
        linkedListTestDriver28.addFirst((java.lang.Object) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(iterator44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + 100 + "'", obj57, 100);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test229");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        java.lang.Object obj9 = linkedListTestDriver0.getLast();
        java.lang.Object obj10 = linkedListTestDriver0.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver11.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver11.addLast((java.lang.Object) 100);
        boolean boolean16 = linkedListTestDriver11.isEmpty();
        linkedListTestDriver11.clear();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver11);
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        boolean boolean21 = linkedListTestDriver19.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver19.addLast((java.lang.Object) 100);
        boolean boolean24 = linkedListTestDriver19.isEmpty();
        boolean boolean26 = linkedListTestDriver19.equals_CUT((java.lang.Object) (short) 100);
        boolean boolean27 = linkedListTestDriver19.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        boolean boolean31 = linkedListTestDriver29.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        boolean boolean34 = linkedListTestDriver32.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver32.addLast((java.lang.Object) 100);
        boolean boolean37 = linkedListTestDriver32.isEmpty();
        java.lang.Class<?> wildcardClass38 = linkedListTestDriver32.getClass();
        linkedListTestDriver29.addLast((java.lang.Object) wildcardClass38);
        boolean boolean40 = linkedListTestDriver28.equals_CUT((java.lang.Object) wildcardClass38);
        experiment.util.LinkedListTestDriver linkedListTestDriver41 = new experiment.util.LinkedListTestDriver();
        boolean boolean43 = linkedListTestDriver41.equals_CUT((java.lang.Object) 1L);
        experiment.util.Iterator iterator44 = linkedListTestDriver41.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver45 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver46 = new experiment.util.LinkedListTestDriver();
        boolean boolean48 = linkedListTestDriver46.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver49 = new experiment.util.LinkedListTestDriver();
        boolean boolean51 = linkedListTestDriver49.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver49.addLast((java.lang.Object) 100);
        boolean boolean54 = linkedListTestDriver49.isEmpty();
        java.lang.Class<?> wildcardClass55 = linkedListTestDriver49.getClass();
        linkedListTestDriver46.addLast((java.lang.Object) wildcardClass55);
        boolean boolean57 = linkedListTestDriver45.equals_CUT((java.lang.Object) wildcardClass55);
        experiment.util.LinkedListTestDriver linkedListTestDriver58 = new experiment.util.LinkedListTestDriver();
        boolean boolean60 = linkedListTestDriver58.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator61 = linkedListTestDriver58.iterator();
        linkedListTestDriver45.addFirst((java.lang.Object) iterator61);
        boolean boolean63 = linkedListTestDriver41.equals_CUT((java.lang.Object) linkedListTestDriver45);
        java.lang.Object obj64 = linkedListTestDriver45.getLast();
        linkedListTestDriver28.addLast((java.lang.Object) linkedListTestDriver45);
        boolean boolean66 = linkedListTestDriver19.remove((java.lang.Object) linkedListTestDriver28);
        linkedListTestDriver11.addLast((java.lang.Object) linkedListTestDriver28);
        java.lang.Class<?> wildcardClass68 = linkedListTestDriver28.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100 + "'", obj9, 100);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100 + "'", obj10, 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(iterator44);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(iterator61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test230");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean4 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        boolean boolean10 = linkedListTestDriver8.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver8.addLast((java.lang.Object) 100);
        boolean boolean13 = linkedListTestDriver8.isEmpty();
        java.lang.Class<?> wildcardClass14 = linkedListTestDriver8.getClass();
        linkedListTestDriver5.addLast((java.lang.Object) wildcardClass14);
        int int16 = linkedListTestDriver5.size();
        java.lang.Object obj17 = linkedListTestDriver5.getLast();
        java.lang.Object obj18 = linkedListTestDriver5.removeLast();
        boolean boolean19 = linkedListTestDriver5.isEmpty();
        linkedListTestDriver5.clear();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        java.lang.Object obj23 = linkedListTestDriver0.remove(0);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver25.addFirst((java.lang.Object) true);
        linkedListTestDriver25.clear();
        int int29 = linkedListTestDriver25.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = linkedListTestDriver0.set((-1), (java.lang.Object) linkedListTestDriver25);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test231");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        java.lang.Object[] objArray8 = linkedListTestDriver0.toArray();
        boolean boolean10 = linkedListTestDriver0.contains((java.lang.Object) 1L);
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver11.equals_CUT((java.lang.Object) 1L);
        experiment.util.Iterator iterator14 = linkedListTestDriver11.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        boolean boolean18 = linkedListTestDriver16.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        boolean boolean21 = linkedListTestDriver19.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver19.addLast((java.lang.Object) 100);
        boolean boolean24 = linkedListTestDriver19.isEmpty();
        java.lang.Class<?> wildcardClass25 = linkedListTestDriver19.getClass();
        linkedListTestDriver16.addLast((java.lang.Object) wildcardClass25);
        boolean boolean27 = linkedListTestDriver15.equals_CUT((java.lang.Object) wildcardClass25);
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        boolean boolean30 = linkedListTestDriver28.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator31 = linkedListTestDriver28.iterator();
        linkedListTestDriver15.addFirst((java.lang.Object) iterator31);
        boolean boolean33 = linkedListTestDriver11.equals_CUT((java.lang.Object) linkedListTestDriver15);
        boolean boolean34 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = linkedListTestDriver11.getLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test232");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        java.lang.Object[] objArray8 = linkedListTestDriver0.toArray();
        java.lang.Object obj9 = linkedListTestDriver0.getFirst();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test233");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        boolean boolean3 = linkedListTestDriver1.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver4.addLast((java.lang.Object) 100);
        boolean boolean9 = linkedListTestDriver4.isEmpty();
        java.lang.Class<?> wildcardClass10 = linkedListTestDriver4.getClass();
        linkedListTestDriver1.addLast((java.lang.Object) wildcardClass10);
        int int12 = linkedListTestDriver1.size();
        java.lang.Object obj13 = linkedListTestDriver1.getLast();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver1);
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        boolean boolean18 = linkedListTestDriver16.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator19 = linkedListTestDriver16.iterator();
        boolean boolean20 = linkedListTestDriver16.isEmpty();
        experiment.util.Iterator iterator21 = linkedListTestDriver16.iterator();
        linkedListTestDriver0.add(1, (java.lang.Object) linkedListTestDriver16);
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        boolean boolean25 = linkedListTestDriver23.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver23.addLast((java.lang.Object) 100);
        boolean boolean28 = linkedListTestDriver23.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver23.addFirst((java.lang.Object) linkedListTestDriver29);
        experiment.util.Iterator iterator31 = linkedListTestDriver23.iterator();
        java.lang.Object obj32 = linkedListTestDriver23.getLast();
        int int33 = linkedListTestDriver23.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        boolean boolean36 = linkedListTestDriver34.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        boolean boolean39 = linkedListTestDriver37.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver37.addLast((java.lang.Object) 100);
        boolean boolean42 = linkedListTestDriver37.isEmpty();
        java.lang.Class<?> wildcardClass43 = linkedListTestDriver37.getClass();
        linkedListTestDriver34.addLast((java.lang.Object) wildcardClass43);
        int int45 = linkedListTestDriver34.size();
        java.lang.Object obj46 = linkedListTestDriver34.getLast();
        java.lang.Object obj47 = linkedListTestDriver34.removeLast();
        boolean boolean48 = linkedListTestDriver34.isEmpty();
        linkedListTestDriver34.clear();
        boolean boolean50 = linkedListTestDriver23.add((java.lang.Object) linkedListTestDriver34);
        java.lang.Object obj51 = linkedListTestDriver23.getLast();
        java.lang.Object[] objArray52 = linkedListTestDriver23.toArray();
        linkedListTestDriver23.clear();
        boolean boolean54 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj55 = linkedListTestDriver23.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 100 + "'", obj32, 100);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertEquals(obj46.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj46), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj46), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertEquals(obj47.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj47), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj47), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test234");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        boolean boolean3 = linkedListTestDriver1.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver4.addLast((java.lang.Object) 100);
        boolean boolean9 = linkedListTestDriver4.isEmpty();
        java.lang.Class<?> wildcardClass10 = linkedListTestDriver4.getClass();
        linkedListTestDriver1.addLast((java.lang.Object) wildcardClass10);
        boolean boolean12 = linkedListTestDriver0.equals_CUT((java.lang.Object) wildcardClass10);
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = linkedListTestDriver0.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test235");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator7 = linkedListTestDriver4.iterator();
        boolean boolean8 = linkedListTestDriver4.isEmpty();
        boolean boolean9 = linkedListTestDriver0.contains((java.lang.Object) boolean8);
        java.lang.Object[] objArray10 = linkedListTestDriver0.toArray();
        java.lang.Class<?> wildcardClass11 = objArray10.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test236");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        java.lang.Object obj6 = linkedListTestDriver0.getFirst();
        java.lang.Object[] objArray7 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addLast((java.lang.Object) 10.0d);
        linkedListTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100 + "'", obj6, 100);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100]");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test237");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        java.lang.Object[] objArray8 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver9.addLast((java.lang.Object) 100);
        boolean boolean14 = linkedListTestDriver9.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver9.addFirst((java.lang.Object) linkedListTestDriver15);
        experiment.util.Iterator iterator17 = linkedListTestDriver9.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        boolean boolean21 = linkedListTestDriver19.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        boolean boolean24 = linkedListTestDriver22.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver22.addLast((java.lang.Object) 100);
        boolean boolean27 = linkedListTestDriver22.isEmpty();
        java.lang.Class<?> wildcardClass28 = linkedListTestDriver22.getClass();
        linkedListTestDriver19.addLast((java.lang.Object) wildcardClass28);
        boolean boolean30 = linkedListTestDriver18.equals_CUT((java.lang.Object) wildcardClass28);
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        boolean boolean33 = linkedListTestDriver31.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator34 = linkedListTestDriver31.iterator();
        linkedListTestDriver18.addFirst((java.lang.Object) iterator34);
        boolean boolean36 = linkedListTestDriver9.add((java.lang.Object) linkedListTestDriver18);
        experiment.util.Iterator iterator37 = linkedListTestDriver18.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) iterator37);
        experiment.util.ListIterator listIterator40 = linkedListTestDriver0.listIterator((int) (byte) 1);
        experiment.util.ListIterator listIterator42 = linkedListTestDriver0.listIterator((int) (short) 1);
        java.lang.Class<?> wildcardClass43 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertNotNull(listIterator40);
        org.junit.Assert.assertNotNull(listIterator42);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test238");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        boolean boolean4 = linkedListTestDriver0.contains((java.lang.Object) true);
        java.lang.Object[] objArray5 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        boolean boolean12 = linkedListTestDriver10.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver10.addLast((java.lang.Object) 100);
        boolean boolean15 = linkedListTestDriver10.isEmpty();
        java.lang.Class<?> wildcardClass16 = linkedListTestDriver10.getClass();
        linkedListTestDriver7.addLast((java.lang.Object) wildcardClass16);
        int int18 = linkedListTestDriver7.size();
        java.lang.Object obj19 = linkedListTestDriver7.getLast();
        linkedListTestDriver6.addFirst((java.lang.Object) linkedListTestDriver7);
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        int int22 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        boolean boolean25 = linkedListTestDriver23.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver23.addLast((java.lang.Object) 100);
        boolean boolean28 = linkedListTestDriver23.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver23.addFirst((java.lang.Object) linkedListTestDriver29);
        experiment.util.Iterator iterator31 = linkedListTestDriver23.iterator();
        java.lang.Object obj32 = linkedListTestDriver23.getLast();
        int int33 = linkedListTestDriver23.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        boolean boolean36 = linkedListTestDriver34.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        boolean boolean39 = linkedListTestDriver37.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver37.addLast((java.lang.Object) 100);
        boolean boolean42 = linkedListTestDriver37.isEmpty();
        java.lang.Class<?> wildcardClass43 = linkedListTestDriver37.getClass();
        linkedListTestDriver34.addLast((java.lang.Object) wildcardClass43);
        int int45 = linkedListTestDriver34.size();
        java.lang.Object obj46 = linkedListTestDriver34.getLast();
        java.lang.Object obj47 = linkedListTestDriver34.removeLast();
        boolean boolean48 = linkedListTestDriver34.isEmpty();
        linkedListTestDriver34.clear();
        boolean boolean50 = linkedListTestDriver23.add((java.lang.Object) linkedListTestDriver34);
        linkedListTestDriver0.addLast((java.lang.Object) boolean50);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 100 + "'", obj32, 100);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertEquals(obj46.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj46), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj46), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertEquals(obj47.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj47), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj47), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test239");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        boolean boolean5 = linkedListTestDriver3.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver3.addLast((java.lang.Object) 100);
        boolean boolean8 = linkedListTestDriver3.isEmpty();
        java.lang.Class<?> wildcardClass9 = linkedListTestDriver3.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) wildcardClass9);
        int int11 = linkedListTestDriver0.size();
        java.lang.Object obj12 = linkedListTestDriver0.getLast();
        boolean boolean13 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        boolean boolean17 = linkedListTestDriver15.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator18 = linkedListTestDriver15.iterator();
        boolean boolean19 = linkedListTestDriver15.isEmpty();
        experiment.util.Iterator iterator20 = linkedListTestDriver15.iterator();
        linkedListTestDriver0.add(0, (java.lang.Object) iterator20);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        boolean boolean24 = linkedListTestDriver22.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver22.addLast((java.lang.Object) 100);
        boolean boolean27 = linkedListTestDriver22.isEmpty();
        java.lang.Object obj28 = linkedListTestDriver22.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        boolean boolean31 = linkedListTestDriver29.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver29.addLast((java.lang.Object) 100);
        boolean boolean34 = linkedListTestDriver29.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver35 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver29.addFirst((java.lang.Object) linkedListTestDriver35);
        experiment.util.Iterator iterator37 = linkedListTestDriver29.iterator();
        java.lang.Object obj39 = linkedListTestDriver29.remove((int) (byte) 0);
        boolean boolean40 = linkedListTestDriver22.add(obj39);
        experiment.util.LinkedListTestDriver linkedListTestDriver41 = new experiment.util.LinkedListTestDriver();
        boolean boolean43 = linkedListTestDriver41.equals_CUT((java.lang.Object) 1L);
        boolean boolean45 = linkedListTestDriver41.contains((java.lang.Object) true);
        java.lang.Object[] objArray46 = linkedListTestDriver41.toArray();
        boolean boolean47 = linkedListTestDriver22.remove((java.lang.Object) objArray46);
        boolean boolean48 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver22);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 100 + "'", obj28, 100);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test240");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        java.lang.Object[] objArray8 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver9.addLast((java.lang.Object) 100);
        boolean boolean14 = linkedListTestDriver9.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver9.addFirst((java.lang.Object) linkedListTestDriver15);
        experiment.util.Iterator iterator17 = linkedListTestDriver9.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        boolean boolean21 = linkedListTestDriver19.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        boolean boolean24 = linkedListTestDriver22.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver22.addLast((java.lang.Object) 100);
        boolean boolean27 = linkedListTestDriver22.isEmpty();
        java.lang.Class<?> wildcardClass28 = linkedListTestDriver22.getClass();
        linkedListTestDriver19.addLast((java.lang.Object) wildcardClass28);
        boolean boolean30 = linkedListTestDriver18.equals_CUT((java.lang.Object) wildcardClass28);
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        boolean boolean33 = linkedListTestDriver31.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator34 = linkedListTestDriver31.iterator();
        linkedListTestDriver18.addFirst((java.lang.Object) iterator34);
        boolean boolean36 = linkedListTestDriver9.add((java.lang.Object) linkedListTestDriver18);
        experiment.util.Iterator iterator37 = linkedListTestDriver18.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) iterator37);
        experiment.util.LinkedListTestDriver linkedListTestDriver39 = new experiment.util.LinkedListTestDriver();
        boolean boolean41 = linkedListTestDriver39.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver39.addLast((java.lang.Object) 100);
        boolean boolean44 = linkedListTestDriver39.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver45 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver39.addFirst((java.lang.Object) linkedListTestDriver45);
        experiment.util.Iterator iterator47 = linkedListTestDriver39.iterator();
        java.lang.Object obj48 = linkedListTestDriver39.getLast();
        java.lang.Object obj49 = linkedListTestDriver39.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver50 = new experiment.util.LinkedListTestDriver();
        boolean boolean52 = linkedListTestDriver50.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver50.addLast((java.lang.Object) 100);
        boolean boolean55 = linkedListTestDriver50.isEmpty();
        linkedListTestDriver50.clear();
        linkedListTestDriver39.addFirst((java.lang.Object) linkedListTestDriver50);
        boolean boolean58 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver39);
        boolean boolean59 = linkedListTestDriver0.isEmpty();
        linkedListTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(iterator47);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 100 + "'", obj48, 100);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 100 + "'", obj49, 100);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test241");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.equals_CUT((java.lang.Object) 1L);
        experiment.util.Iterator iterator10 = linkedListTestDriver7.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        boolean boolean14 = linkedListTestDriver12.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        boolean boolean17 = linkedListTestDriver15.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver15.addLast((java.lang.Object) 100);
        boolean boolean20 = linkedListTestDriver15.isEmpty();
        java.lang.Class<?> wildcardClass21 = linkedListTestDriver15.getClass();
        linkedListTestDriver12.addLast((java.lang.Object) wildcardClass21);
        boolean boolean23 = linkedListTestDriver11.equals_CUT((java.lang.Object) wildcardClass21);
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        boolean boolean26 = linkedListTestDriver24.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator27 = linkedListTestDriver24.iterator();
        linkedListTestDriver11.addFirst((java.lang.Object) iterator27);
        boolean boolean29 = linkedListTestDriver7.equals_CUT((java.lang.Object) linkedListTestDriver11);
        java.lang.Object obj30 = linkedListTestDriver11.getLast();
        linkedListTestDriver0.addFirst(obj30);
        experiment.util.LinkedListTestDriver linkedListTestDriver33 = new experiment.util.LinkedListTestDriver();
        boolean boolean35 = linkedListTestDriver33.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver33.addLast((java.lang.Object) 100);
        boolean boolean38 = linkedListTestDriver33.isEmpty();
        linkedListTestDriver33.clear();
        int int40 = linkedListTestDriver33.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver41 = new experiment.util.LinkedListTestDriver();
        boolean boolean43 = linkedListTestDriver41.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver41.addLast((java.lang.Object) 100);
        boolean boolean46 = linkedListTestDriver41.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver47 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver41.addFirst((java.lang.Object) linkedListTestDriver47);
        java.lang.Object[] objArray49 = linkedListTestDriver41.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver50 = new experiment.util.LinkedListTestDriver();
        boolean boolean52 = linkedListTestDriver50.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver50.addLast((java.lang.Object) 100);
        boolean boolean55 = linkedListTestDriver50.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver56 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver50.addFirst((java.lang.Object) linkedListTestDriver56);
        experiment.util.Iterator iterator58 = linkedListTestDriver50.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver59 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver60 = new experiment.util.LinkedListTestDriver();
        boolean boolean62 = linkedListTestDriver60.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver63 = new experiment.util.LinkedListTestDriver();
        boolean boolean65 = linkedListTestDriver63.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver63.addLast((java.lang.Object) 100);
        boolean boolean68 = linkedListTestDriver63.isEmpty();
        java.lang.Class<?> wildcardClass69 = linkedListTestDriver63.getClass();
        linkedListTestDriver60.addLast((java.lang.Object) wildcardClass69);
        boolean boolean71 = linkedListTestDriver59.equals_CUT((java.lang.Object) wildcardClass69);
        experiment.util.LinkedListTestDriver linkedListTestDriver72 = new experiment.util.LinkedListTestDriver();
        boolean boolean74 = linkedListTestDriver72.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator75 = linkedListTestDriver72.iterator();
        linkedListTestDriver59.addFirst((java.lang.Object) iterator75);
        boolean boolean77 = linkedListTestDriver50.add((java.lang.Object) linkedListTestDriver59);
        experiment.util.Iterator iterator78 = linkedListTestDriver59.iterator();
        linkedListTestDriver41.addLast((java.lang.Object) iterator78);
        linkedListTestDriver41.addFirst((java.lang.Object) 100);
        java.lang.Object obj82 = linkedListTestDriver41.removeLast();
        boolean boolean83 = linkedListTestDriver33.remove(obj82);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) (byte) 10, obj82);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(iterator58);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(iterator75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(iterator78);
        org.junit.Assert.assertNotNull(obj82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test242");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        java.lang.Object obj6 = linkedListTestDriver0.getFirst();
        java.lang.Object[] objArray7 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addLast((java.lang.Object) 10.0d);
        boolean boolean11 = linkedListTestDriver0.add((java.lang.Object) ' ');
        java.lang.Object obj12 = linkedListTestDriver0.getFirst();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100 + "'", obj6, 100);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100 + "'", obj12, 100);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test243");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean4 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver9.addLast((java.lang.Object) 100);
        boolean boolean14 = linkedListTestDriver9.isEmpty();
        java.lang.Class<?> wildcardClass15 = linkedListTestDriver9.getClass();
        linkedListTestDriver6.addLast((java.lang.Object) wildcardClass15);
        boolean boolean17 = linkedListTestDriver5.equals_CUT((java.lang.Object) wildcardClass15);
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver18.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator21 = linkedListTestDriver18.iterator();
        linkedListTestDriver5.addFirst((java.lang.Object) iterator21);
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        boolean boolean26 = linkedListTestDriver24.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver24.addLast((java.lang.Object) 100);
        boolean boolean29 = linkedListTestDriver24.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver24.addFirst((java.lang.Object) linkedListTestDriver30);
        experiment.util.Iterator iterator32 = linkedListTestDriver24.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver33 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        boolean boolean36 = linkedListTestDriver34.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        boolean boolean39 = linkedListTestDriver37.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver37.addLast((java.lang.Object) 100);
        boolean boolean42 = linkedListTestDriver37.isEmpty();
        java.lang.Class<?> wildcardClass43 = linkedListTestDriver37.getClass();
        linkedListTestDriver34.addLast((java.lang.Object) wildcardClass43);
        boolean boolean45 = linkedListTestDriver33.equals_CUT((java.lang.Object) wildcardClass43);
        experiment.util.LinkedListTestDriver linkedListTestDriver46 = new experiment.util.LinkedListTestDriver();
        boolean boolean48 = linkedListTestDriver46.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator49 = linkedListTestDriver46.iterator();
        linkedListTestDriver33.addFirst((java.lang.Object) iterator49);
        boolean boolean51 = linkedListTestDriver24.add((java.lang.Object) linkedListTestDriver33);
        java.lang.Object obj52 = linkedListTestDriver33.getLast();
        java.lang.Object obj53 = linkedListTestDriver33.getFirst();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver33);
        linkedListTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(iterator49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertNotNull(obj53);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test244");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        java.lang.Object[] objArray3 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver4.addLast((java.lang.Object) 100);
        boolean boolean9 = linkedListTestDriver4.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.addFirst((java.lang.Object) linkedListTestDriver10);
        experiment.util.Iterator iterator12 = linkedListTestDriver4.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        boolean boolean16 = linkedListTestDriver14.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        boolean boolean19 = linkedListTestDriver17.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver17.addLast((java.lang.Object) 100);
        boolean boolean22 = linkedListTestDriver17.isEmpty();
        java.lang.Class<?> wildcardClass23 = linkedListTestDriver17.getClass();
        linkedListTestDriver14.addLast((java.lang.Object) wildcardClass23);
        boolean boolean25 = linkedListTestDriver13.equals_CUT((java.lang.Object) wildcardClass23);
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        boolean boolean28 = linkedListTestDriver26.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator29 = linkedListTestDriver26.iterator();
        linkedListTestDriver13.addFirst((java.lang.Object) iterator29);
        boolean boolean31 = linkedListTestDriver4.add((java.lang.Object) linkedListTestDriver13);
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver13);
        experiment.util.Iterator iterator33 = linkedListTestDriver13.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver35 = new experiment.util.LinkedListTestDriver();
        boolean boolean37 = linkedListTestDriver35.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver38 = new experiment.util.LinkedListTestDriver();
        boolean boolean40 = linkedListTestDriver38.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver38.addLast((java.lang.Object) 100);
        boolean boolean43 = linkedListTestDriver38.isEmpty();
        java.lang.Class<?> wildcardClass44 = linkedListTestDriver38.getClass();
        linkedListTestDriver35.addLast((java.lang.Object) wildcardClass44);
        int int46 = linkedListTestDriver35.size();
        java.lang.Object obj47 = linkedListTestDriver35.getLast();
        java.lang.Object obj48 = linkedListTestDriver35.removeLast();
        boolean boolean49 = linkedListTestDriver35.isEmpty();
        java.lang.Class<?> wildcardClass50 = linkedListTestDriver35.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj51 = linkedListTestDriver13.set((int) ' ', (java.lang.Object) wildcardClass50);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertEquals(obj47.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj47), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj47), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertEquals(obj48.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj48), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj48), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test245");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        int int5 = linkedListTestDriver0.size();
        int int6 = linkedListTestDriver0.size();
        boolean boolean8 = linkedListTestDriver0.add((java.lang.Object) (byte) -1);
        boolean boolean10 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        boolean boolean14 = linkedListTestDriver12.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        boolean boolean17 = linkedListTestDriver15.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver15.addLast((java.lang.Object) 100);
        boolean boolean20 = linkedListTestDriver15.isEmpty();
        java.lang.Class<?> wildcardClass21 = linkedListTestDriver15.getClass();
        linkedListTestDriver12.addLast((java.lang.Object) wildcardClass21);
        int int23 = linkedListTestDriver12.size();
        java.lang.Object obj24 = linkedListTestDriver12.getLast();
        java.lang.Object obj25 = linkedListTestDriver12.removeLast();
        boolean boolean26 = linkedListTestDriver12.isEmpty();
        int int27 = linkedListTestDriver12.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        boolean boolean30 = linkedListTestDriver28.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        boolean boolean33 = linkedListTestDriver31.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver31.addLast((java.lang.Object) 100);
        boolean boolean36 = linkedListTestDriver31.isEmpty();
        java.lang.Class<?> wildcardClass37 = linkedListTestDriver31.getClass();
        linkedListTestDriver28.addLast((java.lang.Object) wildcardClass37);
        boolean boolean39 = linkedListTestDriver12.add((java.lang.Object) wildcardClass37);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj40 = linkedListTestDriver0.set((int) (byte) 100, (java.lang.Object) wildcardClass37);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test246");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        java.lang.Object[] objArray3 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver4.addLast((java.lang.Object) 100);
        boolean boolean9 = linkedListTestDriver4.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.addFirst((java.lang.Object) linkedListTestDriver10);
        experiment.util.Iterator iterator12 = linkedListTestDriver4.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        boolean boolean16 = linkedListTestDriver14.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        boolean boolean19 = linkedListTestDriver17.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver17.addLast((java.lang.Object) 100);
        boolean boolean22 = linkedListTestDriver17.isEmpty();
        java.lang.Class<?> wildcardClass23 = linkedListTestDriver17.getClass();
        linkedListTestDriver14.addLast((java.lang.Object) wildcardClass23);
        boolean boolean25 = linkedListTestDriver13.equals_CUT((java.lang.Object) wildcardClass23);
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        boolean boolean28 = linkedListTestDriver26.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator29 = linkedListTestDriver26.iterator();
        linkedListTestDriver13.addFirst((java.lang.Object) iterator29);
        boolean boolean31 = linkedListTestDriver4.add((java.lang.Object) linkedListTestDriver13);
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver13);
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        boolean boolean36 = linkedListTestDriver34.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver34.addLast((java.lang.Object) 100);
        int int39 = linkedListTestDriver34.size();
        int int40 = linkedListTestDriver34.size();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) (byte) 100, (java.lang.Object) int40);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 100; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test247");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        boolean boolean10 = linkedListTestDriver8.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver8.addLast((java.lang.Object) 100);
        boolean boolean13 = linkedListTestDriver8.isEmpty();
        java.lang.Class<?> wildcardClass14 = linkedListTestDriver8.getClass();
        linkedListTestDriver5.addLast((java.lang.Object) wildcardClass14);
        boolean boolean16 = linkedListTestDriver4.equals_CUT((java.lang.Object) wildcardClass14);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        boolean boolean19 = linkedListTestDriver17.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator20 = linkedListTestDriver17.iterator();
        linkedListTestDriver4.addFirst((java.lang.Object) iterator20);
        boolean boolean22 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver4);
        java.lang.Object[] objArray23 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        boolean boolean26 = linkedListTestDriver24.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver24.addLast((java.lang.Object) 100);
        boolean boolean29 = linkedListTestDriver24.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        boolean boolean32 = linkedListTestDriver30.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver30.addLast((java.lang.Object) 100);
        boolean boolean35 = linkedListTestDriver30.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver36 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver30.addFirst((java.lang.Object) linkedListTestDriver36);
        experiment.util.Iterator iterator38 = linkedListTestDriver30.iterator();
        java.lang.Object obj39 = linkedListTestDriver30.getLast();
        java.lang.Object obj40 = linkedListTestDriver30.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver41 = new experiment.util.LinkedListTestDriver();
        boolean boolean43 = linkedListTestDriver41.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver41.addLast((java.lang.Object) 100);
        boolean boolean46 = linkedListTestDriver41.isEmpty();
        linkedListTestDriver41.clear();
        linkedListTestDriver30.addFirst((java.lang.Object) linkedListTestDriver41);
        experiment.util.ListIterator listIterator50 = linkedListTestDriver41.listIterator(0);
        linkedListTestDriver24.addFirst((java.lang.Object) 0);
        boolean boolean52 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver24);
        experiment.util.LinkedListTestDriver linkedListTestDriver53 = new experiment.util.LinkedListTestDriver();
        boolean boolean55 = linkedListTestDriver53.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator56 = linkedListTestDriver53.iterator();
        boolean boolean57 = linkedListTestDriver53.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver58 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver59 = new experiment.util.LinkedListTestDriver();
        boolean boolean61 = linkedListTestDriver59.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver62 = new experiment.util.LinkedListTestDriver();
        boolean boolean64 = linkedListTestDriver62.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver62.addLast((java.lang.Object) 100);
        boolean boolean67 = linkedListTestDriver62.isEmpty();
        java.lang.Class<?> wildcardClass68 = linkedListTestDriver62.getClass();
        linkedListTestDriver59.addLast((java.lang.Object) wildcardClass68);
        boolean boolean70 = linkedListTestDriver58.equals_CUT((java.lang.Object) wildcardClass68);
        experiment.util.LinkedListTestDriver linkedListTestDriver71 = new experiment.util.LinkedListTestDriver();
        boolean boolean73 = linkedListTestDriver71.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator74 = linkedListTestDriver71.iterator();
        linkedListTestDriver58.addFirst((java.lang.Object) iterator74);
        linkedListTestDriver53.addLast((java.lang.Object) linkedListTestDriver58);
        java.lang.Object obj77 = linkedListTestDriver53.removeFirst();
        boolean boolean78 = linkedListTestDriver0.remove(obj77);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 100 + "'", obj39, 100);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 100 + "'", obj40, 100);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(listIterator50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(iterator56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(iterator74);
        org.junit.Assert.assertNotNull(obj77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test248");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        boolean boolean10 = linkedListTestDriver8.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver8.addLast((java.lang.Object) 100);
        boolean boolean13 = linkedListTestDriver8.isEmpty();
        java.lang.Class<?> wildcardClass14 = linkedListTestDriver8.getClass();
        linkedListTestDriver5.addLast((java.lang.Object) wildcardClass14);
        boolean boolean16 = linkedListTestDriver4.equals_CUT((java.lang.Object) wildcardClass14);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        boolean boolean19 = linkedListTestDriver17.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator20 = linkedListTestDriver17.iterator();
        linkedListTestDriver4.addFirst((java.lang.Object) iterator20);
        boolean boolean22 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver4);
        java.lang.Object[] objArray23 = linkedListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = linkedListTestDriver0.get((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test249");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        boolean boolean3 = linkedListTestDriver1.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver4.addLast((java.lang.Object) 100);
        boolean boolean9 = linkedListTestDriver4.isEmpty();
        java.lang.Class<?> wildcardClass10 = linkedListTestDriver4.getClass();
        linkedListTestDriver1.addLast((java.lang.Object) wildcardClass10);
        boolean boolean12 = linkedListTestDriver0.equals_CUT((java.lang.Object) wildcardClass10);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.equals_CUT((java.lang.Object) 1L);
        experiment.util.Iterator iterator16 = linkedListTestDriver13.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver18.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        boolean boolean23 = linkedListTestDriver21.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver21.addLast((java.lang.Object) 100);
        boolean boolean26 = linkedListTestDriver21.isEmpty();
        java.lang.Class<?> wildcardClass27 = linkedListTestDriver21.getClass();
        linkedListTestDriver18.addLast((java.lang.Object) wildcardClass27);
        boolean boolean29 = linkedListTestDriver17.equals_CUT((java.lang.Object) wildcardClass27);
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        boolean boolean32 = linkedListTestDriver30.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator33 = linkedListTestDriver30.iterator();
        linkedListTestDriver17.addFirst((java.lang.Object) iterator33);
        boolean boolean35 = linkedListTestDriver13.equals_CUT((java.lang.Object) linkedListTestDriver17);
        java.lang.Object obj36 = linkedListTestDriver17.getLast();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver17);
        java.lang.Object obj38 = linkedListTestDriver0.getLast();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(obj38);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test250");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        java.lang.Object[] objArray8 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver9.addLast((java.lang.Object) 100);
        boolean boolean14 = linkedListTestDriver9.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver9.addFirst((java.lang.Object) linkedListTestDriver15);
        experiment.util.Iterator iterator17 = linkedListTestDriver9.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        boolean boolean21 = linkedListTestDriver19.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        boolean boolean24 = linkedListTestDriver22.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver22.addLast((java.lang.Object) 100);
        boolean boolean27 = linkedListTestDriver22.isEmpty();
        java.lang.Class<?> wildcardClass28 = linkedListTestDriver22.getClass();
        linkedListTestDriver19.addLast((java.lang.Object) wildcardClass28);
        boolean boolean30 = linkedListTestDriver18.equals_CUT((java.lang.Object) wildcardClass28);
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        boolean boolean33 = linkedListTestDriver31.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator34 = linkedListTestDriver31.iterator();
        linkedListTestDriver18.addFirst((java.lang.Object) iterator34);
        boolean boolean36 = linkedListTestDriver9.add((java.lang.Object) linkedListTestDriver18);
        experiment.util.Iterator iterator37 = linkedListTestDriver18.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) iterator37);
        experiment.util.LinkedListTestDriver linkedListTestDriver39 = new experiment.util.LinkedListTestDriver();
        boolean boolean41 = linkedListTestDriver39.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver39.addLast((java.lang.Object) 100);
        boolean boolean44 = linkedListTestDriver39.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver45 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver39.addFirst((java.lang.Object) linkedListTestDriver45);
        experiment.util.Iterator iterator47 = linkedListTestDriver39.iterator();
        java.lang.Object obj48 = linkedListTestDriver39.getLast();
        java.lang.Object obj49 = linkedListTestDriver39.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver50 = new experiment.util.LinkedListTestDriver();
        boolean boolean52 = linkedListTestDriver50.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver50.addLast((java.lang.Object) 100);
        boolean boolean55 = linkedListTestDriver50.isEmpty();
        linkedListTestDriver50.clear();
        linkedListTestDriver39.addFirst((java.lang.Object) linkedListTestDriver50);
        boolean boolean58 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver39);
        boolean boolean59 = linkedListTestDriver0.isEmpty();
        java.lang.Object obj60 = linkedListTestDriver0.getFirst();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(iterator47);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 100 + "'", obj48, 100);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 100 + "'", obj49, 100);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(obj60);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test251");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        int int5 = linkedListTestDriver0.size();
        java.lang.Object[] objArray6 = linkedListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator8 = linkedListTestDriver0.listIterator((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 35; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100]");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test252");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        int int5 = linkedListTestDriver0.size();
        boolean boolean7 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.clear();
        linkedListTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test253");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        boolean boolean5 = linkedListTestDriver3.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver3.addLast((java.lang.Object) 100);
        boolean boolean8 = linkedListTestDriver3.isEmpty();
        java.lang.Class<?> wildcardClass9 = linkedListTestDriver3.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) wildcardClass9);
        int int11 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        boolean boolean14 = linkedListTestDriver12.equals_CUT((java.lang.Object) 1L);
        experiment.util.Iterator iterator15 = linkedListTestDriver12.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        boolean boolean19 = linkedListTestDriver17.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        boolean boolean22 = linkedListTestDriver20.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver20.addLast((java.lang.Object) 100);
        boolean boolean25 = linkedListTestDriver20.isEmpty();
        java.lang.Class<?> wildcardClass26 = linkedListTestDriver20.getClass();
        linkedListTestDriver17.addLast((java.lang.Object) wildcardClass26);
        boolean boolean28 = linkedListTestDriver16.equals_CUT((java.lang.Object) wildcardClass26);
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        boolean boolean31 = linkedListTestDriver29.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator32 = linkedListTestDriver29.iterator();
        linkedListTestDriver16.addFirst((java.lang.Object) iterator32);
        boolean boolean34 = linkedListTestDriver12.equals_CUT((java.lang.Object) linkedListTestDriver16);
        java.lang.Object obj35 = linkedListTestDriver16.getLast();
        boolean boolean36 = linkedListTestDriver0.contains(obj35);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test254");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        boolean boolean4 = linkedListTestDriver0.contains((java.lang.Object) true);
        java.lang.Object[] objArray5 = linkedListTestDriver0.toArray();
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver7.addLast((java.lang.Object) 100);
        boolean boolean12 = linkedListTestDriver7.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.addFirst((java.lang.Object) linkedListTestDriver13);
        experiment.util.Iterator iterator15 = linkedListTestDriver7.iterator();
        java.lang.Object obj16 = linkedListTestDriver7.getLast();
        java.lang.Object obj17 = linkedListTestDriver7.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver18.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver18.addLast((java.lang.Object) 100);
        boolean boolean23 = linkedListTestDriver18.isEmpty();
        linkedListTestDriver18.clear();
        linkedListTestDriver7.addFirst((java.lang.Object) linkedListTestDriver18);
        experiment.util.ListIterator listIterator27 = linkedListTestDriver18.listIterator(0);
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        boolean boolean30 = linkedListTestDriver28.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        boolean boolean33 = linkedListTestDriver31.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver31.addLast((java.lang.Object) 100);
        boolean boolean36 = linkedListTestDriver31.isEmpty();
        java.lang.Class<?> wildcardClass37 = linkedListTestDriver31.getClass();
        linkedListTestDriver28.addLast((java.lang.Object) wildcardClass37);
        int int39 = linkedListTestDriver28.size();
        java.lang.Object obj40 = linkedListTestDriver28.getLast();
        java.lang.Object obj41 = linkedListTestDriver28.removeFirst();
        boolean boolean42 = linkedListTestDriver28.isEmpty();
        linkedListTestDriver18.addFirst((java.lang.Object) boolean42);
        boolean boolean44 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver18);
        java.lang.Object obj46 = linkedListTestDriver18.remove(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100 + "'", obj16, 100);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 100 + "'", obj17, 100);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(listIterator27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertEquals(obj40.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj40), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj40), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertEquals(obj41.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj41), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj41), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + true + "'", obj46, true);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test255");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver0.addLast((java.lang.Object) 100);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        boolean boolean12 = linkedListTestDriver10.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver13.addLast((java.lang.Object) 100);
        boolean boolean18 = linkedListTestDriver13.isEmpty();
        java.lang.Class<?> wildcardClass19 = linkedListTestDriver13.getClass();
        linkedListTestDriver10.addLast((java.lang.Object) wildcardClass19);
        boolean boolean21 = linkedListTestDriver9.equals_CUT((java.lang.Object) wildcardClass19);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        boolean boolean24 = linkedListTestDriver22.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator25 = linkedListTestDriver22.iterator();
        linkedListTestDriver9.addFirst((java.lang.Object) iterator25);
        boolean boolean27 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver9);
        experiment.util.Iterator iterator28 = linkedListTestDriver9.iterator();
        java.lang.Object obj29 = linkedListTestDriver9.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        boolean boolean32 = linkedListTestDriver30.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator33 = linkedListTestDriver30.iterator();
        boolean boolean34 = linkedListTestDriver30.isEmpty();
        experiment.util.Iterator iterator35 = linkedListTestDriver30.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver36 = new experiment.util.LinkedListTestDriver();
        boolean boolean38 = linkedListTestDriver36.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver36.addLast((java.lang.Object) 100);
        boolean boolean41 = linkedListTestDriver36.isEmpty();
        int int42 = linkedListTestDriver36.size();
        linkedListTestDriver30.addFirst((java.lang.Object) int42);
        boolean boolean44 = linkedListTestDriver9.equals_CUT((java.lang.Object) int42);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1082618794_1024_0.test256");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        boolean boolean3 = linkedListTestDriver1.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver4.addLast((java.lang.Object) 100);
        boolean boolean9 = linkedListTestDriver4.isEmpty();
        java.lang.Class<?> wildcardClass10 = linkedListTestDriver4.getClass();
        linkedListTestDriver1.addLast((java.lang.Object) wildcardClass10);
        boolean boolean12 = linkedListTestDriver0.equals_CUT((java.lang.Object) wildcardClass10);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.equals_CUT((java.lang.Object) 1L);
        experiment.util.Iterator iterator16 = linkedListTestDriver13.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver18.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        boolean boolean23 = linkedListTestDriver21.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver21.addLast((java.lang.Object) 100);
        boolean boolean26 = linkedListTestDriver21.isEmpty();
        java.lang.Class<?> wildcardClass27 = linkedListTestDriver21.getClass();
        linkedListTestDriver18.addLast((java.lang.Object) wildcardClass27);
        boolean boolean29 = linkedListTestDriver17.equals_CUT((java.lang.Object) wildcardClass27);
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        boolean boolean32 = linkedListTestDriver30.remove((java.lang.Object) '#');
        experiment.util.Iterator iterator33 = linkedListTestDriver30.iterator();
        linkedListTestDriver17.addFirst((java.lang.Object) iterator33);
        boolean boolean35 = linkedListTestDriver13.equals_CUT((java.lang.Object) linkedListTestDriver17);
        java.lang.Object obj36 = linkedListTestDriver17.getLast();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver17);
        java.lang.Object obj38 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver40 = new experiment.util.LinkedListTestDriver();
        boolean boolean42 = linkedListTestDriver40.equals_CUT((java.lang.Object) 1L);
        boolean boolean44 = linkedListTestDriver40.contains((java.lang.Object) true);
        java.lang.Object[] objArray45 = linkedListTestDriver40.toArray();
        experiment.util.Iterator iterator46 = linkedListTestDriver40.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver47 = new experiment.util.LinkedListTestDriver();
        boolean boolean49 = linkedListTestDriver47.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver50 = new experiment.util.LinkedListTestDriver();
        boolean boolean52 = linkedListTestDriver50.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver50.addLast((java.lang.Object) 100);
        boolean boolean55 = linkedListTestDriver50.isEmpty();
        java.lang.Class<?> wildcardClass56 = linkedListTestDriver50.getClass();
        linkedListTestDriver47.addLast((java.lang.Object) wildcardClass56);
        int int58 = linkedListTestDriver47.size();
        java.lang.Object obj59 = linkedListTestDriver47.getLast();
        java.lang.Object obj60 = linkedListTestDriver47.removeLast();
        boolean boolean61 = linkedListTestDriver47.isEmpty();
        linkedListTestDriver47.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver63 = new experiment.util.LinkedListTestDriver();
        boolean boolean65 = linkedListTestDriver63.remove((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver66 = new experiment.util.LinkedListTestDriver();
        boolean boolean68 = linkedListTestDriver66.equals_CUT((java.lang.Object) 1L);
        linkedListTestDriver66.addLast((java.lang.Object) 100);
        boolean boolean71 = linkedListTestDriver66.isEmpty();
        java.lang.Class<?> wildcardClass72 = linkedListTestDriver66.getClass();
        linkedListTestDriver63.addLast((java.lang.Object) wildcardClass72);
        boolean boolean75 = linkedListTestDriver63.equals_CUT((java.lang.Object) (short) 1);
        java.lang.Object obj76 = linkedListTestDriver63.removeFirst();
        linkedListTestDriver47.addLast(obj76);
        linkedListTestDriver40.addFirst(obj76);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj79 = linkedListTestDriver0.set((int) (byte) 1, (java.lang.Object) linkedListTestDriver40);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[]");
        org.junit.Assert.assertNotNull(iterator46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertEquals(obj59.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj59), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj59), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertEquals(obj60.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj60), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj60), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(obj76);
        org.junit.Assert.assertEquals(obj76.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj76), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj76), "class experiment.util.LinkedListTestDriver");
    }

}
