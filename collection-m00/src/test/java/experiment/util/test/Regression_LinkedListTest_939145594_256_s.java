package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_LinkedListTest_939145594_256_s {

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
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test001");
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
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test002");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = linkedListTestDriver0.set((-1), (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test003");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.clear();
        boolean boolean3 = linkedListTestDriver0.remove((java.lang.Object) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test004");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) "hi!");
        java.lang.Object obj3 = linkedListTestDriver0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = linkedListTestDriver0.remove((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "hi!" + "'", obj3, "hi!");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test005");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) "hi!");
        java.lang.Object obj3 = linkedListTestDriver0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = linkedListTestDriver0.getLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "hi!" + "'", obj3, "hi!");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test006");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.clear();
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = linkedListTestDriver0.remove(obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test007");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator2 = linkedListTestDriver0.listIterator(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 1; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test008");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) "hi!");
        java.lang.Object obj3 = linkedListTestDriver0.removeLast();
        linkedListTestDriver0.addLast((java.lang.Object) '#');
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator7 = linkedListTestDriver0.listIterator((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 35; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "hi!" + "'", obj3, "hi!");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test009");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator4 = linkedListTestDriver0.listIterator((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 32; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test010");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        int int6 = linkedListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = linkedListTestDriver0.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test011");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) "hi!");
        java.lang.Object obj3 = linkedListTestDriver0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = linkedListTestDriver0.get(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "hi!" + "'", obj3, "hi!");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test012");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) "hi!");
        java.lang.Object obj3 = linkedListTestDriver0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = linkedListTestDriver0.set((int) (byte) 100, (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "hi!" + "'", obj3, "hi!");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test013");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) "hi!");
        java.lang.Object obj3 = linkedListTestDriver0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = linkedListTestDriver0.get((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "hi!" + "'", obj3, "hi!");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test014");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray6 = linkedListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = linkedListTestDriver0.set((int) (byte) 1, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test015");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj7 = new java.lang.Object();
        linkedListTestDriver4.addFirst(obj7);
        experiment.util.Iterator iterator9 = linkedListTestDriver4.iterator();
        java.lang.Object[] objArray10 = linkedListTestDriver4.toArray();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add(10, (java.lang.Object) objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test016");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray6 = linkedListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = linkedListTestDriver0.get((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test017");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) "hi!");
        java.lang.Object obj3 = linkedListTestDriver0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = linkedListTestDriver0.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "hi!" + "'", obj3, "hi!");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test018");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) "hi!");
        java.lang.Object obj3 = linkedListTestDriver0.removeFirst();
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = linkedListTestDriver0.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "hi!" + "'", obj3, "hi!");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test019");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = new java.lang.Object();
        linkedListTestDriver7.addFirst(obj10);
        experiment.util.Iterator iterator12 = linkedListTestDriver7.iterator();
        boolean boolean13 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver7);
        java.lang.Object obj14 = linkedListTestDriver7.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        boolean boolean17 = linkedListTestDriver15.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = new java.lang.Object();
        linkedListTestDriver15.addFirst(obj18);
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        boolean boolean22 = linkedListTestDriver20.add((java.lang.Object) "hi!");
        java.lang.Object obj23 = linkedListTestDriver20.removeLast();
        linkedListTestDriver20.addLast((java.lang.Object) '#');
        linkedListTestDriver15.addLast((java.lang.Object) linkedListTestDriver20);
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        boolean boolean30 = linkedListTestDriver28.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj31 = new java.lang.Object();
        linkedListTestDriver28.addFirst(obj31);
        experiment.util.Iterator iterator33 = linkedListTestDriver28.iterator();
        java.lang.Object[] objArray34 = linkedListTestDriver28.toArray();
        linkedListTestDriver20.add((int) (byte) 1, (java.lang.Object) linkedListTestDriver28);
        boolean boolean36 = linkedListTestDriver7.contains((java.lang.Object) linkedListTestDriver20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj38 = linkedListTestDriver7.remove((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "hi!" + "'", obj23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test020");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) "hi!");
        java.lang.Object obj8 = linkedListTestDriver5.removeLast();
        linkedListTestDriver5.addLast((java.lang.Object) '#');
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj16 = new java.lang.Object();
        linkedListTestDriver13.addFirst(obj16);
        experiment.util.Iterator iterator18 = linkedListTestDriver13.iterator();
        java.lang.Object[] objArray19 = linkedListTestDriver13.toArray();
        linkedListTestDriver5.add((int) (byte) 1, (java.lang.Object) linkedListTestDriver13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = linkedListTestDriver13.remove((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test021");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray6 = linkedListTestDriver0.toArray();
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = linkedListTestDriver0.add(obj7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test022");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray6 = linkedListTestDriver0.toArray();
        java.lang.Object obj7 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add(10, (java.lang.Object) linkedListTestDriver9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test023");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) "hi!");
        java.lang.Object obj3 = linkedListTestDriver0.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = new java.lang.Object();
        linkedListTestDriver5.addFirst(obj8);
        java.lang.Object obj10 = linkedListTestDriver5.getLast();
        boolean boolean11 = linkedListTestDriver5.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = linkedListTestDriver0.set(2, (java.lang.Object) boolean11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "hi!" + "'", obj3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test024");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = new java.lang.Object();
        linkedListTestDriver7.addFirst(obj10);
        experiment.util.Iterator iterator12 = linkedListTestDriver7.iterator();
        boolean boolean13 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver7);
        java.lang.Object obj14 = linkedListTestDriver7.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        boolean boolean18 = linkedListTestDriver16.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj19 = new java.lang.Object();
        linkedListTestDriver16.addFirst(obj19);
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        boolean boolean23 = linkedListTestDriver21.add((java.lang.Object) "hi!");
        java.lang.Object obj24 = linkedListTestDriver21.removeLast();
        linkedListTestDriver21.addLast((java.lang.Object) '#');
        linkedListTestDriver16.addLast((java.lang.Object) linkedListTestDriver21);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver7.add(100, (java.lang.Object) linkedListTestDriver16);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 100; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "hi!" + "'", obj24, "hi!");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test025");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = linkedListTestDriver0.remove((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test026");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = new java.lang.Object();
        linkedListTestDriver7.addFirst(obj10);
        experiment.util.Iterator iterator12 = linkedListTestDriver7.iterator();
        boolean boolean13 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver7);
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) (short) -1, (java.lang.Object) linkedListTestDriver15);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test027");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = new java.lang.Object();
        linkedListTestDriver7.addFirst(obj10);
        experiment.util.Iterator iterator12 = linkedListTestDriver7.iterator();
        boolean boolean13 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver7);
        linkedListTestDriver7.add((int) (byte) 1, (java.lang.Object) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver7.add((int) '4', (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 52; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test028");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver5.clear();
        boolean boolean8 = linkedListTestDriver5.remove((java.lang.Object) (byte) 0);
        boolean boolean9 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        boolean boolean12 = linkedListTestDriver10.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj13 = new java.lang.Object();
        linkedListTestDriver10.addFirst(obj13);
        java.lang.Object obj15 = linkedListTestDriver10.getLast();
        boolean boolean16 = linkedListTestDriver10.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        boolean boolean19 = linkedListTestDriver17.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj20 = new java.lang.Object();
        linkedListTestDriver17.addFirst(obj20);
        experiment.util.Iterator iterator22 = linkedListTestDriver17.iterator();
        boolean boolean23 = linkedListTestDriver10.add((java.lang.Object) linkedListTestDriver17);
        linkedListTestDriver5.addFirst((java.lang.Object) linkedListTestDriver10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = linkedListTestDriver10.get((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test029");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = new java.lang.Object();
        linkedListTestDriver7.addFirst(obj10);
        experiment.util.Iterator iterator12 = linkedListTestDriver7.iterator();
        boolean boolean13 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver7);
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        boolean boolean16 = linkedListTestDriver14.add((java.lang.Object) "hi!");
        java.lang.Object obj17 = linkedListTestDriver14.removeFirst();
        boolean boolean18 = linkedListTestDriver7.contains((java.lang.Object) linkedListTestDriver14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = linkedListTestDriver14.set(10, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "hi!" + "'", obj17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test030");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) "hi!");
        java.lang.Object obj3 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj7 = new java.lang.Object();
        linkedListTestDriver4.addFirst(obj7);
        java.lang.Object obj9 = linkedListTestDriver4.getLast();
        boolean boolean10 = linkedListTestDriver4.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver11.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj14 = new java.lang.Object();
        linkedListTestDriver11.addFirst(obj14);
        experiment.util.Iterator iterator16 = linkedListTestDriver11.iterator();
        boolean boolean17 = linkedListTestDriver4.add((java.lang.Object) linkedListTestDriver11);
        java.lang.Object obj18 = linkedListTestDriver11.removeFirst();
        java.lang.Object[] objArray19 = linkedListTestDriver11.toArray();
        boolean boolean20 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "hi!" + "'", obj3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test031");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) "hi!");
        java.lang.Object obj8 = linkedListTestDriver5.removeLast();
        linkedListTestDriver5.addLast((java.lang.Object) '#');
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj16 = new java.lang.Object();
        linkedListTestDriver13.addFirst(obj16);
        experiment.util.Iterator iterator18 = linkedListTestDriver13.iterator();
        java.lang.Object[] objArray19 = linkedListTestDriver13.toArray();
        linkedListTestDriver5.add((int) (byte) 1, (java.lang.Object) linkedListTestDriver13);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        boolean boolean24 = linkedListTestDriver22.add((java.lang.Object) "hi!");
        java.lang.Object obj25 = linkedListTestDriver22.removeLast();
        linkedListTestDriver22.addLast((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        boolean boolean30 = linkedListTestDriver28.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj31 = new java.lang.Object();
        linkedListTestDriver28.addFirst(obj31);
        experiment.util.LinkedListTestDriver linkedListTestDriver33 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver33.clear();
        boolean boolean36 = linkedListTestDriver33.remove((java.lang.Object) (byte) 0);
        boolean boolean37 = linkedListTestDriver28.contains((java.lang.Object) linkedListTestDriver33);
        boolean boolean38 = linkedListTestDriver22.equals_CUT((java.lang.Object) linkedListTestDriver33);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver5.add((int) (byte) 100, (java.lang.Object) boolean38);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 100; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "hi!" + "'", obj25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test032");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) "hi!");
        java.lang.Object obj8 = linkedListTestDriver5.removeLast();
        linkedListTestDriver5.addLast((java.lang.Object) '#');
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj16 = new java.lang.Object();
        linkedListTestDriver13.addFirst(obj16);
        java.lang.Object obj18 = linkedListTestDriver13.getLast();
        boolean boolean19 = linkedListTestDriver13.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        boolean boolean22 = linkedListTestDriver20.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj23 = new java.lang.Object();
        linkedListTestDriver20.addFirst(obj23);
        experiment.util.Iterator iterator25 = linkedListTestDriver20.iterator();
        boolean boolean26 = linkedListTestDriver13.add((java.lang.Object) linkedListTestDriver20);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) (byte) 10, (java.lang.Object) linkedListTestDriver20);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test033");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = linkedListTestDriver0.getLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test034");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray6 = linkedListTestDriver0.toArray();
        java.lang.Object obj7 = linkedListTestDriver0.getFirst();
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        java.lang.Object obj9 = linkedListTestDriver0.getFirst();
        java.lang.Object obj10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = linkedListTestDriver0.equals_CUT(obj10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test035");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = new java.lang.Object();
        linkedListTestDriver7.addFirst(obj10);
        experiment.util.Iterator iterator12 = linkedListTestDriver7.iterator();
        boolean boolean13 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver7);
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        boolean boolean16 = linkedListTestDriver14.add((java.lang.Object) "hi!");
        java.lang.Object obj17 = linkedListTestDriver14.removeFirst();
        boolean boolean18 = linkedListTestDriver7.contains((java.lang.Object) linkedListTestDriver14);
        java.lang.Object obj20 = null;
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver14.add(0, obj20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "hi!" + "'", obj17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test036");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) "hi!");
        java.lang.Object obj8 = linkedListTestDriver5.removeLast();
        linkedListTestDriver5.addLast((java.lang.Object) '#');
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        boolean boolean14 = linkedListTestDriver12.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj15 = new java.lang.Object();
        linkedListTestDriver12.addFirst(obj15);
        experiment.util.Iterator iterator17 = linkedListTestDriver12.iterator();
        java.lang.Object[] objArray18 = linkedListTestDriver12.toArray();
        java.lang.Object obj19 = linkedListTestDriver12.getFirst();
        experiment.util.Iterator iterator20 = linkedListTestDriver12.iterator();
        java.lang.Object obj21 = linkedListTestDriver12.getFirst();
        boolean boolean22 = linkedListTestDriver5.add((java.lang.Object) linkedListTestDriver12);
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        boolean boolean26 = linkedListTestDriver24.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj27 = new java.lang.Object();
        linkedListTestDriver24.addFirst(obj27);
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        boolean boolean31 = linkedListTestDriver29.add((java.lang.Object) "hi!");
        java.lang.Object obj32 = linkedListTestDriver29.removeLast();
        linkedListTestDriver29.addLast((java.lang.Object) '#');
        linkedListTestDriver24.addLast((java.lang.Object) linkedListTestDriver29);
        java.lang.Object obj36 = linkedListTestDriver24.getLast();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver5.add(10, obj36);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + "hi!" + "'", obj32, "hi!");
        org.junit.Assert.assertNotNull(obj36);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test037");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.clear();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) (short) 1);
        int int4 = linkedListTestDriver0.size();
        java.lang.Object obj6 = linkedListTestDriver0.remove((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = linkedListTestDriver0.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test038");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray6 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = new java.lang.Object();
        linkedListTestDriver7.addFirst(obj10);
        java.lang.Object obj12 = linkedListTestDriver7.getLast();
        boolean boolean13 = linkedListTestDriver7.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        boolean boolean16 = linkedListTestDriver14.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj17 = new java.lang.Object();
        linkedListTestDriver14.addFirst(obj17);
        experiment.util.Iterator iterator19 = linkedListTestDriver14.iterator();
        boolean boolean20 = linkedListTestDriver7.add((java.lang.Object) linkedListTestDriver14);
        boolean boolean21 = linkedListTestDriver0.contains((java.lang.Object) boolean20);
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver23.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        boolean boolean27 = linkedListTestDriver25.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj28 = new java.lang.Object();
        linkedListTestDriver25.addFirst(obj28);
        java.lang.Object obj30 = linkedListTestDriver25.getLast();
        boolean boolean31 = linkedListTestDriver25.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        boolean boolean34 = linkedListTestDriver32.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj35 = new java.lang.Object();
        linkedListTestDriver32.addFirst(obj35);
        experiment.util.Iterator iterator37 = linkedListTestDriver32.iterator();
        boolean boolean38 = linkedListTestDriver25.add((java.lang.Object) linkedListTestDriver32);
        linkedListTestDriver32.add((int) (byte) 1, (java.lang.Object) (-1.0d));
        linkedListTestDriver23.addFirst((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver43 = new experiment.util.LinkedListTestDriver();
        boolean boolean45 = linkedListTestDriver43.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj46 = new java.lang.Object();
        linkedListTestDriver43.addFirst(obj46);
        experiment.util.LinkedListTestDriver linkedListTestDriver48 = new experiment.util.LinkedListTestDriver();
        boolean boolean50 = linkedListTestDriver48.add((java.lang.Object) "hi!");
        java.lang.Object obj51 = linkedListTestDriver48.removeLast();
        linkedListTestDriver48.addLast((java.lang.Object) '#');
        linkedListTestDriver43.addLast((java.lang.Object) linkedListTestDriver48);
        experiment.util.LinkedListTestDriver linkedListTestDriver55 = new experiment.util.LinkedListTestDriver();
        boolean boolean57 = linkedListTestDriver55.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj58 = new java.lang.Object();
        linkedListTestDriver55.addFirst(obj58);
        experiment.util.Iterator iterator60 = linkedListTestDriver55.iterator();
        java.lang.Object[] objArray61 = linkedListTestDriver55.toArray();
        java.lang.Object obj62 = linkedListTestDriver55.getFirst();
        linkedListTestDriver48.addLast((java.lang.Object) linkedListTestDriver55);
        experiment.util.LinkedListTestDriver linkedListTestDriver64 = new experiment.util.LinkedListTestDriver();
        boolean boolean66 = linkedListTestDriver64.add((java.lang.Object) "hi!");
        linkedListTestDriver48.addLast((java.lang.Object) linkedListTestDriver64);
        boolean boolean68 = linkedListTestDriver23.remove((java.lang.Object) linkedListTestDriver64);
        java.lang.Object obj69 = linkedListTestDriver23.getFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj70 = linkedListTestDriver0.set((int) 'a', (java.lang.Object) linkedListTestDriver23);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + "hi!" + "'", obj51, "hi!");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(iterator60);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + (byte) 1 + "'", obj69, (byte) 1);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test039");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = new java.lang.Object();
        linkedListTestDriver7.addFirst(obj10);
        experiment.util.Iterator iterator12 = linkedListTestDriver7.iterator();
        boolean boolean13 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver7);
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        boolean boolean16 = linkedListTestDriver14.add((java.lang.Object) "hi!");
        java.lang.Object obj17 = linkedListTestDriver14.removeFirst();
        boolean boolean18 = linkedListTestDriver7.contains((java.lang.Object) linkedListTestDriver14);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator20 = linkedListTestDriver14.listIterator((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "hi!" + "'", obj17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test040");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.clear();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) (short) 1);
        int int4 = linkedListTestDriver0.size();
        java.lang.Object obj6 = linkedListTestDriver0.remove((int) (byte) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        boolean boolean10 = linkedListTestDriver8.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj11 = new java.lang.Object();
        linkedListTestDriver8.addFirst(obj11);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.add((java.lang.Object) "hi!");
        java.lang.Object obj16 = linkedListTestDriver13.removeLast();
        linkedListTestDriver13.addLast((java.lang.Object) '#');
        linkedListTestDriver8.addLast((java.lang.Object) linkedListTestDriver13);
        boolean boolean21 = linkedListTestDriver8.remove((java.lang.Object) 10);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) 'a', (java.lang.Object) linkedListTestDriver8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 97; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "hi!" + "'", obj16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test041");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.clear();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) (short) 1);
        int int4 = linkedListTestDriver0.size();
        java.lang.Object obj6 = linkedListTestDriver0.remove((int) (byte) 0);
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test042");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) "hi!");
        java.lang.Object obj8 = linkedListTestDriver5.removeLast();
        linkedListTestDriver5.addLast((java.lang.Object) '#');
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        boolean boolean13 = linkedListTestDriver0.remove((java.lang.Object) 10);
        boolean boolean15 = linkedListTestDriver0.equals_CUT((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        boolean boolean19 = linkedListTestDriver17.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj20 = new java.lang.Object();
        linkedListTestDriver17.addFirst(obj20);
        experiment.util.Iterator iterator22 = linkedListTestDriver17.iterator();
        java.lang.Object[] objArray23 = linkedListTestDriver17.toArray();
        java.lang.Object obj24 = linkedListTestDriver17.getFirst();
        experiment.util.Iterator iterator25 = linkedListTestDriver17.iterator();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) '4', (java.lang.Object) iterator25);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 52; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(iterator25);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test043");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) "hi!");
        java.lang.Object obj8 = linkedListTestDriver5.removeLast();
        linkedListTestDriver5.addLast((java.lang.Object) '#');
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj16 = new java.lang.Object();
        linkedListTestDriver13.addFirst(obj16);
        experiment.util.Iterator iterator18 = linkedListTestDriver13.iterator();
        java.lang.Object[] objArray19 = linkedListTestDriver13.toArray();
        linkedListTestDriver5.add((int) (byte) 1, (java.lang.Object) linkedListTestDriver13);
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        boolean boolean23 = linkedListTestDriver21.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj24 = new java.lang.Object();
        linkedListTestDriver21.addFirst(obj24);
        experiment.util.Iterator iterator26 = linkedListTestDriver21.iterator();
        java.lang.Object[] objArray27 = linkedListTestDriver21.toArray();
        java.lang.Object obj28 = linkedListTestDriver21.getFirst();
        experiment.util.Iterator iterator29 = linkedListTestDriver21.iterator();
        boolean boolean30 = linkedListTestDriver5.contains((java.lang.Object) iterator29);
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        boolean boolean34 = linkedListTestDriver32.add((java.lang.Object) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = linkedListTestDriver5.set((-1), (java.lang.Object) linkedListTestDriver32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test044");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) "hi!");
        java.lang.Object obj3 = linkedListTestDriver0.removeLast();
        linkedListTestDriver0.addLast((java.lang.Object) '#');
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) '#', (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 35; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "hi!" + "'", obj3, "hi!");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test045");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) "hi!");
        java.lang.Object obj3 = linkedListTestDriver0.removeLast();
        linkedListTestDriver0.addLast((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj9 = new java.lang.Object();
        linkedListTestDriver6.addFirst(obj9);
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.clear();
        boolean boolean14 = linkedListTestDriver11.remove((java.lang.Object) (byte) 0);
        boolean boolean15 = linkedListTestDriver6.contains((java.lang.Object) linkedListTestDriver11);
        boolean boolean16 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver11);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        boolean boolean19 = linkedListTestDriver17.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj20 = new java.lang.Object();
        linkedListTestDriver17.addFirst(obj20);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver22.clear();
        boolean boolean25 = linkedListTestDriver22.remove((java.lang.Object) (byte) 0);
        boolean boolean26 = linkedListTestDriver17.contains((java.lang.Object) linkedListTestDriver22);
        boolean boolean27 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver17);
        java.lang.Object[] objArray28 = linkedListTestDriver0.toArray();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "hi!" + "'", obj3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[#]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[#]");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test046");
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
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test047");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) 'a', (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 97; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test048");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray6 = linkedListTestDriver0.toArray();
        java.lang.Object obj7 = linkedListTestDriver0.getFirst();
        linkedListTestDriver0.addLast((java.lang.Object) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator11 = linkedListTestDriver0.listIterator((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 52; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test049");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) "hi!");
        java.lang.Object obj8 = linkedListTestDriver5.removeLast();
        linkedListTestDriver5.addLast((java.lang.Object) '#');
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        boolean boolean13 = linkedListTestDriver0.remove((java.lang.Object) 10);
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = linkedListTestDriver0.getLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test050");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        int int6 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        boolean boolean10 = linkedListTestDriver8.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj11 = new java.lang.Object();
        linkedListTestDriver8.addFirst(obj11);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver13.clear();
        boolean boolean16 = linkedListTestDriver13.remove((java.lang.Object) (byte) 0);
        boolean boolean17 = linkedListTestDriver8.contains((java.lang.Object) linkedListTestDriver13);
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver18.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj21 = new java.lang.Object();
        linkedListTestDriver18.addFirst(obj21);
        java.lang.Object obj23 = linkedListTestDriver18.getLast();
        boolean boolean24 = linkedListTestDriver18.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        boolean boolean27 = linkedListTestDriver25.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj28 = new java.lang.Object();
        linkedListTestDriver25.addFirst(obj28);
        experiment.util.Iterator iterator30 = linkedListTestDriver25.iterator();
        boolean boolean31 = linkedListTestDriver18.add((java.lang.Object) linkedListTestDriver25);
        linkedListTestDriver13.addFirst((java.lang.Object) linkedListTestDriver18);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) (short) 100, (java.lang.Object) linkedListTestDriver13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 100; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test051");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = new java.lang.Object();
        linkedListTestDriver7.addFirst(obj10);
        experiment.util.Iterator iterator12 = linkedListTestDriver7.iterator();
        boolean boolean13 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver7);
        java.lang.Object obj14 = linkedListTestDriver7.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        boolean boolean17 = linkedListTestDriver15.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = new java.lang.Object();
        linkedListTestDriver15.addFirst(obj18);
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        boolean boolean22 = linkedListTestDriver20.add((java.lang.Object) "hi!");
        java.lang.Object obj23 = linkedListTestDriver20.removeLast();
        linkedListTestDriver20.addLast((java.lang.Object) '#');
        linkedListTestDriver15.addLast((java.lang.Object) linkedListTestDriver20);
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        boolean boolean30 = linkedListTestDriver28.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj31 = new java.lang.Object();
        linkedListTestDriver28.addFirst(obj31);
        experiment.util.Iterator iterator33 = linkedListTestDriver28.iterator();
        java.lang.Object[] objArray34 = linkedListTestDriver28.toArray();
        linkedListTestDriver20.add((int) (byte) 1, (java.lang.Object) linkedListTestDriver28);
        boolean boolean36 = linkedListTestDriver7.contains((java.lang.Object) linkedListTestDriver20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj37 = linkedListTestDriver7.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "hi!" + "'", obj23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test052");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray6 = linkedListTestDriver0.toArray();
        java.lang.Object obj7 = linkedListTestDriver0.getFirst();
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        java.lang.Object obj9 = linkedListTestDriver0.getFirst();
        java.lang.Object obj10 = linkedListTestDriver0.removeFirst();
        boolean boolean11 = linkedListTestDriver0.isEmpty();
        experiment.util.Iterator iterator12 = linkedListTestDriver0.iterator();
        linkedListTestDriver0.addFirst((java.lang.Object) (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test053");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.clear();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) (short) 1);
        int int4 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj9 = new java.lang.Object();
        linkedListTestDriver6.addFirst(obj9);
        java.lang.Object obj11 = linkedListTestDriver6.getLast();
        boolean boolean12 = linkedListTestDriver6.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj16 = new java.lang.Object();
        linkedListTestDriver13.addFirst(obj16);
        experiment.util.Iterator iterator18 = linkedListTestDriver13.iterator();
        boolean boolean19 = linkedListTestDriver6.add((java.lang.Object) linkedListTestDriver13);
        java.lang.Object obj20 = linkedListTestDriver13.removeFirst();
        java.lang.Object[] objArray21 = linkedListTestDriver13.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = linkedListTestDriver0.set((int) (short) 100, (java.lang.Object) linkedListTestDriver13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test054");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray6 = linkedListTestDriver0.toArray();
        java.lang.Object obj7 = linkedListTestDriver0.getFirst();
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        java.lang.Object obj9 = linkedListTestDriver0.getFirst();
        boolean boolean11 = linkedListTestDriver0.contains((java.lang.Object) 100.0d);
        java.lang.Object obj12 = linkedListTestDriver0.getFirst();
        experiment.util.Iterator iterator13 = linkedListTestDriver0.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(iterator13);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test055");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = new java.lang.Object();
        linkedListTestDriver7.addFirst(obj10);
        experiment.util.Iterator iterator12 = linkedListTestDriver7.iterator();
        boolean boolean13 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver7);
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        boolean boolean16 = linkedListTestDriver14.add((java.lang.Object) "hi!");
        java.lang.Object obj17 = linkedListTestDriver14.removeFirst();
        boolean boolean18 = linkedListTestDriver7.contains((java.lang.Object) linkedListTestDriver14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = linkedListTestDriver14.get((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "hi!" + "'", obj17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test056");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) "hi!");
        java.lang.Object obj8 = linkedListTestDriver5.removeLast();
        linkedListTestDriver5.addLast((java.lang.Object) '#');
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj16 = new java.lang.Object();
        linkedListTestDriver13.addFirst(obj16);
        experiment.util.Iterator iterator18 = linkedListTestDriver13.iterator();
        java.lang.Object[] objArray19 = linkedListTestDriver13.toArray();
        linkedListTestDriver5.add((int) (byte) 1, (java.lang.Object) linkedListTestDriver13);
        java.lang.Object obj22 = linkedListTestDriver5.get(1);
        java.lang.Class<?> wildcardClass23 = linkedListTestDriver5.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test057");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 100L);
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
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test058");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray6 = linkedListTestDriver0.toArray();
        java.lang.Object obj7 = linkedListTestDriver0.getFirst();
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        java.lang.Object obj9 = linkedListTestDriver0.getFirst();
        java.lang.Object obj10 = linkedListTestDriver0.removeFirst();
        boolean boolean11 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        boolean boolean14 = linkedListTestDriver12.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj15 = new java.lang.Object();
        linkedListTestDriver12.addFirst(obj15);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        boolean boolean19 = linkedListTestDriver17.add((java.lang.Object) "hi!");
        java.lang.Object obj20 = linkedListTestDriver17.removeLast();
        linkedListTestDriver17.addLast((java.lang.Object) '#');
        linkedListTestDriver12.addLast((java.lang.Object) linkedListTestDriver17);
        boolean boolean24 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = linkedListTestDriver0.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "hi!" + "'", obj20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test059");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        boolean boolean4 = linkedListTestDriver2.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj5 = new java.lang.Object();
        linkedListTestDriver2.addFirst(obj5);
        java.lang.Object obj7 = linkedListTestDriver2.getLast();
        boolean boolean8 = linkedListTestDriver2.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj12 = new java.lang.Object();
        linkedListTestDriver9.addFirst(obj12);
        experiment.util.Iterator iterator14 = linkedListTestDriver9.iterator();
        boolean boolean15 = linkedListTestDriver2.add((java.lang.Object) linkedListTestDriver9);
        linkedListTestDriver9.add((int) (byte) 1, (java.lang.Object) (-1.0d));
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        boolean boolean22 = linkedListTestDriver20.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj23 = new java.lang.Object();
        linkedListTestDriver20.addFirst(obj23);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        boolean boolean27 = linkedListTestDriver25.add((java.lang.Object) "hi!");
        java.lang.Object obj28 = linkedListTestDriver25.removeLast();
        linkedListTestDriver25.addLast((java.lang.Object) '#');
        linkedListTestDriver20.addLast((java.lang.Object) linkedListTestDriver25);
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        boolean boolean34 = linkedListTestDriver32.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj35 = new java.lang.Object();
        linkedListTestDriver32.addFirst(obj35);
        experiment.util.Iterator iterator37 = linkedListTestDriver32.iterator();
        java.lang.Object[] objArray38 = linkedListTestDriver32.toArray();
        java.lang.Object obj39 = linkedListTestDriver32.getFirst();
        linkedListTestDriver25.addLast((java.lang.Object) linkedListTestDriver32);
        experiment.util.LinkedListTestDriver linkedListTestDriver41 = new experiment.util.LinkedListTestDriver();
        boolean boolean43 = linkedListTestDriver41.add((java.lang.Object) "hi!");
        linkedListTestDriver25.addLast((java.lang.Object) linkedListTestDriver41);
        boolean boolean45 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver41);
        experiment.util.LinkedListTestDriver linkedListTestDriver46 = new experiment.util.LinkedListTestDriver();
        boolean boolean48 = linkedListTestDriver46.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj49 = new java.lang.Object();
        linkedListTestDriver46.addFirst(obj49);
        experiment.util.Iterator iterator51 = linkedListTestDriver46.iterator();
        java.lang.Object[] objArray52 = linkedListTestDriver46.toArray();
        java.lang.Object obj53 = linkedListTestDriver46.getFirst();
        boolean boolean54 = linkedListTestDriver41.equals_CUT((java.lang.Object) linkedListTestDriver46);
        linkedListTestDriver41.clear();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "hi!" + "'", obj28, "hi!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(iterator51);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test060");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 100L);
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        boolean boolean5 = linkedListTestDriver3.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj6 = new java.lang.Object();
        linkedListTestDriver3.addFirst(obj6);
        experiment.util.Iterator iterator8 = linkedListTestDriver3.iterator();
        java.lang.Object[] objArray9 = linkedListTestDriver3.toArray();
        java.lang.Class<?> wildcardClass10 = objArray9.getClass();
        boolean boolean11 = linkedListTestDriver0.equals_CUT((java.lang.Object) objArray9);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator13 = linkedListTestDriver0.listIterator((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test061");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver5.clear();
        boolean boolean8 = linkedListTestDriver5.remove((java.lang.Object) (byte) 0);
        boolean boolean9 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = linkedListTestDriver0.get((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test062");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 100L);
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        boolean boolean5 = linkedListTestDriver3.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj6 = new java.lang.Object();
        linkedListTestDriver3.addFirst(obj6);
        experiment.util.Iterator iterator8 = linkedListTestDriver3.iterator();
        java.lang.Object[] objArray9 = linkedListTestDriver3.toArray();
        java.lang.Class<?> wildcardClass10 = objArray9.getClass();
        boolean boolean11 = linkedListTestDriver0.equals_CUT((java.lang.Object) objArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = linkedListTestDriver0.getLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test063");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray6 = linkedListTestDriver0.toArray();
        java.lang.Object obj7 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        boolean boolean10 = linkedListTestDriver8.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj11 = new java.lang.Object();
        linkedListTestDriver8.addFirst(obj11);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver13.clear();
        boolean boolean16 = linkedListTestDriver13.remove((java.lang.Object) (byte) 0);
        boolean boolean17 = linkedListTestDriver8.contains((java.lang.Object) linkedListTestDriver13);
        java.lang.Object obj18 = linkedListTestDriver8.getFirst();
        linkedListTestDriver0.addFirst(obj18);
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver20.clear();
        boolean boolean23 = linkedListTestDriver20.add((java.lang.Object) (short) 1);
        int int24 = linkedListTestDriver20.size();
        java.lang.Object obj26 = linkedListTestDriver20.remove((int) (byte) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver27 = new experiment.util.LinkedListTestDriver();
        boolean boolean29 = linkedListTestDriver27.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj30 = new java.lang.Object();
        linkedListTestDriver27.addFirst(obj30);
        java.lang.Object obj32 = linkedListTestDriver27.getLast();
        boolean boolean33 = linkedListTestDriver27.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        boolean boolean36 = linkedListTestDriver34.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj37 = new java.lang.Object();
        linkedListTestDriver34.addFirst(obj37);
        experiment.util.Iterator iterator39 = linkedListTestDriver34.iterator();
        boolean boolean40 = linkedListTestDriver27.add((java.lang.Object) linkedListTestDriver34);
        java.lang.Object obj41 = linkedListTestDriver34.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver42 = new experiment.util.LinkedListTestDriver();
        boolean boolean44 = linkedListTestDriver42.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj45 = new java.lang.Object();
        linkedListTestDriver42.addFirst(obj45);
        experiment.util.LinkedListTestDriver linkedListTestDriver47 = new experiment.util.LinkedListTestDriver();
        boolean boolean49 = linkedListTestDriver47.add((java.lang.Object) "hi!");
        java.lang.Object obj50 = linkedListTestDriver47.removeLast();
        linkedListTestDriver47.addLast((java.lang.Object) '#');
        linkedListTestDriver42.addLast((java.lang.Object) linkedListTestDriver47);
        experiment.util.LinkedListTestDriver linkedListTestDriver55 = new experiment.util.LinkedListTestDriver();
        boolean boolean57 = linkedListTestDriver55.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj58 = new java.lang.Object();
        linkedListTestDriver55.addFirst(obj58);
        experiment.util.Iterator iterator60 = linkedListTestDriver55.iterator();
        java.lang.Object[] objArray61 = linkedListTestDriver55.toArray();
        linkedListTestDriver47.add((int) (byte) 1, (java.lang.Object) linkedListTestDriver55);
        boolean boolean63 = linkedListTestDriver34.contains((java.lang.Object) linkedListTestDriver47);
        linkedListTestDriver20.addFirst((java.lang.Object) linkedListTestDriver47);
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver47);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj67 = linkedListTestDriver0.get(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (short) 1 + "'", obj26, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + "hi!" + "'", obj50, "hi!");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(iterator60);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test064");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray6 = linkedListTestDriver0.toArray();
        java.lang.Object obj7 = linkedListTestDriver0.getFirst();
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        boolean boolean14 = linkedListTestDriver12.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj15 = new java.lang.Object();
        linkedListTestDriver12.addFirst(obj15);
        java.lang.Object obj17 = linkedListTestDriver12.getLast();
        boolean boolean18 = linkedListTestDriver12.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        boolean boolean21 = linkedListTestDriver19.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj22 = new java.lang.Object();
        linkedListTestDriver19.addFirst(obj22);
        experiment.util.Iterator iterator24 = linkedListTestDriver19.iterator();
        boolean boolean25 = linkedListTestDriver12.add((java.lang.Object) linkedListTestDriver19);
        linkedListTestDriver19.add((int) (byte) 1, (java.lang.Object) (-1.0d));
        linkedListTestDriver10.addFirst((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        boolean boolean32 = linkedListTestDriver30.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj33 = new java.lang.Object();
        linkedListTestDriver30.addFirst(obj33);
        experiment.util.LinkedListTestDriver linkedListTestDriver35 = new experiment.util.LinkedListTestDriver();
        boolean boolean37 = linkedListTestDriver35.add((java.lang.Object) "hi!");
        java.lang.Object obj38 = linkedListTestDriver35.removeLast();
        linkedListTestDriver35.addLast((java.lang.Object) '#');
        linkedListTestDriver30.addLast((java.lang.Object) linkedListTestDriver35);
        experiment.util.LinkedListTestDriver linkedListTestDriver42 = new experiment.util.LinkedListTestDriver();
        boolean boolean44 = linkedListTestDriver42.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj45 = new java.lang.Object();
        linkedListTestDriver42.addFirst(obj45);
        experiment.util.Iterator iterator47 = linkedListTestDriver42.iterator();
        java.lang.Object[] objArray48 = linkedListTestDriver42.toArray();
        java.lang.Object obj49 = linkedListTestDriver42.getFirst();
        linkedListTestDriver35.addLast((java.lang.Object) linkedListTestDriver42);
        experiment.util.LinkedListTestDriver linkedListTestDriver51 = new experiment.util.LinkedListTestDriver();
        boolean boolean53 = linkedListTestDriver51.add((java.lang.Object) "hi!");
        linkedListTestDriver35.addLast((java.lang.Object) linkedListTestDriver51);
        boolean boolean55 = linkedListTestDriver10.remove((java.lang.Object) linkedListTestDriver51);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) (short) 100, (java.lang.Object) linkedListTestDriver10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 100; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + "hi!" + "'", obj38, "hi!");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(iterator47);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test065");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray6 = linkedListTestDriver0.toArray();
        java.lang.Object obj7 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        boolean boolean10 = linkedListTestDriver8.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj11 = new java.lang.Object();
        linkedListTestDriver8.addFirst(obj11);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver13.clear();
        boolean boolean16 = linkedListTestDriver13.remove((java.lang.Object) (byte) 0);
        boolean boolean17 = linkedListTestDriver8.contains((java.lang.Object) linkedListTestDriver13);
        java.lang.Object obj18 = linkedListTestDriver8.getFirst();
        linkedListTestDriver0.addFirst(obj18);
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver20.clear();
        boolean boolean23 = linkedListTestDriver20.add((java.lang.Object) (short) 1);
        int int24 = linkedListTestDriver20.size();
        java.lang.Object obj26 = linkedListTestDriver20.remove((int) (byte) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver27 = new experiment.util.LinkedListTestDriver();
        boolean boolean29 = linkedListTestDriver27.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj30 = new java.lang.Object();
        linkedListTestDriver27.addFirst(obj30);
        java.lang.Object obj32 = linkedListTestDriver27.getLast();
        boolean boolean33 = linkedListTestDriver27.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        boolean boolean36 = linkedListTestDriver34.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj37 = new java.lang.Object();
        linkedListTestDriver34.addFirst(obj37);
        experiment.util.Iterator iterator39 = linkedListTestDriver34.iterator();
        boolean boolean40 = linkedListTestDriver27.add((java.lang.Object) linkedListTestDriver34);
        java.lang.Object obj41 = linkedListTestDriver34.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver42 = new experiment.util.LinkedListTestDriver();
        boolean boolean44 = linkedListTestDriver42.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj45 = new java.lang.Object();
        linkedListTestDriver42.addFirst(obj45);
        experiment.util.LinkedListTestDriver linkedListTestDriver47 = new experiment.util.LinkedListTestDriver();
        boolean boolean49 = linkedListTestDriver47.add((java.lang.Object) "hi!");
        java.lang.Object obj50 = linkedListTestDriver47.removeLast();
        linkedListTestDriver47.addLast((java.lang.Object) '#');
        linkedListTestDriver42.addLast((java.lang.Object) linkedListTestDriver47);
        experiment.util.LinkedListTestDriver linkedListTestDriver55 = new experiment.util.LinkedListTestDriver();
        boolean boolean57 = linkedListTestDriver55.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj58 = new java.lang.Object();
        linkedListTestDriver55.addFirst(obj58);
        experiment.util.Iterator iterator60 = linkedListTestDriver55.iterator();
        java.lang.Object[] objArray61 = linkedListTestDriver55.toArray();
        linkedListTestDriver47.add((int) (byte) 1, (java.lang.Object) linkedListTestDriver55);
        boolean boolean63 = linkedListTestDriver34.contains((java.lang.Object) linkedListTestDriver47);
        linkedListTestDriver20.addFirst((java.lang.Object) linkedListTestDriver47);
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver47);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj67 = linkedListTestDriver0.get((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (short) 1 + "'", obj26, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + "hi!" + "'", obj50, "hi!");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(iterator60);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test066");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test067");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray6 = linkedListTestDriver0.toArray();
        java.lang.Object obj7 = linkedListTestDriver0.getFirst();
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        java.lang.Object obj9 = linkedListTestDriver0.getFirst();
        java.lang.Object obj10 = linkedListTestDriver0.removeFirst();
        boolean boolean11 = linkedListTestDriver0.isEmpty();
        boolean boolean12 = linkedListTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test068");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) "hi!");
        java.lang.Object obj8 = linkedListTestDriver5.removeLast();
        linkedListTestDriver5.addLast((java.lang.Object) '#');
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        boolean boolean13 = linkedListTestDriver0.remove((java.lang.Object) 10);
        boolean boolean15 = linkedListTestDriver0.equals_CUT((java.lang.Object) false);
        java.lang.Object obj17 = null;
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) 'a', obj17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test069");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.clear();
        experiment.util.Iterator iterator2 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        boolean boolean5 = linkedListTestDriver3.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj6 = new java.lang.Object();
        linkedListTestDriver3.addFirst(obj6);
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        boolean boolean10 = linkedListTestDriver8.add((java.lang.Object) "hi!");
        java.lang.Object obj11 = linkedListTestDriver8.removeLast();
        linkedListTestDriver8.addLast((java.lang.Object) '#');
        linkedListTestDriver3.addLast((java.lang.Object) linkedListTestDriver8);
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        boolean boolean17 = linkedListTestDriver15.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = new java.lang.Object();
        linkedListTestDriver15.addFirst(obj18);
        experiment.util.Iterator iterator20 = linkedListTestDriver15.iterator();
        java.lang.Object[] objArray21 = linkedListTestDriver15.toArray();
        java.lang.Object obj22 = linkedListTestDriver15.getFirst();
        linkedListTestDriver8.addLast((java.lang.Object) linkedListTestDriver15);
        java.lang.Object[] objArray24 = linkedListTestDriver8.toArray();
        boolean boolean25 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = linkedListTestDriver0.getLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test070");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray6 = linkedListTestDriver0.toArray();
        java.lang.Object obj7 = linkedListTestDriver0.getFirst();
        linkedListTestDriver0.addLast((java.lang.Object) (short) 0);
        int int10 = linkedListTestDriver0.size();
        int int11 = linkedListTestDriver0.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test071");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) "hi!");
        java.lang.Object obj8 = linkedListTestDriver5.removeLast();
        linkedListTestDriver5.addLast((java.lang.Object) '#');
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        boolean boolean14 = linkedListTestDriver12.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj15 = new java.lang.Object();
        linkedListTestDriver12.addFirst(obj15);
        experiment.util.Iterator iterator17 = linkedListTestDriver12.iterator();
        java.lang.Object[] objArray18 = linkedListTestDriver12.toArray();
        java.lang.Object obj19 = linkedListTestDriver12.getFirst();
        experiment.util.Iterator iterator20 = linkedListTestDriver12.iterator();
        java.lang.Object obj21 = linkedListTestDriver12.getFirst();
        boolean boolean22 = linkedListTestDriver5.add((java.lang.Object) linkedListTestDriver12);
        java.lang.Object obj24 = null;
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver12.add(100, obj24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test072");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        boolean boolean4 = linkedListTestDriver2.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj5 = new java.lang.Object();
        linkedListTestDriver2.addFirst(obj5);
        java.lang.Object obj7 = linkedListTestDriver2.getLast();
        boolean boolean8 = linkedListTestDriver2.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj12 = new java.lang.Object();
        linkedListTestDriver9.addFirst(obj12);
        experiment.util.Iterator iterator14 = linkedListTestDriver9.iterator();
        boolean boolean15 = linkedListTestDriver2.add((java.lang.Object) linkedListTestDriver9);
        linkedListTestDriver9.add((int) (byte) 1, (java.lang.Object) (-1.0d));
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        boolean boolean22 = linkedListTestDriver20.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj23 = new java.lang.Object();
        linkedListTestDriver20.addFirst(obj23);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        boolean boolean27 = linkedListTestDriver25.add((java.lang.Object) "hi!");
        java.lang.Object obj28 = linkedListTestDriver25.removeLast();
        linkedListTestDriver25.addLast((java.lang.Object) '#');
        linkedListTestDriver20.addLast((java.lang.Object) linkedListTestDriver25);
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        boolean boolean34 = linkedListTestDriver32.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj35 = new java.lang.Object();
        linkedListTestDriver32.addFirst(obj35);
        experiment.util.Iterator iterator37 = linkedListTestDriver32.iterator();
        java.lang.Object[] objArray38 = linkedListTestDriver32.toArray();
        java.lang.Object obj39 = linkedListTestDriver32.getFirst();
        linkedListTestDriver25.addLast((java.lang.Object) linkedListTestDriver32);
        experiment.util.LinkedListTestDriver linkedListTestDriver41 = new experiment.util.LinkedListTestDriver();
        boolean boolean43 = linkedListTestDriver41.add((java.lang.Object) "hi!");
        linkedListTestDriver25.addLast((java.lang.Object) linkedListTestDriver41);
        boolean boolean45 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver41);
        int int46 = linkedListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj48 = linkedListTestDriver0.remove((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "hi!" + "'", obj28, "hi!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test073");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray6 = linkedListTestDriver0.toArray();
        java.lang.Object obj7 = linkedListTestDriver0.getFirst();
        linkedListTestDriver0.addLast((java.lang.Object) (short) 0);
        int int10 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver11.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj14 = new java.lang.Object();
        linkedListTestDriver11.addFirst(obj14);
        experiment.util.Iterator iterator16 = linkedListTestDriver11.iterator();
        int int17 = linkedListTestDriver11.size();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver11);
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        boolean boolean22 = linkedListTestDriver20.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj23 = new java.lang.Object();
        linkedListTestDriver20.addFirst(obj23);
        java.lang.Object obj25 = linkedListTestDriver20.getLast();
        boolean boolean26 = linkedListTestDriver20.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver27 = new experiment.util.LinkedListTestDriver();
        boolean boolean29 = linkedListTestDriver27.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj30 = new java.lang.Object();
        linkedListTestDriver27.addFirst(obj30);
        experiment.util.Iterator iterator32 = linkedListTestDriver27.iterator();
        boolean boolean33 = linkedListTestDriver20.add((java.lang.Object) linkedListTestDriver27);
        java.lang.Object obj34 = linkedListTestDriver27.removeFirst();
        java.lang.Object[] objArray35 = linkedListTestDriver27.toArray();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver11.add((int) (byte) 10, (java.lang.Object) objArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test074");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray6 = linkedListTestDriver0.toArray();
        java.lang.Object obj7 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        boolean boolean10 = linkedListTestDriver8.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj11 = new java.lang.Object();
        linkedListTestDriver8.addFirst(obj11);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver13.clear();
        boolean boolean16 = linkedListTestDriver13.remove((java.lang.Object) (byte) 0);
        boolean boolean17 = linkedListTestDriver8.contains((java.lang.Object) linkedListTestDriver13);
        java.lang.Object obj18 = linkedListTestDriver8.getFirst();
        linkedListTestDriver0.addFirst(obj18);
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        boolean boolean22 = linkedListTestDriver20.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj23 = new java.lang.Object();
        linkedListTestDriver20.addFirst(obj23);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        boolean boolean27 = linkedListTestDriver25.add((java.lang.Object) "hi!");
        java.lang.Object obj28 = linkedListTestDriver25.removeLast();
        linkedListTestDriver25.addLast((java.lang.Object) '#');
        linkedListTestDriver20.addLast((java.lang.Object) linkedListTestDriver25);
        java.lang.Object obj32 = linkedListTestDriver20.getLast();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver20);
        experiment.util.LinkedListTestDriver linkedListTestDriver35 = new experiment.util.LinkedListTestDriver();
        boolean boolean37 = linkedListTestDriver35.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj38 = new java.lang.Object();
        linkedListTestDriver35.addFirst(obj38);
        experiment.util.LinkedListTestDriver linkedListTestDriver40 = new experiment.util.LinkedListTestDriver();
        boolean boolean42 = linkedListTestDriver40.add((java.lang.Object) "hi!");
        java.lang.Object obj43 = linkedListTestDriver40.removeLast();
        linkedListTestDriver40.addLast((java.lang.Object) '#');
        linkedListTestDriver35.addLast((java.lang.Object) linkedListTestDriver40);
        experiment.util.LinkedListTestDriver linkedListTestDriver47 = new experiment.util.LinkedListTestDriver();
        boolean boolean49 = linkedListTestDriver47.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj50 = new java.lang.Object();
        linkedListTestDriver47.addFirst(obj50);
        experiment.util.Iterator iterator52 = linkedListTestDriver47.iterator();
        java.lang.Object[] objArray53 = linkedListTestDriver47.toArray();
        java.lang.Object obj54 = linkedListTestDriver47.getFirst();
        linkedListTestDriver40.addLast((java.lang.Object) linkedListTestDriver47);
        experiment.util.LinkedListTestDriver linkedListTestDriver56 = new experiment.util.LinkedListTestDriver();
        boolean boolean58 = linkedListTestDriver56.add((java.lang.Object) "hi!");
        linkedListTestDriver40.addLast((java.lang.Object) linkedListTestDriver56);
        experiment.util.LinkedListTestDriver linkedListTestDriver60 = new experiment.util.LinkedListTestDriver();
        boolean boolean62 = linkedListTestDriver60.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj63 = new java.lang.Object();
        linkedListTestDriver60.addFirst(obj63);
        experiment.util.LinkedListTestDriver linkedListTestDriver65 = new experiment.util.LinkedListTestDriver();
        boolean boolean67 = linkedListTestDriver65.add((java.lang.Object) "hi!");
        java.lang.Object obj68 = linkedListTestDriver65.removeLast();
        linkedListTestDriver65.addLast((java.lang.Object) '#');
        linkedListTestDriver60.addLast((java.lang.Object) linkedListTestDriver65);
        experiment.util.LinkedListTestDriver linkedListTestDriver72 = new experiment.util.LinkedListTestDriver();
        boolean boolean74 = linkedListTestDriver72.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj75 = new java.lang.Object();
        linkedListTestDriver72.addFirst(obj75);
        experiment.util.Iterator iterator77 = linkedListTestDriver72.iterator();
        java.lang.Object[] objArray78 = linkedListTestDriver72.toArray();
        java.lang.Object obj79 = linkedListTestDriver72.getFirst();
        linkedListTestDriver65.addLast((java.lang.Object) linkedListTestDriver72);
        java.lang.Object[] objArray81 = linkedListTestDriver72.toArray();
        experiment.util.ListIterator listIterator83 = linkedListTestDriver72.listIterator(0);
        linkedListTestDriver56.addLast((java.lang.Object) linkedListTestDriver72);
        boolean boolean86 = linkedListTestDriver56.equals_CUT((java.lang.Object) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver20.add((-1), (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "hi!" + "'", obj28, "hi!");
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + "hi!" + "'", obj43, "hi!");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(iterator52);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertEquals("'" + obj68 + "' != '" + "hi!" + "'", obj68, "hi!");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(iterator77);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertNotNull(obj79);
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertNotNull(listIterator83);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test075");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = new java.lang.Object();
        linkedListTestDriver7.addFirst(obj10);
        experiment.util.Iterator iterator12 = linkedListTestDriver7.iterator();
        boolean boolean13 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver7);
        java.lang.Object[] objArray14 = linkedListTestDriver7.toArray();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test076");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = new java.lang.Object();
        linkedListTestDriver7.addFirst(obj10);
        experiment.util.Iterator iterator12 = linkedListTestDriver7.iterator();
        boolean boolean13 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver7);
        java.lang.Object obj14 = linkedListTestDriver7.removeFirst();
        java.lang.Object obj15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = linkedListTestDriver7.add(obj15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test077");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray6 = linkedListTestDriver0.toArray();
        java.lang.Object obj7 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        boolean boolean10 = linkedListTestDriver8.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj11 = new java.lang.Object();
        linkedListTestDriver8.addFirst(obj11);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver13.clear();
        boolean boolean16 = linkedListTestDriver13.remove((java.lang.Object) (byte) 0);
        boolean boolean17 = linkedListTestDriver8.contains((java.lang.Object) linkedListTestDriver13);
        java.lang.Object obj18 = linkedListTestDriver8.getFirst();
        linkedListTestDriver0.addFirst(obj18);
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver20.clear();
        boolean boolean23 = linkedListTestDriver20.add((java.lang.Object) (short) 1);
        int int24 = linkedListTestDriver20.size();
        java.lang.Object obj26 = linkedListTestDriver20.remove((int) (byte) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver27 = new experiment.util.LinkedListTestDriver();
        boolean boolean29 = linkedListTestDriver27.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj30 = new java.lang.Object();
        linkedListTestDriver27.addFirst(obj30);
        java.lang.Object obj32 = linkedListTestDriver27.getLast();
        boolean boolean33 = linkedListTestDriver27.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        boolean boolean36 = linkedListTestDriver34.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj37 = new java.lang.Object();
        linkedListTestDriver34.addFirst(obj37);
        experiment.util.Iterator iterator39 = linkedListTestDriver34.iterator();
        boolean boolean40 = linkedListTestDriver27.add((java.lang.Object) linkedListTestDriver34);
        java.lang.Object obj41 = linkedListTestDriver34.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver42 = new experiment.util.LinkedListTestDriver();
        boolean boolean44 = linkedListTestDriver42.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj45 = new java.lang.Object();
        linkedListTestDriver42.addFirst(obj45);
        experiment.util.LinkedListTestDriver linkedListTestDriver47 = new experiment.util.LinkedListTestDriver();
        boolean boolean49 = linkedListTestDriver47.add((java.lang.Object) "hi!");
        java.lang.Object obj50 = linkedListTestDriver47.removeLast();
        linkedListTestDriver47.addLast((java.lang.Object) '#');
        linkedListTestDriver42.addLast((java.lang.Object) linkedListTestDriver47);
        experiment.util.LinkedListTestDriver linkedListTestDriver55 = new experiment.util.LinkedListTestDriver();
        boolean boolean57 = linkedListTestDriver55.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj58 = new java.lang.Object();
        linkedListTestDriver55.addFirst(obj58);
        experiment.util.Iterator iterator60 = linkedListTestDriver55.iterator();
        java.lang.Object[] objArray61 = linkedListTestDriver55.toArray();
        linkedListTestDriver47.add((int) (byte) 1, (java.lang.Object) linkedListTestDriver55);
        boolean boolean63 = linkedListTestDriver34.contains((java.lang.Object) linkedListTestDriver47);
        linkedListTestDriver20.addFirst((java.lang.Object) linkedListTestDriver47);
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver47);
        experiment.util.LinkedListTestDriver linkedListTestDriver66 = new experiment.util.LinkedListTestDriver();
        boolean boolean68 = linkedListTestDriver66.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj69 = new java.lang.Object();
        linkedListTestDriver66.addFirst(obj69);
        java.lang.Object obj71 = linkedListTestDriver66.getLast();
        boolean boolean72 = linkedListTestDriver66.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver73 = new experiment.util.LinkedListTestDriver();
        boolean boolean75 = linkedListTestDriver73.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj76 = new java.lang.Object();
        linkedListTestDriver73.addFirst(obj76);
        experiment.util.Iterator iterator78 = linkedListTestDriver73.iterator();
        boolean boolean79 = linkedListTestDriver66.add((java.lang.Object) linkedListTestDriver73);
        experiment.util.LinkedListTestDriver linkedListTestDriver80 = new experiment.util.LinkedListTestDriver();
        boolean boolean82 = linkedListTestDriver80.add((java.lang.Object) "hi!");
        java.lang.Object obj83 = linkedListTestDriver80.removeFirst();
        boolean boolean84 = linkedListTestDriver73.contains((java.lang.Object) linkedListTestDriver80);
        boolean boolean85 = linkedListTestDriver47.contains((java.lang.Object) boolean84);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (short) 1 + "'", obj26, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + "hi!" + "'", obj50, "hi!");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(iterator60);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(obj71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(iterator78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertEquals("'" + obj83 + "' != '" + "hi!" + "'", obj83, "hi!");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test078");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray6 = linkedListTestDriver0.toArray();
        java.lang.Object obj7 = linkedListTestDriver0.getFirst();
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        java.lang.Object obj9 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver11.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj14 = new java.lang.Object();
        linkedListTestDriver11.addFirst(obj14);
        java.lang.Object obj16 = linkedListTestDriver11.getLast();
        boolean boolean17 = linkedListTestDriver11.isEmpty();
        linkedListTestDriver0.add(1, (java.lang.Object) boolean17);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator20 = linkedListTestDriver0.listIterator((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 32; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test079");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) "hi!");
        java.lang.Object obj8 = linkedListTestDriver5.removeLast();
        linkedListTestDriver5.addLast((java.lang.Object) '#');
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        boolean boolean14 = linkedListTestDriver12.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj15 = new java.lang.Object();
        linkedListTestDriver12.addFirst(obj15);
        experiment.util.Iterator iterator17 = linkedListTestDriver12.iterator();
        java.lang.Object[] objArray18 = linkedListTestDriver12.toArray();
        java.lang.Object obj19 = linkedListTestDriver12.getFirst();
        linkedListTestDriver5.addLast((java.lang.Object) linkedListTestDriver12);
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        boolean boolean23 = linkedListTestDriver21.add((java.lang.Object) "hi!");
        linkedListTestDriver5.addLast((java.lang.Object) linkedListTestDriver21);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        boolean boolean27 = linkedListTestDriver25.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj28 = new java.lang.Object();
        linkedListTestDriver25.addFirst(obj28);
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        boolean boolean32 = linkedListTestDriver30.add((java.lang.Object) "hi!");
        java.lang.Object obj33 = linkedListTestDriver30.removeLast();
        linkedListTestDriver30.addLast((java.lang.Object) '#');
        linkedListTestDriver25.addLast((java.lang.Object) linkedListTestDriver30);
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        boolean boolean39 = linkedListTestDriver37.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj40 = new java.lang.Object();
        linkedListTestDriver37.addFirst(obj40);
        experiment.util.Iterator iterator42 = linkedListTestDriver37.iterator();
        java.lang.Object[] objArray43 = linkedListTestDriver37.toArray();
        java.lang.Object obj44 = linkedListTestDriver37.getFirst();
        linkedListTestDriver30.addLast((java.lang.Object) linkedListTestDriver37);
        java.lang.Object[] objArray46 = linkedListTestDriver37.toArray();
        experiment.util.ListIterator listIterator48 = linkedListTestDriver37.listIterator(0);
        linkedListTestDriver21.addLast((java.lang.Object) linkedListTestDriver37);
        java.lang.Object obj50 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean51 = linkedListTestDriver37.contains(obj50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "hi!" + "'", obj33, "hi!");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(iterator42);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(listIterator48);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test080");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.clear();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) (short) 1);
        int int4 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        int int6 = linkedListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test081");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray6 = linkedListTestDriver0.toArray();
        java.lang.Object obj7 = linkedListTestDriver0.getFirst();
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        java.lang.Object obj9 = linkedListTestDriver0.getFirst();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test082");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = new java.lang.Object();
        linkedListTestDriver7.addFirst(obj10);
        experiment.util.Iterator iterator12 = linkedListTestDriver7.iterator();
        boolean boolean13 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver7);
        java.lang.Object obj14 = linkedListTestDriver7.removeFirst();
        java.lang.Object[] objArray15 = linkedListTestDriver7.toArray();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator17 = linkedListTestDriver7.listIterator((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 1; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test083");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        java.lang.Object obj8 = linkedListTestDriver0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = linkedListTestDriver0.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test084");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) "hi!");
        java.lang.Object obj8 = linkedListTestDriver5.removeLast();
        linkedListTestDriver5.addLast((java.lang.Object) '#');
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        boolean boolean14 = linkedListTestDriver12.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj15 = new java.lang.Object();
        linkedListTestDriver12.addFirst(obj15);
        experiment.util.Iterator iterator17 = linkedListTestDriver12.iterator();
        java.lang.Object[] objArray18 = linkedListTestDriver12.toArray();
        java.lang.Object obj19 = linkedListTestDriver12.getFirst();
        linkedListTestDriver5.addLast((java.lang.Object) linkedListTestDriver12);
        java.lang.Object[] objArray21 = linkedListTestDriver12.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = linkedListTestDriver12.remove((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(objArray21);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test085");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) "hi!");
        java.lang.Object obj3 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj7 = new java.lang.Object();
        linkedListTestDriver4.addFirst(obj7);
        java.lang.Object obj9 = linkedListTestDriver4.getLast();
        boolean boolean10 = linkedListTestDriver4.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver11.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj14 = new java.lang.Object();
        linkedListTestDriver11.addFirst(obj14);
        experiment.util.Iterator iterator16 = linkedListTestDriver11.iterator();
        boolean boolean17 = linkedListTestDriver4.add((java.lang.Object) linkedListTestDriver11);
        java.lang.Object obj18 = linkedListTestDriver11.removeFirst();
        java.lang.Object[] objArray19 = linkedListTestDriver11.toArray();
        boolean boolean20 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver11);
        linkedListTestDriver11.clear();
        boolean boolean22 = linkedListTestDriver11.isEmpty();
        java.lang.Object[] objArray23 = linkedListTestDriver11.toArray();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "hi!" + "'", obj3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test086");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) "hi!");
        java.lang.Object obj8 = linkedListTestDriver5.removeLast();
        linkedListTestDriver5.addLast((java.lang.Object) '#');
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = linkedListTestDriver5.get(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test087");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = new java.lang.Object();
        linkedListTestDriver7.addFirst(obj10);
        experiment.util.Iterator iterator12 = linkedListTestDriver7.iterator();
        boolean boolean13 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver7);
        int int14 = linkedListTestDriver7.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        boolean boolean18 = linkedListTestDriver16.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj19 = new java.lang.Object();
        linkedListTestDriver16.addFirst(obj19);
        java.lang.Object obj21 = linkedListTestDriver16.getLast();
        boolean boolean22 = linkedListTestDriver16.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        boolean boolean25 = linkedListTestDriver23.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj26 = new java.lang.Object();
        linkedListTestDriver23.addFirst(obj26);
        experiment.util.Iterator iterator28 = linkedListTestDriver23.iterator();
        boolean boolean29 = linkedListTestDriver16.add((java.lang.Object) linkedListTestDriver23);
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        boolean boolean32 = linkedListTestDriver30.add((java.lang.Object) "hi!");
        java.lang.Object obj33 = linkedListTestDriver30.removeFirst();
        boolean boolean34 = linkedListTestDriver23.contains((java.lang.Object) linkedListTestDriver30);
        experiment.util.ListIterator listIterator36 = linkedListTestDriver30.listIterator(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj37 = linkedListTestDriver7.set((int) (byte) 10, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "hi!" + "'", obj33, "hi!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(listIterator36);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test088");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = new java.lang.Object();
        linkedListTestDriver7.addFirst(obj10);
        experiment.util.Iterator iterator12 = linkedListTestDriver7.iterator();
        boolean boolean13 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver7);
        java.lang.Object obj14 = linkedListTestDriver7.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        boolean boolean18 = linkedListTestDriver16.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj19 = new java.lang.Object();
        linkedListTestDriver16.addFirst(obj19);
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        boolean boolean23 = linkedListTestDriver21.add((java.lang.Object) "hi!");
        java.lang.Object obj24 = linkedListTestDriver21.removeLast();
        linkedListTestDriver21.addLast((java.lang.Object) '#');
        linkedListTestDriver16.addLast((java.lang.Object) linkedListTestDriver21);
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        boolean boolean31 = linkedListTestDriver29.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj32 = new java.lang.Object();
        linkedListTestDriver29.addFirst(obj32);
        experiment.util.Iterator iterator34 = linkedListTestDriver29.iterator();
        java.lang.Object[] objArray35 = linkedListTestDriver29.toArray();
        linkedListTestDriver21.add((int) (byte) 1, (java.lang.Object) linkedListTestDriver29);
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        boolean boolean39 = linkedListTestDriver37.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj40 = new java.lang.Object();
        linkedListTestDriver37.addFirst(obj40);
        experiment.util.LinkedListTestDriver linkedListTestDriver42 = new experiment.util.LinkedListTestDriver();
        boolean boolean44 = linkedListTestDriver42.add((java.lang.Object) "hi!");
        java.lang.Object obj45 = linkedListTestDriver42.removeLast();
        linkedListTestDriver42.addLast((java.lang.Object) '#');
        linkedListTestDriver37.addLast((java.lang.Object) linkedListTestDriver42);
        experiment.util.LinkedListTestDriver linkedListTestDriver49 = new experiment.util.LinkedListTestDriver();
        boolean boolean51 = linkedListTestDriver49.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj52 = new java.lang.Object();
        linkedListTestDriver49.addFirst(obj52);
        experiment.util.Iterator iterator54 = linkedListTestDriver49.iterator();
        java.lang.Object[] objArray55 = linkedListTestDriver49.toArray();
        java.lang.Object obj56 = linkedListTestDriver49.getFirst();
        experiment.util.Iterator iterator57 = linkedListTestDriver49.iterator();
        java.lang.Object obj58 = linkedListTestDriver49.getFirst();
        boolean boolean59 = linkedListTestDriver42.add((java.lang.Object) linkedListTestDriver49);
        boolean boolean60 = linkedListTestDriver29.contains((java.lang.Object) linkedListTestDriver42);
        linkedListTestDriver7.add((int) (short) 0, (java.lang.Object) linkedListTestDriver29);
        linkedListTestDriver7.addLast((java.lang.Object) 100L);
        experiment.util.LinkedListTestDriver linkedListTestDriver64 = new experiment.util.LinkedListTestDriver();
        boolean boolean66 = linkedListTestDriver64.add((java.lang.Object) "hi!");
        java.lang.Object obj67 = linkedListTestDriver64.removeFirst();
        int int68 = linkedListTestDriver64.size();
        boolean boolean69 = linkedListTestDriver7.remove((java.lang.Object) linkedListTestDriver64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "hi!" + "'", obj24, "hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + "hi!" + "'", obj45, "hi!");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(iterator54);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertNotNull(iterator57);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + "hi!" + "'", obj67, "hi!");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test089");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray6 = linkedListTestDriver0.toArray();
        java.lang.Object obj7 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        boolean boolean10 = linkedListTestDriver8.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj11 = new java.lang.Object();
        linkedListTestDriver8.addFirst(obj11);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver13.clear();
        boolean boolean16 = linkedListTestDriver13.remove((java.lang.Object) (byte) 0);
        boolean boolean17 = linkedListTestDriver8.contains((java.lang.Object) linkedListTestDriver13);
        java.lang.Object obj18 = linkedListTestDriver8.getFirst();
        linkedListTestDriver0.addFirst(obj18);
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver20.clear();
        boolean boolean23 = linkedListTestDriver20.add((java.lang.Object) (short) 1);
        int int24 = linkedListTestDriver20.size();
        java.lang.Object obj26 = linkedListTestDriver20.remove((int) (byte) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver27 = new experiment.util.LinkedListTestDriver();
        boolean boolean29 = linkedListTestDriver27.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj30 = new java.lang.Object();
        linkedListTestDriver27.addFirst(obj30);
        java.lang.Object obj32 = linkedListTestDriver27.getLast();
        boolean boolean33 = linkedListTestDriver27.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        boolean boolean36 = linkedListTestDriver34.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj37 = new java.lang.Object();
        linkedListTestDriver34.addFirst(obj37);
        experiment.util.Iterator iterator39 = linkedListTestDriver34.iterator();
        boolean boolean40 = linkedListTestDriver27.add((java.lang.Object) linkedListTestDriver34);
        java.lang.Object obj41 = linkedListTestDriver34.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver42 = new experiment.util.LinkedListTestDriver();
        boolean boolean44 = linkedListTestDriver42.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj45 = new java.lang.Object();
        linkedListTestDriver42.addFirst(obj45);
        experiment.util.LinkedListTestDriver linkedListTestDriver47 = new experiment.util.LinkedListTestDriver();
        boolean boolean49 = linkedListTestDriver47.add((java.lang.Object) "hi!");
        java.lang.Object obj50 = linkedListTestDriver47.removeLast();
        linkedListTestDriver47.addLast((java.lang.Object) '#');
        linkedListTestDriver42.addLast((java.lang.Object) linkedListTestDriver47);
        experiment.util.LinkedListTestDriver linkedListTestDriver55 = new experiment.util.LinkedListTestDriver();
        boolean boolean57 = linkedListTestDriver55.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj58 = new java.lang.Object();
        linkedListTestDriver55.addFirst(obj58);
        experiment.util.Iterator iterator60 = linkedListTestDriver55.iterator();
        java.lang.Object[] objArray61 = linkedListTestDriver55.toArray();
        linkedListTestDriver47.add((int) (byte) 1, (java.lang.Object) linkedListTestDriver55);
        boolean boolean63 = linkedListTestDriver34.contains((java.lang.Object) linkedListTestDriver47);
        linkedListTestDriver20.addFirst((java.lang.Object) linkedListTestDriver47);
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver47);
        experiment.util.LinkedListTestDriver linkedListTestDriver66 = new experiment.util.LinkedListTestDriver();
        boolean boolean68 = linkedListTestDriver66.remove((java.lang.Object) 100L);
        java.lang.Object[] objArray69 = linkedListTestDriver66.toArray();
        boolean boolean70 = linkedListTestDriver0.equals_CUT((java.lang.Object) objArray69);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (short) 1 + "'", obj26, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + "hi!" + "'", obj50, "hi!");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(iterator60);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray69), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray69), "[]");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test090");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) "hi!");
        java.lang.Object obj8 = linkedListTestDriver5.removeLast();
        linkedListTestDriver5.addLast((java.lang.Object) '#');
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        boolean boolean14 = linkedListTestDriver12.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj15 = new java.lang.Object();
        linkedListTestDriver12.addFirst(obj15);
        experiment.util.Iterator iterator17 = linkedListTestDriver12.iterator();
        java.lang.Object[] objArray18 = linkedListTestDriver12.toArray();
        java.lang.Object obj19 = linkedListTestDriver12.getFirst();
        linkedListTestDriver5.addLast((java.lang.Object) linkedListTestDriver12);
        experiment.util.Iterator iterator21 = linkedListTestDriver5.iterator();
        java.lang.Class<?> wildcardClass22 = linkedListTestDriver5.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test091");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) "hi!");
        java.lang.Object obj8 = linkedListTestDriver5.removeLast();
        linkedListTestDriver5.addLast((java.lang.Object) '#');
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        boolean boolean13 = linkedListTestDriver0.remove((java.lang.Object) 10);
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        boolean boolean18 = linkedListTestDriver16.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj19 = new java.lang.Object();
        linkedListTestDriver16.addFirst(obj19);
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        boolean boolean23 = linkedListTestDriver21.add((java.lang.Object) "hi!");
        java.lang.Object obj24 = linkedListTestDriver21.removeLast();
        linkedListTestDriver21.addLast((java.lang.Object) '#');
        linkedListTestDriver16.addLast((java.lang.Object) linkedListTestDriver21);
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        boolean boolean31 = linkedListTestDriver29.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj32 = new java.lang.Object();
        linkedListTestDriver29.addFirst(obj32);
        experiment.util.Iterator iterator34 = linkedListTestDriver29.iterator();
        java.lang.Object[] objArray35 = linkedListTestDriver29.toArray();
        linkedListTestDriver21.add((int) (byte) 1, (java.lang.Object) linkedListTestDriver29);
        int int37 = linkedListTestDriver21.size();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) (short) 1, (java.lang.Object) int37);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 1; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "hi!" + "'", obj24, "hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test092");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray6 = linkedListTestDriver0.toArray();
        java.lang.Object obj7 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        boolean boolean10 = linkedListTestDriver8.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj11 = new java.lang.Object();
        linkedListTestDriver8.addFirst(obj11);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver13.clear();
        boolean boolean16 = linkedListTestDriver13.remove((java.lang.Object) (byte) 0);
        boolean boolean17 = linkedListTestDriver8.contains((java.lang.Object) linkedListTestDriver13);
        java.lang.Object obj18 = linkedListTestDriver8.getFirst();
        linkedListTestDriver0.addFirst(obj18);
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        boolean boolean22 = linkedListTestDriver20.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj23 = new java.lang.Object();
        linkedListTestDriver20.addFirst(obj23);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        boolean boolean27 = linkedListTestDriver25.add((java.lang.Object) "hi!");
        java.lang.Object obj28 = linkedListTestDriver25.removeLast();
        linkedListTestDriver25.addLast((java.lang.Object) '#');
        linkedListTestDriver20.addLast((java.lang.Object) linkedListTestDriver25);
        java.lang.Object obj32 = linkedListTestDriver20.getLast();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver20);
        java.lang.Object[] objArray34 = linkedListTestDriver20.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver36 = new experiment.util.LinkedListTestDriver();
        boolean boolean38 = linkedListTestDriver36.remove((java.lang.Object) 100L);
        java.lang.Object[] objArray39 = linkedListTestDriver36.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj40 = linkedListTestDriver20.set(2, (java.lang.Object) linkedListTestDriver36);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "hi!" + "'", obj28, "hi!");
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[]");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test093");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray6 = linkedListTestDriver0.toArray();
        java.lang.Object obj7 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        boolean boolean10 = linkedListTestDriver8.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj11 = new java.lang.Object();
        linkedListTestDriver8.addFirst(obj11);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver13.clear();
        boolean boolean16 = linkedListTestDriver13.remove((java.lang.Object) (byte) 0);
        boolean boolean17 = linkedListTestDriver8.contains((java.lang.Object) linkedListTestDriver13);
        java.lang.Object obj18 = linkedListTestDriver8.getFirst();
        linkedListTestDriver0.addFirst(obj18);
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        boolean boolean22 = linkedListTestDriver20.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj23 = new java.lang.Object();
        linkedListTestDriver20.addFirst(obj23);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        boolean boolean27 = linkedListTestDriver25.add((java.lang.Object) "hi!");
        java.lang.Object obj28 = linkedListTestDriver25.removeLast();
        linkedListTestDriver25.addLast((java.lang.Object) '#');
        linkedListTestDriver20.addLast((java.lang.Object) linkedListTestDriver25);
        java.lang.Object obj32 = linkedListTestDriver20.getLast();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver20);
        java.lang.Object[] objArray34 = linkedListTestDriver20.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver35 = new experiment.util.LinkedListTestDriver();
        boolean boolean37 = linkedListTestDriver35.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj38 = new java.lang.Object();
        linkedListTestDriver35.addFirst(obj38);
        java.lang.Object obj40 = linkedListTestDriver35.getLast();
        boolean boolean41 = linkedListTestDriver35.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver42 = new experiment.util.LinkedListTestDriver();
        boolean boolean44 = linkedListTestDriver42.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj45 = new java.lang.Object();
        linkedListTestDriver42.addFirst(obj45);
        experiment.util.Iterator iterator47 = linkedListTestDriver42.iterator();
        boolean boolean48 = linkedListTestDriver35.add((java.lang.Object) linkedListTestDriver42);
        java.lang.Object obj49 = linkedListTestDriver42.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver51 = new experiment.util.LinkedListTestDriver();
        boolean boolean53 = linkedListTestDriver51.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj54 = new java.lang.Object();
        linkedListTestDriver51.addFirst(obj54);
        experiment.util.LinkedListTestDriver linkedListTestDriver56 = new experiment.util.LinkedListTestDriver();
        boolean boolean58 = linkedListTestDriver56.add((java.lang.Object) "hi!");
        java.lang.Object obj59 = linkedListTestDriver56.removeLast();
        linkedListTestDriver56.addLast((java.lang.Object) '#');
        linkedListTestDriver51.addLast((java.lang.Object) linkedListTestDriver56);
        experiment.util.LinkedListTestDriver linkedListTestDriver64 = new experiment.util.LinkedListTestDriver();
        boolean boolean66 = linkedListTestDriver64.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj67 = new java.lang.Object();
        linkedListTestDriver64.addFirst(obj67);
        experiment.util.Iterator iterator69 = linkedListTestDriver64.iterator();
        java.lang.Object[] objArray70 = linkedListTestDriver64.toArray();
        linkedListTestDriver56.add((int) (byte) 1, (java.lang.Object) linkedListTestDriver64);
        experiment.util.LinkedListTestDriver linkedListTestDriver72 = new experiment.util.LinkedListTestDriver();
        boolean boolean74 = linkedListTestDriver72.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj75 = new java.lang.Object();
        linkedListTestDriver72.addFirst(obj75);
        experiment.util.LinkedListTestDriver linkedListTestDriver77 = new experiment.util.LinkedListTestDriver();
        boolean boolean79 = linkedListTestDriver77.add((java.lang.Object) "hi!");
        java.lang.Object obj80 = linkedListTestDriver77.removeLast();
        linkedListTestDriver77.addLast((java.lang.Object) '#');
        linkedListTestDriver72.addLast((java.lang.Object) linkedListTestDriver77);
        experiment.util.LinkedListTestDriver linkedListTestDriver84 = new experiment.util.LinkedListTestDriver();
        boolean boolean86 = linkedListTestDriver84.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj87 = new java.lang.Object();
        linkedListTestDriver84.addFirst(obj87);
        experiment.util.Iterator iterator89 = linkedListTestDriver84.iterator();
        java.lang.Object[] objArray90 = linkedListTestDriver84.toArray();
        java.lang.Object obj91 = linkedListTestDriver84.getFirst();
        experiment.util.Iterator iterator92 = linkedListTestDriver84.iterator();
        java.lang.Object obj93 = linkedListTestDriver84.getFirst();
        boolean boolean94 = linkedListTestDriver77.add((java.lang.Object) linkedListTestDriver84);
        boolean boolean95 = linkedListTestDriver64.contains((java.lang.Object) linkedListTestDriver77);
        linkedListTestDriver42.add((int) (short) 0, (java.lang.Object) linkedListTestDriver64);
        linkedListTestDriver42.addLast((java.lang.Object) 100L);
        boolean boolean99 = linkedListTestDriver20.remove((java.lang.Object) linkedListTestDriver42);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "hi!" + "'", obj28, "hi!");
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(iterator47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + "hi!" + "'", obj59, "hi!");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(iterator69);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertEquals("'" + obj80 + "' != '" + "hi!" + "'", obj80, "hi!");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(iterator89);
        org.junit.Assert.assertNotNull(objArray90);
        org.junit.Assert.assertNotNull(obj91);
        org.junit.Assert.assertNotNull(iterator92);
        org.junit.Assert.assertNotNull(obj93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test094");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        boolean boolean4 = linkedListTestDriver2.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj5 = new java.lang.Object();
        linkedListTestDriver2.addFirst(obj5);
        java.lang.Object obj7 = linkedListTestDriver2.getLast();
        boolean boolean8 = linkedListTestDriver2.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj12 = new java.lang.Object();
        linkedListTestDriver9.addFirst(obj12);
        experiment.util.Iterator iterator14 = linkedListTestDriver9.iterator();
        boolean boolean15 = linkedListTestDriver2.add((java.lang.Object) linkedListTestDriver9);
        linkedListTestDriver9.add((int) (byte) 1, (java.lang.Object) (-1.0d));
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        boolean boolean22 = linkedListTestDriver20.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj23 = new java.lang.Object();
        linkedListTestDriver20.addFirst(obj23);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        boolean boolean27 = linkedListTestDriver25.add((java.lang.Object) "hi!");
        java.lang.Object obj28 = linkedListTestDriver25.removeLast();
        linkedListTestDriver25.addLast((java.lang.Object) '#');
        linkedListTestDriver20.addLast((java.lang.Object) linkedListTestDriver25);
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        boolean boolean34 = linkedListTestDriver32.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj35 = new java.lang.Object();
        linkedListTestDriver32.addFirst(obj35);
        experiment.util.Iterator iterator37 = linkedListTestDriver32.iterator();
        java.lang.Object[] objArray38 = linkedListTestDriver32.toArray();
        java.lang.Object obj39 = linkedListTestDriver32.getFirst();
        linkedListTestDriver25.addLast((java.lang.Object) linkedListTestDriver32);
        experiment.util.LinkedListTestDriver linkedListTestDriver41 = new experiment.util.LinkedListTestDriver();
        boolean boolean43 = linkedListTestDriver41.add((java.lang.Object) "hi!");
        linkedListTestDriver25.addLast((java.lang.Object) linkedListTestDriver41);
        boolean boolean45 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver41);
        java.lang.Object obj46 = linkedListTestDriver0.getFirst();
        boolean boolean48 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver50 = new experiment.util.LinkedListTestDriver();
        boolean boolean52 = linkedListTestDriver50.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj53 = new java.lang.Object();
        linkedListTestDriver50.addFirst(obj53);
        experiment.util.LinkedListTestDriver linkedListTestDriver55 = new experiment.util.LinkedListTestDriver();
        boolean boolean57 = linkedListTestDriver55.add((java.lang.Object) "hi!");
        java.lang.Object obj58 = linkedListTestDriver55.removeLast();
        linkedListTestDriver55.addLast((java.lang.Object) '#');
        linkedListTestDriver50.addLast((java.lang.Object) linkedListTestDriver55);
        experiment.util.LinkedListTestDriver linkedListTestDriver62 = new experiment.util.LinkedListTestDriver();
        boolean boolean64 = linkedListTestDriver62.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj65 = new java.lang.Object();
        linkedListTestDriver62.addFirst(obj65);
        experiment.util.Iterator iterator67 = linkedListTestDriver62.iterator();
        java.lang.Object[] objArray68 = linkedListTestDriver62.toArray();
        java.lang.Object obj69 = linkedListTestDriver62.getFirst();
        experiment.util.Iterator iterator70 = linkedListTestDriver62.iterator();
        java.lang.Object obj71 = linkedListTestDriver62.getFirst();
        boolean boolean72 = linkedListTestDriver55.add((java.lang.Object) linkedListTestDriver62);
        java.lang.Object obj73 = linkedListTestDriver55.removeFirst();
        java.lang.Object[] objArray74 = linkedListTestDriver55.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj75 = linkedListTestDriver0.set((int) (byte) 10, (java.lang.Object) linkedListTestDriver55);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "hi!" + "'", obj28, "hi!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + (byte) 1 + "'", obj46, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + "hi!" + "'", obj58, "hi!");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(iterator67);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertNotNull(obj69);
        org.junit.Assert.assertNotNull(iterator70);
        org.junit.Assert.assertNotNull(obj71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertEquals("'" + obj73 + "' != '" + '#' + "'", obj73, '#');
        org.junit.Assert.assertNotNull(objArray74);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test095");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        boolean boolean4 = linkedListTestDriver2.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj5 = new java.lang.Object();
        linkedListTestDriver2.addFirst(obj5);
        java.lang.Object obj7 = linkedListTestDriver2.getLast();
        boolean boolean8 = linkedListTestDriver2.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj12 = new java.lang.Object();
        linkedListTestDriver9.addFirst(obj12);
        experiment.util.Iterator iterator14 = linkedListTestDriver9.iterator();
        boolean boolean15 = linkedListTestDriver2.add((java.lang.Object) linkedListTestDriver9);
        linkedListTestDriver9.add((int) (byte) 1, (java.lang.Object) (-1.0d));
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        boolean boolean22 = linkedListTestDriver20.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj23 = new java.lang.Object();
        linkedListTestDriver20.addFirst(obj23);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        boolean boolean27 = linkedListTestDriver25.add((java.lang.Object) "hi!");
        java.lang.Object obj28 = linkedListTestDriver25.removeLast();
        linkedListTestDriver25.addLast((java.lang.Object) '#');
        linkedListTestDriver20.addLast((java.lang.Object) linkedListTestDriver25);
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        boolean boolean34 = linkedListTestDriver32.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj35 = new java.lang.Object();
        linkedListTestDriver32.addFirst(obj35);
        experiment.util.Iterator iterator37 = linkedListTestDriver32.iterator();
        java.lang.Object[] objArray38 = linkedListTestDriver32.toArray();
        java.lang.Object obj39 = linkedListTestDriver32.getFirst();
        linkedListTestDriver25.addLast((java.lang.Object) linkedListTestDriver32);
        experiment.util.LinkedListTestDriver linkedListTestDriver41 = new experiment.util.LinkedListTestDriver();
        boolean boolean43 = linkedListTestDriver41.add((java.lang.Object) "hi!");
        linkedListTestDriver25.addLast((java.lang.Object) linkedListTestDriver41);
        boolean boolean45 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver41);
        experiment.util.LinkedListTestDriver linkedListTestDriver46 = new experiment.util.LinkedListTestDriver();
        boolean boolean48 = linkedListTestDriver46.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj49 = new java.lang.Object();
        linkedListTestDriver46.addFirst(obj49);
        experiment.util.Iterator iterator51 = linkedListTestDriver46.iterator();
        java.lang.Object[] objArray52 = linkedListTestDriver46.toArray();
        java.lang.Object obj53 = linkedListTestDriver46.getFirst();
        experiment.util.Iterator iterator54 = linkedListTestDriver46.iterator();
        java.lang.Object obj55 = linkedListTestDriver46.getFirst();
        linkedListTestDriver41.addLast((java.lang.Object) linkedListTestDriver46);
        java.lang.Object[] objArray57 = linkedListTestDriver41.toArray();
        java.lang.Class<?> wildcardClass58 = linkedListTestDriver41.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "hi!" + "'", obj28, "hi!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(iterator51);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertNotNull(iterator54);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test096");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        boolean boolean4 = linkedListTestDriver2.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj5 = new java.lang.Object();
        linkedListTestDriver2.addFirst(obj5);
        java.lang.Object obj7 = linkedListTestDriver2.getLast();
        boolean boolean8 = linkedListTestDriver2.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj12 = new java.lang.Object();
        linkedListTestDriver9.addFirst(obj12);
        experiment.util.Iterator iterator14 = linkedListTestDriver9.iterator();
        boolean boolean15 = linkedListTestDriver2.add((java.lang.Object) linkedListTestDriver9);
        linkedListTestDriver9.add((int) (byte) 1, (java.lang.Object) (-1.0d));
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        boolean boolean22 = linkedListTestDriver20.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj23 = new java.lang.Object();
        linkedListTestDriver20.addFirst(obj23);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        boolean boolean27 = linkedListTestDriver25.add((java.lang.Object) "hi!");
        java.lang.Object obj28 = linkedListTestDriver25.removeLast();
        linkedListTestDriver25.addLast((java.lang.Object) '#');
        linkedListTestDriver20.addLast((java.lang.Object) linkedListTestDriver25);
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        boolean boolean34 = linkedListTestDriver32.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj35 = new java.lang.Object();
        linkedListTestDriver32.addFirst(obj35);
        experiment.util.Iterator iterator37 = linkedListTestDriver32.iterator();
        java.lang.Object[] objArray38 = linkedListTestDriver32.toArray();
        java.lang.Object obj39 = linkedListTestDriver32.getFirst();
        linkedListTestDriver25.addLast((java.lang.Object) linkedListTestDriver32);
        experiment.util.LinkedListTestDriver linkedListTestDriver41 = new experiment.util.LinkedListTestDriver();
        boolean boolean43 = linkedListTestDriver41.add((java.lang.Object) "hi!");
        linkedListTestDriver25.addLast((java.lang.Object) linkedListTestDriver41);
        boolean boolean45 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver41);
        experiment.util.LinkedListTestDriver linkedListTestDriver46 = new experiment.util.LinkedListTestDriver();
        boolean boolean48 = linkedListTestDriver46.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj49 = new java.lang.Object();
        linkedListTestDriver46.addFirst(obj49);
        experiment.util.Iterator iterator51 = linkedListTestDriver46.iterator();
        java.lang.Object[] objArray52 = linkedListTestDriver46.toArray();
        java.lang.Object obj53 = linkedListTestDriver46.getFirst();
        boolean boolean54 = linkedListTestDriver41.equals_CUT((java.lang.Object) linkedListTestDriver46);
        experiment.util.Iterator iterator55 = linkedListTestDriver46.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj57 = linkedListTestDriver46.remove(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "hi!" + "'", obj28, "hi!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(iterator51);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(iterator55);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test097");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) "hi!");
        java.lang.Object obj3 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj7 = new java.lang.Object();
        linkedListTestDriver4.addFirst(obj7);
        java.lang.Object obj9 = linkedListTestDriver4.getLast();
        boolean boolean10 = linkedListTestDriver4.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver11.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj14 = new java.lang.Object();
        linkedListTestDriver11.addFirst(obj14);
        experiment.util.Iterator iterator16 = linkedListTestDriver11.iterator();
        boolean boolean17 = linkedListTestDriver4.add((java.lang.Object) linkedListTestDriver11);
        java.lang.Object obj18 = linkedListTestDriver11.removeFirst();
        java.lang.Object[] objArray19 = linkedListTestDriver11.toArray();
        boolean boolean20 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver11);
        linkedListTestDriver11.clear();
        experiment.util.Iterator iterator22 = linkedListTestDriver11.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "hi!" + "'", obj3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(iterator22);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test098");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray6 = linkedListTestDriver0.toArray();
        java.lang.Object obj7 = linkedListTestDriver0.getFirst();
        linkedListTestDriver0.addLast((java.lang.Object) (short) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.clear();
        boolean boolean14 = linkedListTestDriver11.add((java.lang.Object) (short) 1);
        int int15 = linkedListTestDriver11.size();
        boolean boolean16 = linkedListTestDriver11.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) (short) 100, (java.lang.Object) linkedListTestDriver11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 100; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test099");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = new java.lang.Object();
        linkedListTestDriver7.addFirst(obj10);
        experiment.util.Iterator iterator12 = linkedListTestDriver7.iterator();
        boolean boolean13 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver7);
        java.lang.Object obj14 = linkedListTestDriver7.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        boolean boolean18 = linkedListTestDriver16.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj19 = new java.lang.Object();
        linkedListTestDriver16.addFirst(obj19);
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        boolean boolean23 = linkedListTestDriver21.add((java.lang.Object) "hi!");
        java.lang.Object obj24 = linkedListTestDriver21.removeLast();
        linkedListTestDriver21.addLast((java.lang.Object) '#');
        linkedListTestDriver16.addLast((java.lang.Object) linkedListTestDriver21);
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        boolean boolean31 = linkedListTestDriver29.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj32 = new java.lang.Object();
        linkedListTestDriver29.addFirst(obj32);
        experiment.util.Iterator iterator34 = linkedListTestDriver29.iterator();
        java.lang.Object[] objArray35 = linkedListTestDriver29.toArray();
        linkedListTestDriver21.add((int) (byte) 1, (java.lang.Object) linkedListTestDriver29);
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        boolean boolean39 = linkedListTestDriver37.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj40 = new java.lang.Object();
        linkedListTestDriver37.addFirst(obj40);
        experiment.util.LinkedListTestDriver linkedListTestDriver42 = new experiment.util.LinkedListTestDriver();
        boolean boolean44 = linkedListTestDriver42.add((java.lang.Object) "hi!");
        java.lang.Object obj45 = linkedListTestDriver42.removeLast();
        linkedListTestDriver42.addLast((java.lang.Object) '#');
        linkedListTestDriver37.addLast((java.lang.Object) linkedListTestDriver42);
        experiment.util.LinkedListTestDriver linkedListTestDriver49 = new experiment.util.LinkedListTestDriver();
        boolean boolean51 = linkedListTestDriver49.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj52 = new java.lang.Object();
        linkedListTestDriver49.addFirst(obj52);
        experiment.util.Iterator iterator54 = linkedListTestDriver49.iterator();
        java.lang.Object[] objArray55 = linkedListTestDriver49.toArray();
        java.lang.Object obj56 = linkedListTestDriver49.getFirst();
        experiment.util.Iterator iterator57 = linkedListTestDriver49.iterator();
        java.lang.Object obj58 = linkedListTestDriver49.getFirst();
        boolean boolean59 = linkedListTestDriver42.add((java.lang.Object) linkedListTestDriver49);
        boolean boolean60 = linkedListTestDriver29.contains((java.lang.Object) linkedListTestDriver42);
        linkedListTestDriver7.add((int) (short) 0, (java.lang.Object) linkedListTestDriver29);
        linkedListTestDriver7.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj63 = linkedListTestDriver7.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "hi!" + "'", obj24, "hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + "hi!" + "'", obj45, "hi!");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(iterator54);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertNotNull(iterator57);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test100");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) "hi!");
        java.lang.Object obj8 = linkedListTestDriver5.removeLast();
        linkedListTestDriver5.addLast((java.lang.Object) '#');
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj16 = new java.lang.Object();
        linkedListTestDriver13.addFirst(obj16);
        experiment.util.Iterator iterator18 = linkedListTestDriver13.iterator();
        java.lang.Object[] objArray19 = linkedListTestDriver13.toArray();
        linkedListTestDriver5.add((int) (byte) 1, (java.lang.Object) linkedListTestDriver13);
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        boolean boolean23 = linkedListTestDriver21.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj24 = new java.lang.Object();
        linkedListTestDriver21.addFirst(obj24);
        experiment.util.Iterator iterator26 = linkedListTestDriver21.iterator();
        java.lang.Object[] objArray27 = linkedListTestDriver21.toArray();
        java.lang.Object obj28 = linkedListTestDriver21.getFirst();
        experiment.util.Iterator iterator29 = linkedListTestDriver21.iterator();
        boolean boolean30 = linkedListTestDriver5.contains((java.lang.Object) iterator29);
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver32.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        boolean boolean36 = linkedListTestDriver34.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj37 = new java.lang.Object();
        linkedListTestDriver34.addFirst(obj37);
        java.lang.Object obj39 = linkedListTestDriver34.getLast();
        boolean boolean40 = linkedListTestDriver34.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver41 = new experiment.util.LinkedListTestDriver();
        boolean boolean43 = linkedListTestDriver41.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj44 = new java.lang.Object();
        linkedListTestDriver41.addFirst(obj44);
        experiment.util.Iterator iterator46 = linkedListTestDriver41.iterator();
        boolean boolean47 = linkedListTestDriver34.add((java.lang.Object) linkedListTestDriver41);
        linkedListTestDriver41.add((int) (byte) 1, (java.lang.Object) (-1.0d));
        linkedListTestDriver32.addFirst((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver52 = new experiment.util.LinkedListTestDriver();
        boolean boolean54 = linkedListTestDriver52.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj55 = new java.lang.Object();
        linkedListTestDriver52.addFirst(obj55);
        experiment.util.LinkedListTestDriver linkedListTestDriver57 = new experiment.util.LinkedListTestDriver();
        boolean boolean59 = linkedListTestDriver57.add((java.lang.Object) "hi!");
        java.lang.Object obj60 = linkedListTestDriver57.removeLast();
        linkedListTestDriver57.addLast((java.lang.Object) '#');
        linkedListTestDriver52.addLast((java.lang.Object) linkedListTestDriver57);
        experiment.util.LinkedListTestDriver linkedListTestDriver64 = new experiment.util.LinkedListTestDriver();
        boolean boolean66 = linkedListTestDriver64.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj67 = new java.lang.Object();
        linkedListTestDriver64.addFirst(obj67);
        experiment.util.Iterator iterator69 = linkedListTestDriver64.iterator();
        java.lang.Object[] objArray70 = linkedListTestDriver64.toArray();
        java.lang.Object obj71 = linkedListTestDriver64.getFirst();
        linkedListTestDriver57.addLast((java.lang.Object) linkedListTestDriver64);
        experiment.util.LinkedListTestDriver linkedListTestDriver73 = new experiment.util.LinkedListTestDriver();
        boolean boolean75 = linkedListTestDriver73.add((java.lang.Object) "hi!");
        linkedListTestDriver57.addLast((java.lang.Object) linkedListTestDriver73);
        boolean boolean77 = linkedListTestDriver32.remove((java.lang.Object) linkedListTestDriver73);
        experiment.util.LinkedListTestDriver linkedListTestDriver78 = new experiment.util.LinkedListTestDriver();
        boolean boolean80 = linkedListTestDriver78.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj81 = new java.lang.Object();
        linkedListTestDriver78.addFirst(obj81);
        experiment.util.Iterator iterator83 = linkedListTestDriver78.iterator();
        java.lang.Object[] objArray84 = linkedListTestDriver78.toArray();
        java.lang.Object obj85 = linkedListTestDriver78.getFirst();
        boolean boolean86 = linkedListTestDriver73.equals_CUT((java.lang.Object) linkedListTestDriver78);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj87 = linkedListTestDriver5.set((-1), (java.lang.Object) linkedListTestDriver73);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(iterator46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + "hi!" + "'", obj60, "hi!");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(iterator69);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertNotNull(obj71);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(iterator83);
        org.junit.Assert.assertNotNull(objArray84);
        org.junit.Assert.assertNotNull(obj85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test101");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) "hi!");
        java.lang.Object obj3 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj7 = new java.lang.Object();
        linkedListTestDriver4.addFirst(obj7);
        java.lang.Object obj9 = linkedListTestDriver4.getLast();
        boolean boolean10 = linkedListTestDriver4.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver11.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj14 = new java.lang.Object();
        linkedListTestDriver11.addFirst(obj14);
        experiment.util.Iterator iterator16 = linkedListTestDriver11.iterator();
        boolean boolean17 = linkedListTestDriver4.add((java.lang.Object) linkedListTestDriver11);
        boolean boolean18 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver11);
        java.lang.Object[] objArray19 = linkedListTestDriver0.toArray();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "hi!" + "'", obj3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test102");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) "hi!");
        java.lang.Object obj3 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj7 = new java.lang.Object();
        linkedListTestDriver4.addFirst(obj7);
        java.lang.Object obj9 = linkedListTestDriver4.getLast();
        boolean boolean10 = linkedListTestDriver4.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver11.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj14 = new java.lang.Object();
        linkedListTestDriver11.addFirst(obj14);
        experiment.util.Iterator iterator16 = linkedListTestDriver11.iterator();
        boolean boolean17 = linkedListTestDriver4.add((java.lang.Object) linkedListTestDriver11);
        java.lang.Object obj18 = linkedListTestDriver11.removeFirst();
        java.lang.Object[] objArray19 = linkedListTestDriver11.toArray();
        boolean boolean20 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver11);
        linkedListTestDriver11.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = linkedListTestDriver11.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "hi!" + "'", obj3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test103");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) "hi!");
        java.lang.Object obj3 = linkedListTestDriver0.removeLast();
        linkedListTestDriver0.addLast((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj9 = new java.lang.Object();
        linkedListTestDriver6.addFirst(obj9);
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.clear();
        boolean boolean14 = linkedListTestDriver11.remove((java.lang.Object) (byte) 0);
        boolean boolean15 = linkedListTestDriver6.contains((java.lang.Object) linkedListTestDriver11);
        boolean boolean16 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver11);
        boolean boolean17 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = linkedListTestDriver0.get((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "hi!" + "'", obj3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test104");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        boolean boolean4 = linkedListTestDriver2.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj5 = new java.lang.Object();
        linkedListTestDriver2.addFirst(obj5);
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.add((java.lang.Object) "hi!");
        java.lang.Object obj10 = linkedListTestDriver7.removeLast();
        linkedListTestDriver7.addLast((java.lang.Object) '#');
        linkedListTestDriver2.addLast((java.lang.Object) linkedListTestDriver7);
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        boolean boolean16 = linkedListTestDriver14.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj17 = new java.lang.Object();
        linkedListTestDriver14.addFirst(obj17);
        experiment.util.Iterator iterator19 = linkedListTestDriver14.iterator();
        java.lang.Object[] objArray20 = linkedListTestDriver14.toArray();
        java.lang.Object obj21 = linkedListTestDriver14.getFirst();
        linkedListTestDriver7.addLast((java.lang.Object) linkedListTestDriver14);
        java.lang.Object[] objArray23 = linkedListTestDriver14.toArray();
        boolean boolean24 = linkedListTestDriver14.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = linkedListTestDriver0.set((int) (byte) 1, (java.lang.Object) linkedListTestDriver14);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "hi!" + "'", obj10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test105");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = new java.lang.Object();
        linkedListTestDriver7.addFirst(obj10);
        experiment.util.Iterator iterator12 = linkedListTestDriver7.iterator();
        boolean boolean13 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver7);
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        boolean boolean16 = linkedListTestDriver14.add((java.lang.Object) "hi!");
        java.lang.Object obj17 = linkedListTestDriver14.removeFirst();
        boolean boolean18 = linkedListTestDriver7.contains((java.lang.Object) linkedListTestDriver14);
        linkedListTestDriver14.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        boolean boolean21 = linkedListTestDriver14.contains((java.lang.Object) linkedListTestDriver20);
        java.lang.Class<?> wildcardClass22 = linkedListTestDriver20.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "hi!" + "'", obj17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test106");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver5.clear();
        boolean boolean8 = linkedListTestDriver5.remove((java.lang.Object) (byte) 0);
        boolean boolean9 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        boolean boolean12 = linkedListTestDriver10.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj13 = new java.lang.Object();
        linkedListTestDriver10.addFirst(obj13);
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        boolean boolean17 = linkedListTestDriver15.add((java.lang.Object) "hi!");
        java.lang.Object obj18 = linkedListTestDriver15.removeLast();
        linkedListTestDriver15.addLast((java.lang.Object) '#');
        linkedListTestDriver10.addLast((java.lang.Object) linkedListTestDriver15);
        boolean boolean23 = linkedListTestDriver10.remove((java.lang.Object) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        boolean boolean27 = linkedListTestDriver25.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj28 = new java.lang.Object();
        linkedListTestDriver25.addFirst(obj28);
        experiment.util.Iterator iterator30 = linkedListTestDriver25.iterator();
        experiment.util.Iterator iterator31 = linkedListTestDriver25.iterator();
        linkedListTestDriver10.add(2, (java.lang.Object) linkedListTestDriver25);
        boolean boolean33 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver25);
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        boolean boolean36 = linkedListTestDriver34.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj37 = new java.lang.Object();
        linkedListTestDriver34.addFirst(obj37);
        experiment.util.Iterator iterator39 = linkedListTestDriver34.iterator();
        java.lang.Object[] objArray40 = linkedListTestDriver34.toArray();
        java.lang.Object obj41 = linkedListTestDriver34.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver42 = new experiment.util.LinkedListTestDriver();
        boolean boolean44 = linkedListTestDriver42.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj45 = new java.lang.Object();
        linkedListTestDriver42.addFirst(obj45);
        experiment.util.LinkedListTestDriver linkedListTestDriver47 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver47.clear();
        boolean boolean50 = linkedListTestDriver47.remove((java.lang.Object) (byte) 0);
        boolean boolean51 = linkedListTestDriver42.contains((java.lang.Object) linkedListTestDriver47);
        java.lang.Object obj52 = linkedListTestDriver42.getFirst();
        linkedListTestDriver34.addFirst(obj52);
        experiment.util.LinkedListTestDriver linkedListTestDriver54 = new experiment.util.LinkedListTestDriver();
        boolean boolean56 = linkedListTestDriver54.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj57 = new java.lang.Object();
        linkedListTestDriver54.addFirst(obj57);
        experiment.util.LinkedListTestDriver linkedListTestDriver59 = new experiment.util.LinkedListTestDriver();
        boolean boolean61 = linkedListTestDriver59.add((java.lang.Object) "hi!");
        java.lang.Object obj62 = linkedListTestDriver59.removeLast();
        linkedListTestDriver59.addLast((java.lang.Object) '#');
        linkedListTestDriver54.addLast((java.lang.Object) linkedListTestDriver59);
        java.lang.Object obj66 = linkedListTestDriver54.getLast();
        linkedListTestDriver34.addFirst((java.lang.Object) linkedListTestDriver54);
        java.lang.Object obj69 = linkedListTestDriver34.get((int) (byte) 1);
        linkedListTestDriver25.addFirst((java.lang.Object) linkedListTestDriver34);
        java.lang.Object obj71 = linkedListTestDriver34.getLast();
        java.lang.Object obj72 = linkedListTestDriver34.removeLast();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "hi!" + "'", obj18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + "hi!" + "'", obj62, "hi!");
        org.junit.Assert.assertNotNull(obj66);
        org.junit.Assert.assertNotNull(obj69);
        org.junit.Assert.assertNotNull(obj71);
        org.junit.Assert.assertNotNull(obj72);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test107");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = new java.lang.Object();
        linkedListTestDriver7.addFirst(obj10);
        experiment.util.Iterator iterator12 = linkedListTestDriver7.iterator();
        boolean boolean13 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver7);
        java.lang.Object obj14 = linkedListTestDriver7.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        boolean boolean18 = linkedListTestDriver16.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj19 = new java.lang.Object();
        linkedListTestDriver16.addFirst(obj19);
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        boolean boolean23 = linkedListTestDriver21.add((java.lang.Object) "hi!");
        java.lang.Object obj24 = linkedListTestDriver21.removeLast();
        linkedListTestDriver21.addLast((java.lang.Object) '#');
        linkedListTestDriver16.addLast((java.lang.Object) linkedListTestDriver21);
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        boolean boolean31 = linkedListTestDriver29.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj32 = new java.lang.Object();
        linkedListTestDriver29.addFirst(obj32);
        experiment.util.Iterator iterator34 = linkedListTestDriver29.iterator();
        java.lang.Object[] objArray35 = linkedListTestDriver29.toArray();
        linkedListTestDriver21.add((int) (byte) 1, (java.lang.Object) linkedListTestDriver29);
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        boolean boolean39 = linkedListTestDriver37.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj40 = new java.lang.Object();
        linkedListTestDriver37.addFirst(obj40);
        experiment.util.LinkedListTestDriver linkedListTestDriver42 = new experiment.util.LinkedListTestDriver();
        boolean boolean44 = linkedListTestDriver42.add((java.lang.Object) "hi!");
        java.lang.Object obj45 = linkedListTestDriver42.removeLast();
        linkedListTestDriver42.addLast((java.lang.Object) '#');
        linkedListTestDriver37.addLast((java.lang.Object) linkedListTestDriver42);
        experiment.util.LinkedListTestDriver linkedListTestDriver49 = new experiment.util.LinkedListTestDriver();
        boolean boolean51 = linkedListTestDriver49.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj52 = new java.lang.Object();
        linkedListTestDriver49.addFirst(obj52);
        experiment.util.Iterator iterator54 = linkedListTestDriver49.iterator();
        java.lang.Object[] objArray55 = linkedListTestDriver49.toArray();
        java.lang.Object obj56 = linkedListTestDriver49.getFirst();
        experiment.util.Iterator iterator57 = linkedListTestDriver49.iterator();
        java.lang.Object obj58 = linkedListTestDriver49.getFirst();
        boolean boolean59 = linkedListTestDriver42.add((java.lang.Object) linkedListTestDriver49);
        boolean boolean60 = linkedListTestDriver29.contains((java.lang.Object) linkedListTestDriver42);
        linkedListTestDriver7.add((int) (short) 0, (java.lang.Object) linkedListTestDriver29);
        linkedListTestDriver7.addLast((java.lang.Object) 100L);
        int int64 = linkedListTestDriver7.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver66 = new experiment.util.LinkedListTestDriver();
        boolean boolean68 = linkedListTestDriver66.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj69 = new java.lang.Object();
        linkedListTestDriver66.addFirst(obj69);
        experiment.util.LinkedListTestDriver linkedListTestDriver71 = new experiment.util.LinkedListTestDriver();
        boolean boolean73 = linkedListTestDriver71.add((java.lang.Object) "hi!");
        java.lang.Object obj74 = linkedListTestDriver71.removeLast();
        linkedListTestDriver71.addLast((java.lang.Object) '#');
        linkedListTestDriver66.addLast((java.lang.Object) linkedListTestDriver71);
        experiment.util.LinkedListTestDriver linkedListTestDriver79 = new experiment.util.LinkedListTestDriver();
        boolean boolean81 = linkedListTestDriver79.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj82 = new java.lang.Object();
        linkedListTestDriver79.addFirst(obj82);
        experiment.util.Iterator iterator84 = linkedListTestDriver79.iterator();
        java.lang.Object[] objArray85 = linkedListTestDriver79.toArray();
        linkedListTestDriver71.add((int) (byte) 1, (java.lang.Object) linkedListTestDriver79);
        experiment.util.LinkedListTestDriver linkedListTestDriver87 = new experiment.util.LinkedListTestDriver();
        boolean boolean89 = linkedListTestDriver87.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj90 = new java.lang.Object();
        linkedListTestDriver87.addFirst(obj90);
        experiment.util.Iterator iterator92 = linkedListTestDriver87.iterator();
        java.lang.Object[] objArray93 = linkedListTestDriver87.toArray();
        java.lang.Object obj94 = linkedListTestDriver87.getFirst();
        experiment.util.Iterator iterator95 = linkedListTestDriver87.iterator();
        boolean boolean96 = linkedListTestDriver71.contains((java.lang.Object) iterator95);
        linkedListTestDriver71.clear();
        boolean boolean98 = linkedListTestDriver71.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver7.add((int) 'a', (java.lang.Object) boolean98);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 97; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "hi!" + "'", obj24, "hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + "hi!" + "'", obj45, "hi!");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(iterator54);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertNotNull(iterator57);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 2 + "'", int64 == 2);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertEquals("'" + obj74 + "' != '" + "hi!" + "'", obj74, "hi!");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(iterator84);
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(iterator92);
        org.junit.Assert.assertNotNull(objArray93);
        org.junit.Assert.assertNotNull(obj94);
        org.junit.Assert.assertNotNull(iterator95);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test108");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.clear();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) (short) 1);
        int int4 = linkedListTestDriver0.size();
        java.lang.Object obj6 = linkedListTestDriver0.remove((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = linkedListTestDriver0.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test109");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = new java.lang.Object();
        linkedListTestDriver7.addFirst(obj10);
        experiment.util.Iterator iterator12 = linkedListTestDriver7.iterator();
        boolean boolean13 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver7);
        java.lang.Object obj14 = linkedListTestDriver7.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        boolean boolean18 = linkedListTestDriver16.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj19 = new java.lang.Object();
        linkedListTestDriver16.addFirst(obj19);
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        boolean boolean23 = linkedListTestDriver21.add((java.lang.Object) "hi!");
        java.lang.Object obj24 = linkedListTestDriver21.removeLast();
        linkedListTestDriver21.addLast((java.lang.Object) '#');
        linkedListTestDriver16.addLast((java.lang.Object) linkedListTestDriver21);
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        boolean boolean31 = linkedListTestDriver29.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj32 = new java.lang.Object();
        linkedListTestDriver29.addFirst(obj32);
        experiment.util.Iterator iterator34 = linkedListTestDriver29.iterator();
        java.lang.Object[] objArray35 = linkedListTestDriver29.toArray();
        linkedListTestDriver21.add((int) (byte) 1, (java.lang.Object) linkedListTestDriver29);
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        boolean boolean39 = linkedListTestDriver37.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj40 = new java.lang.Object();
        linkedListTestDriver37.addFirst(obj40);
        experiment.util.LinkedListTestDriver linkedListTestDriver42 = new experiment.util.LinkedListTestDriver();
        boolean boolean44 = linkedListTestDriver42.add((java.lang.Object) "hi!");
        java.lang.Object obj45 = linkedListTestDriver42.removeLast();
        linkedListTestDriver42.addLast((java.lang.Object) '#');
        linkedListTestDriver37.addLast((java.lang.Object) linkedListTestDriver42);
        experiment.util.LinkedListTestDriver linkedListTestDriver49 = new experiment.util.LinkedListTestDriver();
        boolean boolean51 = linkedListTestDriver49.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj52 = new java.lang.Object();
        linkedListTestDriver49.addFirst(obj52);
        experiment.util.Iterator iterator54 = linkedListTestDriver49.iterator();
        java.lang.Object[] objArray55 = linkedListTestDriver49.toArray();
        java.lang.Object obj56 = linkedListTestDriver49.getFirst();
        experiment.util.Iterator iterator57 = linkedListTestDriver49.iterator();
        java.lang.Object obj58 = linkedListTestDriver49.getFirst();
        boolean boolean59 = linkedListTestDriver42.add((java.lang.Object) linkedListTestDriver49);
        boolean boolean60 = linkedListTestDriver29.contains((java.lang.Object) linkedListTestDriver42);
        linkedListTestDriver7.add((int) (short) 0, (java.lang.Object) linkedListTestDriver29);
        linkedListTestDriver7.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj63 = linkedListTestDriver7.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "hi!" + "'", obj24, "hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + "hi!" + "'", obj45, "hi!");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(iterator54);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertNotNull(iterator57);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test110");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = linkedListTestDriver0.remove((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test111");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) "hi!");
        java.lang.Object obj3 = linkedListTestDriver0.removeLast();
        linkedListTestDriver0.addLast((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj9 = new java.lang.Object();
        linkedListTestDriver6.addFirst(obj9);
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.clear();
        boolean boolean14 = linkedListTestDriver11.remove((java.lang.Object) (byte) 0);
        boolean boolean15 = linkedListTestDriver6.contains((java.lang.Object) linkedListTestDriver11);
        boolean boolean16 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver11);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        boolean boolean19 = linkedListTestDriver17.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj20 = new java.lang.Object();
        linkedListTestDriver17.addFirst(obj20);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver22.clear();
        boolean boolean25 = linkedListTestDriver22.remove((java.lang.Object) (byte) 0);
        boolean boolean26 = linkedListTestDriver17.contains((java.lang.Object) linkedListTestDriver22);
        boolean boolean27 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver17);
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        boolean boolean31 = linkedListTestDriver29.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj32 = new java.lang.Object();
        linkedListTestDriver29.addFirst(obj32);
        java.lang.Object obj34 = linkedListTestDriver29.getLast();
        boolean boolean35 = linkedListTestDriver29.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver36 = new experiment.util.LinkedListTestDriver();
        boolean boolean38 = linkedListTestDriver36.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj39 = new java.lang.Object();
        linkedListTestDriver36.addFirst(obj39);
        experiment.util.Iterator iterator41 = linkedListTestDriver36.iterator();
        boolean boolean42 = linkedListTestDriver29.add((java.lang.Object) linkedListTestDriver36);
        java.lang.Object obj43 = linkedListTestDriver36.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver44 = new experiment.util.LinkedListTestDriver();
        boolean boolean46 = linkedListTestDriver44.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj47 = new java.lang.Object();
        linkedListTestDriver44.addFirst(obj47);
        experiment.util.LinkedListTestDriver linkedListTestDriver49 = new experiment.util.LinkedListTestDriver();
        boolean boolean51 = linkedListTestDriver49.add((java.lang.Object) "hi!");
        java.lang.Object obj52 = linkedListTestDriver49.removeLast();
        linkedListTestDriver49.addLast((java.lang.Object) '#');
        linkedListTestDriver44.addLast((java.lang.Object) linkedListTestDriver49);
        experiment.util.LinkedListTestDriver linkedListTestDriver57 = new experiment.util.LinkedListTestDriver();
        boolean boolean59 = linkedListTestDriver57.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj60 = new java.lang.Object();
        linkedListTestDriver57.addFirst(obj60);
        experiment.util.Iterator iterator62 = linkedListTestDriver57.iterator();
        java.lang.Object[] objArray63 = linkedListTestDriver57.toArray();
        linkedListTestDriver49.add((int) (byte) 1, (java.lang.Object) linkedListTestDriver57);
        boolean boolean65 = linkedListTestDriver36.contains((java.lang.Object) linkedListTestDriver49);
        boolean boolean66 = linkedListTestDriver36.isEmpty();
        linkedListTestDriver0.add((int) (short) 1, (java.lang.Object) linkedListTestDriver36);
        java.lang.Object obj68 = null;
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.addFirst(obj68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "hi!" + "'", obj3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(iterator41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + "hi!" + "'", obj52, "hi!");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(iterator62);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test112");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        java.lang.Object obj8 = linkedListTestDriver0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test113");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) "hi!");
        java.lang.Object obj3 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj7 = new java.lang.Object();
        linkedListTestDriver4.addFirst(obj7);
        java.lang.Object obj9 = linkedListTestDriver4.getLast();
        boolean boolean10 = linkedListTestDriver4.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver11.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj14 = new java.lang.Object();
        linkedListTestDriver11.addFirst(obj14);
        experiment.util.Iterator iterator16 = linkedListTestDriver11.iterator();
        boolean boolean17 = linkedListTestDriver4.add((java.lang.Object) linkedListTestDriver11);
        java.lang.Object obj18 = linkedListTestDriver11.removeFirst();
        java.lang.Object[] objArray19 = linkedListTestDriver11.toArray();
        boolean boolean20 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver11);
        linkedListTestDriver11.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        boolean boolean24 = linkedListTestDriver22.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj25 = new java.lang.Object();
        linkedListTestDriver22.addFirst(obj25);
        java.lang.Object obj27 = linkedListTestDriver22.getLast();
        boolean boolean28 = linkedListTestDriver11.remove((java.lang.Object) linkedListTestDriver22);
        experiment.util.Iterator iterator29 = linkedListTestDriver22.iterator();
        java.lang.Class<?> wildcardClass30 = linkedListTestDriver22.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "hi!" + "'", obj3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test114");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.clear();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) (short) 1);
        int int4 = linkedListTestDriver0.size();
        java.lang.Object obj6 = linkedListTestDriver0.remove((int) (byte) 0);
        java.lang.Object[] objArray7 = linkedListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = linkedListTestDriver0.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test115");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        boolean boolean4 = linkedListTestDriver2.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj5 = new java.lang.Object();
        linkedListTestDriver2.addFirst(obj5);
        java.lang.Object obj7 = linkedListTestDriver2.getLast();
        boolean boolean8 = linkedListTestDriver2.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj12 = new java.lang.Object();
        linkedListTestDriver9.addFirst(obj12);
        experiment.util.Iterator iterator14 = linkedListTestDriver9.iterator();
        boolean boolean15 = linkedListTestDriver2.add((java.lang.Object) linkedListTestDriver9);
        linkedListTestDriver9.add((int) (byte) 1, (java.lang.Object) (-1.0d));
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 1);
        java.lang.Object obj20 = linkedListTestDriver0.getLast();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) 1 + "'", obj20, (byte) 1);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test116");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.clear();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) (short) 1);
        int int4 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        int int6 = linkedListTestDriver0.size();
        java.lang.Class<?> wildcardClass7 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test117");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) "hi!");
        java.lang.Object obj8 = linkedListTestDriver5.removeLast();
        linkedListTestDriver5.addLast((java.lang.Object) '#');
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        boolean boolean14 = linkedListTestDriver12.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj15 = new java.lang.Object();
        linkedListTestDriver12.addFirst(obj15);
        experiment.util.Iterator iterator17 = linkedListTestDriver12.iterator();
        java.lang.Object[] objArray18 = linkedListTestDriver12.toArray();
        java.lang.Object obj19 = linkedListTestDriver12.getFirst();
        linkedListTestDriver5.addLast((java.lang.Object) linkedListTestDriver12);
        java.lang.Object[] objArray21 = linkedListTestDriver12.toArray();
        java.lang.Object obj23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = linkedListTestDriver12.set(0, obj23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(objArray21);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test118");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) "hi!");
        java.lang.Object obj8 = linkedListTestDriver5.removeLast();
        linkedListTestDriver5.addLast((java.lang.Object) '#');
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj16 = new java.lang.Object();
        linkedListTestDriver13.addFirst(obj16);
        experiment.util.Iterator iterator18 = linkedListTestDriver13.iterator();
        java.lang.Object[] objArray19 = linkedListTestDriver13.toArray();
        linkedListTestDriver5.add((int) (byte) 1, (java.lang.Object) linkedListTestDriver13);
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        boolean boolean23 = linkedListTestDriver21.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj24 = new java.lang.Object();
        linkedListTestDriver21.addFirst(obj24);
        experiment.util.Iterator iterator26 = linkedListTestDriver21.iterator();
        java.lang.Object[] objArray27 = linkedListTestDriver21.toArray();
        java.lang.Object obj28 = linkedListTestDriver21.getFirst();
        experiment.util.Iterator iterator29 = linkedListTestDriver21.iterator();
        boolean boolean30 = linkedListTestDriver5.contains((java.lang.Object) iterator29);
        java.lang.Object obj33 = linkedListTestDriver5.set((int) (short) 0, (java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        boolean boolean36 = linkedListTestDriver34.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj37 = new java.lang.Object();
        linkedListTestDriver34.addFirst(obj37);
        experiment.util.Iterator iterator39 = linkedListTestDriver34.iterator();
        java.lang.Object[] objArray40 = linkedListTestDriver34.toArray();
        boolean boolean41 = linkedListTestDriver5.equals_CUT((java.lang.Object) objArray40);
        java.lang.Object obj42 = linkedListTestDriver5.getLast();
        java.lang.Object obj43 = linkedListTestDriver5.removeFirst();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + '#' + "'", obj33, '#');
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + 1.0d + "'", obj43, 1.0d);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test119");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        boolean boolean4 = linkedListTestDriver2.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj5 = new java.lang.Object();
        linkedListTestDriver2.addFirst(obj5);
        java.lang.Object obj7 = linkedListTestDriver2.getLast();
        boolean boolean8 = linkedListTestDriver2.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj12 = new java.lang.Object();
        linkedListTestDriver9.addFirst(obj12);
        experiment.util.Iterator iterator14 = linkedListTestDriver9.iterator();
        boolean boolean15 = linkedListTestDriver2.add((java.lang.Object) linkedListTestDriver9);
        linkedListTestDriver9.add((int) (byte) 1, (java.lang.Object) (-1.0d));
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        boolean boolean22 = linkedListTestDriver20.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj23 = new java.lang.Object();
        linkedListTestDriver20.addFirst(obj23);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        boolean boolean27 = linkedListTestDriver25.add((java.lang.Object) "hi!");
        java.lang.Object obj28 = linkedListTestDriver25.removeLast();
        linkedListTestDriver25.addLast((java.lang.Object) '#');
        linkedListTestDriver20.addLast((java.lang.Object) linkedListTestDriver25);
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        boolean boolean34 = linkedListTestDriver32.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj35 = new java.lang.Object();
        linkedListTestDriver32.addFirst(obj35);
        experiment.util.Iterator iterator37 = linkedListTestDriver32.iterator();
        java.lang.Object[] objArray38 = linkedListTestDriver32.toArray();
        java.lang.Object obj39 = linkedListTestDriver32.getFirst();
        linkedListTestDriver25.addLast((java.lang.Object) linkedListTestDriver32);
        experiment.util.LinkedListTestDriver linkedListTestDriver41 = new experiment.util.LinkedListTestDriver();
        boolean boolean43 = linkedListTestDriver41.add((java.lang.Object) "hi!");
        linkedListTestDriver25.addLast((java.lang.Object) linkedListTestDriver41);
        boolean boolean45 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver41);
        experiment.util.LinkedListTestDriver linkedListTestDriver46 = new experiment.util.LinkedListTestDriver();
        boolean boolean48 = linkedListTestDriver46.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj49 = new java.lang.Object();
        linkedListTestDriver46.addFirst(obj49);
        experiment.util.Iterator iterator51 = linkedListTestDriver46.iterator();
        java.lang.Object[] objArray52 = linkedListTestDriver46.toArray();
        java.lang.Object obj53 = linkedListTestDriver46.getFirst();
        boolean boolean54 = linkedListTestDriver41.equals_CUT((java.lang.Object) linkedListTestDriver46);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator56 = linkedListTestDriver41.listIterator((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 100; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "hi!" + "'", obj28, "hi!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(iterator51);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test120");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver5.clear();
        boolean boolean8 = linkedListTestDriver5.remove((java.lang.Object) (byte) 0);
        boolean boolean9 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        boolean boolean12 = linkedListTestDriver10.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj13 = new java.lang.Object();
        linkedListTestDriver10.addFirst(obj13);
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        boolean boolean17 = linkedListTestDriver15.add((java.lang.Object) "hi!");
        java.lang.Object obj18 = linkedListTestDriver15.removeLast();
        linkedListTestDriver15.addLast((java.lang.Object) '#');
        linkedListTestDriver10.addLast((java.lang.Object) linkedListTestDriver15);
        boolean boolean23 = linkedListTestDriver10.remove((java.lang.Object) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        boolean boolean27 = linkedListTestDriver25.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj28 = new java.lang.Object();
        linkedListTestDriver25.addFirst(obj28);
        experiment.util.Iterator iterator30 = linkedListTestDriver25.iterator();
        experiment.util.Iterator iterator31 = linkedListTestDriver25.iterator();
        linkedListTestDriver10.add(2, (java.lang.Object) linkedListTestDriver25);
        boolean boolean33 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = linkedListTestDriver25.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "hi!" + "'", obj18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test121");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) "hi!");
        java.lang.Object obj3 = linkedListTestDriver0.removeLast();
        linkedListTestDriver0.addLast((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj9 = new java.lang.Object();
        linkedListTestDriver6.addFirst(obj9);
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.clear();
        boolean boolean14 = linkedListTestDriver11.remove((java.lang.Object) (byte) 0);
        boolean boolean15 = linkedListTestDriver6.contains((java.lang.Object) linkedListTestDriver11);
        boolean boolean16 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver11);
        boolean boolean17 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver18.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj21 = new java.lang.Object();
        linkedListTestDriver18.addFirst(obj21);
        java.lang.Object obj23 = linkedListTestDriver18.getLast();
        boolean boolean24 = linkedListTestDriver18.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        boolean boolean27 = linkedListTestDriver25.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj28 = new java.lang.Object();
        linkedListTestDriver25.addFirst(obj28);
        experiment.util.Iterator iterator30 = linkedListTestDriver25.iterator();
        boolean boolean31 = linkedListTestDriver18.add((java.lang.Object) linkedListTestDriver25);
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        boolean boolean34 = linkedListTestDriver32.add((java.lang.Object) "hi!");
        java.lang.Object obj35 = linkedListTestDriver32.removeFirst();
        boolean boolean36 = linkedListTestDriver25.contains((java.lang.Object) linkedListTestDriver32);
        linkedListTestDriver32.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver38 = new experiment.util.LinkedListTestDriver();
        boolean boolean39 = linkedListTestDriver32.contains((java.lang.Object) linkedListTestDriver38);
        boolean boolean40 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver38);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj41 = linkedListTestDriver38.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "hi!" + "'", obj3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + "hi!" + "'", obj35, "hi!");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test122");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) "hi!");
        java.lang.Object obj8 = linkedListTestDriver5.removeLast();
        linkedListTestDriver5.addLast((java.lang.Object) '#');
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        boolean boolean14 = linkedListTestDriver12.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj15 = new java.lang.Object();
        linkedListTestDriver12.addFirst(obj15);
        experiment.util.Iterator iterator17 = linkedListTestDriver12.iterator();
        java.lang.Object[] objArray18 = linkedListTestDriver12.toArray();
        java.lang.Object obj19 = linkedListTestDriver12.getFirst();
        experiment.util.Iterator iterator20 = linkedListTestDriver12.iterator();
        java.lang.Object obj21 = linkedListTestDriver12.getFirst();
        boolean boolean22 = linkedListTestDriver5.add((java.lang.Object) linkedListTestDriver12);
        java.lang.Object obj23 = linkedListTestDriver5.removeFirst();
        java.lang.Object[] objArray24 = linkedListTestDriver5.toArray();
        int int25 = linkedListTestDriver5.size();
        int int26 = linkedListTestDriver5.size();
        linkedListTestDriver5.addLast((java.lang.Object) 10L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + '#' + "'", obj23, '#');
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test123");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) "hi!");
        java.lang.Object obj8 = linkedListTestDriver5.removeLast();
        linkedListTestDriver5.addLast((java.lang.Object) '#');
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj16 = new java.lang.Object();
        linkedListTestDriver13.addFirst(obj16);
        experiment.util.Iterator iterator18 = linkedListTestDriver13.iterator();
        java.lang.Object[] objArray19 = linkedListTestDriver13.toArray();
        linkedListTestDriver5.add((int) (byte) 1, (java.lang.Object) linkedListTestDriver13);
        int int21 = linkedListTestDriver5.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        boolean boolean24 = linkedListTestDriver22.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj25 = new java.lang.Object();
        linkedListTestDriver22.addFirst(obj25);
        java.lang.Object obj27 = linkedListTestDriver22.getLast();
        boolean boolean28 = linkedListTestDriver22.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        boolean boolean31 = linkedListTestDriver29.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj32 = new java.lang.Object();
        linkedListTestDriver29.addFirst(obj32);
        experiment.util.Iterator iterator34 = linkedListTestDriver29.iterator();
        boolean boolean35 = linkedListTestDriver22.add((java.lang.Object) linkedListTestDriver29);
        experiment.util.LinkedListTestDriver linkedListTestDriver36 = new experiment.util.LinkedListTestDriver();
        boolean boolean38 = linkedListTestDriver36.add((java.lang.Object) "hi!");
        java.lang.Object obj39 = linkedListTestDriver36.removeFirst();
        boolean boolean40 = linkedListTestDriver29.contains((java.lang.Object) linkedListTestDriver36);
        boolean boolean41 = linkedListTestDriver5.equals_CUT((java.lang.Object) linkedListTestDriver36);
        java.lang.Object[] objArray42 = linkedListTestDriver5.toArray();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + "hi!" + "'", obj39, "hi!");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(objArray42);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test124");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = new java.lang.Object();
        linkedListTestDriver7.addFirst(obj10);
        experiment.util.Iterator iterator12 = linkedListTestDriver7.iterator();
        boolean boolean13 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver7);
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        boolean boolean16 = linkedListTestDriver14.add((java.lang.Object) "hi!");
        java.lang.Object obj17 = linkedListTestDriver14.removeFirst();
        boolean boolean18 = linkedListTestDriver7.contains((java.lang.Object) linkedListTestDriver14);
        experiment.util.ListIterator listIterator20 = linkedListTestDriver14.listIterator(0);
        int int21 = linkedListTestDriver14.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = linkedListTestDriver14.getLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "hi!" + "'", obj17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(listIterator20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test125");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray6 = linkedListTestDriver0.toArray();
        java.lang.Object obj7 = linkedListTestDriver0.getFirst();
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        int int9 = linkedListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = linkedListTestDriver0.remove((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test126");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        boolean boolean4 = linkedListTestDriver2.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj5 = new java.lang.Object();
        linkedListTestDriver2.addFirst(obj5);
        java.lang.Object obj7 = linkedListTestDriver2.getLast();
        boolean boolean8 = linkedListTestDriver2.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj12 = new java.lang.Object();
        linkedListTestDriver9.addFirst(obj12);
        experiment.util.Iterator iterator14 = linkedListTestDriver9.iterator();
        boolean boolean15 = linkedListTestDriver2.add((java.lang.Object) linkedListTestDriver9);
        linkedListTestDriver9.add((int) (byte) 1, (java.lang.Object) (-1.0d));
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        boolean boolean22 = linkedListTestDriver20.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj23 = new java.lang.Object();
        linkedListTestDriver20.addFirst(obj23);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        boolean boolean27 = linkedListTestDriver25.add((java.lang.Object) "hi!");
        java.lang.Object obj28 = linkedListTestDriver25.removeLast();
        linkedListTestDriver25.addLast((java.lang.Object) '#');
        linkedListTestDriver20.addLast((java.lang.Object) linkedListTestDriver25);
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        boolean boolean34 = linkedListTestDriver32.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj35 = new java.lang.Object();
        linkedListTestDriver32.addFirst(obj35);
        experiment.util.Iterator iterator37 = linkedListTestDriver32.iterator();
        java.lang.Object[] objArray38 = linkedListTestDriver32.toArray();
        java.lang.Object obj39 = linkedListTestDriver32.getFirst();
        linkedListTestDriver25.addLast((java.lang.Object) linkedListTestDriver32);
        experiment.util.LinkedListTestDriver linkedListTestDriver41 = new experiment.util.LinkedListTestDriver();
        boolean boolean43 = linkedListTestDriver41.add((java.lang.Object) "hi!");
        linkedListTestDriver25.addLast((java.lang.Object) linkedListTestDriver41);
        boolean boolean45 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver41);
        java.lang.Object obj46 = linkedListTestDriver41.getFirst();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "hi!" + "'", obj28, "hi!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + "hi!" + "'", obj46, "hi!");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test127");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj9 = new java.lang.Object();
        linkedListTestDriver6.addFirst(obj9);
        experiment.util.Iterator iterator11 = linkedListTestDriver6.iterator();
        java.lang.Object[] objArray12 = linkedListTestDriver6.toArray();
        java.lang.Object obj13 = linkedListTestDriver6.getFirst();
        experiment.util.Iterator iterator14 = linkedListTestDriver6.iterator();
        java.lang.Object obj15 = linkedListTestDriver6.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        boolean boolean19 = linkedListTestDriver17.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj20 = new java.lang.Object();
        linkedListTestDriver17.addFirst(obj20);
        java.lang.Object obj22 = linkedListTestDriver17.getLast();
        boolean boolean23 = linkedListTestDriver17.isEmpty();
        linkedListTestDriver6.add(1, (java.lang.Object) boolean23);
        java.lang.Object obj26 = linkedListTestDriver6.remove(1);
        linkedListTestDriver6.addFirst((java.lang.Object) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = linkedListTestDriver0.set((int) '#', (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + false + "'", obj26, false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test128");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) "hi!");
        java.lang.Object obj8 = linkedListTestDriver5.removeLast();
        linkedListTestDriver5.addLast((java.lang.Object) '#');
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        boolean boolean14 = linkedListTestDriver12.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj15 = new java.lang.Object();
        linkedListTestDriver12.addFirst(obj15);
        experiment.util.Iterator iterator17 = linkedListTestDriver12.iterator();
        java.lang.Object[] objArray18 = linkedListTestDriver12.toArray();
        java.lang.Object obj19 = linkedListTestDriver12.getFirst();
        linkedListTestDriver5.addLast((java.lang.Object) linkedListTestDriver12);
        java.lang.Object[] objArray21 = linkedListTestDriver12.toArray();
        experiment.util.ListIterator listIterator23 = linkedListTestDriver12.listIterator(0);
        int int24 = linkedListTestDriver12.size();
        java.lang.Class<?> wildcardClass25 = linkedListTestDriver12.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(listIterator23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test129");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        boolean boolean4 = linkedListTestDriver2.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj5 = new java.lang.Object();
        linkedListTestDriver2.addFirst(obj5);
        java.lang.Object obj7 = linkedListTestDriver2.getLast();
        boolean boolean8 = linkedListTestDriver2.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj12 = new java.lang.Object();
        linkedListTestDriver9.addFirst(obj12);
        experiment.util.Iterator iterator14 = linkedListTestDriver9.iterator();
        boolean boolean15 = linkedListTestDriver2.add((java.lang.Object) linkedListTestDriver9);
        linkedListTestDriver9.add((int) (byte) 1, (java.lang.Object) (-1.0d));
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        boolean boolean22 = linkedListTestDriver20.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj23 = new java.lang.Object();
        linkedListTestDriver20.addFirst(obj23);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        boolean boolean27 = linkedListTestDriver25.add((java.lang.Object) "hi!");
        java.lang.Object obj28 = linkedListTestDriver25.removeLast();
        linkedListTestDriver25.addLast((java.lang.Object) '#');
        linkedListTestDriver20.addLast((java.lang.Object) linkedListTestDriver25);
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        boolean boolean34 = linkedListTestDriver32.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj35 = new java.lang.Object();
        linkedListTestDriver32.addFirst(obj35);
        experiment.util.Iterator iterator37 = linkedListTestDriver32.iterator();
        java.lang.Object[] objArray38 = linkedListTestDriver32.toArray();
        java.lang.Object obj39 = linkedListTestDriver32.getFirst();
        linkedListTestDriver25.addLast((java.lang.Object) linkedListTestDriver32);
        experiment.util.LinkedListTestDriver linkedListTestDriver41 = new experiment.util.LinkedListTestDriver();
        boolean boolean43 = linkedListTestDriver41.add((java.lang.Object) "hi!");
        linkedListTestDriver25.addLast((java.lang.Object) linkedListTestDriver41);
        boolean boolean45 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver41);
        experiment.util.LinkedListTestDriver linkedListTestDriver46 = new experiment.util.LinkedListTestDriver();
        boolean boolean48 = linkedListTestDriver46.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj49 = new java.lang.Object();
        linkedListTestDriver46.addFirst(obj49);
        experiment.util.Iterator iterator51 = linkedListTestDriver46.iterator();
        java.lang.Object[] objArray52 = linkedListTestDriver46.toArray();
        java.lang.Object obj53 = linkedListTestDriver46.getFirst();
        experiment.util.Iterator iterator54 = linkedListTestDriver46.iterator();
        java.lang.Object obj55 = linkedListTestDriver46.getFirst();
        linkedListTestDriver41.addLast((java.lang.Object) linkedListTestDriver46);
        java.lang.Object[] objArray57 = linkedListTestDriver46.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver59 = new experiment.util.LinkedListTestDriver();
        boolean boolean61 = linkedListTestDriver59.contains((java.lang.Object) (byte) -1);
        linkedListTestDriver46.add((int) (byte) 0, (java.lang.Object) (byte) -1);
        linkedListTestDriver46.addFirst((java.lang.Object) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "hi!" + "'", obj28, "hi!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(iterator51);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertNotNull(iterator54);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test130");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = linkedListTestDriver0.set((int) (byte) 1, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test131");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) "hi!");
        java.lang.Object obj8 = linkedListTestDriver5.removeLast();
        linkedListTestDriver5.addLast((java.lang.Object) '#');
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        boolean boolean13 = linkedListTestDriver0.remove((java.lang.Object) 10);
        boolean boolean15 = linkedListTestDriver0.equals_CUT((java.lang.Object) false);
        java.lang.Object obj16 = linkedListTestDriver0.removeFirst();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test132");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray6 = linkedListTestDriver0.toArray();
        java.lang.Object obj7 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        boolean boolean10 = linkedListTestDriver8.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj11 = new java.lang.Object();
        linkedListTestDriver8.addFirst(obj11);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver13.clear();
        boolean boolean16 = linkedListTestDriver13.remove((java.lang.Object) (byte) 0);
        boolean boolean17 = linkedListTestDriver8.contains((java.lang.Object) linkedListTestDriver13);
        java.lang.Object obj18 = linkedListTestDriver8.getFirst();
        linkedListTestDriver0.addFirst(obj18);
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver20.clear();
        boolean boolean23 = linkedListTestDriver20.add((java.lang.Object) (short) 1);
        int int24 = linkedListTestDriver20.size();
        java.lang.Object obj26 = linkedListTestDriver20.remove((int) (byte) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver27 = new experiment.util.LinkedListTestDriver();
        boolean boolean29 = linkedListTestDriver27.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj30 = new java.lang.Object();
        linkedListTestDriver27.addFirst(obj30);
        java.lang.Object obj32 = linkedListTestDriver27.getLast();
        boolean boolean33 = linkedListTestDriver27.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        boolean boolean36 = linkedListTestDriver34.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj37 = new java.lang.Object();
        linkedListTestDriver34.addFirst(obj37);
        experiment.util.Iterator iterator39 = linkedListTestDriver34.iterator();
        boolean boolean40 = linkedListTestDriver27.add((java.lang.Object) linkedListTestDriver34);
        java.lang.Object obj41 = linkedListTestDriver34.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver42 = new experiment.util.LinkedListTestDriver();
        boolean boolean44 = linkedListTestDriver42.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj45 = new java.lang.Object();
        linkedListTestDriver42.addFirst(obj45);
        experiment.util.LinkedListTestDriver linkedListTestDriver47 = new experiment.util.LinkedListTestDriver();
        boolean boolean49 = linkedListTestDriver47.add((java.lang.Object) "hi!");
        java.lang.Object obj50 = linkedListTestDriver47.removeLast();
        linkedListTestDriver47.addLast((java.lang.Object) '#');
        linkedListTestDriver42.addLast((java.lang.Object) linkedListTestDriver47);
        experiment.util.LinkedListTestDriver linkedListTestDriver55 = new experiment.util.LinkedListTestDriver();
        boolean boolean57 = linkedListTestDriver55.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj58 = new java.lang.Object();
        linkedListTestDriver55.addFirst(obj58);
        experiment.util.Iterator iterator60 = linkedListTestDriver55.iterator();
        java.lang.Object[] objArray61 = linkedListTestDriver55.toArray();
        linkedListTestDriver47.add((int) (byte) 1, (java.lang.Object) linkedListTestDriver55);
        boolean boolean63 = linkedListTestDriver34.contains((java.lang.Object) linkedListTestDriver47);
        linkedListTestDriver20.addFirst((java.lang.Object) linkedListTestDriver47);
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver47);
        int int66 = linkedListTestDriver0.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (short) 1 + "'", obj26, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + "hi!" + "'", obj50, "hi!");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(iterator60);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 3 + "'", int66 == 3);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test133");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        boolean boolean4 = linkedListTestDriver2.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj5 = new java.lang.Object();
        linkedListTestDriver2.addFirst(obj5);
        java.lang.Object obj7 = linkedListTestDriver2.getLast();
        boolean boolean8 = linkedListTestDriver2.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj12 = new java.lang.Object();
        linkedListTestDriver9.addFirst(obj12);
        experiment.util.Iterator iterator14 = linkedListTestDriver9.iterator();
        boolean boolean15 = linkedListTestDriver2.add((java.lang.Object) linkedListTestDriver9);
        linkedListTestDriver9.add((int) (byte) 1, (java.lang.Object) (-1.0d));
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        boolean boolean22 = linkedListTestDriver20.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj23 = new java.lang.Object();
        linkedListTestDriver20.addFirst(obj23);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        boolean boolean27 = linkedListTestDriver25.add((java.lang.Object) "hi!");
        java.lang.Object obj28 = linkedListTestDriver25.removeLast();
        linkedListTestDriver25.addLast((java.lang.Object) '#');
        linkedListTestDriver20.addLast((java.lang.Object) linkedListTestDriver25);
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        boolean boolean34 = linkedListTestDriver32.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj35 = new java.lang.Object();
        linkedListTestDriver32.addFirst(obj35);
        experiment.util.Iterator iterator37 = linkedListTestDriver32.iterator();
        java.lang.Object[] objArray38 = linkedListTestDriver32.toArray();
        java.lang.Object obj39 = linkedListTestDriver32.getFirst();
        linkedListTestDriver25.addLast((java.lang.Object) linkedListTestDriver32);
        experiment.util.LinkedListTestDriver linkedListTestDriver41 = new experiment.util.LinkedListTestDriver();
        boolean boolean43 = linkedListTestDriver41.add((java.lang.Object) "hi!");
        linkedListTestDriver25.addLast((java.lang.Object) linkedListTestDriver41);
        boolean boolean45 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver41);
        experiment.util.LinkedListTestDriver linkedListTestDriver46 = new experiment.util.LinkedListTestDriver();
        boolean boolean48 = linkedListTestDriver46.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj49 = new java.lang.Object();
        linkedListTestDriver46.addFirst(obj49);
        experiment.util.Iterator iterator51 = linkedListTestDriver46.iterator();
        java.lang.Object[] objArray52 = linkedListTestDriver46.toArray();
        java.lang.Object obj53 = linkedListTestDriver46.getFirst();
        experiment.util.Iterator iterator54 = linkedListTestDriver46.iterator();
        java.lang.Object obj55 = linkedListTestDriver46.getFirst();
        linkedListTestDriver41.addLast((java.lang.Object) linkedListTestDriver46);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj58 = linkedListTestDriver46.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "hi!" + "'", obj28, "hi!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(iterator51);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertNotNull(iterator54);
        org.junit.Assert.assertNotNull(obj55);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test134");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.clear();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) (short) 1);
        int int4 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = linkedListTestDriver0.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test135");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray6 = linkedListTestDriver0.toArray();
        java.lang.Object obj7 = linkedListTestDriver0.getFirst();
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        java.lang.Object obj9 = linkedListTestDriver0.getFirst();
        boolean boolean11 = linkedListTestDriver0.contains((java.lang.Object) 100.0d);
        java.lang.Object obj12 = linkedListTestDriver0.getFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = linkedListTestDriver0.get((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test136");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.clear();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) (short) 1);
        int int4 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.add((java.lang.Object) "hi!");
        java.lang.Object obj9 = linkedListTestDriver6.removeLast();
        linkedListTestDriver6.addLast((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        boolean boolean14 = linkedListTestDriver12.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj15 = new java.lang.Object();
        linkedListTestDriver12.addFirst(obj15);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver17.clear();
        boolean boolean20 = linkedListTestDriver17.remove((java.lang.Object) (byte) 0);
        boolean boolean21 = linkedListTestDriver12.contains((java.lang.Object) linkedListTestDriver17);
        boolean boolean22 = linkedListTestDriver6.equals_CUT((java.lang.Object) linkedListTestDriver17);
        boolean boolean23 = linkedListTestDriver6.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add(2, (java.lang.Object) linkedListTestDriver6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 2; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "hi!" + "'", obj9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test137");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) "hi!");
        java.lang.Object obj8 = linkedListTestDriver5.removeLast();
        linkedListTestDriver5.addLast((java.lang.Object) '#');
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        boolean boolean14 = linkedListTestDriver12.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj15 = new java.lang.Object();
        linkedListTestDriver12.addFirst(obj15);
        experiment.util.Iterator iterator17 = linkedListTestDriver12.iterator();
        java.lang.Object[] objArray18 = linkedListTestDriver12.toArray();
        java.lang.Object obj19 = linkedListTestDriver12.getFirst();
        linkedListTestDriver5.addLast((java.lang.Object) linkedListTestDriver12);
        java.lang.Object[] objArray21 = linkedListTestDriver12.toArray();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator23 = linkedListTestDriver12.listIterator((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(objArray21);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test138");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) "hi!");
        java.lang.Object obj3 = linkedListTestDriver0.removeLast();
        linkedListTestDriver0.addLast((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj9 = new java.lang.Object();
        linkedListTestDriver6.addFirst(obj9);
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.clear();
        boolean boolean14 = linkedListTestDriver11.remove((java.lang.Object) (byte) 0);
        boolean boolean15 = linkedListTestDriver6.contains((java.lang.Object) linkedListTestDriver11);
        boolean boolean16 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver11);
        boolean boolean17 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver18.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj21 = new java.lang.Object();
        linkedListTestDriver18.addFirst(obj21);
        java.lang.Object obj23 = linkedListTestDriver18.getLast();
        boolean boolean24 = linkedListTestDriver18.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        boolean boolean27 = linkedListTestDriver25.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj28 = new java.lang.Object();
        linkedListTestDriver25.addFirst(obj28);
        experiment.util.Iterator iterator30 = linkedListTestDriver25.iterator();
        boolean boolean31 = linkedListTestDriver18.add((java.lang.Object) linkedListTestDriver25);
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        boolean boolean34 = linkedListTestDriver32.add((java.lang.Object) "hi!");
        java.lang.Object obj35 = linkedListTestDriver32.removeFirst();
        boolean boolean36 = linkedListTestDriver25.contains((java.lang.Object) linkedListTestDriver32);
        linkedListTestDriver32.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver38 = new experiment.util.LinkedListTestDriver();
        boolean boolean39 = linkedListTestDriver32.contains((java.lang.Object) linkedListTestDriver38);
        boolean boolean40 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver38);
        experiment.util.LinkedListTestDriver linkedListTestDriver41 = new experiment.util.LinkedListTestDriver();
        boolean boolean43 = linkedListTestDriver41.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj44 = new java.lang.Object();
        linkedListTestDriver41.addFirst(obj44);
        experiment.util.LinkedListTestDriver linkedListTestDriver46 = new experiment.util.LinkedListTestDriver();
        boolean boolean48 = linkedListTestDriver46.add((java.lang.Object) "hi!");
        java.lang.Object obj49 = linkedListTestDriver46.removeLast();
        linkedListTestDriver46.addLast((java.lang.Object) '#');
        linkedListTestDriver41.addLast((java.lang.Object) linkedListTestDriver46);
        experiment.util.LinkedListTestDriver linkedListTestDriver54 = new experiment.util.LinkedListTestDriver();
        boolean boolean56 = linkedListTestDriver54.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj57 = new java.lang.Object();
        linkedListTestDriver54.addFirst(obj57);
        experiment.util.Iterator iterator59 = linkedListTestDriver54.iterator();
        java.lang.Object[] objArray60 = linkedListTestDriver54.toArray();
        linkedListTestDriver46.add((int) (byte) 1, (java.lang.Object) linkedListTestDriver54);
        experiment.util.LinkedListTestDriver linkedListTestDriver62 = new experiment.util.LinkedListTestDriver();
        boolean boolean64 = linkedListTestDriver62.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj65 = new java.lang.Object();
        linkedListTestDriver62.addFirst(obj65);
        experiment.util.Iterator iterator67 = linkedListTestDriver62.iterator();
        java.lang.Object[] objArray68 = linkedListTestDriver62.toArray();
        java.lang.Object obj69 = linkedListTestDriver62.getFirst();
        experiment.util.Iterator iterator70 = linkedListTestDriver62.iterator();
        boolean boolean71 = linkedListTestDriver46.contains((java.lang.Object) iterator70);
        java.lang.Object obj74 = linkedListTestDriver46.set((int) (short) 0, (java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver75 = new experiment.util.LinkedListTestDriver();
        boolean boolean77 = linkedListTestDriver75.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj78 = new java.lang.Object();
        linkedListTestDriver75.addFirst(obj78);
        experiment.util.Iterator iterator80 = linkedListTestDriver75.iterator();
        java.lang.Object[] objArray81 = linkedListTestDriver75.toArray();
        boolean boolean82 = linkedListTestDriver46.equals_CUT((java.lang.Object) objArray81);
        java.lang.Object obj83 = linkedListTestDriver46.getLast();
        linkedListTestDriver38.addLast((java.lang.Object) linkedListTestDriver46);
        java.lang.Object obj85 = linkedListTestDriver38.removeFirst();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "hi!" + "'", obj3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + "hi!" + "'", obj35, "hi!");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + "hi!" + "'", obj49, "hi!");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(iterator59);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(iterator67);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertNotNull(obj69);
        org.junit.Assert.assertNotNull(iterator70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + obj74 + "' != '" + '#' + "'", obj74, '#');
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(iterator80);
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(obj83);
        org.junit.Assert.assertNotNull(obj85);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test139");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.clear();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) (short) 1);
        int int4 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj9 = new java.lang.Object();
        linkedListTestDriver6.addFirst(obj9);
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.clear();
        boolean boolean14 = linkedListTestDriver11.remove((java.lang.Object) (byte) 0);
        boolean boolean15 = linkedListTestDriver6.contains((java.lang.Object) linkedListTestDriver11);
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        boolean boolean18 = linkedListTestDriver16.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj19 = new java.lang.Object();
        linkedListTestDriver16.addFirst(obj19);
        java.lang.Object obj21 = linkedListTestDriver16.getLast();
        boolean boolean22 = linkedListTestDriver16.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        boolean boolean25 = linkedListTestDriver23.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj26 = new java.lang.Object();
        linkedListTestDriver23.addFirst(obj26);
        experiment.util.Iterator iterator28 = linkedListTestDriver23.iterator();
        boolean boolean29 = linkedListTestDriver16.add((java.lang.Object) linkedListTestDriver23);
        linkedListTestDriver11.addFirst((java.lang.Object) linkedListTestDriver16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = linkedListTestDriver0.set((int) '4', (java.lang.Object) linkedListTestDriver16);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test140");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver5.clear();
        boolean boolean8 = linkedListTestDriver5.remove((java.lang.Object) (byte) 0);
        boolean boolean9 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        boolean boolean12 = linkedListTestDriver10.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj13 = new java.lang.Object();
        linkedListTestDriver10.addFirst(obj13);
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        boolean boolean17 = linkedListTestDriver15.add((java.lang.Object) "hi!");
        java.lang.Object obj18 = linkedListTestDriver15.removeLast();
        linkedListTestDriver15.addLast((java.lang.Object) '#');
        linkedListTestDriver10.addLast((java.lang.Object) linkedListTestDriver15);
        boolean boolean23 = linkedListTestDriver10.remove((java.lang.Object) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        boolean boolean27 = linkedListTestDriver25.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj28 = new java.lang.Object();
        linkedListTestDriver25.addFirst(obj28);
        experiment.util.Iterator iterator30 = linkedListTestDriver25.iterator();
        experiment.util.Iterator iterator31 = linkedListTestDriver25.iterator();
        linkedListTestDriver10.add(2, (java.lang.Object) linkedListTestDriver25);
        boolean boolean33 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver25);
        java.lang.Class<?> wildcardClass34 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "hi!" + "'", obj18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test141");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) "hi!");
        java.lang.Object obj3 = linkedListTestDriver0.removeFirst();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj9 = new java.lang.Object();
        linkedListTestDriver6.addFirst(obj9);
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver11.add((java.lang.Object) "hi!");
        java.lang.Object obj14 = linkedListTestDriver11.removeLast();
        linkedListTestDriver11.addLast((java.lang.Object) '#');
        linkedListTestDriver6.addLast((java.lang.Object) linkedListTestDriver11);
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        boolean boolean21 = linkedListTestDriver19.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj22 = new java.lang.Object();
        linkedListTestDriver19.addFirst(obj22);
        experiment.util.Iterator iterator24 = linkedListTestDriver19.iterator();
        java.lang.Object[] objArray25 = linkedListTestDriver19.toArray();
        linkedListTestDriver11.add((int) (byte) 1, (java.lang.Object) linkedListTestDriver19);
        java.lang.Object obj28 = linkedListTestDriver11.get(1);
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        boolean boolean31 = linkedListTestDriver29.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj32 = new java.lang.Object();
        linkedListTestDriver29.addFirst(obj32);
        java.lang.Object obj34 = linkedListTestDriver29.getLast();
        boolean boolean35 = linkedListTestDriver29.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver36 = new experiment.util.LinkedListTestDriver();
        boolean boolean38 = linkedListTestDriver36.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj39 = new java.lang.Object();
        linkedListTestDriver36.addFirst(obj39);
        experiment.util.Iterator iterator41 = linkedListTestDriver36.iterator();
        boolean boolean42 = linkedListTestDriver29.add((java.lang.Object) linkedListTestDriver36);
        java.lang.Object obj43 = linkedListTestDriver36.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver44 = new experiment.util.LinkedListTestDriver();
        boolean boolean46 = linkedListTestDriver44.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj47 = new java.lang.Object();
        linkedListTestDriver44.addFirst(obj47);
        experiment.util.LinkedListTestDriver linkedListTestDriver49 = new experiment.util.LinkedListTestDriver();
        boolean boolean51 = linkedListTestDriver49.add((java.lang.Object) "hi!");
        java.lang.Object obj52 = linkedListTestDriver49.removeLast();
        linkedListTestDriver49.addLast((java.lang.Object) '#');
        linkedListTestDriver44.addLast((java.lang.Object) linkedListTestDriver49);
        experiment.util.LinkedListTestDriver linkedListTestDriver57 = new experiment.util.LinkedListTestDriver();
        boolean boolean59 = linkedListTestDriver57.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj60 = new java.lang.Object();
        linkedListTestDriver57.addFirst(obj60);
        experiment.util.Iterator iterator62 = linkedListTestDriver57.iterator();
        java.lang.Object[] objArray63 = linkedListTestDriver57.toArray();
        linkedListTestDriver49.add((int) (byte) 1, (java.lang.Object) linkedListTestDriver57);
        boolean boolean65 = linkedListTestDriver36.contains((java.lang.Object) linkedListTestDriver49);
        boolean boolean66 = linkedListTestDriver11.contains((java.lang.Object) linkedListTestDriver36);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) (short) 10, (java.lang.Object) linkedListTestDriver11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "hi!" + "'", obj3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "hi!" + "'", obj14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(iterator41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + "hi!" + "'", obj52, "hi!");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(iterator62);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test142");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = new java.lang.Object();
        linkedListTestDriver7.addFirst(obj10);
        experiment.util.Iterator iterator12 = linkedListTestDriver7.iterator();
        boolean boolean13 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver7);
        linkedListTestDriver7.add((int) (byte) 1, (java.lang.Object) (-1.0d));
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        boolean boolean19 = linkedListTestDriver17.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj20 = new java.lang.Object();
        linkedListTestDriver17.addFirst(obj20);
        experiment.util.Iterator iterator22 = linkedListTestDriver17.iterator();
        java.lang.Object[] objArray23 = linkedListTestDriver17.toArray();
        java.lang.Object obj24 = linkedListTestDriver17.getFirst();
        experiment.util.Iterator iterator25 = linkedListTestDriver17.iterator();
        java.lang.Object obj26 = linkedListTestDriver17.getFirst();
        boolean boolean27 = linkedListTestDriver7.equals_CUT((java.lang.Object) linkedListTestDriver17);
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver29.clear();
        experiment.util.Iterator iterator31 = linkedListTestDriver29.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = linkedListTestDriver17.set((int) (short) -1, (java.lang.Object) iterator31);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(iterator31);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test143");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) "hi!");
        java.lang.Object obj3 = linkedListTestDriver0.removeLast();
        linkedListTestDriver0.addLast((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj9 = new java.lang.Object();
        linkedListTestDriver6.addFirst(obj9);
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.clear();
        boolean boolean14 = linkedListTestDriver11.remove((java.lang.Object) (byte) 0);
        boolean boolean15 = linkedListTestDriver6.contains((java.lang.Object) linkedListTestDriver11);
        boolean boolean16 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = linkedListTestDriver11.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "hi!" + "'", obj3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test144");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray6 = linkedListTestDriver0.toArray();
        java.lang.Object obj7 = linkedListTestDriver0.getFirst();
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        java.lang.Object obj9 = linkedListTestDriver0.getFirst();
        java.lang.Object obj10 = linkedListTestDriver0.removeFirst();
        boolean boolean11 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        boolean boolean14 = linkedListTestDriver12.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj15 = new java.lang.Object();
        linkedListTestDriver12.addFirst(obj15);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        boolean boolean19 = linkedListTestDriver17.add((java.lang.Object) "hi!");
        java.lang.Object obj20 = linkedListTestDriver17.removeLast();
        linkedListTestDriver17.addLast((java.lang.Object) '#');
        linkedListTestDriver12.addLast((java.lang.Object) linkedListTestDriver17);
        boolean boolean24 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver17);
        java.lang.Object[] objArray25 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "hi!" + "'", obj20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test145");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray6 = linkedListTestDriver0.toArray();
        java.lang.Object obj7 = linkedListTestDriver0.getFirst();
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        java.lang.Object obj9 = linkedListTestDriver0.getFirst();
        boolean boolean11 = linkedListTestDriver0.contains((java.lang.Object) 100.0d);
        java.lang.Object obj12 = linkedListTestDriver0.getFirst();
        java.lang.Object obj13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = linkedListTestDriver0.remove(obj13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test146");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray6 = linkedListTestDriver0.toArray();
        java.lang.Object obj7 = linkedListTestDriver0.getFirst();
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        int int9 = linkedListTestDriver0.size();
        java.lang.Object obj10 = linkedListTestDriver0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = linkedListTestDriver0.remove((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test147");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        boolean boolean4 = linkedListTestDriver2.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj5 = new java.lang.Object();
        linkedListTestDriver2.addFirst(obj5);
        java.lang.Object obj7 = linkedListTestDriver2.getLast();
        boolean boolean8 = linkedListTestDriver2.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj12 = new java.lang.Object();
        linkedListTestDriver9.addFirst(obj12);
        experiment.util.Iterator iterator14 = linkedListTestDriver9.iterator();
        boolean boolean15 = linkedListTestDriver2.add((java.lang.Object) linkedListTestDriver9);
        linkedListTestDriver9.add((int) (byte) 1, (java.lang.Object) (-1.0d));
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        boolean boolean22 = linkedListTestDriver20.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj23 = new java.lang.Object();
        linkedListTestDriver20.addFirst(obj23);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        boolean boolean27 = linkedListTestDriver25.add((java.lang.Object) "hi!");
        java.lang.Object obj28 = linkedListTestDriver25.removeLast();
        linkedListTestDriver25.addLast((java.lang.Object) '#');
        linkedListTestDriver20.addLast((java.lang.Object) linkedListTestDriver25);
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        boolean boolean34 = linkedListTestDriver32.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj35 = new java.lang.Object();
        linkedListTestDriver32.addFirst(obj35);
        experiment.util.Iterator iterator37 = linkedListTestDriver32.iterator();
        java.lang.Object[] objArray38 = linkedListTestDriver32.toArray();
        java.lang.Object obj39 = linkedListTestDriver32.getFirst();
        linkedListTestDriver25.addLast((java.lang.Object) linkedListTestDriver32);
        experiment.util.LinkedListTestDriver linkedListTestDriver41 = new experiment.util.LinkedListTestDriver();
        boolean boolean43 = linkedListTestDriver41.add((java.lang.Object) "hi!");
        linkedListTestDriver25.addLast((java.lang.Object) linkedListTestDriver41);
        boolean boolean45 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver41);
        experiment.util.LinkedListTestDriver linkedListTestDriver46 = new experiment.util.LinkedListTestDriver();
        boolean boolean48 = linkedListTestDriver46.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj49 = new java.lang.Object();
        linkedListTestDriver46.addFirst(obj49);
        experiment.util.Iterator iterator51 = linkedListTestDriver46.iterator();
        java.lang.Object[] objArray52 = linkedListTestDriver46.toArray();
        java.lang.Object obj53 = linkedListTestDriver46.getFirst();
        experiment.util.Iterator iterator54 = linkedListTestDriver46.iterator();
        java.lang.Object obj55 = linkedListTestDriver46.getFirst();
        linkedListTestDriver41.addLast((java.lang.Object) linkedListTestDriver46);
        boolean boolean57 = linkedListTestDriver46.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "hi!" + "'", obj28, "hi!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(iterator51);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertNotNull(iterator54);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test148");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = new java.lang.Object();
        linkedListTestDriver7.addFirst(obj10);
        experiment.util.Iterator iterator12 = linkedListTestDriver7.iterator();
        boolean boolean13 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver7);
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        boolean boolean16 = linkedListTestDriver14.add((java.lang.Object) "hi!");
        java.lang.Object obj17 = linkedListTestDriver14.removeFirst();
        boolean boolean18 = linkedListTestDriver7.contains((java.lang.Object) linkedListTestDriver14);
        linkedListTestDriver14.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        boolean boolean21 = linkedListTestDriver14.contains((java.lang.Object) linkedListTestDriver20);
        boolean boolean22 = linkedListTestDriver14.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "hi!" + "'", obj17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test149");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) "hi!");
        java.lang.Object obj8 = linkedListTestDriver5.removeLast();
        linkedListTestDriver5.addLast((java.lang.Object) '#');
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj16 = new java.lang.Object();
        linkedListTestDriver13.addFirst(obj16);
        experiment.util.Iterator iterator18 = linkedListTestDriver13.iterator();
        java.lang.Object[] objArray19 = linkedListTestDriver13.toArray();
        linkedListTestDriver5.add((int) (byte) 1, (java.lang.Object) linkedListTestDriver13);
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        boolean boolean23 = linkedListTestDriver21.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj24 = new java.lang.Object();
        linkedListTestDriver21.addFirst(obj24);
        experiment.util.Iterator iterator26 = linkedListTestDriver21.iterator();
        java.lang.Object[] objArray27 = linkedListTestDriver21.toArray();
        java.lang.Object obj28 = linkedListTestDriver21.getFirst();
        experiment.util.Iterator iterator29 = linkedListTestDriver21.iterator();
        boolean boolean30 = linkedListTestDriver5.contains((java.lang.Object) iterator29);
        linkedListTestDriver5.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = linkedListTestDriver5.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test150");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = new java.lang.Object();
        linkedListTestDriver7.addFirst(obj10);
        experiment.util.Iterator iterator12 = linkedListTestDriver7.iterator();
        boolean boolean13 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver7);
        int int14 = linkedListTestDriver7.size();
        boolean boolean16 = linkedListTestDriver7.equals_CUT((java.lang.Object) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = linkedListTestDriver7.get((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test151");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) "hi!");
        java.lang.Object obj8 = linkedListTestDriver5.removeLast();
        linkedListTestDriver5.addLast((java.lang.Object) '#');
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        boolean boolean14 = linkedListTestDriver12.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj15 = new java.lang.Object();
        linkedListTestDriver12.addFirst(obj15);
        experiment.util.Iterator iterator17 = linkedListTestDriver12.iterator();
        java.lang.Object[] objArray18 = linkedListTestDriver12.toArray();
        java.lang.Object obj19 = linkedListTestDriver12.getFirst();
        experiment.util.Iterator iterator20 = linkedListTestDriver12.iterator();
        java.lang.Object obj21 = linkedListTestDriver12.getFirst();
        boolean boolean22 = linkedListTestDriver5.add((java.lang.Object) linkedListTestDriver12);
        java.lang.Object obj23 = linkedListTestDriver5.removeFirst();
        java.lang.Object[] objArray24 = linkedListTestDriver5.toArray();
        int int25 = linkedListTestDriver5.size();
        int int26 = linkedListTestDriver5.size();
        boolean boolean27 = linkedListTestDriver5.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = linkedListTestDriver5.get((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + '#' + "'", obj23, '#');
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test152");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray6 = linkedListTestDriver0.toArray();
        java.lang.Object obj7 = linkedListTestDriver0.getFirst();
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        java.lang.Object obj9 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver11.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj14 = new java.lang.Object();
        linkedListTestDriver11.addFirst(obj14);
        java.lang.Object obj16 = linkedListTestDriver11.getLast();
        boolean boolean17 = linkedListTestDriver11.isEmpty();
        linkedListTestDriver0.add(1, (java.lang.Object) boolean17);
        java.lang.Object obj20 = linkedListTestDriver0.remove(1);
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass23 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test153");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        java.lang.Object obj8 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.add((java.lang.Object) "hi!");
        java.lang.Object obj12 = linkedListTestDriver9.removeLast();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = linkedListTestDriver9.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "hi!" + "'", obj12, "hi!");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test154");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) "hi!");
        java.lang.Object obj8 = linkedListTestDriver5.removeLast();
        linkedListTestDriver5.addLast((java.lang.Object) '#');
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        boolean boolean13 = linkedListTestDriver0.remove((java.lang.Object) 10);
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add(3, (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 3; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test155");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) "hi!");
        java.lang.Object obj3 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj7 = new java.lang.Object();
        linkedListTestDriver4.addFirst(obj7);
        java.lang.Object obj9 = linkedListTestDriver4.getLast();
        boolean boolean10 = linkedListTestDriver4.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver11.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj14 = new java.lang.Object();
        linkedListTestDriver11.addFirst(obj14);
        experiment.util.Iterator iterator16 = linkedListTestDriver11.iterator();
        boolean boolean17 = linkedListTestDriver4.add((java.lang.Object) linkedListTestDriver11);
        java.lang.Object obj18 = linkedListTestDriver11.removeFirst();
        java.lang.Object[] objArray19 = linkedListTestDriver11.toArray();
        boolean boolean20 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver11);
        linkedListTestDriver11.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        boolean boolean24 = linkedListTestDriver22.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj25 = new java.lang.Object();
        linkedListTestDriver22.addFirst(obj25);
        java.lang.Object obj27 = linkedListTestDriver22.getLast();
        boolean boolean28 = linkedListTestDriver11.remove((java.lang.Object) linkedListTestDriver22);
        experiment.util.Iterator iterator29 = linkedListTestDriver22.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver30.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        boolean boolean34 = linkedListTestDriver32.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj35 = new java.lang.Object();
        linkedListTestDriver32.addFirst(obj35);
        java.lang.Object obj37 = linkedListTestDriver32.getLast();
        boolean boolean38 = linkedListTestDriver32.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver39 = new experiment.util.LinkedListTestDriver();
        boolean boolean41 = linkedListTestDriver39.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj42 = new java.lang.Object();
        linkedListTestDriver39.addFirst(obj42);
        experiment.util.Iterator iterator44 = linkedListTestDriver39.iterator();
        boolean boolean45 = linkedListTestDriver32.add((java.lang.Object) linkedListTestDriver39);
        linkedListTestDriver39.add((int) (byte) 1, (java.lang.Object) (-1.0d));
        linkedListTestDriver30.addFirst((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver50 = new experiment.util.LinkedListTestDriver();
        boolean boolean52 = linkedListTestDriver50.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj53 = new java.lang.Object();
        linkedListTestDriver50.addFirst(obj53);
        experiment.util.LinkedListTestDriver linkedListTestDriver55 = new experiment.util.LinkedListTestDriver();
        boolean boolean57 = linkedListTestDriver55.add((java.lang.Object) "hi!");
        java.lang.Object obj58 = linkedListTestDriver55.removeLast();
        linkedListTestDriver55.addLast((java.lang.Object) '#');
        linkedListTestDriver50.addLast((java.lang.Object) linkedListTestDriver55);
        experiment.util.LinkedListTestDriver linkedListTestDriver62 = new experiment.util.LinkedListTestDriver();
        boolean boolean64 = linkedListTestDriver62.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj65 = new java.lang.Object();
        linkedListTestDriver62.addFirst(obj65);
        experiment.util.Iterator iterator67 = linkedListTestDriver62.iterator();
        java.lang.Object[] objArray68 = linkedListTestDriver62.toArray();
        java.lang.Object obj69 = linkedListTestDriver62.getFirst();
        linkedListTestDriver55.addLast((java.lang.Object) linkedListTestDriver62);
        experiment.util.LinkedListTestDriver linkedListTestDriver71 = new experiment.util.LinkedListTestDriver();
        boolean boolean73 = linkedListTestDriver71.add((java.lang.Object) "hi!");
        linkedListTestDriver55.addLast((java.lang.Object) linkedListTestDriver71);
        boolean boolean75 = linkedListTestDriver30.remove((java.lang.Object) linkedListTestDriver71);
        java.lang.Object obj76 = linkedListTestDriver30.getLast();
        linkedListTestDriver22.addFirst((java.lang.Object) linkedListTestDriver30);
        boolean boolean78 = linkedListTestDriver22.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "hi!" + "'", obj3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(iterator44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + "hi!" + "'", obj58, "hi!");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(iterator67);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertNotNull(obj69);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertEquals("'" + obj76 + "' != '" + (byte) 1 + "'", obj76, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test156");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray6 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test157");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray6 = linkedListTestDriver0.toArray();
        java.lang.Object obj7 = linkedListTestDriver0.getFirst();
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        java.lang.Object obj9 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver11.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj14 = new java.lang.Object();
        linkedListTestDriver11.addFirst(obj14);
        java.lang.Object obj16 = linkedListTestDriver11.getLast();
        boolean boolean17 = linkedListTestDriver11.isEmpty();
        linkedListTestDriver0.add(1, (java.lang.Object) boolean17);
        java.lang.Object obj20 = linkedListTestDriver0.remove(1);
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 0);
        boolean boolean23 = linkedListTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass24 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test158");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) "hi!");
        java.lang.Object obj8 = linkedListTestDriver5.removeLast();
        linkedListTestDriver5.addLast((java.lang.Object) '#');
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        boolean boolean14 = linkedListTestDriver12.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj15 = new java.lang.Object();
        linkedListTestDriver12.addFirst(obj15);
        experiment.util.Iterator iterator17 = linkedListTestDriver12.iterator();
        java.lang.Object[] objArray18 = linkedListTestDriver12.toArray();
        java.lang.Object obj19 = linkedListTestDriver12.getFirst();
        linkedListTestDriver5.addLast((java.lang.Object) linkedListTestDriver12);
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        boolean boolean23 = linkedListTestDriver21.add((java.lang.Object) "hi!");
        linkedListTestDriver5.addLast((java.lang.Object) linkedListTestDriver21);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        boolean boolean27 = linkedListTestDriver25.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj28 = new java.lang.Object();
        linkedListTestDriver25.addFirst(obj28);
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        boolean boolean32 = linkedListTestDriver30.add((java.lang.Object) "hi!");
        java.lang.Object obj33 = linkedListTestDriver30.removeLast();
        linkedListTestDriver30.addLast((java.lang.Object) '#');
        linkedListTestDriver25.addLast((java.lang.Object) linkedListTestDriver30);
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        boolean boolean39 = linkedListTestDriver37.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj40 = new java.lang.Object();
        linkedListTestDriver37.addFirst(obj40);
        experiment.util.Iterator iterator42 = linkedListTestDriver37.iterator();
        java.lang.Object[] objArray43 = linkedListTestDriver37.toArray();
        java.lang.Object obj44 = linkedListTestDriver37.getFirst();
        linkedListTestDriver30.addLast((java.lang.Object) linkedListTestDriver37);
        java.lang.Object[] objArray46 = linkedListTestDriver37.toArray();
        experiment.util.ListIterator listIterator48 = linkedListTestDriver37.listIterator(0);
        linkedListTestDriver21.addLast((java.lang.Object) linkedListTestDriver37);
        experiment.util.LinkedListTestDriver linkedListTestDriver50 = new experiment.util.LinkedListTestDriver();
        boolean boolean52 = linkedListTestDriver50.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj53 = new java.lang.Object();
        linkedListTestDriver50.addFirst(obj53);
        experiment.util.LinkedListTestDriver linkedListTestDriver55 = new experiment.util.LinkedListTestDriver();
        boolean boolean57 = linkedListTestDriver55.add((java.lang.Object) "hi!");
        java.lang.Object obj58 = linkedListTestDriver55.removeLast();
        linkedListTestDriver55.addLast((java.lang.Object) '#');
        linkedListTestDriver50.addLast((java.lang.Object) linkedListTestDriver55);
        experiment.util.LinkedListTestDriver linkedListTestDriver63 = new experiment.util.LinkedListTestDriver();
        boolean boolean65 = linkedListTestDriver63.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj66 = new java.lang.Object();
        linkedListTestDriver63.addFirst(obj66);
        experiment.util.Iterator iterator68 = linkedListTestDriver63.iterator();
        java.lang.Object[] objArray69 = linkedListTestDriver63.toArray();
        linkedListTestDriver55.add((int) (byte) 1, (java.lang.Object) linkedListTestDriver63);
        java.lang.Object obj72 = linkedListTestDriver55.get(1);
        linkedListTestDriver37.addLast((java.lang.Object) linkedListTestDriver55);
        experiment.util.Iterator iterator74 = linkedListTestDriver37.iterator();
        java.lang.Object obj75 = linkedListTestDriver37.removeFirst();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "hi!" + "'", obj33, "hi!");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(iterator42);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(listIterator48);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + "hi!" + "'", obj58, "hi!");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(iterator68);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertNotNull(obj72);
        org.junit.Assert.assertNotNull(iterator74);
        org.junit.Assert.assertNotNull(obj75);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test159");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray6 = linkedListTestDriver0.toArray();
        java.lang.Object obj7 = linkedListTestDriver0.getFirst();
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        java.lang.Object obj9 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver11.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj14 = new java.lang.Object();
        linkedListTestDriver11.addFirst(obj14);
        java.lang.Object obj16 = linkedListTestDriver11.getLast();
        boolean boolean17 = linkedListTestDriver11.isEmpty();
        linkedListTestDriver0.add(1, (java.lang.Object) boolean17);
        java.lang.Object obj20 = linkedListTestDriver0.remove(1);
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 0);
        boolean boolean23 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        boolean boolean26 = linkedListTestDriver24.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj27 = new java.lang.Object();
        linkedListTestDriver24.addFirst(obj27);
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        boolean boolean31 = linkedListTestDriver29.add((java.lang.Object) "hi!");
        java.lang.Object obj32 = linkedListTestDriver29.removeLast();
        linkedListTestDriver29.addLast((java.lang.Object) '#');
        linkedListTestDriver24.addLast((java.lang.Object) linkedListTestDriver29);
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        boolean boolean39 = linkedListTestDriver37.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj40 = new java.lang.Object();
        linkedListTestDriver37.addFirst(obj40);
        experiment.util.Iterator iterator42 = linkedListTestDriver37.iterator();
        java.lang.Object[] objArray43 = linkedListTestDriver37.toArray();
        linkedListTestDriver29.add((int) (byte) 1, (java.lang.Object) linkedListTestDriver37);
        experiment.util.LinkedListTestDriver linkedListTestDriver45 = new experiment.util.LinkedListTestDriver();
        boolean boolean47 = linkedListTestDriver45.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj48 = new java.lang.Object();
        linkedListTestDriver45.addFirst(obj48);
        experiment.util.Iterator iterator50 = linkedListTestDriver45.iterator();
        java.lang.Object[] objArray51 = linkedListTestDriver45.toArray();
        java.lang.Object obj52 = linkedListTestDriver45.getFirst();
        experiment.util.Iterator iterator53 = linkedListTestDriver45.iterator();
        boolean boolean54 = linkedListTestDriver29.contains((java.lang.Object) iterator53);
        java.lang.Object obj57 = linkedListTestDriver29.set((int) (short) 0, (java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver58 = new experiment.util.LinkedListTestDriver();
        boolean boolean60 = linkedListTestDriver58.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj61 = new java.lang.Object();
        linkedListTestDriver58.addFirst(obj61);
        experiment.util.Iterator iterator63 = linkedListTestDriver58.iterator();
        java.lang.Object[] objArray64 = linkedListTestDriver58.toArray();
        boolean boolean65 = linkedListTestDriver29.equals_CUT((java.lang.Object) objArray64);
        boolean boolean66 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver29);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator68 = linkedListTestDriver0.listIterator((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 97; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + "hi!" + "'", obj32, "hi!");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(iterator42);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(iterator50);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertNotNull(iterator53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + '#' + "'", obj57, '#');
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(iterator63);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test160");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray6 = linkedListTestDriver0.toArray();
        java.lang.Object obj7 = linkedListTestDriver0.getFirst();
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        java.lang.Object obj9 = linkedListTestDriver0.getFirst();
        java.lang.Object obj10 = linkedListTestDriver0.removeFirst();
        boolean boolean11 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        boolean boolean14 = linkedListTestDriver12.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj15 = new java.lang.Object();
        linkedListTestDriver12.addFirst(obj15);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        boolean boolean19 = linkedListTestDriver17.add((java.lang.Object) "hi!");
        java.lang.Object obj20 = linkedListTestDriver17.removeLast();
        linkedListTestDriver17.addLast((java.lang.Object) '#');
        linkedListTestDriver12.addLast((java.lang.Object) linkedListTestDriver17);
        boolean boolean25 = linkedListTestDriver12.remove((java.lang.Object) 10);
        boolean boolean26 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = linkedListTestDriver0.get(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "hi!" + "'", obj20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test161");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) "hi!");
        java.lang.Object obj3 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj7 = new java.lang.Object();
        linkedListTestDriver4.addFirst(obj7);
        java.lang.Object obj9 = linkedListTestDriver4.getLast();
        boolean boolean10 = linkedListTestDriver4.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver11.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj14 = new java.lang.Object();
        linkedListTestDriver11.addFirst(obj14);
        experiment.util.Iterator iterator16 = linkedListTestDriver11.iterator();
        boolean boolean17 = linkedListTestDriver4.add((java.lang.Object) linkedListTestDriver11);
        java.lang.Object obj18 = linkedListTestDriver11.removeFirst();
        java.lang.Object[] objArray19 = linkedListTestDriver11.toArray();
        boolean boolean20 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = linkedListTestDriver0.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "hi!" + "'", obj3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test162");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        java.lang.Object obj8 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.add((java.lang.Object) "hi!");
        java.lang.Object obj12 = linkedListTestDriver9.removeLast();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = linkedListTestDriver0.get((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "hi!" + "'", obj12, "hi!");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test163");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        boolean boolean4 = linkedListTestDriver2.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj5 = new java.lang.Object();
        linkedListTestDriver2.addFirst(obj5);
        java.lang.Object obj7 = linkedListTestDriver2.getLast();
        boolean boolean8 = linkedListTestDriver2.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj12 = new java.lang.Object();
        linkedListTestDriver9.addFirst(obj12);
        experiment.util.Iterator iterator14 = linkedListTestDriver9.iterator();
        boolean boolean15 = linkedListTestDriver2.add((java.lang.Object) linkedListTestDriver9);
        linkedListTestDriver9.add((int) (byte) 1, (java.lang.Object) (-1.0d));
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        boolean boolean22 = linkedListTestDriver20.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj23 = new java.lang.Object();
        linkedListTestDriver20.addFirst(obj23);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        boolean boolean27 = linkedListTestDriver25.add((java.lang.Object) "hi!");
        java.lang.Object obj28 = linkedListTestDriver25.removeLast();
        linkedListTestDriver25.addLast((java.lang.Object) '#');
        linkedListTestDriver20.addLast((java.lang.Object) linkedListTestDriver25);
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        boolean boolean34 = linkedListTestDriver32.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj35 = new java.lang.Object();
        linkedListTestDriver32.addFirst(obj35);
        experiment.util.Iterator iterator37 = linkedListTestDriver32.iterator();
        java.lang.Object[] objArray38 = linkedListTestDriver32.toArray();
        java.lang.Object obj39 = linkedListTestDriver32.getFirst();
        linkedListTestDriver25.addLast((java.lang.Object) linkedListTestDriver32);
        experiment.util.LinkedListTestDriver linkedListTestDriver41 = new experiment.util.LinkedListTestDriver();
        boolean boolean43 = linkedListTestDriver41.add((java.lang.Object) "hi!");
        linkedListTestDriver25.addLast((java.lang.Object) linkedListTestDriver41);
        boolean boolean45 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver41);
        experiment.util.LinkedListTestDriver linkedListTestDriver46 = new experiment.util.LinkedListTestDriver();
        boolean boolean48 = linkedListTestDriver46.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj49 = new java.lang.Object();
        linkedListTestDriver46.addFirst(obj49);
        experiment.util.Iterator iterator51 = linkedListTestDriver46.iterator();
        java.lang.Object[] objArray52 = linkedListTestDriver46.toArray();
        java.lang.Object obj53 = linkedListTestDriver46.getFirst();
        experiment.util.Iterator iterator54 = linkedListTestDriver46.iterator();
        java.lang.Object obj55 = linkedListTestDriver46.getFirst();
        linkedListTestDriver41.addLast((java.lang.Object) linkedListTestDriver46);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator58 = linkedListTestDriver41.listIterator(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "hi!" + "'", obj28, "hi!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(iterator51);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertNotNull(iterator54);
        org.junit.Assert.assertNotNull(obj55);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test164");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray6 = linkedListTestDriver0.toArray();
        java.lang.Object obj7 = linkedListTestDriver0.getFirst();
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        java.lang.Object obj9 = linkedListTestDriver0.getFirst();
        java.lang.Object obj10 = linkedListTestDriver0.removeFirst();
        boolean boolean11 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        boolean boolean14 = linkedListTestDriver12.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj15 = new java.lang.Object();
        linkedListTestDriver12.addFirst(obj15);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        boolean boolean19 = linkedListTestDriver17.add((java.lang.Object) "hi!");
        java.lang.Object obj20 = linkedListTestDriver17.removeLast();
        linkedListTestDriver17.addLast((java.lang.Object) '#');
        linkedListTestDriver12.addLast((java.lang.Object) linkedListTestDriver17);
        boolean boolean24 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver17);
        java.lang.Object[] objArray25 = linkedListTestDriver17.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        boolean boolean28 = linkedListTestDriver26.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj29 = new java.lang.Object();
        linkedListTestDriver26.addFirst(obj29);
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        boolean boolean33 = linkedListTestDriver31.add((java.lang.Object) "hi!");
        java.lang.Object obj34 = linkedListTestDriver31.removeLast();
        linkedListTestDriver31.addLast((java.lang.Object) '#');
        linkedListTestDriver26.addLast((java.lang.Object) linkedListTestDriver31);
        experiment.util.LinkedListTestDriver linkedListTestDriver38 = new experiment.util.LinkedListTestDriver();
        boolean boolean40 = linkedListTestDriver38.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj41 = new java.lang.Object();
        linkedListTestDriver38.addFirst(obj41);
        experiment.util.Iterator iterator43 = linkedListTestDriver38.iterator();
        java.lang.Object[] objArray44 = linkedListTestDriver38.toArray();
        java.lang.Object obj45 = linkedListTestDriver38.getFirst();
        experiment.util.Iterator iterator46 = linkedListTestDriver38.iterator();
        java.lang.Object obj47 = linkedListTestDriver38.getFirst();
        boolean boolean48 = linkedListTestDriver31.add((java.lang.Object) linkedListTestDriver38);
        java.lang.Object obj49 = linkedListTestDriver31.removeFirst();
        java.lang.Object[] objArray50 = linkedListTestDriver31.toArray();
        linkedListTestDriver17.addFirst((java.lang.Object) linkedListTestDriver31);
        experiment.util.LinkedListTestDriver linkedListTestDriver53 = new experiment.util.LinkedListTestDriver();
        boolean boolean55 = linkedListTestDriver53.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj56 = new java.lang.Object();
        linkedListTestDriver53.addFirst(obj56);
        experiment.util.Iterator iterator58 = linkedListTestDriver53.iterator();
        java.lang.Object[] objArray59 = linkedListTestDriver53.toArray();
        java.lang.Object obj60 = linkedListTestDriver53.getFirst();
        experiment.util.Iterator iterator61 = linkedListTestDriver53.iterator();
        java.lang.Object obj62 = linkedListTestDriver53.getFirst();
        java.lang.Object obj63 = linkedListTestDriver53.removeFirst();
        boolean boolean64 = linkedListTestDriver53.isEmpty();
        experiment.util.Iterator iterator65 = linkedListTestDriver53.iterator();
        java.lang.Object obj66 = linkedListTestDriver31.set((int) (byte) 0, (java.lang.Object) iterator65);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "hi!" + "'", obj20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[#]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[#]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + "hi!" + "'", obj34, "hi!");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(iterator43);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertNotNull(iterator46);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + '#' + "'", obj49, '#');
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(iterator58);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertNotNull(iterator61);
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertNotNull(obj63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(iterator65);
        org.junit.Assert.assertNotNull(obj66);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test165");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        java.lang.Object obj8 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj12 = new java.lang.Object();
        linkedListTestDriver9.addFirst(obj12);
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        boolean boolean16 = linkedListTestDriver14.add((java.lang.Object) "hi!");
        java.lang.Object obj17 = linkedListTestDriver14.removeLast();
        linkedListTestDriver14.addLast((java.lang.Object) '#');
        linkedListTestDriver9.addLast((java.lang.Object) linkedListTestDriver14);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        boolean boolean24 = linkedListTestDriver22.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj25 = new java.lang.Object();
        linkedListTestDriver22.addFirst(obj25);
        experiment.util.Iterator iterator27 = linkedListTestDriver22.iterator();
        java.lang.Object[] objArray28 = linkedListTestDriver22.toArray();
        linkedListTestDriver14.add((int) (byte) 1, (java.lang.Object) linkedListTestDriver22);
        java.lang.Object obj31 = linkedListTestDriver14.get(1);
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        boolean boolean34 = linkedListTestDriver32.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj35 = new java.lang.Object();
        linkedListTestDriver32.addFirst(obj35);
        java.lang.Object obj37 = linkedListTestDriver32.getLast();
        boolean boolean38 = linkedListTestDriver32.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver39 = new experiment.util.LinkedListTestDriver();
        boolean boolean41 = linkedListTestDriver39.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj42 = new java.lang.Object();
        linkedListTestDriver39.addFirst(obj42);
        experiment.util.Iterator iterator44 = linkedListTestDriver39.iterator();
        boolean boolean45 = linkedListTestDriver32.add((java.lang.Object) linkedListTestDriver39);
        java.lang.Object obj46 = linkedListTestDriver39.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver47 = new experiment.util.LinkedListTestDriver();
        boolean boolean49 = linkedListTestDriver47.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj50 = new java.lang.Object();
        linkedListTestDriver47.addFirst(obj50);
        experiment.util.LinkedListTestDriver linkedListTestDriver52 = new experiment.util.LinkedListTestDriver();
        boolean boolean54 = linkedListTestDriver52.add((java.lang.Object) "hi!");
        java.lang.Object obj55 = linkedListTestDriver52.removeLast();
        linkedListTestDriver52.addLast((java.lang.Object) '#');
        linkedListTestDriver47.addLast((java.lang.Object) linkedListTestDriver52);
        experiment.util.LinkedListTestDriver linkedListTestDriver60 = new experiment.util.LinkedListTestDriver();
        boolean boolean62 = linkedListTestDriver60.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj63 = new java.lang.Object();
        linkedListTestDriver60.addFirst(obj63);
        experiment.util.Iterator iterator65 = linkedListTestDriver60.iterator();
        java.lang.Object[] objArray66 = linkedListTestDriver60.toArray();
        linkedListTestDriver52.add((int) (byte) 1, (java.lang.Object) linkedListTestDriver60);
        boolean boolean68 = linkedListTestDriver39.contains((java.lang.Object) linkedListTestDriver52);
        boolean boolean69 = linkedListTestDriver14.contains((java.lang.Object) linkedListTestDriver39);
        boolean boolean70 = linkedListTestDriver0.contains((java.lang.Object) boolean69);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "hi!" + "'", obj17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(iterator44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + "hi!" + "'", obj55, "hi!");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(iterator65);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test166");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = new java.lang.Object();
        linkedListTestDriver7.addFirst(obj10);
        experiment.util.Iterator iterator12 = linkedListTestDriver7.iterator();
        boolean boolean13 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver7);
        java.lang.Object obj14 = linkedListTestDriver7.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        boolean boolean17 = linkedListTestDriver15.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = new java.lang.Object();
        linkedListTestDriver15.addFirst(obj18);
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        boolean boolean22 = linkedListTestDriver20.add((java.lang.Object) "hi!");
        java.lang.Object obj23 = linkedListTestDriver20.removeLast();
        linkedListTestDriver20.addLast((java.lang.Object) '#');
        linkedListTestDriver15.addLast((java.lang.Object) linkedListTestDriver20);
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        boolean boolean30 = linkedListTestDriver28.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj31 = new java.lang.Object();
        linkedListTestDriver28.addFirst(obj31);
        experiment.util.Iterator iterator33 = linkedListTestDriver28.iterator();
        java.lang.Object[] objArray34 = linkedListTestDriver28.toArray();
        linkedListTestDriver20.add((int) (byte) 1, (java.lang.Object) linkedListTestDriver28);
        boolean boolean36 = linkedListTestDriver7.contains((java.lang.Object) linkedListTestDriver20);
        java.lang.Object obj38 = linkedListTestDriver20.remove((int) (short) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver39 = new experiment.util.LinkedListTestDriver();
        boolean boolean41 = linkedListTestDriver39.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj42 = new java.lang.Object();
        linkedListTestDriver39.addFirst(obj42);
        java.lang.Object obj44 = linkedListTestDriver39.getLast();
        boolean boolean45 = linkedListTestDriver39.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver46 = new experiment.util.LinkedListTestDriver();
        boolean boolean48 = linkedListTestDriver46.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj49 = new java.lang.Object();
        linkedListTestDriver46.addFirst(obj49);
        experiment.util.Iterator iterator51 = linkedListTestDriver46.iterator();
        boolean boolean52 = linkedListTestDriver39.add((java.lang.Object) linkedListTestDriver46);
        linkedListTestDriver46.add((int) (byte) 1, (java.lang.Object) (-1.0d));
        experiment.util.LinkedListTestDriver linkedListTestDriver56 = new experiment.util.LinkedListTestDriver();
        boolean boolean58 = linkedListTestDriver56.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj59 = new java.lang.Object();
        linkedListTestDriver56.addFirst(obj59);
        experiment.util.Iterator iterator61 = linkedListTestDriver56.iterator();
        java.lang.Object[] objArray62 = linkedListTestDriver56.toArray();
        java.lang.Object obj63 = linkedListTestDriver56.getFirst();
        experiment.util.Iterator iterator64 = linkedListTestDriver56.iterator();
        java.lang.Object obj65 = linkedListTestDriver56.getFirst();
        boolean boolean66 = linkedListTestDriver46.equals_CUT((java.lang.Object) linkedListTestDriver56);
        java.lang.Object obj67 = linkedListTestDriver46.removeLast();
        boolean boolean68 = linkedListTestDriver20.equals_CUT(obj67);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "hi!" + "'", obj23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + '#' + "'", obj38, '#');
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(iterator51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(iterator61);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertNotNull(obj63);
        org.junit.Assert.assertNotNull(iterator64);
        org.junit.Assert.assertNotNull(obj65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + (-1.0d) + "'", obj67, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test167");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) "hi!");
        java.lang.Object obj3 = linkedListTestDriver0.removeLast();
        linkedListTestDriver0.addLast((java.lang.Object) '#');
        java.lang.Object[] objArray6 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        boolean boolean10 = linkedListTestDriver8.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj11 = new java.lang.Object();
        linkedListTestDriver8.addFirst(obj11);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.add((java.lang.Object) "hi!");
        java.lang.Object obj16 = linkedListTestDriver13.removeLast();
        linkedListTestDriver13.addLast((java.lang.Object) '#');
        linkedListTestDriver8.addLast((java.lang.Object) linkedListTestDriver13);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) (short) 100, (java.lang.Object) linkedListTestDriver8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 100; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "hi!" + "'", obj3, "hi!");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[#]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[#]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "hi!" + "'", obj16, "hi!");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test168");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = new java.lang.Object();
        linkedListTestDriver7.addFirst(obj10);
        experiment.util.Iterator iterator12 = linkedListTestDriver7.iterator();
        boolean boolean13 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver7);
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        boolean boolean16 = linkedListTestDriver14.add((java.lang.Object) "hi!");
        java.lang.Object obj17 = linkedListTestDriver14.removeFirst();
        boolean boolean18 = linkedListTestDriver7.contains((java.lang.Object) linkedListTestDriver14);
        java.lang.Object obj19 = linkedListTestDriver7.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        boolean boolean23 = linkedListTestDriver21.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj24 = new java.lang.Object();
        linkedListTestDriver21.addFirst(obj24);
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        boolean boolean28 = linkedListTestDriver26.add((java.lang.Object) "hi!");
        java.lang.Object obj29 = linkedListTestDriver26.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        boolean boolean32 = linkedListTestDriver30.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj33 = new java.lang.Object();
        linkedListTestDriver30.addFirst(obj33);
        java.lang.Object obj35 = linkedListTestDriver30.getLast();
        boolean boolean36 = linkedListTestDriver30.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        boolean boolean39 = linkedListTestDriver37.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj40 = new java.lang.Object();
        linkedListTestDriver37.addFirst(obj40);
        experiment.util.Iterator iterator42 = linkedListTestDriver37.iterator();
        boolean boolean43 = linkedListTestDriver30.add((java.lang.Object) linkedListTestDriver37);
        java.lang.Object obj44 = linkedListTestDriver37.removeFirst();
        java.lang.Object[] objArray45 = linkedListTestDriver37.toArray();
        boolean boolean46 = linkedListTestDriver26.equals_CUT((java.lang.Object) linkedListTestDriver37);
        linkedListTestDriver37.clear();
        boolean boolean48 = linkedListTestDriver37.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver49 = new experiment.util.LinkedListTestDriver();
        boolean boolean51 = linkedListTestDriver49.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj52 = new java.lang.Object();
        linkedListTestDriver49.addFirst(obj52);
        experiment.util.LinkedListTestDriver linkedListTestDriver54 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver54.clear();
        boolean boolean57 = linkedListTestDriver54.remove((java.lang.Object) (byte) 0);
        boolean boolean58 = linkedListTestDriver49.contains((java.lang.Object) linkedListTestDriver54);
        experiment.util.LinkedListTestDriver linkedListTestDriver59 = new experiment.util.LinkedListTestDriver();
        boolean boolean61 = linkedListTestDriver59.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj62 = new java.lang.Object();
        linkedListTestDriver59.addFirst(obj62);
        java.lang.Object obj64 = linkedListTestDriver59.getLast();
        boolean boolean65 = linkedListTestDriver59.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver66 = new experiment.util.LinkedListTestDriver();
        boolean boolean68 = linkedListTestDriver66.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj69 = new java.lang.Object();
        linkedListTestDriver66.addFirst(obj69);
        experiment.util.Iterator iterator71 = linkedListTestDriver66.iterator();
        boolean boolean72 = linkedListTestDriver59.add((java.lang.Object) linkedListTestDriver66);
        linkedListTestDriver54.addFirst((java.lang.Object) linkedListTestDriver59);
        experiment.util.Iterator iterator74 = linkedListTestDriver54.iterator();
        boolean boolean75 = linkedListTestDriver37.equals_CUT((java.lang.Object) linkedListTestDriver54);
        boolean boolean76 = linkedListTestDriver21.equals_CUT((java.lang.Object) linkedListTestDriver54);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver7.add((int) (byte) 100, (java.lang.Object) linkedListTestDriver21);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 100; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "hi!" + "'", obj17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "hi!" + "'", obj29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(iterator42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(iterator71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(iterator74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test169");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) "hi!");
        java.lang.Object obj8 = linkedListTestDriver5.removeLast();
        linkedListTestDriver5.addLast((java.lang.Object) '#');
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj16 = new java.lang.Object();
        linkedListTestDriver13.addFirst(obj16);
        experiment.util.Iterator iterator18 = linkedListTestDriver13.iterator();
        java.lang.Object[] objArray19 = linkedListTestDriver13.toArray();
        linkedListTestDriver5.add((int) (byte) 1, (java.lang.Object) linkedListTestDriver13);
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        boolean boolean23 = linkedListTestDriver21.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj24 = new java.lang.Object();
        linkedListTestDriver21.addFirst(obj24);
        experiment.util.Iterator iterator26 = linkedListTestDriver21.iterator();
        java.lang.Object[] objArray27 = linkedListTestDriver21.toArray();
        java.lang.Object obj28 = linkedListTestDriver21.getFirst();
        experiment.util.Iterator iterator29 = linkedListTestDriver21.iterator();
        boolean boolean30 = linkedListTestDriver5.contains((java.lang.Object) iterator29);
        java.lang.Object obj33 = linkedListTestDriver5.set((int) (short) 0, (java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        boolean boolean36 = linkedListTestDriver34.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj37 = new java.lang.Object();
        linkedListTestDriver34.addFirst(obj37);
        experiment.util.Iterator iterator39 = linkedListTestDriver34.iterator();
        java.lang.Object[] objArray40 = linkedListTestDriver34.toArray();
        boolean boolean41 = linkedListTestDriver5.equals_CUT((java.lang.Object) objArray40);
        java.lang.Object obj42 = linkedListTestDriver5.getLast();
        java.lang.Object obj43 = linkedListTestDriver5.removeLast();
        linkedListTestDriver5.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj46 = linkedListTestDriver5.remove(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + '#' + "'", obj33, '#');
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertNotNull(obj43);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test170");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray6 = linkedListTestDriver0.toArray();
        java.lang.Object obj7 = linkedListTestDriver0.getFirst();
        linkedListTestDriver0.addLast((java.lang.Object) (short) 0);
        int int10 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        java.lang.Class<?> wildcardClass12 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test171");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) "hi!");
        java.lang.Object obj8 = linkedListTestDriver5.removeLast();
        linkedListTestDriver5.addLast((java.lang.Object) '#');
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        boolean boolean14 = linkedListTestDriver12.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj15 = new java.lang.Object();
        linkedListTestDriver12.addFirst(obj15);
        experiment.util.Iterator iterator17 = linkedListTestDriver12.iterator();
        java.lang.Object[] objArray18 = linkedListTestDriver12.toArray();
        java.lang.Object obj19 = linkedListTestDriver12.getFirst();
        linkedListTestDriver5.addLast((java.lang.Object) linkedListTestDriver12);
        java.lang.Object[] objArray21 = linkedListTestDriver12.toArray();
        experiment.util.ListIterator listIterator23 = linkedListTestDriver12.listIterator(0);
        int int24 = linkedListTestDriver12.size();
        boolean boolean25 = linkedListTestDriver12.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator27 = linkedListTestDriver12.listIterator((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(listIterator23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test172");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) "hi!");
        java.lang.Object obj3 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj7 = new java.lang.Object();
        linkedListTestDriver4.addFirst(obj7);
        java.lang.Object obj9 = linkedListTestDriver4.getLast();
        boolean boolean10 = linkedListTestDriver4.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver11.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj14 = new java.lang.Object();
        linkedListTestDriver11.addFirst(obj14);
        experiment.util.Iterator iterator16 = linkedListTestDriver11.iterator();
        boolean boolean17 = linkedListTestDriver4.add((java.lang.Object) linkedListTestDriver11);
        java.lang.Object obj18 = linkedListTestDriver11.removeFirst();
        java.lang.Object[] objArray19 = linkedListTestDriver11.toArray();
        boolean boolean20 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver11);
        linkedListTestDriver11.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = linkedListTestDriver11.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "hi!" + "'", obj3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test173");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) "hi!");
        java.lang.Object obj8 = linkedListTestDriver5.removeLast();
        linkedListTestDriver5.addLast((java.lang.Object) '#');
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        boolean boolean14 = linkedListTestDriver12.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj15 = new java.lang.Object();
        linkedListTestDriver12.addFirst(obj15);
        experiment.util.Iterator iterator17 = linkedListTestDriver12.iterator();
        java.lang.Object[] objArray18 = linkedListTestDriver12.toArray();
        java.lang.Object obj19 = linkedListTestDriver12.getFirst();
        experiment.util.Iterator iterator20 = linkedListTestDriver12.iterator();
        java.lang.Object obj21 = linkedListTestDriver12.getFirst();
        boolean boolean22 = linkedListTestDriver5.add((java.lang.Object) linkedListTestDriver12);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator24 = linkedListTestDriver5.listIterator((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test174");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver5.clear();
        boolean boolean8 = linkedListTestDriver5.remove((java.lang.Object) (byte) 0);
        boolean boolean9 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver5);
        boolean boolean11 = linkedListTestDriver0.remove((java.lang.Object) 1);
        boolean boolean12 = linkedListTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test175");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray6 = linkedListTestDriver0.toArray();
        java.lang.Object obj7 = linkedListTestDriver0.getFirst();
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        java.lang.Object obj9 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver11.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj14 = new java.lang.Object();
        linkedListTestDriver11.addFirst(obj14);
        experiment.util.Iterator iterator16 = linkedListTestDriver11.iterator();
        java.lang.Object[] objArray17 = linkedListTestDriver11.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = linkedListTestDriver0.set(2, (java.lang.Object) linkedListTestDriver11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(objArray17);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test176");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) "hi!");
        java.lang.Object obj8 = linkedListTestDriver5.removeLast();
        linkedListTestDriver5.addLast((java.lang.Object) '#');
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        boolean boolean14 = linkedListTestDriver12.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj15 = new java.lang.Object();
        linkedListTestDriver12.addFirst(obj15);
        experiment.util.Iterator iterator17 = linkedListTestDriver12.iterator();
        java.lang.Object[] objArray18 = linkedListTestDriver12.toArray();
        java.lang.Object obj19 = linkedListTestDriver12.getFirst();
        linkedListTestDriver5.addLast((java.lang.Object) linkedListTestDriver12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = linkedListTestDriver12.remove(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test177");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = linkedListTestDriver0.remove(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test178");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) "hi!");
        java.lang.Object obj3 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj7 = new java.lang.Object();
        linkedListTestDriver4.addFirst(obj7);
        java.lang.Object obj9 = linkedListTestDriver4.getLast();
        boolean boolean10 = linkedListTestDriver4.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver11.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj14 = new java.lang.Object();
        linkedListTestDriver11.addFirst(obj14);
        experiment.util.Iterator iterator16 = linkedListTestDriver11.iterator();
        boolean boolean17 = linkedListTestDriver4.add((java.lang.Object) linkedListTestDriver11);
        java.lang.Object obj18 = linkedListTestDriver11.removeFirst();
        java.lang.Object[] objArray19 = linkedListTestDriver11.toArray();
        boolean boolean20 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver11);
        linkedListTestDriver11.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        boolean boolean24 = linkedListTestDriver22.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj25 = new java.lang.Object();
        linkedListTestDriver22.addFirst(obj25);
        java.lang.Object obj27 = linkedListTestDriver22.getLast();
        boolean boolean28 = linkedListTestDriver11.remove((java.lang.Object) linkedListTestDriver22);
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        boolean boolean31 = linkedListTestDriver29.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj32 = new java.lang.Object();
        linkedListTestDriver29.addFirst(obj32);
        java.lang.Object obj34 = linkedListTestDriver29.getLast();
        boolean boolean35 = linkedListTestDriver29.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver36 = new experiment.util.LinkedListTestDriver();
        boolean boolean38 = linkedListTestDriver36.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj39 = new java.lang.Object();
        linkedListTestDriver36.addFirst(obj39);
        experiment.util.Iterator iterator41 = linkedListTestDriver36.iterator();
        boolean boolean42 = linkedListTestDriver29.add((java.lang.Object) linkedListTestDriver36);
        java.lang.Object obj43 = linkedListTestDriver36.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver44 = new experiment.util.LinkedListTestDriver();
        boolean boolean46 = linkedListTestDriver44.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj47 = new java.lang.Object();
        linkedListTestDriver44.addFirst(obj47);
        experiment.util.LinkedListTestDriver linkedListTestDriver49 = new experiment.util.LinkedListTestDriver();
        boolean boolean51 = linkedListTestDriver49.add((java.lang.Object) "hi!");
        java.lang.Object obj52 = linkedListTestDriver49.removeLast();
        linkedListTestDriver49.addLast((java.lang.Object) '#');
        linkedListTestDriver44.addLast((java.lang.Object) linkedListTestDriver49);
        experiment.util.LinkedListTestDriver linkedListTestDriver57 = new experiment.util.LinkedListTestDriver();
        boolean boolean59 = linkedListTestDriver57.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj60 = new java.lang.Object();
        linkedListTestDriver57.addFirst(obj60);
        experiment.util.Iterator iterator62 = linkedListTestDriver57.iterator();
        java.lang.Object[] objArray63 = linkedListTestDriver57.toArray();
        linkedListTestDriver49.add((int) (byte) 1, (java.lang.Object) linkedListTestDriver57);
        boolean boolean65 = linkedListTestDriver36.contains((java.lang.Object) linkedListTestDriver49);
        boolean boolean66 = linkedListTestDriver36.isEmpty();
        java.lang.Class<?> wildcardClass67 = linkedListTestDriver36.getClass();
        linkedListTestDriver22.addLast((java.lang.Object) wildcardClass67);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "hi!" + "'", obj3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(iterator41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + "hi!" + "'", obj52, "hi!");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(iterator62);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test179");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = new java.lang.Object();
        linkedListTestDriver7.addFirst(obj10);
        experiment.util.Iterator iterator12 = linkedListTestDriver7.iterator();
        boolean boolean13 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver7);
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        boolean boolean16 = linkedListTestDriver14.add((java.lang.Object) "hi!");
        java.lang.Object obj17 = linkedListTestDriver14.removeFirst();
        boolean boolean18 = linkedListTestDriver7.contains((java.lang.Object) linkedListTestDriver14);
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        boolean boolean22 = linkedListTestDriver20.remove((java.lang.Object) 100L);
        boolean boolean23 = linkedListTestDriver20.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = linkedListTestDriver14.set(0, (java.lang.Object) boolean23);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "hi!" + "'", obj17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test180");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = new java.lang.Object();
        linkedListTestDriver7.addFirst(obj10);
        experiment.util.Iterator iterator12 = linkedListTestDriver7.iterator();
        boolean boolean13 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver7);
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        boolean boolean16 = linkedListTestDriver14.add((java.lang.Object) "hi!");
        java.lang.Object obj17 = linkedListTestDriver14.removeFirst();
        boolean boolean18 = linkedListTestDriver7.contains((java.lang.Object) linkedListTestDriver14);
        java.lang.Object obj19 = linkedListTestDriver7.getFirst();
        int int20 = linkedListTestDriver7.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        boolean boolean24 = linkedListTestDriver22.add((java.lang.Object) "hi!");
        java.lang.Object obj25 = linkedListTestDriver22.removeLast();
        linkedListTestDriver22.addLast((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        boolean boolean30 = linkedListTestDriver28.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj31 = new java.lang.Object();
        linkedListTestDriver28.addFirst(obj31);
        experiment.util.LinkedListTestDriver linkedListTestDriver33 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver33.clear();
        boolean boolean36 = linkedListTestDriver33.remove((java.lang.Object) (byte) 0);
        boolean boolean37 = linkedListTestDriver28.contains((java.lang.Object) linkedListTestDriver33);
        boolean boolean38 = linkedListTestDriver22.equals_CUT((java.lang.Object) linkedListTestDriver33);
        linkedListTestDriver7.add((int) (short) 0, (java.lang.Object) linkedListTestDriver22);
        java.lang.Class<?> wildcardClass40 = linkedListTestDriver7.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "hi!" + "'", obj17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "hi!" + "'", obj25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test181");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = new java.lang.Object();
        linkedListTestDriver7.addFirst(obj10);
        experiment.util.Iterator iterator12 = linkedListTestDriver7.iterator();
        boolean boolean13 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver7);
        java.lang.Object obj14 = linkedListTestDriver7.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        boolean boolean18 = linkedListTestDriver16.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj19 = new java.lang.Object();
        linkedListTestDriver16.addFirst(obj19);
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        boolean boolean23 = linkedListTestDriver21.add((java.lang.Object) "hi!");
        java.lang.Object obj24 = linkedListTestDriver21.removeLast();
        linkedListTestDriver21.addLast((java.lang.Object) '#');
        linkedListTestDriver16.addLast((java.lang.Object) linkedListTestDriver21);
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        boolean boolean31 = linkedListTestDriver29.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj32 = new java.lang.Object();
        linkedListTestDriver29.addFirst(obj32);
        experiment.util.Iterator iterator34 = linkedListTestDriver29.iterator();
        java.lang.Object[] objArray35 = linkedListTestDriver29.toArray();
        linkedListTestDriver21.add((int) (byte) 1, (java.lang.Object) linkedListTestDriver29);
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        boolean boolean39 = linkedListTestDriver37.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj40 = new java.lang.Object();
        linkedListTestDriver37.addFirst(obj40);
        experiment.util.LinkedListTestDriver linkedListTestDriver42 = new experiment.util.LinkedListTestDriver();
        boolean boolean44 = linkedListTestDriver42.add((java.lang.Object) "hi!");
        java.lang.Object obj45 = linkedListTestDriver42.removeLast();
        linkedListTestDriver42.addLast((java.lang.Object) '#');
        linkedListTestDriver37.addLast((java.lang.Object) linkedListTestDriver42);
        experiment.util.LinkedListTestDriver linkedListTestDriver49 = new experiment.util.LinkedListTestDriver();
        boolean boolean51 = linkedListTestDriver49.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj52 = new java.lang.Object();
        linkedListTestDriver49.addFirst(obj52);
        experiment.util.Iterator iterator54 = linkedListTestDriver49.iterator();
        java.lang.Object[] objArray55 = linkedListTestDriver49.toArray();
        java.lang.Object obj56 = linkedListTestDriver49.getFirst();
        experiment.util.Iterator iterator57 = linkedListTestDriver49.iterator();
        java.lang.Object obj58 = linkedListTestDriver49.getFirst();
        boolean boolean59 = linkedListTestDriver42.add((java.lang.Object) linkedListTestDriver49);
        boolean boolean60 = linkedListTestDriver29.contains((java.lang.Object) linkedListTestDriver42);
        linkedListTestDriver7.add((int) (short) 0, (java.lang.Object) linkedListTestDriver29);
        linkedListTestDriver7.clear();
        boolean boolean63 = linkedListTestDriver7.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver7.add((int) (byte) 1, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 1; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "hi!" + "'", obj24, "hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + "hi!" + "'", obj45, "hi!");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(iterator54);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertNotNull(iterator57);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test182");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver5.clear();
        boolean boolean8 = linkedListTestDriver5.remove((java.lang.Object) (byte) 0);
        boolean boolean9 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        boolean boolean12 = linkedListTestDriver10.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj13 = new java.lang.Object();
        linkedListTestDriver10.addFirst(obj13);
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        boolean boolean17 = linkedListTestDriver15.add((java.lang.Object) "hi!");
        java.lang.Object obj18 = linkedListTestDriver15.removeLast();
        linkedListTestDriver15.addLast((java.lang.Object) '#');
        linkedListTestDriver10.addLast((java.lang.Object) linkedListTestDriver15);
        boolean boolean23 = linkedListTestDriver10.remove((java.lang.Object) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        boolean boolean27 = linkedListTestDriver25.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj28 = new java.lang.Object();
        linkedListTestDriver25.addFirst(obj28);
        experiment.util.Iterator iterator30 = linkedListTestDriver25.iterator();
        experiment.util.Iterator iterator31 = linkedListTestDriver25.iterator();
        linkedListTestDriver10.add(2, (java.lang.Object) linkedListTestDriver25);
        boolean boolean33 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver25);
        java.lang.Object obj34 = null;
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver25.addLast(obj34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "hi!" + "'", obj18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test183");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = new java.lang.Object();
        linkedListTestDriver7.addFirst(obj10);
        experiment.util.Iterator iterator12 = linkedListTestDriver7.iterator();
        boolean boolean13 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver7);
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        boolean boolean16 = linkedListTestDriver14.add((java.lang.Object) "hi!");
        java.lang.Object obj17 = linkedListTestDriver14.removeFirst();
        boolean boolean18 = linkedListTestDriver7.contains((java.lang.Object) linkedListTestDriver14);
        experiment.util.ListIterator listIterator20 = linkedListTestDriver14.listIterator(0);
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver21.clear();
        experiment.util.Iterator iterator23 = linkedListTestDriver21.iterator();
        boolean boolean24 = linkedListTestDriver14.equals_CUT((java.lang.Object) iterator23);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "hi!" + "'", obj17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(listIterator20);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test184");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 100L);
        java.lang.Object[] objArray3 = linkedListTestDriver0.toArray();
        boolean boolean4 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test185");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) "hi!");
        java.lang.Object obj8 = linkedListTestDriver5.removeLast();
        linkedListTestDriver5.addLast((java.lang.Object) '#');
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        boolean boolean14 = linkedListTestDriver12.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj15 = new java.lang.Object();
        linkedListTestDriver12.addFirst(obj15);
        experiment.util.Iterator iterator17 = linkedListTestDriver12.iterator();
        java.lang.Object[] objArray18 = linkedListTestDriver12.toArray();
        java.lang.Object obj19 = linkedListTestDriver12.getFirst();
        boolean boolean20 = linkedListTestDriver5.equals_CUT(obj19);
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        boolean boolean23 = linkedListTestDriver21.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj24 = new java.lang.Object();
        linkedListTestDriver21.addFirst(obj24);
        java.lang.Object obj26 = linkedListTestDriver21.getLast();
        boolean boolean27 = linkedListTestDriver21.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        boolean boolean30 = linkedListTestDriver28.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj31 = new java.lang.Object();
        linkedListTestDriver28.addFirst(obj31);
        experiment.util.Iterator iterator33 = linkedListTestDriver28.iterator();
        boolean boolean34 = linkedListTestDriver21.add((java.lang.Object) linkedListTestDriver28);
        java.lang.Object obj35 = linkedListTestDriver28.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        boolean boolean39 = linkedListTestDriver37.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj40 = new java.lang.Object();
        linkedListTestDriver37.addFirst(obj40);
        experiment.util.LinkedListTestDriver linkedListTestDriver42 = new experiment.util.LinkedListTestDriver();
        boolean boolean44 = linkedListTestDriver42.add((java.lang.Object) "hi!");
        java.lang.Object obj45 = linkedListTestDriver42.removeLast();
        linkedListTestDriver42.addLast((java.lang.Object) '#');
        linkedListTestDriver37.addLast((java.lang.Object) linkedListTestDriver42);
        experiment.util.LinkedListTestDriver linkedListTestDriver50 = new experiment.util.LinkedListTestDriver();
        boolean boolean52 = linkedListTestDriver50.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj53 = new java.lang.Object();
        linkedListTestDriver50.addFirst(obj53);
        experiment.util.Iterator iterator55 = linkedListTestDriver50.iterator();
        java.lang.Object[] objArray56 = linkedListTestDriver50.toArray();
        linkedListTestDriver42.add((int) (byte) 1, (java.lang.Object) linkedListTestDriver50);
        experiment.util.LinkedListTestDriver linkedListTestDriver58 = new experiment.util.LinkedListTestDriver();
        boolean boolean60 = linkedListTestDriver58.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj61 = new java.lang.Object();
        linkedListTestDriver58.addFirst(obj61);
        experiment.util.LinkedListTestDriver linkedListTestDriver63 = new experiment.util.LinkedListTestDriver();
        boolean boolean65 = linkedListTestDriver63.add((java.lang.Object) "hi!");
        java.lang.Object obj66 = linkedListTestDriver63.removeLast();
        linkedListTestDriver63.addLast((java.lang.Object) '#');
        linkedListTestDriver58.addLast((java.lang.Object) linkedListTestDriver63);
        experiment.util.LinkedListTestDriver linkedListTestDriver70 = new experiment.util.LinkedListTestDriver();
        boolean boolean72 = linkedListTestDriver70.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj73 = new java.lang.Object();
        linkedListTestDriver70.addFirst(obj73);
        experiment.util.Iterator iterator75 = linkedListTestDriver70.iterator();
        java.lang.Object[] objArray76 = linkedListTestDriver70.toArray();
        java.lang.Object obj77 = linkedListTestDriver70.getFirst();
        experiment.util.Iterator iterator78 = linkedListTestDriver70.iterator();
        java.lang.Object obj79 = linkedListTestDriver70.getFirst();
        boolean boolean80 = linkedListTestDriver63.add((java.lang.Object) linkedListTestDriver70);
        boolean boolean81 = linkedListTestDriver50.contains((java.lang.Object) linkedListTestDriver63);
        linkedListTestDriver28.add((int) (short) 0, (java.lang.Object) linkedListTestDriver50);
        linkedListTestDriver5.addLast((java.lang.Object) linkedListTestDriver50);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + "hi!" + "'", obj45, "hi!");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(iterator55);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertEquals("'" + obj66 + "' != '" + "hi!" + "'", obj66, "hi!");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(iterator75);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertNotNull(obj77);
        org.junit.Assert.assertNotNull(iterator78);
        org.junit.Assert.assertNotNull(obj79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test186");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        boolean boolean4 = linkedListTestDriver2.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj5 = new java.lang.Object();
        linkedListTestDriver2.addFirst(obj5);
        java.lang.Object obj7 = linkedListTestDriver2.getLast();
        boolean boolean8 = linkedListTestDriver2.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj12 = new java.lang.Object();
        linkedListTestDriver9.addFirst(obj12);
        experiment.util.Iterator iterator14 = linkedListTestDriver9.iterator();
        boolean boolean15 = linkedListTestDriver2.add((java.lang.Object) linkedListTestDriver9);
        linkedListTestDriver9.add((int) (byte) 1, (java.lang.Object) (-1.0d));
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        boolean boolean22 = linkedListTestDriver20.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj23 = new java.lang.Object();
        linkedListTestDriver20.addFirst(obj23);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        boolean boolean27 = linkedListTestDriver25.add((java.lang.Object) "hi!");
        java.lang.Object obj28 = linkedListTestDriver25.removeLast();
        linkedListTestDriver25.addLast((java.lang.Object) '#');
        linkedListTestDriver20.addLast((java.lang.Object) linkedListTestDriver25);
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        boolean boolean34 = linkedListTestDriver32.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj35 = new java.lang.Object();
        linkedListTestDriver32.addFirst(obj35);
        experiment.util.Iterator iterator37 = linkedListTestDriver32.iterator();
        java.lang.Object[] objArray38 = linkedListTestDriver32.toArray();
        java.lang.Object obj39 = linkedListTestDriver32.getFirst();
        linkedListTestDriver25.addLast((java.lang.Object) linkedListTestDriver32);
        experiment.util.LinkedListTestDriver linkedListTestDriver41 = new experiment.util.LinkedListTestDriver();
        boolean boolean43 = linkedListTestDriver41.add((java.lang.Object) "hi!");
        linkedListTestDriver25.addLast((java.lang.Object) linkedListTestDriver41);
        boolean boolean45 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver41);
        experiment.util.LinkedListTestDriver linkedListTestDriver46 = new experiment.util.LinkedListTestDriver();
        boolean boolean48 = linkedListTestDriver46.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj49 = new java.lang.Object();
        linkedListTestDriver46.addFirst(obj49);
        experiment.util.Iterator iterator51 = linkedListTestDriver46.iterator();
        java.lang.Object[] objArray52 = linkedListTestDriver46.toArray();
        java.lang.Object obj53 = linkedListTestDriver46.getFirst();
        experiment.util.Iterator iterator54 = linkedListTestDriver46.iterator();
        java.lang.Object obj55 = linkedListTestDriver46.getFirst();
        linkedListTestDriver41.addLast((java.lang.Object) linkedListTestDriver46);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator58 = linkedListTestDriver46.listIterator(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 100; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "hi!" + "'", obj28, "hi!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(iterator51);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertNotNull(iterator54);
        org.junit.Assert.assertNotNull(obj55);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test187");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = new java.lang.Object();
        linkedListTestDriver7.addFirst(obj10);
        experiment.util.Iterator iterator12 = linkedListTestDriver7.iterator();
        boolean boolean13 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver7);
        experiment.util.ListIterator listIterator15 = linkedListTestDriver7.listIterator((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(listIterator15);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test188");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) "hi!");
        java.lang.Object obj8 = linkedListTestDriver5.removeLast();
        linkedListTestDriver5.addLast((java.lang.Object) '#');
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj16 = new java.lang.Object();
        linkedListTestDriver13.addFirst(obj16);
        experiment.util.Iterator iterator18 = linkedListTestDriver13.iterator();
        java.lang.Object[] objArray19 = linkedListTestDriver13.toArray();
        linkedListTestDriver5.add((int) (byte) 1, (java.lang.Object) linkedListTestDriver13);
        int int21 = linkedListTestDriver5.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver22.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        boolean boolean26 = linkedListTestDriver24.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj27 = new java.lang.Object();
        linkedListTestDriver24.addFirst(obj27);
        java.lang.Object obj29 = linkedListTestDriver24.getLast();
        boolean boolean30 = linkedListTestDriver24.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        boolean boolean33 = linkedListTestDriver31.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj34 = new java.lang.Object();
        linkedListTestDriver31.addFirst(obj34);
        experiment.util.Iterator iterator36 = linkedListTestDriver31.iterator();
        boolean boolean37 = linkedListTestDriver24.add((java.lang.Object) linkedListTestDriver31);
        linkedListTestDriver31.add((int) (byte) 1, (java.lang.Object) (-1.0d));
        linkedListTestDriver22.addFirst((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver42 = new experiment.util.LinkedListTestDriver();
        boolean boolean44 = linkedListTestDriver42.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj45 = new java.lang.Object();
        linkedListTestDriver42.addFirst(obj45);
        experiment.util.LinkedListTestDriver linkedListTestDriver47 = new experiment.util.LinkedListTestDriver();
        boolean boolean49 = linkedListTestDriver47.add((java.lang.Object) "hi!");
        java.lang.Object obj50 = linkedListTestDriver47.removeLast();
        linkedListTestDriver47.addLast((java.lang.Object) '#');
        linkedListTestDriver42.addLast((java.lang.Object) linkedListTestDriver47);
        experiment.util.LinkedListTestDriver linkedListTestDriver54 = new experiment.util.LinkedListTestDriver();
        boolean boolean56 = linkedListTestDriver54.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj57 = new java.lang.Object();
        linkedListTestDriver54.addFirst(obj57);
        experiment.util.Iterator iterator59 = linkedListTestDriver54.iterator();
        java.lang.Object[] objArray60 = linkedListTestDriver54.toArray();
        java.lang.Object obj61 = linkedListTestDriver54.getFirst();
        linkedListTestDriver47.addLast((java.lang.Object) linkedListTestDriver54);
        experiment.util.LinkedListTestDriver linkedListTestDriver63 = new experiment.util.LinkedListTestDriver();
        boolean boolean65 = linkedListTestDriver63.add((java.lang.Object) "hi!");
        linkedListTestDriver47.addLast((java.lang.Object) linkedListTestDriver63);
        boolean boolean67 = linkedListTestDriver22.remove((java.lang.Object) linkedListTestDriver63);
        experiment.util.LinkedListTestDriver linkedListTestDriver68 = new experiment.util.LinkedListTestDriver();
        boolean boolean70 = linkedListTestDriver68.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj71 = new java.lang.Object();
        linkedListTestDriver68.addFirst(obj71);
        experiment.util.Iterator iterator73 = linkedListTestDriver68.iterator();
        java.lang.Object[] objArray74 = linkedListTestDriver68.toArray();
        java.lang.Object obj75 = linkedListTestDriver68.getFirst();
        experiment.util.Iterator iterator76 = linkedListTestDriver68.iterator();
        java.lang.Object obj77 = linkedListTestDriver68.getFirst();
        linkedListTestDriver63.addLast((java.lang.Object) linkedListTestDriver68);
        boolean boolean79 = linkedListTestDriver5.contains((java.lang.Object) linkedListTestDriver63);
        java.lang.Object obj80 = linkedListTestDriver63.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator82 = linkedListTestDriver63.listIterator((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 32; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + "hi!" + "'", obj50, "hi!");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(iterator59);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(iterator73);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertNotNull(obj75);
        org.junit.Assert.assertNotNull(iterator76);
        org.junit.Assert.assertNotNull(obj77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(obj80);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test189");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) "hi!");
        java.lang.Object obj8 = linkedListTestDriver5.removeLast();
        linkedListTestDriver5.addLast((java.lang.Object) '#');
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        boolean boolean13 = linkedListTestDriver0.remove((java.lang.Object) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        boolean boolean17 = linkedListTestDriver15.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = new java.lang.Object();
        linkedListTestDriver15.addFirst(obj18);
        experiment.util.Iterator iterator20 = linkedListTestDriver15.iterator();
        experiment.util.Iterator iterator21 = linkedListTestDriver15.iterator();
        linkedListTestDriver0.add(2, (java.lang.Object) linkedListTestDriver15);
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        boolean boolean26 = linkedListTestDriver24.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj27 = new java.lang.Object();
        linkedListTestDriver24.addFirst(obj27);
        experiment.util.Iterator iterator29 = linkedListTestDriver24.iterator();
        java.lang.Object[] objArray30 = linkedListTestDriver24.toArray();
        java.lang.Object obj31 = linkedListTestDriver24.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        boolean boolean34 = linkedListTestDriver32.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj35 = new java.lang.Object();
        linkedListTestDriver32.addFirst(obj35);
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver37.clear();
        boolean boolean40 = linkedListTestDriver37.remove((java.lang.Object) (byte) 0);
        boolean boolean41 = linkedListTestDriver32.contains((java.lang.Object) linkedListTestDriver37);
        java.lang.Object obj42 = linkedListTestDriver32.getFirst();
        linkedListTestDriver24.addFirst(obj42);
        experiment.util.LinkedListTestDriver linkedListTestDriver44 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver44.clear();
        boolean boolean47 = linkedListTestDriver44.add((java.lang.Object) (short) 1);
        int int48 = linkedListTestDriver44.size();
        java.lang.Object obj50 = linkedListTestDriver44.remove((int) (byte) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver51 = new experiment.util.LinkedListTestDriver();
        boolean boolean53 = linkedListTestDriver51.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj54 = new java.lang.Object();
        linkedListTestDriver51.addFirst(obj54);
        java.lang.Object obj56 = linkedListTestDriver51.getLast();
        boolean boolean57 = linkedListTestDriver51.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver58 = new experiment.util.LinkedListTestDriver();
        boolean boolean60 = linkedListTestDriver58.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj61 = new java.lang.Object();
        linkedListTestDriver58.addFirst(obj61);
        experiment.util.Iterator iterator63 = linkedListTestDriver58.iterator();
        boolean boolean64 = linkedListTestDriver51.add((java.lang.Object) linkedListTestDriver58);
        java.lang.Object obj65 = linkedListTestDriver58.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver66 = new experiment.util.LinkedListTestDriver();
        boolean boolean68 = linkedListTestDriver66.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj69 = new java.lang.Object();
        linkedListTestDriver66.addFirst(obj69);
        experiment.util.LinkedListTestDriver linkedListTestDriver71 = new experiment.util.LinkedListTestDriver();
        boolean boolean73 = linkedListTestDriver71.add((java.lang.Object) "hi!");
        java.lang.Object obj74 = linkedListTestDriver71.removeLast();
        linkedListTestDriver71.addLast((java.lang.Object) '#');
        linkedListTestDriver66.addLast((java.lang.Object) linkedListTestDriver71);
        experiment.util.LinkedListTestDriver linkedListTestDriver79 = new experiment.util.LinkedListTestDriver();
        boolean boolean81 = linkedListTestDriver79.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj82 = new java.lang.Object();
        linkedListTestDriver79.addFirst(obj82);
        experiment.util.Iterator iterator84 = linkedListTestDriver79.iterator();
        java.lang.Object[] objArray85 = linkedListTestDriver79.toArray();
        linkedListTestDriver71.add((int) (byte) 1, (java.lang.Object) linkedListTestDriver79);
        boolean boolean87 = linkedListTestDriver58.contains((java.lang.Object) linkedListTestDriver71);
        linkedListTestDriver44.addFirst((java.lang.Object) linkedListTestDriver71);
        linkedListTestDriver24.addFirst((java.lang.Object) linkedListTestDriver71);
        java.lang.Object[] objArray90 = linkedListTestDriver71.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj91 = linkedListTestDriver0.set((int) (byte) 100, (java.lang.Object) linkedListTestDriver71);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + (short) 1 + "'", obj50, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(iterator63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(obj65);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertEquals("'" + obj74 + "' != '" + "hi!" + "'", obj74, "hi!");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(iterator84);
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(objArray90);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test190");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) "hi!");
        java.lang.Object obj3 = linkedListTestDriver0.removeLast();
        linkedListTestDriver0.addLast((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj9 = new java.lang.Object();
        linkedListTestDriver6.addFirst(obj9);
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.clear();
        boolean boolean14 = linkedListTestDriver11.remove((java.lang.Object) (byte) 0);
        boolean boolean15 = linkedListTestDriver6.contains((java.lang.Object) linkedListTestDriver11);
        boolean boolean16 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver11);
        boolean boolean17 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver18.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj21 = new java.lang.Object();
        linkedListTestDriver18.addFirst(obj21);
        java.lang.Object obj23 = linkedListTestDriver18.getLast();
        boolean boolean24 = linkedListTestDriver18.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        boolean boolean27 = linkedListTestDriver25.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj28 = new java.lang.Object();
        linkedListTestDriver25.addFirst(obj28);
        experiment.util.Iterator iterator30 = linkedListTestDriver25.iterator();
        boolean boolean31 = linkedListTestDriver18.add((java.lang.Object) linkedListTestDriver25);
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        boolean boolean34 = linkedListTestDriver32.add((java.lang.Object) "hi!");
        java.lang.Object obj35 = linkedListTestDriver32.removeFirst();
        boolean boolean36 = linkedListTestDriver25.contains((java.lang.Object) linkedListTestDriver32);
        linkedListTestDriver32.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver38 = new experiment.util.LinkedListTestDriver();
        boolean boolean39 = linkedListTestDriver32.contains((java.lang.Object) linkedListTestDriver38);
        boolean boolean40 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver38);
        experiment.util.LinkedListTestDriver linkedListTestDriver41 = new experiment.util.LinkedListTestDriver();
        boolean boolean43 = linkedListTestDriver41.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj44 = new java.lang.Object();
        linkedListTestDriver41.addFirst(obj44);
        experiment.util.LinkedListTestDriver linkedListTestDriver46 = new experiment.util.LinkedListTestDriver();
        boolean boolean48 = linkedListTestDriver46.add((java.lang.Object) "hi!");
        java.lang.Object obj49 = linkedListTestDriver46.removeLast();
        linkedListTestDriver46.addLast((java.lang.Object) '#');
        linkedListTestDriver41.addLast((java.lang.Object) linkedListTestDriver46);
        experiment.util.LinkedListTestDriver linkedListTestDriver54 = new experiment.util.LinkedListTestDriver();
        boolean boolean56 = linkedListTestDriver54.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj57 = new java.lang.Object();
        linkedListTestDriver54.addFirst(obj57);
        experiment.util.Iterator iterator59 = linkedListTestDriver54.iterator();
        java.lang.Object[] objArray60 = linkedListTestDriver54.toArray();
        linkedListTestDriver46.add((int) (byte) 1, (java.lang.Object) linkedListTestDriver54);
        experiment.util.LinkedListTestDriver linkedListTestDriver62 = new experiment.util.LinkedListTestDriver();
        boolean boolean64 = linkedListTestDriver62.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj65 = new java.lang.Object();
        linkedListTestDriver62.addFirst(obj65);
        experiment.util.Iterator iterator67 = linkedListTestDriver62.iterator();
        java.lang.Object[] objArray68 = linkedListTestDriver62.toArray();
        java.lang.Object obj69 = linkedListTestDriver62.getFirst();
        experiment.util.Iterator iterator70 = linkedListTestDriver62.iterator();
        boolean boolean71 = linkedListTestDriver46.contains((java.lang.Object) iterator70);
        java.lang.Object obj74 = linkedListTestDriver46.set((int) (short) 0, (java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver75 = new experiment.util.LinkedListTestDriver();
        boolean boolean77 = linkedListTestDriver75.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj78 = new java.lang.Object();
        linkedListTestDriver75.addFirst(obj78);
        experiment.util.Iterator iterator80 = linkedListTestDriver75.iterator();
        java.lang.Object[] objArray81 = linkedListTestDriver75.toArray();
        boolean boolean82 = linkedListTestDriver46.equals_CUT((java.lang.Object) objArray81);
        java.lang.Object obj83 = linkedListTestDriver46.getLast();
        linkedListTestDriver38.addLast((java.lang.Object) linkedListTestDriver46);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator86 = linkedListTestDriver46.listIterator(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 100; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "hi!" + "'", obj3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + "hi!" + "'", obj35, "hi!");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + "hi!" + "'", obj49, "hi!");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(iterator59);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(iterator67);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertNotNull(obj69);
        org.junit.Assert.assertNotNull(iterator70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + obj74 + "' != '" + '#' + "'", obj74, '#');
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(iterator80);
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(obj83);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test191");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) "hi!");
        java.lang.Object obj3 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj7 = new java.lang.Object();
        linkedListTestDriver4.addFirst(obj7);
        java.lang.Object obj9 = linkedListTestDriver4.getLast();
        boolean boolean10 = linkedListTestDriver4.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver11.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj14 = new java.lang.Object();
        linkedListTestDriver11.addFirst(obj14);
        experiment.util.Iterator iterator16 = linkedListTestDriver11.iterator();
        boolean boolean17 = linkedListTestDriver4.add((java.lang.Object) linkedListTestDriver11);
        java.lang.Object obj18 = linkedListTestDriver11.removeFirst();
        java.lang.Object[] objArray19 = linkedListTestDriver11.toArray();
        boolean boolean20 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver11);
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        boolean boolean23 = linkedListTestDriver21.remove((java.lang.Object) 100L);
        java.lang.Object[] objArray24 = linkedListTestDriver21.toArray();
        boolean boolean25 = linkedListTestDriver11.equals_CUT((java.lang.Object) linkedListTestDriver21);
        experiment.util.LinkedListTestDriver linkedListTestDriver27 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver27.clear();
        boolean boolean30 = linkedListTestDriver27.add((java.lang.Object) (short) 1);
        int int31 = linkedListTestDriver27.size();
        java.lang.Object obj33 = linkedListTestDriver27.remove((int) (byte) 0);
        java.lang.Object[] objArray34 = linkedListTestDriver27.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver35 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver35.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        boolean boolean39 = linkedListTestDriver37.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj40 = new java.lang.Object();
        linkedListTestDriver37.addFirst(obj40);
        java.lang.Object obj42 = linkedListTestDriver37.getLast();
        boolean boolean43 = linkedListTestDriver37.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver44 = new experiment.util.LinkedListTestDriver();
        boolean boolean46 = linkedListTestDriver44.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj47 = new java.lang.Object();
        linkedListTestDriver44.addFirst(obj47);
        experiment.util.Iterator iterator49 = linkedListTestDriver44.iterator();
        boolean boolean50 = linkedListTestDriver37.add((java.lang.Object) linkedListTestDriver44);
        linkedListTestDriver44.add((int) (byte) 1, (java.lang.Object) (-1.0d));
        linkedListTestDriver35.addFirst((java.lang.Object) (byte) 1);
        linkedListTestDriver27.addLast((java.lang.Object) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj56 = linkedListTestDriver11.set((int) (byte) 10, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "hi!" + "'", obj3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (short) 1 + "'", obj33, (short) 1);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(iterator49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test192");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) "hi!");
        java.lang.Object obj8 = linkedListTestDriver5.removeLast();
        linkedListTestDriver5.addLast((java.lang.Object) '#');
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj16 = new java.lang.Object();
        linkedListTestDriver13.addFirst(obj16);
        experiment.util.Iterator iterator18 = linkedListTestDriver13.iterator();
        java.lang.Object[] objArray19 = linkedListTestDriver13.toArray();
        linkedListTestDriver5.add((int) (byte) 1, (java.lang.Object) linkedListTestDriver13);
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        boolean boolean23 = linkedListTestDriver21.add((java.lang.Object) "hi!");
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        boolean boolean26 = linkedListTestDriver24.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj27 = new java.lang.Object();
        linkedListTestDriver24.addFirst(obj27);
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        boolean boolean31 = linkedListTestDriver29.add((java.lang.Object) "hi!");
        java.lang.Object obj32 = linkedListTestDriver29.removeLast();
        linkedListTestDriver29.addLast((java.lang.Object) '#');
        linkedListTestDriver24.addLast((java.lang.Object) linkedListTestDriver29);
        boolean boolean37 = linkedListTestDriver24.remove((java.lang.Object) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver39 = new experiment.util.LinkedListTestDriver();
        boolean boolean41 = linkedListTestDriver39.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj42 = new java.lang.Object();
        linkedListTestDriver39.addFirst(obj42);
        experiment.util.Iterator iterator44 = linkedListTestDriver39.iterator();
        experiment.util.Iterator iterator45 = linkedListTestDriver39.iterator();
        linkedListTestDriver24.add(2, (java.lang.Object) linkedListTestDriver39);
        boolean boolean47 = linkedListTestDriver21.remove((java.lang.Object) 2);
        linkedListTestDriver5.addFirst((java.lang.Object) 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + "hi!" + "'", obj32, "hi!");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(iterator44);
        org.junit.Assert.assertNotNull(iterator45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test193");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) "hi!");
        java.lang.Object obj8 = linkedListTestDriver5.removeLast();
        linkedListTestDriver5.addLast((java.lang.Object) '#');
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj16 = new java.lang.Object();
        linkedListTestDriver13.addFirst(obj16);
        experiment.util.Iterator iterator18 = linkedListTestDriver13.iterator();
        java.lang.Object[] objArray19 = linkedListTestDriver13.toArray();
        linkedListTestDriver5.add((int) (byte) 1, (java.lang.Object) linkedListTestDriver13);
        int int21 = linkedListTestDriver5.size();
        experiment.util.ListIterator listIterator23 = linkedListTestDriver5.listIterator(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(listIterator23);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test194");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) "hi!");
        java.lang.Object obj3 = linkedListTestDriver0.removeFirst();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver5.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = new java.lang.Object();
        linkedListTestDriver7.addFirst(obj10);
        java.lang.Object obj12 = linkedListTestDriver7.getLast();
        boolean boolean13 = linkedListTestDriver7.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        boolean boolean16 = linkedListTestDriver14.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj17 = new java.lang.Object();
        linkedListTestDriver14.addFirst(obj17);
        experiment.util.Iterator iterator19 = linkedListTestDriver14.iterator();
        boolean boolean20 = linkedListTestDriver7.add((java.lang.Object) linkedListTestDriver14);
        linkedListTestDriver14.add((int) (byte) 1, (java.lang.Object) (-1.0d));
        linkedListTestDriver5.addFirst((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        boolean boolean27 = linkedListTestDriver25.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj28 = new java.lang.Object();
        linkedListTestDriver25.addFirst(obj28);
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        boolean boolean32 = linkedListTestDriver30.add((java.lang.Object) "hi!");
        java.lang.Object obj33 = linkedListTestDriver30.removeLast();
        linkedListTestDriver30.addLast((java.lang.Object) '#');
        linkedListTestDriver25.addLast((java.lang.Object) linkedListTestDriver30);
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        boolean boolean39 = linkedListTestDriver37.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj40 = new java.lang.Object();
        linkedListTestDriver37.addFirst(obj40);
        experiment.util.Iterator iterator42 = linkedListTestDriver37.iterator();
        java.lang.Object[] objArray43 = linkedListTestDriver37.toArray();
        java.lang.Object obj44 = linkedListTestDriver37.getFirst();
        linkedListTestDriver30.addLast((java.lang.Object) linkedListTestDriver37);
        experiment.util.LinkedListTestDriver linkedListTestDriver46 = new experiment.util.LinkedListTestDriver();
        boolean boolean48 = linkedListTestDriver46.add((java.lang.Object) "hi!");
        linkedListTestDriver30.addLast((java.lang.Object) linkedListTestDriver46);
        boolean boolean50 = linkedListTestDriver5.remove((java.lang.Object) linkedListTestDriver46);
        experiment.util.LinkedListTestDriver linkedListTestDriver51 = new experiment.util.LinkedListTestDriver();
        boolean boolean53 = linkedListTestDriver51.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj54 = new java.lang.Object();
        linkedListTestDriver51.addFirst(obj54);
        experiment.util.Iterator iterator56 = linkedListTestDriver51.iterator();
        java.lang.Object[] objArray57 = linkedListTestDriver51.toArray();
        java.lang.Object obj58 = linkedListTestDriver51.getFirst();
        experiment.util.Iterator iterator59 = linkedListTestDriver51.iterator();
        java.lang.Object obj60 = linkedListTestDriver51.getFirst();
        linkedListTestDriver46.addLast((java.lang.Object) linkedListTestDriver51);
        boolean boolean62 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver46);
        linkedListTestDriver46.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver64 = new experiment.util.LinkedListTestDriver();
        boolean boolean66 = linkedListTestDriver64.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj67 = new java.lang.Object();
        linkedListTestDriver64.addFirst(obj67);
        experiment.util.LinkedListTestDriver linkedListTestDriver69 = new experiment.util.LinkedListTestDriver();
        boolean boolean71 = linkedListTestDriver69.add((java.lang.Object) "hi!");
        java.lang.Object obj72 = linkedListTestDriver69.removeLast();
        linkedListTestDriver69.addLast((java.lang.Object) '#');
        linkedListTestDriver64.addLast((java.lang.Object) linkedListTestDriver69);
        experiment.util.LinkedListTestDriver linkedListTestDriver76 = new experiment.util.LinkedListTestDriver();
        boolean boolean78 = linkedListTestDriver76.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj79 = new java.lang.Object();
        linkedListTestDriver76.addFirst(obj79);
        experiment.util.Iterator iterator81 = linkedListTestDriver76.iterator();
        java.lang.Object[] objArray82 = linkedListTestDriver76.toArray();
        java.lang.Object obj83 = linkedListTestDriver76.getFirst();
        linkedListTestDriver69.addLast((java.lang.Object) linkedListTestDriver76);
        java.lang.Object[] objArray85 = linkedListTestDriver76.toArray();
        boolean boolean86 = linkedListTestDriver46.equals_CUT((java.lang.Object) objArray85);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj87 = linkedListTestDriver46.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "hi!" + "'", obj3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "hi!" + "'", obj33, "hi!");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(iterator42);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(iterator56);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertNotNull(iterator59);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertEquals("'" + obj72 + "' != '" + "hi!" + "'", obj72, "hi!");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(iterator81);
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertNotNull(obj83);
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test195");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) "hi!");
        java.lang.Object obj3 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj7 = new java.lang.Object();
        linkedListTestDriver4.addFirst(obj7);
        java.lang.Object obj9 = linkedListTestDriver4.getLast();
        boolean boolean10 = linkedListTestDriver4.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver11.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj14 = new java.lang.Object();
        linkedListTestDriver11.addFirst(obj14);
        experiment.util.Iterator iterator16 = linkedListTestDriver11.iterator();
        boolean boolean17 = linkedListTestDriver4.add((java.lang.Object) linkedListTestDriver11);
        java.lang.Object obj18 = linkedListTestDriver11.removeFirst();
        java.lang.Object[] objArray19 = linkedListTestDriver11.toArray();
        boolean boolean20 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver11);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        boolean boolean24 = linkedListTestDriver22.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj25 = new java.lang.Object();
        linkedListTestDriver22.addFirst(obj25);
        experiment.util.Iterator iterator27 = linkedListTestDriver22.iterator();
        java.lang.Object[] objArray28 = linkedListTestDriver22.toArray();
        java.lang.Object obj29 = linkedListTestDriver22.getFirst();
        experiment.util.Iterator iterator30 = linkedListTestDriver22.iterator();
        java.lang.Object obj31 = linkedListTestDriver22.getFirst();
        boolean boolean33 = linkedListTestDriver22.contains((java.lang.Object) 100.0d);
        java.lang.Object obj34 = linkedListTestDriver22.getFirst();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) ' ', (java.lang.Object) linkedListTestDriver22);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 32; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "hi!" + "'", obj3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(obj34);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test196");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = new java.lang.Object();
        linkedListTestDriver7.addFirst(obj10);
        experiment.util.Iterator iterator12 = linkedListTestDriver7.iterator();
        boolean boolean13 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver7);
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        boolean boolean16 = linkedListTestDriver14.add((java.lang.Object) "hi!");
        java.lang.Object obj17 = linkedListTestDriver14.removeFirst();
        boolean boolean18 = linkedListTestDriver7.contains((java.lang.Object) linkedListTestDriver14);
        linkedListTestDriver14.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        boolean boolean21 = linkedListTestDriver14.contains((java.lang.Object) linkedListTestDriver20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = linkedListTestDriver14.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "hi!" + "'", obj17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test197");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = new java.lang.Object();
        linkedListTestDriver7.addFirst(obj10);
        experiment.util.Iterator iterator12 = linkedListTestDriver7.iterator();
        boolean boolean13 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver7);
        java.lang.Object obj14 = linkedListTestDriver7.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        boolean boolean17 = linkedListTestDriver15.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = new java.lang.Object();
        linkedListTestDriver15.addFirst(obj18);
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        boolean boolean22 = linkedListTestDriver20.add((java.lang.Object) "hi!");
        java.lang.Object obj23 = linkedListTestDriver20.removeLast();
        linkedListTestDriver20.addLast((java.lang.Object) '#');
        linkedListTestDriver15.addLast((java.lang.Object) linkedListTestDriver20);
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        boolean boolean30 = linkedListTestDriver28.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj31 = new java.lang.Object();
        linkedListTestDriver28.addFirst(obj31);
        experiment.util.Iterator iterator33 = linkedListTestDriver28.iterator();
        java.lang.Object[] objArray34 = linkedListTestDriver28.toArray();
        linkedListTestDriver20.add((int) (byte) 1, (java.lang.Object) linkedListTestDriver28);
        boolean boolean36 = linkedListTestDriver7.contains((java.lang.Object) linkedListTestDriver20);
        boolean boolean37 = linkedListTestDriver7.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver39 = new experiment.util.LinkedListTestDriver();
        boolean boolean41 = linkedListTestDriver39.add((java.lang.Object) "hi!");
        java.lang.Object obj42 = linkedListTestDriver39.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver43 = new experiment.util.LinkedListTestDriver();
        boolean boolean45 = linkedListTestDriver43.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj46 = new java.lang.Object();
        linkedListTestDriver43.addFirst(obj46);
        java.lang.Object obj48 = linkedListTestDriver43.getLast();
        boolean boolean49 = linkedListTestDriver43.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver50 = new experiment.util.LinkedListTestDriver();
        boolean boolean52 = linkedListTestDriver50.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj53 = new java.lang.Object();
        linkedListTestDriver50.addFirst(obj53);
        experiment.util.Iterator iterator55 = linkedListTestDriver50.iterator();
        boolean boolean56 = linkedListTestDriver43.add((java.lang.Object) linkedListTestDriver50);
        java.lang.Object obj57 = linkedListTestDriver50.removeFirst();
        java.lang.Object[] objArray58 = linkedListTestDriver50.toArray();
        boolean boolean59 = linkedListTestDriver39.equals_CUT((java.lang.Object) linkedListTestDriver50);
        linkedListTestDriver50.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver61 = new experiment.util.LinkedListTestDriver();
        boolean boolean63 = linkedListTestDriver61.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj64 = new java.lang.Object();
        linkedListTestDriver61.addFirst(obj64);
        java.lang.Object obj66 = linkedListTestDriver61.getLast();
        boolean boolean67 = linkedListTestDriver50.remove((java.lang.Object) linkedListTestDriver61);
        experiment.util.Iterator iterator68 = linkedListTestDriver61.iterator();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver7.add((int) (byte) -1, (java.lang.Object) linkedListTestDriver61);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "hi!" + "'", obj23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + "hi!" + "'", obj42, "hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(iterator55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(obj66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(iterator68);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test198");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) "hi!");
        java.lang.Object obj8 = linkedListTestDriver5.removeLast();
        linkedListTestDriver5.addLast((java.lang.Object) '#');
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj16 = new java.lang.Object();
        linkedListTestDriver13.addFirst(obj16);
        experiment.util.Iterator iterator18 = linkedListTestDriver13.iterator();
        java.lang.Object[] objArray19 = linkedListTestDriver13.toArray();
        linkedListTestDriver5.add((int) (byte) 1, (java.lang.Object) linkedListTestDriver13);
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        boolean boolean23 = linkedListTestDriver21.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj24 = new java.lang.Object();
        linkedListTestDriver21.addFirst(obj24);
        experiment.util.Iterator iterator26 = linkedListTestDriver21.iterator();
        java.lang.Object[] objArray27 = linkedListTestDriver21.toArray();
        java.lang.Object obj28 = linkedListTestDriver21.getFirst();
        experiment.util.Iterator iterator29 = linkedListTestDriver21.iterator();
        boolean boolean30 = linkedListTestDriver5.contains((java.lang.Object) iterator29);
        java.lang.Object obj33 = linkedListTestDriver5.set((int) (short) 0, (java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        boolean boolean36 = linkedListTestDriver34.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj37 = new java.lang.Object();
        linkedListTestDriver34.addFirst(obj37);
        experiment.util.Iterator iterator39 = linkedListTestDriver34.iterator();
        java.lang.Object[] objArray40 = linkedListTestDriver34.toArray();
        boolean boolean41 = linkedListTestDriver5.equals_CUT((java.lang.Object) objArray40);
        java.lang.Object obj42 = linkedListTestDriver5.getLast();
        java.lang.Object obj43 = linkedListTestDriver5.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver44 = new experiment.util.LinkedListTestDriver();
        boolean boolean46 = linkedListTestDriver44.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj47 = new java.lang.Object();
        linkedListTestDriver44.addFirst(obj47);
        java.lang.Object obj49 = linkedListTestDriver44.getLast();
        boolean boolean50 = linkedListTestDriver5.equals_CUT((java.lang.Object) linkedListTestDriver44);
        java.lang.Object obj51 = linkedListTestDriver44.getFirst();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + '#' + "'", obj33, '#');
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(obj51);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test199");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray6 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        boolean boolean10 = linkedListTestDriver8.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj11 = new java.lang.Object();
        linkedListTestDriver8.addFirst(obj11);
        experiment.util.Iterator iterator13 = linkedListTestDriver8.iterator();
        experiment.util.Iterator iterator14 = linkedListTestDriver8.iterator();
        experiment.util.Iterator iterator15 = linkedListTestDriver8.iterator();
        linkedListTestDriver8.clear();
        boolean boolean17 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = linkedListTestDriver8.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test200");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 100L);
        java.lang.Object[] objArray3 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj9 = new java.lang.Object();
        linkedListTestDriver6.addFirst(obj9);
        java.lang.Object obj11 = linkedListTestDriver6.getLast();
        boolean boolean12 = linkedListTestDriver6.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj16 = new java.lang.Object();
        linkedListTestDriver13.addFirst(obj16);
        experiment.util.Iterator iterator18 = linkedListTestDriver13.iterator();
        boolean boolean19 = linkedListTestDriver6.add((java.lang.Object) linkedListTestDriver13);
        linkedListTestDriver13.add((int) (byte) 1, (java.lang.Object) (-1.0d));
        linkedListTestDriver4.addFirst((java.lang.Object) (byte) 1);
        boolean boolean24 = linkedListTestDriver0.remove((java.lang.Object) (byte) 1);
        java.lang.Object[] objArray25 = linkedListTestDriver0.toArray();
        boolean boolean26 = linkedListTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass27 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test201");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray6 = linkedListTestDriver0.toArray();
        java.lang.Object obj7 = linkedListTestDriver0.getFirst();
        linkedListTestDriver0.addLast((java.lang.Object) (short) 0);
        int int10 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver11.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj14 = new java.lang.Object();
        linkedListTestDriver11.addFirst(obj14);
        experiment.util.Iterator iterator16 = linkedListTestDriver11.iterator();
        int int17 = linkedListTestDriver11.size();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver11);
        java.lang.Object[] objArray19 = linkedListTestDriver11.toArray();
        java.lang.Object obj20 = linkedListTestDriver11.getLast();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test202");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) "hi!");
        java.lang.Object obj8 = linkedListTestDriver5.removeLast();
        linkedListTestDriver5.addLast((java.lang.Object) '#');
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj16 = new java.lang.Object();
        linkedListTestDriver13.addFirst(obj16);
        experiment.util.Iterator iterator18 = linkedListTestDriver13.iterator();
        java.lang.Object[] objArray19 = linkedListTestDriver13.toArray();
        linkedListTestDriver5.add((int) (byte) 1, (java.lang.Object) linkedListTestDriver13);
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        boolean boolean23 = linkedListTestDriver21.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj24 = new java.lang.Object();
        linkedListTestDriver21.addFirst(obj24);
        experiment.util.Iterator iterator26 = linkedListTestDriver21.iterator();
        java.lang.Object[] objArray27 = linkedListTestDriver21.toArray();
        java.lang.Object obj28 = linkedListTestDriver21.getFirst();
        experiment.util.Iterator iterator29 = linkedListTestDriver21.iterator();
        boolean boolean30 = linkedListTestDriver5.contains((java.lang.Object) iterator29);
        java.lang.Object obj33 = linkedListTestDriver5.set((int) (short) 0, (java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        boolean boolean36 = linkedListTestDriver34.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj37 = new java.lang.Object();
        linkedListTestDriver34.addFirst(obj37);
        experiment.util.Iterator iterator39 = linkedListTestDriver34.iterator();
        java.lang.Object[] objArray40 = linkedListTestDriver34.toArray();
        boolean boolean41 = linkedListTestDriver5.equals_CUT((java.lang.Object) objArray40);
        java.lang.Object obj42 = linkedListTestDriver5.getLast();
        java.lang.Object obj43 = linkedListTestDriver5.removeLast();
        linkedListTestDriver5.clear();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator46 = linkedListTestDriver5.listIterator(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 1; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + '#' + "'", obj33, '#');
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertNotNull(obj43);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test203");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        boolean boolean4 = linkedListTestDriver2.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj5 = new java.lang.Object();
        linkedListTestDriver2.addFirst(obj5);
        java.lang.Object obj7 = linkedListTestDriver2.getLast();
        boolean boolean8 = linkedListTestDriver2.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj12 = new java.lang.Object();
        linkedListTestDriver9.addFirst(obj12);
        experiment.util.Iterator iterator14 = linkedListTestDriver9.iterator();
        boolean boolean15 = linkedListTestDriver2.add((java.lang.Object) linkedListTestDriver9);
        linkedListTestDriver9.add((int) (byte) 1, (java.lang.Object) (-1.0d));
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        boolean boolean22 = linkedListTestDriver20.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj23 = new java.lang.Object();
        linkedListTestDriver20.addFirst(obj23);
        experiment.util.Iterator iterator25 = linkedListTestDriver20.iterator();
        java.lang.Object[] objArray26 = linkedListTestDriver20.toArray();
        java.lang.Object obj27 = linkedListTestDriver20.getFirst();
        experiment.util.Iterator iterator28 = linkedListTestDriver20.iterator();
        java.lang.Object obj29 = linkedListTestDriver20.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        boolean boolean33 = linkedListTestDriver31.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj34 = new java.lang.Object();
        linkedListTestDriver31.addFirst(obj34);
        java.lang.Object obj36 = linkedListTestDriver31.getLast();
        boolean boolean37 = linkedListTestDriver31.isEmpty();
        linkedListTestDriver20.add(1, (java.lang.Object) boolean37);
        java.lang.Object obj40 = linkedListTestDriver20.remove(1);
        linkedListTestDriver0.addLast((java.lang.Object) 1);
        java.lang.Object obj42 = linkedListTestDriver0.getFirst();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + false + "'", obj40, false);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (byte) 1 + "'", obj42, (byte) 1);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test204");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray6 = linkedListTestDriver0.toArray();
        java.lang.Object obj7 = linkedListTestDriver0.getFirst();
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        java.lang.Object obj9 = linkedListTestDriver0.getFirst();
        java.lang.Object obj10 = linkedListTestDriver0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = linkedListTestDriver0.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test205");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) "hi!");
        java.lang.Object obj8 = linkedListTestDriver5.removeLast();
        linkedListTestDriver5.addLast((java.lang.Object) '#');
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        boolean boolean14 = linkedListTestDriver12.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj15 = new java.lang.Object();
        linkedListTestDriver12.addFirst(obj15);
        experiment.util.Iterator iterator17 = linkedListTestDriver12.iterator();
        java.lang.Object[] objArray18 = linkedListTestDriver12.toArray();
        java.lang.Object obj19 = linkedListTestDriver12.getFirst();
        experiment.util.Iterator iterator20 = linkedListTestDriver12.iterator();
        java.lang.Object obj21 = linkedListTestDriver12.getFirst();
        boolean boolean22 = linkedListTestDriver5.add((java.lang.Object) linkedListTestDriver12);
        java.lang.Object obj23 = linkedListTestDriver5.removeFirst();
        java.lang.Object[] objArray24 = linkedListTestDriver5.toArray();
        experiment.util.Iterator iterator25 = linkedListTestDriver5.iterator();
        java.lang.Class<?> wildcardClass26 = linkedListTestDriver5.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + '#' + "'", obj23, '#');
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test206");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) "hi!");
        java.lang.Object obj8 = linkedListTestDriver5.removeLast();
        linkedListTestDriver5.addLast((java.lang.Object) '#');
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        boolean boolean14 = linkedListTestDriver12.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj15 = new java.lang.Object();
        linkedListTestDriver12.addFirst(obj15);
        experiment.util.Iterator iterator17 = linkedListTestDriver12.iterator();
        java.lang.Object[] objArray18 = linkedListTestDriver12.toArray();
        java.lang.Object obj19 = linkedListTestDriver12.getFirst();
        linkedListTestDriver5.addLast((java.lang.Object) linkedListTestDriver12);
        java.lang.Object[] objArray21 = linkedListTestDriver5.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        boolean boolean24 = linkedListTestDriver22.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj25 = new java.lang.Object();
        linkedListTestDriver22.addFirst(obj25);
        experiment.util.LinkedListTestDriver linkedListTestDriver27 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver27.clear();
        boolean boolean30 = linkedListTestDriver27.remove((java.lang.Object) (byte) 0);
        boolean boolean31 = linkedListTestDriver22.contains((java.lang.Object) linkedListTestDriver27);
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        boolean boolean34 = linkedListTestDriver32.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj35 = new java.lang.Object();
        linkedListTestDriver32.addFirst(obj35);
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        boolean boolean39 = linkedListTestDriver37.add((java.lang.Object) "hi!");
        java.lang.Object obj40 = linkedListTestDriver37.removeLast();
        linkedListTestDriver37.addLast((java.lang.Object) '#');
        linkedListTestDriver32.addLast((java.lang.Object) linkedListTestDriver37);
        boolean boolean45 = linkedListTestDriver32.remove((java.lang.Object) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver47 = new experiment.util.LinkedListTestDriver();
        boolean boolean49 = linkedListTestDriver47.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj50 = new java.lang.Object();
        linkedListTestDriver47.addFirst(obj50);
        experiment.util.Iterator iterator52 = linkedListTestDriver47.iterator();
        experiment.util.Iterator iterator53 = linkedListTestDriver47.iterator();
        linkedListTestDriver32.add(2, (java.lang.Object) linkedListTestDriver47);
        boolean boolean55 = linkedListTestDriver22.contains((java.lang.Object) linkedListTestDriver47);
        experiment.util.LinkedListTestDriver linkedListTestDriver56 = new experiment.util.LinkedListTestDriver();
        boolean boolean58 = linkedListTestDriver56.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj59 = new java.lang.Object();
        linkedListTestDriver56.addFirst(obj59);
        experiment.util.Iterator iterator61 = linkedListTestDriver56.iterator();
        java.lang.Object[] objArray62 = linkedListTestDriver56.toArray();
        java.lang.Object obj63 = linkedListTestDriver56.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver64 = new experiment.util.LinkedListTestDriver();
        boolean boolean66 = linkedListTestDriver64.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj67 = new java.lang.Object();
        linkedListTestDriver64.addFirst(obj67);
        experiment.util.LinkedListTestDriver linkedListTestDriver69 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver69.clear();
        boolean boolean72 = linkedListTestDriver69.remove((java.lang.Object) (byte) 0);
        boolean boolean73 = linkedListTestDriver64.contains((java.lang.Object) linkedListTestDriver69);
        java.lang.Object obj74 = linkedListTestDriver64.getFirst();
        linkedListTestDriver56.addFirst(obj74);
        experiment.util.LinkedListTestDriver linkedListTestDriver76 = new experiment.util.LinkedListTestDriver();
        boolean boolean78 = linkedListTestDriver76.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj79 = new java.lang.Object();
        linkedListTestDriver76.addFirst(obj79);
        experiment.util.LinkedListTestDriver linkedListTestDriver81 = new experiment.util.LinkedListTestDriver();
        boolean boolean83 = linkedListTestDriver81.add((java.lang.Object) "hi!");
        java.lang.Object obj84 = linkedListTestDriver81.removeLast();
        linkedListTestDriver81.addLast((java.lang.Object) '#');
        linkedListTestDriver76.addLast((java.lang.Object) linkedListTestDriver81);
        java.lang.Object obj88 = linkedListTestDriver76.getLast();
        linkedListTestDriver56.addFirst((java.lang.Object) linkedListTestDriver76);
        java.lang.Object obj91 = linkedListTestDriver56.get((int) (byte) 1);
        linkedListTestDriver47.addFirst((java.lang.Object) linkedListTestDriver56);
        java.lang.Object obj93 = linkedListTestDriver56.getLast();
        java.lang.Object obj94 = linkedListTestDriver56.getLast();
        java.lang.Class<?> wildcardClass95 = linkedListTestDriver56.getClass();
        linkedListTestDriver5.addFirst((java.lang.Object) wildcardClass95);
        java.lang.Object obj97 = linkedListTestDriver5.removeFirst();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + "hi!" + "'", obj40, "hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(iterator52);
        org.junit.Assert.assertNotNull(iterator53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(iterator61);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertNotNull(obj63);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(obj74);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertEquals("'" + obj84 + "' != '" + "hi!" + "'", obj84, "hi!");
        org.junit.Assert.assertNotNull(obj88);
        org.junit.Assert.assertNotNull(obj91);
        org.junit.Assert.assertNotNull(obj93);
        org.junit.Assert.assertNotNull(obj94);
        org.junit.Assert.assertNotNull(wildcardClass95);
        org.junit.Assert.assertNotNull(obj97);
        org.junit.Assert.assertEquals(obj97.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj97), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj97), "class experiment.util.LinkedListTestDriver");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test207");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray6 = linkedListTestDriver0.toArray();
        java.lang.Object obj7 = linkedListTestDriver0.getFirst();
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        java.lang.Object obj9 = linkedListTestDriver0.getFirst();
        java.lang.Object obj10 = linkedListTestDriver0.removeFirst();
        boolean boolean11 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        boolean boolean14 = linkedListTestDriver12.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj15 = new java.lang.Object();
        linkedListTestDriver12.addFirst(obj15);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        boolean boolean19 = linkedListTestDriver17.add((java.lang.Object) "hi!");
        java.lang.Object obj20 = linkedListTestDriver17.removeLast();
        linkedListTestDriver17.addLast((java.lang.Object) '#');
        linkedListTestDriver12.addLast((java.lang.Object) linkedListTestDriver17);
        boolean boolean25 = linkedListTestDriver12.remove((java.lang.Object) 10);
        boolean boolean26 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver12);
        experiment.util.LinkedListTestDriver linkedListTestDriver27 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver27.clear();
        boolean boolean30 = linkedListTestDriver27.add((java.lang.Object) (short) 1);
        int int31 = linkedListTestDriver27.size();
        linkedListTestDriver27.clear();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver27);
        java.lang.Object obj34 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver36 = new experiment.util.LinkedListTestDriver();
        boolean boolean38 = linkedListTestDriver36.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj39 = new java.lang.Object();
        linkedListTestDriver36.addFirst(obj39);
        experiment.util.LinkedListTestDriver linkedListTestDriver41 = new experiment.util.LinkedListTestDriver();
        boolean boolean43 = linkedListTestDriver41.add((java.lang.Object) "hi!");
        java.lang.Object obj44 = linkedListTestDriver41.removeLast();
        linkedListTestDriver41.addLast((java.lang.Object) '#');
        linkedListTestDriver36.addLast((java.lang.Object) linkedListTestDriver41);
        experiment.util.LinkedListTestDriver linkedListTestDriver48 = new experiment.util.LinkedListTestDriver();
        boolean boolean50 = linkedListTestDriver48.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj51 = new java.lang.Object();
        linkedListTestDriver48.addFirst(obj51);
        experiment.util.Iterator iterator53 = linkedListTestDriver48.iterator();
        java.lang.Object[] objArray54 = linkedListTestDriver48.toArray();
        java.lang.Object obj55 = linkedListTestDriver48.getFirst();
        linkedListTestDriver41.addLast((java.lang.Object) linkedListTestDriver48);
        experiment.util.LinkedListTestDriver linkedListTestDriver57 = new experiment.util.LinkedListTestDriver();
        boolean boolean59 = linkedListTestDriver57.add((java.lang.Object) "hi!");
        linkedListTestDriver41.addLast((java.lang.Object) linkedListTestDriver57);
        experiment.util.LinkedListTestDriver linkedListTestDriver61 = new experiment.util.LinkedListTestDriver();
        boolean boolean63 = linkedListTestDriver61.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj64 = new java.lang.Object();
        linkedListTestDriver61.addFirst(obj64);
        experiment.util.LinkedListTestDriver linkedListTestDriver66 = new experiment.util.LinkedListTestDriver();
        boolean boolean68 = linkedListTestDriver66.add((java.lang.Object) "hi!");
        java.lang.Object obj69 = linkedListTestDriver66.removeLast();
        linkedListTestDriver66.addLast((java.lang.Object) '#');
        linkedListTestDriver61.addLast((java.lang.Object) linkedListTestDriver66);
        experiment.util.LinkedListTestDriver linkedListTestDriver73 = new experiment.util.LinkedListTestDriver();
        boolean boolean75 = linkedListTestDriver73.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj76 = new java.lang.Object();
        linkedListTestDriver73.addFirst(obj76);
        experiment.util.Iterator iterator78 = linkedListTestDriver73.iterator();
        java.lang.Object[] objArray79 = linkedListTestDriver73.toArray();
        java.lang.Object obj80 = linkedListTestDriver73.getFirst();
        linkedListTestDriver66.addLast((java.lang.Object) linkedListTestDriver73);
        java.lang.Object[] objArray82 = linkedListTestDriver73.toArray();
        experiment.util.ListIterator listIterator84 = linkedListTestDriver73.listIterator(0);
        linkedListTestDriver57.addLast((java.lang.Object) linkedListTestDriver73);
        experiment.util.LinkedListTestDriver linkedListTestDriver87 = new experiment.util.LinkedListTestDriver();
        boolean boolean89 = linkedListTestDriver87.remove((java.lang.Object) 100L);
        boolean boolean90 = linkedListTestDriver87.isEmpty();
        linkedListTestDriver73.add(1, (java.lang.Object) boolean90);
        experiment.util.Iterator iterator92 = linkedListTestDriver73.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj93 = linkedListTestDriver0.set((int) ' ', (java.lang.Object) linkedListTestDriver73);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "hi!" + "'", obj20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + "hi!" + "'", obj44, "hi!");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(iterator53);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + "hi!" + "'", obj69, "hi!");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(iterator78);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertNotNull(obj80);
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertNotNull(listIterator84);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(iterator92);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test208");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        boolean boolean4 = linkedListTestDriver2.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj5 = new java.lang.Object();
        linkedListTestDriver2.addFirst(obj5);
        java.lang.Object obj7 = linkedListTestDriver2.getLast();
        boolean boolean8 = linkedListTestDriver2.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj12 = new java.lang.Object();
        linkedListTestDriver9.addFirst(obj12);
        experiment.util.Iterator iterator14 = linkedListTestDriver9.iterator();
        boolean boolean15 = linkedListTestDriver2.add((java.lang.Object) linkedListTestDriver9);
        linkedListTestDriver9.add((int) (byte) 1, (java.lang.Object) (-1.0d));
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        boolean boolean22 = linkedListTestDriver20.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj23 = new java.lang.Object();
        linkedListTestDriver20.addFirst(obj23);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        boolean boolean27 = linkedListTestDriver25.add((java.lang.Object) "hi!");
        java.lang.Object obj28 = linkedListTestDriver25.removeLast();
        linkedListTestDriver25.addLast((java.lang.Object) '#');
        linkedListTestDriver20.addLast((java.lang.Object) linkedListTestDriver25);
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        boolean boolean34 = linkedListTestDriver32.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj35 = new java.lang.Object();
        linkedListTestDriver32.addFirst(obj35);
        experiment.util.Iterator iterator37 = linkedListTestDriver32.iterator();
        java.lang.Object[] objArray38 = linkedListTestDriver32.toArray();
        java.lang.Object obj39 = linkedListTestDriver32.getFirst();
        linkedListTestDriver25.addLast((java.lang.Object) linkedListTestDriver32);
        experiment.util.LinkedListTestDriver linkedListTestDriver41 = new experiment.util.LinkedListTestDriver();
        boolean boolean43 = linkedListTestDriver41.add((java.lang.Object) "hi!");
        linkedListTestDriver25.addLast((java.lang.Object) linkedListTestDriver41);
        boolean boolean45 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver41);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj47 = linkedListTestDriver0.get((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "hi!" + "'", obj28, "hi!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test209");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) "hi!");
        java.lang.Object obj3 = linkedListTestDriver0.removeLast();
        linkedListTestDriver0.addLast((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj9 = new java.lang.Object();
        linkedListTestDriver6.addFirst(obj9);
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.clear();
        boolean boolean14 = linkedListTestDriver11.remove((java.lang.Object) (byte) 0);
        boolean boolean15 = linkedListTestDriver6.contains((java.lang.Object) linkedListTestDriver11);
        boolean boolean16 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver11);
        boolean boolean17 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver18.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj21 = new java.lang.Object();
        linkedListTestDriver18.addFirst(obj21);
        java.lang.Object obj23 = linkedListTestDriver18.getLast();
        boolean boolean24 = linkedListTestDriver18.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        boolean boolean27 = linkedListTestDriver25.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj28 = new java.lang.Object();
        linkedListTestDriver25.addFirst(obj28);
        experiment.util.Iterator iterator30 = linkedListTestDriver25.iterator();
        boolean boolean31 = linkedListTestDriver18.add((java.lang.Object) linkedListTestDriver25);
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        boolean boolean34 = linkedListTestDriver32.add((java.lang.Object) "hi!");
        java.lang.Object obj35 = linkedListTestDriver32.removeFirst();
        boolean boolean36 = linkedListTestDriver25.contains((java.lang.Object) linkedListTestDriver32);
        linkedListTestDriver32.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver38 = new experiment.util.LinkedListTestDriver();
        boolean boolean39 = linkedListTestDriver32.contains((java.lang.Object) linkedListTestDriver38);
        boolean boolean40 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver38);
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator43 = linkedListTestDriver0.listIterator((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 100; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "hi!" + "'", obj3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + "hi!" + "'", obj35, "hi!");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test210");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 100L);
        java.lang.Object[] objArray3 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.add((java.lang.Object) "hi!");
        java.lang.Object obj7 = linkedListTestDriver4.removeFirst();
        linkedListTestDriver4.clear();
        boolean boolean9 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver4);
        experiment.util.Iterator iterator10 = linkedListTestDriver4.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "hi!" + "'", obj7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test211");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) "hi!");
        java.lang.Object obj3 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj7 = new java.lang.Object();
        linkedListTestDriver4.addFirst(obj7);
        java.lang.Object obj9 = linkedListTestDriver4.getLast();
        boolean boolean10 = linkedListTestDriver4.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver11.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj14 = new java.lang.Object();
        linkedListTestDriver11.addFirst(obj14);
        experiment.util.Iterator iterator16 = linkedListTestDriver11.iterator();
        boolean boolean17 = linkedListTestDriver4.add((java.lang.Object) linkedListTestDriver11);
        java.lang.Object obj18 = linkedListTestDriver11.removeFirst();
        java.lang.Object[] objArray19 = linkedListTestDriver11.toArray();
        boolean boolean20 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver11);
        linkedListTestDriver11.clear();
        boolean boolean22 = linkedListTestDriver11.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        boolean boolean25 = linkedListTestDriver23.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj26 = new java.lang.Object();
        linkedListTestDriver23.addFirst(obj26);
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver28.clear();
        boolean boolean31 = linkedListTestDriver28.remove((java.lang.Object) (byte) 0);
        boolean boolean32 = linkedListTestDriver23.contains((java.lang.Object) linkedListTestDriver28);
        experiment.util.LinkedListTestDriver linkedListTestDriver33 = new experiment.util.LinkedListTestDriver();
        boolean boolean35 = linkedListTestDriver33.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj36 = new java.lang.Object();
        linkedListTestDriver33.addFirst(obj36);
        java.lang.Object obj38 = linkedListTestDriver33.getLast();
        boolean boolean39 = linkedListTestDriver33.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver40 = new experiment.util.LinkedListTestDriver();
        boolean boolean42 = linkedListTestDriver40.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj43 = new java.lang.Object();
        linkedListTestDriver40.addFirst(obj43);
        experiment.util.Iterator iterator45 = linkedListTestDriver40.iterator();
        boolean boolean46 = linkedListTestDriver33.add((java.lang.Object) linkedListTestDriver40);
        linkedListTestDriver28.addFirst((java.lang.Object) linkedListTestDriver33);
        experiment.util.Iterator iterator48 = linkedListTestDriver28.iterator();
        boolean boolean49 = linkedListTestDriver11.equals_CUT((java.lang.Object) linkedListTestDriver28);
        boolean boolean50 = linkedListTestDriver11.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "hi!" + "'", obj3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(iterator45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(iterator48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test212");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = linkedListTestDriver0.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test213");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) "hi!");
        java.lang.Object obj8 = linkedListTestDriver5.removeLast();
        linkedListTestDriver5.addLast((java.lang.Object) '#');
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        boolean boolean14 = linkedListTestDriver12.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj15 = new java.lang.Object();
        linkedListTestDriver12.addFirst(obj15);
        experiment.util.Iterator iterator17 = linkedListTestDriver12.iterator();
        java.lang.Object[] objArray18 = linkedListTestDriver12.toArray();
        java.lang.Object obj19 = linkedListTestDriver12.getFirst();
        linkedListTestDriver5.addLast((java.lang.Object) linkedListTestDriver12);
        java.lang.Object[] objArray21 = linkedListTestDriver12.toArray();
        experiment.util.ListIterator listIterator23 = linkedListTestDriver12.listIterator(0);
        int int24 = linkedListTestDriver12.size();
        java.lang.Object[] objArray25 = linkedListTestDriver12.toArray();
        java.lang.Object obj26 = linkedListTestDriver12.removeFirst();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(listIterator23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(obj26);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test214");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver5.clear();
        boolean boolean8 = linkedListTestDriver5.remove((java.lang.Object) (byte) 0);
        boolean boolean9 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        boolean boolean12 = linkedListTestDriver10.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj13 = new java.lang.Object();
        linkedListTestDriver10.addFirst(obj13);
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        boolean boolean17 = linkedListTestDriver15.add((java.lang.Object) "hi!");
        java.lang.Object obj18 = linkedListTestDriver15.removeLast();
        linkedListTestDriver15.addLast((java.lang.Object) '#');
        linkedListTestDriver10.addLast((java.lang.Object) linkedListTestDriver15);
        boolean boolean23 = linkedListTestDriver10.remove((java.lang.Object) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        boolean boolean27 = linkedListTestDriver25.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj28 = new java.lang.Object();
        linkedListTestDriver25.addFirst(obj28);
        experiment.util.Iterator iterator30 = linkedListTestDriver25.iterator();
        experiment.util.Iterator iterator31 = linkedListTestDriver25.iterator();
        linkedListTestDriver10.add(2, (java.lang.Object) linkedListTestDriver25);
        boolean boolean33 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver25);
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        boolean boolean36 = linkedListTestDriver34.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj37 = new java.lang.Object();
        linkedListTestDriver34.addFirst(obj37);
        experiment.util.Iterator iterator39 = linkedListTestDriver34.iterator();
        java.lang.Object[] objArray40 = linkedListTestDriver34.toArray();
        java.lang.Object obj41 = linkedListTestDriver34.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver42 = new experiment.util.LinkedListTestDriver();
        boolean boolean44 = linkedListTestDriver42.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj45 = new java.lang.Object();
        linkedListTestDriver42.addFirst(obj45);
        experiment.util.LinkedListTestDriver linkedListTestDriver47 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver47.clear();
        boolean boolean50 = linkedListTestDriver47.remove((java.lang.Object) (byte) 0);
        boolean boolean51 = linkedListTestDriver42.contains((java.lang.Object) linkedListTestDriver47);
        java.lang.Object obj52 = linkedListTestDriver42.getFirst();
        linkedListTestDriver34.addFirst(obj52);
        experiment.util.LinkedListTestDriver linkedListTestDriver54 = new experiment.util.LinkedListTestDriver();
        boolean boolean56 = linkedListTestDriver54.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj57 = new java.lang.Object();
        linkedListTestDriver54.addFirst(obj57);
        experiment.util.LinkedListTestDriver linkedListTestDriver59 = new experiment.util.LinkedListTestDriver();
        boolean boolean61 = linkedListTestDriver59.add((java.lang.Object) "hi!");
        java.lang.Object obj62 = linkedListTestDriver59.removeLast();
        linkedListTestDriver59.addLast((java.lang.Object) '#');
        linkedListTestDriver54.addLast((java.lang.Object) linkedListTestDriver59);
        java.lang.Object obj66 = linkedListTestDriver54.getLast();
        linkedListTestDriver34.addFirst((java.lang.Object) linkedListTestDriver54);
        java.lang.Object obj69 = linkedListTestDriver34.get((int) (byte) 1);
        linkedListTestDriver25.addFirst((java.lang.Object) linkedListTestDriver34);
        java.lang.Object obj71 = linkedListTestDriver34.getLast();
        java.lang.Object obj72 = linkedListTestDriver34.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver73 = new experiment.util.LinkedListTestDriver();
        boolean boolean75 = linkedListTestDriver73.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj76 = new java.lang.Object();
        linkedListTestDriver73.addFirst(obj76);
        java.lang.Object obj78 = linkedListTestDriver73.getLast();
        boolean boolean79 = linkedListTestDriver73.isEmpty();
        java.lang.Object obj80 = linkedListTestDriver73.removeFirst();
        boolean boolean81 = linkedListTestDriver34.add((java.lang.Object) linkedListTestDriver73);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "hi!" + "'", obj18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + "hi!" + "'", obj62, "hi!");
        org.junit.Assert.assertNotNull(obj66);
        org.junit.Assert.assertNotNull(obj69);
        org.junit.Assert.assertNotNull(obj71);
        org.junit.Assert.assertNotNull(obj72);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(obj78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(obj80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test215");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = new java.lang.Object();
        linkedListTestDriver7.addFirst(obj10);
        experiment.util.Iterator iterator12 = linkedListTestDriver7.iterator();
        boolean boolean13 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver7);
        java.lang.Object obj14 = linkedListTestDriver7.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        boolean boolean18 = linkedListTestDriver16.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj19 = new java.lang.Object();
        linkedListTestDriver16.addFirst(obj19);
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        boolean boolean23 = linkedListTestDriver21.add((java.lang.Object) "hi!");
        java.lang.Object obj24 = linkedListTestDriver21.removeLast();
        linkedListTestDriver21.addLast((java.lang.Object) '#');
        linkedListTestDriver16.addLast((java.lang.Object) linkedListTestDriver21);
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        boolean boolean31 = linkedListTestDriver29.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj32 = new java.lang.Object();
        linkedListTestDriver29.addFirst(obj32);
        experiment.util.Iterator iterator34 = linkedListTestDriver29.iterator();
        java.lang.Object[] objArray35 = linkedListTestDriver29.toArray();
        linkedListTestDriver21.add((int) (byte) 1, (java.lang.Object) linkedListTestDriver29);
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        boolean boolean39 = linkedListTestDriver37.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj40 = new java.lang.Object();
        linkedListTestDriver37.addFirst(obj40);
        experiment.util.LinkedListTestDriver linkedListTestDriver42 = new experiment.util.LinkedListTestDriver();
        boolean boolean44 = linkedListTestDriver42.add((java.lang.Object) "hi!");
        java.lang.Object obj45 = linkedListTestDriver42.removeLast();
        linkedListTestDriver42.addLast((java.lang.Object) '#');
        linkedListTestDriver37.addLast((java.lang.Object) linkedListTestDriver42);
        experiment.util.LinkedListTestDriver linkedListTestDriver49 = new experiment.util.LinkedListTestDriver();
        boolean boolean51 = linkedListTestDriver49.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj52 = new java.lang.Object();
        linkedListTestDriver49.addFirst(obj52);
        experiment.util.Iterator iterator54 = linkedListTestDriver49.iterator();
        java.lang.Object[] objArray55 = linkedListTestDriver49.toArray();
        java.lang.Object obj56 = linkedListTestDriver49.getFirst();
        experiment.util.Iterator iterator57 = linkedListTestDriver49.iterator();
        java.lang.Object obj58 = linkedListTestDriver49.getFirst();
        boolean boolean59 = linkedListTestDriver42.add((java.lang.Object) linkedListTestDriver49);
        boolean boolean60 = linkedListTestDriver29.contains((java.lang.Object) linkedListTestDriver42);
        linkedListTestDriver7.add((int) (short) 0, (java.lang.Object) linkedListTestDriver29);
        linkedListTestDriver7.addLast((java.lang.Object) 100L);
        java.lang.Object obj64 = linkedListTestDriver7.removeFirst();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "hi!" + "'", obj24, "hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + "hi!" + "'", obj45, "hi!");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(iterator54);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertNotNull(iterator57);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(obj64);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test216");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) "hi!");
        java.lang.Object obj3 = linkedListTestDriver0.removeLast();
        linkedListTestDriver0.addLast((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj9 = new java.lang.Object();
        linkedListTestDriver6.addFirst(obj9);
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.clear();
        boolean boolean14 = linkedListTestDriver11.remove((java.lang.Object) (byte) 0);
        boolean boolean15 = linkedListTestDriver6.contains((java.lang.Object) linkedListTestDriver11);
        boolean boolean16 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver11);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        boolean boolean19 = linkedListTestDriver17.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj20 = new java.lang.Object();
        linkedListTestDriver17.addFirst(obj20);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver22.clear();
        boolean boolean25 = linkedListTestDriver22.remove((java.lang.Object) (byte) 0);
        boolean boolean26 = linkedListTestDriver17.contains((java.lang.Object) linkedListTestDriver22);
        boolean boolean27 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver17);
        java.lang.Object obj29 = linkedListTestDriver17.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = linkedListTestDriver17.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "hi!" + "'", obj3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(obj29);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test217");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add(2, obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test218");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        linkedListTestDriver0.clear();
        int int8 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.add((java.lang.Object) "hi!");
        java.lang.Object obj12 = linkedListTestDriver9.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj16 = new java.lang.Object();
        linkedListTestDriver13.addFirst(obj16);
        java.lang.Object obj18 = linkedListTestDriver13.getLast();
        boolean boolean19 = linkedListTestDriver13.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        boolean boolean22 = linkedListTestDriver20.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj23 = new java.lang.Object();
        linkedListTestDriver20.addFirst(obj23);
        experiment.util.Iterator iterator25 = linkedListTestDriver20.iterator();
        boolean boolean26 = linkedListTestDriver13.add((java.lang.Object) linkedListTestDriver20);
        java.lang.Object obj27 = linkedListTestDriver20.removeFirst();
        java.lang.Object[] objArray28 = linkedListTestDriver20.toArray();
        boolean boolean29 = linkedListTestDriver9.equals_CUT((java.lang.Object) linkedListTestDriver20);
        linkedListTestDriver20.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        boolean boolean33 = linkedListTestDriver31.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj34 = new java.lang.Object();
        linkedListTestDriver31.addFirst(obj34);
        java.lang.Object obj36 = linkedListTestDriver31.getLast();
        boolean boolean37 = linkedListTestDriver20.remove((java.lang.Object) linkedListTestDriver31);
        experiment.util.Iterator iterator38 = linkedListTestDriver20.iterator();
        boolean boolean39 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver20);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "hi!" + "'", obj12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test219");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = new java.lang.Object();
        linkedListTestDriver7.addFirst(obj10);
        experiment.util.Iterator iterator12 = linkedListTestDriver7.iterator();
        boolean boolean13 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver7);
        linkedListTestDriver7.add((int) (byte) 1, (java.lang.Object) (-1.0d));
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        boolean boolean19 = linkedListTestDriver17.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj20 = new java.lang.Object();
        linkedListTestDriver17.addFirst(obj20);
        experiment.util.Iterator iterator22 = linkedListTestDriver17.iterator();
        java.lang.Object[] objArray23 = linkedListTestDriver17.toArray();
        java.lang.Object obj24 = linkedListTestDriver17.getFirst();
        experiment.util.Iterator iterator25 = linkedListTestDriver17.iterator();
        java.lang.Object obj26 = linkedListTestDriver17.getFirst();
        boolean boolean27 = linkedListTestDriver7.equals_CUT((java.lang.Object) linkedListTestDriver17);
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        boolean boolean30 = linkedListTestDriver28.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj31 = new java.lang.Object();
        linkedListTestDriver28.addFirst(obj31);
        java.lang.Object obj33 = linkedListTestDriver28.getLast();
        boolean boolean34 = linkedListTestDriver28.isEmpty();
        linkedListTestDriver28.clear();
        boolean boolean36 = linkedListTestDriver7.equals_CUT((java.lang.Object) linkedListTestDriver28);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator38 = linkedListTestDriver7.listIterator((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test220");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) 100L);
        java.lang.Object[] objArray3 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj9 = new java.lang.Object();
        linkedListTestDriver6.addFirst(obj9);
        java.lang.Object obj11 = linkedListTestDriver6.getLast();
        boolean boolean12 = linkedListTestDriver6.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj16 = new java.lang.Object();
        linkedListTestDriver13.addFirst(obj16);
        experiment.util.Iterator iterator18 = linkedListTestDriver13.iterator();
        boolean boolean19 = linkedListTestDriver6.add((java.lang.Object) linkedListTestDriver13);
        linkedListTestDriver13.add((int) (byte) 1, (java.lang.Object) (-1.0d));
        linkedListTestDriver4.addFirst((java.lang.Object) (byte) 1);
        boolean boolean24 = linkedListTestDriver0.remove((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver25.clear();
        boolean boolean28 = linkedListTestDriver25.remove((java.lang.Object) (byte) 0);
        linkedListTestDriver0.addLast((java.lang.Object) (byte) 0);
        int int30 = linkedListTestDriver0.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test221");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) "hi!");
        java.lang.Object obj3 = linkedListTestDriver0.removeFirst();
        int int4 = linkedListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = linkedListTestDriver0.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "hi!" + "'", obj3, "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test222");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.clear();
        boolean boolean3 = linkedListTestDriver0.add((java.lang.Object) (short) 1);
        int int4 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = new java.lang.Object();
        linkedListTestDriver5.addFirst(obj8);
        experiment.util.Iterator iterator10 = linkedListTestDriver5.iterator();
        int int11 = linkedListTestDriver5.size();
        boolean boolean12 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver5);
        java.lang.Object obj13 = linkedListTestDriver0.getFirst();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (short) 1 + "'", obj13, (short) 1);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test223");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) "hi!");
        java.lang.Object obj8 = linkedListTestDriver5.removeLast();
        linkedListTestDriver5.addLast((java.lang.Object) '#');
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        boolean boolean13 = linkedListTestDriver0.remove((java.lang.Object) 10);
        boolean boolean15 = linkedListTestDriver0.equals_CUT((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        boolean boolean18 = linkedListTestDriver16.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj19 = new java.lang.Object();
        linkedListTestDriver16.addFirst(obj19);
        linkedListTestDriver0.addLast(obj19);
        java.lang.Object obj22 = linkedListTestDriver0.removeFirst();
        java.lang.Object obj23 = linkedListTestDriver0.getLast();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test224");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        boolean boolean4 = linkedListTestDriver2.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj5 = new java.lang.Object();
        linkedListTestDriver2.addFirst(obj5);
        java.lang.Object obj7 = linkedListTestDriver2.getLast();
        boolean boolean8 = linkedListTestDriver2.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj12 = new java.lang.Object();
        linkedListTestDriver9.addFirst(obj12);
        experiment.util.Iterator iterator14 = linkedListTestDriver9.iterator();
        boolean boolean15 = linkedListTestDriver2.add((java.lang.Object) linkedListTestDriver9);
        linkedListTestDriver9.add((int) (byte) 1, (java.lang.Object) (-1.0d));
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        boolean boolean22 = linkedListTestDriver20.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj23 = new java.lang.Object();
        linkedListTestDriver20.addFirst(obj23);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        boolean boolean27 = linkedListTestDriver25.add((java.lang.Object) "hi!");
        java.lang.Object obj28 = linkedListTestDriver25.removeLast();
        linkedListTestDriver25.addLast((java.lang.Object) '#');
        linkedListTestDriver20.addLast((java.lang.Object) linkedListTestDriver25);
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        boolean boolean34 = linkedListTestDriver32.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj35 = new java.lang.Object();
        linkedListTestDriver32.addFirst(obj35);
        experiment.util.Iterator iterator37 = linkedListTestDriver32.iterator();
        java.lang.Object[] objArray38 = linkedListTestDriver32.toArray();
        java.lang.Object obj39 = linkedListTestDriver32.getFirst();
        linkedListTestDriver25.addLast((java.lang.Object) linkedListTestDriver32);
        experiment.util.LinkedListTestDriver linkedListTestDriver41 = new experiment.util.LinkedListTestDriver();
        boolean boolean43 = linkedListTestDriver41.add((java.lang.Object) "hi!");
        linkedListTestDriver25.addLast((java.lang.Object) linkedListTestDriver41);
        boolean boolean45 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver41);
        experiment.util.LinkedListTestDriver linkedListTestDriver46 = new experiment.util.LinkedListTestDriver();
        boolean boolean48 = linkedListTestDriver46.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj49 = new java.lang.Object();
        linkedListTestDriver46.addFirst(obj49);
        experiment.util.Iterator iterator51 = linkedListTestDriver46.iterator();
        java.lang.Object[] objArray52 = linkedListTestDriver46.toArray();
        java.lang.Object obj53 = linkedListTestDriver46.getFirst();
        boolean boolean54 = linkedListTestDriver41.equals_CUT((java.lang.Object) linkedListTestDriver46);
        experiment.util.Iterator iterator55 = linkedListTestDriver46.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver56 = new experiment.util.LinkedListTestDriver();
        boolean boolean58 = linkedListTestDriver56.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj59 = new java.lang.Object();
        linkedListTestDriver56.addFirst(obj59);
        experiment.util.LinkedListTestDriver linkedListTestDriver61 = new experiment.util.LinkedListTestDriver();
        boolean boolean63 = linkedListTestDriver61.add((java.lang.Object) "hi!");
        java.lang.Object obj64 = linkedListTestDriver61.removeLast();
        linkedListTestDriver61.addLast((java.lang.Object) '#');
        linkedListTestDriver56.addLast((java.lang.Object) linkedListTestDriver61);
        experiment.util.LinkedListTestDriver linkedListTestDriver68 = new experiment.util.LinkedListTestDriver();
        boolean boolean70 = linkedListTestDriver68.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj71 = new java.lang.Object();
        linkedListTestDriver68.addFirst(obj71);
        experiment.util.Iterator iterator73 = linkedListTestDriver68.iterator();
        java.lang.Object[] objArray74 = linkedListTestDriver68.toArray();
        java.lang.Object obj75 = linkedListTestDriver68.getFirst();
        boolean boolean76 = linkedListTestDriver61.equals_CUT(obj75);
        linkedListTestDriver46.addLast((java.lang.Object) linkedListTestDriver61);
        java.lang.Object obj78 = linkedListTestDriver61.getLast();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "hi!" + "'", obj28, "hi!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(iterator51);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(iterator55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + "hi!" + "'", obj64, "hi!");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(iterator73);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertNotNull(obj75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertEquals("'" + obj78 + "' != '" + '#' + "'", obj78, '#');
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test225");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) "hi!");
        java.lang.Object obj3 = linkedListTestDriver0.removeFirst();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver5.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = new java.lang.Object();
        linkedListTestDriver7.addFirst(obj10);
        java.lang.Object obj12 = linkedListTestDriver7.getLast();
        boolean boolean13 = linkedListTestDriver7.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        boolean boolean16 = linkedListTestDriver14.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj17 = new java.lang.Object();
        linkedListTestDriver14.addFirst(obj17);
        experiment.util.Iterator iterator19 = linkedListTestDriver14.iterator();
        boolean boolean20 = linkedListTestDriver7.add((java.lang.Object) linkedListTestDriver14);
        linkedListTestDriver14.add((int) (byte) 1, (java.lang.Object) (-1.0d));
        linkedListTestDriver5.addFirst((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        boolean boolean27 = linkedListTestDriver25.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj28 = new java.lang.Object();
        linkedListTestDriver25.addFirst(obj28);
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        boolean boolean32 = linkedListTestDriver30.add((java.lang.Object) "hi!");
        java.lang.Object obj33 = linkedListTestDriver30.removeLast();
        linkedListTestDriver30.addLast((java.lang.Object) '#');
        linkedListTestDriver25.addLast((java.lang.Object) linkedListTestDriver30);
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        boolean boolean39 = linkedListTestDriver37.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj40 = new java.lang.Object();
        linkedListTestDriver37.addFirst(obj40);
        experiment.util.Iterator iterator42 = linkedListTestDriver37.iterator();
        java.lang.Object[] objArray43 = linkedListTestDriver37.toArray();
        java.lang.Object obj44 = linkedListTestDriver37.getFirst();
        linkedListTestDriver30.addLast((java.lang.Object) linkedListTestDriver37);
        experiment.util.LinkedListTestDriver linkedListTestDriver46 = new experiment.util.LinkedListTestDriver();
        boolean boolean48 = linkedListTestDriver46.add((java.lang.Object) "hi!");
        linkedListTestDriver30.addLast((java.lang.Object) linkedListTestDriver46);
        boolean boolean50 = linkedListTestDriver5.remove((java.lang.Object) linkedListTestDriver46);
        experiment.util.LinkedListTestDriver linkedListTestDriver51 = new experiment.util.LinkedListTestDriver();
        boolean boolean53 = linkedListTestDriver51.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj54 = new java.lang.Object();
        linkedListTestDriver51.addFirst(obj54);
        experiment.util.Iterator iterator56 = linkedListTestDriver51.iterator();
        java.lang.Object[] objArray57 = linkedListTestDriver51.toArray();
        java.lang.Object obj58 = linkedListTestDriver51.getFirst();
        experiment.util.Iterator iterator59 = linkedListTestDriver51.iterator();
        java.lang.Object obj60 = linkedListTestDriver51.getFirst();
        linkedListTestDriver46.addLast((java.lang.Object) linkedListTestDriver51);
        boolean boolean62 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver46);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator64 = linkedListTestDriver0.listIterator((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "hi!" + "'", obj3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "hi!" + "'", obj33, "hi!");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(iterator42);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(iterator56);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertNotNull(iterator59);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test226");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) "hi!");
        java.lang.Object obj8 = linkedListTestDriver5.removeLast();
        linkedListTestDriver5.addLast((java.lang.Object) '#');
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        boolean boolean14 = linkedListTestDriver12.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj15 = new java.lang.Object();
        linkedListTestDriver12.addFirst(obj15);
        experiment.util.Iterator iterator17 = linkedListTestDriver12.iterator();
        java.lang.Object[] objArray18 = linkedListTestDriver12.toArray();
        java.lang.Object obj19 = linkedListTestDriver12.getFirst();
        experiment.util.Iterator iterator20 = linkedListTestDriver12.iterator();
        java.lang.Object obj21 = linkedListTestDriver12.getFirst();
        boolean boolean22 = linkedListTestDriver5.add((java.lang.Object) linkedListTestDriver12);
        java.lang.Object obj23 = linkedListTestDriver5.removeFirst();
        java.lang.Object[] objArray24 = linkedListTestDriver5.toArray();
        java.lang.Object obj25 = linkedListTestDriver5.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver27 = new experiment.util.LinkedListTestDriver();
        boolean boolean29 = linkedListTestDriver27.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj30 = new java.lang.Object();
        linkedListTestDriver27.addFirst(obj30);
        experiment.util.Iterator iterator32 = linkedListTestDriver27.iterator();
        java.lang.Object[] objArray33 = linkedListTestDriver27.toArray();
        java.lang.Object obj34 = linkedListTestDriver27.getFirst();
        experiment.util.Iterator iterator35 = linkedListTestDriver27.iterator();
        java.lang.Object obj36 = linkedListTestDriver27.getFirst();
        java.lang.Object obj37 = linkedListTestDriver27.removeFirst();
        boolean boolean38 = linkedListTestDriver27.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver39 = new experiment.util.LinkedListTestDriver();
        boolean boolean41 = linkedListTestDriver39.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj42 = new java.lang.Object();
        linkedListTestDriver39.addFirst(obj42);
        experiment.util.LinkedListTestDriver linkedListTestDriver44 = new experiment.util.LinkedListTestDriver();
        boolean boolean46 = linkedListTestDriver44.add((java.lang.Object) "hi!");
        java.lang.Object obj47 = linkedListTestDriver44.removeLast();
        linkedListTestDriver44.addLast((java.lang.Object) '#');
        linkedListTestDriver39.addLast((java.lang.Object) linkedListTestDriver44);
        boolean boolean51 = linkedListTestDriver27.equals_CUT((java.lang.Object) linkedListTestDriver44);
        java.lang.Object[] objArray52 = linkedListTestDriver27.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj53 = linkedListTestDriver5.set((int) ' ', (java.lang.Object) objArray52);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + '#' + "'", obj23, '#');
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + "hi!" + "'", obj47, "hi!");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[]");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test227");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) "hi!");
        java.lang.Object obj8 = linkedListTestDriver5.removeLast();
        linkedListTestDriver5.addLast((java.lang.Object) '#');
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        boolean boolean14 = linkedListTestDriver12.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj15 = new java.lang.Object();
        linkedListTestDriver12.addFirst(obj15);
        experiment.util.Iterator iterator17 = linkedListTestDriver12.iterator();
        java.lang.Object[] objArray18 = linkedListTestDriver12.toArray();
        java.lang.Object obj19 = linkedListTestDriver12.getFirst();
        linkedListTestDriver5.addLast((java.lang.Object) linkedListTestDriver12);
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        boolean boolean23 = linkedListTestDriver21.add((java.lang.Object) "hi!");
        linkedListTestDriver5.addLast((java.lang.Object) linkedListTestDriver21);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        boolean boolean27 = linkedListTestDriver25.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj28 = new java.lang.Object();
        linkedListTestDriver25.addFirst(obj28);
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        boolean boolean32 = linkedListTestDriver30.add((java.lang.Object) "hi!");
        java.lang.Object obj33 = linkedListTestDriver30.removeLast();
        linkedListTestDriver30.addLast((java.lang.Object) '#');
        linkedListTestDriver25.addLast((java.lang.Object) linkedListTestDriver30);
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        boolean boolean39 = linkedListTestDriver37.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj40 = new java.lang.Object();
        linkedListTestDriver37.addFirst(obj40);
        experiment.util.Iterator iterator42 = linkedListTestDriver37.iterator();
        java.lang.Object[] objArray43 = linkedListTestDriver37.toArray();
        java.lang.Object obj44 = linkedListTestDriver37.getFirst();
        linkedListTestDriver30.addLast((java.lang.Object) linkedListTestDriver37);
        java.lang.Object[] objArray46 = linkedListTestDriver37.toArray();
        experiment.util.ListIterator listIterator48 = linkedListTestDriver37.listIterator(0);
        linkedListTestDriver21.addLast((java.lang.Object) linkedListTestDriver37);
        experiment.util.LinkedListTestDriver linkedListTestDriver51 = new experiment.util.LinkedListTestDriver();
        boolean boolean53 = linkedListTestDriver51.remove((java.lang.Object) 100L);
        boolean boolean54 = linkedListTestDriver51.isEmpty();
        linkedListTestDriver37.add(1, (java.lang.Object) boolean54);
        int int56 = linkedListTestDriver37.size();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator58 = linkedListTestDriver37.listIterator((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "hi!" + "'", obj33, "hi!");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(iterator42);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(listIterator48);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2 + "'", int56 == 2);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test228");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        boolean boolean4 = linkedListTestDriver2.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj5 = new java.lang.Object();
        linkedListTestDriver2.addFirst(obj5);
        java.lang.Object obj7 = linkedListTestDriver2.getLast();
        boolean boolean8 = linkedListTestDriver2.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj12 = new java.lang.Object();
        linkedListTestDriver9.addFirst(obj12);
        experiment.util.Iterator iterator14 = linkedListTestDriver9.iterator();
        boolean boolean15 = linkedListTestDriver2.add((java.lang.Object) linkedListTestDriver9);
        linkedListTestDriver9.add((int) (byte) 1, (java.lang.Object) (-1.0d));
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        boolean boolean22 = linkedListTestDriver20.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj23 = new java.lang.Object();
        linkedListTestDriver20.addFirst(obj23);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        boolean boolean27 = linkedListTestDriver25.add((java.lang.Object) "hi!");
        java.lang.Object obj28 = linkedListTestDriver25.removeLast();
        linkedListTestDriver25.addLast((java.lang.Object) '#');
        linkedListTestDriver20.addLast((java.lang.Object) linkedListTestDriver25);
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        boolean boolean34 = linkedListTestDriver32.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj35 = new java.lang.Object();
        linkedListTestDriver32.addFirst(obj35);
        experiment.util.Iterator iterator37 = linkedListTestDriver32.iterator();
        java.lang.Object[] objArray38 = linkedListTestDriver32.toArray();
        java.lang.Object obj39 = linkedListTestDriver32.getFirst();
        linkedListTestDriver25.addLast((java.lang.Object) linkedListTestDriver32);
        experiment.util.LinkedListTestDriver linkedListTestDriver41 = new experiment.util.LinkedListTestDriver();
        boolean boolean43 = linkedListTestDriver41.add((java.lang.Object) "hi!");
        linkedListTestDriver25.addLast((java.lang.Object) linkedListTestDriver41);
        boolean boolean45 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver41);
        java.lang.Class<?> wildcardClass46 = linkedListTestDriver41.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "hi!" + "'", obj28, "hi!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test229");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = new java.lang.Object();
        linkedListTestDriver7.addFirst(obj10);
        experiment.util.Iterator iterator12 = linkedListTestDriver7.iterator();
        boolean boolean13 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver7);
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        boolean boolean16 = linkedListTestDriver14.add((java.lang.Object) "hi!");
        java.lang.Object obj17 = linkedListTestDriver14.removeFirst();
        boolean boolean18 = linkedListTestDriver7.contains((java.lang.Object) linkedListTestDriver14);
        java.lang.Class<?> wildcardClass19 = linkedListTestDriver14.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "hi!" + "'", obj17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test230");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = new java.lang.Object();
        linkedListTestDriver7.addFirst(obj10);
        experiment.util.Iterator iterator12 = linkedListTestDriver7.iterator();
        boolean boolean13 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver7);
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        boolean boolean17 = linkedListTestDriver15.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = new java.lang.Object();
        linkedListTestDriver15.addFirst(obj18);
        experiment.util.Iterator iterator20 = linkedListTestDriver15.iterator();
        java.lang.Object[] objArray21 = linkedListTestDriver15.toArray();
        java.lang.Object obj22 = linkedListTestDriver15.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        boolean boolean25 = linkedListTestDriver23.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj26 = new java.lang.Object();
        linkedListTestDriver23.addFirst(obj26);
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver28.clear();
        boolean boolean31 = linkedListTestDriver28.remove((java.lang.Object) (byte) 0);
        boolean boolean32 = linkedListTestDriver23.contains((java.lang.Object) linkedListTestDriver28);
        java.lang.Object obj33 = linkedListTestDriver23.getFirst();
        linkedListTestDriver15.addFirst(obj33);
        java.lang.Object obj35 = linkedListTestDriver0.set((int) (short) 0, obj33);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj37 = linkedListTestDriver0.remove(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(obj35);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test231");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = new java.lang.Object();
        linkedListTestDriver7.addFirst(obj10);
        experiment.util.Iterator iterator12 = linkedListTestDriver7.iterator();
        boolean boolean13 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver7);
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        boolean boolean16 = linkedListTestDriver14.add((java.lang.Object) "hi!");
        java.lang.Object obj17 = linkedListTestDriver14.removeFirst();
        boolean boolean18 = linkedListTestDriver7.contains((java.lang.Object) linkedListTestDriver14);
        linkedListTestDriver14.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = linkedListTestDriver14.getLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "hi!" + "'", obj17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test232");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        java.lang.Object obj8 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.add((java.lang.Object) "hi!");
        java.lang.Object obj12 = linkedListTestDriver9.removeLast();
        linkedListTestDriver9.addLast((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        boolean boolean17 = linkedListTestDriver15.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = new java.lang.Object();
        linkedListTestDriver15.addFirst(obj18);
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver20.clear();
        boolean boolean23 = linkedListTestDriver20.remove((java.lang.Object) (byte) 0);
        boolean boolean24 = linkedListTestDriver15.contains((java.lang.Object) linkedListTestDriver20);
        boolean boolean25 = linkedListTestDriver9.equals_CUT((java.lang.Object) linkedListTestDriver20);
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        boolean boolean28 = linkedListTestDriver26.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj29 = new java.lang.Object();
        linkedListTestDriver26.addFirst(obj29);
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver31.clear();
        boolean boolean34 = linkedListTestDriver31.remove((java.lang.Object) (byte) 0);
        boolean boolean35 = linkedListTestDriver26.contains((java.lang.Object) linkedListTestDriver31);
        boolean boolean36 = linkedListTestDriver9.equals_CUT((java.lang.Object) linkedListTestDriver26);
        experiment.util.LinkedListTestDriver linkedListTestDriver38 = new experiment.util.LinkedListTestDriver();
        boolean boolean40 = linkedListTestDriver38.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj41 = new java.lang.Object();
        linkedListTestDriver38.addFirst(obj41);
        java.lang.Object obj43 = linkedListTestDriver38.getLast();
        boolean boolean44 = linkedListTestDriver38.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver45 = new experiment.util.LinkedListTestDriver();
        boolean boolean47 = linkedListTestDriver45.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj48 = new java.lang.Object();
        linkedListTestDriver45.addFirst(obj48);
        experiment.util.Iterator iterator50 = linkedListTestDriver45.iterator();
        boolean boolean51 = linkedListTestDriver38.add((java.lang.Object) linkedListTestDriver45);
        java.lang.Object obj52 = linkedListTestDriver45.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver53 = new experiment.util.LinkedListTestDriver();
        boolean boolean55 = linkedListTestDriver53.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj56 = new java.lang.Object();
        linkedListTestDriver53.addFirst(obj56);
        experiment.util.LinkedListTestDriver linkedListTestDriver58 = new experiment.util.LinkedListTestDriver();
        boolean boolean60 = linkedListTestDriver58.add((java.lang.Object) "hi!");
        java.lang.Object obj61 = linkedListTestDriver58.removeLast();
        linkedListTestDriver58.addLast((java.lang.Object) '#');
        linkedListTestDriver53.addLast((java.lang.Object) linkedListTestDriver58);
        experiment.util.LinkedListTestDriver linkedListTestDriver66 = new experiment.util.LinkedListTestDriver();
        boolean boolean68 = linkedListTestDriver66.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj69 = new java.lang.Object();
        linkedListTestDriver66.addFirst(obj69);
        experiment.util.Iterator iterator71 = linkedListTestDriver66.iterator();
        java.lang.Object[] objArray72 = linkedListTestDriver66.toArray();
        linkedListTestDriver58.add((int) (byte) 1, (java.lang.Object) linkedListTestDriver66);
        boolean boolean74 = linkedListTestDriver45.contains((java.lang.Object) linkedListTestDriver58);
        boolean boolean75 = linkedListTestDriver45.isEmpty();
        linkedListTestDriver9.add((int) (short) 1, (java.lang.Object) linkedListTestDriver45);
        boolean boolean77 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver9);
        experiment.util.LinkedListTestDriver linkedListTestDriver79 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver79.clear();
        boolean boolean82 = linkedListTestDriver79.add((java.lang.Object) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver9.add(3, (java.lang.Object) boolean82);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 3; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "hi!" + "'", obj12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(iterator50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + "hi!" + "'", obj61, "hi!");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(iterator71);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test233");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        boolean boolean4 = linkedListTestDriver2.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj5 = new java.lang.Object();
        linkedListTestDriver2.addFirst(obj5);
        java.lang.Object obj7 = linkedListTestDriver2.getLast();
        boolean boolean8 = linkedListTestDriver2.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj12 = new java.lang.Object();
        linkedListTestDriver9.addFirst(obj12);
        experiment.util.Iterator iterator14 = linkedListTestDriver9.iterator();
        boolean boolean15 = linkedListTestDriver2.add((java.lang.Object) linkedListTestDriver9);
        linkedListTestDriver9.add((int) (byte) 1, (java.lang.Object) (-1.0d));
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        boolean boolean22 = linkedListTestDriver20.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj23 = new java.lang.Object();
        linkedListTestDriver20.addFirst(obj23);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        boolean boolean27 = linkedListTestDriver25.add((java.lang.Object) "hi!");
        java.lang.Object obj28 = linkedListTestDriver25.removeLast();
        linkedListTestDriver25.addLast((java.lang.Object) '#');
        linkedListTestDriver20.addLast((java.lang.Object) linkedListTestDriver25);
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        boolean boolean34 = linkedListTestDriver32.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj35 = new java.lang.Object();
        linkedListTestDriver32.addFirst(obj35);
        experiment.util.Iterator iterator37 = linkedListTestDriver32.iterator();
        java.lang.Object[] objArray38 = linkedListTestDriver32.toArray();
        java.lang.Object obj39 = linkedListTestDriver32.getFirst();
        linkedListTestDriver25.addLast((java.lang.Object) linkedListTestDriver32);
        experiment.util.LinkedListTestDriver linkedListTestDriver41 = new experiment.util.LinkedListTestDriver();
        boolean boolean43 = linkedListTestDriver41.add((java.lang.Object) "hi!");
        linkedListTestDriver25.addLast((java.lang.Object) linkedListTestDriver41);
        boolean boolean45 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver41);
        java.lang.Object obj46 = linkedListTestDriver0.getFirst();
        boolean boolean48 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver49 = new experiment.util.LinkedListTestDriver();
        boolean boolean51 = linkedListTestDriver49.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj52 = new java.lang.Object();
        linkedListTestDriver49.addFirst(obj52);
        experiment.util.LinkedListTestDriver linkedListTestDriver54 = new experiment.util.LinkedListTestDriver();
        boolean boolean56 = linkedListTestDriver54.add((java.lang.Object) "hi!");
        java.lang.Object obj57 = linkedListTestDriver54.removeLast();
        linkedListTestDriver54.addLast((java.lang.Object) '#');
        linkedListTestDriver49.addLast((java.lang.Object) linkedListTestDriver54);
        boolean boolean62 = linkedListTestDriver49.remove((java.lang.Object) 10);
        boolean boolean64 = linkedListTestDriver49.equals_CUT((java.lang.Object) false);
        experiment.util.LinkedListTestDriver linkedListTestDriver65 = new experiment.util.LinkedListTestDriver();
        boolean boolean67 = linkedListTestDriver65.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj68 = new java.lang.Object();
        linkedListTestDriver65.addFirst(obj68);
        linkedListTestDriver49.addLast(obj68);
        boolean boolean71 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver49);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "hi!" + "'", obj28, "hi!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + (byte) 1 + "'", obj46, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + "hi!" + "'", obj57, "hi!");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test234");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = new java.lang.Object();
        linkedListTestDriver7.addFirst(obj10);
        experiment.util.Iterator iterator12 = linkedListTestDriver7.iterator();
        boolean boolean13 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver7);
        java.lang.Object obj14 = linkedListTestDriver7.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        boolean boolean17 = linkedListTestDriver15.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = new java.lang.Object();
        linkedListTestDriver15.addFirst(obj18);
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        boolean boolean22 = linkedListTestDriver20.add((java.lang.Object) "hi!");
        java.lang.Object obj23 = linkedListTestDriver20.removeLast();
        linkedListTestDriver20.addLast((java.lang.Object) '#');
        linkedListTestDriver15.addLast((java.lang.Object) linkedListTestDriver20);
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        boolean boolean30 = linkedListTestDriver28.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj31 = new java.lang.Object();
        linkedListTestDriver28.addFirst(obj31);
        experiment.util.Iterator iterator33 = linkedListTestDriver28.iterator();
        java.lang.Object[] objArray34 = linkedListTestDriver28.toArray();
        linkedListTestDriver20.add((int) (byte) 1, (java.lang.Object) linkedListTestDriver28);
        boolean boolean36 = linkedListTestDriver7.contains((java.lang.Object) linkedListTestDriver20);
        boolean boolean37 = linkedListTestDriver7.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj38 = linkedListTestDriver7.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "hi!" + "'", obj23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test235");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        boolean boolean4 = linkedListTestDriver2.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj5 = new java.lang.Object();
        linkedListTestDriver2.addFirst(obj5);
        java.lang.Object obj7 = linkedListTestDriver2.getLast();
        boolean boolean8 = linkedListTestDriver2.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj12 = new java.lang.Object();
        linkedListTestDriver9.addFirst(obj12);
        experiment.util.Iterator iterator14 = linkedListTestDriver9.iterator();
        boolean boolean15 = linkedListTestDriver2.add((java.lang.Object) linkedListTestDriver9);
        linkedListTestDriver9.add((int) (byte) 1, (java.lang.Object) (-1.0d));
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        boolean boolean22 = linkedListTestDriver20.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj23 = new java.lang.Object();
        linkedListTestDriver20.addFirst(obj23);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        boolean boolean27 = linkedListTestDriver25.add((java.lang.Object) "hi!");
        java.lang.Object obj28 = linkedListTestDriver25.removeLast();
        linkedListTestDriver25.addLast((java.lang.Object) '#');
        linkedListTestDriver20.addLast((java.lang.Object) linkedListTestDriver25);
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        boolean boolean34 = linkedListTestDriver32.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj35 = new java.lang.Object();
        linkedListTestDriver32.addFirst(obj35);
        experiment.util.Iterator iterator37 = linkedListTestDriver32.iterator();
        java.lang.Object[] objArray38 = linkedListTestDriver32.toArray();
        java.lang.Object obj39 = linkedListTestDriver32.getFirst();
        linkedListTestDriver25.addLast((java.lang.Object) linkedListTestDriver32);
        experiment.util.LinkedListTestDriver linkedListTestDriver41 = new experiment.util.LinkedListTestDriver();
        boolean boolean43 = linkedListTestDriver41.add((java.lang.Object) "hi!");
        linkedListTestDriver25.addLast((java.lang.Object) linkedListTestDriver41);
        boolean boolean45 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver41);
        int int46 = linkedListTestDriver0.size();
        experiment.util.Iterator iterator47 = linkedListTestDriver0.iterator();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "hi!" + "'", obj28, "hi!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(iterator47);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test236");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) "hi!");
        java.lang.Object obj3 = linkedListTestDriver0.removeLast();
        linkedListTestDriver0.addLast((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj9 = new java.lang.Object();
        linkedListTestDriver6.addFirst(obj9);
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.clear();
        boolean boolean14 = linkedListTestDriver11.remove((java.lang.Object) (byte) 0);
        boolean boolean15 = linkedListTestDriver6.contains((java.lang.Object) linkedListTestDriver11);
        boolean boolean16 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver11);
        boolean boolean17 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver18.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj21 = new java.lang.Object();
        linkedListTestDriver18.addFirst(obj21);
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver23.clear();
        boolean boolean26 = linkedListTestDriver23.remove((java.lang.Object) (byte) 0);
        boolean boolean27 = linkedListTestDriver18.contains((java.lang.Object) linkedListTestDriver23);
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        boolean boolean30 = linkedListTestDriver28.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj31 = new java.lang.Object();
        linkedListTestDriver28.addFirst(obj31);
        java.lang.Object obj33 = linkedListTestDriver28.getLast();
        boolean boolean34 = linkedListTestDriver28.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver35 = new experiment.util.LinkedListTestDriver();
        boolean boolean37 = linkedListTestDriver35.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj38 = new java.lang.Object();
        linkedListTestDriver35.addFirst(obj38);
        experiment.util.Iterator iterator40 = linkedListTestDriver35.iterator();
        boolean boolean41 = linkedListTestDriver28.add((java.lang.Object) linkedListTestDriver35);
        linkedListTestDriver23.addFirst((java.lang.Object) linkedListTestDriver28);
        boolean boolean43 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver23);
        experiment.util.LinkedListTestDriver linkedListTestDriver45 = new experiment.util.LinkedListTestDriver();
        boolean boolean47 = linkedListTestDriver45.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj48 = new java.lang.Object();
        linkedListTestDriver45.addFirst(obj48);
        java.lang.Object obj50 = linkedListTestDriver45.getLast();
        boolean boolean51 = linkedListTestDriver45.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) 'a', (java.lang.Object) linkedListTestDriver45);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 97; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "hi!" + "'", obj3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(iterator40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test237");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray6 = linkedListTestDriver0.toArray();
        java.lang.Object obj7 = linkedListTestDriver0.getFirst();
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        java.lang.Object obj9 = linkedListTestDriver0.getFirst();
        java.lang.Object obj10 = linkedListTestDriver0.removeFirst();
        boolean boolean11 = linkedListTestDriver0.isEmpty();
        experiment.util.Iterator iterator12 = linkedListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = linkedListTestDriver0.get((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test238");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = new java.lang.Object();
        linkedListTestDriver7.addFirst(obj10);
        experiment.util.Iterator iterator12 = linkedListTestDriver7.iterator();
        boolean boolean13 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver7);
        java.lang.Object obj14 = linkedListTestDriver7.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        boolean boolean17 = linkedListTestDriver15.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = new java.lang.Object();
        linkedListTestDriver15.addFirst(obj18);
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        boolean boolean22 = linkedListTestDriver20.add((java.lang.Object) "hi!");
        java.lang.Object obj23 = linkedListTestDriver20.removeLast();
        linkedListTestDriver20.addLast((java.lang.Object) '#');
        linkedListTestDriver15.addLast((java.lang.Object) linkedListTestDriver20);
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        boolean boolean30 = linkedListTestDriver28.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj31 = new java.lang.Object();
        linkedListTestDriver28.addFirst(obj31);
        experiment.util.Iterator iterator33 = linkedListTestDriver28.iterator();
        java.lang.Object[] objArray34 = linkedListTestDriver28.toArray();
        linkedListTestDriver20.add((int) (byte) 1, (java.lang.Object) linkedListTestDriver28);
        boolean boolean36 = linkedListTestDriver7.contains((java.lang.Object) linkedListTestDriver20);
        java.lang.Object obj37 = linkedListTestDriver20.removeLast();
        java.lang.Class<?> wildcardClass38 = linkedListTestDriver20.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "hi!" + "'", obj23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test239");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver5.clear();
        boolean boolean8 = linkedListTestDriver5.remove((java.lang.Object) (byte) 0);
        boolean boolean9 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        boolean boolean12 = linkedListTestDriver10.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj13 = new java.lang.Object();
        linkedListTestDriver10.addFirst(obj13);
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        boolean boolean17 = linkedListTestDriver15.add((java.lang.Object) "hi!");
        java.lang.Object obj18 = linkedListTestDriver15.removeLast();
        linkedListTestDriver15.addLast((java.lang.Object) '#');
        linkedListTestDriver10.addLast((java.lang.Object) linkedListTestDriver15);
        boolean boolean23 = linkedListTestDriver10.remove((java.lang.Object) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        boolean boolean27 = linkedListTestDriver25.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj28 = new java.lang.Object();
        linkedListTestDriver25.addFirst(obj28);
        experiment.util.Iterator iterator30 = linkedListTestDriver25.iterator();
        experiment.util.Iterator iterator31 = linkedListTestDriver25.iterator();
        linkedListTestDriver10.add(2, (java.lang.Object) linkedListTestDriver25);
        boolean boolean33 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver25);
        java.lang.Object obj34 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver36 = new experiment.util.LinkedListTestDriver();
        boolean boolean38 = linkedListTestDriver36.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj39 = new java.lang.Object();
        linkedListTestDriver36.addFirst(obj39);
        experiment.util.Iterator iterator41 = linkedListTestDriver36.iterator();
        experiment.util.Iterator iterator42 = linkedListTestDriver36.iterator();
        experiment.util.Iterator iterator43 = linkedListTestDriver36.iterator();
        java.lang.Object obj44 = linkedListTestDriver36.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) (short) -1, obj44);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "hi!" + "'", obj18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(iterator41);
        org.junit.Assert.assertNotNull(iterator42);
        org.junit.Assert.assertNotNull(iterator43);
        org.junit.Assert.assertNotNull(obj44);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test240");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = new java.lang.Object();
        linkedListTestDriver7.addFirst(obj10);
        experiment.util.Iterator iterator12 = linkedListTestDriver7.iterator();
        boolean boolean13 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver7);
        java.lang.Object obj14 = linkedListTestDriver7.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        boolean boolean17 = linkedListTestDriver15.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = new java.lang.Object();
        linkedListTestDriver15.addFirst(obj18);
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        boolean boolean22 = linkedListTestDriver20.add((java.lang.Object) "hi!");
        java.lang.Object obj23 = linkedListTestDriver20.removeLast();
        linkedListTestDriver20.addLast((java.lang.Object) '#');
        linkedListTestDriver15.addLast((java.lang.Object) linkedListTestDriver20);
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        boolean boolean30 = linkedListTestDriver28.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj31 = new java.lang.Object();
        linkedListTestDriver28.addFirst(obj31);
        experiment.util.Iterator iterator33 = linkedListTestDriver28.iterator();
        java.lang.Object[] objArray34 = linkedListTestDriver28.toArray();
        linkedListTestDriver20.add((int) (byte) 1, (java.lang.Object) linkedListTestDriver28);
        boolean boolean36 = linkedListTestDriver7.contains((java.lang.Object) linkedListTestDriver20);
        java.lang.Object obj38 = linkedListTestDriver20.remove((int) (short) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver39 = new experiment.util.LinkedListTestDriver();
        boolean boolean41 = linkedListTestDriver39.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj42 = new java.lang.Object();
        linkedListTestDriver39.addFirst(obj42);
        experiment.util.LinkedListTestDriver linkedListTestDriver44 = new experiment.util.LinkedListTestDriver();
        boolean boolean46 = linkedListTestDriver44.add((java.lang.Object) "hi!");
        java.lang.Object obj47 = linkedListTestDriver44.removeLast();
        linkedListTestDriver44.addLast((java.lang.Object) '#');
        linkedListTestDriver39.addLast((java.lang.Object) linkedListTestDriver44);
        experiment.util.LinkedListTestDriver linkedListTestDriver52 = new experiment.util.LinkedListTestDriver();
        boolean boolean54 = linkedListTestDriver52.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj55 = new java.lang.Object();
        linkedListTestDriver52.addFirst(obj55);
        experiment.util.Iterator iterator57 = linkedListTestDriver52.iterator();
        java.lang.Object[] objArray58 = linkedListTestDriver52.toArray();
        linkedListTestDriver44.add((int) (byte) 1, (java.lang.Object) linkedListTestDriver52);
        experiment.util.LinkedListTestDriver linkedListTestDriver60 = new experiment.util.LinkedListTestDriver();
        boolean boolean62 = linkedListTestDriver60.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj63 = new java.lang.Object();
        linkedListTestDriver60.addFirst(obj63);
        experiment.util.LinkedListTestDriver linkedListTestDriver65 = new experiment.util.LinkedListTestDriver();
        boolean boolean67 = linkedListTestDriver65.add((java.lang.Object) "hi!");
        java.lang.Object obj68 = linkedListTestDriver65.removeLast();
        linkedListTestDriver65.addLast((java.lang.Object) '#');
        linkedListTestDriver60.addLast((java.lang.Object) linkedListTestDriver65);
        experiment.util.LinkedListTestDriver linkedListTestDriver72 = new experiment.util.LinkedListTestDriver();
        boolean boolean74 = linkedListTestDriver72.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj75 = new java.lang.Object();
        linkedListTestDriver72.addFirst(obj75);
        experiment.util.Iterator iterator77 = linkedListTestDriver72.iterator();
        java.lang.Object[] objArray78 = linkedListTestDriver72.toArray();
        java.lang.Object obj79 = linkedListTestDriver72.getFirst();
        experiment.util.Iterator iterator80 = linkedListTestDriver72.iterator();
        java.lang.Object obj81 = linkedListTestDriver72.getFirst();
        boolean boolean82 = linkedListTestDriver65.add((java.lang.Object) linkedListTestDriver72);
        boolean boolean83 = linkedListTestDriver52.contains((java.lang.Object) linkedListTestDriver65);
        linkedListTestDriver20.addFirst((java.lang.Object) linkedListTestDriver65);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "hi!" + "'", obj23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + '#' + "'", obj38, '#');
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + "hi!" + "'", obj47, "hi!");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(iterator57);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertEquals("'" + obj68 + "' != '" + "hi!" + "'", obj68, "hi!");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(iterator77);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertNotNull(obj79);
        org.junit.Assert.assertNotNull(iterator80);
        org.junit.Assert.assertNotNull(obj81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test241");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = new java.lang.Object();
        linkedListTestDriver7.addFirst(obj10);
        experiment.util.Iterator iterator12 = linkedListTestDriver7.iterator();
        boolean boolean13 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver7);
        linkedListTestDriver7.add((int) (byte) 1, (java.lang.Object) (-1.0d));
        java.lang.Object obj18 = null;
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver7.add((int) (byte) 0, obj18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test242");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) "hi!");
        java.lang.Object obj8 = linkedListTestDriver5.removeLast();
        linkedListTestDriver5.addLast((java.lang.Object) '#');
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        boolean boolean14 = linkedListTestDriver12.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj15 = new java.lang.Object();
        linkedListTestDriver12.addFirst(obj15);
        experiment.util.Iterator iterator17 = linkedListTestDriver12.iterator();
        java.lang.Object[] objArray18 = linkedListTestDriver12.toArray();
        java.lang.Object obj19 = linkedListTestDriver12.getFirst();
        linkedListTestDriver5.addLast((java.lang.Object) linkedListTestDriver12);
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        boolean boolean23 = linkedListTestDriver21.add((java.lang.Object) "hi!");
        linkedListTestDriver5.addLast((java.lang.Object) linkedListTestDriver21);
        java.lang.Object obj25 = linkedListTestDriver5.removeLast();
        java.lang.Object obj27 = linkedListTestDriver5.get((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + '#' + "'", obj27, '#');
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test243");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) "hi!");
        java.lang.Object obj3 = linkedListTestDriver0.removeLast();
        linkedListTestDriver0.addLast((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj9 = new java.lang.Object();
        linkedListTestDriver6.addFirst(obj9);
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.clear();
        boolean boolean14 = linkedListTestDriver11.remove((java.lang.Object) (byte) 0);
        boolean boolean15 = linkedListTestDriver6.contains((java.lang.Object) linkedListTestDriver11);
        boolean boolean16 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver11);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        boolean boolean19 = linkedListTestDriver17.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj20 = new java.lang.Object();
        linkedListTestDriver17.addFirst(obj20);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver22.clear();
        boolean boolean25 = linkedListTestDriver22.remove((java.lang.Object) (byte) 0);
        boolean boolean26 = linkedListTestDriver17.contains((java.lang.Object) linkedListTestDriver22);
        boolean boolean27 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver17);
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        boolean boolean30 = linkedListTestDriver28.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj31 = new java.lang.Object();
        linkedListTestDriver28.addFirst(obj31);
        experiment.util.Iterator iterator33 = linkedListTestDriver28.iterator();
        java.lang.Object[] objArray34 = linkedListTestDriver28.toArray();
        java.lang.Object obj35 = linkedListTestDriver28.getFirst();
        experiment.util.Iterator iterator36 = linkedListTestDriver28.iterator();
        java.lang.Object obj37 = linkedListTestDriver28.getFirst();
        boolean boolean39 = linkedListTestDriver28.contains((java.lang.Object) 100.0d);
        java.lang.Object obj40 = linkedListTestDriver28.getFirst();
        linkedListTestDriver17.addFirst(obj40);
        int int42 = linkedListTestDriver17.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "hi!" + "'", obj3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2 + "'", int42 == 2);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test244");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) "hi!");
        java.lang.Object obj8 = linkedListTestDriver5.removeLast();
        linkedListTestDriver5.addLast((java.lang.Object) '#');
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj16 = new java.lang.Object();
        linkedListTestDriver13.addFirst(obj16);
        experiment.util.Iterator iterator18 = linkedListTestDriver13.iterator();
        java.lang.Object[] objArray19 = linkedListTestDriver13.toArray();
        linkedListTestDriver5.add((int) (byte) 1, (java.lang.Object) linkedListTestDriver13);
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        boolean boolean23 = linkedListTestDriver21.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj24 = new java.lang.Object();
        linkedListTestDriver21.addFirst(obj24);
        experiment.util.Iterator iterator26 = linkedListTestDriver21.iterator();
        java.lang.Object[] objArray27 = linkedListTestDriver21.toArray();
        java.lang.Object obj28 = linkedListTestDriver21.getFirst();
        experiment.util.Iterator iterator29 = linkedListTestDriver21.iterator();
        boolean boolean30 = linkedListTestDriver5.contains((java.lang.Object) iterator29);
        java.lang.Object obj33 = linkedListTestDriver5.set((int) (short) 0, (java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        boolean boolean36 = linkedListTestDriver34.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj37 = new java.lang.Object();
        linkedListTestDriver34.addFirst(obj37);
        experiment.util.Iterator iterator39 = linkedListTestDriver34.iterator();
        java.lang.Object[] objArray40 = linkedListTestDriver34.toArray();
        boolean boolean41 = linkedListTestDriver5.equals_CUT((java.lang.Object) objArray40);
        java.lang.Object obj42 = linkedListTestDriver5.getLast();
        java.lang.Object obj43 = linkedListTestDriver5.removeLast();
        linkedListTestDriver5.clear();
        int int45 = linkedListTestDriver5.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + '#' + "'", obj33, '#');
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test245");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) "hi!");
        java.lang.Object obj8 = linkedListTestDriver5.removeLast();
        linkedListTestDriver5.addLast((java.lang.Object) '#');
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        boolean boolean13 = linkedListTestDriver0.remove((java.lang.Object) 10);
        boolean boolean15 = linkedListTestDriver0.equals_CUT((java.lang.Object) false);
        boolean boolean16 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver18.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        boolean boolean22 = linkedListTestDriver20.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj23 = new java.lang.Object();
        linkedListTestDriver20.addFirst(obj23);
        java.lang.Object obj25 = linkedListTestDriver20.getLast();
        boolean boolean26 = linkedListTestDriver20.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver27 = new experiment.util.LinkedListTestDriver();
        boolean boolean29 = linkedListTestDriver27.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj30 = new java.lang.Object();
        linkedListTestDriver27.addFirst(obj30);
        experiment.util.Iterator iterator32 = linkedListTestDriver27.iterator();
        boolean boolean33 = linkedListTestDriver20.add((java.lang.Object) linkedListTestDriver27);
        linkedListTestDriver27.add((int) (byte) 1, (java.lang.Object) (-1.0d));
        linkedListTestDriver18.addFirst((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver38 = new experiment.util.LinkedListTestDriver();
        boolean boolean40 = linkedListTestDriver38.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj41 = new java.lang.Object();
        linkedListTestDriver38.addFirst(obj41);
        experiment.util.LinkedListTestDriver linkedListTestDriver43 = new experiment.util.LinkedListTestDriver();
        boolean boolean45 = linkedListTestDriver43.add((java.lang.Object) "hi!");
        java.lang.Object obj46 = linkedListTestDriver43.removeLast();
        linkedListTestDriver43.addLast((java.lang.Object) '#');
        linkedListTestDriver38.addLast((java.lang.Object) linkedListTestDriver43);
        experiment.util.LinkedListTestDriver linkedListTestDriver50 = new experiment.util.LinkedListTestDriver();
        boolean boolean52 = linkedListTestDriver50.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj53 = new java.lang.Object();
        linkedListTestDriver50.addFirst(obj53);
        experiment.util.Iterator iterator55 = linkedListTestDriver50.iterator();
        java.lang.Object[] objArray56 = linkedListTestDriver50.toArray();
        java.lang.Object obj57 = linkedListTestDriver50.getFirst();
        linkedListTestDriver43.addLast((java.lang.Object) linkedListTestDriver50);
        experiment.util.LinkedListTestDriver linkedListTestDriver59 = new experiment.util.LinkedListTestDriver();
        boolean boolean61 = linkedListTestDriver59.add((java.lang.Object) "hi!");
        linkedListTestDriver43.addLast((java.lang.Object) linkedListTestDriver59);
        boolean boolean63 = linkedListTestDriver18.remove((java.lang.Object) linkedListTestDriver59);
        experiment.util.LinkedListTestDriver linkedListTestDriver64 = new experiment.util.LinkedListTestDriver();
        boolean boolean66 = linkedListTestDriver64.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj67 = new java.lang.Object();
        linkedListTestDriver64.addFirst(obj67);
        experiment.util.Iterator iterator69 = linkedListTestDriver64.iterator();
        java.lang.Object[] objArray70 = linkedListTestDriver64.toArray();
        java.lang.Object obj71 = linkedListTestDriver64.getFirst();
        experiment.util.Iterator iterator72 = linkedListTestDriver64.iterator();
        java.lang.Object obj73 = linkedListTestDriver64.getFirst();
        linkedListTestDriver59.addLast((java.lang.Object) linkedListTestDriver64);
        java.lang.Object[] objArray75 = linkedListTestDriver59.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj76 = linkedListTestDriver0.set((int) 'a', (java.lang.Object) linkedListTestDriver59);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + "hi!" + "'", obj46, "hi!");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(iterator55);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(iterator69);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertNotNull(obj71);
        org.junit.Assert.assertNotNull(iterator72);
        org.junit.Assert.assertNotNull(obj73);
        org.junit.Assert.assertNotNull(objArray75);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test246");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray6 = linkedListTestDriver0.toArray();
        java.lang.Object obj7 = linkedListTestDriver0.getFirst();
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        java.lang.Object obj9 = linkedListTestDriver0.getFirst();
        java.lang.Object obj10 = linkedListTestDriver0.removeFirst();
        boolean boolean11 = linkedListTestDriver0.isEmpty();
        experiment.util.Iterator iterator12 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray13 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        boolean boolean17 = linkedListTestDriver15.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = new java.lang.Object();
        linkedListTestDriver15.addFirst(obj18);
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        boolean boolean22 = linkedListTestDriver20.add((java.lang.Object) "hi!");
        java.lang.Object obj23 = linkedListTestDriver20.removeLast();
        linkedListTestDriver20.addLast((java.lang.Object) '#');
        linkedListTestDriver15.addLast((java.lang.Object) linkedListTestDriver20);
        experiment.util.LinkedListTestDriver linkedListTestDriver27 = new experiment.util.LinkedListTestDriver();
        boolean boolean29 = linkedListTestDriver27.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj30 = new java.lang.Object();
        linkedListTestDriver27.addFirst(obj30);
        experiment.util.Iterator iterator32 = linkedListTestDriver27.iterator();
        java.lang.Object[] objArray33 = linkedListTestDriver27.toArray();
        java.lang.Object obj34 = linkedListTestDriver27.getFirst();
        boolean boolean35 = linkedListTestDriver20.equals_CUT(obj34);
        experiment.util.Iterator iterator36 = linkedListTestDriver20.iterator();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) '4', (java.lang.Object) linkedListTestDriver20);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 52; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "hi!" + "'", obj23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(iterator36);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test247");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) "hi!");
        java.lang.Object obj3 = linkedListTestDriver0.removeFirst();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver5.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = new java.lang.Object();
        linkedListTestDriver7.addFirst(obj10);
        java.lang.Object obj12 = linkedListTestDriver7.getLast();
        boolean boolean13 = linkedListTestDriver7.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        boolean boolean16 = linkedListTestDriver14.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj17 = new java.lang.Object();
        linkedListTestDriver14.addFirst(obj17);
        experiment.util.Iterator iterator19 = linkedListTestDriver14.iterator();
        boolean boolean20 = linkedListTestDriver7.add((java.lang.Object) linkedListTestDriver14);
        linkedListTestDriver14.add((int) (byte) 1, (java.lang.Object) (-1.0d));
        linkedListTestDriver5.addFirst((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        boolean boolean27 = linkedListTestDriver25.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj28 = new java.lang.Object();
        linkedListTestDriver25.addFirst(obj28);
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        boolean boolean32 = linkedListTestDriver30.add((java.lang.Object) "hi!");
        java.lang.Object obj33 = linkedListTestDriver30.removeLast();
        linkedListTestDriver30.addLast((java.lang.Object) '#');
        linkedListTestDriver25.addLast((java.lang.Object) linkedListTestDriver30);
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        boolean boolean39 = linkedListTestDriver37.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj40 = new java.lang.Object();
        linkedListTestDriver37.addFirst(obj40);
        experiment.util.Iterator iterator42 = linkedListTestDriver37.iterator();
        java.lang.Object[] objArray43 = linkedListTestDriver37.toArray();
        java.lang.Object obj44 = linkedListTestDriver37.getFirst();
        linkedListTestDriver30.addLast((java.lang.Object) linkedListTestDriver37);
        experiment.util.LinkedListTestDriver linkedListTestDriver46 = new experiment.util.LinkedListTestDriver();
        boolean boolean48 = linkedListTestDriver46.add((java.lang.Object) "hi!");
        linkedListTestDriver30.addLast((java.lang.Object) linkedListTestDriver46);
        boolean boolean50 = linkedListTestDriver5.remove((java.lang.Object) linkedListTestDriver46);
        experiment.util.LinkedListTestDriver linkedListTestDriver51 = new experiment.util.LinkedListTestDriver();
        boolean boolean53 = linkedListTestDriver51.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj54 = new java.lang.Object();
        linkedListTestDriver51.addFirst(obj54);
        experiment.util.Iterator iterator56 = linkedListTestDriver51.iterator();
        java.lang.Object[] objArray57 = linkedListTestDriver51.toArray();
        java.lang.Object obj58 = linkedListTestDriver51.getFirst();
        experiment.util.Iterator iterator59 = linkedListTestDriver51.iterator();
        java.lang.Object obj60 = linkedListTestDriver51.getFirst();
        linkedListTestDriver46.addLast((java.lang.Object) linkedListTestDriver51);
        boolean boolean62 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver46);
        linkedListTestDriver46.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver64 = new experiment.util.LinkedListTestDriver();
        boolean boolean66 = linkedListTestDriver64.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj67 = new java.lang.Object();
        linkedListTestDriver64.addFirst(obj67);
        experiment.util.LinkedListTestDriver linkedListTestDriver69 = new experiment.util.LinkedListTestDriver();
        boolean boolean71 = linkedListTestDriver69.add((java.lang.Object) "hi!");
        java.lang.Object obj72 = linkedListTestDriver69.removeLast();
        linkedListTestDriver69.addLast((java.lang.Object) '#');
        linkedListTestDriver64.addLast((java.lang.Object) linkedListTestDriver69);
        experiment.util.LinkedListTestDriver linkedListTestDriver76 = new experiment.util.LinkedListTestDriver();
        boolean boolean78 = linkedListTestDriver76.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj79 = new java.lang.Object();
        linkedListTestDriver76.addFirst(obj79);
        experiment.util.Iterator iterator81 = linkedListTestDriver76.iterator();
        java.lang.Object[] objArray82 = linkedListTestDriver76.toArray();
        java.lang.Object obj83 = linkedListTestDriver76.getFirst();
        linkedListTestDriver69.addLast((java.lang.Object) linkedListTestDriver76);
        java.lang.Object[] objArray85 = linkedListTestDriver76.toArray();
        boolean boolean86 = linkedListTestDriver46.equals_CUT((java.lang.Object) objArray85);
        experiment.util.Iterator iterator87 = linkedListTestDriver46.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "hi!" + "'", obj3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "hi!" + "'", obj33, "hi!");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(iterator42);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(iterator56);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertNotNull(iterator59);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertEquals("'" + obj72 + "' != '" + "hi!" + "'", obj72, "hi!");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(iterator81);
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertNotNull(obj83);
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(iterator87);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test248");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray6 = linkedListTestDriver0.toArray();
        java.lang.Object obj7 = linkedListTestDriver0.getFirst();
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        java.lang.Object obj9 = linkedListTestDriver0.getFirst();
        java.lang.Object obj10 = linkedListTestDriver0.removeFirst();
        boolean boolean11 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        boolean boolean14 = linkedListTestDriver12.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj15 = new java.lang.Object();
        linkedListTestDriver12.addFirst(obj15);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        boolean boolean19 = linkedListTestDriver17.add((java.lang.Object) "hi!");
        java.lang.Object obj20 = linkedListTestDriver17.removeLast();
        linkedListTestDriver17.addLast((java.lang.Object) '#');
        linkedListTestDriver12.addLast((java.lang.Object) linkedListTestDriver17);
        boolean boolean24 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver17);
        java.lang.Object[] objArray25 = linkedListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "hi!" + "'", obj20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test249");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray6 = linkedListTestDriver0.toArray();
        java.lang.Object obj7 = linkedListTestDriver0.getFirst();
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        java.lang.Object obj9 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        boolean boolean12 = linkedListTestDriver10.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj13 = new java.lang.Object();
        linkedListTestDriver10.addFirst(obj13);
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        boolean boolean17 = linkedListTestDriver15.add((java.lang.Object) "hi!");
        java.lang.Object obj18 = linkedListTestDriver15.removeLast();
        linkedListTestDriver15.addLast((java.lang.Object) '#');
        linkedListTestDriver10.addLast((java.lang.Object) linkedListTestDriver15);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        boolean boolean24 = linkedListTestDriver22.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj25 = new java.lang.Object();
        linkedListTestDriver22.addFirst(obj25);
        experiment.util.Iterator iterator27 = linkedListTestDriver22.iterator();
        java.lang.Object[] objArray28 = linkedListTestDriver22.toArray();
        java.lang.Object obj29 = linkedListTestDriver22.getFirst();
        linkedListTestDriver15.addLast((java.lang.Object) linkedListTestDriver22);
        boolean boolean31 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver15);
        int int32 = linkedListTestDriver15.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver33 = new experiment.util.LinkedListTestDriver();
        boolean boolean35 = linkedListTestDriver33.contains((java.lang.Object) (byte) -1);
        boolean boolean36 = linkedListTestDriver15.add((java.lang.Object) boolean35);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "hi!" + "'", obj18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test250");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = new java.lang.Object();
        linkedListTestDriver7.addFirst(obj10);
        experiment.util.Iterator iterator12 = linkedListTestDriver7.iterator();
        boolean boolean13 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver7);
        linkedListTestDriver7.add((int) (byte) 1, (java.lang.Object) (-1.0d));
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        boolean boolean19 = linkedListTestDriver17.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj20 = new java.lang.Object();
        linkedListTestDriver17.addFirst(obj20);
        experiment.util.Iterator iterator22 = linkedListTestDriver17.iterator();
        java.lang.Object[] objArray23 = linkedListTestDriver17.toArray();
        java.lang.Object obj24 = linkedListTestDriver17.getFirst();
        experiment.util.Iterator iterator25 = linkedListTestDriver17.iterator();
        java.lang.Object obj26 = linkedListTestDriver17.getFirst();
        boolean boolean27 = linkedListTestDriver7.equals_CUT((java.lang.Object) linkedListTestDriver17);
        java.lang.Object obj28 = linkedListTestDriver7.removeLast();
        linkedListTestDriver7.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (-1.0d) + "'", obj28, (-1.0d));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test251");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.add((java.lang.Object) "hi!");
        java.lang.Object obj3 = linkedListTestDriver0.removeFirst();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver5.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = new java.lang.Object();
        linkedListTestDriver7.addFirst(obj10);
        java.lang.Object obj12 = linkedListTestDriver7.getLast();
        boolean boolean13 = linkedListTestDriver7.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        boolean boolean16 = linkedListTestDriver14.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj17 = new java.lang.Object();
        linkedListTestDriver14.addFirst(obj17);
        experiment.util.Iterator iterator19 = linkedListTestDriver14.iterator();
        boolean boolean20 = linkedListTestDriver7.add((java.lang.Object) linkedListTestDriver14);
        linkedListTestDriver14.add((int) (byte) 1, (java.lang.Object) (-1.0d));
        linkedListTestDriver5.addFirst((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        boolean boolean27 = linkedListTestDriver25.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj28 = new java.lang.Object();
        linkedListTestDriver25.addFirst(obj28);
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        boolean boolean32 = linkedListTestDriver30.add((java.lang.Object) "hi!");
        java.lang.Object obj33 = linkedListTestDriver30.removeLast();
        linkedListTestDriver30.addLast((java.lang.Object) '#');
        linkedListTestDriver25.addLast((java.lang.Object) linkedListTestDriver30);
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        boolean boolean39 = linkedListTestDriver37.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj40 = new java.lang.Object();
        linkedListTestDriver37.addFirst(obj40);
        experiment.util.Iterator iterator42 = linkedListTestDriver37.iterator();
        java.lang.Object[] objArray43 = linkedListTestDriver37.toArray();
        java.lang.Object obj44 = linkedListTestDriver37.getFirst();
        linkedListTestDriver30.addLast((java.lang.Object) linkedListTestDriver37);
        experiment.util.LinkedListTestDriver linkedListTestDriver46 = new experiment.util.LinkedListTestDriver();
        boolean boolean48 = linkedListTestDriver46.add((java.lang.Object) "hi!");
        linkedListTestDriver30.addLast((java.lang.Object) linkedListTestDriver46);
        boolean boolean50 = linkedListTestDriver5.remove((java.lang.Object) linkedListTestDriver46);
        experiment.util.LinkedListTestDriver linkedListTestDriver51 = new experiment.util.LinkedListTestDriver();
        boolean boolean53 = linkedListTestDriver51.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj54 = new java.lang.Object();
        linkedListTestDriver51.addFirst(obj54);
        experiment.util.Iterator iterator56 = linkedListTestDriver51.iterator();
        java.lang.Object[] objArray57 = linkedListTestDriver51.toArray();
        java.lang.Object obj58 = linkedListTestDriver51.getFirst();
        experiment.util.Iterator iterator59 = linkedListTestDriver51.iterator();
        java.lang.Object obj60 = linkedListTestDriver51.getFirst();
        linkedListTestDriver46.addLast((java.lang.Object) linkedListTestDriver51);
        boolean boolean62 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver46);
        experiment.util.LinkedListTestDriver linkedListTestDriver63 = new experiment.util.LinkedListTestDriver();
        boolean boolean65 = linkedListTestDriver63.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj66 = new java.lang.Object();
        linkedListTestDriver63.addFirst(obj66);
        experiment.util.LinkedListTestDriver linkedListTestDriver68 = new experiment.util.LinkedListTestDriver();
        boolean boolean70 = linkedListTestDriver68.add((java.lang.Object) "hi!");
        java.lang.Object obj71 = linkedListTestDriver68.removeLast();
        linkedListTestDriver68.addLast((java.lang.Object) '#');
        linkedListTestDriver63.addLast((java.lang.Object) linkedListTestDriver68);
        boolean boolean76 = linkedListTestDriver63.remove((java.lang.Object) 10);
        linkedListTestDriver63.clear();
        boolean boolean78 = linkedListTestDriver46.contains((java.lang.Object) linkedListTestDriver63);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj79 = linkedListTestDriver63.getLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "hi!" + "'", obj3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "hi!" + "'", obj33, "hi!");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(iterator42);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(iterator56);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertNotNull(iterator59);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertEquals("'" + obj71 + "' != '" + "hi!" + "'", obj71, "hi!");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test252");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        java.lang.Object obj7 = linkedListTestDriver0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = linkedListTestDriver0.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test253");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.add((java.lang.Object) "hi!");
        java.lang.Object obj8 = linkedListTestDriver5.removeLast();
        linkedListTestDriver5.addLast((java.lang.Object) '#');
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        boolean boolean14 = linkedListTestDriver12.remove((java.lang.Object) 100L);
        java.lang.Object[] objArray15 = linkedListTestDriver12.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver16.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver18.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj21 = new java.lang.Object();
        linkedListTestDriver18.addFirst(obj21);
        java.lang.Object obj23 = linkedListTestDriver18.getLast();
        boolean boolean24 = linkedListTestDriver18.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        boolean boolean27 = linkedListTestDriver25.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj28 = new java.lang.Object();
        linkedListTestDriver25.addFirst(obj28);
        experiment.util.Iterator iterator30 = linkedListTestDriver25.iterator();
        boolean boolean31 = linkedListTestDriver18.add((java.lang.Object) linkedListTestDriver25);
        linkedListTestDriver25.add((int) (byte) 1, (java.lang.Object) (-1.0d));
        linkedListTestDriver16.addFirst((java.lang.Object) (byte) 1);
        boolean boolean36 = linkedListTestDriver12.remove((java.lang.Object) (byte) 1);
        java.lang.Object[] objArray37 = linkedListTestDriver12.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver12);
        experiment.util.LinkedListTestDriver linkedListTestDriver39 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver39.clear();
        experiment.util.Iterator iterator41 = linkedListTestDriver39.iterator();
        linkedListTestDriver12.addLast((java.lang.Object) iterator41);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[]");
        org.junit.Assert.assertNotNull(iterator41);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test254");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray6 = linkedListTestDriver0.toArray();
        java.lang.Object obj7 = linkedListTestDriver0.getFirst();
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        java.lang.Object obj9 = linkedListTestDriver0.getFirst();
        java.lang.Object obj10 = linkedListTestDriver0.removeFirst();
        boolean boolean11 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        boolean boolean14 = linkedListTestDriver12.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj15 = new java.lang.Object();
        linkedListTestDriver12.addFirst(obj15);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        boolean boolean19 = linkedListTestDriver17.add((java.lang.Object) "hi!");
        java.lang.Object obj20 = linkedListTestDriver17.removeLast();
        linkedListTestDriver17.addLast((java.lang.Object) '#');
        linkedListTestDriver12.addLast((java.lang.Object) linkedListTestDriver17);
        boolean boolean25 = linkedListTestDriver12.remove((java.lang.Object) 10);
        boolean boolean26 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver12);
        java.lang.Object obj27 = linkedListTestDriver12.getFirst();
        experiment.util.Iterator iterator28 = linkedListTestDriver12.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "hi!" + "'", obj20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(iterator28);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test255");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = new java.lang.Object();
        linkedListTestDriver7.addFirst(obj10);
        experiment.util.Iterator iterator12 = linkedListTestDriver7.iterator();
        boolean boolean13 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver7);
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        boolean boolean16 = linkedListTestDriver14.add((java.lang.Object) "hi!");
        java.lang.Object obj17 = linkedListTestDriver14.removeFirst();
        boolean boolean18 = linkedListTestDriver7.contains((java.lang.Object) linkedListTestDriver14);
        java.lang.Object obj19 = linkedListTestDriver7.getFirst();
        int int20 = linkedListTestDriver7.size();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator22 = linkedListTestDriver7.listIterator((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "hi!" + "'", obj17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_939145594_1024_0.test256");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = new java.lang.Object();
        linkedListTestDriver0.addFirst(obj3);
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = new java.lang.Object();
        linkedListTestDriver7.addFirst(obj10);
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        boolean boolean14 = linkedListTestDriver12.add((java.lang.Object) "hi!");
        java.lang.Object obj15 = linkedListTestDriver12.removeLast();
        linkedListTestDriver12.addLast((java.lang.Object) '#');
        linkedListTestDriver7.addLast((java.lang.Object) linkedListTestDriver12);
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        boolean boolean22 = linkedListTestDriver20.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj23 = new java.lang.Object();
        linkedListTestDriver20.addFirst(obj23);
        experiment.util.Iterator iterator25 = linkedListTestDriver20.iterator();
        java.lang.Object[] objArray26 = linkedListTestDriver20.toArray();
        linkedListTestDriver12.add((int) (byte) 1, (java.lang.Object) linkedListTestDriver20);
        java.lang.Object obj29 = linkedListTestDriver12.get(1);
        boolean boolean30 = linkedListTestDriver0.remove(obj29);
        java.lang.Object obj32 = linkedListTestDriver0.remove((int) (short) 0);
        int int33 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        boolean boolean36 = linkedListTestDriver34.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj37 = new java.lang.Object();
        linkedListTestDriver34.addFirst(obj37);
        experiment.util.Iterator iterator39 = linkedListTestDriver34.iterator();
        java.lang.Object[] objArray40 = linkedListTestDriver34.toArray();
        java.lang.Object obj41 = linkedListTestDriver34.getFirst();
        linkedListTestDriver34.addLast((java.lang.Object) (short) 0);
        int int44 = linkedListTestDriver34.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver45 = new experiment.util.LinkedListTestDriver();
        boolean boolean47 = linkedListTestDriver45.contains((java.lang.Object) (byte) -1);
        java.lang.Object obj48 = new java.lang.Object();
        linkedListTestDriver45.addFirst(obj48);
        experiment.util.Iterator iterator50 = linkedListTestDriver45.iterator();
        int int51 = linkedListTestDriver45.size();
        linkedListTestDriver34.addLast((java.lang.Object) linkedListTestDriver45);
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver34);
        java.lang.Object obj55 = linkedListTestDriver34.remove((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "hi!" + "'", obj15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(iterator50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + (short) 0 + "'", obj55, (short) 0);
    }

}
