package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_TreeSetTest_1321793073_128_s {

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
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test001");
        experiment.util.Comparator comparator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.TreeSetTestDriver treeSetTestDriver1 = new experiment.util.TreeSetTestDriver(comparator0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test002");
        experiment.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.TreeSetTestDriver treeSetTestDriver1 = new experiment.util.TreeSetTestDriver(collection0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test003");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj1 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test004");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj1 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test005");
        experiment.util.TreeSet treeSet0 = null;
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.TreeSetTestDriver treeSetTestDriver1 = new experiment.util.TreeSetTestDriver(treeSet0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test006");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        experiment.util.Iterator iterator3 = treeSetTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator3);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test007");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        experiment.util.Iterator iterator3 = treeSetTestDriver0.iterator();
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = treeSetTestDriver0.add(obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator3);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test008");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver2 = new experiment.util.TreeSetTestDriver();
        boolean boolean3 = treeSetTestDriver2.isEmpty();
        experiment.util.Iterator iterator4 = treeSetTestDriver2.iterator();
        experiment.util.Iterator iterator5 = treeSetTestDriver2.iterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = treeSetTestDriver0.contains((java.lang.Object) iterator5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet$TreeSetIterator cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test009");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.add((java.lang.Object) 10.0f);
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = treeSetTestDriver0.contains(obj3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Object cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test010");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        experiment.util.Iterator iterator3 = treeSetTestDriver0.iterator();
        boolean boolean5 = treeSetTestDriver0.contains((java.lang.Object) 10L);
        experiment.util.Iterator iterator6 = treeSetTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test011");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        boolean boolean2 = treeSetTestDriver0.isEmpty();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test012");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        boolean boolean4 = treeSetTestDriver0.equals_CUT((java.lang.Object) 100L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test013");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        experiment.util.Iterator iterator3 = treeSetTestDriver0.iterator();
        java.lang.Object obj5 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator6 = treeSetTestDriver0.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(comparator6);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test014");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        experiment.util.Iterator iterator3 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver4 = new experiment.util.TreeSetTestDriver();
        boolean boolean5 = treeSetTestDriver4.isEmpty();
        boolean boolean7 = treeSetTestDriver4.remove((java.lang.Object) 100L);
        boolean boolean8 = treeSetTestDriver0.equals_CUT((java.lang.Object) 100L);
        java.lang.Class<?> wildcardClass9 = treeSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test015");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        boolean boolean4 = treeSetTestDriver0.equals_CUT((java.lang.Object) 100L);
        experiment.util.TreeSetTestDriver treeSetTestDriver5 = new experiment.util.TreeSetTestDriver();
        boolean boolean6 = treeSetTestDriver5.isEmpty();
        experiment.util.Iterator iterator7 = treeSetTestDriver5.iterator();
        experiment.util.Iterator iterator8 = treeSetTestDriver5.iterator();
        boolean boolean10 = treeSetTestDriver5.contains((java.lang.Object) 10L);
        int int11 = treeSetTestDriver5.size();
        boolean boolean13 = treeSetTestDriver5.contains((java.lang.Object) (-1L));
        experiment.util.TreeSetTestDriver treeSetTestDriver14 = new experiment.util.TreeSetTestDriver();
        boolean boolean15 = treeSetTestDriver14.isEmpty();
        experiment.util.Iterator iterator16 = treeSetTestDriver14.iterator();
        experiment.util.Iterator iterator17 = treeSetTestDriver14.iterator();
        boolean boolean19 = treeSetTestDriver14.contains((java.lang.Object) 10L);
        int int20 = treeSetTestDriver14.size();
        boolean boolean22 = treeSetTestDriver14.contains((java.lang.Object) (-1L));
        int int23 = treeSetTestDriver14.size();
        java.lang.Object obj24 = treeSetTestDriver5.getMatch((java.lang.Object) int23);
        experiment.util.Iterator iterator25 = treeSetTestDriver5.iterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = treeSetTestDriver0.contains((java.lang.Object) iterator25);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet$TreeSetIterator cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(iterator25);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test016");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Class<?> wildcardClass1 = treeSetTestDriver0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test017");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        boolean boolean2 = treeSetTestDriver0.isEmpty();
        boolean boolean3 = treeSetTestDriver0.isEmpty();
        boolean boolean5 = treeSetTestDriver0.contains((java.lang.Object) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test018");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        boolean boolean3 = treeSetTestDriver0.remove((java.lang.Object) 100L);
        boolean boolean5 = treeSetTestDriver0.contains((java.lang.Object) ' ');
        boolean boolean7 = treeSetTestDriver0.add((java.lang.Object) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = treeSetTestDriver0.remove((java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to java.lang.Short");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test019");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        experiment.util.Iterator iterator3 = treeSetTestDriver0.iterator();
        boolean boolean5 = treeSetTestDriver0.contains((java.lang.Object) 10L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test020");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        experiment.util.Iterator iterator3 = treeSetTestDriver0.iterator();
        boolean boolean5 = treeSetTestDriver0.contains((java.lang.Object) 10L);
        int int6 = treeSetTestDriver0.size();
        boolean boolean8 = treeSetTestDriver0.contains((java.lang.Object) (-1L));
        experiment.util.TreeSetTestDriver treeSetTestDriver9 = new experiment.util.TreeSetTestDriver();
        boolean boolean10 = treeSetTestDriver9.isEmpty();
        experiment.util.Iterator iterator11 = treeSetTestDriver9.iterator();
        experiment.util.Iterator iterator12 = treeSetTestDriver9.iterator();
        boolean boolean14 = treeSetTestDriver9.contains((java.lang.Object) 10L);
        int int15 = treeSetTestDriver9.size();
        boolean boolean17 = treeSetTestDriver9.contains((java.lang.Object) (-1L));
        int int18 = treeSetTestDriver9.size();
        java.lang.Object obj19 = treeSetTestDriver0.getMatch((java.lang.Object) int18);
        experiment.util.Iterator iterator20 = treeSetTestDriver0.iterator();
        experiment.util.Iterator iterator21 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver22 = new experiment.util.TreeSetTestDriver();
        boolean boolean23 = treeSetTestDriver22.isEmpty();
        boolean boolean25 = treeSetTestDriver22.remove((java.lang.Object) 100L);
        java.lang.Object[] objArray26 = treeSetTestDriver22.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = treeSetTestDriver0.getMatch((java.lang.Object) objArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Ljava.lang.Object; cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test021");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        experiment.util.Iterator iterator3 = treeSetTestDriver0.iterator();
        boolean boolean5 = treeSetTestDriver0.contains((java.lang.Object) 10L);
        int int6 = treeSetTestDriver0.size();
        boolean boolean8 = treeSetTestDriver0.contains((java.lang.Object) (-1L));
        experiment.util.TreeSetTestDriver treeSetTestDriver9 = new experiment.util.TreeSetTestDriver();
        boolean boolean10 = treeSetTestDriver9.isEmpty();
        experiment.util.Iterator iterator11 = treeSetTestDriver9.iterator();
        experiment.util.Iterator iterator12 = treeSetTestDriver9.iterator();
        boolean boolean14 = treeSetTestDriver9.contains((java.lang.Object) 10L);
        int int15 = treeSetTestDriver9.size();
        boolean boolean17 = treeSetTestDriver9.contains((java.lang.Object) (-1L));
        int int18 = treeSetTestDriver9.size();
        java.lang.Object obj19 = treeSetTestDriver0.getMatch((java.lang.Object) int18);
        experiment.util.Iterator iterator20 = treeSetTestDriver0.iterator();
        treeSetTestDriver0.clear();
        java.lang.Object obj22 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = treeSetTestDriver0.remove(obj22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(iterator20);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test022");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        experiment.util.Iterator iterator3 = treeSetTestDriver0.iterator();
        boolean boolean5 = treeSetTestDriver0.contains((java.lang.Object) 10L);
        int int6 = treeSetTestDriver0.size();
        boolean boolean8 = treeSetTestDriver0.contains((java.lang.Object) (-1L));
        experiment.util.TreeSetTestDriver treeSetTestDriver9 = new experiment.util.TreeSetTestDriver();
        boolean boolean10 = treeSetTestDriver9.isEmpty();
        experiment.util.Iterator iterator11 = treeSetTestDriver9.iterator();
        experiment.util.Iterator iterator12 = treeSetTestDriver9.iterator();
        boolean boolean14 = treeSetTestDriver9.contains((java.lang.Object) 10L);
        int int15 = treeSetTestDriver9.size();
        boolean boolean17 = treeSetTestDriver9.contains((java.lang.Object) (-1L));
        int int18 = treeSetTestDriver9.size();
        java.lang.Object obj19 = treeSetTestDriver0.getMatch((java.lang.Object) int18);
        experiment.util.Iterator iterator20 = treeSetTestDriver0.iterator();
        experiment.util.Iterator iterator21 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver22 = new experiment.util.TreeSetTestDriver();
        boolean boolean23 = treeSetTestDriver22.isEmpty();
        boolean boolean24 = treeSetTestDriver22.isEmpty();
        boolean boolean25 = treeSetTestDriver0.equals_CUT((java.lang.Object) boolean24);
        experiment.util.TreeSetTestDriver treeSetTestDriver26 = new experiment.util.TreeSetTestDriver();
        boolean boolean27 = treeSetTestDriver26.isEmpty();
        experiment.util.Iterator iterator28 = treeSetTestDriver26.iterator();
        experiment.util.Iterator iterator29 = treeSetTestDriver26.iterator();
        boolean boolean31 = treeSetTestDriver26.contains((java.lang.Object) 10L);
        int int32 = treeSetTestDriver26.size();
        boolean boolean34 = treeSetTestDriver26.contains((java.lang.Object) (-1L));
        experiment.util.TreeSetTestDriver treeSetTestDriver35 = new experiment.util.TreeSetTestDriver();
        boolean boolean36 = treeSetTestDriver35.isEmpty();
        experiment.util.Iterator iterator37 = treeSetTestDriver35.iterator();
        experiment.util.Iterator iterator38 = treeSetTestDriver35.iterator();
        boolean boolean40 = treeSetTestDriver35.contains((java.lang.Object) 10L);
        int int41 = treeSetTestDriver35.size();
        boolean boolean43 = treeSetTestDriver35.contains((java.lang.Object) (-1L));
        int int44 = treeSetTestDriver35.size();
        java.lang.Object obj45 = treeSetTestDriver26.getMatch((java.lang.Object) int44);
        experiment.util.Iterator iterator46 = treeSetTestDriver26.iterator();
        experiment.util.Iterator iterator47 = treeSetTestDriver26.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj48 = treeSetTestDriver0.getMatch((java.lang.Object) iterator47);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet$TreeSetIterator cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(iterator46);
        org.junit.Assert.assertNotNull(iterator47);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test023");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        boolean boolean3 = treeSetTestDriver0.remove((java.lang.Object) 100L);
        boolean boolean5 = treeSetTestDriver0.contains((java.lang.Object) ' ');
        boolean boolean7 = treeSetTestDriver0.add((java.lang.Object) 10);
        int int8 = treeSetTestDriver0.size();
        experiment.util.Iterator iterator9 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver10 = new experiment.util.TreeSetTestDriver();
        boolean boolean11 = treeSetTestDriver10.isEmpty();
        boolean boolean12 = treeSetTestDriver10.isEmpty();
        boolean boolean13 = treeSetTestDriver10.isEmpty();
        boolean boolean15 = treeSetTestDriver10.contains((java.lang.Object) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = treeSetTestDriver0.getMatch((java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to java.lang.Float");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test024");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        experiment.util.Iterator iterator3 = treeSetTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator3);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test025");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        experiment.util.Iterator iterator3 = treeSetTestDriver0.iterator();
        boolean boolean5 = treeSetTestDriver0.contains((java.lang.Object) 10L);
        int int6 = treeSetTestDriver0.size();
        boolean boolean8 = treeSetTestDriver0.contains((java.lang.Object) (-1L));
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = treeSetTestDriver0.contains((java.lang.Object) wildcardClass10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test026");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        boolean boolean2 = treeSetTestDriver0.isEmpty();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) 10.0d);
        boolean boolean5 = treeSetTestDriver0.isEmpty();
        int int6 = treeSetTestDriver0.size();
        experiment.util.Comparator comparator7 = treeSetTestDriver0.comparator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(comparator7);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test027");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        boolean boolean3 = treeSetTestDriver0.remove((java.lang.Object) 100L);
        boolean boolean5 = treeSetTestDriver0.contains((java.lang.Object) ' ');
        java.lang.Class<?> wildcardClass6 = treeSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test028");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        experiment.util.Iterator iterator3 = treeSetTestDriver0.iterator();
        boolean boolean5 = treeSetTestDriver0.contains((java.lang.Object) 10L);
        java.lang.Object[] objArray6 = treeSetTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test029");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        boolean boolean4 = treeSetTestDriver0.equals_CUT((java.lang.Object) 100L);
        java.lang.Object obj5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = treeSetTestDriver0.add(obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test030");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        experiment.util.Iterator iterator3 = treeSetTestDriver0.iterator();
        boolean boolean5 = treeSetTestDriver0.contains((java.lang.Object) 10L);
        int int6 = treeSetTestDriver0.size();
        boolean boolean8 = treeSetTestDriver0.contains((java.lang.Object) (-1L));
        experiment.util.TreeSetTestDriver treeSetTestDriver9 = new experiment.util.TreeSetTestDriver();
        boolean boolean10 = treeSetTestDriver9.isEmpty();
        experiment.util.Iterator iterator11 = treeSetTestDriver9.iterator();
        experiment.util.Iterator iterator12 = treeSetTestDriver9.iterator();
        boolean boolean14 = treeSetTestDriver9.contains((java.lang.Object) 10L);
        int int15 = treeSetTestDriver9.size();
        boolean boolean17 = treeSetTestDriver9.contains((java.lang.Object) (-1L));
        int int18 = treeSetTestDriver9.size();
        java.lang.Object obj19 = treeSetTestDriver0.getMatch((java.lang.Object) int18);
        experiment.util.Iterator iterator20 = treeSetTestDriver0.iterator();
        treeSetTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(iterator20);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test031");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        experiment.util.Iterator iterator3 = treeSetTestDriver0.iterator();
        java.lang.Object obj5 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        java.lang.Object[] objArray6 = treeSetTestDriver0.toArray();
        experiment.util.Comparator comparator7 = treeSetTestDriver0.comparator();
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = treeSetTestDriver0.remove(obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNull(comparator7);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test032");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        experiment.util.Iterator iterator3 = treeSetTestDriver0.iterator();
        boolean boolean5 = treeSetTestDriver0.contains((java.lang.Object) 10L);
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = treeSetTestDriver0.remove(obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test033");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver2 = new experiment.util.TreeSetTestDriver();
        boolean boolean3 = treeSetTestDriver2.isEmpty();
        experiment.util.Iterator iterator4 = treeSetTestDriver2.iterator();
        experiment.util.Iterator iterator5 = treeSetTestDriver2.iterator();
        boolean boolean7 = treeSetTestDriver2.contains((java.lang.Object) 10L);
        boolean boolean8 = treeSetTestDriver0.add((java.lang.Object) 10L);
        experiment.util.TreeSetTestDriver treeSetTestDriver9 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator10 = treeSetTestDriver9.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver11 = new experiment.util.TreeSetTestDriver();
        boolean boolean12 = treeSetTestDriver11.isEmpty();
        experiment.util.Iterator iterator13 = treeSetTestDriver11.iterator();
        experiment.util.Iterator iterator14 = treeSetTestDriver11.iterator();
        boolean boolean16 = treeSetTestDriver11.contains((java.lang.Object) 10L);
        boolean boolean17 = treeSetTestDriver9.add((java.lang.Object) 10L);
        boolean boolean18 = treeSetTestDriver0.equals_CUT((java.lang.Object) boolean17);
        experiment.util.TreeSetTestDriver treeSetTestDriver19 = new experiment.util.TreeSetTestDriver();
        boolean boolean20 = treeSetTestDriver19.isEmpty();
        experiment.util.Iterator iterator21 = treeSetTestDriver19.iterator();
        experiment.util.Iterator iterator22 = treeSetTestDriver19.iterator();
        java.lang.Object obj24 = treeSetTestDriver19.getMatch((java.lang.Object) (-1.0f));
        java.lang.Object[] objArray25 = treeSetTestDriver19.toArray();
        experiment.util.Comparator comparator26 = treeSetTestDriver19.comparator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = treeSetTestDriver0.remove((java.lang.Object) treeSetTestDriver19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNull(comparator26);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test034");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver3 = new experiment.util.TreeSetTestDriver();
        boolean boolean4 = treeSetTestDriver3.isEmpty();
        boolean boolean5 = treeSetTestDriver3.isEmpty();
        boolean boolean6 = treeSetTestDriver0.remove((java.lang.Object) boolean5);
        int int7 = treeSetTestDriver0.size();
        experiment.util.TreeSetTestDriver treeSetTestDriver8 = new experiment.util.TreeSetTestDriver();
        boolean boolean9 = treeSetTestDriver8.isEmpty();
        experiment.util.Iterator iterator10 = treeSetTestDriver8.iterator();
        boolean boolean11 = treeSetTestDriver0.remove((java.lang.Object) iterator10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test035");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        experiment.util.Iterator iterator3 = treeSetTestDriver0.iterator();
        java.lang.Object obj5 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator6 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver7 = new experiment.util.TreeSetTestDriver();
        boolean boolean8 = treeSetTestDriver7.isEmpty();
        boolean boolean9 = treeSetTestDriver7.isEmpty();
        boolean boolean10 = treeSetTestDriver7.isEmpty();
        boolean boolean12 = treeSetTestDriver7.contains((java.lang.Object) 1.0f);
        boolean boolean13 = treeSetTestDriver0.equals_CUT((java.lang.Object) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test036");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        experiment.util.Iterator iterator3 = treeSetTestDriver0.iterator();
        boolean boolean5 = treeSetTestDriver0.contains((java.lang.Object) 10L);
        int int6 = treeSetTestDriver0.size();
        boolean boolean8 = treeSetTestDriver0.contains((java.lang.Object) (-1L));
        experiment.util.TreeSetTestDriver treeSetTestDriver9 = new experiment.util.TreeSetTestDriver();
        boolean boolean10 = treeSetTestDriver9.isEmpty();
        experiment.util.Iterator iterator11 = treeSetTestDriver9.iterator();
        experiment.util.Iterator iterator12 = treeSetTestDriver9.iterator();
        boolean boolean14 = treeSetTestDriver9.contains((java.lang.Object) 10L);
        int int15 = treeSetTestDriver9.size();
        boolean boolean17 = treeSetTestDriver9.contains((java.lang.Object) (-1L));
        int int18 = treeSetTestDriver9.size();
        java.lang.Object obj19 = treeSetTestDriver0.getMatch((java.lang.Object) int18);
        experiment.util.Iterator iterator20 = treeSetTestDriver0.iterator();
        treeSetTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(iterator20);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test037");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver2 = new experiment.util.TreeSetTestDriver();
        boolean boolean3 = treeSetTestDriver2.isEmpty();
        experiment.util.Iterator iterator4 = treeSetTestDriver2.iterator();
        experiment.util.Iterator iterator5 = treeSetTestDriver2.iterator();
        boolean boolean7 = treeSetTestDriver2.contains((java.lang.Object) 10L);
        boolean boolean8 = treeSetTestDriver0.add((java.lang.Object) 10L);
        experiment.util.TreeSetTestDriver treeSetTestDriver9 = new experiment.util.TreeSetTestDriver();
        boolean boolean10 = treeSetTestDriver9.isEmpty();
        boolean boolean11 = treeSetTestDriver9.isEmpty();
        boolean boolean12 = treeSetTestDriver9.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = treeSetTestDriver0.contains((java.lang.Object) boolean12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to java.lang.Boolean");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test038");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        experiment.util.Iterator iterator3 = treeSetTestDriver0.iterator();
        boolean boolean5 = treeSetTestDriver0.contains((java.lang.Object) 10L);
        int int6 = treeSetTestDriver0.size();
        boolean boolean8 = treeSetTestDriver0.contains((java.lang.Object) (-1L));
        int int9 = treeSetTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test039");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver2 = new experiment.util.TreeSetTestDriver();
        boolean boolean3 = treeSetTestDriver2.isEmpty();
        experiment.util.Iterator iterator4 = treeSetTestDriver2.iterator();
        experiment.util.Iterator iterator5 = treeSetTestDriver2.iterator();
        boolean boolean7 = treeSetTestDriver2.contains((java.lang.Object) 10L);
        boolean boolean8 = treeSetTestDriver0.add((java.lang.Object) 10L);
        boolean boolean10 = treeSetTestDriver0.equals_CUT((java.lang.Object) '4');
        experiment.util.TreeSetTestDriver treeSetTestDriver11 = new experiment.util.TreeSetTestDriver();
        boolean boolean12 = treeSetTestDriver11.isEmpty();
        experiment.util.Iterator iterator13 = treeSetTestDriver11.iterator();
        experiment.util.Iterator iterator14 = treeSetTestDriver11.iterator();
        boolean boolean16 = treeSetTestDriver11.contains((java.lang.Object) 10L);
        int int17 = treeSetTestDriver11.size();
        boolean boolean19 = treeSetTestDriver11.contains((java.lang.Object) (-1L));
        int int20 = treeSetTestDriver11.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = treeSetTestDriver0.getMatch((java.lang.Object) int20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to java.lang.Integer");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test040");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        boolean boolean3 = treeSetTestDriver0.remove((java.lang.Object) 100L);
        java.lang.Object[] objArray4 = treeSetTestDriver0.toArray();
        boolean boolean6 = treeSetTestDriver0.add((java.lang.Object) (byte) 0);
        experiment.util.TreeSetTestDriver treeSetTestDriver7 = new experiment.util.TreeSetTestDriver();
        boolean boolean8 = treeSetTestDriver7.isEmpty();
        experiment.util.Iterator iterator9 = treeSetTestDriver7.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver10 = new experiment.util.TreeSetTestDriver();
        boolean boolean11 = treeSetTestDriver10.isEmpty();
        boolean boolean12 = treeSetTestDriver10.isEmpty();
        boolean boolean13 = treeSetTestDriver7.remove((java.lang.Object) boolean12);
        experiment.util.TreeSetTestDriver treeSetTestDriver14 = new experiment.util.TreeSetTestDriver();
        boolean boolean15 = treeSetTestDriver14.isEmpty();
        experiment.util.Iterator iterator16 = treeSetTestDriver14.iterator();
        experiment.util.Iterator iterator17 = treeSetTestDriver14.iterator();
        java.lang.Object obj19 = treeSetTestDriver14.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator20 = treeSetTestDriver14.comparator();
        boolean boolean21 = treeSetTestDriver7.remove((java.lang.Object) treeSetTestDriver14);
        boolean boolean23 = treeSetTestDriver14.add((java.lang.Object) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = treeSetTestDriver0.getMatch((java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to java.lang.Short");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(comparator20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test041");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver3 = new experiment.util.TreeSetTestDriver();
        boolean boolean4 = treeSetTestDriver3.isEmpty();
        boolean boolean5 = treeSetTestDriver3.isEmpty();
        boolean boolean6 = treeSetTestDriver0.remove((java.lang.Object) boolean5);
        int int7 = treeSetTestDriver0.size();
        boolean boolean9 = treeSetTestDriver0.remove((java.lang.Object) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test042");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver3 = new experiment.util.TreeSetTestDriver();
        boolean boolean4 = treeSetTestDriver3.isEmpty();
        boolean boolean5 = treeSetTestDriver3.isEmpty();
        boolean boolean6 = treeSetTestDriver0.remove((java.lang.Object) boolean5);
        experiment.util.TreeSetTestDriver treeSetTestDriver7 = new experiment.util.TreeSetTestDriver();
        boolean boolean8 = treeSetTestDriver7.isEmpty();
        experiment.util.Iterator iterator9 = treeSetTestDriver7.iterator();
        experiment.util.Iterator iterator10 = treeSetTestDriver7.iterator();
        java.lang.Object obj12 = treeSetTestDriver7.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator13 = treeSetTestDriver7.comparator();
        boolean boolean14 = treeSetTestDriver0.remove((java.lang.Object) treeSetTestDriver7);
        boolean boolean16 = treeSetTestDriver0.remove((java.lang.Object) (byte) 1);
        experiment.util.TreeSetTestDriver treeSetTestDriver17 = new experiment.util.TreeSetTestDriver();
        boolean boolean19 = treeSetTestDriver17.add((java.lang.Object) 10.0f);
        experiment.util.TreeSetTestDriver treeSetTestDriver20 = new experiment.util.TreeSetTestDriver();
        boolean boolean21 = treeSetTestDriver20.isEmpty();
        experiment.util.Iterator iterator22 = treeSetTestDriver20.iterator();
        experiment.util.Iterator iterator23 = treeSetTestDriver20.iterator();
        boolean boolean25 = treeSetTestDriver20.contains((java.lang.Object) 10L);
        int int26 = treeSetTestDriver20.size();
        boolean boolean28 = treeSetTestDriver20.contains((java.lang.Object) (-1L));
        experiment.util.TreeSetTestDriver treeSetTestDriver29 = new experiment.util.TreeSetTestDriver();
        boolean boolean30 = treeSetTestDriver29.isEmpty();
        experiment.util.Iterator iterator31 = treeSetTestDriver29.iterator();
        experiment.util.Iterator iterator32 = treeSetTestDriver29.iterator();
        boolean boolean34 = treeSetTestDriver29.contains((java.lang.Object) 10L);
        int int35 = treeSetTestDriver29.size();
        boolean boolean37 = treeSetTestDriver29.contains((java.lang.Object) (-1L));
        int int38 = treeSetTestDriver29.size();
        java.lang.Object obj39 = treeSetTestDriver20.getMatch((java.lang.Object) int38);
        experiment.util.Iterator iterator40 = treeSetTestDriver20.iterator();
        experiment.util.Iterator iterator41 = treeSetTestDriver20.iterator();
        boolean boolean42 = treeSetTestDriver17.equals_CUT((java.lang.Object) iterator41);
        boolean boolean43 = treeSetTestDriver0.remove((java.lang.Object) treeSetTestDriver17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj44 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(comparator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(iterator40);
        org.junit.Assert.assertNotNull(iterator41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test043");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        boolean boolean2 = treeSetTestDriver0.isEmpty();
        boolean boolean3 = treeSetTestDriver0.isEmpty();
        boolean boolean4 = treeSetTestDriver0.isEmpty();
        experiment.util.TreeSetTestDriver treeSetTestDriver5 = new experiment.util.TreeSetTestDriver();
        boolean boolean6 = treeSetTestDriver5.isEmpty();
        experiment.util.Iterator iterator7 = treeSetTestDriver5.iterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = treeSetTestDriver0.contains((java.lang.Object) iterator7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet$TreeSetIterator cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(iterator7);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test044");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        boolean boolean2 = treeSetTestDriver0.isEmpty();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) 10.0d);
        boolean boolean5 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator6 = treeSetTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test045");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        boolean boolean3 = treeSetTestDriver0.remove((java.lang.Object) 100L);
        treeSetTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test046");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        experiment.util.Iterator iterator3 = treeSetTestDriver0.iterator();
        boolean boolean5 = treeSetTestDriver0.contains((java.lang.Object) 10L);
        int int6 = treeSetTestDriver0.size();
        boolean boolean8 = treeSetTestDriver0.contains((java.lang.Object) (-1L));
        int int9 = treeSetTestDriver0.size();
        experiment.util.TreeSetTestDriver treeSetTestDriver10 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator11 = treeSetTestDriver10.comparator();
        boolean boolean13 = treeSetTestDriver10.equals_CUT((java.lang.Object) (short) 1);
        boolean boolean14 = treeSetTestDriver0.remove((java.lang.Object) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test047");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        experiment.util.Iterator iterator3 = treeSetTestDriver0.iterator();
        java.lang.Object obj5 = treeSetTestDriver0.getMatch((java.lang.Object) 10.0f);
        experiment.util.TreeSetTestDriver treeSetTestDriver6 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator7 = treeSetTestDriver6.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver8 = new experiment.util.TreeSetTestDriver();
        boolean boolean9 = treeSetTestDriver8.isEmpty();
        experiment.util.Iterator iterator10 = treeSetTestDriver8.iterator();
        experiment.util.Iterator iterator11 = treeSetTestDriver8.iterator();
        boolean boolean13 = treeSetTestDriver8.contains((java.lang.Object) 10L);
        boolean boolean14 = treeSetTestDriver6.add((java.lang.Object) 10L);
        experiment.util.TreeSetTestDriver treeSetTestDriver15 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator16 = treeSetTestDriver15.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver17 = new experiment.util.TreeSetTestDriver();
        boolean boolean18 = treeSetTestDriver17.isEmpty();
        experiment.util.Iterator iterator19 = treeSetTestDriver17.iterator();
        experiment.util.Iterator iterator20 = treeSetTestDriver17.iterator();
        boolean boolean22 = treeSetTestDriver17.contains((java.lang.Object) 10L);
        boolean boolean23 = treeSetTestDriver15.add((java.lang.Object) 10L);
        boolean boolean24 = treeSetTestDriver6.equals_CUT((java.lang.Object) boolean23);
        boolean boolean25 = treeSetTestDriver0.equals_CUT((java.lang.Object) treeSetTestDriver6);
        int int26 = treeSetTestDriver6.size();
        experiment.util.TreeSetTestDriver treeSetTestDriver27 = new experiment.util.TreeSetTestDriver();
        boolean boolean28 = treeSetTestDriver27.isEmpty();
        boolean boolean29 = treeSetTestDriver27.isEmpty();
        boolean boolean30 = treeSetTestDriver27.isEmpty();
        boolean boolean31 = treeSetTestDriver27.isEmpty();
        experiment.util.TreeSetTestDriver treeSetTestDriver32 = new experiment.util.TreeSetTestDriver();
        boolean boolean33 = treeSetTestDriver32.isEmpty();
        boolean boolean34 = treeSetTestDriver32.isEmpty();
        boolean boolean36 = treeSetTestDriver32.remove((java.lang.Object) 10.0d);
        boolean boolean37 = treeSetTestDriver32.isEmpty();
        int int38 = treeSetTestDriver32.size();
        boolean boolean39 = treeSetTestDriver27.add((java.lang.Object) int38);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean40 = treeSetTestDriver6.remove((java.lang.Object) boolean39);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to java.lang.Boolean");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(comparator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(comparator16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test048");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver3 = new experiment.util.TreeSetTestDriver();
        boolean boolean4 = treeSetTestDriver3.isEmpty();
        boolean boolean5 = treeSetTestDriver3.isEmpty();
        boolean boolean6 = treeSetTestDriver0.remove((java.lang.Object) boolean5);
        experiment.util.TreeSetTestDriver treeSetTestDriver7 = new experiment.util.TreeSetTestDriver();
        boolean boolean8 = treeSetTestDriver7.isEmpty();
        experiment.util.Iterator iterator9 = treeSetTestDriver7.iterator();
        experiment.util.Iterator iterator10 = treeSetTestDriver7.iterator();
        java.lang.Object obj12 = treeSetTestDriver7.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator13 = treeSetTestDriver7.comparator();
        boolean boolean14 = treeSetTestDriver0.remove((java.lang.Object) treeSetTestDriver7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(comparator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test049");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        java.lang.Object[] objArray2 = treeSetTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test050");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        boolean boolean4 = treeSetTestDriver0.equals_CUT((java.lang.Object) 100L);
        boolean boolean5 = treeSetTestDriver0.isEmpty();
        int int6 = treeSetTestDriver0.size();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test051");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        boolean boolean3 = treeSetTestDriver0.remove((java.lang.Object) 100L);
        boolean boolean5 = treeSetTestDriver0.contains((java.lang.Object) ' ');
        boolean boolean7 = treeSetTestDriver0.add((java.lang.Object) 10);
        int int8 = treeSetTestDriver0.size();
        experiment.util.Iterator iterator9 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver10 = new experiment.util.TreeSetTestDriver();
        boolean boolean11 = treeSetTestDriver10.isEmpty();
        experiment.util.Iterator iterator12 = treeSetTestDriver10.iterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = treeSetTestDriver0.remove((java.lang.Object) iterator12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet$TreeSetIterator cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test052");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        experiment.util.Iterator iterator3 = treeSetTestDriver0.iterator();
        boolean boolean5 = treeSetTestDriver0.contains((java.lang.Object) 10L);
        int int6 = treeSetTestDriver0.size();
        java.lang.Object[] objArray7 = treeSetTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test053");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver3 = new experiment.util.TreeSetTestDriver();
        boolean boolean4 = treeSetTestDriver3.isEmpty();
        boolean boolean5 = treeSetTestDriver3.isEmpty();
        boolean boolean6 = treeSetTestDriver0.remove((java.lang.Object) boolean5);
        experiment.util.TreeSetTestDriver treeSetTestDriver7 = new experiment.util.TreeSetTestDriver();
        boolean boolean8 = treeSetTestDriver7.isEmpty();
        experiment.util.Iterator iterator9 = treeSetTestDriver7.iterator();
        experiment.util.Iterator iterator10 = treeSetTestDriver7.iterator();
        java.lang.Object obj12 = treeSetTestDriver7.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator13 = treeSetTestDriver7.comparator();
        boolean boolean14 = treeSetTestDriver0.remove((java.lang.Object) treeSetTestDriver7);
        boolean boolean16 = treeSetTestDriver0.remove((java.lang.Object) (byte) 1);
        boolean boolean18 = treeSetTestDriver0.contains((java.lang.Object) (short) -1);
        java.lang.Class<?> wildcardClass19 = treeSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(comparator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test054");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        boolean boolean2 = treeSetTestDriver0.isEmpty();
        boolean boolean3 = treeSetTestDriver0.isEmpty();
        boolean boolean4 = treeSetTestDriver0.isEmpty();
        int int5 = treeSetTestDriver0.size();
        java.lang.Object obj7 = treeSetTestDriver0.getMatch((java.lang.Object) 100L);
        experiment.util.TreeSetTestDriver treeSetTestDriver8 = new experiment.util.TreeSetTestDriver();
        boolean boolean9 = treeSetTestDriver8.isEmpty();
        experiment.util.Iterator iterator10 = treeSetTestDriver8.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver11 = new experiment.util.TreeSetTestDriver();
        boolean boolean12 = treeSetTestDriver11.isEmpty();
        boolean boolean13 = treeSetTestDriver11.isEmpty();
        boolean boolean14 = treeSetTestDriver8.remove((java.lang.Object) boolean13);
        int int15 = treeSetTestDriver8.size();
        experiment.util.TreeSetTestDriver treeSetTestDriver16 = new experiment.util.TreeSetTestDriver();
        boolean boolean17 = treeSetTestDriver16.isEmpty();
        experiment.util.Iterator iterator18 = treeSetTestDriver16.iterator();
        boolean boolean19 = treeSetTestDriver8.remove((java.lang.Object) iterator18);
        experiment.util.Iterator iterator20 = treeSetTestDriver8.iterator();
        java.lang.Object[] objArray21 = treeSetTestDriver8.toArray();
        boolean boolean22 = treeSetTestDriver0.remove((java.lang.Object) objArray21);
        experiment.util.TreeSetTestDriver treeSetTestDriver23 = new experiment.util.TreeSetTestDriver();
        boolean boolean24 = treeSetTestDriver23.isEmpty();
        experiment.util.Iterator iterator25 = treeSetTestDriver23.iterator();
        experiment.util.Iterator iterator26 = treeSetTestDriver23.iterator();
        boolean boolean28 = treeSetTestDriver23.contains((java.lang.Object) 10L);
        experiment.util.Iterator iterator29 = treeSetTestDriver23.iterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = treeSetTestDriver0.contains((java.lang.Object) treeSetTestDriver23);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(iterator29);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test055");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        boolean boolean2 = treeSetTestDriver0.isEmpty();
        boolean boolean3 = treeSetTestDriver0.isEmpty();
        experiment.util.TreeSetTestDriver treeSetTestDriver4 = new experiment.util.TreeSetTestDriver();
        boolean boolean5 = treeSetTestDriver4.isEmpty();
        experiment.util.Iterator iterator6 = treeSetTestDriver4.iterator();
        experiment.util.Iterator iterator7 = treeSetTestDriver4.iterator();
        java.lang.Object obj9 = treeSetTestDriver4.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator10 = treeSetTestDriver4.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver11 = new experiment.util.TreeSetTestDriver();
        boolean boolean12 = treeSetTestDriver11.isEmpty();
        boolean boolean13 = treeSetTestDriver11.isEmpty();
        boolean boolean14 = treeSetTestDriver11.isEmpty();
        boolean boolean16 = treeSetTestDriver11.contains((java.lang.Object) 1.0f);
        boolean boolean17 = treeSetTestDriver4.equals_CUT((java.lang.Object) 1.0f);
        java.lang.Object[] objArray18 = treeSetTestDriver4.toArray();
        boolean boolean19 = treeSetTestDriver4.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = treeSetTestDriver0.contains((java.lang.Object) treeSetTestDriver4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test056");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver2 = new experiment.util.TreeSetTestDriver();
        boolean boolean3 = treeSetTestDriver2.isEmpty();
        experiment.util.Iterator iterator4 = treeSetTestDriver2.iterator();
        experiment.util.Iterator iterator5 = treeSetTestDriver2.iterator();
        boolean boolean7 = treeSetTestDriver2.contains((java.lang.Object) 10L);
        boolean boolean8 = treeSetTestDriver0.add((java.lang.Object) 10L);
        experiment.util.TreeSetTestDriver treeSetTestDriver9 = new experiment.util.TreeSetTestDriver();
        boolean boolean10 = treeSetTestDriver9.isEmpty();
        boolean boolean12 = treeSetTestDriver9.remove((java.lang.Object) 100L);
        boolean boolean14 = treeSetTestDriver9.contains((java.lang.Object) ' ');
        boolean boolean16 = treeSetTestDriver9.add((java.lang.Object) 10);
        int int17 = treeSetTestDriver9.size();
        experiment.util.Iterator iterator18 = treeSetTestDriver9.iterator();
        treeSetTestDriver9.clear();
        experiment.util.Iterator iterator20 = treeSetTestDriver9.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = treeSetTestDriver0.getMatch((java.lang.Object) iterator20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet$TreeSetIterator cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(iterator20);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test057");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver3 = new experiment.util.TreeSetTestDriver();
        boolean boolean4 = treeSetTestDriver3.isEmpty();
        boolean boolean5 = treeSetTestDriver3.isEmpty();
        boolean boolean6 = treeSetTestDriver0.remove((java.lang.Object) boolean5);
        experiment.util.TreeSetTestDriver treeSetTestDriver7 = new experiment.util.TreeSetTestDriver();
        boolean boolean8 = treeSetTestDriver7.isEmpty();
        experiment.util.Iterator iterator9 = treeSetTestDriver7.iterator();
        experiment.util.Iterator iterator10 = treeSetTestDriver7.iterator();
        java.lang.Object obj12 = treeSetTestDriver7.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator13 = treeSetTestDriver7.comparator();
        boolean boolean14 = treeSetTestDriver0.remove((java.lang.Object) treeSetTestDriver7);
        boolean boolean16 = treeSetTestDriver0.remove((java.lang.Object) (byte) 1);
        experiment.util.TreeSetTestDriver treeSetTestDriver17 = new experiment.util.TreeSetTestDriver();
        boolean boolean19 = treeSetTestDriver17.add((java.lang.Object) 10.0f);
        experiment.util.TreeSetTestDriver treeSetTestDriver20 = new experiment.util.TreeSetTestDriver();
        boolean boolean21 = treeSetTestDriver20.isEmpty();
        experiment.util.Iterator iterator22 = treeSetTestDriver20.iterator();
        experiment.util.Iterator iterator23 = treeSetTestDriver20.iterator();
        boolean boolean25 = treeSetTestDriver20.contains((java.lang.Object) 10L);
        int int26 = treeSetTestDriver20.size();
        boolean boolean28 = treeSetTestDriver20.contains((java.lang.Object) (-1L));
        experiment.util.TreeSetTestDriver treeSetTestDriver29 = new experiment.util.TreeSetTestDriver();
        boolean boolean30 = treeSetTestDriver29.isEmpty();
        experiment.util.Iterator iterator31 = treeSetTestDriver29.iterator();
        experiment.util.Iterator iterator32 = treeSetTestDriver29.iterator();
        boolean boolean34 = treeSetTestDriver29.contains((java.lang.Object) 10L);
        int int35 = treeSetTestDriver29.size();
        boolean boolean37 = treeSetTestDriver29.contains((java.lang.Object) (-1L));
        int int38 = treeSetTestDriver29.size();
        java.lang.Object obj39 = treeSetTestDriver20.getMatch((java.lang.Object) int38);
        experiment.util.Iterator iterator40 = treeSetTestDriver20.iterator();
        experiment.util.Iterator iterator41 = treeSetTestDriver20.iterator();
        boolean boolean42 = treeSetTestDriver17.equals_CUT((java.lang.Object) iterator41);
        boolean boolean43 = treeSetTestDriver0.remove((java.lang.Object) treeSetTestDriver17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj44 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(comparator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(iterator40);
        org.junit.Assert.assertNotNull(iterator41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test058");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        boolean boolean2 = treeSetTestDriver0.isEmpty();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) 10.0d);
        treeSetTestDriver0.clear();
        experiment.util.Iterator iterator6 = treeSetTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test059");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        experiment.util.Iterator iterator3 = treeSetTestDriver0.iterator();
        boolean boolean5 = treeSetTestDriver0.contains((java.lang.Object) 10L);
        int int6 = treeSetTestDriver0.size();
        boolean boolean8 = treeSetTestDriver0.contains((java.lang.Object) (-1L));
        int int9 = treeSetTestDriver0.size();
        experiment.util.TreeSetTestDriver treeSetTestDriver10 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator11 = treeSetTestDriver10.comparator();
        boolean boolean13 = treeSetTestDriver10.equals_CUT((java.lang.Object) (short) 1);
        boolean boolean14 = treeSetTestDriver0.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator15 = treeSetTestDriver0.iterator();
        java.lang.Object obj16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = treeSetTestDriver0.contains(obj16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator15);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test060");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        experiment.util.Iterator iterator3 = treeSetTestDriver0.iterator();
        boolean boolean5 = treeSetTestDriver0.contains((java.lang.Object) 10L);
        int int6 = treeSetTestDriver0.size();
        boolean boolean8 = treeSetTestDriver0.contains((java.lang.Object) (-1L));
        experiment.util.TreeSetTestDriver treeSetTestDriver9 = new experiment.util.TreeSetTestDriver();
        boolean boolean10 = treeSetTestDriver9.isEmpty();
        experiment.util.Iterator iterator11 = treeSetTestDriver9.iterator();
        experiment.util.Iterator iterator12 = treeSetTestDriver9.iterator();
        boolean boolean14 = treeSetTestDriver9.contains((java.lang.Object) 10L);
        int int15 = treeSetTestDriver9.size();
        boolean boolean17 = treeSetTestDriver9.contains((java.lang.Object) (-1L));
        int int18 = treeSetTestDriver9.size();
        java.lang.Object obj19 = treeSetTestDriver0.getMatch((java.lang.Object) int18);
        experiment.util.Iterator iterator20 = treeSetTestDriver0.iterator();
        experiment.util.Iterator iterator21 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver22 = new experiment.util.TreeSetTestDriver();
        boolean boolean23 = treeSetTestDriver22.isEmpty();
        boolean boolean24 = treeSetTestDriver22.isEmpty();
        boolean boolean25 = treeSetTestDriver0.equals_CUT((java.lang.Object) boolean24);
        treeSetTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test061");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver3 = new experiment.util.TreeSetTestDriver();
        boolean boolean4 = treeSetTestDriver3.isEmpty();
        boolean boolean5 = treeSetTestDriver3.isEmpty();
        boolean boolean6 = treeSetTestDriver0.remove((java.lang.Object) boolean5);
        experiment.util.TreeSetTestDriver treeSetTestDriver7 = new experiment.util.TreeSetTestDriver();
        boolean boolean8 = treeSetTestDriver7.isEmpty();
        experiment.util.Iterator iterator9 = treeSetTestDriver7.iterator();
        experiment.util.Iterator iterator10 = treeSetTestDriver7.iterator();
        java.lang.Object obj12 = treeSetTestDriver7.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator13 = treeSetTestDriver7.comparator();
        boolean boolean14 = treeSetTestDriver0.remove((java.lang.Object) treeSetTestDriver7);
        boolean boolean16 = treeSetTestDriver0.remove((java.lang.Object) (byte) 1);
        experiment.util.TreeSetTestDriver treeSetTestDriver17 = new experiment.util.TreeSetTestDriver();
        boolean boolean18 = treeSetTestDriver17.isEmpty();
        boolean boolean20 = treeSetTestDriver17.remove((java.lang.Object) 100L);
        treeSetTestDriver17.clear();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = treeSetTestDriver0.contains((java.lang.Object) treeSetTestDriver17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(comparator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test062");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        boolean boolean3 = treeSetTestDriver0.remove((java.lang.Object) 100L);
        treeSetTestDriver0.clear();
        experiment.util.TreeSetTestDriver treeSetTestDriver5 = new experiment.util.TreeSetTestDriver();
        boolean boolean6 = treeSetTestDriver5.isEmpty();
        experiment.util.Iterator iterator7 = treeSetTestDriver5.iterator();
        int int8 = treeSetTestDriver5.size();
        boolean boolean9 = treeSetTestDriver0.contains((java.lang.Object) int8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test063");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        boolean boolean3 = treeSetTestDriver0.remove((java.lang.Object) 100L);
        boolean boolean5 = treeSetTestDriver0.contains((java.lang.Object) ' ');
        boolean boolean7 = treeSetTestDriver0.add((java.lang.Object) 10);
        int int8 = treeSetTestDriver0.size();
        experiment.util.Comparator comparator9 = treeSetTestDriver0.comparator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(comparator9);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test064");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        experiment.util.Iterator iterator3 = treeSetTestDriver0.iterator();
        boolean boolean5 = treeSetTestDriver0.contains((java.lang.Object) 10L);
        experiment.util.Iterator iterator6 = treeSetTestDriver0.iterator();
        boolean boolean8 = treeSetTestDriver0.equals_CUT((java.lang.Object) "hi!");
        experiment.util.Comparator comparator9 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver10 = new experiment.util.TreeSetTestDriver();
        boolean boolean11 = treeSetTestDriver10.isEmpty();
        experiment.util.Iterator iterator12 = treeSetTestDriver10.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver13 = new experiment.util.TreeSetTestDriver();
        boolean boolean14 = treeSetTestDriver13.isEmpty();
        boolean boolean15 = treeSetTestDriver13.isEmpty();
        boolean boolean16 = treeSetTestDriver10.remove((java.lang.Object) boolean15);
        experiment.util.TreeSetTestDriver treeSetTestDriver17 = new experiment.util.TreeSetTestDriver();
        boolean boolean18 = treeSetTestDriver17.isEmpty();
        experiment.util.Iterator iterator19 = treeSetTestDriver17.iterator();
        experiment.util.Iterator iterator20 = treeSetTestDriver17.iterator();
        java.lang.Object obj22 = treeSetTestDriver17.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator23 = treeSetTestDriver17.comparator();
        boolean boolean24 = treeSetTestDriver10.remove((java.lang.Object) treeSetTestDriver17);
        java.lang.Class<?> wildcardClass25 = treeSetTestDriver17.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = treeSetTestDriver0.contains((java.lang.Object) treeSetTestDriver17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(comparator23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test065");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        experiment.util.Iterator iterator3 = treeSetTestDriver0.iterator();
        boolean boolean5 = treeSetTestDriver0.contains((java.lang.Object) 10L);
        experiment.util.Iterator iterator6 = treeSetTestDriver0.iterator();
        boolean boolean8 = treeSetTestDriver0.equals_CUT((java.lang.Object) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test066");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        experiment.util.Iterator iterator3 = treeSetTestDriver0.iterator();
        java.lang.Object obj5 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator6 = treeSetTestDriver0.comparator();
        boolean boolean8 = treeSetTestDriver0.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.TreeSetTestDriver treeSetTestDriver9 = new experiment.util.TreeSetTestDriver();
        boolean boolean10 = treeSetTestDriver9.isEmpty();
        boolean boolean11 = treeSetTestDriver9.isEmpty();
        boolean boolean12 = treeSetTestDriver9.isEmpty();
        boolean boolean13 = treeSetTestDriver9.isEmpty();
        int int14 = treeSetTestDriver9.size();
        experiment.util.TreeSetTestDriver treeSetTestDriver15 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator16 = treeSetTestDriver15.comparator();
        java.lang.Object[] objArray17 = treeSetTestDriver15.toArray();
        boolean boolean18 = treeSetTestDriver9.add((java.lang.Object) treeSetTestDriver15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = treeSetTestDriver0.getMatch((java.lang.Object) treeSetTestDriver9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(comparator16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test067");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver3 = new experiment.util.TreeSetTestDriver();
        boolean boolean4 = treeSetTestDriver3.isEmpty();
        boolean boolean5 = treeSetTestDriver3.isEmpty();
        boolean boolean6 = treeSetTestDriver0.remove((java.lang.Object) boolean5);
        experiment.util.TreeSetTestDriver treeSetTestDriver7 = new experiment.util.TreeSetTestDriver();
        boolean boolean8 = treeSetTestDriver7.isEmpty();
        experiment.util.Iterator iterator9 = treeSetTestDriver7.iterator();
        experiment.util.Iterator iterator10 = treeSetTestDriver7.iterator();
        java.lang.Object obj12 = treeSetTestDriver7.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator13 = treeSetTestDriver7.comparator();
        boolean boolean14 = treeSetTestDriver0.remove((java.lang.Object) treeSetTestDriver7);
        boolean boolean16 = treeSetTestDriver7.add((java.lang.Object) (short) 1);
        experiment.util.TreeSetTestDriver treeSetTestDriver17 = new experiment.util.TreeSetTestDriver();
        boolean boolean18 = treeSetTestDriver17.isEmpty();
        experiment.util.Iterator iterator19 = treeSetTestDriver17.iterator();
        experiment.util.Iterator iterator20 = treeSetTestDriver17.iterator();
        boolean boolean22 = treeSetTestDriver17.contains((java.lang.Object) 10L);
        java.lang.Object[] objArray23 = treeSetTestDriver17.toArray();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = treeSetTestDriver7.add((java.lang.Object) treeSetTestDriver17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(comparator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test068");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        boolean boolean2 = treeSetTestDriver0.isEmpty();
        boolean boolean3 = treeSetTestDriver0.isEmpty();
        treeSetTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test069");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        experiment.util.Iterator iterator3 = treeSetTestDriver0.iterator();
        boolean boolean5 = treeSetTestDriver0.contains((java.lang.Object) 10L);
        int int6 = treeSetTestDriver0.size();
        boolean boolean8 = treeSetTestDriver0.contains((java.lang.Object) (-1L));
        experiment.util.TreeSetTestDriver treeSetTestDriver9 = new experiment.util.TreeSetTestDriver();
        boolean boolean10 = treeSetTestDriver9.isEmpty();
        experiment.util.Iterator iterator11 = treeSetTestDriver9.iterator();
        experiment.util.Iterator iterator12 = treeSetTestDriver9.iterator();
        boolean boolean14 = treeSetTestDriver9.contains((java.lang.Object) 10L);
        int int15 = treeSetTestDriver9.size();
        boolean boolean17 = treeSetTestDriver9.contains((java.lang.Object) (-1L));
        int int18 = treeSetTestDriver9.size();
        java.lang.Object obj19 = treeSetTestDriver0.getMatch((java.lang.Object) int18);
        experiment.util.Iterator iterator20 = treeSetTestDriver0.iterator();
        experiment.util.Iterator iterator21 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver22 = new experiment.util.TreeSetTestDriver();
        boolean boolean23 = treeSetTestDriver22.isEmpty();
        boolean boolean24 = treeSetTestDriver22.isEmpty();
        boolean boolean25 = treeSetTestDriver0.equals_CUT((java.lang.Object) boolean24);
        experiment.util.TreeSetTestDriver treeSetTestDriver26 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator27 = treeSetTestDriver26.comparator();
        boolean boolean28 = treeSetTestDriver26.isEmpty();
        experiment.util.Iterator iterator29 = treeSetTestDriver26.iterator();
        boolean boolean30 = treeSetTestDriver0.remove((java.lang.Object) treeSetTestDriver26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(comparator27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test070");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver2 = new experiment.util.TreeSetTestDriver();
        boolean boolean3 = treeSetTestDriver2.isEmpty();
        experiment.util.Iterator iterator4 = treeSetTestDriver2.iterator();
        experiment.util.Iterator iterator5 = treeSetTestDriver2.iterator();
        boolean boolean7 = treeSetTestDriver2.contains((java.lang.Object) 10L);
        boolean boolean8 = treeSetTestDriver0.add((java.lang.Object) 10L);
        experiment.util.TreeSetTestDriver treeSetTestDriver9 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator10 = treeSetTestDriver9.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver11 = new experiment.util.TreeSetTestDriver();
        boolean boolean12 = treeSetTestDriver11.isEmpty();
        experiment.util.Iterator iterator13 = treeSetTestDriver11.iterator();
        experiment.util.Iterator iterator14 = treeSetTestDriver11.iterator();
        boolean boolean16 = treeSetTestDriver11.contains((java.lang.Object) 10L);
        boolean boolean17 = treeSetTestDriver9.add((java.lang.Object) 10L);
        boolean boolean18 = treeSetTestDriver0.equals_CUT((java.lang.Object) boolean17);
        experiment.util.Iterator iterator19 = treeSetTestDriver0.iterator();
        treeSetTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(iterator19);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test071");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        boolean boolean3 = treeSetTestDriver0.remove((java.lang.Object) 100L);
        boolean boolean5 = treeSetTestDriver0.contains((java.lang.Object) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test072");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        experiment.util.Iterator iterator3 = treeSetTestDriver0.iterator();
        boolean boolean5 = treeSetTestDriver0.contains((java.lang.Object) 10L);
        int int6 = treeSetTestDriver0.size();
        boolean boolean8 = treeSetTestDriver0.contains((java.lang.Object) (-1L));
        experiment.util.TreeSetTestDriver treeSetTestDriver9 = new experiment.util.TreeSetTestDriver();
        boolean boolean10 = treeSetTestDriver9.isEmpty();
        experiment.util.Iterator iterator11 = treeSetTestDriver9.iterator();
        experiment.util.Iterator iterator12 = treeSetTestDriver9.iterator();
        boolean boolean14 = treeSetTestDriver9.contains((java.lang.Object) 10L);
        int int15 = treeSetTestDriver9.size();
        boolean boolean17 = treeSetTestDriver9.contains((java.lang.Object) (-1L));
        int int18 = treeSetTestDriver9.size();
        java.lang.Object obj19 = treeSetTestDriver0.getMatch((java.lang.Object) int18);
        boolean boolean20 = treeSetTestDriver0.isEmpty();
        experiment.util.TreeSetTestDriver treeSetTestDriver21 = new experiment.util.TreeSetTestDriver();
        boolean boolean22 = treeSetTestDriver21.isEmpty();
        experiment.util.Iterator iterator23 = treeSetTestDriver21.iterator();
        experiment.util.Iterator iterator24 = treeSetTestDriver21.iterator();
        java.lang.Object obj26 = treeSetTestDriver21.getMatch((java.lang.Object) 10.0f);
        experiment.util.TreeSetTestDriver treeSetTestDriver27 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator28 = treeSetTestDriver27.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver29 = new experiment.util.TreeSetTestDriver();
        boolean boolean30 = treeSetTestDriver29.isEmpty();
        experiment.util.Iterator iterator31 = treeSetTestDriver29.iterator();
        experiment.util.Iterator iterator32 = treeSetTestDriver29.iterator();
        boolean boolean34 = treeSetTestDriver29.contains((java.lang.Object) 10L);
        boolean boolean35 = treeSetTestDriver27.add((java.lang.Object) 10L);
        experiment.util.TreeSetTestDriver treeSetTestDriver36 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator37 = treeSetTestDriver36.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver38 = new experiment.util.TreeSetTestDriver();
        boolean boolean39 = treeSetTestDriver38.isEmpty();
        experiment.util.Iterator iterator40 = treeSetTestDriver38.iterator();
        experiment.util.Iterator iterator41 = treeSetTestDriver38.iterator();
        boolean boolean43 = treeSetTestDriver38.contains((java.lang.Object) 10L);
        boolean boolean44 = treeSetTestDriver36.add((java.lang.Object) 10L);
        boolean boolean45 = treeSetTestDriver27.equals_CUT((java.lang.Object) boolean44);
        boolean boolean46 = treeSetTestDriver21.equals_CUT((java.lang.Object) treeSetTestDriver27);
        boolean boolean47 = treeSetTestDriver27.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj48 = treeSetTestDriver0.getMatch((java.lang.Object) treeSetTestDriver27);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(comparator28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(comparator37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(iterator40);
        org.junit.Assert.assertNotNull(iterator41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test073");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        boolean boolean3 = treeSetTestDriver0.remove((java.lang.Object) 100L);
        boolean boolean5 = treeSetTestDriver0.contains((java.lang.Object) ' ');
        boolean boolean7 = treeSetTestDriver0.add((java.lang.Object) 10);
        int int8 = treeSetTestDriver0.size();
        experiment.util.Iterator iterator9 = treeSetTestDriver0.iterator();
        treeSetTestDriver0.clear();
        experiment.util.TreeSetTestDriver treeSetTestDriver11 = new experiment.util.TreeSetTestDriver();
        boolean boolean12 = treeSetTestDriver11.isEmpty();
        experiment.util.Iterator iterator13 = treeSetTestDriver11.iterator();
        experiment.util.Iterator iterator14 = treeSetTestDriver11.iterator();
        boolean boolean16 = treeSetTestDriver11.contains((java.lang.Object) 10L);
        int int17 = treeSetTestDriver11.size();
        java.lang.Object[] objArray18 = treeSetTestDriver11.toArray();
        boolean boolean19 = treeSetTestDriver0.remove((java.lang.Object) objArray18);
        experiment.util.TreeSetTestDriver treeSetTestDriver20 = new experiment.util.TreeSetTestDriver();
        boolean boolean21 = treeSetTestDriver20.isEmpty();
        boolean boolean23 = treeSetTestDriver20.remove((java.lang.Object) 100L);
        boolean boolean25 = treeSetTestDriver20.contains((java.lang.Object) ' ');
        boolean boolean27 = treeSetTestDriver20.add((java.lang.Object) 10);
        int int28 = treeSetTestDriver20.size();
        experiment.util.Iterator iterator29 = treeSetTestDriver20.iterator();
        experiment.util.Iterator iterator30 = treeSetTestDriver20.iterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = treeSetTestDriver0.contains((java.lang.Object) treeSetTestDriver20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertNotNull(iterator30);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test074");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        boolean boolean2 = treeSetTestDriver0.isEmpty();
        boolean boolean3 = treeSetTestDriver0.isEmpty();
        experiment.util.TreeSetTestDriver treeSetTestDriver4 = new experiment.util.TreeSetTestDriver();
        boolean boolean5 = treeSetTestDriver4.isEmpty();
        experiment.util.Iterator iterator6 = treeSetTestDriver4.iterator();
        experiment.util.Iterator iterator7 = treeSetTestDriver4.iterator();
        boolean boolean9 = treeSetTestDriver4.contains((java.lang.Object) 10L);
        int int10 = treeSetTestDriver4.size();
        boolean boolean12 = treeSetTestDriver4.contains((java.lang.Object) (-1L));
        boolean boolean13 = treeSetTestDriver0.equals_CUT((java.lang.Object) treeSetTestDriver4);
        experiment.util.TreeSetTestDriver treeSetTestDriver14 = new experiment.util.TreeSetTestDriver();
        boolean boolean15 = treeSetTestDriver14.isEmpty();
        experiment.util.Iterator iterator16 = treeSetTestDriver14.iterator();
        experiment.util.Iterator iterator17 = treeSetTestDriver14.iterator();
        boolean boolean19 = treeSetTestDriver14.contains((java.lang.Object) 10L);
        experiment.util.Iterator iterator20 = treeSetTestDriver14.iterator();
        boolean boolean22 = treeSetTestDriver14.equals_CUT((java.lang.Object) "hi!");
        experiment.util.Comparator comparator23 = treeSetTestDriver14.comparator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = treeSetTestDriver4.contains((java.lang.Object) treeSetTestDriver14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(comparator23);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test075");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        experiment.util.Iterator iterator3 = treeSetTestDriver0.iterator();
        java.lang.Object obj5 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator6 = treeSetTestDriver0.comparator();
        boolean boolean7 = treeSetTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test076");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        experiment.util.Iterator iterator3 = treeSetTestDriver0.iterator();
        boolean boolean5 = treeSetTestDriver0.contains((java.lang.Object) 10L);
        experiment.util.Iterator iterator6 = treeSetTestDriver0.iterator();
        boolean boolean8 = treeSetTestDriver0.equals_CUT((java.lang.Object) "hi!");
        experiment.util.TreeSetTestDriver treeSetTestDriver9 = new experiment.util.TreeSetTestDriver();
        boolean boolean10 = treeSetTestDriver9.isEmpty();
        boolean boolean11 = treeSetTestDriver9.isEmpty();
        java.lang.Class<?> wildcardClass12 = treeSetTestDriver9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = treeSetTestDriver0.getMatch((java.lang.Object) wildcardClass12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test077");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        experiment.util.Iterator iterator3 = treeSetTestDriver0.iterator();
        java.lang.Object obj5 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator6 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver7 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator8 = treeSetTestDriver7.comparator();
        java.lang.Object[] objArray9 = treeSetTestDriver7.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = treeSetTestDriver0.getMatch((java.lang.Object) treeSetTestDriver7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertNull(comparator8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test078");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver2 = new experiment.util.TreeSetTestDriver();
        boolean boolean3 = treeSetTestDriver2.isEmpty();
        experiment.util.Iterator iterator4 = treeSetTestDriver2.iterator();
        experiment.util.Iterator iterator5 = treeSetTestDriver2.iterator();
        boolean boolean7 = treeSetTestDriver2.contains((java.lang.Object) 10L);
        boolean boolean8 = treeSetTestDriver0.add((java.lang.Object) 10L);
        experiment.util.TreeSetTestDriver treeSetTestDriver9 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator10 = treeSetTestDriver9.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver11 = new experiment.util.TreeSetTestDriver();
        boolean boolean12 = treeSetTestDriver11.isEmpty();
        experiment.util.Iterator iterator13 = treeSetTestDriver11.iterator();
        experiment.util.Iterator iterator14 = treeSetTestDriver11.iterator();
        boolean boolean16 = treeSetTestDriver11.contains((java.lang.Object) 10L);
        boolean boolean17 = treeSetTestDriver9.add((java.lang.Object) 10L);
        boolean boolean18 = treeSetTestDriver0.equals_CUT((java.lang.Object) boolean17);
        int int19 = treeSetTestDriver0.size();
        java.lang.Class<?> wildcardClass20 = treeSetTestDriver0.getClass();
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test079");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        int int3 = treeSetTestDriver0.size();
        experiment.util.TreeSetTestDriver treeSetTestDriver4 = new experiment.util.TreeSetTestDriver();
        boolean boolean5 = treeSetTestDriver4.isEmpty();
        experiment.util.Iterator iterator6 = treeSetTestDriver4.iterator();
        experiment.util.Iterator iterator7 = treeSetTestDriver4.iterator();
        java.lang.Object obj9 = treeSetTestDriver4.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator10 = treeSetTestDriver4.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver11 = new experiment.util.TreeSetTestDriver();
        boolean boolean12 = treeSetTestDriver11.isEmpty();
        boolean boolean13 = treeSetTestDriver11.isEmpty();
        boolean boolean14 = treeSetTestDriver11.isEmpty();
        boolean boolean16 = treeSetTestDriver11.contains((java.lang.Object) 1.0f);
        boolean boolean17 = treeSetTestDriver4.equals_CUT((java.lang.Object) 1.0f);
        java.lang.Object[] objArray18 = treeSetTestDriver4.toArray();
        int int19 = treeSetTestDriver4.size();
        experiment.util.TreeSetTestDriver treeSetTestDriver20 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator21 = treeSetTestDriver20.comparator();
        boolean boolean22 = treeSetTestDriver20.isEmpty();
        boolean boolean23 = treeSetTestDriver20.isEmpty();
        boolean boolean24 = treeSetTestDriver4.equals_CUT((java.lang.Object) treeSetTestDriver20);
        boolean boolean25 = treeSetTestDriver0.equals_CUT((java.lang.Object) treeSetTestDriver20);
        experiment.util.TreeSetTestDriver treeSetTestDriver26 = new experiment.util.TreeSetTestDriver();
        boolean boolean27 = treeSetTestDriver26.isEmpty();
        boolean boolean28 = treeSetTestDriver26.isEmpty();
        boolean boolean30 = treeSetTestDriver26.remove((java.lang.Object) 10.0d);
        boolean boolean31 = treeSetTestDriver26.isEmpty();
        int int32 = treeSetTestDriver26.size();
        experiment.util.Iterator iterator33 = treeSetTestDriver26.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = treeSetTestDriver0.getMatch((java.lang.Object) treeSetTestDriver26);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(comparator21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(iterator33);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test080");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        boolean boolean2 = treeSetTestDriver0.isEmpty();
        boolean boolean3 = treeSetTestDriver0.isEmpty();
        experiment.util.TreeSetTestDriver treeSetTestDriver4 = new experiment.util.TreeSetTestDriver();
        boolean boolean6 = treeSetTestDriver4.add((java.lang.Object) 10.0f);
        boolean boolean7 = treeSetTestDriver0.contains((java.lang.Object) boolean6);
        experiment.util.TreeSetTestDriver treeSetTestDriver8 = new experiment.util.TreeSetTestDriver();
        boolean boolean9 = treeSetTestDriver8.isEmpty();
        boolean boolean10 = treeSetTestDriver8.isEmpty();
        boolean boolean11 = treeSetTestDriver8.isEmpty();
        boolean boolean12 = treeSetTestDriver8.isEmpty();
        int int13 = treeSetTestDriver8.size();
        experiment.util.TreeSetTestDriver treeSetTestDriver14 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator15 = treeSetTestDriver14.comparator();
        java.lang.Object[] objArray16 = treeSetTestDriver14.toArray();
        boolean boolean17 = treeSetTestDriver8.add((java.lang.Object) treeSetTestDriver14);
        boolean boolean18 = treeSetTestDriver0.equals_CUT((java.lang.Object) treeSetTestDriver8);
        java.lang.Object[] objArray19 = treeSetTestDriver8.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver20 = new experiment.util.TreeSetTestDriver();
        boolean boolean22 = treeSetTestDriver20.equals_CUT((java.lang.Object) 100.0f);
        experiment.util.Comparator comparator23 = treeSetTestDriver20.comparator();
        int int24 = treeSetTestDriver20.size();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = treeSetTestDriver8.remove((java.lang.Object) treeSetTestDriver20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(comparator15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(comparator23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test081");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        boolean boolean2 = treeSetTestDriver0.isEmpty();
        boolean boolean3 = treeSetTestDriver0.isEmpty();
        boolean boolean5 = treeSetTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean7 = treeSetTestDriver0.contains((java.lang.Object) 1.0f);
        experiment.util.TreeSetTestDriver treeSetTestDriver8 = new experiment.util.TreeSetTestDriver();
        boolean boolean9 = treeSetTestDriver8.isEmpty();
        boolean boolean10 = treeSetTestDriver8.isEmpty();
        boolean boolean12 = treeSetTestDriver8.remove((java.lang.Object) 10.0d);
        treeSetTestDriver8.clear();
        experiment.util.Iterator iterator14 = treeSetTestDriver8.iterator();
        boolean boolean15 = treeSetTestDriver0.add((java.lang.Object) iterator14);
        experiment.util.TreeSetTestDriver treeSetTestDriver16 = new experiment.util.TreeSetTestDriver();
        boolean boolean17 = treeSetTestDriver16.isEmpty();
        experiment.util.Iterator iterator18 = treeSetTestDriver16.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver19 = new experiment.util.TreeSetTestDriver();
        boolean boolean20 = treeSetTestDriver19.isEmpty();
        boolean boolean21 = treeSetTestDriver19.isEmpty();
        boolean boolean22 = treeSetTestDriver16.remove((java.lang.Object) boolean21);
        int int23 = treeSetTestDriver16.size();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = treeSetTestDriver0.remove((java.lang.Object) int23);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet$TreeSetIterator cannot be cast to java.lang.Integer");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test082");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        experiment.util.Iterator iterator3 = treeSetTestDriver0.iterator();
        boolean boolean5 = treeSetTestDriver0.contains((java.lang.Object) 10L);
        int int6 = treeSetTestDriver0.size();
        boolean boolean8 = treeSetTestDriver0.contains((java.lang.Object) (-1L));
        experiment.util.TreeSetTestDriver treeSetTestDriver9 = new experiment.util.TreeSetTestDriver();
        boolean boolean10 = treeSetTestDriver9.isEmpty();
        experiment.util.Iterator iterator11 = treeSetTestDriver9.iterator();
        experiment.util.Iterator iterator12 = treeSetTestDriver9.iterator();
        boolean boolean14 = treeSetTestDriver9.contains((java.lang.Object) 10L);
        int int15 = treeSetTestDriver9.size();
        boolean boolean17 = treeSetTestDriver9.contains((java.lang.Object) (-1L));
        int int18 = treeSetTestDriver9.size();
        java.lang.Object obj19 = treeSetTestDriver0.getMatch((java.lang.Object) int18);
        experiment.util.Iterator iterator20 = treeSetTestDriver0.iterator();
        treeSetTestDriver0.clear();
        experiment.util.Comparator comparator22 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver23 = new experiment.util.TreeSetTestDriver();
        boolean boolean24 = treeSetTestDriver23.isEmpty();
        experiment.util.Iterator iterator25 = treeSetTestDriver23.iterator();
        experiment.util.Iterator iterator26 = treeSetTestDriver23.iterator();
        boolean boolean28 = treeSetTestDriver23.contains((java.lang.Object) 10L);
        int int29 = treeSetTestDriver23.size();
        boolean boolean31 = treeSetTestDriver23.contains((java.lang.Object) (-1L));
        int int32 = treeSetTestDriver23.size();
        java.lang.Object[] objArray33 = treeSetTestDriver23.toArray();
        int int34 = treeSetTestDriver23.size();
        boolean boolean35 = treeSetTestDriver0.remove((java.lang.Object) int34);
        java.lang.Object obj36 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean37 = treeSetTestDriver0.equals_CUT(obj36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNull(comparator22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test083");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        experiment.util.Iterator iterator3 = treeSetTestDriver0.iterator();
        java.lang.Object obj5 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator6 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver7 = new experiment.util.TreeSetTestDriver();
        boolean boolean8 = treeSetTestDriver7.isEmpty();
        boolean boolean9 = treeSetTestDriver7.isEmpty();
        boolean boolean10 = treeSetTestDriver7.isEmpty();
        boolean boolean12 = treeSetTestDriver7.contains((java.lang.Object) 1.0f);
        boolean boolean13 = treeSetTestDriver0.equals_CUT((java.lang.Object) 1.0f);
        java.lang.Object[] objArray14 = treeSetTestDriver0.toArray();
        int int15 = treeSetTestDriver0.size();
        experiment.util.TreeSetTestDriver treeSetTestDriver16 = new experiment.util.TreeSetTestDriver();
        boolean boolean17 = treeSetTestDriver16.isEmpty();
        experiment.util.Iterator iterator18 = treeSetTestDriver16.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver19 = new experiment.util.TreeSetTestDriver();
        boolean boolean20 = treeSetTestDriver19.isEmpty();
        boolean boolean21 = treeSetTestDriver19.isEmpty();
        boolean boolean22 = treeSetTestDriver16.remove((java.lang.Object) boolean21);
        java.lang.Class<?> wildcardClass23 = treeSetTestDriver16.getClass();
        boolean boolean24 = treeSetTestDriver0.remove((java.lang.Object) wildcardClass23);
        treeSetTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test084");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        experiment.util.Iterator iterator3 = treeSetTestDriver0.iterator();
        java.lang.Object obj5 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator6 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver7 = new experiment.util.TreeSetTestDriver();
        boolean boolean8 = treeSetTestDriver7.isEmpty();
        boolean boolean9 = treeSetTestDriver7.isEmpty();
        boolean boolean10 = treeSetTestDriver7.isEmpty();
        boolean boolean12 = treeSetTestDriver7.contains((java.lang.Object) 1.0f);
        boolean boolean13 = treeSetTestDriver0.equals_CUT((java.lang.Object) 1.0f);
        experiment.util.TreeSetTestDriver treeSetTestDriver14 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator15 = treeSetTestDriver14.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver16 = new experiment.util.TreeSetTestDriver();
        boolean boolean17 = treeSetTestDriver16.isEmpty();
        experiment.util.Iterator iterator18 = treeSetTestDriver16.iterator();
        experiment.util.Iterator iterator19 = treeSetTestDriver16.iterator();
        boolean boolean21 = treeSetTestDriver16.contains((java.lang.Object) 10L);
        boolean boolean22 = treeSetTestDriver14.add((java.lang.Object) 10L);
        experiment.util.TreeSetTestDriver treeSetTestDriver23 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator24 = treeSetTestDriver23.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver25 = new experiment.util.TreeSetTestDriver();
        boolean boolean26 = treeSetTestDriver25.isEmpty();
        experiment.util.Iterator iterator27 = treeSetTestDriver25.iterator();
        experiment.util.Iterator iterator28 = treeSetTestDriver25.iterator();
        boolean boolean30 = treeSetTestDriver25.contains((java.lang.Object) 10L);
        boolean boolean31 = treeSetTestDriver23.add((java.lang.Object) 10L);
        boolean boolean32 = treeSetTestDriver14.equals_CUT((java.lang.Object) boolean31);
        experiment.util.Iterator iterator33 = treeSetTestDriver14.iterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = treeSetTestDriver0.contains((java.lang.Object) treeSetTestDriver14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(comparator15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(comparator24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(iterator33);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test085");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        experiment.util.Comparator comparator2 = treeSetTestDriver0.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNull(comparator2);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test086");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver2 = new experiment.util.TreeSetTestDriver();
        boolean boolean3 = treeSetTestDriver2.isEmpty();
        experiment.util.Iterator iterator4 = treeSetTestDriver2.iterator();
        experiment.util.Iterator iterator5 = treeSetTestDriver2.iterator();
        boolean boolean7 = treeSetTestDriver2.contains((java.lang.Object) 10L);
        boolean boolean8 = treeSetTestDriver0.add((java.lang.Object) 10L);
        experiment.util.TreeSetTestDriver treeSetTestDriver9 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator10 = treeSetTestDriver9.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver11 = new experiment.util.TreeSetTestDriver();
        boolean boolean12 = treeSetTestDriver11.isEmpty();
        experiment.util.Iterator iterator13 = treeSetTestDriver11.iterator();
        experiment.util.Iterator iterator14 = treeSetTestDriver11.iterator();
        boolean boolean16 = treeSetTestDriver11.contains((java.lang.Object) 10L);
        boolean boolean17 = treeSetTestDriver9.add((java.lang.Object) 10L);
        boolean boolean18 = treeSetTestDriver0.equals_CUT((java.lang.Object) boolean17);
        experiment.util.TreeSetTestDriver treeSetTestDriver19 = new experiment.util.TreeSetTestDriver();
        boolean boolean20 = treeSetTestDriver19.isEmpty();
        experiment.util.Iterator iterator21 = treeSetTestDriver19.iterator();
        experiment.util.Iterator iterator22 = treeSetTestDriver19.iterator();
        java.lang.Object obj24 = treeSetTestDriver19.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator25 = treeSetTestDriver19.comparator();
        boolean boolean27 = treeSetTestDriver19.equals_CUT((java.lang.Object) 1.0d);
        treeSetTestDriver19.clear();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = treeSetTestDriver0.add((java.lang.Object) treeSetTestDriver19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(comparator25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test087");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        boolean boolean2 = treeSetTestDriver0.isEmpty();
        boolean boolean3 = treeSetTestDriver0.isEmpty();
        experiment.util.TreeSetTestDriver treeSetTestDriver4 = new experiment.util.TreeSetTestDriver();
        boolean boolean6 = treeSetTestDriver4.add((java.lang.Object) 10.0f);
        boolean boolean7 = treeSetTestDriver0.contains((java.lang.Object) boolean6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test088");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        experiment.util.Iterator iterator3 = treeSetTestDriver0.iterator();
        java.lang.Object obj5 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        boolean boolean7 = treeSetTestDriver0.equals_CUT((java.lang.Object) 0);
        boolean boolean9 = treeSetTestDriver0.remove((java.lang.Object) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test089");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        experiment.util.Iterator iterator3 = treeSetTestDriver0.iterator();
        java.lang.Object obj5 = treeSetTestDriver0.getMatch((java.lang.Object) 10.0f);
        experiment.util.TreeSetTestDriver treeSetTestDriver6 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator7 = treeSetTestDriver6.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver8 = new experiment.util.TreeSetTestDriver();
        boolean boolean9 = treeSetTestDriver8.isEmpty();
        experiment.util.Iterator iterator10 = treeSetTestDriver8.iterator();
        experiment.util.Iterator iterator11 = treeSetTestDriver8.iterator();
        boolean boolean13 = treeSetTestDriver8.contains((java.lang.Object) 10L);
        boolean boolean14 = treeSetTestDriver6.add((java.lang.Object) 10L);
        experiment.util.TreeSetTestDriver treeSetTestDriver15 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator16 = treeSetTestDriver15.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver17 = new experiment.util.TreeSetTestDriver();
        boolean boolean18 = treeSetTestDriver17.isEmpty();
        experiment.util.Iterator iterator19 = treeSetTestDriver17.iterator();
        experiment.util.Iterator iterator20 = treeSetTestDriver17.iterator();
        boolean boolean22 = treeSetTestDriver17.contains((java.lang.Object) 10L);
        boolean boolean23 = treeSetTestDriver15.add((java.lang.Object) 10L);
        boolean boolean24 = treeSetTestDriver6.equals_CUT((java.lang.Object) boolean23);
        boolean boolean25 = treeSetTestDriver0.equals_CUT((java.lang.Object) treeSetTestDriver6);
        treeSetTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(comparator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(comparator16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test090");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver3 = new experiment.util.TreeSetTestDriver();
        boolean boolean4 = treeSetTestDriver3.isEmpty();
        boolean boolean5 = treeSetTestDriver3.isEmpty();
        boolean boolean6 = treeSetTestDriver0.remove((java.lang.Object) boolean5);
        experiment.util.TreeSetTestDriver treeSetTestDriver7 = new experiment.util.TreeSetTestDriver();
        boolean boolean8 = treeSetTestDriver7.isEmpty();
        experiment.util.Iterator iterator9 = treeSetTestDriver7.iterator();
        experiment.util.Iterator iterator10 = treeSetTestDriver7.iterator();
        java.lang.Object obj12 = treeSetTestDriver7.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator13 = treeSetTestDriver7.comparator();
        boolean boolean14 = treeSetTestDriver0.remove((java.lang.Object) treeSetTestDriver7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(comparator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test091");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        boolean boolean2 = treeSetTestDriver0.isEmpty();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) 10.0d);
        boolean boolean5 = treeSetTestDriver0.isEmpty();
        int int6 = treeSetTestDriver0.size();
        experiment.util.Iterator iterator7 = treeSetTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(iterator7);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test092");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        boolean boolean3 = treeSetTestDriver0.remove((java.lang.Object) 100L);
        boolean boolean5 = treeSetTestDriver0.contains((java.lang.Object) ' ');
        boolean boolean7 = treeSetTestDriver0.equals_CUT((java.lang.Object) (-1));
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        boolean boolean10 = treeSetTestDriver0.remove((java.lang.Object) wildcardClass9);
        experiment.util.TreeSetTestDriver treeSetTestDriver11 = new experiment.util.TreeSetTestDriver();
        boolean boolean12 = treeSetTestDriver11.isEmpty();
        experiment.util.Iterator iterator13 = treeSetTestDriver11.iterator();
        experiment.util.Iterator iterator14 = treeSetTestDriver11.iterator();
        java.lang.Object obj16 = treeSetTestDriver11.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator17 = treeSetTestDriver11.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver18 = new experiment.util.TreeSetTestDriver();
        boolean boolean19 = treeSetTestDriver18.isEmpty();
        boolean boolean20 = treeSetTestDriver18.isEmpty();
        boolean boolean21 = treeSetTestDriver18.isEmpty();
        boolean boolean23 = treeSetTestDriver18.contains((java.lang.Object) 1.0f);
        boolean boolean24 = treeSetTestDriver11.equals_CUT((java.lang.Object) 1.0f);
        java.lang.Object[] objArray25 = treeSetTestDriver11.toArray();
        int int26 = treeSetTestDriver11.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = treeSetTestDriver0.getMatch((java.lang.Object) treeSetTestDriver11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(comparator17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test093");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        experiment.util.Iterator iterator3 = treeSetTestDriver0.iterator();
        boolean boolean5 = treeSetTestDriver0.contains((java.lang.Object) 10L);
        int int6 = treeSetTestDriver0.size();
        boolean boolean8 = treeSetTestDriver0.contains((java.lang.Object) (-1L));
        experiment.util.TreeSetTestDriver treeSetTestDriver9 = new experiment.util.TreeSetTestDriver();
        boolean boolean10 = treeSetTestDriver9.isEmpty();
        experiment.util.Iterator iterator11 = treeSetTestDriver9.iterator();
        experiment.util.Iterator iterator12 = treeSetTestDriver9.iterator();
        boolean boolean14 = treeSetTestDriver9.contains((java.lang.Object) 10L);
        int int15 = treeSetTestDriver9.size();
        boolean boolean17 = treeSetTestDriver9.contains((java.lang.Object) (-1L));
        int int18 = treeSetTestDriver9.size();
        java.lang.Object obj19 = treeSetTestDriver0.getMatch((java.lang.Object) int18);
        experiment.util.Iterator iterator20 = treeSetTestDriver0.iterator();
        boolean boolean21 = treeSetTestDriver0.isEmpty();
        experiment.util.Comparator comparator22 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver23 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator24 = treeSetTestDriver23.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver25 = new experiment.util.TreeSetTestDriver();
        boolean boolean26 = treeSetTestDriver25.isEmpty();
        experiment.util.Iterator iterator27 = treeSetTestDriver25.iterator();
        experiment.util.Iterator iterator28 = treeSetTestDriver25.iterator();
        boolean boolean30 = treeSetTestDriver25.contains((java.lang.Object) 10L);
        boolean boolean31 = treeSetTestDriver23.add((java.lang.Object) 10L);
        boolean boolean33 = treeSetTestDriver23.equals_CUT((java.lang.Object) '4');
        boolean boolean34 = treeSetTestDriver0.add((java.lang.Object) treeSetTestDriver23);
        java.lang.Object obj35 = treeSetTestDriver0.first();
        java.lang.Object[] objArray36 = treeSetTestDriver0.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver37 = new experiment.util.TreeSetTestDriver();
        boolean boolean38 = treeSetTestDriver37.isEmpty();
        boolean boolean39 = treeSetTestDriver37.isEmpty();
        boolean boolean41 = treeSetTestDriver37.remove((java.lang.Object) 10.0d);
        boolean boolean42 = treeSetTestDriver37.isEmpty();
        int int43 = treeSetTestDriver37.size();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean44 = treeSetTestDriver0.add((java.lang.Object) int43);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Integer");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(comparator22);
        org.junit.Assert.assertNull(comparator24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test094");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        java.lang.Object[] objArray2 = treeSetTestDriver0.toArray();
        treeSetTestDriver0.clear();
        experiment.util.Comparator comparator4 = treeSetTestDriver0.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(comparator4);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test095");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        boolean boolean3 = treeSetTestDriver0.remove((java.lang.Object) 100L);
        boolean boolean5 = treeSetTestDriver0.contains((java.lang.Object) ' ');
        boolean boolean7 = treeSetTestDriver0.add((java.lang.Object) 10);
        java.lang.Object obj8 = treeSetTestDriver0.last();
        experiment.util.TreeSetTestDriver treeSetTestDriver9 = new experiment.util.TreeSetTestDriver();
        boolean boolean10 = treeSetTestDriver9.isEmpty();
        boolean boolean11 = treeSetTestDriver9.isEmpty();
        boolean boolean12 = treeSetTestDriver9.isEmpty();
        boolean boolean13 = treeSetTestDriver9.isEmpty();
        int int14 = treeSetTestDriver9.size();
        java.lang.Object obj16 = treeSetTestDriver9.getMatch((java.lang.Object) 100L);
        java.lang.Object[] objArray17 = treeSetTestDriver9.toArray();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = treeSetTestDriver0.contains((java.lang.Object) objArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Ljava.lang.Object; cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 10 + "'", obj8, 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test096");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        boolean boolean2 = treeSetTestDriver0.isEmpty();
        boolean boolean3 = treeSetTestDriver0.isEmpty();
        experiment.util.TreeSetTestDriver treeSetTestDriver4 = new experiment.util.TreeSetTestDriver();
        boolean boolean6 = treeSetTestDriver4.add((java.lang.Object) 10.0f);
        boolean boolean7 = treeSetTestDriver0.contains((java.lang.Object) boolean6);
        experiment.util.TreeSetTestDriver treeSetTestDriver8 = new experiment.util.TreeSetTestDriver();
        boolean boolean9 = treeSetTestDriver8.isEmpty();
        experiment.util.Iterator iterator10 = treeSetTestDriver8.iterator();
        experiment.util.Iterator iterator11 = treeSetTestDriver8.iterator();
        java.lang.Object obj13 = treeSetTestDriver8.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator14 = treeSetTestDriver8.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver15 = new experiment.util.TreeSetTestDriver();
        boolean boolean16 = treeSetTestDriver15.isEmpty();
        boolean boolean17 = treeSetTestDriver15.isEmpty();
        boolean boolean18 = treeSetTestDriver15.isEmpty();
        boolean boolean20 = treeSetTestDriver15.contains((java.lang.Object) 1.0f);
        boolean boolean21 = treeSetTestDriver8.equals_CUT((java.lang.Object) 1.0f);
        java.lang.Object[] objArray22 = treeSetTestDriver8.toArray();
        boolean boolean23 = treeSetTestDriver0.equals_CUT((java.lang.Object) treeSetTestDriver8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = treeSetTestDriver8.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(comparator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test097");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        experiment.util.Iterator iterator3 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver4 = new experiment.util.TreeSetTestDriver();
        boolean boolean5 = treeSetTestDriver4.isEmpty();
        boolean boolean7 = treeSetTestDriver4.remove((java.lang.Object) 100L);
        boolean boolean8 = treeSetTestDriver0.equals_CUT((java.lang.Object) 100L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test098");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        experiment.util.Iterator iterator3 = treeSetTestDriver0.iterator();
        java.lang.Object obj5 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator6 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver7 = new experiment.util.TreeSetTestDriver();
        boolean boolean8 = treeSetTestDriver7.isEmpty();
        boolean boolean9 = treeSetTestDriver7.isEmpty();
        boolean boolean10 = treeSetTestDriver7.isEmpty();
        boolean boolean12 = treeSetTestDriver7.contains((java.lang.Object) 1.0f);
        boolean boolean13 = treeSetTestDriver0.equals_CUT((java.lang.Object) 1.0f);
        java.lang.Object[] objArray14 = treeSetTestDriver0.toArray();
        experiment.util.Iterator iterator15 = treeSetTestDriver0.iterator();
        experiment.util.Comparator comparator16 = treeSetTestDriver0.comparator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNull(comparator16);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test099");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver3 = new experiment.util.TreeSetTestDriver();
        boolean boolean4 = treeSetTestDriver3.isEmpty();
        boolean boolean5 = treeSetTestDriver3.isEmpty();
        boolean boolean6 = treeSetTestDriver0.remove((java.lang.Object) boolean5);
        experiment.util.TreeSetTestDriver treeSetTestDriver7 = new experiment.util.TreeSetTestDriver();
        boolean boolean8 = treeSetTestDriver7.isEmpty();
        boolean boolean9 = treeSetTestDriver7.isEmpty();
        boolean boolean10 = treeSetTestDriver7.isEmpty();
        boolean boolean11 = treeSetTestDriver0.equals_CUT((java.lang.Object) boolean10);
        experiment.util.Comparator comparator12 = treeSetTestDriver0.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(comparator12);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test100");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        boolean boolean2 = treeSetTestDriver0.isEmpty();
        boolean boolean3 = treeSetTestDriver0.isEmpty();
        boolean boolean5 = treeSetTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean7 = treeSetTestDriver0.contains((java.lang.Object) 1.0f);
        experiment.util.Iterator iterator8 = treeSetTestDriver0.iterator();
        java.lang.Class<?> wildcardClass9 = treeSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test101");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        boolean boolean2 = treeSetTestDriver0.isEmpty();
        boolean boolean3 = treeSetTestDriver0.isEmpty();
        boolean boolean5 = treeSetTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean7 = treeSetTestDriver0.contains((java.lang.Object) 1.0f);
        experiment.util.Iterator iterator8 = treeSetTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test102");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.TreeSetTestDriver treeSetTestDriver1 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver1.isEmpty();
        boolean boolean3 = treeSetTestDriver1.isEmpty();
        boolean boolean4 = treeSetTestDriver1.isEmpty();
        boolean boolean5 = treeSetTestDriver1.isEmpty();
        boolean boolean7 = treeSetTestDriver1.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean8 = treeSetTestDriver0.equals_CUT((java.lang.Object) treeSetTestDriver1);
        experiment.util.TreeSetTestDriver treeSetTestDriver9 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator10 = treeSetTestDriver9.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver11 = new experiment.util.TreeSetTestDriver();
        boolean boolean12 = treeSetTestDriver11.isEmpty();
        experiment.util.Iterator iterator13 = treeSetTestDriver11.iterator();
        experiment.util.Iterator iterator14 = treeSetTestDriver11.iterator();
        boolean boolean16 = treeSetTestDriver11.contains((java.lang.Object) 10L);
        boolean boolean17 = treeSetTestDriver9.add((java.lang.Object) 10L);
        experiment.util.TreeSetTestDriver treeSetTestDriver18 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator19 = treeSetTestDriver18.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver20 = new experiment.util.TreeSetTestDriver();
        boolean boolean21 = treeSetTestDriver20.isEmpty();
        experiment.util.Iterator iterator22 = treeSetTestDriver20.iterator();
        experiment.util.Iterator iterator23 = treeSetTestDriver20.iterator();
        boolean boolean25 = treeSetTestDriver20.contains((java.lang.Object) 10L);
        boolean boolean26 = treeSetTestDriver18.add((java.lang.Object) 10L);
        boolean boolean27 = treeSetTestDriver9.equals_CUT((java.lang.Object) boolean26);
        boolean boolean28 = treeSetTestDriver1.remove((java.lang.Object) treeSetTestDriver9);
        treeSetTestDriver9.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(comparator19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test103");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        boolean boolean2 = treeSetTestDriver0.isEmpty();
        boolean boolean3 = treeSetTestDriver0.isEmpty();
        boolean boolean5 = treeSetTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean7 = treeSetTestDriver0.contains((java.lang.Object) 1.0f);
        experiment.util.Comparator comparator8 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver9 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator10 = treeSetTestDriver9.comparator();
        boolean boolean11 = treeSetTestDriver9.isEmpty();
        boolean boolean12 = treeSetTestDriver9.isEmpty();
        experiment.util.TreeSetTestDriver treeSetTestDriver13 = new experiment.util.TreeSetTestDriver();
        boolean boolean15 = treeSetTestDriver13.add((java.lang.Object) 10.0f);
        boolean boolean16 = treeSetTestDriver9.contains((java.lang.Object) boolean15);
        experiment.util.TreeSetTestDriver treeSetTestDriver17 = new experiment.util.TreeSetTestDriver();
        boolean boolean18 = treeSetTestDriver17.isEmpty();
        experiment.util.Iterator iterator19 = treeSetTestDriver17.iterator();
        experiment.util.Iterator iterator20 = treeSetTestDriver17.iterator();
        java.lang.Object obj22 = treeSetTestDriver17.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator23 = treeSetTestDriver17.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver24 = new experiment.util.TreeSetTestDriver();
        boolean boolean25 = treeSetTestDriver24.isEmpty();
        boolean boolean26 = treeSetTestDriver24.isEmpty();
        boolean boolean27 = treeSetTestDriver24.isEmpty();
        boolean boolean29 = treeSetTestDriver24.contains((java.lang.Object) 1.0f);
        boolean boolean30 = treeSetTestDriver17.equals_CUT((java.lang.Object) 1.0f);
        java.lang.Object[] objArray31 = treeSetTestDriver17.toArray();
        boolean boolean32 = treeSetTestDriver9.equals_CUT((java.lang.Object) treeSetTestDriver17);
        java.lang.Object[] objArray33 = treeSetTestDriver9.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = treeSetTestDriver0.getMatch((java.lang.Object) objArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Ljava.lang.Object; cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(comparator8);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(comparator23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test104");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        boolean boolean2 = treeSetTestDriver0.isEmpty();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) 10.0d);
        treeSetTestDriver0.clear();
        experiment.util.TreeSetTestDriver treeSetTestDriver6 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator7 = treeSetTestDriver6.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver8 = new experiment.util.TreeSetTestDriver();
        boolean boolean9 = treeSetTestDriver8.isEmpty();
        experiment.util.Iterator iterator10 = treeSetTestDriver8.iterator();
        experiment.util.Iterator iterator11 = treeSetTestDriver8.iterator();
        boolean boolean13 = treeSetTestDriver8.contains((java.lang.Object) 10L);
        boolean boolean14 = treeSetTestDriver6.add((java.lang.Object) 10L);
        experiment.util.TreeSetTestDriver treeSetTestDriver15 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator16 = treeSetTestDriver15.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver17 = new experiment.util.TreeSetTestDriver();
        boolean boolean18 = treeSetTestDriver17.isEmpty();
        experiment.util.Iterator iterator19 = treeSetTestDriver17.iterator();
        experiment.util.Iterator iterator20 = treeSetTestDriver17.iterator();
        boolean boolean22 = treeSetTestDriver17.contains((java.lang.Object) 10L);
        boolean boolean23 = treeSetTestDriver15.add((java.lang.Object) 10L);
        boolean boolean24 = treeSetTestDriver6.equals_CUT((java.lang.Object) boolean23);
        experiment.util.Iterator iterator25 = treeSetTestDriver6.iterator();
        boolean boolean26 = treeSetTestDriver0.equals_CUT((java.lang.Object) treeSetTestDriver6);
        experiment.util.TreeSetTestDriver treeSetTestDriver27 = new experiment.util.TreeSetTestDriver();
        boolean boolean28 = treeSetTestDriver27.isEmpty();
        experiment.util.Iterator iterator29 = treeSetTestDriver27.iterator();
        experiment.util.Iterator iterator30 = treeSetTestDriver27.iterator();
        java.lang.Object obj32 = treeSetTestDriver27.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator33 = treeSetTestDriver27.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver34 = new experiment.util.TreeSetTestDriver();
        boolean boolean35 = treeSetTestDriver34.isEmpty();
        boolean boolean36 = treeSetTestDriver34.isEmpty();
        boolean boolean37 = treeSetTestDriver34.isEmpty();
        boolean boolean39 = treeSetTestDriver34.contains((java.lang.Object) 1.0f);
        boolean boolean40 = treeSetTestDriver27.equals_CUT((java.lang.Object) 1.0f);
        java.lang.Object[] objArray41 = treeSetTestDriver27.toArray();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean42 = treeSetTestDriver6.contains((java.lang.Object) treeSetTestDriver27);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(comparator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(comparator16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(comparator33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[]");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test105");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver3 = new experiment.util.TreeSetTestDriver();
        boolean boolean4 = treeSetTestDriver3.isEmpty();
        boolean boolean5 = treeSetTestDriver3.isEmpty();
        boolean boolean6 = treeSetTestDriver0.remove((java.lang.Object) boolean5);
        experiment.util.TreeSetTestDriver treeSetTestDriver7 = new experiment.util.TreeSetTestDriver();
        boolean boolean8 = treeSetTestDriver7.isEmpty();
        experiment.util.Iterator iterator9 = treeSetTestDriver7.iterator();
        experiment.util.Iterator iterator10 = treeSetTestDriver7.iterator();
        java.lang.Object obj12 = treeSetTestDriver7.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator13 = treeSetTestDriver7.comparator();
        boolean boolean14 = treeSetTestDriver0.remove((java.lang.Object) treeSetTestDriver7);
        experiment.util.TreeSetTestDriver treeSetTestDriver15 = new experiment.util.TreeSetTestDriver();
        boolean boolean16 = treeSetTestDriver15.isEmpty();
        experiment.util.Iterator iterator17 = treeSetTestDriver15.iterator();
        java.lang.Class<?> wildcardClass18 = iterator17.getClass();
        boolean boolean19 = treeSetTestDriver0.remove((java.lang.Object) wildcardClass18);
        experiment.util.TreeSetTestDriver treeSetTestDriver20 = new experiment.util.TreeSetTestDriver();
        boolean boolean21 = treeSetTestDriver20.isEmpty();
        experiment.util.Iterator iterator22 = treeSetTestDriver20.iterator();
        experiment.util.Iterator iterator23 = treeSetTestDriver20.iterator();
        java.lang.Object obj25 = treeSetTestDriver20.getMatch((java.lang.Object) (-1.0f));
        java.lang.Object[] objArray26 = treeSetTestDriver20.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver27 = new experiment.util.TreeSetTestDriver();
        boolean boolean29 = treeSetTestDriver27.add((java.lang.Object) 10.0f);
        experiment.util.TreeSetTestDriver treeSetTestDriver30 = new experiment.util.TreeSetTestDriver();
        boolean boolean31 = treeSetTestDriver30.isEmpty();
        experiment.util.Iterator iterator32 = treeSetTestDriver30.iterator();
        experiment.util.Iterator iterator33 = treeSetTestDriver30.iterator();
        boolean boolean35 = treeSetTestDriver30.contains((java.lang.Object) 10L);
        int int36 = treeSetTestDriver30.size();
        boolean boolean38 = treeSetTestDriver30.contains((java.lang.Object) (-1L));
        experiment.util.TreeSetTestDriver treeSetTestDriver39 = new experiment.util.TreeSetTestDriver();
        boolean boolean40 = treeSetTestDriver39.isEmpty();
        experiment.util.Iterator iterator41 = treeSetTestDriver39.iterator();
        experiment.util.Iterator iterator42 = treeSetTestDriver39.iterator();
        boolean boolean44 = treeSetTestDriver39.contains((java.lang.Object) 10L);
        int int45 = treeSetTestDriver39.size();
        boolean boolean47 = treeSetTestDriver39.contains((java.lang.Object) (-1L));
        int int48 = treeSetTestDriver39.size();
        java.lang.Object obj49 = treeSetTestDriver30.getMatch((java.lang.Object) int48);
        experiment.util.Iterator iterator50 = treeSetTestDriver30.iterator();
        experiment.util.Iterator iterator51 = treeSetTestDriver30.iterator();
        boolean boolean52 = treeSetTestDriver27.equals_CUT((java.lang.Object) iterator51);
        java.lang.Object[] objArray53 = treeSetTestDriver27.toArray();
        experiment.util.Iterator iterator54 = treeSetTestDriver27.iterator();
        boolean boolean55 = treeSetTestDriver20.remove((java.lang.Object) treeSetTestDriver27);
        boolean boolean56 = treeSetTestDriver0.equals_CUT((java.lang.Object) treeSetTestDriver20);
        experiment.util.TreeSetTestDriver treeSetTestDriver57 = new experiment.util.TreeSetTestDriver();
        boolean boolean58 = treeSetTestDriver57.isEmpty();
        experiment.util.Iterator iterator59 = treeSetTestDriver57.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver60 = new experiment.util.TreeSetTestDriver();
        boolean boolean61 = treeSetTestDriver60.isEmpty();
        boolean boolean62 = treeSetTestDriver60.isEmpty();
        boolean boolean63 = treeSetTestDriver57.remove((java.lang.Object) boolean62);
        int int64 = treeSetTestDriver57.size();
        experiment.util.TreeSetTestDriver treeSetTestDriver65 = new experiment.util.TreeSetTestDriver();
        boolean boolean66 = treeSetTestDriver65.isEmpty();
        experiment.util.Iterator iterator67 = treeSetTestDriver65.iterator();
        boolean boolean68 = treeSetTestDriver57.remove((java.lang.Object) iterator67);
        experiment.util.Iterator iterator69 = treeSetTestDriver57.iterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean70 = treeSetTestDriver0.contains((java.lang.Object) treeSetTestDriver57);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(comparator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(iterator41);
        org.junit.Assert.assertNotNull(iterator42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(iterator50);
        org.junit.Assert.assertNotNull(iterator51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[10.0]");
        org.junit.Assert.assertNotNull(iterator54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(iterator59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(iterator67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(iterator69);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test106");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        experiment.util.Iterator iterator3 = treeSetTestDriver0.iterator();
        boolean boolean5 = treeSetTestDriver0.contains((java.lang.Object) 10L);
        experiment.util.Iterator iterator6 = treeSetTestDriver0.iterator();
        boolean boolean8 = treeSetTestDriver0.equals_CUT((java.lang.Object) "hi!");
        experiment.util.Comparator comparator9 = treeSetTestDriver0.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(comparator9);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test107");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        experiment.util.Iterator iterator3 = treeSetTestDriver0.iterator();
        java.lang.Object obj5 = treeSetTestDriver0.getMatch((java.lang.Object) 10.0f);
        experiment.util.TreeSetTestDriver treeSetTestDriver6 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator7 = treeSetTestDriver6.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver8 = new experiment.util.TreeSetTestDriver();
        boolean boolean9 = treeSetTestDriver8.isEmpty();
        experiment.util.Iterator iterator10 = treeSetTestDriver8.iterator();
        experiment.util.Iterator iterator11 = treeSetTestDriver8.iterator();
        boolean boolean13 = treeSetTestDriver8.contains((java.lang.Object) 10L);
        boolean boolean14 = treeSetTestDriver6.add((java.lang.Object) 10L);
        experiment.util.TreeSetTestDriver treeSetTestDriver15 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator16 = treeSetTestDriver15.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver17 = new experiment.util.TreeSetTestDriver();
        boolean boolean18 = treeSetTestDriver17.isEmpty();
        experiment.util.Iterator iterator19 = treeSetTestDriver17.iterator();
        experiment.util.Iterator iterator20 = treeSetTestDriver17.iterator();
        boolean boolean22 = treeSetTestDriver17.contains((java.lang.Object) 10L);
        boolean boolean23 = treeSetTestDriver15.add((java.lang.Object) 10L);
        boolean boolean24 = treeSetTestDriver6.equals_CUT((java.lang.Object) boolean23);
        boolean boolean25 = treeSetTestDriver0.equals_CUT((java.lang.Object) treeSetTestDriver6);
        experiment.util.Iterator iterator26 = treeSetTestDriver6.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver27 = new experiment.util.TreeSetTestDriver();
        boolean boolean28 = treeSetTestDriver27.isEmpty();
        experiment.util.Iterator iterator29 = treeSetTestDriver27.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver30 = new experiment.util.TreeSetTestDriver();
        boolean boolean31 = treeSetTestDriver30.isEmpty();
        boolean boolean32 = treeSetTestDriver30.isEmpty();
        boolean boolean33 = treeSetTestDriver27.remove((java.lang.Object) boolean32);
        int int34 = treeSetTestDriver27.size();
        experiment.util.TreeSetTestDriver treeSetTestDriver35 = new experiment.util.TreeSetTestDriver();
        boolean boolean36 = treeSetTestDriver35.isEmpty();
        experiment.util.Iterator iterator37 = treeSetTestDriver35.iterator();
        boolean boolean38 = treeSetTestDriver27.remove((java.lang.Object) iterator37);
        experiment.util.Iterator iterator39 = treeSetTestDriver27.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj40 = treeSetTestDriver6.getMatch((java.lang.Object) treeSetTestDriver27);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(comparator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(comparator16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(iterator39);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test108");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        experiment.util.Iterator iterator3 = treeSetTestDriver0.iterator();
        java.lang.Object obj5 = treeSetTestDriver0.getMatch((java.lang.Object) 10.0f);
        experiment.util.TreeSetTestDriver treeSetTestDriver6 = new experiment.util.TreeSetTestDriver();
        boolean boolean7 = treeSetTestDriver6.isEmpty();
        boolean boolean8 = treeSetTestDriver6.isEmpty();
        boolean boolean9 = treeSetTestDriver6.isEmpty();
        boolean boolean10 = treeSetTestDriver0.remove((java.lang.Object) treeSetTestDriver6);
        experiment.util.TreeSetTestDriver treeSetTestDriver11 = new experiment.util.TreeSetTestDriver();
        boolean boolean12 = treeSetTestDriver11.isEmpty();
        experiment.util.Iterator iterator13 = treeSetTestDriver11.iterator();
        boolean boolean15 = treeSetTestDriver11.equals_CUT((java.lang.Object) 100L);
        boolean boolean17 = treeSetTestDriver11.remove((java.lang.Object) "hi!");
        treeSetTestDriver11.clear();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = treeSetTestDriver0.contains((java.lang.Object) treeSetTestDriver11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test109");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        boolean boolean4 = treeSetTestDriver0.equals_CUT((java.lang.Object) 100L);
        boolean boolean6 = treeSetTestDriver0.contains((java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass7 = treeSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test110");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        boolean boolean3 = treeSetTestDriver0.remove((java.lang.Object) 100L);
        boolean boolean5 = treeSetTestDriver0.contains((java.lang.Object) ' ');
        boolean boolean7 = treeSetTestDriver0.add((java.lang.Object) 10);
        int int8 = treeSetTestDriver0.size();
        java.lang.Class<?> wildcardClass9 = treeSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test111");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        boolean boolean2 = treeSetTestDriver0.isEmpty();
        boolean boolean3 = treeSetTestDriver0.isEmpty();
        boolean boolean4 = treeSetTestDriver0.isEmpty();
        int int5 = treeSetTestDriver0.size();
        experiment.util.TreeSetTestDriver treeSetTestDriver6 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator7 = treeSetTestDriver6.comparator();
        java.lang.Object[] objArray8 = treeSetTestDriver6.toArray();
        boolean boolean9 = treeSetTestDriver0.add((java.lang.Object) treeSetTestDriver6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = treeSetTestDriver6.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(comparator7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test112");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver2 = new experiment.util.TreeSetTestDriver();
        boolean boolean3 = treeSetTestDriver2.isEmpty();
        experiment.util.Iterator iterator4 = treeSetTestDriver2.iterator();
        experiment.util.Iterator iterator5 = treeSetTestDriver2.iterator();
        boolean boolean7 = treeSetTestDriver2.contains((java.lang.Object) 10L);
        boolean boolean8 = treeSetTestDriver0.add((java.lang.Object) 10L);
        experiment.util.TreeSetTestDriver treeSetTestDriver9 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator10 = treeSetTestDriver9.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver11 = new experiment.util.TreeSetTestDriver();
        boolean boolean12 = treeSetTestDriver11.isEmpty();
        experiment.util.Iterator iterator13 = treeSetTestDriver11.iterator();
        experiment.util.Iterator iterator14 = treeSetTestDriver11.iterator();
        boolean boolean16 = treeSetTestDriver11.contains((java.lang.Object) 10L);
        boolean boolean17 = treeSetTestDriver9.add((java.lang.Object) 10L);
        boolean boolean18 = treeSetTestDriver0.equals_CUT((java.lang.Object) boolean17);
        java.lang.Object obj19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = treeSetTestDriver0.remove(obj19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test113");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver3 = new experiment.util.TreeSetTestDriver();
        boolean boolean4 = treeSetTestDriver3.isEmpty();
        boolean boolean5 = treeSetTestDriver3.isEmpty();
        boolean boolean6 = treeSetTestDriver0.remove((java.lang.Object) boolean5);
        experiment.util.TreeSetTestDriver treeSetTestDriver7 = new experiment.util.TreeSetTestDriver();
        boolean boolean8 = treeSetTestDriver7.isEmpty();
        experiment.util.Iterator iterator9 = treeSetTestDriver7.iterator();
        experiment.util.Iterator iterator10 = treeSetTestDriver7.iterator();
        java.lang.Object obj12 = treeSetTestDriver7.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator13 = treeSetTestDriver7.comparator();
        boolean boolean14 = treeSetTestDriver0.remove((java.lang.Object) treeSetTestDriver7);
        boolean boolean16 = treeSetTestDriver7.add((java.lang.Object) (short) 1);
        boolean boolean17 = treeSetTestDriver7.isEmpty();
        experiment.util.TreeSetTestDriver treeSetTestDriver18 = new experiment.util.TreeSetTestDriver();
        boolean boolean19 = treeSetTestDriver18.isEmpty();
        experiment.util.Iterator iterator20 = treeSetTestDriver18.iterator();
        experiment.util.Iterator iterator21 = treeSetTestDriver18.iterator();
        java.lang.Object obj23 = treeSetTestDriver18.getMatch((java.lang.Object) 10.0f);
        experiment.util.TreeSetTestDriver treeSetTestDriver24 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator25 = treeSetTestDriver24.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver26 = new experiment.util.TreeSetTestDriver();
        boolean boolean27 = treeSetTestDriver26.isEmpty();
        experiment.util.Iterator iterator28 = treeSetTestDriver26.iterator();
        experiment.util.Iterator iterator29 = treeSetTestDriver26.iterator();
        boolean boolean31 = treeSetTestDriver26.contains((java.lang.Object) 10L);
        boolean boolean32 = treeSetTestDriver24.add((java.lang.Object) 10L);
        experiment.util.TreeSetTestDriver treeSetTestDriver33 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator34 = treeSetTestDriver33.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver35 = new experiment.util.TreeSetTestDriver();
        boolean boolean36 = treeSetTestDriver35.isEmpty();
        experiment.util.Iterator iterator37 = treeSetTestDriver35.iterator();
        experiment.util.Iterator iterator38 = treeSetTestDriver35.iterator();
        boolean boolean40 = treeSetTestDriver35.contains((java.lang.Object) 10L);
        boolean boolean41 = treeSetTestDriver33.add((java.lang.Object) 10L);
        boolean boolean42 = treeSetTestDriver24.equals_CUT((java.lang.Object) boolean41);
        boolean boolean43 = treeSetTestDriver18.equals_CUT((java.lang.Object) treeSetTestDriver24);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean44 = treeSetTestDriver7.remove((java.lang.Object) treeSetTestDriver24);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(comparator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(comparator25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(comparator34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test114");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        boolean boolean2 = treeSetTestDriver0.isEmpty();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) 10.0d);
        boolean boolean5 = treeSetTestDriver0.isEmpty();
        treeSetTestDriver0.clear();
        java.lang.Object[] objArray7 = treeSetTestDriver0.toArray();
        java.lang.Class<?> wildcardClass8 = objArray7.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test115");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        boolean boolean2 = treeSetTestDriver0.isEmpty();
        boolean boolean3 = treeSetTestDriver0.isEmpty();
        boolean boolean4 = treeSetTestDriver0.isEmpty();
        boolean boolean6 = treeSetTestDriver0.equals_CUT((java.lang.Object) (short) 10);
        treeSetTestDriver0.clear();
        treeSetTestDriver0.clear();
        treeSetTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test116");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        experiment.util.Iterator iterator3 = treeSetTestDriver0.iterator();
        boolean boolean5 = treeSetTestDriver0.contains((java.lang.Object) 10L);
        int int6 = treeSetTestDriver0.size();
        boolean boolean8 = treeSetTestDriver0.contains((java.lang.Object) (-1L));
        experiment.util.TreeSetTestDriver treeSetTestDriver9 = new experiment.util.TreeSetTestDriver();
        boolean boolean10 = treeSetTestDriver9.isEmpty();
        experiment.util.Iterator iterator11 = treeSetTestDriver9.iterator();
        experiment.util.Iterator iterator12 = treeSetTestDriver9.iterator();
        boolean boolean14 = treeSetTestDriver9.contains((java.lang.Object) 10L);
        int int15 = treeSetTestDriver9.size();
        boolean boolean17 = treeSetTestDriver9.contains((java.lang.Object) (-1L));
        int int18 = treeSetTestDriver9.size();
        java.lang.Object obj19 = treeSetTestDriver0.getMatch((java.lang.Object) int18);
        experiment.util.Iterator iterator20 = treeSetTestDriver0.iterator();
        boolean boolean21 = treeSetTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test117");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.TreeSetTestDriver treeSetTestDriver2 = new experiment.util.TreeSetTestDriver();
        boolean boolean3 = treeSetTestDriver2.isEmpty();
        boolean boolean5 = treeSetTestDriver2.remove((java.lang.Object) 100L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = treeSetTestDriver0.getMatch((java.lang.Object) treeSetTestDriver2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test118");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        java.lang.Object[] objArray2 = treeSetTestDriver0.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver3 = new experiment.util.TreeSetTestDriver();
        boolean boolean4 = treeSetTestDriver3.isEmpty();
        experiment.util.Iterator iterator5 = treeSetTestDriver3.iterator();
        experiment.util.Iterator iterator6 = treeSetTestDriver3.iterator();
        boolean boolean8 = treeSetTestDriver3.contains((java.lang.Object) 10L);
        int int9 = treeSetTestDriver3.size();
        boolean boolean11 = treeSetTestDriver3.contains((java.lang.Object) (-1L));
        experiment.util.TreeSetTestDriver treeSetTestDriver12 = new experiment.util.TreeSetTestDriver();
        boolean boolean13 = treeSetTestDriver12.isEmpty();
        experiment.util.Iterator iterator14 = treeSetTestDriver12.iterator();
        experiment.util.Iterator iterator15 = treeSetTestDriver12.iterator();
        boolean boolean17 = treeSetTestDriver12.contains((java.lang.Object) 10L);
        int int18 = treeSetTestDriver12.size();
        boolean boolean20 = treeSetTestDriver12.contains((java.lang.Object) (-1L));
        int int21 = treeSetTestDriver12.size();
        java.lang.Object obj22 = treeSetTestDriver3.getMatch((java.lang.Object) int21);
        experiment.util.Iterator iterator23 = treeSetTestDriver3.iterator();
        experiment.util.Iterator iterator24 = treeSetTestDriver3.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver25 = new experiment.util.TreeSetTestDriver();
        boolean boolean26 = treeSetTestDriver25.isEmpty();
        boolean boolean27 = treeSetTestDriver25.isEmpty();
        boolean boolean28 = treeSetTestDriver3.equals_CUT((java.lang.Object) boolean27);
        boolean boolean29 = treeSetTestDriver0.contains((java.lang.Object) boolean28);
        boolean boolean30 = treeSetTestDriver0.isEmpty();
        boolean boolean32 = treeSetTestDriver0.equals_CUT((java.lang.Object) ' ');
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test119");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        boolean boolean2 = treeSetTestDriver0.isEmpty();
        boolean boolean3 = treeSetTestDriver0.isEmpty();
        experiment.util.TreeSetTestDriver treeSetTestDriver4 = new experiment.util.TreeSetTestDriver();
        boolean boolean6 = treeSetTestDriver4.add((java.lang.Object) 10.0f);
        boolean boolean7 = treeSetTestDriver0.contains((java.lang.Object) boolean6);
        experiment.util.TreeSetTestDriver treeSetTestDriver8 = new experiment.util.TreeSetTestDriver();
        boolean boolean9 = treeSetTestDriver8.isEmpty();
        boolean boolean10 = treeSetTestDriver8.isEmpty();
        boolean boolean11 = treeSetTestDriver8.isEmpty();
        boolean boolean12 = treeSetTestDriver8.isEmpty();
        int int13 = treeSetTestDriver8.size();
        experiment.util.TreeSetTestDriver treeSetTestDriver14 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator15 = treeSetTestDriver14.comparator();
        java.lang.Object[] objArray16 = treeSetTestDriver14.toArray();
        boolean boolean17 = treeSetTestDriver8.add((java.lang.Object) treeSetTestDriver14);
        boolean boolean18 = treeSetTestDriver0.equals_CUT((java.lang.Object) treeSetTestDriver8);
        java.lang.Object obj19 = treeSetTestDriver8.last();
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(comparator15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test120");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test121");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        experiment.util.Iterator iterator3 = treeSetTestDriver0.iterator();
        java.lang.Object obj5 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator6 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver7 = new experiment.util.TreeSetTestDriver();
        boolean boolean8 = treeSetTestDriver7.isEmpty();
        boolean boolean9 = treeSetTestDriver7.isEmpty();
        boolean boolean10 = treeSetTestDriver7.isEmpty();
        boolean boolean12 = treeSetTestDriver7.contains((java.lang.Object) 1.0f);
        boolean boolean13 = treeSetTestDriver0.equals_CUT((java.lang.Object) 1.0f);
        java.lang.Object[] objArray14 = treeSetTestDriver0.toArray();
        int int15 = treeSetTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test122");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        java.lang.Object[] objArray2 = treeSetTestDriver0.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver3 = new experiment.util.TreeSetTestDriver();
        boolean boolean4 = treeSetTestDriver3.isEmpty();
        experiment.util.Iterator iterator5 = treeSetTestDriver3.iterator();
        experiment.util.Iterator iterator6 = treeSetTestDriver3.iterator();
        boolean boolean8 = treeSetTestDriver3.contains((java.lang.Object) 10L);
        int int9 = treeSetTestDriver3.size();
        boolean boolean11 = treeSetTestDriver3.contains((java.lang.Object) (-1L));
        experiment.util.TreeSetTestDriver treeSetTestDriver12 = new experiment.util.TreeSetTestDriver();
        boolean boolean13 = treeSetTestDriver12.isEmpty();
        experiment.util.Iterator iterator14 = treeSetTestDriver12.iterator();
        experiment.util.Iterator iterator15 = treeSetTestDriver12.iterator();
        boolean boolean17 = treeSetTestDriver12.contains((java.lang.Object) 10L);
        int int18 = treeSetTestDriver12.size();
        boolean boolean20 = treeSetTestDriver12.contains((java.lang.Object) (-1L));
        int int21 = treeSetTestDriver12.size();
        java.lang.Object obj22 = treeSetTestDriver3.getMatch((java.lang.Object) int21);
        experiment.util.Iterator iterator23 = treeSetTestDriver3.iterator();
        experiment.util.Iterator iterator24 = treeSetTestDriver3.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver25 = new experiment.util.TreeSetTestDriver();
        boolean boolean26 = treeSetTestDriver25.isEmpty();
        boolean boolean27 = treeSetTestDriver25.isEmpty();
        boolean boolean28 = treeSetTestDriver3.equals_CUT((java.lang.Object) boolean27);
        boolean boolean29 = treeSetTestDriver0.contains((java.lang.Object) boolean28);
        boolean boolean31 = treeSetTestDriver0.add((java.lang.Object) (-1));
        java.lang.Object obj32 = treeSetTestDriver0.first();
        experiment.util.TreeSetTestDriver treeSetTestDriver33 = new experiment.util.TreeSetTestDriver();
        boolean boolean34 = treeSetTestDriver33.isEmpty();
        experiment.util.Iterator iterator35 = treeSetTestDriver33.iterator();
        experiment.util.Iterator iterator36 = treeSetTestDriver33.iterator();
        boolean boolean38 = treeSetTestDriver33.contains((java.lang.Object) 10L);
        java.lang.Object[] objArray39 = treeSetTestDriver33.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj40 = treeSetTestDriver0.getMatch((java.lang.Object) treeSetTestDriver33);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (-1) + "'", obj32, (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[]");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test123");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver3 = new experiment.util.TreeSetTestDriver();
        boolean boolean4 = treeSetTestDriver3.isEmpty();
        boolean boolean5 = treeSetTestDriver3.isEmpty();
        boolean boolean6 = treeSetTestDriver0.remove((java.lang.Object) boolean5);
        experiment.util.TreeSetTestDriver treeSetTestDriver7 = new experiment.util.TreeSetTestDriver();
        boolean boolean8 = treeSetTestDriver7.isEmpty();
        experiment.util.Iterator iterator9 = treeSetTestDriver7.iterator();
        experiment.util.Iterator iterator10 = treeSetTestDriver7.iterator();
        java.lang.Object obj12 = treeSetTestDriver7.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator13 = treeSetTestDriver7.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver14 = new experiment.util.TreeSetTestDriver();
        boolean boolean15 = treeSetTestDriver14.isEmpty();
        boolean boolean16 = treeSetTestDriver14.isEmpty();
        boolean boolean17 = treeSetTestDriver14.isEmpty();
        boolean boolean19 = treeSetTestDriver14.contains((java.lang.Object) 1.0f);
        boolean boolean20 = treeSetTestDriver7.equals_CUT((java.lang.Object) 1.0f);
        java.lang.Object[] objArray21 = treeSetTestDriver7.toArray();
        int int22 = treeSetTestDriver7.size();
        experiment.util.TreeSetTestDriver treeSetTestDriver23 = new experiment.util.TreeSetTestDriver();
        boolean boolean24 = treeSetTestDriver23.isEmpty();
        experiment.util.Iterator iterator25 = treeSetTestDriver23.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver26 = new experiment.util.TreeSetTestDriver();
        boolean boolean27 = treeSetTestDriver26.isEmpty();
        boolean boolean28 = treeSetTestDriver26.isEmpty();
        boolean boolean29 = treeSetTestDriver23.remove((java.lang.Object) boolean28);
        java.lang.Class<?> wildcardClass30 = treeSetTestDriver23.getClass();
        boolean boolean31 = treeSetTestDriver7.remove((java.lang.Object) wildcardClass30);
        treeSetTestDriver7.clear();
        boolean boolean33 = treeSetTestDriver0.equals_CUT((java.lang.Object) treeSetTestDriver7);
        experiment.util.TreeSetTestDriver treeSetTestDriver34 = new experiment.util.TreeSetTestDriver();
        boolean boolean35 = treeSetTestDriver34.isEmpty();
        experiment.util.Iterator iterator36 = treeSetTestDriver34.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver37 = new experiment.util.TreeSetTestDriver();
        boolean boolean38 = treeSetTestDriver37.isEmpty();
        boolean boolean39 = treeSetTestDriver37.isEmpty();
        boolean boolean40 = treeSetTestDriver34.remove((java.lang.Object) boolean39);
        int int41 = treeSetTestDriver34.size();
        experiment.util.TreeSetTestDriver treeSetTestDriver42 = new experiment.util.TreeSetTestDriver();
        boolean boolean43 = treeSetTestDriver42.isEmpty();
        experiment.util.Iterator iterator44 = treeSetTestDriver42.iterator();
        boolean boolean45 = treeSetTestDriver34.remove((java.lang.Object) iterator44);
        experiment.util.Iterator iterator46 = treeSetTestDriver34.iterator();
        int int47 = treeSetTestDriver34.size();
        experiment.util.Iterator iterator48 = treeSetTestDriver34.iterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean49 = treeSetTestDriver0.contains((java.lang.Object) iterator48);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet$TreeSetIterator cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(comparator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(iterator44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(iterator46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(iterator48);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test124");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        java.lang.Object[] objArray2 = treeSetTestDriver0.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver3 = new experiment.util.TreeSetTestDriver();
        boolean boolean4 = treeSetTestDriver3.isEmpty();
        experiment.util.Iterator iterator5 = treeSetTestDriver3.iterator();
        experiment.util.Iterator iterator6 = treeSetTestDriver3.iterator();
        boolean boolean8 = treeSetTestDriver3.contains((java.lang.Object) 10L);
        int int9 = treeSetTestDriver3.size();
        boolean boolean11 = treeSetTestDriver3.contains((java.lang.Object) (-1L));
        experiment.util.TreeSetTestDriver treeSetTestDriver12 = new experiment.util.TreeSetTestDriver();
        boolean boolean13 = treeSetTestDriver12.isEmpty();
        experiment.util.Iterator iterator14 = treeSetTestDriver12.iterator();
        experiment.util.Iterator iterator15 = treeSetTestDriver12.iterator();
        boolean boolean17 = treeSetTestDriver12.contains((java.lang.Object) 10L);
        int int18 = treeSetTestDriver12.size();
        boolean boolean20 = treeSetTestDriver12.contains((java.lang.Object) (-1L));
        int int21 = treeSetTestDriver12.size();
        java.lang.Object obj22 = treeSetTestDriver3.getMatch((java.lang.Object) int21);
        experiment.util.Iterator iterator23 = treeSetTestDriver3.iterator();
        experiment.util.Iterator iterator24 = treeSetTestDriver3.iterator();
        boolean boolean25 = treeSetTestDriver0.add((java.lang.Object) treeSetTestDriver3);
        experiment.util.TreeSetTestDriver treeSetTestDriver26 = new experiment.util.TreeSetTestDriver();
        boolean boolean27 = treeSetTestDriver26.isEmpty();
        experiment.util.Iterator iterator28 = treeSetTestDriver26.iterator();
        experiment.util.Iterator iterator29 = treeSetTestDriver26.iterator();
        java.lang.Object obj31 = treeSetTestDriver26.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator32 = treeSetTestDriver26.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver33 = new experiment.util.TreeSetTestDriver();
        boolean boolean34 = treeSetTestDriver33.isEmpty();
        boolean boolean35 = treeSetTestDriver33.isEmpty();
        boolean boolean36 = treeSetTestDriver33.isEmpty();
        boolean boolean38 = treeSetTestDriver33.contains((java.lang.Object) 1.0f);
        boolean boolean39 = treeSetTestDriver26.equals_CUT((java.lang.Object) 1.0f);
        java.lang.Object[] objArray40 = treeSetTestDriver26.toArray();
        int int41 = treeSetTestDriver26.size();
        experiment.util.TreeSetTestDriver treeSetTestDriver42 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator43 = treeSetTestDriver42.comparator();
        boolean boolean44 = treeSetTestDriver42.isEmpty();
        boolean boolean45 = treeSetTestDriver42.isEmpty();
        boolean boolean46 = treeSetTestDriver26.equals_CUT((java.lang.Object) treeSetTestDriver42);
        experiment.util.TreeSetTestDriver treeSetTestDriver47 = new experiment.util.TreeSetTestDriver();
        boolean boolean48 = treeSetTestDriver47.isEmpty();
        experiment.util.Iterator iterator49 = treeSetTestDriver47.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver50 = new experiment.util.TreeSetTestDriver();
        boolean boolean51 = treeSetTestDriver50.isEmpty();
        boolean boolean52 = treeSetTestDriver50.isEmpty();
        boolean boolean53 = treeSetTestDriver47.remove((java.lang.Object) boolean52);
        int int54 = treeSetTestDriver47.size();
        experiment.util.TreeSetTestDriver treeSetTestDriver55 = new experiment.util.TreeSetTestDriver();
        boolean boolean56 = treeSetTestDriver55.isEmpty();
        experiment.util.Iterator iterator57 = treeSetTestDriver55.iterator();
        boolean boolean58 = treeSetTestDriver47.remove((java.lang.Object) iterator57);
        boolean boolean59 = treeSetTestDriver26.remove((java.lang.Object) iterator57);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj60 = treeSetTestDriver3.getMatch((java.lang.Object) iterator57);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet$TreeSetIterator cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(comparator32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(comparator43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(iterator49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(iterator57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test125");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver2 = new experiment.util.TreeSetTestDriver();
        boolean boolean3 = treeSetTestDriver2.isEmpty();
        experiment.util.Iterator iterator4 = treeSetTestDriver2.iterator();
        experiment.util.Iterator iterator5 = treeSetTestDriver2.iterator();
        boolean boolean7 = treeSetTestDriver2.contains((java.lang.Object) 10L);
        boolean boolean8 = treeSetTestDriver0.add((java.lang.Object) 10L);
        experiment.util.TreeSetTestDriver treeSetTestDriver9 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator10 = treeSetTestDriver9.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver11 = new experiment.util.TreeSetTestDriver();
        boolean boolean12 = treeSetTestDriver11.isEmpty();
        experiment.util.Iterator iterator13 = treeSetTestDriver11.iterator();
        experiment.util.Iterator iterator14 = treeSetTestDriver11.iterator();
        boolean boolean16 = treeSetTestDriver11.contains((java.lang.Object) 10L);
        boolean boolean17 = treeSetTestDriver9.add((java.lang.Object) 10L);
        boolean boolean18 = treeSetTestDriver0.equals_CUT((java.lang.Object) boolean17);
        int int19 = treeSetTestDriver0.size();
        int int20 = treeSetTestDriver0.size();
        experiment.util.TreeSetTestDriver treeSetTestDriver21 = new experiment.util.TreeSetTestDriver();
        experiment.util.TreeSetTestDriver treeSetTestDriver22 = new experiment.util.TreeSetTestDriver();
        boolean boolean23 = treeSetTestDriver22.isEmpty();
        boolean boolean24 = treeSetTestDriver22.isEmpty();
        boolean boolean25 = treeSetTestDriver22.isEmpty();
        boolean boolean26 = treeSetTestDriver22.isEmpty();
        boolean boolean28 = treeSetTestDriver22.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean29 = treeSetTestDriver21.equals_CUT((java.lang.Object) treeSetTestDriver22);
        experiment.util.Iterator iterator30 = treeSetTestDriver21.iterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = treeSetTestDriver0.add((java.lang.Object) treeSetTestDriver21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(iterator30);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test126");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        java.lang.Object[] objArray4 = treeSetTestDriver0.toArray();
        java.lang.Class<?> wildcardClass5 = objArray4.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test127");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver3 = new experiment.util.TreeSetTestDriver();
        boolean boolean4 = treeSetTestDriver3.isEmpty();
        boolean boolean5 = treeSetTestDriver3.isEmpty();
        boolean boolean6 = treeSetTestDriver0.remove((java.lang.Object) boolean5);
        int int7 = treeSetTestDriver0.size();
        boolean boolean9 = treeSetTestDriver0.remove((java.lang.Object) 0);
        int int10 = treeSetTestDriver0.size();
        experiment.util.TreeSetTestDriver treeSetTestDriver11 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator12 = treeSetTestDriver11.comparator();
        java.lang.Object[] objArray13 = treeSetTestDriver11.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver14 = new experiment.util.TreeSetTestDriver();
        boolean boolean15 = treeSetTestDriver14.isEmpty();
        experiment.util.Iterator iterator16 = treeSetTestDriver14.iterator();
        experiment.util.Iterator iterator17 = treeSetTestDriver14.iterator();
        boolean boolean19 = treeSetTestDriver14.contains((java.lang.Object) 10L);
        int int20 = treeSetTestDriver14.size();
        boolean boolean22 = treeSetTestDriver14.contains((java.lang.Object) (-1L));
        experiment.util.TreeSetTestDriver treeSetTestDriver23 = new experiment.util.TreeSetTestDriver();
        boolean boolean24 = treeSetTestDriver23.isEmpty();
        experiment.util.Iterator iterator25 = treeSetTestDriver23.iterator();
        experiment.util.Iterator iterator26 = treeSetTestDriver23.iterator();
        boolean boolean28 = treeSetTestDriver23.contains((java.lang.Object) 10L);
        int int29 = treeSetTestDriver23.size();
        boolean boolean31 = treeSetTestDriver23.contains((java.lang.Object) (-1L));
        int int32 = treeSetTestDriver23.size();
        java.lang.Object obj33 = treeSetTestDriver14.getMatch((java.lang.Object) int32);
        experiment.util.Iterator iterator34 = treeSetTestDriver14.iterator();
        experiment.util.Iterator iterator35 = treeSetTestDriver14.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver36 = new experiment.util.TreeSetTestDriver();
        boolean boolean37 = treeSetTestDriver36.isEmpty();
        boolean boolean38 = treeSetTestDriver36.isEmpty();
        boolean boolean39 = treeSetTestDriver14.equals_CUT((java.lang.Object) boolean38);
        boolean boolean40 = treeSetTestDriver11.contains((java.lang.Object) boolean39);
        boolean boolean42 = treeSetTestDriver11.add((java.lang.Object) (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean43 = treeSetTestDriver0.contains((java.lang.Object) treeSetTestDriver11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1321793073_1024_0.test128");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        boolean boolean2 = treeSetTestDriver0.isEmpty();
        treeSetTestDriver0.clear();
        boolean boolean5 = treeSetTestDriver0.add((java.lang.Object) 10.0f);
        experiment.util.Comparator comparator6 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver7 = new experiment.util.TreeSetTestDriver();
        boolean boolean8 = treeSetTestDriver7.isEmpty();
        boolean boolean9 = treeSetTestDriver7.isEmpty();
        boolean boolean10 = treeSetTestDriver7.isEmpty();
        boolean boolean11 = treeSetTestDriver7.isEmpty();
        boolean boolean13 = treeSetTestDriver7.equals_CUT((java.lang.Object) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = treeSetTestDriver0.add((java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to java.lang.Short");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

}
