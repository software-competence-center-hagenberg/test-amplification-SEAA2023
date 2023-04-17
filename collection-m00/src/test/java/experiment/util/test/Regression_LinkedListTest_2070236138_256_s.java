package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_LinkedListTest_2070236138_256_s {

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
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test001");
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
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test002");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = linkedListTestDriver0.getLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test003");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
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
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test004");
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
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test005");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = linkedListTestDriver0.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test006");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add(100, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test007");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = linkedListTestDriver0.get((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test008");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        boolean boolean10 = linkedListTestDriver8.remove((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass11 = linkedListTestDriver8.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = linkedListTestDriver0.set((int) (byte) 10, (java.lang.Object) linkedListTestDriver8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test009");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = linkedListTestDriver0.set((int) (byte) -1, (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test010");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
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
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test011");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        linkedListTestDriver0.clear();
        java.lang.Object[] objArray4 = linkedListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = linkedListTestDriver0.get((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test012");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        boolean boolean4 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) 'a', (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 97; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test013");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        java.lang.Object obj5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = linkedListTestDriver0.equals_CUT(obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test014");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = linkedListTestDriver0.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test015");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        boolean boolean8 = linkedListTestDriver0.isEmpty();
        java.lang.Object obj9 = linkedListTestDriver0.removeLast();
        experiment.util.Iterator iterator10 = linkedListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) 100 + "'", obj9, (short) 100);
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test016");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) 100L);
        java.lang.Object obj10 = linkedListTestDriver0.removeLast();
        experiment.util.ListIterator listIterator12 = linkedListTestDriver0.listIterator((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = linkedListTestDriver0.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100L + "'", obj10, 100L);
        org.junit.Assert.assertNotNull(listIterator12);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test017");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        linkedListTestDriver0.addFirst((java.lang.Object) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = linkedListTestDriver0.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test018");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        java.lang.Object obj7 = linkedListTestDriver0.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.add((java.lang.Object) 10L);
        int int12 = linkedListTestDriver9.size();
        linkedListTestDriver9.clear();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) (byte) 100, (java.lang.Object) linkedListTestDriver9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 100; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) 100 + "'", obj7, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test019");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) 100L);
        java.lang.Object obj10 = linkedListTestDriver0.removeLast();
        experiment.util.ListIterator listIterator12 = linkedListTestDriver0.listIterator((int) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.add((java.lang.Object) 10L);
        linkedListTestDriver0.addLast((java.lang.Object) boolean15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = linkedListTestDriver0.get((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100L + "'", obj10, 100L);
        org.junit.Assert.assertNotNull(listIterator12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test020");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        boolean boolean9 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = linkedListTestDriver0.getLast();
        java.lang.Object obj11 = linkedListTestDriver0.getLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = linkedListTestDriver0.set((int) (short) 1, (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (short) 100 + "'", obj10, (short) 100);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) 100 + "'", obj11, (short) 100);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test021");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) 100L);
        java.lang.Object obj10 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        boolean boolean14 = linkedListTestDriver12.remove((java.lang.Object) 0.0f);
        boolean boolean16 = linkedListTestDriver12.remove((java.lang.Object) (short) 1);
        linkedListTestDriver12.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator19 = linkedListTestDriver12.iterator();
        boolean boolean21 = linkedListTestDriver12.equals_CUT((java.lang.Object) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add(10, (java.lang.Object) linkedListTestDriver12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100L + "'", obj10, 100L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test022");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        boolean boolean8 = linkedListTestDriver0.isEmpty();
        java.lang.Object obj9 = linkedListTestDriver0.removeLast();
        experiment.util.Iterator iterator10 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray11 = linkedListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) 100 + "'", obj9, (short) 100);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test023");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) 100L);
        java.lang.Object obj10 = linkedListTestDriver0.getLast();
        java.lang.Object obj11 = null;
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.addFirst(obj11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100L + "'", obj10, 100L);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test024");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        java.lang.Object[] objArray5 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.add((java.lang.Object) 10L);
        linkedListTestDriver6.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray11 = linkedListTestDriver6.toArray();
        boolean boolean12 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver6);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver6.add((int) '4', (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 52; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[100, 10]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test025");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        java.lang.Object obj8 = linkedListTestDriver0.getLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = linkedListTestDriver0.get((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 100 + "'", obj8, (short) 100);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test026");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) 100L);
        java.lang.Object obj10 = linkedListTestDriver0.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver11.remove((java.lang.Object) 0.0f);
        boolean boolean15 = linkedListTestDriver11.remove((java.lang.Object) (short) 1);
        linkedListTestDriver11.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator18 = linkedListTestDriver11.iterator();
        boolean boolean20 = linkedListTestDriver11.equals_CUT((java.lang.Object) (byte) 1);
        java.lang.Object obj21 = linkedListTestDriver11.getLast();
        java.lang.Object obj22 = linkedListTestDriver11.getLast();
        boolean boolean23 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = linkedListTestDriver0.remove((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100L + "'", obj10, 100L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (short) 100 + "'", obj21, (short) 100);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (short) 100 + "'", obj22, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test027");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        boolean boolean8 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator10 = linkedListTestDriver0.listIterator((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 35; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test028");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        java.lang.Object[] objArray5 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.add((java.lang.Object) 10L);
        linkedListTestDriver6.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray11 = linkedListTestDriver6.toArray();
        boolean boolean12 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver6);
        boolean boolean14 = linkedListTestDriver6.add((java.lang.Object) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator16 = linkedListTestDriver6.listIterator((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[100, 10]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test029");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) 10L);
        int int8 = linkedListTestDriver5.size();
        linkedListTestDriver5.clear();
        linkedListTestDriver5.addFirst((java.lang.Object) (short) 10);
        boolean boolean12 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver5);
        java.lang.Object[] objArray13 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        boolean boolean17 = linkedListTestDriver15.remove((java.lang.Object) 0.0f);
        boolean boolean19 = linkedListTestDriver15.remove((java.lang.Object) (short) 1);
        linkedListTestDriver15.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator22 = linkedListTestDriver15.iterator();
        java.lang.Object obj23 = linkedListTestDriver15.getLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = linkedListTestDriver0.set((int) (byte) 10, obj23);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) 100 + "'", obj23, (short) 100);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test030");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) 10L);
        linkedListTestDriver5.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray10 = linkedListTestDriver5.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.remove((java.lang.Object) 0.0f);
        boolean boolean17 = linkedListTestDriver13.remove((java.lang.Object) (short) 1);
        linkedListTestDriver13.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator20 = linkedListTestDriver13.iterator();
        boolean boolean21 = linkedListTestDriver13.isEmpty();
        java.lang.Object obj22 = linkedListTestDriver13.removeLast();
        experiment.util.Iterator iterator23 = linkedListTestDriver13.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        boolean boolean26 = linkedListTestDriver24.remove((java.lang.Object) 0.0f);
        boolean boolean28 = linkedListTestDriver24.remove((java.lang.Object) (short) 1);
        linkedListTestDriver24.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator31 = linkedListTestDriver24.iterator();
        linkedListTestDriver13.addLast((java.lang.Object) iterator31);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) (short) 100, (java.lang.Object) iterator31);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 100; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[100, 10]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (short) 100 + "'", obj22, (short) 100);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(iterator31);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test031");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        linkedListTestDriver0.clear();
        java.lang.Object[] objArray4 = linkedListTestDriver0.toArray();
        experiment.util.ListIterator listIterator6 = linkedListTestDriver0.listIterator(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = linkedListTestDriver0.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(listIterator6);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test032");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) 100L);
        java.lang.Object obj10 = linkedListTestDriver0.getLast();
        java.lang.Object obj11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = linkedListTestDriver0.remove(obj11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100L + "'", obj10, 100L);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test033");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        linkedListTestDriver0.clear();
        java.lang.Object[] objArray4 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.remove((java.lang.Object) 0.0f);
        linkedListTestDriver5.clear();
        java.lang.Object[] objArray9 = linkedListTestDriver5.toArray();
        boolean boolean10 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = linkedListTestDriver5.getLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test034");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        boolean boolean8 = linkedListTestDriver0.isEmpty();
        java.lang.Object obj9 = linkedListTestDriver0.removeLast();
        experiment.util.Iterator iterator10 = linkedListTestDriver0.iterator();
        boolean boolean11 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) 100 + "'", obj9, (short) 100);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test035");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) 100L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = linkedListTestDriver0.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test036");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) 10L);
        linkedListTestDriver5.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray10 = linkedListTestDriver5.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        boolean boolean14 = linkedListTestDriver12.remove((java.lang.Object) 0.0f);
        linkedListTestDriver12.clear();
        linkedListTestDriver12.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        boolean boolean19 = linkedListTestDriver17.add((java.lang.Object) 10L);
        linkedListTestDriver17.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray22 = linkedListTestDriver17.toArray();
        linkedListTestDriver12.addFirst((java.lang.Object) linkedListTestDriver17);
        java.lang.Object obj24 = linkedListTestDriver12.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        boolean boolean27 = linkedListTestDriver25.remove((java.lang.Object) 0.0f);
        boolean boolean29 = linkedListTestDriver25.remove((java.lang.Object) (short) 1);
        linkedListTestDriver25.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator32 = linkedListTestDriver25.iterator();
        linkedListTestDriver25.addLast((java.lang.Object) 100L);
        java.lang.Object obj35 = linkedListTestDriver25.removeLast();
        experiment.util.ListIterator listIterator37 = linkedListTestDriver25.listIterator((int) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver38 = new experiment.util.LinkedListTestDriver();
        boolean boolean40 = linkedListTestDriver38.add((java.lang.Object) 10L);
        linkedListTestDriver25.addLast((java.lang.Object) boolean40);
        boolean boolean42 = linkedListTestDriver12.add((java.lang.Object) boolean40);
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj45 = linkedListTestDriver12.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[100, 10]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[100, 10]");
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 100L + "'", obj35, 100L);
        org.junit.Assert.assertNotNull(listIterator37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test037");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) 100L);
        java.lang.Object obj10 = linkedListTestDriver0.removeLast();
        java.lang.Object[] objArray11 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.remove((java.lang.Object) 0.0f);
        linkedListTestDriver13.clear();
        java.lang.Object[] objArray17 = linkedListTestDriver13.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver18.remove((java.lang.Object) 0.0f);
        linkedListTestDriver18.clear();
        java.lang.Object[] objArray22 = linkedListTestDriver18.toArray();
        boolean boolean23 = linkedListTestDriver13.equals_CUT((java.lang.Object) linkedListTestDriver18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = linkedListTestDriver0.set((int) (byte) 10, (java.lang.Object) linkedListTestDriver18);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100L + "'", obj10, 100L);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test038");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        linkedListTestDriver0.clear();
        java.lang.Object[] objArray4 = linkedListTestDriver0.toArray();
        experiment.util.ListIterator listIterator6 = linkedListTestDriver0.listIterator(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = linkedListTestDriver0.getLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(listIterator6);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test039");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        boolean boolean9 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver11.remove((java.lang.Object) 0.0f);
        linkedListTestDriver11.clear();
        linkedListTestDriver11.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        boolean boolean18 = linkedListTestDriver16.add((java.lang.Object) 10L);
        linkedListTestDriver16.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray21 = linkedListTestDriver16.toArray();
        linkedListTestDriver11.addFirst((java.lang.Object) linkedListTestDriver16);
        java.lang.Object obj23 = linkedListTestDriver11.getLast();
        boolean boolean24 = linkedListTestDriver0.remove(obj23);
        boolean boolean25 = linkedListTestDriver0.isEmpty();
        linkedListTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (short) 100 + "'", obj10, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[100, 10]");
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test040");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        boolean boolean9 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = linkedListTestDriver0.getLast();
        boolean boolean11 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.remove((java.lang.Object) 0.0f);
        linkedListTestDriver13.clear();
        linkedListTestDriver13.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver18.add((java.lang.Object) 10L);
        linkedListTestDriver18.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray23 = linkedListTestDriver18.toArray();
        linkedListTestDriver13.addFirst((java.lang.Object) linkedListTestDriver18);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        boolean boolean27 = linkedListTestDriver25.remove((java.lang.Object) 0.0f);
        linkedListTestDriver25.clear();
        linkedListTestDriver25.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        boolean boolean32 = linkedListTestDriver30.add((java.lang.Object) 10L);
        linkedListTestDriver30.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray35 = linkedListTestDriver30.toArray();
        linkedListTestDriver25.addFirst((java.lang.Object) linkedListTestDriver30);
        java.lang.Object obj37 = linkedListTestDriver25.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver38 = new experiment.util.LinkedListTestDriver();
        boolean boolean40 = linkedListTestDriver38.remove((java.lang.Object) 0.0f);
        boolean boolean42 = linkedListTestDriver38.remove((java.lang.Object) (short) 1);
        linkedListTestDriver38.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator45 = linkedListTestDriver38.iterator();
        linkedListTestDriver38.addLast((java.lang.Object) 100L);
        java.lang.Object obj48 = linkedListTestDriver38.removeLast();
        experiment.util.ListIterator listIterator50 = linkedListTestDriver38.listIterator((int) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver51 = new experiment.util.LinkedListTestDriver();
        boolean boolean53 = linkedListTestDriver51.add((java.lang.Object) 10L);
        linkedListTestDriver38.addLast((java.lang.Object) boolean53);
        boolean boolean55 = linkedListTestDriver25.add((java.lang.Object) boolean53);
        linkedListTestDriver13.addFirst((java.lang.Object) linkedListTestDriver25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj57 = linkedListTestDriver0.set((int) (short) 100, (java.lang.Object) linkedListTestDriver25);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (short) 100 + "'", obj10, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[100, 10]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[100, 10]");
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(iterator45);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 100L + "'", obj48, 100L);
        org.junit.Assert.assertNotNull(listIterator50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test041");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        boolean boolean9 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = linkedListTestDriver0.getLast();
        boolean boolean11 = linkedListTestDriver0.isEmpty();
        linkedListTestDriver0.addFirst((java.lang.Object) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (short) 100 + "'", obj10, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test042");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.remove((java.lang.Object) 0.0f);
        linkedListTestDriver5.clear();
        java.lang.Object[] objArray9 = linkedListTestDriver5.toArray();
        experiment.util.ListIterator listIterator11 = linkedListTestDriver5.listIterator(0);
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        boolean boolean14 = linkedListTestDriver12.remove((java.lang.Object) 0.0f);
        boolean boolean16 = linkedListTestDriver12.remove((java.lang.Object) (short) 1);
        linkedListTestDriver12.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator19 = linkedListTestDriver12.iterator();
        boolean boolean21 = linkedListTestDriver12.equals_CUT((java.lang.Object) (byte) 1);
        java.lang.Object obj22 = linkedListTestDriver12.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        boolean boolean25 = linkedListTestDriver23.remove((java.lang.Object) 0.0f);
        linkedListTestDriver23.clear();
        linkedListTestDriver23.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        boolean boolean30 = linkedListTestDriver28.add((java.lang.Object) 10L);
        linkedListTestDriver28.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray33 = linkedListTestDriver28.toArray();
        linkedListTestDriver23.addFirst((java.lang.Object) linkedListTestDriver28);
        java.lang.Object obj35 = linkedListTestDriver23.getLast();
        boolean boolean36 = linkedListTestDriver12.remove(obj35);
        linkedListTestDriver5.addFirst(obj35);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) ' ', (java.lang.Object) linkedListTestDriver5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 32; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(listIterator11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (short) 100 + "'", obj22, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[100, 10]");
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test043");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        java.lang.Object[] objArray5 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = linkedListTestDriver0.get((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test044");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        boolean boolean4 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator6 = linkedListTestDriver0.listIterator((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 32; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test045");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
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
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test046");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        java.lang.Object obj7 = linkedListTestDriver0.removeFirst();
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) 100 + "'", obj7, (short) 100);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test047");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        int int5 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.remove((java.lang.Object) 0.0f);
        boolean boolean11 = linkedListTestDriver7.remove((java.lang.Object) (short) 1);
        linkedListTestDriver7.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator14 = linkedListTestDriver7.iterator();
        linkedListTestDriver7.addLast((java.lang.Object) 100L);
        java.lang.Object obj17 = linkedListTestDriver7.removeLast();
        experiment.util.ListIterator listIterator19 = linkedListTestDriver7.listIterator((int) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        boolean boolean22 = linkedListTestDriver20.add((java.lang.Object) 10L);
        linkedListTestDriver7.addLast((java.lang.Object) boolean22);
        java.lang.Object obj26 = linkedListTestDriver7.set(1, (java.lang.Object) (-1));
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) 'a', (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 97; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 100L + "'", obj17, 100L);
        org.junit.Assert.assertNotNull(listIterator19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + true + "'", obj26, true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test048");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) 10L);
        int int8 = linkedListTestDriver5.size();
        linkedListTestDriver5.clear();
        linkedListTestDriver5.addFirst((java.lang.Object) (short) 10);
        boolean boolean12 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver5);
        java.lang.Class<?> wildcardClass13 = linkedListTestDriver5.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test049");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        java.lang.Object obj7 = linkedListTestDriver0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) 100 + "'", obj7, (short) 100);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test050");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.remove((java.lang.Object) 0.0f);
        linkedListTestDriver5.clear();
        java.lang.Object[] objArray9 = linkedListTestDriver5.toArray();
        boolean boolean10 = linkedListTestDriver0.contains((java.lang.Object) objArray9);
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver11.add((java.lang.Object) 10L);
        int int14 = linkedListTestDriver11.size();
        linkedListTestDriver11.clear();
        linkedListTestDriver11.addFirst((java.lang.Object) (short) 10);
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver11);
        experiment.util.ListIterator listIterator20 = linkedListTestDriver11.listIterator((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(listIterator20);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test051");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        linkedListTestDriver0.clear();
        java.lang.Object[] objArray4 = linkedListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test052");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        java.lang.Object obj7 = linkedListTestDriver0.removeFirst();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        boolean boolean12 = linkedListTestDriver10.remove((java.lang.Object) 0.0f);
        boolean boolean14 = linkedListTestDriver10.remove((java.lang.Object) (short) 1);
        linkedListTestDriver10.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator17 = linkedListTestDriver10.iterator();
        linkedListTestDriver10.addLast((java.lang.Object) 100L);
        java.lang.Object obj20 = linkedListTestDriver10.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = linkedListTestDriver0.set(3, (java.lang.Object) linkedListTestDriver10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) 100 + "'", obj7, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100L + "'", obj20, 100L);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test053");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        boolean boolean9 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver11.remove((java.lang.Object) 0.0f);
        boolean boolean15 = linkedListTestDriver11.remove((java.lang.Object) (short) 1);
        linkedListTestDriver11.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator18 = linkedListTestDriver11.iterator();
        linkedListTestDriver11.addLast((java.lang.Object) 100L);
        java.lang.Object obj21 = linkedListTestDriver11.getLast();
        boolean boolean22 = linkedListTestDriver0.contains(obj21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = linkedListTestDriver0.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (short) 100 + "'", obj10, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100L + "'", obj21, 100L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test054");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        java.lang.Object[] objArray5 = linkedListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = linkedListTestDriver0.getLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test055");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        boolean boolean4 = linkedListTestDriver0.isEmpty();
        boolean boolean6 = linkedListTestDriver0.contains((java.lang.Object) (byte) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        java.lang.Object obj9 = linkedListTestDriver0.remove((int) (short) 0);
        java.lang.Object[] objArray10 = linkedListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = linkedListTestDriver0.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 10L + "'", obj9, 10L);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test056");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.Iterator iterator2 = linkedListTestDriver0.iterator();
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = linkedListTestDriver0.get((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test057");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        java.lang.Object obj8 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        boolean boolean12 = linkedListTestDriver10.add((java.lang.Object) 10L);
        int int13 = linkedListTestDriver10.size();
        linkedListTestDriver10.clear();
        java.lang.Object[] objArray15 = linkedListTestDriver10.toArray();
        linkedListTestDriver10.addLast((java.lang.Object) 1.0d);
        experiment.util.ListIterator listIterator19 = linkedListTestDriver10.listIterator(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = linkedListTestDriver0.set((int) (byte) -1, (java.lang.Object) linkedListTestDriver10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 100 + "'", obj8, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(listIterator19);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test058");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        java.lang.Object obj4 = linkedListTestDriver0.getFirst();
        int int5 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.remove((java.lang.Object) 0.0f);
        linkedListTestDriver7.clear();
        linkedListTestDriver7.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        boolean boolean14 = linkedListTestDriver12.add((java.lang.Object) 10L);
        linkedListTestDriver12.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray17 = linkedListTestDriver12.toArray();
        linkedListTestDriver7.addFirst((java.lang.Object) linkedListTestDriver12);
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        boolean boolean21 = linkedListTestDriver19.remove((java.lang.Object) 0.0f);
        linkedListTestDriver19.clear();
        linkedListTestDriver19.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        boolean boolean26 = linkedListTestDriver24.add((java.lang.Object) 10L);
        linkedListTestDriver24.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray29 = linkedListTestDriver24.toArray();
        linkedListTestDriver19.addFirst((java.lang.Object) linkedListTestDriver24);
        java.lang.Object obj31 = linkedListTestDriver19.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        boolean boolean34 = linkedListTestDriver32.remove((java.lang.Object) 0.0f);
        boolean boolean36 = linkedListTestDriver32.remove((java.lang.Object) (short) 1);
        linkedListTestDriver32.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator39 = linkedListTestDriver32.iterator();
        linkedListTestDriver32.addLast((java.lang.Object) 100L);
        java.lang.Object obj42 = linkedListTestDriver32.removeLast();
        experiment.util.ListIterator listIterator44 = linkedListTestDriver32.listIterator((int) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver45 = new experiment.util.LinkedListTestDriver();
        boolean boolean47 = linkedListTestDriver45.add((java.lang.Object) 10L);
        linkedListTestDriver32.addLast((java.lang.Object) boolean47);
        boolean boolean49 = linkedListTestDriver19.add((java.lang.Object) boolean47);
        linkedListTestDriver7.addFirst((java.lang.Object) linkedListTestDriver19);
        int int51 = linkedListTestDriver7.size();
        experiment.util.ListIterator listIterator53 = linkedListTestDriver7.listIterator(0);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) (short) -1, (java.lang.Object) listIterator53);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10L + "'", obj4, 10L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[100, 10]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[100, 10]");
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 100L + "'", obj42, 100L);
        org.junit.Assert.assertNotNull(listIterator44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2 + "'", int51 == 2);
        org.junit.Assert.assertNotNull(listIterator53);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test059");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = linkedListTestDriver0.get(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test060");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) 10L);
        int int8 = linkedListTestDriver5.size();
        linkedListTestDriver5.clear();
        linkedListTestDriver5.addFirst((java.lang.Object) (short) 10);
        boolean boolean12 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = linkedListTestDriver5.get((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test061");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        linkedListTestDriver0.clear();
        java.lang.Object[] objArray4 = linkedListTestDriver0.toArray();
        experiment.util.ListIterator listIterator6 = linkedListTestDriver0.listIterator(0);
        java.lang.Class<?> wildcardClass7 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(listIterator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test062");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) 100L);
        java.lang.Object obj10 = linkedListTestDriver0.removeLast();
        experiment.util.ListIterator listIterator12 = linkedListTestDriver0.listIterator((int) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.add((java.lang.Object) 10L);
        linkedListTestDriver0.addLast((java.lang.Object) boolean15);
        java.lang.Object obj19 = linkedListTestDriver0.set(1, (java.lang.Object) (-1));
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        boolean boolean23 = linkedListTestDriver21.remove((java.lang.Object) 0.0f);
        linkedListTestDriver21.clear();
        linkedListTestDriver21.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        boolean boolean28 = linkedListTestDriver26.add((java.lang.Object) 10L);
        linkedListTestDriver26.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray31 = linkedListTestDriver26.toArray();
        linkedListTestDriver21.addFirst((java.lang.Object) linkedListTestDriver26);
        java.lang.Object[] objArray33 = linkedListTestDriver21.toArray();
        linkedListTestDriver0.add(0, (java.lang.Object) linkedListTestDriver21);
        experiment.util.LinkedListTestDriver linkedListTestDriver36 = new experiment.util.LinkedListTestDriver();
        boolean boolean38 = linkedListTestDriver36.remove((java.lang.Object) 0.0f);
        boolean boolean40 = linkedListTestDriver36.remove((java.lang.Object) (short) 1);
        linkedListTestDriver36.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator43 = linkedListTestDriver36.iterator();
        linkedListTestDriver36.addLast((java.lang.Object) 100L);
        java.lang.Object obj46 = linkedListTestDriver36.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver21.add((int) (short) 10, obj46);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100L + "'", obj10, 100L);
        org.junit.Assert.assertNotNull(listIterator12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + true + "'", obj19, true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[100, 10]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(iterator43);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 100L + "'", obj46, 100L);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test063");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        java.lang.Object obj8 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.add((java.lang.Object) 10L);
        linkedListTestDriver0.addFirst((java.lang.Object) boolean11);
        java.lang.Object obj13 = null;
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.addFirst(obj13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 100 + "'", obj8, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test064");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        boolean boolean8 = linkedListTestDriver0.isEmpty();
        java.lang.Object obj9 = linkedListTestDriver0.removeLast();
        experiment.util.Iterator iterator10 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver11.remove((java.lang.Object) 0.0f);
        boolean boolean15 = linkedListTestDriver11.remove((java.lang.Object) (short) 1);
        linkedListTestDriver11.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator18 = linkedListTestDriver11.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) iterator18);
        int int20 = linkedListTestDriver0.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) 100 + "'", obj9, (short) 100);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test065");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        boolean boolean4 = linkedListTestDriver0.isEmpty();
        boolean boolean6 = linkedListTestDriver0.contains((java.lang.Object) (byte) 100);
        int int7 = linkedListTestDriver0.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test066");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator6 = linkedListTestDriver0.listIterator((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 52; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test067");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) 10L);
        linkedListTestDriver5.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray10 = linkedListTestDriver5.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver5);
        java.lang.Object obj12 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.remove((java.lang.Object) 0.0f);
        boolean boolean17 = linkedListTestDriver13.remove((java.lang.Object) (short) 1);
        linkedListTestDriver13.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator20 = linkedListTestDriver13.iterator();
        linkedListTestDriver13.addLast((java.lang.Object) 100L);
        java.lang.Object obj23 = linkedListTestDriver13.removeLast();
        experiment.util.ListIterator listIterator25 = linkedListTestDriver13.listIterator((int) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        boolean boolean28 = linkedListTestDriver26.add((java.lang.Object) 10L);
        linkedListTestDriver13.addLast((java.lang.Object) boolean28);
        boolean boolean30 = linkedListTestDriver0.add((java.lang.Object) boolean28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = linkedListTestDriver0.remove(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[100, 10]");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100L + "'", obj23, 100L);
        org.junit.Assert.assertNotNull(listIterator25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test068");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = linkedListTestDriver0.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test069");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) 10L);
        int int8 = linkedListTestDriver5.size();
        linkedListTestDriver5.clear();
        linkedListTestDriver5.addFirst((java.lang.Object) (short) 10);
        boolean boolean12 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.remove((java.lang.Object) 0.0f);
        linkedListTestDriver13.clear();
        linkedListTestDriver13.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver18.add((java.lang.Object) 10L);
        linkedListTestDriver18.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray23 = linkedListTestDriver18.toArray();
        linkedListTestDriver13.addFirst((java.lang.Object) linkedListTestDriver18);
        java.lang.Object[] objArray25 = linkedListTestDriver13.toArray();
        java.lang.Class<?> wildcardClass26 = linkedListTestDriver13.getClass();
        boolean boolean27 = linkedListTestDriver0.contains((java.lang.Object) wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[100, 10]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test070");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        boolean boolean8 = linkedListTestDriver0.isEmpty();
        experiment.util.Iterator iterator9 = linkedListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = linkedListTestDriver0.get((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test071");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        int int5 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.add((java.lang.Object) 10L);
        int int10 = linkedListTestDriver7.size();
        linkedListTestDriver7.clear();
        java.lang.Object[] objArray12 = linkedListTestDriver7.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.add((java.lang.Object) 10L);
        linkedListTestDriver13.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray18 = linkedListTestDriver13.toArray();
        boolean boolean19 = linkedListTestDriver7.equals_CUT((java.lang.Object) linkedListTestDriver13);
        boolean boolean21 = linkedListTestDriver13.add((java.lang.Object) (byte) 10);
        java.lang.Object obj22 = linkedListTestDriver13.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = linkedListTestDriver0.set((-1), obj22);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[100, 10]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) 10 + "'", obj22, (byte) 10);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test072");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = linkedListTestDriver0.set(0, obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test073");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        java.lang.Object[] objArray5 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.add((java.lang.Object) 10L);
        linkedListTestDriver6.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray11 = linkedListTestDriver6.toArray();
        boolean boolean12 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver6);
        boolean boolean14 = linkedListTestDriver6.add((java.lang.Object) (byte) 10);
        boolean boolean16 = linkedListTestDriver6.add((java.lang.Object) '#');
        java.lang.Object obj17 = linkedListTestDriver6.getFirst();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[100, 10]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) 100 + "'", obj17, (short) 100);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test074");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        linkedListTestDriver0.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray5 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.remove((java.lang.Object) 0.0f);
        linkedListTestDriver6.clear();
        linkedListTestDriver6.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver11.add((java.lang.Object) 10L);
        linkedListTestDriver11.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray16 = linkedListTestDriver11.toArray();
        linkedListTestDriver6.addFirst((java.lang.Object) linkedListTestDriver11);
        boolean boolean18 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = linkedListTestDriver6.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, 10]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[100, 10]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test075");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        boolean boolean8 = linkedListTestDriver0.isEmpty();
        experiment.util.Iterator iterator9 = linkedListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = linkedListTestDriver0.get((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test076");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        boolean boolean9 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        boolean boolean12 = linkedListTestDriver10.remove((java.lang.Object) 0.0f);
        boolean boolean14 = linkedListTestDriver10.remove((java.lang.Object) (short) 1);
        linkedListTestDriver10.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator17 = linkedListTestDriver10.iterator();
        java.lang.Object obj18 = linkedListTestDriver10.getLast();
        linkedListTestDriver0.addFirst(obj18);
        java.lang.Object obj20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = linkedListTestDriver0.contains(obj20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (short) 100 + "'", obj18, (short) 100);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test077");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        java.lang.Object obj7 = linkedListTestDriver0.removeFirst();
        int int8 = linkedListTestDriver0.size();
        int int9 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        boolean boolean12 = linkedListTestDriver10.remove((java.lang.Object) 0.0f);
        boolean boolean14 = linkedListTestDriver10.remove((java.lang.Object) (short) 1);
        linkedListTestDriver10.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator17 = linkedListTestDriver10.iterator();
        boolean boolean18 = linkedListTestDriver10.isEmpty();
        java.lang.Object obj19 = linkedListTestDriver10.removeLast();
        experiment.util.Iterator iterator20 = linkedListTestDriver10.iterator();
        boolean boolean21 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver10);
        java.lang.Object[] objArray22 = linkedListTestDriver10.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = linkedListTestDriver10.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) 100 + "'", obj7, (short) 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (short) 100 + "'", obj19, (short) 100);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test078");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = linkedListTestDriver0.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test079");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        linkedListTestDriver0.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray5 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.remove((java.lang.Object) 0.0f);
        linkedListTestDriver6.clear();
        linkedListTestDriver6.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver11.add((java.lang.Object) 10L);
        linkedListTestDriver11.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray16 = linkedListTestDriver11.toArray();
        linkedListTestDriver6.addFirst((java.lang.Object) linkedListTestDriver11);
        boolean boolean18 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver6);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator20 = linkedListTestDriver0.listIterator(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 100; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, 10]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[100, 10]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test080");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        linkedListTestDriver0.addFirst((java.lang.Object) (short) 100);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        java.lang.Object obj6 = linkedListTestDriver0.removeFirst();
        java.lang.Object obj7 = linkedListTestDriver0.removeFirst();
        int int8 = linkedListTestDriver0.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10L + "'", obj5, 10L);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 100 + "'", obj6, (short) 100);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 10L + "'", obj7, 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test081");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) 100L);
        java.lang.Object obj10 = linkedListTestDriver0.removeLast();
        experiment.util.ListIterator listIterator12 = linkedListTestDriver0.listIterator((int) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.add((java.lang.Object) 10L);
        linkedListTestDriver0.addLast((java.lang.Object) boolean15);
        java.lang.Object obj19 = linkedListTestDriver0.set(1, (java.lang.Object) (-1));
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        boolean boolean23 = linkedListTestDriver21.remove((java.lang.Object) 0.0f);
        linkedListTestDriver21.clear();
        linkedListTestDriver21.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        boolean boolean28 = linkedListTestDriver26.add((java.lang.Object) 10L);
        linkedListTestDriver26.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray31 = linkedListTestDriver26.toArray();
        linkedListTestDriver21.addFirst((java.lang.Object) linkedListTestDriver26);
        java.lang.Object[] objArray33 = linkedListTestDriver21.toArray();
        linkedListTestDriver0.add(0, (java.lang.Object) linkedListTestDriver21);
        java.lang.Object[] objArray35 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver36 = new experiment.util.LinkedListTestDriver();
        boolean boolean38 = linkedListTestDriver36.remove((java.lang.Object) 0.0f);
        boolean boolean40 = linkedListTestDriver36.remove((java.lang.Object) (short) 1);
        linkedListTestDriver36.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator43 = linkedListTestDriver36.iterator();
        linkedListTestDriver36.addLast((java.lang.Object) 100L);
        java.lang.Object obj46 = linkedListTestDriver36.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver47 = new experiment.util.LinkedListTestDriver();
        boolean boolean49 = linkedListTestDriver47.remove((java.lang.Object) 0.0f);
        boolean boolean51 = linkedListTestDriver47.remove((java.lang.Object) (short) 1);
        linkedListTestDriver47.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator54 = linkedListTestDriver47.iterator();
        boolean boolean56 = linkedListTestDriver47.equals_CUT((java.lang.Object) (byte) 1);
        java.lang.Object obj57 = linkedListTestDriver47.getLast();
        java.lang.Object obj58 = linkedListTestDriver47.getLast();
        boolean boolean59 = linkedListTestDriver36.remove((java.lang.Object) linkedListTestDriver47);
        boolean boolean60 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver47);
        java.lang.Class<?> wildcardClass61 = linkedListTestDriver47.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100L + "'", obj10, 100L);
        org.junit.Assert.assertNotNull(listIterator12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + true + "'", obj19, true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[100, 10]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(iterator43);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 100L + "'", obj46, 100L);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(iterator54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + (short) 100 + "'", obj57, (short) 100);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + (short) 100 + "'", obj58, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test082");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        linkedListTestDriver0.clear();
        java.lang.Object[] objArray4 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 0);
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = linkedListTestDriver0.equals_CUT(obj7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test083");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) 10L);
        int int8 = linkedListTestDriver5.size();
        linkedListTestDriver5.clear();
        linkedListTestDriver5.addFirst((java.lang.Object) (short) 10);
        boolean boolean12 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver5);
        java.lang.Object[] objArray13 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        boolean boolean16 = linkedListTestDriver14.remove((java.lang.Object) 0.0f);
        linkedListTestDriver14.clear();
        java.lang.Object[] objArray18 = linkedListTestDriver14.toArray();
        experiment.util.ListIterator listIterator20 = linkedListTestDriver14.listIterator(0);
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        boolean boolean23 = linkedListTestDriver21.remove((java.lang.Object) 0.0f);
        boolean boolean25 = linkedListTestDriver21.remove((java.lang.Object) (short) 1);
        linkedListTestDriver21.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator28 = linkedListTestDriver21.iterator();
        boolean boolean30 = linkedListTestDriver21.equals_CUT((java.lang.Object) (byte) 1);
        java.lang.Object obj31 = linkedListTestDriver21.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        boolean boolean34 = linkedListTestDriver32.remove((java.lang.Object) 0.0f);
        linkedListTestDriver32.clear();
        linkedListTestDriver32.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        boolean boolean39 = linkedListTestDriver37.add((java.lang.Object) 10L);
        linkedListTestDriver37.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray42 = linkedListTestDriver37.toArray();
        linkedListTestDriver32.addFirst((java.lang.Object) linkedListTestDriver37);
        java.lang.Object obj44 = linkedListTestDriver32.getLast();
        boolean boolean45 = linkedListTestDriver21.remove(obj44);
        linkedListTestDriver14.addFirst(obj44);
        boolean boolean47 = linkedListTestDriver0.equals_CUT(obj44);
        java.lang.Class<?> wildcardClass48 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNotNull(listIterator20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (short) 100 + "'", obj31, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[100, 10]");
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test084");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) 10L);
        int int8 = linkedListTestDriver5.size();
        linkedListTestDriver5.clear();
        linkedListTestDriver5.addFirst((java.lang.Object) (short) 10);
        boolean boolean12 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver5);
        java.lang.Object[] objArray13 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        boolean boolean16 = linkedListTestDriver14.remove((java.lang.Object) 0.0f);
        linkedListTestDriver14.clear();
        java.lang.Object[] objArray18 = linkedListTestDriver14.toArray();
        experiment.util.ListIterator listIterator20 = linkedListTestDriver14.listIterator(0);
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        boolean boolean23 = linkedListTestDriver21.remove((java.lang.Object) 0.0f);
        boolean boolean25 = linkedListTestDriver21.remove((java.lang.Object) (short) 1);
        linkedListTestDriver21.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator28 = linkedListTestDriver21.iterator();
        boolean boolean30 = linkedListTestDriver21.equals_CUT((java.lang.Object) (byte) 1);
        java.lang.Object obj31 = linkedListTestDriver21.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        boolean boolean34 = linkedListTestDriver32.remove((java.lang.Object) 0.0f);
        linkedListTestDriver32.clear();
        linkedListTestDriver32.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        boolean boolean39 = linkedListTestDriver37.add((java.lang.Object) 10L);
        linkedListTestDriver37.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray42 = linkedListTestDriver37.toArray();
        linkedListTestDriver32.addFirst((java.lang.Object) linkedListTestDriver37);
        java.lang.Object obj44 = linkedListTestDriver32.getLast();
        boolean boolean45 = linkedListTestDriver21.remove(obj44);
        linkedListTestDriver14.addFirst(obj44);
        boolean boolean47 = linkedListTestDriver0.equals_CUT(obj44);
        experiment.util.LinkedListTestDriver linkedListTestDriver49 = new experiment.util.LinkedListTestDriver();
        boolean boolean51 = linkedListTestDriver49.add((java.lang.Object) 10L);
        int int52 = linkedListTestDriver49.size();
        linkedListTestDriver49.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver54 = new experiment.util.LinkedListTestDriver();
        boolean boolean56 = linkedListTestDriver54.add((java.lang.Object) 10L);
        int int57 = linkedListTestDriver54.size();
        linkedListTestDriver54.clear();
        linkedListTestDriver54.addFirst((java.lang.Object) (short) 10);
        boolean boolean61 = linkedListTestDriver49.equals_CUT((java.lang.Object) linkedListTestDriver54);
        java.lang.Object[] objArray62 = linkedListTestDriver49.toArray();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) '4', (java.lang.Object) objArray62);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 52; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNotNull(listIterator20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (short) 100 + "'", obj31, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[100, 10]");
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[]");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test085");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) 100L);
        java.lang.Object obj10 = linkedListTestDriver0.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver11.remove((java.lang.Object) 0.0f);
        boolean boolean15 = linkedListTestDriver11.remove((java.lang.Object) (short) 1);
        linkedListTestDriver11.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator18 = linkedListTestDriver11.iterator();
        boolean boolean20 = linkedListTestDriver11.equals_CUT((java.lang.Object) (byte) 1);
        java.lang.Object obj21 = linkedListTestDriver11.getLast();
        java.lang.Object obj22 = linkedListTestDriver11.getLast();
        boolean boolean23 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = linkedListTestDriver11.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100L + "'", obj10, 100L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (short) 100 + "'", obj21, (short) 100);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (short) 100 + "'", obj22, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test086");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        java.lang.Object obj7 = linkedListTestDriver0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) 100 + "'", obj7, (short) 100);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test087");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) 10L);
        int int8 = linkedListTestDriver5.size();
        boolean boolean9 = linkedListTestDriver5.isEmpty();
        boolean boolean11 = linkedListTestDriver5.contains((java.lang.Object) (byte) 100);
        experiment.util.Iterator iterator12 = linkedListTestDriver5.iterator();
        java.lang.Object obj14 = linkedListTestDriver5.remove((int) (short) 0);
        java.lang.Object[] objArray15 = linkedListTestDriver5.toArray();
        boolean boolean16 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = linkedListTestDriver5.get(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 10L + "'", obj14, 10L);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test088");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        boolean boolean9 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver11.remove((java.lang.Object) 0.0f);
        boolean boolean15 = linkedListTestDriver11.remove((java.lang.Object) (short) 1);
        linkedListTestDriver11.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator18 = linkedListTestDriver11.iterator();
        linkedListTestDriver11.addLast((java.lang.Object) 100L);
        java.lang.Object obj21 = linkedListTestDriver11.getLast();
        boolean boolean22 = linkedListTestDriver0.contains(obj21);
        java.lang.Object obj24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = linkedListTestDriver0.set((int) (short) 10, obj24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (short) 100 + "'", obj10, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100L + "'", obj21, 100L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test089");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) 100L);
        java.lang.Object obj10 = linkedListTestDriver0.removeLast();
        boolean boolean12 = linkedListTestDriver0.equals_CUT((java.lang.Object) '4');
        java.lang.Object obj13 = linkedListTestDriver0.getLast();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100L + "'", obj10, 100L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (short) 100 + "'", obj13, (short) 100);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test090");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        boolean boolean9 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        boolean boolean12 = linkedListTestDriver10.remove((java.lang.Object) 0.0f);
        boolean boolean14 = linkedListTestDriver10.remove((java.lang.Object) (short) 1);
        linkedListTestDriver10.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator17 = linkedListTestDriver10.iterator();
        java.lang.Object obj18 = linkedListTestDriver10.getLast();
        linkedListTestDriver0.addFirst(obj18);
        java.lang.Object obj20 = linkedListTestDriver0.removeFirst();
        java.lang.Object obj21 = linkedListTestDriver0.getFirst();
        boolean boolean23 = linkedListTestDriver0.add((java.lang.Object) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = linkedListTestDriver0.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (short) 100 + "'", obj18, (short) 100);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (short) 100 + "'", obj20, (short) 100);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (short) 100 + "'", obj21, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test091");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        java.lang.Object obj7 = linkedListTestDriver0.removeFirst();
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = linkedListTestDriver0.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) 100 + "'", obj7, (short) 100);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test092");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        linkedListTestDriver0.addFirst((java.lang.Object) (short) 100);
        boolean boolean6 = linkedListTestDriver0.add((java.lang.Object) 10.0d);
        boolean boolean7 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        boolean boolean10 = linkedListTestDriver8.add((java.lang.Object) 10L);
        int int11 = linkedListTestDriver8.size();
        boolean boolean12 = linkedListTestDriver8.isEmpty();
        boolean boolean14 = linkedListTestDriver8.contains((java.lang.Object) (byte) 100);
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver8);
        java.lang.Object obj16 = linkedListTestDriver0.getFirst();
        java.lang.Object[] objArray17 = linkedListTestDriver0.toArray();
        java.lang.Object obj18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = linkedListTestDriver0.add(obj18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) 100 + "'", obj16, (short) 100);
        org.junit.Assert.assertNotNull(objArray17);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test093");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) 100L);
        java.lang.Object obj10 = linkedListTestDriver0.removeLast();
        java.lang.Object[] objArray11 = linkedListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = linkedListTestDriver0.get((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100L + "'", obj10, 100L);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[100]");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test094");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) 100L);
        java.lang.Object obj10 = linkedListTestDriver0.removeLast();
        experiment.util.ListIterator listIterator12 = linkedListTestDriver0.listIterator((int) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.add((java.lang.Object) 10L);
        linkedListTestDriver0.addLast((java.lang.Object) boolean15);
        java.lang.Object obj19 = linkedListTestDriver0.set(1, (java.lang.Object) (-1));
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        boolean boolean22 = linkedListTestDriver20.remove((java.lang.Object) 0.0f);
        boolean boolean24 = linkedListTestDriver20.remove((java.lang.Object) (short) 1);
        linkedListTestDriver20.addLast((java.lang.Object) (short) 100);
        java.lang.Object obj27 = linkedListTestDriver20.removeFirst();
        linkedListTestDriver20.clear();
        boolean boolean29 = linkedListTestDriver20.isEmpty();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver20);
        java.lang.Object obj31 = linkedListTestDriver0.removeFirst();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100L + "'", obj10, 100L);
        org.junit.Assert.assertNotNull(listIterator12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + true + "'", obj19, true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (short) 100 + "'", obj27, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (short) 100 + "'", obj31, (short) 100);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test095");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        java.lang.Object obj8 = linkedListTestDriver0.removeFirst();
        java.lang.Object[] objArray9 = linkedListTestDriver0.toArray();
        boolean boolean11 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        boolean boolean14 = linkedListTestDriver12.remove((java.lang.Object) 0.0f);
        boolean boolean16 = linkedListTestDriver12.remove((java.lang.Object) (short) 1);
        linkedListTestDriver12.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator19 = linkedListTestDriver12.iterator();
        linkedListTestDriver12.addLast((java.lang.Object) 100L);
        java.lang.Object obj22 = linkedListTestDriver12.removeLast();
        experiment.util.ListIterator listIterator24 = linkedListTestDriver12.listIterator((int) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        boolean boolean27 = linkedListTestDriver25.add((java.lang.Object) 10L);
        linkedListTestDriver12.addLast((java.lang.Object) boolean27);
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        boolean boolean31 = linkedListTestDriver29.remove((java.lang.Object) 0.0f);
        boolean boolean33 = linkedListTestDriver29.remove((java.lang.Object) (short) 1);
        linkedListTestDriver29.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator36 = linkedListTestDriver29.iterator();
        linkedListTestDriver29.addLast((java.lang.Object) 100L);
        java.lang.Object obj39 = linkedListTestDriver29.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver40 = new experiment.util.LinkedListTestDriver();
        boolean boolean42 = linkedListTestDriver40.remove((java.lang.Object) 0.0f);
        boolean boolean44 = linkedListTestDriver40.remove((java.lang.Object) (short) 1);
        linkedListTestDriver40.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator47 = linkedListTestDriver40.iterator();
        boolean boolean49 = linkedListTestDriver40.equals_CUT((java.lang.Object) (byte) 1);
        java.lang.Object obj50 = linkedListTestDriver40.getLast();
        java.lang.Object obj51 = linkedListTestDriver40.getLast();
        boolean boolean52 = linkedListTestDriver29.remove((java.lang.Object) linkedListTestDriver40);
        boolean boolean53 = linkedListTestDriver12.add((java.lang.Object) linkedListTestDriver40);
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver40);
        int int55 = linkedListTestDriver40.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 100 + "'", obj8, (short) 100);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 100L + "'", obj22, 100L);
        org.junit.Assert.assertNotNull(listIterator24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 100L + "'", obj39, 100L);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(iterator47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + (short) 100 + "'", obj50, (short) 100);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + (short) 100 + "'", obj51, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test096");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        linkedListTestDriver0.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray5 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.remove((java.lang.Object) 0.0f);
        linkedListTestDriver6.clear();
        linkedListTestDriver6.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver11.add((java.lang.Object) 10L);
        linkedListTestDriver11.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray16 = linkedListTestDriver11.toArray();
        linkedListTestDriver6.addFirst((java.lang.Object) linkedListTestDriver11);
        boolean boolean18 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver6);
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        boolean boolean21 = linkedListTestDriver19.add((java.lang.Object) 10L);
        linkedListTestDriver19.addFirst((java.lang.Object) (short) 100);
        java.lang.Object obj24 = linkedListTestDriver19.getLast();
        boolean boolean26 = linkedListTestDriver19.contains((java.lang.Object) (byte) 10);
        boolean boolean27 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver19);
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        boolean boolean31 = linkedListTestDriver29.add((java.lang.Object) 10L);
        linkedListTestDriver0.add(0, (java.lang.Object) 10L);
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        boolean boolean36 = linkedListTestDriver34.remove((java.lang.Object) 0.0f);
        boolean boolean38 = linkedListTestDriver34.remove((java.lang.Object) (short) 1);
        linkedListTestDriver34.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator41 = linkedListTestDriver34.iterator();
        boolean boolean43 = linkedListTestDriver34.equals_CUT((java.lang.Object) (byte) 1);
        java.lang.Object obj44 = linkedListTestDriver34.getLast();
        java.lang.Object obj45 = linkedListTestDriver34.getLast();
        experiment.util.Iterator iterator46 = linkedListTestDriver34.iterator();
        boolean boolean47 = linkedListTestDriver34.isEmpty();
        linkedListTestDriver34.clear();
        linkedListTestDriver0.add(0, (java.lang.Object) linkedListTestDriver34);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj51 = linkedListTestDriver34.get((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, 10]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[100, 10]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 10L + "'", obj24, 10L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(iterator41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + (short) 100 + "'", obj44, (short) 100);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (short) 100 + "'", obj45, (short) 100);
        org.junit.Assert.assertNotNull(iterator46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test097");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) 100L);
        java.lang.Object obj10 = linkedListTestDriver0.removeLast();
        experiment.util.ListIterator listIterator12 = linkedListTestDriver0.listIterator((int) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.add((java.lang.Object) 10L);
        linkedListTestDriver0.addLast((java.lang.Object) boolean15);
        java.lang.Object obj19 = linkedListTestDriver0.set(1, (java.lang.Object) (-1));
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        boolean boolean23 = linkedListTestDriver21.remove((java.lang.Object) 0.0f);
        linkedListTestDriver21.clear();
        linkedListTestDriver21.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        boolean boolean28 = linkedListTestDriver26.add((java.lang.Object) 10L);
        linkedListTestDriver26.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray31 = linkedListTestDriver26.toArray();
        linkedListTestDriver21.addFirst((java.lang.Object) linkedListTestDriver26);
        java.lang.Object[] objArray33 = linkedListTestDriver21.toArray();
        linkedListTestDriver0.add(0, (java.lang.Object) linkedListTestDriver21);
        java.lang.Object obj35 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean36 = linkedListTestDriver0.contains(obj35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100L + "'", obj10, 100L);
        org.junit.Assert.assertNotNull(listIterator12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + true + "'", obj19, true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[100, 10]");
        org.junit.Assert.assertNotNull(objArray33);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test098");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = linkedListTestDriver0.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test099");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        java.lang.Object[] objArray5 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.add((java.lang.Object) 10L);
        linkedListTestDriver6.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray11 = linkedListTestDriver6.toArray();
        boolean boolean12 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver6);
        boolean boolean14 = linkedListTestDriver6.add((java.lang.Object) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = linkedListTestDriver6.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[100, 10]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test100");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        java.lang.Object obj7 = linkedListTestDriver0.removeFirst();
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = linkedListTestDriver0.get(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) 100 + "'", obj7, (short) 100);
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test101");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = linkedListTestDriver0.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test102");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        linkedListTestDriver0.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray5 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.remove((java.lang.Object) 0.0f);
        linkedListTestDriver6.clear();
        linkedListTestDriver6.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver11.add((java.lang.Object) 10L);
        linkedListTestDriver11.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray16 = linkedListTestDriver11.toArray();
        linkedListTestDriver6.addFirst((java.lang.Object) linkedListTestDriver11);
        boolean boolean18 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver6);
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        boolean boolean21 = linkedListTestDriver19.add((java.lang.Object) 10L);
        linkedListTestDriver19.addFirst((java.lang.Object) (short) 100);
        java.lang.Object obj24 = linkedListTestDriver19.getLast();
        boolean boolean26 = linkedListTestDriver19.contains((java.lang.Object) (byte) 10);
        boolean boolean27 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver19);
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        boolean boolean30 = linkedListTestDriver28.remove((java.lang.Object) 0.0f);
        boolean boolean32 = linkedListTestDriver28.remove((java.lang.Object) (short) 1);
        linkedListTestDriver28.addLast((java.lang.Object) (short) 100);
        java.lang.Object obj35 = linkedListTestDriver28.removeFirst();
        linkedListTestDriver28.clear();
        boolean boolean37 = linkedListTestDriver28.isEmpty();
        java.lang.Object[] objArray38 = linkedListTestDriver28.toArray();
        boolean boolean39 = linkedListTestDriver19.contains((java.lang.Object) linkedListTestDriver28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj41 = linkedListTestDriver19.get((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, 10]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[100, 10]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 10L + "'", obj24, 10L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (short) 100 + "'", obj35, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test103");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) 10L);
        linkedListTestDriver5.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray10 = linkedListTestDriver5.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver5);
        java.lang.Object obj12 = linkedListTestDriver0.getLast();
        boolean boolean13 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = linkedListTestDriver0.get(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[100, 10]");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test104");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        boolean boolean4 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.remove((java.lang.Object) 0.0f);
        boolean boolean9 = linkedListTestDriver5.remove((java.lang.Object) (short) 1);
        linkedListTestDriver5.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator12 = linkedListTestDriver5.iterator();
        linkedListTestDriver5.addLast((java.lang.Object) 100L);
        java.lang.Object obj15 = linkedListTestDriver5.removeLast();
        experiment.util.ListIterator listIterator17 = linkedListTestDriver5.listIterator((int) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver18.add((java.lang.Object) 10L);
        linkedListTestDriver5.addLast((java.lang.Object) boolean20);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        boolean boolean24 = linkedListTestDriver22.remove((java.lang.Object) 0.0f);
        boolean boolean26 = linkedListTestDriver22.remove((java.lang.Object) (short) 1);
        linkedListTestDriver22.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator29 = linkedListTestDriver22.iterator();
        linkedListTestDriver22.addLast((java.lang.Object) 100L);
        java.lang.Object obj32 = linkedListTestDriver22.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver33 = new experiment.util.LinkedListTestDriver();
        boolean boolean35 = linkedListTestDriver33.remove((java.lang.Object) 0.0f);
        boolean boolean37 = linkedListTestDriver33.remove((java.lang.Object) (short) 1);
        linkedListTestDriver33.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator40 = linkedListTestDriver33.iterator();
        boolean boolean42 = linkedListTestDriver33.equals_CUT((java.lang.Object) (byte) 1);
        java.lang.Object obj43 = linkedListTestDriver33.getLast();
        java.lang.Object obj44 = linkedListTestDriver33.getLast();
        boolean boolean45 = linkedListTestDriver22.remove((java.lang.Object) linkedListTestDriver33);
        boolean boolean46 = linkedListTestDriver5.add((java.lang.Object) linkedListTestDriver33);
        boolean boolean47 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver33);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj49 = linkedListTestDriver33.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100L + "'", obj15, 100L);
        org.junit.Assert.assertNotNull(listIterator17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 100L + "'", obj32, 100L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(iterator40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (short) 100 + "'", obj43, (short) 100);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + (short) 100 + "'", obj44, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test105");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        boolean boolean9 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = linkedListTestDriver0.getLast();
        boolean boolean11 = linkedListTestDriver0.isEmpty();
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = linkedListTestDriver0.remove((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (short) 100 + "'", obj10, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test106");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        java.lang.Object[] objArray5 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.add((java.lang.Object) 10L);
        linkedListTestDriver6.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray11 = linkedListTestDriver6.toArray();
        boolean boolean12 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver6);
        boolean boolean14 = linkedListTestDriver6.add((java.lang.Object) (byte) 10);
        java.lang.Object obj15 = linkedListTestDriver6.removeLast();
        int int16 = linkedListTestDriver6.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        boolean boolean19 = linkedListTestDriver17.remove((java.lang.Object) 0.0f);
        boolean boolean21 = linkedListTestDriver17.remove((java.lang.Object) (short) 1);
        linkedListTestDriver17.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator24 = linkedListTestDriver17.iterator();
        boolean boolean26 = linkedListTestDriver17.equals_CUT((java.lang.Object) (byte) 1);
        java.lang.Object obj27 = linkedListTestDriver17.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        boolean boolean30 = linkedListTestDriver28.remove((java.lang.Object) 0.0f);
        linkedListTestDriver28.clear();
        linkedListTestDriver28.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver33 = new experiment.util.LinkedListTestDriver();
        boolean boolean35 = linkedListTestDriver33.add((java.lang.Object) 10L);
        linkedListTestDriver33.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray38 = linkedListTestDriver33.toArray();
        linkedListTestDriver28.addFirst((java.lang.Object) linkedListTestDriver33);
        java.lang.Object obj40 = linkedListTestDriver28.getLast();
        boolean boolean41 = linkedListTestDriver17.remove(obj40);
        boolean boolean42 = linkedListTestDriver17.isEmpty();
        boolean boolean43 = linkedListTestDriver6.add((java.lang.Object) linkedListTestDriver17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[100, 10]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) 10 + "'", obj15, (byte) 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (short) 100 + "'", obj27, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[100, 10]");
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test107");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) 100L);
        java.lang.Object obj10 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        boolean boolean14 = linkedListTestDriver12.add((java.lang.Object) 10L);
        int int15 = linkedListTestDriver12.size();
        java.lang.Object obj16 = linkedListTestDriver12.getFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = linkedListTestDriver0.set((int) (short) 10, obj16);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100L + "'", obj10, 100L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 10L + "'", obj16, 10L);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test108");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        boolean boolean9 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) 1);
        linkedListTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test109");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        boolean boolean4 = linkedListTestDriver0.isEmpty();
        boolean boolean6 = linkedListTestDriver0.contains((java.lang.Object) (byte) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test110");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        boolean boolean9 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        boolean boolean12 = linkedListTestDriver10.remove((java.lang.Object) 0.0f);
        boolean boolean14 = linkedListTestDriver10.remove((java.lang.Object) (short) 1);
        linkedListTestDriver10.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator17 = linkedListTestDriver10.iterator();
        java.lang.Object obj18 = linkedListTestDriver10.getLast();
        linkedListTestDriver0.addFirst(obj18);
        java.lang.Object obj20 = linkedListTestDriver0.removeFirst();
        java.lang.Object obj21 = linkedListTestDriver0.getFirst();
        java.lang.Object obj22 = linkedListTestDriver0.getLast();
        java.lang.Object obj23 = linkedListTestDriver0.getLast();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (short) 100 + "'", obj18, (short) 100);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (short) 100 + "'", obj20, (short) 100);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (short) 100 + "'", obj21, (short) 100);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (short) 100 + "'", obj22, (short) 100);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) 100 + "'", obj23, (short) 100);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test111");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        java.lang.Object obj8 = linkedListTestDriver0.removeFirst();
        boolean boolean9 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator11 = linkedListTestDriver0.listIterator((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 100 + "'", obj8, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test112");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        java.lang.Object[] objArray5 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0d);
        experiment.util.ListIterator listIterator9 = linkedListTestDriver0.listIterator(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = linkedListTestDriver0.get((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(listIterator9);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test113");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        linkedListTestDriver0.addFirst((java.lang.Object) (short) 100);
        boolean boolean6 = linkedListTestDriver0.add((java.lang.Object) 10.0d);
        boolean boolean7 = linkedListTestDriver0.isEmpty();
        int int8 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = linkedListTestDriver0.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test114");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        java.lang.Object obj7 = linkedListTestDriver0.removeLast();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) 100 + "'", obj7, (short) 100);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test115");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) 100L);
        java.lang.Object obj10 = linkedListTestDriver0.removeLast();
        experiment.util.ListIterator listIterator12 = linkedListTestDriver0.listIterator((int) (byte) 1);
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = linkedListTestDriver0.remove((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100L + "'", obj10, 100L);
        org.junit.Assert.assertNotNull(listIterator12);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test116");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) 10L);
        linkedListTestDriver5.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray10 = linkedListTestDriver5.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        boolean boolean14 = linkedListTestDriver12.remove((java.lang.Object) 0.0f);
        linkedListTestDriver12.clear();
        linkedListTestDriver12.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        boolean boolean19 = linkedListTestDriver17.add((java.lang.Object) 10L);
        linkedListTestDriver17.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray22 = linkedListTestDriver17.toArray();
        linkedListTestDriver12.addFirst((java.lang.Object) linkedListTestDriver17);
        java.lang.Object obj24 = linkedListTestDriver12.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        boolean boolean27 = linkedListTestDriver25.remove((java.lang.Object) 0.0f);
        boolean boolean29 = linkedListTestDriver25.remove((java.lang.Object) (short) 1);
        linkedListTestDriver25.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator32 = linkedListTestDriver25.iterator();
        linkedListTestDriver25.addLast((java.lang.Object) 100L);
        java.lang.Object obj35 = linkedListTestDriver25.removeLast();
        experiment.util.ListIterator listIterator37 = linkedListTestDriver25.listIterator((int) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver38 = new experiment.util.LinkedListTestDriver();
        boolean boolean40 = linkedListTestDriver38.add((java.lang.Object) 10L);
        linkedListTestDriver25.addLast((java.lang.Object) boolean40);
        boolean boolean42 = linkedListTestDriver12.add((java.lang.Object) boolean40);
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver12);
        boolean boolean45 = linkedListTestDriver0.remove((java.lang.Object) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[100, 10]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[100, 10]");
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 100L + "'", obj35, 100L);
        org.junit.Assert.assertNotNull(listIterator37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test117");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        linkedListTestDriver0.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray5 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.remove((java.lang.Object) 0.0f);
        linkedListTestDriver6.clear();
        linkedListTestDriver6.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver11.add((java.lang.Object) 10L);
        linkedListTestDriver11.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray16 = linkedListTestDriver11.toArray();
        linkedListTestDriver6.addFirst((java.lang.Object) linkedListTestDriver11);
        boolean boolean18 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver6);
        boolean boolean19 = linkedListTestDriver6.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        boolean boolean22 = linkedListTestDriver20.add((java.lang.Object) 10L);
        linkedListTestDriver20.addFirst((java.lang.Object) (short) 100);
        boolean boolean26 = linkedListTestDriver20.add((java.lang.Object) 10.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver27 = new experiment.util.LinkedListTestDriver();
        boolean boolean29 = linkedListTestDriver27.add((java.lang.Object) 10L);
        int int30 = linkedListTestDriver27.size();
        linkedListTestDriver27.clear();
        java.lang.Object[] objArray32 = linkedListTestDriver27.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver33 = new experiment.util.LinkedListTestDriver();
        boolean boolean35 = linkedListTestDriver33.add((java.lang.Object) 10L);
        linkedListTestDriver33.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray38 = linkedListTestDriver33.toArray();
        boolean boolean39 = linkedListTestDriver27.equals_CUT((java.lang.Object) linkedListTestDriver33);
        boolean boolean41 = linkedListTestDriver33.add((java.lang.Object) (byte) 10);
        boolean boolean43 = linkedListTestDriver33.add((java.lang.Object) '#');
        java.lang.Object[] objArray44 = linkedListTestDriver33.toArray();
        boolean boolean45 = linkedListTestDriver20.remove((java.lang.Object) objArray44);
        boolean boolean46 = linkedListTestDriver6.add((java.lang.Object) objArray44);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, 10]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[100, 10]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[100, 10]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[100, 10, 10, #]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[100, 10, 10, #]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test118");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        java.lang.Object obj7 = linkedListTestDriver0.removeFirst();
        int int8 = linkedListTestDriver0.size();
        int int9 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        boolean boolean12 = linkedListTestDriver10.remove((java.lang.Object) 0.0f);
        boolean boolean14 = linkedListTestDriver10.remove((java.lang.Object) (short) 1);
        linkedListTestDriver10.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator17 = linkedListTestDriver10.iterator();
        boolean boolean18 = linkedListTestDriver10.isEmpty();
        java.lang.Object obj19 = linkedListTestDriver10.removeLast();
        experiment.util.Iterator iterator20 = linkedListTestDriver10.iterator();
        boolean boolean21 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver10);
        java.lang.Object[] objArray22 = linkedListTestDriver10.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        boolean boolean26 = linkedListTestDriver24.add((java.lang.Object) 10L);
        linkedListTestDriver24.addFirst((java.lang.Object) (short) 100);
        boolean boolean30 = linkedListTestDriver24.add((java.lang.Object) 10.0d);
        java.lang.Object obj31 = linkedListTestDriver24.getLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = linkedListTestDriver10.set(0, (java.lang.Object) linkedListTestDriver24);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) 100 + "'", obj7, (short) 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (short) 100 + "'", obj19, (short) 100);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 10.0d + "'", obj31, 10.0d);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test119");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        java.lang.Object obj7 = linkedListTestDriver0.removeFirst();
        int int8 = linkedListTestDriver0.size();
        int int9 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        boolean boolean12 = linkedListTestDriver10.remove((java.lang.Object) 0.0f);
        boolean boolean14 = linkedListTestDriver10.remove((java.lang.Object) (short) 1);
        linkedListTestDriver10.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator17 = linkedListTestDriver10.iterator();
        boolean boolean18 = linkedListTestDriver10.isEmpty();
        java.lang.Object obj19 = linkedListTestDriver10.removeLast();
        experiment.util.Iterator iterator20 = linkedListTestDriver10.iterator();
        boolean boolean21 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver10);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        boolean boolean24 = linkedListTestDriver22.remove((java.lang.Object) 0.0f);
        linkedListTestDriver22.clear();
        linkedListTestDriver22.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver27 = new experiment.util.LinkedListTestDriver();
        boolean boolean29 = linkedListTestDriver27.add((java.lang.Object) 10L);
        linkedListTestDriver27.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray32 = linkedListTestDriver27.toArray();
        linkedListTestDriver22.addFirst((java.lang.Object) linkedListTestDriver27);
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        boolean boolean36 = linkedListTestDriver34.remove((java.lang.Object) 0.0f);
        linkedListTestDriver34.clear();
        linkedListTestDriver34.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver39 = new experiment.util.LinkedListTestDriver();
        boolean boolean41 = linkedListTestDriver39.add((java.lang.Object) 10L);
        linkedListTestDriver39.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray44 = linkedListTestDriver39.toArray();
        linkedListTestDriver34.addFirst((java.lang.Object) linkedListTestDriver39);
        java.lang.Object obj46 = linkedListTestDriver34.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver47 = new experiment.util.LinkedListTestDriver();
        boolean boolean49 = linkedListTestDriver47.remove((java.lang.Object) 0.0f);
        boolean boolean51 = linkedListTestDriver47.remove((java.lang.Object) (short) 1);
        linkedListTestDriver47.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator54 = linkedListTestDriver47.iterator();
        linkedListTestDriver47.addLast((java.lang.Object) 100L);
        java.lang.Object obj57 = linkedListTestDriver47.removeLast();
        experiment.util.ListIterator listIterator59 = linkedListTestDriver47.listIterator((int) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver60 = new experiment.util.LinkedListTestDriver();
        boolean boolean62 = linkedListTestDriver60.add((java.lang.Object) 10L);
        linkedListTestDriver47.addLast((java.lang.Object) boolean62);
        boolean boolean64 = linkedListTestDriver34.add((java.lang.Object) boolean62);
        linkedListTestDriver22.addFirst((java.lang.Object) linkedListTestDriver34);
        int int66 = linkedListTestDriver22.size();
        experiment.util.ListIterator listIterator68 = linkedListTestDriver22.listIterator(0);
        boolean boolean69 = linkedListTestDriver10.add((java.lang.Object) listIterator68);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) 100 + "'", obj7, (short) 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (short) 100 + "'", obj19, (short) 100);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[100, 10]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[100, 10]");
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(iterator54);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + 100L + "'", obj57, 100L);
        org.junit.Assert.assertNotNull(listIterator59);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 2 + "'", int66 == 2);
        org.junit.Assert.assertNotNull(listIterator68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test120");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        linkedListTestDriver0.addFirst((java.lang.Object) (short) 100);
        java.lang.Object obj5 = linkedListTestDriver0.removeLast();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        java.lang.Object obj7 = linkedListTestDriver0.removeFirst();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10L + "'", obj5, 10L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) 100 + "'", obj7, (short) 100);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test121");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        boolean boolean8 = linkedListTestDriver0.isEmpty();
        java.lang.Object obj9 = linkedListTestDriver0.removeLast();
        experiment.util.Iterator iterator10 = linkedListTestDriver0.iterator();
        experiment.util.ListIterator listIterator12 = linkedListTestDriver0.listIterator(0);
        java.lang.Class<?> wildcardClass13 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) 100 + "'", obj9, (short) 100);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(listIterator12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test122");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) 10L);
        linkedListTestDriver5.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray10 = linkedListTestDriver5.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver5);
        java.lang.Object[] objArray12 = linkedListTestDriver0.toArray();
        java.lang.Class<?> wildcardClass13 = objArray12.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[100, 10]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test123");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        boolean boolean8 = linkedListTestDriver0.isEmpty();
        java.lang.Object obj9 = linkedListTestDriver0.removeLast();
        experiment.util.Iterator iterator10 = linkedListTestDriver0.iterator();
        experiment.util.ListIterator listIterator12 = linkedListTestDriver0.listIterator(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = linkedListTestDriver0.getLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) 100 + "'", obj9, (short) 100);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(listIterator12);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test124");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        linkedListTestDriver0.addFirst((java.lang.Object) (short) 100);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        java.lang.Object obj6 = linkedListTestDriver0.removeFirst();
        java.lang.Object obj7 = linkedListTestDriver0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = linkedListTestDriver0.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10L + "'", obj5, 10L);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 100 + "'", obj6, (short) 100);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 10L + "'", obj7, 10L);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test125");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = linkedListTestDriver0.get((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test126");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        linkedListTestDriver0.clear();
        java.lang.Object[] objArray4 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.remove((java.lang.Object) 0.0f);
        linkedListTestDriver5.clear();
        java.lang.Object[] objArray9 = linkedListTestDriver5.toArray();
        boolean boolean10 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver5);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator12 = linkedListTestDriver5.listIterator(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test127");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        boolean boolean9 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = linkedListTestDriver0.getLast();
        java.lang.Object obj11 = linkedListTestDriver0.getLast();
        experiment.util.Iterator iterator12 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.remove((java.lang.Object) 0.0f);
        linkedListTestDriver13.clear();
        linkedListTestDriver13.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver18.add((java.lang.Object) 10L);
        linkedListTestDriver18.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray23 = linkedListTestDriver18.toArray();
        linkedListTestDriver13.addFirst((java.lang.Object) linkedListTestDriver18);
        java.lang.Object obj25 = linkedListTestDriver13.getLast();
        java.lang.Object obj26 = linkedListTestDriver13.getFirst();
        experiment.util.ListIterator listIterator28 = linkedListTestDriver13.listIterator((int) (byte) 0);
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (short) 100 + "'", obj10, (short) 100);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) 100 + "'", obj11, (short) 100);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[100, 10]");
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(listIterator28);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test128");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        linkedListTestDriver0.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray5 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.remove((java.lang.Object) 0.0f);
        linkedListTestDriver6.clear();
        linkedListTestDriver6.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver11.add((java.lang.Object) 10L);
        linkedListTestDriver11.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray16 = linkedListTestDriver11.toArray();
        linkedListTestDriver6.addFirst((java.lang.Object) linkedListTestDriver11);
        boolean boolean18 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver6);
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        boolean boolean21 = linkedListTestDriver19.add((java.lang.Object) 10L);
        linkedListTestDriver19.addFirst((java.lang.Object) (short) 100);
        java.lang.Object obj24 = linkedListTestDriver19.getLast();
        boolean boolean26 = linkedListTestDriver19.contains((java.lang.Object) (byte) 10);
        boolean boolean27 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver19);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator29 = linkedListTestDriver0.listIterator((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 32; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, 10]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[100, 10]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 10L + "'", obj24, 10L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test129");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        linkedListTestDriver0.addFirst((java.lang.Object) (short) 100);
        boolean boolean6 = linkedListTestDriver0.add((java.lang.Object) 10.0d);
        java.lang.Object obj7 = linkedListTestDriver0.getLast();
        java.lang.Object obj8 = linkedListTestDriver0.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.remove((java.lang.Object) 0.0f);
        boolean boolean13 = linkedListTestDriver9.remove((java.lang.Object) (short) 1);
        linkedListTestDriver9.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator16 = linkedListTestDriver9.iterator();
        linkedListTestDriver9.addLast((java.lang.Object) 100L);
        java.lang.Object obj19 = linkedListTestDriver9.removeLast();
        boolean boolean20 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver9);
        java.lang.Object obj21 = linkedListTestDriver9.getLast();
        linkedListTestDriver9.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        boolean boolean25 = linkedListTestDriver23.remove((java.lang.Object) 0.0f);
        boolean boolean27 = linkedListTestDriver23.remove((java.lang.Object) (short) 1);
        linkedListTestDriver23.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator30 = linkedListTestDriver23.iterator();
        linkedListTestDriver23.addLast((java.lang.Object) 100L);
        java.lang.Object obj33 = linkedListTestDriver23.getLast();
        boolean boolean34 = linkedListTestDriver9.contains((java.lang.Object) linkedListTestDriver23);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 10.0d + "'", obj7, 10.0d);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 10.0d + "'", obj8, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100L + "'", obj19, 100L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (short) 100 + "'", obj21, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 100L + "'", obj33, 100L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test130");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) 10L);
        int int8 = linkedListTestDriver5.size();
        linkedListTestDriver5.clear();
        linkedListTestDriver5.addFirst((java.lang.Object) (short) 10);
        boolean boolean12 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver5);
        java.lang.Object[] objArray13 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        boolean boolean16 = linkedListTestDriver14.add((java.lang.Object) 10L);
        int int17 = linkedListTestDriver14.size();
        linkedListTestDriver14.clear();
        java.lang.Object[] objArray19 = linkedListTestDriver14.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        boolean boolean22 = linkedListTestDriver20.add((java.lang.Object) 10L);
        linkedListTestDriver20.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray25 = linkedListTestDriver20.toArray();
        boolean boolean26 = linkedListTestDriver14.equals_CUT((java.lang.Object) linkedListTestDriver20);
        boolean boolean28 = linkedListTestDriver20.add((java.lang.Object) (byte) 10);
        java.lang.Object obj29 = linkedListTestDriver20.removeLast();
        boolean boolean30 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver20);
        java.lang.Object obj31 = linkedListTestDriver20.removeLast();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[100, 10]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (byte) 10 + "'", obj29, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 10L + "'", obj31, 10L);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test131");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        boolean boolean4 = linkedListTestDriver0.isEmpty();
        boolean boolean6 = linkedListTestDriver0.contains((java.lang.Object) (byte) 100);
        experiment.util.ListIterator listIterator8 = linkedListTestDriver0.listIterator((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator10 = linkedListTestDriver0.listIterator((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 52; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(listIterator8);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test132");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        java.lang.Object obj4 = linkedListTestDriver0.getFirst();
        java.lang.Object[] objArray5 = linkedListTestDriver0.toArray();
        java.lang.Object obj7 = linkedListTestDriver0.get(0);
        java.lang.Object obj8 = linkedListTestDriver0.getFirst();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10L + "'", obj4, 10L);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 10L + "'", obj7, 10L);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 10L + "'", obj8, 10L);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test133");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        boolean boolean9 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = linkedListTestDriver0.getLast();
        java.lang.Object obj11 = linkedListTestDriver0.getLast();
        experiment.util.Iterator iterator12 = linkedListTestDriver0.iterator();
        boolean boolean13 = linkedListTestDriver0.isEmpty();
        java.lang.Object obj14 = linkedListTestDriver0.removeLast();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (short) 100 + "'", obj10, (short) 100);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) 100 + "'", obj11, (short) 100);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) 100 + "'", obj14, (short) 100);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test134");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.remove((java.lang.Object) 0.0f);
        linkedListTestDriver5.clear();
        java.lang.Object[] objArray9 = linkedListTestDriver5.toArray();
        boolean boolean10 = linkedListTestDriver0.contains((java.lang.Object) objArray9);
        java.lang.Object[] objArray11 = linkedListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = linkedListTestDriver0.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test135");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        linkedListTestDriver0.clear();
        java.lang.Object[] objArray4 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.remove((java.lang.Object) 0.0f);
        linkedListTestDriver6.clear();
        linkedListTestDriver6.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver11.add((java.lang.Object) 10L);
        linkedListTestDriver11.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray16 = linkedListTestDriver11.toArray();
        linkedListTestDriver6.addFirst((java.lang.Object) linkedListTestDriver11);
        java.lang.Object obj18 = linkedListTestDriver6.getLast();
        boolean boolean19 = linkedListTestDriver6.isEmpty();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) linkedListTestDriver6);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[100, 10]");
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test136");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        linkedListTestDriver0.addFirst((java.lang.Object) (short) 100);
        boolean boolean6 = linkedListTestDriver0.add((java.lang.Object) 10.0d);
        int int7 = linkedListTestDriver0.size();
        java.lang.Object[] objArray8 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.remove((java.lang.Object) 0.0f);
        boolean boolean13 = linkedListTestDriver9.remove((java.lang.Object) (short) 1);
        linkedListTestDriver9.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator16 = linkedListTestDriver9.iterator();
        boolean boolean17 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver9);
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver18.add((java.lang.Object) 10L);
        int int21 = linkedListTestDriver18.size();
        linkedListTestDriver18.clear();
        java.lang.Object[] objArray23 = linkedListTestDriver18.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        boolean boolean26 = linkedListTestDriver24.add((java.lang.Object) 10L);
        linkedListTestDriver24.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray29 = linkedListTestDriver24.toArray();
        boolean boolean30 = linkedListTestDriver18.equals_CUT((java.lang.Object) linkedListTestDriver24);
        boolean boolean32 = linkedListTestDriver24.add((java.lang.Object) (byte) 10);
        java.lang.Object obj33 = linkedListTestDriver24.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        boolean boolean36 = linkedListTestDriver34.add((java.lang.Object) 10L);
        int int37 = linkedListTestDriver34.size();
        java.lang.Object obj38 = linkedListTestDriver34.getFirst();
        int int39 = linkedListTestDriver34.size();
        boolean boolean40 = linkedListTestDriver24.equals_CUT((java.lang.Object) linkedListTestDriver34);
        linkedListTestDriver9.addFirst((java.lang.Object) linkedListTestDriver34);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100, 10, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100, 10, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[100, 10]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (byte) 10 + "'", obj33, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 10L + "'", obj38, 10L);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test137");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) 10L);
        int int8 = linkedListTestDriver5.size();
        linkedListTestDriver5.clear();
        linkedListTestDriver5.addFirst((java.lang.Object) (short) 10);
        boolean boolean12 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.remove((java.lang.Object) 0.0f);
        boolean boolean17 = linkedListTestDriver13.remove((java.lang.Object) (short) 1);
        linkedListTestDriver13.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator20 = linkedListTestDriver13.iterator();
        linkedListTestDriver13.addLast((java.lang.Object) 100L);
        java.lang.Object obj23 = linkedListTestDriver13.removeLast();
        experiment.util.ListIterator listIterator25 = linkedListTestDriver13.listIterator((int) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        boolean boolean28 = linkedListTestDriver26.add((java.lang.Object) 10L);
        linkedListTestDriver13.addLast((java.lang.Object) boolean28);
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        boolean boolean32 = linkedListTestDriver30.remove((java.lang.Object) 0.0f);
        boolean boolean34 = linkedListTestDriver30.remove((java.lang.Object) (short) 1);
        linkedListTestDriver30.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator37 = linkedListTestDriver30.iterator();
        linkedListTestDriver30.addLast((java.lang.Object) 100L);
        java.lang.Object obj40 = linkedListTestDriver30.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver41 = new experiment.util.LinkedListTestDriver();
        boolean boolean43 = linkedListTestDriver41.remove((java.lang.Object) 0.0f);
        boolean boolean45 = linkedListTestDriver41.remove((java.lang.Object) (short) 1);
        linkedListTestDriver41.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator48 = linkedListTestDriver41.iterator();
        boolean boolean50 = linkedListTestDriver41.equals_CUT((java.lang.Object) (byte) 1);
        java.lang.Object obj51 = linkedListTestDriver41.getLast();
        java.lang.Object obj52 = linkedListTestDriver41.getLast();
        boolean boolean53 = linkedListTestDriver30.remove((java.lang.Object) linkedListTestDriver41);
        boolean boolean54 = linkedListTestDriver13.add((java.lang.Object) linkedListTestDriver41);
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj57 = linkedListTestDriver0.remove((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100L + "'", obj23, 100L);
        org.junit.Assert.assertNotNull(listIterator25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 100L + "'", obj40, 100L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(iterator48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + (short) 100 + "'", obj51, (short) 100);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + (short) 100 + "'", obj52, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test138");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        linkedListTestDriver0.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray5 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.remove((java.lang.Object) 0.0f);
        linkedListTestDriver6.clear();
        linkedListTestDriver6.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver11.add((java.lang.Object) 10L);
        linkedListTestDriver11.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray16 = linkedListTestDriver11.toArray();
        linkedListTestDriver6.addFirst((java.lang.Object) linkedListTestDriver11);
        boolean boolean18 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver6);
        java.lang.Class<?> wildcardClass19 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, 10]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[100, 10]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test139");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        boolean boolean8 = linkedListTestDriver0.isEmpty();
        java.lang.Object obj9 = linkedListTestDriver0.removeLast();
        experiment.util.Iterator iterator10 = linkedListTestDriver0.iterator();
        experiment.util.ListIterator listIterator12 = linkedListTestDriver0.listIterator(0);
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        boolean boolean16 = linkedListTestDriver14.remove((java.lang.Object) 0.0f);
        boolean boolean18 = linkedListTestDriver14.remove((java.lang.Object) (short) 1);
        linkedListTestDriver14.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator21 = linkedListTestDriver14.iterator();
        linkedListTestDriver14.addLast((java.lang.Object) 100L);
        java.lang.Object obj24 = linkedListTestDriver14.removeLast();
        experiment.util.ListIterator listIterator26 = linkedListTestDriver14.listIterator((int) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver27 = new experiment.util.LinkedListTestDriver();
        boolean boolean29 = linkedListTestDriver27.add((java.lang.Object) 10L);
        linkedListTestDriver14.addLast((java.lang.Object) boolean29);
        java.lang.Object obj33 = linkedListTestDriver14.set(1, (java.lang.Object) (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = linkedListTestDriver0.set(0, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) 100 + "'", obj9, (short) 100);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(listIterator12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 100L + "'", obj24, 100L);
        org.junit.Assert.assertNotNull(listIterator26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + true + "'", obj33, true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test140");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        java.lang.Object obj8 = linkedListTestDriver0.removeFirst();
        java.lang.Object[] objArray9 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        boolean boolean12 = linkedListTestDriver10.remove((java.lang.Object) 0.0f);
        boolean boolean14 = linkedListTestDriver10.remove((java.lang.Object) (short) 1);
        linkedListTestDriver10.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator17 = linkedListTestDriver10.iterator();
        boolean boolean18 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver10);
        java.lang.Object obj19 = linkedListTestDriver10.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        boolean boolean23 = linkedListTestDriver21.add((java.lang.Object) 10L);
        int int24 = linkedListTestDriver21.size();
        linkedListTestDriver21.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        boolean boolean28 = linkedListTestDriver26.add((java.lang.Object) 10L);
        int int29 = linkedListTestDriver26.size();
        linkedListTestDriver26.clear();
        linkedListTestDriver26.addFirst((java.lang.Object) (short) 10);
        boolean boolean33 = linkedListTestDriver21.equals_CUT((java.lang.Object) linkedListTestDriver26);
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        boolean boolean36 = linkedListTestDriver34.remove((java.lang.Object) 0.0f);
        boolean boolean38 = linkedListTestDriver34.remove((java.lang.Object) (short) 1);
        linkedListTestDriver34.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator41 = linkedListTestDriver34.iterator();
        java.lang.Object obj42 = linkedListTestDriver34.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver43 = new experiment.util.LinkedListTestDriver();
        boolean boolean45 = linkedListTestDriver43.add((java.lang.Object) 10L);
        linkedListTestDriver34.addFirst((java.lang.Object) boolean45);
        experiment.util.LinkedListTestDriver linkedListTestDriver47 = new experiment.util.LinkedListTestDriver();
        boolean boolean49 = linkedListTestDriver47.add((java.lang.Object) 10L);
        int int50 = linkedListTestDriver47.size();
        java.lang.Object obj51 = linkedListTestDriver47.getFirst();
        java.lang.Object[] objArray52 = linkedListTestDriver47.toArray();
        linkedListTestDriver34.addLast((java.lang.Object) objArray52);
        boolean boolean54 = linkedListTestDriver21.add((java.lang.Object) linkedListTestDriver34);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj55 = linkedListTestDriver10.set((int) (short) 100, (java.lang.Object) linkedListTestDriver34);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 100 + "'", obj8, (short) 100);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (short) 100 + "'", obj19, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(iterator41);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (short) 100 + "'", obj42, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + 10L + "'", obj51, 10L);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[10]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test141");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        linkedListTestDriver0.addFirst((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) 10L);
        int int8 = linkedListTestDriver5.size();
        java.lang.Object obj9 = linkedListTestDriver5.getFirst();
        java.lang.Object[] objArray10 = linkedListTestDriver5.toArray();
        boolean boolean11 = linkedListTestDriver0.contains((java.lang.Object) objArray10);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) '4', (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 52; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 10L + "'", obj9, 10L);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test142");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        java.lang.Object obj4 = linkedListTestDriver0.getFirst();
        int int5 = linkedListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator7 = linkedListTestDriver0.listIterator((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10L + "'", obj4, 10L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test143");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) 10L);
        linkedListTestDriver5.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray10 = linkedListTestDriver5.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver5);
        boolean boolean13 = linkedListTestDriver5.contains((java.lang.Object) '4');
        int int14 = linkedListTestDriver5.size();
        java.lang.Object obj15 = linkedListTestDriver5.removeLast();
        java.lang.Object obj16 = linkedListTestDriver5.getLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = linkedListTestDriver5.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[100, 10]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 10L + "'", obj15, 10L);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) 100 + "'", obj16, (short) 100);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test144");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        boolean boolean9 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver11.add((java.lang.Object) 10L);
        int int14 = linkedListTestDriver11.size();
        boolean boolean15 = linkedListTestDriver11.isEmpty();
        boolean boolean17 = linkedListTestDriver11.contains((java.lang.Object) (byte) 100);
        experiment.util.Iterator iterator18 = linkedListTestDriver11.iterator();
        java.lang.Object[] objArray19 = linkedListTestDriver11.toArray();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) linkedListTestDriver11);
        java.lang.Object obj21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = linkedListTestDriver0.contains(obj21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[10]");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test145");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) 100L);
        java.lang.Object obj10 = linkedListTestDriver0.removeLast();
        experiment.util.ListIterator listIterator12 = linkedListTestDriver0.listIterator((int) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.add((java.lang.Object) 10L);
        linkedListTestDriver0.addLast((java.lang.Object) boolean15);
        java.lang.Object obj19 = linkedListTestDriver0.set(1, (java.lang.Object) (-1));
        linkedListTestDriver0.clear();
        boolean boolean22 = linkedListTestDriver0.contains((java.lang.Object) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100L + "'", obj10, 100L);
        org.junit.Assert.assertNotNull(listIterator12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + true + "'", obj19, true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test146");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) 100L);
        java.lang.Object obj10 = linkedListTestDriver0.removeLast();
        experiment.util.ListIterator listIterator12 = linkedListTestDriver0.listIterator((int) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.add((java.lang.Object) 10L);
        linkedListTestDriver0.addLast((java.lang.Object) boolean15);
        java.lang.Object obj19 = linkedListTestDriver0.set(1, (java.lang.Object) (-1));
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = linkedListTestDriver0.get(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100L + "'", obj10, 100L);
        org.junit.Assert.assertNotNull(listIterator12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + true + "'", obj19, true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test147");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator5 = linkedListTestDriver0.listIterator((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 100; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test148");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        boolean boolean8 = linkedListTestDriver0.isEmpty();
        java.lang.Object obj9 = linkedListTestDriver0.removeLast();
        boolean boolean11 = linkedListTestDriver0.remove((java.lang.Object) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = linkedListTestDriver0.get((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) 100 + "'", obj9, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test149");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        linkedListTestDriver0.addFirst((java.lang.Object) (short) 100);
        boolean boolean6 = linkedListTestDriver0.add((java.lang.Object) 10.0d);
        int int7 = linkedListTestDriver0.size();
        linkedListTestDriver0.addLast((java.lang.Object) (-1.0d));
        java.lang.Object obj10 = linkedListTestDriver0.removeLast();
        java.lang.Class<?> wildcardClass11 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0d) + "'", obj10, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test150");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        boolean boolean4 = linkedListTestDriver2.add((java.lang.Object) 10L);
        int int5 = linkedListTestDriver2.size();
        boolean boolean6 = linkedListTestDriver2.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.remove((java.lang.Object) 0.0f);
        boolean boolean11 = linkedListTestDriver7.remove((java.lang.Object) (short) 1);
        linkedListTestDriver7.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator14 = linkedListTestDriver7.iterator();
        linkedListTestDriver7.addLast((java.lang.Object) 100L);
        java.lang.Object obj17 = linkedListTestDriver7.removeLast();
        experiment.util.ListIterator listIterator19 = linkedListTestDriver7.listIterator((int) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        boolean boolean22 = linkedListTestDriver20.add((java.lang.Object) 10L);
        linkedListTestDriver7.addLast((java.lang.Object) boolean22);
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        boolean boolean26 = linkedListTestDriver24.remove((java.lang.Object) 0.0f);
        boolean boolean28 = linkedListTestDriver24.remove((java.lang.Object) (short) 1);
        linkedListTestDriver24.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator31 = linkedListTestDriver24.iterator();
        linkedListTestDriver24.addLast((java.lang.Object) 100L);
        java.lang.Object obj34 = linkedListTestDriver24.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver35 = new experiment.util.LinkedListTestDriver();
        boolean boolean37 = linkedListTestDriver35.remove((java.lang.Object) 0.0f);
        boolean boolean39 = linkedListTestDriver35.remove((java.lang.Object) (short) 1);
        linkedListTestDriver35.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator42 = linkedListTestDriver35.iterator();
        boolean boolean44 = linkedListTestDriver35.equals_CUT((java.lang.Object) (byte) 1);
        java.lang.Object obj45 = linkedListTestDriver35.getLast();
        java.lang.Object obj46 = linkedListTestDriver35.getLast();
        boolean boolean47 = linkedListTestDriver24.remove((java.lang.Object) linkedListTestDriver35);
        boolean boolean48 = linkedListTestDriver7.add((java.lang.Object) linkedListTestDriver35);
        boolean boolean49 = linkedListTestDriver2.remove((java.lang.Object) linkedListTestDriver35);
        java.lang.Object obj50 = linkedListTestDriver2.removeLast();
        linkedListTestDriver0.addFirst(obj50);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 100L + "'", obj17, 100L);
        org.junit.Assert.assertNotNull(listIterator19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 100L + "'", obj34, 100L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(iterator42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (short) 100 + "'", obj45, (short) 100);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + (short) 100 + "'", obj46, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 10L + "'", obj50, 10L);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test151");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        boolean boolean9 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) 1);
        java.lang.Object obj11 = linkedListTestDriver0.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = linkedListTestDriver0.getLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) 100 + "'", obj11, (short) 100);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test152");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        boolean boolean4 = linkedListTestDriver0.isEmpty();
        boolean boolean6 = linkedListTestDriver0.contains((java.lang.Object) (byte) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        boolean boolean12 = linkedListTestDriver10.remove((java.lang.Object) 0.0f);
        boolean boolean14 = linkedListTestDriver10.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.add(0, (java.lang.Object) boolean14);
        java.lang.Class<?> wildcardClass16 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test153");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        boolean boolean4 = linkedListTestDriver0.isEmpty();
        boolean boolean6 = linkedListTestDriver0.contains((java.lang.Object) (byte) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.add((java.lang.Object) 10L);
        linkedListTestDriver7.addFirst((java.lang.Object) (short) 100);
        boolean boolean13 = linkedListTestDriver7.add((java.lang.Object) 10.0d);
        int int14 = linkedListTestDriver7.size();
        linkedListTestDriver7.addLast((java.lang.Object) (-1.0d));
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        boolean boolean19 = linkedListTestDriver17.add((java.lang.Object) 10L);
        linkedListTestDriver17.addFirst((java.lang.Object) (short) 100);
        java.lang.Object obj22 = linkedListTestDriver17.getLast();
        boolean boolean23 = linkedListTestDriver7.add((java.lang.Object) linkedListTestDriver17);
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver7);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator26 = linkedListTestDriver0.listIterator((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 100; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 10L + "'", obj22, 10L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test154");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        boolean boolean4 = linkedListTestDriver0.isEmpty();
        boolean boolean6 = linkedListTestDriver0.contains((java.lang.Object) (byte) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        experiment.util.Iterator iterator9 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver11.remove((java.lang.Object) 0.0f);
        boolean boolean15 = linkedListTestDriver11.remove((java.lang.Object) (short) 1);
        linkedListTestDriver11.addLast((java.lang.Object) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) (byte) 100, (java.lang.Object) linkedListTestDriver11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 100; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test155");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        java.lang.Object[] objArray5 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.remove((java.lang.Object) 0.0f);
        boolean boolean10 = linkedListTestDriver6.remove((java.lang.Object) (short) 1);
        linkedListTestDriver6.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator13 = linkedListTestDriver6.iterator();
        linkedListTestDriver6.addLast((java.lang.Object) 100L);
        java.lang.Object obj16 = linkedListTestDriver6.removeLast();
        experiment.util.ListIterator listIterator18 = linkedListTestDriver6.listIterator((int) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        boolean boolean21 = linkedListTestDriver19.add((java.lang.Object) 10L);
        linkedListTestDriver6.addLast((java.lang.Object) boolean21);
        boolean boolean23 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver6);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        boolean boolean27 = linkedListTestDriver25.remove((java.lang.Object) 0.0f);
        boolean boolean29 = linkedListTestDriver25.remove((java.lang.Object) (short) 1);
        linkedListTestDriver25.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator32 = linkedListTestDriver25.iterator();
        java.lang.Object obj33 = linkedListTestDriver25.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        boolean boolean36 = linkedListTestDriver34.add((java.lang.Object) 10L);
        linkedListTestDriver25.addFirst((java.lang.Object) boolean36);
        experiment.util.LinkedListTestDriver linkedListTestDriver38 = new experiment.util.LinkedListTestDriver();
        boolean boolean40 = linkedListTestDriver38.add((java.lang.Object) 10L);
        int int41 = linkedListTestDriver38.size();
        java.lang.Object obj42 = linkedListTestDriver38.getFirst();
        java.lang.Object[] objArray43 = linkedListTestDriver38.toArray();
        linkedListTestDriver25.addLast((java.lang.Object) objArray43);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver6.add((int) (short) 10, (java.lang.Object) objArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100L + "'", obj16, 100L);
        org.junit.Assert.assertNotNull(listIterator18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (short) 100 + "'", obj33, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 10L + "'", obj42, 10L);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[10]");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test156");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) 100L);
        java.lang.Object obj10 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver11.remove((java.lang.Object) 0.0f);
        boolean boolean15 = linkedListTestDriver11.remove((java.lang.Object) (short) 1);
        linkedListTestDriver11.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator18 = linkedListTestDriver11.iterator();
        boolean boolean19 = linkedListTestDriver11.isEmpty();
        java.lang.Object obj20 = linkedListTestDriver11.removeLast();
        experiment.util.Iterator iterator21 = linkedListTestDriver11.iterator();
        boolean boolean22 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = linkedListTestDriver11.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100L + "'", obj10, 100L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (short) 100 + "'", obj20, (short) 100);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test157");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        boolean boolean4 = linkedListTestDriver0.isEmpty();
        boolean boolean6 = linkedListTestDriver0.contains((java.lang.Object) (byte) 100);
        experiment.util.ListIterator listIterator8 = linkedListTestDriver0.listIterator((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = linkedListTestDriver0.get((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(listIterator8);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test158");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) 100L);
        java.lang.Object obj10 = linkedListTestDriver0.removeLast();
        experiment.util.ListIterator listIterator12 = linkedListTestDriver0.listIterator((int) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.add((java.lang.Object) 10L);
        linkedListTestDriver0.addLast((java.lang.Object) boolean15);
        java.lang.Object obj19 = linkedListTestDriver0.set(1, (java.lang.Object) (-1));
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        boolean boolean23 = linkedListTestDriver21.remove((java.lang.Object) 0.0f);
        linkedListTestDriver21.clear();
        linkedListTestDriver21.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        boolean boolean28 = linkedListTestDriver26.add((java.lang.Object) 10L);
        linkedListTestDriver26.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray31 = linkedListTestDriver26.toArray();
        linkedListTestDriver21.addFirst((java.lang.Object) linkedListTestDriver26);
        java.lang.Object[] objArray33 = linkedListTestDriver21.toArray();
        linkedListTestDriver0.add(0, (java.lang.Object) linkedListTestDriver21);
        java.lang.Object obj35 = null;
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver21.addFirst(obj35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100L + "'", obj10, 100L);
        org.junit.Assert.assertNotNull(listIterator12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + true + "'", obj19, true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[100, 10]");
        org.junit.Assert.assertNotNull(objArray33);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test159");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        boolean boolean9 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = linkedListTestDriver0.getLast();
        java.lang.Object obj11 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        boolean boolean14 = linkedListTestDriver12.add((java.lang.Object) 10L);
        linkedListTestDriver12.addFirst((java.lang.Object) (short) 100);
        boolean boolean18 = linkedListTestDriver12.add((java.lang.Object) 10.0d);
        boolean boolean19 = linkedListTestDriver12.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        boolean boolean22 = linkedListTestDriver20.add((java.lang.Object) 10L);
        int int23 = linkedListTestDriver20.size();
        boolean boolean24 = linkedListTestDriver20.isEmpty();
        boolean boolean26 = linkedListTestDriver20.contains((java.lang.Object) (byte) 100);
        linkedListTestDriver12.addLast((java.lang.Object) linkedListTestDriver20);
        java.lang.Object obj28 = linkedListTestDriver12.getFirst();
        boolean boolean29 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver12);
        java.lang.Class<?> wildcardClass30 = linkedListTestDriver12.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (short) 100 + "'", obj10, (short) 100);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) 100 + "'", obj11, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (short) 100 + "'", obj28, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test160");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        linkedListTestDriver0.addFirst((java.lang.Object) (short) 100);
        boolean boolean6 = linkedListTestDriver0.add((java.lang.Object) 10.0d);
        java.lang.Object obj7 = linkedListTestDriver0.getLast();
        java.lang.Object obj8 = linkedListTestDriver0.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.remove((java.lang.Object) 0.0f);
        boolean boolean13 = linkedListTestDriver9.remove((java.lang.Object) (short) 1);
        linkedListTestDriver9.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator16 = linkedListTestDriver9.iterator();
        linkedListTestDriver9.addLast((java.lang.Object) 100L);
        java.lang.Object obj19 = linkedListTestDriver9.removeLast();
        boolean boolean20 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = linkedListTestDriver9.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 10.0d + "'", obj7, 10.0d);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 10.0d + "'", obj8, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100L + "'", obj19, 100L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test161");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        java.lang.Object obj4 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.remove((java.lang.Object) 0.0f);
        boolean boolean9 = linkedListTestDriver5.remove((java.lang.Object) (short) 1);
        linkedListTestDriver5.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator12 = linkedListTestDriver5.iterator();
        boolean boolean13 = linkedListTestDriver5.isEmpty();
        java.lang.Object obj14 = linkedListTestDriver5.removeLast();
        experiment.util.Iterator iterator15 = linkedListTestDriver5.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        boolean boolean18 = linkedListTestDriver16.remove((java.lang.Object) 0.0f);
        boolean boolean20 = linkedListTestDriver16.remove((java.lang.Object) (short) 1);
        linkedListTestDriver16.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator23 = linkedListTestDriver16.iterator();
        linkedListTestDriver5.addLast((java.lang.Object) iterator23);
        boolean boolean25 = linkedListTestDriver0.equals_CUT((java.lang.Object) iterator23);
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        boolean boolean28 = linkedListTestDriver26.remove((java.lang.Object) 0.0f);
        linkedListTestDriver26.clear();
        linkedListTestDriver26.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        boolean boolean33 = linkedListTestDriver31.add((java.lang.Object) 10L);
        int int34 = linkedListTestDriver31.size();
        boolean boolean35 = linkedListTestDriver31.isEmpty();
        boolean boolean37 = linkedListTestDriver31.contains((java.lang.Object) (byte) 100);
        experiment.util.Iterator iterator38 = linkedListTestDriver31.iterator();
        java.lang.Object obj40 = linkedListTestDriver31.remove((int) (short) 0);
        java.lang.Object[] objArray41 = linkedListTestDriver31.toArray();
        boolean boolean42 = linkedListTestDriver26.contains((java.lang.Object) linkedListTestDriver31);
        boolean boolean43 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver31);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj44 = linkedListTestDriver31.getLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10L + "'", obj4, 10L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) 100 + "'", obj14, (short) 100);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 10L + "'", obj40, 10L);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test162");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addFirst((java.lang.Object) (short) 10);
        java.lang.Object obj7 = linkedListTestDriver0.getLast();
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        java.lang.Object obj9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = linkedListTestDriver0.remove(obj9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) 10 + "'", obj7, (short) 10);
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test163");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
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
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test164");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) 10L);
        linkedListTestDriver5.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray10 = linkedListTestDriver5.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver5);
        boolean boolean13 = linkedListTestDriver5.contains((java.lang.Object) '4');
        int int14 = linkedListTestDriver5.size();
        java.lang.Object obj15 = linkedListTestDriver5.removeLast();
        java.lang.Object obj16 = linkedListTestDriver5.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        boolean boolean19 = linkedListTestDriver17.add((java.lang.Object) 10L);
        linkedListTestDriver17.addFirst((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        boolean boolean24 = linkedListTestDriver22.add((java.lang.Object) 10L);
        int int25 = linkedListTestDriver22.size();
        java.lang.Object obj26 = linkedListTestDriver22.getFirst();
        java.lang.Object[] objArray27 = linkedListTestDriver22.toArray();
        boolean boolean28 = linkedListTestDriver17.contains((java.lang.Object) objArray27);
        boolean boolean29 = linkedListTestDriver5.equals_CUT((java.lang.Object) boolean28);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[100, 10]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 10L + "'", obj15, 10L);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) 100 + "'", obj16, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 10L + "'", obj26, 10L);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[10]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test165");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.remove((java.lang.Object) 0.0f);
        linkedListTestDriver5.clear();
        linkedListTestDriver5.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        boolean boolean12 = linkedListTestDriver10.add((java.lang.Object) 10L);
        linkedListTestDriver10.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray15 = linkedListTestDriver10.toArray();
        linkedListTestDriver5.addFirst((java.lang.Object) linkedListTestDriver10);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        boolean boolean19 = linkedListTestDriver17.remove((java.lang.Object) 0.0f);
        linkedListTestDriver17.clear();
        linkedListTestDriver17.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        boolean boolean24 = linkedListTestDriver22.add((java.lang.Object) 10L);
        linkedListTestDriver22.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray27 = linkedListTestDriver22.toArray();
        linkedListTestDriver17.addFirst((java.lang.Object) linkedListTestDriver22);
        java.lang.Object obj29 = linkedListTestDriver17.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        boolean boolean32 = linkedListTestDriver30.remove((java.lang.Object) 0.0f);
        boolean boolean34 = linkedListTestDriver30.remove((java.lang.Object) (short) 1);
        linkedListTestDriver30.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator37 = linkedListTestDriver30.iterator();
        linkedListTestDriver30.addLast((java.lang.Object) 100L);
        java.lang.Object obj40 = linkedListTestDriver30.removeLast();
        experiment.util.ListIterator listIterator42 = linkedListTestDriver30.listIterator((int) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver43 = new experiment.util.LinkedListTestDriver();
        boolean boolean45 = linkedListTestDriver43.add((java.lang.Object) 10L);
        linkedListTestDriver30.addLast((java.lang.Object) boolean45);
        boolean boolean47 = linkedListTestDriver17.add((java.lang.Object) boolean45);
        linkedListTestDriver5.addFirst((java.lang.Object) linkedListTestDriver17);
        int int49 = linkedListTestDriver5.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver51 = new experiment.util.LinkedListTestDriver();
        boolean boolean53 = linkedListTestDriver51.remove((java.lang.Object) 0.0f);
        linkedListTestDriver51.clear();
        linkedListTestDriver51.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver56 = new experiment.util.LinkedListTestDriver();
        boolean boolean58 = linkedListTestDriver56.add((java.lang.Object) 10L);
        linkedListTestDriver56.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray61 = linkedListTestDriver56.toArray();
        linkedListTestDriver51.addFirst((java.lang.Object) linkedListTestDriver56);
        java.lang.Object[] objArray63 = linkedListTestDriver51.toArray();
        java.lang.Object obj64 = linkedListTestDriver5.set((int) (byte) 1, (java.lang.Object) objArray63);
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj67 = linkedListTestDriver0.get(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[100, 10]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[100, 10]");
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 100L + "'", obj40, 100L);
        org.junit.Assert.assertNotNull(listIterator42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2 + "'", int49 == 2);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[100, 10]");
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertNotNull(obj64);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test166");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        java.lang.Object obj7 = linkedListTestDriver0.removeFirst();
        int int8 = linkedListTestDriver0.size();
        int int9 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        boolean boolean12 = linkedListTestDriver10.remove((java.lang.Object) 0.0f);
        boolean boolean14 = linkedListTestDriver10.remove((java.lang.Object) (short) 1);
        linkedListTestDriver10.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator17 = linkedListTestDriver10.iterator();
        boolean boolean18 = linkedListTestDriver10.isEmpty();
        java.lang.Object obj19 = linkedListTestDriver10.removeLast();
        experiment.util.Iterator iterator20 = linkedListTestDriver10.iterator();
        boolean boolean21 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver10);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        boolean boolean24 = linkedListTestDriver22.add((java.lang.Object) 10L);
        int int25 = linkedListTestDriver22.size();
        boolean boolean26 = linkedListTestDriver22.isEmpty();
        boolean boolean28 = linkedListTestDriver22.contains((java.lang.Object) (byte) 100);
        experiment.util.Iterator iterator29 = linkedListTestDriver22.iterator();
        java.lang.Object obj31 = linkedListTestDriver22.remove((int) (short) 0);
        java.lang.Object[] objArray32 = linkedListTestDriver22.toArray();
        boolean boolean33 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver22);
        boolean boolean35 = linkedListTestDriver22.add((java.lang.Object) 100.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) 100 + "'", obj7, (short) 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (short) 100 + "'", obj19, (short) 100);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 10L + "'", obj31, 10L);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test167");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        boolean boolean4 = linkedListTestDriver0.isEmpty();
        boolean boolean6 = linkedListTestDriver0.contains((java.lang.Object) (byte) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.add((java.lang.Object) 10L);
        linkedListTestDriver7.addFirst((java.lang.Object) (short) 100);
        boolean boolean13 = linkedListTestDriver7.add((java.lang.Object) 10.0d);
        boolean boolean14 = linkedListTestDriver7.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        boolean boolean17 = linkedListTestDriver15.add((java.lang.Object) 10L);
        int int18 = linkedListTestDriver15.size();
        boolean boolean19 = linkedListTestDriver15.isEmpty();
        boolean boolean21 = linkedListTestDriver15.contains((java.lang.Object) (byte) 100);
        linkedListTestDriver7.addLast((java.lang.Object) linkedListTestDriver15);
        boolean boolean23 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver15);
        java.lang.Object obj25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = linkedListTestDriver0.set((int) (short) 100, obj25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test168");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) 10L);
        linkedListTestDriver5.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray10 = linkedListTestDriver5.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver5);
        java.lang.Object obj12 = linkedListTestDriver0.getLast();
        boolean boolean13 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        boolean boolean16 = linkedListTestDriver14.add((java.lang.Object) 10L);
        int int17 = linkedListTestDriver14.size();
        boolean boolean18 = linkedListTestDriver14.isEmpty();
        boolean boolean20 = linkedListTestDriver14.contains((java.lang.Object) (byte) 100);
        experiment.util.ListIterator listIterator22 = linkedListTestDriver14.listIterator((int) (byte) 1);
        linkedListTestDriver14.clear();
        boolean boolean24 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver14);
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        boolean boolean28 = linkedListTestDriver26.remove((java.lang.Object) 0.0f);
        boolean boolean30 = linkedListTestDriver26.remove((java.lang.Object) (short) 1);
        linkedListTestDriver26.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator33 = linkedListTestDriver26.iterator();
        linkedListTestDriver26.addLast((java.lang.Object) 100L);
        java.lang.Object obj36 = linkedListTestDriver26.removeLast();
        experiment.util.ListIterator listIterator38 = linkedListTestDriver26.listIterator((int) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver39 = new experiment.util.LinkedListTestDriver();
        boolean boolean41 = linkedListTestDriver39.add((java.lang.Object) 10L);
        linkedListTestDriver26.addLast((java.lang.Object) boolean41);
        java.lang.Object obj45 = linkedListTestDriver26.set(1, (java.lang.Object) (-1));
        experiment.util.LinkedListTestDriver linkedListTestDriver46 = new experiment.util.LinkedListTestDriver();
        boolean boolean48 = linkedListTestDriver46.remove((java.lang.Object) 0.0f);
        boolean boolean50 = linkedListTestDriver46.remove((java.lang.Object) (short) 1);
        linkedListTestDriver46.addLast((java.lang.Object) (short) 100);
        java.lang.Object obj53 = linkedListTestDriver46.removeFirst();
        linkedListTestDriver46.clear();
        boolean boolean55 = linkedListTestDriver46.isEmpty();
        linkedListTestDriver26.addLast((java.lang.Object) linkedListTestDriver46);
        experiment.util.ListIterator listIterator58 = linkedListTestDriver26.listIterator((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) (byte) -1, (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[100, 10]");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(listIterator22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 100L + "'", obj36, 100L);
        org.junit.Assert.assertNotNull(listIterator38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + true + "'", obj45, true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + (short) 100 + "'", obj53, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(listIterator58);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test169");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) 100L);
        java.lang.Object obj10 = linkedListTestDriver0.removeLast();
        boolean boolean12 = linkedListTestDriver0.equals_CUT((java.lang.Object) '4');
        java.lang.Object obj14 = linkedListTestDriver0.remove((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator16 = linkedListTestDriver0.listIterator((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 97; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100L + "'", obj10, 100L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) 100 + "'", obj14, (short) 100);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test170");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        java.lang.Object[] objArray5 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.add((java.lang.Object) 10L);
        linkedListTestDriver6.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray11 = linkedListTestDriver6.toArray();
        boolean boolean12 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver6);
        boolean boolean14 = linkedListTestDriver6.add((java.lang.Object) (byte) 10);
        boolean boolean16 = linkedListTestDriver6.add((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver18.remove((java.lang.Object) 0.0f);
        boolean boolean22 = linkedListTestDriver18.remove((java.lang.Object) (short) 1);
        linkedListTestDriver18.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator25 = linkedListTestDriver18.iterator();
        boolean boolean27 = linkedListTestDriver18.equals_CUT((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        boolean boolean30 = linkedListTestDriver28.remove((java.lang.Object) 0.0f);
        boolean boolean32 = linkedListTestDriver28.remove((java.lang.Object) (short) 1);
        linkedListTestDriver28.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator35 = linkedListTestDriver28.iterator();
        java.lang.Object obj36 = linkedListTestDriver28.getLast();
        linkedListTestDriver18.addFirst(obj36);
        java.lang.Object obj38 = linkedListTestDriver18.removeFirst();
        java.lang.Object obj39 = linkedListTestDriver18.getFirst();
        java.lang.Object obj40 = linkedListTestDriver6.set(1, obj39);
        experiment.util.LinkedListTestDriver linkedListTestDriver41 = new experiment.util.LinkedListTestDriver();
        boolean boolean43 = linkedListTestDriver41.remove((java.lang.Object) 0.0f);
        boolean boolean45 = linkedListTestDriver41.remove((java.lang.Object) (short) 1);
        linkedListTestDriver41.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator48 = linkedListTestDriver41.iterator();
        java.lang.Object obj49 = linkedListTestDriver41.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver50 = new experiment.util.LinkedListTestDriver();
        boolean boolean52 = linkedListTestDriver50.add((java.lang.Object) 10L);
        linkedListTestDriver41.addFirst((java.lang.Object) boolean52);
        experiment.util.LinkedListTestDriver linkedListTestDriver54 = new experiment.util.LinkedListTestDriver();
        boolean boolean56 = linkedListTestDriver54.add((java.lang.Object) 10L);
        int int57 = linkedListTestDriver54.size();
        java.lang.Object obj58 = linkedListTestDriver54.getFirst();
        java.lang.Object[] objArray59 = linkedListTestDriver54.toArray();
        linkedListTestDriver41.addLast((java.lang.Object) objArray59);
        java.lang.Object obj62 = linkedListTestDriver41.get((int) (short) 0);
        java.lang.Object obj63 = linkedListTestDriver41.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver64 = new experiment.util.LinkedListTestDriver();
        boolean boolean66 = linkedListTestDriver64.remove((java.lang.Object) 0.0f);
        linkedListTestDriver64.clear();
        linkedListTestDriver64.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver69 = new experiment.util.LinkedListTestDriver();
        boolean boolean71 = linkedListTestDriver69.add((java.lang.Object) 10L);
        linkedListTestDriver69.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray74 = linkedListTestDriver69.toArray();
        linkedListTestDriver64.addFirst((java.lang.Object) linkedListTestDriver69);
        java.lang.Object[] objArray76 = linkedListTestDriver64.toArray();
        boolean boolean77 = linkedListTestDriver41.remove((java.lang.Object) objArray76);
        linkedListTestDriver6.addFirst((java.lang.Object) objArray76);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[100, 10]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (short) 100 + "'", obj36, (short) 100);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (short) 100 + "'", obj38, (short) 100);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (short) 100 + "'", obj39, (short) 100);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 10L + "'", obj40, 10L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(iterator48);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + (short) 100 + "'", obj49, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + 10L + "'", obj58, 10L);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[10]");
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + true + "'", obj62, true);
        org.junit.Assert.assertNotNull(obj63);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray74), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray74), "[100, 10]");
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test171");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) 100L);
        java.lang.Object obj10 = linkedListTestDriver0.removeLast();
        boolean boolean12 = linkedListTestDriver0.equals_CUT((java.lang.Object) '4');
        java.lang.Object obj14 = linkedListTestDriver0.remove((int) (byte) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        boolean boolean18 = linkedListTestDriver16.add((java.lang.Object) 10L);
        int int19 = linkedListTestDriver16.size();
        boolean boolean20 = linkedListTestDriver16.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        boolean boolean23 = linkedListTestDriver21.remove((java.lang.Object) 0.0f);
        boolean boolean25 = linkedListTestDriver21.remove((java.lang.Object) (short) 1);
        linkedListTestDriver21.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator28 = linkedListTestDriver21.iterator();
        linkedListTestDriver21.addLast((java.lang.Object) 100L);
        java.lang.Object obj31 = linkedListTestDriver21.removeLast();
        experiment.util.ListIterator listIterator33 = linkedListTestDriver21.listIterator((int) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        boolean boolean36 = linkedListTestDriver34.add((java.lang.Object) 10L);
        linkedListTestDriver21.addLast((java.lang.Object) boolean36);
        experiment.util.LinkedListTestDriver linkedListTestDriver38 = new experiment.util.LinkedListTestDriver();
        boolean boolean40 = linkedListTestDriver38.remove((java.lang.Object) 0.0f);
        boolean boolean42 = linkedListTestDriver38.remove((java.lang.Object) (short) 1);
        linkedListTestDriver38.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator45 = linkedListTestDriver38.iterator();
        linkedListTestDriver38.addLast((java.lang.Object) 100L);
        java.lang.Object obj48 = linkedListTestDriver38.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver49 = new experiment.util.LinkedListTestDriver();
        boolean boolean51 = linkedListTestDriver49.remove((java.lang.Object) 0.0f);
        boolean boolean53 = linkedListTestDriver49.remove((java.lang.Object) (short) 1);
        linkedListTestDriver49.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator56 = linkedListTestDriver49.iterator();
        boolean boolean58 = linkedListTestDriver49.equals_CUT((java.lang.Object) (byte) 1);
        java.lang.Object obj59 = linkedListTestDriver49.getLast();
        java.lang.Object obj60 = linkedListTestDriver49.getLast();
        boolean boolean61 = linkedListTestDriver38.remove((java.lang.Object) linkedListTestDriver49);
        boolean boolean62 = linkedListTestDriver21.add((java.lang.Object) linkedListTestDriver49);
        boolean boolean63 = linkedListTestDriver16.remove((java.lang.Object) linkedListTestDriver49);
        experiment.util.LinkedListTestDriver linkedListTestDriver64 = new experiment.util.LinkedListTestDriver();
        boolean boolean66 = linkedListTestDriver64.add((java.lang.Object) 10L);
        int int67 = linkedListTestDriver64.size();
        linkedListTestDriver64.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver69 = new experiment.util.LinkedListTestDriver();
        boolean boolean71 = linkedListTestDriver69.add((java.lang.Object) 10L);
        int int72 = linkedListTestDriver69.size();
        linkedListTestDriver69.clear();
        linkedListTestDriver69.addFirst((java.lang.Object) (short) 10);
        boolean boolean76 = linkedListTestDriver64.equals_CUT((java.lang.Object) linkedListTestDriver69);
        java.lang.Object[] objArray77 = linkedListTestDriver64.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver78 = new experiment.util.LinkedListTestDriver();
        boolean boolean80 = linkedListTestDriver78.add((java.lang.Object) 10L);
        int int81 = linkedListTestDriver78.size();
        linkedListTestDriver78.clear();
        java.lang.Object[] objArray83 = linkedListTestDriver78.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver84 = new experiment.util.LinkedListTestDriver();
        boolean boolean86 = linkedListTestDriver84.add((java.lang.Object) 10L);
        linkedListTestDriver84.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray89 = linkedListTestDriver84.toArray();
        boolean boolean90 = linkedListTestDriver78.equals_CUT((java.lang.Object) linkedListTestDriver84);
        boolean boolean92 = linkedListTestDriver84.add((java.lang.Object) (byte) 10);
        java.lang.Object obj93 = linkedListTestDriver84.removeLast();
        boolean boolean94 = linkedListTestDriver64.equals_CUT((java.lang.Object) linkedListTestDriver84);
        linkedListTestDriver49.addFirst((java.lang.Object) linkedListTestDriver84);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((-1), (java.lang.Object) linkedListTestDriver84);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100L + "'", obj10, 100L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) 100 + "'", obj14, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 100L + "'", obj31, 100L);
        org.junit.Assert.assertNotNull(listIterator33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(iterator45);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 100L + "'", obj48, 100L);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(iterator56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + (short) 100 + "'", obj59, (short) 100);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + (short) 100 + "'", obj60, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray77), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray77), "[]");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
        org.junit.Assert.assertNotNull(objArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray83), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray83), "[]");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(objArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray89), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray89), "[100, 10]");
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertEquals("'" + obj93 + "' != '" + (byte) 10 + "'", obj93, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test172");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        linkedListTestDriver0.addFirst((java.lang.Object) (short) 100);
        boolean boolean6 = linkedListTestDriver0.add((java.lang.Object) 10.0d);
        boolean boolean7 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        boolean boolean10 = linkedListTestDriver8.add((java.lang.Object) 10L);
        int int11 = linkedListTestDriver8.size();
        boolean boolean12 = linkedListTestDriver8.isEmpty();
        boolean boolean14 = linkedListTestDriver8.contains((java.lang.Object) (byte) 100);
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver8);
        java.lang.Object obj16 = linkedListTestDriver8.getLast();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 10L + "'", obj16, 10L);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test173");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        java.lang.Object[] objArray5 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.add((java.lang.Object) 10L);
        linkedListTestDriver6.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray11 = linkedListTestDriver6.toArray();
        boolean boolean12 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver6);
        boolean boolean14 = linkedListTestDriver6.add((java.lang.Object) (byte) 10);
        java.lang.Object obj16 = linkedListTestDriver6.remove(1);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator18 = linkedListTestDriver6.listIterator((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 97; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[100, 10]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 10L + "'", obj16, 10L);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test174");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        boolean boolean4 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.remove((java.lang.Object) 0.0f);
        boolean boolean9 = linkedListTestDriver5.remove((java.lang.Object) (short) 1);
        linkedListTestDriver5.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator12 = linkedListTestDriver5.iterator();
        linkedListTestDriver5.addLast((java.lang.Object) 100L);
        java.lang.Object obj15 = linkedListTestDriver5.removeLast();
        experiment.util.ListIterator listIterator17 = linkedListTestDriver5.listIterator((int) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver18.add((java.lang.Object) 10L);
        linkedListTestDriver5.addLast((java.lang.Object) boolean20);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        boolean boolean24 = linkedListTestDriver22.remove((java.lang.Object) 0.0f);
        boolean boolean26 = linkedListTestDriver22.remove((java.lang.Object) (short) 1);
        linkedListTestDriver22.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator29 = linkedListTestDriver22.iterator();
        linkedListTestDriver22.addLast((java.lang.Object) 100L);
        java.lang.Object obj32 = linkedListTestDriver22.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver33 = new experiment.util.LinkedListTestDriver();
        boolean boolean35 = linkedListTestDriver33.remove((java.lang.Object) 0.0f);
        boolean boolean37 = linkedListTestDriver33.remove((java.lang.Object) (short) 1);
        linkedListTestDriver33.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator40 = linkedListTestDriver33.iterator();
        boolean boolean42 = linkedListTestDriver33.equals_CUT((java.lang.Object) (byte) 1);
        java.lang.Object obj43 = linkedListTestDriver33.getLast();
        java.lang.Object obj44 = linkedListTestDriver33.getLast();
        boolean boolean45 = linkedListTestDriver22.remove((java.lang.Object) linkedListTestDriver33);
        boolean boolean46 = linkedListTestDriver5.add((java.lang.Object) linkedListTestDriver33);
        boolean boolean47 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver33);
        java.lang.Object obj48 = linkedListTestDriver0.removeLast();
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj50 = linkedListTestDriver0.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100L + "'", obj15, 100L);
        org.junit.Assert.assertNotNull(listIterator17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 100L + "'", obj32, 100L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(iterator40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (short) 100 + "'", obj43, (short) 100);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + (short) 100 + "'", obj44, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 10L + "'", obj48, 10L);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test175");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) 10L);
        linkedListTestDriver5.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray10 = linkedListTestDriver5.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        boolean boolean14 = linkedListTestDriver12.remove((java.lang.Object) 0.0f);
        linkedListTestDriver12.clear();
        linkedListTestDriver12.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        boolean boolean19 = linkedListTestDriver17.add((java.lang.Object) 10L);
        linkedListTestDriver17.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray22 = linkedListTestDriver17.toArray();
        linkedListTestDriver12.addFirst((java.lang.Object) linkedListTestDriver17);
        java.lang.Object obj24 = linkedListTestDriver12.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        boolean boolean27 = linkedListTestDriver25.remove((java.lang.Object) 0.0f);
        boolean boolean29 = linkedListTestDriver25.remove((java.lang.Object) (short) 1);
        linkedListTestDriver25.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator32 = linkedListTestDriver25.iterator();
        linkedListTestDriver25.addLast((java.lang.Object) 100L);
        java.lang.Object obj35 = linkedListTestDriver25.removeLast();
        experiment.util.ListIterator listIterator37 = linkedListTestDriver25.listIterator((int) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver38 = new experiment.util.LinkedListTestDriver();
        boolean boolean40 = linkedListTestDriver38.add((java.lang.Object) 10L);
        linkedListTestDriver25.addLast((java.lang.Object) boolean40);
        boolean boolean42 = linkedListTestDriver12.add((java.lang.Object) boolean40);
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver12);
        int int44 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver45 = new experiment.util.LinkedListTestDriver();
        boolean boolean47 = linkedListTestDriver45.remove((java.lang.Object) 0.0f);
        boolean boolean49 = linkedListTestDriver45.remove((java.lang.Object) (short) 1);
        linkedListTestDriver45.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator52 = linkedListTestDriver45.iterator();
        boolean boolean54 = linkedListTestDriver45.equals_CUT((java.lang.Object) (byte) 1);
        java.lang.Object obj55 = linkedListTestDriver45.getLast();
        java.lang.Object obj56 = linkedListTestDriver45.getLast();
        experiment.util.Iterator iterator57 = linkedListTestDriver45.iterator();
        boolean boolean58 = linkedListTestDriver0.contains((java.lang.Object) iterator57);
        java.lang.Object obj59 = linkedListTestDriver0.removeFirst();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[100, 10]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[100, 10]");
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 100L + "'", obj35, 100L);
        org.junit.Assert.assertNotNull(listIterator37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(iterator52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + (short) 100 + "'", obj55, (short) 100);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + (short) 100 + "'", obj56, (short) 100);
        org.junit.Assert.assertNotNull(iterator57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(obj59);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test176");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) 100L);
        java.lang.Object obj10 = linkedListTestDriver0.getLast();
        java.lang.Object obj11 = linkedListTestDriver0.removeLast();
        linkedListTestDriver0.addFirst((java.lang.Object) 0);
        java.lang.Object obj14 = linkedListTestDriver0.getFirst();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100L + "'", obj10, 100L);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100L + "'", obj11, 100L);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0 + "'", obj14, 0);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test177");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        boolean boolean8 = linkedListTestDriver0.isEmpty();
        java.lang.Object obj9 = linkedListTestDriver0.removeLast();
        experiment.util.Iterator iterator10 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver11.remove((java.lang.Object) 0.0f);
        boolean boolean15 = linkedListTestDriver11.remove((java.lang.Object) (short) 1);
        linkedListTestDriver11.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator18 = linkedListTestDriver11.iterator();
        boolean boolean20 = linkedListTestDriver11.equals_CUT((java.lang.Object) (byte) 1);
        java.lang.Object obj21 = linkedListTestDriver11.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        boolean boolean24 = linkedListTestDriver22.remove((java.lang.Object) 0.0f);
        linkedListTestDriver22.clear();
        linkedListTestDriver22.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver27 = new experiment.util.LinkedListTestDriver();
        boolean boolean29 = linkedListTestDriver27.add((java.lang.Object) 10L);
        linkedListTestDriver27.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray32 = linkedListTestDriver27.toArray();
        linkedListTestDriver22.addFirst((java.lang.Object) linkedListTestDriver27);
        java.lang.Object obj34 = linkedListTestDriver22.getLast();
        boolean boolean35 = linkedListTestDriver11.remove(obj34);
        java.lang.Object obj36 = linkedListTestDriver11.getFirst();
        boolean boolean37 = linkedListTestDriver0.equals_CUT(obj36);
        experiment.util.LinkedListTestDriver linkedListTestDriver39 = new experiment.util.LinkedListTestDriver();
        boolean boolean41 = linkedListTestDriver39.add((java.lang.Object) 10L);
        linkedListTestDriver39.addFirst((java.lang.Object) (short) 100);
        boolean boolean45 = linkedListTestDriver39.add((java.lang.Object) 10.0d);
        int int46 = linkedListTestDriver39.size();
        java.lang.Object[] objArray47 = linkedListTestDriver39.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver48 = new experiment.util.LinkedListTestDriver();
        boolean boolean50 = linkedListTestDriver48.remove((java.lang.Object) 0.0f);
        boolean boolean52 = linkedListTestDriver48.remove((java.lang.Object) (short) 1);
        linkedListTestDriver48.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator55 = linkedListTestDriver48.iterator();
        boolean boolean56 = linkedListTestDriver39.equals_CUT((java.lang.Object) linkedListTestDriver48);
        java.lang.Object obj57 = linkedListTestDriver48.getFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj58 = linkedListTestDriver0.set((int) 'a', (java.lang.Object) linkedListTestDriver48);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) 100 + "'", obj9, (short) 100);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (short) 100 + "'", obj21, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[100, 10]");
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (short) 100 + "'", obj36, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3 + "'", int46 == 3);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[100, 10, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[100, 10, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(iterator55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + (short) 100 + "'", obj57, (short) 100);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test178");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        linkedListTestDriver0.addFirst((java.lang.Object) (short) 100);
        boolean boolean6 = linkedListTestDriver0.add((java.lang.Object) 10.0d);
        int int7 = linkedListTestDriver0.size();
        java.lang.Object[] objArray8 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        boolean boolean12 = linkedListTestDriver10.add((java.lang.Object) 10L);
        int int13 = linkedListTestDriver10.size();
        boolean boolean14 = linkedListTestDriver10.isEmpty();
        boolean boolean16 = linkedListTestDriver10.contains((java.lang.Object) (byte) 100);
        experiment.util.Iterator iterator17 = linkedListTestDriver10.iterator();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) (byte) -1, (java.lang.Object) iterator17);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100, 10, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100, 10, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(iterator17);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test179");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        boolean boolean8 = linkedListTestDriver0.isEmpty();
        java.lang.Object obj9 = linkedListTestDriver0.removeLast();
        experiment.util.Iterator iterator10 = linkedListTestDriver0.iterator();
        experiment.util.Iterator iterator11 = linkedListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = linkedListTestDriver0.remove((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) 100 + "'", obj9, (short) 100);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test180");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        boolean boolean9 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        boolean boolean12 = linkedListTestDriver10.remove((java.lang.Object) 0.0f);
        boolean boolean14 = linkedListTestDriver10.remove((java.lang.Object) (short) 1);
        linkedListTestDriver10.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator17 = linkedListTestDriver10.iterator();
        java.lang.Object obj18 = linkedListTestDriver10.getLast();
        linkedListTestDriver0.addFirst(obj18);
        java.lang.Object obj20 = linkedListTestDriver0.removeFirst();
        java.lang.Object obj21 = linkedListTestDriver0.getFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = linkedListTestDriver0.remove((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (short) 100 + "'", obj18, (short) 100);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (short) 100 + "'", obj20, (short) 100);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (short) 100 + "'", obj21, (short) 100);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test181");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        linkedListTestDriver0.addFirst((java.lang.Object) (short) 100);
        boolean boolean6 = linkedListTestDriver0.add((java.lang.Object) 10.0d);
        java.lang.Object obj7 = linkedListTestDriver0.getLast();
        java.lang.Object obj8 = linkedListTestDriver0.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.remove((java.lang.Object) 0.0f);
        boolean boolean13 = linkedListTestDriver9.remove((java.lang.Object) (short) 1);
        linkedListTestDriver9.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator16 = linkedListTestDriver9.iterator();
        linkedListTestDriver9.addLast((java.lang.Object) 100L);
        java.lang.Object obj19 = linkedListTestDriver9.removeLast();
        boolean boolean20 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver9);
        java.lang.Object obj21 = linkedListTestDriver9.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        boolean boolean24 = linkedListTestDriver22.remove((java.lang.Object) 0.0f);
        boolean boolean26 = linkedListTestDriver22.remove((java.lang.Object) (short) 1);
        linkedListTestDriver22.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator29 = linkedListTestDriver22.iterator();
        java.lang.Object obj30 = linkedListTestDriver22.getLast();
        boolean boolean31 = linkedListTestDriver9.add((java.lang.Object) linkedListTestDriver22);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 10.0d + "'", obj7, 10.0d);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 10.0d + "'", obj8, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100L + "'", obj19, 100L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (short) 100 + "'", obj21, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (short) 100 + "'", obj30, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test182");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        linkedListTestDriver0.addFirst((java.lang.Object) (short) 100);
        boolean boolean6 = linkedListTestDriver0.add((java.lang.Object) 10.0d);
        java.lang.Object obj7 = linkedListTestDriver0.getLast();
        java.lang.Object obj8 = linkedListTestDriver0.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.remove((java.lang.Object) 0.0f);
        boolean boolean13 = linkedListTestDriver9.remove((java.lang.Object) (short) 1);
        linkedListTestDriver9.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator16 = linkedListTestDriver9.iterator();
        linkedListTestDriver9.addLast((java.lang.Object) 100L);
        java.lang.Object obj19 = linkedListTestDriver9.removeLast();
        boolean boolean20 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver9);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 10.0d + "'", obj7, 10.0d);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 10.0d + "'", obj8, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100L + "'", obj19, 100L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test183");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        java.lang.Object[] objArray5 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.remove((java.lang.Object) 0.0f);
        boolean boolean10 = linkedListTestDriver6.remove((java.lang.Object) (short) 1);
        linkedListTestDriver6.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator13 = linkedListTestDriver6.iterator();
        linkedListTestDriver6.addLast((java.lang.Object) 100L);
        java.lang.Object obj16 = linkedListTestDriver6.removeLast();
        experiment.util.ListIterator listIterator18 = linkedListTestDriver6.listIterator((int) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        boolean boolean21 = linkedListTestDriver19.add((java.lang.Object) 10L);
        linkedListTestDriver6.addLast((java.lang.Object) boolean21);
        boolean boolean23 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver6);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator25 = linkedListTestDriver0.listIterator((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100L + "'", obj16, 100L);
        org.junit.Assert.assertNotNull(listIterator18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test184");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        boolean boolean8 = linkedListTestDriver0.isEmpty();
        java.lang.Object obj9 = linkedListTestDriver0.removeLast();
        boolean boolean11 = linkedListTestDriver0.remove((java.lang.Object) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator13 = linkedListTestDriver0.listIterator((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 100; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) 100 + "'", obj9, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test185");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        boolean boolean4 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.remove((java.lang.Object) 0.0f);
        boolean boolean9 = linkedListTestDriver5.remove((java.lang.Object) (short) 1);
        linkedListTestDriver5.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator12 = linkedListTestDriver5.iterator();
        linkedListTestDriver5.addLast((java.lang.Object) 100L);
        java.lang.Object obj15 = linkedListTestDriver5.removeLast();
        experiment.util.ListIterator listIterator17 = linkedListTestDriver5.listIterator((int) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver18.add((java.lang.Object) 10L);
        linkedListTestDriver5.addLast((java.lang.Object) boolean20);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        boolean boolean24 = linkedListTestDriver22.remove((java.lang.Object) 0.0f);
        boolean boolean26 = linkedListTestDriver22.remove((java.lang.Object) (short) 1);
        linkedListTestDriver22.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator29 = linkedListTestDriver22.iterator();
        linkedListTestDriver22.addLast((java.lang.Object) 100L);
        java.lang.Object obj32 = linkedListTestDriver22.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver33 = new experiment.util.LinkedListTestDriver();
        boolean boolean35 = linkedListTestDriver33.remove((java.lang.Object) 0.0f);
        boolean boolean37 = linkedListTestDriver33.remove((java.lang.Object) (short) 1);
        linkedListTestDriver33.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator40 = linkedListTestDriver33.iterator();
        boolean boolean42 = linkedListTestDriver33.equals_CUT((java.lang.Object) (byte) 1);
        java.lang.Object obj43 = linkedListTestDriver33.getLast();
        java.lang.Object obj44 = linkedListTestDriver33.getLast();
        boolean boolean45 = linkedListTestDriver22.remove((java.lang.Object) linkedListTestDriver33);
        boolean boolean46 = linkedListTestDriver5.add((java.lang.Object) linkedListTestDriver33);
        boolean boolean47 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver33);
        boolean boolean48 = linkedListTestDriver33.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver50 = new experiment.util.LinkedListTestDriver();
        boolean boolean52 = linkedListTestDriver50.add((java.lang.Object) 10L);
        int int53 = linkedListTestDriver50.size();
        boolean boolean54 = linkedListTestDriver50.isEmpty();
        boolean boolean56 = linkedListTestDriver50.contains((java.lang.Object) (byte) 100);
        experiment.util.Iterator iterator57 = linkedListTestDriver50.iterator();
        experiment.util.Iterator iterator58 = linkedListTestDriver50.iterator();
        experiment.util.Iterator iterator59 = linkedListTestDriver50.iterator();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver33.add((-1), (java.lang.Object) linkedListTestDriver50);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100L + "'", obj15, 100L);
        org.junit.Assert.assertNotNull(listIterator17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 100L + "'", obj32, 100L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(iterator40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (short) 100 + "'", obj43, (short) 100);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + (short) 100 + "'", obj44, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(iterator57);
        org.junit.Assert.assertNotNull(iterator58);
        org.junit.Assert.assertNotNull(iterator59);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test186");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        java.lang.Object obj8 = linkedListTestDriver0.removeFirst();
        java.lang.Object[] objArray9 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        boolean boolean12 = linkedListTestDriver10.remove((java.lang.Object) 0.0f);
        boolean boolean14 = linkedListTestDriver10.remove((java.lang.Object) (short) 1);
        linkedListTestDriver10.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator17 = linkedListTestDriver10.iterator();
        boolean boolean18 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = linkedListTestDriver10.get(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 100 + "'", obj8, (short) 100);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test187");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) 10L);
        linkedListTestDriver5.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray10 = linkedListTestDriver5.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver5);
        boolean boolean13 = linkedListTestDriver5.contains((java.lang.Object) '4');
        int int14 = linkedListTestDriver5.size();
        java.lang.Object obj15 = linkedListTestDriver5.removeLast();
        java.lang.Object[] objArray16 = linkedListTestDriver5.toArray();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator18 = linkedListTestDriver5.listIterator((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 52; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[100, 10]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 10L + "'", obj15, 10L);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[100]");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test188");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) 100L);
        java.lang.Object obj10 = linkedListTestDriver0.removeLast();
        experiment.util.ListIterator listIterator12 = linkedListTestDriver0.listIterator((int) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.add((java.lang.Object) 10L);
        linkedListTestDriver0.addLast((java.lang.Object) boolean15);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        boolean boolean19 = linkedListTestDriver17.remove((java.lang.Object) 0.0f);
        boolean boolean21 = linkedListTestDriver17.remove((java.lang.Object) (short) 1);
        linkedListTestDriver17.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator24 = linkedListTestDriver17.iterator();
        linkedListTestDriver17.addLast((java.lang.Object) 100L);
        java.lang.Object obj27 = linkedListTestDriver17.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        boolean boolean30 = linkedListTestDriver28.remove((java.lang.Object) 0.0f);
        boolean boolean32 = linkedListTestDriver28.remove((java.lang.Object) (short) 1);
        linkedListTestDriver28.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator35 = linkedListTestDriver28.iterator();
        boolean boolean37 = linkedListTestDriver28.equals_CUT((java.lang.Object) (byte) 1);
        java.lang.Object obj38 = linkedListTestDriver28.getLast();
        java.lang.Object obj39 = linkedListTestDriver28.getLast();
        boolean boolean40 = linkedListTestDriver17.remove((java.lang.Object) linkedListTestDriver28);
        boolean boolean41 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver28);
        experiment.util.LinkedListTestDriver linkedListTestDriver43 = new experiment.util.LinkedListTestDriver();
        boolean boolean45 = linkedListTestDriver43.remove((java.lang.Object) 0.0f);
        boolean boolean47 = linkedListTestDriver43.remove((java.lang.Object) (short) 1);
        linkedListTestDriver43.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator50 = linkedListTestDriver43.iterator();
        boolean boolean52 = linkedListTestDriver43.equals_CUT((java.lang.Object) (byte) 1);
        java.lang.Object obj53 = linkedListTestDriver43.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver54 = new experiment.util.LinkedListTestDriver();
        boolean boolean56 = linkedListTestDriver54.remove((java.lang.Object) 0.0f);
        linkedListTestDriver54.clear();
        linkedListTestDriver54.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver59 = new experiment.util.LinkedListTestDriver();
        boolean boolean61 = linkedListTestDriver59.add((java.lang.Object) 10L);
        linkedListTestDriver59.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray64 = linkedListTestDriver59.toArray();
        linkedListTestDriver54.addFirst((java.lang.Object) linkedListTestDriver59);
        java.lang.Object obj66 = linkedListTestDriver54.getLast();
        boolean boolean67 = linkedListTestDriver43.remove(obj66);
        java.lang.Object obj68 = linkedListTestDriver43.getFirst();
        java.lang.Object obj69 = linkedListTestDriver28.set((int) (short) 0, (java.lang.Object) linkedListTestDriver43);
        java.lang.Object obj70 = linkedListTestDriver28.getFirst();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100L + "'", obj10, 100L);
        org.junit.Assert.assertNotNull(listIterator12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 100L + "'", obj27, 100L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (short) 100 + "'", obj38, (short) 100);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (short) 100 + "'", obj39, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(iterator50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + (short) 100 + "'", obj53, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray64), "[100, 10]");
        org.junit.Assert.assertNotNull(obj66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + obj68 + "' != '" + (short) 100 + "'", obj68, (short) 100);
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + (short) 100 + "'", obj69, (short) 100);
        org.junit.Assert.assertNotNull(obj70);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test189");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) 100L);
        java.lang.Object obj10 = linkedListTestDriver0.removeLast();
        experiment.util.ListIterator listIterator12 = linkedListTestDriver0.listIterator((int) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.add((java.lang.Object) 10L);
        linkedListTestDriver0.addLast((java.lang.Object) boolean15);
        java.lang.Object obj19 = linkedListTestDriver0.set(1, (java.lang.Object) (-1));
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        boolean boolean22 = linkedListTestDriver20.remove((java.lang.Object) 0.0f);
        boolean boolean24 = linkedListTestDriver20.remove((java.lang.Object) (short) 1);
        linkedListTestDriver20.addLast((java.lang.Object) (short) 100);
        java.lang.Object obj27 = linkedListTestDriver20.removeFirst();
        linkedListTestDriver20.clear();
        boolean boolean29 = linkedListTestDriver20.isEmpty();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver20);
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        boolean boolean33 = linkedListTestDriver31.add((java.lang.Object) 10L);
        linkedListTestDriver31.addFirst((java.lang.Object) (short) 100);
        boolean boolean37 = linkedListTestDriver31.add((java.lang.Object) 10.0d);
        boolean boolean38 = linkedListTestDriver31.isEmpty();
        java.lang.Object obj39 = linkedListTestDriver31.removeLast();
        boolean boolean40 = linkedListTestDriver20.remove((java.lang.Object) linkedListTestDriver31);
        boolean boolean41 = linkedListTestDriver31.isEmpty();
        java.lang.Class<?> wildcardClass42 = linkedListTestDriver31.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100L + "'", obj10, 100L);
        org.junit.Assert.assertNotNull(listIterator12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + true + "'", obj19, true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (short) 100 + "'", obj27, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 10.0d + "'", obj39, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test190");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        java.lang.Object[] objArray5 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.remove((java.lang.Object) 0.0f);
        boolean boolean10 = linkedListTestDriver6.remove((java.lang.Object) (short) 1);
        linkedListTestDriver6.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator13 = linkedListTestDriver6.iterator();
        linkedListTestDriver6.addLast((java.lang.Object) 100L);
        java.lang.Object obj16 = linkedListTestDriver6.removeLast();
        experiment.util.ListIterator listIterator18 = linkedListTestDriver6.listIterator((int) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        boolean boolean21 = linkedListTestDriver19.add((java.lang.Object) 10L);
        linkedListTestDriver6.addLast((java.lang.Object) boolean21);
        boolean boolean23 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver6);
        java.lang.Class<?> wildcardClass24 = linkedListTestDriver6.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100L + "'", obj16, 100L);
        org.junit.Assert.assertNotNull(listIterator18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test191");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.remove((java.lang.Object) 0.0f);
        boolean boolean11 = linkedListTestDriver7.remove((java.lang.Object) (short) 1);
        linkedListTestDriver7.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator14 = linkedListTestDriver7.iterator();
        java.lang.Object obj15 = linkedListTestDriver7.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        boolean boolean18 = linkedListTestDriver16.add((java.lang.Object) 10L);
        linkedListTestDriver7.addFirst((java.lang.Object) boolean18);
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        boolean boolean22 = linkedListTestDriver20.add((java.lang.Object) 10L);
        int int23 = linkedListTestDriver20.size();
        java.lang.Object obj24 = linkedListTestDriver20.getFirst();
        java.lang.Object[] objArray25 = linkedListTestDriver20.toArray();
        linkedListTestDriver7.addLast((java.lang.Object) objArray25);
        boolean boolean27 = linkedListTestDriver0.add((java.lang.Object) objArray25);
        java.lang.Object obj28 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = linkedListTestDriver0.contains(obj28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) 100 + "'", obj15, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 10L + "'", obj24, 10L);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[10]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test192");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.remove((java.lang.Object) 0.0f);
        boolean boolean11 = linkedListTestDriver7.remove((java.lang.Object) (short) 1);
        linkedListTestDriver7.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator14 = linkedListTestDriver7.iterator();
        java.lang.Object obj15 = linkedListTestDriver7.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        boolean boolean18 = linkedListTestDriver16.add((java.lang.Object) 10L);
        linkedListTestDriver7.addFirst((java.lang.Object) boolean18);
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        boolean boolean22 = linkedListTestDriver20.add((java.lang.Object) 10L);
        int int23 = linkedListTestDriver20.size();
        java.lang.Object obj24 = linkedListTestDriver20.getFirst();
        java.lang.Object[] objArray25 = linkedListTestDriver20.toArray();
        linkedListTestDriver7.addLast((java.lang.Object) objArray25);
        boolean boolean27 = linkedListTestDriver0.add((java.lang.Object) objArray25);
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        boolean boolean30 = linkedListTestDriver28.remove((java.lang.Object) 0.0f);
        linkedListTestDriver28.clear();
        linkedListTestDriver28.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver33 = new experiment.util.LinkedListTestDriver();
        boolean boolean35 = linkedListTestDriver33.add((java.lang.Object) 10L);
        linkedListTestDriver33.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray38 = linkedListTestDriver33.toArray();
        linkedListTestDriver28.addFirst((java.lang.Object) linkedListTestDriver33);
        experiment.util.LinkedListTestDriver linkedListTestDriver40 = new experiment.util.LinkedListTestDriver();
        boolean boolean42 = linkedListTestDriver40.remove((java.lang.Object) 0.0f);
        linkedListTestDriver40.clear();
        linkedListTestDriver40.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver45 = new experiment.util.LinkedListTestDriver();
        boolean boolean47 = linkedListTestDriver45.add((java.lang.Object) 10L);
        linkedListTestDriver45.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray50 = linkedListTestDriver45.toArray();
        linkedListTestDriver40.addFirst((java.lang.Object) linkedListTestDriver45);
        java.lang.Object obj52 = linkedListTestDriver40.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver53 = new experiment.util.LinkedListTestDriver();
        boolean boolean55 = linkedListTestDriver53.remove((java.lang.Object) 0.0f);
        boolean boolean57 = linkedListTestDriver53.remove((java.lang.Object) (short) 1);
        linkedListTestDriver53.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator60 = linkedListTestDriver53.iterator();
        linkedListTestDriver53.addLast((java.lang.Object) 100L);
        java.lang.Object obj63 = linkedListTestDriver53.removeLast();
        experiment.util.ListIterator listIterator65 = linkedListTestDriver53.listIterator((int) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver66 = new experiment.util.LinkedListTestDriver();
        boolean boolean68 = linkedListTestDriver66.add((java.lang.Object) 10L);
        linkedListTestDriver53.addLast((java.lang.Object) boolean68);
        boolean boolean70 = linkedListTestDriver40.add((java.lang.Object) boolean68);
        linkedListTestDriver28.addFirst((java.lang.Object) linkedListTestDriver40);
        boolean boolean72 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver28);
        java.lang.Object obj73 = linkedListTestDriver28.getFirst();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) 100 + "'", obj15, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 10L + "'", obj24, 10L);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[10]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[100, 10]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[100, 10]");
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(iterator60);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + 100L + "'", obj63, 100L);
        org.junit.Assert.assertNotNull(listIterator65);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(obj73);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test193");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        linkedListTestDriver0.clear();
        java.lang.Object[] objArray4 = linkedListTestDriver0.toArray();
        java.lang.Class<?> wildcardClass5 = objArray4.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test194");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) 10L);
        linkedListTestDriver5.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray10 = linkedListTestDriver5.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver5);
        boolean boolean13 = linkedListTestDriver5.contains((java.lang.Object) '4');
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        boolean boolean17 = linkedListTestDriver15.remove((java.lang.Object) 0.0f);
        boolean boolean19 = linkedListTestDriver15.remove((java.lang.Object) (short) 1);
        linkedListTestDriver15.addLast((java.lang.Object) (short) 100);
        java.lang.Object obj22 = linkedListTestDriver15.removeFirst();
        linkedListTestDriver15.clear();
        boolean boolean24 = linkedListTestDriver15.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        boolean boolean27 = linkedListTestDriver25.remove((java.lang.Object) 0.0f);
        boolean boolean29 = linkedListTestDriver25.remove((java.lang.Object) (short) 1);
        linkedListTestDriver25.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator32 = linkedListTestDriver25.iterator();
        boolean boolean33 = linkedListTestDriver25.isEmpty();
        java.lang.Object obj34 = linkedListTestDriver25.removeLast();
        experiment.util.Iterator iterator35 = linkedListTestDriver25.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver36 = new experiment.util.LinkedListTestDriver();
        boolean boolean38 = linkedListTestDriver36.remove((java.lang.Object) 0.0f);
        boolean boolean40 = linkedListTestDriver36.remove((java.lang.Object) (short) 1);
        linkedListTestDriver36.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator43 = linkedListTestDriver36.iterator();
        linkedListTestDriver25.addLast((java.lang.Object) iterator43);
        boolean boolean46 = linkedListTestDriver25.equals_CUT((java.lang.Object) (-1.0f));
        boolean boolean47 = linkedListTestDriver25.isEmpty();
        linkedListTestDriver15.addFirst((java.lang.Object) linkedListTestDriver25);
        experiment.util.LinkedListTestDriver linkedListTestDriver49 = new experiment.util.LinkedListTestDriver();
        boolean boolean51 = linkedListTestDriver49.add((java.lang.Object) 10L);
        int int52 = linkedListTestDriver49.size();
        linkedListTestDriver49.clear();
        int int54 = linkedListTestDriver49.size();
        boolean boolean55 = linkedListTestDriver25.add((java.lang.Object) linkedListTestDriver49);
        linkedListTestDriver5.add((int) (short) 1, (java.lang.Object) linkedListTestDriver49);
        experiment.util.LinkedListTestDriver linkedListTestDriver57 = new experiment.util.LinkedListTestDriver();
        boolean boolean59 = linkedListTestDriver57.add((java.lang.Object) 10L);
        int int60 = linkedListTestDriver57.size();
        linkedListTestDriver57.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver62 = new experiment.util.LinkedListTestDriver();
        boolean boolean64 = linkedListTestDriver62.add((java.lang.Object) 10L);
        int int65 = linkedListTestDriver62.size();
        linkedListTestDriver62.clear();
        linkedListTestDriver62.addFirst((java.lang.Object) (short) 10);
        boolean boolean69 = linkedListTestDriver57.equals_CUT((java.lang.Object) linkedListTestDriver62);
        experiment.util.LinkedListTestDriver linkedListTestDriver70 = new experiment.util.LinkedListTestDriver();
        boolean boolean72 = linkedListTestDriver70.remove((java.lang.Object) 0.0f);
        boolean boolean74 = linkedListTestDriver70.remove((java.lang.Object) (short) 1);
        linkedListTestDriver70.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator77 = linkedListTestDriver70.iterator();
        java.lang.Object obj78 = linkedListTestDriver70.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver79 = new experiment.util.LinkedListTestDriver();
        boolean boolean81 = linkedListTestDriver79.add((java.lang.Object) 10L);
        linkedListTestDriver70.addFirst((java.lang.Object) boolean81);
        experiment.util.LinkedListTestDriver linkedListTestDriver83 = new experiment.util.LinkedListTestDriver();
        boolean boolean85 = linkedListTestDriver83.add((java.lang.Object) 10L);
        int int86 = linkedListTestDriver83.size();
        java.lang.Object obj87 = linkedListTestDriver83.getFirst();
        java.lang.Object[] objArray88 = linkedListTestDriver83.toArray();
        linkedListTestDriver70.addLast((java.lang.Object) objArray88);
        boolean boolean90 = linkedListTestDriver57.add((java.lang.Object) linkedListTestDriver70);
        java.lang.Class<?> wildcardClass91 = linkedListTestDriver70.getClass();
        boolean boolean92 = linkedListTestDriver5.contains((java.lang.Object) linkedListTestDriver70);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[100, 10]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (short) 100 + "'", obj22, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (short) 100 + "'", obj34, (short) 100);
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(iterator43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(iterator77);
        org.junit.Assert.assertEquals("'" + obj78 + "' != '" + (short) 100 + "'", obj78, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 1 + "'", int86 == 1);
        org.junit.Assert.assertEquals("'" + obj87 + "' != '" + 10L + "'", obj87, 10L);
        org.junit.Assert.assertNotNull(objArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray88), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray88), "[10]");
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(wildcardClass91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test195");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) 10L);
        linkedListTestDriver5.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray10 = linkedListTestDriver5.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver5);
        java.lang.Object obj12 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.remove((java.lang.Object) 0.0f);
        linkedListTestDriver13.clear();
        linkedListTestDriver13.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver18.add((java.lang.Object) 10L);
        linkedListTestDriver18.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray23 = linkedListTestDriver18.toArray();
        linkedListTestDriver13.addFirst((java.lang.Object) linkedListTestDriver18);
        java.lang.Object obj25 = linkedListTestDriver13.getLast();
        java.lang.Object obj26 = linkedListTestDriver13.getFirst();
        boolean boolean27 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver13);
        java.lang.Class<?> wildcardClass28 = linkedListTestDriver13.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[100, 10]");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[100, 10]");
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test196");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        java.lang.Object[] objArray5 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.add((java.lang.Object) 10L);
        linkedListTestDriver6.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray11 = linkedListTestDriver6.toArray();
        boolean boolean12 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver6);
        boolean boolean14 = linkedListTestDriver6.add((java.lang.Object) (byte) 10);
        boolean boolean16 = linkedListTestDriver6.add((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        boolean boolean19 = linkedListTestDriver17.add((java.lang.Object) 10L);
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        boolean boolean22 = linkedListTestDriver20.add((java.lang.Object) 10L);
        linkedListTestDriver20.addFirst((java.lang.Object) (short) 100);
        boolean boolean26 = linkedListTestDriver20.add((java.lang.Object) 10.0d);
        int int27 = linkedListTestDriver20.size();
        linkedListTestDriver20.addLast((java.lang.Object) (-1.0d));
        java.lang.Object obj30 = linkedListTestDriver20.removeLast();
        linkedListTestDriver17.addFirst((java.lang.Object) linkedListTestDriver20);
        linkedListTestDriver6.addLast((java.lang.Object) linkedListTestDriver20);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[100, 10]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (-1.0d) + "'", obj30, (-1.0d));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test197");
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
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test198");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) 10L);
        int int8 = linkedListTestDriver5.size();
        linkedListTestDriver5.clear();
        linkedListTestDriver5.addFirst((java.lang.Object) (short) 10);
        boolean boolean12 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.remove((java.lang.Object) 0.0f);
        boolean boolean17 = linkedListTestDriver13.remove((java.lang.Object) (short) 1);
        linkedListTestDriver13.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator20 = linkedListTestDriver13.iterator();
        linkedListTestDriver13.addLast((java.lang.Object) 100L);
        java.lang.Object obj23 = linkedListTestDriver13.removeLast();
        experiment.util.ListIterator listIterator25 = linkedListTestDriver13.listIterator((int) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        boolean boolean28 = linkedListTestDriver26.add((java.lang.Object) 10L);
        linkedListTestDriver13.addLast((java.lang.Object) boolean28);
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        boolean boolean32 = linkedListTestDriver30.remove((java.lang.Object) 0.0f);
        boolean boolean34 = linkedListTestDriver30.remove((java.lang.Object) (short) 1);
        linkedListTestDriver30.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator37 = linkedListTestDriver30.iterator();
        linkedListTestDriver30.addLast((java.lang.Object) 100L);
        java.lang.Object obj40 = linkedListTestDriver30.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver41 = new experiment.util.LinkedListTestDriver();
        boolean boolean43 = linkedListTestDriver41.remove((java.lang.Object) 0.0f);
        boolean boolean45 = linkedListTestDriver41.remove((java.lang.Object) (short) 1);
        linkedListTestDriver41.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator48 = linkedListTestDriver41.iterator();
        boolean boolean50 = linkedListTestDriver41.equals_CUT((java.lang.Object) (byte) 1);
        java.lang.Object obj51 = linkedListTestDriver41.getLast();
        java.lang.Object obj52 = linkedListTestDriver41.getLast();
        boolean boolean53 = linkedListTestDriver30.remove((java.lang.Object) linkedListTestDriver41);
        boolean boolean54 = linkedListTestDriver13.add((java.lang.Object) linkedListTestDriver41);
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver13);
        java.lang.Object[] objArray56 = linkedListTestDriver0.toArray();
        java.lang.Object obj57 = linkedListTestDriver0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj58 = linkedListTestDriver0.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100L + "'", obj23, 100L);
        org.junit.Assert.assertNotNull(listIterator25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 100L + "'", obj40, 100L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(iterator48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + (short) 100 + "'", obj51, (short) 100);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + (short) 100 + "'", obj52, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(obj57);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test199");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        linkedListTestDriver0.addFirst((java.lang.Object) (short) 100);
        boolean boolean6 = linkedListTestDriver0.add((java.lang.Object) 10.0d);
        boolean boolean7 = linkedListTestDriver0.isEmpty();
        java.lang.Object obj8 = linkedListTestDriver0.removeLast();
        java.lang.Object obj9 = linkedListTestDriver0.removeFirst();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 10.0d + "'", obj8, 10.0d);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) 100 + "'", obj9, (short) 100);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test200");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) 100L);
        java.lang.Object obj10 = linkedListTestDriver0.getLast();
        java.lang.Object obj11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = linkedListTestDriver0.equals_CUT(obj11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100L + "'", obj10, 100L);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test201");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        boolean boolean4 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.remove((java.lang.Object) 0.0f);
        boolean boolean9 = linkedListTestDriver5.remove((java.lang.Object) (short) 1);
        linkedListTestDriver5.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator12 = linkedListTestDriver5.iterator();
        linkedListTestDriver5.addLast((java.lang.Object) 100L);
        java.lang.Object obj15 = linkedListTestDriver5.removeLast();
        experiment.util.ListIterator listIterator17 = linkedListTestDriver5.listIterator((int) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver18.add((java.lang.Object) 10L);
        linkedListTestDriver5.addLast((java.lang.Object) boolean20);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        boolean boolean24 = linkedListTestDriver22.remove((java.lang.Object) 0.0f);
        boolean boolean26 = linkedListTestDriver22.remove((java.lang.Object) (short) 1);
        linkedListTestDriver22.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator29 = linkedListTestDriver22.iterator();
        linkedListTestDriver22.addLast((java.lang.Object) 100L);
        java.lang.Object obj32 = linkedListTestDriver22.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver33 = new experiment.util.LinkedListTestDriver();
        boolean boolean35 = linkedListTestDriver33.remove((java.lang.Object) 0.0f);
        boolean boolean37 = linkedListTestDriver33.remove((java.lang.Object) (short) 1);
        linkedListTestDriver33.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator40 = linkedListTestDriver33.iterator();
        boolean boolean42 = linkedListTestDriver33.equals_CUT((java.lang.Object) (byte) 1);
        java.lang.Object obj43 = linkedListTestDriver33.getLast();
        java.lang.Object obj44 = linkedListTestDriver33.getLast();
        boolean boolean45 = linkedListTestDriver22.remove((java.lang.Object) linkedListTestDriver33);
        boolean boolean46 = linkedListTestDriver5.add((java.lang.Object) linkedListTestDriver33);
        boolean boolean47 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver33);
        java.lang.Object obj48 = linkedListTestDriver0.removeLast();
        linkedListTestDriver0.clear();
        int int50 = linkedListTestDriver0.size();
        java.lang.Object obj51 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean52 = linkedListTestDriver0.contains(obj51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100L + "'", obj15, 100L);
        org.junit.Assert.assertNotNull(listIterator17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 100L + "'", obj32, 100L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(iterator40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (short) 100 + "'", obj43, (short) 100);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + (short) 100 + "'", obj44, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 10L + "'", obj48, 10L);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test202");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.remove((java.lang.Object) 0.0f);
        linkedListTestDriver5.clear();
        java.lang.Object[] objArray9 = linkedListTestDriver5.toArray();
        boolean boolean10 = linkedListTestDriver0.contains((java.lang.Object) objArray9);
        java.lang.Object[] objArray11 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        boolean boolean14 = linkedListTestDriver12.remove((java.lang.Object) 0.0f);
        boolean boolean16 = linkedListTestDriver12.remove((java.lang.Object) (short) 1);
        linkedListTestDriver12.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator19 = linkedListTestDriver12.iterator();
        boolean boolean20 = linkedListTestDriver12.isEmpty();
        experiment.util.Iterator iterator21 = linkedListTestDriver12.iterator();
        boolean boolean22 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver12);
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        boolean boolean25 = linkedListTestDriver23.remove((java.lang.Object) 0.0f);
        linkedListTestDriver23.clear();
        java.lang.Object[] objArray27 = linkedListTestDriver23.toArray();
        experiment.util.ListIterator listIterator29 = linkedListTestDriver23.listIterator(0);
        boolean boolean30 = linkedListTestDriver0.contains((java.lang.Object) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(listIterator29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test203");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        java.lang.Object[] objArray5 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.add((java.lang.Object) 10L);
        linkedListTestDriver6.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray11 = linkedListTestDriver6.toArray();
        boolean boolean12 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver6);
        boolean boolean14 = linkedListTestDriver6.add((java.lang.Object) (byte) 10);
        java.lang.Object obj16 = linkedListTestDriver6.remove(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = linkedListTestDriver6.get((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[100, 10]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 10L + "'", obj16, 10L);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test204");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        linkedListTestDriver0.addFirst((java.lang.Object) (short) 100);
        boolean boolean6 = linkedListTestDriver0.add((java.lang.Object) 10.0d);
        boolean boolean7 = linkedListTestDriver0.isEmpty();
        int int8 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.remove((java.lang.Object) 0.0f);
        boolean boolean13 = linkedListTestDriver9.remove((java.lang.Object) (short) 1);
        linkedListTestDriver9.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator16 = linkedListTestDriver9.iterator();
        boolean boolean18 = linkedListTestDriver9.equals_CUT((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        boolean boolean21 = linkedListTestDriver19.remove((java.lang.Object) 0.0f);
        boolean boolean23 = linkedListTestDriver19.remove((java.lang.Object) (short) 1);
        linkedListTestDriver19.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator26 = linkedListTestDriver19.iterator();
        java.lang.Object obj27 = linkedListTestDriver19.getLast();
        linkedListTestDriver9.addFirst(obj27);
        java.lang.Object obj29 = linkedListTestDriver9.removeFirst();
        java.lang.Object[] objArray30 = linkedListTestDriver9.toArray();
        boolean boolean31 = linkedListTestDriver0.remove((java.lang.Object) objArray30);
        java.lang.Class<?> wildcardClass32 = objArray30.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (short) 100 + "'", obj27, (short) 100);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (short) 100 + "'", obj29, (short) 100);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[100]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test205");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        boolean boolean9 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        boolean boolean12 = linkedListTestDriver10.remove((java.lang.Object) 0.0f);
        boolean boolean14 = linkedListTestDriver10.remove((java.lang.Object) (short) 1);
        linkedListTestDriver10.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator17 = linkedListTestDriver10.iterator();
        java.lang.Object obj18 = linkedListTestDriver10.getLast();
        linkedListTestDriver0.addFirst(obj18);
        java.lang.Object obj20 = linkedListTestDriver0.removeFirst();
        java.lang.Object obj21 = linkedListTestDriver0.getFirst();
        linkedListTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (short) 100 + "'", obj18, (short) 100);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (short) 100 + "'", obj20, (short) 100);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (short) 100 + "'", obj21, (short) 100);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test206");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        boolean boolean9 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver11.remove((java.lang.Object) 0.0f);
        linkedListTestDriver11.clear();
        linkedListTestDriver11.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        boolean boolean18 = linkedListTestDriver16.add((java.lang.Object) 10L);
        linkedListTestDriver16.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray21 = linkedListTestDriver16.toArray();
        linkedListTestDriver11.addFirst((java.lang.Object) linkedListTestDriver16);
        java.lang.Object obj23 = linkedListTestDriver11.getLast();
        boolean boolean24 = linkedListTestDriver0.remove(obj23);
        java.lang.Class<?> wildcardClass25 = obj23.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (short) 100 + "'", obj10, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[100, 10]");
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test207");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) 100L);
        java.lang.Object obj10 = linkedListTestDriver0.removeLast();
        experiment.util.ListIterator listIterator12 = linkedListTestDriver0.listIterator((int) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.add((java.lang.Object) 10L);
        linkedListTestDriver0.addLast((java.lang.Object) boolean15);
        java.lang.Object obj19 = linkedListTestDriver0.set(1, (java.lang.Object) (-1));
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        boolean boolean22 = linkedListTestDriver20.remove((java.lang.Object) 0.0f);
        boolean boolean24 = linkedListTestDriver20.remove((java.lang.Object) (short) 1);
        linkedListTestDriver20.addLast((java.lang.Object) (short) 100);
        java.lang.Object obj27 = linkedListTestDriver20.removeFirst();
        linkedListTestDriver20.clear();
        boolean boolean29 = linkedListTestDriver20.isEmpty();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver20);
        java.lang.Object obj32 = linkedListTestDriver0.get(1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100L + "'", obj10, 100L);
        org.junit.Assert.assertNotNull(listIterator12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + true + "'", obj19, true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (short) 100 + "'", obj27, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (-1) + "'", obj32, (-1));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test208");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) 10L);
        linkedListTestDriver5.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray10 = linkedListTestDriver5.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = linkedListTestDriver5.remove(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[100, 10]");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test209");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        linkedListTestDriver0.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray5 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.remove((java.lang.Object) 0.0f);
        linkedListTestDriver6.clear();
        linkedListTestDriver6.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver11.add((java.lang.Object) 10L);
        linkedListTestDriver11.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray16 = linkedListTestDriver11.toArray();
        linkedListTestDriver6.addFirst((java.lang.Object) linkedListTestDriver11);
        boolean boolean18 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver6);
        linkedListTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, 10]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[100, 10]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test210");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        boolean boolean4 = linkedListTestDriver0.isEmpty();
        boolean boolean6 = linkedListTestDriver0.contains((java.lang.Object) (byte) 100);
        experiment.util.ListIterator listIterator8 = linkedListTestDriver0.listIterator((int) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.add((java.lang.Object) 10L);
        int int12 = linkedListTestDriver9.size();
        linkedListTestDriver9.clear();
        linkedListTestDriver9.addFirst((java.lang.Object) (short) 10);
        java.lang.Object obj16 = linkedListTestDriver9.getLast();
        experiment.util.Iterator iterator17 = linkedListTestDriver9.iterator();
        boolean boolean18 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(listIterator8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) 10 + "'", obj16, (short) 10);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test211");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) 10L);
        linkedListTestDriver5.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray10 = linkedListTestDriver5.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver5);
        boolean boolean13 = linkedListTestDriver5.contains((java.lang.Object) '4');
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        boolean boolean17 = linkedListTestDriver15.remove((java.lang.Object) 0.0f);
        boolean boolean19 = linkedListTestDriver15.remove((java.lang.Object) (short) 1);
        linkedListTestDriver15.addLast((java.lang.Object) (short) 100);
        java.lang.Object obj22 = linkedListTestDriver15.removeFirst();
        linkedListTestDriver15.clear();
        boolean boolean24 = linkedListTestDriver15.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        boolean boolean27 = linkedListTestDriver25.remove((java.lang.Object) 0.0f);
        boolean boolean29 = linkedListTestDriver25.remove((java.lang.Object) (short) 1);
        linkedListTestDriver25.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator32 = linkedListTestDriver25.iterator();
        boolean boolean33 = linkedListTestDriver25.isEmpty();
        java.lang.Object obj34 = linkedListTestDriver25.removeLast();
        experiment.util.Iterator iterator35 = linkedListTestDriver25.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver36 = new experiment.util.LinkedListTestDriver();
        boolean boolean38 = linkedListTestDriver36.remove((java.lang.Object) 0.0f);
        boolean boolean40 = linkedListTestDriver36.remove((java.lang.Object) (short) 1);
        linkedListTestDriver36.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator43 = linkedListTestDriver36.iterator();
        linkedListTestDriver25.addLast((java.lang.Object) iterator43);
        boolean boolean46 = linkedListTestDriver25.equals_CUT((java.lang.Object) (-1.0f));
        boolean boolean47 = linkedListTestDriver25.isEmpty();
        linkedListTestDriver15.addFirst((java.lang.Object) linkedListTestDriver25);
        experiment.util.LinkedListTestDriver linkedListTestDriver49 = new experiment.util.LinkedListTestDriver();
        boolean boolean51 = linkedListTestDriver49.add((java.lang.Object) 10L);
        int int52 = linkedListTestDriver49.size();
        linkedListTestDriver49.clear();
        int int54 = linkedListTestDriver49.size();
        boolean boolean55 = linkedListTestDriver25.add((java.lang.Object) linkedListTestDriver49);
        linkedListTestDriver5.add((int) (short) 1, (java.lang.Object) linkedListTestDriver49);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj57 = linkedListTestDriver49.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[100, 10]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (short) 100 + "'", obj22, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (short) 100 + "'", obj34, (short) 100);
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(iterator43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test212");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        boolean boolean9 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = linkedListTestDriver0.getLast();
        java.lang.Object obj11 = linkedListTestDriver0.getLast();
        experiment.util.Iterator iterator12 = linkedListTestDriver0.iterator();
        boolean boolean13 = linkedListTestDriver0.isEmpty();
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = linkedListTestDriver0.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (short) 100 + "'", obj10, (short) 100);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) 100 + "'", obj11, (short) 100);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test213");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        linkedListTestDriver0.addFirst((java.lang.Object) (short) 100);
        java.lang.Object obj5 = linkedListTestDriver0.removeLast();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        linkedListTestDriver0.addFirst((java.lang.Object) '4');
        java.lang.Object obj9 = linkedListTestDriver0.getFirst();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10L + "'", obj5, 10L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '4' + "'", obj9, '4');
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test214");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) 100L);
        java.lang.Object obj10 = linkedListTestDriver0.removeLast();
        experiment.util.ListIterator listIterator12 = linkedListTestDriver0.listIterator((int) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.add((java.lang.Object) 10L);
        linkedListTestDriver0.addLast((java.lang.Object) boolean15);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        boolean boolean19 = linkedListTestDriver17.remove((java.lang.Object) 0.0f);
        boolean boolean21 = linkedListTestDriver17.remove((java.lang.Object) (short) 1);
        linkedListTestDriver17.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator24 = linkedListTestDriver17.iterator();
        linkedListTestDriver17.addLast((java.lang.Object) 100L);
        java.lang.Object obj27 = linkedListTestDriver17.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        boolean boolean30 = linkedListTestDriver28.remove((java.lang.Object) 0.0f);
        boolean boolean32 = linkedListTestDriver28.remove((java.lang.Object) (short) 1);
        linkedListTestDriver28.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator35 = linkedListTestDriver28.iterator();
        boolean boolean37 = linkedListTestDriver28.equals_CUT((java.lang.Object) (byte) 1);
        java.lang.Object obj38 = linkedListTestDriver28.getLast();
        java.lang.Object obj39 = linkedListTestDriver28.getLast();
        boolean boolean40 = linkedListTestDriver17.remove((java.lang.Object) linkedListTestDriver28);
        boolean boolean41 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver28);
        java.lang.Object obj42 = linkedListTestDriver0.removeFirst();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100L + "'", obj10, 100L);
        org.junit.Assert.assertNotNull(listIterator12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 100L + "'", obj27, 100L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (short) 100 + "'", obj38, (short) 100);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (short) 100 + "'", obj39, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (short) 100 + "'", obj42, (short) 100);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test215");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        boolean boolean8 = linkedListTestDriver0.isEmpty();
        java.lang.Object obj9 = linkedListTestDriver0.removeLast();
        experiment.util.Iterator iterator10 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver11.remove((java.lang.Object) 0.0f);
        boolean boolean15 = linkedListTestDriver11.remove((java.lang.Object) (short) 1);
        linkedListTestDriver11.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator18 = linkedListTestDriver11.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) iterator18);
        boolean boolean21 = linkedListTestDriver0.equals_CUT((java.lang.Object) (-1.0f));
        java.lang.Object obj22 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        boolean boolean25 = linkedListTestDriver23.remove((java.lang.Object) 0.0f);
        boolean boolean27 = linkedListTestDriver23.remove((java.lang.Object) (short) 1);
        linkedListTestDriver23.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator30 = linkedListTestDriver23.iterator();
        linkedListTestDriver23.addLast((java.lang.Object) 100L);
        java.lang.Object obj33 = linkedListTestDriver23.removeLast();
        experiment.util.ListIterator listIterator35 = linkedListTestDriver23.listIterator((int) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver36 = new experiment.util.LinkedListTestDriver();
        boolean boolean38 = linkedListTestDriver36.add((java.lang.Object) 10L);
        linkedListTestDriver23.addLast((java.lang.Object) boolean38);
        java.lang.Object obj42 = linkedListTestDriver23.set(1, (java.lang.Object) (-1));
        experiment.util.LinkedListTestDriver linkedListTestDriver44 = new experiment.util.LinkedListTestDriver();
        boolean boolean46 = linkedListTestDriver44.remove((java.lang.Object) 0.0f);
        linkedListTestDriver44.clear();
        linkedListTestDriver44.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver49 = new experiment.util.LinkedListTestDriver();
        boolean boolean51 = linkedListTestDriver49.add((java.lang.Object) 10L);
        linkedListTestDriver49.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray54 = linkedListTestDriver49.toArray();
        linkedListTestDriver44.addFirst((java.lang.Object) linkedListTestDriver49);
        java.lang.Object[] objArray56 = linkedListTestDriver44.toArray();
        linkedListTestDriver23.add(0, (java.lang.Object) linkedListTestDriver44);
        java.lang.Object[] objArray58 = linkedListTestDriver23.toArray();
        boolean boolean59 = linkedListTestDriver0.remove((java.lang.Object) objArray58);
        experiment.util.Iterator iterator60 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver61 = new experiment.util.LinkedListTestDriver();
        boolean boolean63 = linkedListTestDriver61.remove((java.lang.Object) 0.0f);
        boolean boolean65 = linkedListTestDriver61.remove((java.lang.Object) (short) 1);
        linkedListTestDriver61.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator68 = linkedListTestDriver61.iterator();
        boolean boolean69 = linkedListTestDriver61.isEmpty();
        experiment.util.Iterator iterator70 = linkedListTestDriver61.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver71 = new experiment.util.LinkedListTestDriver();
        boolean boolean73 = linkedListTestDriver71.add((java.lang.Object) 10L);
        int int74 = linkedListTestDriver71.size();
        linkedListTestDriver71.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver76 = new experiment.util.LinkedListTestDriver();
        boolean boolean78 = linkedListTestDriver76.add((java.lang.Object) 10L);
        int int79 = linkedListTestDriver76.size();
        linkedListTestDriver76.clear();
        linkedListTestDriver76.addFirst((java.lang.Object) (short) 10);
        boolean boolean83 = linkedListTestDriver71.equals_CUT((java.lang.Object) linkedListTestDriver76);
        boolean boolean84 = linkedListTestDriver61.contains((java.lang.Object) boolean83);
        java.lang.Class<?> wildcardClass85 = linkedListTestDriver61.getClass();
        boolean boolean86 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver61);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) 100 + "'", obj9, (short) 100);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 100L + "'", obj33, 100L);
        org.junit.Assert.assertNotNull(listIterator35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + true + "'", obj42, true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[100, 10]");
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(iterator60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(iterator68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(iterator70);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 1 + "'", int79 == 1);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(wildcardClass85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test216");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        linkedListTestDriver0.addFirst((java.lang.Object) (short) 100);
        boolean boolean6 = linkedListTestDriver0.add((java.lang.Object) 10.0d);
        int int7 = linkedListTestDriver0.size();
        java.lang.Object[] objArray8 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.remove((java.lang.Object) 0.0f);
        boolean boolean13 = linkedListTestDriver9.remove((java.lang.Object) (short) 1);
        linkedListTestDriver9.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator16 = linkedListTestDriver9.iterator();
        boolean boolean17 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver9);
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver18.add((java.lang.Object) 10L);
        int int21 = linkedListTestDriver18.size();
        boolean boolean22 = linkedListTestDriver18.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        boolean boolean25 = linkedListTestDriver23.remove((java.lang.Object) 0.0f);
        boolean boolean27 = linkedListTestDriver23.remove((java.lang.Object) (short) 1);
        linkedListTestDriver23.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator30 = linkedListTestDriver23.iterator();
        linkedListTestDriver23.addLast((java.lang.Object) 100L);
        java.lang.Object obj33 = linkedListTestDriver23.removeLast();
        experiment.util.ListIterator listIterator35 = linkedListTestDriver23.listIterator((int) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver36 = new experiment.util.LinkedListTestDriver();
        boolean boolean38 = linkedListTestDriver36.add((java.lang.Object) 10L);
        linkedListTestDriver23.addLast((java.lang.Object) boolean38);
        experiment.util.LinkedListTestDriver linkedListTestDriver40 = new experiment.util.LinkedListTestDriver();
        boolean boolean42 = linkedListTestDriver40.remove((java.lang.Object) 0.0f);
        boolean boolean44 = linkedListTestDriver40.remove((java.lang.Object) (short) 1);
        linkedListTestDriver40.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator47 = linkedListTestDriver40.iterator();
        linkedListTestDriver40.addLast((java.lang.Object) 100L);
        java.lang.Object obj50 = linkedListTestDriver40.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver51 = new experiment.util.LinkedListTestDriver();
        boolean boolean53 = linkedListTestDriver51.remove((java.lang.Object) 0.0f);
        boolean boolean55 = linkedListTestDriver51.remove((java.lang.Object) (short) 1);
        linkedListTestDriver51.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator58 = linkedListTestDriver51.iterator();
        boolean boolean60 = linkedListTestDriver51.equals_CUT((java.lang.Object) (byte) 1);
        java.lang.Object obj61 = linkedListTestDriver51.getLast();
        java.lang.Object obj62 = linkedListTestDriver51.getLast();
        boolean boolean63 = linkedListTestDriver40.remove((java.lang.Object) linkedListTestDriver51);
        boolean boolean64 = linkedListTestDriver23.add((java.lang.Object) linkedListTestDriver51);
        boolean boolean65 = linkedListTestDriver18.remove((java.lang.Object) linkedListTestDriver51);
        boolean boolean66 = linkedListTestDriver51.isEmpty();
        java.lang.Object obj67 = linkedListTestDriver51.getLast();
        experiment.util.Iterator iterator68 = linkedListTestDriver51.iterator();
        java.lang.Class<?> wildcardClass69 = linkedListTestDriver51.getClass();
        boolean boolean70 = linkedListTestDriver0.contains((java.lang.Object) wildcardClass69);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100, 10, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100, 10, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 100L + "'", obj33, 100L);
        org.junit.Assert.assertNotNull(listIterator35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(iterator47);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 100L + "'", obj50, 100L);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(iterator58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + (short) 100 + "'", obj61, (short) 100);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + (short) 100 + "'", obj62, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + (short) 100 + "'", obj67, (short) 100);
        org.junit.Assert.assertNotNull(iterator68);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test217");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        linkedListTestDriver0.addFirst((java.lang.Object) (short) 100);
        boolean boolean6 = linkedListTestDriver0.add((java.lang.Object) 10.0d);
        java.lang.Object obj7 = linkedListTestDriver0.getLast();
        java.lang.Object obj8 = linkedListTestDriver0.removeLast();
        experiment.util.ListIterator listIterator10 = linkedListTestDriver0.listIterator((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 10.0d + "'", obj7, 10.0d);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 10.0d + "'", obj8, 10.0d);
        org.junit.Assert.assertNotNull(listIterator10);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test218");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        java.lang.Object[] objArray5 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.add((java.lang.Object) 10L);
        linkedListTestDriver6.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray11 = linkedListTestDriver6.toArray();
        boolean boolean12 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver6);
        boolean boolean14 = linkedListTestDriver6.add((java.lang.Object) (byte) 10);
        java.lang.Object obj15 = linkedListTestDriver6.removeLast();
        int int16 = linkedListTestDriver6.size();
        int int17 = linkedListTestDriver6.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = linkedListTestDriver6.get((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[100, 10]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) 10 + "'", obj15, (byte) 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test219");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) 10L);
        int int8 = linkedListTestDriver5.size();
        linkedListTestDriver5.clear();
        linkedListTestDriver5.addFirst((java.lang.Object) (short) 10);
        boolean boolean12 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.remove((java.lang.Object) 0.0f);
        boolean boolean17 = linkedListTestDriver13.remove((java.lang.Object) (short) 1);
        linkedListTestDriver13.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator20 = linkedListTestDriver13.iterator();
        java.lang.Object obj21 = linkedListTestDriver13.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        boolean boolean24 = linkedListTestDriver22.add((java.lang.Object) 10L);
        linkedListTestDriver13.addFirst((java.lang.Object) boolean24);
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        boolean boolean28 = linkedListTestDriver26.add((java.lang.Object) 10L);
        int int29 = linkedListTestDriver26.size();
        java.lang.Object obj30 = linkedListTestDriver26.getFirst();
        java.lang.Object[] objArray31 = linkedListTestDriver26.toArray();
        linkedListTestDriver13.addLast((java.lang.Object) objArray31);
        boolean boolean33 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver13);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator35 = linkedListTestDriver0.listIterator((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 97; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (short) 100 + "'", obj21, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 10L + "'", obj30, 10L);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[10]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test220");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        linkedListTestDriver0.addFirst((java.lang.Object) (short) 100);
        boolean boolean6 = linkedListTestDriver0.add((java.lang.Object) 10.0d);
        boolean boolean7 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        boolean boolean10 = linkedListTestDriver8.add((java.lang.Object) 10L);
        int int11 = linkedListTestDriver8.size();
        boolean boolean12 = linkedListTestDriver8.isEmpty();
        boolean boolean14 = linkedListTestDriver8.contains((java.lang.Object) (byte) 100);
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver8);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        boolean boolean19 = linkedListTestDriver17.add((java.lang.Object) 10L);
        int int20 = linkedListTestDriver17.size();
        linkedListTestDriver17.clear();
        java.lang.Class<?> wildcardClass22 = linkedListTestDriver17.getClass();
        linkedListTestDriver0.add(0, (java.lang.Object) linkedListTestDriver17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = linkedListTestDriver17.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test221");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) 10L);
        linkedListTestDriver5.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray10 = linkedListTestDriver5.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver5);
        boolean boolean13 = linkedListTestDriver5.contains((java.lang.Object) '4');
        int int14 = linkedListTestDriver5.size();
        java.lang.Object obj15 = linkedListTestDriver5.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        boolean boolean18 = linkedListTestDriver16.add((java.lang.Object) 10L);
        int int19 = linkedListTestDriver16.size();
        boolean boolean20 = linkedListTestDriver16.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        boolean boolean23 = linkedListTestDriver21.remove((java.lang.Object) 0.0f);
        boolean boolean25 = linkedListTestDriver21.remove((java.lang.Object) (short) 1);
        linkedListTestDriver21.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator28 = linkedListTestDriver21.iterator();
        linkedListTestDriver21.addLast((java.lang.Object) 100L);
        java.lang.Object obj31 = linkedListTestDriver21.removeLast();
        experiment.util.ListIterator listIterator33 = linkedListTestDriver21.listIterator((int) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        boolean boolean36 = linkedListTestDriver34.add((java.lang.Object) 10L);
        linkedListTestDriver21.addLast((java.lang.Object) boolean36);
        experiment.util.LinkedListTestDriver linkedListTestDriver38 = new experiment.util.LinkedListTestDriver();
        boolean boolean40 = linkedListTestDriver38.remove((java.lang.Object) 0.0f);
        boolean boolean42 = linkedListTestDriver38.remove((java.lang.Object) (short) 1);
        linkedListTestDriver38.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator45 = linkedListTestDriver38.iterator();
        linkedListTestDriver38.addLast((java.lang.Object) 100L);
        java.lang.Object obj48 = linkedListTestDriver38.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver49 = new experiment.util.LinkedListTestDriver();
        boolean boolean51 = linkedListTestDriver49.remove((java.lang.Object) 0.0f);
        boolean boolean53 = linkedListTestDriver49.remove((java.lang.Object) (short) 1);
        linkedListTestDriver49.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator56 = linkedListTestDriver49.iterator();
        boolean boolean58 = linkedListTestDriver49.equals_CUT((java.lang.Object) (byte) 1);
        java.lang.Object obj59 = linkedListTestDriver49.getLast();
        java.lang.Object obj60 = linkedListTestDriver49.getLast();
        boolean boolean61 = linkedListTestDriver38.remove((java.lang.Object) linkedListTestDriver49);
        boolean boolean62 = linkedListTestDriver21.add((java.lang.Object) linkedListTestDriver49);
        boolean boolean63 = linkedListTestDriver16.remove((java.lang.Object) linkedListTestDriver49);
        experiment.util.LinkedListTestDriver linkedListTestDriver64 = new experiment.util.LinkedListTestDriver();
        boolean boolean66 = linkedListTestDriver64.add((java.lang.Object) 10L);
        int int67 = linkedListTestDriver64.size();
        linkedListTestDriver64.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver69 = new experiment.util.LinkedListTestDriver();
        boolean boolean71 = linkedListTestDriver69.remove((java.lang.Object) 0.0f);
        linkedListTestDriver69.clear();
        java.lang.Object[] objArray73 = linkedListTestDriver69.toArray();
        boolean boolean74 = linkedListTestDriver64.contains((java.lang.Object) objArray73);
        java.lang.Object[] objArray75 = linkedListTestDriver64.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver76 = new experiment.util.LinkedListTestDriver();
        boolean boolean78 = linkedListTestDriver76.remove((java.lang.Object) 0.0f);
        boolean boolean80 = linkedListTestDriver76.remove((java.lang.Object) (short) 1);
        linkedListTestDriver76.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator83 = linkedListTestDriver76.iterator();
        boolean boolean84 = linkedListTestDriver76.isEmpty();
        experiment.util.Iterator iterator85 = linkedListTestDriver76.iterator();
        boolean boolean86 = linkedListTestDriver64.equals_CUT((java.lang.Object) linkedListTestDriver76);
        boolean boolean87 = linkedListTestDriver49.equals_CUT((java.lang.Object) linkedListTestDriver76);
        linkedListTestDriver5.addLast((java.lang.Object) linkedListTestDriver76);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[100, 10]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 10L + "'", obj15, 10L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 100L + "'", obj31, 100L);
        org.junit.Assert.assertNotNull(listIterator33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(iterator45);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 100L + "'", obj48, 100L);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(iterator56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + (short) 100 + "'", obj59, (short) 100);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + (short) 100 + "'", obj60, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray73), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray73), "[]");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray75), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray75), "[]");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(iterator83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(iterator85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test222");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        linkedListTestDriver0.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray5 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.remove((java.lang.Object) 0.0f);
        linkedListTestDriver6.clear();
        linkedListTestDriver6.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver11.add((java.lang.Object) 10L);
        linkedListTestDriver11.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray16 = linkedListTestDriver11.toArray();
        linkedListTestDriver6.addFirst((java.lang.Object) linkedListTestDriver11);
        boolean boolean18 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver6);
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        boolean boolean21 = linkedListTestDriver19.add((java.lang.Object) 10L);
        linkedListTestDriver19.addFirst((java.lang.Object) (short) 100);
        java.lang.Object obj24 = linkedListTestDriver19.getLast();
        boolean boolean26 = linkedListTestDriver19.contains((java.lang.Object) (byte) 10);
        boolean boolean27 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver19);
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        boolean boolean31 = linkedListTestDriver29.add((java.lang.Object) 10L);
        linkedListTestDriver0.add(0, (java.lang.Object) 10L);
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        boolean boolean36 = linkedListTestDriver34.remove((java.lang.Object) 0.0f);
        boolean boolean38 = linkedListTestDriver34.remove((java.lang.Object) (short) 1);
        linkedListTestDriver34.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator41 = linkedListTestDriver34.iterator();
        boolean boolean43 = linkedListTestDriver34.equals_CUT((java.lang.Object) (byte) 1);
        java.lang.Object obj44 = linkedListTestDriver34.getLast();
        java.lang.Object obj45 = linkedListTestDriver34.getLast();
        experiment.util.Iterator iterator46 = linkedListTestDriver34.iterator();
        boolean boolean47 = linkedListTestDriver34.isEmpty();
        linkedListTestDriver34.clear();
        linkedListTestDriver0.add(0, (java.lang.Object) linkedListTestDriver34);
        experiment.util.LinkedListTestDriver linkedListTestDriver50 = new experiment.util.LinkedListTestDriver();
        boolean boolean52 = linkedListTestDriver50.remove((java.lang.Object) 0.0f);
        boolean boolean54 = linkedListTestDriver50.remove((java.lang.Object) (short) 1);
        linkedListTestDriver50.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator57 = linkedListTestDriver50.iterator();
        boolean boolean59 = linkedListTestDriver50.equals_CUT((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver60 = new experiment.util.LinkedListTestDriver();
        boolean boolean62 = linkedListTestDriver60.remove((java.lang.Object) 0.0f);
        boolean boolean64 = linkedListTestDriver60.remove((java.lang.Object) (short) 1);
        linkedListTestDriver60.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator67 = linkedListTestDriver60.iterator();
        java.lang.Object obj68 = linkedListTestDriver60.getLast();
        linkedListTestDriver50.addFirst(obj68);
        java.lang.Class<?> wildcardClass70 = obj68.getClass();
        boolean boolean71 = linkedListTestDriver34.equals_CUT(obj68);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj72 = linkedListTestDriver34.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, 10]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[100, 10]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 10L + "'", obj24, 10L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(iterator41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + (short) 100 + "'", obj44, (short) 100);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (short) 100 + "'", obj45, (short) 100);
        org.junit.Assert.assertNotNull(iterator46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(iterator57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(iterator67);
        org.junit.Assert.assertEquals("'" + obj68 + "' != '" + (short) 100 + "'", obj68, (short) 100);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test223");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        linkedListTestDriver0.addFirst((java.lang.Object) (short) 100);
        boolean boolean6 = linkedListTestDriver0.add((java.lang.Object) 10.0d);
        boolean boolean7 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        boolean boolean10 = linkedListTestDriver8.add((java.lang.Object) 10L);
        int int11 = linkedListTestDriver8.size();
        boolean boolean12 = linkedListTestDriver8.isEmpty();
        boolean boolean14 = linkedListTestDriver8.contains((java.lang.Object) (byte) 100);
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver8);
        java.lang.Object obj16 = linkedListTestDriver0.getFirst();
        java.lang.Object[] objArray17 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver18.remove((java.lang.Object) 0.0f);
        boolean boolean22 = linkedListTestDriver18.remove((java.lang.Object) (short) 1);
        linkedListTestDriver18.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator25 = linkedListTestDriver18.iterator();
        boolean boolean27 = linkedListTestDriver18.equals_CUT((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        boolean boolean30 = linkedListTestDriver28.remove((java.lang.Object) 0.0f);
        boolean boolean32 = linkedListTestDriver28.remove((java.lang.Object) (short) 1);
        linkedListTestDriver28.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator35 = linkedListTestDriver28.iterator();
        java.lang.Object obj36 = linkedListTestDriver28.getLast();
        linkedListTestDriver18.addFirst(obj36);
        java.lang.Object obj38 = linkedListTestDriver18.removeFirst();
        java.lang.Object obj39 = linkedListTestDriver18.getFirst();
        boolean boolean41 = linkedListTestDriver18.add((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) boolean41);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator44 = linkedListTestDriver0.listIterator((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 100; size: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) 100 + "'", obj16, (short) 100);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (short) 100 + "'", obj36, (short) 100);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (short) 100 + "'", obj38, (short) 100);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (short) 100 + "'", obj39, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test224");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        linkedListTestDriver0.addFirst((java.lang.Object) (short) 100);
        boolean boolean6 = linkedListTestDriver0.add((java.lang.Object) 10.0d);
        int int7 = linkedListTestDriver0.size();
        linkedListTestDriver0.addLast((java.lang.Object) (-1.0d));
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        boolean boolean12 = linkedListTestDriver10.add((java.lang.Object) 10L);
        linkedListTestDriver10.addFirst((java.lang.Object) (short) 100);
        java.lang.Object obj15 = linkedListTestDriver10.getLast();
        boolean boolean16 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver10);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        boolean boolean19 = linkedListTestDriver17.add((java.lang.Object) 10L);
        linkedListTestDriver17.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray22 = linkedListTestDriver17.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        boolean boolean25 = linkedListTestDriver23.remove((java.lang.Object) 0.0f);
        linkedListTestDriver23.clear();
        linkedListTestDriver23.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        boolean boolean30 = linkedListTestDriver28.add((java.lang.Object) 10L);
        linkedListTestDriver28.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray33 = linkedListTestDriver28.toArray();
        linkedListTestDriver23.addFirst((java.lang.Object) linkedListTestDriver28);
        boolean boolean35 = linkedListTestDriver17.contains((java.lang.Object) linkedListTestDriver23);
        experiment.util.LinkedListTestDriver linkedListTestDriver36 = new experiment.util.LinkedListTestDriver();
        boolean boolean38 = linkedListTestDriver36.add((java.lang.Object) 10L);
        linkedListTestDriver36.addFirst((java.lang.Object) (short) 100);
        java.lang.Object obj41 = linkedListTestDriver36.getLast();
        boolean boolean43 = linkedListTestDriver36.contains((java.lang.Object) (byte) 10);
        boolean boolean44 = linkedListTestDriver17.remove((java.lang.Object) linkedListTestDriver36);
        experiment.util.LinkedListTestDriver linkedListTestDriver46 = new experiment.util.LinkedListTestDriver();
        boolean boolean48 = linkedListTestDriver46.add((java.lang.Object) 10L);
        linkedListTestDriver17.add(0, (java.lang.Object) 10L);
        experiment.util.LinkedListTestDriver linkedListTestDriver51 = new experiment.util.LinkedListTestDriver();
        boolean boolean53 = linkedListTestDriver51.remove((java.lang.Object) 0.0f);
        boolean boolean55 = linkedListTestDriver51.remove((java.lang.Object) (short) 1);
        linkedListTestDriver51.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator58 = linkedListTestDriver51.iterator();
        boolean boolean60 = linkedListTestDriver51.equals_CUT((java.lang.Object) (byte) 1);
        java.lang.Object obj61 = linkedListTestDriver51.getLast();
        java.lang.Object obj62 = linkedListTestDriver51.getLast();
        experiment.util.Iterator iterator63 = linkedListTestDriver51.iterator();
        boolean boolean64 = linkedListTestDriver51.isEmpty();
        linkedListTestDriver51.clear();
        linkedListTestDriver17.add(0, (java.lang.Object) linkedListTestDriver51);
        boolean boolean67 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver51);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 10L + "'", obj15, 10L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[100, 10]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[100, 10]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 10L + "'", obj41, 10L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(iterator58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + (short) 100 + "'", obj61, (short) 100);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + (short) 100 + "'", obj62, (short) 100);
        org.junit.Assert.assertNotNull(iterator63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test225");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        java.lang.Object obj8 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.add((java.lang.Object) 10L);
        linkedListTestDriver0.addFirst((java.lang.Object) boolean11);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.add((java.lang.Object) 10L);
        int int16 = linkedListTestDriver13.size();
        java.lang.Object obj17 = linkedListTestDriver13.getFirst();
        java.lang.Object[] objArray18 = linkedListTestDriver13.toArray();
        linkedListTestDriver0.addLast((java.lang.Object) objArray18);
        java.lang.Object obj21 = linkedListTestDriver0.get((int) (short) 0);
        boolean boolean23 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        java.lang.Object obj24 = linkedListTestDriver0.removeFirst();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 100 + "'", obj8, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 10L + "'", obj17, 10L);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[10]");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + true + "'", obj21, true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + true + "'", obj24, true);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test226");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        boolean boolean4 = linkedListTestDriver0.isEmpty();
        boolean boolean6 = linkedListTestDriver0.contains((java.lang.Object) (byte) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.add((java.lang.Object) 10L);
        linkedListTestDriver7.addFirst((java.lang.Object) (short) 100);
        boolean boolean13 = linkedListTestDriver7.add((java.lang.Object) 10.0d);
        boolean boolean14 = linkedListTestDriver7.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        boolean boolean17 = linkedListTestDriver15.add((java.lang.Object) 10L);
        int int18 = linkedListTestDriver15.size();
        boolean boolean19 = linkedListTestDriver15.isEmpty();
        boolean boolean21 = linkedListTestDriver15.contains((java.lang.Object) (byte) 100);
        linkedListTestDriver7.addLast((java.lang.Object) linkedListTestDriver15);
        boolean boolean23 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver15);
        java.lang.Object obj24 = linkedListTestDriver15.getLast();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 10L + "'", obj24, 10L);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test227");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addFirst((java.lang.Object) (short) 10);
        linkedListTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test228");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        java.lang.Object obj7 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        boolean boolean10 = linkedListTestDriver8.add((java.lang.Object) 10L);
        int int11 = linkedListTestDriver8.size();
        boolean boolean12 = linkedListTestDriver8.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.remove((java.lang.Object) 0.0f);
        boolean boolean17 = linkedListTestDriver13.remove((java.lang.Object) (short) 1);
        linkedListTestDriver13.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator20 = linkedListTestDriver13.iterator();
        linkedListTestDriver13.addLast((java.lang.Object) 100L);
        java.lang.Object obj23 = linkedListTestDriver13.removeLast();
        experiment.util.ListIterator listIterator25 = linkedListTestDriver13.listIterator((int) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        boolean boolean28 = linkedListTestDriver26.add((java.lang.Object) 10L);
        linkedListTestDriver13.addLast((java.lang.Object) boolean28);
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        boolean boolean32 = linkedListTestDriver30.remove((java.lang.Object) 0.0f);
        boolean boolean34 = linkedListTestDriver30.remove((java.lang.Object) (short) 1);
        linkedListTestDriver30.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator37 = linkedListTestDriver30.iterator();
        linkedListTestDriver30.addLast((java.lang.Object) 100L);
        java.lang.Object obj40 = linkedListTestDriver30.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver41 = new experiment.util.LinkedListTestDriver();
        boolean boolean43 = linkedListTestDriver41.remove((java.lang.Object) 0.0f);
        boolean boolean45 = linkedListTestDriver41.remove((java.lang.Object) (short) 1);
        linkedListTestDriver41.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator48 = linkedListTestDriver41.iterator();
        boolean boolean50 = linkedListTestDriver41.equals_CUT((java.lang.Object) (byte) 1);
        java.lang.Object obj51 = linkedListTestDriver41.getLast();
        java.lang.Object obj52 = linkedListTestDriver41.getLast();
        boolean boolean53 = linkedListTestDriver30.remove((java.lang.Object) linkedListTestDriver41);
        boolean boolean54 = linkedListTestDriver13.add((java.lang.Object) linkedListTestDriver41);
        boolean boolean55 = linkedListTestDriver8.remove((java.lang.Object) linkedListTestDriver41);
        java.lang.Object obj56 = linkedListTestDriver8.removeLast();
        linkedListTestDriver8.clear();
        int int58 = linkedListTestDriver8.size();
        boolean boolean59 = linkedListTestDriver0.remove((java.lang.Object) int58);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) 100 + "'", obj7, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100L + "'", obj23, 100L);
        org.junit.Assert.assertNotNull(listIterator25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 100L + "'", obj40, 100L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(iterator48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + (short) 100 + "'", obj51, (short) 100);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + (short) 100 + "'", obj52, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + 10L + "'", obj56, 10L);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test229");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        linkedListTestDriver0.addFirst((java.lang.Object) (short) 100);
        boolean boolean6 = linkedListTestDriver0.add((java.lang.Object) 10.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.remove((java.lang.Object) 0.0f);
        boolean boolean11 = linkedListTestDriver7.remove((java.lang.Object) (short) 1);
        linkedListTestDriver7.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator14 = linkedListTestDriver7.iterator();
        boolean boolean16 = linkedListTestDriver7.equals_CUT((java.lang.Object) (byte) 1);
        java.lang.Object obj17 = linkedListTestDriver7.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver18.remove((java.lang.Object) 0.0f);
        boolean boolean22 = linkedListTestDriver18.remove((java.lang.Object) (short) 1);
        linkedListTestDriver18.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator25 = linkedListTestDriver18.iterator();
        linkedListTestDriver18.addLast((java.lang.Object) 100L);
        java.lang.Object obj28 = linkedListTestDriver18.getLast();
        boolean boolean29 = linkedListTestDriver7.contains(obj28);
        linkedListTestDriver0.addLast((java.lang.Object) boolean29);
        java.lang.Object[] objArray31 = linkedListTestDriver0.toArray();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) 100 + "'", obj17, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 100L + "'", obj28, 100L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[100, 10, 10.0, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[100, 10, 10.0, false]");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test230");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) 10L);
        linkedListTestDriver5.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray10 = linkedListTestDriver5.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        boolean boolean14 = linkedListTestDriver12.remove((java.lang.Object) 0.0f);
        linkedListTestDriver12.clear();
        linkedListTestDriver12.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        boolean boolean19 = linkedListTestDriver17.add((java.lang.Object) 10L);
        linkedListTestDriver17.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray22 = linkedListTestDriver17.toArray();
        linkedListTestDriver12.addFirst((java.lang.Object) linkedListTestDriver17);
        java.lang.Object obj24 = linkedListTestDriver12.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        boolean boolean27 = linkedListTestDriver25.remove((java.lang.Object) 0.0f);
        boolean boolean29 = linkedListTestDriver25.remove((java.lang.Object) (short) 1);
        linkedListTestDriver25.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator32 = linkedListTestDriver25.iterator();
        linkedListTestDriver25.addLast((java.lang.Object) 100L);
        java.lang.Object obj35 = linkedListTestDriver25.removeLast();
        experiment.util.ListIterator listIterator37 = linkedListTestDriver25.listIterator((int) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver38 = new experiment.util.LinkedListTestDriver();
        boolean boolean40 = linkedListTestDriver38.add((java.lang.Object) 10L);
        linkedListTestDriver25.addLast((java.lang.Object) boolean40);
        boolean boolean42 = linkedListTestDriver12.add((java.lang.Object) boolean40);
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver12);
        int int44 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver46 = new experiment.util.LinkedListTestDriver();
        boolean boolean48 = linkedListTestDriver46.remove((java.lang.Object) 0.0f);
        linkedListTestDriver46.clear();
        linkedListTestDriver46.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver51 = new experiment.util.LinkedListTestDriver();
        boolean boolean53 = linkedListTestDriver51.add((java.lang.Object) 10L);
        linkedListTestDriver51.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray56 = linkedListTestDriver51.toArray();
        linkedListTestDriver46.addFirst((java.lang.Object) linkedListTestDriver51);
        java.lang.Object[] objArray58 = linkedListTestDriver46.toArray();
        java.lang.Object obj59 = linkedListTestDriver0.set((int) (byte) 1, (java.lang.Object) objArray58);
        java.lang.Object obj60 = linkedListTestDriver0.getFirst();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[100, 10]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[100, 10]");
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 100L + "'", obj35, 100L);
        org.junit.Assert.assertNotNull(listIterator37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[100, 10]");
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertNotNull(obj60);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test231");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) 100L);
        java.lang.Object obj10 = linkedListTestDriver0.removeLast();
        experiment.util.ListIterator listIterator12 = linkedListTestDriver0.listIterator((int) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.add((java.lang.Object) 10L);
        linkedListTestDriver0.addLast((java.lang.Object) boolean15);
        java.lang.Object obj19 = linkedListTestDriver0.set(1, (java.lang.Object) (-1));
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        boolean boolean22 = linkedListTestDriver20.remove((java.lang.Object) 0.0f);
        boolean boolean24 = linkedListTestDriver20.remove((java.lang.Object) (short) 1);
        linkedListTestDriver20.addLast((java.lang.Object) (short) 100);
        java.lang.Object obj27 = linkedListTestDriver20.removeFirst();
        linkedListTestDriver20.clear();
        boolean boolean29 = linkedListTestDriver20.isEmpty();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver20);
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        boolean boolean33 = linkedListTestDriver31.add((java.lang.Object) 10L);
        linkedListTestDriver31.addFirst((java.lang.Object) (short) 100);
        boolean boolean37 = linkedListTestDriver31.add((java.lang.Object) 10.0d);
        boolean boolean38 = linkedListTestDriver31.isEmpty();
        java.lang.Object obj39 = linkedListTestDriver31.removeLast();
        boolean boolean40 = linkedListTestDriver20.remove((java.lang.Object) linkedListTestDriver31);
        boolean boolean42 = linkedListTestDriver31.add((java.lang.Object) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100L + "'", obj10, 100L);
        org.junit.Assert.assertNotNull(listIterator12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + true + "'", obj19, true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (short) 100 + "'", obj27, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 10.0d + "'", obj39, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test232");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        boolean boolean10 = linkedListTestDriver8.add((java.lang.Object) 10L);
        int int11 = linkedListTestDriver8.size();
        linkedListTestDriver8.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.remove((java.lang.Object) 0.0f);
        linkedListTestDriver13.clear();
        java.lang.Object[] objArray17 = linkedListTestDriver13.toArray();
        boolean boolean18 = linkedListTestDriver8.contains((java.lang.Object) objArray17);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add(10, (java.lang.Object) linkedListTestDriver8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test233");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        java.lang.Object obj7 = linkedListTestDriver0.removeFirst();
        int int8 = linkedListTestDriver0.size();
        int int9 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        boolean boolean12 = linkedListTestDriver10.remove((java.lang.Object) 0.0f);
        boolean boolean14 = linkedListTestDriver10.remove((java.lang.Object) (short) 1);
        linkedListTestDriver10.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator17 = linkedListTestDriver10.iterator();
        boolean boolean18 = linkedListTestDriver10.isEmpty();
        java.lang.Object obj19 = linkedListTestDriver10.removeLast();
        experiment.util.Iterator iterator20 = linkedListTestDriver10.iterator();
        boolean boolean21 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver10);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        boolean boolean24 = linkedListTestDriver22.add((java.lang.Object) 10L);
        int int25 = linkedListTestDriver22.size();
        java.lang.Object obj26 = linkedListTestDriver22.getFirst();
        linkedListTestDriver22.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        boolean boolean30 = linkedListTestDriver28.add((java.lang.Object) 10L);
        int int31 = linkedListTestDriver28.size();
        java.lang.Object obj32 = linkedListTestDriver28.getFirst();
        java.lang.Object[] objArray33 = linkedListTestDriver28.toArray();
        linkedListTestDriver22.addLast((java.lang.Object) objArray33);
        boolean boolean35 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver22);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) 100 + "'", obj7, (short) 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (short) 100 + "'", obj19, (short) 100);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 10L + "'", obj26, 10L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 10L + "'", obj32, 10L);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[10]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test234");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        java.lang.Object obj4 = linkedListTestDriver0.getFirst();
        java.lang.Object[] objArray5 = linkedListTestDriver0.toArray();
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.add((java.lang.Object) 10L);
        int int10 = linkedListTestDriver7.size();
        boolean boolean11 = linkedListTestDriver7.isEmpty();
        boolean boolean13 = linkedListTestDriver7.contains((java.lang.Object) (byte) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        boolean boolean16 = linkedListTestDriver14.add((java.lang.Object) 10L);
        linkedListTestDriver14.addFirst((java.lang.Object) (short) 100);
        boolean boolean20 = linkedListTestDriver14.add((java.lang.Object) 10.0d);
        int int21 = linkedListTestDriver14.size();
        linkedListTestDriver14.addLast((java.lang.Object) (-1.0d));
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        boolean boolean26 = linkedListTestDriver24.add((java.lang.Object) 10L);
        linkedListTestDriver24.addFirst((java.lang.Object) (short) 100);
        java.lang.Object obj29 = linkedListTestDriver24.getLast();
        boolean boolean30 = linkedListTestDriver14.add((java.lang.Object) linkedListTestDriver24);
        linkedListTestDriver7.addFirst((java.lang.Object) linkedListTestDriver14);
        boolean boolean32 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver7);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator34 = linkedListTestDriver0.listIterator((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10L + "'", obj4, 10L);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10]");
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 10L + "'", obj29, 10L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test235");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addFirst((java.lang.Object) (short) 10);
        java.lang.Object obj7 = linkedListTestDriver0.getLast();
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = linkedListTestDriver0.remove((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) 10 + "'", obj7, (short) 10);
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test236");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.remove((java.lang.Object) 0.0f);
        linkedListTestDriver5.clear();
        java.lang.Object[] objArray9 = linkedListTestDriver5.toArray();
        boolean boolean10 = linkedListTestDriver0.contains((java.lang.Object) objArray9);
        java.lang.Object[] objArray11 = linkedListTestDriver0.toArray();
        boolean boolean12 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        boolean boolean16 = linkedListTestDriver14.add((java.lang.Object) 10L);
        int int17 = linkedListTestDriver14.size();
        linkedListTestDriver14.clear();
        java.lang.Object[] objArray19 = linkedListTestDriver14.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        boolean boolean22 = linkedListTestDriver20.add((java.lang.Object) 10L);
        linkedListTestDriver20.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray25 = linkedListTestDriver20.toArray();
        boolean boolean26 = linkedListTestDriver14.equals_CUT((java.lang.Object) linkedListTestDriver20);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add(2, (java.lang.Object) linkedListTestDriver14);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 2; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[100, 10]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test237");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        linkedListTestDriver0.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray5 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.remove((java.lang.Object) 0.0f);
        linkedListTestDriver6.clear();
        linkedListTestDriver6.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver11.add((java.lang.Object) 10L);
        linkedListTestDriver11.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray16 = linkedListTestDriver11.toArray();
        linkedListTestDriver6.addFirst((java.lang.Object) linkedListTestDriver11);
        boolean boolean18 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver6);
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        boolean boolean21 = linkedListTestDriver19.add((java.lang.Object) 10L);
        linkedListTestDriver19.addFirst((java.lang.Object) (short) 100);
        java.lang.Object obj24 = linkedListTestDriver19.getLast();
        boolean boolean26 = linkedListTestDriver19.contains((java.lang.Object) (byte) 10);
        boolean boolean27 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver19);
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        boolean boolean30 = linkedListTestDriver28.remove((java.lang.Object) 0.0f);
        boolean boolean32 = linkedListTestDriver28.remove((java.lang.Object) (short) 1);
        linkedListTestDriver28.addLast((java.lang.Object) (short) 100);
        java.lang.Object obj35 = linkedListTestDriver28.removeFirst();
        linkedListTestDriver28.clear();
        boolean boolean37 = linkedListTestDriver28.isEmpty();
        java.lang.Object[] objArray38 = linkedListTestDriver28.toArray();
        boolean boolean39 = linkedListTestDriver19.contains((java.lang.Object) linkedListTestDriver28);
        experiment.util.LinkedListTestDriver linkedListTestDriver41 = new experiment.util.LinkedListTestDriver();
        boolean boolean43 = linkedListTestDriver41.add((java.lang.Object) 10L);
        int int44 = linkedListTestDriver41.size();
        boolean boolean45 = linkedListTestDriver41.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver46 = new experiment.util.LinkedListTestDriver();
        boolean boolean48 = linkedListTestDriver46.remove((java.lang.Object) 0.0f);
        boolean boolean50 = linkedListTestDriver46.remove((java.lang.Object) (short) 1);
        linkedListTestDriver46.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator53 = linkedListTestDriver46.iterator();
        linkedListTestDriver46.addLast((java.lang.Object) 100L);
        java.lang.Object obj56 = linkedListTestDriver46.removeLast();
        experiment.util.ListIterator listIterator58 = linkedListTestDriver46.listIterator((int) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver59 = new experiment.util.LinkedListTestDriver();
        boolean boolean61 = linkedListTestDriver59.add((java.lang.Object) 10L);
        linkedListTestDriver46.addLast((java.lang.Object) boolean61);
        experiment.util.LinkedListTestDriver linkedListTestDriver63 = new experiment.util.LinkedListTestDriver();
        boolean boolean65 = linkedListTestDriver63.remove((java.lang.Object) 0.0f);
        boolean boolean67 = linkedListTestDriver63.remove((java.lang.Object) (short) 1);
        linkedListTestDriver63.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator70 = linkedListTestDriver63.iterator();
        linkedListTestDriver63.addLast((java.lang.Object) 100L);
        java.lang.Object obj73 = linkedListTestDriver63.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver74 = new experiment.util.LinkedListTestDriver();
        boolean boolean76 = linkedListTestDriver74.remove((java.lang.Object) 0.0f);
        boolean boolean78 = linkedListTestDriver74.remove((java.lang.Object) (short) 1);
        linkedListTestDriver74.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator81 = linkedListTestDriver74.iterator();
        boolean boolean83 = linkedListTestDriver74.equals_CUT((java.lang.Object) (byte) 1);
        java.lang.Object obj84 = linkedListTestDriver74.getLast();
        java.lang.Object obj85 = linkedListTestDriver74.getLast();
        boolean boolean86 = linkedListTestDriver63.remove((java.lang.Object) linkedListTestDriver74);
        boolean boolean87 = linkedListTestDriver46.add((java.lang.Object) linkedListTestDriver74);
        boolean boolean88 = linkedListTestDriver41.remove((java.lang.Object) linkedListTestDriver74);
        experiment.util.Iterator iterator89 = linkedListTestDriver41.iterator();
        java.lang.Class<?> wildcardClass90 = linkedListTestDriver41.getClass();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver19.add((int) (short) -1, (java.lang.Object) linkedListTestDriver41);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, 10]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[100, 10]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 10L + "'", obj24, 10L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (short) 100 + "'", obj35, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(iterator53);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + 100L + "'", obj56, 100L);
        org.junit.Assert.assertNotNull(listIterator58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(iterator70);
        org.junit.Assert.assertEquals("'" + obj73 + "' != '" + 100L + "'", obj73, 100L);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(iterator81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertEquals("'" + obj84 + "' != '" + (short) 100 + "'", obj84, (short) 100);
        org.junit.Assert.assertEquals("'" + obj85 + "' != '" + (short) 100 + "'", obj85, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(iterator89);
        org.junit.Assert.assertNotNull(wildcardClass90);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test238");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        linkedListTestDriver0.addFirst((java.lang.Object) (short) 100);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        java.lang.Object obj6 = linkedListTestDriver0.removeFirst();
        java.lang.Object obj7 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        boolean boolean10 = linkedListTestDriver8.add((java.lang.Object) 10L);
        int int11 = linkedListTestDriver8.size();
        java.lang.Object obj12 = linkedListTestDriver8.getFirst();
        java.lang.Object[] objArray13 = linkedListTestDriver8.toArray();
        experiment.util.Iterator iterator14 = linkedListTestDriver8.iterator();
        boolean boolean15 = linkedListTestDriver0.add((java.lang.Object) iterator14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10L + "'", obj5, 10L);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 100 + "'", obj6, (short) 100);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 10L + "'", obj7, 10L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 10L + "'", obj12, 10L);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[10]");
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test239");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        java.lang.Object obj4 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.remove((java.lang.Object) 0.0f);
        boolean boolean9 = linkedListTestDriver5.remove((java.lang.Object) (short) 1);
        linkedListTestDriver5.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator12 = linkedListTestDriver5.iterator();
        boolean boolean13 = linkedListTestDriver5.isEmpty();
        java.lang.Object obj14 = linkedListTestDriver5.removeLast();
        experiment.util.Iterator iterator15 = linkedListTestDriver5.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        boolean boolean18 = linkedListTestDriver16.remove((java.lang.Object) 0.0f);
        boolean boolean20 = linkedListTestDriver16.remove((java.lang.Object) (short) 1);
        linkedListTestDriver16.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator23 = linkedListTestDriver16.iterator();
        linkedListTestDriver5.addLast((java.lang.Object) iterator23);
        boolean boolean25 = linkedListTestDriver0.equals_CUT((java.lang.Object) iterator23);
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        boolean boolean28 = linkedListTestDriver26.remove((java.lang.Object) 0.0f);
        linkedListTestDriver26.clear();
        linkedListTestDriver26.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        boolean boolean33 = linkedListTestDriver31.add((java.lang.Object) 10L);
        int int34 = linkedListTestDriver31.size();
        boolean boolean35 = linkedListTestDriver31.isEmpty();
        boolean boolean37 = linkedListTestDriver31.contains((java.lang.Object) (byte) 100);
        experiment.util.Iterator iterator38 = linkedListTestDriver31.iterator();
        java.lang.Object obj40 = linkedListTestDriver31.remove((int) (short) 0);
        java.lang.Object[] objArray41 = linkedListTestDriver31.toArray();
        boolean boolean42 = linkedListTestDriver26.contains((java.lang.Object) linkedListTestDriver31);
        boolean boolean43 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver31);
        java.lang.Object obj44 = linkedListTestDriver0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj45 = linkedListTestDriver0.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10L + "'", obj4, 10L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) 100 + "'", obj14, (short) 100);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 10L + "'", obj40, 10L);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 10L + "'", obj44, 10L);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test240");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        boolean boolean4 = linkedListTestDriver0.isEmpty();
        boolean boolean6 = linkedListTestDriver0.contains((java.lang.Object) (byte) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        int int9 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test241");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.remove((java.lang.Object) 0.0f);
        linkedListTestDriver5.clear();
        java.lang.Object[] objArray9 = linkedListTestDriver5.toArray();
        boolean boolean10 = linkedListTestDriver0.contains((java.lang.Object) objArray9);
        java.lang.Object[] objArray11 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        boolean boolean14 = linkedListTestDriver12.remove((java.lang.Object) 0.0f);
        boolean boolean16 = linkedListTestDriver12.remove((java.lang.Object) (short) 1);
        linkedListTestDriver12.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator19 = linkedListTestDriver12.iterator();
        boolean boolean20 = linkedListTestDriver12.isEmpty();
        experiment.util.Iterator iterator21 = linkedListTestDriver12.iterator();
        boolean boolean22 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver12);
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        boolean boolean25 = linkedListTestDriver23.remove((java.lang.Object) 0.0f);
        linkedListTestDriver23.clear();
        linkedListTestDriver23.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        boolean boolean30 = linkedListTestDriver28.add((java.lang.Object) 10L);
        linkedListTestDriver28.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray33 = linkedListTestDriver28.toArray();
        linkedListTestDriver23.addFirst((java.lang.Object) linkedListTestDriver28);
        experiment.util.LinkedListTestDriver linkedListTestDriver35 = new experiment.util.LinkedListTestDriver();
        boolean boolean37 = linkedListTestDriver35.remove((java.lang.Object) 0.0f);
        linkedListTestDriver35.clear();
        linkedListTestDriver35.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver40 = new experiment.util.LinkedListTestDriver();
        boolean boolean42 = linkedListTestDriver40.add((java.lang.Object) 10L);
        linkedListTestDriver40.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray45 = linkedListTestDriver40.toArray();
        linkedListTestDriver35.addFirst((java.lang.Object) linkedListTestDriver40);
        java.lang.Object obj47 = linkedListTestDriver35.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver48 = new experiment.util.LinkedListTestDriver();
        boolean boolean50 = linkedListTestDriver48.remove((java.lang.Object) 0.0f);
        boolean boolean52 = linkedListTestDriver48.remove((java.lang.Object) (short) 1);
        linkedListTestDriver48.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator55 = linkedListTestDriver48.iterator();
        linkedListTestDriver48.addLast((java.lang.Object) 100L);
        java.lang.Object obj58 = linkedListTestDriver48.removeLast();
        experiment.util.ListIterator listIterator60 = linkedListTestDriver48.listIterator((int) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver61 = new experiment.util.LinkedListTestDriver();
        boolean boolean63 = linkedListTestDriver61.add((java.lang.Object) 10L);
        linkedListTestDriver48.addLast((java.lang.Object) boolean63);
        boolean boolean65 = linkedListTestDriver35.add((java.lang.Object) boolean63);
        linkedListTestDriver23.addFirst((java.lang.Object) linkedListTestDriver35);
        int int67 = linkedListTestDriver23.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver69 = new experiment.util.LinkedListTestDriver();
        boolean boolean71 = linkedListTestDriver69.remove((java.lang.Object) 0.0f);
        linkedListTestDriver69.clear();
        linkedListTestDriver69.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver74 = new experiment.util.LinkedListTestDriver();
        boolean boolean76 = linkedListTestDriver74.add((java.lang.Object) 10L);
        linkedListTestDriver74.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray79 = linkedListTestDriver74.toArray();
        linkedListTestDriver69.addFirst((java.lang.Object) linkedListTestDriver74);
        java.lang.Object[] objArray81 = linkedListTestDriver69.toArray();
        java.lang.Object obj82 = linkedListTestDriver23.set((int) (byte) 1, (java.lang.Object) objArray81);
        boolean boolean83 = linkedListTestDriver12.add((java.lang.Object) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[100, 10]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[100, 10]");
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(iterator55);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + 100L + "'", obj58, 100L);
        org.junit.Assert.assertNotNull(listIterator60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 2 + "'", int67 == 2);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray79), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray79), "[100, 10]");
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertNotNull(obj82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test242");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        linkedListTestDriver0.addFirst((java.lang.Object) (short) 100);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        boolean boolean7 = linkedListTestDriver0.contains((java.lang.Object) (byte) 10);
        java.lang.Object obj9 = linkedListTestDriver0.remove((int) (byte) 0);
        int int10 = linkedListTestDriver0.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10L + "'", obj5, 10L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) 100 + "'", obj9, (short) 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test243");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        linkedListTestDriver0.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray5 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.remove((java.lang.Object) 0.0f);
        linkedListTestDriver6.clear();
        linkedListTestDriver6.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver11.add((java.lang.Object) 10L);
        linkedListTestDriver11.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray16 = linkedListTestDriver11.toArray();
        linkedListTestDriver6.addFirst((java.lang.Object) linkedListTestDriver11);
        boolean boolean18 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver6);
        java.lang.Object obj19 = linkedListTestDriver6.removeLast();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, 10]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[100, 10]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test244");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        linkedListTestDriver0.addFirst((java.lang.Object) (short) 100);
        java.lang.Object obj5 = linkedListTestDriver0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator7 = linkedListTestDriver0.listIterator((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 100; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10L + "'", obj5, 10L);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test245");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        boolean boolean9 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = linkedListTestDriver0.getLast();
        java.lang.Object[] objArray11 = linkedListTestDriver0.toArray();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (short) 100 + "'", obj10, (short) 100);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[100]");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test246");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        linkedListTestDriver0.addFirst((java.lang.Object) (short) 100);
        java.lang.Object obj5 = linkedListTestDriver0.removeLast();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        linkedListTestDriver0.addFirst((java.lang.Object) '4');
        java.lang.Class<?> wildcardClass9 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10L + "'", obj5, 10L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test247");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        boolean boolean9 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        boolean boolean12 = linkedListTestDriver10.remove((java.lang.Object) 0.0f);
        boolean boolean14 = linkedListTestDriver10.remove((java.lang.Object) (short) 1);
        linkedListTestDriver10.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator17 = linkedListTestDriver10.iterator();
        java.lang.Object obj18 = linkedListTestDriver10.getLast();
        linkedListTestDriver0.addFirst(obj18);
        java.lang.Object obj20 = linkedListTestDriver0.removeFirst();
        java.lang.Object obj21 = linkedListTestDriver0.getFirst();
        boolean boolean23 = linkedListTestDriver0.add((java.lang.Object) (short) 1);
        java.lang.Object[] objArray24 = linkedListTestDriver0.toArray();
        java.lang.Object obj25 = linkedListTestDriver0.removeFirst();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (short) 100 + "'", obj18, (short) 100);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (short) 100 + "'", obj20, (short) 100);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (short) 100 + "'", obj21, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[100, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[100, 1]");
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (short) 100 + "'", obj25, (short) 100);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test248");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        java.lang.Object obj4 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.remove((java.lang.Object) 0.0f);
        linkedListTestDriver5.clear();
        java.lang.Object[] objArray9 = linkedListTestDriver5.toArray();
        experiment.util.ListIterator listIterator11 = linkedListTestDriver5.listIterator(0);
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        boolean boolean14 = linkedListTestDriver12.remove((java.lang.Object) 0.0f);
        boolean boolean16 = linkedListTestDriver12.remove((java.lang.Object) (short) 1);
        linkedListTestDriver12.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator19 = linkedListTestDriver12.iterator();
        boolean boolean21 = linkedListTestDriver12.equals_CUT((java.lang.Object) (byte) 1);
        java.lang.Object obj22 = linkedListTestDriver12.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        boolean boolean25 = linkedListTestDriver23.remove((java.lang.Object) 0.0f);
        linkedListTestDriver23.clear();
        linkedListTestDriver23.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        boolean boolean30 = linkedListTestDriver28.add((java.lang.Object) 10L);
        linkedListTestDriver28.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray33 = linkedListTestDriver28.toArray();
        linkedListTestDriver23.addFirst((java.lang.Object) linkedListTestDriver28);
        java.lang.Object obj35 = linkedListTestDriver23.getLast();
        boolean boolean36 = linkedListTestDriver12.remove(obj35);
        linkedListTestDriver5.addFirst(obj35);
        boolean boolean38 = linkedListTestDriver0.add(obj35);
        experiment.util.LinkedListTestDriver linkedListTestDriver39 = new experiment.util.LinkedListTestDriver();
        boolean boolean41 = linkedListTestDriver39.add((java.lang.Object) 10L);
        linkedListTestDriver39.addFirst((java.lang.Object) (short) 100);
        java.lang.Object obj44 = linkedListTestDriver39.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver45 = new experiment.util.LinkedListTestDriver();
        boolean boolean47 = linkedListTestDriver45.add((java.lang.Object) 10L);
        linkedListTestDriver45.addFirst((java.lang.Object) (short) 100);
        boolean boolean51 = linkedListTestDriver45.add((java.lang.Object) 10.0d);
        java.lang.Object obj52 = linkedListTestDriver45.getLast();
        java.lang.Object obj53 = linkedListTestDriver45.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver54 = new experiment.util.LinkedListTestDriver();
        boolean boolean56 = linkedListTestDriver54.remove((java.lang.Object) 0.0f);
        boolean boolean58 = linkedListTestDriver54.remove((java.lang.Object) (short) 1);
        linkedListTestDriver54.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator61 = linkedListTestDriver54.iterator();
        linkedListTestDriver54.addLast((java.lang.Object) 100L);
        java.lang.Object obj64 = linkedListTestDriver54.removeLast();
        boolean boolean65 = linkedListTestDriver45.add((java.lang.Object) linkedListTestDriver54);
        java.lang.Object obj66 = linkedListTestDriver54.getLast();
        linkedListTestDriver54.clear();
        linkedListTestDriver54.clear();
        linkedListTestDriver39.addLast((java.lang.Object) linkedListTestDriver54);
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver39);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10L + "'", obj4, 10L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(listIterator11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (short) 100 + "'", obj22, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[100, 10]");
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 10L + "'", obj44, 10L);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 10.0d + "'", obj52, 10.0d);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + 10.0d + "'", obj53, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(iterator61);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + 100L + "'", obj64, 100L);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertEquals("'" + obj66 + "' != '" + (short) 100 + "'", obj66, (short) 100);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test249");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) 10L);
        linkedListTestDriver5.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray10 = linkedListTestDriver5.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        boolean boolean14 = linkedListTestDriver12.remove((java.lang.Object) 0.0f);
        linkedListTestDriver12.clear();
        linkedListTestDriver12.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        boolean boolean19 = linkedListTestDriver17.add((java.lang.Object) 10L);
        linkedListTestDriver17.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray22 = linkedListTestDriver17.toArray();
        linkedListTestDriver12.addFirst((java.lang.Object) linkedListTestDriver17);
        java.lang.Object obj24 = linkedListTestDriver12.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        boolean boolean27 = linkedListTestDriver25.remove((java.lang.Object) 0.0f);
        boolean boolean29 = linkedListTestDriver25.remove((java.lang.Object) (short) 1);
        linkedListTestDriver25.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator32 = linkedListTestDriver25.iterator();
        linkedListTestDriver25.addLast((java.lang.Object) 100L);
        java.lang.Object obj35 = linkedListTestDriver25.removeLast();
        experiment.util.ListIterator listIterator37 = linkedListTestDriver25.listIterator((int) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver38 = new experiment.util.LinkedListTestDriver();
        boolean boolean40 = linkedListTestDriver38.add((java.lang.Object) 10L);
        linkedListTestDriver25.addLast((java.lang.Object) boolean40);
        boolean boolean42 = linkedListTestDriver12.add((java.lang.Object) boolean40);
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver12);
        int int44 = linkedListTestDriver0.size();
        java.lang.Object obj45 = linkedListTestDriver0.getFirst();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[100, 10]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[100, 10]");
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 100L + "'", obj35, 100L);
        org.junit.Assert.assertNotNull(listIterator37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertNotNull(obj45);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test250");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        boolean boolean9 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        boolean boolean12 = linkedListTestDriver10.add((java.lang.Object) 10L);
        int int13 = linkedListTestDriver10.size();
        linkedListTestDriver10.clear();
        java.lang.Object[] objArray15 = linkedListTestDriver10.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        boolean boolean18 = linkedListTestDriver16.remove((java.lang.Object) 0.0f);
        boolean boolean20 = linkedListTestDriver16.remove((java.lang.Object) (short) 1);
        linkedListTestDriver16.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator23 = linkedListTestDriver16.iterator();
        linkedListTestDriver16.addLast((java.lang.Object) 100L);
        java.lang.Object obj26 = linkedListTestDriver16.removeLast();
        experiment.util.ListIterator listIterator28 = linkedListTestDriver16.listIterator((int) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        boolean boolean31 = linkedListTestDriver29.add((java.lang.Object) 10L);
        linkedListTestDriver16.addLast((java.lang.Object) boolean31);
        boolean boolean33 = linkedListTestDriver10.add((java.lang.Object) linkedListTestDriver16);
        boolean boolean34 = linkedListTestDriver0.equals_CUT((java.lang.Object) boolean33);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator36 = linkedListTestDriver0.listIterator((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 32; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100L + "'", obj26, 100L);
        org.junit.Assert.assertNotNull(listIterator28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test251");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        linkedListTestDriver0.addFirst((java.lang.Object) (short) 100);
        boolean boolean6 = linkedListTestDriver0.add((java.lang.Object) 10.0d);
        int int7 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        boolean boolean10 = linkedListTestDriver8.remove((java.lang.Object) 0.0f);
        boolean boolean12 = linkedListTestDriver8.remove((java.lang.Object) (short) 1);
        linkedListTestDriver8.addLast((java.lang.Object) (short) 100);
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver8);
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        boolean boolean18 = linkedListTestDriver16.remove((java.lang.Object) 0.0f);
        boolean boolean20 = linkedListTestDriver16.remove((java.lang.Object) (short) 1);
        linkedListTestDriver16.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator23 = linkedListTestDriver16.iterator();
        java.lang.Object obj24 = linkedListTestDriver16.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        boolean boolean27 = linkedListTestDriver25.add((java.lang.Object) 10L);
        linkedListTestDriver16.addFirst((java.lang.Object) boolean27);
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        boolean boolean31 = linkedListTestDriver29.add((java.lang.Object) 10L);
        int int32 = linkedListTestDriver29.size();
        java.lang.Object obj33 = linkedListTestDriver29.getFirst();
        java.lang.Object[] objArray34 = linkedListTestDriver29.toArray();
        linkedListTestDriver16.addLast((java.lang.Object) objArray34);
        java.lang.Object obj37 = linkedListTestDriver16.get((int) (short) 0);
        java.lang.Object obj38 = linkedListTestDriver16.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver39 = new experiment.util.LinkedListTestDriver();
        boolean boolean41 = linkedListTestDriver39.remove((java.lang.Object) 0.0f);
        linkedListTestDriver39.clear();
        linkedListTestDriver39.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver44 = new experiment.util.LinkedListTestDriver();
        boolean boolean46 = linkedListTestDriver44.add((java.lang.Object) 10L);
        linkedListTestDriver44.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray49 = linkedListTestDriver44.toArray();
        linkedListTestDriver39.addFirst((java.lang.Object) linkedListTestDriver44);
        java.lang.Object[] objArray51 = linkedListTestDriver39.toArray();
        boolean boolean52 = linkedListTestDriver16.remove((java.lang.Object) objArray51);
        boolean boolean53 = linkedListTestDriver8.add((java.lang.Object) linkedListTestDriver16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (short) 100 + "'", obj24, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 10L + "'", obj33, 10L);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[10]");
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + true + "'", obj37, true);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[100, 10]");
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test252");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        boolean boolean4 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.remove((java.lang.Object) 0.0f);
        boolean boolean9 = linkedListTestDriver5.remove((java.lang.Object) (short) 1);
        linkedListTestDriver5.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator12 = linkedListTestDriver5.iterator();
        linkedListTestDriver5.addLast((java.lang.Object) 100L);
        java.lang.Object obj15 = linkedListTestDriver5.removeLast();
        experiment.util.ListIterator listIterator17 = linkedListTestDriver5.listIterator((int) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver18.add((java.lang.Object) 10L);
        linkedListTestDriver5.addLast((java.lang.Object) boolean20);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        boolean boolean24 = linkedListTestDriver22.remove((java.lang.Object) 0.0f);
        boolean boolean26 = linkedListTestDriver22.remove((java.lang.Object) (short) 1);
        linkedListTestDriver22.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator29 = linkedListTestDriver22.iterator();
        linkedListTestDriver22.addLast((java.lang.Object) 100L);
        java.lang.Object obj32 = linkedListTestDriver22.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver33 = new experiment.util.LinkedListTestDriver();
        boolean boolean35 = linkedListTestDriver33.remove((java.lang.Object) 0.0f);
        boolean boolean37 = linkedListTestDriver33.remove((java.lang.Object) (short) 1);
        linkedListTestDriver33.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator40 = linkedListTestDriver33.iterator();
        boolean boolean42 = linkedListTestDriver33.equals_CUT((java.lang.Object) (byte) 1);
        java.lang.Object obj43 = linkedListTestDriver33.getLast();
        java.lang.Object obj44 = linkedListTestDriver33.getLast();
        boolean boolean45 = linkedListTestDriver22.remove((java.lang.Object) linkedListTestDriver33);
        boolean boolean46 = linkedListTestDriver5.add((java.lang.Object) linkedListTestDriver33);
        boolean boolean47 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver33);
        boolean boolean48 = linkedListTestDriver33.isEmpty();
        java.lang.Object obj49 = linkedListTestDriver33.getLast();
        linkedListTestDriver33.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver51 = new experiment.util.LinkedListTestDriver();
        boolean boolean53 = linkedListTestDriver51.add((java.lang.Object) 10L);
        int int54 = linkedListTestDriver51.size();
        java.lang.Object obj55 = linkedListTestDriver51.getFirst();
        java.lang.Object[] objArray56 = linkedListTestDriver51.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver58 = new experiment.util.LinkedListTestDriver();
        boolean boolean60 = linkedListTestDriver58.remove((java.lang.Object) 0.0f);
        boolean boolean62 = linkedListTestDriver58.remove((java.lang.Object) (short) 1);
        linkedListTestDriver58.addLast((java.lang.Object) (short) 100);
        java.lang.Object obj65 = linkedListTestDriver51.set(0, (java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver66 = new experiment.util.LinkedListTestDriver();
        boolean boolean68 = linkedListTestDriver66.add((java.lang.Object) 10L);
        int int69 = linkedListTestDriver66.size();
        boolean boolean70 = linkedListTestDriver66.isEmpty();
        boolean boolean72 = linkedListTestDriver66.contains((java.lang.Object) (byte) 100);
        experiment.util.ListIterator listIterator74 = linkedListTestDriver66.listIterator((int) (byte) 1);
        boolean boolean75 = linkedListTestDriver51.contains((java.lang.Object) listIterator74);
        linkedListTestDriver33.addLast((java.lang.Object) boolean75);
        experiment.util.LinkedListTestDriver linkedListTestDriver78 = new experiment.util.LinkedListTestDriver();
        boolean boolean80 = linkedListTestDriver78.remove((java.lang.Object) 0.0f);
        linkedListTestDriver78.clear();
        java.lang.Object[] objArray82 = linkedListTestDriver78.toArray();
        experiment.util.ListIterator listIterator84 = linkedListTestDriver78.listIterator(0);
        linkedListTestDriver33.add(0, (java.lang.Object) 0);
        java.lang.Object obj86 = linkedListTestDriver33.getFirst();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100L + "'", obj15, 100L);
        org.junit.Assert.assertNotNull(listIterator17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 100L + "'", obj32, 100L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(iterator40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (short) 100 + "'", obj43, (short) 100);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + (short) 100 + "'", obj44, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + (short) 100 + "'", obj49, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + 10L + "'", obj55, 10L);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[10]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + 10L + "'", obj65, 10L);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(listIterator74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray82), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray82), "[]");
        org.junit.Assert.assertNotNull(listIterator84);
        org.junit.Assert.assertEquals("'" + obj86 + "' != '" + 0 + "'", obj86, 0);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test253");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        java.lang.Object obj4 = linkedListTestDriver0.getFirst();
        java.lang.Object[] objArray5 = linkedListTestDriver0.toArray();
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator8 = linkedListTestDriver0.listIterator(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 3; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10L + "'", obj4, 10L);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10]");
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test254");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        linkedListTestDriver0.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray5 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.remove((java.lang.Object) 0.0f);
        linkedListTestDriver6.clear();
        linkedListTestDriver6.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver11.add((java.lang.Object) 10L);
        linkedListTestDriver11.addFirst((java.lang.Object) (short) 100);
        java.lang.Object[] objArray16 = linkedListTestDriver11.toArray();
        linkedListTestDriver6.addFirst((java.lang.Object) linkedListTestDriver11);
        boolean boolean18 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver6);
        java.lang.Object obj19 = linkedListTestDriver6.getFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = linkedListTestDriver6.get(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, 10]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[100, 10]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test255");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) (short) 1);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 100);
        java.lang.Object obj7 = linkedListTestDriver0.removeFirst();
        int int8 = linkedListTestDriver0.size();
        int int9 = linkedListTestDriver0.size();
        boolean boolean10 = linkedListTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) 100 + "'", obj7, (short) 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_2070236138_1024_0.test256");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) 10L);
        int int3 = linkedListTestDriver0.size();
        boolean boolean4 = linkedListTestDriver0.isEmpty();
        boolean boolean6 = linkedListTestDriver0.contains((java.lang.Object) (byte) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.add((java.lang.Object) 10L);
        linkedListTestDriver7.addFirst((java.lang.Object) (short) 100);
        boolean boolean13 = linkedListTestDriver7.add((java.lang.Object) 10.0d);
        int int14 = linkedListTestDriver7.size();
        linkedListTestDriver7.addLast((java.lang.Object) (-1.0d));
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        boolean boolean19 = linkedListTestDriver17.add((java.lang.Object) 10L);
        linkedListTestDriver17.addFirst((java.lang.Object) (short) 100);
        java.lang.Object obj22 = linkedListTestDriver17.getLast();
        boolean boolean23 = linkedListTestDriver7.add((java.lang.Object) linkedListTestDriver17);
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver7);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        boolean boolean27 = linkedListTestDriver25.remove((java.lang.Object) 0.0f);
        boolean boolean29 = linkedListTestDriver25.remove((java.lang.Object) (short) 1);
        linkedListTestDriver25.addLast((java.lang.Object) (short) 100);
        java.lang.Object obj32 = linkedListTestDriver25.removeFirst();
        linkedListTestDriver25.clear();
        boolean boolean34 = linkedListTestDriver25.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver35 = new experiment.util.LinkedListTestDriver();
        boolean boolean37 = linkedListTestDriver35.remove((java.lang.Object) 0.0f);
        boolean boolean39 = linkedListTestDriver35.remove((java.lang.Object) (short) 1);
        linkedListTestDriver35.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator42 = linkedListTestDriver35.iterator();
        boolean boolean43 = linkedListTestDriver35.isEmpty();
        java.lang.Object obj44 = linkedListTestDriver35.removeLast();
        experiment.util.Iterator iterator45 = linkedListTestDriver35.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver46 = new experiment.util.LinkedListTestDriver();
        boolean boolean48 = linkedListTestDriver46.remove((java.lang.Object) 0.0f);
        boolean boolean50 = linkedListTestDriver46.remove((java.lang.Object) (short) 1);
        linkedListTestDriver46.addLast((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator53 = linkedListTestDriver46.iterator();
        linkedListTestDriver35.addLast((java.lang.Object) iterator53);
        boolean boolean56 = linkedListTestDriver35.equals_CUT((java.lang.Object) (-1.0f));
        boolean boolean57 = linkedListTestDriver35.isEmpty();
        linkedListTestDriver25.addFirst((java.lang.Object) linkedListTestDriver35);
        boolean boolean59 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver35);
        java.lang.Object[] objArray60 = linkedListTestDriver0.toArray();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 10L + "'", obj22, 10L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (short) 100 + "'", obj32, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(iterator42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + (short) 100 + "'", obj44, (short) 100);
        org.junit.Assert.assertNotNull(iterator45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(iterator53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(objArray60);
    }

}
