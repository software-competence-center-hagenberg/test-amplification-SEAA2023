package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_TreeSetTest_101322511_16_s {

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

}
