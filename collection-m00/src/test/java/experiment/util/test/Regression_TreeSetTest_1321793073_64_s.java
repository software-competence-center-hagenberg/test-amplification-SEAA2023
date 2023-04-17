package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_TreeSetTest_1321793073_64_s {

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

}
