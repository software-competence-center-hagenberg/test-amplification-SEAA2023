package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_LinkedListTest_379375655_256_s {

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
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test001");
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
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test002");
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
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test003");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = linkedListTestDriver0.remove((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test004");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = linkedListTestDriver0.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test005");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = linkedListTestDriver0.set((int) (short) 1, (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test006");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test007");
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
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test008");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = linkedListTestDriver0.get(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test009");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = linkedListTestDriver0.set((int) (byte) 10, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test010");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = linkedListTestDriver0.set(10, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test011");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray4 = linkedListTestDriver0.toArray();
        java.lang.Object obj5 = linkedListTestDriver0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator7 = linkedListTestDriver0.listIterator((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1]");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test012");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray4 = linkedListTestDriver0.toArray();
        java.lang.Object obj5 = linkedListTestDriver0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1]");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test013");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        int int5 = linkedListTestDriver4.size();
        java.lang.Object obj6 = linkedListTestDriver0.set(0, (java.lang.Object) linkedListTestDriver4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = linkedListTestDriver0.get(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test014");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator3 = linkedListTestDriver0.listIterator((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test015");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) 0L);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = linkedListTestDriver0.remove((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0L + "'", obj5, 0L);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test016");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = linkedListTestDriver0.set((int) (byte) 100, (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test017");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean5 = linkedListTestDriver0.remove((java.lang.Object) 10);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator7 = linkedListTestDriver0.listIterator((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 35; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test018");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        int int5 = linkedListTestDriver4.size();
        java.lang.Object obj6 = linkedListTestDriver0.set(0, (java.lang.Object) linkedListTestDriver4);
        linkedListTestDriver0.addFirst((java.lang.Object) (short) 100);
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) -1);
        boolean boolean11 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = linkedListTestDriver0.get((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test019");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray4 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = linkedListTestDriver0.set(10, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1]");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test020");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = linkedListTestDriver0.remove((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test021");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver5.addLast((java.lang.Object) (byte) -1);
        linkedListTestDriver5.addFirst((java.lang.Object) 1.0f);
        java.lang.Object obj10 = linkedListTestDriver5.getFirst();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) (short) -1, obj10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1.0f + "'", obj10, 1.0f);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test022");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        int int5 = linkedListTestDriver4.size();
        java.lang.Object obj6 = linkedListTestDriver0.set(0, (java.lang.Object) linkedListTestDriver4);
        linkedListTestDriver0.addFirst((java.lang.Object) (short) 100);
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) -1);
        java.lang.Class<?> wildcardClass11 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test023");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean5 = linkedListTestDriver0.remove((java.lang.Object) 10);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        boolean boolean8 = linkedListTestDriver0.remove((java.lang.Object) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = linkedListTestDriver0.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test024");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        linkedListTestDriver0.addFirst((java.lang.Object) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = linkedListTestDriver0.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test025");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        boolean boolean5 = linkedListTestDriver2.add((java.lang.Object) 1L);
        java.lang.Object[] objArray6 = linkedListTestDriver2.toArray();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) (short) 1, (java.lang.Object) linkedListTestDriver2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 1; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1]");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test026");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean5 = linkedListTestDriver0.remove((java.lang.Object) 10);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        boolean boolean8 = linkedListTestDriver0.add((java.lang.Object) 0L);
        java.lang.Object obj11 = linkedListTestDriver0.set((int) (short) 0, (java.lang.Object) (short) 1);
        java.lang.Object obj12 = linkedListTestDriver0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = linkedListTestDriver0.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0L + "'", obj11, 0L);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (short) 1 + "'", obj12, (short) 1);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test027");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.clear();
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = linkedListTestDriver0.remove((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test028");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        int int5 = linkedListTestDriver4.size();
        java.lang.Object obj6 = linkedListTestDriver0.set(0, (java.lang.Object) linkedListTestDriver4);
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test029");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean5 = linkedListTestDriver0.remove((java.lang.Object) 10);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        boolean boolean8 = linkedListTestDriver0.add((java.lang.Object) 0L);
        java.lang.Object obj11 = linkedListTestDriver0.set((int) (short) 0, (java.lang.Object) (short) 1);
        java.lang.Object obj12 = linkedListTestDriver0.removeLast();
        int int13 = linkedListTestDriver0.size();
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0L + "'", obj11, 0L);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (short) 1 + "'", obj12, (short) 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test030");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean5 = linkedListTestDriver0.remove((java.lang.Object) 10);
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.addLast((java.lang.Object) (byte) -1);
        linkedListTestDriver8.addFirst((java.lang.Object) 1.0f);
        java.lang.Object obj13 = linkedListTestDriver8.getFirst();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((-1), (java.lang.Object) linkedListTestDriver8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 1.0f + "'", obj13, 1.0f);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test031");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        java.lang.Object obj4 = linkedListTestDriver0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = linkedListTestDriver0.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test032");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) 0L);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = linkedListTestDriver0.get(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0L + "'", obj5, 0L);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test033");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add(10, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test034");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        boolean boolean2 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = linkedListTestDriver0.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test035");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray4 = linkedListTestDriver0.toArray();
        java.lang.Object obj5 = linkedListTestDriver0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = linkedListTestDriver0.getLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1]");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test036");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        int int5 = linkedListTestDriver4.size();
        java.lang.Object obj6 = linkedListTestDriver0.set(0, (java.lang.Object) linkedListTestDriver4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = linkedListTestDriver4.set((int) '#', (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test037");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean5 = linkedListTestDriver0.remove((java.lang.Object) 10);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        boolean boolean8 = linkedListTestDriver0.add((java.lang.Object) 0L);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator10 = linkedListTestDriver0.listIterator((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test038");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test039");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) 0L);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        int int7 = linkedListTestDriver6.size();
        boolean boolean9 = linkedListTestDriver6.add((java.lang.Object) 1L);
        linkedListTestDriver0.add(0, (java.lang.Object) linkedListTestDriver6);
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        int int16 = linkedListTestDriver15.size();
        java.lang.Object obj17 = linkedListTestDriver11.set(0, (java.lang.Object) linkedListTestDriver15);
        java.lang.Class<?> wildcardClass18 = linkedListTestDriver15.getClass();
        boolean boolean19 = linkedListTestDriver6.contains((java.lang.Object) wildcardClass18);
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver21.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        int int26 = linkedListTestDriver25.size();
        java.lang.Object obj27 = linkedListTestDriver21.set(0, (java.lang.Object) linkedListTestDriver25);
        linkedListTestDriver21.clear();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver6.add(10, (java.lang.Object) linkedListTestDriver21);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (byte) -1 + "'", obj27, (byte) -1);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test040");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean5 = linkedListTestDriver0.remove((java.lang.Object) 10);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        boolean boolean8 = linkedListTestDriver0.add((java.lang.Object) 0L);
        java.lang.Object obj11 = linkedListTestDriver0.set((int) (short) 0, (java.lang.Object) (short) 1);
        java.lang.Object obj12 = linkedListTestDriver0.removeLast();
        boolean boolean13 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = linkedListTestDriver0.getLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0L + "'", obj11, 0L);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (short) 1 + "'", obj12, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test041");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean5 = linkedListTestDriver0.remove((java.lang.Object) 10);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        boolean boolean8 = linkedListTestDriver0.equals_CUT((java.lang.Object) '4');
        boolean boolean10 = linkedListTestDriver0.add((java.lang.Object) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = linkedListTestDriver0.get(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test042");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        linkedListTestDriver0.addFirst((java.lang.Object) 1.0f);
        java.lang.Object obj5 = linkedListTestDriver0.getFirst();
        linkedListTestDriver0.addFirst((java.lang.Object) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator9 = linkedListTestDriver0.listIterator((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 1.0f + "'", obj5, 1.0f);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test043");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) 0L);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        int int7 = linkedListTestDriver6.size();
        boolean boolean9 = linkedListTestDriver6.add((java.lang.Object) 1L);
        linkedListTestDriver0.add(0, (java.lang.Object) linkedListTestDriver6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = linkedListTestDriver0.get((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test044");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean5 = linkedListTestDriver0.remove((java.lang.Object) 10);
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test045");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = linkedListTestDriver0.get((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test046");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean5 = linkedListTestDriver0.remove((java.lang.Object) 10);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        boolean boolean8 = linkedListTestDriver0.add((java.lang.Object) 0L);
        linkedListTestDriver0.clear();
        java.lang.Class<?> wildcardClass10 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test047");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) 0L);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        int int7 = linkedListTestDriver6.size();
        boolean boolean9 = linkedListTestDriver6.add((java.lang.Object) 1L);
        linkedListTestDriver0.add(0, (java.lang.Object) linkedListTestDriver6);
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator14 = linkedListTestDriver11.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        int int16 = linkedListTestDriver15.size();
        boolean boolean18 = linkedListTestDriver15.add((java.lang.Object) 1L);
        java.lang.Object[] objArray19 = linkedListTestDriver15.toArray();
        boolean boolean20 = linkedListTestDriver11.remove((java.lang.Object) linkedListTestDriver15);
        java.lang.Object obj21 = linkedListTestDriver11.getLast();
        boolean boolean22 = linkedListTestDriver6.contains((java.lang.Object) linkedListTestDriver11);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator24 = linkedListTestDriver6.listIterator((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 100; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) -1 + "'", obj21, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test048");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) 1L);
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator7 = linkedListTestDriver4.iterator();
        java.lang.Object[] objArray8 = linkedListTestDriver4.toArray();
        linkedListTestDriver0.addLast((java.lang.Object) objArray8);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        int int15 = linkedListTestDriver14.size();
        java.lang.Object obj16 = linkedListTestDriver10.set(0, (java.lang.Object) linkedListTestDriver14);
        linkedListTestDriver10.addFirst((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver19.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator22 = linkedListTestDriver19.iterator();
        linkedListTestDriver10.addLast((java.lang.Object) linkedListTestDriver19);
        boolean boolean25 = linkedListTestDriver19.contains((java.lang.Object) 0.0f);
        boolean boolean26 = linkedListTestDriver0.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver28.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator31 = linkedListTestDriver28.iterator();
        boolean boolean33 = linkedListTestDriver28.remove((java.lang.Object) 10);
        java.lang.Object obj34 = linkedListTestDriver28.removeLast();
        boolean boolean36 = linkedListTestDriver28.add((java.lang.Object) 0L);
        java.lang.Object obj39 = linkedListTestDriver28.set((int) (short) 0, (java.lang.Object) (short) 1);
        java.lang.Object obj40 = linkedListTestDriver28.removeLast();
        linkedListTestDriver28.addLast((java.lang.Object) (-1.0d));
        java.lang.Object[] objArray43 = linkedListTestDriver28.toArray();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add(10, (java.lang.Object) objArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) -1 + "'", obj16, (byte) -1);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (byte) -1 + "'", obj34, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 0L + "'", obj39, 0L);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (short) 1 + "'", obj40, (short) 1);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[-1.0]");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test049");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) 0L);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        java.lang.Object obj7 = linkedListTestDriver0.get((int) (byte) 0);
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0L + "'", obj5, 0L);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test050");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean5 = linkedListTestDriver0.remove((java.lang.Object) 10);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        boolean boolean8 = linkedListTestDriver0.add((java.lang.Object) 0L);
        java.lang.Object obj11 = linkedListTestDriver0.set((int) (short) 0, (java.lang.Object) (short) 1);
        java.lang.Object obj12 = linkedListTestDriver0.removeLast();
        linkedListTestDriver0.addLast((java.lang.Object) (-1.0d));
        java.lang.Object obj15 = linkedListTestDriver0.getLast();
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0L + "'", obj11, 0L);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (short) 1 + "'", obj12, (short) 1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1.0d) + "'", obj15, (-1.0d));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test051");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean5 = linkedListTestDriver0.remove((java.lang.Object) 10);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        boolean boolean8 = linkedListTestDriver0.add((java.lang.Object) 0L);
        java.lang.Object obj11 = linkedListTestDriver0.set((int) (short) 0, (java.lang.Object) (short) 1);
        java.lang.Object obj12 = linkedListTestDriver0.removeLast();
        boolean boolean13 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver15.addLast((java.lang.Object) (byte) -1);
        boolean boolean19 = linkedListTestDriver15.add((java.lang.Object) 0L);
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        int int22 = linkedListTestDriver21.size();
        boolean boolean24 = linkedListTestDriver21.add((java.lang.Object) 1L);
        linkedListTestDriver15.add(0, (java.lang.Object) linkedListTestDriver21);
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver26.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        int int31 = linkedListTestDriver30.size();
        java.lang.Object obj32 = linkedListTestDriver26.set(0, (java.lang.Object) linkedListTestDriver30);
        java.lang.Class<?> wildcardClass33 = linkedListTestDriver30.getClass();
        boolean boolean34 = linkedListTestDriver21.contains((java.lang.Object) wildcardClass33);
        boolean boolean36 = linkedListTestDriver21.add((java.lang.Object) 1L);
        experiment.util.Iterator iterator37 = linkedListTestDriver21.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj38 = linkedListTestDriver0.set(100, (java.lang.Object) linkedListTestDriver21);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0L + "'", obj11, 0L);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (short) 1 + "'", obj12, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (byte) -1 + "'", obj32, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(iterator37);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test052");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) 1L);
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator7 = linkedListTestDriver4.iterator();
        java.lang.Object[] objArray8 = linkedListTestDriver4.toArray();
        linkedListTestDriver0.addLast((java.lang.Object) objArray8);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        int int15 = linkedListTestDriver14.size();
        java.lang.Object obj16 = linkedListTestDriver10.set(0, (java.lang.Object) linkedListTestDriver14);
        linkedListTestDriver10.addFirst((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver19.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator22 = linkedListTestDriver19.iterator();
        linkedListTestDriver10.addLast((java.lang.Object) linkedListTestDriver19);
        boolean boolean25 = linkedListTestDriver19.contains((java.lang.Object) 0.0f);
        boolean boolean26 = linkedListTestDriver0.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver28.clear();
        linkedListTestDriver28.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = linkedListTestDriver0.set((-1), (java.lang.Object) linkedListTestDriver28);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) -1 + "'", obj16, (byte) -1);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test053");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean5 = linkedListTestDriver0.remove((java.lang.Object) 10);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        boolean boolean8 = linkedListTestDriver0.remove((java.lang.Object) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test054");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray4 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver5.addLast((java.lang.Object) ' ');
        java.lang.Object[] objArray8 = linkedListTestDriver5.toArray();
        linkedListTestDriver5.addFirst((java.lang.Object) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator15 = linkedListTestDriver12.iterator();
        boolean boolean17 = linkedListTestDriver12.remove((java.lang.Object) 10);
        linkedListTestDriver5.add((int) (short) 0, (java.lang.Object) 10);
        boolean boolean19 = linkedListTestDriver0.contains((java.lang.Object) (short) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver20.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator23 = linkedListTestDriver20.iterator();
        java.lang.Object[] objArray24 = linkedListTestDriver20.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver25.addLast((java.lang.Object) ' ');
        java.lang.Object[] objArray28 = linkedListTestDriver25.toArray();
        linkedListTestDriver25.addFirst((java.lang.Object) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver32.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator35 = linkedListTestDriver32.iterator();
        boolean boolean37 = linkedListTestDriver32.remove((java.lang.Object) 10);
        linkedListTestDriver25.add((int) (short) 0, (java.lang.Object) 10);
        boolean boolean39 = linkedListTestDriver20.contains((java.lang.Object) (short) 0);
        linkedListTestDriver0.addLast((java.lang.Object) boolean39);
        java.lang.Object obj41 = linkedListTestDriver0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator43 = linkedListTestDriver0.listIterator((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[ ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[ ]");
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[-1]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[ ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[ ]");
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + (byte) -1 + "'", obj41, (byte) -1);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test055");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) ' ');
        java.lang.Object[] objArray3 = linkedListTestDriver0.toArray();
        java.lang.Object obj4 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator9 = linkedListTestDriver6.iterator();
        boolean boolean11 = linkedListTestDriver6.remove((java.lang.Object) 10);
        java.lang.Object obj12 = linkedListTestDriver6.removeLast();
        boolean boolean14 = linkedListTestDriver6.add((java.lang.Object) 0L);
        linkedListTestDriver6.clear();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) ' ', (java.lang.Object) linkedListTestDriver6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 32; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[ ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[ ]");
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + ' ' + "'", obj4, ' ');
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test056");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        linkedListTestDriver0.addFirst((java.lang.Object) 1.0f);
        java.lang.Object obj5 = linkedListTestDriver0.getFirst();
        linkedListTestDriver0.addFirst((java.lang.Object) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = linkedListTestDriver0.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 1.0f + "'", obj5, 1.0f);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test057");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) 0L);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        int int7 = linkedListTestDriver6.size();
        boolean boolean9 = linkedListTestDriver6.add((java.lang.Object) 1L);
        linkedListTestDriver0.add(0, (java.lang.Object) linkedListTestDriver6);
        experiment.util.Iterator iterator11 = linkedListTestDriver6.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addLast((java.lang.Object) (byte) -1);
        boolean boolean16 = linkedListTestDriver12.add((java.lang.Object) 0L);
        java.lang.Object obj17 = linkedListTestDriver12.getLast();
        boolean boolean18 = linkedListTestDriver6.contains(obj17);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0L + "'", obj17, 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test058");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray4 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver5.addLast((java.lang.Object) ' ');
        java.lang.Object[] objArray8 = linkedListTestDriver5.toArray();
        linkedListTestDriver5.addFirst((java.lang.Object) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator15 = linkedListTestDriver12.iterator();
        boolean boolean17 = linkedListTestDriver12.remove((java.lang.Object) 10);
        linkedListTestDriver5.add((int) (short) 0, (java.lang.Object) 10);
        boolean boolean19 = linkedListTestDriver0.contains((java.lang.Object) (short) 0);
        java.lang.Class<?> wildcardClass20 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[ ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[ ]");
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test059");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean5 = linkedListTestDriver0.remove((java.lang.Object) 10);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        boolean boolean8 = linkedListTestDriver0.equals_CUT((java.lang.Object) '4');
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator11 = linkedListTestDriver0.listIterator((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 100; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test060");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean5 = linkedListTestDriver0.remove((java.lang.Object) 10);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        boolean boolean8 = linkedListTestDriver0.add((java.lang.Object) 0L);
        java.lang.Object obj11 = linkedListTestDriver0.set((int) (short) 0, (java.lang.Object) (short) 1);
        java.lang.Object obj12 = linkedListTestDriver0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = linkedListTestDriver0.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0L + "'", obj11, 0L);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (short) 1 + "'", obj12, (short) 1);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test061");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        int int2 = linkedListTestDriver0.size();
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = linkedListTestDriver0.set(0, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test062");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) 0L);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        int int7 = linkedListTestDriver6.size();
        boolean boolean9 = linkedListTestDriver6.add((java.lang.Object) 1L);
        linkedListTestDriver0.add(0, (java.lang.Object) linkedListTestDriver6);
        experiment.util.Iterator iterator11 = linkedListTestDriver6.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = linkedListTestDriver6.get((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test063");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.clear();
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = linkedListTestDriver0.getLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test064");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean5 = linkedListTestDriver0.remove((java.lang.Object) 10);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        boolean boolean8 = linkedListTestDriver0.add((java.lang.Object) 0L);
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = linkedListTestDriver0.remove((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test065");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        int int5 = linkedListTestDriver4.size();
        java.lang.Object obj6 = linkedListTestDriver0.set(0, (java.lang.Object) linkedListTestDriver4);
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.addLast((java.lang.Object) ' ');
        java.lang.Object[] objArray10 = linkedListTestDriver7.toArray();
        linkedListTestDriver0.addLast((java.lang.Object) objArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = linkedListTestDriver0.remove((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[ ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[ ]");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test066");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        linkedListTestDriver0.addFirst((java.lang.Object) 1.0f);
        java.lang.Object obj5 = linkedListTestDriver0.getFirst();
        linkedListTestDriver0.addFirst((java.lang.Object) (-1.0d));
        int int8 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver9.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator12 = linkedListTestDriver9.iterator();
        boolean boolean14 = linkedListTestDriver9.remove((java.lang.Object) 10);
        java.lang.Object obj15 = linkedListTestDriver9.removeLast();
        boolean boolean17 = linkedListTestDriver9.equals_CUT((java.lang.Object) '4');
        boolean boolean18 = linkedListTestDriver0.contains((java.lang.Object) '4');
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 1.0f + "'", obj5, 1.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) -1 + "'", obj15, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test067");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        int int5 = linkedListTestDriver4.size();
        boolean boolean7 = linkedListTestDriver4.add((java.lang.Object) 1L);
        java.lang.Object[] objArray8 = linkedListTestDriver4.toArray();
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver4);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator13 = linkedListTestDriver10.iterator();
        boolean boolean15 = linkedListTestDriver10.remove((java.lang.Object) 10);
        java.lang.Object obj16 = linkedListTestDriver10.removeLast();
        boolean boolean18 = linkedListTestDriver10.add((java.lang.Object) 0L);
        java.lang.Object obj21 = linkedListTestDriver10.set((int) (short) 0, (java.lang.Object) (short) 1);
        java.lang.Object obj22 = linkedListTestDriver10.removeLast();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver10);
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver24.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        int int29 = linkedListTestDriver28.size();
        java.lang.Object obj30 = linkedListTestDriver24.set(0, (java.lang.Object) linkedListTestDriver28);
        linkedListTestDriver24.addFirst((java.lang.Object) (short) 100);
        boolean boolean33 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver24);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator35 = linkedListTestDriver0.listIterator((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) -1 + "'", obj16, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0L + "'", obj21, 0L);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (short) 1 + "'", obj22, (short) 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (byte) -1 + "'", obj30, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test068");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) 0L);
        boolean boolean6 = linkedListTestDriver0.add((java.lang.Object) (short) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        int int8 = linkedListTestDriver7.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver9.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator12 = linkedListTestDriver9.iterator();
        java.lang.Object[] objArray13 = linkedListTestDriver9.toArray();
        boolean boolean14 = linkedListTestDriver7.equals_CUT((java.lang.Object) linkedListTestDriver9);
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver7);
        linkedListTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test069");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray4 = linkedListTestDriver0.toArray();
        java.lang.Object obj5 = linkedListTestDriver0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = linkedListTestDriver0.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1]");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test070");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        int int5 = linkedListTestDriver4.size();
        boolean boolean7 = linkedListTestDriver4.add((java.lang.Object) 1L);
        java.lang.Object[] objArray8 = linkedListTestDriver4.toArray();
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver4);
        java.lang.Object obj10 = linkedListTestDriver0.getLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = linkedListTestDriver0.get((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test071");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver2.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator5 = linkedListTestDriver2.iterator();
        java.lang.Object[] objArray6 = linkedListTestDriver2.toArray();
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver2);
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test072");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray4 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver5.addLast((java.lang.Object) ' ');
        java.lang.Object[] objArray8 = linkedListTestDriver5.toArray();
        linkedListTestDriver5.addFirst((java.lang.Object) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator15 = linkedListTestDriver12.iterator();
        boolean boolean17 = linkedListTestDriver12.remove((java.lang.Object) 10);
        linkedListTestDriver5.add((int) (short) 0, (java.lang.Object) 10);
        boolean boolean19 = linkedListTestDriver0.contains((java.lang.Object) (short) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver20.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator23 = linkedListTestDriver20.iterator();
        java.lang.Object[] objArray24 = linkedListTestDriver20.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver25.addLast((java.lang.Object) ' ');
        java.lang.Object[] objArray28 = linkedListTestDriver25.toArray();
        linkedListTestDriver25.addFirst((java.lang.Object) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver32.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator35 = linkedListTestDriver32.iterator();
        boolean boolean37 = linkedListTestDriver32.remove((java.lang.Object) 10);
        linkedListTestDriver25.add((int) (short) 0, (java.lang.Object) 10);
        boolean boolean39 = linkedListTestDriver20.contains((java.lang.Object) (short) 0);
        linkedListTestDriver0.addLast((java.lang.Object) boolean39);
        java.lang.Object obj41 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver43 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver43.addLast((java.lang.Object) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj46 = linkedListTestDriver0.set((int) (short) 1, (java.lang.Object) linkedListTestDriver43);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[ ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[ ]");
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[-1]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[ ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[ ]");
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + (byte) -1 + "'", obj41, (byte) -1);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test073");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) 0L);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        int int7 = linkedListTestDriver6.size();
        boolean boolean9 = linkedListTestDriver6.add((java.lang.Object) 1L);
        linkedListTestDriver0.add(0, (java.lang.Object) linkedListTestDriver6);
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addLast((java.lang.Object) (byte) -1);
        boolean boolean16 = linkedListTestDriver12.add((java.lang.Object) 0L);
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        int int19 = linkedListTestDriver18.size();
        boolean boolean21 = linkedListTestDriver18.add((java.lang.Object) 1L);
        linkedListTestDriver12.add(0, (java.lang.Object) linkedListTestDriver18);
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver23.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator26 = linkedListTestDriver23.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver27 = new experiment.util.LinkedListTestDriver();
        int int28 = linkedListTestDriver27.size();
        boolean boolean30 = linkedListTestDriver27.add((java.lang.Object) 1L);
        java.lang.Object[] objArray31 = linkedListTestDriver27.toArray();
        boolean boolean32 = linkedListTestDriver23.remove((java.lang.Object) linkedListTestDriver27);
        java.lang.Object obj33 = linkedListTestDriver23.getLast();
        boolean boolean34 = linkedListTestDriver18.contains((java.lang.Object) linkedListTestDriver23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = linkedListTestDriver0.set((int) '#', (java.lang.Object) linkedListTestDriver23);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[1]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (byte) -1 + "'", obj33, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test074");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean5 = linkedListTestDriver0.remove((java.lang.Object) 10);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        boolean boolean8 = linkedListTestDriver0.equals_CUT((java.lang.Object) '4');
        boolean boolean10 = linkedListTestDriver0.add((java.lang.Object) 100.0d);
        java.lang.Object obj11 = null;
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.addFirst(obj11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test075");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        int int5 = linkedListTestDriver4.size();
        java.lang.Object obj6 = linkedListTestDriver0.set(0, (java.lang.Object) linkedListTestDriver4);
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.addLast((java.lang.Object) ' ');
        java.lang.Object[] objArray10 = linkedListTestDriver7.toArray();
        linkedListTestDriver0.addLast((java.lang.Object) objArray10);
        int int12 = linkedListTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[ ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[ ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test076");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean5 = linkedListTestDriver0.remove((java.lang.Object) 10);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        boolean boolean8 = linkedListTestDriver0.add((java.lang.Object) 0L);
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = linkedListTestDriver0.getLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test077");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean5 = linkedListTestDriver0.remove((java.lang.Object) 10);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        boolean boolean8 = linkedListTestDriver0.equals_CUT((java.lang.Object) '4');
        int int9 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator14 = linkedListTestDriver11.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver15.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator18 = linkedListTestDriver15.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        int int20 = linkedListTestDriver19.size();
        boolean boolean22 = linkedListTestDriver19.add((java.lang.Object) 1L);
        java.lang.Object[] objArray23 = linkedListTestDriver19.toArray();
        boolean boolean24 = linkedListTestDriver15.remove((java.lang.Object) linkedListTestDriver19);
        java.lang.Object obj25 = linkedListTestDriver15.getLast();
        boolean boolean26 = linkedListTestDriver11.add(obj25);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add(100, obj25);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 100; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[1]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test078");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean5 = linkedListTestDriver0.remove((java.lang.Object) 10);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = linkedListTestDriver0.remove((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test079");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 10.0d);
        int int3 = linkedListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = linkedListTestDriver0.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test080");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = linkedListTestDriver0.get((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test081");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean5 = linkedListTestDriver0.remove((java.lang.Object) 10);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        boolean boolean8 = linkedListTestDriver0.add((java.lang.Object) 0L);
        java.lang.Object obj11 = linkedListTestDriver0.set((int) (short) 0, (java.lang.Object) (short) 1);
        java.lang.Object obj12 = linkedListTestDriver0.removeLast();
        boolean boolean13 = linkedListTestDriver0.isEmpty();
        boolean boolean15 = linkedListTestDriver0.contains((java.lang.Object) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = linkedListTestDriver0.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0L + "'", obj11, 0L);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (short) 1 + "'", obj12, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test082");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        linkedListTestDriver0.addFirst((java.lang.Object) 1.0f);
        java.lang.Object obj5 = linkedListTestDriver0.getFirst();
        experiment.util.ListIterator listIterator7 = linkedListTestDriver0.listIterator(0);
        java.lang.Object[] objArray8 = linkedListTestDriver0.toArray();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 1.0f + "'", obj5, 1.0f);
        org.junit.Assert.assertNotNull(listIterator7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1.0, -1]");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test083");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean5 = linkedListTestDriver0.remove((java.lang.Object) 10);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        boolean boolean8 = linkedListTestDriver0.add((java.lang.Object) 0L);
        java.lang.Object obj11 = linkedListTestDriver0.set((int) (short) 0, (java.lang.Object) (short) 1);
        java.lang.Object obj12 = linkedListTestDriver0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = linkedListTestDriver0.getLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0L + "'", obj11, 0L);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (short) 1 + "'", obj12, (short) 1);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test084");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        int int5 = linkedListTestDriver4.size();
        boolean boolean7 = linkedListTestDriver4.add((java.lang.Object) 1L);
        java.lang.Object[] objArray8 = linkedListTestDriver4.toArray();
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver4);
        java.lang.Object obj10 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator14 = linkedListTestDriver11.iterator();
        boolean boolean16 = linkedListTestDriver11.remove((java.lang.Object) 10);
        java.lang.Object obj17 = linkedListTestDriver11.removeLast();
        boolean boolean19 = linkedListTestDriver11.equals_CUT((java.lang.Object) '4');
        int int20 = linkedListTestDriver11.size();
        boolean boolean21 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = linkedListTestDriver0.remove((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test085");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) 0L);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        int int13 = linkedListTestDriver12.size();
        java.lang.Object obj14 = linkedListTestDriver8.set(0, (java.lang.Object) linkedListTestDriver12);
        linkedListTestDriver8.addFirst((java.lang.Object) (short) 100);
        linkedListTestDriver8.addFirst((java.lang.Object) (byte) -1);
        java.lang.Object obj19 = linkedListTestDriver8.getFirst();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add(100, obj19);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 100; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0L + "'", obj5, 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) -1 + "'", obj19, (byte) -1);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test086");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        int int4 = linkedListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = linkedListTestDriver0.get(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test087");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        boolean boolean2 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = linkedListTestDriver0.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test088");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) ' ');
        boolean boolean4 = linkedListTestDriver0.contains((java.lang.Object) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator6 = linkedListTestDriver0.listIterator((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 35; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test089");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        linkedListTestDriver0.addFirst((java.lang.Object) 1.0f);
        java.lang.Object obj5 = linkedListTestDriver0.getFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = linkedListTestDriver0.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 1.0f + "'", obj5, 1.0f);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test090");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        int int5 = linkedListTestDriver4.size();
        java.lang.Object obj6 = linkedListTestDriver0.set(0, (java.lang.Object) linkedListTestDriver4);
        linkedListTestDriver0.addFirst((java.lang.Object) (short) 100);
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) -1);
        boolean boolean11 = linkedListTestDriver0.isEmpty();
        boolean boolean12 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = linkedListTestDriver0.remove((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test091");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        int int5 = linkedListTestDriver4.size();
        boolean boolean7 = linkedListTestDriver4.add((java.lang.Object) 1L);
        java.lang.Object[] objArray8 = linkedListTestDriver4.toArray();
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver4);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator13 = linkedListTestDriver10.iterator();
        boolean boolean15 = linkedListTestDriver10.remove((java.lang.Object) 10);
        java.lang.Object obj16 = linkedListTestDriver10.removeLast();
        boolean boolean18 = linkedListTestDriver10.add((java.lang.Object) 0L);
        java.lang.Object obj21 = linkedListTestDriver10.set((int) (short) 0, (java.lang.Object) (short) 1);
        java.lang.Object obj22 = linkedListTestDriver10.removeLast();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = linkedListTestDriver10.remove((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) -1 + "'", obj16, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0L + "'", obj21, 0L);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (short) 1 + "'", obj22, (short) 1);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test092");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) 0L);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        java.lang.Object obj7 = linkedListTestDriver0.get((int) (byte) 0);
        java.lang.Object obj8 = linkedListTestDriver0.getLast();
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = linkedListTestDriver0.get(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0L + "'", obj5, 0L);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0L + "'", obj8, 0L);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test093");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) 0L);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        int int7 = linkedListTestDriver6.size();
        boolean boolean9 = linkedListTestDriver6.add((java.lang.Object) 1L);
        linkedListTestDriver0.add(0, (java.lang.Object) linkedListTestDriver6);
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        int int16 = linkedListTestDriver15.size();
        java.lang.Object obj17 = linkedListTestDriver11.set(0, (java.lang.Object) linkedListTestDriver15);
        java.lang.Class<?> wildcardClass18 = linkedListTestDriver15.getClass();
        boolean boolean19 = linkedListTestDriver6.contains((java.lang.Object) wildcardClass18);
        java.lang.Object obj20 = linkedListTestDriver6.getLast();
        linkedListTestDriver6.addLast((java.lang.Object) 100.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 1L + "'", obj20, 1L);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test094");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        int int5 = linkedListTestDriver4.size();
        boolean boolean7 = linkedListTestDriver4.add((java.lang.Object) 1L);
        java.lang.Object[] objArray8 = linkedListTestDriver4.toArray();
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver4);
        java.lang.Object obj10 = linkedListTestDriver0.getLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = linkedListTestDriver0.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test095");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver3.addLast((java.lang.Object) (byte) -1);
        boolean boolean7 = linkedListTestDriver3.add((java.lang.Object) 0L);
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        int int10 = linkedListTestDriver9.size();
        boolean boolean12 = linkedListTestDriver9.add((java.lang.Object) 1L);
        linkedListTestDriver3.add(0, (java.lang.Object) linkedListTestDriver9);
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver14.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator17 = linkedListTestDriver14.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        int int19 = linkedListTestDriver18.size();
        boolean boolean21 = linkedListTestDriver18.add((java.lang.Object) 1L);
        java.lang.Object[] objArray22 = linkedListTestDriver18.toArray();
        boolean boolean23 = linkedListTestDriver14.remove((java.lang.Object) linkedListTestDriver18);
        java.lang.Object obj24 = linkedListTestDriver14.getLast();
        boolean boolean25 = linkedListTestDriver9.contains((java.lang.Object) linkedListTestDriver14);
        boolean boolean26 = linkedListTestDriver14.isEmpty();
        boolean boolean27 = linkedListTestDriver0.remove((java.lang.Object) boolean26);
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver29.addLast((java.lang.Object) ' ');
        boolean boolean33 = linkedListTestDriver29.contains((java.lang.Object) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) ' ', (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 32; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) -1 + "'", obj24, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test096");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) 1L);
        boolean boolean4 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator9 = linkedListTestDriver6.iterator();
        java.lang.Object[] objArray10 = linkedListTestDriver6.toArray();
        linkedListTestDriver6.clear();
        java.lang.Class<?> wildcardClass12 = linkedListTestDriver6.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = linkedListTestDriver0.set((int) (byte) -1, (java.lang.Object) wildcardClass12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test097");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) 0L);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        int int7 = linkedListTestDriver6.size();
        boolean boolean9 = linkedListTestDriver6.add((java.lang.Object) 1L);
        linkedListTestDriver0.add(0, (java.lang.Object) linkedListTestDriver6);
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        int int16 = linkedListTestDriver15.size();
        java.lang.Object obj17 = linkedListTestDriver11.set(0, (java.lang.Object) linkedListTestDriver15);
        java.lang.Class<?> wildcardClass18 = linkedListTestDriver15.getClass();
        boolean boolean19 = linkedListTestDriver6.contains((java.lang.Object) wildcardClass18);
        boolean boolean21 = linkedListTestDriver6.add((java.lang.Object) 1L);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        int int23 = linkedListTestDriver22.size();
        boolean boolean25 = linkedListTestDriver22.add((java.lang.Object) 1L);
        java.lang.Object[] objArray26 = linkedListTestDriver22.toArray();
        boolean boolean27 = linkedListTestDriver6.equals_CUT((java.lang.Object) objArray26);
        experiment.util.Iterator iterator28 = linkedListTestDriver6.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        int int31 = linkedListTestDriver30.size();
        java.lang.Class<?> wildcardClass32 = linkedListTestDriver30.getClass();
        linkedListTestDriver6.add(0, (java.lang.Object) linkedListTestDriver30);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator35 = linkedListTestDriver30.listIterator((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 100; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[1]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test098");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) 0L);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = linkedListTestDriver0.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0L + "'", obj5, 0L);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test099");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) 0L);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        int int7 = linkedListTestDriver6.size();
        boolean boolean9 = linkedListTestDriver6.add((java.lang.Object) 1L);
        linkedListTestDriver0.add(0, (java.lang.Object) linkedListTestDriver6);
        boolean boolean12 = linkedListTestDriver6.remove((java.lang.Object) false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test100");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        int int5 = linkedListTestDriver4.size();
        boolean boolean7 = linkedListTestDriver4.add((java.lang.Object) 1L);
        java.lang.Object[] objArray8 = linkedListTestDriver4.toArray();
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver4);
        java.lang.Object obj10 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator14 = linkedListTestDriver11.iterator();
        boolean boolean16 = linkedListTestDriver11.remove((java.lang.Object) 10);
        java.lang.Object obj17 = linkedListTestDriver11.removeLast();
        boolean boolean19 = linkedListTestDriver11.equals_CUT((java.lang.Object) '4');
        int int20 = linkedListTestDriver11.size();
        boolean boolean21 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = linkedListTestDriver11.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test101");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver2.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator5 = linkedListTestDriver2.iterator();
        java.lang.Object[] objArray6 = linkedListTestDriver2.toArray();
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver2);
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver2.addLast(obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test102");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        linkedListTestDriver0.addFirst((java.lang.Object) 1.0f);
        java.lang.Object obj5 = linkedListTestDriver0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator7 = linkedListTestDriver0.listIterator(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 2; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 1.0f + "'", obj5, 1.0f);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test103");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        int int5 = linkedListTestDriver4.size();
        boolean boolean7 = linkedListTestDriver4.add((java.lang.Object) 1L);
        java.lang.Object[] objArray8 = linkedListTestDriver4.toArray();
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver4);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator13 = linkedListTestDriver10.iterator();
        boolean boolean15 = linkedListTestDriver10.remove((java.lang.Object) 10);
        java.lang.Object obj16 = linkedListTestDriver10.removeLast();
        boolean boolean18 = linkedListTestDriver10.add((java.lang.Object) 0L);
        java.lang.Object obj21 = linkedListTestDriver10.set((int) (short) 0, (java.lang.Object) (short) 1);
        java.lang.Object obj22 = linkedListTestDriver10.removeLast();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver10);
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver24.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        int int29 = linkedListTestDriver28.size();
        java.lang.Object obj30 = linkedListTestDriver24.set(0, (java.lang.Object) linkedListTestDriver28);
        linkedListTestDriver24.addFirst((java.lang.Object) (short) 100);
        boolean boolean33 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver24);
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver34.addLast((java.lang.Object) (byte) -1);
        linkedListTestDriver34.addFirst((java.lang.Object) 1.0f);
        java.lang.Object obj39 = linkedListTestDriver34.getFirst();
        java.lang.Object obj40 = linkedListTestDriver34.getLast();
        boolean boolean41 = linkedListTestDriver24.contains((java.lang.Object) linkedListTestDriver34);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator43 = linkedListTestDriver34.listIterator((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) -1 + "'", obj16, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0L + "'", obj21, 0L);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (short) 1 + "'", obj22, (short) 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (byte) -1 + "'", obj30, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 1.0f + "'", obj39, 1.0f);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (byte) -1 + "'", obj40, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test104");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        int int5 = linkedListTestDriver4.size();
        boolean boolean7 = linkedListTestDriver4.add((java.lang.Object) 1L);
        java.lang.Object[] objArray8 = linkedListTestDriver4.toArray();
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver4);
        java.lang.Object obj10 = linkedListTestDriver0.getLast();
        java.lang.Object[] objArray11 = linkedListTestDriver0.toArray();
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[-1]");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test105");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean5 = linkedListTestDriver0.remove((java.lang.Object) 10);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        boolean boolean8 = linkedListTestDriver0.equals_CUT((java.lang.Object) '4');
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver9.addLast((java.lang.Object) (byte) -1);
        boolean boolean13 = linkedListTestDriver9.add((java.lang.Object) 0L);
        java.lang.Object obj15 = linkedListTestDriver9.get((int) (byte) 0);
        boolean boolean16 = linkedListTestDriver0.remove((java.lang.Object) (byte) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver18.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator21 = linkedListTestDriver18.iterator();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) '4', (java.lang.Object) iterator21);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 52; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) -1 + "'", obj15, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(iterator21);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test106");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) ' ');
        java.lang.Object[] objArray3 = linkedListTestDriver0.toArray();
        java.lang.Object obj4 = linkedListTestDriver0.getLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = linkedListTestDriver0.remove((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[ ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[ ]");
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + ' ' + "'", obj4, ' ');
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test107");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) 0L);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        int int7 = linkedListTestDriver6.size();
        boolean boolean9 = linkedListTestDriver6.add((java.lang.Object) 1L);
        linkedListTestDriver0.add(0, (java.lang.Object) linkedListTestDriver6);
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        int int16 = linkedListTestDriver15.size();
        java.lang.Object obj17 = linkedListTestDriver11.set(0, (java.lang.Object) linkedListTestDriver15);
        java.lang.Class<?> wildcardClass18 = linkedListTestDriver15.getClass();
        boolean boolean19 = linkedListTestDriver6.contains((java.lang.Object) wildcardClass18);
        boolean boolean21 = linkedListTestDriver6.add((java.lang.Object) 1L);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        int int23 = linkedListTestDriver22.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver24.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator27 = linkedListTestDriver24.iterator();
        java.lang.Object[] objArray28 = linkedListTestDriver24.toArray();
        boolean boolean29 = linkedListTestDriver22.equals_CUT((java.lang.Object) linkedListTestDriver24);
        boolean boolean30 = linkedListTestDriver6.remove((java.lang.Object) linkedListTestDriver22);
        java.lang.Class<?> wildcardClass31 = linkedListTestDriver22.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test108");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) 1L);
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator7 = linkedListTestDriver4.iterator();
        java.lang.Object[] objArray8 = linkedListTestDriver4.toArray();
        linkedListTestDriver0.addLast((java.lang.Object) objArray8);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        int int15 = linkedListTestDriver14.size();
        java.lang.Object obj16 = linkedListTestDriver10.set(0, (java.lang.Object) linkedListTestDriver14);
        linkedListTestDriver10.addFirst((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver19.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator22 = linkedListTestDriver19.iterator();
        linkedListTestDriver10.addLast((java.lang.Object) linkedListTestDriver19);
        boolean boolean25 = linkedListTestDriver19.contains((java.lang.Object) 0.0f);
        boolean boolean26 = linkedListTestDriver0.equals_CUT((java.lang.Object) 0.0f);
        java.lang.Object obj27 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver28.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator31 = linkedListTestDriver28.iterator();
        boolean boolean33 = linkedListTestDriver28.remove((java.lang.Object) 10);
        java.lang.Object obj34 = linkedListTestDriver28.removeLast();
        boolean boolean36 = linkedListTestDriver28.add((java.lang.Object) 0L);
        java.lang.Object obj39 = linkedListTestDriver28.set((int) (short) 0, (java.lang.Object) (short) 1);
        java.lang.Object obj40 = linkedListTestDriver28.removeLast();
        linkedListTestDriver28.clear();
        linkedListTestDriver28.clear();
        boolean boolean43 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver28);
        experiment.util.ListIterator listIterator45 = linkedListTestDriver0.listIterator((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) -1 + "'", obj16, (byte) -1);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 1L + "'", obj27, 1L);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (byte) -1 + "'", obj34, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 0L + "'", obj39, 0L);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (short) 1 + "'", obj40, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(listIterator45);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test109");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean5 = linkedListTestDriver0.remove((java.lang.Object) 10);
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.addLast((java.lang.Object) ' ');
        java.lang.Object[] objArray11 = linkedListTestDriver8.toArray();
        linkedListTestDriver8.addFirst((java.lang.Object) 1);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((-1), (java.lang.Object) linkedListTestDriver8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[ ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[ ]");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test110");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) 0L);
        boolean boolean6 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.addLast((java.lang.Object) (byte) -1);
        boolean boolean12 = linkedListTestDriver8.add((java.lang.Object) 0L);
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        int int15 = linkedListTestDriver14.size();
        boolean boolean17 = linkedListTestDriver14.add((java.lang.Object) 1L);
        linkedListTestDriver8.add(0, (java.lang.Object) linkedListTestDriver14);
        experiment.util.Iterator iterator19 = linkedListTestDriver14.iterator();
        linkedListTestDriver14.addLast((java.lang.Object) '#');
        java.lang.Object obj23 = linkedListTestDriver14.remove(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = linkedListTestDriver0.set(2, (java.lang.Object) linkedListTestDriver14);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + '#' + "'", obj23, '#');
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test111");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        int int5 = linkedListTestDriver4.size();
        boolean boolean7 = linkedListTestDriver4.add((java.lang.Object) 1L);
        java.lang.Object[] objArray8 = linkedListTestDriver4.toArray();
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver4);
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        int int12 = linkedListTestDriver11.size();
        boolean boolean14 = linkedListTestDriver11.add((java.lang.Object) 1L);
        boolean boolean15 = linkedListTestDriver11.isEmpty();
        java.lang.Object[] objArray16 = linkedListTestDriver11.toArray();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) (short) 100, (java.lang.Object) linkedListTestDriver11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 100; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[1]");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test112");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) 0L);
        boolean boolean6 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1);
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((-1), obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test113");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean5 = linkedListTestDriver0.remove((java.lang.Object) 10);
        java.lang.Object obj6 = linkedListTestDriver0.getFirst();
        java.lang.Object obj8 = linkedListTestDriver0.remove(0);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) -1 + "'", obj8, (byte) -1);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test114");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver2.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator5 = linkedListTestDriver2.iterator();
        java.lang.Object[] objArray6 = linkedListTestDriver2.toArray();
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver2);
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray9 = linkedListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = linkedListTestDriver0.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test115");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) 0L);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        int int7 = linkedListTestDriver6.size();
        boolean boolean9 = linkedListTestDriver6.add((java.lang.Object) 1L);
        linkedListTestDriver0.add(0, (java.lang.Object) linkedListTestDriver6);
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator15 = linkedListTestDriver12.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver16.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator19 = linkedListTestDriver16.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        int int21 = linkedListTestDriver20.size();
        boolean boolean23 = linkedListTestDriver20.add((java.lang.Object) 1L);
        java.lang.Object[] objArray24 = linkedListTestDriver20.toArray();
        boolean boolean25 = linkedListTestDriver16.remove((java.lang.Object) linkedListTestDriver20);
        java.lang.Object obj26 = linkedListTestDriver16.getLast();
        boolean boolean27 = linkedListTestDriver12.add(obj26);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver6.add((int) (byte) -1, obj26);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) -1 + "'", obj26, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test116");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) 1L);
        boolean boolean4 = linkedListTestDriver0.isEmpty();
        java.lang.Object[] objArray5 = linkedListTestDriver0.toArray();
        java.lang.Class<?> wildcardClass6 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test117");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.clear();
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test118");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver2.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator5 = linkedListTestDriver2.iterator();
        java.lang.Object[] objArray6 = linkedListTestDriver2.toArray();
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test119");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        java.lang.Object obj5 = linkedListTestDriver0.remove((int) (byte) 0);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test120");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        linkedListTestDriver0.addFirst((java.lang.Object) 1.0f);
        java.lang.Object obj5 = linkedListTestDriver0.getFirst();
        linkedListTestDriver0.addFirst((java.lang.Object) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator9 = linkedListTestDriver0.listIterator((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 32; size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 1.0f + "'", obj5, 1.0f);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test121");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) 1L);
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator7 = linkedListTestDriver4.iterator();
        java.lang.Object[] objArray8 = linkedListTestDriver4.toArray();
        linkedListTestDriver0.addLast((java.lang.Object) objArray8);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        int int15 = linkedListTestDriver14.size();
        java.lang.Object obj16 = linkedListTestDriver10.set(0, (java.lang.Object) linkedListTestDriver14);
        linkedListTestDriver10.addFirst((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver19.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator22 = linkedListTestDriver19.iterator();
        linkedListTestDriver10.addLast((java.lang.Object) linkedListTestDriver19);
        boolean boolean25 = linkedListTestDriver19.contains((java.lang.Object) 0.0f);
        boolean boolean26 = linkedListTestDriver0.equals_CUT((java.lang.Object) 0.0f);
        java.lang.Object obj27 = linkedListTestDriver0.removeFirst();
        linkedListTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) -1 + "'", obj16, (byte) -1);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 1L + "'", obj27, 1L);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test122");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) 0L);
        boolean boolean6 = linkedListTestDriver0.add((java.lang.Object) (short) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        int int8 = linkedListTestDriver7.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver9.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator12 = linkedListTestDriver9.iterator();
        java.lang.Object[] objArray13 = linkedListTestDriver9.toArray();
        boolean boolean14 = linkedListTestDriver7.equals_CUT((java.lang.Object) linkedListTestDriver9);
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver7);
        java.lang.Object obj16 = linkedListTestDriver0.removeFirst();
        int int17 = linkedListTestDriver0.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) -1 + "'", obj16, (byte) -1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test123");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) ' ');
        boolean boolean4 = linkedListTestDriver0.contains((java.lang.Object) 0.0d);
        int int5 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator10 = linkedListTestDriver7.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        int int12 = linkedListTestDriver11.size();
        boolean boolean14 = linkedListTestDriver11.add((java.lang.Object) 1L);
        java.lang.Object[] objArray15 = linkedListTestDriver11.toArray();
        boolean boolean16 = linkedListTestDriver7.remove((java.lang.Object) linkedListTestDriver11);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver17.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator20 = linkedListTestDriver17.iterator();
        boolean boolean22 = linkedListTestDriver17.remove((java.lang.Object) 10);
        java.lang.Object obj23 = linkedListTestDriver17.removeLast();
        boolean boolean25 = linkedListTestDriver17.add((java.lang.Object) 0L);
        java.lang.Object obj28 = linkedListTestDriver17.set((int) (short) 0, (java.lang.Object) (short) 1);
        java.lang.Object obj29 = linkedListTestDriver17.removeLast();
        linkedListTestDriver7.addLast((java.lang.Object) linkedListTestDriver17);
        linkedListTestDriver0.add((int) (short) 1, (java.lang.Object) linkedListTestDriver7);
        java.lang.Class<?> wildcardClass32 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 0L + "'", obj28, 0L);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (short) 1 + "'", obj29, (short) 1);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test124");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver3.clear();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add(1, (java.lang.Object) linkedListTestDriver3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 1; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test125");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean5 = linkedListTestDriver0.remove((java.lang.Object) 10);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        boolean boolean8 = linkedListTestDriver0.remove((java.lang.Object) (short) 0);
        experiment.util.Iterator iterator9 = linkedListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = linkedListTestDriver0.get(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test126");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver3.addLast((java.lang.Object) (byte) -1);
        boolean boolean7 = linkedListTestDriver3.add((java.lang.Object) 0L);
        boolean boolean9 = linkedListTestDriver3.equals_CUT((java.lang.Object) 1);
        boolean boolean11 = linkedListTestDriver3.remove((java.lang.Object) 10);
        java.lang.Object obj12 = linkedListTestDriver3.getLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = linkedListTestDriver0.set((int) 'a', (java.lang.Object) linkedListTestDriver3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0L + "'", obj12, 0L);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test127");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        int int5 = linkedListTestDriver4.size();
        java.lang.Object obj6 = linkedListTestDriver0.set(0, (java.lang.Object) linkedListTestDriver4);
        linkedListTestDriver0.addFirst((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver9.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator12 = linkedListTestDriver9.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver9);
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver15.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator18 = linkedListTestDriver15.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        int int20 = linkedListTestDriver19.size();
        boolean boolean22 = linkedListTestDriver19.add((java.lang.Object) 1L);
        java.lang.Object[] objArray23 = linkedListTestDriver19.toArray();
        boolean boolean24 = linkedListTestDriver15.remove((java.lang.Object) linkedListTestDriver19);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver25.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator28 = linkedListTestDriver25.iterator();
        boolean boolean30 = linkedListTestDriver25.remove((java.lang.Object) 10);
        java.lang.Object obj31 = linkedListTestDriver25.removeLast();
        boolean boolean33 = linkedListTestDriver25.add((java.lang.Object) 0L);
        java.lang.Object obj36 = linkedListTestDriver25.set((int) (short) 0, (java.lang.Object) (short) 1);
        java.lang.Object obj37 = linkedListTestDriver25.removeLast();
        linkedListTestDriver15.addLast((java.lang.Object) linkedListTestDriver25);
        int int39 = linkedListTestDriver15.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj40 = linkedListTestDriver9.set((int) 'a', (java.lang.Object) int39);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[1]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (byte) -1 + "'", obj31, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 0L + "'", obj36, 0L);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (short) 1 + "'", obj37, (short) 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test128");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        int int5 = linkedListTestDriver4.size();
        java.lang.Object obj6 = linkedListTestDriver0.set(0, (java.lang.Object) linkedListTestDriver4);
        java.lang.Object[] objArray7 = linkedListTestDriver0.toArray();
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = linkedListTestDriver0.add(obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test129");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) 0L);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        int int7 = linkedListTestDriver6.size();
        boolean boolean9 = linkedListTestDriver6.add((java.lang.Object) 1L);
        linkedListTestDriver0.add(0, (java.lang.Object) linkedListTestDriver6);
        java.lang.Class<?> wildcardClass11 = linkedListTestDriver6.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test130");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        int int5 = linkedListTestDriver4.size();
        java.lang.Object obj6 = linkedListTestDriver0.set(0, (java.lang.Object) linkedListTestDriver4);
        linkedListTestDriver0.addFirst((java.lang.Object) (short) 100);
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) -1);
        boolean boolean11 = linkedListTestDriver0.isEmpty();
        java.lang.Object obj12 = linkedListTestDriver0.removeFirst();
        java.lang.Object[] objArray13 = linkedListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator15 = linkedListTestDriver0.listIterator((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 52; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test131");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean5 = linkedListTestDriver0.remove((java.lang.Object) 10);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator10 = linkedListTestDriver7.iterator();
        boolean boolean12 = linkedListTestDriver7.remove((java.lang.Object) 10);
        java.lang.Object obj13 = linkedListTestDriver7.removeLast();
        boolean boolean15 = linkedListTestDriver7.equals_CUT((java.lang.Object) '4');
        boolean boolean17 = linkedListTestDriver7.add((java.lang.Object) 100.0d);
        boolean boolean18 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = linkedListTestDriver7.remove((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) -1 + "'", obj13, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test132");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) 0L);
        boolean boolean6 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1);
        boolean boolean8 = linkedListTestDriver0.remove((java.lang.Object) 10);
        int int9 = linkedListTestDriver0.size();
        java.lang.Object obj10 = linkedListTestDriver0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator12 = linkedListTestDriver0.listIterator((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 0L + "'", obj10, 0L);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test133");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray4 = linkedListTestDriver0.toArray();
        java.lang.Object obj5 = linkedListTestDriver0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator7 = linkedListTestDriver0.listIterator((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 1; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1]");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test134");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) ' ');
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver3.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        int int8 = linkedListTestDriver7.size();
        java.lang.Object obj9 = linkedListTestDriver3.set(0, (java.lang.Object) linkedListTestDriver7);
        linkedListTestDriver3.addFirst((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator15 = linkedListTestDriver12.iterator();
        linkedListTestDriver3.addLast((java.lang.Object) linkedListTestDriver12);
        boolean boolean18 = linkedListTestDriver12.contains((java.lang.Object) 0.0f);
        boolean boolean19 = linkedListTestDriver0.equals_CUT((java.lang.Object) boolean18);
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver20.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver23.addLast((java.lang.Object) (byte) -1);
        boolean boolean27 = linkedListTestDriver23.add((java.lang.Object) 0L);
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        int int30 = linkedListTestDriver29.size();
        boolean boolean32 = linkedListTestDriver29.add((java.lang.Object) 1L);
        linkedListTestDriver23.add(0, (java.lang.Object) linkedListTestDriver29);
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver34.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator37 = linkedListTestDriver34.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver38 = new experiment.util.LinkedListTestDriver();
        int int39 = linkedListTestDriver38.size();
        boolean boolean41 = linkedListTestDriver38.add((java.lang.Object) 1L);
        java.lang.Object[] objArray42 = linkedListTestDriver38.toArray();
        boolean boolean43 = linkedListTestDriver34.remove((java.lang.Object) linkedListTestDriver38);
        java.lang.Object obj44 = linkedListTestDriver34.getLast();
        boolean boolean45 = linkedListTestDriver29.contains((java.lang.Object) linkedListTestDriver34);
        boolean boolean46 = linkedListTestDriver34.isEmpty();
        boolean boolean47 = linkedListTestDriver20.remove((java.lang.Object) boolean46);
        boolean boolean48 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver20);
        experiment.util.LinkedListTestDriver linkedListTestDriver49 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver49.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver53 = new experiment.util.LinkedListTestDriver();
        int int54 = linkedListTestDriver53.size();
        java.lang.Object obj55 = linkedListTestDriver49.set(0, (java.lang.Object) linkedListTestDriver53);
        linkedListTestDriver49.clear();
        boolean boolean57 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver49);
        java.lang.Object obj58 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean59 = linkedListTestDriver49.equals_CUT(obj58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[1]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + (byte) -1 + "'", obj44, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + (byte) -1 + "'", obj55, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test135");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        int int5 = linkedListTestDriver4.size();
        boolean boolean7 = linkedListTestDriver4.add((java.lang.Object) 1L);
        java.lang.Object[] objArray8 = linkedListTestDriver4.toArray();
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver4);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator11 = linkedListTestDriver4.listIterator(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test136");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) ' ');
        java.lang.Object[] objArray3 = linkedListTestDriver0.toArray();
        java.lang.Object obj4 = linkedListTestDriver0.getLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = linkedListTestDriver0.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[ ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[ ]");
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + ' ' + "'", obj4, ' ');
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test137");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        int int5 = linkedListTestDriver4.size();
        boolean boolean7 = linkedListTestDriver4.add((java.lang.Object) 1L);
        java.lang.Object[] objArray8 = linkedListTestDriver4.toArray();
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver4);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator13 = linkedListTestDriver10.iterator();
        boolean boolean15 = linkedListTestDriver10.remove((java.lang.Object) 10);
        java.lang.Object obj16 = linkedListTestDriver10.removeLast();
        boolean boolean18 = linkedListTestDriver10.add((java.lang.Object) 0L);
        java.lang.Object obj21 = linkedListTestDriver10.set((int) (short) 0, (java.lang.Object) (short) 1);
        java.lang.Object obj22 = linkedListTestDriver10.removeLast();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver10);
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver24.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        int int29 = linkedListTestDriver28.size();
        java.lang.Object obj30 = linkedListTestDriver24.set(0, (java.lang.Object) linkedListTestDriver28);
        linkedListTestDriver24.addFirst((java.lang.Object) (short) 100);
        boolean boolean33 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver24);
        java.lang.Class<?> wildcardClass34 = linkedListTestDriver24.getClass();
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) -1 + "'", obj16, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0L + "'", obj21, 0L);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (short) 1 + "'", obj22, (short) 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (byte) -1 + "'", obj30, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test138");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver3.addLast((java.lang.Object) (byte) -1);
        boolean boolean7 = linkedListTestDriver3.add((java.lang.Object) 0L);
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        int int10 = linkedListTestDriver9.size();
        boolean boolean12 = linkedListTestDriver9.add((java.lang.Object) 1L);
        linkedListTestDriver3.add(0, (java.lang.Object) linkedListTestDriver9);
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver14.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator17 = linkedListTestDriver14.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        int int19 = linkedListTestDriver18.size();
        boolean boolean21 = linkedListTestDriver18.add((java.lang.Object) 1L);
        java.lang.Object[] objArray22 = linkedListTestDriver18.toArray();
        boolean boolean23 = linkedListTestDriver14.remove((java.lang.Object) linkedListTestDriver18);
        java.lang.Object obj24 = linkedListTestDriver14.getLast();
        boolean boolean25 = linkedListTestDriver9.contains((java.lang.Object) linkedListTestDriver14);
        boolean boolean26 = linkedListTestDriver14.isEmpty();
        boolean boolean27 = linkedListTestDriver0.remove((java.lang.Object) boolean26);
        experiment.util.Iterator iterator28 = linkedListTestDriver0.iterator();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) -1 + "'", obj24, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(iterator28);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test139");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) 0L);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        int int7 = linkedListTestDriver6.size();
        boolean boolean9 = linkedListTestDriver6.add((java.lang.Object) 1L);
        linkedListTestDriver0.add(0, (java.lang.Object) linkedListTestDriver6);
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator14 = linkedListTestDriver11.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        int int16 = linkedListTestDriver15.size();
        boolean boolean18 = linkedListTestDriver15.add((java.lang.Object) 1L);
        java.lang.Object[] objArray19 = linkedListTestDriver15.toArray();
        boolean boolean20 = linkedListTestDriver11.remove((java.lang.Object) linkedListTestDriver15);
        java.lang.Object obj21 = linkedListTestDriver11.getLast();
        boolean boolean22 = linkedListTestDriver6.contains((java.lang.Object) linkedListTestDriver11);
        java.lang.Class<?> wildcardClass23 = linkedListTestDriver6.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) -1 + "'", obj21, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test140");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        int int5 = linkedListTestDriver4.size();
        boolean boolean7 = linkedListTestDriver4.add((java.lang.Object) 1L);
        java.lang.Object[] objArray8 = linkedListTestDriver4.toArray();
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver4);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator13 = linkedListTestDriver10.iterator();
        boolean boolean15 = linkedListTestDriver10.remove((java.lang.Object) 10);
        java.lang.Object obj16 = linkedListTestDriver10.removeLast();
        boolean boolean18 = linkedListTestDriver10.add((java.lang.Object) 0L);
        java.lang.Object obj21 = linkedListTestDriver10.set((int) (short) 0, (java.lang.Object) (short) 1);
        java.lang.Object obj22 = linkedListTestDriver10.removeLast();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver10);
        boolean boolean24 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator26 = linkedListTestDriver0.listIterator((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 100; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) -1 + "'", obj16, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0L + "'", obj21, 0L);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (short) 1 + "'", obj22, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test141");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) 0L);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        int int7 = linkedListTestDriver6.size();
        boolean boolean9 = linkedListTestDriver6.add((java.lang.Object) 1L);
        linkedListTestDriver0.add(0, (java.lang.Object) linkedListTestDriver6);
        boolean boolean11 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator15 = linkedListTestDriver12.iterator();
        java.lang.Object[] objArray16 = linkedListTestDriver12.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver17.addLast((java.lang.Object) ' ');
        java.lang.Object[] objArray20 = linkedListTestDriver17.toArray();
        linkedListTestDriver17.addFirst((java.lang.Object) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver24.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator27 = linkedListTestDriver24.iterator();
        boolean boolean29 = linkedListTestDriver24.remove((java.lang.Object) 10);
        linkedListTestDriver17.add((int) (short) 0, (java.lang.Object) 10);
        boolean boolean31 = linkedListTestDriver12.contains((java.lang.Object) (short) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver32.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator35 = linkedListTestDriver32.iterator();
        java.lang.Object[] objArray36 = linkedListTestDriver32.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver37.addLast((java.lang.Object) ' ');
        java.lang.Object[] objArray40 = linkedListTestDriver37.toArray();
        linkedListTestDriver37.addFirst((java.lang.Object) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver44 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver44.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator47 = linkedListTestDriver44.iterator();
        boolean boolean49 = linkedListTestDriver44.remove((java.lang.Object) 10);
        linkedListTestDriver37.add((int) (short) 0, (java.lang.Object) 10);
        boolean boolean51 = linkedListTestDriver32.contains((java.lang.Object) (short) 0);
        linkedListTestDriver12.addLast((java.lang.Object) boolean51);
        java.lang.Object[] objArray53 = linkedListTestDriver12.toArray();
        java.lang.Object obj54 = linkedListTestDriver12.removeFirst();
        boolean boolean55 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver12);
        java.lang.Object[] objArray56 = linkedListTestDriver0.toArray();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[-1]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[ ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[ ]");
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[-1]");
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[ ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[ ]");
        org.junit.Assert.assertNotNull(iterator47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[-1, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[-1, false]");
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + (byte) -1 + "'", obj54, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(objArray56);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test142");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        linkedListTestDriver0.addFirst((java.lang.Object) 1.0f);
        java.lang.Object obj5 = linkedListTestDriver0.getFirst();
        linkedListTestDriver0.addFirst((java.lang.Object) (-1.0d));
        int int8 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        int int10 = linkedListTestDriver9.size();
        java.lang.Class<?> wildcardClass11 = linkedListTestDriver9.getClass();
        boolean boolean12 = linkedListTestDriver0.contains((java.lang.Object) wildcardClass11);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver13.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator16 = linkedListTestDriver13.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        int int18 = linkedListTestDriver17.size();
        boolean boolean20 = linkedListTestDriver17.add((java.lang.Object) 1L);
        java.lang.Object[] objArray21 = linkedListTestDriver17.toArray();
        boolean boolean22 = linkedListTestDriver13.remove((java.lang.Object) linkedListTestDriver17);
        java.lang.Class<?> wildcardClass23 = linkedListTestDriver13.getClass();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = linkedListTestDriver0.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 1.0f + "'", obj5, 1.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test143");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        linkedListTestDriver0.addFirst((java.lang.Object) 1.0f);
        java.lang.Object obj5 = linkedListTestDriver0.getFirst();
        linkedListTestDriver0.addFirst((java.lang.Object) (-1.0d));
        int int8 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        boolean boolean11 = linkedListTestDriver0.add((java.lang.Object) (byte) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver13.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator16 = linkedListTestDriver13.iterator();
        boolean boolean18 = linkedListTestDriver13.remove((java.lang.Object) 10);
        experiment.util.Iterator iterator19 = linkedListTestDriver13.iterator();
        java.lang.Object obj20 = linkedListTestDriver13.getLast();
        boolean boolean21 = linkedListTestDriver13.isEmpty();
        int int22 = linkedListTestDriver13.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = linkedListTestDriver0.set((int) (short) 1, (java.lang.Object) int22);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 1.0f + "'", obj5, 1.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) -1 + "'", obj20, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test144");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) 0L);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.addLast((java.lang.Object) (byte) -1);
        boolean boolean11 = linkedListTestDriver7.add((java.lang.Object) 0L);
        java.lang.Object obj12 = linkedListTestDriver7.getLast();
        java.lang.Object obj14 = linkedListTestDriver7.get((int) (byte) 0);
        java.lang.Object obj15 = linkedListTestDriver7.getLast();
        boolean boolean16 = linkedListTestDriver0.equals_CUT(obj15);
        experiment.util.Iterator iterator17 = linkedListTestDriver0.iterator();
        int int18 = linkedListTestDriver0.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0L + "'", obj12, 0L);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0L + "'", obj15, 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test145");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = linkedListTestDriver0.getLast();
        java.lang.Object obj4 = linkedListTestDriver0.removeLast();
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test146");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean5 = linkedListTestDriver0.remove((java.lang.Object) 10);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        int int8 = linkedListTestDriver7.size();
        boolean boolean10 = linkedListTestDriver7.add((java.lang.Object) 1L);
        java.lang.Object[] objArray11 = linkedListTestDriver7.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver13.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator16 = linkedListTestDriver13.iterator();
        java.lang.Object[] objArray17 = linkedListTestDriver13.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver18.addLast((java.lang.Object) ' ');
        java.lang.Object[] objArray21 = linkedListTestDriver18.toArray();
        linkedListTestDriver18.addFirst((java.lang.Object) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver25.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator28 = linkedListTestDriver25.iterator();
        boolean boolean30 = linkedListTestDriver25.remove((java.lang.Object) 10);
        linkedListTestDriver18.add((int) (short) 0, (java.lang.Object) 10);
        boolean boolean32 = linkedListTestDriver13.contains((java.lang.Object) (short) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver33 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver33.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator36 = linkedListTestDriver33.iterator();
        java.lang.Object[] objArray37 = linkedListTestDriver33.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver38 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver38.addLast((java.lang.Object) ' ');
        java.lang.Object[] objArray41 = linkedListTestDriver38.toArray();
        linkedListTestDriver38.addFirst((java.lang.Object) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver45 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver45.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator48 = linkedListTestDriver45.iterator();
        boolean boolean50 = linkedListTestDriver45.remove((java.lang.Object) 10);
        linkedListTestDriver38.add((int) (short) 0, (java.lang.Object) 10);
        boolean boolean52 = linkedListTestDriver33.contains((java.lang.Object) (short) 0);
        linkedListTestDriver13.addLast((java.lang.Object) boolean52);
        java.lang.Object[] objArray54 = linkedListTestDriver13.toArray();
        linkedListTestDriver7.add(0, (java.lang.Object) objArray54);
        boolean boolean56 = linkedListTestDriver0.add((java.lang.Object) objArray54);
        experiment.util.LinkedListTestDriver linkedListTestDriver57 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver57.addLast((java.lang.Object) (byte) -1);
        linkedListTestDriver57.addFirst((java.lang.Object) 1.0f);
        java.lang.Object obj62 = linkedListTestDriver57.getFirst();
        linkedListTestDriver57.addFirst((java.lang.Object) (-1.0d));
        int int65 = linkedListTestDriver57.size();
        linkedListTestDriver57.clear();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver57);
        java.lang.Object obj68 = linkedListTestDriver0.getFirst();
        linkedListTestDriver0.clear();
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[1]");
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[-1]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[ ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[ ]");
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[-1]");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[ ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[ ]");
        org.junit.Assert.assertNotNull(iterator48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[-1, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[-1, false]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + 1.0f + "'", obj62, 1.0f);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 3 + "'", int65 == 3);
        org.junit.Assert.assertNotNull(obj68);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test147");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) ' ');
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver3.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        int int8 = linkedListTestDriver7.size();
        java.lang.Object obj9 = linkedListTestDriver3.set(0, (java.lang.Object) linkedListTestDriver7);
        linkedListTestDriver3.addFirst((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator15 = linkedListTestDriver12.iterator();
        linkedListTestDriver3.addLast((java.lang.Object) linkedListTestDriver12);
        boolean boolean18 = linkedListTestDriver12.contains((java.lang.Object) 0.0f);
        boolean boolean19 = linkedListTestDriver0.equals_CUT((java.lang.Object) boolean18);
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver20.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver23.addLast((java.lang.Object) (byte) -1);
        boolean boolean27 = linkedListTestDriver23.add((java.lang.Object) 0L);
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        int int30 = linkedListTestDriver29.size();
        boolean boolean32 = linkedListTestDriver29.add((java.lang.Object) 1L);
        linkedListTestDriver23.add(0, (java.lang.Object) linkedListTestDriver29);
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver34.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator37 = linkedListTestDriver34.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver38 = new experiment.util.LinkedListTestDriver();
        int int39 = linkedListTestDriver38.size();
        boolean boolean41 = linkedListTestDriver38.add((java.lang.Object) 1L);
        java.lang.Object[] objArray42 = linkedListTestDriver38.toArray();
        boolean boolean43 = linkedListTestDriver34.remove((java.lang.Object) linkedListTestDriver38);
        java.lang.Object obj44 = linkedListTestDriver34.getLast();
        boolean boolean45 = linkedListTestDriver29.contains((java.lang.Object) linkedListTestDriver34);
        boolean boolean46 = linkedListTestDriver34.isEmpty();
        boolean boolean47 = linkedListTestDriver20.remove((java.lang.Object) boolean46);
        boolean boolean48 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver20);
        experiment.util.LinkedListTestDriver linkedListTestDriver49 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver49.addLast((java.lang.Object) (byte) -1);
        boolean boolean53 = linkedListTestDriver49.add((java.lang.Object) 0L);
        boolean boolean55 = linkedListTestDriver49.equals_CUT((java.lang.Object) (short) 10);
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver49);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator58 = linkedListTestDriver0.listIterator((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 32; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[1]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + (byte) -1 + "'", obj44, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test148");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean5 = linkedListTestDriver0.remove((java.lang.Object) 10);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        boolean boolean8 = linkedListTestDriver0.equals_CUT((java.lang.Object) '4');
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = linkedListTestDriver0.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test149");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean5 = linkedListTestDriver0.remove((java.lang.Object) 10);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = linkedListTestDriver0.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test150");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) 0L);
        boolean boolean6 = linkedListTestDriver0.equals_CUT((java.lang.Object) (short) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.addLast((java.lang.Object) (byte) -1);
        boolean boolean11 = linkedListTestDriver7.add((java.lang.Object) 0L);
        boolean boolean12 = linkedListTestDriver7.isEmpty();
        linkedListTestDriver7.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver14.addLast((java.lang.Object) (byte) -1);
        boolean boolean18 = linkedListTestDriver14.add((java.lang.Object) 0L);
        java.lang.Object obj19 = linkedListTestDriver14.getLast();
        java.lang.Object obj21 = linkedListTestDriver14.get((int) (byte) 0);
        java.lang.Object obj22 = linkedListTestDriver14.getLast();
        boolean boolean23 = linkedListTestDriver7.equals_CUT(obj22);
        experiment.util.Iterator iterator24 = linkedListTestDriver7.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = linkedListTestDriver0.remove((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 0L + "'", obj19, 0L);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) -1 + "'", obj21, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 0L + "'", obj22, 0L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(iterator24);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test151");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean5 = linkedListTestDriver0.remove((java.lang.Object) 10);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        boolean boolean8 = linkedListTestDriver0.equals_CUT((java.lang.Object) '4');
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        int int11 = linkedListTestDriver10.size();
        boolean boolean13 = linkedListTestDriver10.add((java.lang.Object) 1L);
        java.lang.Object[] objArray14 = linkedListTestDriver10.toArray();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) '4', (java.lang.Object) linkedListTestDriver10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 52; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1]");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test152");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) 1L);
        java.lang.Object[] objArray4 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver5.addLast((java.lang.Object) (byte) -1);
        linkedListTestDriver5.addFirst((java.lang.Object) 1.0f);
        java.lang.Object obj10 = linkedListTestDriver5.getFirst();
        linkedListTestDriver5.clear();
        boolean boolean12 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = linkedListTestDriver5.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1.0f + "'", obj10, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test153");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        int int5 = linkedListTestDriver4.size();
        java.lang.Object obj6 = linkedListTestDriver0.set(0, (java.lang.Object) linkedListTestDriver4);
        boolean boolean7 = linkedListTestDriver4.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = linkedListTestDriver4.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test154");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.addLast((java.lang.Object) ' ');
        boolean boolean7 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver4);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test155");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean5 = linkedListTestDriver0.remove((java.lang.Object) 10);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        boolean boolean8 = linkedListTestDriver0.add((java.lang.Object) 0L);
        java.lang.Object obj11 = linkedListTestDriver0.set((int) (short) 0, (java.lang.Object) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator13 = linkedListTestDriver0.listIterator((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0L + "'", obj11, 0L);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test156");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) 0L);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        int int7 = linkedListTestDriver6.size();
        boolean boolean9 = linkedListTestDriver6.add((java.lang.Object) 1L);
        linkedListTestDriver0.add(0, (java.lang.Object) linkedListTestDriver6);
        boolean boolean11 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator15 = linkedListTestDriver12.iterator();
        boolean boolean16 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver12);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver17.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        int int22 = linkedListTestDriver21.size();
        java.lang.Object obj23 = linkedListTestDriver17.set(0, (java.lang.Object) linkedListTestDriver21);
        linkedListTestDriver17.clear();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver17);
        boolean boolean26 = linkedListTestDriver17.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test157");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        int int5 = linkedListTestDriver4.size();
        boolean boolean7 = linkedListTestDriver4.add((java.lang.Object) 1L);
        java.lang.Object[] objArray8 = linkedListTestDriver4.toArray();
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver4);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator13 = linkedListTestDriver10.iterator();
        boolean boolean15 = linkedListTestDriver10.remove((java.lang.Object) 10);
        java.lang.Object obj16 = linkedListTestDriver10.removeLast();
        boolean boolean18 = linkedListTestDriver10.add((java.lang.Object) 0L);
        java.lang.Object obj21 = linkedListTestDriver10.set((int) (short) 0, (java.lang.Object) (short) 1);
        java.lang.Object obj22 = linkedListTestDriver10.removeLast();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver10);
        int int24 = linkedListTestDriver0.size();
        java.lang.Object obj25 = linkedListTestDriver0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = linkedListTestDriver0.get((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) -1 + "'", obj16, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0L + "'", obj21, 0L);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (short) 1 + "'", obj22, (short) 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test158");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean5 = linkedListTestDriver0.remove((java.lang.Object) 10);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        boolean boolean8 = linkedListTestDriver0.add((java.lang.Object) 0L);
        java.lang.Object obj11 = linkedListTestDriver0.set((int) (short) 0, (java.lang.Object) (short) 1);
        java.lang.Object obj12 = linkedListTestDriver0.removeLast();
        linkedListTestDriver0.clear();
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = linkedListTestDriver0.get(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0L + "'", obj11, 0L);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (short) 1 + "'", obj12, (short) 1);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test159");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) ' ');
        java.lang.Object[] objArray3 = linkedListTestDriver0.toArray();
        int int4 = linkedListTestDriver0.size();
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        java.lang.Class<?> wildcardClass6 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[ ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[ ]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test160");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean5 = linkedListTestDriver0.remove((java.lang.Object) 10);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator10 = linkedListTestDriver7.iterator();
        boolean boolean12 = linkedListTestDriver7.remove((java.lang.Object) 10);
        java.lang.Object obj13 = linkedListTestDriver7.removeLast();
        boolean boolean15 = linkedListTestDriver7.equals_CUT((java.lang.Object) '4');
        boolean boolean17 = linkedListTestDriver7.add((java.lang.Object) 100.0d);
        boolean boolean18 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = linkedListTestDriver7.get(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) -1 + "'", obj13, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test161");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) 0L);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0L + "'", obj5, 0L);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0L + "'", obj6, 0L);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test162");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver2.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        int int7 = linkedListTestDriver6.size();
        java.lang.Object obj8 = linkedListTestDriver2.set(0, (java.lang.Object) linkedListTestDriver6);
        boolean boolean9 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver2);
        java.lang.Class<?> wildcardClass10 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) -1 + "'", obj8, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test163");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) 0L);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        int int7 = linkedListTestDriver6.size();
        boolean boolean9 = linkedListTestDriver6.add((java.lang.Object) 1L);
        linkedListTestDriver0.add(0, (java.lang.Object) linkedListTestDriver6);
        experiment.util.Iterator iterator11 = linkedListTestDriver6.iterator();
        linkedListTestDriver6.addLast((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver15.addLast((java.lang.Object) (byte) -1);
        boolean boolean19 = linkedListTestDriver15.add((java.lang.Object) 0L);
        boolean boolean21 = linkedListTestDriver15.add((java.lang.Object) (short) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        int int23 = linkedListTestDriver22.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver24.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator27 = linkedListTestDriver24.iterator();
        java.lang.Object[] objArray28 = linkedListTestDriver24.toArray();
        boolean boolean29 = linkedListTestDriver22.equals_CUT((java.lang.Object) linkedListTestDriver24);
        linkedListTestDriver15.addLast((java.lang.Object) linkedListTestDriver22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = linkedListTestDriver6.set(10, (java.lang.Object) linkedListTestDriver22);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test164");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean5 = linkedListTestDriver0.remove((java.lang.Object) 10);
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        java.lang.Object obj7 = linkedListTestDriver0.getLast();
        boolean boolean8 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver9.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        int int14 = linkedListTestDriver13.size();
        java.lang.Object obj15 = linkedListTestDriver9.set(0, (java.lang.Object) linkedListTestDriver13);
        boolean boolean17 = linkedListTestDriver9.add((java.lang.Object) 1.0d);
        linkedListTestDriver0.addLast((java.lang.Object) boolean17);
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver19.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator22 = linkedListTestDriver19.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        int int24 = linkedListTestDriver23.size();
        boolean boolean26 = linkedListTestDriver23.add((java.lang.Object) 1L);
        java.lang.Object[] objArray27 = linkedListTestDriver23.toArray();
        boolean boolean28 = linkedListTestDriver19.remove((java.lang.Object) linkedListTestDriver23);
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver29.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator32 = linkedListTestDriver29.iterator();
        boolean boolean34 = linkedListTestDriver29.remove((java.lang.Object) 10);
        java.lang.Object obj35 = linkedListTestDriver29.removeLast();
        boolean boolean37 = linkedListTestDriver29.add((java.lang.Object) 0L);
        java.lang.Object obj40 = linkedListTestDriver29.set((int) (short) 0, (java.lang.Object) (short) 1);
        java.lang.Object obj41 = linkedListTestDriver29.removeLast();
        linkedListTestDriver19.addLast((java.lang.Object) linkedListTestDriver29);
        experiment.util.LinkedListTestDriver linkedListTestDriver43 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver43.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver47 = new experiment.util.LinkedListTestDriver();
        int int48 = linkedListTestDriver47.size();
        java.lang.Object obj49 = linkedListTestDriver43.set(0, (java.lang.Object) linkedListTestDriver47);
        linkedListTestDriver43.addFirst((java.lang.Object) (short) 100);
        boolean boolean52 = linkedListTestDriver19.equals_CUT((java.lang.Object) linkedListTestDriver43);
        java.lang.Object obj54 = linkedListTestDriver19.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass55 = obj54.getClass();
        boolean boolean56 = linkedListTestDriver0.remove((java.lang.Object) wildcardClass55);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) -1 + "'", obj15, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[1]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (byte) -1 + "'", obj35, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 0L + "'", obj40, 0L);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + (short) 1 + "'", obj41, (short) 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + (byte) -1 + "'", obj49, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + (byte) -1 + "'", obj54, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test165");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) 0L);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0L + "'", obj5, 0L);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0L + "'", obj6, 0L);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test166");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator2 = linkedListTestDriver0.listIterator((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 1; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test167");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean5 = linkedListTestDriver0.remove((java.lang.Object) 10);
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.addLast((java.lang.Object) ' ');
        java.lang.Object[] objArray10 = linkedListTestDriver7.toArray();
        java.lang.Object obj11 = linkedListTestDriver7.getFirst();
        boolean boolean12 = linkedListTestDriver0.remove(obj11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = linkedListTestDriver0.remove(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[ ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[ ]");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + ' ' + "'", obj11, ' ');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test168");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) 0L);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        int int7 = linkedListTestDriver6.size();
        boolean boolean9 = linkedListTestDriver6.add((java.lang.Object) 1L);
        linkedListTestDriver0.add(0, (java.lang.Object) linkedListTestDriver6);
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator14 = linkedListTestDriver11.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        int int16 = linkedListTestDriver15.size();
        boolean boolean18 = linkedListTestDriver15.add((java.lang.Object) 1L);
        java.lang.Object[] objArray19 = linkedListTestDriver15.toArray();
        boolean boolean20 = linkedListTestDriver11.remove((java.lang.Object) linkedListTestDriver15);
        java.lang.Object obj21 = linkedListTestDriver11.getLast();
        boolean boolean22 = linkedListTestDriver6.contains((java.lang.Object) linkedListTestDriver11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = linkedListTestDriver11.remove((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) -1 + "'", obj21, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test169");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) 0L);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        java.lang.Object obj7 = linkedListTestDriver0.get((int) (byte) 0);
        java.lang.Object obj8 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        int int15 = linkedListTestDriver14.size();
        java.lang.Object obj16 = linkedListTestDriver10.set(0, (java.lang.Object) linkedListTestDriver14);
        linkedListTestDriver10.addFirst((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver19.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator22 = linkedListTestDriver19.iterator();
        boolean boolean24 = linkedListTestDriver19.remove((java.lang.Object) 10);
        java.lang.Object obj25 = linkedListTestDriver19.removeLast();
        boolean boolean27 = linkedListTestDriver19.add((java.lang.Object) 0L);
        linkedListTestDriver19.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver29.addLast((java.lang.Object) (byte) -1);
        boolean boolean33 = linkedListTestDriver29.add((java.lang.Object) 0L);
        experiment.util.LinkedListTestDriver linkedListTestDriver35 = new experiment.util.LinkedListTestDriver();
        int int36 = linkedListTestDriver35.size();
        boolean boolean38 = linkedListTestDriver35.add((java.lang.Object) 1L);
        linkedListTestDriver29.add(0, (java.lang.Object) linkedListTestDriver35);
        experiment.util.LinkedListTestDriver linkedListTestDriver40 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver40.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver44 = new experiment.util.LinkedListTestDriver();
        int int45 = linkedListTestDriver44.size();
        java.lang.Object obj46 = linkedListTestDriver40.set(0, (java.lang.Object) linkedListTestDriver44);
        java.lang.Class<?> wildcardClass47 = linkedListTestDriver44.getClass();
        boolean boolean48 = linkedListTestDriver35.contains((java.lang.Object) wildcardClass47);
        boolean boolean50 = linkedListTestDriver35.add((java.lang.Object) 1L);
        experiment.util.LinkedListTestDriver linkedListTestDriver51 = new experiment.util.LinkedListTestDriver();
        int int52 = linkedListTestDriver51.size();
        boolean boolean54 = linkedListTestDriver51.add((java.lang.Object) 1L);
        java.lang.Object[] objArray55 = linkedListTestDriver51.toArray();
        boolean boolean56 = linkedListTestDriver35.equals_CUT((java.lang.Object) objArray55);
        experiment.util.Iterator iterator57 = linkedListTestDriver35.iterator();
        linkedListTestDriver19.addFirst((java.lang.Object) linkedListTestDriver35);
        experiment.util.LinkedListTestDriver linkedListTestDriver59 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver59.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator62 = linkedListTestDriver59.iterator();
        boolean boolean64 = linkedListTestDriver59.remove((java.lang.Object) 10);
        linkedListTestDriver59.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver66 = new experiment.util.LinkedListTestDriver();
        boolean boolean68 = linkedListTestDriver66.contains((java.lang.Object) 10.0d);
        int int69 = linkedListTestDriver66.size();
        linkedListTestDriver59.addFirst((java.lang.Object) int69);
        java.lang.Object obj71 = linkedListTestDriver59.getLast();
        boolean boolean72 = linkedListTestDriver35.remove((java.lang.Object) linkedListTestDriver59);
        boolean boolean73 = linkedListTestDriver10.contains((java.lang.Object) linkedListTestDriver35);
        linkedListTestDriver0.add(1, (java.lang.Object) boolean73);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0L + "'", obj5, 0L);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0L + "'", obj8, 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) -1 + "'", obj16, (byte) -1);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + (byte) -1 + "'", obj46, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[1]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(iterator57);
        org.junit.Assert.assertNotNull(iterator62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertEquals("'" + obj71 + "' != '" + 0 + "'", obj71, 0);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test170");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) 1L);
        boolean boolean5 = linkedListTestDriver0.equals_CUT((java.lang.Object) true);
        java.lang.Object obj6 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator11 = linkedListTestDriver8.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        int int13 = linkedListTestDriver12.size();
        boolean boolean15 = linkedListTestDriver12.add((java.lang.Object) 1L);
        java.lang.Object[] objArray16 = linkedListTestDriver12.toArray();
        boolean boolean17 = linkedListTestDriver8.remove((java.lang.Object) linkedListTestDriver12);
        java.lang.Class<?> wildcardClass18 = linkedListTestDriver8.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = linkedListTestDriver0.set((int) '#', (java.lang.Object) linkedListTestDriver8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1L + "'", obj6, 1L);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test171");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) 0L);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        int int7 = linkedListTestDriver6.size();
        boolean boolean9 = linkedListTestDriver6.add((java.lang.Object) 1L);
        linkedListTestDriver0.add(0, (java.lang.Object) linkedListTestDriver6);
        experiment.util.Iterator iterator11 = linkedListTestDriver6.iterator();
        linkedListTestDriver6.addLast((java.lang.Object) '#');
        java.lang.Object obj15 = linkedListTestDriver6.remove(1);
        linkedListTestDriver6.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        int int19 = linkedListTestDriver18.size();
        boolean boolean21 = linkedListTestDriver18.add((java.lang.Object) 1L);
        java.lang.Object[] objArray22 = linkedListTestDriver18.toArray();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver6.add((int) (short) 100, (java.lang.Object) objArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 100; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + '#' + "'", obj15, '#');
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1]");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test172");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) ' ');
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver3.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        int int8 = linkedListTestDriver7.size();
        java.lang.Object obj9 = linkedListTestDriver3.set(0, (java.lang.Object) linkedListTestDriver7);
        linkedListTestDriver3.addFirst((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator15 = linkedListTestDriver12.iterator();
        linkedListTestDriver3.addLast((java.lang.Object) linkedListTestDriver12);
        boolean boolean18 = linkedListTestDriver12.contains((java.lang.Object) 0.0f);
        boolean boolean19 = linkedListTestDriver0.equals_CUT((java.lang.Object) boolean18);
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver20.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver23.addLast((java.lang.Object) (byte) -1);
        boolean boolean27 = linkedListTestDriver23.add((java.lang.Object) 0L);
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        int int30 = linkedListTestDriver29.size();
        boolean boolean32 = linkedListTestDriver29.add((java.lang.Object) 1L);
        linkedListTestDriver23.add(0, (java.lang.Object) linkedListTestDriver29);
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver34.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator37 = linkedListTestDriver34.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver38 = new experiment.util.LinkedListTestDriver();
        int int39 = linkedListTestDriver38.size();
        boolean boolean41 = linkedListTestDriver38.add((java.lang.Object) 1L);
        java.lang.Object[] objArray42 = linkedListTestDriver38.toArray();
        boolean boolean43 = linkedListTestDriver34.remove((java.lang.Object) linkedListTestDriver38);
        java.lang.Object obj44 = linkedListTestDriver34.getLast();
        boolean boolean45 = linkedListTestDriver29.contains((java.lang.Object) linkedListTestDriver34);
        boolean boolean46 = linkedListTestDriver34.isEmpty();
        boolean boolean47 = linkedListTestDriver20.remove((java.lang.Object) boolean46);
        boolean boolean48 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver20);
        linkedListTestDriver20.addLast((java.lang.Object) 1.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[1]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + (byte) -1 + "'", obj44, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test173");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        int int5 = linkedListTestDriver4.size();
        java.lang.Object obj6 = linkedListTestDriver0.set(0, (java.lang.Object) linkedListTestDriver4);
        boolean boolean8 = linkedListTestDriver0.add((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver9.addLast((java.lang.Object) (byte) -1);
        boolean boolean13 = linkedListTestDriver9.add((java.lang.Object) 0L);
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        int int16 = linkedListTestDriver15.size();
        boolean boolean18 = linkedListTestDriver15.add((java.lang.Object) 1L);
        linkedListTestDriver9.add(0, (java.lang.Object) linkedListTestDriver15);
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver20.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        int int25 = linkedListTestDriver24.size();
        java.lang.Object obj26 = linkedListTestDriver20.set(0, (java.lang.Object) linkedListTestDriver24);
        java.lang.Class<?> wildcardClass27 = linkedListTestDriver24.getClass();
        boolean boolean28 = linkedListTestDriver15.contains((java.lang.Object) wildcardClass27);
        boolean boolean30 = linkedListTestDriver15.add((java.lang.Object) 1L);
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        int int32 = linkedListTestDriver31.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver33 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver33.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator36 = linkedListTestDriver33.iterator();
        java.lang.Object[] objArray37 = linkedListTestDriver33.toArray();
        boolean boolean38 = linkedListTestDriver31.equals_CUT((java.lang.Object) linkedListTestDriver33);
        boolean boolean39 = linkedListTestDriver15.remove((java.lang.Object) linkedListTestDriver31);
        java.lang.Object obj40 = linkedListTestDriver15.removeFirst();
        boolean boolean41 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) -1 + "'", obj26, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 1L + "'", obj40, 1L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test174");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean5 = linkedListTestDriver0.remove((java.lang.Object) 10);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test175");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean5 = linkedListTestDriver0.remove((java.lang.Object) 10);
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        java.lang.Object obj7 = linkedListTestDriver0.getLast();
        java.lang.Object[] objArray8 = linkedListTestDriver0.toArray();
        java.lang.Object obj9 = linkedListTestDriver0.removeFirst();
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1]");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test176");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver2.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        int int7 = linkedListTestDriver6.size();
        java.lang.Object obj8 = linkedListTestDriver2.set(0, (java.lang.Object) linkedListTestDriver6);
        boolean boolean9 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = linkedListTestDriver2.remove(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) -1 + "'", obj8, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test177");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray4 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.clear();
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.addFirst(obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1]");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test178");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) 0L);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        int int7 = linkedListTestDriver6.size();
        boolean boolean9 = linkedListTestDriver6.add((java.lang.Object) 1L);
        linkedListTestDriver0.add(0, (java.lang.Object) linkedListTestDriver6);
        boolean boolean11 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator15 = linkedListTestDriver12.iterator();
        boolean boolean16 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver12);
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver18.addLast((java.lang.Object) (byte) -1);
        boolean boolean22 = linkedListTestDriver18.add((java.lang.Object) 0L);
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        int int25 = linkedListTestDriver24.size();
        boolean boolean27 = linkedListTestDriver24.add((java.lang.Object) 1L);
        linkedListTestDriver18.add(0, (java.lang.Object) linkedListTestDriver24);
        boolean boolean29 = linkedListTestDriver18.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver30.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator33 = linkedListTestDriver30.iterator();
        java.lang.Object[] objArray34 = linkedListTestDriver30.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver35 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver35.addLast((java.lang.Object) ' ');
        java.lang.Object[] objArray38 = linkedListTestDriver35.toArray();
        linkedListTestDriver35.addFirst((java.lang.Object) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver42 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver42.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator45 = linkedListTestDriver42.iterator();
        boolean boolean47 = linkedListTestDriver42.remove((java.lang.Object) 10);
        linkedListTestDriver35.add((int) (short) 0, (java.lang.Object) 10);
        boolean boolean49 = linkedListTestDriver30.contains((java.lang.Object) (short) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver50 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver50.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator53 = linkedListTestDriver50.iterator();
        java.lang.Object[] objArray54 = linkedListTestDriver50.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver55 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver55.addLast((java.lang.Object) ' ');
        java.lang.Object[] objArray58 = linkedListTestDriver55.toArray();
        linkedListTestDriver55.addFirst((java.lang.Object) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver62 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver62.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator65 = linkedListTestDriver62.iterator();
        boolean boolean67 = linkedListTestDriver62.remove((java.lang.Object) 10);
        linkedListTestDriver55.add((int) (short) 0, (java.lang.Object) 10);
        boolean boolean69 = linkedListTestDriver50.contains((java.lang.Object) (short) 0);
        linkedListTestDriver30.addLast((java.lang.Object) boolean69);
        java.lang.Object[] objArray71 = linkedListTestDriver30.toArray();
        java.lang.Object obj72 = linkedListTestDriver30.removeFirst();
        boolean boolean73 = linkedListTestDriver18.remove((java.lang.Object) linkedListTestDriver30);
        linkedListTestDriver12.add(0, (java.lang.Object) linkedListTestDriver18);
        experiment.util.LinkedListTestDriver linkedListTestDriver75 = new experiment.util.LinkedListTestDriver();
        int int76 = linkedListTestDriver75.size();
        boolean boolean78 = linkedListTestDriver75.add((java.lang.Object) 1L);
        java.lang.Object[] objArray79 = linkedListTestDriver75.toArray();
        java.lang.Object obj80 = linkedListTestDriver75.removeFirst();
        boolean boolean81 = linkedListTestDriver18.remove((java.lang.Object) linkedListTestDriver75);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[-1]");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[ ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[ ]");
        org.junit.Assert.assertNotNull(iterator45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(iterator53);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[-1]");
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[ ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[ ]");
        org.junit.Assert.assertNotNull(iterator65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[-1, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[-1, false]");
        org.junit.Assert.assertEquals("'" + obj72 + "' != '" + (byte) -1 + "'", obj72, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray79), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray79), "[1]");
        org.junit.Assert.assertEquals("'" + obj80 + "' != '" + 1L + "'", obj80, 1L);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test179");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean5 = linkedListTestDriver0.remove((java.lang.Object) 10);
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        java.lang.Object obj7 = linkedListTestDriver0.getLast();
        java.lang.Object[] objArray8 = linkedListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = linkedListTestDriver0.remove((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1]");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test180");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        int int5 = linkedListTestDriver4.size();
        boolean boolean7 = linkedListTestDriver4.add((java.lang.Object) 1L);
        java.lang.Object[] objArray8 = linkedListTestDriver4.toArray();
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver4);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator13 = linkedListTestDriver10.iterator();
        boolean boolean15 = linkedListTestDriver10.remove((java.lang.Object) 10);
        java.lang.Object obj16 = linkedListTestDriver10.removeLast();
        boolean boolean18 = linkedListTestDriver10.add((java.lang.Object) 0L);
        java.lang.Object obj21 = linkedListTestDriver10.set((int) (short) 0, (java.lang.Object) (short) 1);
        java.lang.Object obj22 = linkedListTestDriver10.removeLast();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver10);
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver24.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        int int29 = linkedListTestDriver28.size();
        java.lang.Object obj30 = linkedListTestDriver24.set(0, (java.lang.Object) linkedListTestDriver28);
        linkedListTestDriver24.addFirst((java.lang.Object) (short) 100);
        boolean boolean33 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver24);
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver34.addLast((java.lang.Object) (byte) -1);
        linkedListTestDriver34.addFirst((java.lang.Object) 1.0f);
        java.lang.Object obj39 = linkedListTestDriver34.getFirst();
        java.lang.Object obj40 = linkedListTestDriver34.getLast();
        boolean boolean41 = linkedListTestDriver24.contains((java.lang.Object) linkedListTestDriver34);
        experiment.util.LinkedListTestDriver linkedListTestDriver42 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver42.addLast((java.lang.Object) (byte) -1);
        boolean boolean46 = linkedListTestDriver42.add((java.lang.Object) 0L);
        boolean boolean48 = linkedListTestDriver42.equals_CUT((java.lang.Object) 1);
        linkedListTestDriver42.clear();
        boolean boolean50 = linkedListTestDriver34.remove((java.lang.Object) linkedListTestDriver42);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj52 = linkedListTestDriver42.get((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) -1 + "'", obj16, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0L + "'", obj21, 0L);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (short) 1 + "'", obj22, (short) 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (byte) -1 + "'", obj30, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 1.0f + "'", obj39, 1.0f);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (byte) -1 + "'", obj40, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test181");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) 0L);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        int int7 = linkedListTestDriver6.size();
        boolean boolean9 = linkedListTestDriver6.add((java.lang.Object) 1L);
        linkedListTestDriver0.add(0, (java.lang.Object) linkedListTestDriver6);
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        int int16 = linkedListTestDriver15.size();
        java.lang.Object obj17 = linkedListTestDriver11.set(0, (java.lang.Object) linkedListTestDriver15);
        java.lang.Class<?> wildcardClass18 = linkedListTestDriver15.getClass();
        boolean boolean19 = linkedListTestDriver6.contains((java.lang.Object) wildcardClass18);
        boolean boolean21 = linkedListTestDriver6.add((java.lang.Object) 1L);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        int int23 = linkedListTestDriver22.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver24.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator27 = linkedListTestDriver24.iterator();
        java.lang.Object[] objArray28 = linkedListTestDriver24.toArray();
        boolean boolean29 = linkedListTestDriver22.equals_CUT((java.lang.Object) linkedListTestDriver24);
        boolean boolean30 = linkedListTestDriver6.remove((java.lang.Object) linkedListTestDriver22);
        java.lang.Object obj31 = linkedListTestDriver6.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver32.addLast((java.lang.Object) (byte) -1);
        boolean boolean36 = linkedListTestDriver32.add((java.lang.Object) 0L);
        experiment.util.LinkedListTestDriver linkedListTestDriver38 = new experiment.util.LinkedListTestDriver();
        int int39 = linkedListTestDriver38.size();
        boolean boolean41 = linkedListTestDriver38.add((java.lang.Object) 1L);
        linkedListTestDriver32.add(0, (java.lang.Object) linkedListTestDriver38);
        boolean boolean43 = linkedListTestDriver32.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver44 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver44.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator47 = linkedListTestDriver44.iterator();
        boolean boolean48 = linkedListTestDriver32.contains((java.lang.Object) linkedListTestDriver44);
        experiment.util.LinkedListTestDriver linkedListTestDriver49 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver49.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator52 = linkedListTestDriver49.iterator();
        boolean boolean54 = linkedListTestDriver49.remove((java.lang.Object) 10);
        java.lang.Object obj55 = linkedListTestDriver49.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver56 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver56.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator59 = linkedListTestDriver56.iterator();
        boolean boolean61 = linkedListTestDriver56.remove((java.lang.Object) 10);
        java.lang.Object obj62 = linkedListTestDriver56.removeLast();
        boolean boolean64 = linkedListTestDriver56.equals_CUT((java.lang.Object) '4');
        boolean boolean66 = linkedListTestDriver56.add((java.lang.Object) 100.0d);
        boolean boolean67 = linkedListTestDriver49.add((java.lang.Object) linkedListTestDriver56);
        boolean boolean68 = linkedListTestDriver44.contains((java.lang.Object) linkedListTestDriver56);
        experiment.util.LinkedListTestDriver linkedListTestDriver69 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver69.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator72 = linkedListTestDriver69.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver73 = new experiment.util.LinkedListTestDriver();
        int int74 = linkedListTestDriver73.size();
        boolean boolean76 = linkedListTestDriver73.add((java.lang.Object) 1L);
        java.lang.Object[] objArray77 = linkedListTestDriver73.toArray();
        boolean boolean78 = linkedListTestDriver69.remove((java.lang.Object) linkedListTestDriver73);
        experiment.util.LinkedListTestDriver linkedListTestDriver79 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver79.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator82 = linkedListTestDriver79.iterator();
        boolean boolean84 = linkedListTestDriver79.remove((java.lang.Object) 10);
        java.lang.Object obj85 = linkedListTestDriver79.removeLast();
        boolean boolean87 = linkedListTestDriver79.add((java.lang.Object) 0L);
        java.lang.Object obj90 = linkedListTestDriver79.set((int) (short) 0, (java.lang.Object) (short) 1);
        java.lang.Object obj91 = linkedListTestDriver79.removeLast();
        linkedListTestDriver69.addLast((java.lang.Object) linkedListTestDriver79);
        boolean boolean93 = linkedListTestDriver44.equals_CUT((java.lang.Object) linkedListTestDriver79);
        experiment.util.Iterator iterator94 = linkedListTestDriver44.iterator();
        boolean boolean95 = linkedListTestDriver6.remove((java.lang.Object) linkedListTestDriver44);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 1L + "'", obj31, 1L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(iterator47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(iterator52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + (byte) -1 + "'", obj55, (byte) -1);
        org.junit.Assert.assertNotNull(iterator59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + (byte) -1 + "'", obj62, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(iterator72);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray77), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray77), "[1]");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(iterator82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertEquals("'" + obj85 + "' != '" + (byte) -1 + "'", obj85, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertEquals("'" + obj90 + "' != '" + 0L + "'", obj90, 0L);
        org.junit.Assert.assertEquals("'" + obj91 + "' != '" + (short) 1 + "'", obj91, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(iterator94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test182");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        linkedListTestDriver0.addFirst((java.lang.Object) 1.0f);
        java.lang.Object obj5 = linkedListTestDriver0.getFirst();
        linkedListTestDriver0.addFirst((java.lang.Object) (-1.0d));
        int int8 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        linkedListTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 1.0f + "'", obj5, 1.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test183");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) 0L);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        int int7 = linkedListTestDriver6.size();
        boolean boolean9 = linkedListTestDriver6.add((java.lang.Object) 1L);
        linkedListTestDriver0.add(0, (java.lang.Object) linkedListTestDriver6);
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        int int16 = linkedListTestDriver15.size();
        java.lang.Object obj17 = linkedListTestDriver11.set(0, (java.lang.Object) linkedListTestDriver15);
        java.lang.Class<?> wildcardClass18 = linkedListTestDriver15.getClass();
        boolean boolean19 = linkedListTestDriver6.contains((java.lang.Object) wildcardClass18);
        boolean boolean21 = linkedListTestDriver6.add((java.lang.Object) 1L);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        int int23 = linkedListTestDriver22.size();
        boolean boolean25 = linkedListTestDriver22.add((java.lang.Object) 1L);
        java.lang.Object[] objArray26 = linkedListTestDriver22.toArray();
        boolean boolean27 = linkedListTestDriver6.equals_CUT((java.lang.Object) objArray26);
        java.lang.Object obj28 = linkedListTestDriver6.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver30.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator33 = linkedListTestDriver30.iterator();
        boolean boolean35 = linkedListTestDriver30.remove((java.lang.Object) 10);
        experiment.util.Iterator iterator36 = linkedListTestDriver30.iterator();
        java.lang.Object obj37 = linkedListTestDriver30.getLast();
        boolean boolean38 = linkedListTestDriver30.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj39 = linkedListTestDriver6.set((int) (short) 100, (java.lang.Object) linkedListTestDriver30);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[1]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 1L + "'", obj28, 1L);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (byte) -1 + "'", obj37, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test184");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        java.lang.Class<?> wildcardClass4 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test185");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) 1L);
        java.lang.Object[] objArray4 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver5.addLast((java.lang.Object) (byte) -1);
        linkedListTestDriver5.addFirst((java.lang.Object) 1.0f);
        java.lang.Object obj10 = linkedListTestDriver5.getFirst();
        linkedListTestDriver5.clear();
        boolean boolean12 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = linkedListTestDriver5.get((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1.0f + "'", obj10, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test186");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) 0L);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator7 = linkedListTestDriver0.listIterator((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 52; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0L + "'", obj5, 0L);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test187");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean5 = linkedListTestDriver0.remove((java.lang.Object) 10);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        boolean boolean8 = linkedListTestDriver0.remove((java.lang.Object) (short) 0);
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = linkedListTestDriver0.remove((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test188");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray4 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver5.addLast((java.lang.Object) ' ');
        java.lang.Object[] objArray8 = linkedListTestDriver5.toArray();
        linkedListTestDriver5.addFirst((java.lang.Object) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator15 = linkedListTestDriver12.iterator();
        boolean boolean17 = linkedListTestDriver12.remove((java.lang.Object) 10);
        linkedListTestDriver5.add((int) (short) 0, (java.lang.Object) 10);
        boolean boolean19 = linkedListTestDriver0.contains((java.lang.Object) (short) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver20.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator23 = linkedListTestDriver20.iterator();
        java.lang.Object[] objArray24 = linkedListTestDriver20.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver25.addLast((java.lang.Object) ' ');
        java.lang.Object[] objArray28 = linkedListTestDriver25.toArray();
        linkedListTestDriver25.addFirst((java.lang.Object) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver32.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator35 = linkedListTestDriver32.iterator();
        boolean boolean37 = linkedListTestDriver32.remove((java.lang.Object) 10);
        linkedListTestDriver25.add((int) (short) 0, (java.lang.Object) 10);
        boolean boolean39 = linkedListTestDriver20.contains((java.lang.Object) (short) 0);
        linkedListTestDriver0.addLast((java.lang.Object) boolean39);
        java.lang.Object[] objArray41 = linkedListTestDriver0.toArray();
        java.lang.Object obj42 = linkedListTestDriver0.removeFirst();
        java.lang.Object obj43 = linkedListTestDriver0.getLast();
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[ ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[ ]");
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[-1]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[ ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[ ]");
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[-1, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[-1, false]");
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (byte) -1 + "'", obj42, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + false + "'", obj43, false);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test189");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) 0L);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        int int7 = linkedListTestDriver6.size();
        boolean boolean9 = linkedListTestDriver6.add((java.lang.Object) 1L);
        linkedListTestDriver0.add(0, (java.lang.Object) linkedListTestDriver6);
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        int int16 = linkedListTestDriver15.size();
        java.lang.Object obj17 = linkedListTestDriver11.set(0, (java.lang.Object) linkedListTestDriver15);
        java.lang.Class<?> wildcardClass18 = linkedListTestDriver15.getClass();
        boolean boolean19 = linkedListTestDriver6.contains((java.lang.Object) wildcardClass18);
        boolean boolean21 = linkedListTestDriver6.add((java.lang.Object) 1L);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        int int23 = linkedListTestDriver22.size();
        boolean boolean25 = linkedListTestDriver22.add((java.lang.Object) 1L);
        java.lang.Object[] objArray26 = linkedListTestDriver22.toArray();
        boolean boolean27 = linkedListTestDriver6.equals_CUT((java.lang.Object) objArray26);
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        boolean boolean30 = linkedListTestDriver28.contains((java.lang.Object) 10.0d);
        boolean boolean31 = linkedListTestDriver6.contains((java.lang.Object) 10.0d);
        java.lang.Class<?> wildcardClass32 = linkedListTestDriver6.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[1]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test190");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        int int5 = linkedListTestDriver4.size();
        java.lang.Object obj6 = linkedListTestDriver0.set(0, (java.lang.Object) linkedListTestDriver4);
        linkedListTestDriver0.addFirst((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver9.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator12 = linkedListTestDriver9.iterator();
        boolean boolean14 = linkedListTestDriver9.remove((java.lang.Object) 10);
        java.lang.Object obj15 = linkedListTestDriver9.removeLast();
        boolean boolean17 = linkedListTestDriver9.add((java.lang.Object) 0L);
        linkedListTestDriver9.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver19.addLast((java.lang.Object) (byte) -1);
        boolean boolean23 = linkedListTestDriver19.add((java.lang.Object) 0L);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        int int26 = linkedListTestDriver25.size();
        boolean boolean28 = linkedListTestDriver25.add((java.lang.Object) 1L);
        linkedListTestDriver19.add(0, (java.lang.Object) linkedListTestDriver25);
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver30.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        int int35 = linkedListTestDriver34.size();
        java.lang.Object obj36 = linkedListTestDriver30.set(0, (java.lang.Object) linkedListTestDriver34);
        java.lang.Class<?> wildcardClass37 = linkedListTestDriver34.getClass();
        boolean boolean38 = linkedListTestDriver25.contains((java.lang.Object) wildcardClass37);
        boolean boolean40 = linkedListTestDriver25.add((java.lang.Object) 1L);
        experiment.util.LinkedListTestDriver linkedListTestDriver41 = new experiment.util.LinkedListTestDriver();
        int int42 = linkedListTestDriver41.size();
        boolean boolean44 = linkedListTestDriver41.add((java.lang.Object) 1L);
        java.lang.Object[] objArray45 = linkedListTestDriver41.toArray();
        boolean boolean46 = linkedListTestDriver25.equals_CUT((java.lang.Object) objArray45);
        experiment.util.Iterator iterator47 = linkedListTestDriver25.iterator();
        linkedListTestDriver9.addFirst((java.lang.Object) linkedListTestDriver25);
        experiment.util.LinkedListTestDriver linkedListTestDriver49 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver49.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator52 = linkedListTestDriver49.iterator();
        boolean boolean54 = linkedListTestDriver49.remove((java.lang.Object) 10);
        linkedListTestDriver49.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver56 = new experiment.util.LinkedListTestDriver();
        boolean boolean58 = linkedListTestDriver56.contains((java.lang.Object) 10.0d);
        int int59 = linkedListTestDriver56.size();
        linkedListTestDriver49.addFirst((java.lang.Object) int59);
        java.lang.Object obj61 = linkedListTestDriver49.getLast();
        boolean boolean62 = linkedListTestDriver25.remove((java.lang.Object) linkedListTestDriver49);
        boolean boolean63 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver25);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator65 = linkedListTestDriver0.listIterator(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 3; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) -1 + "'", obj15, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (byte) -1 + "'", obj36, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[1]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(iterator47);
        org.junit.Assert.assertNotNull(iterator52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + 0 + "'", obj61, 0);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test191");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) 0L);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        int int7 = linkedListTestDriver6.size();
        boolean boolean9 = linkedListTestDriver6.add((java.lang.Object) 1L);
        linkedListTestDriver0.add(0, (java.lang.Object) linkedListTestDriver6);
        boolean boolean11 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator15 = linkedListTestDriver12.iterator();
        java.lang.Object[] objArray16 = linkedListTestDriver12.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver17.addLast((java.lang.Object) ' ');
        java.lang.Object[] objArray20 = linkedListTestDriver17.toArray();
        linkedListTestDriver17.addFirst((java.lang.Object) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver24.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator27 = linkedListTestDriver24.iterator();
        boolean boolean29 = linkedListTestDriver24.remove((java.lang.Object) 10);
        linkedListTestDriver17.add((int) (short) 0, (java.lang.Object) 10);
        boolean boolean31 = linkedListTestDriver12.contains((java.lang.Object) (short) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver32.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator35 = linkedListTestDriver32.iterator();
        java.lang.Object[] objArray36 = linkedListTestDriver32.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver37.addLast((java.lang.Object) ' ');
        java.lang.Object[] objArray40 = linkedListTestDriver37.toArray();
        linkedListTestDriver37.addFirst((java.lang.Object) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver44 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver44.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator47 = linkedListTestDriver44.iterator();
        boolean boolean49 = linkedListTestDriver44.remove((java.lang.Object) 10);
        linkedListTestDriver37.add((int) (short) 0, (java.lang.Object) 10);
        boolean boolean51 = linkedListTestDriver32.contains((java.lang.Object) (short) 0);
        linkedListTestDriver12.addLast((java.lang.Object) boolean51);
        java.lang.Object[] objArray53 = linkedListTestDriver12.toArray();
        java.lang.Object obj54 = linkedListTestDriver12.removeFirst();
        boolean boolean55 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj57 = linkedListTestDriver12.remove((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[-1]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[ ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[ ]");
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[-1]");
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[ ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[ ]");
        org.junit.Assert.assertNotNull(iterator47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[-1, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[-1, false]");
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + (byte) -1 + "'", obj54, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test192");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) 0L);
        boolean boolean6 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1);
        boolean boolean8 = linkedListTestDriver0.remove((java.lang.Object) 10);
        java.lang.Object obj9 = linkedListTestDriver0.removeFirst();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test193");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        int int5 = linkedListTestDriver4.size();
        java.lang.Object obj6 = linkedListTestDriver0.set(0, (java.lang.Object) linkedListTestDriver4);
        linkedListTestDriver0.addFirst((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver9.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator12 = linkedListTestDriver9.iterator();
        boolean boolean14 = linkedListTestDriver9.remove((java.lang.Object) 10);
        java.lang.Object obj15 = linkedListTestDriver9.removeLast();
        boolean boolean17 = linkedListTestDriver9.add((java.lang.Object) 0L);
        linkedListTestDriver9.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver19.addLast((java.lang.Object) (byte) -1);
        boolean boolean23 = linkedListTestDriver19.add((java.lang.Object) 0L);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        int int26 = linkedListTestDriver25.size();
        boolean boolean28 = linkedListTestDriver25.add((java.lang.Object) 1L);
        linkedListTestDriver19.add(0, (java.lang.Object) linkedListTestDriver25);
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver30.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        int int35 = linkedListTestDriver34.size();
        java.lang.Object obj36 = linkedListTestDriver30.set(0, (java.lang.Object) linkedListTestDriver34);
        java.lang.Class<?> wildcardClass37 = linkedListTestDriver34.getClass();
        boolean boolean38 = linkedListTestDriver25.contains((java.lang.Object) wildcardClass37);
        boolean boolean40 = linkedListTestDriver25.add((java.lang.Object) 1L);
        experiment.util.LinkedListTestDriver linkedListTestDriver41 = new experiment.util.LinkedListTestDriver();
        int int42 = linkedListTestDriver41.size();
        boolean boolean44 = linkedListTestDriver41.add((java.lang.Object) 1L);
        java.lang.Object[] objArray45 = linkedListTestDriver41.toArray();
        boolean boolean46 = linkedListTestDriver25.equals_CUT((java.lang.Object) objArray45);
        experiment.util.Iterator iterator47 = linkedListTestDriver25.iterator();
        linkedListTestDriver9.addFirst((java.lang.Object) linkedListTestDriver25);
        experiment.util.LinkedListTestDriver linkedListTestDriver49 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver49.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator52 = linkedListTestDriver49.iterator();
        boolean boolean54 = linkedListTestDriver49.remove((java.lang.Object) 10);
        linkedListTestDriver49.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver56 = new experiment.util.LinkedListTestDriver();
        boolean boolean58 = linkedListTestDriver56.contains((java.lang.Object) 10.0d);
        int int59 = linkedListTestDriver56.size();
        linkedListTestDriver49.addFirst((java.lang.Object) int59);
        java.lang.Object obj61 = linkedListTestDriver49.getLast();
        boolean boolean62 = linkedListTestDriver25.remove((java.lang.Object) linkedListTestDriver49);
        boolean boolean63 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver25);
        linkedListTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) -1 + "'", obj15, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (byte) -1 + "'", obj36, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[1]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(iterator47);
        org.junit.Assert.assertNotNull(iterator52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + 0 + "'", obj61, 0);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test194");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        int int5 = linkedListTestDriver4.size();
        boolean boolean7 = linkedListTestDriver4.add((java.lang.Object) 1L);
        java.lang.Object[] objArray8 = linkedListTestDriver4.toArray();
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver4);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator13 = linkedListTestDriver10.iterator();
        boolean boolean15 = linkedListTestDriver10.remove((java.lang.Object) 10);
        java.lang.Object obj16 = linkedListTestDriver10.removeLast();
        boolean boolean18 = linkedListTestDriver10.add((java.lang.Object) 0L);
        java.lang.Object obj21 = linkedListTestDriver10.set((int) (short) 0, (java.lang.Object) (short) 1);
        java.lang.Object obj22 = linkedListTestDriver10.removeLast();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver10);
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        int int25 = linkedListTestDriver24.size();
        boolean boolean27 = linkedListTestDriver24.add((java.lang.Object) 1L);
        java.lang.Object[] objArray28 = linkedListTestDriver24.toArray();
        java.lang.Object obj29 = linkedListTestDriver24.removeFirst();
        linkedListTestDriver10.addFirst((java.lang.Object) linkedListTestDriver24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = linkedListTestDriver24.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) -1 + "'", obj16, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0L + "'", obj21, 0L);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (short) 1 + "'", obj22, (short) 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[1]");
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 1L + "'", obj29, 1L);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test195");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) 0L);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        int int7 = linkedListTestDriver6.size();
        boolean boolean9 = linkedListTestDriver6.add((java.lang.Object) 1L);
        linkedListTestDriver0.add(0, (java.lang.Object) linkedListTestDriver6);
        experiment.util.Iterator iterator11 = linkedListTestDriver6.iterator();
        linkedListTestDriver6.addLast((java.lang.Object) '#');
        linkedListTestDriver6.addFirst((java.lang.Object) 100L);
        boolean boolean16 = linkedListTestDriver6.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test196");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean5 = linkedListTestDriver0.remove((java.lang.Object) 10);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        boolean boolean8 = linkedListTestDriver0.equals_CUT((java.lang.Object) '4');
        int int9 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        int int16 = linkedListTestDriver15.size();
        java.lang.Object obj17 = linkedListTestDriver11.set(0, (java.lang.Object) linkedListTestDriver15);
        boolean boolean18 = linkedListTestDriver15.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = linkedListTestDriver0.set((int) 'a', (java.lang.Object) boolean18);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test197");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean5 = linkedListTestDriver0.remove((java.lang.Object) 10);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = linkedListTestDriver0.getLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test198");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        linkedListTestDriver0.addFirst((java.lang.Object) 1.0f);
        java.lang.Object obj5 = linkedListTestDriver0.getFirst();
        linkedListTestDriver0.addFirst((java.lang.Object) (-1.0d));
        int int8 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        boolean boolean11 = linkedListTestDriver0.add((java.lang.Object) (byte) 0);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator15 = linkedListTestDriver0.listIterator((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 35; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 1.0f + "'", obj5, 1.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test199");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray4 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver5.addLast((java.lang.Object) ' ');
        java.lang.Object[] objArray8 = linkedListTestDriver5.toArray();
        linkedListTestDriver5.addFirst((java.lang.Object) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator15 = linkedListTestDriver12.iterator();
        boolean boolean17 = linkedListTestDriver12.remove((java.lang.Object) 10);
        linkedListTestDriver5.add((int) (short) 0, (java.lang.Object) 10);
        boolean boolean19 = linkedListTestDriver0.contains((java.lang.Object) (short) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver20.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator23 = linkedListTestDriver20.iterator();
        java.lang.Object[] objArray24 = linkedListTestDriver20.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver25.addLast((java.lang.Object) ' ');
        java.lang.Object[] objArray28 = linkedListTestDriver25.toArray();
        linkedListTestDriver25.addFirst((java.lang.Object) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver32.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator35 = linkedListTestDriver32.iterator();
        boolean boolean37 = linkedListTestDriver32.remove((java.lang.Object) 10);
        linkedListTestDriver25.add((int) (short) 0, (java.lang.Object) 10);
        boolean boolean39 = linkedListTestDriver20.contains((java.lang.Object) (short) 0);
        linkedListTestDriver0.addLast((java.lang.Object) boolean39);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj42 = linkedListTestDriver0.remove(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[ ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[ ]");
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[-1]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[ ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[ ]");
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test200");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        int int5 = linkedListTestDriver4.size();
        boolean boolean7 = linkedListTestDriver4.add((java.lang.Object) 1L);
        java.lang.Object[] objArray8 = linkedListTestDriver4.toArray();
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver4);
        java.lang.Object obj10 = linkedListTestDriver0.getLast();
        java.lang.Object obj11 = linkedListTestDriver0.getLast();
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) -1 + "'", obj11, (byte) -1);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test201");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean5 = linkedListTestDriver0.remove((java.lang.Object) 10);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        boolean boolean8 = linkedListTestDriver0.remove((java.lang.Object) (short) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver9.addLast((java.lang.Object) (byte) -1);
        boolean boolean13 = linkedListTestDriver9.add((java.lang.Object) 0L);
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        int int16 = linkedListTestDriver15.size();
        boolean boolean18 = linkedListTestDriver15.add((java.lang.Object) 1L);
        linkedListTestDriver9.add(0, (java.lang.Object) linkedListTestDriver15);
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver20.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        int int25 = linkedListTestDriver24.size();
        java.lang.Object obj26 = linkedListTestDriver20.set(0, (java.lang.Object) linkedListTestDriver24);
        java.lang.Class<?> wildcardClass27 = linkedListTestDriver24.getClass();
        boolean boolean28 = linkedListTestDriver15.contains((java.lang.Object) wildcardClass27);
        java.lang.Object obj29 = linkedListTestDriver15.getLast();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver15);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator32 = linkedListTestDriver0.listIterator((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) -1 + "'", obj26, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 1L + "'", obj29, 1L);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test202");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean5 = linkedListTestDriver0.remove((java.lang.Object) 10);
        java.lang.Object obj6 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        int int12 = linkedListTestDriver11.size();
        java.lang.Object obj13 = linkedListTestDriver7.set(0, (java.lang.Object) linkedListTestDriver11);
        boolean boolean15 = linkedListTestDriver7.add((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver17.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        int int22 = linkedListTestDriver21.size();
        java.lang.Object obj23 = linkedListTestDriver17.set(0, (java.lang.Object) linkedListTestDriver21);
        java.lang.Object obj24 = linkedListTestDriver7.set(1, (java.lang.Object) linkedListTestDriver17);
        boolean boolean25 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver7);
        experiment.util.Iterator iterator26 = linkedListTestDriver7.iterator();
        java.lang.Object obj27 = linkedListTestDriver7.removeLast();
        linkedListTestDriver7.clear();
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) -1 + "'", obj13, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 1.0d + "'", obj24, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(obj27);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test203");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean5 = linkedListTestDriver0.remove((java.lang.Object) 10);
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        java.lang.Object obj7 = linkedListTestDriver0.getLast();
        boolean boolean8 = linkedListTestDriver0.isEmpty();
        int int9 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addLast((java.lang.Object) (byte) -1);
        boolean boolean14 = linkedListTestDriver10.add((java.lang.Object) 0L);
        boolean boolean16 = linkedListTestDriver10.add((java.lang.Object) (short) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        int int18 = linkedListTestDriver17.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver19.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator22 = linkedListTestDriver19.iterator();
        java.lang.Object[] objArray23 = linkedListTestDriver19.toArray();
        boolean boolean24 = linkedListTestDriver17.equals_CUT((java.lang.Object) linkedListTestDriver19);
        linkedListTestDriver10.addLast((java.lang.Object) linkedListTestDriver17);
        boolean boolean26 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver10);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test204");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) 0L);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        int int7 = linkedListTestDriver6.size();
        boolean boolean9 = linkedListTestDriver6.add((java.lang.Object) 1L);
        linkedListTestDriver0.add(0, (java.lang.Object) linkedListTestDriver6);
        linkedListTestDriver0.addLast((java.lang.Object) false);
        java.lang.Object[] objArray13 = linkedListTestDriver0.toArray();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test205");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) 0L);
        boolean boolean6 = linkedListTestDriver0.add((java.lang.Object) (short) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        int int8 = linkedListTestDriver7.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver9.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator12 = linkedListTestDriver9.iterator();
        java.lang.Object[] objArray13 = linkedListTestDriver9.toArray();
        boolean boolean14 = linkedListTestDriver7.equals_CUT((java.lang.Object) linkedListTestDriver9);
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver7);
        experiment.util.ListIterator listIterator17 = linkedListTestDriver7.listIterator((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = linkedListTestDriver7.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(listIterator17);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test206");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) 1L);
        java.lang.Object[] objArray4 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator9 = linkedListTestDriver6.iterator();
        java.lang.Object[] objArray10 = linkedListTestDriver6.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.addLast((java.lang.Object) ' ');
        java.lang.Object[] objArray14 = linkedListTestDriver11.toArray();
        linkedListTestDriver11.addFirst((java.lang.Object) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver18.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator21 = linkedListTestDriver18.iterator();
        boolean boolean23 = linkedListTestDriver18.remove((java.lang.Object) 10);
        linkedListTestDriver11.add((int) (short) 0, (java.lang.Object) 10);
        boolean boolean25 = linkedListTestDriver6.contains((java.lang.Object) (short) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver26.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator29 = linkedListTestDriver26.iterator();
        java.lang.Object[] objArray30 = linkedListTestDriver26.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver31.addLast((java.lang.Object) ' ');
        java.lang.Object[] objArray34 = linkedListTestDriver31.toArray();
        linkedListTestDriver31.addFirst((java.lang.Object) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver38 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver38.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator41 = linkedListTestDriver38.iterator();
        boolean boolean43 = linkedListTestDriver38.remove((java.lang.Object) 10);
        linkedListTestDriver31.add((int) (short) 0, (java.lang.Object) 10);
        boolean boolean45 = linkedListTestDriver26.contains((java.lang.Object) (short) 0);
        linkedListTestDriver6.addLast((java.lang.Object) boolean45);
        java.lang.Object[] objArray47 = linkedListTestDriver6.toArray();
        linkedListTestDriver0.add(0, (java.lang.Object) objArray47);
        java.lang.Object obj49 = linkedListTestDriver0.removeLast();
        experiment.util.Iterator iterator50 = linkedListTestDriver0.iterator();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1]");
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[-1]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[ ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[ ]");
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[-1]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[ ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[ ]");
        org.junit.Assert.assertNotNull(iterator41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[-1, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[-1, false]");
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 1L + "'", obj49, 1L);
        org.junit.Assert.assertNotNull(iterator50);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test207");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        int int5 = linkedListTestDriver4.size();
        boolean boolean7 = linkedListTestDriver4.add((java.lang.Object) 1L);
        java.lang.Object[] objArray8 = linkedListTestDriver4.toArray();
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver4);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator13 = linkedListTestDriver10.iterator();
        boolean boolean15 = linkedListTestDriver10.remove((java.lang.Object) 10);
        java.lang.Object obj16 = linkedListTestDriver10.removeLast();
        boolean boolean18 = linkedListTestDriver10.add((java.lang.Object) 0L);
        java.lang.Object obj21 = linkedListTestDriver10.set((int) (short) 0, (java.lang.Object) (short) 1);
        java.lang.Object obj22 = linkedListTestDriver10.removeLast();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver10);
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        int int25 = linkedListTestDriver24.size();
        boolean boolean27 = linkedListTestDriver24.add((java.lang.Object) 1L);
        java.lang.Object[] objArray28 = linkedListTestDriver24.toArray();
        java.lang.Object obj29 = linkedListTestDriver24.removeFirst();
        linkedListTestDriver10.addFirst((java.lang.Object) linkedListTestDriver24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = linkedListTestDriver24.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) -1 + "'", obj16, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0L + "'", obj21, 0L);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (short) 1 + "'", obj22, (short) 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[1]");
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 1L + "'", obj29, 1L);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test208");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) 0L);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        int int7 = linkedListTestDriver6.size();
        boolean boolean9 = linkedListTestDriver6.add((java.lang.Object) 1L);
        linkedListTestDriver0.add(0, (java.lang.Object) linkedListTestDriver6);
        linkedListTestDriver0.addLast((java.lang.Object) false);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator14 = linkedListTestDriver0.listIterator(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test209");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) 0L);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        int int7 = linkedListTestDriver6.size();
        boolean boolean9 = linkedListTestDriver6.add((java.lang.Object) 1L);
        linkedListTestDriver0.add(0, (java.lang.Object) linkedListTestDriver6);
        boolean boolean11 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator15 = linkedListTestDriver12.iterator();
        boolean boolean16 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = linkedListTestDriver12.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test210");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean5 = linkedListTestDriver0.remove((java.lang.Object) 10);
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = linkedListTestDriver0.set((int) ' ', (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test211");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean5 = linkedListTestDriver0.remove((java.lang.Object) 10);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        boolean boolean8 = linkedListTestDriver0.equals_CUT((java.lang.Object) '4');
        boolean boolean10 = linkedListTestDriver0.add((java.lang.Object) 100.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.addLast((java.lang.Object) (byte) -1);
        boolean boolean15 = linkedListTestDriver11.add((java.lang.Object) 0L);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        int int18 = linkedListTestDriver17.size();
        boolean boolean20 = linkedListTestDriver17.add((java.lang.Object) 1L);
        linkedListTestDriver11.add(0, (java.lang.Object) linkedListTestDriver17);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver22.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        int int27 = linkedListTestDriver26.size();
        java.lang.Object obj28 = linkedListTestDriver22.set(0, (java.lang.Object) linkedListTestDriver26);
        java.lang.Class<?> wildcardClass29 = linkedListTestDriver26.getClass();
        boolean boolean30 = linkedListTestDriver17.contains((java.lang.Object) wildcardClass29);
        boolean boolean32 = linkedListTestDriver17.add((java.lang.Object) 1L);
        experiment.util.LinkedListTestDriver linkedListTestDriver33 = new experiment.util.LinkedListTestDriver();
        int int34 = linkedListTestDriver33.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver35 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver35.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator38 = linkedListTestDriver35.iterator();
        java.lang.Object[] objArray39 = linkedListTestDriver35.toArray();
        boolean boolean40 = linkedListTestDriver33.equals_CUT((java.lang.Object) linkedListTestDriver35);
        boolean boolean41 = linkedListTestDriver17.remove((java.lang.Object) linkedListTestDriver33);
        java.lang.Object obj42 = linkedListTestDriver17.removeFirst();
        boolean boolean43 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver17);
        experiment.util.LinkedListTestDriver linkedListTestDriver44 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver44.addLast((java.lang.Object) ' ');
        java.lang.Object[] objArray47 = linkedListTestDriver44.toArray();
        int int48 = linkedListTestDriver44.size();
        experiment.util.Iterator iterator49 = linkedListTestDriver44.iterator();
        boolean boolean50 = linkedListTestDriver17.remove((java.lang.Object) iterator49);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (byte) -1 + "'", obj28, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 1L + "'", obj42, 1L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[ ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[ ]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(iterator49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test212");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean5 = linkedListTestDriver0.remove((java.lang.Object) 10);
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator10 = linkedListTestDriver7.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        int int12 = linkedListTestDriver11.size();
        boolean boolean14 = linkedListTestDriver11.add((java.lang.Object) 1L);
        java.lang.Object[] objArray15 = linkedListTestDriver11.toArray();
        boolean boolean16 = linkedListTestDriver7.remove((java.lang.Object) linkedListTestDriver11);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver17.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator20 = linkedListTestDriver17.iterator();
        boolean boolean22 = linkedListTestDriver17.remove((java.lang.Object) 10);
        java.lang.Object obj23 = linkedListTestDriver17.removeLast();
        boolean boolean25 = linkedListTestDriver17.add((java.lang.Object) 0L);
        java.lang.Object obj28 = linkedListTestDriver17.set((int) (short) 0, (java.lang.Object) (short) 1);
        java.lang.Object obj29 = linkedListTestDriver17.removeLast();
        linkedListTestDriver7.addLast((java.lang.Object) linkedListTestDriver17);
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver31.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver35 = new experiment.util.LinkedListTestDriver();
        int int36 = linkedListTestDriver35.size();
        java.lang.Object obj37 = linkedListTestDriver31.set(0, (java.lang.Object) linkedListTestDriver35);
        linkedListTestDriver31.addFirst((java.lang.Object) (short) 100);
        boolean boolean40 = linkedListTestDriver7.equals_CUT((java.lang.Object) linkedListTestDriver31);
        experiment.util.LinkedListTestDriver linkedListTestDriver41 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver41.addLast((java.lang.Object) (byte) -1);
        linkedListTestDriver41.addFirst((java.lang.Object) 1.0f);
        java.lang.Object obj46 = linkedListTestDriver41.getFirst();
        java.lang.Object obj47 = linkedListTestDriver41.getLast();
        boolean boolean48 = linkedListTestDriver31.contains((java.lang.Object) linkedListTestDriver41);
        experiment.util.LinkedListTestDriver linkedListTestDriver49 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver49.addLast((java.lang.Object) (byte) -1);
        boolean boolean53 = linkedListTestDriver49.add((java.lang.Object) 0L);
        boolean boolean55 = linkedListTestDriver49.equals_CUT((java.lang.Object) 1);
        linkedListTestDriver49.clear();
        boolean boolean57 = linkedListTestDriver41.remove((java.lang.Object) linkedListTestDriver49);
        boolean boolean58 = linkedListTestDriver0.add((java.lang.Object) boolean57);
        experiment.util.LinkedListTestDriver linkedListTestDriver60 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver60.addLast((java.lang.Object) (byte) -1);
        linkedListTestDriver60.addFirst((java.lang.Object) 1.0f);
        java.lang.Object obj65 = linkedListTestDriver60.getFirst();
        linkedListTestDriver60.addFirst((java.lang.Object) (-1.0d));
        int int68 = linkedListTestDriver60.size();
        linkedListTestDriver60.clear();
        boolean boolean71 = linkedListTestDriver60.add((java.lang.Object) (byte) 0);
        linkedListTestDriver60.addLast((java.lang.Object) (short) 10);
        java.lang.Object obj74 = linkedListTestDriver0.set((int) (byte) 0, (java.lang.Object) (short) 10);
        java.lang.Object obj76 = linkedListTestDriver0.remove(0);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 0L + "'", obj28, 0L);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (short) 1 + "'", obj29, (short) 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (byte) -1 + "'", obj37, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 1.0f + "'", obj46, 1.0f);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + (byte) -1 + "'", obj47, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + 1.0f + "'", obj65, 1.0f);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 3 + "'", int68 == 3);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertEquals("'" + obj74 + "' != '" + (byte) -1 + "'", obj74, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj76 + "' != '" + (short) 10 + "'", obj76, (short) 10);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test213");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) 0L);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        int int7 = linkedListTestDriver6.size();
        boolean boolean9 = linkedListTestDriver6.add((java.lang.Object) 1L);
        linkedListTestDriver0.add(0, (java.lang.Object) linkedListTestDriver6);
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        int int16 = linkedListTestDriver15.size();
        java.lang.Object obj17 = linkedListTestDriver11.set(0, (java.lang.Object) linkedListTestDriver15);
        java.lang.Class<?> wildcardClass18 = linkedListTestDriver15.getClass();
        boolean boolean19 = linkedListTestDriver6.contains((java.lang.Object) wildcardClass18);
        boolean boolean21 = linkedListTestDriver6.add((java.lang.Object) 1L);
        experiment.util.Iterator iterator22 = linkedListTestDriver6.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver23.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver27 = new experiment.util.LinkedListTestDriver();
        int int28 = linkedListTestDriver27.size();
        java.lang.Object obj29 = linkedListTestDriver23.set(0, (java.lang.Object) linkedListTestDriver27);
        linkedListTestDriver23.clear();
        linkedListTestDriver6.addLast((java.lang.Object) linkedListTestDriver23);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (byte) -1 + "'", obj29, (byte) -1);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test214");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) ' ');
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver3.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        int int8 = linkedListTestDriver7.size();
        java.lang.Object obj9 = linkedListTestDriver3.set(0, (java.lang.Object) linkedListTestDriver7);
        linkedListTestDriver3.addFirst((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator15 = linkedListTestDriver12.iterator();
        linkedListTestDriver3.addLast((java.lang.Object) linkedListTestDriver12);
        boolean boolean18 = linkedListTestDriver12.contains((java.lang.Object) 0.0f);
        boolean boolean19 = linkedListTestDriver0.equals_CUT((java.lang.Object) boolean18);
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver20.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver23.addLast((java.lang.Object) (byte) -1);
        boolean boolean27 = linkedListTestDriver23.add((java.lang.Object) 0L);
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        int int30 = linkedListTestDriver29.size();
        boolean boolean32 = linkedListTestDriver29.add((java.lang.Object) 1L);
        linkedListTestDriver23.add(0, (java.lang.Object) linkedListTestDriver29);
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver34.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator37 = linkedListTestDriver34.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver38 = new experiment.util.LinkedListTestDriver();
        int int39 = linkedListTestDriver38.size();
        boolean boolean41 = linkedListTestDriver38.add((java.lang.Object) 1L);
        java.lang.Object[] objArray42 = linkedListTestDriver38.toArray();
        boolean boolean43 = linkedListTestDriver34.remove((java.lang.Object) linkedListTestDriver38);
        java.lang.Object obj44 = linkedListTestDriver34.getLast();
        boolean boolean45 = linkedListTestDriver29.contains((java.lang.Object) linkedListTestDriver34);
        boolean boolean46 = linkedListTestDriver34.isEmpty();
        boolean boolean47 = linkedListTestDriver20.remove((java.lang.Object) boolean46);
        boolean boolean48 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver20);
        experiment.util.LinkedListTestDriver linkedListTestDriver49 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver49.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver53 = new experiment.util.LinkedListTestDriver();
        int int54 = linkedListTestDriver53.size();
        java.lang.Object obj55 = linkedListTestDriver49.set(0, (java.lang.Object) linkedListTestDriver53);
        linkedListTestDriver49.clear();
        boolean boolean57 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver49);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj58 = linkedListTestDriver49.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[1]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + (byte) -1 + "'", obj44, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + (byte) -1 + "'", obj55, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test215");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        int int5 = linkedListTestDriver4.size();
        java.lang.Object obj6 = linkedListTestDriver0.set(0, (java.lang.Object) linkedListTestDriver4);
        int int7 = linkedListTestDriver4.size();
        int int8 = linkedListTestDriver4.size();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test216");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) 0L);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        int int7 = linkedListTestDriver6.size();
        boolean boolean9 = linkedListTestDriver6.add((java.lang.Object) 1L);
        linkedListTestDriver0.add(0, (java.lang.Object) linkedListTestDriver6);
        boolean boolean11 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator15 = linkedListTestDriver12.iterator();
        java.lang.Object[] objArray16 = linkedListTestDriver12.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver17.addLast((java.lang.Object) ' ');
        java.lang.Object[] objArray20 = linkedListTestDriver17.toArray();
        linkedListTestDriver17.addFirst((java.lang.Object) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver24.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator27 = linkedListTestDriver24.iterator();
        boolean boolean29 = linkedListTestDriver24.remove((java.lang.Object) 10);
        linkedListTestDriver17.add((int) (short) 0, (java.lang.Object) 10);
        boolean boolean31 = linkedListTestDriver12.contains((java.lang.Object) (short) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver32.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator35 = linkedListTestDriver32.iterator();
        java.lang.Object[] objArray36 = linkedListTestDriver32.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver37.addLast((java.lang.Object) ' ');
        java.lang.Object[] objArray40 = linkedListTestDriver37.toArray();
        linkedListTestDriver37.addFirst((java.lang.Object) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver44 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver44.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator47 = linkedListTestDriver44.iterator();
        boolean boolean49 = linkedListTestDriver44.remove((java.lang.Object) 10);
        linkedListTestDriver37.add((int) (short) 0, (java.lang.Object) 10);
        boolean boolean51 = linkedListTestDriver32.contains((java.lang.Object) (short) 0);
        linkedListTestDriver12.addLast((java.lang.Object) boolean51);
        java.lang.Object[] objArray53 = linkedListTestDriver12.toArray();
        java.lang.Object obj54 = linkedListTestDriver12.removeFirst();
        boolean boolean55 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver12);
        experiment.util.LinkedListTestDriver linkedListTestDriver56 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver56.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator59 = linkedListTestDriver56.iterator();
        boolean boolean61 = linkedListTestDriver56.remove((java.lang.Object) 10);
        experiment.util.Iterator iterator62 = linkedListTestDriver56.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver63 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver63.addLast((java.lang.Object) ' ');
        java.lang.Object[] objArray66 = linkedListTestDriver63.toArray();
        java.lang.Object obj67 = linkedListTestDriver63.getFirst();
        boolean boolean68 = linkedListTestDriver56.remove(obj67);
        experiment.util.LinkedListTestDriver linkedListTestDriver69 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver69.addLast((java.lang.Object) (byte) -1);
        boolean boolean73 = linkedListTestDriver69.add((java.lang.Object) 0L);
        java.lang.Object obj74 = linkedListTestDriver69.getLast();
        java.lang.Object obj76 = linkedListTestDriver69.get((int) (byte) 0);
        linkedListTestDriver56.addFirst((java.lang.Object) (byte) 0);
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver56);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[-1]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[ ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[ ]");
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[-1]");
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[ ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[ ]");
        org.junit.Assert.assertNotNull(iterator47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[-1, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[-1, false]");
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + (byte) -1 + "'", obj54, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(iterator59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(iterator62);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[ ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[ ]");
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + ' ' + "'", obj67, ' ');
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertEquals("'" + obj74 + "' != '" + 0L + "'", obj74, 0L);
        org.junit.Assert.assertEquals("'" + obj76 + "' != '" + (byte) -1 + "'", obj76, (byte) -1);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test217");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        int int5 = linkedListTestDriver4.size();
        boolean boolean7 = linkedListTestDriver4.add((java.lang.Object) 1L);
        java.lang.Object[] objArray8 = linkedListTestDriver4.toArray();
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver4);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator13 = linkedListTestDriver10.iterator();
        boolean boolean15 = linkedListTestDriver10.remove((java.lang.Object) 10);
        java.lang.Object obj16 = linkedListTestDriver10.removeLast();
        boolean boolean18 = linkedListTestDriver10.add((java.lang.Object) 0L);
        java.lang.Object obj21 = linkedListTestDriver10.set((int) (short) 0, (java.lang.Object) (short) 1);
        java.lang.Object obj22 = linkedListTestDriver10.removeLast();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver10);
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver24.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        int int29 = linkedListTestDriver28.size();
        java.lang.Object obj30 = linkedListTestDriver24.set(0, (java.lang.Object) linkedListTestDriver28);
        linkedListTestDriver24.addFirst((java.lang.Object) (short) 100);
        boolean boolean33 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver24);
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver34.addLast((java.lang.Object) (byte) -1);
        linkedListTestDriver34.addFirst((java.lang.Object) 1.0f);
        java.lang.Object obj39 = linkedListTestDriver34.getFirst();
        java.lang.Object obj40 = linkedListTestDriver34.getLast();
        boolean boolean41 = linkedListTestDriver24.contains((java.lang.Object) linkedListTestDriver34);
        experiment.util.LinkedListTestDriver linkedListTestDriver42 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver42.addLast((java.lang.Object) (byte) -1);
        boolean boolean46 = linkedListTestDriver42.add((java.lang.Object) 0L);
        boolean boolean48 = linkedListTestDriver42.equals_CUT((java.lang.Object) 1);
        linkedListTestDriver42.clear();
        boolean boolean50 = linkedListTestDriver34.remove((java.lang.Object) linkedListTestDriver42);
        experiment.util.Iterator iterator51 = linkedListTestDriver42.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj52 = linkedListTestDriver42.getLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) -1 + "'", obj16, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0L + "'", obj21, 0L);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (short) 1 + "'", obj22, (short) 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (byte) -1 + "'", obj30, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 1.0f + "'", obj39, 1.0f);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (byte) -1 + "'", obj40, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(iterator51);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test218");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) 0L);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        int int7 = linkedListTestDriver6.size();
        boolean boolean9 = linkedListTestDriver6.add((java.lang.Object) 1L);
        linkedListTestDriver0.add(0, (java.lang.Object) linkedListTestDriver6);
        boolean boolean11 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator15 = linkedListTestDriver12.iterator();
        boolean boolean16 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver12);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver17.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator20 = linkedListTestDriver17.iterator();
        boolean boolean22 = linkedListTestDriver17.remove((java.lang.Object) 10);
        java.lang.Object obj23 = linkedListTestDriver17.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver24.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator27 = linkedListTestDriver24.iterator();
        boolean boolean29 = linkedListTestDriver24.remove((java.lang.Object) 10);
        java.lang.Object obj30 = linkedListTestDriver24.removeLast();
        boolean boolean32 = linkedListTestDriver24.equals_CUT((java.lang.Object) '4');
        boolean boolean34 = linkedListTestDriver24.add((java.lang.Object) 100.0d);
        boolean boolean35 = linkedListTestDriver17.add((java.lang.Object) linkedListTestDriver24);
        boolean boolean36 = linkedListTestDriver12.contains((java.lang.Object) linkedListTestDriver24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj38 = linkedListTestDriver12.get((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (byte) -1 + "'", obj30, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test219");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray4 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver5.addLast((java.lang.Object) ' ');
        java.lang.Object[] objArray8 = linkedListTestDriver5.toArray();
        linkedListTestDriver5.addFirst((java.lang.Object) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator15 = linkedListTestDriver12.iterator();
        boolean boolean17 = linkedListTestDriver12.remove((java.lang.Object) 10);
        linkedListTestDriver5.add((int) (short) 0, (java.lang.Object) 10);
        boolean boolean19 = linkedListTestDriver0.contains((java.lang.Object) (short) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver20.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator23 = linkedListTestDriver20.iterator();
        java.lang.Object[] objArray24 = linkedListTestDriver20.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver25.addLast((java.lang.Object) ' ');
        java.lang.Object[] objArray28 = linkedListTestDriver25.toArray();
        linkedListTestDriver25.addFirst((java.lang.Object) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver32.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator35 = linkedListTestDriver32.iterator();
        boolean boolean37 = linkedListTestDriver32.remove((java.lang.Object) 10);
        linkedListTestDriver25.add((int) (short) 0, (java.lang.Object) 10);
        boolean boolean39 = linkedListTestDriver20.contains((java.lang.Object) (short) 0);
        linkedListTestDriver0.addLast((java.lang.Object) boolean39);
        java.lang.Object[] objArray41 = linkedListTestDriver0.toArray();
        boolean boolean42 = linkedListTestDriver0.isEmpty();
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[ ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[ ]");
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[-1]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[ ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[ ]");
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[-1, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[-1, false]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test220");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        linkedListTestDriver0.addFirst((java.lang.Object) 1.0f);
        java.lang.Object obj5 = linkedListTestDriver0.getFirst();
        experiment.util.ListIterator listIterator7 = linkedListTestDriver0.listIterator(0);
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 1.0f + "'", obj5, 1.0f);
        org.junit.Assert.assertNotNull(listIterator7);
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test221");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) ' ');
        java.lang.Object[] objArray3 = linkedListTestDriver0.toArray();
        java.lang.Object obj4 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver5.addLast((java.lang.Object) (byte) -1);
        boolean boolean9 = linkedListTestDriver5.add((java.lang.Object) 0L);
        java.lang.Object obj10 = linkedListTestDriver5.getLast();
        boolean boolean11 = linkedListTestDriver0.remove(obj10);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver13.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator16 = linkedListTestDriver13.iterator();
        boolean boolean18 = linkedListTestDriver13.remove((java.lang.Object) 10);
        java.lang.Object obj19 = linkedListTestDriver13.removeLast();
        boolean boolean21 = linkedListTestDriver13.equals_CUT((java.lang.Object) '4');
        int int22 = linkedListTestDriver13.size();
        linkedListTestDriver13.addFirst((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver25.addLast((java.lang.Object) (byte) -1);
        boolean boolean29 = linkedListTestDriver25.add((java.lang.Object) 0L);
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        int int32 = linkedListTestDriver31.size();
        boolean boolean34 = linkedListTestDriver31.add((java.lang.Object) 1L);
        linkedListTestDriver25.add(0, (java.lang.Object) linkedListTestDriver31);
        boolean boolean36 = linkedListTestDriver25.isEmpty();
        linkedListTestDriver13.addLast((java.lang.Object) boolean36);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) (short) -1, (java.lang.Object) linkedListTestDriver13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[ ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[ ]");
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + ' ' + "'", obj4, ' ');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 0L + "'", obj10, 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) -1 + "'", obj19, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test222");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) 1L);
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator7 = linkedListTestDriver4.iterator();
        java.lang.Object[] objArray8 = linkedListTestDriver4.toArray();
        linkedListTestDriver0.addLast((java.lang.Object) objArray8);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        int int15 = linkedListTestDriver14.size();
        java.lang.Object obj16 = linkedListTestDriver10.set(0, (java.lang.Object) linkedListTestDriver14);
        linkedListTestDriver10.addFirst((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver19.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator22 = linkedListTestDriver19.iterator();
        linkedListTestDriver10.addLast((java.lang.Object) linkedListTestDriver19);
        boolean boolean25 = linkedListTestDriver19.contains((java.lang.Object) 0.0f);
        boolean boolean26 = linkedListTestDriver0.equals_CUT((java.lang.Object) 0.0f);
        java.lang.Object obj27 = linkedListTestDriver0.removeFirst();
        java.lang.Object[] objArray28 = linkedListTestDriver0.toArray();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) -1 + "'", obj16, (byte) -1);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 1L + "'", obj27, 1L);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[[-1]]");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test223");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) 1L);
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator7 = linkedListTestDriver4.iterator();
        java.lang.Object[] objArray8 = linkedListTestDriver4.toArray();
        linkedListTestDriver0.addLast((java.lang.Object) objArray8);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        int int15 = linkedListTestDriver14.size();
        java.lang.Object obj16 = linkedListTestDriver10.set(0, (java.lang.Object) linkedListTestDriver14);
        linkedListTestDriver10.addFirst((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver19.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator22 = linkedListTestDriver19.iterator();
        linkedListTestDriver10.addLast((java.lang.Object) linkedListTestDriver19);
        boolean boolean25 = linkedListTestDriver19.contains((java.lang.Object) 0.0f);
        boolean boolean26 = linkedListTestDriver0.equals_CUT((java.lang.Object) 0.0f);
        int int27 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver28.addLast((java.lang.Object) (byte) -1);
        boolean boolean32 = linkedListTestDriver28.add((java.lang.Object) 0L);
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        int int35 = linkedListTestDriver34.size();
        boolean boolean37 = linkedListTestDriver34.add((java.lang.Object) 1L);
        linkedListTestDriver28.add(0, (java.lang.Object) linkedListTestDriver34);
        experiment.util.Iterator iterator39 = linkedListTestDriver34.iterator();
        linkedListTestDriver34.addLast((java.lang.Object) '#');
        java.lang.Object obj43 = linkedListTestDriver34.remove(1);
        linkedListTestDriver0.addFirst((java.lang.Object) 1);
        java.lang.Object obj45 = linkedListTestDriver0.removeFirst();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) -1 + "'", obj16, (byte) -1);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + '#' + "'", obj43, '#');
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + 1 + "'", obj45, 1);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test224");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        int int5 = linkedListTestDriver4.size();
        java.lang.Object obj6 = linkedListTestDriver0.set(0, (java.lang.Object) linkedListTestDriver4);
        java.lang.Object[] objArray7 = linkedListTestDriver0.toArray();
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = linkedListTestDriver0.equals_CUT(obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test225");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        int int5 = linkedListTestDriver4.size();
        boolean boolean7 = linkedListTestDriver4.add((java.lang.Object) 1L);
        java.lang.Object[] objArray8 = linkedListTestDriver4.toArray();
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver4);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator13 = linkedListTestDriver10.iterator();
        boolean boolean15 = linkedListTestDriver10.remove((java.lang.Object) 10);
        java.lang.Object obj16 = linkedListTestDriver10.removeLast();
        boolean boolean18 = linkedListTestDriver10.add((java.lang.Object) 0L);
        java.lang.Object obj21 = linkedListTestDriver10.set((int) (short) 0, (java.lang.Object) (short) 1);
        java.lang.Object obj22 = linkedListTestDriver10.removeLast();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver10);
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        int int25 = linkedListTestDriver24.size();
        boolean boolean27 = linkedListTestDriver24.add((java.lang.Object) 1L);
        java.lang.Object[] objArray28 = linkedListTestDriver24.toArray();
        java.lang.Object obj29 = linkedListTestDriver24.removeFirst();
        linkedListTestDriver10.addFirst((java.lang.Object) linkedListTestDriver24);
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver32.addLast((java.lang.Object) (byte) -1);
        linkedListTestDriver32.addFirst((java.lang.Object) 1.0f);
        java.lang.Object obj37 = linkedListTestDriver32.getFirst();
        experiment.util.ListIterator listIterator39 = linkedListTestDriver32.listIterator(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj40 = linkedListTestDriver10.set((int) (short) -1, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) -1 + "'", obj16, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0L + "'", obj21, 0L);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (short) 1 + "'", obj22, (short) 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[1]");
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 1L + "'", obj29, 1L);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 1.0f + "'", obj37, 1.0f);
        org.junit.Assert.assertNotNull(listIterator39);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test226");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean5 = linkedListTestDriver0.remove((java.lang.Object) 10);
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        java.lang.Object obj7 = linkedListTestDriver0.getLast();
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver9.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator12 = linkedListTestDriver9.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        int int14 = linkedListTestDriver13.size();
        boolean boolean16 = linkedListTestDriver13.add((java.lang.Object) 1L);
        java.lang.Object[] objArray17 = linkedListTestDriver13.toArray();
        boolean boolean18 = linkedListTestDriver9.remove((java.lang.Object) linkedListTestDriver13);
        java.lang.Object obj19 = linkedListTestDriver9.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver20.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator23 = linkedListTestDriver20.iterator();
        boolean boolean25 = linkedListTestDriver20.remove((java.lang.Object) 10);
        java.lang.Object obj26 = linkedListTestDriver20.removeLast();
        boolean boolean28 = linkedListTestDriver20.equals_CUT((java.lang.Object) '4');
        int int29 = linkedListTestDriver20.size();
        boolean boolean30 = linkedListTestDriver9.equals_CUT((java.lang.Object) linkedListTestDriver20);
        boolean boolean32 = linkedListTestDriver9.contains((java.lang.Object) 1L);
        experiment.util.LinkedListTestDriver linkedListTestDriver33 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver33.addLast((java.lang.Object) (byte) -1);
        boolean boolean37 = linkedListTestDriver33.add((java.lang.Object) 0L);
        boolean boolean39 = linkedListTestDriver33.equals_CUT((java.lang.Object) (short) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver40 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver40.addLast((java.lang.Object) (byte) -1);
        boolean boolean44 = linkedListTestDriver40.add((java.lang.Object) 0L);
        boolean boolean45 = linkedListTestDriver40.isEmpty();
        linkedListTestDriver40.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver47 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver47.addLast((java.lang.Object) (byte) -1);
        boolean boolean51 = linkedListTestDriver47.add((java.lang.Object) 0L);
        java.lang.Object obj52 = linkedListTestDriver47.getLast();
        java.lang.Object obj54 = linkedListTestDriver47.get((int) (byte) 0);
        java.lang.Object obj55 = linkedListTestDriver47.getLast();
        boolean boolean56 = linkedListTestDriver40.equals_CUT(obj55);
        experiment.util.Iterator iterator57 = linkedListTestDriver40.iterator();
        linkedListTestDriver33.addLast((java.lang.Object) linkedListTestDriver40);
        boolean boolean59 = linkedListTestDriver9.add((java.lang.Object) linkedListTestDriver33);
        boolean boolean60 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver33);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator62 = linkedListTestDriver33.listIterator((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[1]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) -1 + "'", obj19, (byte) -1);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) -1 + "'", obj26, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 0L + "'", obj52, 0L);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + (byte) -1 + "'", obj54, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + 0L + "'", obj55, 0L);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(iterator57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test227");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) 1L);
        java.lang.Object[] objArray4 = linkedListTestDriver0.toArray();
        java.lang.Object obj5 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator9 = linkedListTestDriver6.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        int int11 = linkedListTestDriver10.size();
        boolean boolean13 = linkedListTestDriver10.add((java.lang.Object) 1L);
        java.lang.Object[] objArray14 = linkedListTestDriver10.toArray();
        boolean boolean15 = linkedListTestDriver6.remove((java.lang.Object) linkedListTestDriver10);
        java.lang.Object obj16 = linkedListTestDriver6.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver17.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator20 = linkedListTestDriver17.iterator();
        boolean boolean22 = linkedListTestDriver17.remove((java.lang.Object) 10);
        java.lang.Object obj23 = linkedListTestDriver17.removeLast();
        boolean boolean25 = linkedListTestDriver17.equals_CUT((java.lang.Object) '4');
        int int26 = linkedListTestDriver17.size();
        boolean boolean27 = linkedListTestDriver6.equals_CUT((java.lang.Object) linkedListTestDriver17);
        boolean boolean29 = linkedListTestDriver6.contains((java.lang.Object) 1L);
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver30.addLast((java.lang.Object) (byte) -1);
        boolean boolean34 = linkedListTestDriver30.add((java.lang.Object) 0L);
        boolean boolean36 = linkedListTestDriver30.equals_CUT((java.lang.Object) (short) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver37.addLast((java.lang.Object) (byte) -1);
        boolean boolean41 = linkedListTestDriver37.add((java.lang.Object) 0L);
        boolean boolean42 = linkedListTestDriver37.isEmpty();
        linkedListTestDriver37.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver44 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver44.addLast((java.lang.Object) (byte) -1);
        boolean boolean48 = linkedListTestDriver44.add((java.lang.Object) 0L);
        java.lang.Object obj49 = linkedListTestDriver44.getLast();
        java.lang.Object obj51 = linkedListTestDriver44.get((int) (byte) 0);
        java.lang.Object obj52 = linkedListTestDriver44.getLast();
        boolean boolean53 = linkedListTestDriver37.equals_CUT(obj52);
        experiment.util.Iterator iterator54 = linkedListTestDriver37.iterator();
        linkedListTestDriver30.addLast((java.lang.Object) linkedListTestDriver37);
        boolean boolean56 = linkedListTestDriver6.add((java.lang.Object) linkedListTestDriver30);
        boolean boolean57 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj59 = linkedListTestDriver0.get((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1]");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 1L + "'", obj5, 1L);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) -1 + "'", obj16, (byte) -1);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 0L + "'", obj49, 0L);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + (byte) -1 + "'", obj51, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 0L + "'", obj52, 0L);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(iterator54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test228");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) 0L);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        int int7 = linkedListTestDriver6.size();
        boolean boolean9 = linkedListTestDriver6.add((java.lang.Object) 1L);
        linkedListTestDriver0.add(0, (java.lang.Object) linkedListTestDriver6);
        boolean boolean11 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator15 = linkedListTestDriver12.iterator();
        boolean boolean16 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver12);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver17.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        int int22 = linkedListTestDriver21.size();
        java.lang.Object obj23 = linkedListTestDriver17.set(0, (java.lang.Object) linkedListTestDriver21);
        linkedListTestDriver17.clear();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver17);
        java.lang.Object obj26 = linkedListTestDriver0.getLast();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0L + "'", obj26, 0L);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test229");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean5 = linkedListTestDriver0.remove((java.lang.Object) 10);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        boolean boolean8 = linkedListTestDriver0.equals_CUT((java.lang.Object) '4');
        int int9 = linkedListTestDriver0.size();
        linkedListTestDriver0.addFirst((java.lang.Object) false);
        java.lang.Object obj13 = null;
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) (short) 0, obj13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test230");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean5 = linkedListTestDriver0.remove((java.lang.Object) 10);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        boolean boolean8 = linkedListTestDriver0.equals_CUT((java.lang.Object) '4');
        boolean boolean10 = linkedListTestDriver0.add((java.lang.Object) 100.0d);
        java.lang.Object obj11 = linkedListTestDriver0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = linkedListTestDriver0.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0d + "'", obj11, 100.0d);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test231");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        int int5 = linkedListTestDriver4.size();
        java.lang.Object obj6 = linkedListTestDriver0.set(0, (java.lang.Object) linkedListTestDriver4);
        boolean boolean8 = linkedListTestDriver0.add((java.lang.Object) 1.0d);
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = linkedListTestDriver0.get((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test232");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        int int5 = linkedListTestDriver4.size();
        java.lang.Object obj6 = linkedListTestDriver0.set(0, (java.lang.Object) linkedListTestDriver4);
        linkedListTestDriver0.addFirst((java.lang.Object) (short) 100);
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) -1);
        boolean boolean11 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addLast((java.lang.Object) (byte) -1);
        boolean boolean16 = linkedListTestDriver12.add((java.lang.Object) 0L);
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        int int19 = linkedListTestDriver18.size();
        boolean boolean21 = linkedListTestDriver18.add((java.lang.Object) 1L);
        linkedListTestDriver12.add(0, (java.lang.Object) linkedListTestDriver18);
        experiment.util.Iterator iterator23 = linkedListTestDriver18.iterator();
        linkedListTestDriver18.addLast((java.lang.Object) '#');
        linkedListTestDriver0.addFirst((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver27 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver27.addLast((java.lang.Object) (byte) -1);
        linkedListTestDriver27.addFirst((java.lang.Object) 1.0f);
        java.lang.Object obj32 = linkedListTestDriver27.getFirst();
        linkedListTestDriver27.addFirst((java.lang.Object) (-1.0d));
        int int35 = linkedListTestDriver27.size();
        linkedListTestDriver27.clear();
        boolean boolean38 = linkedListTestDriver27.add((java.lang.Object) (byte) 0);
        linkedListTestDriver27.addLast((java.lang.Object) (short) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver41 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver41.addLast((java.lang.Object) (byte) -1);
        boolean boolean45 = linkedListTestDriver41.add((java.lang.Object) 0L);
        java.lang.Object obj46 = linkedListTestDriver41.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver47 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver47.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator50 = linkedListTestDriver47.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver51 = new experiment.util.LinkedListTestDriver();
        int int52 = linkedListTestDriver51.size();
        boolean boolean54 = linkedListTestDriver51.add((java.lang.Object) 1L);
        java.lang.Object[] objArray55 = linkedListTestDriver51.toArray();
        boolean boolean56 = linkedListTestDriver47.remove((java.lang.Object) linkedListTestDriver51);
        experiment.util.LinkedListTestDriver linkedListTestDriver57 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver57.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator60 = linkedListTestDriver57.iterator();
        boolean boolean62 = linkedListTestDriver57.remove((java.lang.Object) 10);
        java.lang.Object obj63 = linkedListTestDriver57.removeLast();
        boolean boolean65 = linkedListTestDriver57.add((java.lang.Object) 0L);
        java.lang.Object obj68 = linkedListTestDriver57.set((int) (short) 0, (java.lang.Object) (short) 1);
        java.lang.Object obj69 = linkedListTestDriver57.removeLast();
        linkedListTestDriver47.addLast((java.lang.Object) linkedListTestDriver57);
        experiment.util.LinkedListTestDriver linkedListTestDriver71 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver71.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver75 = new experiment.util.LinkedListTestDriver();
        int int76 = linkedListTestDriver75.size();
        java.lang.Object obj77 = linkedListTestDriver71.set(0, (java.lang.Object) linkedListTestDriver75);
        linkedListTestDriver71.addFirst((java.lang.Object) (short) 100);
        boolean boolean80 = linkedListTestDriver47.equals_CUT((java.lang.Object) linkedListTestDriver71);
        experiment.util.LinkedListTestDriver linkedListTestDriver81 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver81.addLast((java.lang.Object) (byte) -1);
        linkedListTestDriver47.addFirst((java.lang.Object) linkedListTestDriver81);
        linkedListTestDriver41.addLast((java.lang.Object) linkedListTestDriver81);
        boolean boolean86 = linkedListTestDriver27.contains((java.lang.Object) linkedListTestDriver41);
        boolean boolean87 = linkedListTestDriver0.add((java.lang.Object) boolean86);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 1.0f + "'", obj32, 1.0f);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 0L + "'", obj46, 0L);
        org.junit.Assert.assertNotNull(iterator50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[1]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(iterator60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + (byte) -1 + "'", obj63, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertEquals("'" + obj68 + "' != '" + 0L + "'", obj68, 0L);
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + (short) 1 + "'", obj69, (short) 1);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertEquals("'" + obj77 + "' != '" + (byte) -1 + "'", obj77, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test233");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) 0L);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        int int7 = linkedListTestDriver6.size();
        boolean boolean9 = linkedListTestDriver6.add((java.lang.Object) 1L);
        linkedListTestDriver0.add(0, (java.lang.Object) linkedListTestDriver6);
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator14 = linkedListTestDriver11.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        int int16 = linkedListTestDriver15.size();
        boolean boolean18 = linkedListTestDriver15.add((java.lang.Object) 1L);
        java.lang.Object[] objArray19 = linkedListTestDriver15.toArray();
        boolean boolean20 = linkedListTestDriver11.remove((java.lang.Object) linkedListTestDriver15);
        java.lang.Object obj21 = linkedListTestDriver11.getLast();
        boolean boolean22 = linkedListTestDriver6.contains((java.lang.Object) linkedListTestDriver11);
        java.lang.Object obj24 = linkedListTestDriver6.remove(0);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver25.addLast((java.lang.Object) (byte) -1);
        boolean boolean29 = linkedListTestDriver25.add((java.lang.Object) 0L);
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        int int32 = linkedListTestDriver31.size();
        boolean boolean34 = linkedListTestDriver31.add((java.lang.Object) 1L);
        linkedListTestDriver25.add(0, (java.lang.Object) linkedListTestDriver31);
        experiment.util.Iterator iterator36 = linkedListTestDriver31.iterator();
        linkedListTestDriver31.addLast((java.lang.Object) '#');
        linkedListTestDriver31.addFirst((java.lang.Object) 100L);
        boolean boolean41 = linkedListTestDriver6.remove((java.lang.Object) 100L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) -1 + "'", obj21, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 1L + "'", obj24, 1L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test234");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) 1L);
        boolean boolean5 = linkedListTestDriver0.equals_CUT((java.lang.Object) true);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addLast((java.lang.Object) (byte) -1);
        boolean boolean10 = linkedListTestDriver6.add((java.lang.Object) 0L);
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        int int13 = linkedListTestDriver12.size();
        boolean boolean15 = linkedListTestDriver12.add((java.lang.Object) 1L);
        linkedListTestDriver6.add(0, (java.lang.Object) linkedListTestDriver12);
        boolean boolean17 = linkedListTestDriver6.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver18.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator21 = linkedListTestDriver18.iterator();
        boolean boolean22 = linkedListTestDriver6.contains((java.lang.Object) linkedListTestDriver18);
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver23.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver27 = new experiment.util.LinkedListTestDriver();
        int int28 = linkedListTestDriver27.size();
        java.lang.Object obj29 = linkedListTestDriver23.set(0, (java.lang.Object) linkedListTestDriver27);
        linkedListTestDriver23.clear();
        linkedListTestDriver6.addFirst((java.lang.Object) linkedListTestDriver23);
        boolean boolean32 = linkedListTestDriver6.isEmpty();
        boolean boolean33 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver6);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (byte) -1 + "'", obj29, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test235");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) 1L);
        java.lang.Object[] objArray4 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator9 = linkedListTestDriver6.iterator();
        java.lang.Object[] objArray10 = linkedListTestDriver6.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.addLast((java.lang.Object) ' ');
        java.lang.Object[] objArray14 = linkedListTestDriver11.toArray();
        linkedListTestDriver11.addFirst((java.lang.Object) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver18.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator21 = linkedListTestDriver18.iterator();
        boolean boolean23 = linkedListTestDriver18.remove((java.lang.Object) 10);
        linkedListTestDriver11.add((int) (short) 0, (java.lang.Object) 10);
        boolean boolean25 = linkedListTestDriver6.contains((java.lang.Object) (short) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver26.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator29 = linkedListTestDriver26.iterator();
        java.lang.Object[] objArray30 = linkedListTestDriver26.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver31.addLast((java.lang.Object) ' ');
        java.lang.Object[] objArray34 = linkedListTestDriver31.toArray();
        linkedListTestDriver31.addFirst((java.lang.Object) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver38 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver38.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator41 = linkedListTestDriver38.iterator();
        boolean boolean43 = linkedListTestDriver38.remove((java.lang.Object) 10);
        linkedListTestDriver31.add((int) (short) 0, (java.lang.Object) 10);
        boolean boolean45 = linkedListTestDriver26.contains((java.lang.Object) (short) 0);
        linkedListTestDriver6.addLast((java.lang.Object) boolean45);
        java.lang.Object[] objArray47 = linkedListTestDriver6.toArray();
        linkedListTestDriver0.add(0, (java.lang.Object) objArray47);
        java.lang.Object obj49 = linkedListTestDriver0.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver50 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver50.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver54 = new experiment.util.LinkedListTestDriver();
        int int55 = linkedListTestDriver54.size();
        java.lang.Object obj56 = linkedListTestDriver50.set(0, (java.lang.Object) linkedListTestDriver54);
        linkedListTestDriver50.addFirst((java.lang.Object) (short) 100);
        linkedListTestDriver50.addFirst((java.lang.Object) (byte) -1);
        boolean boolean61 = linkedListTestDriver50.isEmpty();
        java.lang.Object obj62 = linkedListTestDriver50.removeFirst();
        java.lang.Object[] objArray63 = linkedListTestDriver50.toArray();
        boolean boolean64 = linkedListTestDriver0.contains((java.lang.Object) objArray63);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1]");
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[-1]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[ ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[ ]");
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[-1]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[ ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[ ]");
        org.junit.Assert.assertNotNull(iterator41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[-1, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[-1, false]");
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 1L + "'", obj49, 1L);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + (byte) -1 + "'", obj56, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + (byte) -1 + "'", obj62, (byte) -1);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test236");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        int int5 = linkedListTestDriver4.size();
        java.lang.Object obj6 = linkedListTestDriver0.set(0, (java.lang.Object) linkedListTestDriver4);
        linkedListTestDriver0.addFirst((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver9.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator12 = linkedListTestDriver9.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver9);
        java.lang.Object obj14 = linkedListTestDriver0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = linkedListTestDriver0.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) 100 + "'", obj14, (short) 100);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test237");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        int int5 = linkedListTestDriver4.size();
        boolean boolean7 = linkedListTestDriver4.add((java.lang.Object) 1L);
        java.lang.Object[] objArray8 = linkedListTestDriver4.toArray();
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver4);
        java.lang.Object obj10 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator14 = linkedListTestDriver11.iterator();
        java.lang.Object[] objArray15 = linkedListTestDriver11.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver16.addLast((java.lang.Object) ' ');
        java.lang.Object[] objArray19 = linkedListTestDriver16.toArray();
        linkedListTestDriver16.addFirst((java.lang.Object) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver23.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator26 = linkedListTestDriver23.iterator();
        boolean boolean28 = linkedListTestDriver23.remove((java.lang.Object) 10);
        linkedListTestDriver16.add((int) (short) 0, (java.lang.Object) 10);
        boolean boolean30 = linkedListTestDriver11.contains((java.lang.Object) (short) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver31.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator34 = linkedListTestDriver31.iterator();
        java.lang.Object[] objArray35 = linkedListTestDriver31.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver36 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver36.addLast((java.lang.Object) ' ');
        java.lang.Object[] objArray39 = linkedListTestDriver36.toArray();
        linkedListTestDriver36.addFirst((java.lang.Object) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver43 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver43.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator46 = linkedListTestDriver43.iterator();
        boolean boolean48 = linkedListTestDriver43.remove((java.lang.Object) 10);
        linkedListTestDriver36.add((int) (short) 0, (java.lang.Object) 10);
        boolean boolean50 = linkedListTestDriver31.contains((java.lang.Object) (short) 0);
        linkedListTestDriver11.addLast((java.lang.Object) boolean50);
        java.lang.Object obj52 = linkedListTestDriver11.removeFirst();
        boolean boolean53 = linkedListTestDriver0.remove(obj52);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[-1]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[ ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[ ]");
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[-1]");
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[ ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[ ]");
        org.junit.Assert.assertNotNull(iterator46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + (byte) -1 + "'", obj52, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test238");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) 1L);
        boolean boolean5 = linkedListTestDriver0.equals_CUT((java.lang.Object) true);
        java.lang.Object obj6 = linkedListTestDriver0.getFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = linkedListTestDriver0.get((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1L + "'", obj6, 1L);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test239");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) 0L);
        boolean boolean6 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1);
        boolean boolean8 = linkedListTestDriver0.remove((java.lang.Object) 10);
        java.lang.Object obj10 = null;
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add(0, obj10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test240");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) 0L);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        int int7 = linkedListTestDriver6.size();
        boolean boolean9 = linkedListTestDriver6.add((java.lang.Object) 1L);
        linkedListTestDriver0.add(0, (java.lang.Object) linkedListTestDriver6);
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator14 = linkedListTestDriver11.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        int int16 = linkedListTestDriver15.size();
        boolean boolean18 = linkedListTestDriver15.add((java.lang.Object) 1L);
        java.lang.Object[] objArray19 = linkedListTestDriver15.toArray();
        boolean boolean20 = linkedListTestDriver11.remove((java.lang.Object) linkedListTestDriver15);
        java.lang.Object obj21 = linkedListTestDriver11.getLast();
        boolean boolean22 = linkedListTestDriver6.contains((java.lang.Object) linkedListTestDriver11);
        boolean boolean23 = linkedListTestDriver11.isEmpty();
        linkedListTestDriver11.addLast((java.lang.Object) "hi!");
        java.lang.Object obj27 = linkedListTestDriver11.remove((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) -1 + "'", obj21, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "hi!" + "'", obj27, "hi!");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test241");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) 1L);
        java.lang.Object[] objArray4 = linkedListTestDriver0.toArray();
        java.lang.Object obj5 = linkedListTestDriver0.removeFirst();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator10 = linkedListTestDriver7.iterator();
        boolean boolean12 = linkedListTestDriver7.remove((java.lang.Object) 10);
        java.lang.Object obj13 = linkedListTestDriver7.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        int int15 = linkedListTestDriver14.size();
        boolean boolean17 = linkedListTestDriver14.add((java.lang.Object) 1L);
        java.lang.Object[] objArray18 = linkedListTestDriver14.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver20.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator23 = linkedListTestDriver20.iterator();
        java.lang.Object[] objArray24 = linkedListTestDriver20.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver25.addLast((java.lang.Object) ' ');
        java.lang.Object[] objArray28 = linkedListTestDriver25.toArray();
        linkedListTestDriver25.addFirst((java.lang.Object) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver32.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator35 = linkedListTestDriver32.iterator();
        boolean boolean37 = linkedListTestDriver32.remove((java.lang.Object) 10);
        linkedListTestDriver25.add((int) (short) 0, (java.lang.Object) 10);
        boolean boolean39 = linkedListTestDriver20.contains((java.lang.Object) (short) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver40 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver40.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator43 = linkedListTestDriver40.iterator();
        java.lang.Object[] objArray44 = linkedListTestDriver40.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver45 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver45.addLast((java.lang.Object) ' ');
        java.lang.Object[] objArray48 = linkedListTestDriver45.toArray();
        linkedListTestDriver45.addFirst((java.lang.Object) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver52 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver52.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator55 = linkedListTestDriver52.iterator();
        boolean boolean57 = linkedListTestDriver52.remove((java.lang.Object) 10);
        linkedListTestDriver45.add((int) (short) 0, (java.lang.Object) 10);
        boolean boolean59 = linkedListTestDriver40.contains((java.lang.Object) (short) 0);
        linkedListTestDriver20.addLast((java.lang.Object) boolean59);
        java.lang.Object[] objArray61 = linkedListTestDriver20.toArray();
        linkedListTestDriver14.add(0, (java.lang.Object) objArray61);
        boolean boolean63 = linkedListTestDriver7.add((java.lang.Object) objArray61);
        experiment.util.LinkedListTestDriver linkedListTestDriver64 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver64.addLast((java.lang.Object) (byte) -1);
        linkedListTestDriver64.addFirst((java.lang.Object) 1.0f);
        java.lang.Object obj69 = linkedListTestDriver64.getFirst();
        linkedListTestDriver64.addFirst((java.lang.Object) (-1.0d));
        int int72 = linkedListTestDriver64.size();
        linkedListTestDriver64.clear();
        linkedListTestDriver7.addFirst((java.lang.Object) linkedListTestDriver64);
        java.lang.Object obj75 = linkedListTestDriver7.getFirst();
        linkedListTestDriver0.addLast(obj75);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1]");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 1L + "'", obj5, 1L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) -1 + "'", obj13, (byte) -1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[1]");
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[-1]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[ ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[ ]");
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(iterator43);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[-1]");
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[ ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[ ]");
        org.junit.Assert.assertNotNull(iterator55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[-1, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[-1, false]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + 1.0f + "'", obj69, 1.0f);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 3 + "'", int72 == 3);
        org.junit.Assert.assertNotNull(obj75);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test242");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) ' ');
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver3.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        int int8 = linkedListTestDriver7.size();
        java.lang.Object obj9 = linkedListTestDriver3.set(0, (java.lang.Object) linkedListTestDriver7);
        linkedListTestDriver3.addFirst((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator15 = linkedListTestDriver12.iterator();
        linkedListTestDriver3.addLast((java.lang.Object) linkedListTestDriver12);
        boolean boolean18 = linkedListTestDriver12.contains((java.lang.Object) 0.0f);
        boolean boolean19 = linkedListTestDriver0.equals_CUT((java.lang.Object) boolean18);
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver20.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver23.addLast((java.lang.Object) (byte) -1);
        boolean boolean27 = linkedListTestDriver23.add((java.lang.Object) 0L);
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        int int30 = linkedListTestDriver29.size();
        boolean boolean32 = linkedListTestDriver29.add((java.lang.Object) 1L);
        linkedListTestDriver23.add(0, (java.lang.Object) linkedListTestDriver29);
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver34.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator37 = linkedListTestDriver34.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver38 = new experiment.util.LinkedListTestDriver();
        int int39 = linkedListTestDriver38.size();
        boolean boolean41 = linkedListTestDriver38.add((java.lang.Object) 1L);
        java.lang.Object[] objArray42 = linkedListTestDriver38.toArray();
        boolean boolean43 = linkedListTestDriver34.remove((java.lang.Object) linkedListTestDriver38);
        java.lang.Object obj44 = linkedListTestDriver34.getLast();
        boolean boolean45 = linkedListTestDriver29.contains((java.lang.Object) linkedListTestDriver34);
        boolean boolean46 = linkedListTestDriver34.isEmpty();
        boolean boolean47 = linkedListTestDriver20.remove((java.lang.Object) boolean46);
        boolean boolean48 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver20);
        experiment.util.LinkedListTestDriver linkedListTestDriver49 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver49.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver53 = new experiment.util.LinkedListTestDriver();
        int int54 = linkedListTestDriver53.size();
        java.lang.Object obj55 = linkedListTestDriver49.set(0, (java.lang.Object) linkedListTestDriver53);
        linkedListTestDriver49.clear();
        boolean boolean57 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver49);
        experiment.util.Iterator iterator58 = linkedListTestDriver0.iterator();
        java.lang.Class<?> wildcardClass59 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[1]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + (byte) -1 + "'", obj44, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + (byte) -1 + "'", obj55, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(iterator58);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test243");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) 0L);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        int int7 = linkedListTestDriver6.size();
        boolean boolean9 = linkedListTestDriver6.add((java.lang.Object) 1L);
        linkedListTestDriver0.add(0, (java.lang.Object) linkedListTestDriver6);
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        int int16 = linkedListTestDriver15.size();
        java.lang.Object obj17 = linkedListTestDriver11.set(0, (java.lang.Object) linkedListTestDriver15);
        java.lang.Class<?> wildcardClass18 = linkedListTestDriver15.getClass();
        boolean boolean19 = linkedListTestDriver6.contains((java.lang.Object) wildcardClass18);
        boolean boolean21 = linkedListTestDriver6.add((java.lang.Object) 1L);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        int int23 = linkedListTestDriver22.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver24.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator27 = linkedListTestDriver24.iterator();
        java.lang.Object[] objArray28 = linkedListTestDriver24.toArray();
        boolean boolean29 = linkedListTestDriver22.equals_CUT((java.lang.Object) linkedListTestDriver24);
        boolean boolean30 = linkedListTestDriver6.remove((java.lang.Object) linkedListTestDriver22);
        java.lang.Object obj32 = linkedListTestDriver6.get((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 1L + "'", obj32, 1L);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test244");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean5 = linkedListTestDriver0.remove((java.lang.Object) 10);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        boolean boolean8 = linkedListTestDriver0.equals_CUT((java.lang.Object) '4');
        boolean boolean10 = linkedListTestDriver0.add((java.lang.Object) 100.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.addLast((java.lang.Object) (byte) -1);
        boolean boolean15 = linkedListTestDriver11.add((java.lang.Object) 0L);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        int int18 = linkedListTestDriver17.size();
        boolean boolean20 = linkedListTestDriver17.add((java.lang.Object) 1L);
        linkedListTestDriver11.add(0, (java.lang.Object) linkedListTestDriver17);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver22.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        int int27 = linkedListTestDriver26.size();
        java.lang.Object obj28 = linkedListTestDriver22.set(0, (java.lang.Object) linkedListTestDriver26);
        java.lang.Class<?> wildcardClass29 = linkedListTestDriver26.getClass();
        boolean boolean30 = linkedListTestDriver17.contains((java.lang.Object) wildcardClass29);
        boolean boolean32 = linkedListTestDriver17.add((java.lang.Object) 1L);
        experiment.util.LinkedListTestDriver linkedListTestDriver33 = new experiment.util.LinkedListTestDriver();
        int int34 = linkedListTestDriver33.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver35 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver35.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator38 = linkedListTestDriver35.iterator();
        java.lang.Object[] objArray39 = linkedListTestDriver35.toArray();
        boolean boolean40 = linkedListTestDriver33.equals_CUT((java.lang.Object) linkedListTestDriver35);
        boolean boolean41 = linkedListTestDriver17.remove((java.lang.Object) linkedListTestDriver33);
        java.lang.Object obj42 = linkedListTestDriver17.removeFirst();
        boolean boolean43 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver17);
        experiment.util.LinkedListTestDriver linkedListTestDriver45 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver45.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator48 = linkedListTestDriver45.iterator();
        boolean boolean50 = linkedListTestDriver45.remove((java.lang.Object) 10);
        java.lang.Object obj51 = linkedListTestDriver45.removeLast();
        boolean boolean53 = linkedListTestDriver45.add((java.lang.Object) 0L);
        java.lang.Object obj56 = linkedListTestDriver45.set((int) (short) 0, (java.lang.Object) (short) 1);
        java.lang.Object obj57 = linkedListTestDriver45.removeLast();
        boolean boolean58 = linkedListTestDriver45.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj59 = linkedListTestDriver17.set((int) (byte) -1, (java.lang.Object) boolean58);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (byte) -1 + "'", obj28, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 1L + "'", obj42, 1L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(iterator48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + (byte) -1 + "'", obj51, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + 0L + "'", obj56, 0L);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + (short) 1 + "'", obj57, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test245");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) 0L);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        java.lang.Object obj7 = linkedListTestDriver0.get((int) (byte) 0);
        java.lang.Object obj8 = linkedListTestDriver0.getLast();
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = linkedListTestDriver0.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0L + "'", obj5, 0L);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0L + "'", obj8, 0L);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test246");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        int int5 = linkedListTestDriver4.size();
        boolean boolean7 = linkedListTestDriver4.add((java.lang.Object) 1L);
        java.lang.Object[] objArray8 = linkedListTestDriver4.toArray();
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver4);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator13 = linkedListTestDriver10.iterator();
        boolean boolean15 = linkedListTestDriver10.remove((java.lang.Object) 10);
        java.lang.Object obj16 = linkedListTestDriver10.removeLast();
        boolean boolean18 = linkedListTestDriver10.add((java.lang.Object) 0L);
        java.lang.Object obj21 = linkedListTestDriver10.set((int) (short) 0, (java.lang.Object) (short) 1);
        java.lang.Object obj22 = linkedListTestDriver10.removeLast();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver10);
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver24.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        int int29 = linkedListTestDriver28.size();
        java.lang.Object obj30 = linkedListTestDriver24.set(0, (java.lang.Object) linkedListTestDriver28);
        linkedListTestDriver24.addFirst((java.lang.Object) (short) 100);
        boolean boolean33 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver24);
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver34.addLast((java.lang.Object) (byte) -1);
        linkedListTestDriver34.addFirst((java.lang.Object) 1.0f);
        java.lang.Object obj39 = linkedListTestDriver34.getFirst();
        java.lang.Object obj40 = linkedListTestDriver34.getLast();
        boolean boolean41 = linkedListTestDriver24.contains((java.lang.Object) linkedListTestDriver34);
        experiment.util.LinkedListTestDriver linkedListTestDriver42 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver42.addLast((java.lang.Object) (byte) -1);
        boolean boolean46 = linkedListTestDriver42.add((java.lang.Object) 0L);
        boolean boolean48 = linkedListTestDriver42.equals_CUT((java.lang.Object) 1);
        linkedListTestDriver42.clear();
        boolean boolean50 = linkedListTestDriver34.remove((java.lang.Object) linkedListTestDriver42);
        int int51 = linkedListTestDriver42.size();
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) -1 + "'", obj16, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0L + "'", obj21, 0L);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (short) 1 + "'", obj22, (short) 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (byte) -1 + "'", obj30, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 1.0f + "'", obj39, 1.0f);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (byte) -1 + "'", obj40, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test247");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean5 = linkedListTestDriver0.remove((java.lang.Object) 10);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        boolean boolean8 = linkedListTestDriver0.add((java.lang.Object) 0L);
        java.lang.Object obj11 = linkedListTestDriver0.set((int) (short) 0, (java.lang.Object) (short) 1);
        java.lang.Object obj12 = linkedListTestDriver0.removeLast();
        boolean boolean13 = linkedListTestDriver0.isEmpty();
        int int14 = linkedListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = linkedListTestDriver0.get(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0L + "'", obj11, 0L);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (short) 1 + "'", obj12, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test248");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        int int5 = linkedListTestDriver4.size();
        java.lang.Object obj6 = linkedListTestDriver0.set(0, (java.lang.Object) linkedListTestDriver4);
        linkedListTestDriver0.addFirst((java.lang.Object) (short) 100);
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator11 = linkedListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator13 = linkedListTestDriver0.listIterator((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test249");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 10.0d);
        int int3 = linkedListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test250");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) 0L);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        int int7 = linkedListTestDriver6.size();
        boolean boolean9 = linkedListTestDriver6.add((java.lang.Object) 1L);
        linkedListTestDriver0.add(0, (java.lang.Object) linkedListTestDriver6);
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator14 = linkedListTestDriver11.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        int int16 = linkedListTestDriver15.size();
        boolean boolean18 = linkedListTestDriver15.add((java.lang.Object) 1L);
        java.lang.Object[] objArray19 = linkedListTestDriver15.toArray();
        boolean boolean20 = linkedListTestDriver11.remove((java.lang.Object) linkedListTestDriver15);
        java.lang.Object obj21 = linkedListTestDriver11.getLast();
        boolean boolean22 = linkedListTestDriver6.contains((java.lang.Object) linkedListTestDriver11);
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver23.addLast((java.lang.Object) (byte) -1);
        boolean boolean27 = linkedListTestDriver23.add((java.lang.Object) 0L);
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        int int30 = linkedListTestDriver29.size();
        boolean boolean32 = linkedListTestDriver29.add((java.lang.Object) 1L);
        linkedListTestDriver23.add(0, (java.lang.Object) linkedListTestDriver29);
        boolean boolean34 = linkedListTestDriver23.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver35 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver35.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator38 = linkedListTestDriver35.iterator();
        boolean boolean39 = linkedListTestDriver23.contains((java.lang.Object) linkedListTestDriver35);
        experiment.util.LinkedListTestDriver linkedListTestDriver40 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver40.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator43 = linkedListTestDriver40.iterator();
        boolean boolean45 = linkedListTestDriver40.remove((java.lang.Object) 10);
        java.lang.Object obj46 = linkedListTestDriver40.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver47 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver47.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator50 = linkedListTestDriver47.iterator();
        boolean boolean52 = linkedListTestDriver47.remove((java.lang.Object) 10);
        java.lang.Object obj53 = linkedListTestDriver47.removeLast();
        boolean boolean55 = linkedListTestDriver47.equals_CUT((java.lang.Object) '4');
        boolean boolean57 = linkedListTestDriver47.add((java.lang.Object) 100.0d);
        boolean boolean58 = linkedListTestDriver40.add((java.lang.Object) linkedListTestDriver47);
        boolean boolean59 = linkedListTestDriver35.contains((java.lang.Object) linkedListTestDriver47);
        java.lang.Object obj60 = linkedListTestDriver35.removeLast();
        java.lang.Object[] objArray61 = linkedListTestDriver35.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver62 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver62.addLast((java.lang.Object) (byte) -1);
        boolean boolean66 = linkedListTestDriver62.add((java.lang.Object) 0L);
        boolean boolean68 = linkedListTestDriver62.add((java.lang.Object) (short) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver69 = new experiment.util.LinkedListTestDriver();
        int int70 = linkedListTestDriver69.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver71 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver71.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator74 = linkedListTestDriver71.iterator();
        java.lang.Object[] objArray75 = linkedListTestDriver71.toArray();
        boolean boolean76 = linkedListTestDriver69.equals_CUT((java.lang.Object) linkedListTestDriver71);
        linkedListTestDriver62.addLast((java.lang.Object) linkedListTestDriver69);
        experiment.util.ListIterator listIterator79 = linkedListTestDriver69.listIterator((int) (short) 0);
        experiment.util.Iterator iterator80 = linkedListTestDriver69.iterator();
        boolean boolean81 = linkedListTestDriver35.contains((java.lang.Object) linkedListTestDriver69);
        boolean boolean82 = linkedListTestDriver6.add((java.lang.Object) linkedListTestDriver69);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) -1 + "'", obj21, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(iterator43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + (byte) -1 + "'", obj46, (byte) -1);
        org.junit.Assert.assertNotNull(iterator50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + (byte) -1 + "'", obj53, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + (byte) -1 + "'", obj60, (byte) -1);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(iterator74);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray75), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray75), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(listIterator79);
        org.junit.Assert.assertNotNull(iterator80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test251");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        int int5 = linkedListTestDriver4.size();
        boolean boolean7 = linkedListTestDriver4.add((java.lang.Object) 1L);
        java.lang.Object[] objArray8 = linkedListTestDriver4.toArray();
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver4);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator13 = linkedListTestDriver10.iterator();
        boolean boolean15 = linkedListTestDriver10.remove((java.lang.Object) 10);
        java.lang.Object obj16 = linkedListTestDriver10.removeLast();
        boolean boolean18 = linkedListTestDriver10.add((java.lang.Object) 0L);
        java.lang.Object obj21 = linkedListTestDriver10.set((int) (short) 0, (java.lang.Object) (short) 1);
        java.lang.Object obj22 = linkedListTestDriver10.removeLast();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver10);
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver24.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        int int29 = linkedListTestDriver28.size();
        java.lang.Object obj30 = linkedListTestDriver24.set(0, (java.lang.Object) linkedListTestDriver28);
        linkedListTestDriver24.addFirst((java.lang.Object) (short) 100);
        boolean boolean33 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver24);
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver34.addLast((java.lang.Object) (byte) -1);
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver34);
        java.lang.Object obj38 = linkedListTestDriver0.getFirst();
        java.lang.Object[] objArray39 = linkedListTestDriver0.toArray();
        java.lang.Object obj40 = linkedListTestDriver0.getLast();
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) -1 + "'", obj16, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0L + "'", obj21, 0L);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (short) 1 + "'", obj22, (short) 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (byte) -1 + "'", obj30, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(obj40);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test252");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean5 = linkedListTestDriver0.remove((java.lang.Object) 10);
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        java.lang.Object obj7 = linkedListTestDriver0.getLast();
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver9.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator12 = linkedListTestDriver9.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        int int14 = linkedListTestDriver13.size();
        boolean boolean16 = linkedListTestDriver13.add((java.lang.Object) 1L);
        java.lang.Object[] objArray17 = linkedListTestDriver13.toArray();
        boolean boolean18 = linkedListTestDriver9.remove((java.lang.Object) linkedListTestDriver13);
        java.lang.Object obj19 = linkedListTestDriver9.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver20.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator23 = linkedListTestDriver20.iterator();
        boolean boolean25 = linkedListTestDriver20.remove((java.lang.Object) 10);
        java.lang.Object obj26 = linkedListTestDriver20.removeLast();
        boolean boolean28 = linkedListTestDriver20.equals_CUT((java.lang.Object) '4');
        int int29 = linkedListTestDriver20.size();
        boolean boolean30 = linkedListTestDriver9.equals_CUT((java.lang.Object) linkedListTestDriver20);
        boolean boolean32 = linkedListTestDriver9.contains((java.lang.Object) 1L);
        experiment.util.LinkedListTestDriver linkedListTestDriver33 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver33.addLast((java.lang.Object) (byte) -1);
        boolean boolean37 = linkedListTestDriver33.add((java.lang.Object) 0L);
        boolean boolean39 = linkedListTestDriver33.equals_CUT((java.lang.Object) (short) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver40 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver40.addLast((java.lang.Object) (byte) -1);
        boolean boolean44 = linkedListTestDriver40.add((java.lang.Object) 0L);
        boolean boolean45 = linkedListTestDriver40.isEmpty();
        linkedListTestDriver40.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver47 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver47.addLast((java.lang.Object) (byte) -1);
        boolean boolean51 = linkedListTestDriver47.add((java.lang.Object) 0L);
        java.lang.Object obj52 = linkedListTestDriver47.getLast();
        java.lang.Object obj54 = linkedListTestDriver47.get((int) (byte) 0);
        java.lang.Object obj55 = linkedListTestDriver47.getLast();
        boolean boolean56 = linkedListTestDriver40.equals_CUT(obj55);
        experiment.util.Iterator iterator57 = linkedListTestDriver40.iterator();
        linkedListTestDriver33.addLast((java.lang.Object) linkedListTestDriver40);
        boolean boolean59 = linkedListTestDriver9.add((java.lang.Object) linkedListTestDriver33);
        boolean boolean60 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver33);
        experiment.util.LinkedListTestDriver linkedListTestDriver61 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver61.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator64 = linkedListTestDriver61.iterator();
        boolean boolean66 = linkedListTestDriver61.remove((java.lang.Object) 10);
        java.lang.Object obj67 = linkedListTestDriver61.removeLast();
        experiment.util.Iterator iterator68 = linkedListTestDriver61.iterator();
        boolean boolean69 = linkedListTestDriver33.contains((java.lang.Object) linkedListTestDriver61);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj70 = linkedListTestDriver61.getLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[1]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) -1 + "'", obj19, (byte) -1);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) -1 + "'", obj26, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 0L + "'", obj52, 0L);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + (byte) -1 + "'", obj54, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + 0L + "'", obj55, 0L);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(iterator57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(iterator64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + (byte) -1 + "'", obj67, (byte) -1);
        org.junit.Assert.assertNotNull(iterator68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test253");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) 0L);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        int int7 = linkedListTestDriver6.size();
        boolean boolean9 = linkedListTestDriver6.add((java.lang.Object) 1L);
        linkedListTestDriver0.add(0, (java.lang.Object) linkedListTestDriver6);
        experiment.util.Iterator iterator11 = linkedListTestDriver6.iterator();
        linkedListTestDriver6.addLast((java.lang.Object) '#');
        linkedListTestDriver6.addFirst((java.lang.Object) 100L);
        java.lang.Object obj16 = linkedListTestDriver6.removeFirst();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100L + "'", obj16, 100L);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test254");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator3 = linkedListTestDriver0.iterator();
        boolean boolean5 = linkedListTestDriver0.remove((java.lang.Object) 10);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        boolean boolean8 = linkedListTestDriver0.equals_CUT((java.lang.Object) '4');
        int int9 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addLast((java.lang.Object) (byte) -1);
        boolean boolean14 = linkedListTestDriver10.add((java.lang.Object) 0L);
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        int int17 = linkedListTestDriver16.size();
        boolean boolean19 = linkedListTestDriver16.add((java.lang.Object) 1L);
        linkedListTestDriver10.add(0, (java.lang.Object) linkedListTestDriver16);
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver21.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        int int26 = linkedListTestDriver25.size();
        java.lang.Object obj27 = linkedListTestDriver21.set(0, (java.lang.Object) linkedListTestDriver25);
        java.lang.Class<?> wildcardClass28 = linkedListTestDriver25.getClass();
        boolean boolean29 = linkedListTestDriver16.contains((java.lang.Object) wildcardClass28);
        boolean boolean31 = linkedListTestDriver16.add((java.lang.Object) 1L);
        experiment.util.Iterator iterator32 = linkedListTestDriver16.iterator();
        linkedListTestDriver0.addFirst((java.lang.Object) iterator32);
        int int34 = linkedListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj36 = linkedListTestDriver0.remove(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (byte) -1 + "'", obj27, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test255");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) ' ');
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver3.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        int int8 = linkedListTestDriver7.size();
        java.lang.Object obj9 = linkedListTestDriver3.set(0, (java.lang.Object) linkedListTestDriver7);
        linkedListTestDriver3.addFirst((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator15 = linkedListTestDriver12.iterator();
        linkedListTestDriver3.addLast((java.lang.Object) linkedListTestDriver12);
        boolean boolean18 = linkedListTestDriver12.contains((java.lang.Object) 0.0f);
        boolean boolean19 = linkedListTestDriver0.equals_CUT((java.lang.Object) boolean18);
        experiment.util.Iterator iterator20 = linkedListTestDriver0.iterator();
        java.lang.Object obj21 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver22.addLast((java.lang.Object) (byte) -1);
        boolean boolean26 = linkedListTestDriver22.add((java.lang.Object) 0L);
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        int int29 = linkedListTestDriver28.size();
        boolean boolean31 = linkedListTestDriver28.add((java.lang.Object) 1L);
        linkedListTestDriver22.add(0, (java.lang.Object) linkedListTestDriver28);
        boolean boolean33 = linkedListTestDriver22.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver34.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator37 = linkedListTestDriver34.iterator();
        boolean boolean38 = linkedListTestDriver22.contains((java.lang.Object) linkedListTestDriver34);
        experiment.util.LinkedListTestDriver linkedListTestDriver40 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver40.addLast((java.lang.Object) (byte) -1);
        boolean boolean44 = linkedListTestDriver40.add((java.lang.Object) 0L);
        experiment.util.LinkedListTestDriver linkedListTestDriver46 = new experiment.util.LinkedListTestDriver();
        int int47 = linkedListTestDriver46.size();
        boolean boolean49 = linkedListTestDriver46.add((java.lang.Object) 1L);
        linkedListTestDriver40.add(0, (java.lang.Object) linkedListTestDriver46);
        boolean boolean51 = linkedListTestDriver40.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver52 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver52.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator55 = linkedListTestDriver52.iterator();
        java.lang.Object[] objArray56 = linkedListTestDriver52.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver57 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver57.addLast((java.lang.Object) ' ');
        java.lang.Object[] objArray60 = linkedListTestDriver57.toArray();
        linkedListTestDriver57.addFirst((java.lang.Object) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver64 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver64.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator67 = linkedListTestDriver64.iterator();
        boolean boolean69 = linkedListTestDriver64.remove((java.lang.Object) 10);
        linkedListTestDriver57.add((int) (short) 0, (java.lang.Object) 10);
        boolean boolean71 = linkedListTestDriver52.contains((java.lang.Object) (short) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver72 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver72.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator75 = linkedListTestDriver72.iterator();
        java.lang.Object[] objArray76 = linkedListTestDriver72.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver77 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver77.addLast((java.lang.Object) ' ');
        java.lang.Object[] objArray80 = linkedListTestDriver77.toArray();
        linkedListTestDriver77.addFirst((java.lang.Object) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver84 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver84.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator87 = linkedListTestDriver84.iterator();
        boolean boolean89 = linkedListTestDriver84.remove((java.lang.Object) 10);
        linkedListTestDriver77.add((int) (short) 0, (java.lang.Object) 10);
        boolean boolean91 = linkedListTestDriver72.contains((java.lang.Object) (short) 0);
        linkedListTestDriver52.addLast((java.lang.Object) boolean91);
        java.lang.Object[] objArray93 = linkedListTestDriver52.toArray();
        java.lang.Object obj94 = linkedListTestDriver52.removeFirst();
        boolean boolean95 = linkedListTestDriver40.remove((java.lang.Object) linkedListTestDriver52);
        linkedListTestDriver34.add(0, (java.lang.Object) linkedListTestDriver40);
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver34);
        java.lang.Object[] objArray98 = linkedListTestDriver34.toArray();
        java.lang.Class<?> wildcardClass99 = objArray98.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + ' ' + "'", obj21, ' ');
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(iterator55);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[-1]");
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[ ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[ ]");
        org.junit.Assert.assertNotNull(iterator67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(iterator75);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray76), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray76), "[-1]");
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray80), "[ ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray80), "[ ]");
        org.junit.Assert.assertNotNull(iterator87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(objArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray93), "[-1, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray93), "[-1, false]");
        org.junit.Assert.assertEquals("'" + obj94 + "' != '" + (byte) -1 + "'", obj94, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNotNull(objArray98);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_379375655_1024_0.test256");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedListTestDriver0.add((java.lang.Object) 0L);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        int int7 = linkedListTestDriver6.size();
        boolean boolean9 = linkedListTestDriver6.add((java.lang.Object) 1L);
        linkedListTestDriver0.add(0, (java.lang.Object) linkedListTestDriver6);
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        int int16 = linkedListTestDriver15.size();
        java.lang.Object obj17 = linkedListTestDriver11.set(0, (java.lang.Object) linkedListTestDriver15);
        java.lang.Class<?> wildcardClass18 = linkedListTestDriver15.getClass();
        boolean boolean19 = linkedListTestDriver6.contains((java.lang.Object) wildcardClass18);
        boolean boolean21 = linkedListTestDriver6.add((java.lang.Object) 1L);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        int int23 = linkedListTestDriver22.size();
        boolean boolean25 = linkedListTestDriver22.add((java.lang.Object) 1L);
        java.lang.Object[] objArray26 = linkedListTestDriver22.toArray();
        boolean boolean27 = linkedListTestDriver6.equals_CUT((java.lang.Object) objArray26);
        experiment.util.Iterator iterator28 = linkedListTestDriver6.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver29.addLast((java.lang.Object) ' ');
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver32.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver36 = new experiment.util.LinkedListTestDriver();
        int int37 = linkedListTestDriver36.size();
        java.lang.Object obj38 = linkedListTestDriver32.set(0, (java.lang.Object) linkedListTestDriver36);
        linkedListTestDriver32.addFirst((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver41 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver41.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator44 = linkedListTestDriver41.iterator();
        linkedListTestDriver32.addLast((java.lang.Object) linkedListTestDriver41);
        boolean boolean47 = linkedListTestDriver41.contains((java.lang.Object) 0.0f);
        boolean boolean48 = linkedListTestDriver29.equals_CUT((java.lang.Object) boolean47);
        experiment.util.LinkedListTestDriver linkedListTestDriver49 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver49.addLast((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver52 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver52.addLast((java.lang.Object) (byte) -1);
        boolean boolean56 = linkedListTestDriver52.add((java.lang.Object) 0L);
        experiment.util.LinkedListTestDriver linkedListTestDriver58 = new experiment.util.LinkedListTestDriver();
        int int59 = linkedListTestDriver58.size();
        boolean boolean61 = linkedListTestDriver58.add((java.lang.Object) 1L);
        linkedListTestDriver52.add(0, (java.lang.Object) linkedListTestDriver58);
        experiment.util.LinkedListTestDriver linkedListTestDriver63 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver63.addLast((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator66 = linkedListTestDriver63.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver67 = new experiment.util.LinkedListTestDriver();
        int int68 = linkedListTestDriver67.size();
        boolean boolean70 = linkedListTestDriver67.add((java.lang.Object) 1L);
        java.lang.Object[] objArray71 = linkedListTestDriver67.toArray();
        boolean boolean72 = linkedListTestDriver63.remove((java.lang.Object) linkedListTestDriver67);
        java.lang.Object obj73 = linkedListTestDriver63.getLast();
        boolean boolean74 = linkedListTestDriver58.contains((java.lang.Object) linkedListTestDriver63);
        boolean boolean75 = linkedListTestDriver63.isEmpty();
        boolean boolean76 = linkedListTestDriver49.remove((java.lang.Object) boolean75);
        boolean boolean77 = linkedListTestDriver29.contains((java.lang.Object) linkedListTestDriver49);
        experiment.util.LinkedListTestDriver linkedListTestDriver78 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver78.addLast((java.lang.Object) (byte) -1);
        boolean boolean82 = linkedListTestDriver78.add((java.lang.Object) 0L);
        boolean boolean84 = linkedListTestDriver78.equals_CUT((java.lang.Object) (short) 10);
        linkedListTestDriver29.addLast((java.lang.Object) linkedListTestDriver78);
        linkedListTestDriver6.addLast((java.lang.Object) linkedListTestDriver78);
        java.lang.Object obj87 = linkedListTestDriver6.getFirst();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[1]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (byte) -1 + "'", obj38, (byte) -1);
        org.junit.Assert.assertNotNull(iterator44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(iterator66);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[1]");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + obj73 + "' != '" + (byte) -1 + "'", obj73, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertEquals("'" + obj87 + "' != '" + 1L + "'", obj87, 1L);
    }

}
