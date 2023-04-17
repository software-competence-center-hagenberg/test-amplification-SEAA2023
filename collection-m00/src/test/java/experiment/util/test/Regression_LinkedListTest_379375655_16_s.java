package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_LinkedListTest_379375655_16_s {

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

}
