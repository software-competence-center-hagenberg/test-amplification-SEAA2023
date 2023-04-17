package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_TreeSetTest_1264048269_64_s {

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

}
