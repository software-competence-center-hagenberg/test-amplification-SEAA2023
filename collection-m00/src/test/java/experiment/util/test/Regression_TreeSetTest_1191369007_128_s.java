package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_TreeSetTest_1191369007_128_s {

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
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test001");
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
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test002");
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
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test003");
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
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test004");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = treeSetTestDriver0.contains(obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test005");
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
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test006");
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
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test007");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        experiment.util.Comparator comparator2 = treeSetTestDriver0.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test008");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        java.lang.Object[] objArray3 = treeSetTestDriver0.toArray();
        boolean boolean5 = treeSetTestDriver0.add((java.lang.Object) (short) -1);
        java.lang.Class<?> wildcardClass6 = treeSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test009");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        java.lang.Object[] objArray3 = treeSetTestDriver0.toArray();
        boolean boolean5 = treeSetTestDriver0.add((java.lang.Object) (short) -1);
        experiment.util.Iterator iterator6 = treeSetTestDriver0.iterator();
        java.lang.Object obj7 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = treeSetTestDriver0.add(obj7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Object cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test010");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        experiment.util.Comparator comparator2 = treeSetTestDriver0.comparator();
        treeSetTestDriver0.clear();
        experiment.util.Comparator comparator4 = treeSetTestDriver0.comparator();
        boolean boolean6 = treeSetTestDriver0.add((java.lang.Object) false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = treeSetTestDriver0.contains((java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to java.lang.Byte");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test011");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        java.lang.Object[] objArray3 = treeSetTestDriver0.toArray();
        boolean boolean5 = treeSetTestDriver0.add((java.lang.Object) (short) -1);
        treeSetTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test012");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        experiment.util.Comparator comparator2 = treeSetTestDriver0.comparator();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test013");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) "hi!");
        treeSetTestDriver0.clear();
        experiment.util.TreeSetTestDriver treeSetTestDriver6 = new experiment.util.TreeSetTestDriver();
        java.lang.Object[] objArray7 = treeSetTestDriver6.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = treeSetTestDriver0.getMatch((java.lang.Object) objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Ljava.lang.Object; cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test014");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        experiment.util.Comparator comparator2 = treeSetTestDriver0.comparator();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) (byte) 100);
        experiment.util.TreeSetTestDriver treeSetTestDriver5 = new experiment.util.TreeSetTestDriver();
        int int6 = treeSetTestDriver5.size();
        treeSetTestDriver5.clear();
        java.lang.Object[] objArray8 = treeSetTestDriver5.toArray();
        boolean boolean10 = treeSetTestDriver5.add((java.lang.Object) (short) -1);
        experiment.util.Iterator iterator11 = treeSetTestDriver5.iterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = treeSetTestDriver0.contains((java.lang.Object) treeSetTestDriver5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test015");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        java.lang.Object[] objArray3 = treeSetTestDriver0.toArray();
        treeSetTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test016");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        experiment.util.Comparator comparator2 = treeSetTestDriver0.comparator();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) (byte) 100);
        experiment.util.Iterator iterator5 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver6 = new experiment.util.TreeSetTestDriver();
        int int7 = treeSetTestDriver6.size();
        treeSetTestDriver6.clear();
        java.lang.Object[] objArray9 = treeSetTestDriver6.toArray();
        treeSetTestDriver6.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = treeSetTestDriver0.getMatch((java.lang.Object) treeSetTestDriver6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test017");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        java.lang.Object[] objArray3 = treeSetTestDriver0.toArray();
        experiment.util.Comparator comparator4 = treeSetTestDriver0.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(comparator4);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test018");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        java.lang.Object[] objArray3 = treeSetTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test019");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        experiment.util.Comparator comparator2 = treeSetTestDriver0.comparator();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test020");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) "hi!");
        treeSetTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test021");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.TreeSetTestDriver treeSetTestDriver1 = new experiment.util.TreeSetTestDriver();
        int int2 = treeSetTestDriver1.size();
        treeSetTestDriver1.clear();
        java.lang.Object[] objArray4 = treeSetTestDriver1.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = treeSetTestDriver0.getMatch((java.lang.Object) treeSetTestDriver1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test022");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        java.lang.Object[] objArray3 = treeSetTestDriver0.toArray();
        boolean boolean5 = treeSetTestDriver0.add((java.lang.Object) (short) -1);
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = treeSetTestDriver0.add(obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test023");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) "hi!");
        treeSetTestDriver0.clear();
        treeSetTestDriver0.clear();
        experiment.util.TreeSetTestDriver treeSetTestDriver7 = new experiment.util.TreeSetTestDriver();
        int int8 = treeSetTestDriver7.size();
        treeSetTestDriver7.clear();
        java.lang.Object[] objArray10 = treeSetTestDriver7.toArray();
        boolean boolean12 = treeSetTestDriver7.add((java.lang.Object) (short) -1);
        treeSetTestDriver7.clear();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = treeSetTestDriver0.contains((java.lang.Object) treeSetTestDriver7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test024");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) "hi!");
        boolean boolean6 = treeSetTestDriver0.equals_CUT((java.lang.Object) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test025");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object[] objArray1 = treeSetTestDriver0.toArray();
        experiment.util.Comparator comparator2 = treeSetTestDriver0.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(comparator2);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test026");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        experiment.util.Comparator comparator2 = treeSetTestDriver0.comparator();
        treeSetTestDriver0.clear();
        experiment.util.Comparator comparator4 = treeSetTestDriver0.comparator();
        boolean boolean6 = treeSetTestDriver0.add((java.lang.Object) false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = treeSetTestDriver0.getMatch((java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to java.lang.Integer");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test027");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        experiment.util.TreeSetTestDriver treeSetTestDriver3 = new experiment.util.TreeSetTestDriver();
        int int4 = treeSetTestDriver3.size();
        treeSetTestDriver3.clear();
        treeSetTestDriver3.clear();
        int int7 = treeSetTestDriver3.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = treeSetTestDriver0.getMatch((java.lang.Object) treeSetTestDriver3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test028");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) "hi!");
        treeSetTestDriver0.clear();
        treeSetTestDriver0.clear();
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = treeSetTestDriver0.equals_CUT(obj7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test029");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        java.lang.Object[] objArray3 = treeSetTestDriver0.toArray();
        boolean boolean5 = treeSetTestDriver0.add((java.lang.Object) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = treeSetTestDriver0.add((java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to java.lang.Byte");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test030");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        java.lang.Object[] objArray3 = treeSetTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test031");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        java.lang.Object[] objArray3 = treeSetTestDriver0.toArray();
        experiment.util.Comparator comparator4 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver5 = new experiment.util.TreeSetTestDriver();
        int int6 = treeSetTestDriver5.size();
        experiment.util.TreeSetTestDriver treeSetTestDriver7 = new experiment.util.TreeSetTestDriver();
        int int8 = treeSetTestDriver7.size();
        experiment.util.Comparator comparator9 = treeSetTestDriver7.comparator();
        boolean boolean11 = treeSetTestDriver7.remove((java.lang.Object) (byte) 100);
        experiment.util.Iterator iterator12 = treeSetTestDriver7.iterator();
        boolean boolean13 = treeSetTestDriver5.equals_CUT((java.lang.Object) treeSetTestDriver7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = treeSetTestDriver0.getMatch((java.lang.Object) treeSetTestDriver5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test032");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) "hi!");
        int int5 = treeSetTestDriver0.size();
        experiment.util.TreeSetTestDriver treeSetTestDriver6 = new experiment.util.TreeSetTestDriver();
        int int7 = treeSetTestDriver6.size();
        treeSetTestDriver6.clear();
        treeSetTestDriver6.clear();
        int int10 = treeSetTestDriver6.size();
        boolean boolean11 = treeSetTestDriver0.add((java.lang.Object) treeSetTestDriver6);
        experiment.util.TreeSetTestDriver treeSetTestDriver12 = new experiment.util.TreeSetTestDriver();
        int int13 = treeSetTestDriver12.size();
        treeSetTestDriver12.clear();
        boolean boolean16 = treeSetTestDriver12.remove((java.lang.Object) "hi!");
        int int17 = treeSetTestDriver12.size();
        boolean boolean18 = treeSetTestDriver12.isEmpty();
        boolean boolean19 = treeSetTestDriver12.isEmpty();
        boolean boolean20 = treeSetTestDriver6.equals_CUT((java.lang.Object) treeSetTestDriver12);
        experiment.util.TreeSetTestDriver treeSetTestDriver21 = new experiment.util.TreeSetTestDriver();
        int int22 = treeSetTestDriver21.size();
        experiment.util.Comparator comparator23 = treeSetTestDriver21.comparator();
        boolean boolean25 = treeSetTestDriver21.remove((java.lang.Object) (byte) 100);
        int int26 = treeSetTestDriver21.size();
        experiment.util.Iterator iterator27 = treeSetTestDriver21.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = treeSetTestDriver12.getMatch((java.lang.Object) treeSetTestDriver21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(comparator23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(iterator27);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test033");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) "hi!");
        treeSetTestDriver0.clear();
        treeSetTestDriver0.clear();
        treeSetTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test034");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) "hi!");
        treeSetTestDriver0.clear();
        experiment.util.TreeSetTestDriver treeSetTestDriver6 = new experiment.util.TreeSetTestDriver();
        int int7 = treeSetTestDriver6.size();
        treeSetTestDriver6.clear();
        boolean boolean10 = treeSetTestDriver6.remove((java.lang.Object) "hi!");
        treeSetTestDriver6.clear();
        treeSetTestDriver6.clear();
        treeSetTestDriver6.clear();
        experiment.util.Iterator iterator14 = treeSetTestDriver6.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = treeSetTestDriver0.getMatch((java.lang.Object) treeSetTestDriver6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(iterator14);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test035");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) "hi!");
        treeSetTestDriver0.clear();
        java.lang.Object[] objArray6 = treeSetTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test036");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) "hi!");
        boolean boolean6 = treeSetTestDriver0.equals_CUT((java.lang.Object) "");
        java.lang.Object[] objArray7 = treeSetTestDriver0.toArray();
        boolean boolean9 = treeSetTestDriver0.equals_CUT((java.lang.Object) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test037");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        experiment.util.Comparator comparator2 = treeSetTestDriver0.comparator();
        java.lang.Class<?> wildcardClass3 = treeSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test038");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) "hi!");
        int int5 = treeSetTestDriver0.size();
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = treeSetTestDriver0.equals_CUT(obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test039");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) "hi!");
        treeSetTestDriver0.clear();
        treeSetTestDriver0.clear();
        treeSetTestDriver0.clear();
        experiment.util.Iterator iterator8 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver9 = new experiment.util.TreeSetTestDriver();
        int int10 = treeSetTestDriver9.size();
        treeSetTestDriver9.clear();
        java.lang.Object[] objArray12 = treeSetTestDriver9.toArray();
        boolean boolean13 = treeSetTestDriver0.equals_CUT((java.lang.Object) objArray12);
        experiment.util.TreeSetTestDriver treeSetTestDriver14 = new experiment.util.TreeSetTestDriver();
        int int15 = treeSetTestDriver14.size();
        treeSetTestDriver14.clear();
        boolean boolean18 = treeSetTestDriver14.remove((java.lang.Object) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = treeSetTestDriver0.getMatch((java.lang.Object) treeSetTestDriver14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test040");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) "hi!");
        int int5 = treeSetTestDriver0.size();
        experiment.util.TreeSetTestDriver treeSetTestDriver6 = new experiment.util.TreeSetTestDriver();
        int int7 = treeSetTestDriver6.size();
        treeSetTestDriver6.clear();
        treeSetTestDriver6.clear();
        int int10 = treeSetTestDriver6.size();
        boolean boolean11 = treeSetTestDriver0.add((java.lang.Object) treeSetTestDriver6);
        experiment.util.Iterator iterator12 = treeSetTestDriver6.iterator();
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = treeSetTestDriver6.contains((java.lang.Object) wildcardClass14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test041");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        java.lang.Object[] objArray3 = treeSetTestDriver0.toArray();
        boolean boolean5 = treeSetTestDriver0.add((java.lang.Object) (short) -1);
        experiment.util.TreeSetTestDriver treeSetTestDriver6 = new experiment.util.TreeSetTestDriver();
        int int7 = treeSetTestDriver6.size();
        treeSetTestDriver6.clear();
        boolean boolean10 = treeSetTestDriver6.remove((java.lang.Object) "hi!");
        int int11 = treeSetTestDriver6.size();
        boolean boolean12 = treeSetTestDriver6.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = treeSetTestDriver0.add((java.lang.Object) boolean12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to java.lang.Boolean");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test042");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        java.lang.Object[] objArray3 = treeSetTestDriver0.toArray();
        experiment.util.Comparator comparator4 = treeSetTestDriver0.comparator();
        experiment.util.Comparator comparator5 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver6 = new experiment.util.TreeSetTestDriver();
        java.lang.Object[] objArray7 = treeSetTestDriver6.toArray();
        experiment.util.Comparator comparator8 = treeSetTestDriver6.comparator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = treeSetTestDriver0.equals_CUT((java.lang.Object) comparator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertNull(comparator5);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNull(comparator8);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test043");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) "hi!");
        boolean boolean6 = treeSetTestDriver0.equals_CUT((java.lang.Object) "");
        java.lang.Object[] objArray7 = treeSetTestDriver0.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver8 = new experiment.util.TreeSetTestDriver();
        int int9 = treeSetTestDriver8.size();
        treeSetTestDriver8.clear();
        java.lang.Object[] objArray11 = treeSetTestDriver8.toArray();
        boolean boolean13 = treeSetTestDriver8.add((java.lang.Object) (short) -1);
        treeSetTestDriver8.clear();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = treeSetTestDriver0.contains((java.lang.Object) treeSetTestDriver8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test044");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) "hi!");
        treeSetTestDriver0.clear();
        treeSetTestDriver0.clear();
        treeSetTestDriver0.clear();
        experiment.util.Iterator iterator8 = treeSetTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test045");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        java.lang.Object[] objArray3 = treeSetTestDriver0.toArray();
        boolean boolean5 = treeSetTestDriver0.add((java.lang.Object) (short) -1);
        treeSetTestDriver0.clear();
        int int7 = treeSetTestDriver0.size();
        experiment.util.Iterator iterator8 = treeSetTestDriver0.iterator();
        java.lang.Class<?> wildcardClass9 = iterator8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test046");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) "hi!");
        treeSetTestDriver0.clear();
        experiment.util.TreeSetTestDriver treeSetTestDriver6 = new experiment.util.TreeSetTestDriver();
        int int7 = treeSetTestDriver6.size();
        treeSetTestDriver6.clear();
        boolean boolean10 = treeSetTestDriver6.remove((java.lang.Object) "hi!");
        int int11 = treeSetTestDriver6.size();
        experiment.util.TreeSetTestDriver treeSetTestDriver12 = new experiment.util.TreeSetTestDriver();
        int int13 = treeSetTestDriver12.size();
        treeSetTestDriver12.clear();
        treeSetTestDriver12.clear();
        int int16 = treeSetTestDriver12.size();
        boolean boolean17 = treeSetTestDriver6.add((java.lang.Object) treeSetTestDriver12);
        experiment.util.TreeSetTestDriver treeSetTestDriver18 = new experiment.util.TreeSetTestDriver();
        int int19 = treeSetTestDriver18.size();
        treeSetTestDriver18.clear();
        boolean boolean22 = treeSetTestDriver18.remove((java.lang.Object) "hi!");
        boolean boolean23 = treeSetTestDriver12.add((java.lang.Object) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = treeSetTestDriver0.getMatch((java.lang.Object) treeSetTestDriver12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test047");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) "hi!");
        int int5 = treeSetTestDriver0.size();
        experiment.util.TreeSetTestDriver treeSetTestDriver6 = new experiment.util.TreeSetTestDriver();
        int int7 = treeSetTestDriver6.size();
        treeSetTestDriver6.clear();
        treeSetTestDriver6.clear();
        int int10 = treeSetTestDriver6.size();
        boolean boolean11 = treeSetTestDriver0.add((java.lang.Object) treeSetTestDriver6);
        experiment.util.TreeSetTestDriver treeSetTestDriver12 = new experiment.util.TreeSetTestDriver();
        int int13 = treeSetTestDriver12.size();
        treeSetTestDriver12.clear();
        boolean boolean16 = treeSetTestDriver12.remove((java.lang.Object) "hi!");
        boolean boolean17 = treeSetTestDriver6.add((java.lang.Object) "hi!");
        boolean boolean18 = treeSetTestDriver6.isEmpty();
        experiment.util.TreeSetTestDriver treeSetTestDriver19 = new experiment.util.TreeSetTestDriver();
        int int20 = treeSetTestDriver19.size();
        experiment.util.TreeSetTestDriver treeSetTestDriver21 = new experiment.util.TreeSetTestDriver();
        int int22 = treeSetTestDriver21.size();
        experiment.util.Comparator comparator23 = treeSetTestDriver21.comparator();
        boolean boolean25 = treeSetTestDriver21.remove((java.lang.Object) (byte) 100);
        experiment.util.Iterator iterator26 = treeSetTestDriver21.iterator();
        boolean boolean27 = treeSetTestDriver19.equals_CUT((java.lang.Object) treeSetTestDriver21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = treeSetTestDriver6.getMatch((java.lang.Object) boolean27);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to java.lang.Boolean");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(comparator23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test048");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) "hi!");
        int int5 = treeSetTestDriver0.size();
        experiment.util.TreeSetTestDriver treeSetTestDriver6 = new experiment.util.TreeSetTestDriver();
        int int7 = treeSetTestDriver6.size();
        treeSetTestDriver6.clear();
        treeSetTestDriver6.clear();
        int int10 = treeSetTestDriver6.size();
        boolean boolean11 = treeSetTestDriver0.add((java.lang.Object) treeSetTestDriver6);
        experiment.util.Iterator iterator12 = treeSetTestDriver6.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver13 = new experiment.util.TreeSetTestDriver();
        int int14 = treeSetTestDriver13.size();
        treeSetTestDriver13.clear();
        java.lang.Object[] objArray16 = treeSetTestDriver13.toArray();
        treeSetTestDriver13.clear();
        boolean boolean18 = treeSetTestDriver6.remove((java.lang.Object) treeSetTestDriver13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = treeSetTestDriver13.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test049");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        java.lang.Object[] objArray3 = treeSetTestDriver0.toArray();
        treeSetTestDriver0.clear();
        boolean boolean6 = treeSetTestDriver0.add((java.lang.Object) 1L);
        treeSetTestDriver0.clear();
        experiment.util.TreeSetTestDriver treeSetTestDriver8 = new experiment.util.TreeSetTestDriver();
        int int9 = treeSetTestDriver8.size();
        experiment.util.Comparator comparator10 = treeSetTestDriver8.comparator();
        boolean boolean11 = treeSetTestDriver0.add((java.lang.Object) treeSetTestDriver8);
        experiment.util.TreeSetTestDriver treeSetTestDriver12 = new experiment.util.TreeSetTestDriver();
        int int13 = treeSetTestDriver12.size();
        treeSetTestDriver12.clear();
        boolean boolean16 = treeSetTestDriver12.remove((java.lang.Object) "hi!");
        treeSetTestDriver12.clear();
        treeSetTestDriver12.clear();
        treeSetTestDriver12.clear();
        experiment.util.Iterator iterator20 = treeSetTestDriver12.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver21 = new experiment.util.TreeSetTestDriver();
        int int22 = treeSetTestDriver21.size();
        treeSetTestDriver21.clear();
        java.lang.Object[] objArray24 = treeSetTestDriver21.toArray();
        boolean boolean25 = treeSetTestDriver12.equals_CUT((java.lang.Object) objArray24);
        java.lang.Class<?> wildcardClass26 = objArray24.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = treeSetTestDriver8.getMatch((java.lang.Object) objArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Ljava.lang.Object; cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test050");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) "hi!");
        boolean boolean6 = treeSetTestDriver0.equals_CUT((java.lang.Object) "");
        experiment.util.Comparator comparator7 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver8 = new experiment.util.TreeSetTestDriver();
        int int9 = treeSetTestDriver8.size();
        treeSetTestDriver8.clear();
        boolean boolean12 = treeSetTestDriver8.remove((java.lang.Object) "hi!");
        treeSetTestDriver8.clear();
        treeSetTestDriver8.clear();
        treeSetTestDriver8.clear();
        experiment.util.Iterator iterator16 = treeSetTestDriver8.iterator();
        boolean boolean17 = treeSetTestDriver0.remove((java.lang.Object) treeSetTestDriver8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(comparator7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test051");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        java.lang.Object[] objArray3 = treeSetTestDriver0.toArray();
        treeSetTestDriver0.clear();
        boolean boolean6 = treeSetTestDriver0.add((java.lang.Object) 1L);
        java.lang.Object obj7 = treeSetTestDriver0.first();
        experiment.util.TreeSetTestDriver treeSetTestDriver8 = new experiment.util.TreeSetTestDriver();
        int int9 = treeSetTestDriver8.size();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = treeSetTestDriver0.remove((java.lang.Object) treeSetTestDriver8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1L + "'", obj7, 1L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test052");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) "hi!");
        int int5 = treeSetTestDriver0.size();
        boolean boolean6 = treeSetTestDriver0.isEmpty();
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = treeSetTestDriver0.contains(obj7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test053");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        experiment.util.TreeSetTestDriver treeSetTestDriver2 = new experiment.util.TreeSetTestDriver();
        int int3 = treeSetTestDriver2.size();
        treeSetTestDriver2.clear();
        java.lang.Object[] objArray5 = treeSetTestDriver2.toArray();
        treeSetTestDriver2.clear();
        boolean boolean7 = treeSetTestDriver0.remove((java.lang.Object) treeSetTestDriver2);
        java.lang.Object obj8 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = treeSetTestDriver2.contains(obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Object cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test054");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object[] objArray1 = treeSetTestDriver0.toArray();
        java.lang.Class<?> wildcardClass2 = objArray1.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test055");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        java.lang.Object[] objArray3 = treeSetTestDriver0.toArray();
        treeSetTestDriver0.clear();
        boolean boolean6 = treeSetTestDriver0.add((java.lang.Object) 1L);
        treeSetTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test056");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) "hi!");
        int int5 = treeSetTestDriver0.size();
        java.lang.Object[] objArray6 = treeSetTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test057");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.contains((java.lang.Object) false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test058");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) "hi!");
        treeSetTestDriver0.clear();
        treeSetTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test059");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        experiment.util.Comparator comparator2 = treeSetTestDriver0.comparator();
        treeSetTestDriver0.clear();
        experiment.util.Comparator comparator4 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver5 = new experiment.util.TreeSetTestDriver();
        boolean boolean7 = treeSetTestDriver5.contains((java.lang.Object) false);
        java.lang.Object obj8 = treeSetTestDriver0.getMatch((java.lang.Object) false);
        java.lang.Object obj9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = treeSetTestDriver0.getMatch(obj9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test060");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) "hi!");
        treeSetTestDriver0.clear();
        treeSetTestDriver0.clear();
        treeSetTestDriver0.clear();
        boolean boolean9 = treeSetTestDriver0.remove((java.lang.Object) "");
        experiment.util.TreeSetTestDriver treeSetTestDriver10 = new experiment.util.TreeSetTestDriver();
        int int11 = treeSetTestDriver10.size();
        treeSetTestDriver10.clear();
        java.lang.Object[] objArray13 = treeSetTestDriver10.toArray();
        boolean boolean15 = treeSetTestDriver10.add((java.lang.Object) (short) -1);
        java.lang.Object obj16 = treeSetTestDriver10.last();
        boolean boolean17 = treeSetTestDriver0.remove(obj16);
        experiment.util.TreeSetTestDriver treeSetTestDriver18 = new experiment.util.TreeSetTestDriver();
        int int19 = treeSetTestDriver18.size();
        treeSetTestDriver18.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = treeSetTestDriver0.getMatch((java.lang.Object) treeSetTestDriver18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) -1 + "'", obj16, (short) -1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test061");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) "hi!");
        int int5 = treeSetTestDriver0.size();
        experiment.util.TreeSetTestDriver treeSetTestDriver6 = new experiment.util.TreeSetTestDriver();
        int int7 = treeSetTestDriver6.size();
        treeSetTestDriver6.clear();
        treeSetTestDriver6.clear();
        int int10 = treeSetTestDriver6.size();
        boolean boolean11 = treeSetTestDriver0.add((java.lang.Object) treeSetTestDriver6);
        experiment.util.TreeSetTestDriver treeSetTestDriver12 = new experiment.util.TreeSetTestDriver();
        int int13 = treeSetTestDriver12.size();
        treeSetTestDriver12.clear();
        boolean boolean16 = treeSetTestDriver12.remove((java.lang.Object) "hi!");
        boolean boolean17 = treeSetTestDriver6.add((java.lang.Object) "hi!");
        int int18 = treeSetTestDriver6.size();
        experiment.util.TreeSetTestDriver treeSetTestDriver19 = new experiment.util.TreeSetTestDriver();
        int int20 = treeSetTestDriver19.size();
        treeSetTestDriver19.clear();
        java.lang.Object[] objArray22 = treeSetTestDriver19.toArray();
        boolean boolean24 = treeSetTestDriver19.add((java.lang.Object) (short) -1);
        treeSetTestDriver19.clear();
        java.lang.Class<?> wildcardClass26 = treeSetTestDriver19.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = treeSetTestDriver6.contains((java.lang.Object) wildcardClass26);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test062");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        experiment.util.Comparator comparator2 = treeSetTestDriver0.comparator();
        treeSetTestDriver0.clear();
        experiment.util.Comparator comparator4 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver5 = new experiment.util.TreeSetTestDriver();
        boolean boolean7 = treeSetTestDriver5.contains((java.lang.Object) false);
        java.lang.Object obj8 = treeSetTestDriver0.getMatch((java.lang.Object) false);
        experiment.util.Comparator comparator9 = treeSetTestDriver0.comparator();
        experiment.util.Comparator comparator10 = treeSetTestDriver0.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertNull(comparator10);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test063");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) "hi!");
        treeSetTestDriver0.clear();
        treeSetTestDriver0.clear();
        treeSetTestDriver0.clear();
        experiment.util.Iterator iterator8 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver9 = new experiment.util.TreeSetTestDriver();
        int int10 = treeSetTestDriver9.size();
        treeSetTestDriver9.clear();
        java.lang.Object[] objArray12 = treeSetTestDriver9.toArray();
        boolean boolean13 = treeSetTestDriver0.equals_CUT((java.lang.Object) objArray12);
        java.lang.Object obj15 = treeSetTestDriver0.getMatch((java.lang.Object) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test064");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        experiment.util.Comparator comparator2 = treeSetTestDriver0.comparator();
        treeSetTestDriver0.clear();
        experiment.util.Comparator comparator4 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver5 = new experiment.util.TreeSetTestDriver();
        boolean boolean7 = treeSetTestDriver5.contains((java.lang.Object) false);
        java.lang.Object obj8 = treeSetTestDriver0.getMatch((java.lang.Object) false);
        experiment.util.Comparator comparator9 = treeSetTestDriver0.comparator();
        experiment.util.Comparator comparator10 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver11 = new experiment.util.TreeSetTestDriver();
        int int12 = treeSetTestDriver11.size();
        experiment.util.Comparator comparator13 = treeSetTestDriver11.comparator();
        boolean boolean15 = treeSetTestDriver11.remove((java.lang.Object) (byte) 100);
        int int16 = treeSetTestDriver11.size();
        experiment.util.Iterator iterator17 = treeSetTestDriver11.iterator();
        treeSetTestDriver11.clear();
        boolean boolean20 = treeSetTestDriver11.contains((java.lang.Object) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = treeSetTestDriver0.contains((java.lang.Object) treeSetTestDriver11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(comparator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test065");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        experiment.util.Comparator comparator2 = treeSetTestDriver0.comparator();
        treeSetTestDriver0.clear();
        experiment.util.Comparator comparator4 = treeSetTestDriver0.comparator();
        boolean boolean5 = treeSetTestDriver0.isEmpty();
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = treeSetTestDriver0.remove(obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test066");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) "hi!");
        int int5 = treeSetTestDriver0.size();
        experiment.util.TreeSetTestDriver treeSetTestDriver6 = new experiment.util.TreeSetTestDriver();
        int int7 = treeSetTestDriver6.size();
        treeSetTestDriver6.clear();
        treeSetTestDriver6.clear();
        int int10 = treeSetTestDriver6.size();
        boolean boolean11 = treeSetTestDriver0.add((java.lang.Object) treeSetTestDriver6);
        experiment.util.TreeSetTestDriver treeSetTestDriver12 = new experiment.util.TreeSetTestDriver();
        int int13 = treeSetTestDriver12.size();
        treeSetTestDriver12.clear();
        boolean boolean16 = treeSetTestDriver12.remove((java.lang.Object) "hi!");
        int int17 = treeSetTestDriver12.size();
        boolean boolean18 = treeSetTestDriver12.isEmpty();
        boolean boolean19 = treeSetTestDriver12.isEmpty();
        boolean boolean20 = treeSetTestDriver6.equals_CUT((java.lang.Object) treeSetTestDriver12);
        experiment.util.TreeSetTestDriver treeSetTestDriver21 = new experiment.util.TreeSetTestDriver();
        int int22 = treeSetTestDriver21.size();
        treeSetTestDriver21.clear();
        java.lang.Object[] objArray24 = treeSetTestDriver21.toArray();
        boolean boolean26 = treeSetTestDriver21.add((java.lang.Object) (short) -1);
        treeSetTestDriver21.clear();
        java.lang.Class<?> wildcardClass28 = treeSetTestDriver21.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = treeSetTestDriver12.getMatch((java.lang.Object) treeSetTestDriver21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test067");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        java.lang.Object[] objArray3 = treeSetTestDriver0.toArray();
        treeSetTestDriver0.clear();
        boolean boolean6 = treeSetTestDriver0.add((java.lang.Object) 1L);
        experiment.util.Comparator comparator7 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver8 = new experiment.util.TreeSetTestDriver();
        int int9 = treeSetTestDriver8.size();
        treeSetTestDriver8.clear();
        boolean boolean12 = treeSetTestDriver8.remove((java.lang.Object) "hi!");
        int int13 = treeSetTestDriver8.size();
        experiment.util.TreeSetTestDriver treeSetTestDriver14 = new experiment.util.TreeSetTestDriver();
        int int15 = treeSetTestDriver14.size();
        treeSetTestDriver14.clear();
        treeSetTestDriver14.clear();
        int int18 = treeSetTestDriver14.size();
        boolean boolean19 = treeSetTestDriver8.add((java.lang.Object) treeSetTestDriver14);
        experiment.util.TreeSetTestDriver treeSetTestDriver20 = new experiment.util.TreeSetTestDriver();
        int int21 = treeSetTestDriver20.size();
        treeSetTestDriver20.clear();
        boolean boolean24 = treeSetTestDriver20.remove((java.lang.Object) "hi!");
        boolean boolean25 = treeSetTestDriver14.add((java.lang.Object) "hi!");
        boolean boolean26 = treeSetTestDriver14.isEmpty();
        int int27 = treeSetTestDriver14.size();
        experiment.util.Iterator iterator28 = treeSetTestDriver14.iterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = treeSetTestDriver0.contains((java.lang.Object) iterator28);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet$TreeSetIterator cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(comparator7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(iterator28);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test068");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        experiment.util.Comparator comparator2 = treeSetTestDriver0.comparator();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) (byte) 100);
        int int5 = treeSetTestDriver0.size();
        experiment.util.Iterator iterator6 = treeSetTestDriver0.iterator();
        treeSetTestDriver0.clear();
        treeSetTestDriver0.clear();
        experiment.util.TreeSetTestDriver treeSetTestDriver9 = new experiment.util.TreeSetTestDriver();
        int int10 = treeSetTestDriver9.size();
        experiment.util.Comparator comparator11 = treeSetTestDriver9.comparator();
        treeSetTestDriver9.clear();
        experiment.util.Comparator comparator13 = treeSetTestDriver9.comparator();
        boolean boolean14 = treeSetTestDriver9.isEmpty();
        experiment.util.Comparator comparator15 = treeSetTestDriver9.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = treeSetTestDriver0.getMatch((java.lang.Object) comparator15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertNull(comparator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(comparator15);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test069");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) "hi!");
        boolean boolean6 = treeSetTestDriver0.equals_CUT((java.lang.Object) "");
        java.lang.Object[] objArray7 = treeSetTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test070");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        java.lang.Object[] objArray3 = treeSetTestDriver0.toArray();
        int int4 = treeSetTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test071");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) "hi!");
        boolean boolean6 = treeSetTestDriver0.equals_CUT((java.lang.Object) "");
        experiment.util.Comparator comparator7 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver8 = new experiment.util.TreeSetTestDriver();
        java.lang.Object[] objArray9 = treeSetTestDriver8.toArray();
        experiment.util.Comparator comparator10 = treeSetTestDriver8.comparator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = treeSetTestDriver0.contains((java.lang.Object) comparator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(comparator7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(comparator10);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test072");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.contains((java.lang.Object) false);
        treeSetTestDriver0.clear();
        experiment.util.Iterator iterator4 = treeSetTestDriver0.iterator();
        treeSetTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator4);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test073");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        experiment.util.Comparator comparator2 = treeSetTestDriver0.comparator();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) (byte) 100);
        int int5 = treeSetTestDriver0.size();
        experiment.util.Iterator iterator6 = treeSetTestDriver0.iterator();
        treeSetTestDriver0.clear();
        experiment.util.TreeSetTestDriver treeSetTestDriver8 = new experiment.util.TreeSetTestDriver();
        int int9 = treeSetTestDriver8.size();
        treeSetTestDriver8.clear();
        java.lang.Object[] objArray11 = treeSetTestDriver8.toArray();
        boolean boolean13 = treeSetTestDriver8.add((java.lang.Object) (short) -1);
        treeSetTestDriver8.clear();
        java.lang.Class<?> wildcardClass15 = treeSetTestDriver8.getClass();
        boolean boolean16 = treeSetTestDriver0.add((java.lang.Object) treeSetTestDriver8);
        experiment.util.TreeSetTestDriver treeSetTestDriver17 = new experiment.util.TreeSetTestDriver();
        int int18 = treeSetTestDriver17.size();
        treeSetTestDriver17.clear();
        boolean boolean21 = treeSetTestDriver17.remove((java.lang.Object) "hi!");
        int int22 = treeSetTestDriver17.size();
        experiment.util.TreeSetTestDriver treeSetTestDriver23 = new experiment.util.TreeSetTestDriver();
        int int24 = treeSetTestDriver23.size();
        treeSetTestDriver23.clear();
        treeSetTestDriver23.clear();
        int int27 = treeSetTestDriver23.size();
        boolean boolean28 = treeSetTestDriver17.add((java.lang.Object) treeSetTestDriver23);
        experiment.util.Iterator iterator29 = treeSetTestDriver23.iterator();
        boolean boolean30 = treeSetTestDriver8.remove((java.lang.Object) iterator29);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test074");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) "hi!");
        int int5 = treeSetTestDriver0.size();
        experiment.util.TreeSetTestDriver treeSetTestDriver6 = new experiment.util.TreeSetTestDriver();
        int int7 = treeSetTestDriver6.size();
        treeSetTestDriver6.clear();
        treeSetTestDriver6.clear();
        int int10 = treeSetTestDriver6.size();
        boolean boolean11 = treeSetTestDriver0.add((java.lang.Object) treeSetTestDriver6);
        experiment.util.Iterator iterator12 = treeSetTestDriver6.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = treeSetTestDriver6.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test075");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) "hi!");
        int int5 = treeSetTestDriver0.size();
        boolean boolean6 = treeSetTestDriver0.isEmpty();
        boolean boolean7 = treeSetTestDriver0.isEmpty();
        java.lang.Object obj9 = treeSetTestDriver0.getMatch((java.lang.Object) '#');
        experiment.util.TreeSetTestDriver treeSetTestDriver10 = new experiment.util.TreeSetTestDriver();
        boolean boolean12 = treeSetTestDriver10.contains((java.lang.Object) false);
        treeSetTestDriver10.clear();
        experiment.util.Iterator iterator14 = treeSetTestDriver10.iterator();
        treeSetTestDriver10.clear();
        boolean boolean16 = treeSetTestDriver0.equals_CUT((java.lang.Object) treeSetTestDriver10);
        int int17 = treeSetTestDriver0.size();
        java.lang.Object obj18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = treeSetTestDriver0.getMatch(obj18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test076");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        experiment.util.TreeSetTestDriver treeSetTestDriver2 = new experiment.util.TreeSetTestDriver();
        int int3 = treeSetTestDriver2.size();
        treeSetTestDriver2.clear();
        java.lang.Object[] objArray5 = treeSetTestDriver2.toArray();
        treeSetTestDriver2.clear();
        boolean boolean7 = treeSetTestDriver0.remove((java.lang.Object) treeSetTestDriver2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = treeSetTestDriver2.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test077");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        java.lang.Object[] objArray3 = treeSetTestDriver0.toArray();
        boolean boolean5 = treeSetTestDriver0.add((java.lang.Object) (short) -1);
        treeSetTestDriver0.clear();
        boolean boolean7 = treeSetTestDriver0.isEmpty();
        experiment.util.TreeSetTestDriver treeSetTestDriver8 = new experiment.util.TreeSetTestDriver();
        int int9 = treeSetTestDriver8.size();
        treeSetTestDriver8.clear();
        boolean boolean12 = treeSetTestDriver8.remove((java.lang.Object) "hi!");
        boolean boolean14 = treeSetTestDriver8.equals_CUT((java.lang.Object) "");
        boolean boolean15 = treeSetTestDriver0.equals_CUT((java.lang.Object) treeSetTestDriver8);
        java.lang.Class<?> wildcardClass16 = treeSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test078");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) "hi!");
        treeSetTestDriver0.clear();
        treeSetTestDriver0.clear();
        treeSetTestDriver0.clear();
        boolean boolean9 = treeSetTestDriver0.remove((java.lang.Object) "");
        experiment.util.TreeSetTestDriver treeSetTestDriver10 = new experiment.util.TreeSetTestDriver();
        int int11 = treeSetTestDriver10.size();
        treeSetTestDriver10.clear();
        java.lang.Object[] objArray13 = treeSetTestDriver10.toArray();
        boolean boolean15 = treeSetTestDriver10.add((java.lang.Object) (short) -1);
        java.lang.Object obj16 = treeSetTestDriver10.last();
        boolean boolean17 = treeSetTestDriver0.remove(obj16);
        experiment.util.Comparator comparator18 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver19 = new experiment.util.TreeSetTestDriver();
        int int20 = treeSetTestDriver19.size();
        treeSetTestDriver19.clear();
        boolean boolean23 = treeSetTestDriver19.remove((java.lang.Object) "hi!");
        treeSetTestDriver19.clear();
        treeSetTestDriver19.clear();
        treeSetTestDriver19.clear();
        experiment.util.Iterator iterator27 = treeSetTestDriver19.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver28 = new experiment.util.TreeSetTestDriver();
        int int29 = treeSetTestDriver28.size();
        treeSetTestDriver28.clear();
        java.lang.Object[] objArray31 = treeSetTestDriver28.toArray();
        boolean boolean32 = treeSetTestDriver19.equals_CUT((java.lang.Object) objArray31);
        experiment.util.TreeSetTestDriver treeSetTestDriver33 = new experiment.util.TreeSetTestDriver();
        int int34 = treeSetTestDriver33.size();
        experiment.util.Comparator comparator35 = treeSetTestDriver33.comparator();
        boolean boolean37 = treeSetTestDriver33.remove((java.lang.Object) (byte) 100);
        experiment.util.Iterator iterator38 = treeSetTestDriver33.iterator();
        boolean boolean39 = treeSetTestDriver19.remove((java.lang.Object) iterator38);
        int int40 = treeSetTestDriver19.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj41 = treeSetTestDriver0.getMatch((java.lang.Object) treeSetTestDriver19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) -1 + "'", obj16, (short) -1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(comparator18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(comparator35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test079");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        experiment.util.Comparator comparator2 = treeSetTestDriver0.comparator();
        treeSetTestDriver0.clear();
        experiment.util.Comparator comparator4 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver5 = new experiment.util.TreeSetTestDriver();
        boolean boolean7 = treeSetTestDriver5.contains((java.lang.Object) false);
        java.lang.Object obj8 = treeSetTestDriver0.getMatch((java.lang.Object) false);
        java.lang.Object[] objArray9 = treeSetTestDriver0.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver10 = new experiment.util.TreeSetTestDriver();
        int int11 = treeSetTestDriver10.size();
        treeSetTestDriver10.clear();
        treeSetTestDriver10.clear();
        boolean boolean14 = treeSetTestDriver10.isEmpty();
        java.lang.Object obj16 = treeSetTestDriver10.getMatch((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray17 = treeSetTestDriver10.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = treeSetTestDriver0.getMatch((java.lang.Object) treeSetTestDriver10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test080");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        java.lang.Object[] objArray3 = treeSetTestDriver0.toArray();
        boolean boolean5 = treeSetTestDriver0.add((java.lang.Object) (short) -1);
        experiment.util.Iterator iterator6 = treeSetTestDriver0.iterator();
        boolean boolean8 = treeSetTestDriver0.add((java.lang.Object) (short) -1);
        java.lang.Object[] objArray9 = treeSetTestDriver0.toArray();
        boolean boolean10 = treeSetTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = treeSetTestDriver0.getMatch((java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to java.lang.Float");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test081");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) "hi!");
        int int5 = treeSetTestDriver0.size();
        boolean boolean6 = treeSetTestDriver0.isEmpty();
        boolean boolean7 = treeSetTestDriver0.isEmpty();
        java.lang.Object obj9 = treeSetTestDriver0.getMatch((java.lang.Object) '#');
        experiment.util.TreeSetTestDriver treeSetTestDriver10 = new experiment.util.TreeSetTestDriver();
        boolean boolean12 = treeSetTestDriver10.contains((java.lang.Object) false);
        treeSetTestDriver10.clear();
        experiment.util.Iterator iterator14 = treeSetTestDriver10.iterator();
        treeSetTestDriver10.clear();
        boolean boolean16 = treeSetTestDriver0.equals_CUT((java.lang.Object) treeSetTestDriver10);
        boolean boolean18 = treeSetTestDriver10.remove((java.lang.Object) 1.0d);
        java.lang.Object obj19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = treeSetTestDriver10.contains(obj19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test082");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) "hi!");
        int int5 = treeSetTestDriver0.size();
        boolean boolean6 = treeSetTestDriver0.isEmpty();
        boolean boolean7 = treeSetTestDriver0.isEmpty();
        java.lang.Object obj9 = treeSetTestDriver0.getMatch((java.lang.Object) '#');
        experiment.util.TreeSetTestDriver treeSetTestDriver10 = new experiment.util.TreeSetTestDriver();
        boolean boolean12 = treeSetTestDriver10.contains((java.lang.Object) false);
        treeSetTestDriver10.clear();
        experiment.util.Iterator iterator14 = treeSetTestDriver10.iterator();
        treeSetTestDriver10.clear();
        boolean boolean16 = treeSetTestDriver0.equals_CUT((java.lang.Object) treeSetTestDriver10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = treeSetTestDriver10.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test083");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        java.lang.Object[] objArray3 = treeSetTestDriver0.toArray();
        treeSetTestDriver0.clear();
        boolean boolean6 = treeSetTestDriver0.add((java.lang.Object) 1L);
        treeSetTestDriver0.clear();
        experiment.util.TreeSetTestDriver treeSetTestDriver8 = new experiment.util.TreeSetTestDriver();
        int int9 = treeSetTestDriver8.size();
        experiment.util.Comparator comparator10 = treeSetTestDriver8.comparator();
        boolean boolean11 = treeSetTestDriver0.add((java.lang.Object) treeSetTestDriver8);
        java.lang.Object obj12 = treeSetTestDriver0.last();
        experiment.util.TreeSetTestDriver treeSetTestDriver13 = new experiment.util.TreeSetTestDriver();
        int int14 = treeSetTestDriver13.size();
        experiment.util.Comparator comparator15 = treeSetTestDriver13.comparator();
        treeSetTestDriver13.clear();
        experiment.util.Comparator comparator17 = treeSetTestDriver13.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver18 = new experiment.util.TreeSetTestDriver();
        boolean boolean20 = treeSetTestDriver18.contains((java.lang.Object) false);
        java.lang.Object obj21 = treeSetTestDriver13.getMatch((java.lang.Object) false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = treeSetTestDriver0.getMatch((java.lang.Object) treeSetTestDriver13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(comparator15);
        org.junit.Assert.assertNull(comparator17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test084");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        experiment.util.Comparator comparator2 = treeSetTestDriver0.comparator();
        treeSetTestDriver0.clear();
        experiment.util.Comparator comparator4 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver5 = new experiment.util.TreeSetTestDriver();
        boolean boolean7 = treeSetTestDriver5.contains((java.lang.Object) false);
        java.lang.Object obj8 = treeSetTestDriver0.getMatch((java.lang.Object) false);
        java.lang.Object[] objArray9 = treeSetTestDriver0.toArray();
        java.lang.Object[] objArray10 = treeSetTestDriver0.toArray();
        int int11 = treeSetTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test085");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        java.lang.Object[] objArray3 = treeSetTestDriver0.toArray();
        boolean boolean5 = treeSetTestDriver0.add((java.lang.Object) (short) -1);
        boolean boolean6 = treeSetTestDriver0.isEmpty();
        boolean boolean7 = treeSetTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = treeSetTestDriver0.add((java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to java.lang.Float");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test086");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        experiment.util.Comparator comparator2 = treeSetTestDriver0.comparator();
        treeSetTestDriver0.clear();
        experiment.util.Comparator comparator4 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver5 = new experiment.util.TreeSetTestDriver();
        boolean boolean7 = treeSetTestDriver5.contains((java.lang.Object) false);
        java.lang.Object obj8 = treeSetTestDriver0.getMatch((java.lang.Object) false);
        boolean boolean9 = treeSetTestDriver0.isEmpty();
        experiment.util.TreeSetTestDriver treeSetTestDriver10 = new experiment.util.TreeSetTestDriver();
        int int11 = treeSetTestDriver10.size();
        treeSetTestDriver10.clear();
        java.lang.Object[] objArray13 = treeSetTestDriver10.toArray();
        boolean boolean15 = treeSetTestDriver10.add((java.lang.Object) (short) -1);
        treeSetTestDriver10.clear();
        java.lang.Object[] objArray17 = treeSetTestDriver10.toArray();
        boolean boolean18 = treeSetTestDriver0.remove((java.lang.Object) objArray17);
        experiment.util.TreeSetTestDriver treeSetTestDriver19 = new experiment.util.TreeSetTestDriver();
        int int20 = treeSetTestDriver19.size();
        treeSetTestDriver19.clear();
        boolean boolean23 = treeSetTestDriver19.remove((java.lang.Object) "hi!");
        int int24 = treeSetTestDriver19.size();
        boolean boolean25 = treeSetTestDriver19.isEmpty();
        boolean boolean26 = treeSetTestDriver19.isEmpty();
        java.lang.Object obj28 = treeSetTestDriver19.getMatch((java.lang.Object) '#');
        experiment.util.TreeSetTestDriver treeSetTestDriver29 = new experiment.util.TreeSetTestDriver();
        boolean boolean31 = treeSetTestDriver29.contains((java.lang.Object) false);
        treeSetTestDriver29.clear();
        experiment.util.Iterator iterator33 = treeSetTestDriver29.iterator();
        treeSetTestDriver29.clear();
        boolean boolean35 = treeSetTestDriver19.equals_CUT((java.lang.Object) treeSetTestDriver29);
        int int36 = treeSetTestDriver19.size();
        experiment.util.Comparator comparator37 = treeSetTestDriver19.comparator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = treeSetTestDriver0.contains((java.lang.Object) comparator37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(comparator37);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test087");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) "hi!");
        treeSetTestDriver0.clear();
        treeSetTestDriver0.clear();
        treeSetTestDriver0.clear();
        boolean boolean9 = treeSetTestDriver0.remove((java.lang.Object) "");
        treeSetTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test088");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object[] objArray1 = treeSetTestDriver0.toArray();
        experiment.util.Comparator comparator2 = treeSetTestDriver0.comparator();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) (-1.0f));
        treeSetTestDriver0.clear();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test089");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) "hi!");
        boolean boolean6 = treeSetTestDriver0.equals_CUT((java.lang.Object) "");
        experiment.util.Comparator comparator7 = treeSetTestDriver0.comparator();
        boolean boolean8 = treeSetTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(comparator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test090");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) "hi!");
        treeSetTestDriver0.clear();
        treeSetTestDriver0.clear();
        treeSetTestDriver0.clear();
        boolean boolean9 = treeSetTestDriver0.remove((java.lang.Object) "");
        experiment.util.TreeSetTestDriver treeSetTestDriver10 = new experiment.util.TreeSetTestDriver();
        int int11 = treeSetTestDriver10.size();
        treeSetTestDriver10.clear();
        java.lang.Object[] objArray13 = treeSetTestDriver10.toArray();
        boolean boolean15 = treeSetTestDriver10.add((java.lang.Object) (short) -1);
        java.lang.Object obj16 = treeSetTestDriver10.last();
        boolean boolean17 = treeSetTestDriver0.remove(obj16);
        treeSetTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) -1 + "'", obj16, (short) -1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test091");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object[] objArray1 = treeSetTestDriver0.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver2 = new experiment.util.TreeSetTestDriver();
        int int3 = treeSetTestDriver2.size();
        treeSetTestDriver2.clear();
        boolean boolean6 = treeSetTestDriver2.remove((java.lang.Object) "hi!");
        int int7 = treeSetTestDriver2.size();
        boolean boolean8 = treeSetTestDriver2.isEmpty();
        experiment.util.TreeSetTestDriver treeSetTestDriver9 = new experiment.util.TreeSetTestDriver();
        int int10 = treeSetTestDriver9.size();
        experiment.util.TreeSetTestDriver treeSetTestDriver11 = new experiment.util.TreeSetTestDriver();
        int int12 = treeSetTestDriver11.size();
        treeSetTestDriver11.clear();
        java.lang.Object[] objArray14 = treeSetTestDriver11.toArray();
        treeSetTestDriver11.clear();
        boolean boolean16 = treeSetTestDriver9.remove((java.lang.Object) treeSetTestDriver11);
        experiment.util.TreeSetTestDriver treeSetTestDriver17 = new experiment.util.TreeSetTestDriver();
        int int18 = treeSetTestDriver17.size();
        treeSetTestDriver17.clear();
        boolean boolean21 = treeSetTestDriver17.remove((java.lang.Object) "hi!");
        int int22 = treeSetTestDriver17.size();
        boolean boolean23 = treeSetTestDriver17.isEmpty();
        boolean boolean24 = treeSetTestDriver17.isEmpty();
        java.lang.Object obj26 = treeSetTestDriver17.getMatch((java.lang.Object) '#');
        experiment.util.TreeSetTestDriver treeSetTestDriver27 = new experiment.util.TreeSetTestDriver();
        int int28 = treeSetTestDriver27.size();
        treeSetTestDriver27.clear();
        boolean boolean31 = treeSetTestDriver27.remove((java.lang.Object) "hi!");
        treeSetTestDriver27.clear();
        treeSetTestDriver27.clear();
        treeSetTestDriver27.clear();
        experiment.util.Iterator iterator35 = treeSetTestDriver27.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver36 = new experiment.util.TreeSetTestDriver();
        int int37 = treeSetTestDriver36.size();
        treeSetTestDriver36.clear();
        java.lang.Object[] objArray39 = treeSetTestDriver36.toArray();
        boolean boolean40 = treeSetTestDriver27.equals_CUT((java.lang.Object) objArray39);
        experiment.util.TreeSetTestDriver treeSetTestDriver41 = new experiment.util.TreeSetTestDriver();
        int int42 = treeSetTestDriver41.size();
        experiment.util.Comparator comparator43 = treeSetTestDriver41.comparator();
        boolean boolean45 = treeSetTestDriver41.remove((java.lang.Object) (byte) 100);
        experiment.util.Iterator iterator46 = treeSetTestDriver41.iterator();
        boolean boolean47 = treeSetTestDriver27.remove((java.lang.Object) iterator46);
        boolean boolean48 = treeSetTestDriver17.equals_CUT((java.lang.Object) iterator46);
        boolean boolean49 = treeSetTestDriver11.add((java.lang.Object) iterator46);
        boolean boolean50 = treeSetTestDriver2.equals_CUT((java.lang.Object) treeSetTestDriver11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj51 = treeSetTestDriver0.getMatch((java.lang.Object) treeSetTestDriver2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(comparator43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(iterator46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test092");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        java.lang.Object[] objArray3 = treeSetTestDriver0.toArray();
        treeSetTestDriver0.clear();
        boolean boolean6 = treeSetTestDriver0.add((java.lang.Object) 1L);
        treeSetTestDriver0.clear();
        experiment.util.TreeSetTestDriver treeSetTestDriver8 = new experiment.util.TreeSetTestDriver();
        int int9 = treeSetTestDriver8.size();
        experiment.util.Comparator comparator10 = treeSetTestDriver8.comparator();
        boolean boolean11 = treeSetTestDriver0.add((java.lang.Object) treeSetTestDriver8);
        experiment.util.TreeSetTestDriver treeSetTestDriver12 = new experiment.util.TreeSetTestDriver();
        int int13 = treeSetTestDriver12.size();
        treeSetTestDriver12.clear();
        boolean boolean16 = treeSetTestDriver12.remove((java.lang.Object) "hi!");
        treeSetTestDriver12.clear();
        java.lang.Object[] objArray18 = treeSetTestDriver12.toArray();
        java.lang.Class<?> wildcardClass19 = objArray18.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = treeSetTestDriver0.add((java.lang.Object) wildcardClass19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test093");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        experiment.util.Comparator comparator2 = treeSetTestDriver0.comparator();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) (byte) 100);
        int int5 = treeSetTestDriver0.size();
        experiment.util.Iterator iterator6 = treeSetTestDriver0.iterator();
        treeSetTestDriver0.clear();
        treeSetTestDriver0.clear();
        experiment.util.TreeSetTestDriver treeSetTestDriver9 = new experiment.util.TreeSetTestDriver();
        int int10 = treeSetTestDriver9.size();
        treeSetTestDriver9.clear();
        java.lang.Object[] objArray12 = treeSetTestDriver9.toArray();
        boolean boolean14 = treeSetTestDriver9.add((java.lang.Object) (short) -1);
        experiment.util.Iterator iterator15 = treeSetTestDriver9.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = treeSetTestDriver0.getMatch((java.lang.Object) iterator15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet$TreeSetIterator cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(iterator15);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test094");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) "hi!");
        int int5 = treeSetTestDriver0.size();
        experiment.util.TreeSetTestDriver treeSetTestDriver6 = new experiment.util.TreeSetTestDriver();
        int int7 = treeSetTestDriver6.size();
        treeSetTestDriver6.clear();
        treeSetTestDriver6.clear();
        int int10 = treeSetTestDriver6.size();
        boolean boolean11 = treeSetTestDriver0.add((java.lang.Object) treeSetTestDriver6);
        experiment.util.TreeSetTestDriver treeSetTestDriver12 = new experiment.util.TreeSetTestDriver();
        int int13 = treeSetTestDriver12.size();
        treeSetTestDriver12.clear();
        boolean boolean16 = treeSetTestDriver12.remove((java.lang.Object) "hi!");
        int int17 = treeSetTestDriver12.size();
        boolean boolean18 = treeSetTestDriver12.isEmpty();
        boolean boolean19 = treeSetTestDriver12.isEmpty();
        boolean boolean20 = treeSetTestDriver6.equals_CUT((java.lang.Object) treeSetTestDriver12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = treeSetTestDriver12.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test095");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        java.lang.Object[] objArray3 = treeSetTestDriver0.toArray();
        experiment.util.Comparator comparator4 = treeSetTestDriver0.comparator();
        treeSetTestDriver0.clear();
        experiment.util.TreeSetTestDriver treeSetTestDriver6 = new experiment.util.TreeSetTestDriver();
        int int7 = treeSetTestDriver6.size();
        treeSetTestDriver6.clear();
        boolean boolean10 = treeSetTestDriver6.remove((java.lang.Object) "hi!");
        int int11 = treeSetTestDriver6.size();
        boolean boolean12 = treeSetTestDriver6.isEmpty();
        experiment.util.TreeSetTestDriver treeSetTestDriver13 = new experiment.util.TreeSetTestDriver();
        int int14 = treeSetTestDriver13.size();
        experiment.util.TreeSetTestDriver treeSetTestDriver15 = new experiment.util.TreeSetTestDriver();
        int int16 = treeSetTestDriver15.size();
        treeSetTestDriver15.clear();
        java.lang.Object[] objArray18 = treeSetTestDriver15.toArray();
        treeSetTestDriver15.clear();
        boolean boolean20 = treeSetTestDriver13.remove((java.lang.Object) treeSetTestDriver15);
        experiment.util.TreeSetTestDriver treeSetTestDriver21 = new experiment.util.TreeSetTestDriver();
        int int22 = treeSetTestDriver21.size();
        treeSetTestDriver21.clear();
        boolean boolean25 = treeSetTestDriver21.remove((java.lang.Object) "hi!");
        int int26 = treeSetTestDriver21.size();
        boolean boolean27 = treeSetTestDriver21.isEmpty();
        boolean boolean28 = treeSetTestDriver21.isEmpty();
        java.lang.Object obj30 = treeSetTestDriver21.getMatch((java.lang.Object) '#');
        experiment.util.TreeSetTestDriver treeSetTestDriver31 = new experiment.util.TreeSetTestDriver();
        int int32 = treeSetTestDriver31.size();
        treeSetTestDriver31.clear();
        boolean boolean35 = treeSetTestDriver31.remove((java.lang.Object) "hi!");
        treeSetTestDriver31.clear();
        treeSetTestDriver31.clear();
        treeSetTestDriver31.clear();
        experiment.util.Iterator iterator39 = treeSetTestDriver31.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver40 = new experiment.util.TreeSetTestDriver();
        int int41 = treeSetTestDriver40.size();
        treeSetTestDriver40.clear();
        java.lang.Object[] objArray43 = treeSetTestDriver40.toArray();
        boolean boolean44 = treeSetTestDriver31.equals_CUT((java.lang.Object) objArray43);
        experiment.util.TreeSetTestDriver treeSetTestDriver45 = new experiment.util.TreeSetTestDriver();
        int int46 = treeSetTestDriver45.size();
        experiment.util.Comparator comparator47 = treeSetTestDriver45.comparator();
        boolean boolean49 = treeSetTestDriver45.remove((java.lang.Object) (byte) 100);
        experiment.util.Iterator iterator50 = treeSetTestDriver45.iterator();
        boolean boolean51 = treeSetTestDriver31.remove((java.lang.Object) iterator50);
        boolean boolean52 = treeSetTestDriver21.equals_CUT((java.lang.Object) iterator50);
        boolean boolean53 = treeSetTestDriver15.add((java.lang.Object) iterator50);
        boolean boolean54 = treeSetTestDriver6.equals_CUT((java.lang.Object) treeSetTestDriver15);
        experiment.util.Iterator iterator55 = treeSetTestDriver6.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj56 = treeSetTestDriver0.getMatch((java.lang.Object) treeSetTestDriver6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNull(comparator47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(iterator50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(iterator55);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test096");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.contains((java.lang.Object) false);
        treeSetTestDriver0.clear();
        experiment.util.TreeSetTestDriver treeSetTestDriver4 = new experiment.util.TreeSetTestDriver();
        int int5 = treeSetTestDriver4.size();
        experiment.util.Comparator comparator6 = treeSetTestDriver4.comparator();
        boolean boolean8 = treeSetTestDriver4.remove((java.lang.Object) (byte) 100);
        int int9 = treeSetTestDriver4.size();
        experiment.util.Iterator iterator10 = treeSetTestDriver4.iterator();
        treeSetTestDriver4.clear();
        experiment.util.TreeSetTestDriver treeSetTestDriver12 = new experiment.util.TreeSetTestDriver();
        int int13 = treeSetTestDriver12.size();
        treeSetTestDriver12.clear();
        java.lang.Object[] objArray15 = treeSetTestDriver12.toArray();
        boolean boolean17 = treeSetTestDriver12.add((java.lang.Object) (short) -1);
        treeSetTestDriver12.clear();
        java.lang.Class<?> wildcardClass19 = treeSetTestDriver12.getClass();
        boolean boolean20 = treeSetTestDriver4.add((java.lang.Object) treeSetTestDriver12);
        java.lang.Object[] objArray21 = treeSetTestDriver4.toArray();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = treeSetTestDriver0.contains((java.lang.Object) objArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Ljava.lang.Object; cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(objArray21);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test097");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        java.lang.Object[] objArray3 = treeSetTestDriver0.toArray();
        boolean boolean5 = treeSetTestDriver0.add((java.lang.Object) (short) -1);
        experiment.util.Iterator iterator6 = treeSetTestDriver0.iterator();
        boolean boolean8 = treeSetTestDriver0.add((java.lang.Object) (short) -1);
        java.lang.Object[] objArray9 = treeSetTestDriver0.toArray();
        experiment.util.Comparator comparator10 = treeSetTestDriver0.comparator();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1]");
        org.junit.Assert.assertNull(comparator10);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test098");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) "hi!");
        treeSetTestDriver0.clear();
        treeSetTestDriver0.clear();
        treeSetTestDriver0.clear();
        experiment.util.Iterator iterator8 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver9 = new experiment.util.TreeSetTestDriver();
        int int10 = treeSetTestDriver9.size();
        treeSetTestDriver9.clear();
        java.lang.Object[] objArray12 = treeSetTestDriver9.toArray();
        boolean boolean13 = treeSetTestDriver0.equals_CUT((java.lang.Object) objArray12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test099");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) "hi!");
        int int5 = treeSetTestDriver0.size();
        experiment.util.TreeSetTestDriver treeSetTestDriver6 = new experiment.util.TreeSetTestDriver();
        int int7 = treeSetTestDriver6.size();
        treeSetTestDriver6.clear();
        treeSetTestDriver6.clear();
        int int10 = treeSetTestDriver6.size();
        boolean boolean11 = treeSetTestDriver0.add((java.lang.Object) treeSetTestDriver6);
        experiment.util.TreeSetTestDriver treeSetTestDriver12 = new experiment.util.TreeSetTestDriver();
        int int13 = treeSetTestDriver12.size();
        treeSetTestDriver12.clear();
        boolean boolean16 = treeSetTestDriver12.remove((java.lang.Object) "hi!");
        boolean boolean17 = treeSetTestDriver6.add((java.lang.Object) "hi!");
        boolean boolean18 = treeSetTestDriver6.isEmpty();
        int int19 = treeSetTestDriver6.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = treeSetTestDriver6.getMatch((java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to java.lang.Float");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test100");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        treeSetTestDriver0.clear();
        boolean boolean4 = treeSetTestDriver0.isEmpty();
        java.lang.Object obj6 = treeSetTestDriver0.getMatch((java.lang.Object) (byte) 0);
        treeSetTestDriver0.clear();
        boolean boolean8 = treeSetTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test101");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) "hi!");
        int int5 = treeSetTestDriver0.size();
        experiment.util.TreeSetTestDriver treeSetTestDriver6 = new experiment.util.TreeSetTestDriver();
        int int7 = treeSetTestDriver6.size();
        treeSetTestDriver6.clear();
        treeSetTestDriver6.clear();
        int int10 = treeSetTestDriver6.size();
        boolean boolean11 = treeSetTestDriver0.add((java.lang.Object) treeSetTestDriver6);
        experiment.util.TreeSetTestDriver treeSetTestDriver12 = new experiment.util.TreeSetTestDriver();
        int int13 = treeSetTestDriver12.size();
        treeSetTestDriver12.clear();
        boolean boolean16 = treeSetTestDriver12.remove((java.lang.Object) "hi!");
        int int17 = treeSetTestDriver12.size();
        boolean boolean18 = treeSetTestDriver12.isEmpty();
        boolean boolean19 = treeSetTestDriver12.isEmpty();
        boolean boolean20 = treeSetTestDriver6.equals_CUT((java.lang.Object) treeSetTestDriver12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = treeSetTestDriver6.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test102");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) "hi!");
        treeSetTestDriver0.clear();
        treeSetTestDriver0.clear();
        treeSetTestDriver0.clear();
        boolean boolean9 = treeSetTestDriver0.remove((java.lang.Object) "");
        experiment.util.TreeSetTestDriver treeSetTestDriver10 = new experiment.util.TreeSetTestDriver();
        int int11 = treeSetTestDriver10.size();
        treeSetTestDriver10.clear();
        java.lang.Object[] objArray13 = treeSetTestDriver10.toArray();
        boolean boolean15 = treeSetTestDriver10.add((java.lang.Object) (short) -1);
        java.lang.Object obj16 = treeSetTestDriver10.last();
        boolean boolean17 = treeSetTestDriver0.remove(obj16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) -1 + "'", obj16, (short) -1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test103");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) "hi!");
        treeSetTestDriver0.clear();
        treeSetTestDriver0.clear();
        treeSetTestDriver0.clear();
        experiment.util.Iterator iterator8 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver9 = new experiment.util.TreeSetTestDriver();
        int int10 = treeSetTestDriver9.size();
        treeSetTestDriver9.clear();
        java.lang.Object[] objArray12 = treeSetTestDriver9.toArray();
        boolean boolean13 = treeSetTestDriver0.equals_CUT((java.lang.Object) objArray12);
        experiment.util.Comparator comparator14 = treeSetTestDriver0.comparator();
        java.lang.Class<?> wildcardClass15 = treeSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(comparator14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test104");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        java.lang.Object[] objArray3 = treeSetTestDriver0.toArray();
        treeSetTestDriver0.clear();
        boolean boolean6 = treeSetTestDriver0.add((java.lang.Object) 1L);
        experiment.util.Comparator comparator7 = treeSetTestDriver0.comparator();
        boolean boolean8 = treeSetTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass9 = treeSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(comparator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test105");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        experiment.util.Comparator comparator2 = treeSetTestDriver0.comparator();
        treeSetTestDriver0.clear();
        experiment.util.Comparator comparator4 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver5 = new experiment.util.TreeSetTestDriver();
        boolean boolean7 = treeSetTestDriver5.contains((java.lang.Object) false);
        java.lang.Object obj8 = treeSetTestDriver0.getMatch((java.lang.Object) false);
        boolean boolean9 = treeSetTestDriver0.isEmpty();
        experiment.util.Comparator comparator10 = treeSetTestDriver0.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(comparator10);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test106");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        experiment.util.Comparator comparator2 = treeSetTestDriver0.comparator();
        treeSetTestDriver0.clear();
        experiment.util.Comparator comparator4 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver5 = new experiment.util.TreeSetTestDriver();
        boolean boolean7 = treeSetTestDriver5.contains((java.lang.Object) false);
        java.lang.Object obj8 = treeSetTestDriver0.getMatch((java.lang.Object) false);
        experiment.util.TreeSetTestDriver treeSetTestDriver9 = new experiment.util.TreeSetTestDriver();
        int int10 = treeSetTestDriver9.size();
        treeSetTestDriver9.clear();
        java.lang.Object[] objArray12 = treeSetTestDriver9.toArray();
        boolean boolean14 = treeSetTestDriver9.add((java.lang.Object) (short) -1);
        treeSetTestDriver9.clear();
        int int16 = treeSetTestDriver9.size();
        experiment.util.Iterator iterator17 = treeSetTestDriver9.iterator();
        boolean boolean18 = treeSetTestDriver0.add((java.lang.Object) treeSetTestDriver9);
        experiment.util.TreeSetTestDriver treeSetTestDriver19 = new experiment.util.TreeSetTestDriver();
        int int20 = treeSetTestDriver19.size();
        treeSetTestDriver19.clear();
        boolean boolean23 = treeSetTestDriver19.remove((java.lang.Object) "hi!");
        int int24 = treeSetTestDriver19.size();
        experiment.util.TreeSetTestDriver treeSetTestDriver25 = new experiment.util.TreeSetTestDriver();
        int int26 = treeSetTestDriver25.size();
        treeSetTestDriver25.clear();
        treeSetTestDriver25.clear();
        int int29 = treeSetTestDriver25.size();
        boolean boolean30 = treeSetTestDriver19.add((java.lang.Object) treeSetTestDriver25);
        experiment.util.TreeSetTestDriver treeSetTestDriver31 = new experiment.util.TreeSetTestDriver();
        int int32 = treeSetTestDriver31.size();
        treeSetTestDriver31.clear();
        boolean boolean35 = treeSetTestDriver31.remove((java.lang.Object) "hi!");
        int int36 = treeSetTestDriver31.size();
        boolean boolean37 = treeSetTestDriver31.isEmpty();
        boolean boolean38 = treeSetTestDriver31.isEmpty();
        boolean boolean39 = treeSetTestDriver25.equals_CUT((java.lang.Object) treeSetTestDriver31);
        treeSetTestDriver25.clear();
        experiment.util.TreeSetTestDriver treeSetTestDriver41 = new experiment.util.TreeSetTestDriver();
        boolean boolean43 = treeSetTestDriver41.contains((java.lang.Object) false);
        boolean boolean44 = treeSetTestDriver25.add((java.lang.Object) treeSetTestDriver41);
        boolean boolean45 = treeSetTestDriver9.remove((java.lang.Object) treeSetTestDriver25);
        experiment.util.TreeSetTestDriver treeSetTestDriver46 = new experiment.util.TreeSetTestDriver();
        int int47 = treeSetTestDriver46.size();
        treeSetTestDriver46.clear();
        boolean boolean50 = treeSetTestDriver46.remove((java.lang.Object) "hi!");
        int int51 = treeSetTestDriver46.size();
        experiment.util.TreeSetTestDriver treeSetTestDriver52 = new experiment.util.TreeSetTestDriver();
        int int53 = treeSetTestDriver52.size();
        treeSetTestDriver52.clear();
        treeSetTestDriver52.clear();
        int int56 = treeSetTestDriver52.size();
        boolean boolean57 = treeSetTestDriver46.add((java.lang.Object) treeSetTestDriver52);
        experiment.util.TreeSetTestDriver treeSetTestDriver58 = new experiment.util.TreeSetTestDriver();
        int int59 = treeSetTestDriver58.size();
        treeSetTestDriver58.clear();
        boolean boolean62 = treeSetTestDriver58.remove((java.lang.Object) "hi!");
        boolean boolean63 = treeSetTestDriver52.add((java.lang.Object) "hi!");
        int int64 = treeSetTestDriver52.size();
        java.lang.Object obj65 = treeSetTestDriver52.last();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean66 = treeSetTestDriver25.remove(obj65);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + "hi!" + "'", obj65, "hi!");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test107");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        java.lang.Object[] objArray3 = treeSetTestDriver0.toArray();
        treeSetTestDriver0.clear();
        boolean boolean6 = treeSetTestDriver0.add((java.lang.Object) 1L);
        treeSetTestDriver0.clear();
        experiment.util.TreeSetTestDriver treeSetTestDriver8 = new experiment.util.TreeSetTestDriver();
        int int9 = treeSetTestDriver8.size();
        experiment.util.Comparator comparator10 = treeSetTestDriver8.comparator();
        boolean boolean11 = treeSetTestDriver0.add((java.lang.Object) treeSetTestDriver8);
        experiment.util.TreeSetTestDriver treeSetTestDriver12 = new experiment.util.TreeSetTestDriver();
        int int13 = treeSetTestDriver12.size();
        experiment.util.Comparator comparator14 = treeSetTestDriver12.comparator();
        boolean boolean16 = treeSetTestDriver12.remove((java.lang.Object) (byte) 100);
        experiment.util.Iterator iterator17 = treeSetTestDriver12.iterator();
        boolean boolean18 = treeSetTestDriver12.isEmpty();
        boolean boolean19 = treeSetTestDriver8.add((java.lang.Object) boolean18);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(comparator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test108");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) "hi!");
        treeSetTestDriver0.clear();
        treeSetTestDriver0.clear();
        treeSetTestDriver0.clear();
        boolean boolean9 = treeSetTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean10 = treeSetTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test109");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        java.lang.Object[] objArray3 = treeSetTestDriver0.toArray();
        treeSetTestDriver0.clear();
        boolean boolean6 = treeSetTestDriver0.add((java.lang.Object) 1L);
        treeSetTestDriver0.clear();
        experiment.util.TreeSetTestDriver treeSetTestDriver8 = new experiment.util.TreeSetTestDriver();
        int int9 = treeSetTestDriver8.size();
        experiment.util.Comparator comparator10 = treeSetTestDriver8.comparator();
        boolean boolean11 = treeSetTestDriver0.add((java.lang.Object) treeSetTestDriver8);
        java.lang.Object obj12 = treeSetTestDriver0.first();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test110");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        treeSetTestDriver0.clear();
        experiment.util.Comparator comparator4 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver5 = new experiment.util.TreeSetTestDriver();
        int int6 = treeSetTestDriver5.size();
        treeSetTestDriver5.clear();
        boolean boolean9 = treeSetTestDriver5.remove((java.lang.Object) "hi!");
        treeSetTestDriver5.clear();
        treeSetTestDriver5.clear();
        treeSetTestDriver5.clear();
        boolean boolean14 = treeSetTestDriver5.contains((java.lang.Object) 1.0f);
        java.lang.Class<?> wildcardClass15 = treeSetTestDriver5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = treeSetTestDriver0.getMatch((java.lang.Object) wildcardClass15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test111");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) "hi!");
        int int5 = treeSetTestDriver0.size();
        experiment.util.TreeSetTestDriver treeSetTestDriver6 = new experiment.util.TreeSetTestDriver();
        int int7 = treeSetTestDriver6.size();
        treeSetTestDriver6.clear();
        treeSetTestDriver6.clear();
        int int10 = treeSetTestDriver6.size();
        boolean boolean11 = treeSetTestDriver0.add((java.lang.Object) treeSetTestDriver6);
        experiment.util.TreeSetTestDriver treeSetTestDriver12 = new experiment.util.TreeSetTestDriver();
        int int13 = treeSetTestDriver12.size();
        treeSetTestDriver12.clear();
        boolean boolean16 = treeSetTestDriver12.remove((java.lang.Object) "hi!");
        int int17 = treeSetTestDriver12.size();
        boolean boolean18 = treeSetTestDriver12.isEmpty();
        boolean boolean19 = treeSetTestDriver12.isEmpty();
        boolean boolean20 = treeSetTestDriver6.equals_CUT((java.lang.Object) treeSetTestDriver12);
        treeSetTestDriver6.clear();
        experiment.util.TreeSetTestDriver treeSetTestDriver22 = new experiment.util.TreeSetTestDriver();
        boolean boolean24 = treeSetTestDriver22.contains((java.lang.Object) false);
        boolean boolean25 = treeSetTestDriver6.add((java.lang.Object) treeSetTestDriver22);
        experiment.util.Comparator comparator26 = treeSetTestDriver6.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver27 = new experiment.util.TreeSetTestDriver();
        int int28 = treeSetTestDriver27.size();
        treeSetTestDriver27.clear();
        java.lang.Object[] objArray30 = treeSetTestDriver27.toArray();
        boolean boolean32 = treeSetTestDriver27.add((java.lang.Object) (short) -1);
        boolean boolean33 = treeSetTestDriver27.isEmpty();
        boolean boolean34 = treeSetTestDriver27.isEmpty();
        experiment.util.TreeSetTestDriver treeSetTestDriver35 = new experiment.util.TreeSetTestDriver();
        int int36 = treeSetTestDriver35.size();
        treeSetTestDriver35.clear();
        java.lang.Object[] objArray38 = treeSetTestDriver35.toArray();
        treeSetTestDriver35.clear();
        boolean boolean41 = treeSetTestDriver35.add((java.lang.Object) 1L);
        treeSetTestDriver35.clear();
        experiment.util.TreeSetTestDriver treeSetTestDriver43 = new experiment.util.TreeSetTestDriver();
        int int44 = treeSetTestDriver43.size();
        experiment.util.Comparator comparator45 = treeSetTestDriver43.comparator();
        boolean boolean46 = treeSetTestDriver35.add((java.lang.Object) treeSetTestDriver43);
        java.lang.Object obj47 = treeSetTestDriver35.first();
        boolean boolean48 = treeSetTestDriver27.equals_CUT((java.lang.Object) treeSetTestDriver35);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean49 = treeSetTestDriver6.contains((java.lang.Object) treeSetTestDriver35);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(comparator26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNull(comparator45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test112");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        experiment.util.Comparator comparator2 = treeSetTestDriver0.comparator();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) (byte) 100);
        experiment.util.Iterator iterator5 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver6 = new experiment.util.TreeSetTestDriver();
        int int7 = treeSetTestDriver6.size();
        treeSetTestDriver6.clear();
        java.lang.Object[] objArray9 = treeSetTestDriver6.toArray();
        boolean boolean11 = treeSetTestDriver6.add((java.lang.Object) (short) -1);
        experiment.util.Iterator iterator12 = treeSetTestDriver6.iterator();
        java.lang.Class<?> wildcardClass13 = treeSetTestDriver6.getClass();
        boolean boolean14 = treeSetTestDriver0.remove((java.lang.Object) treeSetTestDriver6);
        java.lang.Object[] objArray15 = treeSetTestDriver6.toArray();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[-1]");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test113");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        java.lang.Object[] objArray3 = treeSetTestDriver0.toArray();
        boolean boolean5 = treeSetTestDriver0.add((java.lang.Object) (short) -1);
        boolean boolean6 = treeSetTestDriver0.isEmpty();
        boolean boolean7 = treeSetTestDriver0.isEmpty();
        experiment.util.TreeSetTestDriver treeSetTestDriver8 = new experiment.util.TreeSetTestDriver();
        int int9 = treeSetTestDriver8.size();
        treeSetTestDriver8.clear();
        java.lang.Object[] objArray11 = treeSetTestDriver8.toArray();
        treeSetTestDriver8.clear();
        boolean boolean14 = treeSetTestDriver8.add((java.lang.Object) 1L);
        treeSetTestDriver8.clear();
        experiment.util.TreeSetTestDriver treeSetTestDriver16 = new experiment.util.TreeSetTestDriver();
        int int17 = treeSetTestDriver16.size();
        experiment.util.Comparator comparator18 = treeSetTestDriver16.comparator();
        boolean boolean19 = treeSetTestDriver8.add((java.lang.Object) treeSetTestDriver16);
        java.lang.Object obj20 = treeSetTestDriver8.first();
        boolean boolean21 = treeSetTestDriver0.equals_CUT((java.lang.Object) treeSetTestDriver8);
        java.lang.Class<?> wildcardClass22 = treeSetTestDriver8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(comparator18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test114");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test115");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        java.lang.Object[] objArray3 = treeSetTestDriver0.toArray();
        treeSetTestDriver0.clear();
        experiment.util.TreeSetTestDriver treeSetTestDriver5 = new experiment.util.TreeSetTestDriver();
        int int6 = treeSetTestDriver5.size();
        treeSetTestDriver5.clear();
        java.lang.Object[] objArray8 = treeSetTestDriver5.toArray();
        boolean boolean9 = treeSetTestDriver0.add((java.lang.Object) treeSetTestDriver5);
        java.lang.Class<?> wildcardClass10 = treeSetTestDriver5.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test116");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        java.lang.Object[] objArray3 = treeSetTestDriver0.toArray();
        treeSetTestDriver0.clear();
        boolean boolean6 = treeSetTestDriver0.add((java.lang.Object) 1L);
        treeSetTestDriver0.clear();
        experiment.util.TreeSetTestDriver treeSetTestDriver8 = new experiment.util.TreeSetTestDriver();
        int int9 = treeSetTestDriver8.size();
        experiment.util.Comparator comparator10 = treeSetTestDriver8.comparator();
        boolean boolean11 = treeSetTestDriver0.add((java.lang.Object) treeSetTestDriver8);
        java.lang.Object obj12 = treeSetTestDriver0.last();
        experiment.util.TreeSetTestDriver treeSetTestDriver13 = new experiment.util.TreeSetTestDriver();
        int int14 = treeSetTestDriver13.size();
        treeSetTestDriver13.clear();
        boolean boolean17 = treeSetTestDriver13.remove((java.lang.Object) "hi!");
        int int18 = treeSetTestDriver13.size();
        experiment.util.TreeSetTestDriver treeSetTestDriver19 = new experiment.util.TreeSetTestDriver();
        int int20 = treeSetTestDriver19.size();
        treeSetTestDriver19.clear();
        treeSetTestDriver19.clear();
        int int23 = treeSetTestDriver19.size();
        boolean boolean24 = treeSetTestDriver13.add((java.lang.Object) treeSetTestDriver19);
        experiment.util.TreeSetTestDriver treeSetTestDriver25 = new experiment.util.TreeSetTestDriver();
        int int26 = treeSetTestDriver25.size();
        treeSetTestDriver25.clear();
        boolean boolean29 = treeSetTestDriver25.remove((java.lang.Object) "hi!");
        boolean boolean30 = treeSetTestDriver19.add((java.lang.Object) "hi!");
        boolean boolean31 = treeSetTestDriver19.isEmpty();
        int int32 = treeSetTestDriver19.size();
        experiment.util.Iterator iterator33 = treeSetTestDriver19.iterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = treeSetTestDriver0.remove((java.lang.Object) treeSetTestDriver19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(iterator33);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test117");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) "hi!");
        int int5 = treeSetTestDriver0.size();
        experiment.util.TreeSetTestDriver treeSetTestDriver6 = new experiment.util.TreeSetTestDriver();
        int int7 = treeSetTestDriver6.size();
        treeSetTestDriver6.clear();
        treeSetTestDriver6.clear();
        int int10 = treeSetTestDriver6.size();
        boolean boolean11 = treeSetTestDriver0.add((java.lang.Object) treeSetTestDriver6);
        experiment.util.TreeSetTestDriver treeSetTestDriver12 = new experiment.util.TreeSetTestDriver();
        int int13 = treeSetTestDriver12.size();
        treeSetTestDriver12.clear();
        boolean boolean16 = treeSetTestDriver12.remove((java.lang.Object) "hi!");
        boolean boolean17 = treeSetTestDriver6.add((java.lang.Object) "hi!");
        experiment.util.Comparator comparator18 = treeSetTestDriver6.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver19 = new experiment.util.TreeSetTestDriver();
        int int20 = treeSetTestDriver19.size();
        treeSetTestDriver19.clear();
        java.lang.Object[] objArray22 = treeSetTestDriver19.toArray();
        boolean boolean24 = treeSetTestDriver19.add((java.lang.Object) (short) -1);
        treeSetTestDriver19.clear();
        boolean boolean26 = treeSetTestDriver19.isEmpty();
        experiment.util.TreeSetTestDriver treeSetTestDriver27 = new experiment.util.TreeSetTestDriver();
        int int28 = treeSetTestDriver27.size();
        treeSetTestDriver27.clear();
        boolean boolean31 = treeSetTestDriver27.remove((java.lang.Object) "hi!");
        boolean boolean33 = treeSetTestDriver27.equals_CUT((java.lang.Object) "");
        boolean boolean34 = treeSetTestDriver19.equals_CUT((java.lang.Object) treeSetTestDriver27);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = treeSetTestDriver6.remove((java.lang.Object) treeSetTestDriver19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(comparator18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test118");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        experiment.util.Comparator comparator2 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver3 = new experiment.util.TreeSetTestDriver();
        int int4 = treeSetTestDriver3.size();
        treeSetTestDriver3.clear();
        boolean boolean7 = treeSetTestDriver3.remove((java.lang.Object) "hi!");
        int int8 = treeSetTestDriver3.size();
        boolean boolean9 = treeSetTestDriver3.isEmpty();
        boolean boolean10 = treeSetTestDriver3.isEmpty();
        boolean boolean11 = treeSetTestDriver0.add((java.lang.Object) treeSetTestDriver3);
        java.lang.Object obj12 = treeSetTestDriver0.last();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = treeSetTestDriver0.remove((java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Long");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test119");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        java.lang.Object[] objArray3 = treeSetTestDriver0.toArray();
        treeSetTestDriver0.clear();
        boolean boolean6 = treeSetTestDriver0.add((java.lang.Object) 1L);
        java.lang.Object obj7 = treeSetTestDriver0.first();
        java.lang.Object[] objArray8 = treeSetTestDriver0.toArray();
        treeSetTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1L + "'", obj7, 1L);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1]");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test120");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) "hi!");
        treeSetTestDriver0.clear();
        treeSetTestDriver0.clear();
        treeSetTestDriver0.clear();
        experiment.util.Iterator iterator8 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver9 = new experiment.util.TreeSetTestDriver();
        int int10 = treeSetTestDriver9.size();
        treeSetTestDriver9.clear();
        java.lang.Object[] objArray12 = treeSetTestDriver9.toArray();
        boolean boolean13 = treeSetTestDriver0.equals_CUT((java.lang.Object) objArray12);
        java.lang.Object obj15 = treeSetTestDriver0.getMatch((java.lang.Object) 100.0f);
        experiment.util.TreeSetTestDriver treeSetTestDriver16 = new experiment.util.TreeSetTestDriver();
        int int17 = treeSetTestDriver16.size();
        experiment.util.Comparator comparator18 = treeSetTestDriver16.comparator();
        treeSetTestDriver16.clear();
        experiment.util.Comparator comparator20 = treeSetTestDriver16.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver21 = new experiment.util.TreeSetTestDriver();
        boolean boolean23 = treeSetTestDriver21.contains((java.lang.Object) false);
        java.lang.Object obj24 = treeSetTestDriver16.getMatch((java.lang.Object) false);
        boolean boolean25 = treeSetTestDriver16.isEmpty();
        java.lang.Class<?> wildcardClass26 = treeSetTestDriver16.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = treeSetTestDriver0.getMatch((java.lang.Object) wildcardClass26);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(comparator18);
        org.junit.Assert.assertNull(comparator20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test121");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object[] objArray1 = treeSetTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test122");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        experiment.util.Comparator comparator2 = treeSetTestDriver0.comparator();
        treeSetTestDriver0.clear();
        experiment.util.Comparator comparator4 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver5 = new experiment.util.TreeSetTestDriver();
        int int6 = treeSetTestDriver5.size();
        treeSetTestDriver5.clear();
        boolean boolean9 = treeSetTestDriver5.remove((java.lang.Object) "hi!");
        int int10 = treeSetTestDriver5.size();
        boolean boolean11 = treeSetTestDriver5.isEmpty();
        boolean boolean12 = treeSetTestDriver0.equals_CUT((java.lang.Object) treeSetTestDriver5);
        java.lang.Object obj13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = treeSetTestDriver5.remove(obj13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test123");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) "hi!");
        int int5 = treeSetTestDriver0.size();
        experiment.util.TreeSetTestDriver treeSetTestDriver6 = new experiment.util.TreeSetTestDriver();
        int int7 = treeSetTestDriver6.size();
        treeSetTestDriver6.clear();
        treeSetTestDriver6.clear();
        int int10 = treeSetTestDriver6.size();
        boolean boolean11 = treeSetTestDriver0.add((java.lang.Object) treeSetTestDriver6);
        experiment.util.TreeSetTestDriver treeSetTestDriver12 = new experiment.util.TreeSetTestDriver();
        int int13 = treeSetTestDriver12.size();
        treeSetTestDriver12.clear();
        boolean boolean16 = treeSetTestDriver12.remove((java.lang.Object) "hi!");
        int int17 = treeSetTestDriver12.size();
        boolean boolean18 = treeSetTestDriver12.isEmpty();
        boolean boolean19 = treeSetTestDriver12.isEmpty();
        boolean boolean20 = treeSetTestDriver6.equals_CUT((java.lang.Object) treeSetTestDriver12);
        experiment.util.TreeSetTestDriver treeSetTestDriver21 = new experiment.util.TreeSetTestDriver();
        boolean boolean23 = treeSetTestDriver21.contains((java.lang.Object) false);
        treeSetTestDriver21.clear();
        experiment.util.Iterator iterator25 = treeSetTestDriver21.iterator();
        treeSetTestDriver21.clear();
        java.lang.Object obj28 = treeSetTestDriver21.getMatch((java.lang.Object) ' ');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = treeSetTestDriver12.contains(obj28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test124");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object[] objArray1 = treeSetTestDriver0.toArray();
        experiment.util.Comparator comparator2 = treeSetTestDriver0.comparator();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = treeSetTestDriver0.add(obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test125");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        experiment.util.Comparator comparator2 = treeSetTestDriver0.comparator();
        treeSetTestDriver0.clear();
        experiment.util.Comparator comparator4 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver5 = new experiment.util.TreeSetTestDriver();
        boolean boolean7 = treeSetTestDriver5.contains((java.lang.Object) false);
        java.lang.Object obj8 = treeSetTestDriver0.getMatch((java.lang.Object) false);
        experiment.util.Comparator comparator9 = treeSetTestDriver0.comparator();
        experiment.util.Comparator comparator10 = treeSetTestDriver0.comparator();
        java.lang.Object obj12 = treeSetTestDriver0.getMatch((java.lang.Object) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test126");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object[] objArray1 = treeSetTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test127");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        treeSetTestDriver0.clear();
        boolean boolean4 = treeSetTestDriver0.isEmpty();
        java.lang.Object obj6 = treeSetTestDriver0.getMatch((java.lang.Object) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1191369007_1024_0.test128");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) "hi!");
        int int5 = treeSetTestDriver0.size();
        experiment.util.TreeSetTestDriver treeSetTestDriver6 = new experiment.util.TreeSetTestDriver();
        int int7 = treeSetTestDriver6.size();
        treeSetTestDriver6.clear();
        treeSetTestDriver6.clear();
        int int10 = treeSetTestDriver6.size();
        boolean boolean11 = treeSetTestDriver0.add((java.lang.Object) treeSetTestDriver6);
        experiment.util.TreeSetTestDriver treeSetTestDriver12 = new experiment.util.TreeSetTestDriver();
        int int13 = treeSetTestDriver12.size();
        treeSetTestDriver12.clear();
        boolean boolean16 = treeSetTestDriver12.remove((java.lang.Object) "hi!");
        int int17 = treeSetTestDriver12.size();
        boolean boolean18 = treeSetTestDriver12.isEmpty();
        boolean boolean19 = treeSetTestDriver12.isEmpty();
        boolean boolean20 = treeSetTestDriver6.equals_CUT((java.lang.Object) treeSetTestDriver12);
        treeSetTestDriver6.clear();
        experiment.util.TreeSetTestDriver treeSetTestDriver22 = new experiment.util.TreeSetTestDriver();
        boolean boolean24 = treeSetTestDriver22.contains((java.lang.Object) false);
        boolean boolean25 = treeSetTestDriver6.add((java.lang.Object) treeSetTestDriver22);
        experiment.util.Comparator comparator26 = treeSetTestDriver6.comparator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = treeSetTestDriver6.remove((java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Boolean");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(comparator26);
    }

}
