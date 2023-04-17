package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_TreeSetTest_1264048269_128_s {

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
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test001");
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
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test002");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.equals_CUT((java.lang.Object) (short) 10);
        java.lang.Object[] objArray4 = treeSetTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test003");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) 10);
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = treeSetTestDriver0.equals_CUT(obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test004");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) 10);
        java.lang.Object obj6 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = treeSetTestDriver0.getMatch(obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Object cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test005");
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
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test006");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.equals_CUT((java.lang.Object) (short) 10);
        java.lang.Object[] objArray4 = treeSetTestDriver0.toArray();
        experiment.util.Comparator comparator5 = treeSetTestDriver0.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(comparator5);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test007");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.equals_CUT((java.lang.Object) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test008");
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
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test009");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        java.lang.Class<?> wildcardClass2 = treeSetTestDriver0.getClass();
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test010");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) 10);
        boolean boolean7 = treeSetTestDriver0.remove((java.lang.Object) (byte) 0);
        treeSetTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test011");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver2 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator3 = treeSetTestDriver2.iterator();
        boolean boolean5 = treeSetTestDriver2.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean7 = treeSetTestDriver2.remove((java.lang.Object) 10);
        boolean boolean8 = treeSetTestDriver0.add((java.lang.Object) boolean7);
        treeSetTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test012");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        experiment.util.Comparator comparator2 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver3 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator4 = treeSetTestDriver3.iterator();
        boolean boolean6 = treeSetTestDriver3.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean8 = treeSetTestDriver3.remove((java.lang.Object) 10);
        treeSetTestDriver3.clear();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = treeSetTestDriver0.contains((java.lang.Object) treeSetTestDriver3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test013");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj1 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = treeSetTestDriver0.contains(obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Object cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test014");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) 10);
        boolean boolean6 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator7 = treeSetTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(iterator7);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test015");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) 10);
        boolean boolean7 = treeSetTestDriver0.remove((java.lang.Object) (byte) 0);
        experiment.util.Iterator iterator8 = treeSetTestDriver0.iterator();
        java.lang.Class<?> wildcardClass9 = treeSetTestDriver0.getClass();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test016");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver2 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator3 = treeSetTestDriver2.iterator();
        boolean boolean5 = treeSetTestDriver2.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean7 = treeSetTestDriver2.remove((java.lang.Object) 10);
        boolean boolean8 = treeSetTestDriver0.add((java.lang.Object) boolean7);
        treeSetTestDriver0.clear();
        java.lang.Object obj11 = treeSetTestDriver0.getMatch((java.lang.Object) false);
        experiment.util.TreeSetTestDriver treeSetTestDriver12 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator13 = treeSetTestDriver12.iterator();
        boolean boolean15 = treeSetTestDriver12.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean17 = treeSetTestDriver12.remove((java.lang.Object) 10);
        boolean boolean18 = treeSetTestDriver0.equals_CUT((java.lang.Object) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test017");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.equals_CUT((java.lang.Object) (short) 10);
        java.lang.Object[] objArray4 = treeSetTestDriver0.toArray();
        treeSetTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test018");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.equals_CUT((java.lang.Object) (short) 10);
        java.lang.Object[] objArray4 = treeSetTestDriver0.toArray();
        experiment.util.Comparator comparator5 = treeSetTestDriver0.comparator();
        treeSetTestDriver0.clear();
        experiment.util.TreeSetTestDriver treeSetTestDriver7 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator8 = treeSetTestDriver7.iterator();
        boolean boolean10 = treeSetTestDriver7.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean12 = treeSetTestDriver7.remove((java.lang.Object) 10);
        boolean boolean14 = treeSetTestDriver7.remove((java.lang.Object) (byte) 0);
        experiment.util.Iterator iterator15 = treeSetTestDriver7.iterator();
        boolean boolean16 = treeSetTestDriver0.add((java.lang.Object) iterator15);
        experiment.util.TreeSetTestDriver treeSetTestDriver17 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator18 = treeSetTestDriver17.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver19 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator20 = treeSetTestDriver19.iterator();
        boolean boolean22 = treeSetTestDriver19.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean24 = treeSetTestDriver19.remove((java.lang.Object) 10);
        boolean boolean25 = treeSetTestDriver17.add((java.lang.Object) boolean24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = treeSetTestDriver0.getMatch((java.lang.Object) treeSetTestDriver17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(comparator5);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(comparator18);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test019");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) 10);
        treeSetTestDriver0.clear();
        experiment.util.Comparator comparator7 = treeSetTestDriver0.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(comparator7);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test020");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        experiment.util.Comparator comparator2 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver3 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator4 = treeSetTestDriver3.iterator();
        boolean boolean6 = treeSetTestDriver3.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean8 = treeSetTestDriver3.remove((java.lang.Object) 10);
        boolean boolean9 = treeSetTestDriver0.add((java.lang.Object) boolean8);
        experiment.util.TreeSetTestDriver treeSetTestDriver10 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator11 = treeSetTestDriver10.iterator();
        boolean boolean13 = treeSetTestDriver10.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean15 = treeSetTestDriver10.remove((java.lang.Object) 10);
        boolean boolean17 = treeSetTestDriver10.remove((java.lang.Object) (byte) 0);
        experiment.util.Iterator iterator18 = treeSetTestDriver10.iterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = treeSetTestDriver0.add((java.lang.Object) treeSetTestDriver10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(iterator18);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test021");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.add((java.lang.Object) 10.0f);
        experiment.util.TreeSetTestDriver treeSetTestDriver4 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator5 = treeSetTestDriver4.iterator();
        boolean boolean7 = treeSetTestDriver4.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean9 = treeSetTestDriver4.remove((java.lang.Object) 10);
        boolean boolean11 = treeSetTestDriver4.remove((java.lang.Object) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = treeSetTestDriver0.remove((java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to java.lang.Byte");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test022");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.equals_CUT((java.lang.Object) (short) 10);
        java.lang.Object[] objArray4 = treeSetTestDriver0.toArray();
        experiment.util.Comparator comparator5 = treeSetTestDriver0.comparator();
        treeSetTestDriver0.clear();
        experiment.util.TreeSetTestDriver treeSetTestDriver7 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator8 = treeSetTestDriver7.iterator();
        boolean boolean10 = treeSetTestDriver7.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean12 = treeSetTestDriver7.remove((java.lang.Object) 10);
        boolean boolean14 = treeSetTestDriver7.remove((java.lang.Object) (byte) 0);
        experiment.util.Iterator iterator15 = treeSetTestDriver7.iterator();
        boolean boolean16 = treeSetTestDriver0.add((java.lang.Object) iterator15);
        java.lang.Object obj17 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = treeSetTestDriver0.add(obj17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Object cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(comparator5);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test023");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.equals_CUT((java.lang.Object) (short) 10);
        java.lang.Object[] objArray4 = treeSetTestDriver0.toArray();
        experiment.util.Comparator comparator5 = treeSetTestDriver0.comparator();
        treeSetTestDriver0.clear();
        experiment.util.TreeSetTestDriver treeSetTestDriver7 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator8 = treeSetTestDriver7.iterator();
        boolean boolean10 = treeSetTestDriver7.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean12 = treeSetTestDriver7.remove((java.lang.Object) 10);
        boolean boolean14 = treeSetTestDriver7.remove((java.lang.Object) (byte) 0);
        experiment.util.Iterator iterator15 = treeSetTestDriver7.iterator();
        boolean boolean16 = treeSetTestDriver0.add((java.lang.Object) iterator15);
        experiment.util.TreeSetTestDriver treeSetTestDriver17 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator18 = treeSetTestDriver17.iterator();
        boolean boolean20 = treeSetTestDriver17.equals_CUT((java.lang.Object) (short) 10);
        treeSetTestDriver17.clear();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = treeSetTestDriver0.remove((java.lang.Object) treeSetTestDriver17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(comparator5);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test024");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.equals_CUT((java.lang.Object) (short) 10);
        java.lang.Object[] objArray4 = treeSetTestDriver0.toArray();
        experiment.util.Comparator comparator5 = treeSetTestDriver0.comparator();
        treeSetTestDriver0.clear();
        experiment.util.Comparator comparator7 = treeSetTestDriver0.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(comparator5);
        org.junit.Assert.assertNull(comparator7);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test025");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) 10);
        boolean boolean7 = treeSetTestDriver0.remove((java.lang.Object) (byte) 0);
        experiment.util.Iterator iterator8 = treeSetTestDriver0.iterator();
        treeSetTestDriver0.clear();
        experiment.util.TreeSetTestDriver treeSetTestDriver10 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator11 = treeSetTestDriver10.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver12 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator13 = treeSetTestDriver12.iterator();
        boolean boolean15 = treeSetTestDriver12.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean17 = treeSetTestDriver12.remove((java.lang.Object) 10);
        boolean boolean18 = treeSetTestDriver10.add((java.lang.Object) boolean17);
        treeSetTestDriver10.clear();
        experiment.util.Comparator comparator20 = treeSetTestDriver10.comparator();
        experiment.util.Comparator comparator21 = treeSetTestDriver10.comparator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = treeSetTestDriver0.remove((java.lang.Object) comparator21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(comparator20);
        org.junit.Assert.assertNull(comparator21);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test026");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver2 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator3 = treeSetTestDriver2.iterator();
        boolean boolean5 = treeSetTestDriver2.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean7 = treeSetTestDriver2.remove((java.lang.Object) 10);
        boolean boolean8 = treeSetTestDriver0.add((java.lang.Object) boolean7);
        treeSetTestDriver0.clear();
        experiment.util.Comparator comparator10 = treeSetTestDriver0.comparator();
        experiment.util.Iterator iterator11 = treeSetTestDriver0.iterator();
        java.lang.Object[] objArray12 = treeSetTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test027");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.equals_CUT((java.lang.Object) (short) 10);
        treeSetTestDriver0.clear();
        experiment.util.TreeSetTestDriver treeSetTestDriver5 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator6 = treeSetTestDriver5.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver7 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator8 = treeSetTestDriver7.iterator();
        boolean boolean10 = treeSetTestDriver7.equals_CUT((java.lang.Object) (short) 10);
        java.lang.Object[] objArray11 = treeSetTestDriver7.toArray();
        experiment.util.Comparator comparator12 = treeSetTestDriver7.comparator();
        boolean boolean13 = treeSetTestDriver5.remove((java.lang.Object) treeSetTestDriver7);
        experiment.util.Comparator comparator14 = treeSetTestDriver7.comparator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = treeSetTestDriver0.remove((java.lang.Object) comparator14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(comparator14);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test028");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.equals_CUT((java.lang.Object) (short) 10);
        java.lang.Object[] objArray4 = treeSetTestDriver0.toArray();
        experiment.util.Comparator comparator5 = treeSetTestDriver0.comparator();
        treeSetTestDriver0.clear();
        experiment.util.TreeSetTestDriver treeSetTestDriver7 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator8 = treeSetTestDriver7.iterator();
        boolean boolean10 = treeSetTestDriver7.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean12 = treeSetTestDriver7.remove((java.lang.Object) 10);
        boolean boolean14 = treeSetTestDriver7.remove((java.lang.Object) (byte) 0);
        experiment.util.Iterator iterator15 = treeSetTestDriver7.iterator();
        boolean boolean16 = treeSetTestDriver0.add((java.lang.Object) iterator15);
        experiment.util.TreeSetTestDriver treeSetTestDriver17 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator18 = treeSetTestDriver17.iterator();
        boolean boolean20 = treeSetTestDriver17.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean22 = treeSetTestDriver17.remove((java.lang.Object) 10);
        boolean boolean24 = treeSetTestDriver17.remove((java.lang.Object) (byte) 0);
        treeSetTestDriver17.clear();
        boolean boolean26 = treeSetTestDriver17.isEmpty();
        java.lang.Class<?> wildcardClass27 = treeSetTestDriver17.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = treeSetTestDriver0.remove((java.lang.Object) wildcardClass27);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(comparator5);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test029");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) 10);
        boolean boolean7 = treeSetTestDriver0.remove((java.lang.Object) (byte) 0);
        experiment.util.Iterator iterator8 = treeSetTestDriver0.iterator();
        boolean boolean10 = treeSetTestDriver0.contains((java.lang.Object) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test030");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver2 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator3 = treeSetTestDriver2.iterator();
        boolean boolean5 = treeSetTestDriver2.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean7 = treeSetTestDriver2.remove((java.lang.Object) 10);
        boolean boolean8 = treeSetTestDriver0.add((java.lang.Object) boolean7);
        treeSetTestDriver0.clear();
        int int10 = treeSetTestDriver0.size();
        boolean boolean12 = treeSetTestDriver0.remove((java.lang.Object) "hi!");
        java.lang.Object obj13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = treeSetTestDriver0.getMatch(obj13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test031");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.equals_CUT((java.lang.Object) (short) 10);
        java.lang.Object[] objArray4 = treeSetTestDriver0.toArray();
        experiment.util.Comparator comparator5 = treeSetTestDriver0.comparator();
        treeSetTestDriver0.clear();
        java.lang.Object obj8 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = obj8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(comparator5);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test032");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.remove((java.lang.Object) 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test033");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver2 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator3 = treeSetTestDriver2.iterator();
        boolean boolean5 = treeSetTestDriver2.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean7 = treeSetTestDriver2.remove((java.lang.Object) 10);
        boolean boolean8 = treeSetTestDriver0.add((java.lang.Object) boolean7);
        treeSetTestDriver0.clear();
        java.lang.Object obj11 = treeSetTestDriver0.getMatch((java.lang.Object) false);
        experiment.util.Comparator comparator12 = treeSetTestDriver0.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = comparator12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(comparator12);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test034");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver2 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator3 = treeSetTestDriver2.iterator();
        boolean boolean5 = treeSetTestDriver2.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean7 = treeSetTestDriver2.remove((java.lang.Object) 10);
        boolean boolean8 = treeSetTestDriver0.add((java.lang.Object) boolean7);
        treeSetTestDriver0.clear();
        java.lang.Object obj11 = treeSetTestDriver0.getMatch((java.lang.Object) false);
        int int12 = treeSetTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test035");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.add((java.lang.Object) 10.0f);
        java.lang.Object obj4 = treeSetTestDriver0.first();
        experiment.util.TreeSetTestDriver treeSetTestDriver5 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator6 = treeSetTestDriver5.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver7 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator8 = treeSetTestDriver7.iterator();
        boolean boolean10 = treeSetTestDriver7.equals_CUT((java.lang.Object) (short) 10);
        java.lang.Object[] objArray11 = treeSetTestDriver7.toArray();
        experiment.util.Comparator comparator12 = treeSetTestDriver7.comparator();
        boolean boolean13 = treeSetTestDriver5.remove((java.lang.Object) treeSetTestDriver7);
        java.lang.Object[] objArray14 = treeSetTestDriver5.toArray();
        treeSetTestDriver5.clear();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = treeSetTestDriver0.remove((java.lang.Object) treeSetTestDriver5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0f + "'", obj4, 10.0f);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test036");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver2 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator3 = treeSetTestDriver2.iterator();
        boolean boolean5 = treeSetTestDriver2.equals_CUT((java.lang.Object) (short) 10);
        java.lang.Object[] objArray6 = treeSetTestDriver2.toArray();
        experiment.util.Comparator comparator7 = treeSetTestDriver2.comparator();
        boolean boolean8 = treeSetTestDriver0.remove((java.lang.Object) treeSetTestDriver2);
        java.lang.Object[] objArray9 = treeSetTestDriver0.toArray();
        treeSetTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNull(comparator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test037");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) 10);
        boolean boolean7 = treeSetTestDriver0.remove((java.lang.Object) (byte) 0);
        treeSetTestDriver0.clear();
        experiment.util.Comparator comparator9 = treeSetTestDriver0.comparator();
        java.lang.Class<?> wildcardClass10 = treeSetTestDriver0.getClass();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test038");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver2 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator3 = treeSetTestDriver2.iterator();
        boolean boolean5 = treeSetTestDriver2.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean7 = treeSetTestDriver2.remove((java.lang.Object) 10);
        boolean boolean8 = treeSetTestDriver0.add((java.lang.Object) boolean7);
        treeSetTestDriver0.clear();
        java.lang.Object obj11 = treeSetTestDriver0.getMatch((java.lang.Object) false);
        experiment.util.TreeSetTestDriver treeSetTestDriver12 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator13 = treeSetTestDriver12.iterator();
        boolean boolean15 = treeSetTestDriver12.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean17 = treeSetTestDriver12.remove((java.lang.Object) 10);
        boolean boolean18 = treeSetTestDriver0.equals_CUT((java.lang.Object) 10);
        experiment.util.Comparator comparator19 = treeSetTestDriver0.comparator();
        treeSetTestDriver0.clear();
        experiment.util.TreeSetTestDriver treeSetTestDriver21 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator22 = treeSetTestDriver21.iterator();
        boolean boolean24 = treeSetTestDriver21.add((java.lang.Object) 10.0f);
        boolean boolean25 = treeSetTestDriver0.equals_CUT((java.lang.Object) treeSetTestDriver21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(comparator19);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test039");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.equals_CUT((java.lang.Object) (short) 10);
        java.lang.Object[] objArray4 = treeSetTestDriver0.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver5 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator6 = treeSetTestDriver5.iterator();
        boolean boolean8 = treeSetTestDriver5.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean10 = treeSetTestDriver5.remove((java.lang.Object) 10);
        boolean boolean12 = treeSetTestDriver5.remove((java.lang.Object) (byte) 0);
        treeSetTestDriver5.clear();
        java.lang.Object[] objArray14 = treeSetTestDriver5.toArray();
        java.lang.Class<?> wildcardClass15 = treeSetTestDriver5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = treeSetTestDriver0.getMatch((java.lang.Object) treeSetTestDriver5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test040");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver2 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator3 = treeSetTestDriver2.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver4 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator5 = treeSetTestDriver4.iterator();
        boolean boolean7 = treeSetTestDriver4.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean9 = treeSetTestDriver4.remove((java.lang.Object) 10);
        boolean boolean10 = treeSetTestDriver2.add((java.lang.Object) boolean9);
        treeSetTestDriver2.clear();
        java.lang.Object obj13 = treeSetTestDriver2.getMatch((java.lang.Object) false);
        experiment.util.TreeSetTestDriver treeSetTestDriver14 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator15 = treeSetTestDriver14.iterator();
        boolean boolean17 = treeSetTestDriver14.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean19 = treeSetTestDriver14.remove((java.lang.Object) 10);
        boolean boolean20 = treeSetTestDriver2.equals_CUT((java.lang.Object) 10);
        experiment.util.Comparator comparator21 = treeSetTestDriver2.comparator();
        treeSetTestDriver2.clear();
        experiment.util.TreeSetTestDriver treeSetTestDriver23 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator24 = treeSetTestDriver23.iterator();
        boolean boolean26 = treeSetTestDriver23.add((java.lang.Object) 10.0f);
        boolean boolean27 = treeSetTestDriver2.equals_CUT((java.lang.Object) treeSetTestDriver23);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = treeSetTestDriver0.contains((java.lang.Object) treeSetTestDriver2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(comparator21);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test041");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.equals_CUT((java.lang.Object) (short) 10);
        java.lang.Object[] objArray4 = treeSetTestDriver0.toArray();
        treeSetTestDriver0.clear();
        boolean boolean7 = treeSetTestDriver0.contains((java.lang.Object) (short) 100);
        treeSetTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test042");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.equals_CUT((java.lang.Object) (short) 10);
        treeSetTestDriver0.clear();
        java.lang.Object obj6 = treeSetTestDriver0.getMatch((java.lang.Object) 100.0d);
        experiment.util.TreeSetTestDriver treeSetTestDriver7 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator8 = treeSetTestDriver7.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver9 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator10 = treeSetTestDriver9.iterator();
        boolean boolean12 = treeSetTestDriver9.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean14 = treeSetTestDriver9.remove((java.lang.Object) 10);
        boolean boolean15 = treeSetTestDriver7.add((java.lang.Object) boolean14);
        treeSetTestDriver7.clear();
        java.lang.Object obj18 = treeSetTestDriver7.getMatch((java.lang.Object) false);
        boolean boolean20 = treeSetTestDriver7.add((java.lang.Object) 100.0f);
        experiment.util.Iterator iterator21 = treeSetTestDriver7.iterator();
        java.lang.Object[] objArray22 = treeSetTestDriver7.toArray();
        java.lang.Object[] objArray23 = treeSetTestDriver7.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = treeSetTestDriver0.getMatch((java.lang.Object) objArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Ljava.lang.Object; cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(comparator8);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[100.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[100.0]");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test043");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        experiment.util.Comparator comparator2 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver3 = new experiment.util.TreeSetTestDriver();
        treeSetTestDriver3.clear();
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) treeSetTestDriver3);
        experiment.util.TreeSetTestDriver treeSetTestDriver6 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator7 = treeSetTestDriver6.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver8 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator9 = treeSetTestDriver8.iterator();
        boolean boolean11 = treeSetTestDriver8.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean13 = treeSetTestDriver8.remove((java.lang.Object) 10);
        boolean boolean14 = treeSetTestDriver6.add((java.lang.Object) boolean13);
        treeSetTestDriver6.clear();
        experiment.util.Comparator comparator16 = treeSetTestDriver6.comparator();
        experiment.util.Comparator comparator17 = treeSetTestDriver6.comparator();
        treeSetTestDriver6.clear();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = treeSetTestDriver0.contains((java.lang.Object) treeSetTestDriver6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(comparator7);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(comparator16);
        org.junit.Assert.assertNull(comparator17);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test044");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        treeSetTestDriver0.clear();
        experiment.util.Comparator comparator2 = treeSetTestDriver0.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator2);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test045");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver2 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator3 = treeSetTestDriver2.iterator();
        boolean boolean5 = treeSetTestDriver2.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean7 = treeSetTestDriver2.remove((java.lang.Object) 10);
        boolean boolean8 = treeSetTestDriver0.add((java.lang.Object) boolean7);
        treeSetTestDriver0.clear();
        experiment.util.Comparator comparator10 = treeSetTestDriver0.comparator();
        boolean boolean11 = treeSetTestDriver0.isEmpty();
        experiment.util.TreeSetTestDriver treeSetTestDriver12 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator13 = treeSetTestDriver12.iterator();
        boolean boolean15 = treeSetTestDriver12.add((java.lang.Object) 10.0f);
        java.lang.Object obj16 = treeSetTestDriver12.first();
        experiment.util.Iterator iterator17 = treeSetTestDriver12.iterator();
        boolean boolean18 = treeSetTestDriver0.remove((java.lang.Object) treeSetTestDriver12);
        experiment.util.TreeSetTestDriver treeSetTestDriver19 = new experiment.util.TreeSetTestDriver();
        treeSetTestDriver19.clear();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = treeSetTestDriver0.contains((java.lang.Object) treeSetTestDriver19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 10.0f + "'", obj16, 10.0f);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test046");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) 10);
        boolean boolean7 = treeSetTestDriver0.remove((java.lang.Object) (byte) 0);
        experiment.util.Iterator iterator8 = treeSetTestDriver0.iterator();
        treeSetTestDriver0.clear();
        java.lang.Object[] objArray10 = treeSetTestDriver0.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver11 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator12 = treeSetTestDriver11.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver13 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator14 = treeSetTestDriver13.iterator();
        boolean boolean16 = treeSetTestDriver13.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean18 = treeSetTestDriver13.remove((java.lang.Object) 10);
        boolean boolean19 = treeSetTestDriver11.add((java.lang.Object) boolean18);
        treeSetTestDriver11.clear();
        java.lang.Object obj22 = treeSetTestDriver11.getMatch((java.lang.Object) false);
        experiment.util.Comparator comparator23 = treeSetTestDriver11.comparator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = treeSetTestDriver0.remove((java.lang.Object) comparator23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(comparator23);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test047");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver2 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator3 = treeSetTestDriver2.iterator();
        boolean boolean5 = treeSetTestDriver2.equals_CUT((java.lang.Object) (short) 10);
        java.lang.Object[] objArray6 = treeSetTestDriver2.toArray();
        experiment.util.Comparator comparator7 = treeSetTestDriver2.comparator();
        boolean boolean8 = treeSetTestDriver0.remove((java.lang.Object) treeSetTestDriver2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNull(comparator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test048");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver2 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator3 = treeSetTestDriver2.iterator();
        boolean boolean5 = treeSetTestDriver2.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean7 = treeSetTestDriver2.remove((java.lang.Object) 10);
        boolean boolean8 = treeSetTestDriver0.add((java.lang.Object) boolean7);
        treeSetTestDriver0.clear();
        experiment.util.Comparator comparator10 = treeSetTestDriver0.comparator();
        boolean boolean11 = treeSetTestDriver0.isEmpty();
        experiment.util.TreeSetTestDriver treeSetTestDriver12 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator13 = treeSetTestDriver12.iterator();
        boolean boolean15 = treeSetTestDriver12.add((java.lang.Object) 10.0f);
        java.lang.Object obj16 = treeSetTestDriver12.first();
        experiment.util.Iterator iterator17 = treeSetTestDriver12.iterator();
        boolean boolean18 = treeSetTestDriver0.remove((java.lang.Object) treeSetTestDriver12);
        boolean boolean20 = treeSetTestDriver0.equals_CUT((java.lang.Object) (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 10.0f + "'", obj16, 10.0f);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test049");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver2 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator3 = treeSetTestDriver2.iterator();
        boolean boolean5 = treeSetTestDriver2.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean7 = treeSetTestDriver2.remove((java.lang.Object) 10);
        boolean boolean8 = treeSetTestDriver0.add((java.lang.Object) boolean7);
        treeSetTestDriver0.clear();
        experiment.util.Comparator comparator10 = treeSetTestDriver0.comparator();
        boolean boolean11 = treeSetTestDriver0.isEmpty();
        experiment.util.TreeSetTestDriver treeSetTestDriver12 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator13 = treeSetTestDriver12.iterator();
        boolean boolean15 = treeSetTestDriver12.add((java.lang.Object) 10.0f);
        java.lang.Object obj16 = treeSetTestDriver12.first();
        experiment.util.Iterator iterator17 = treeSetTestDriver12.iterator();
        boolean boolean18 = treeSetTestDriver0.remove((java.lang.Object) treeSetTestDriver12);
        int int19 = treeSetTestDriver0.size();
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 10.0f + "'", obj16, 10.0f);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test050");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) 10);
        boolean boolean7 = treeSetTestDriver0.remove((java.lang.Object) (byte) 0);
        experiment.util.Iterator iterator8 = treeSetTestDriver0.iterator();
        boolean boolean10 = treeSetTestDriver0.contains((java.lang.Object) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test051");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.equals_CUT((java.lang.Object) (short) 10);
        java.lang.Object[] objArray4 = treeSetTestDriver0.toArray();
        experiment.util.Comparator comparator5 = treeSetTestDriver0.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(comparator5);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test052");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.add((java.lang.Object) 10.0f);
        java.lang.Object obj4 = treeSetTestDriver0.first();
        experiment.util.Comparator comparator5 = treeSetTestDriver0.comparator();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0f + "'", obj4, 10.0f);
        org.junit.Assert.assertNull(comparator5);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test053");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        java.lang.Object[] objArray2 = treeSetTestDriver0.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver3 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator4 = treeSetTestDriver3.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver5 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator6 = treeSetTestDriver5.iterator();
        boolean boolean8 = treeSetTestDriver5.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean10 = treeSetTestDriver5.remove((java.lang.Object) 10);
        boolean boolean11 = treeSetTestDriver3.add((java.lang.Object) boolean10);
        treeSetTestDriver3.clear();
        java.lang.Object obj14 = treeSetTestDriver3.getMatch((java.lang.Object) false);
        experiment.util.Comparator comparator15 = treeSetTestDriver3.comparator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = treeSetTestDriver0.contains((java.lang.Object) treeSetTestDriver3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(comparator15);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test054");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver2 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator3 = treeSetTestDriver2.iterator();
        boolean boolean5 = treeSetTestDriver2.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean7 = treeSetTestDriver2.remove((java.lang.Object) 10);
        boolean boolean8 = treeSetTestDriver0.add((java.lang.Object) boolean7);
        treeSetTestDriver0.clear();
        java.lang.Object obj11 = treeSetTestDriver0.getMatch((java.lang.Object) false);
        experiment.util.TreeSetTestDriver treeSetTestDriver12 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator13 = treeSetTestDriver12.iterator();
        boolean boolean15 = treeSetTestDriver12.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean17 = treeSetTestDriver12.remove((java.lang.Object) 10);
        boolean boolean18 = treeSetTestDriver0.equals_CUT((java.lang.Object) 10);
        experiment.util.Comparator comparator19 = treeSetTestDriver0.comparator();
        int int20 = treeSetTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(comparator19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test055");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver2 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator3 = treeSetTestDriver2.iterator();
        boolean boolean5 = treeSetTestDriver2.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean7 = treeSetTestDriver2.remove((java.lang.Object) 10);
        boolean boolean8 = treeSetTestDriver0.add((java.lang.Object) boolean7);
        treeSetTestDriver0.clear();
        experiment.util.Comparator comparator10 = treeSetTestDriver0.comparator();
        boolean boolean11 = treeSetTestDriver0.isEmpty();
        experiment.util.TreeSetTestDriver treeSetTestDriver12 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator13 = treeSetTestDriver12.iterator();
        boolean boolean15 = treeSetTestDriver12.add((java.lang.Object) 10.0f);
        java.lang.Object obj16 = treeSetTestDriver12.first();
        experiment.util.Iterator iterator17 = treeSetTestDriver12.iterator();
        boolean boolean18 = treeSetTestDriver0.remove((java.lang.Object) treeSetTestDriver12);
        experiment.util.TreeSetTestDriver treeSetTestDriver19 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator20 = treeSetTestDriver19.iterator();
        boolean boolean22 = treeSetTestDriver19.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean24 = treeSetTestDriver19.remove((java.lang.Object) 10);
        boolean boolean26 = treeSetTestDriver19.remove((java.lang.Object) (byte) 0);
        treeSetTestDriver19.clear();
        java.lang.Object[] objArray28 = treeSetTestDriver19.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = treeSetTestDriver0.getMatch((java.lang.Object) objArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Ljava.lang.Object; cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 10.0f + "'", obj16, 10.0f);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test056");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) 10);
        boolean boolean7 = treeSetTestDriver0.remove((java.lang.Object) (byte) 0);
        experiment.util.Iterator iterator8 = treeSetTestDriver0.iterator();
        treeSetTestDriver0.clear();
        boolean boolean10 = treeSetTestDriver0.isEmpty();
        experiment.util.TreeSetTestDriver treeSetTestDriver11 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator12 = treeSetTestDriver11.iterator();
        boolean boolean14 = treeSetTestDriver11.equals_CUT((java.lang.Object) (short) 10);
        java.lang.Object[] objArray15 = treeSetTestDriver11.toArray();
        treeSetTestDriver11.clear();
        boolean boolean18 = treeSetTestDriver11.add((java.lang.Object) 0.0d);
        treeSetTestDriver11.clear();
        boolean boolean20 = treeSetTestDriver0.equals_CUT((java.lang.Object) treeSetTestDriver11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test057");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        treeSetTestDriver0.clear();
        experiment.util.Comparator comparator2 = treeSetTestDriver0.comparator();
        treeSetTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator2);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test058");
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
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test059");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver2 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator3 = treeSetTestDriver2.iterator();
        boolean boolean5 = treeSetTestDriver2.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean7 = treeSetTestDriver2.remove((java.lang.Object) 10);
        boolean boolean8 = treeSetTestDriver0.add((java.lang.Object) boolean7);
        treeSetTestDriver0.clear();
        experiment.util.Comparator comparator10 = treeSetTestDriver0.comparator();
        boolean boolean11 = treeSetTestDriver0.isEmpty();
        experiment.util.TreeSetTestDriver treeSetTestDriver12 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator13 = treeSetTestDriver12.iterator();
        boolean boolean15 = treeSetTestDriver12.add((java.lang.Object) 10.0f);
        java.lang.Object obj16 = treeSetTestDriver12.first();
        experiment.util.Iterator iterator17 = treeSetTestDriver12.iterator();
        boolean boolean18 = treeSetTestDriver0.remove((java.lang.Object) treeSetTestDriver12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 10.0f + "'", obj16, 10.0f);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test060");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver2 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator3 = treeSetTestDriver2.iterator();
        boolean boolean5 = treeSetTestDriver2.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean7 = treeSetTestDriver2.remove((java.lang.Object) 10);
        boolean boolean8 = treeSetTestDriver0.add((java.lang.Object) boolean7);
        treeSetTestDriver0.clear();
        java.lang.Object obj11 = treeSetTestDriver0.getMatch((java.lang.Object) false);
        experiment.util.TreeSetTestDriver treeSetTestDriver12 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator13 = treeSetTestDriver12.iterator();
        boolean boolean15 = treeSetTestDriver12.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean17 = treeSetTestDriver12.remove((java.lang.Object) 10);
        boolean boolean18 = treeSetTestDriver0.equals_CUT((java.lang.Object) 10);
        experiment.util.Comparator comparator19 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver20 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator21 = treeSetTestDriver20.iterator();
        boolean boolean23 = treeSetTestDriver20.equals_CUT((java.lang.Object) (short) 10);
        java.lang.Object[] objArray24 = treeSetTestDriver20.toArray();
        treeSetTestDriver20.clear();
        boolean boolean26 = treeSetTestDriver0.remove((java.lang.Object) treeSetTestDriver20);
        experiment.util.TreeSetTestDriver treeSetTestDriver27 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator28 = treeSetTestDriver27.iterator();
        boolean boolean30 = treeSetTestDriver27.add((java.lang.Object) 10.0f);
        java.lang.Object obj31 = treeSetTestDriver27.last();
        java.lang.Object[] objArray32 = treeSetTestDriver27.toArray();
        java.lang.Object[] objArray33 = treeSetTestDriver27.toArray();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = treeSetTestDriver0.contains((java.lang.Object) objArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Ljava.lang.Object; cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(comparator19);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 10.0f + "'", obj31, 10.0f);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[10.0]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[10.0]");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test061");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver2 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator3 = treeSetTestDriver2.iterator();
        boolean boolean5 = treeSetTestDriver2.equals_CUT((java.lang.Object) (short) 10);
        java.lang.Object[] objArray6 = treeSetTestDriver2.toArray();
        treeSetTestDriver2.clear();
        boolean boolean9 = treeSetTestDriver2.add((java.lang.Object) 0.0d);
        treeSetTestDriver2.clear();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = treeSetTestDriver0.contains((java.lang.Object) treeSetTestDriver2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test062");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.add((java.lang.Object) 10.0f);
        java.lang.Object obj4 = treeSetTestDriver0.first();
        java.lang.Object obj5 = treeSetTestDriver0.first();
        experiment.util.TreeSetTestDriver treeSetTestDriver6 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator7 = treeSetTestDriver6.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = treeSetTestDriver0.getMatch((java.lang.Object) treeSetTestDriver6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0f + "'", obj4, 10.0f);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10.0f + "'", obj5, 10.0f);
        org.junit.Assert.assertNotNull(iterator7);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test063");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver2 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator3 = treeSetTestDriver2.iterator();
        boolean boolean5 = treeSetTestDriver2.equals_CUT((java.lang.Object) (short) 10);
        java.lang.Object[] objArray6 = treeSetTestDriver2.toArray();
        experiment.util.Comparator comparator7 = treeSetTestDriver2.comparator();
        boolean boolean8 = treeSetTestDriver0.remove((java.lang.Object) treeSetTestDriver2);
        java.lang.Object[] objArray9 = treeSetTestDriver0.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver10 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator11 = treeSetTestDriver10.iterator();
        boolean boolean13 = treeSetTestDriver10.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean15 = treeSetTestDriver10.remove((java.lang.Object) 10);
        boolean boolean16 = treeSetTestDriver10.isEmpty();
        java.lang.Class<?> wildcardClass17 = treeSetTestDriver10.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = treeSetTestDriver0.getMatch((java.lang.Object) wildcardClass17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNull(comparator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test064");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver2 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator3 = treeSetTestDriver2.iterator();
        boolean boolean5 = treeSetTestDriver2.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean7 = treeSetTestDriver2.remove((java.lang.Object) 10);
        boolean boolean8 = treeSetTestDriver0.add((java.lang.Object) boolean7);
        treeSetTestDriver0.clear();
        java.lang.Object obj11 = treeSetTestDriver0.getMatch((java.lang.Object) false);
        experiment.util.TreeSetTestDriver treeSetTestDriver12 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator13 = treeSetTestDriver12.iterator();
        boolean boolean15 = treeSetTestDriver12.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean17 = treeSetTestDriver12.remove((java.lang.Object) 10);
        boolean boolean18 = treeSetTestDriver0.equals_CUT((java.lang.Object) 10);
        experiment.util.Comparator comparator19 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver20 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator21 = treeSetTestDriver20.iterator();
        boolean boolean23 = treeSetTestDriver20.equals_CUT((java.lang.Object) (short) 10);
        java.lang.Object[] objArray24 = treeSetTestDriver20.toArray();
        treeSetTestDriver20.clear();
        boolean boolean26 = treeSetTestDriver0.remove((java.lang.Object) treeSetTestDriver20);
        java.lang.Object obj27 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = treeSetTestDriver0.contains(obj27);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Object cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(comparator19);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test065");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.add((java.lang.Object) 10.0f);
        java.lang.Object obj4 = treeSetTestDriver0.first();
        java.lang.Object obj5 = treeSetTestDriver0.last();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0f + "'", obj4, 10.0f);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10.0f + "'", obj5, 10.0f);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test066");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.equals_CUT((java.lang.Object) (short) 10);
        treeSetTestDriver0.clear();
        java.lang.Object obj6 = treeSetTestDriver0.getMatch((java.lang.Object) 100.0d);
        experiment.util.TreeSetTestDriver treeSetTestDriver7 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator8 = treeSetTestDriver7.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver9 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator10 = treeSetTestDriver9.iterator();
        boolean boolean12 = treeSetTestDriver9.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean14 = treeSetTestDriver9.remove((java.lang.Object) 10);
        boolean boolean15 = treeSetTestDriver7.add((java.lang.Object) boolean14);
        boolean boolean16 = treeSetTestDriver7.isEmpty();
        boolean boolean17 = treeSetTestDriver7.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = treeSetTestDriver0.contains((java.lang.Object) treeSetTestDriver7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(comparator8);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test067");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver2 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator3 = treeSetTestDriver2.iterator();
        boolean boolean5 = treeSetTestDriver2.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean7 = treeSetTestDriver2.remove((java.lang.Object) 10);
        boolean boolean8 = treeSetTestDriver0.add((java.lang.Object) boolean7);
        treeSetTestDriver0.clear();
        experiment.util.Comparator comparator10 = treeSetTestDriver0.comparator();
        experiment.util.Comparator comparator11 = treeSetTestDriver0.comparator();
        treeSetTestDriver0.clear();
        experiment.util.TreeSetTestDriver treeSetTestDriver13 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator14 = treeSetTestDriver13.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver15 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator16 = treeSetTestDriver15.iterator();
        boolean boolean18 = treeSetTestDriver15.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean20 = treeSetTestDriver15.remove((java.lang.Object) 10);
        boolean boolean21 = treeSetTestDriver13.add((java.lang.Object) boolean20);
        treeSetTestDriver13.clear();
        java.lang.Object obj24 = treeSetTestDriver13.getMatch((java.lang.Object) false);
        boolean boolean26 = treeSetTestDriver13.add((java.lang.Object) 100.0f);
        experiment.util.Iterator iterator27 = treeSetTestDriver13.iterator();
        boolean boolean28 = treeSetTestDriver0.equals_CUT((java.lang.Object) treeSetTestDriver13);
        java.lang.Object[] objArray29 = treeSetTestDriver13.toArray();
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertNull(comparator14);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[100.0]");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test068");
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
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test069");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver2 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator3 = treeSetTestDriver2.iterator();
        boolean boolean5 = treeSetTestDriver2.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean7 = treeSetTestDriver2.remove((java.lang.Object) 10);
        boolean boolean8 = treeSetTestDriver0.add((java.lang.Object) boolean7);
        boolean boolean9 = treeSetTestDriver0.isEmpty();
        experiment.util.TreeSetTestDriver treeSetTestDriver10 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator11 = treeSetTestDriver10.iterator();
        boolean boolean13 = treeSetTestDriver10.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean15 = treeSetTestDriver10.remove((java.lang.Object) 10);
        boolean boolean17 = treeSetTestDriver10.remove((java.lang.Object) (byte) 0);
        experiment.util.TreeSetTestDriver treeSetTestDriver18 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator19 = treeSetTestDriver18.iterator();
        boolean boolean21 = treeSetTestDriver18.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean23 = treeSetTestDriver18.remove((java.lang.Object) 10);
        boolean boolean25 = treeSetTestDriver18.remove((java.lang.Object) (byte) 0);
        treeSetTestDriver18.clear();
        boolean boolean27 = treeSetTestDriver10.equals_CUT((java.lang.Object) treeSetTestDriver18);
        experiment.util.Comparator comparator28 = treeSetTestDriver18.comparator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = treeSetTestDriver0.add((java.lang.Object) comparator28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(comparator28);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test070");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver2 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator3 = treeSetTestDriver2.iterator();
        boolean boolean5 = treeSetTestDriver2.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean7 = treeSetTestDriver2.remove((java.lang.Object) 10);
        boolean boolean8 = treeSetTestDriver0.add((java.lang.Object) boolean7);
        treeSetTestDriver0.clear();
        experiment.util.Comparator comparator10 = treeSetTestDriver0.comparator();
        experiment.util.Comparator comparator11 = treeSetTestDriver0.comparator();
        treeSetTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertNull(comparator11);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test071");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.equals_CUT((java.lang.Object) (short) 10);
        java.lang.Object[] objArray4 = treeSetTestDriver0.toArray();
        experiment.util.Comparator comparator5 = treeSetTestDriver0.comparator();
        java.lang.Class<?> wildcardClass6 = treeSetTestDriver0.getClass();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(comparator5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test072");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test073");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.equals_CUT((java.lang.Object) (short) 10);
        java.lang.Object[] objArray4 = treeSetTestDriver0.toArray();
        experiment.util.Comparator comparator5 = treeSetTestDriver0.comparator();
        treeSetTestDriver0.clear();
        experiment.util.Comparator comparator7 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver8 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator9 = treeSetTestDriver8.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver10 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator11 = treeSetTestDriver10.iterator();
        boolean boolean13 = treeSetTestDriver10.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean15 = treeSetTestDriver10.remove((java.lang.Object) 10);
        boolean boolean16 = treeSetTestDriver8.add((java.lang.Object) boolean15);
        treeSetTestDriver8.clear();
        experiment.util.Comparator comparator18 = treeSetTestDriver8.comparator();
        experiment.util.Iterator iterator19 = treeSetTestDriver8.iterator();
        java.lang.Object[] objArray20 = treeSetTestDriver8.toArray();
        boolean boolean21 = treeSetTestDriver0.add((java.lang.Object) objArray20);
        java.lang.Class<?> wildcardClass22 = treeSetTestDriver0.getClass();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(comparator5);
        org.junit.Assert.assertNull(comparator7);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(comparator18);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test074");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        treeSetTestDriver0.clear();
        experiment.util.TreeSetTestDriver treeSetTestDriver2 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator3 = treeSetTestDriver2.iterator();
        boolean boolean5 = treeSetTestDriver2.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean7 = treeSetTestDriver2.remove((java.lang.Object) 10);
        boolean boolean9 = treeSetTestDriver2.remove((java.lang.Object) (byte) 0);
        experiment.util.Iterator iterator10 = treeSetTestDriver2.iterator();
        treeSetTestDriver2.clear();
        boolean boolean12 = treeSetTestDriver2.isEmpty();
        boolean boolean14 = treeSetTestDriver2.equals_CUT((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray15 = treeSetTestDriver2.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = treeSetTestDriver0.getMatch((java.lang.Object) treeSetTestDriver2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test075");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) 10);
        boolean boolean7 = treeSetTestDriver0.remove((java.lang.Object) (byte) 0);
        treeSetTestDriver0.clear();
        experiment.util.Comparator comparator9 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver10 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator11 = treeSetTestDriver10.iterator();
        boolean boolean13 = treeSetTestDriver10.equals_CUT((java.lang.Object) (short) 10);
        java.lang.Object[] objArray14 = treeSetTestDriver10.toArray();
        boolean boolean15 = treeSetTestDriver0.add((java.lang.Object) treeSetTestDriver10);
        experiment.util.Comparator comparator16 = treeSetTestDriver10.comparator();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(comparator16);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test076");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test077");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver2 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator3 = treeSetTestDriver2.iterator();
        boolean boolean5 = treeSetTestDriver2.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean7 = treeSetTestDriver2.remove((java.lang.Object) 10);
        boolean boolean8 = treeSetTestDriver0.add((java.lang.Object) boolean7);
        treeSetTestDriver0.clear();
        treeSetTestDriver0.clear();
        experiment.util.TreeSetTestDriver treeSetTestDriver11 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator12 = treeSetTestDriver11.iterator();
        boolean boolean14 = treeSetTestDriver11.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean16 = treeSetTestDriver11.remove((java.lang.Object) 10);
        boolean boolean18 = treeSetTestDriver11.remove((java.lang.Object) (byte) 0);
        boolean boolean19 = treeSetTestDriver11.isEmpty();
        java.lang.Object[] objArray20 = treeSetTestDriver11.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = treeSetTestDriver0.getMatch((java.lang.Object) treeSetTestDriver11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test078");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.equals_CUT((java.lang.Object) (short) 10);
        java.lang.Object[] objArray4 = treeSetTestDriver0.toArray();
        experiment.util.Comparator comparator5 = treeSetTestDriver0.comparator();
        boolean boolean6 = treeSetTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(comparator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test079");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) 10);
        boolean boolean7 = treeSetTestDriver0.remove((java.lang.Object) (byte) 0);
        experiment.util.Iterator iterator8 = treeSetTestDriver0.iterator();
        treeSetTestDriver0.clear();
        boolean boolean10 = treeSetTestDriver0.isEmpty();
        experiment.util.TreeSetTestDriver treeSetTestDriver11 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator12 = treeSetTestDriver11.iterator();
        boolean boolean14 = treeSetTestDriver11.equals_CUT((java.lang.Object) (short) 10);
        java.lang.Object[] objArray15 = treeSetTestDriver11.toArray();
        treeSetTestDriver11.clear();
        boolean boolean18 = treeSetTestDriver11.add((java.lang.Object) 0.0d);
        treeSetTestDriver11.clear();
        boolean boolean20 = treeSetTestDriver0.equals_CUT((java.lang.Object) treeSetTestDriver11);
        java.lang.Class<?> wildcardClass21 = treeSetTestDriver0.getClass();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test080");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        treeSetTestDriver0.clear();
        java.lang.Object obj3 = treeSetTestDriver0.getMatch((java.lang.Object) '4');
        experiment.util.Iterator iterator4 = treeSetTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(iterator4);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test081");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver2 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator3 = treeSetTestDriver2.iterator();
        boolean boolean5 = treeSetTestDriver2.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean7 = treeSetTestDriver2.remove((java.lang.Object) 10);
        boolean boolean8 = treeSetTestDriver0.add((java.lang.Object) boolean7);
        treeSetTestDriver0.clear();
        java.lang.Object obj11 = treeSetTestDriver0.getMatch((java.lang.Object) false);
        experiment.util.Comparator comparator12 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver13 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator14 = treeSetTestDriver13.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver15 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator16 = treeSetTestDriver15.iterator();
        boolean boolean18 = treeSetTestDriver15.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean20 = treeSetTestDriver15.remove((java.lang.Object) 10);
        boolean boolean21 = treeSetTestDriver13.add((java.lang.Object) boolean20);
        treeSetTestDriver13.clear();
        experiment.util.Comparator comparator23 = treeSetTestDriver13.comparator();
        experiment.util.Comparator comparator24 = treeSetTestDriver13.comparator();
        experiment.util.Comparator comparator25 = treeSetTestDriver13.comparator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = treeSetTestDriver0.equals_CUT((java.lang.Object) comparator25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertNull(comparator14);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(comparator23);
        org.junit.Assert.assertNull(comparator24);
        org.junit.Assert.assertNull(comparator25);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test082");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.equals_CUT((java.lang.Object) (short) 10);
        java.lang.Object[] objArray4 = treeSetTestDriver0.toArray();
        experiment.util.Comparator comparator5 = treeSetTestDriver0.comparator();
        treeSetTestDriver0.clear();
        treeSetTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(comparator5);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test083");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.remove((java.lang.Object) 1L);
        experiment.util.TreeSetTestDriver treeSetTestDriver3 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator4 = treeSetTestDriver3.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver5 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator6 = treeSetTestDriver5.iterator();
        boolean boolean8 = treeSetTestDriver5.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean10 = treeSetTestDriver5.remove((java.lang.Object) 10);
        boolean boolean11 = treeSetTestDriver3.add((java.lang.Object) boolean10);
        treeSetTestDriver3.clear();
        java.lang.Object obj14 = treeSetTestDriver3.getMatch((java.lang.Object) false);
        boolean boolean16 = treeSetTestDriver3.add((java.lang.Object) 100.0f);
        experiment.util.Iterator iterator17 = treeSetTestDriver3.iterator();
        java.lang.Object[] objArray18 = treeSetTestDriver3.toArray();
        java.lang.Object[] objArray19 = treeSetTestDriver3.toArray();
        boolean boolean20 = treeSetTestDriver0.equals_CUT((java.lang.Object) treeSetTestDriver3);
        experiment.util.TreeSetTestDriver treeSetTestDriver21 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator22 = treeSetTestDriver21.iterator();
        boolean boolean24 = treeSetTestDriver21.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean26 = treeSetTestDriver21.remove((java.lang.Object) 10);
        boolean boolean27 = treeSetTestDriver21.isEmpty();
        experiment.util.Iterator iterator28 = treeSetTestDriver21.iterator();
        experiment.util.Comparator comparator29 = treeSetTestDriver21.comparator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = treeSetTestDriver3.add((java.lang.Object) treeSetTestDriver21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[100.0]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertNull(comparator29);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test084");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver2 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator3 = treeSetTestDriver2.iterator();
        boolean boolean5 = treeSetTestDriver2.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean7 = treeSetTestDriver2.remove((java.lang.Object) 10);
        boolean boolean8 = treeSetTestDriver0.add((java.lang.Object) boolean7);
        treeSetTestDriver0.clear();
        experiment.util.Comparator comparator10 = treeSetTestDriver0.comparator();
        boolean boolean11 = treeSetTestDriver0.isEmpty();
        experiment.util.TreeSetTestDriver treeSetTestDriver12 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator13 = treeSetTestDriver12.iterator();
        boolean boolean15 = treeSetTestDriver12.add((java.lang.Object) 10.0f);
        java.lang.Object obj16 = treeSetTestDriver12.first();
        experiment.util.Iterator iterator17 = treeSetTestDriver12.iterator();
        boolean boolean18 = treeSetTestDriver0.remove((java.lang.Object) treeSetTestDriver12);
        experiment.util.TreeSetTestDriver treeSetTestDriver19 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator20 = treeSetTestDriver19.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver21 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator22 = treeSetTestDriver21.iterator();
        boolean boolean24 = treeSetTestDriver21.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean26 = treeSetTestDriver21.remove((java.lang.Object) 10);
        boolean boolean27 = treeSetTestDriver19.add((java.lang.Object) boolean26);
        treeSetTestDriver19.clear();
        experiment.util.Comparator comparator29 = treeSetTestDriver19.comparator();
        boolean boolean30 = treeSetTestDriver19.isEmpty();
        experiment.util.TreeSetTestDriver treeSetTestDriver31 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator32 = treeSetTestDriver31.iterator();
        boolean boolean34 = treeSetTestDriver31.add((java.lang.Object) 10.0f);
        java.lang.Object obj35 = treeSetTestDriver31.first();
        experiment.util.Iterator iterator36 = treeSetTestDriver31.iterator();
        boolean boolean37 = treeSetTestDriver19.remove((java.lang.Object) treeSetTestDriver31);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj38 = treeSetTestDriver12.getMatch((java.lang.Object) treeSetTestDriver19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 10.0f + "'", obj16, 10.0f);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(comparator20);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(comparator29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 10.0f + "'", obj35, 10.0f);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test085");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.add((java.lang.Object) 10.0f);
        java.lang.Object obj4 = treeSetTestDriver0.first();
        java.lang.Object obj5 = treeSetTestDriver0.first();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0f + "'", obj4, 10.0f);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10.0f + "'", obj5, 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test086");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) 10);
        boolean boolean6 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator7 = treeSetTestDriver0.iterator();
        treeSetTestDriver0.clear();
        treeSetTestDriver0.clear();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(iterator7);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test087");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) 10);
        boolean boolean7 = treeSetTestDriver0.remove((java.lang.Object) (byte) 0);
        treeSetTestDriver0.clear();
        experiment.util.Comparator comparator9 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver10 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator11 = treeSetTestDriver10.iterator();
        boolean boolean13 = treeSetTestDriver10.equals_CUT((java.lang.Object) (short) 10);
        java.lang.Object[] objArray14 = treeSetTestDriver10.toArray();
        boolean boolean15 = treeSetTestDriver0.add((java.lang.Object) treeSetTestDriver10);
        experiment.util.TreeSetTestDriver treeSetTestDriver16 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator17 = treeSetTestDriver16.iterator();
        boolean boolean19 = treeSetTestDriver16.equals_CUT((java.lang.Object) (short) 10);
        java.lang.Object[] objArray20 = treeSetTestDriver16.toArray();
        experiment.util.Comparator comparator21 = treeSetTestDriver16.comparator();
        treeSetTestDriver16.clear();
        treeSetTestDriver16.clear();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = treeSetTestDriver0.contains((java.lang.Object) treeSetTestDriver16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNull(comparator21);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test088");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        treeSetTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test089");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver2 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator3 = treeSetTestDriver2.iterator();
        boolean boolean5 = treeSetTestDriver2.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean7 = treeSetTestDriver2.remove((java.lang.Object) 10);
        boolean boolean8 = treeSetTestDriver0.add((java.lang.Object) boolean7);
        treeSetTestDriver0.clear();
        experiment.util.Comparator comparator10 = treeSetTestDriver0.comparator();
        boolean boolean11 = treeSetTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass12 = treeSetTestDriver0.getClass();
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test090");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver2 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator3 = treeSetTestDriver2.iterator();
        boolean boolean5 = treeSetTestDriver2.equals_CUT((java.lang.Object) (short) 10);
        java.lang.Object[] objArray6 = treeSetTestDriver2.toArray();
        experiment.util.Comparator comparator7 = treeSetTestDriver2.comparator();
        boolean boolean8 = treeSetTestDriver0.remove((java.lang.Object) treeSetTestDriver2);
        java.lang.Object[] objArray9 = treeSetTestDriver2.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = treeSetTestDriver2.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNull(comparator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test091");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) 10);
        treeSetTestDriver0.clear();
        java.lang.Object[] objArray7 = treeSetTestDriver0.toArray();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test092");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.equals_CUT((java.lang.Object) (short) 10);
        experiment.util.Comparator comparator4 = treeSetTestDriver0.comparator();
        boolean boolean5 = treeSetTestDriver0.isEmpty();
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = treeSetTestDriver0.getMatch(obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test093");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) 10);
        boolean boolean6 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator7 = treeSetTestDriver0.iterator();
        treeSetTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(iterator7);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test094");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.add((java.lang.Object) 10.0f);
        java.lang.Object obj4 = treeSetTestDriver0.first();
        java.lang.Object obj5 = treeSetTestDriver0.first();
        experiment.util.TreeSetTestDriver treeSetTestDriver6 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator7 = treeSetTestDriver6.iterator();
        boolean boolean9 = treeSetTestDriver6.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean11 = treeSetTestDriver6.remove((java.lang.Object) 10);
        boolean boolean13 = treeSetTestDriver6.remove((java.lang.Object) (byte) 0);
        treeSetTestDriver6.clear();
        boolean boolean15 = treeSetTestDriver6.isEmpty();
        treeSetTestDriver6.clear();
        experiment.util.Comparator comparator17 = treeSetTestDriver6.comparator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = treeSetTestDriver0.contains((java.lang.Object) comparator17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0f + "'", obj4, 10.0f);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10.0f + "'", obj5, 10.0f);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(comparator17);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test095");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        treeSetTestDriver0.clear();
        experiment.util.Iterator iterator3 = treeSetTestDriver0.iterator();
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNotNull(iterator3);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test096");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver2 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator3 = treeSetTestDriver2.iterator();
        boolean boolean5 = treeSetTestDriver2.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean7 = treeSetTestDriver2.remove((java.lang.Object) 10);
        boolean boolean8 = treeSetTestDriver0.add((java.lang.Object) boolean7);
        treeSetTestDriver0.clear();
        experiment.util.Comparator comparator10 = treeSetTestDriver0.comparator();
        treeSetTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(comparator10);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test097");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        experiment.util.Comparator comparator2 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver3 = new experiment.util.TreeSetTestDriver();
        treeSetTestDriver3.clear();
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) treeSetTestDriver3);
        experiment.util.TreeSetTestDriver treeSetTestDriver6 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator7 = treeSetTestDriver6.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver8 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator9 = treeSetTestDriver8.iterator();
        boolean boolean11 = treeSetTestDriver8.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean13 = treeSetTestDriver8.remove((java.lang.Object) 10);
        boolean boolean14 = treeSetTestDriver6.add((java.lang.Object) boolean13);
        treeSetTestDriver6.clear();
        int int16 = treeSetTestDriver6.size();
        boolean boolean18 = treeSetTestDriver6.remove((java.lang.Object) "hi!");
        experiment.util.Comparator comparator19 = treeSetTestDriver6.comparator();
        boolean boolean20 = treeSetTestDriver3.add((java.lang.Object) treeSetTestDriver6);
        java.lang.Object[] objArray21 = treeSetTestDriver3.toArray();
        int int22 = treeSetTestDriver3.size();
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(comparator7);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(comparator19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test098");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver2 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator3 = treeSetTestDriver2.iterator();
        boolean boolean5 = treeSetTestDriver2.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean7 = treeSetTestDriver2.remove((java.lang.Object) 10);
        boolean boolean8 = treeSetTestDriver0.add((java.lang.Object) boolean7);
        treeSetTestDriver0.clear();
        int int10 = treeSetTestDriver0.size();
        boolean boolean12 = treeSetTestDriver0.remove((java.lang.Object) "hi!");
        boolean boolean14 = treeSetTestDriver0.contains((java.lang.Object) ' ');
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test099");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) 10);
        treeSetTestDriver0.clear();
        experiment.util.TreeSetTestDriver treeSetTestDriver7 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator8 = treeSetTestDriver7.iterator();
        boolean boolean10 = treeSetTestDriver7.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean12 = treeSetTestDriver7.remove((java.lang.Object) 10);
        treeSetTestDriver7.clear();
        int int14 = treeSetTestDriver7.size();
        java.lang.Object[] objArray15 = treeSetTestDriver7.toArray();
        boolean boolean16 = treeSetTestDriver0.add((java.lang.Object) objArray15);
        treeSetTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test100");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver2 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator3 = treeSetTestDriver2.iterator();
        boolean boolean5 = treeSetTestDriver2.equals_CUT((java.lang.Object) (short) 10);
        java.lang.Object[] objArray6 = treeSetTestDriver2.toArray();
        experiment.util.Comparator comparator7 = treeSetTestDriver2.comparator();
        boolean boolean8 = treeSetTestDriver0.remove((java.lang.Object) treeSetTestDriver2);
        experiment.util.Comparator comparator9 = treeSetTestDriver2.comparator();
        treeSetTestDriver2.clear();
        experiment.util.TreeSetTestDriver treeSetTestDriver11 = new experiment.util.TreeSetTestDriver();
        treeSetTestDriver11.clear();
        java.lang.Object obj14 = treeSetTestDriver11.getMatch((java.lang.Object) '4');
        experiment.util.Iterator iterator15 = treeSetTestDriver11.iterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = treeSetTestDriver2.contains((java.lang.Object) iterator15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet$TreeSetIterator cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNull(comparator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(iterator15);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test101");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.remove((java.lang.Object) 1L);
        experiment.util.TreeSetTestDriver treeSetTestDriver3 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator4 = treeSetTestDriver3.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver5 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator6 = treeSetTestDriver5.iterator();
        boolean boolean8 = treeSetTestDriver5.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean10 = treeSetTestDriver5.remove((java.lang.Object) 10);
        boolean boolean11 = treeSetTestDriver3.add((java.lang.Object) boolean10);
        treeSetTestDriver3.clear();
        java.lang.Object obj14 = treeSetTestDriver3.getMatch((java.lang.Object) false);
        boolean boolean16 = treeSetTestDriver3.add((java.lang.Object) 100.0f);
        experiment.util.Iterator iterator17 = treeSetTestDriver3.iterator();
        java.lang.Object[] objArray18 = treeSetTestDriver3.toArray();
        java.lang.Object[] objArray19 = treeSetTestDriver3.toArray();
        boolean boolean20 = treeSetTestDriver0.equals_CUT((java.lang.Object) treeSetTestDriver3);
        experiment.util.Comparator comparator21 = treeSetTestDriver3.comparator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[100.0]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(comparator21);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test102");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.equals_CUT((java.lang.Object) (short) 10);
        java.lang.Object[] objArray4 = treeSetTestDriver0.toArray();
        treeSetTestDriver0.clear();
        boolean boolean7 = treeSetTestDriver0.contains((java.lang.Object) (short) 100);
        int int8 = treeSetTestDriver0.size();
        experiment.util.TreeSetTestDriver treeSetTestDriver9 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator10 = treeSetTestDriver9.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver11 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator12 = treeSetTestDriver11.iterator();
        boolean boolean14 = treeSetTestDriver11.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean16 = treeSetTestDriver11.remove((java.lang.Object) 10);
        boolean boolean17 = treeSetTestDriver9.add((java.lang.Object) boolean16);
        treeSetTestDriver9.clear();
        int int19 = treeSetTestDriver9.size();
        boolean boolean21 = treeSetTestDriver9.remove((java.lang.Object) "hi!");
        java.lang.Object obj22 = treeSetTestDriver0.getMatch((java.lang.Object) boolean21);
        experiment.util.Iterator iterator23 = treeSetTestDriver0.iterator();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(iterator23);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test103");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) 10);
        boolean boolean6 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator7 = treeSetTestDriver0.iterator();
        experiment.util.Iterator iterator8 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver9 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator10 = treeSetTestDriver9.comparator();
        experiment.util.Comparator comparator11 = treeSetTestDriver9.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver12 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator13 = treeSetTestDriver12.iterator();
        boolean boolean15 = treeSetTestDriver12.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean17 = treeSetTestDriver12.remove((java.lang.Object) 10);
        boolean boolean18 = treeSetTestDriver9.add((java.lang.Object) boolean17);
        java.lang.Object obj19 = treeSetTestDriver9.last();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = treeSetTestDriver0.getMatch((java.lang.Object) treeSetTestDriver9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + false + "'", obj19, false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test104");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.equals_CUT((java.lang.Object) (short) 10);
        java.lang.Object[] objArray4 = treeSetTestDriver0.toArray();
        experiment.util.Comparator comparator5 = treeSetTestDriver0.comparator();
        treeSetTestDriver0.clear();
        experiment.util.Comparator comparator7 = treeSetTestDriver0.comparator();
        java.lang.Object[] objArray8 = treeSetTestDriver0.toArray();
        java.lang.Class<?> wildcardClass9 = objArray8.getClass();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(comparator5);
        org.junit.Assert.assertNull(comparator7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test105");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.equals_CUT((java.lang.Object) (short) 10);
        experiment.util.Comparator comparator4 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver5 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator6 = treeSetTestDriver5.iterator();
        boolean boolean8 = treeSetTestDriver5.add((java.lang.Object) 10.0f);
        java.lang.Object obj9 = treeSetTestDriver5.last();
        java.lang.Object obj10 = treeSetTestDriver5.last();
        boolean boolean11 = treeSetTestDriver0.add((java.lang.Object) treeSetTestDriver5);
        experiment.util.TreeSetTestDriver treeSetTestDriver12 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator13 = treeSetTestDriver12.iterator();
        boolean boolean15 = treeSetTestDriver12.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean17 = treeSetTestDriver12.remove((java.lang.Object) 10);
        boolean boolean19 = treeSetTestDriver12.remove((java.lang.Object) (byte) 0);
        experiment.util.Iterator iterator20 = treeSetTestDriver12.iterator();
        treeSetTestDriver12.clear();
        boolean boolean22 = treeSetTestDriver12.isEmpty();
        experiment.util.Comparator comparator23 = treeSetTestDriver12.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver24 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator25 = treeSetTestDriver24.iterator();
        boolean boolean27 = treeSetTestDriver24.equals_CUT((java.lang.Object) (short) 10);
        java.lang.Object[] objArray28 = treeSetTestDriver24.toArray();
        treeSetTestDriver24.clear();
        boolean boolean31 = treeSetTestDriver24.add((java.lang.Object) 0.0d);
        java.lang.Object obj32 = treeSetTestDriver24.last();
        boolean boolean33 = treeSetTestDriver12.contains(obj32);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = treeSetTestDriver0.add((java.lang.Object) treeSetTestDriver12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 10.0f + "'", obj9, 10.0f);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 10.0f + "'", obj10, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(comparator23);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 0.0d + "'", obj32, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test106");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver2 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator3 = treeSetTestDriver2.iterator();
        boolean boolean5 = treeSetTestDriver2.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean7 = treeSetTestDriver2.remove((java.lang.Object) 10);
        boolean boolean8 = treeSetTestDriver0.add((java.lang.Object) boolean7);
        treeSetTestDriver0.clear();
        experiment.util.Comparator comparator10 = treeSetTestDriver0.comparator();
        experiment.util.Comparator comparator11 = treeSetTestDriver0.comparator();
        boolean boolean13 = treeSetTestDriver0.equals_CUT((java.lang.Object) 10.0f);
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test107");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) 10);
        boolean boolean7 = treeSetTestDriver0.remove((java.lang.Object) (byte) 0);
        experiment.util.TreeSetTestDriver treeSetTestDriver8 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator9 = treeSetTestDriver8.iterator();
        boolean boolean11 = treeSetTestDriver8.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean13 = treeSetTestDriver8.remove((java.lang.Object) 10);
        boolean boolean15 = treeSetTestDriver8.remove((java.lang.Object) (byte) 0);
        treeSetTestDriver8.clear();
        boolean boolean17 = treeSetTestDriver0.equals_CUT((java.lang.Object) treeSetTestDriver8);
        experiment.util.TreeSetTestDriver treeSetTestDriver18 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator19 = treeSetTestDriver18.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver20 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator21 = treeSetTestDriver20.iterator();
        boolean boolean23 = treeSetTestDriver20.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean25 = treeSetTestDriver20.remove((java.lang.Object) 10);
        boolean boolean26 = treeSetTestDriver18.add((java.lang.Object) boolean25);
        treeSetTestDriver18.clear();
        experiment.util.Comparator comparator28 = treeSetTestDriver18.comparator();
        boolean boolean29 = treeSetTestDriver18.isEmpty();
        experiment.util.TreeSetTestDriver treeSetTestDriver30 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator31 = treeSetTestDriver30.iterator();
        boolean boolean33 = treeSetTestDriver30.add((java.lang.Object) 10.0f);
        java.lang.Object obj34 = treeSetTestDriver30.first();
        experiment.util.Iterator iterator35 = treeSetTestDriver30.iterator();
        boolean boolean36 = treeSetTestDriver18.remove((java.lang.Object) treeSetTestDriver30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj37 = treeSetTestDriver0.getMatch((java.lang.Object) treeSetTestDriver30);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(comparator19);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(comparator28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 10.0f + "'", obj34, 10.0f);
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test108");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) 10);
        boolean boolean7 = treeSetTestDriver0.remove((java.lang.Object) (byte) 0);
        treeSetTestDriver0.clear();
        java.lang.Object obj10 = treeSetTestDriver0.getMatch((java.lang.Object) (short) 0);
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test109");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver2 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator3 = treeSetTestDriver2.iterator();
        boolean boolean5 = treeSetTestDriver2.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean7 = treeSetTestDriver2.remove((java.lang.Object) 10);
        boolean boolean8 = treeSetTestDriver0.add((java.lang.Object) boolean7);
        treeSetTestDriver0.clear();
        experiment.util.Comparator comparator10 = treeSetTestDriver0.comparator();
        experiment.util.Comparator comparator11 = treeSetTestDriver0.comparator();
        treeSetTestDriver0.clear();
        treeSetTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertNull(comparator11);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test110");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) 10);
        boolean boolean7 = treeSetTestDriver0.remove((java.lang.Object) (byte) 0);
        treeSetTestDriver0.clear();
        experiment.util.Comparator comparator9 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver10 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator11 = treeSetTestDriver10.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver12 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator13 = treeSetTestDriver12.iterator();
        boolean boolean15 = treeSetTestDriver12.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean17 = treeSetTestDriver12.remove((java.lang.Object) 10);
        boolean boolean18 = treeSetTestDriver10.add((java.lang.Object) boolean17);
        treeSetTestDriver10.clear();
        java.lang.Object obj21 = treeSetTestDriver10.getMatch((java.lang.Object) false);
        experiment.util.TreeSetTestDriver treeSetTestDriver22 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator23 = treeSetTestDriver22.iterator();
        boolean boolean25 = treeSetTestDriver22.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean27 = treeSetTestDriver22.remove((java.lang.Object) 10);
        boolean boolean28 = treeSetTestDriver10.equals_CUT((java.lang.Object) 10);
        experiment.util.Comparator comparator29 = treeSetTestDriver10.comparator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = treeSetTestDriver0.remove((java.lang.Object) comparator29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(comparator29);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test111");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.equals_CUT((java.lang.Object) (short) 10);
        experiment.util.Comparator comparator4 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver5 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator6 = treeSetTestDriver5.iterator();
        boolean boolean8 = treeSetTestDriver5.add((java.lang.Object) 10.0f);
        java.lang.Object obj9 = treeSetTestDriver5.last();
        java.lang.Object obj10 = treeSetTestDriver5.last();
        boolean boolean11 = treeSetTestDriver0.add((java.lang.Object) treeSetTestDriver5);
        treeSetTestDriver0.clear();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 10.0f + "'", obj9, 10.0f);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 10.0f + "'", obj10, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test112");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver2 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator3 = treeSetTestDriver2.iterator();
        boolean boolean5 = treeSetTestDriver2.equals_CUT((java.lang.Object) (short) 10);
        java.lang.Object[] objArray6 = treeSetTestDriver2.toArray();
        experiment.util.Comparator comparator7 = treeSetTestDriver2.comparator();
        boolean boolean8 = treeSetTestDriver0.remove((java.lang.Object) treeSetTestDriver2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNull(comparator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test113");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.add((java.lang.Object) 10.0f);
        java.lang.Object obj4 = treeSetTestDriver0.first();
        experiment.util.Iterator iterator5 = treeSetTestDriver0.iterator();
        java.lang.Object[] objArray6 = treeSetTestDriver0.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver7 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator8 = treeSetTestDriver7.iterator();
        boolean boolean10 = treeSetTestDriver7.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean12 = treeSetTestDriver7.remove((java.lang.Object) 10);
        boolean boolean14 = treeSetTestDriver7.remove((java.lang.Object) (byte) 0);
        treeSetTestDriver7.clear();
        java.lang.Class<?> wildcardClass16 = treeSetTestDriver7.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = treeSetTestDriver0.getMatch((java.lang.Object) treeSetTestDriver7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0f + "'", obj4, 10.0f);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10.0]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test114");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.equals_CUT((java.lang.Object) (short) 10);
        experiment.util.Comparator comparator4 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver5 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator6 = treeSetTestDriver5.comparator();
        java.lang.Object[] objArray7 = treeSetTestDriver5.toArray();
        java.lang.Object[] objArray8 = treeSetTestDriver5.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = treeSetTestDriver0.getMatch((java.lang.Object) treeSetTestDriver5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test115");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        java.lang.Object[] objArray2 = treeSetTestDriver0.toArray();
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(comparator3);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test116");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver2 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator3 = treeSetTestDriver2.iterator();
        boolean boolean5 = treeSetTestDriver2.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean7 = treeSetTestDriver2.remove((java.lang.Object) 10);
        boolean boolean8 = treeSetTestDriver0.add((java.lang.Object) boolean7);
        treeSetTestDriver0.clear();
        experiment.util.Comparator comparator10 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver11 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator12 = treeSetTestDriver11.iterator();
        boolean boolean14 = treeSetTestDriver11.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean16 = treeSetTestDriver11.remove((java.lang.Object) 10);
        boolean boolean18 = treeSetTestDriver11.remove((java.lang.Object) (byte) 0);
        experiment.util.Iterator iterator19 = treeSetTestDriver11.iterator();
        treeSetTestDriver11.clear();
        boolean boolean21 = treeSetTestDriver11.isEmpty();
        boolean boolean23 = treeSetTestDriver11.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean24 = treeSetTestDriver0.contains((java.lang.Object) (byte) -1);
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test117");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver2 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator3 = treeSetTestDriver2.iterator();
        boolean boolean5 = treeSetTestDriver2.equals_CUT((java.lang.Object) (short) 10);
        java.lang.Object[] objArray6 = treeSetTestDriver2.toArray();
        experiment.util.Comparator comparator7 = treeSetTestDriver2.comparator();
        boolean boolean8 = treeSetTestDriver0.remove((java.lang.Object) treeSetTestDriver2);
        java.lang.Object[] objArray9 = treeSetTestDriver0.toArray();
        treeSetTestDriver0.clear();
        experiment.util.Comparator comparator11 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver12 = new experiment.util.TreeSetTestDriver();
        java.lang.Class<?> wildcardClass13 = treeSetTestDriver12.getClass();
        boolean boolean14 = treeSetTestDriver0.equals_CUT((java.lang.Object) treeSetTestDriver12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNull(comparator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test118");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver2 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator3 = treeSetTestDriver2.iterator();
        boolean boolean5 = treeSetTestDriver2.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean7 = treeSetTestDriver2.remove((java.lang.Object) 10);
        boolean boolean8 = treeSetTestDriver0.add((java.lang.Object) boolean7);
        treeSetTestDriver0.clear();
        experiment.util.Comparator comparator10 = treeSetTestDriver0.comparator();
        experiment.util.Comparator comparator11 = treeSetTestDriver0.comparator();
        treeSetTestDriver0.clear();
        experiment.util.TreeSetTestDriver treeSetTestDriver13 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator14 = treeSetTestDriver13.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver15 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator16 = treeSetTestDriver15.iterator();
        boolean boolean18 = treeSetTestDriver15.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean20 = treeSetTestDriver15.remove((java.lang.Object) 10);
        boolean boolean21 = treeSetTestDriver13.add((java.lang.Object) boolean20);
        treeSetTestDriver13.clear();
        java.lang.Object obj24 = treeSetTestDriver13.getMatch((java.lang.Object) false);
        boolean boolean26 = treeSetTestDriver13.add((java.lang.Object) 100.0f);
        experiment.util.Iterator iterator27 = treeSetTestDriver13.iterator();
        boolean boolean28 = treeSetTestDriver0.equals_CUT((java.lang.Object) treeSetTestDriver13);
        treeSetTestDriver13.clear();
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertNull(comparator14);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test119");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        treeSetTestDriver0.clear();
        java.lang.Object obj3 = treeSetTestDriver0.getMatch((java.lang.Object) '4');
        experiment.util.TreeSetTestDriver treeSetTestDriver4 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator5 = treeSetTestDriver4.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver6 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator7 = treeSetTestDriver6.iterator();
        boolean boolean9 = treeSetTestDriver6.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean11 = treeSetTestDriver6.remove((java.lang.Object) 10);
        boolean boolean12 = treeSetTestDriver4.add((java.lang.Object) boolean11);
        treeSetTestDriver4.clear();
        experiment.util.Comparator comparator14 = treeSetTestDriver4.comparator();
        experiment.util.Comparator comparator15 = treeSetTestDriver4.comparator();
        treeSetTestDriver4.clear();
        boolean boolean17 = treeSetTestDriver0.equals_CUT((java.lang.Object) treeSetTestDriver4);
        treeSetTestDriver0.clear();
        experiment.util.TreeSetTestDriver treeSetTestDriver19 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator20 = treeSetTestDriver19.iterator();
        boolean boolean22 = treeSetTestDriver19.add((java.lang.Object) 10.0f);
        java.lang.Object obj23 = treeSetTestDriver19.last();
        java.lang.Object[] objArray24 = treeSetTestDriver19.toArray();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = treeSetTestDriver0.contains((java.lang.Object) objArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Ljava.lang.Object; cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(comparator5);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(comparator14);
        org.junit.Assert.assertNull(comparator15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 10.0f + "'", obj23, 10.0f);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[10.0]");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test120");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver2 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator3 = treeSetTestDriver2.iterator();
        boolean boolean5 = treeSetTestDriver2.equals_CUT((java.lang.Object) (short) 10);
        java.lang.Object[] objArray6 = treeSetTestDriver2.toArray();
        experiment.util.Comparator comparator7 = treeSetTestDriver2.comparator();
        boolean boolean8 = treeSetTestDriver0.remove((java.lang.Object) treeSetTestDriver2);
        java.lang.Object[] objArray9 = treeSetTestDriver0.toArray();
        treeSetTestDriver0.clear();
        experiment.util.Comparator comparator11 = treeSetTestDriver0.comparator();
        int int12 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        experiment.util.TreeSetTestDriver treeSetTestDriver14 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator15 = treeSetTestDriver14.iterator();
        boolean boolean17 = treeSetTestDriver14.add((java.lang.Object) 10.0f);
        java.lang.Object obj18 = treeSetTestDriver14.first();
        experiment.util.Iterator iterator19 = treeSetTestDriver14.iterator();
        java.lang.Class<?> wildcardClass20 = iterator19.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = treeSetTestDriver0.contains((java.lang.Object) iterator19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet$TreeSetIterator cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNull(comparator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 10.0f + "'", obj18, 10.0f);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test121");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        experiment.util.Comparator comparator2 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver3 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator4 = treeSetTestDriver3.iterator();
        boolean boolean6 = treeSetTestDriver3.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean8 = treeSetTestDriver3.remove((java.lang.Object) 10);
        boolean boolean9 = treeSetTestDriver0.add((java.lang.Object) boolean8);
        boolean boolean10 = treeSetTestDriver0.isEmpty();
        java.lang.Object obj11 = treeSetTestDriver0.first();
        java.lang.Object obj12 = treeSetTestDriver0.last();
        experiment.util.TreeSetTestDriver treeSetTestDriver13 = new experiment.util.TreeSetTestDriver();
        boolean boolean15 = treeSetTestDriver13.remove((java.lang.Object) 1L);
        experiment.util.TreeSetTestDriver treeSetTestDriver16 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator17 = treeSetTestDriver16.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver18 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator19 = treeSetTestDriver18.iterator();
        boolean boolean21 = treeSetTestDriver18.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean23 = treeSetTestDriver18.remove((java.lang.Object) 10);
        boolean boolean24 = treeSetTestDriver16.add((java.lang.Object) boolean23);
        treeSetTestDriver16.clear();
        java.lang.Object obj27 = treeSetTestDriver16.getMatch((java.lang.Object) false);
        boolean boolean29 = treeSetTestDriver16.add((java.lang.Object) 100.0f);
        experiment.util.Iterator iterator30 = treeSetTestDriver16.iterator();
        java.lang.Object[] objArray31 = treeSetTestDriver16.toArray();
        java.lang.Object[] objArray32 = treeSetTestDriver16.toArray();
        boolean boolean33 = treeSetTestDriver13.equals_CUT((java.lang.Object) treeSetTestDriver16);
        boolean boolean34 = treeSetTestDriver0.equals_CUT((java.lang.Object) boolean33);
        experiment.util.TreeSetTestDriver treeSetTestDriver35 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator36 = treeSetTestDriver35.comparator();
        experiment.util.Comparator comparator37 = treeSetTestDriver35.comparator();
        experiment.util.Iterator iterator38 = treeSetTestDriver35.iterator();
        experiment.util.Iterator iterator39 = treeSetTestDriver35.iterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean40 = treeSetTestDriver0.remove((java.lang.Object) iterator39);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet$TreeSetIterator cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + false + "'", obj11, false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + false + "'", obj12, false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(comparator17);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[100.0]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(comparator36);
        org.junit.Assert.assertNull(comparator37);
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertNotNull(iterator39);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test122");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver2 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator3 = treeSetTestDriver2.iterator();
        boolean boolean5 = treeSetTestDriver2.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean7 = treeSetTestDriver2.remove((java.lang.Object) 10);
        boolean boolean8 = treeSetTestDriver0.add((java.lang.Object) boolean7);
        treeSetTestDriver0.clear();
        experiment.util.Comparator comparator10 = treeSetTestDriver0.comparator();
        experiment.util.Comparator comparator11 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver12 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator13 = treeSetTestDriver12.iterator();
        boolean boolean15 = treeSetTestDriver12.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean17 = treeSetTestDriver12.remove((java.lang.Object) 10);
        boolean boolean19 = treeSetTestDriver12.remove((java.lang.Object) (byte) 0);
        experiment.util.Iterator iterator20 = treeSetTestDriver12.iterator();
        treeSetTestDriver12.clear();
        java.lang.Object[] objArray22 = treeSetTestDriver12.toArray();
        boolean boolean23 = treeSetTestDriver0.remove((java.lang.Object) treeSetTestDriver12);
        java.lang.Object[] objArray24 = treeSetTestDriver12.toArray();
        java.lang.Class<?> wildcardClass25 = objArray24.getClass();
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test123");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver2 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator3 = treeSetTestDriver2.iterator();
        boolean boolean5 = treeSetTestDriver2.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean7 = treeSetTestDriver2.remove((java.lang.Object) 10);
        boolean boolean8 = treeSetTestDriver0.add((java.lang.Object) boolean7);
        treeSetTestDriver0.clear();
        java.lang.Object obj11 = treeSetTestDriver0.getMatch((java.lang.Object) false);
        experiment.util.Comparator comparator12 = treeSetTestDriver0.comparator();
        int int13 = treeSetTestDriver0.size();
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test124");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver2 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator3 = treeSetTestDriver2.iterator();
        boolean boolean5 = treeSetTestDriver2.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean7 = treeSetTestDriver2.remove((java.lang.Object) 10);
        boolean boolean8 = treeSetTestDriver0.add((java.lang.Object) boolean7);
        treeSetTestDriver0.clear();
        java.lang.Object obj11 = treeSetTestDriver0.getMatch((java.lang.Object) false);
        experiment.util.TreeSetTestDriver treeSetTestDriver12 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator13 = treeSetTestDriver12.iterator();
        boolean boolean15 = treeSetTestDriver12.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean17 = treeSetTestDriver12.remove((java.lang.Object) 10);
        boolean boolean18 = treeSetTestDriver0.equals_CUT((java.lang.Object) 10);
        experiment.util.Comparator comparator19 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver20 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator21 = treeSetTestDriver20.iterator();
        boolean boolean23 = treeSetTestDriver20.equals_CUT((java.lang.Object) (short) 10);
        java.lang.Object[] objArray24 = treeSetTestDriver20.toArray();
        treeSetTestDriver20.clear();
        boolean boolean26 = treeSetTestDriver0.remove((java.lang.Object) treeSetTestDriver20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(comparator19);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test125");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) 10);
        boolean boolean7 = treeSetTestDriver0.remove((java.lang.Object) (byte) 0);
        treeSetTestDriver0.clear();
        boolean boolean9 = treeSetTestDriver0.isEmpty();
        treeSetTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test126");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) 10);
        boolean boolean7 = treeSetTestDriver0.remove((java.lang.Object) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test127");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        treeSetTestDriver0.clear();
        experiment.util.TreeSetTestDriver treeSetTestDriver2 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator3 = treeSetTestDriver2.iterator();
        boolean boolean5 = treeSetTestDriver2.equals_CUT((java.lang.Object) (short) 10);
        java.lang.Object[] objArray6 = treeSetTestDriver2.toArray();
        experiment.util.Comparator comparator7 = treeSetTestDriver2.comparator();
        treeSetTestDriver2.clear();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = treeSetTestDriver0.contains((java.lang.Object) treeSetTestDriver2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNull(comparator7);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1264048269_1024_0.test128");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        treeSetTestDriver0.clear();
        java.lang.Object obj3 = treeSetTestDriver0.getMatch((java.lang.Object) '4');
        experiment.util.TreeSetTestDriver treeSetTestDriver4 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator5 = treeSetTestDriver4.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver6 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator7 = treeSetTestDriver6.iterator();
        boolean boolean9 = treeSetTestDriver6.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean11 = treeSetTestDriver6.remove((java.lang.Object) 10);
        boolean boolean12 = treeSetTestDriver4.add((java.lang.Object) boolean11);
        treeSetTestDriver4.clear();
        experiment.util.Comparator comparator14 = treeSetTestDriver4.comparator();
        experiment.util.Comparator comparator15 = treeSetTestDriver4.comparator();
        treeSetTestDriver4.clear();
        experiment.util.TreeSetTestDriver treeSetTestDriver17 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator18 = treeSetTestDriver17.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver19 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator20 = treeSetTestDriver19.iterator();
        boolean boolean22 = treeSetTestDriver19.equals_CUT((java.lang.Object) (short) 10);
        boolean boolean24 = treeSetTestDriver19.remove((java.lang.Object) 10);
        boolean boolean25 = treeSetTestDriver17.add((java.lang.Object) boolean24);
        treeSetTestDriver17.clear();
        java.lang.Object obj28 = treeSetTestDriver17.getMatch((java.lang.Object) false);
        boolean boolean30 = treeSetTestDriver17.add((java.lang.Object) 100.0f);
        experiment.util.Iterator iterator31 = treeSetTestDriver17.iterator();
        boolean boolean32 = treeSetTestDriver4.equals_CUT((java.lang.Object) treeSetTestDriver17);
        boolean boolean33 = treeSetTestDriver0.remove((java.lang.Object) treeSetTestDriver4);
        experiment.util.Comparator comparator34 = treeSetTestDriver4.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = treeSetTestDriver4.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(comparator5);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(comparator14);
        org.junit.Assert.assertNull(comparator15);
        org.junit.Assert.assertNull(comparator18);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(comparator34);
    }

}
