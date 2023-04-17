package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_LinkedListTest_101322511_256_s {

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
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test001");
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
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test002");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = linkedListTestDriver0.get((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test003");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = linkedListTestDriver0.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test004");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = linkedListTestDriver0.getLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test005");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver0.addFirst((java.lang.Object) 100L);
        java.lang.Object obj5 = linkedListTestDriver0.getFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = linkedListTestDriver0.set((int) (byte) 10, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100L + "'", obj5, 100L);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test006");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        linkedListTestDriver0.addLast((java.lang.Object) 10L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = linkedListTestDriver0.get((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test007");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver1.clear();
        experiment.util.Iterator iterator3 = linkedListTestDriver1.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = linkedListTestDriver1.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test008");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver0.addFirst((java.lang.Object) 100L);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator7 = linkedListTestDriver0.listIterator((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test009");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.addFirst(obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test010");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.clear();
        experiment.util.Iterator iterator2 = linkedListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator2);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test011");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = linkedListTestDriver0.set((int) (short) 0, (java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator11 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver14.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj17 = linkedListTestDriver14.getFirst();
        boolean boolean19 = linkedListTestDriver14.add((java.lang.Object) (short) 100);
        boolean boolean21 = linkedListTestDriver14.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean22 = linkedListTestDriver13.add((java.lang.Object) boolean21);
        boolean boolean24 = linkedListTestDriver13.remove((java.lang.Object) '4');
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) (byte) -1, (java.lang.Object) linkedListTestDriver13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 100.0f + "'", obj17, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test012");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        boolean boolean7 = linkedListTestDriver0.contains((java.lang.Object) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = linkedListTestDriver0.remove((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test013");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = linkedListTestDriver0.remove((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test014");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.addFirst((java.lang.Object) 10.0d);
        java.lang.Class<?> wildcardClass6 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test015");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.addFirst((java.lang.Object) 10.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.clear();
        boolean boolean8 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = linkedListTestDriver6.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test016");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        int int3 = linkedListTestDriver0.size();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (-1.0f));
        linkedListTestDriver0.add(1, (java.lang.Object) 1);
        java.lang.Object obj10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = linkedListTestDriver0.set(3, obj10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test017");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        int int3 = linkedListTestDriver0.size();
        java.lang.Object obj4 = linkedListTestDriver0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = linkedListTestDriver0.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test018");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver1.clear();
        experiment.util.Iterator iterator3 = linkedListTestDriver1.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = linkedListTestDriver1.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test019");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver0.addFirst((java.lang.Object) 100L);
        java.lang.Object obj5 = linkedListTestDriver0.removeLast();
        boolean boolean7 = linkedListTestDriver0.remove((java.lang.Object) 1);
        java.lang.Object obj8 = linkedListTestDriver0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = linkedListTestDriver0.get((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100L + "'", obj8, 100L);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test020");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        java.lang.Object obj6 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver9.clear();
        experiment.util.Iterator iterator11 = linkedListTestDriver9.iterator();
        linkedListTestDriver8.addLast((java.lang.Object) linkedListTestDriver9);
        boolean boolean14 = linkedListTestDriver9.remove((java.lang.Object) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = linkedListTestDriver0.set((int) ' ', (java.lang.Object) linkedListTestDriver9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0f + "'", obj6, 100.0f);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test021");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.addFirst((java.lang.Object) 10.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.clear();
        boolean boolean8 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver6);
        java.lang.Object obj9 = linkedListTestDriver0.getFirst();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator11 = linkedListTestDriver0.listIterator((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 52; size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 10.0d + "'", obj9, 10.0d);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test022");
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
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test023");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver1.clear();
        experiment.util.Iterator iterator3 = linkedListTestDriver1.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver1);
        boolean boolean6 = linkedListTestDriver1.remove((java.lang.Object) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = linkedListTestDriver1.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test024");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator5 = linkedListTestDriver0.listIterator((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test025");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        int int3 = linkedListTestDriver0.size();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (-1.0f));
        linkedListTestDriver0.add(1, (java.lang.Object) 1);
        java.lang.Object obj9 = linkedListTestDriver0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = linkedListTestDriver0.remove((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0f) + "'", obj9, (-1.0f));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test026");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator3 = linkedListTestDriver0.listIterator((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 32; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test027");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        int int3 = linkedListTestDriver0.size();
        java.lang.Object obj4 = linkedListTestDriver0.removeLast();
        java.lang.Object[] objArray5 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = linkedListTestDriver0.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test028");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        java.lang.Class<?> wildcardClass7 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test029");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        int int3 = linkedListTestDriver0.size();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (-1.0f));
        linkedListTestDriver0.add(1, (java.lang.Object) 1);
        java.lang.Object obj9 = linkedListTestDriver0.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.addFirst((java.lang.Object) 100.0f);
        experiment.util.ListIterator listIterator15 = linkedListTestDriver11.listIterator(1);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) (byte) 10, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0f) + "'", obj9, (-1.0f));
        org.junit.Assert.assertNotNull(listIterator15);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test030");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj9 = linkedListTestDriver6.getFirst();
        boolean boolean11 = linkedListTestDriver6.add((java.lang.Object) (short) 100);
        boolean boolean13 = linkedListTestDriver6.contains((java.lang.Object) (short) 10);
        linkedListTestDriver0.addLast((java.lang.Object) boolean13);
        boolean boolean15 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver17.clear();
        experiment.util.Iterator iterator19 = linkedListTestDriver17.iterator();
        linkedListTestDriver16.addLast((java.lang.Object) linkedListTestDriver17);
        boolean boolean22 = linkedListTestDriver17.remove((java.lang.Object) 0L);
        boolean boolean23 = linkedListTestDriver0.contains((java.lang.Object) boolean22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = linkedListTestDriver0.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test031");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver0.addFirst((java.lang.Object) 100L);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj10 = linkedListTestDriver7.getFirst();
        boolean boolean12 = linkedListTestDriver7.add((java.lang.Object) (short) 100);
        linkedListTestDriver7.addLast((java.lang.Object) 10L);
        boolean boolean16 = linkedListTestDriver7.contains((java.lang.Object) (-1L));
        int int17 = linkedListTestDriver7.size();
        java.lang.Object obj18 = linkedListTestDriver0.set(0, (java.lang.Object) int17);
        java.lang.Class<?> wildcardClass19 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100L + "'", obj18, 100L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test032");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj9 = linkedListTestDriver6.getFirst();
        boolean boolean11 = linkedListTestDriver6.add((java.lang.Object) (short) 100);
        boolean boolean13 = linkedListTestDriver6.contains((java.lang.Object) (short) 10);
        linkedListTestDriver0.addLast((java.lang.Object) boolean13);
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) 'a', (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 97; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test033");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver0.addFirst((java.lang.Object) 100L);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj10 = linkedListTestDriver7.getFirst();
        boolean boolean12 = linkedListTestDriver7.add((java.lang.Object) (short) 100);
        linkedListTestDriver7.addLast((java.lang.Object) 10L);
        boolean boolean16 = linkedListTestDriver7.contains((java.lang.Object) (-1L));
        int int17 = linkedListTestDriver7.size();
        java.lang.Object obj18 = linkedListTestDriver0.set(0, (java.lang.Object) int17);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) '4', (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 52; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100L + "'", obj18, 100L);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test034");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        linkedListTestDriver0.addLast((java.lang.Object) 10L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = linkedListTestDriver0.remove((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test035");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        linkedListTestDriver0.addLast((java.lang.Object) 10L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = linkedListTestDriver0.set((int) (short) -1, (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test036");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = linkedListTestDriver0.removeFirst();
        java.lang.Object obj9 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver11.addFirst((java.lang.Object) 100L);
        java.lang.Object obj16 = linkedListTestDriver11.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) (short) 10, (java.lang.Object) linkedListTestDriver11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0f + "'", obj8, 100.0f);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) 100 + "'", obj9, (short) 100);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0f + "'", obj16, 100.0f);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test037");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) 100L);
        linkedListTestDriver0.addFirst((java.lang.Object) '4');
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj14 = linkedListTestDriver11.getFirst();
        boolean boolean16 = linkedListTestDriver11.add((java.lang.Object) (short) 100);
        boolean boolean18 = linkedListTestDriver11.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj19 = linkedListTestDriver11.getFirst();
        boolean boolean20 = linkedListTestDriver0.contains(obj19);
        java.lang.Object obj21 = null;
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.addFirst(obj21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0f + "'", obj14, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0f + "'", obj19, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test038");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver0.addFirst((java.lang.Object) 100L);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj10 = linkedListTestDriver7.getFirst();
        boolean boolean12 = linkedListTestDriver7.add((java.lang.Object) (short) 100);
        linkedListTestDriver7.addLast((java.lang.Object) 10L);
        boolean boolean16 = linkedListTestDriver7.contains((java.lang.Object) (-1L));
        int int17 = linkedListTestDriver7.size();
        java.lang.Object obj18 = linkedListTestDriver0.set(0, (java.lang.Object) int17);
        java.lang.Object obj20 = null;
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) (short) 100, obj20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100L + "'", obj18, 100L);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test039");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        java.lang.Object obj6 = linkedListTestDriver0.getFirst();
        boolean boolean8 = linkedListTestDriver0.add((java.lang.Object) 100L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = linkedListTestDriver0.set(100, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0f + "'", obj6, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test040");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.addFirst((java.lang.Object) 10.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addFirst((java.lang.Object) 100.0f);
        int int9 = linkedListTestDriver6.size();
        boolean boolean11 = linkedListTestDriver6.add((java.lang.Object) (-1.0f));
        linkedListTestDriver6.add(1, (java.lang.Object) 1);
        boolean boolean15 = linkedListTestDriver0.contains((java.lang.Object) 1);
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = linkedListTestDriver0.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test041");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj9 = linkedListTestDriver6.getFirst();
        boolean boolean11 = linkedListTestDriver6.add((java.lang.Object) (short) 100);
        boolean boolean13 = linkedListTestDriver6.contains((java.lang.Object) (short) 10);
        linkedListTestDriver0.addLast((java.lang.Object) boolean13);
        boolean boolean15 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver17.clear();
        experiment.util.Iterator iterator19 = linkedListTestDriver17.iterator();
        linkedListTestDriver16.addLast((java.lang.Object) linkedListTestDriver17);
        boolean boolean22 = linkedListTestDriver17.remove((java.lang.Object) 0L);
        boolean boolean23 = linkedListTestDriver0.contains((java.lang.Object) boolean22);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver25.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj28 = linkedListTestDriver25.getFirst();
        boolean boolean30 = linkedListTestDriver25.add((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator31 = linkedListTestDriver25.iterator();
        linkedListTestDriver25.addLast((java.lang.Object) 100L);
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver34.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj37 = linkedListTestDriver34.getFirst();
        boolean boolean39 = linkedListTestDriver34.add((java.lang.Object) (short) 100);
        boolean boolean41 = linkedListTestDriver34.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj44 = linkedListTestDriver34.set((int) (short) 0, (java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator45 = linkedListTestDriver34.iterator();
        boolean boolean46 = linkedListTestDriver25.remove((java.lang.Object) linkedListTestDriver34);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj47 = linkedListTestDriver0.set((int) (byte) -1, (java.lang.Object) boolean46);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 100.0f + "'", obj28, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 100.0f + "'", obj37, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 100.0f + "'", obj44, 100.0f);
        org.junit.Assert.assertNotNull(iterator45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test042");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        int int3 = linkedListTestDriver0.size();
        java.lang.Object obj4 = linkedListTestDriver0.removeLast();
        java.lang.Object[] objArray5 = linkedListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = linkedListTestDriver0.remove((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test043");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = linkedListTestDriver0.get((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test044");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.removeFirst();
        boolean boolean4 = linkedListTestDriver0.isEmpty();
        int int5 = linkedListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator7 = linkedListTestDriver0.listIterator((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 1; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test045");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver0.addFirst((java.lang.Object) 100L);
        java.lang.Object obj5 = linkedListTestDriver0.removeLast();
        boolean boolean7 = linkedListTestDriver0.remove((java.lang.Object) 1);
        java.lang.Object obj8 = linkedListTestDriver0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator10 = linkedListTestDriver0.listIterator((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 32; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100L + "'", obj8, 100L);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test046");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver1.clear();
        experiment.util.Iterator iterator3 = linkedListTestDriver1.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver1);
        boolean boolean6 = linkedListTestDriver1.remove((java.lang.Object) 0L);
        boolean boolean7 = linkedListTestDriver1.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj13 = linkedListTestDriver10.getFirst();
        boolean boolean15 = linkedListTestDriver10.add((java.lang.Object) (short) 100);
        boolean boolean17 = linkedListTestDriver10.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean18 = linkedListTestDriver9.add((java.lang.Object) boolean17);
        java.lang.Object obj19 = linkedListTestDriver9.getLast();
        java.lang.Object obj20 = linkedListTestDriver9.removeFirst();
        java.lang.Object[] objArray21 = linkedListTestDriver9.toArray();
        experiment.util.ListIterator listIterator23 = linkedListTestDriver9.listIterator(0);
        linkedListTestDriver9.addFirst((java.lang.Object) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = linkedListTestDriver1.set(100, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0f + "'", obj13, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + false + "'", obj19, false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(listIterator23);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test047");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        int int3 = linkedListTestDriver0.size();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (-1.0f));
        linkedListTestDriver0.add(1, (java.lang.Object) 1);
        boolean boolean10 = linkedListTestDriver0.add((java.lang.Object) (short) 1);
        java.lang.Object obj11 = linkedListTestDriver0.getFirst();
        java.lang.Object obj12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = linkedListTestDriver0.contains(obj12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0f + "'", obj11, 100.0f);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test048");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver1.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj4 = linkedListTestDriver1.getFirst();
        boolean boolean6 = linkedListTestDriver1.add((java.lang.Object) (short) 100);
        boolean boolean8 = linkedListTestDriver1.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean9 = linkedListTestDriver0.add((java.lang.Object) boolean8);
        java.lang.Object obj10 = linkedListTestDriver0.getLast();
        java.lang.Object obj11 = linkedListTestDriver0.removeFirst();
        java.lang.Object[] objArray12 = linkedListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = linkedListTestDriver0.getLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + false + "'", obj11, false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test049");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        experiment.util.ListIterator listIterator4 = linkedListTestDriver0.listIterator(1);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addFirst((java.lang.Object) 100.0f);
        int int9 = linkedListTestDriver6.size();
        linkedListTestDriver6.addFirst((java.lang.Object) 10.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addFirst((java.lang.Object) 100.0f);
        int int15 = linkedListTestDriver12.size();
        boolean boolean17 = linkedListTestDriver12.add((java.lang.Object) (-1.0f));
        linkedListTestDriver12.add(1, (java.lang.Object) 1);
        boolean boolean21 = linkedListTestDriver6.contains((java.lang.Object) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = linkedListTestDriver0.set((int) (short) 1, (java.lang.Object) linkedListTestDriver6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(listIterator4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test050");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.removeFirst();
        linkedListTestDriver0.clear();
        linkedListTestDriver0.clear();
        int int6 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.addFirst((java.lang.Object) 100.0f);
        int int11 = linkedListTestDriver8.size();
        linkedListTestDriver8.clear();
        experiment.util.Iterator iterator13 = linkedListTestDriver8.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver14.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj17 = linkedListTestDriver14.getFirst();
        boolean boolean19 = linkedListTestDriver14.add((java.lang.Object) (short) 100);
        boolean boolean21 = linkedListTestDriver14.contains((java.lang.Object) (short) 10);
        linkedListTestDriver8.addLast((java.lang.Object) boolean21);
        boolean boolean23 = linkedListTestDriver8.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver25.clear();
        experiment.util.Iterator iterator27 = linkedListTestDriver25.iterator();
        linkedListTestDriver24.addLast((java.lang.Object) linkedListTestDriver25);
        boolean boolean30 = linkedListTestDriver25.remove((java.lang.Object) 0L);
        boolean boolean31 = linkedListTestDriver8.contains((java.lang.Object) boolean30);
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver32.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver32.addFirst((java.lang.Object) 100L);
        java.lang.Object obj37 = linkedListTestDriver32.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver39 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver39.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj42 = linkedListTestDriver39.getFirst();
        boolean boolean44 = linkedListTestDriver39.add((java.lang.Object) (short) 100);
        linkedListTestDriver39.addLast((java.lang.Object) 10L);
        boolean boolean48 = linkedListTestDriver39.contains((java.lang.Object) (-1L));
        int int49 = linkedListTestDriver39.size();
        java.lang.Object obj50 = linkedListTestDriver32.set(0, (java.lang.Object) int49);
        boolean boolean51 = linkedListTestDriver8.contains((java.lang.Object) linkedListTestDriver32);
        java.lang.Object obj52 = linkedListTestDriver8.getLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj53 = linkedListTestDriver0.set((int) (short) 0, (java.lang.Object) linkedListTestDriver8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 100.0f + "'", obj17, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 100.0f + "'", obj37, 100.0f);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 100.0f + "'", obj42, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 3 + "'", int49 == 3);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 100L + "'", obj50, 100L);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + false + "'", obj52, false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test051");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.clear();
        experiment.util.Iterator iterator2 = linkedListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator4 = linkedListTestDriver0.listIterator((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 32; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator2);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test052");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj9 = linkedListTestDriver6.getFirst();
        boolean boolean11 = linkedListTestDriver6.add((java.lang.Object) (short) 100);
        boolean boolean13 = linkedListTestDriver6.contains((java.lang.Object) (short) 10);
        linkedListTestDriver0.addLast((java.lang.Object) boolean13);
        boolean boolean15 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver17.clear();
        experiment.util.Iterator iterator19 = linkedListTestDriver17.iterator();
        linkedListTestDriver16.addLast((java.lang.Object) linkedListTestDriver17);
        boolean boolean22 = linkedListTestDriver17.remove((java.lang.Object) 0L);
        boolean boolean23 = linkedListTestDriver0.contains((java.lang.Object) boolean22);
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver24.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver24.addFirst((java.lang.Object) 100L);
        java.lang.Object obj29 = linkedListTestDriver24.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver31.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj34 = linkedListTestDriver31.getFirst();
        boolean boolean36 = linkedListTestDriver31.add((java.lang.Object) (short) 100);
        linkedListTestDriver31.addLast((java.lang.Object) 10L);
        boolean boolean40 = linkedListTestDriver31.contains((java.lang.Object) (-1L));
        int int41 = linkedListTestDriver31.size();
        java.lang.Object obj42 = linkedListTestDriver24.set(0, (java.lang.Object) int41);
        boolean boolean43 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver24);
        experiment.util.ListIterator listIterator45 = linkedListTestDriver24.listIterator((int) (byte) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver46 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver46.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj49 = linkedListTestDriver46.getFirst();
        boolean boolean51 = linkedListTestDriver46.add((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator52 = linkedListTestDriver46.iterator();
        linkedListTestDriver46.addLast((java.lang.Object) 100L);
        experiment.util.LinkedListTestDriver linkedListTestDriver55 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver55.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj58 = linkedListTestDriver55.getFirst();
        boolean boolean60 = linkedListTestDriver55.add((java.lang.Object) (short) 100);
        boolean boolean62 = linkedListTestDriver55.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj65 = linkedListTestDriver55.set((int) (short) 0, (java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator66 = linkedListTestDriver55.iterator();
        boolean boolean67 = linkedListTestDriver46.remove((java.lang.Object) linkedListTestDriver55);
        linkedListTestDriver24.addLast((java.lang.Object) boolean67);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 100.0f + "'", obj29, 100.0f);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 100.0f + "'", obj34, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 100L + "'", obj42, 100L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(listIterator45);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 100.0f + "'", obj49, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(iterator52);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + 100.0f + "'", obj58, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + 100.0f + "'", obj65, 100.0f);
        org.junit.Assert.assertNotNull(iterator66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test053");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = linkedListTestDriver0.set((int) (short) 0, (java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator11 = linkedListTestDriver0.iterator();
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = linkedListTestDriver0.getLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test054");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        experiment.util.ListIterator listIterator4 = linkedListTestDriver0.listIterator(1);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addFirst((java.lang.Object) 100.0f);
        int int9 = linkedListTestDriver6.size();
        linkedListTestDriver6.clear();
        experiment.util.Iterator iterator11 = linkedListTestDriver6.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj15 = linkedListTestDriver12.getFirst();
        boolean boolean17 = linkedListTestDriver12.add((java.lang.Object) (short) 100);
        boolean boolean19 = linkedListTestDriver12.contains((java.lang.Object) (short) 10);
        linkedListTestDriver6.addLast((java.lang.Object) boolean19);
        boolean boolean21 = linkedListTestDriver6.isEmpty();
        java.lang.Object obj22 = linkedListTestDriver0.set(0, (java.lang.Object) boolean21);
        org.junit.Assert.assertNotNull(listIterator4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0f + "'", obj15, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 100.0f + "'", obj22, 100.0f);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test055");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        int int3 = linkedListTestDriver0.size();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (-1.0f));
        linkedListTestDriver0.add(1, (java.lang.Object) 1);
        java.lang.Object obj9 = linkedListTestDriver0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = linkedListTestDriver0.set((int) (short) 10, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0f) + "'", obj9, (-1.0f));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test056");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.clear();
        experiment.util.Iterator iterator2 = linkedListTestDriver0.iterator();
        linkedListTestDriver0.clear();
        org.junit.Assert.assertNotNull(iterator2);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test057");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        boolean boolean7 = linkedListTestDriver0.contains((java.lang.Object) (short) 10);
        int int8 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj13 = linkedListTestDriver10.getFirst();
        boolean boolean15 = linkedListTestDriver10.add((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver16.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj19 = linkedListTestDriver16.removeFirst();
        linkedListTestDriver16.clear();
        java.lang.Class<?> wildcardClass21 = linkedListTestDriver16.getClass();
        boolean boolean22 = linkedListTestDriver10.remove((java.lang.Object) linkedListTestDriver16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = linkedListTestDriver0.set((int) (short) -1, (java.lang.Object) boolean22);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0f + "'", obj13, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0f + "'", obj19, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test058");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.removeFirst();
        boolean boolean4 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = linkedListTestDriver0.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test059");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver1.addFirst((java.lang.Object) 100.0f);
        int int4 = linkedListTestDriver1.size();
        linkedListTestDriver1.addFirst((java.lang.Object) 10.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.clear();
        boolean boolean9 = linkedListTestDriver1.add((java.lang.Object) linkedListTestDriver7);
        java.lang.Object obj10 = linkedListTestDriver1.getFirst();
        boolean boolean11 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = linkedListTestDriver0.getLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 10.0d + "'", obj10, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test060");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.clear();
        boolean boolean3 = linkedListTestDriver0.equals_CUT((java.lang.Object) (-1.0d));
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.clear();
        experiment.util.Iterator iterator10 = linkedListTestDriver8.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = linkedListTestDriver0.set((int) '4', (java.lang.Object) iterator10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test061");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.addFirst((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.addFirst((java.lang.Object) 100.0f);
        int int11 = linkedListTestDriver8.size();
        boolean boolean13 = linkedListTestDriver8.add((java.lang.Object) (-1.0f));
        linkedListTestDriver8.add(1, (java.lang.Object) 1);
        boolean boolean18 = linkedListTestDriver8.add((java.lang.Object) (short) 1);
        java.lang.Object obj19 = linkedListTestDriver8.getFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = linkedListTestDriver0.set((int) '#', (java.lang.Object) linkedListTestDriver8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0f + "'", obj19, 100.0f);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test062");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = linkedListTestDriver0.set((int) (short) 0, (java.lang.Object) (byte) 1);
        java.lang.Object[] objArray11 = linkedListTestDriver0.toArray();
        boolean boolean12 = linkedListTestDriver0.isEmpty();
        java.lang.Object obj13 = linkedListTestDriver0.removeFirst();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[1, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 1 + "'", obj13, (byte) 1);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test063");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver1.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj4 = linkedListTestDriver1.getFirst();
        boolean boolean6 = linkedListTestDriver1.add((java.lang.Object) (short) 100);
        boolean boolean8 = linkedListTestDriver1.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean9 = linkedListTestDriver0.add((java.lang.Object) boolean8);
        java.lang.Object obj10 = linkedListTestDriver0.getLast();
        java.lang.Object obj11 = linkedListTestDriver0.removeFirst();
        boolean boolean13 = linkedListTestDriver0.contains((java.lang.Object) 10L);
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver14.addFirst((java.lang.Object) 100.0f);
        experiment.util.ListIterator listIterator18 = linkedListTestDriver14.listIterator(1);
        linkedListTestDriver0.addFirst((java.lang.Object) 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + false + "'", obj11, false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(listIterator18);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test064");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        java.lang.Object obj4 = linkedListTestDriver0.removeLast();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test065");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        int int3 = linkedListTestDriver0.size();
        java.lang.Object obj4 = linkedListTestDriver0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = linkedListTestDriver0.remove((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test066");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver1.clear();
        experiment.util.Iterator iterator3 = linkedListTestDriver1.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver1);
        boolean boolean6 = linkedListTestDriver1.remove((java.lang.Object) 0L);
        boolean boolean7 = linkedListTestDriver1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = linkedListTestDriver1.getLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test067");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver1.addFirst((java.lang.Object) 100.0f);
        int int4 = linkedListTestDriver1.size();
        linkedListTestDriver1.addFirst((java.lang.Object) 10.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.clear();
        boolean boolean9 = linkedListTestDriver1.add((java.lang.Object) linkedListTestDriver7);
        java.lang.Object obj10 = linkedListTestDriver1.getFirst();
        boolean boolean11 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver1);
        boolean boolean12 = linkedListTestDriver0.isEmpty();
        boolean boolean13 = linkedListTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 10.0d + "'", obj10, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test068");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) 100L);
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver9.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver13.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver13.addFirst((java.lang.Object) 100L);
        java.lang.Object obj18 = linkedListTestDriver13.getFirst();
        boolean boolean19 = linkedListTestDriver0.equals_CUT(obj18);
        int int20 = linkedListTestDriver0.size();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100L + "'", obj18, 100L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test069");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj9 = linkedListTestDriver6.getFirst();
        boolean boolean11 = linkedListTestDriver6.add((java.lang.Object) (short) 100);
        boolean boolean13 = linkedListTestDriver6.contains((java.lang.Object) (short) 10);
        linkedListTestDriver0.addLast((java.lang.Object) boolean13);
        boolean boolean15 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver17.clear();
        experiment.util.Iterator iterator19 = linkedListTestDriver17.iterator();
        linkedListTestDriver16.addLast((java.lang.Object) linkedListTestDriver17);
        boolean boolean22 = linkedListTestDriver17.remove((java.lang.Object) 0L);
        boolean boolean23 = linkedListTestDriver0.contains((java.lang.Object) boolean22);
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver24.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver24.addFirst((java.lang.Object) 100L);
        java.lang.Object obj29 = linkedListTestDriver24.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver31.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj34 = linkedListTestDriver31.getFirst();
        boolean boolean36 = linkedListTestDriver31.add((java.lang.Object) (short) 100);
        linkedListTestDriver31.addLast((java.lang.Object) 10L);
        boolean boolean40 = linkedListTestDriver31.contains((java.lang.Object) (-1L));
        int int41 = linkedListTestDriver31.size();
        java.lang.Object obj42 = linkedListTestDriver24.set(0, (java.lang.Object) int41);
        boolean boolean43 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver24);
        experiment.util.LinkedListTestDriver linkedListTestDriver45 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver46 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver46.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj49 = linkedListTestDriver46.getFirst();
        boolean boolean51 = linkedListTestDriver46.add((java.lang.Object) (short) 100);
        boolean boolean53 = linkedListTestDriver46.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean54 = linkedListTestDriver45.add((java.lang.Object) boolean53);
        linkedListTestDriver45.addLast((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver57 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver57.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj60 = linkedListTestDriver57.getFirst();
        boolean boolean62 = linkedListTestDriver57.add((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator63 = linkedListTestDriver57.iterator();
        linkedListTestDriver57.addLast((java.lang.Object) 100L);
        boolean boolean66 = linkedListTestDriver45.add((java.lang.Object) linkedListTestDriver57);
        linkedListTestDriver24.add((int) (short) 1, (java.lang.Object) linkedListTestDriver45);
        int int68 = linkedListTestDriver45.size();
        java.lang.Object obj70 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj71 = linkedListTestDriver45.set(100, obj70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 100.0f + "'", obj29, 100.0f);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 100.0f + "'", obj34, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 100L + "'", obj42, 100L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 100.0f + "'", obj49, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + 100.0f + "'", obj60, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(iterator63);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 3 + "'", int68 == 3);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test070");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver0.addFirst((java.lang.Object) 100L);
        java.lang.Object obj5 = linkedListTestDriver0.getFirst();
        java.lang.Object obj7 = linkedListTestDriver0.get((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator9 = linkedListTestDriver0.listIterator((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100L + "'", obj5, 100L);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100L + "'", obj7, 100L);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test071");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.clear();
        boolean boolean3 = linkedListTestDriver0.equals_CUT((java.lang.Object) (-1.0d));
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (byte) 0);
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator8 = linkedListTestDriver0.listIterator((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test072");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.removeFirst();
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator6 = linkedListTestDriver0.listIterator((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test073");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        linkedListTestDriver0.addLast((java.lang.Object) 10L);
        boolean boolean9 = linkedListTestDriver0.contains((java.lang.Object) (-1L));
        int int10 = linkedListTestDriver0.size();
        boolean boolean11 = linkedListTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test074");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        java.lang.Object obj6 = linkedListTestDriver0.getFirst();
        boolean boolean8 = linkedListTestDriver0.add((java.lang.Object) 100L);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj13 = linkedListTestDriver10.getFirst();
        boolean boolean15 = linkedListTestDriver10.add((java.lang.Object) (short) 100);
        boolean boolean17 = linkedListTestDriver10.contains((java.lang.Object) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) ' ', (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 32; size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0f + "'", obj6, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0f + "'", obj13, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test075");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.addFirst((java.lang.Object) 10.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.clear();
        boolean boolean8 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver6);
        java.lang.Object obj9 = linkedListTestDriver0.getFirst();
        experiment.util.Iterator iterator10 = linkedListTestDriver0.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 10.0d + "'", obj9, 10.0d);
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test076");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = linkedListTestDriver0.set((int) (short) 0, (java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator11 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver13.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj16 = linkedListTestDriver13.getFirst();
        boolean boolean18 = linkedListTestDriver13.add((java.lang.Object) (short) 100);
        boolean boolean20 = linkedListTestDriver13.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean21 = linkedListTestDriver12.add((java.lang.Object) boolean20);
        linkedListTestDriver12.addLast((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver24.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj27 = linkedListTestDriver24.getFirst();
        boolean boolean29 = linkedListTestDriver24.add((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator30 = linkedListTestDriver24.iterator();
        linkedListTestDriver24.addLast((java.lang.Object) 100L);
        boolean boolean33 = linkedListTestDriver12.add((java.lang.Object) linkedListTestDriver24);
        boolean boolean34 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver12);
        java.lang.Object obj35 = linkedListTestDriver0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator37 = linkedListTestDriver0.listIterator((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0f + "'", obj16, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 100.0f + "'", obj27, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (byte) 1 + "'", obj35, (byte) 1);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test077");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.addLast((java.lang.Object) 0.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj9 = linkedListTestDriver6.getFirst();
        boolean boolean11 = linkedListTestDriver6.add((java.lang.Object) (short) 100);
        boolean boolean13 = linkedListTestDriver6.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean14 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver6);
        boolean boolean15 = linkedListTestDriver6.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = linkedListTestDriver6.get((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test078");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver1.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj4 = linkedListTestDriver1.getFirst();
        boolean boolean6 = linkedListTestDriver1.add((java.lang.Object) (short) 100);
        boolean boolean8 = linkedListTestDriver1.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean9 = linkedListTestDriver0.add((java.lang.Object) boolean8);
        java.lang.Object obj10 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver13.clear();
        experiment.util.Iterator iterator15 = linkedListTestDriver13.iterator();
        linkedListTestDriver12.addLast((java.lang.Object) linkedListTestDriver13);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver17.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver17.addFirst((java.lang.Object) 100L);
        java.lang.Object obj22 = linkedListTestDriver17.getFirst();
        boolean boolean24 = linkedListTestDriver17.add((java.lang.Object) 'a');
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver26.addFirst((java.lang.Object) 100.0f);
        int int29 = linkedListTestDriver26.size();
        java.lang.Object obj30 = linkedListTestDriver26.removeLast();
        java.lang.Object[] objArray31 = linkedListTestDriver26.toArray();
        linkedListTestDriver26.clear();
        java.lang.Object obj33 = linkedListTestDriver17.set((int) (byte) 0, (java.lang.Object) linkedListTestDriver26);
        linkedListTestDriver13.addFirst((java.lang.Object) linkedListTestDriver26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = linkedListTestDriver0.set(10, (java.lang.Object) linkedListTestDriver13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 100L + "'", obj22, 100L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 100.0f + "'", obj30, 100.0f);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 100L + "'", obj33, 100L);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test079");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver1.clear();
        experiment.util.Iterator iterator3 = linkedListTestDriver1.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver1);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver5.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver5.addFirst((java.lang.Object) 100L);
        java.lang.Object obj10 = linkedListTestDriver5.getFirst();
        boolean boolean12 = linkedListTestDriver5.add((java.lang.Object) 'a');
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver14.addFirst((java.lang.Object) 100.0f);
        int int17 = linkedListTestDriver14.size();
        java.lang.Object obj18 = linkedListTestDriver14.removeLast();
        java.lang.Object[] objArray19 = linkedListTestDriver14.toArray();
        linkedListTestDriver14.clear();
        java.lang.Object obj21 = linkedListTestDriver5.set((int) (byte) 0, (java.lang.Object) linkedListTestDriver14);
        linkedListTestDriver1.addFirst((java.lang.Object) linkedListTestDriver14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = linkedListTestDriver14.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100L + "'", obj10, 100L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0f + "'", obj18, 100.0f);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100L + "'", obj21, 100L);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test080");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        int int3 = linkedListTestDriver0.size();
        java.lang.Object obj4 = linkedListTestDriver0.removeLast();
        java.lang.Object[] objArray5 = linkedListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test081");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver1.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj4 = linkedListTestDriver1.getFirst();
        boolean boolean6 = linkedListTestDriver1.add((java.lang.Object) (short) 100);
        boolean boolean8 = linkedListTestDriver1.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean9 = linkedListTestDriver0.add((java.lang.Object) boolean8);
        java.lang.Object obj10 = linkedListTestDriver0.getLast();
        java.lang.Object obj11 = linkedListTestDriver0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = linkedListTestDriver0.get(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + false + "'", obj11, false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test082");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = linkedListTestDriver0.set((int) (short) 0, (java.lang.Object) (byte) 1);
        java.lang.Object[] objArray11 = linkedListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator13 = linkedListTestDriver0.listIterator((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 97; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[1, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[1, 100]");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test083");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        boolean boolean7 = linkedListTestDriver0.contains((java.lang.Object) (short) 10);
        int int8 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj14 = linkedListTestDriver11.getFirst();
        boolean boolean16 = linkedListTestDriver11.add((java.lang.Object) (short) 100);
        boolean boolean18 = linkedListTestDriver11.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean19 = linkedListTestDriver10.add((java.lang.Object) boolean18);
        linkedListTestDriver10.addLast((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver22.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj25 = linkedListTestDriver22.getFirst();
        boolean boolean27 = linkedListTestDriver22.add((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator28 = linkedListTestDriver22.iterator();
        linkedListTestDriver22.addLast((java.lang.Object) 100L);
        boolean boolean31 = linkedListTestDriver10.add((java.lang.Object) linkedListTestDriver22);
        experiment.util.Iterator iterator32 = linkedListTestDriver10.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = linkedListTestDriver0.set((int) (byte) 100, (java.lang.Object) linkedListTestDriver10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0f + "'", obj14, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0f + "'", obj25, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(iterator32);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test084");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.removeFirst();
        linkedListTestDriver0.clear();
        linkedListTestDriver0.clear();
        java.lang.Class<?> wildcardClass6 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test085");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.removeFirst();
        linkedListTestDriver0.clear();
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = linkedListTestDriver0.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test086");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.addFirst((java.lang.Object) 10.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.clear();
        boolean boolean8 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = linkedListTestDriver6.get(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test087");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = linkedListTestDriver0.set((int) (short) 0, (java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator11 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver13.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj16 = linkedListTestDriver13.getFirst();
        boolean boolean18 = linkedListTestDriver13.add((java.lang.Object) (short) 100);
        boolean boolean20 = linkedListTestDriver13.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean21 = linkedListTestDriver12.add((java.lang.Object) boolean20);
        linkedListTestDriver12.addLast((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver24.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj27 = linkedListTestDriver24.getFirst();
        boolean boolean29 = linkedListTestDriver24.add((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator30 = linkedListTestDriver24.iterator();
        linkedListTestDriver24.addLast((java.lang.Object) 100L);
        boolean boolean33 = linkedListTestDriver12.add((java.lang.Object) linkedListTestDriver24);
        boolean boolean34 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver12);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver12.add((int) (byte) -1, (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0f + "'", obj16, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 100.0f + "'", obj27, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test088");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        java.lang.Object obj6 = linkedListTestDriver0.getFirst();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator8 = linkedListTestDriver0.listIterator(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0f + "'", obj6, 100.0f);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test089");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.addFirst((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.addFirst((java.lang.Object) 100.0f);
        int int10 = linkedListTestDriver7.size();
        boolean boolean12 = linkedListTestDriver7.add((java.lang.Object) (-1.0f));
        linkedListTestDriver7.add(1, (java.lang.Object) 1);
        boolean boolean17 = linkedListTestDriver7.add((java.lang.Object) (short) 1);
        java.lang.Object obj18 = linkedListTestDriver7.getFirst();
        experiment.util.Iterator iterator19 = linkedListTestDriver7.iterator();
        java.lang.Object obj21 = linkedListTestDriver7.get(0);
        linkedListTestDriver0.addFirst((java.lang.Object) 0);
        experiment.util.ListIterator listIterator24 = linkedListTestDriver0.listIterator(0);
        java.lang.Class<?> wildcardClass25 = listIterator24.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0f + "'", obj18, 100.0f);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0f + "'", obj21, 100.0f);
        org.junit.Assert.assertNotNull(listIterator24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test090");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver1.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj4 = linkedListTestDriver1.getFirst();
        boolean boolean6 = linkedListTestDriver1.add((java.lang.Object) (short) 100);
        boolean boolean8 = linkedListTestDriver1.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean9 = linkedListTestDriver0.add((java.lang.Object) boolean8);
        boolean boolean11 = linkedListTestDriver0.remove((java.lang.Object) '4');
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver14.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj17 = linkedListTestDriver14.getFirst();
        boolean boolean19 = linkedListTestDriver14.add((java.lang.Object) (short) 100);
        boolean boolean21 = linkedListTestDriver14.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean22 = linkedListTestDriver13.add((java.lang.Object) boolean21);
        java.lang.Object obj23 = linkedListTestDriver13.getLast();
        java.lang.Object obj24 = linkedListTestDriver13.removeFirst();
        java.lang.Object[] objArray25 = linkedListTestDriver13.toArray();
        linkedListTestDriver0.add(0, (java.lang.Object) linkedListTestDriver13);
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver29.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj32 = linkedListTestDriver29.getFirst();
        boolean boolean34 = linkedListTestDriver29.add((java.lang.Object) (short) 100);
        boolean boolean36 = linkedListTestDriver29.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean37 = linkedListTestDriver28.add((java.lang.Object) boolean36);
        java.lang.Object obj38 = linkedListTestDriver28.getLast();
        java.lang.Object obj39 = linkedListTestDriver28.removeFirst();
        java.lang.Object[] objArray40 = linkedListTestDriver28.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj41 = linkedListTestDriver0.set((int) (short) 100, (java.lang.Object) linkedListTestDriver28);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 100.0f + "'", obj17, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + false + "'", obj23, false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + false + "'", obj24, false);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 100.0f + "'", obj32, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + false + "'", obj38, false);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + false + "'", obj39, false);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[]");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test091");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        java.lang.Object obj6 = linkedListTestDriver0.getFirst();
        boolean boolean8 = linkedListTestDriver0.add((java.lang.Object) 100L);
        java.lang.Object obj9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = linkedListTestDriver0.equals_CUT(obj9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0f + "'", obj6, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test092");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj9 = linkedListTestDriver6.getFirst();
        boolean boolean11 = linkedListTestDriver6.add((java.lang.Object) (short) 100);
        boolean boolean13 = linkedListTestDriver6.contains((java.lang.Object) (short) 10);
        linkedListTestDriver0.addLast((java.lang.Object) boolean13);
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver17.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj20 = linkedListTestDriver17.getFirst();
        boolean boolean22 = linkedListTestDriver17.add((java.lang.Object) (short) 100);
        boolean boolean24 = linkedListTestDriver17.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean25 = linkedListTestDriver16.add((java.lang.Object) boolean24);
        java.lang.Object obj26 = linkedListTestDriver16.getLast();
        java.lang.Object obj27 = linkedListTestDriver16.removeFirst();
        java.lang.Object[] objArray28 = linkedListTestDriver16.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver29.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj32 = linkedListTestDriver29.getFirst();
        boolean boolean34 = linkedListTestDriver29.add((java.lang.Object) (short) 100);
        linkedListTestDriver29.addLast((java.lang.Object) 10L);
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver38 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver38.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj41 = linkedListTestDriver38.getFirst();
        boolean boolean43 = linkedListTestDriver38.add((java.lang.Object) (short) 100);
        boolean boolean45 = linkedListTestDriver38.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean46 = linkedListTestDriver37.add((java.lang.Object) boolean45);
        java.lang.Object obj47 = linkedListTestDriver37.getLast();
        java.lang.Object obj48 = linkedListTestDriver37.removeFirst();
        java.lang.Object[] objArray49 = linkedListTestDriver37.toArray();
        experiment.util.ListIterator listIterator51 = linkedListTestDriver37.listIterator(0);
        boolean boolean52 = linkedListTestDriver29.remove((java.lang.Object) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver53 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver54 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver54.addFirst((java.lang.Object) 100.0f);
        int int57 = linkedListTestDriver54.size();
        linkedListTestDriver54.addFirst((java.lang.Object) 10.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver60 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver60.clear();
        boolean boolean62 = linkedListTestDriver54.add((java.lang.Object) linkedListTestDriver60);
        java.lang.Object obj63 = linkedListTestDriver54.getFirst();
        boolean boolean64 = linkedListTestDriver53.remove((java.lang.Object) linkedListTestDriver54);
        linkedListTestDriver29.addFirst((java.lang.Object) linkedListTestDriver54);
        linkedListTestDriver16.addLast((java.lang.Object) linkedListTestDriver29);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj67 = linkedListTestDriver0.set((int) (byte) -1, (java.lang.Object) linkedListTestDriver16);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0f + "'", obj20, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + false + "'", obj26, false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + false + "'", obj27, false);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 100.0f + "'", obj32, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 100.0f + "'", obj41, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + false + "'", obj47, false);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + false + "'", obj48, false);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[]");
        org.junit.Assert.assertNotNull(listIterator51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + 10.0d + "'", obj63, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test093");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        java.lang.Object obj6 = linkedListTestDriver0.getFirst();
        java.lang.Object[] objArray7 = linkedListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = linkedListTestDriver0.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0f + "'", obj6, 100.0f);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100.0, 100]");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test094");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        linkedListTestDriver0.addLast((java.lang.Object) 10L);
        boolean boolean9 = linkedListTestDriver0.contains((java.lang.Object) (-1L));
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj13 = linkedListTestDriver10.getFirst();
        boolean boolean15 = linkedListTestDriver10.add((java.lang.Object) (short) 100);
        java.lang.Object obj16 = linkedListTestDriver10.getFirst();
        java.lang.Object[] objArray17 = linkedListTestDriver10.toArray();
        linkedListTestDriver0.addLast((java.lang.Object) objArray17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = linkedListTestDriver0.get((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0f + "'", obj13, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0f + "'", obj16, 100.0f);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[100.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[100.0, 100]");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test095");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver1.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj4 = linkedListTestDriver1.getFirst();
        boolean boolean6 = linkedListTestDriver1.add((java.lang.Object) (short) 100);
        boolean boolean8 = linkedListTestDriver1.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean9 = linkedListTestDriver0.add((java.lang.Object) boolean8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = linkedListTestDriver0.remove((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test096");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = linkedListTestDriver0.set((int) (short) 0, (java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator11 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver13.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj16 = linkedListTestDriver13.getFirst();
        boolean boolean18 = linkedListTestDriver13.add((java.lang.Object) (short) 100);
        boolean boolean20 = linkedListTestDriver13.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean21 = linkedListTestDriver12.add((java.lang.Object) boolean20);
        linkedListTestDriver12.addLast((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver24.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj27 = linkedListTestDriver24.getFirst();
        boolean boolean29 = linkedListTestDriver24.add((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator30 = linkedListTestDriver24.iterator();
        linkedListTestDriver24.addLast((java.lang.Object) 100L);
        boolean boolean33 = linkedListTestDriver12.add((java.lang.Object) linkedListTestDriver24);
        boolean boolean34 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver12);
        boolean boolean36 = linkedListTestDriver12.add((java.lang.Object) 10);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0f + "'", obj16, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 100.0f + "'", obj27, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test097");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver1.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj4 = linkedListTestDriver1.getFirst();
        boolean boolean6 = linkedListTestDriver1.add((java.lang.Object) (short) 100);
        boolean boolean8 = linkedListTestDriver1.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean9 = linkedListTestDriver0.add((java.lang.Object) boolean8);
        java.lang.Object obj10 = linkedListTestDriver0.getLast();
        java.lang.Object obj11 = linkedListTestDriver0.removeFirst();
        java.lang.Object[] objArray12 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver14.addFirst((java.lang.Object) 100.0f);
        int int17 = linkedListTestDriver14.size();
        linkedListTestDriver14.addFirst((java.lang.Object) 10.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver20.clear();
        boolean boolean22 = linkedListTestDriver14.add((java.lang.Object) linkedListTestDriver20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = linkedListTestDriver0.set(2, (java.lang.Object) linkedListTestDriver14);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + false + "'", obj11, false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test098");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver1.clear();
        experiment.util.Iterator iterator3 = linkedListTestDriver1.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver1);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver5.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver5.addFirst((java.lang.Object) 100L);
        java.lang.Object obj10 = linkedListTestDriver5.getFirst();
        boolean boolean12 = linkedListTestDriver5.add((java.lang.Object) 'a');
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver14.addFirst((java.lang.Object) 100.0f);
        int int17 = linkedListTestDriver14.size();
        java.lang.Object obj18 = linkedListTestDriver14.removeLast();
        java.lang.Object[] objArray19 = linkedListTestDriver14.toArray();
        linkedListTestDriver14.clear();
        java.lang.Object obj21 = linkedListTestDriver5.set((int) (byte) 0, (java.lang.Object) linkedListTestDriver14);
        linkedListTestDriver1.addFirst((java.lang.Object) linkedListTestDriver14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = linkedListTestDriver14.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100L + "'", obj10, 100L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0f + "'", obj18, 100.0f);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100L + "'", obj21, 100L);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test099");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver1.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj4 = linkedListTestDriver1.getFirst();
        boolean boolean6 = linkedListTestDriver1.add((java.lang.Object) (short) 100);
        boolean boolean8 = linkedListTestDriver1.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean9 = linkedListTestDriver0.add((java.lang.Object) boolean8);
        boolean boolean11 = linkedListTestDriver0.remove((java.lang.Object) '4');
        java.lang.Class<?> wildcardClass12 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test100");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) 100L);
        linkedListTestDriver0.addFirst((java.lang.Object) '4');
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj14 = linkedListTestDriver11.getFirst();
        boolean boolean16 = linkedListTestDriver11.add((java.lang.Object) (short) 100);
        boolean boolean18 = linkedListTestDriver11.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj19 = linkedListTestDriver11.getFirst();
        boolean boolean20 = linkedListTestDriver0.contains(obj19);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator22 = linkedListTestDriver0.listIterator(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0f + "'", obj14, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0f + "'", obj19, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test101");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        int int3 = linkedListTestDriver0.size();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addFirst((java.lang.Object) 100.0f);
        int int9 = linkedListTestDriver6.size();
        linkedListTestDriver6.clear();
        experiment.util.Iterator iterator11 = linkedListTestDriver6.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj15 = linkedListTestDriver12.getFirst();
        boolean boolean17 = linkedListTestDriver12.add((java.lang.Object) (short) 100);
        boolean boolean19 = linkedListTestDriver12.contains((java.lang.Object) (short) 10);
        linkedListTestDriver6.addLast((java.lang.Object) boolean19);
        boolean boolean21 = linkedListTestDriver6.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver23.clear();
        experiment.util.Iterator iterator25 = linkedListTestDriver23.iterator();
        linkedListTestDriver22.addLast((java.lang.Object) linkedListTestDriver23);
        boolean boolean28 = linkedListTestDriver23.remove((java.lang.Object) 0L);
        boolean boolean29 = linkedListTestDriver6.contains((java.lang.Object) boolean28);
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver30.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver30.addFirst((java.lang.Object) 100L);
        java.lang.Object obj35 = linkedListTestDriver30.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver37.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj40 = linkedListTestDriver37.getFirst();
        boolean boolean42 = linkedListTestDriver37.add((java.lang.Object) (short) 100);
        linkedListTestDriver37.addLast((java.lang.Object) 10L);
        boolean boolean46 = linkedListTestDriver37.contains((java.lang.Object) (-1L));
        int int47 = linkedListTestDriver37.size();
        java.lang.Object obj48 = linkedListTestDriver30.set(0, (java.lang.Object) int47);
        boolean boolean49 = linkedListTestDriver6.contains((java.lang.Object) linkedListTestDriver30);
        linkedListTestDriver0.addLast((java.lang.Object) boolean49);
        experiment.util.LinkedListTestDriver linkedListTestDriver52 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver52.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj55 = linkedListTestDriver52.getFirst();
        boolean boolean57 = linkedListTestDriver52.add((java.lang.Object) (short) 100);
        boolean boolean59 = linkedListTestDriver52.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj62 = linkedListTestDriver52.set((int) (short) 0, (java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator63 = linkedListTestDriver52.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver64 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver64.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj67 = linkedListTestDriver64.getFirst();
        boolean boolean69 = linkedListTestDriver64.add((java.lang.Object) (short) 100);
        boolean boolean71 = linkedListTestDriver64.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj74 = linkedListTestDriver64.set((int) (short) 0, (java.lang.Object) (byte) 1);
        boolean boolean75 = linkedListTestDriver52.add((java.lang.Object) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj76 = linkedListTestDriver0.set((int) ' ', (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0f + "'", obj15, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 100.0f + "'", obj35, 100.0f);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 100.0f + "'", obj40, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3 + "'", int47 == 3);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 100L + "'", obj48, 100L);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + 100.0f + "'", obj55, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + 100.0f + "'", obj62, 100.0f);
        org.junit.Assert.assertNotNull(iterator63);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + 100.0f + "'", obj67, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + obj74 + "' != '" + 100.0f + "'", obj74, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test102");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        int int3 = linkedListTestDriver0.size();
        java.lang.Object obj4 = linkedListTestDriver0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = linkedListTestDriver0.get((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test103");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.addFirst((java.lang.Object) 10.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addFirst((java.lang.Object) 100.0f);
        int int9 = linkedListTestDriver6.size();
        boolean boolean11 = linkedListTestDriver6.add((java.lang.Object) (-1.0f));
        linkedListTestDriver6.add(1, (java.lang.Object) 1);
        boolean boolean15 = linkedListTestDriver0.contains((java.lang.Object) 1);
        java.lang.Object obj16 = linkedListTestDriver0.getFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = linkedListTestDriver0.remove((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 10.0d + "'", obj16, 10.0d);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test104");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        boolean boolean7 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj13 = linkedListTestDriver10.getFirst();
        boolean boolean15 = linkedListTestDriver10.add((java.lang.Object) (short) 100);
        boolean boolean17 = linkedListTestDriver10.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean18 = linkedListTestDriver9.add((java.lang.Object) boolean17);
        java.lang.Object obj19 = linkedListTestDriver9.getLast();
        java.lang.Object obj20 = linkedListTestDriver9.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) '#', (java.lang.Object) linkedListTestDriver9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 35; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0f + "'", obj13, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + false + "'", obj19, false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test105");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver0.addFirst((java.lang.Object) 100L);
        java.lang.Object obj5 = linkedListTestDriver0.getFirst();
        boolean boolean7 = linkedListTestDriver0.add((java.lang.Object) 'a');
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver9.addFirst((java.lang.Object) 100.0f);
        int int12 = linkedListTestDriver9.size();
        java.lang.Object obj13 = linkedListTestDriver9.removeLast();
        java.lang.Object[] objArray14 = linkedListTestDriver9.toArray();
        linkedListTestDriver9.clear();
        java.lang.Object obj16 = linkedListTestDriver0.set((int) (byte) 0, (java.lang.Object) linkedListTestDriver9);
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver18.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj21 = linkedListTestDriver18.getFirst();
        boolean boolean23 = linkedListTestDriver18.add((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver24.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj27 = linkedListTestDriver24.removeFirst();
        linkedListTestDriver24.clear();
        java.lang.Class<?> wildcardClass29 = linkedListTestDriver24.getClass();
        boolean boolean30 = linkedListTestDriver18.remove((java.lang.Object) linkedListTestDriver24);
        experiment.util.Iterator iterator31 = linkedListTestDriver24.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = linkedListTestDriver0.set((int) (byte) 10, (java.lang.Object) iterator31);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100L + "'", obj5, 100L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0f + "'", obj13, 100.0f);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100L + "'", obj16, 100L);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0f + "'", obj21, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 100.0f + "'", obj27, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(iterator31);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test106");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver0.addFirst((java.lang.Object) 100L);
        java.lang.Object obj5 = linkedListTestDriver0.getFirst();
        java.lang.Object obj6 = linkedListTestDriver0.getFirst();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator8 = linkedListTestDriver0.listIterator((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 32; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100L + "'", obj5, 100L);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100L + "'", obj6, 100L);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test107");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.clear();
        boolean boolean3 = linkedListTestDriver0.equals_CUT((java.lang.Object) (-1.0d));
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (byte) 0);
        java.lang.Object obj7 = linkedListTestDriver0.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = linkedListTestDriver0.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test108");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = linkedListTestDriver0.set((int) (short) 0, (java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator11 = linkedListTestDriver0.iterator();
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = linkedListTestDriver0.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test109");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver1.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj4 = linkedListTestDriver1.getFirst();
        boolean boolean6 = linkedListTestDriver1.add((java.lang.Object) (short) 100);
        boolean boolean8 = linkedListTestDriver1.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean9 = linkedListTestDriver0.add((java.lang.Object) boolean8);
        java.lang.Object obj10 = linkedListTestDriver0.getLast();
        java.lang.Object obj11 = linkedListTestDriver0.removeFirst();
        java.lang.Object[] objArray12 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver13.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj16 = linkedListTestDriver13.getFirst();
        boolean boolean18 = linkedListTestDriver13.add((java.lang.Object) (short) 100);
        linkedListTestDriver13.addLast((java.lang.Object) 10L);
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver22.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj25 = linkedListTestDriver22.getFirst();
        boolean boolean27 = linkedListTestDriver22.add((java.lang.Object) (short) 100);
        boolean boolean29 = linkedListTestDriver22.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean30 = linkedListTestDriver21.add((java.lang.Object) boolean29);
        java.lang.Object obj31 = linkedListTestDriver21.getLast();
        java.lang.Object obj32 = linkedListTestDriver21.removeFirst();
        java.lang.Object[] objArray33 = linkedListTestDriver21.toArray();
        experiment.util.ListIterator listIterator35 = linkedListTestDriver21.listIterator(0);
        boolean boolean36 = linkedListTestDriver13.remove((java.lang.Object) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver38 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver38.addFirst((java.lang.Object) 100.0f);
        int int41 = linkedListTestDriver38.size();
        linkedListTestDriver38.addFirst((java.lang.Object) 10.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver44 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver44.clear();
        boolean boolean46 = linkedListTestDriver38.add((java.lang.Object) linkedListTestDriver44);
        java.lang.Object obj47 = linkedListTestDriver38.getFirst();
        boolean boolean48 = linkedListTestDriver37.remove((java.lang.Object) linkedListTestDriver38);
        linkedListTestDriver13.addFirst((java.lang.Object) linkedListTestDriver38);
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver13);
        linkedListTestDriver13.clear();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + false + "'", obj11, false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0f + "'", obj16, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0f + "'", obj25, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + false + "'", obj31, false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + false + "'", obj32, false);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertNotNull(listIterator35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 10.0d + "'", obj47, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test110");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver1.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj4 = linkedListTestDriver1.getFirst();
        boolean boolean6 = linkedListTestDriver1.add((java.lang.Object) (short) 100);
        boolean boolean8 = linkedListTestDriver1.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean9 = linkedListTestDriver0.add((java.lang.Object) boolean8);
        java.lang.Object obj10 = linkedListTestDriver0.getLast();
        java.lang.Object obj11 = linkedListTestDriver0.removeFirst();
        java.lang.Object[] objArray12 = linkedListTestDriver0.toArray();
        experiment.util.ListIterator listIterator14 = linkedListTestDriver0.listIterator(0);
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver15.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver15.addFirst((java.lang.Object) 100L);
        java.lang.Object obj20 = linkedListTestDriver15.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver22.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj25 = linkedListTestDriver22.getFirst();
        boolean boolean27 = linkedListTestDriver22.add((java.lang.Object) (short) 100);
        linkedListTestDriver22.addLast((java.lang.Object) 10L);
        boolean boolean31 = linkedListTestDriver22.contains((java.lang.Object) (-1L));
        int int32 = linkedListTestDriver22.size();
        java.lang.Object obj33 = linkedListTestDriver15.set(0, (java.lang.Object) int32);
        linkedListTestDriver0.addLast(obj33);
        experiment.util.LinkedListTestDriver linkedListTestDriver36 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver37.clear();
        experiment.util.Iterator iterator39 = linkedListTestDriver37.iterator();
        linkedListTestDriver36.addLast((java.lang.Object) linkedListTestDriver37);
        boolean boolean42 = linkedListTestDriver37.remove((java.lang.Object) 0L);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add(2, (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 2; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + false + "'", obj11, false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(listIterator14);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0f + "'", obj20, 100.0f);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0f + "'", obj25, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 100L + "'", obj33, 100L);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test111");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = linkedListTestDriver0.set((int) (short) 0, (java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator11 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver13.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj16 = linkedListTestDriver13.getFirst();
        boolean boolean18 = linkedListTestDriver13.add((java.lang.Object) (short) 100);
        boolean boolean20 = linkedListTestDriver13.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean21 = linkedListTestDriver12.add((java.lang.Object) boolean20);
        linkedListTestDriver12.addLast((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver24.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj27 = linkedListTestDriver24.getFirst();
        boolean boolean29 = linkedListTestDriver24.add((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator30 = linkedListTestDriver24.iterator();
        linkedListTestDriver24.addLast((java.lang.Object) 100L);
        boolean boolean33 = linkedListTestDriver12.add((java.lang.Object) linkedListTestDriver24);
        boolean boolean34 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver12);
        experiment.util.LinkedListTestDriver linkedListTestDriver35 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver35.addFirst((java.lang.Object) 100.0f);
        int int38 = linkedListTestDriver35.size();
        linkedListTestDriver35.clear();
        boolean boolean40 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver35);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0f + "'", obj16, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 100.0f + "'", obj27, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test112");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = linkedListTestDriver0.set((int) (short) 0, (java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator11 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver13.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj16 = linkedListTestDriver13.getFirst();
        boolean boolean18 = linkedListTestDriver13.add((java.lang.Object) (short) 100);
        boolean boolean20 = linkedListTestDriver13.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean21 = linkedListTestDriver12.add((java.lang.Object) boolean20);
        linkedListTestDriver12.addLast((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver24.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj27 = linkedListTestDriver24.getFirst();
        boolean boolean29 = linkedListTestDriver24.add((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator30 = linkedListTestDriver24.iterator();
        linkedListTestDriver24.addLast((java.lang.Object) 100L);
        boolean boolean33 = linkedListTestDriver12.add((java.lang.Object) linkedListTestDriver24);
        boolean boolean34 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver12);
        java.lang.Object obj35 = linkedListTestDriver0.removeFirst();
        java.lang.Class<?> wildcardClass36 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0f + "'", obj16, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 100.0f + "'", obj27, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (byte) 1 + "'", obj35, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test113");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver1.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj4 = linkedListTestDriver1.getFirst();
        boolean boolean6 = linkedListTestDriver1.add((java.lang.Object) (short) 100);
        boolean boolean8 = linkedListTestDriver1.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean9 = linkedListTestDriver0.add((java.lang.Object) boolean8);
        java.lang.Object obj10 = linkedListTestDriver0.getLast();
        java.lang.Object obj11 = linkedListTestDriver0.removeFirst();
        java.lang.Object[] objArray12 = linkedListTestDriver0.toArray();
        experiment.util.ListIterator listIterator14 = linkedListTestDriver0.listIterator(0);
        linkedListTestDriver0.addFirst((java.lang.Object) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator18 = linkedListTestDriver0.listIterator((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 35; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + false + "'", obj11, false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(listIterator14);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test114");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.addFirst((java.lang.Object) 10.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addFirst((java.lang.Object) 100.0f);
        int int9 = linkedListTestDriver6.size();
        boolean boolean11 = linkedListTestDriver6.add((java.lang.Object) (-1.0f));
        linkedListTestDriver6.add(1, (java.lang.Object) 1);
        boolean boolean15 = linkedListTestDriver0.contains((java.lang.Object) 1);
        java.lang.Object obj16 = linkedListTestDriver0.getFirst();
        linkedListTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 10.0d + "'", obj16, 10.0d);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test115");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj9 = linkedListTestDriver6.removeFirst();
        linkedListTestDriver6.clear();
        java.lang.Class<?> wildcardClass11 = linkedListTestDriver6.getClass();
        boolean boolean12 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = linkedListTestDriver6.getLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test116");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = linkedListTestDriver0.set((int) (short) 0, (java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator11 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver13.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj16 = linkedListTestDriver13.getFirst();
        boolean boolean18 = linkedListTestDriver13.add((java.lang.Object) (short) 100);
        boolean boolean20 = linkedListTestDriver13.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean21 = linkedListTestDriver12.add((java.lang.Object) boolean20);
        linkedListTestDriver12.addLast((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver24.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj27 = linkedListTestDriver24.getFirst();
        boolean boolean29 = linkedListTestDriver24.add((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator30 = linkedListTestDriver24.iterator();
        linkedListTestDriver24.addLast((java.lang.Object) 100L);
        boolean boolean33 = linkedListTestDriver12.add((java.lang.Object) linkedListTestDriver24);
        boolean boolean34 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver12);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator36 = linkedListTestDriver12.listIterator((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 97; size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0f + "'", obj16, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 100.0f + "'", obj27, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test117");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.clear();
        boolean boolean3 = linkedListTestDriver0.equals_CUT((java.lang.Object) (-1.0d));
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (byte) 0);
        java.lang.Object obj7 = linkedListTestDriver0.remove((int) (short) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.addFirst((java.lang.Object) 100.0f);
        int int11 = linkedListTestDriver8.size();
        linkedListTestDriver8.clear();
        experiment.util.Iterator iterator13 = linkedListTestDriver8.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver14.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj17 = linkedListTestDriver14.getFirst();
        boolean boolean19 = linkedListTestDriver14.add((java.lang.Object) (short) 100);
        boolean boolean21 = linkedListTestDriver14.contains((java.lang.Object) (short) 10);
        linkedListTestDriver8.addLast((java.lang.Object) boolean21);
        boolean boolean23 = linkedListTestDriver8.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver25.clear();
        experiment.util.Iterator iterator27 = linkedListTestDriver25.iterator();
        linkedListTestDriver24.addLast((java.lang.Object) linkedListTestDriver25);
        boolean boolean30 = linkedListTestDriver25.remove((java.lang.Object) 0L);
        boolean boolean31 = linkedListTestDriver8.contains((java.lang.Object) boolean30);
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver32.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver32.addFirst((java.lang.Object) 100L);
        java.lang.Object obj37 = linkedListTestDriver32.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver39 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver39.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj42 = linkedListTestDriver39.getFirst();
        boolean boolean44 = linkedListTestDriver39.add((java.lang.Object) (short) 100);
        linkedListTestDriver39.addLast((java.lang.Object) 10L);
        boolean boolean48 = linkedListTestDriver39.contains((java.lang.Object) (-1L));
        int int49 = linkedListTestDriver39.size();
        java.lang.Object obj50 = linkedListTestDriver32.set(0, (java.lang.Object) int49);
        boolean boolean51 = linkedListTestDriver8.contains((java.lang.Object) linkedListTestDriver32);
        experiment.util.Iterator iterator52 = linkedListTestDriver32.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver32);
        experiment.util.LinkedListTestDriver linkedListTestDriver54 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver54.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj57 = linkedListTestDriver54.getFirst();
        boolean boolean59 = linkedListTestDriver54.add((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver60 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver60.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj63 = linkedListTestDriver60.removeFirst();
        linkedListTestDriver60.clear();
        java.lang.Class<?> wildcardClass65 = linkedListTestDriver60.getClass();
        boolean boolean66 = linkedListTestDriver54.remove((java.lang.Object) linkedListTestDriver60);
        boolean boolean67 = linkedListTestDriver0.contains((java.lang.Object) boolean66);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 100.0f + "'", obj17, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 100.0f + "'", obj37, 100.0f);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 100.0f + "'", obj42, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 3 + "'", int49 == 3);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 100L + "'", obj50, 100L);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(iterator52);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + 100.0f + "'", obj57, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + 100.0f + "'", obj63, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test118");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator4 = linkedListTestDriver0.listIterator((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test119");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj9 = linkedListTestDriver6.getFirst();
        boolean boolean11 = linkedListTestDriver6.add((java.lang.Object) (short) 100);
        boolean boolean13 = linkedListTestDriver6.contains((java.lang.Object) (short) 10);
        linkedListTestDriver0.addLast((java.lang.Object) boolean13);
        boolean boolean15 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver17.clear();
        experiment.util.Iterator iterator19 = linkedListTestDriver17.iterator();
        linkedListTestDriver16.addLast((java.lang.Object) linkedListTestDriver17);
        boolean boolean22 = linkedListTestDriver17.remove((java.lang.Object) 0L);
        boolean boolean23 = linkedListTestDriver0.contains((java.lang.Object) boolean22);
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver24.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver24.addFirst((java.lang.Object) 100L);
        java.lang.Object obj29 = linkedListTestDriver24.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver31.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj34 = linkedListTestDriver31.getFirst();
        boolean boolean36 = linkedListTestDriver31.add((java.lang.Object) (short) 100);
        linkedListTestDriver31.addLast((java.lang.Object) 10L);
        boolean boolean40 = linkedListTestDriver31.contains((java.lang.Object) (-1L));
        int int41 = linkedListTestDriver31.size();
        java.lang.Object obj42 = linkedListTestDriver24.set(0, (java.lang.Object) int41);
        boolean boolean43 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver24);
        experiment.util.LinkedListTestDriver linkedListTestDriver45 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver46 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver46.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj49 = linkedListTestDriver46.getFirst();
        boolean boolean51 = linkedListTestDriver46.add((java.lang.Object) (short) 100);
        boolean boolean53 = linkedListTestDriver46.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean54 = linkedListTestDriver45.add((java.lang.Object) boolean53);
        linkedListTestDriver45.addLast((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver57 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver57.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj60 = linkedListTestDriver57.getFirst();
        boolean boolean62 = linkedListTestDriver57.add((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator63 = linkedListTestDriver57.iterator();
        linkedListTestDriver57.addLast((java.lang.Object) 100L);
        boolean boolean66 = linkedListTestDriver45.add((java.lang.Object) linkedListTestDriver57);
        linkedListTestDriver24.add((int) (short) 1, (java.lang.Object) linkedListTestDriver45);
        int int68 = linkedListTestDriver45.size();
        experiment.util.ListIterator listIterator70 = linkedListTestDriver45.listIterator(0);
        experiment.util.LinkedListTestDriver linkedListTestDriver71 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver71.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj74 = linkedListTestDriver71.getFirst();
        boolean boolean76 = linkedListTestDriver71.add((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator77 = linkedListTestDriver71.iterator();
        java.lang.Class<?> wildcardClass78 = iterator77.getClass();
        linkedListTestDriver45.addFirst((java.lang.Object) wildcardClass78);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 100.0f + "'", obj29, 100.0f);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 100.0f + "'", obj34, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 100L + "'", obj42, 100L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 100.0f + "'", obj49, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + 100.0f + "'", obj60, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(iterator63);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 3 + "'", int68 == 3);
        org.junit.Assert.assertNotNull(listIterator70);
        org.junit.Assert.assertEquals("'" + obj74 + "' != '" + 100.0f + "'", obj74, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(iterator77);
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test120");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = linkedListTestDriver0.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test121");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver0.addFirst((java.lang.Object) 100L);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test122");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) 100L);
        linkedListTestDriver0.addFirst((java.lang.Object) '4');
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj14 = linkedListTestDriver11.getFirst();
        boolean boolean16 = linkedListTestDriver11.add((java.lang.Object) (short) 100);
        boolean boolean18 = linkedListTestDriver11.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj19 = linkedListTestDriver11.getFirst();
        boolean boolean20 = linkedListTestDriver0.contains(obj19);
        java.lang.Object obj21 = null;
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.addLast(obj21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0f + "'", obj14, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0f + "'", obj19, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test123");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver0.addFirst((java.lang.Object) 100L);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj10 = linkedListTestDriver7.getFirst();
        boolean boolean12 = linkedListTestDriver7.add((java.lang.Object) (short) 100);
        linkedListTestDriver7.addLast((java.lang.Object) 10L);
        boolean boolean16 = linkedListTestDriver7.contains((java.lang.Object) (-1L));
        int int17 = linkedListTestDriver7.size();
        java.lang.Object obj18 = linkedListTestDriver0.set(0, (java.lang.Object) int17);
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver19.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj22 = linkedListTestDriver19.getFirst();
        java.lang.Class<?> wildcardClass23 = linkedListTestDriver19.getClass();
        boolean boolean24 = linkedListTestDriver0.contains((java.lang.Object) wildcardClass23);
        java.lang.Object[] objArray25 = linkedListTestDriver0.toArray();
        java.lang.Class<?> wildcardClass26 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100L + "'", obj18, 100L);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 100.0f + "'", obj22, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[3, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[3, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test124");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = linkedListTestDriver0.set((int) (short) 0, (java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator11 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver13.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj16 = linkedListTestDriver13.getFirst();
        boolean boolean18 = linkedListTestDriver13.add((java.lang.Object) (short) 100);
        boolean boolean20 = linkedListTestDriver13.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean21 = linkedListTestDriver12.add((java.lang.Object) boolean20);
        linkedListTestDriver12.addLast((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver24.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj27 = linkedListTestDriver24.getFirst();
        boolean boolean29 = linkedListTestDriver24.add((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator30 = linkedListTestDriver24.iterator();
        linkedListTestDriver24.addLast((java.lang.Object) 100L);
        boolean boolean33 = linkedListTestDriver12.add((java.lang.Object) linkedListTestDriver24);
        boolean boolean34 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver12);
        linkedListTestDriver12.clear();
        java.lang.Class<?> wildcardClass36 = linkedListTestDriver12.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0f + "'", obj16, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 100.0f + "'", obj27, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test125");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) 100L);
        linkedListTestDriver0.addFirst((java.lang.Object) '4');
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj14 = linkedListTestDriver11.getFirst();
        boolean boolean16 = linkedListTestDriver11.add((java.lang.Object) (short) 100);
        boolean boolean18 = linkedListTestDriver11.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj19 = linkedListTestDriver11.getFirst();
        boolean boolean20 = linkedListTestDriver0.contains(obj19);
        java.lang.Object obj21 = linkedListTestDriver0.removeLast();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0f + "'", obj14, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0f + "'", obj19, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100L + "'", obj21, 100L);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test126");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver1.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj4 = linkedListTestDriver1.getFirst();
        boolean boolean6 = linkedListTestDriver1.add((java.lang.Object) (short) 100);
        boolean boolean8 = linkedListTestDriver1.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean9 = linkedListTestDriver0.add((java.lang.Object) boolean8);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.clear();
        experiment.util.Iterator iterator12 = linkedListTestDriver10.iterator();
        boolean boolean13 = linkedListTestDriver0.contains((java.lang.Object) iterator12);
        int int14 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver15.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj18 = linkedListTestDriver15.getFirst();
        boolean boolean20 = linkedListTestDriver15.add((java.lang.Object) (short) 100);
        boolean boolean22 = linkedListTestDriver15.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj25 = linkedListTestDriver15.set((int) (short) 0, (java.lang.Object) (byte) 1);
        java.lang.Object[] objArray26 = linkedListTestDriver15.toArray();
        int int27 = linkedListTestDriver15.size();
        boolean boolean28 = linkedListTestDriver0.contains((java.lang.Object) int27);
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver30.addFirst((java.lang.Object) 100.0f);
        int int33 = linkedListTestDriver30.size();
        boolean boolean35 = linkedListTestDriver30.add((java.lang.Object) (-1.0f));
        linkedListTestDriver30.add(1, (java.lang.Object) 1);
        boolean boolean40 = linkedListTestDriver30.add((java.lang.Object) (short) 1);
        java.lang.Object obj41 = linkedListTestDriver30.removeFirst();
        experiment.util.ListIterator listIterator43 = linkedListTestDriver30.listIterator((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) '4', (java.lang.Object) linkedListTestDriver30);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 52; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0f + "'", obj18, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0f + "'", obj25, 100.0f);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[1, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[1, 100]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 100.0f + "'", obj41, 100.0f);
        org.junit.Assert.assertNotNull(listIterator43);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test127");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        java.lang.Object obj6 = linkedListTestDriver0.removeFirst();
        boolean boolean8 = linkedListTestDriver0.equals_CUT((java.lang.Object) "");
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver9.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj12 = linkedListTestDriver9.getFirst();
        boolean boolean14 = linkedListTestDriver9.add((java.lang.Object) (short) 100);
        boolean boolean16 = linkedListTestDriver9.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj17 = linkedListTestDriver9.removeFirst();
        java.lang.Object obj18 = linkedListTestDriver9.getFirst();
        boolean boolean19 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver9);
        int int20 = linkedListTestDriver0.size();
        java.lang.Object obj21 = linkedListTestDriver0.removeLast();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0f + "'", obj6, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 100.0f + "'", obj17, 100.0f);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (short) 100 + "'", obj18, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (short) 100 + "'", obj21, (short) 100);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test128");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.addFirst((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.addFirst((java.lang.Object) 100.0f);
        int int10 = linkedListTestDriver7.size();
        boolean boolean12 = linkedListTestDriver7.add((java.lang.Object) (-1.0f));
        linkedListTestDriver7.add(1, (java.lang.Object) 1);
        boolean boolean17 = linkedListTestDriver7.add((java.lang.Object) (short) 1);
        java.lang.Object obj18 = linkedListTestDriver7.getFirst();
        experiment.util.Iterator iterator19 = linkedListTestDriver7.iterator();
        java.lang.Object obj21 = linkedListTestDriver7.get(0);
        linkedListTestDriver0.addFirst((java.lang.Object) 0);
        experiment.util.ListIterator listIterator24 = linkedListTestDriver0.listIterator(0);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver25.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj28 = linkedListTestDriver25.getFirst();
        boolean boolean30 = linkedListTestDriver25.add((java.lang.Object) (short) 100);
        linkedListTestDriver25.addLast((java.lang.Object) 10L);
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver25);
        experiment.util.LinkedListTestDriver linkedListTestDriver35 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver35.addFirst((java.lang.Object) 100.0f);
        int int38 = linkedListTestDriver35.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver39 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver39.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver39.addFirst((java.lang.Object) 100L);
        java.lang.Object obj44 = linkedListTestDriver39.getFirst();
        java.lang.Class<?> wildcardClass45 = linkedListTestDriver39.getClass();
        linkedListTestDriver35.addFirst((java.lang.Object) wildcardClass45);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) (byte) 100, (java.lang.Object) wildcardClass45);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 100; size: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0f + "'", obj18, 100.0f);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0f + "'", obj21, 100.0f);
        org.junit.Assert.assertNotNull(listIterator24);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 100.0f + "'", obj28, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 100L + "'", obj44, 100L);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test129");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = linkedListTestDriver0.getFirst();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0f + "'", obj8, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test130");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver1.addFirst((java.lang.Object) 100.0f);
        int int4 = linkedListTestDriver1.size();
        linkedListTestDriver1.addFirst((java.lang.Object) 10.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.clear();
        boolean boolean9 = linkedListTestDriver1.add((java.lang.Object) linkedListTestDriver7);
        java.lang.Object obj10 = linkedListTestDriver1.getFirst();
        boolean boolean11 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver1);
        java.lang.Object obj13 = linkedListTestDriver1.get((int) (short) 0);
        java.lang.Object obj14 = linkedListTestDriver1.getFirst();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 10.0d + "'", obj10, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 10.0d + "'", obj13, 10.0d);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 10.0d + "'", obj14, 10.0d);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test131");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) 100L);
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver9.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj13 = linkedListTestDriver0.removeFirst();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0f + "'", obj13, 100.0f);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test132");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        java.lang.Object obj6 = linkedListTestDriver0.getFirst();
        boolean boolean8 = linkedListTestDriver0.add((java.lang.Object) 100L);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addFirst((java.lang.Object) 100.0f);
        int int13 = linkedListTestDriver10.size();
        boolean boolean15 = linkedListTestDriver10.add((java.lang.Object) (-1.0f));
        linkedListTestDriver10.add(1, (java.lang.Object) 1);
        boolean boolean20 = linkedListTestDriver10.add((java.lang.Object) (short) 1);
        java.lang.Object obj21 = linkedListTestDriver10.removeFirst();
        experiment.util.ListIterator listIterator23 = linkedListTestDriver10.listIterator((int) (short) 0);
        java.lang.Object obj24 = linkedListTestDriver0.set((int) (short) 1, (java.lang.Object) linkedListTestDriver10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = linkedListTestDriver10.get(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0f + "'", obj6, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0f + "'", obj21, 100.0f);
        org.junit.Assert.assertNotNull(listIterator23);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (short) 100 + "'", obj24, (short) 100);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test133");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.addFirst((java.lang.Object) 10.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.clear();
        boolean boolean8 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver6);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator10 = linkedListTestDriver6.listIterator((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 1; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test134");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator6 = linkedListTestDriver0.listIterator(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test135");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        int int3 = linkedListTestDriver0.size();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addFirst((java.lang.Object) 100.0f);
        int int9 = linkedListTestDriver6.size();
        linkedListTestDriver6.clear();
        experiment.util.Iterator iterator11 = linkedListTestDriver6.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj15 = linkedListTestDriver12.getFirst();
        boolean boolean17 = linkedListTestDriver12.add((java.lang.Object) (short) 100);
        boolean boolean19 = linkedListTestDriver12.contains((java.lang.Object) (short) 10);
        linkedListTestDriver6.addLast((java.lang.Object) boolean19);
        boolean boolean21 = linkedListTestDriver6.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver23.clear();
        experiment.util.Iterator iterator25 = linkedListTestDriver23.iterator();
        linkedListTestDriver22.addLast((java.lang.Object) linkedListTestDriver23);
        boolean boolean28 = linkedListTestDriver23.remove((java.lang.Object) 0L);
        boolean boolean29 = linkedListTestDriver6.contains((java.lang.Object) boolean28);
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver30.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver30.addFirst((java.lang.Object) 100L);
        java.lang.Object obj35 = linkedListTestDriver30.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver37.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj40 = linkedListTestDriver37.getFirst();
        boolean boolean42 = linkedListTestDriver37.add((java.lang.Object) (short) 100);
        linkedListTestDriver37.addLast((java.lang.Object) 10L);
        boolean boolean46 = linkedListTestDriver37.contains((java.lang.Object) (-1L));
        int int47 = linkedListTestDriver37.size();
        java.lang.Object obj48 = linkedListTestDriver30.set(0, (java.lang.Object) int47);
        boolean boolean49 = linkedListTestDriver6.contains((java.lang.Object) linkedListTestDriver30);
        linkedListTestDriver0.addLast((java.lang.Object) boolean49);
        java.lang.Object obj52 = linkedListTestDriver0.remove(2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0f + "'", obj15, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 100.0f + "'", obj35, 100.0f);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 100.0f + "'", obj40, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3 + "'", int47 == 3);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 100L + "'", obj48, 100L);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + false + "'", obj52, false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test136");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = linkedListTestDriver0.set((int) (short) 0, (java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addFirst((java.lang.Object) 100.0f);
        int int15 = linkedListTestDriver12.size();
        linkedListTestDriver12.clear();
        experiment.util.Iterator iterator17 = linkedListTestDriver12.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver18.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj21 = linkedListTestDriver18.getFirst();
        boolean boolean23 = linkedListTestDriver18.add((java.lang.Object) (short) 100);
        boolean boolean25 = linkedListTestDriver18.contains((java.lang.Object) (short) 10);
        linkedListTestDriver12.addLast((java.lang.Object) boolean25);
        boolean boolean27 = linkedListTestDriver12.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver29.clear();
        experiment.util.Iterator iterator31 = linkedListTestDriver29.iterator();
        linkedListTestDriver28.addLast((java.lang.Object) linkedListTestDriver29);
        boolean boolean34 = linkedListTestDriver29.remove((java.lang.Object) 0L);
        boolean boolean35 = linkedListTestDriver12.contains((java.lang.Object) boolean34);
        experiment.util.LinkedListTestDriver linkedListTestDriver36 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver36.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver36.addFirst((java.lang.Object) 100L);
        java.lang.Object obj41 = linkedListTestDriver36.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver43 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver43.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj46 = linkedListTestDriver43.getFirst();
        boolean boolean48 = linkedListTestDriver43.add((java.lang.Object) (short) 100);
        linkedListTestDriver43.addLast((java.lang.Object) 10L);
        boolean boolean52 = linkedListTestDriver43.contains((java.lang.Object) (-1L));
        int int53 = linkedListTestDriver43.size();
        java.lang.Object obj54 = linkedListTestDriver36.set(0, (java.lang.Object) int53);
        boolean boolean55 = linkedListTestDriver12.contains((java.lang.Object) linkedListTestDriver36);
        java.lang.Object obj56 = linkedListTestDriver36.removeLast();
        boolean boolean58 = linkedListTestDriver36.contains((java.lang.Object) 10.0d);
        boolean boolean59 = linkedListTestDriver36.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) (byte) 10, (java.lang.Object) boolean59);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0f + "'", obj21, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 100.0f + "'", obj41, 100.0f);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 100.0f + "'", obj46, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 3 + "'", int53 == 3);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + 100L + "'", obj54, 100L);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + 100.0f + "'", obj56, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test137");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        int int3 = linkedListTestDriver0.size();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (-1.0f));
        linkedListTestDriver0.add(1, (java.lang.Object) 1);
        boolean boolean10 = linkedListTestDriver0.add((java.lang.Object) (short) 1);
        java.lang.Object obj11 = linkedListTestDriver0.getFirst();
        experiment.util.Iterator iterator12 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver14.addFirst((java.lang.Object) 100.0f);
        int int17 = linkedListTestDriver14.size();
        linkedListTestDriver14.clear();
        experiment.util.Iterator iterator19 = linkedListTestDriver14.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver20.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj23 = linkedListTestDriver20.getFirst();
        boolean boolean25 = linkedListTestDriver20.add((java.lang.Object) (short) 100);
        boolean boolean27 = linkedListTestDriver20.contains((java.lang.Object) (short) 10);
        linkedListTestDriver14.addLast((java.lang.Object) boolean27);
        boolean boolean29 = linkedListTestDriver14.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver31.clear();
        experiment.util.Iterator iterator33 = linkedListTestDriver31.iterator();
        linkedListTestDriver30.addLast((java.lang.Object) linkedListTestDriver31);
        boolean boolean36 = linkedListTestDriver31.remove((java.lang.Object) 0L);
        boolean boolean37 = linkedListTestDriver14.contains((java.lang.Object) boolean36);
        experiment.util.LinkedListTestDriver linkedListTestDriver38 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver38.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver38.addFirst((java.lang.Object) 100L);
        java.lang.Object obj43 = linkedListTestDriver38.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver45 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver45.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj48 = linkedListTestDriver45.getFirst();
        boolean boolean50 = linkedListTestDriver45.add((java.lang.Object) (short) 100);
        linkedListTestDriver45.addLast((java.lang.Object) 10L);
        boolean boolean54 = linkedListTestDriver45.contains((java.lang.Object) (-1L));
        int int55 = linkedListTestDriver45.size();
        java.lang.Object obj56 = linkedListTestDriver38.set(0, (java.lang.Object) int55);
        boolean boolean57 = linkedListTestDriver14.contains((java.lang.Object) linkedListTestDriver38);
        experiment.util.LinkedListTestDriver linkedListTestDriver59 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver60 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver60.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj63 = linkedListTestDriver60.getFirst();
        boolean boolean65 = linkedListTestDriver60.add((java.lang.Object) (short) 100);
        boolean boolean67 = linkedListTestDriver60.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean68 = linkedListTestDriver59.add((java.lang.Object) boolean67);
        linkedListTestDriver59.addLast((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver71 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver71.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj74 = linkedListTestDriver71.getFirst();
        boolean boolean76 = linkedListTestDriver71.add((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator77 = linkedListTestDriver71.iterator();
        linkedListTestDriver71.addLast((java.lang.Object) 100L);
        boolean boolean80 = linkedListTestDriver59.add((java.lang.Object) linkedListTestDriver71);
        linkedListTestDriver38.add((int) (short) 1, (java.lang.Object) linkedListTestDriver59);
        int int82 = linkedListTestDriver59.size();
        experiment.util.Iterator iterator83 = linkedListTestDriver59.iterator();
        java.lang.Object obj84 = linkedListTestDriver0.set((int) (short) 1, (java.lang.Object) iterator83);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0f + "'", obj11, 100.0f);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100.0f + "'", obj23, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + 100.0f + "'", obj43, 100.0f);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 100.0f + "'", obj48, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 3 + "'", int55 == 3);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + 100L + "'", obj56, 100L);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + 100.0f + "'", obj63, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertEquals("'" + obj74 + "' != '" + 100.0f + "'", obj74, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(iterator77);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 3 + "'", int82 == 3);
        org.junit.Assert.assertNotNull(iterator83);
        org.junit.Assert.assertEquals("'" + obj84 + "' != '" + 1 + "'", obj84, 1);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test138");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = linkedListTestDriver0.set((int) (short) 0, (java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator11 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj15 = linkedListTestDriver12.getFirst();
        boolean boolean17 = linkedListTestDriver12.add((java.lang.Object) (short) 100);
        boolean boolean19 = linkedListTestDriver12.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj22 = linkedListTestDriver12.set((int) (short) 0, (java.lang.Object) (byte) 1);
        boolean boolean23 = linkedListTestDriver0.add((java.lang.Object) (short) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver25.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj28 = linkedListTestDriver25.getFirst();
        boolean boolean30 = linkedListTestDriver25.add((java.lang.Object) (short) 100);
        boolean boolean32 = linkedListTestDriver25.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean33 = linkedListTestDriver24.add((java.lang.Object) boolean32);
        boolean boolean35 = linkedListTestDriver24.remove((java.lang.Object) '4');
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver38 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver38.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj41 = linkedListTestDriver38.getFirst();
        boolean boolean43 = linkedListTestDriver38.add((java.lang.Object) (short) 100);
        boolean boolean45 = linkedListTestDriver38.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean46 = linkedListTestDriver37.add((java.lang.Object) boolean45);
        java.lang.Object obj47 = linkedListTestDriver37.getLast();
        java.lang.Object obj48 = linkedListTestDriver37.removeFirst();
        java.lang.Object[] objArray49 = linkedListTestDriver37.toArray();
        linkedListTestDriver24.add(0, (java.lang.Object) linkedListTestDriver37);
        boolean boolean51 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver24);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) ' ', (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 32; size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0f + "'", obj15, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 100.0f + "'", obj22, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 100.0f + "'", obj28, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 100.0f + "'", obj41, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + false + "'", obj47, false);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + false + "'", obj48, false);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test139");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = linkedListTestDriver0.set((int) (short) 0, (java.lang.Object) (byte) 1);
        java.lang.Object[] objArray11 = linkedListTestDriver0.toArray();
        java.lang.Object obj14 = linkedListTestDriver0.set((int) (short) 0, (java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver16.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj19 = linkedListTestDriver16.getFirst();
        boolean boolean21 = linkedListTestDriver16.add((java.lang.Object) (short) 100);
        boolean boolean23 = linkedListTestDriver16.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean24 = linkedListTestDriver15.add((java.lang.Object) boolean23);
        java.lang.Object obj25 = linkedListTestDriver15.getLast();
        java.lang.Object obj26 = linkedListTestDriver15.removeFirst();
        java.lang.Object[] objArray27 = linkedListTestDriver15.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver28.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj31 = linkedListTestDriver28.getFirst();
        boolean boolean33 = linkedListTestDriver28.add((java.lang.Object) (short) 100);
        linkedListTestDriver28.addLast((java.lang.Object) 10L);
        experiment.util.LinkedListTestDriver linkedListTestDriver36 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver37.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj40 = linkedListTestDriver37.getFirst();
        boolean boolean42 = linkedListTestDriver37.add((java.lang.Object) (short) 100);
        boolean boolean44 = linkedListTestDriver37.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean45 = linkedListTestDriver36.add((java.lang.Object) boolean44);
        java.lang.Object obj46 = linkedListTestDriver36.getLast();
        java.lang.Object obj47 = linkedListTestDriver36.removeFirst();
        java.lang.Object[] objArray48 = linkedListTestDriver36.toArray();
        experiment.util.ListIterator listIterator50 = linkedListTestDriver36.listIterator(0);
        boolean boolean51 = linkedListTestDriver28.remove((java.lang.Object) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver52 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver53 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver53.addFirst((java.lang.Object) 100.0f);
        int int56 = linkedListTestDriver53.size();
        linkedListTestDriver53.addFirst((java.lang.Object) 10.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver59 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver59.clear();
        boolean boolean61 = linkedListTestDriver53.add((java.lang.Object) linkedListTestDriver59);
        java.lang.Object obj62 = linkedListTestDriver53.getFirst();
        boolean boolean63 = linkedListTestDriver52.remove((java.lang.Object) linkedListTestDriver53);
        linkedListTestDriver28.addFirst((java.lang.Object) linkedListTestDriver53);
        linkedListTestDriver15.addLast((java.lang.Object) linkedListTestDriver28);
        boolean boolean66 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver15);
        experiment.util.LinkedListTestDriver linkedListTestDriver67 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver67.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver67.addFirst((java.lang.Object) 100L);
        java.lang.Object obj72 = linkedListTestDriver67.getLast();
        boolean boolean73 = linkedListTestDriver15.contains(obj72);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[1, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[1, 100]");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) 1 + "'", obj14, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0f + "'", obj19, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + false + "'", obj25, false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + false + "'", obj26, false);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 100.0f + "'", obj31, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 100.0f + "'", obj40, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + false + "'", obj46, false);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + false + "'", obj47, false);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[]");
        org.junit.Assert.assertNotNull(listIterator50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + 10.0d + "'", obj62, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + obj72 + "' != '" + 100.0f + "'", obj72, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test140");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = linkedListTestDriver0.set((int) (short) 0, (java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator11 = linkedListTestDriver0.iterator();
        int int12 = linkedListTestDriver0.size();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test141");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver0.addFirst((java.lang.Object) 100L);
        java.lang.Object obj5 = linkedListTestDriver0.removeLast();
        boolean boolean7 = linkedListTestDriver0.remove((java.lang.Object) 1);
        java.lang.Object obj8 = linkedListTestDriver0.removeLast();
        java.lang.Object[] objArray9 = linkedListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100L + "'", obj8, 100L);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test142");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver1.addFirst((java.lang.Object) 100.0f);
        int int4 = linkedListTestDriver1.size();
        linkedListTestDriver1.addFirst((java.lang.Object) 10.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.clear();
        boolean boolean9 = linkedListTestDriver1.add((java.lang.Object) linkedListTestDriver7);
        java.lang.Object obj10 = linkedListTestDriver1.getFirst();
        boolean boolean11 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = linkedListTestDriver0.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 10.0d + "'", obj10, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test143");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        int int3 = linkedListTestDriver0.size();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.clear();
        boolean boolean9 = linkedListTestDriver6.equals_CUT((java.lang.Object) (-1.0d));
        boolean boolean11 = linkedListTestDriver6.add((java.lang.Object) (byte) 0);
        java.lang.Object obj12 = linkedListTestDriver6.getFirst();
        boolean boolean13 = linkedListTestDriver0.equals_CUT(obj12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 0 + "'", obj12, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test144");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.addFirst((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj10 = linkedListTestDriver7.getFirst();
        boolean boolean12 = linkedListTestDriver7.add((java.lang.Object) (short) 100);
        boolean boolean14 = linkedListTestDriver7.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj15 = linkedListTestDriver7.removeFirst();
        java.lang.Object obj16 = linkedListTestDriver7.getFirst();
        boolean boolean17 = linkedListTestDriver0.add(obj16);
        java.lang.Class<?> wildcardClass18 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0f + "'", obj15, 100.0f);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) 100 + "'", obj16, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test145");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver1.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj4 = linkedListTestDriver1.getFirst();
        boolean boolean6 = linkedListTestDriver1.add((java.lang.Object) (short) 100);
        boolean boolean8 = linkedListTestDriver1.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean9 = linkedListTestDriver0.add((java.lang.Object) boolean8);
        linkedListTestDriver0.addLast((java.lang.Object) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator13 = linkedListTestDriver0.listIterator((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test146");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = linkedListTestDriver0.set((int) (short) 0, (java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator11 = linkedListTestDriver0.iterator();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver13.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj16 = linkedListTestDriver13.getFirst();
        boolean boolean18 = linkedListTestDriver13.add((java.lang.Object) (short) 100);
        boolean boolean20 = linkedListTestDriver13.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj23 = linkedListTestDriver13.set((int) (short) 0, (java.lang.Object) (byte) 1);
        java.lang.Object[] objArray24 = linkedListTestDriver13.toArray();
        boolean boolean25 = linkedListTestDriver0.contains((java.lang.Object) objArray24);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0f + "'", obj16, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100.0f + "'", obj23, 100.0f);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[1, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[1, 100]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test147");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.clear();
        boolean boolean3 = linkedListTestDriver0.equals_CUT((java.lang.Object) (-1.0d));
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver5.addFirst((java.lang.Object) 100.0f);
        int int8 = linkedListTestDriver5.size();
        boolean boolean10 = linkedListTestDriver5.add((java.lang.Object) (-1.0f));
        linkedListTestDriver5.add(1, (java.lang.Object) 1);
        linkedListTestDriver0.add(0, (java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver15.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj18 = linkedListTestDriver15.getFirst();
        boolean boolean20 = linkedListTestDriver15.add((java.lang.Object) (short) 100);
        java.lang.Object obj21 = linkedListTestDriver15.getFirst();
        boolean boolean22 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver15);
        java.lang.Object obj23 = linkedListTestDriver0.getLast();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0f + "'", obj18, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0f + "'", obj21, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test148");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.clear();
        boolean boolean3 = linkedListTestDriver0.equals_CUT((java.lang.Object) (-1.0d));
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray6 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.addFirst((java.lang.Object) 100.0f);
        int int11 = linkedListTestDriver8.size();
        boolean boolean13 = linkedListTestDriver8.add((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver14.addFirst((java.lang.Object) 100.0f);
        int int17 = linkedListTestDriver14.size();
        linkedListTestDriver14.clear();
        experiment.util.Iterator iterator19 = linkedListTestDriver14.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver20.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj23 = linkedListTestDriver20.getFirst();
        boolean boolean25 = linkedListTestDriver20.add((java.lang.Object) (short) 100);
        boolean boolean27 = linkedListTestDriver20.contains((java.lang.Object) (short) 10);
        linkedListTestDriver14.addLast((java.lang.Object) boolean27);
        boolean boolean29 = linkedListTestDriver14.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver31.clear();
        experiment.util.Iterator iterator33 = linkedListTestDriver31.iterator();
        linkedListTestDriver30.addLast((java.lang.Object) linkedListTestDriver31);
        boolean boolean36 = linkedListTestDriver31.remove((java.lang.Object) 0L);
        boolean boolean37 = linkedListTestDriver14.contains((java.lang.Object) boolean36);
        experiment.util.LinkedListTestDriver linkedListTestDriver38 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver38.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver38.addFirst((java.lang.Object) 100L);
        java.lang.Object obj43 = linkedListTestDriver38.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver45 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver45.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj48 = linkedListTestDriver45.getFirst();
        boolean boolean50 = linkedListTestDriver45.add((java.lang.Object) (short) 100);
        linkedListTestDriver45.addLast((java.lang.Object) 10L);
        boolean boolean54 = linkedListTestDriver45.contains((java.lang.Object) (-1L));
        int int55 = linkedListTestDriver45.size();
        java.lang.Object obj56 = linkedListTestDriver38.set(0, (java.lang.Object) int55);
        boolean boolean57 = linkedListTestDriver14.contains((java.lang.Object) linkedListTestDriver38);
        linkedListTestDriver8.addLast((java.lang.Object) boolean57);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj59 = linkedListTestDriver0.set((int) (short) 100, (java.lang.Object) boolean57);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100.0f + "'", obj23, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + 100.0f + "'", obj43, 100.0f);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 100.0f + "'", obj48, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 3 + "'", int55 == 3);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + 100L + "'", obj56, 100L);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test149");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.addFirst((java.lang.Object) 100.0f);
        int int11 = linkedListTestDriver8.size();
        linkedListTestDriver8.addLast((java.lang.Object) 0.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver14.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj17 = linkedListTestDriver14.getFirst();
        boolean boolean19 = linkedListTestDriver14.add((java.lang.Object) (short) 100);
        boolean boolean21 = linkedListTestDriver14.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean22 = linkedListTestDriver8.equals_CUT((java.lang.Object) linkedListTestDriver14);
        boolean boolean23 = linkedListTestDriver0.add((java.lang.Object) boolean22);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 100.0f + "'", obj17, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test150");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = linkedListTestDriver0.set((int) (short) 0, (java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator11 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver13.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj16 = linkedListTestDriver13.getFirst();
        boolean boolean18 = linkedListTestDriver13.add((java.lang.Object) (short) 100);
        boolean boolean20 = linkedListTestDriver13.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean21 = linkedListTestDriver12.add((java.lang.Object) boolean20);
        linkedListTestDriver12.addLast((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver24.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj27 = linkedListTestDriver24.getFirst();
        boolean boolean29 = linkedListTestDriver24.add((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator30 = linkedListTestDriver24.iterator();
        linkedListTestDriver24.addLast((java.lang.Object) 100L);
        boolean boolean33 = linkedListTestDriver12.add((java.lang.Object) linkedListTestDriver24);
        boolean boolean34 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver12);
        java.lang.Object[] objArray35 = linkedListTestDriver12.toArray();
        linkedListTestDriver12.clear();
        java.lang.Object[] objArray37 = linkedListTestDriver12.toArray();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0f + "'", obj16, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 100.0f + "'", obj27, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[]");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test151");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        int int3 = linkedListTestDriver0.size();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (-1.0f));
        linkedListTestDriver0.add(1, (java.lang.Object) 1);
        java.lang.Object obj9 = linkedListTestDriver0.removeLast();
        java.lang.Class<?> wildcardClass10 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0f) + "'", obj9, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test152");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        int int3 = linkedListTestDriver0.size();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (-1.0f));
        linkedListTestDriver0.add(1, (java.lang.Object) 1);
        java.lang.Object obj9 = linkedListTestDriver0.removeLast();
        boolean boolean10 = linkedListTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0f) + "'", obj9, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test153");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.removeFirst();
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = linkedListTestDriver0.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test154");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver1.clear();
        experiment.util.Iterator iterator3 = linkedListTestDriver1.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver1);
        boolean boolean6 = linkedListTestDriver1.remove((java.lang.Object) 0L);
        boolean boolean7 = linkedListTestDriver1.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.addFirst((java.lang.Object) 100.0f);
        int int11 = linkedListTestDriver8.size();
        linkedListTestDriver8.addFirst((java.lang.Object) 10.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver14.addFirst((java.lang.Object) 100.0f);
        int int17 = linkedListTestDriver14.size();
        boolean boolean19 = linkedListTestDriver14.add((java.lang.Object) (-1.0f));
        linkedListTestDriver14.add(1, (java.lang.Object) 1);
        boolean boolean23 = linkedListTestDriver8.contains((java.lang.Object) 1);
        java.lang.Object obj24 = linkedListTestDriver8.getFirst();
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        boolean boolean26 = linkedListTestDriver1.contains((java.lang.Object) wildcardClass25);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 10.0d + "'", obj24, 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test155");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) 100L);
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver9.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj12 = linkedListTestDriver9.getFirst();
        boolean boolean14 = linkedListTestDriver9.add((java.lang.Object) (short) 100);
        boolean boolean16 = linkedListTestDriver9.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj19 = linkedListTestDriver9.set((int) (short) 0, (java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator20 = linkedListTestDriver9.iterator();
        boolean boolean21 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver9);
        java.lang.Object[] objArray22 = linkedListTestDriver9.toArray();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0f + "'", obj19, 100.0f);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1, 100]");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test156");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj9 = linkedListTestDriver6.getFirst();
        boolean boolean11 = linkedListTestDriver6.add((java.lang.Object) (short) 100);
        boolean boolean13 = linkedListTestDriver6.contains((java.lang.Object) (short) 10);
        linkedListTestDriver0.addLast((java.lang.Object) boolean13);
        boolean boolean15 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver17.clear();
        experiment.util.Iterator iterator19 = linkedListTestDriver17.iterator();
        linkedListTestDriver16.addLast((java.lang.Object) linkedListTestDriver17);
        boolean boolean22 = linkedListTestDriver17.remove((java.lang.Object) 0L);
        boolean boolean23 = linkedListTestDriver0.contains((java.lang.Object) boolean22);
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver24.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver24.addFirst((java.lang.Object) 100L);
        java.lang.Object obj29 = linkedListTestDriver24.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver31.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj34 = linkedListTestDriver31.getFirst();
        boolean boolean36 = linkedListTestDriver31.add((java.lang.Object) (short) 100);
        linkedListTestDriver31.addLast((java.lang.Object) 10L);
        boolean boolean40 = linkedListTestDriver31.contains((java.lang.Object) (-1L));
        int int41 = linkedListTestDriver31.size();
        java.lang.Object obj42 = linkedListTestDriver24.set(0, (java.lang.Object) int41);
        boolean boolean43 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver24);
        java.lang.Object obj44 = linkedListTestDriver24.removeLast();
        boolean boolean46 = linkedListTestDriver24.contains((java.lang.Object) 10.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver47 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver47.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj50 = linkedListTestDriver47.getFirst();
        boolean boolean52 = linkedListTestDriver47.add((java.lang.Object) (short) 100);
        boolean boolean54 = linkedListTestDriver47.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj57 = linkedListTestDriver47.set((int) (short) 0, (java.lang.Object) (byte) 1);
        java.lang.Object obj58 = linkedListTestDriver47.removeFirst();
        boolean boolean59 = linkedListTestDriver24.add((java.lang.Object) linkedListTestDriver47);
        java.lang.Object obj60 = linkedListTestDriver47.getFirst();
        java.lang.Object obj62 = null;
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver47.add(0, obj62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 100.0f + "'", obj29, 100.0f);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 100.0f + "'", obj34, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 100L + "'", obj42, 100L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 100.0f + "'", obj44, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 100.0f + "'", obj50, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + 100.0f + "'", obj57, 100.0f);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + (byte) 1 + "'", obj58, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + (short) 100 + "'", obj60, (short) 100);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test157");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj9 = linkedListTestDriver6.getFirst();
        boolean boolean11 = linkedListTestDriver6.add((java.lang.Object) (short) 100);
        boolean boolean13 = linkedListTestDriver6.contains((java.lang.Object) (short) 10);
        linkedListTestDriver0.addLast((java.lang.Object) boolean13);
        boolean boolean15 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver17.clear();
        experiment.util.Iterator iterator19 = linkedListTestDriver17.iterator();
        linkedListTestDriver16.addLast((java.lang.Object) linkedListTestDriver17);
        boolean boolean22 = linkedListTestDriver17.remove((java.lang.Object) 0L);
        boolean boolean23 = linkedListTestDriver0.contains((java.lang.Object) boolean22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = linkedListTestDriver0.get(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test158");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.addLast((java.lang.Object) 0.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj9 = linkedListTestDriver6.getFirst();
        boolean boolean11 = linkedListTestDriver6.add((java.lang.Object) (short) 100);
        boolean boolean13 = linkedListTestDriver6.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean14 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = linkedListTestDriver0.remove(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test159");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = linkedListTestDriver0.set((int) (short) 0, (java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator11 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver13.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj16 = linkedListTestDriver13.getFirst();
        boolean boolean18 = linkedListTestDriver13.add((java.lang.Object) (short) 100);
        boolean boolean20 = linkedListTestDriver13.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean21 = linkedListTestDriver12.add((java.lang.Object) boolean20);
        linkedListTestDriver12.addLast((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver24.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj27 = linkedListTestDriver24.getFirst();
        boolean boolean29 = linkedListTestDriver24.add((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator30 = linkedListTestDriver24.iterator();
        linkedListTestDriver24.addLast((java.lang.Object) 100L);
        boolean boolean33 = linkedListTestDriver12.add((java.lang.Object) linkedListTestDriver24);
        boolean boolean34 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver12);
        linkedListTestDriver12.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj36 = linkedListTestDriver12.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0f + "'", obj16, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 100.0f + "'", obj27, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test160");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj9 = linkedListTestDriver6.getFirst();
        boolean boolean11 = linkedListTestDriver6.add((java.lang.Object) (short) 100);
        boolean boolean13 = linkedListTestDriver6.contains((java.lang.Object) (short) 10);
        linkedListTestDriver0.addLast((java.lang.Object) boolean13);
        boolean boolean15 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver17.clear();
        experiment.util.Iterator iterator19 = linkedListTestDriver17.iterator();
        linkedListTestDriver16.addLast((java.lang.Object) linkedListTestDriver17);
        boolean boolean22 = linkedListTestDriver17.remove((java.lang.Object) 0L);
        boolean boolean23 = linkedListTestDriver0.contains((java.lang.Object) boolean22);
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver24.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver24.addFirst((java.lang.Object) 100L);
        java.lang.Object obj29 = linkedListTestDriver24.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver31.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj34 = linkedListTestDriver31.getFirst();
        boolean boolean36 = linkedListTestDriver31.add((java.lang.Object) (short) 100);
        linkedListTestDriver31.addLast((java.lang.Object) 10L);
        boolean boolean40 = linkedListTestDriver31.contains((java.lang.Object) (-1L));
        int int41 = linkedListTestDriver31.size();
        java.lang.Object obj42 = linkedListTestDriver24.set(0, (java.lang.Object) int41);
        boolean boolean43 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver24);
        experiment.util.Iterator iterator44 = linkedListTestDriver24.iterator();
        java.lang.Object obj45 = linkedListTestDriver24.getLast();
        experiment.util.Iterator iterator46 = linkedListTestDriver24.iterator();
        java.lang.Class<?> wildcardClass47 = linkedListTestDriver24.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 100.0f + "'", obj29, 100.0f);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 100.0f + "'", obj34, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 100L + "'", obj42, 100L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(iterator44);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + 100.0f + "'", obj45, 100.0f);
        org.junit.Assert.assertNotNull(iterator46);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test161");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj9 = linkedListTestDriver6.getFirst();
        boolean boolean11 = linkedListTestDriver6.add((java.lang.Object) (short) 100);
        boolean boolean13 = linkedListTestDriver6.contains((java.lang.Object) (short) 10);
        linkedListTestDriver0.addLast((java.lang.Object) boolean13);
        boolean boolean15 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver17.clear();
        experiment.util.Iterator iterator19 = linkedListTestDriver17.iterator();
        linkedListTestDriver16.addLast((java.lang.Object) linkedListTestDriver17);
        boolean boolean22 = linkedListTestDriver17.remove((java.lang.Object) 0L);
        boolean boolean23 = linkedListTestDriver0.contains((java.lang.Object) boolean22);
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver24.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver24.addFirst((java.lang.Object) 100L);
        java.lang.Object obj29 = linkedListTestDriver24.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver31.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj34 = linkedListTestDriver31.getFirst();
        boolean boolean36 = linkedListTestDriver31.add((java.lang.Object) (short) 100);
        linkedListTestDriver31.addLast((java.lang.Object) 10L);
        boolean boolean40 = linkedListTestDriver31.contains((java.lang.Object) (-1L));
        int int41 = linkedListTestDriver31.size();
        java.lang.Object obj42 = linkedListTestDriver24.set(0, (java.lang.Object) int41);
        boolean boolean43 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver24);
        java.lang.Object obj44 = linkedListTestDriver24.removeLast();
        boolean boolean46 = linkedListTestDriver24.contains((java.lang.Object) 10.0d);
        boolean boolean47 = linkedListTestDriver24.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver48 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver48.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj51 = linkedListTestDriver48.getFirst();
        boolean boolean53 = linkedListTestDriver48.add((java.lang.Object) (short) 100);
        boolean boolean55 = linkedListTestDriver48.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj58 = linkedListTestDriver48.set((int) (short) 0, (java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator59 = linkedListTestDriver48.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver60 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver61 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver61.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj64 = linkedListTestDriver61.getFirst();
        boolean boolean66 = linkedListTestDriver61.add((java.lang.Object) (short) 100);
        boolean boolean68 = linkedListTestDriver61.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean69 = linkedListTestDriver60.add((java.lang.Object) boolean68);
        linkedListTestDriver60.addLast((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver72 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver72.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj75 = linkedListTestDriver72.getFirst();
        boolean boolean77 = linkedListTestDriver72.add((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator78 = linkedListTestDriver72.iterator();
        linkedListTestDriver72.addLast((java.lang.Object) 100L);
        boolean boolean81 = linkedListTestDriver60.add((java.lang.Object) linkedListTestDriver72);
        boolean boolean82 = linkedListTestDriver48.remove((java.lang.Object) linkedListTestDriver60);
        java.lang.Object obj83 = linkedListTestDriver48.removeFirst();
        boolean boolean84 = linkedListTestDriver24.equals_CUT((java.lang.Object) linkedListTestDriver48);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj86 = linkedListTestDriver24.remove(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 100.0f + "'", obj29, 100.0f);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 100.0f + "'", obj34, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 100L + "'", obj42, 100L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 100.0f + "'", obj44, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + 100.0f + "'", obj51, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + 100.0f + "'", obj58, 100.0f);
        org.junit.Assert.assertNotNull(iterator59);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + 100.0f + "'", obj64, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertEquals("'" + obj75 + "' != '" + 100.0f + "'", obj75, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(iterator78);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertEquals("'" + obj83 + "' != '" + (byte) 1 + "'", obj83, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test162");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        int int3 = linkedListTestDriver0.size();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addFirst((java.lang.Object) 100.0f);
        int int9 = linkedListTestDriver6.size();
        linkedListTestDriver6.clear();
        experiment.util.Iterator iterator11 = linkedListTestDriver6.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj15 = linkedListTestDriver12.getFirst();
        boolean boolean17 = linkedListTestDriver12.add((java.lang.Object) (short) 100);
        boolean boolean19 = linkedListTestDriver12.contains((java.lang.Object) (short) 10);
        linkedListTestDriver6.addLast((java.lang.Object) boolean19);
        boolean boolean21 = linkedListTestDriver6.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver23.clear();
        experiment.util.Iterator iterator25 = linkedListTestDriver23.iterator();
        linkedListTestDriver22.addLast((java.lang.Object) linkedListTestDriver23);
        boolean boolean28 = linkedListTestDriver23.remove((java.lang.Object) 0L);
        boolean boolean29 = linkedListTestDriver6.contains((java.lang.Object) boolean28);
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver30.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver30.addFirst((java.lang.Object) 100L);
        java.lang.Object obj35 = linkedListTestDriver30.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver37.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj40 = linkedListTestDriver37.getFirst();
        boolean boolean42 = linkedListTestDriver37.add((java.lang.Object) (short) 100);
        linkedListTestDriver37.addLast((java.lang.Object) 10L);
        boolean boolean46 = linkedListTestDriver37.contains((java.lang.Object) (-1L));
        int int47 = linkedListTestDriver37.size();
        java.lang.Object obj48 = linkedListTestDriver30.set(0, (java.lang.Object) int47);
        boolean boolean49 = linkedListTestDriver6.contains((java.lang.Object) linkedListTestDriver30);
        linkedListTestDriver0.addLast((java.lang.Object) boolean49);
        int int51 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver52 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver52.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj55 = linkedListTestDriver52.getFirst();
        boolean boolean57 = linkedListTestDriver52.add((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator58 = linkedListTestDriver52.iterator();
        linkedListTestDriver52.addLast((java.lang.Object) 100L);
        linkedListTestDriver0.addFirst((java.lang.Object) 100L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0f + "'", obj15, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 100.0f + "'", obj35, 100.0f);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 100.0f + "'", obj40, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3 + "'", int47 == 3);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 100L + "'", obj48, 100L);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 3 + "'", int51 == 3);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + 100.0f + "'", obj55, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(iterator58);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test163");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver0.addFirst((java.lang.Object) 100L);
        java.lang.Object obj5 = linkedListTestDriver0.removeLast();
        boolean boolean7 = linkedListTestDriver0.remove((java.lang.Object) 1);
        java.lang.Object obj8 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver9.addFirst((java.lang.Object) 100.0f);
        int int12 = linkedListTestDriver9.size();
        boolean boolean14 = linkedListTestDriver9.add((java.lang.Object) (-1.0f));
        linkedListTestDriver9.add(1, (java.lang.Object) 1);
        boolean boolean19 = linkedListTestDriver9.add((java.lang.Object) (short) 1);
        java.lang.Object obj20 = linkedListTestDriver9.getFirst();
        experiment.util.Iterator iterator21 = linkedListTestDriver9.iterator();
        java.lang.Object obj23 = linkedListTestDriver9.get(0);
        boolean boolean24 = linkedListTestDriver0.equals_CUT((java.lang.Object) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = linkedListTestDriver0.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100L + "'", obj8, 100L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0f + "'", obj20, 100.0f);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100.0f + "'", obj23, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test164");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        java.lang.Object obj6 = linkedListTestDriver0.getFirst();
        java.lang.Object[] objArray7 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj11 = linkedListTestDriver8.getFirst();
        boolean boolean13 = linkedListTestDriver8.add((java.lang.Object) (short) 100);
        linkedListTestDriver8.addLast((java.lang.Object) 10L);
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver17.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj20 = linkedListTestDriver17.getFirst();
        boolean boolean22 = linkedListTestDriver17.add((java.lang.Object) (short) 100);
        boolean boolean24 = linkedListTestDriver17.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean25 = linkedListTestDriver16.add((java.lang.Object) boolean24);
        java.lang.Object obj26 = linkedListTestDriver16.getLast();
        java.lang.Object obj27 = linkedListTestDriver16.removeFirst();
        java.lang.Object[] objArray28 = linkedListTestDriver16.toArray();
        experiment.util.ListIterator listIterator30 = linkedListTestDriver16.listIterator(0);
        boolean boolean31 = linkedListTestDriver8.remove((java.lang.Object) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver33 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver33.addFirst((java.lang.Object) 100.0f);
        int int36 = linkedListTestDriver33.size();
        linkedListTestDriver33.addFirst((java.lang.Object) 10.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver39 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver39.clear();
        boolean boolean41 = linkedListTestDriver33.add((java.lang.Object) linkedListTestDriver39);
        java.lang.Object obj42 = linkedListTestDriver33.getFirst();
        boolean boolean43 = linkedListTestDriver32.remove((java.lang.Object) linkedListTestDriver33);
        linkedListTestDriver8.addFirst((java.lang.Object) linkedListTestDriver33);
        experiment.util.LinkedListTestDriver linkedListTestDriver45 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver45.addFirst((java.lang.Object) 100.0f);
        java.lang.Class<?> wildcardClass48 = linkedListTestDriver45.getClass();
        boolean boolean49 = linkedListTestDriver8.equals_CUT((java.lang.Object) wildcardClass48);
        boolean boolean50 = linkedListTestDriver0.remove((java.lang.Object) wildcardClass48);
        linkedListTestDriver0.addLast((java.lang.Object) 1.0d);
        experiment.util.Iterator iterator53 = linkedListTestDriver0.iterator();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0f + "'", obj6, 100.0f);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100.0, 100]");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0f + "'", obj11, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0f + "'", obj20, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + false + "'", obj26, false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + false + "'", obj27, false);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNotNull(listIterator30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 10.0d + "'", obj42, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(iterator53);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test165");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.clear();
        boolean boolean3 = linkedListTestDriver0.equals_CUT((java.lang.Object) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = linkedListTestDriver0.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test166");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = linkedListTestDriver0.set((int) (short) 0, (java.lang.Object) (byte) 1);
        java.lang.Object obj11 = linkedListTestDriver0.removeFirst();
        experiment.util.Iterator iterator12 = linkedListTestDriver0.iterator();
        java.lang.Object obj14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = linkedListTestDriver0.set(0, obj14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test167");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        int int3 = linkedListTestDriver0.size();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addFirst((java.lang.Object) 100.0f);
        int int9 = linkedListTestDriver6.size();
        linkedListTestDriver6.clear();
        experiment.util.Iterator iterator11 = linkedListTestDriver6.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj15 = linkedListTestDriver12.getFirst();
        boolean boolean17 = linkedListTestDriver12.add((java.lang.Object) (short) 100);
        boolean boolean19 = linkedListTestDriver12.contains((java.lang.Object) (short) 10);
        linkedListTestDriver6.addLast((java.lang.Object) boolean19);
        boolean boolean21 = linkedListTestDriver6.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver23.clear();
        experiment.util.Iterator iterator25 = linkedListTestDriver23.iterator();
        linkedListTestDriver22.addLast((java.lang.Object) linkedListTestDriver23);
        boolean boolean28 = linkedListTestDriver23.remove((java.lang.Object) 0L);
        boolean boolean29 = linkedListTestDriver6.contains((java.lang.Object) boolean28);
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver30.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver30.addFirst((java.lang.Object) 100L);
        java.lang.Object obj35 = linkedListTestDriver30.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver37.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj40 = linkedListTestDriver37.getFirst();
        boolean boolean42 = linkedListTestDriver37.add((java.lang.Object) (short) 100);
        linkedListTestDriver37.addLast((java.lang.Object) 10L);
        boolean boolean46 = linkedListTestDriver37.contains((java.lang.Object) (-1L));
        int int47 = linkedListTestDriver37.size();
        java.lang.Object obj48 = linkedListTestDriver30.set(0, (java.lang.Object) int47);
        boolean boolean49 = linkedListTestDriver6.contains((java.lang.Object) linkedListTestDriver30);
        linkedListTestDriver0.addLast((java.lang.Object) boolean49);
        int int51 = linkedListTestDriver0.size();
        java.lang.Class<?> wildcardClass52 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0f + "'", obj15, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 100.0f + "'", obj35, 100.0f);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 100.0f + "'", obj40, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3 + "'", int47 == 3);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 100L + "'", obj48, 100L);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 3 + "'", int51 == 3);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test168");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver1.addFirst((java.lang.Object) 100.0f);
        int int4 = linkedListTestDriver1.size();
        linkedListTestDriver1.addFirst((java.lang.Object) 10.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.clear();
        boolean boolean9 = linkedListTestDriver1.add((java.lang.Object) linkedListTestDriver7);
        java.lang.Object obj10 = linkedListTestDriver1.getFirst();
        boolean boolean11 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver1);
        boolean boolean12 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver14.clear();
        experiment.util.Iterator iterator16 = linkedListTestDriver14.iterator();
        linkedListTestDriver13.addLast((java.lang.Object) linkedListTestDriver14);
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver18.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver18.addFirst((java.lang.Object) 100L);
        java.lang.Object obj23 = linkedListTestDriver18.getFirst();
        boolean boolean25 = linkedListTestDriver18.add((java.lang.Object) 'a');
        experiment.util.LinkedListTestDriver linkedListTestDriver27 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver27.addFirst((java.lang.Object) 100.0f);
        int int30 = linkedListTestDriver27.size();
        java.lang.Object obj31 = linkedListTestDriver27.removeLast();
        java.lang.Object[] objArray32 = linkedListTestDriver27.toArray();
        linkedListTestDriver27.clear();
        java.lang.Object obj34 = linkedListTestDriver18.set((int) (byte) 0, (java.lang.Object) linkedListTestDriver27);
        linkedListTestDriver14.addFirst((java.lang.Object) linkedListTestDriver27);
        int int36 = linkedListTestDriver27.size();
        boolean boolean37 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver27);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 10.0d + "'", obj10, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100L + "'", obj23, 100L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 100.0f + "'", obj31, 100.0f);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 100L + "'", obj34, 100L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test169");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver0.addFirst((java.lang.Object) 100L);
        java.lang.Object obj5 = linkedListTestDriver0.removeLast();
        boolean boolean7 = linkedListTestDriver0.remove((java.lang.Object) 1);
        experiment.util.ListIterator listIterator9 = linkedListTestDriver0.listIterator((int) (short) 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(listIterator9);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test170");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.addLast((java.lang.Object) 0.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj9 = linkedListTestDriver6.getFirst();
        boolean boolean11 = linkedListTestDriver6.add((java.lang.Object) (short) 100);
        boolean boolean13 = linkedListTestDriver6.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean14 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver6);
        java.lang.Object obj15 = linkedListTestDriver6.getFirst();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0f + "'", obj15, 100.0f);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test171");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.addFirst((java.lang.Object) 10.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.clear();
        boolean boolean8 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = linkedListTestDriver6.remove((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test172");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = linkedListTestDriver0.set((int) (short) 0, (java.lang.Object) (byte) 1);
        java.lang.Object[] objArray11 = linkedListTestDriver0.toArray();
        java.lang.Object obj12 = linkedListTestDriver0.getLast();
        java.lang.Object obj13 = linkedListTestDriver0.removeLast();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[1, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[1, 100]");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (short) 100 + "'", obj12, (short) 100);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (short) 100 + "'", obj13, (short) 100);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test173");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        java.lang.Object obj6 = linkedListTestDriver0.removeFirst();
        boolean boolean8 = linkedListTestDriver0.equals_CUT((java.lang.Object) "");
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver9.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj12 = linkedListTestDriver9.getFirst();
        boolean boolean14 = linkedListTestDriver9.add((java.lang.Object) (short) 100);
        boolean boolean16 = linkedListTestDriver9.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj17 = linkedListTestDriver9.removeFirst();
        java.lang.Object obj18 = linkedListTestDriver9.getFirst();
        boolean boolean19 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver9);
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0f + "'", obj6, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 100.0f + "'", obj17, 100.0f);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (short) 100 + "'", obj18, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test174");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        linkedListTestDriver0.addLast((java.lang.Object) 10L);
        boolean boolean9 = linkedListTestDriver0.contains((java.lang.Object) (-1L));
        int int10 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.clear();
        boolean boolean14 = linkedListTestDriver11.equals_CUT((java.lang.Object) (-1.0d));
        boolean boolean16 = linkedListTestDriver11.add((java.lang.Object) (byte) 0);
        java.lang.Object obj18 = linkedListTestDriver11.remove((int) (short) 0);
        boolean boolean19 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver11);
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver21.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver21.addFirst((java.lang.Object) 100L);
        java.lang.Object obj26 = linkedListTestDriver21.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = linkedListTestDriver0.set(10, (java.lang.Object) linkedListTestDriver21);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) 0 + "'", obj18, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0f + "'", obj26, 100.0f);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test175");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.addFirst((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.addFirst((java.lang.Object) 100.0f);
        int int10 = linkedListTestDriver7.size();
        boolean boolean12 = linkedListTestDriver7.add((java.lang.Object) (-1.0f));
        linkedListTestDriver7.add(1, (java.lang.Object) 1);
        boolean boolean17 = linkedListTestDriver7.add((java.lang.Object) (short) 1);
        java.lang.Object obj18 = linkedListTestDriver7.getFirst();
        experiment.util.Iterator iterator19 = linkedListTestDriver7.iterator();
        java.lang.Object obj21 = linkedListTestDriver7.get(0);
        linkedListTestDriver0.addFirst((java.lang.Object) 0);
        int int23 = linkedListTestDriver0.size();
        java.lang.Object[] objArray24 = linkedListTestDriver0.toArray();
        java.lang.Object obj25 = linkedListTestDriver0.removeLast();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0f + "'", obj18, 100.0f);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0f + "'", obj21, 100.0f);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[0, 10.0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[0, 10.0, 100.0]");
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0f + "'", obj25, 100.0f);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test176");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver0.addFirst((java.lang.Object) 100L);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0f + "'", obj6, 100.0f);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test177");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        java.lang.Object obj6 = linkedListTestDriver0.getFirst();
        boolean boolean8 = linkedListTestDriver0.add((java.lang.Object) 100L);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addFirst((java.lang.Object) 100.0f);
        int int13 = linkedListTestDriver10.size();
        boolean boolean15 = linkedListTestDriver10.add((java.lang.Object) (-1.0f));
        linkedListTestDriver10.add(1, (java.lang.Object) 1);
        boolean boolean20 = linkedListTestDriver10.add((java.lang.Object) (short) 1);
        java.lang.Object obj21 = linkedListTestDriver10.removeFirst();
        experiment.util.ListIterator listIterator23 = linkedListTestDriver10.listIterator((int) (short) 0);
        java.lang.Object obj24 = linkedListTestDriver0.set((int) (short) 1, (java.lang.Object) linkedListTestDriver10);
        java.lang.Object obj26 = linkedListTestDriver10.get(0);
        linkedListTestDriver10.clear();
        boolean boolean28 = linkedListTestDriver10.isEmpty();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0f + "'", obj6, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0f + "'", obj21, 100.0f);
        org.junit.Assert.assertNotNull(listIterator23);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (short) 100 + "'", obj24, (short) 100);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 1 + "'", obj26, 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test178");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        java.lang.Object obj6 = linkedListTestDriver0.getFirst();
        boolean boolean8 = linkedListTestDriver0.add((java.lang.Object) 100L);
        java.lang.Object obj9 = linkedListTestDriver0.removeLast();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0f + "'", obj6, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100L + "'", obj9, 100L);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test179");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver0.addFirst((java.lang.Object) 100L);
        java.lang.Object obj5 = linkedListTestDriver0.getFirst();
        boolean boolean7 = linkedListTestDriver0.add((java.lang.Object) 'a');
        java.lang.Object obj8 = linkedListTestDriver0.getFirst();
        boolean boolean10 = linkedListTestDriver0.equals_CUT((java.lang.Object) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = linkedListTestDriver0.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100L + "'", obj5, 100L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100L + "'", obj8, 100L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test180");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver1.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj4 = linkedListTestDriver1.getFirst();
        boolean boolean6 = linkedListTestDriver1.add((java.lang.Object) (short) 100);
        boolean boolean8 = linkedListTestDriver1.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean9 = linkedListTestDriver0.add((java.lang.Object) boolean8);
        linkedListTestDriver0.addLast((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj15 = linkedListTestDriver12.getFirst();
        boolean boolean17 = linkedListTestDriver12.add((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator18 = linkedListTestDriver12.iterator();
        linkedListTestDriver12.addLast((java.lang.Object) 100L);
        boolean boolean21 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver12);
        experiment.util.Iterator iterator22 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver23.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj26 = linkedListTestDriver23.getFirst();
        boolean boolean28 = linkedListTestDriver23.add((java.lang.Object) (short) 100);
        boolean boolean30 = linkedListTestDriver23.contains((java.lang.Object) (short) 10);
        boolean boolean31 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver23);
        experiment.util.LinkedListTestDriver linkedListTestDriver33 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver34.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj37 = linkedListTestDriver34.getFirst();
        boolean boolean39 = linkedListTestDriver34.add((java.lang.Object) (short) 100);
        boolean boolean41 = linkedListTestDriver34.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean42 = linkedListTestDriver33.add((java.lang.Object) boolean41);
        java.lang.Object obj43 = linkedListTestDriver33.getLast();
        java.lang.Object obj44 = linkedListTestDriver33.removeFirst();
        java.lang.Object[] objArray45 = linkedListTestDriver33.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver47 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver47.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj50 = linkedListTestDriver47.getFirst();
        boolean boolean52 = linkedListTestDriver47.add((java.lang.Object) (short) 100);
        boolean boolean54 = linkedListTestDriver47.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj57 = linkedListTestDriver47.set((int) (short) 0, (java.lang.Object) (byte) 1);
        java.lang.Object[] objArray58 = linkedListTestDriver47.toArray();
        linkedListTestDriver33.add(0, (java.lang.Object) linkedListTestDriver47);
        experiment.util.LinkedListTestDriver linkedListTestDriver60 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver60.addFirst((java.lang.Object) 100.0f);
        int int63 = linkedListTestDriver60.size();
        java.lang.Object obj64 = linkedListTestDriver60.removeLast();
        java.lang.Object[] objArray65 = linkedListTestDriver60.toArray();
        boolean boolean66 = linkedListTestDriver47.remove((java.lang.Object) linkedListTestDriver60);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj67 = linkedListTestDriver23.set((int) (short) 100, (java.lang.Object) boolean66);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0f + "'", obj15, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0f + "'", obj26, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 100.0f + "'", obj37, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + false + "'", obj43, false);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + false + "'", obj44, false);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[]");
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 100.0f + "'", obj50, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + 100.0f + "'", obj57, 100.0f);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[1, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[1, 100]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + 100.0f + "'", obj64, 100.0f);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray65), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray65), "[]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test181");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = linkedListTestDriver0.set((int) (short) 0, (java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator11 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj15 = linkedListTestDriver12.getFirst();
        boolean boolean17 = linkedListTestDriver12.add((java.lang.Object) (short) 100);
        boolean boolean19 = linkedListTestDriver12.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj22 = linkedListTestDriver12.set((int) (short) 0, (java.lang.Object) (byte) 1);
        boolean boolean23 = linkedListTestDriver0.add((java.lang.Object) (short) 0);
        boolean boolean25 = linkedListTestDriver0.add((java.lang.Object) 100L);
        java.lang.Object obj26 = linkedListTestDriver0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = linkedListTestDriver0.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0f + "'", obj15, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 100.0f + "'", obj22, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100L + "'", obj26, 100L);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test182");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        java.lang.Object obj6 = linkedListTestDriver0.getFirst();
        boolean boolean8 = linkedListTestDriver0.add((java.lang.Object) 100L);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addFirst((java.lang.Object) 100.0f);
        int int13 = linkedListTestDriver10.size();
        boolean boolean15 = linkedListTestDriver10.add((java.lang.Object) (-1.0f));
        linkedListTestDriver10.add(1, (java.lang.Object) 1);
        boolean boolean20 = linkedListTestDriver10.add((java.lang.Object) (short) 1);
        java.lang.Object obj21 = linkedListTestDriver10.removeFirst();
        experiment.util.ListIterator listIterator23 = linkedListTestDriver10.listIterator((int) (short) 0);
        java.lang.Object obj24 = linkedListTestDriver0.set((int) (short) 1, (java.lang.Object) linkedListTestDriver10);
        java.lang.Object obj25 = linkedListTestDriver0.getFirst();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0f + "'", obj6, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0f + "'", obj21, 100.0f);
        org.junit.Assert.assertNotNull(listIterator23);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (short) 100 + "'", obj24, (short) 100);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0f + "'", obj25, 100.0f);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test183");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.addFirst((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj10 = linkedListTestDriver7.getFirst();
        boolean boolean12 = linkedListTestDriver7.add((java.lang.Object) (short) 100);
        boolean boolean14 = linkedListTestDriver7.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj15 = linkedListTestDriver7.removeFirst();
        java.lang.Object obj16 = linkedListTestDriver7.getFirst();
        boolean boolean17 = linkedListTestDriver0.add(obj16);
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver18.addFirst((java.lang.Object) 100.0f);
        int int21 = linkedListTestDriver18.size();
        linkedListTestDriver18.clear();
        experiment.util.Iterator iterator23 = linkedListTestDriver18.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver24.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj27 = linkedListTestDriver24.getFirst();
        boolean boolean29 = linkedListTestDriver24.add((java.lang.Object) (short) 100);
        boolean boolean31 = linkedListTestDriver24.contains((java.lang.Object) (short) 10);
        linkedListTestDriver18.addLast((java.lang.Object) boolean31);
        boolean boolean33 = linkedListTestDriver18.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver35 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver35.clear();
        experiment.util.Iterator iterator37 = linkedListTestDriver35.iterator();
        linkedListTestDriver34.addLast((java.lang.Object) linkedListTestDriver35);
        boolean boolean40 = linkedListTestDriver35.remove((java.lang.Object) 0L);
        boolean boolean41 = linkedListTestDriver18.contains((java.lang.Object) boolean40);
        experiment.util.LinkedListTestDriver linkedListTestDriver42 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver42.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver42.addFirst((java.lang.Object) 100L);
        java.lang.Object obj47 = linkedListTestDriver42.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver49 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver49.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj52 = linkedListTestDriver49.getFirst();
        boolean boolean54 = linkedListTestDriver49.add((java.lang.Object) (short) 100);
        linkedListTestDriver49.addLast((java.lang.Object) 10L);
        boolean boolean58 = linkedListTestDriver49.contains((java.lang.Object) (-1L));
        int int59 = linkedListTestDriver49.size();
        java.lang.Object obj60 = linkedListTestDriver42.set(0, (java.lang.Object) int59);
        boolean boolean61 = linkedListTestDriver18.contains((java.lang.Object) linkedListTestDriver42);
        experiment.util.Iterator iterator62 = linkedListTestDriver42.iterator();
        java.lang.Object obj63 = linkedListTestDriver42.getLast();
        experiment.util.Iterator iterator64 = linkedListTestDriver42.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0f + "'", obj15, 100.0f);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) 100 + "'", obj16, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 100.0f + "'", obj27, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 100.0f + "'", obj47, 100.0f);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 100.0f + "'", obj52, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 3 + "'", int59 == 3);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + 100L + "'", obj60, 100L);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(iterator62);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + 100.0f + "'", obj63, 100.0f);
        org.junit.Assert.assertNotNull(iterator64);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test184");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        java.lang.Object obj6 = linkedListTestDriver0.getFirst();
        boolean boolean8 = linkedListTestDriver0.add((java.lang.Object) 100L);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addFirst((java.lang.Object) 100.0f);
        int int13 = linkedListTestDriver10.size();
        boolean boolean15 = linkedListTestDriver10.add((java.lang.Object) (-1.0f));
        linkedListTestDriver10.add(1, (java.lang.Object) 1);
        boolean boolean20 = linkedListTestDriver10.add((java.lang.Object) (short) 1);
        java.lang.Object obj21 = linkedListTestDriver10.removeFirst();
        experiment.util.ListIterator listIterator23 = linkedListTestDriver10.listIterator((int) (short) 0);
        java.lang.Object obj24 = linkedListTestDriver0.set((int) (short) 1, (java.lang.Object) linkedListTestDriver10);
        int int25 = linkedListTestDriver0.size();
        boolean boolean26 = linkedListTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0f + "'", obj6, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0f + "'", obj21, 100.0f);
        org.junit.Assert.assertNotNull(listIterator23);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (short) 100 + "'", obj24, (short) 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test185");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.clear();
        boolean boolean3 = linkedListTestDriver0.equals_CUT((java.lang.Object) (-1.0d));
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = linkedListTestDriver0.contains(obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test186");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        linkedListTestDriver0.addLast((java.lang.Object) 10L);
        boolean boolean9 = linkedListTestDriver0.contains((java.lang.Object) (-1L));
        java.lang.Object obj11 = linkedListTestDriver0.get((int) (short) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver12.addFirst((java.lang.Object) 100L);
        java.lang.Object obj17 = linkedListTestDriver12.getFirst();
        boolean boolean19 = linkedListTestDriver12.add((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass20 = linkedListTestDriver12.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver12);
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver23.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj26 = linkedListTestDriver23.getFirst();
        boolean boolean28 = linkedListTestDriver23.add((java.lang.Object) (short) 100);
        boolean boolean30 = linkedListTestDriver23.contains((java.lang.Object) (short) 10);
        int int31 = linkedListTestDriver23.size();
        linkedListTestDriver12.add(0, (java.lang.Object) int31);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) 100 + "'", obj11, (short) 100);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 100L + "'", obj17, 100L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0f + "'", obj26, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test187");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.addFirst((java.lang.Object) 10.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.clear();
        boolean boolean8 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = linkedListTestDriver6.remove((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test188");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj9 = linkedListTestDriver6.getFirst();
        boolean boolean11 = linkedListTestDriver6.add((java.lang.Object) (short) 100);
        boolean boolean13 = linkedListTestDriver6.contains((java.lang.Object) (short) 10);
        linkedListTestDriver0.addLast((java.lang.Object) boolean13);
        boolean boolean15 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver17.clear();
        experiment.util.Iterator iterator19 = linkedListTestDriver17.iterator();
        linkedListTestDriver16.addLast((java.lang.Object) linkedListTestDriver17);
        boolean boolean22 = linkedListTestDriver17.remove((java.lang.Object) 0L);
        boolean boolean23 = linkedListTestDriver0.contains((java.lang.Object) boolean22);
        boolean boolean25 = linkedListTestDriver0.add((java.lang.Object) 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test189");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver0.addFirst((java.lang.Object) 100L);
        int int5 = linkedListTestDriver0.size();
        int int6 = linkedListTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test190");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = linkedListTestDriver0.set((int) (short) 0, (java.lang.Object) (byte) 1);
        java.lang.Object[] objArray11 = linkedListTestDriver0.toArray();
        boolean boolean12 = linkedListTestDriver0.isEmpty();
        java.lang.Object obj13 = linkedListTestDriver0.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver15.addFirst((java.lang.Object) 100.0f);
        int int18 = linkedListTestDriver15.size();
        linkedListTestDriver15.addFirst((java.lang.Object) 10.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver21.clear();
        boolean boolean23 = linkedListTestDriver15.add((java.lang.Object) linkedListTestDriver21);
        java.lang.Object obj24 = linkedListTestDriver15.getFirst();
        boolean boolean25 = linkedListTestDriver14.remove((java.lang.Object) linkedListTestDriver15);
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver15);
        java.lang.Object[] objArray27 = linkedListTestDriver0.toArray();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[1, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (short) 100 + "'", obj13, (short) 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 10.0d + "'", obj24, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objArray27);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test191");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.removeFirst();
        boolean boolean4 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = linkedListTestDriver0.get((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test192");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 100 + "'", obj6, (short) 100);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test193");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.clear();
        boolean boolean3 = linkedListTestDriver0.equals_CUT((java.lang.Object) (-1.0d));
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray6 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj11 = linkedListTestDriver8.getFirst();
        boolean boolean13 = linkedListTestDriver8.add((java.lang.Object) (short) 100);
        boolean boolean15 = linkedListTestDriver8.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean16 = linkedListTestDriver7.add((java.lang.Object) boolean15);
        java.lang.Object obj17 = linkedListTestDriver7.getLast();
        java.lang.Object obj18 = linkedListTestDriver7.removeFirst();
        java.lang.Object[] objArray19 = linkedListTestDriver7.toArray();
        boolean boolean20 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver7);
        java.lang.Class<?> wildcardClass21 = linkedListTestDriver7.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0]");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0f + "'", obj11, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + false + "'", obj17, false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + false + "'", obj18, false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test194");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver0.addFirst((java.lang.Object) 100L);
        java.lang.Object obj5 = linkedListTestDriver0.removeLast();
        boolean boolean7 = linkedListTestDriver0.remove((java.lang.Object) 1);
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test195");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.addFirst((java.lang.Object) 10.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.clear();
        boolean boolean8 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver6);
        java.lang.Object obj9 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj14 = linkedListTestDriver11.getFirst();
        boolean boolean16 = linkedListTestDriver11.add((java.lang.Object) (short) 100);
        boolean boolean18 = linkedListTestDriver11.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean19 = linkedListTestDriver10.add((java.lang.Object) boolean18);
        linkedListTestDriver10.addLast((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver22.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj25 = linkedListTestDriver22.getFirst();
        boolean boolean27 = linkedListTestDriver22.add((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator28 = linkedListTestDriver22.iterator();
        linkedListTestDriver22.addLast((java.lang.Object) 100L);
        boolean boolean31 = linkedListTestDriver10.add((java.lang.Object) linkedListTestDriver22);
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver10);
        java.lang.Object obj33 = linkedListTestDriver10.getFirst();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 10.0d + "'", obj9, 10.0d);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0f + "'", obj14, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0f + "'", obj25, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + false + "'", obj33, false);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test196");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) 100L);
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver9.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj13 = linkedListTestDriver0.removeLast();
        java.lang.Object obj14 = linkedListTestDriver0.getLast();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100L + "'", obj13, 100L);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) 100 + "'", obj14, (short) 100);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test197");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.addFirst((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver7.addFirst((java.lang.Object) 100L);
        java.lang.Object obj12 = linkedListTestDriver7.getFirst();
        boolean boolean14 = linkedListTestDriver7.add((java.lang.Object) 'a');
        linkedListTestDriver0.addFirst((java.lang.Object) boolean14);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver17.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj20 = linkedListTestDriver17.getFirst();
        boolean boolean22 = linkedListTestDriver17.add((java.lang.Object) (short) 100);
        boolean boolean24 = linkedListTestDriver17.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj27 = linkedListTestDriver17.set((int) (short) 0, (java.lang.Object) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = linkedListTestDriver0.set((int) (short) 100, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100L + "'", obj12, 100L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0f + "'", obj20, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 100.0f + "'", obj27, 100.0f);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test198");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver0.addFirst((java.lang.Object) 100L);
        java.lang.Object obj5 = linkedListTestDriver0.removeLast();
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        java.lang.Class<?> wildcardClass7 = iterator6.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test199");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver1.clear();
        experiment.util.Iterator iterator3 = linkedListTestDriver1.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver1);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver5.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver5.addFirst((java.lang.Object) 100L);
        java.lang.Object obj10 = linkedListTestDriver5.getFirst();
        boolean boolean12 = linkedListTestDriver5.add((java.lang.Object) 'a');
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver14.addFirst((java.lang.Object) 100.0f);
        int int17 = linkedListTestDriver14.size();
        java.lang.Object obj18 = linkedListTestDriver14.removeLast();
        java.lang.Object[] objArray19 = linkedListTestDriver14.toArray();
        linkedListTestDriver14.clear();
        java.lang.Object obj21 = linkedListTestDriver5.set((int) (byte) 0, (java.lang.Object) linkedListTestDriver14);
        linkedListTestDriver1.addFirst((java.lang.Object) linkedListTestDriver14);
        java.lang.Object obj23 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = linkedListTestDriver14.remove(obj23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100L + "'", obj10, 100L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0f + "'", obj18, 100.0f);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100L + "'", obj21, 100L);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test200");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.addFirst((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.addFirst((java.lang.Object) 100.0f);
        int int10 = linkedListTestDriver7.size();
        boolean boolean12 = linkedListTestDriver7.add((java.lang.Object) (-1.0f));
        linkedListTestDriver7.add(1, (java.lang.Object) 1);
        boolean boolean17 = linkedListTestDriver7.add((java.lang.Object) (short) 1);
        java.lang.Object obj18 = linkedListTestDriver7.getFirst();
        experiment.util.Iterator iterator19 = linkedListTestDriver7.iterator();
        java.lang.Object obj21 = linkedListTestDriver7.get(0);
        linkedListTestDriver0.addFirst((java.lang.Object) 0);
        java.lang.Object[] objArray23 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver24.clear();
        experiment.util.Iterator iterator26 = linkedListTestDriver24.iterator();
        boolean boolean27 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0f + "'", obj18, 100.0f);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0f + "'", obj21, 100.0f);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[0, 10.0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test201");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.clear();
        boolean boolean3 = linkedListTestDriver0.equals_CUT((java.lang.Object) (-1.0d));
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver5.addFirst((java.lang.Object) 100.0f);
        int int8 = linkedListTestDriver5.size();
        boolean boolean10 = linkedListTestDriver5.add((java.lang.Object) (-1.0f));
        linkedListTestDriver5.add(1, (java.lang.Object) 1);
        linkedListTestDriver0.add(0, (java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver15.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj18 = linkedListTestDriver15.getFirst();
        boolean boolean20 = linkedListTestDriver15.add((java.lang.Object) (short) 100);
        java.lang.Object obj21 = linkedListTestDriver15.getFirst();
        boolean boolean22 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver15);
        int int23 = linkedListTestDriver0.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0f + "'", obj18, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0f + "'", obj21, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test202");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) 100L);
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver9.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj12 = linkedListTestDriver9.getFirst();
        boolean boolean14 = linkedListTestDriver9.add((java.lang.Object) (short) 100);
        boolean boolean16 = linkedListTestDriver9.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj19 = linkedListTestDriver9.set((int) (short) 0, (java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator20 = linkedListTestDriver9.iterator();
        boolean boolean21 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver9);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver22.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj25 = linkedListTestDriver22.removeFirst();
        linkedListTestDriver22.clear();
        linkedListTestDriver22.clear();
        boolean boolean28 = linkedListTestDriver9.remove((java.lang.Object) linkedListTestDriver22);
        int int29 = linkedListTestDriver22.size();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0f + "'", obj19, 100.0f);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0f + "'", obj25, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test203");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        int int3 = linkedListTestDriver0.size();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (-1.0f));
        linkedListTestDriver0.add(1, (java.lang.Object) 1);
        boolean boolean10 = linkedListTestDriver0.add((java.lang.Object) (short) 1);
        java.lang.Object obj11 = linkedListTestDriver0.removeFirst();
        experiment.util.ListIterator listIterator13 = linkedListTestDriver0.listIterator((int) (short) 0);
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = linkedListTestDriver0.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0f + "'", obj11, 100.0f);
        org.junit.Assert.assertNotNull(listIterator13);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test204");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.removeFirst();
        linkedListTestDriver0.clear();
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = linkedListTestDriver0.remove((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test205");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        boolean boolean7 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj11 = linkedListTestDriver8.getFirst();
        boolean boolean13 = linkedListTestDriver8.add((java.lang.Object) (short) 100);
        java.lang.Object obj14 = linkedListTestDriver8.removeFirst();
        boolean boolean16 = linkedListTestDriver8.equals_CUT((java.lang.Object) "");
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver17.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj20 = linkedListTestDriver17.getFirst();
        boolean boolean22 = linkedListTestDriver17.add((java.lang.Object) (short) 100);
        boolean boolean24 = linkedListTestDriver17.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj25 = linkedListTestDriver17.removeFirst();
        java.lang.Object obj26 = linkedListTestDriver17.getFirst();
        boolean boolean27 = linkedListTestDriver8.equals_CUT((java.lang.Object) linkedListTestDriver17);
        linkedListTestDriver8.clear();
        boolean boolean29 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver8);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0f + "'", obj11, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0f + "'", obj14, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0f + "'", obj20, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0f + "'", obj25, 100.0f);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (short) 100 + "'", obj26, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test206");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver1.clear();
        experiment.util.Iterator iterator3 = linkedListTestDriver1.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver1);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver5.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver5.addFirst((java.lang.Object) 100L);
        java.lang.Object obj10 = linkedListTestDriver5.getFirst();
        boolean boolean12 = linkedListTestDriver5.add((java.lang.Object) 'a');
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver14.addFirst((java.lang.Object) 100.0f);
        int int17 = linkedListTestDriver14.size();
        java.lang.Object obj18 = linkedListTestDriver14.removeLast();
        java.lang.Object[] objArray19 = linkedListTestDriver14.toArray();
        linkedListTestDriver14.clear();
        java.lang.Object obj21 = linkedListTestDriver5.set((int) (byte) 0, (java.lang.Object) linkedListTestDriver14);
        linkedListTestDriver1.addFirst((java.lang.Object) linkedListTestDriver14);
        int int23 = linkedListTestDriver14.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = linkedListTestDriver14.getLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100L + "'", obj10, 100L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0f + "'", obj18, 100.0f);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100L + "'", obj21, 100L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test207");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addLast((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = linkedListTestDriver0.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test208");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = linkedListTestDriver0.set((int) (short) 0, (java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator11 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj15 = linkedListTestDriver12.getFirst();
        boolean boolean17 = linkedListTestDriver12.add((java.lang.Object) (short) 100);
        boolean boolean19 = linkedListTestDriver12.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj22 = linkedListTestDriver12.set((int) (short) 0, (java.lang.Object) (byte) 1);
        boolean boolean23 = linkedListTestDriver0.add((java.lang.Object) (short) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver25.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj28 = linkedListTestDriver25.getFirst();
        boolean boolean30 = linkedListTestDriver25.add((java.lang.Object) (short) 100);
        boolean boolean32 = linkedListTestDriver25.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean33 = linkedListTestDriver24.add((java.lang.Object) boolean32);
        boolean boolean35 = linkedListTestDriver24.remove((java.lang.Object) '4');
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver38 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver38.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj41 = linkedListTestDriver38.getFirst();
        boolean boolean43 = linkedListTestDriver38.add((java.lang.Object) (short) 100);
        boolean boolean45 = linkedListTestDriver38.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean46 = linkedListTestDriver37.add((java.lang.Object) boolean45);
        java.lang.Object obj47 = linkedListTestDriver37.getLast();
        java.lang.Object obj48 = linkedListTestDriver37.removeFirst();
        java.lang.Object[] objArray49 = linkedListTestDriver37.toArray();
        linkedListTestDriver24.add(0, (java.lang.Object) linkedListTestDriver37);
        boolean boolean51 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver24);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator53 = linkedListTestDriver0.listIterator((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 97; size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0f + "'", obj15, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 100.0f + "'", obj22, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 100.0f + "'", obj28, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 100.0f + "'", obj41, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + false + "'", obj47, false);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + false + "'", obj48, false);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test209");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.addLast((java.lang.Object) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator7 = linkedListTestDriver0.listIterator((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 97; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test210");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj9 = linkedListTestDriver6.getFirst();
        boolean boolean11 = linkedListTestDriver6.add((java.lang.Object) (short) 100);
        boolean boolean13 = linkedListTestDriver6.contains((java.lang.Object) (short) 10);
        linkedListTestDriver0.addLast((java.lang.Object) boolean13);
        boolean boolean15 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver17.clear();
        experiment.util.Iterator iterator19 = linkedListTestDriver17.iterator();
        linkedListTestDriver16.addLast((java.lang.Object) linkedListTestDriver17);
        boolean boolean22 = linkedListTestDriver17.remove((java.lang.Object) 0L);
        boolean boolean23 = linkedListTestDriver0.contains((java.lang.Object) boolean22);
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver24.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver24.addFirst((java.lang.Object) 100L);
        java.lang.Object obj29 = linkedListTestDriver24.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver31.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj34 = linkedListTestDriver31.getFirst();
        boolean boolean36 = linkedListTestDriver31.add((java.lang.Object) (short) 100);
        linkedListTestDriver31.addLast((java.lang.Object) 10L);
        boolean boolean40 = linkedListTestDriver31.contains((java.lang.Object) (-1L));
        int int41 = linkedListTestDriver31.size();
        java.lang.Object obj42 = linkedListTestDriver24.set(0, (java.lang.Object) int41);
        boolean boolean43 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver24);
        experiment.util.LinkedListTestDriver linkedListTestDriver45 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver46 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver46.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj49 = linkedListTestDriver46.getFirst();
        boolean boolean51 = linkedListTestDriver46.add((java.lang.Object) (short) 100);
        boolean boolean53 = linkedListTestDriver46.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean54 = linkedListTestDriver45.add((java.lang.Object) boolean53);
        linkedListTestDriver45.addLast((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver57 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver57.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj60 = linkedListTestDriver57.getFirst();
        boolean boolean62 = linkedListTestDriver57.add((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator63 = linkedListTestDriver57.iterator();
        linkedListTestDriver57.addLast((java.lang.Object) 100L);
        boolean boolean66 = linkedListTestDriver45.add((java.lang.Object) linkedListTestDriver57);
        linkedListTestDriver24.add((int) (short) 1, (java.lang.Object) linkedListTestDriver45);
        int int68 = linkedListTestDriver45.size();
        experiment.util.Iterator iterator69 = linkedListTestDriver45.iterator();
        linkedListTestDriver45.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj71 = linkedListTestDriver45.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 100.0f + "'", obj29, 100.0f);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 100.0f + "'", obj34, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 100L + "'", obj42, 100L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 100.0f + "'", obj49, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + 100.0f + "'", obj60, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(iterator63);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 3 + "'", int68 == 3);
        org.junit.Assert.assertNotNull(iterator69);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test211");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = linkedListTestDriver0.set((int) (short) 0, (java.lang.Object) (byte) 1);
        java.lang.Object[] objArray11 = linkedListTestDriver0.toArray();
        boolean boolean12 = linkedListTestDriver0.isEmpty();
        java.lang.Object obj13 = linkedListTestDriver0.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver15.addFirst((java.lang.Object) 100.0f);
        int int18 = linkedListTestDriver15.size();
        linkedListTestDriver15.addFirst((java.lang.Object) 10.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver21.clear();
        boolean boolean23 = linkedListTestDriver15.add((java.lang.Object) linkedListTestDriver21);
        java.lang.Object obj24 = linkedListTestDriver15.getFirst();
        boolean boolean25 = linkedListTestDriver14.remove((java.lang.Object) linkedListTestDriver15);
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver15);
        boolean boolean27 = linkedListTestDriver0.isEmpty();
        java.lang.Object obj28 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver29.addFirst((java.lang.Object) 100.0f);
        experiment.util.ListIterator listIterator33 = linkedListTestDriver29.listIterator(1);
        boolean boolean34 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver29);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[1, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (short) 100 + "'", obj13, (short) 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 10.0d + "'", obj24, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (byte) 1 + "'", obj28, (byte) 1);
        org.junit.Assert.assertNotNull(listIterator33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test212");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver0.addFirst((java.lang.Object) 100L);
        java.lang.Object obj5 = linkedListTestDriver0.removeLast();
        boolean boolean7 = linkedListTestDriver0.remove((java.lang.Object) 1);
        java.lang.Object obj8 = linkedListTestDriver0.removeFirst();
        experiment.util.Iterator iterator9 = linkedListTestDriver0.iterator();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100L + "'", obj8, 100L);
        org.junit.Assert.assertNotNull(iterator9);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test213");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) 100L);
        linkedListTestDriver0.addFirst((java.lang.Object) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = linkedListTestDriver0.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test214");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver1.clear();
        experiment.util.Iterator iterator3 = linkedListTestDriver1.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver1);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver5.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver5.addFirst((java.lang.Object) 100L);
        java.lang.Object obj10 = linkedListTestDriver5.getFirst();
        boolean boolean12 = linkedListTestDriver5.add((java.lang.Object) 'a');
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver14.addFirst((java.lang.Object) 100.0f);
        int int17 = linkedListTestDriver14.size();
        java.lang.Object obj18 = linkedListTestDriver14.removeLast();
        java.lang.Object[] objArray19 = linkedListTestDriver14.toArray();
        linkedListTestDriver14.clear();
        java.lang.Object obj21 = linkedListTestDriver5.set((int) (byte) 0, (java.lang.Object) linkedListTestDriver14);
        linkedListTestDriver1.addFirst((java.lang.Object) linkedListTestDriver14);
        java.lang.Object obj23 = linkedListTestDriver1.removeFirst();
        int int24 = linkedListTestDriver1.size();
        experiment.util.Iterator iterator25 = linkedListTestDriver1.iterator();
        experiment.util.Iterator iterator26 = linkedListTestDriver1.iterator();
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100L + "'", obj10, 100L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0f + "'", obj18, 100.0f);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100L + "'", obj21, 100L);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertNotNull(iterator26);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test215");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.removeFirst();
        linkedListTestDriver0.clear();
        java.lang.Object[] objArray5 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver7.addFirst((java.lang.Object) 100L);
        java.lang.Object obj12 = linkedListTestDriver7.getFirst();
        boolean boolean14 = linkedListTestDriver7.add((java.lang.Object) 'a');
        java.lang.Object obj15 = linkedListTestDriver7.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = linkedListTestDriver0.set((int) '4', (java.lang.Object) linkedListTestDriver7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100L + "'", obj12, 100L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100L + "'", obj15, 100L);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test216");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.clear();
        experiment.util.Iterator iterator6 = linkedListTestDriver4.iterator();
        linkedListTestDriver3.addLast((java.lang.Object) linkedListTestDriver4);
        boolean boolean9 = linkedListTestDriver4.remove((java.lang.Object) 0L);
        linkedListTestDriver0.addLast((java.lang.Object) 0L);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test217");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver1.clear();
        experiment.util.Iterator iterator3 = linkedListTestDriver1.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver1);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver5.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver5.addFirst((java.lang.Object) 100L);
        java.lang.Object obj10 = linkedListTestDriver5.getFirst();
        boolean boolean12 = linkedListTestDriver5.add((java.lang.Object) 'a');
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver14.addFirst((java.lang.Object) 100.0f);
        int int17 = linkedListTestDriver14.size();
        java.lang.Object obj18 = linkedListTestDriver14.removeLast();
        java.lang.Object[] objArray19 = linkedListTestDriver14.toArray();
        linkedListTestDriver14.clear();
        java.lang.Object obj21 = linkedListTestDriver5.set((int) (byte) 0, (java.lang.Object) linkedListTestDriver14);
        linkedListTestDriver1.addFirst((java.lang.Object) linkedListTestDriver14);
        java.lang.Object obj23 = linkedListTestDriver1.removeFirst();
        int int24 = linkedListTestDriver1.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver26.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj29 = linkedListTestDriver26.getFirst();
        boolean boolean31 = linkedListTestDriver26.add((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver32.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj35 = linkedListTestDriver32.removeFirst();
        linkedListTestDriver32.clear();
        java.lang.Class<?> wildcardClass37 = linkedListTestDriver32.getClass();
        boolean boolean38 = linkedListTestDriver26.remove((java.lang.Object) linkedListTestDriver32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj39 = linkedListTestDriver1.set(10, (java.lang.Object) linkedListTestDriver26);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100L + "'", obj10, 100L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0f + "'", obj18, 100.0f);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100L + "'", obj21, 100L);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 100.0f + "'", obj29, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 100.0f + "'", obj35, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test218");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver1.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj4 = linkedListTestDriver1.getFirst();
        boolean boolean6 = linkedListTestDriver1.add((java.lang.Object) (short) 100);
        boolean boolean8 = linkedListTestDriver1.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean9 = linkedListTestDriver0.add((java.lang.Object) boolean8);
        java.lang.Object obj10 = linkedListTestDriver0.getLast();
        java.lang.Object obj11 = linkedListTestDriver0.removeFirst();
        java.lang.Object[] objArray12 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver14.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj17 = linkedListTestDriver14.getFirst();
        boolean boolean19 = linkedListTestDriver14.add((java.lang.Object) (short) 100);
        boolean boolean21 = linkedListTestDriver14.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj24 = linkedListTestDriver14.set((int) (short) 0, (java.lang.Object) (byte) 1);
        java.lang.Object[] objArray25 = linkedListTestDriver14.toArray();
        linkedListTestDriver0.add(0, (java.lang.Object) linkedListTestDriver14);
        experiment.util.LinkedListTestDriver linkedListTestDriver27 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver27.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj30 = linkedListTestDriver27.getFirst();
        boolean boolean32 = linkedListTestDriver27.add((java.lang.Object) (short) 100);
        boolean boolean34 = linkedListTestDriver27.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj37 = linkedListTestDriver27.set((int) (short) 0, (java.lang.Object) (byte) 1);
        java.lang.Object obj38 = linkedListTestDriver27.getLast();
        linkedListTestDriver14.addFirst((java.lang.Object) linkedListTestDriver27);
        java.lang.Object obj40 = linkedListTestDriver27.removeFirst();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + false + "'", obj11, false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 100.0f + "'", obj17, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 100.0f + "'", obj24, 100.0f);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[1, 100]");
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 100.0f + "'", obj30, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 100.0f + "'", obj37, 100.0f);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (short) 100 + "'", obj38, (short) 100);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (byte) 1 + "'", obj40, (byte) 1);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test219");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.clear();
        boolean boolean3 = linkedListTestDriver0.equals_CUT((java.lang.Object) (-1.0d));
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver5.addFirst((java.lang.Object) 100.0f);
        int int8 = linkedListTestDriver5.size();
        boolean boolean10 = linkedListTestDriver5.add((java.lang.Object) (-1.0f));
        linkedListTestDriver5.add(1, (java.lang.Object) 1);
        linkedListTestDriver0.add(0, (java.lang.Object) linkedListTestDriver5);
        java.lang.Object[] objArray15 = linkedListTestDriver0.toArray();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test220");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj9 = linkedListTestDriver6.getFirst();
        boolean boolean11 = linkedListTestDriver6.add((java.lang.Object) (short) 100);
        boolean boolean13 = linkedListTestDriver6.contains((java.lang.Object) (short) 10);
        linkedListTestDriver0.addLast((java.lang.Object) boolean13);
        boolean boolean15 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver17.clear();
        experiment.util.Iterator iterator19 = linkedListTestDriver17.iterator();
        linkedListTestDriver16.addLast((java.lang.Object) linkedListTestDriver17);
        boolean boolean22 = linkedListTestDriver17.remove((java.lang.Object) 0L);
        boolean boolean23 = linkedListTestDriver0.contains((java.lang.Object) boolean22);
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver24.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver24.addFirst((java.lang.Object) 100L);
        java.lang.Object obj29 = linkedListTestDriver24.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver31.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj34 = linkedListTestDriver31.getFirst();
        boolean boolean36 = linkedListTestDriver31.add((java.lang.Object) (short) 100);
        linkedListTestDriver31.addLast((java.lang.Object) 10L);
        boolean boolean40 = linkedListTestDriver31.contains((java.lang.Object) (-1L));
        int int41 = linkedListTestDriver31.size();
        java.lang.Object obj42 = linkedListTestDriver24.set(0, (java.lang.Object) int41);
        boolean boolean43 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver24);
        experiment.util.Iterator iterator44 = linkedListTestDriver24.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver45 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver45.clear();
        boolean boolean48 = linkedListTestDriver45.equals_CUT((java.lang.Object) (-1.0d));
        experiment.util.LinkedListTestDriver linkedListTestDriver50 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver50.addFirst((java.lang.Object) 100.0f);
        int int53 = linkedListTestDriver50.size();
        boolean boolean55 = linkedListTestDriver50.add((java.lang.Object) (-1.0f));
        linkedListTestDriver50.add(1, (java.lang.Object) 1);
        linkedListTestDriver45.add(0, (java.lang.Object) linkedListTestDriver50);
        boolean boolean60 = linkedListTestDriver24.remove((java.lang.Object) linkedListTestDriver50);
        java.lang.Object obj61 = linkedListTestDriver50.removeLast();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 100.0f + "'", obj29, 100.0f);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 100.0f + "'", obj34, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 100L + "'", obj42, 100L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(iterator44);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + (-1.0f) + "'", obj61, (-1.0f));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test221");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver1.clear();
        experiment.util.Iterator iterator3 = linkedListTestDriver1.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver1);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver5.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver5.addFirst((java.lang.Object) 100L);
        java.lang.Object obj10 = linkedListTestDriver5.getFirst();
        boolean boolean12 = linkedListTestDriver5.add((java.lang.Object) 'a');
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver14.addFirst((java.lang.Object) 100.0f);
        int int17 = linkedListTestDriver14.size();
        java.lang.Object obj18 = linkedListTestDriver14.removeLast();
        java.lang.Object[] objArray19 = linkedListTestDriver14.toArray();
        linkedListTestDriver14.clear();
        java.lang.Object obj21 = linkedListTestDriver5.set((int) (byte) 0, (java.lang.Object) linkedListTestDriver14);
        linkedListTestDriver1.addFirst((java.lang.Object) linkedListTestDriver14);
        java.lang.Object obj23 = linkedListTestDriver1.removeFirst();
        int int24 = linkedListTestDriver1.size();
        java.lang.Object[] objArray25 = linkedListTestDriver1.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver27 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver27.addLast((java.lang.Object) (byte) -1);
        java.lang.Object obj30 = linkedListTestDriver27.getFirst();
        boolean boolean31 = linkedListTestDriver27.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver1.add(3, (java.lang.Object) boolean31);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 3; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100L + "'", obj10, 100L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0f + "'", obj18, 100.0f);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100L + "'", obj21, 100L);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (byte) -1 + "'", obj30, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test222");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = linkedListTestDriver0.set((int) (short) 0, (java.lang.Object) (byte) 1);
        java.lang.Object[] objArray11 = linkedListTestDriver0.toArray();
        boolean boolean12 = linkedListTestDriver0.isEmpty();
        java.lang.Object obj13 = linkedListTestDriver0.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver15.addFirst((java.lang.Object) 100.0f);
        int int18 = linkedListTestDriver15.size();
        linkedListTestDriver15.addFirst((java.lang.Object) 10.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver21.clear();
        boolean boolean23 = linkedListTestDriver15.add((java.lang.Object) linkedListTestDriver21);
        java.lang.Object obj24 = linkedListTestDriver15.getFirst();
        boolean boolean25 = linkedListTestDriver14.remove((java.lang.Object) linkedListTestDriver15);
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver15);
        boolean boolean27 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = linkedListTestDriver0.remove(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[1, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (short) 100 + "'", obj13, (short) 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 10.0d + "'", obj24, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test223");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.addFirst((java.lang.Object) 10.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.clear();
        boolean boolean8 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver6);
        java.lang.Object obj9 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj14 = linkedListTestDriver11.getFirst();
        boolean boolean16 = linkedListTestDriver11.add((java.lang.Object) (short) 100);
        boolean boolean18 = linkedListTestDriver11.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean19 = linkedListTestDriver10.add((java.lang.Object) boolean18);
        linkedListTestDriver10.addLast((java.lang.Object) (-1.0f));
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver22.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj25 = linkedListTestDriver22.getFirst();
        boolean boolean27 = linkedListTestDriver22.add((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator28 = linkedListTestDriver22.iterator();
        linkedListTestDriver22.addLast((java.lang.Object) 100L);
        boolean boolean31 = linkedListTestDriver10.add((java.lang.Object) linkedListTestDriver22);
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver10);
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator35 = linkedListTestDriver0.listIterator(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 2; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 10.0d + "'", obj9, 10.0d);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0f + "'", obj14, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0f + "'", obj25, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test224");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = linkedListTestDriver0.removeFirst();
        java.lang.Object obj9 = linkedListTestDriver0.getFirst();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator11 = linkedListTestDriver0.listIterator((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0f + "'", obj8, 100.0f);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) 100 + "'", obj9, (short) 100);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test225");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.clear();
        boolean boolean3 = linkedListTestDriver0.equals_CUT((java.lang.Object) (-1.0d));
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver5.addFirst((java.lang.Object) 100.0f);
        int int8 = linkedListTestDriver5.size();
        boolean boolean10 = linkedListTestDriver5.add((java.lang.Object) (-1.0f));
        linkedListTestDriver5.add(1, (java.lang.Object) 1);
        linkedListTestDriver0.add(0, (java.lang.Object) linkedListTestDriver5);
        linkedListTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test226");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = linkedListTestDriver0.set((int) (short) 0, (java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator11 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj15 = linkedListTestDriver12.getFirst();
        boolean boolean17 = linkedListTestDriver12.add((java.lang.Object) (short) 100);
        boolean boolean19 = linkedListTestDriver12.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj22 = linkedListTestDriver12.set((int) (short) 0, (java.lang.Object) (byte) 1);
        boolean boolean23 = linkedListTestDriver0.add((java.lang.Object) (short) 0);
        boolean boolean25 = linkedListTestDriver0.add((java.lang.Object) 100L);
        java.lang.Object obj26 = linkedListTestDriver0.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver27 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver27.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj30 = linkedListTestDriver27.getFirst();
        boolean boolean32 = linkedListTestDriver27.add((java.lang.Object) (short) 100);
        boolean boolean34 = linkedListTestDriver27.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj37 = linkedListTestDriver27.set((int) (short) 0, (java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator38 = linkedListTestDriver27.iterator();
        java.lang.Object obj40 = linkedListTestDriver27.remove((int) (short) 1);
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver27);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0f + "'", obj15, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 100.0f + "'", obj22, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100L + "'", obj26, 100L);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 100.0f + "'", obj30, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 100.0f + "'", obj37, 100.0f);
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (short) 100 + "'", obj40, (short) 100);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test227");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) 100L);
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver9.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj12 = linkedListTestDriver9.getFirst();
        boolean boolean14 = linkedListTestDriver9.add((java.lang.Object) (short) 100);
        boolean boolean16 = linkedListTestDriver9.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj19 = linkedListTestDriver9.set((int) (short) 0, (java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator20 = linkedListTestDriver9.iterator();
        boolean boolean21 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver9);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver22.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj25 = linkedListTestDriver22.removeFirst();
        linkedListTestDriver22.clear();
        linkedListTestDriver22.clear();
        boolean boolean28 = linkedListTestDriver9.remove((java.lang.Object) linkedListTestDriver22);
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver29.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj32 = linkedListTestDriver29.removeFirst();
        linkedListTestDriver29.clear();
        linkedListTestDriver29.clear();
        boolean boolean35 = linkedListTestDriver22.add((java.lang.Object) linkedListTestDriver29);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0f + "'", obj19, 100.0f);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0f + "'", obj25, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 100.0f + "'", obj32, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test228");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = linkedListTestDriver0.set((int) (short) 0, (java.lang.Object) (byte) 1);
        java.lang.Object[] objArray11 = linkedListTestDriver0.toArray();
        int int12 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver14.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj17 = linkedListTestDriver14.getFirst();
        boolean boolean19 = linkedListTestDriver14.add((java.lang.Object) (short) 100);
        boolean boolean21 = linkedListTestDriver14.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj24 = linkedListTestDriver14.set((int) (short) 0, (java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator25 = linkedListTestDriver14.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver26.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj29 = linkedListTestDriver26.getFirst();
        boolean boolean31 = linkedListTestDriver26.add((java.lang.Object) (short) 100);
        boolean boolean33 = linkedListTestDriver26.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj36 = linkedListTestDriver26.set((int) (short) 0, (java.lang.Object) (byte) 1);
        boolean boolean37 = linkedListTestDriver14.add((java.lang.Object) (short) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver38 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver39 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver39.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj42 = linkedListTestDriver39.getFirst();
        boolean boolean44 = linkedListTestDriver39.add((java.lang.Object) (short) 100);
        boolean boolean46 = linkedListTestDriver39.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean47 = linkedListTestDriver38.add((java.lang.Object) boolean46);
        boolean boolean49 = linkedListTestDriver38.remove((java.lang.Object) '4');
        experiment.util.LinkedListTestDriver linkedListTestDriver51 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver52 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver52.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj55 = linkedListTestDriver52.getFirst();
        boolean boolean57 = linkedListTestDriver52.add((java.lang.Object) (short) 100);
        boolean boolean59 = linkedListTestDriver52.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean60 = linkedListTestDriver51.add((java.lang.Object) boolean59);
        java.lang.Object obj61 = linkedListTestDriver51.getLast();
        java.lang.Object obj62 = linkedListTestDriver51.removeFirst();
        java.lang.Object[] objArray63 = linkedListTestDriver51.toArray();
        linkedListTestDriver38.add(0, (java.lang.Object) linkedListTestDriver51);
        boolean boolean65 = linkedListTestDriver14.contains((java.lang.Object) linkedListTestDriver38);
        boolean boolean66 = linkedListTestDriver14.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj67 = linkedListTestDriver0.set((int) 'a', (java.lang.Object) boolean66);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[1, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[1, 100]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 100.0f + "'", obj17, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 100.0f + "'", obj24, 100.0f);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 100.0f + "'", obj29, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 100.0f + "'", obj36, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 100.0f + "'", obj42, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + 100.0f + "'", obj55, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + false + "'", obj61, false);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + false + "'", obj62, false);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test229");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.clear();
        boolean boolean3 = linkedListTestDriver0.equals_CUT((java.lang.Object) (-1.0d));
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = linkedListTestDriver0.get((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test230");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = linkedListTestDriver0.set((int) (short) 0, (java.lang.Object) (byte) 1);
        java.lang.Object obj11 = linkedListTestDriver0.removeFirst();
        experiment.util.Iterator iterator12 = linkedListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = linkedListTestDriver0.get(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test231");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        java.lang.Object obj6 = linkedListTestDriver0.getFirst();
        java.lang.Object[] objArray7 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj11 = linkedListTestDriver8.getFirst();
        boolean boolean13 = linkedListTestDriver8.add((java.lang.Object) (short) 100);
        linkedListTestDriver8.addLast((java.lang.Object) 10L);
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver17.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj20 = linkedListTestDriver17.getFirst();
        boolean boolean22 = linkedListTestDriver17.add((java.lang.Object) (short) 100);
        boolean boolean24 = linkedListTestDriver17.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean25 = linkedListTestDriver16.add((java.lang.Object) boolean24);
        java.lang.Object obj26 = linkedListTestDriver16.getLast();
        java.lang.Object obj27 = linkedListTestDriver16.removeFirst();
        java.lang.Object[] objArray28 = linkedListTestDriver16.toArray();
        experiment.util.ListIterator listIterator30 = linkedListTestDriver16.listIterator(0);
        boolean boolean31 = linkedListTestDriver8.remove((java.lang.Object) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver33 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver33.addFirst((java.lang.Object) 100.0f);
        int int36 = linkedListTestDriver33.size();
        linkedListTestDriver33.addFirst((java.lang.Object) 10.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver39 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver39.clear();
        boolean boolean41 = linkedListTestDriver33.add((java.lang.Object) linkedListTestDriver39);
        java.lang.Object obj42 = linkedListTestDriver33.getFirst();
        boolean boolean43 = linkedListTestDriver32.remove((java.lang.Object) linkedListTestDriver33);
        linkedListTestDriver8.addFirst((java.lang.Object) linkedListTestDriver33);
        experiment.util.LinkedListTestDriver linkedListTestDriver45 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver45.addFirst((java.lang.Object) 100.0f);
        java.lang.Class<?> wildcardClass48 = linkedListTestDriver45.getClass();
        boolean boolean49 = linkedListTestDriver8.equals_CUT((java.lang.Object) wildcardClass48);
        boolean boolean50 = linkedListTestDriver0.remove((java.lang.Object) wildcardClass48);
        linkedListTestDriver0.addLast((java.lang.Object) 1.0d);
        java.lang.Object obj54 = linkedListTestDriver0.remove(2);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0f + "'", obj6, 100.0f);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100.0, 100]");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0f + "'", obj11, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0f + "'", obj20, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + false + "'", obj26, false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + false + "'", obj27, false);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNotNull(listIterator30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 10.0d + "'", obj42, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + 1.0d + "'", obj54, 1.0d);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test232");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver0.addFirst((java.lang.Object) 100L);
        java.lang.Object obj5 = linkedListTestDriver0.getFirst();
        boolean boolean7 = linkedListTestDriver0.add((java.lang.Object) 'a');
        java.lang.Object obj8 = linkedListTestDriver0.getFirst();
        boolean boolean10 = linkedListTestDriver0.equals_CUT((java.lang.Object) (short) -1);
        java.lang.Object obj12 = linkedListTestDriver0.get(0);
        java.lang.Object obj13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = linkedListTestDriver0.equals_CUT(obj13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100L + "'", obj5, 100L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100L + "'", obj8, 100L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100L + "'", obj12, 100L);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test233");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.addFirst((java.lang.Object) 10.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addFirst((java.lang.Object) 100.0f);
        int int9 = linkedListTestDriver6.size();
        boolean boolean11 = linkedListTestDriver6.add((java.lang.Object) (-1.0f));
        linkedListTestDriver6.add(1, (java.lang.Object) 1);
        boolean boolean15 = linkedListTestDriver0.contains((java.lang.Object) 1);
        java.lang.Object obj16 = linkedListTestDriver0.getFirst();
        java.lang.Object obj17 = linkedListTestDriver0.removeLast();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 10.0d + "'", obj16, 10.0d);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 100.0f + "'", obj17, 100.0f);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test234");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver0.addFirst((java.lang.Object) 100L);
        java.lang.Object obj5 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj10 = linkedListTestDriver7.getFirst();
        boolean boolean12 = linkedListTestDriver7.add((java.lang.Object) (short) 100);
        linkedListTestDriver7.addLast((java.lang.Object) 10L);
        boolean boolean16 = linkedListTestDriver7.contains((java.lang.Object) (-1L));
        int int17 = linkedListTestDriver7.size();
        java.lang.Object obj18 = linkedListTestDriver0.set(0, (java.lang.Object) int17);
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver19.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj22 = linkedListTestDriver19.getFirst();
        java.lang.Class<?> wildcardClass23 = linkedListTestDriver19.getClass();
        boolean boolean24 = linkedListTestDriver0.contains((java.lang.Object) wildcardClass23);
        java.lang.Object obj25 = linkedListTestDriver0.getFirst();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100L + "'", obj18, 100L);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 100.0f + "'", obj22, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 3 + "'", obj25, 3);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test235");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver1.clear();
        experiment.util.Iterator iterator3 = linkedListTestDriver1.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver1);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver5.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver5.addFirst((java.lang.Object) 100L);
        java.lang.Object obj10 = linkedListTestDriver5.getFirst();
        boolean boolean12 = linkedListTestDriver5.add((java.lang.Object) 'a');
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver14.addFirst((java.lang.Object) 100.0f);
        int int17 = linkedListTestDriver14.size();
        java.lang.Object obj18 = linkedListTestDriver14.removeLast();
        java.lang.Object[] objArray19 = linkedListTestDriver14.toArray();
        linkedListTestDriver14.clear();
        java.lang.Object obj21 = linkedListTestDriver5.set((int) (byte) 0, (java.lang.Object) linkedListTestDriver14);
        linkedListTestDriver1.addFirst((java.lang.Object) linkedListTestDriver14);
        int int23 = linkedListTestDriver14.size();
        java.lang.Class<?> wildcardClass24 = linkedListTestDriver14.getClass();
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100L + "'", obj10, 100L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0f + "'", obj18, 100.0f);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100L + "'", obj21, 100L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test236");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) 100L);
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver9.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj12 = linkedListTestDriver9.getFirst();
        boolean boolean14 = linkedListTestDriver9.add((java.lang.Object) (short) 100);
        boolean boolean16 = linkedListTestDriver9.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj19 = linkedListTestDriver9.set((int) (short) 0, (java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator20 = linkedListTestDriver9.iterator();
        boolean boolean21 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver9);
        linkedListTestDriver9.clear();
        linkedListTestDriver9.clear();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0f + "'", obj19, 100.0f);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test237");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) 100L);
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver9.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj13 = linkedListTestDriver0.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver15.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj18 = linkedListTestDriver15.getFirst();
        boolean boolean20 = linkedListTestDriver15.add((java.lang.Object) (short) 100);
        boolean boolean22 = linkedListTestDriver15.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean23 = linkedListTestDriver14.add((java.lang.Object) boolean22);
        java.lang.Object obj24 = linkedListTestDriver14.getLast();
        java.lang.Object obj25 = linkedListTestDriver14.removeFirst();
        boolean boolean27 = linkedListTestDriver14.contains((java.lang.Object) 10L);
        boolean boolean28 = linkedListTestDriver0.equals_CUT((java.lang.Object) boolean27);
        linkedListTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100L + "'", obj13, 100L);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0f + "'", obj18, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + false + "'", obj24, false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + false + "'", obj25, false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test238");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.addFirst((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj10 = linkedListTestDriver7.getFirst();
        boolean boolean12 = linkedListTestDriver7.add((java.lang.Object) (short) 100);
        boolean boolean14 = linkedListTestDriver7.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj15 = linkedListTestDriver7.removeFirst();
        java.lang.Object obj16 = linkedListTestDriver7.getFirst();
        boolean boolean17 = linkedListTestDriver0.add(obj16);
        experiment.util.ListIterator listIterator19 = linkedListTestDriver0.listIterator(3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0f + "'", obj15, 100.0f);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) 100 + "'", obj16, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(listIterator19);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test239");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        java.lang.Object obj6 = linkedListTestDriver0.getFirst();
        boolean boolean8 = linkedListTestDriver0.add((java.lang.Object) 100L);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addFirst((java.lang.Object) 100.0f);
        int int13 = linkedListTestDriver10.size();
        boolean boolean15 = linkedListTestDriver10.add((java.lang.Object) (-1.0f));
        linkedListTestDriver10.add(1, (java.lang.Object) 1);
        boolean boolean20 = linkedListTestDriver10.add((java.lang.Object) (short) 1);
        java.lang.Object obj21 = linkedListTestDriver10.removeFirst();
        experiment.util.ListIterator listIterator23 = linkedListTestDriver10.listIterator((int) (short) 0);
        java.lang.Object obj24 = linkedListTestDriver0.set((int) (short) 1, (java.lang.Object) linkedListTestDriver10);
        java.lang.Object obj26 = linkedListTestDriver10.get(0);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator28 = linkedListTestDriver10.listIterator((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0f + "'", obj6, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0f + "'", obj21, 100.0f);
        org.junit.Assert.assertNotNull(listIterator23);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (short) 100 + "'", obj24, (short) 100);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 1 + "'", obj26, 1);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test240");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.addFirst(obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test241");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver1.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj4 = linkedListTestDriver1.getFirst();
        boolean boolean6 = linkedListTestDriver1.add((java.lang.Object) (short) 100);
        boolean boolean8 = linkedListTestDriver1.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean9 = linkedListTestDriver0.add((java.lang.Object) boolean8);
        java.lang.Object obj10 = linkedListTestDriver0.getLast();
        java.lang.Object obj11 = linkedListTestDriver0.removeFirst();
        java.lang.Object[] objArray12 = linkedListTestDriver0.toArray();
        experiment.util.ListIterator listIterator14 = linkedListTestDriver0.listIterator(0);
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver15.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver15.addFirst((java.lang.Object) 100L);
        java.lang.Object obj20 = linkedListTestDriver15.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver22.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj25 = linkedListTestDriver22.getFirst();
        boolean boolean27 = linkedListTestDriver22.add((java.lang.Object) (short) 100);
        linkedListTestDriver22.addLast((java.lang.Object) 10L);
        boolean boolean31 = linkedListTestDriver22.contains((java.lang.Object) (-1L));
        int int32 = linkedListTestDriver22.size();
        java.lang.Object obj33 = linkedListTestDriver15.set(0, (java.lang.Object) int32);
        linkedListTestDriver0.addLast(obj33);
        experiment.util.LinkedListTestDriver linkedListTestDriver35 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver35.addFirst((java.lang.Object) 100.0f);
        int int38 = linkedListTestDriver35.size();
        boolean boolean40 = linkedListTestDriver35.add((java.lang.Object) (-1.0f));
        boolean boolean41 = linkedListTestDriver0.remove((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator42 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver43 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver43.addFirst((java.lang.Object) 100.0f);
        int int46 = linkedListTestDriver43.size();
        linkedListTestDriver43.clear();
        experiment.util.Iterator iterator48 = linkedListTestDriver43.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver49 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver49.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj52 = linkedListTestDriver49.getFirst();
        boolean boolean54 = linkedListTestDriver49.add((java.lang.Object) (short) 100);
        boolean boolean56 = linkedListTestDriver49.contains((java.lang.Object) (short) 10);
        linkedListTestDriver43.addLast((java.lang.Object) boolean56);
        boolean boolean58 = linkedListTestDriver43.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver59 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver60 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver60.clear();
        experiment.util.Iterator iterator62 = linkedListTestDriver60.iterator();
        linkedListTestDriver59.addLast((java.lang.Object) linkedListTestDriver60);
        boolean boolean65 = linkedListTestDriver60.remove((java.lang.Object) 0L);
        boolean boolean66 = linkedListTestDriver43.contains((java.lang.Object) boolean65);
        experiment.util.LinkedListTestDriver linkedListTestDriver67 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver67.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver67.addFirst((java.lang.Object) 100L);
        java.lang.Object obj72 = linkedListTestDriver67.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver74 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver74.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj77 = linkedListTestDriver74.getFirst();
        boolean boolean79 = linkedListTestDriver74.add((java.lang.Object) (short) 100);
        linkedListTestDriver74.addLast((java.lang.Object) 10L);
        boolean boolean83 = linkedListTestDriver74.contains((java.lang.Object) (-1L));
        int int84 = linkedListTestDriver74.size();
        java.lang.Object obj85 = linkedListTestDriver67.set(0, (java.lang.Object) int84);
        boolean boolean86 = linkedListTestDriver43.contains((java.lang.Object) linkedListTestDriver67);
        experiment.util.Iterator iterator87 = linkedListTestDriver67.iterator();
        boolean boolean88 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver67);
        int int89 = linkedListTestDriver67.size();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + false + "'", obj11, false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(listIterator14);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0f + "'", obj20, 100.0f);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0f + "'", obj25, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 100L + "'", obj33, 100L);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(iterator42);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(iterator48);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 100.0f + "'", obj52, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(iterator62);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertEquals("'" + obj72 + "' != '" + 100.0f + "'", obj72, 100.0f);
        org.junit.Assert.assertEquals("'" + obj77 + "' != '" + 100.0f + "'", obj77, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 3 + "'", int84 == 3);
        org.junit.Assert.assertEquals("'" + obj85 + "' != '" + 100L + "'", obj85, 100L);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(iterator87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 2 + "'", int89 == 2);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test242");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        boolean boolean7 = linkedListTestDriver0.contains((java.lang.Object) (short) 10);
        int int8 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver9.addFirst((java.lang.Object) 100.0f);
        int int12 = linkedListTestDriver9.size();
        boolean boolean14 = linkedListTestDriver9.add((java.lang.Object) (-1.0f));
        linkedListTestDriver9.add(1, (java.lang.Object) 1);
        boolean boolean19 = linkedListTestDriver9.add((java.lang.Object) (short) 1);
        java.lang.Object obj20 = linkedListTestDriver9.removeFirst();
        experiment.util.ListIterator listIterator22 = linkedListTestDriver9.listIterator((int) (short) 0);
        boolean boolean23 = linkedListTestDriver0.contains((java.lang.Object) (short) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver24.addFirst((java.lang.Object) 100.0f);
        int int27 = linkedListTestDriver24.size();
        linkedListTestDriver24.addFirst((java.lang.Object) 10.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver30.addFirst((java.lang.Object) 100.0f);
        int int33 = linkedListTestDriver30.size();
        boolean boolean35 = linkedListTestDriver30.add((java.lang.Object) (-1.0f));
        linkedListTestDriver30.add(1, (java.lang.Object) 1);
        boolean boolean39 = linkedListTestDriver24.contains((java.lang.Object) 1);
        java.lang.Object obj40 = linkedListTestDriver24.getFirst();
        java.lang.Class<?> wildcardClass41 = obj40.getClass();
        boolean boolean42 = linkedListTestDriver0.equals_CUT((java.lang.Object) wildcardClass41);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0f + "'", obj20, 100.0f);
        org.junit.Assert.assertNotNull(listIterator22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 10.0d + "'", obj40, 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test243");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.clear();
        boolean boolean3 = linkedListTestDriver0.equals_CUT((java.lang.Object) (-1.0d));
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (byte) 0);
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj10 = linkedListTestDriver7.getFirst();
        boolean boolean12 = linkedListTestDriver7.add((java.lang.Object) (short) 100);
        linkedListTestDriver7.addLast((java.lang.Object) 10L);
        boolean boolean16 = linkedListTestDriver7.contains((java.lang.Object) (-1L));
        int int17 = linkedListTestDriver7.size();
        boolean boolean18 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver7);
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver19.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj22 = linkedListTestDriver19.getFirst();
        boolean boolean24 = linkedListTestDriver19.add((java.lang.Object) (short) 100);
        linkedListTestDriver19.addLast((java.lang.Object) 10L);
        boolean boolean28 = linkedListTestDriver19.contains((java.lang.Object) (-1L));
        int int29 = linkedListTestDriver19.size();
        boolean boolean30 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver19);
        java.lang.Object obj31 = linkedListTestDriver19.getLast();
        java.lang.Object obj32 = linkedListTestDriver19.getFirst();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 100.0f + "'", obj22, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 10L + "'", obj31, 10L);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 100.0f + "'", obj32, 100.0f);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test244");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver0.addFirst((java.lang.Object) 100L);
        java.lang.Object obj5 = linkedListTestDriver0.getFirst();
        boolean boolean7 = linkedListTestDriver0.add((java.lang.Object) 'a');
        java.lang.Object obj8 = linkedListTestDriver0.getFirst();
        boolean boolean10 = linkedListTestDriver0.equals_CUT((java.lang.Object) (short) -1);
        java.lang.Object obj11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = linkedListTestDriver0.equals_CUT(obj11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100L + "'", obj5, 100L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100L + "'", obj8, 100L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test245");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.addFirst((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.addFirst((java.lang.Object) 100.0f);
        int int10 = linkedListTestDriver7.size();
        boolean boolean12 = linkedListTestDriver7.add((java.lang.Object) (-1.0f));
        linkedListTestDriver7.add(1, (java.lang.Object) 1);
        boolean boolean17 = linkedListTestDriver7.add((java.lang.Object) (short) 1);
        java.lang.Object obj18 = linkedListTestDriver7.getFirst();
        experiment.util.Iterator iterator19 = linkedListTestDriver7.iterator();
        java.lang.Object obj21 = linkedListTestDriver7.get(0);
        linkedListTestDriver0.addFirst((java.lang.Object) 0);
        experiment.util.ListIterator listIterator24 = linkedListTestDriver0.listIterator(0);
        experiment.util.Iterator iterator25 = linkedListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator27 = linkedListTestDriver0.listIterator(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 100; size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0f + "'", obj18, 100.0f);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0f + "'", obj21, 100.0f);
        org.junit.Assert.assertNotNull(listIterator24);
        org.junit.Assert.assertNotNull(iterator25);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test246");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.addFirst((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj10 = linkedListTestDriver7.getFirst();
        boolean boolean12 = linkedListTestDriver7.add((java.lang.Object) (short) 100);
        boolean boolean14 = linkedListTestDriver7.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj15 = linkedListTestDriver7.removeFirst();
        java.lang.Object obj16 = linkedListTestDriver7.getFirst();
        boolean boolean17 = linkedListTestDriver0.add(obj16);
        java.lang.Object obj18 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver20.addFirst((java.lang.Object) 100.0f);
        int int23 = linkedListTestDriver20.size();
        linkedListTestDriver20.addFirst((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator26 = linkedListTestDriver20.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver27 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver27.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj30 = linkedListTestDriver27.getFirst();
        boolean boolean32 = linkedListTestDriver27.add((java.lang.Object) (short) 100);
        boolean boolean34 = linkedListTestDriver27.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj35 = linkedListTestDriver27.removeFirst();
        java.lang.Object obj36 = linkedListTestDriver27.getFirst();
        boolean boolean37 = linkedListTestDriver20.add(obj36);
        experiment.util.LinkedListTestDriver linkedListTestDriver38 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver38.addFirst((java.lang.Object) 100.0f);
        int int41 = linkedListTestDriver38.size();
        linkedListTestDriver38.clear();
        experiment.util.Iterator iterator43 = linkedListTestDriver38.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver44 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver44.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj47 = linkedListTestDriver44.getFirst();
        boolean boolean49 = linkedListTestDriver44.add((java.lang.Object) (short) 100);
        boolean boolean51 = linkedListTestDriver44.contains((java.lang.Object) (short) 10);
        linkedListTestDriver38.addLast((java.lang.Object) boolean51);
        boolean boolean53 = linkedListTestDriver38.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver54 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver55 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver55.clear();
        experiment.util.Iterator iterator57 = linkedListTestDriver55.iterator();
        linkedListTestDriver54.addLast((java.lang.Object) linkedListTestDriver55);
        boolean boolean60 = linkedListTestDriver55.remove((java.lang.Object) 0L);
        boolean boolean61 = linkedListTestDriver38.contains((java.lang.Object) boolean60);
        experiment.util.LinkedListTestDriver linkedListTestDriver62 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver62.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver62.addFirst((java.lang.Object) 100L);
        java.lang.Object obj67 = linkedListTestDriver62.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver69 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver69.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj72 = linkedListTestDriver69.getFirst();
        boolean boolean74 = linkedListTestDriver69.add((java.lang.Object) (short) 100);
        linkedListTestDriver69.addLast((java.lang.Object) 10L);
        boolean boolean78 = linkedListTestDriver69.contains((java.lang.Object) (-1L));
        int int79 = linkedListTestDriver69.size();
        java.lang.Object obj80 = linkedListTestDriver62.set(0, (java.lang.Object) int79);
        boolean boolean81 = linkedListTestDriver38.contains((java.lang.Object) linkedListTestDriver62);
        experiment.util.Iterator iterator82 = linkedListTestDriver62.iterator();
        java.lang.Object obj83 = linkedListTestDriver62.getLast();
        boolean boolean84 = linkedListTestDriver20.remove(obj83);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj85 = linkedListTestDriver0.set(10, (java.lang.Object) boolean84);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0f + "'", obj15, 100.0f);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) 100 + "'", obj16, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 10.0d + "'", obj18, 10.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 100.0f + "'", obj30, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 100.0f + "'", obj35, 100.0f);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (short) 100 + "'", obj36, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(iterator43);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 100.0f + "'", obj47, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(iterator57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + 100.0f + "'", obj67, 100.0f);
        org.junit.Assert.assertEquals("'" + obj72 + "' != '" + 100.0f + "'", obj72, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 3 + "'", int79 == 3);
        org.junit.Assert.assertEquals("'" + obj80 + "' != '" + 100L + "'", obj80, 100L);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(iterator82);
        org.junit.Assert.assertEquals("'" + obj83 + "' != '" + 100.0f + "'", obj83, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test247");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        int int3 = linkedListTestDriver0.size();
        linkedListTestDriver0.addLast((java.lang.Object) 0.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj9 = linkedListTestDriver6.getFirst();
        boolean boolean11 = linkedListTestDriver6.add((java.lang.Object) (short) 100);
        boolean boolean13 = linkedListTestDriver6.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean14 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver6);
        boolean boolean15 = linkedListTestDriver6.isEmpty();
        java.lang.Object obj16 = linkedListTestDriver6.getFirst();
        experiment.util.Iterator iterator17 = linkedListTestDriver6.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver18.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj21 = linkedListTestDriver18.getFirst();
        boolean boolean23 = linkedListTestDriver18.add((java.lang.Object) (short) 100);
        boolean boolean25 = linkedListTestDriver18.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj28 = linkedListTestDriver18.set((int) (short) 0, (java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator29 = linkedListTestDriver18.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver30.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj33 = linkedListTestDriver30.getFirst();
        boolean boolean35 = linkedListTestDriver30.add((java.lang.Object) (short) 100);
        boolean boolean37 = linkedListTestDriver30.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj40 = linkedListTestDriver30.set((int) (short) 0, (java.lang.Object) (byte) 1);
        boolean boolean41 = linkedListTestDriver18.add((java.lang.Object) (short) 0);
        boolean boolean42 = linkedListTestDriver6.equals_CUT((java.lang.Object) linkedListTestDriver18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0f + "'", obj16, 100.0f);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0f + "'", obj21, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 100.0f + "'", obj28, 100.0f);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 100.0f + "'", obj33, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 100.0f + "'", obj40, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test248");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver0.addFirst((java.lang.Object) 100L);
        java.lang.Object obj5 = linkedListTestDriver0.getFirst();
        boolean boolean7 = linkedListTestDriver0.add((java.lang.Object) 'a');
        java.lang.Object obj8 = linkedListTestDriver0.getFirst();
        java.lang.Object obj9 = linkedListTestDriver0.getFirst();
        experiment.util.Iterator iterator10 = linkedListTestDriver0.iterator();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100L + "'", obj5, 100L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100L + "'", obj8, 100L);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100L + "'", obj9, 100L);
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test249");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver0.addFirst((java.lang.Object) 100L);
        java.lang.Object obj5 = linkedListTestDriver0.removeLast();
        boolean boolean7 = linkedListTestDriver0.remove((java.lang.Object) 1);
        java.lang.Object obj8 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver9.addFirst((java.lang.Object) 100.0f);
        int int12 = linkedListTestDriver9.size();
        boolean boolean14 = linkedListTestDriver9.add((java.lang.Object) (-1.0f));
        linkedListTestDriver9.add(1, (java.lang.Object) 1);
        boolean boolean19 = linkedListTestDriver9.add((java.lang.Object) (short) 1);
        java.lang.Object obj20 = linkedListTestDriver9.getFirst();
        experiment.util.Iterator iterator21 = linkedListTestDriver9.iterator();
        java.lang.Object obj23 = linkedListTestDriver9.get(0);
        boolean boolean24 = linkedListTestDriver0.equals_CUT((java.lang.Object) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = linkedListTestDriver0.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100L + "'", obj8, 100L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0f + "'", obj20, 100.0f);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100.0f + "'", obj23, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test250");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver0.addFirst((java.lang.Object) 100L);
        java.lang.Object obj5 = linkedListTestDriver0.removeLast();
        boolean boolean7 = linkedListTestDriver0.remove((java.lang.Object) 1);
        java.lang.Object obj8 = linkedListTestDriver0.getLast();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100L + "'", obj8, 100L);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test251");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver1.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj4 = linkedListTestDriver1.getFirst();
        boolean boolean6 = linkedListTestDriver1.add((java.lang.Object) (short) 100);
        boolean boolean8 = linkedListTestDriver1.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean9 = linkedListTestDriver0.add((java.lang.Object) boolean8);
        java.lang.Object obj10 = linkedListTestDriver0.getLast();
        java.lang.Object obj11 = linkedListTestDriver0.removeFirst();
        java.lang.Object[] objArray12 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver14.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj17 = linkedListTestDriver14.getFirst();
        boolean boolean19 = linkedListTestDriver14.add((java.lang.Object) (short) 100);
        boolean boolean21 = linkedListTestDriver14.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj24 = linkedListTestDriver14.set((int) (short) 0, (java.lang.Object) (byte) 1);
        java.lang.Object[] objArray25 = linkedListTestDriver14.toArray();
        linkedListTestDriver0.add(0, (java.lang.Object) linkedListTestDriver14);
        experiment.util.LinkedListTestDriver linkedListTestDriver27 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver27.addFirst((java.lang.Object) 100.0f);
        int int30 = linkedListTestDriver27.size();
        java.lang.Object obj31 = linkedListTestDriver27.removeLast();
        java.lang.Object[] objArray32 = linkedListTestDriver27.toArray();
        boolean boolean33 = linkedListTestDriver14.remove((java.lang.Object) linkedListTestDriver27);
        java.lang.Object obj34 = linkedListTestDriver14.removeLast();
        java.lang.Object obj35 = linkedListTestDriver14.getFirst();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + false + "'", obj11, false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 100.0f + "'", obj17, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 100.0f + "'", obj24, 100.0f);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[1, 100]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 100.0f + "'", obj31, 100.0f);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (short) 100 + "'", obj34, (short) 100);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (byte) 1 + "'", obj35, (byte) 1);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test252");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        int int3 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver4.addFirst((java.lang.Object) 100L);
        java.lang.Object obj9 = linkedListTestDriver4.getFirst();
        java.lang.Class<?> wildcardClass10 = linkedListTestDriver4.getClass();
        linkedListTestDriver0.addFirst((java.lang.Object) wildcardClass10);
        java.lang.Object obj12 = linkedListTestDriver0.getLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = linkedListTestDriver0.remove((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100L + "'", obj9, 100L);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test253");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        experiment.util.ListIterator listIterator4 = linkedListTestDriver0.listIterator(1);
        int int5 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj10 = linkedListTestDriver7.getFirst();
        boolean boolean12 = linkedListTestDriver7.add((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator13 = linkedListTestDriver7.iterator();
        boolean boolean14 = linkedListTestDriver7.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add(10, (java.lang.Object) boolean14);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(listIterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test254");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 100);
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = linkedListTestDriver0.set((int) (short) 0, (java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator11 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj15 = linkedListTestDriver12.getFirst();
        boolean boolean17 = linkedListTestDriver12.add((java.lang.Object) (short) 100);
        boolean boolean19 = linkedListTestDriver12.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object obj22 = linkedListTestDriver12.set((int) (short) 0, (java.lang.Object) (byte) 1);
        boolean boolean23 = linkedListTestDriver0.add((java.lang.Object) (short) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver25.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj28 = linkedListTestDriver25.getFirst();
        boolean boolean30 = linkedListTestDriver25.add((java.lang.Object) (short) 100);
        boolean boolean32 = linkedListTestDriver25.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean33 = linkedListTestDriver24.add((java.lang.Object) boolean32);
        boolean boolean35 = linkedListTestDriver24.remove((java.lang.Object) '4');
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver38 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver38.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj41 = linkedListTestDriver38.getFirst();
        boolean boolean43 = linkedListTestDriver38.add((java.lang.Object) (short) 100);
        boolean boolean45 = linkedListTestDriver38.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean46 = linkedListTestDriver37.add((java.lang.Object) boolean45);
        java.lang.Object obj47 = linkedListTestDriver37.getLast();
        java.lang.Object obj48 = linkedListTestDriver37.removeFirst();
        java.lang.Object[] objArray49 = linkedListTestDriver37.toArray();
        linkedListTestDriver24.add(0, (java.lang.Object) linkedListTestDriver37);
        boolean boolean51 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj53 = linkedListTestDriver0.get((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0f + "'", obj15, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 100.0f + "'", obj22, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 100.0f + "'", obj28, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 100.0f + "'", obj41, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + false + "'", obj47, false);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + false + "'", obj48, false);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test255");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver1.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj4 = linkedListTestDriver1.getFirst();
        boolean boolean6 = linkedListTestDriver1.add((java.lang.Object) (short) 100);
        boolean boolean8 = linkedListTestDriver1.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean9 = linkedListTestDriver0.add((java.lang.Object) boolean8);
        java.lang.Object obj10 = linkedListTestDriver0.getLast();
        java.lang.Object obj11 = linkedListTestDriver0.removeFirst();
        java.lang.Object[] objArray12 = linkedListTestDriver0.toArray();
        experiment.util.ListIterator listIterator14 = linkedListTestDriver0.listIterator(0);
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver15.addFirst((java.lang.Object) 100.0f);
        linkedListTestDriver15.addFirst((java.lang.Object) 100L);
        java.lang.Object obj20 = linkedListTestDriver15.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver22.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj25 = linkedListTestDriver22.getFirst();
        boolean boolean27 = linkedListTestDriver22.add((java.lang.Object) (short) 100);
        linkedListTestDriver22.addLast((java.lang.Object) 10L);
        boolean boolean31 = linkedListTestDriver22.contains((java.lang.Object) (-1L));
        int int32 = linkedListTestDriver22.size();
        java.lang.Object obj33 = linkedListTestDriver15.set(0, (java.lang.Object) int32);
        linkedListTestDriver0.addLast(obj33);
        experiment.util.LinkedListTestDriver linkedListTestDriver35 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver35.addFirst((java.lang.Object) 100.0f);
        int int38 = linkedListTestDriver35.size();
        boolean boolean40 = linkedListTestDriver35.add((java.lang.Object) (-1.0f));
        boolean boolean41 = linkedListTestDriver0.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj42 = linkedListTestDriver0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj43 = linkedListTestDriver0.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + false + "'", obj11, false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(listIterator14);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0f + "'", obj20, 100.0f);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0f + "'", obj25, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 100L + "'", obj33, 100L);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 100L + "'", obj42, 100L);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_101322511_1024_0.test256");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.clear();
        boolean boolean3 = linkedListTestDriver0.equals_CUT((java.lang.Object) (-1.0d));
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray6 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.addFirst((java.lang.Object) 100.0f);
        java.lang.Object obj11 = linkedListTestDriver8.getFirst();
        boolean boolean13 = linkedListTestDriver8.add((java.lang.Object) (short) 100);
        boolean boolean15 = linkedListTestDriver8.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean16 = linkedListTestDriver7.add((java.lang.Object) boolean15);
        java.lang.Object obj17 = linkedListTestDriver7.getLast();
        java.lang.Object obj18 = linkedListTestDriver7.removeFirst();
        java.lang.Object[] objArray19 = linkedListTestDriver7.toArray();
        boolean boolean20 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver7);
        int int21 = linkedListTestDriver0.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0]");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0f + "'", obj11, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + false + "'", obj17, false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + false + "'", obj18, false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

}
