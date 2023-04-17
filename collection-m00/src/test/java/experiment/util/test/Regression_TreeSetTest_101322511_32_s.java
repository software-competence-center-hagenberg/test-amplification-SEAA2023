package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_TreeSetTest_101322511_32_s {

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
            System.out.format("%n%s%n", "Regression_TreeSetTest_101322511_1024_0.test001");
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
            System.out.format("%n%s%n", "Regression_TreeSetTest_101322511_1024_0.test002");
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
            System.out.format("%n%s%n", "Regression_TreeSetTest_101322511_1024_0.test003");
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
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_101322511_1024_0.test004");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        int int2 = treeSetTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_101322511_1024_0.test005");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        boolean boolean3 = treeSetTestDriver0.equals_CUT((java.lang.Object) 100);
        int int4 = treeSetTestDriver0.size();
        experiment.util.Comparator comparator5 = treeSetTestDriver0.comparator();
        java.lang.Class<?> wildcardClass6 = treeSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(comparator5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_101322511_1024_0.test006");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        java.lang.Object[] objArray2 = treeSetTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = treeSetTestDriver0.first();
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
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_101322511_1024_0.test007");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        int int2 = treeSetTestDriver0.size();
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(comparator3);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_101322511_1024_0.test008");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        java.lang.Object obj3 = treeSetTestDriver0.getMatch((java.lang.Object) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_101322511_1024_0.test009");
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
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_101322511_1024_0.test010");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        java.lang.Object obj3 = treeSetTestDriver0.getMatch((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass4 = treeSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_101322511_1024_0.test011");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        boolean boolean3 = treeSetTestDriver0.contains((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = treeSetTestDriver0.contains(obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_101322511_1024_0.test012");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        java.lang.Object[] objArray2 = treeSetTestDriver0.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver3 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator4 = treeSetTestDriver3.comparator();
        boolean boolean6 = treeSetTestDriver3.remove((java.lang.Object) (byte) 100);
        boolean boolean7 = treeSetTestDriver0.add((java.lang.Object) treeSetTestDriver3);
        java.lang.Object[] objArray8 = treeSetTestDriver3.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = treeSetTestDriver3.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_101322511_1024_0.test013");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        java.lang.Object[] objArray2 = treeSetTestDriver0.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver3 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator4 = treeSetTestDriver3.comparator();
        boolean boolean6 = treeSetTestDriver3.remove((java.lang.Object) (byte) 100);
        boolean boolean7 = treeSetTestDriver0.add((java.lang.Object) treeSetTestDriver3);
        experiment.util.TreeSetTestDriver treeSetTestDriver8 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator9 = treeSetTestDriver8.comparator();
        java.lang.Object[] objArray10 = treeSetTestDriver8.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver11 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator12 = treeSetTestDriver11.comparator();
        boolean boolean14 = treeSetTestDriver11.remove((java.lang.Object) (byte) 100);
        boolean boolean15 = treeSetTestDriver8.add((java.lang.Object) treeSetTestDriver11);
        boolean boolean16 = treeSetTestDriver0.equals_CUT((java.lang.Object) treeSetTestDriver11);
        experiment.util.TreeSetTestDriver treeSetTestDriver17 = new experiment.util.TreeSetTestDriver();
        int int18 = treeSetTestDriver17.size();
        boolean boolean20 = treeSetTestDriver17.equals_CUT((java.lang.Object) 100);
        java.lang.Class<?> wildcardClass21 = treeSetTestDriver17.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = treeSetTestDriver11.contains((java.lang.Object) wildcardClass21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_101322511_1024_0.test014");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        boolean boolean3 = treeSetTestDriver0.equals_CUT((java.lang.Object) 100);
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = treeSetTestDriver0.contains(obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_101322511_1024_0.test015");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_101322511_1024_0.test016");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        java.lang.Object[] objArray2 = treeSetTestDriver0.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver3 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator4 = treeSetTestDriver3.comparator();
        boolean boolean6 = treeSetTestDriver3.remove((java.lang.Object) (byte) 100);
        boolean boolean7 = treeSetTestDriver0.add((java.lang.Object) treeSetTestDriver3);
        experiment.util.TreeSetTestDriver treeSetTestDriver8 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator9 = treeSetTestDriver8.comparator();
        java.lang.Object[] objArray10 = treeSetTestDriver8.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver11 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator12 = treeSetTestDriver11.comparator();
        boolean boolean14 = treeSetTestDriver11.remove((java.lang.Object) (byte) 100);
        boolean boolean15 = treeSetTestDriver8.add((java.lang.Object) treeSetTestDriver11);
        boolean boolean16 = treeSetTestDriver0.equals_CUT((java.lang.Object) treeSetTestDriver11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = treeSetTestDriver0.add((java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Double");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_101322511_1024_0.test017");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        int int2 = treeSetTestDriver0.size();
        boolean boolean3 = treeSetTestDriver0.isEmpty();
        java.lang.Object obj5 = treeSetTestDriver0.getMatch((java.lang.Object) (short) 10);
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_101322511_1024_0.test018");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        java.lang.Object[] objArray2 = treeSetTestDriver0.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver3 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator4 = treeSetTestDriver3.comparator();
        boolean boolean6 = treeSetTestDriver3.remove((java.lang.Object) (byte) 100);
        boolean boolean7 = treeSetTestDriver0.add((java.lang.Object) treeSetTestDriver3);
        java.lang.Object obj8 = treeSetTestDriver0.last();
        java.lang.Object obj9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = treeSetTestDriver0.add(obj9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_101322511_1024_0.test019");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        java.lang.Object[] objArray2 = treeSetTestDriver0.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver3 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator4 = treeSetTestDriver3.comparator();
        boolean boolean6 = treeSetTestDriver3.remove((java.lang.Object) (byte) 100);
        boolean boolean7 = treeSetTestDriver0.add((java.lang.Object) treeSetTestDriver3);
        experiment.util.TreeSetTestDriver treeSetTestDriver8 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator9 = treeSetTestDriver8.comparator();
        java.lang.Object[] objArray10 = treeSetTestDriver8.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver11 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator12 = treeSetTestDriver11.comparator();
        boolean boolean14 = treeSetTestDriver11.remove((java.lang.Object) (byte) 100);
        boolean boolean15 = treeSetTestDriver8.add((java.lang.Object) treeSetTestDriver11);
        boolean boolean16 = treeSetTestDriver0.equals_CUT((java.lang.Object) treeSetTestDriver11);
        boolean boolean18 = treeSetTestDriver11.remove((java.lang.Object) (byte) -1);
        experiment.util.TreeSetTestDriver treeSetTestDriver19 = new experiment.util.TreeSetTestDriver();
        int int20 = treeSetTestDriver19.size();
        java.lang.Object obj22 = treeSetTestDriver19.getMatch((java.lang.Object) 0.0f);
        treeSetTestDriver19.clear();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = treeSetTestDriver11.contains((java.lang.Object) treeSetTestDriver19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_101322511_1024_0.test020");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        boolean boolean3 = treeSetTestDriver0.equals_CUT((java.lang.Object) 100);
        experiment.util.TreeSetTestDriver treeSetTestDriver4 = new experiment.util.TreeSetTestDriver();
        int int5 = treeSetTestDriver4.size();
        boolean boolean7 = treeSetTestDriver4.equals_CUT((java.lang.Object) 100);
        boolean boolean8 = treeSetTestDriver4.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = treeSetTestDriver0.contains((java.lang.Object) treeSetTestDriver4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_101322511_1024_0.test021");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        int int2 = treeSetTestDriver0.size();
        boolean boolean3 = treeSetTestDriver0.isEmpty();
        experiment.util.TreeSetTestDriver treeSetTestDriver4 = new experiment.util.TreeSetTestDriver();
        treeSetTestDriver4.clear();
        java.lang.Class<?> wildcardClass6 = treeSetTestDriver4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = treeSetTestDriver0.getMatch((java.lang.Object) wildcardClass6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_101322511_1024_0.test022");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        java.lang.Object[] objArray2 = treeSetTestDriver0.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver3 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator4 = treeSetTestDriver3.comparator();
        boolean boolean6 = treeSetTestDriver3.remove((java.lang.Object) (byte) 100);
        boolean boolean7 = treeSetTestDriver0.add((java.lang.Object) treeSetTestDriver3);
        experiment.util.Iterator iterator8 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver9 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator10 = treeSetTestDriver9.comparator();
        java.lang.Object[] objArray11 = treeSetTestDriver9.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver12 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator13 = treeSetTestDriver12.comparator();
        boolean boolean15 = treeSetTestDriver12.remove((java.lang.Object) (byte) 100);
        boolean boolean16 = treeSetTestDriver9.add((java.lang.Object) treeSetTestDriver12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = treeSetTestDriver0.remove((java.lang.Object) treeSetTestDriver12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNull(comparator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_101322511_1024_0.test023");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        java.lang.Object[] objArray2 = treeSetTestDriver0.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver3 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator4 = treeSetTestDriver3.comparator();
        boolean boolean6 = treeSetTestDriver3.remove((java.lang.Object) (byte) 100);
        boolean boolean7 = treeSetTestDriver0.add((java.lang.Object) treeSetTestDriver3);
        experiment.util.Iterator iterator8 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver9 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator10 = treeSetTestDriver9.comparator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = treeSetTestDriver0.contains((java.lang.Object) treeSetTestDriver9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNull(comparator10);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_101322511_1024_0.test024");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        boolean boolean3 = treeSetTestDriver0.equals_CUT((java.lang.Object) 100);
        boolean boolean4 = treeSetTestDriver0.isEmpty();
        int int5 = treeSetTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_101322511_1024_0.test025");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        java.lang.Object[] objArray2 = treeSetTestDriver0.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver3 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator4 = treeSetTestDriver3.comparator();
        boolean boolean6 = treeSetTestDriver3.remove((java.lang.Object) (byte) 100);
        boolean boolean7 = treeSetTestDriver0.add((java.lang.Object) treeSetTestDriver3);
        experiment.util.TreeSetTestDriver treeSetTestDriver8 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator9 = treeSetTestDriver8.comparator();
        java.lang.Object[] objArray10 = treeSetTestDriver8.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver11 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator12 = treeSetTestDriver11.comparator();
        boolean boolean14 = treeSetTestDriver11.remove((java.lang.Object) (byte) 100);
        boolean boolean15 = treeSetTestDriver8.add((java.lang.Object) treeSetTestDriver11);
        boolean boolean16 = treeSetTestDriver0.equals_CUT((java.lang.Object) treeSetTestDriver11);
        java.lang.Object obj17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = treeSetTestDriver0.contains(obj17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_101322511_1024_0.test026");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        java.lang.Object obj3 = treeSetTestDriver0.getMatch((java.lang.Object) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_101322511_1024_0.test027");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        java.lang.Object obj3 = treeSetTestDriver0.getMatch((java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = treeSetTestDriver0.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver5 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator6 = treeSetTestDriver5.comparator();
        java.lang.Object[] objArray7 = treeSetTestDriver5.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver8 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator9 = treeSetTestDriver8.comparator();
        boolean boolean11 = treeSetTestDriver8.remove((java.lang.Object) (byte) 100);
        boolean boolean12 = treeSetTestDriver5.add((java.lang.Object) treeSetTestDriver8);
        experiment.util.TreeSetTestDriver treeSetTestDriver13 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator14 = treeSetTestDriver13.comparator();
        java.lang.Object[] objArray15 = treeSetTestDriver13.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver16 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator17 = treeSetTestDriver16.comparator();
        boolean boolean19 = treeSetTestDriver16.remove((java.lang.Object) (byte) 100);
        boolean boolean20 = treeSetTestDriver13.add((java.lang.Object) treeSetTestDriver16);
        boolean boolean21 = treeSetTestDriver5.equals_CUT((java.lang.Object) treeSetTestDriver16);
        java.lang.Object obj23 = treeSetTestDriver16.getMatch((java.lang.Object) 100.0d);
        experiment.util.Comparator comparator24 = treeSetTestDriver16.comparator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = treeSetTestDriver0.contains((java.lang.Object) treeSetTestDriver16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(comparator14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNull(comparator17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(comparator24);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_101322511_1024_0.test028");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        java.lang.Object[] objArray2 = treeSetTestDriver0.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver3 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator4 = treeSetTestDriver3.comparator();
        boolean boolean6 = treeSetTestDriver3.remove((java.lang.Object) (byte) 100);
        boolean boolean7 = treeSetTestDriver0.add((java.lang.Object) treeSetTestDriver3);
        java.lang.Object[] objArray8 = treeSetTestDriver3.toArray();
        int int9 = treeSetTestDriver3.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = treeSetTestDriver3.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_101322511_1024_0.test029");
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
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_101322511_1024_0.test030");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        java.lang.Object[] objArray2 = treeSetTestDriver0.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver3 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator4 = treeSetTestDriver3.comparator();
        boolean boolean6 = treeSetTestDriver3.remove((java.lang.Object) (byte) 100);
        boolean boolean7 = treeSetTestDriver0.add((java.lang.Object) treeSetTestDriver3);
        experiment.util.Iterator iterator8 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver9 = new experiment.util.TreeSetTestDriver();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = treeSetTestDriver0.getMatch((java.lang.Object) treeSetTestDriver9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_101322511_1024_0.test031");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        boolean boolean3 = treeSetTestDriver0.contains((java.lang.Object) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_101322511_1024_0.test032");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        java.lang.Object[] objArray2 = treeSetTestDriver0.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver3 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator4 = treeSetTestDriver3.comparator();
        boolean boolean6 = treeSetTestDriver3.remove((java.lang.Object) (byte) 100);
        boolean boolean7 = treeSetTestDriver0.add((java.lang.Object) treeSetTestDriver3);
        experiment.util.TreeSetTestDriver treeSetTestDriver8 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator9 = treeSetTestDriver8.comparator();
        boolean boolean11 = treeSetTestDriver8.remove((java.lang.Object) (byte) 100);
        experiment.util.Iterator iterator12 = treeSetTestDriver8.iterator();
        boolean boolean13 = treeSetTestDriver3.add((java.lang.Object) treeSetTestDriver8);
        experiment.util.TreeSetTestDriver treeSetTestDriver14 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator15 = treeSetTestDriver14.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver16 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator17 = treeSetTestDriver16.comparator();
        java.lang.Object[] objArray18 = treeSetTestDriver16.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver19 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator20 = treeSetTestDriver19.comparator();
        boolean boolean22 = treeSetTestDriver19.remove((java.lang.Object) (byte) 100);
        boolean boolean23 = treeSetTestDriver16.add((java.lang.Object) treeSetTestDriver19);
        java.lang.Object obj24 = treeSetTestDriver16.last();
        boolean boolean25 = treeSetTestDriver16.isEmpty();
        boolean boolean26 = treeSetTestDriver14.remove((java.lang.Object) treeSetTestDriver16);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = treeSetTestDriver3.add((java.lang.Object) boolean26);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Boolean");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(comparator15);
        org.junit.Assert.assertNull(comparator17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNull(comparator20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

}
