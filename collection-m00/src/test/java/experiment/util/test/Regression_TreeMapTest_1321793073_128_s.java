package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_TreeMapTest_1321793073_128_s {

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
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test001");
        experiment.util.Comparator comparator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.TreeMapTestDriver treeMapTestDriver1 = new experiment.util.TreeMapTestDriver(comparator0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test002");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test003");
        experiment.util.Map map0 = null;
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.TreeMapTestDriver treeMapTestDriver1 = new experiment.util.TreeMapTestDriver(map0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test004");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = comparator2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test005");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        java.lang.Object obj6 = treeMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = treeMapTestDriver0.put(obj7, obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test006");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        java.lang.Object obj5 = treeMapTestDriver0.remove((java.lang.Object) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = obj5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test007");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        java.lang.Object obj5 = treeMapTestDriver0.remove((java.lang.Object) (short) 1);
        experiment.util.TreeMapTestDriver treeMapTestDriver6 = new experiment.util.TreeMapTestDriver();
        int int7 = treeMapTestDriver6.size();
        experiment.util.Comparator comparator8 = treeMapTestDriver6.comparator();
        experiment.util.Set set9 = treeMapTestDriver6.keySet();
        java.lang.Object obj11 = treeMapTestDriver6.remove((java.lang.Object) 100);
        experiment.util.Collection collection12 = treeMapTestDriver6.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = treeMapTestDriver0.remove((java.lang.Object) collection12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.ArrayList cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(comparator8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test008");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        java.lang.Object obj6 = treeMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = obj6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test009");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver3 = new experiment.util.TreeMapTestDriver();
        int int4 = treeMapTestDriver3.size();
        experiment.util.Comparator comparator5 = treeMapTestDriver3.comparator();
        experiment.util.Set set6 = treeMapTestDriver3.keySet();
        java.lang.Object obj8 = treeMapTestDriver3.remove((java.lang.Object) (short) 1);
        treeMapTestDriver3.clear();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(comparator5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test010");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        java.lang.Object obj6 = treeMapTestDriver0.remove((java.lang.Object) (short) 100);
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        int int8 = treeMapTestDriver7.size();
        experiment.util.Comparator comparator9 = treeMapTestDriver7.comparator();
        experiment.util.Set set10 = treeMapTestDriver7.keySet();
        java.lang.Object obj13 = treeMapTestDriver7.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        treeMapTestDriver7.clear();
        boolean boolean16 = treeMapTestDriver7.containsKey((java.lang.Object) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test011");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        int int3 = treeMapTestDriver0.size();
        java.lang.Object obj5 = treeMapTestDriver0.get((java.lang.Object) 0.0d);
        experiment.util.Set set6 = treeMapTestDriver0.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        int int8 = treeMapTestDriver7.size();
        experiment.util.Comparator comparator9 = treeMapTestDriver7.comparator();
        experiment.util.Set set10 = treeMapTestDriver7.keySet();
        int int11 = treeMapTestDriver7.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver12 = new experiment.util.TreeMapTestDriver();
        int int13 = treeMapTestDriver12.size();
        experiment.util.Comparator comparator14 = treeMapTestDriver12.comparator();
        experiment.util.Set set15 = treeMapTestDriver12.keySet();
        java.lang.Object obj18 = treeMapTestDriver12.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        java.lang.Object obj19 = treeMapTestDriver7.get((java.lang.Object) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = treeMapTestDriver0.remove(obj19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(comparator14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test012");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        java.lang.Object obj6 = treeMapTestDriver0.remove((java.lang.Object) (short) 100);
        experiment.util.Comparator comparator7 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver8 = new experiment.util.TreeMapTestDriver();
        int int9 = treeMapTestDriver8.size();
        experiment.util.Comparator comparator10 = treeMapTestDriver8.comparator();
        experiment.util.Set set11 = treeMapTestDriver8.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver12 = new experiment.util.TreeMapTestDriver();
        int int13 = treeMapTestDriver12.size();
        experiment.util.Comparator comparator14 = treeMapTestDriver12.comparator();
        int int15 = treeMapTestDriver12.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = treeMapTestDriver0.put((java.lang.Object) treeMapTestDriver8, (java.lang.Object) int15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(comparator7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(comparator14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test013");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        int int4 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver5 = new experiment.util.TreeMapTestDriver();
        int int6 = treeMapTestDriver5.size();
        experiment.util.Comparator comparator7 = treeMapTestDriver5.comparator();
        experiment.util.Set set8 = treeMapTestDriver5.keySet();
        java.lang.Object obj11 = treeMapTestDriver5.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        java.lang.Object obj12 = treeMapTestDriver0.get((java.lang.Object) 0.0f);
        experiment.util.TreeMapTestDriver treeMapTestDriver13 = new experiment.util.TreeMapTestDriver();
        int int14 = treeMapTestDriver13.size();
        experiment.util.Comparator comparator15 = treeMapTestDriver13.comparator();
        experiment.util.Set set16 = treeMapTestDriver13.keySet();
        java.lang.Object obj19 = treeMapTestDriver13.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        boolean boolean20 = treeMapTestDriver13.isEmpty();
        experiment.util.Collection collection21 = treeMapTestDriver13.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = treeMapTestDriver0.remove((java.lang.Object) collection21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.ArrayList cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(comparator7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(comparator15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(collection21);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test014");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        java.lang.Object obj5 = treeMapTestDriver0.remove((java.lang.Object) (short) 1);
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = treeMapTestDriver0.get(obj7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test015");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver6 = new experiment.util.TreeMapTestDriver();
        int int7 = treeMapTestDriver6.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        int int10 = treeMapTestDriver9.size();
        experiment.util.Comparator comparator11 = treeMapTestDriver9.comparator();
        experiment.util.Set set12 = treeMapTestDriver9.keySet();
        java.lang.Object obj14 = treeMapTestDriver9.remove((java.lang.Object) (short) 1);
        treeMapTestDriver9.clear();
        java.lang.Object obj16 = treeMapTestDriver6.put((java.lang.Object) 1.0d, (java.lang.Object) treeMapTestDriver9);
        experiment.util.Collection collection17 = treeMapTestDriver6.values();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = treeMapTestDriver0.containsKey((java.lang.Object) collection17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.ArrayList cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(collection17);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test016");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver4 = new experiment.util.TreeMapTestDriver();
        int int5 = treeMapTestDriver4.size();
        experiment.util.Comparator comparator6 = treeMapTestDriver4.comparator();
        experiment.util.Set set7 = treeMapTestDriver4.keySet();
        java.lang.Object obj10 = treeMapTestDriver4.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        treeMapTestDriver4.clear();
        java.lang.Object obj12 = treeMapTestDriver0.put((java.lang.Object) (short) 1, (java.lang.Object) treeMapTestDriver4);
        experiment.util.Comparator comparator13 = treeMapTestDriver0.comparator();
        experiment.util.Set set14 = treeMapTestDriver0.entrySet();
        java.lang.Class<?> wildcardClass15 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(comparator13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test017");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver3 = new experiment.util.TreeMapTestDriver();
        int int4 = treeMapTestDriver3.size();
        experiment.util.Comparator comparator5 = treeMapTestDriver3.comparator();
        experiment.util.Set set6 = treeMapTestDriver3.keySet();
        java.lang.Object obj8 = treeMapTestDriver3.remove((java.lang.Object) (short) 1);
        treeMapTestDriver3.clear();
        java.lang.Object obj10 = treeMapTestDriver0.put((java.lang.Object) 1.0d, (java.lang.Object) treeMapTestDriver3);
        experiment.util.TreeMapTestDriver treeMapTestDriver11 = new experiment.util.TreeMapTestDriver();
        int int12 = treeMapTestDriver11.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver14 = new experiment.util.TreeMapTestDriver();
        int int15 = treeMapTestDriver14.size();
        experiment.util.Comparator comparator16 = treeMapTestDriver14.comparator();
        experiment.util.Set set17 = treeMapTestDriver14.keySet();
        java.lang.Object obj19 = treeMapTestDriver14.remove((java.lang.Object) (short) 1);
        treeMapTestDriver14.clear();
        java.lang.Object obj21 = treeMapTestDriver11.put((java.lang.Object) 1.0d, (java.lang.Object) treeMapTestDriver14);
        experiment.util.Collection collection22 = treeMapTestDriver11.values();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = treeMapTestDriver3.containsKey((java.lang.Object) collection22);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.ArrayList cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(comparator5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(comparator16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(collection22);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test018");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        java.lang.Object obj5 = treeMapTestDriver0.remove((java.lang.Object) (short) 1);
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection7 = treeMapTestDriver0.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver8 = new experiment.util.TreeMapTestDriver();
        int int9 = treeMapTestDriver8.size();
        experiment.util.Comparator comparator10 = treeMapTestDriver8.comparator();
        int int11 = treeMapTestDriver8.size();
        java.lang.Object obj13 = treeMapTestDriver8.remove((java.lang.Object) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = treeMapTestDriver0.remove(obj13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test019");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        int int8 = treeMapTestDriver7.size();
        experiment.util.Comparator comparator9 = treeMapTestDriver7.comparator();
        experiment.util.Set set10 = treeMapTestDriver7.keySet();
        experiment.util.Comparator comparator11 = treeMapTestDriver7.comparator();
        java.lang.Object obj13 = treeMapTestDriver7.remove((java.lang.Object) (short) 100);
        experiment.util.Comparator comparator14 = treeMapTestDriver7.comparator();
        experiment.util.Set set15 = treeMapTestDriver7.keySet();
        java.lang.Object obj16 = treeMapTestDriver0.put((java.lang.Object) "hi!", (java.lang.Object) treeMapTestDriver7);
        experiment.util.TreeMapTestDriver treeMapTestDriver17 = new experiment.util.TreeMapTestDriver();
        int int18 = treeMapTestDriver17.size();
        experiment.util.Comparator comparator19 = treeMapTestDriver17.comparator();
        experiment.util.Set set20 = treeMapTestDriver17.keySet();
        java.lang.Object obj23 = treeMapTestDriver17.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        treeMapTestDriver17.clear();
        boolean boolean26 = treeMapTestDriver17.containsKey((java.lang.Object) (short) 0);
        experiment.util.Collection collection27 = treeMapTestDriver17.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = treeMapTestDriver0.remove((java.lang.Object) collection27);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.ArrayList cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(comparator14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(comparator19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(collection27);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test020");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        java.lang.Object obj6 = treeMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        boolean boolean7 = treeMapTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = treeMapTestDriver0.get((java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to java.lang.Long");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test021");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver4 = new experiment.util.TreeMapTestDriver();
        int int5 = treeMapTestDriver4.size();
        experiment.util.Comparator comparator6 = treeMapTestDriver4.comparator();
        experiment.util.Set set7 = treeMapTestDriver4.keySet();
        java.lang.Object obj10 = treeMapTestDriver4.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        treeMapTestDriver4.clear();
        java.lang.Object obj12 = treeMapTestDriver0.put((java.lang.Object) (short) 1, (java.lang.Object) treeMapTestDriver4);
        int int13 = treeMapTestDriver0.size();
        java.lang.Object obj14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = treeMapTestDriver0.get(obj14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test022");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        java.lang.Object obj6 = treeMapTestDriver0.remove((java.lang.Object) (short) 100);
        experiment.util.Comparator comparator7 = treeMapTestDriver0.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = comparator7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(comparator7);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test023");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver3 = new experiment.util.TreeMapTestDriver();
        int int4 = treeMapTestDriver3.size();
        experiment.util.Comparator comparator5 = treeMapTestDriver3.comparator();
        experiment.util.Set set6 = treeMapTestDriver3.keySet();
        java.lang.Object obj8 = treeMapTestDriver3.remove((java.lang.Object) (short) 1);
        treeMapTestDriver3.clear();
        java.lang.Object obj10 = treeMapTestDriver0.put((java.lang.Object) 1.0d, (java.lang.Object) treeMapTestDriver3);
        experiment.util.Set set11 = treeMapTestDriver0.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver12 = new experiment.util.TreeMapTestDriver();
        int int13 = treeMapTestDriver12.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = treeMapTestDriver0.get((java.lang.Object) int13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to java.lang.Integer");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(comparator5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test024");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        java.lang.Object obj5 = treeMapTestDriver0.remove((java.lang.Object) (short) 1);
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        int int8 = treeMapTestDriver7.size();
        experiment.util.Comparator comparator9 = treeMapTestDriver7.comparator();
        experiment.util.Set set10 = treeMapTestDriver7.keySet();
        experiment.util.Comparator comparator11 = treeMapTestDriver7.comparator();
        experiment.util.Collection collection12 = treeMapTestDriver7.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = treeMapTestDriver0.get((java.lang.Object) collection12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.ArrayList cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test025");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        int int3 = treeMapTestDriver0.size();
        java.lang.Object obj5 = treeMapTestDriver0.remove((java.lang.Object) (-1.0f));
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        int int8 = treeMapTestDriver7.size();
        experiment.util.Comparator comparator9 = treeMapTestDriver7.comparator();
        experiment.util.Set set10 = treeMapTestDriver7.keySet();
        java.lang.Object obj13 = treeMapTestDriver7.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        treeMapTestDriver7.clear();
        boolean boolean16 = treeMapTestDriver7.containsKey((java.lang.Object) (short) 0);
        experiment.util.Collection collection17 = treeMapTestDriver7.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(collection17);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test026");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver3 = new experiment.util.TreeMapTestDriver();
        int int4 = treeMapTestDriver3.size();
        experiment.util.Comparator comparator5 = treeMapTestDriver3.comparator();
        experiment.util.Set set6 = treeMapTestDriver3.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(comparator5);
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test027");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        java.lang.Object obj5 = treeMapTestDriver0.remove((java.lang.Object) 100);
        java.lang.Class<?> wildcardClass6 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test028");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        int int3 = treeMapTestDriver0.size();
        java.lang.Object obj5 = treeMapTestDriver0.remove((java.lang.Object) (-1.0f));
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass7 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test029");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        java.lang.Object obj5 = treeMapTestDriver0.remove((java.lang.Object) (short) 1);
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) (short) 100);
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = treeMapTestDriver0.remove(obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test030");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        int int3 = treeMapTestDriver0.size();
        java.lang.Object obj5 = treeMapTestDriver0.get((java.lang.Object) 0.0d);
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        int int7 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver8 = new experiment.util.TreeMapTestDriver();
        int int9 = treeMapTestDriver8.size();
        experiment.util.Comparator comparator10 = treeMapTestDriver8.comparator();
        int int11 = treeMapTestDriver8.size();
        java.lang.Object obj13 = treeMapTestDriver8.get((java.lang.Object) 0.0d);
        experiment.util.Collection collection14 = treeMapTestDriver8.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = treeMapTestDriver0.get((java.lang.Object) collection14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.ArrayList cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test031");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        java.lang.Object obj6 = treeMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        treeMapTestDriver0.clear();
        treeMapTestDriver0.clear();
        experiment.util.Collection collection9 = treeMapTestDriver0.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver10 = new experiment.util.TreeMapTestDriver();
        int int11 = treeMapTestDriver10.size();
        experiment.util.Comparator comparator12 = treeMapTestDriver10.comparator();
        experiment.util.Set set13 = treeMapTestDriver10.keySet();
        experiment.util.Comparator comparator14 = treeMapTestDriver10.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver15 = new experiment.util.TreeMapTestDriver();
        int int16 = treeMapTestDriver15.size();
        experiment.util.Comparator comparator17 = treeMapTestDriver15.comparator();
        experiment.util.Set set18 = treeMapTestDriver15.keySet();
        java.lang.Object obj21 = treeMapTestDriver15.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        treeMapTestDriver15.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver23 = new experiment.util.TreeMapTestDriver();
        int int24 = treeMapTestDriver23.size();
        experiment.util.Comparator comparator25 = treeMapTestDriver23.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver27 = new experiment.util.TreeMapTestDriver();
        int int28 = treeMapTestDriver27.size();
        experiment.util.Comparator comparator29 = treeMapTestDriver27.comparator();
        experiment.util.Set set30 = treeMapTestDriver27.keySet();
        java.lang.Object obj33 = treeMapTestDriver27.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        treeMapTestDriver27.clear();
        java.lang.Object obj35 = treeMapTestDriver23.put((java.lang.Object) (short) 1, (java.lang.Object) treeMapTestDriver27);
        boolean boolean36 = treeMapTestDriver15.containsKey((java.lang.Object) (short) 1);
        boolean boolean37 = treeMapTestDriver15.isEmpty();
        experiment.util.Comparator comparator38 = treeMapTestDriver15.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj39 = treeMapTestDriver0.put((java.lang.Object) treeMapTestDriver10, (java.lang.Object) comparator38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(comparator14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(comparator17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(comparator25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(comparator29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(comparator38);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test032");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        java.lang.Object obj5 = treeMapTestDriver0.remove((java.lang.Object) 100);
        java.lang.Object obj7 = treeMapTestDriver0.get((java.lang.Object) 100);
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        int int10 = treeMapTestDriver9.size();
        experiment.util.Comparator comparator11 = treeMapTestDriver9.comparator();
        experiment.util.Set set12 = treeMapTestDriver9.keySet();
        java.lang.Object obj14 = treeMapTestDriver9.remove((java.lang.Object) (short) 1);
        boolean boolean15 = treeMapTestDriver9.isEmpty();
        experiment.util.Collection collection16 = treeMapTestDriver9.values();
        experiment.util.Collection collection17 = treeMapTestDriver9.values();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = treeMapTestDriver0.containsKey((java.lang.Object) collection17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.ArrayList cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(collection17);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test033");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        java.lang.Object obj6 = treeMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        boolean boolean7 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver8 = new experiment.util.TreeMapTestDriver();
        int int9 = treeMapTestDriver8.size();
        experiment.util.Comparator comparator10 = treeMapTestDriver8.comparator();
        experiment.util.Set set11 = treeMapTestDriver8.keySet();
        java.lang.Object obj14 = treeMapTestDriver8.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        treeMapTestDriver8.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test034");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        int int4 = treeMapTestDriver0.size();
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        java.lang.Class<?> wildcardClass6 = collection5.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test035");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        int int3 = treeMapTestDriver0.size();
        java.lang.Object obj5 = treeMapTestDriver0.get((java.lang.Object) 0.0d);
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        int int7 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver8 = new experiment.util.TreeMapTestDriver();
        int int9 = treeMapTestDriver8.size();
        experiment.util.Comparator comparator10 = treeMapTestDriver8.comparator();
        int int11 = treeMapTestDriver8.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver12 = new experiment.util.TreeMapTestDriver();
        int int13 = treeMapTestDriver12.size();
        experiment.util.Comparator comparator14 = treeMapTestDriver12.comparator();
        experiment.util.Set set15 = treeMapTestDriver12.keySet();
        treeMapTestDriver12.clear();
        java.lang.Class<?> wildcardClass17 = treeMapTestDriver12.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = treeMapTestDriver0.put((java.lang.Object) treeMapTestDriver8, (java.lang.Object) wildcardClass17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(comparator14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test036");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        java.lang.Object obj5 = treeMapTestDriver0.remove((java.lang.Object) (short) 1);
        treeMapTestDriver0.clear();
        int int7 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver8 = new experiment.util.TreeMapTestDriver();
        int int9 = treeMapTestDriver8.size();
        experiment.util.Comparator comparator10 = treeMapTestDriver8.comparator();
        int int11 = treeMapTestDriver8.size();
        java.lang.Object obj13 = treeMapTestDriver8.get((java.lang.Object) 0.0d);
        experiment.util.Collection collection14 = treeMapTestDriver8.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver15 = new experiment.util.TreeMapTestDriver();
        int int16 = treeMapTestDriver15.size();
        experiment.util.Comparator comparator17 = treeMapTestDriver15.comparator();
        experiment.util.Set set18 = treeMapTestDriver15.keySet();
        experiment.util.Comparator comparator19 = treeMapTestDriver15.comparator();
        experiment.util.Collection collection20 = treeMapTestDriver15.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver22 = new experiment.util.TreeMapTestDriver();
        int int23 = treeMapTestDriver22.size();
        experiment.util.Comparator comparator24 = treeMapTestDriver22.comparator();
        experiment.util.Set set25 = treeMapTestDriver22.keySet();
        experiment.util.Comparator comparator26 = treeMapTestDriver22.comparator();
        java.lang.Object obj28 = treeMapTestDriver22.remove((java.lang.Object) (short) 100);
        experiment.util.Comparator comparator29 = treeMapTestDriver22.comparator();
        experiment.util.Set set30 = treeMapTestDriver22.keySet();
        java.lang.Object obj31 = treeMapTestDriver15.put((java.lang.Object) "hi!", (java.lang.Object) treeMapTestDriver22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = treeMapTestDriver0.put((java.lang.Object) collection14, (java.lang.Object) treeMapTestDriver15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.ArrayList cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(comparator17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(comparator19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(comparator24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNull(comparator26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(comparator29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj31);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test037");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        treeMapTestDriver0.clear();
        int int3 = treeMapTestDriver0.size();
        experiment.util.Collection collection4 = treeMapTestDriver0.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver5 = new experiment.util.TreeMapTestDriver();
        int int6 = treeMapTestDriver5.size();
        experiment.util.Comparator comparator7 = treeMapTestDriver5.comparator();
        experiment.util.Set set8 = treeMapTestDriver5.keySet();
        experiment.util.Comparator comparator9 = treeMapTestDriver5.comparator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(comparator7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(comparator9);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test038");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        java.lang.Object obj5 = treeMapTestDriver0.remove((java.lang.Object) (short) 1);
        treeMapTestDriver0.clear();
        int int7 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver8 = new experiment.util.TreeMapTestDriver();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test039");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        int int3 = treeMapTestDriver0.size();
        java.lang.Object obj5 = treeMapTestDriver0.get((java.lang.Object) 0.0d);
        experiment.util.Set set6 = treeMapTestDriver0.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        int int8 = treeMapTestDriver7.size();
        experiment.util.Comparator comparator9 = treeMapTestDriver7.comparator();
        experiment.util.Set set10 = treeMapTestDriver7.keySet();
        experiment.util.Comparator comparator11 = treeMapTestDriver7.comparator();
        experiment.util.Collection collection12 = treeMapTestDriver7.values();
        java.lang.Class<?> wildcardClass13 = treeMapTestDriver7.getClass();
        experiment.util.TreeMapTestDriver treeMapTestDriver14 = new experiment.util.TreeMapTestDriver();
        int int15 = treeMapTestDriver14.size();
        experiment.util.Comparator comparator16 = treeMapTestDriver14.comparator();
        experiment.util.Set set17 = treeMapTestDriver14.keySet();
        java.lang.Object obj19 = treeMapTestDriver14.remove((java.lang.Object) 100);
        java.lang.Object obj21 = treeMapTestDriver14.get((java.lang.Object) 100);
        treeMapTestDriver14.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = treeMapTestDriver0.put((java.lang.Object) wildcardClass13, (java.lang.Object) treeMapTestDriver14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(comparator16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test040");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        java.lang.Object obj6 = treeMapTestDriver0.remove((java.lang.Object) (short) 100);
        experiment.util.Comparator comparator7 = treeMapTestDriver0.comparator();
        experiment.util.Set set8 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        int int10 = treeMapTestDriver9.size();
        java.lang.Class<?> wildcardClass11 = treeMapTestDriver9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = treeMapTestDriver0.containsKey((java.lang.Object) wildcardClass11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(comparator7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test041");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        java.lang.Object obj6 = treeMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        treeMapTestDriver0.clear();
        boolean boolean9 = treeMapTestDriver0.containsKey((java.lang.Object) (short) 0);
        experiment.util.Collection collection10 = treeMapTestDriver0.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver11 = new experiment.util.TreeMapTestDriver();
        int int12 = treeMapTestDriver11.size();
        experiment.util.Comparator comparator13 = treeMapTestDriver11.comparator();
        experiment.util.Set set14 = treeMapTestDriver11.keySet();
        experiment.util.Comparator comparator15 = treeMapTestDriver11.comparator();
        java.lang.Object obj17 = treeMapTestDriver11.remove((java.lang.Object) (short) 100);
        experiment.util.Comparator comparator18 = treeMapTestDriver11.comparator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = treeMapTestDriver0.containsKey((java.lang.Object) comparator18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(comparator13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(comparator15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(comparator18);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test042");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver3 = new experiment.util.TreeMapTestDriver();
        int int4 = treeMapTestDriver3.size();
        experiment.util.Comparator comparator5 = treeMapTestDriver3.comparator();
        experiment.util.Set set6 = treeMapTestDriver3.keySet();
        java.lang.Object obj8 = treeMapTestDriver3.remove((java.lang.Object) (short) 1);
        treeMapTestDriver3.clear();
        java.lang.Object obj10 = treeMapTestDriver0.put((java.lang.Object) 1.0d, (java.lang.Object) treeMapTestDriver3);
        experiment.util.Collection collection11 = treeMapTestDriver0.values();
        experiment.util.Set set12 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver13 = new experiment.util.TreeMapTestDriver();
        int int14 = treeMapTestDriver13.size();
        experiment.util.Comparator comparator15 = treeMapTestDriver13.comparator();
        experiment.util.Set set16 = treeMapTestDriver13.keySet();
        experiment.util.Comparator comparator17 = treeMapTestDriver13.comparator();
        experiment.util.Collection collection18 = treeMapTestDriver13.values();
        experiment.util.Set set19 = treeMapTestDriver13.keySet();
        boolean boolean20 = treeMapTestDriver13.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = treeMapTestDriver0.get((java.lang.Object) boolean20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to java.lang.Boolean");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(comparator5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(comparator15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(comparator17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test043");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        int int3 = treeMapTestDriver0.size();
        java.lang.Object obj5 = treeMapTestDriver0.get((java.lang.Object) 0.0d);
        experiment.util.Set set6 = treeMapTestDriver0.entrySet();
        int int7 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver8 = new experiment.util.TreeMapTestDriver();
        int int9 = treeMapTestDriver8.size();
        experiment.util.Comparator comparator10 = treeMapTestDriver8.comparator();
        experiment.util.Set set11 = treeMapTestDriver8.keySet();
        java.lang.Object obj14 = treeMapTestDriver8.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        treeMapTestDriver8.clear();
        boolean boolean16 = treeMapTestDriver8.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test044");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver3 = new experiment.util.TreeMapTestDriver();
        int int4 = treeMapTestDriver3.size();
        experiment.util.Comparator comparator5 = treeMapTestDriver3.comparator();
        experiment.util.Set set6 = treeMapTestDriver3.keySet();
        java.lang.Object obj8 = treeMapTestDriver3.remove((java.lang.Object) (short) 1);
        treeMapTestDriver3.clear();
        java.lang.Object obj10 = treeMapTestDriver0.put((java.lang.Object) 1.0d, (java.lang.Object) treeMapTestDriver3);
        experiment.util.Collection collection11 = treeMapTestDriver0.values();
        experiment.util.Set set12 = treeMapTestDriver0.keySet();
        experiment.util.Set set13 = treeMapTestDriver0.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver14 = new experiment.util.TreeMapTestDriver();
        int int15 = treeMapTestDriver14.size();
        experiment.util.Comparator comparator16 = treeMapTestDriver14.comparator();
        experiment.util.Set set17 = treeMapTestDriver14.keySet();
        int int18 = treeMapTestDriver14.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver19 = new experiment.util.TreeMapTestDriver();
        int int20 = treeMapTestDriver19.size();
        experiment.util.Comparator comparator21 = treeMapTestDriver19.comparator();
        experiment.util.Set set22 = treeMapTestDriver19.keySet();
        java.lang.Object obj25 = treeMapTestDriver19.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        java.lang.Object obj26 = treeMapTestDriver14.get((java.lang.Object) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = treeMapTestDriver0.get((java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to java.lang.Float");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(comparator5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(comparator16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(comparator21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test045");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver2 = new experiment.util.TreeMapTestDriver();
        int int3 = treeMapTestDriver2.size();
        experiment.util.Comparator comparator4 = treeMapTestDriver2.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver6 = new experiment.util.TreeMapTestDriver();
        int int7 = treeMapTestDriver6.size();
        experiment.util.Comparator comparator8 = treeMapTestDriver6.comparator();
        experiment.util.Set set9 = treeMapTestDriver6.keySet();
        java.lang.Object obj12 = treeMapTestDriver6.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        treeMapTestDriver6.clear();
        java.lang.Object obj14 = treeMapTestDriver2.put((java.lang.Object) (short) 1, (java.lang.Object) treeMapTestDriver6);
        int int15 = treeMapTestDriver6.size();
        experiment.util.Set set16 = treeMapTestDriver6.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(comparator8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(set16);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test046");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        treeMapTestDriver0.clear();
        int int3 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver4 = new experiment.util.TreeMapTestDriver();
        int int5 = treeMapTestDriver4.size();
        experiment.util.Comparator comparator6 = treeMapTestDriver4.comparator();
        int int7 = treeMapTestDriver4.size();
        java.lang.Object obj9 = treeMapTestDriver4.get((java.lang.Object) 0.0d);
        experiment.util.Collection collection10 = treeMapTestDriver4.values();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test047");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        int int8 = treeMapTestDriver7.size();
        experiment.util.Comparator comparator9 = treeMapTestDriver7.comparator();
        experiment.util.Set set10 = treeMapTestDriver7.keySet();
        experiment.util.Comparator comparator11 = treeMapTestDriver7.comparator();
        java.lang.Object obj13 = treeMapTestDriver7.remove((java.lang.Object) (short) 100);
        experiment.util.Comparator comparator14 = treeMapTestDriver7.comparator();
        experiment.util.Set set15 = treeMapTestDriver7.keySet();
        java.lang.Object obj16 = treeMapTestDriver0.put((java.lang.Object) "hi!", (java.lang.Object) treeMapTestDriver7);
        java.lang.Object obj17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = treeMapTestDriver7.remove(obj17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(comparator14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test048");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        java.lang.Object obj5 = treeMapTestDriver0.remove((java.lang.Object) (short) 1);
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        int int8 = treeMapTestDriver7.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver10 = new experiment.util.TreeMapTestDriver();
        int int11 = treeMapTestDriver10.size();
        experiment.util.Comparator comparator12 = treeMapTestDriver10.comparator();
        experiment.util.Set set13 = treeMapTestDriver10.keySet();
        java.lang.Object obj15 = treeMapTestDriver10.remove((java.lang.Object) (short) 1);
        treeMapTestDriver10.clear();
        java.lang.Object obj17 = treeMapTestDriver7.put((java.lang.Object) 1.0d, (java.lang.Object) treeMapTestDriver10);
        experiment.util.Collection collection18 = treeMapTestDriver7.values();
        experiment.util.Set set19 = treeMapTestDriver7.keySet();
        experiment.util.Set set20 = treeMapTestDriver7.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(set20);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test049");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver3 = new experiment.util.TreeMapTestDriver();
        int int4 = treeMapTestDriver3.size();
        experiment.util.Comparator comparator5 = treeMapTestDriver3.comparator();
        experiment.util.Set set6 = treeMapTestDriver3.keySet();
        java.lang.Object obj8 = treeMapTestDriver3.remove((java.lang.Object) (short) 1);
        treeMapTestDriver3.clear();
        java.lang.Object obj10 = treeMapTestDriver0.put((java.lang.Object) 1.0d, (java.lang.Object) treeMapTestDriver3);
        experiment.util.Set set11 = treeMapTestDriver3.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver12 = new experiment.util.TreeMapTestDriver();
        int int13 = treeMapTestDriver12.size();
        experiment.util.Comparator comparator14 = treeMapTestDriver12.comparator();
        experiment.util.Set set15 = treeMapTestDriver12.keySet();
        java.lang.Object obj18 = treeMapTestDriver12.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        boolean boolean19 = treeMapTestDriver12.isEmpty();
        experiment.util.Comparator comparator20 = treeMapTestDriver12.comparator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = treeMapTestDriver3.containsKey((java.lang.Object) comparator20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(comparator5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(comparator14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(comparator20);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test050");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        java.lang.Object obj5 = treeMapTestDriver0.remove((java.lang.Object) 100);
        java.lang.Object obj7 = treeMapTestDriver0.get((java.lang.Object) 100);
        treeMapTestDriver0.clear();
        int int9 = treeMapTestDriver0.size();
        java.lang.Class<?> wildcardClass10 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test051");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        java.lang.Object obj6 = treeMapTestDriver0.remove((java.lang.Object) (short) 100);
        experiment.util.Comparator comparator7 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver8 = new experiment.util.TreeMapTestDriver();
        int int9 = treeMapTestDriver8.size();
        experiment.util.Comparator comparator10 = treeMapTestDriver8.comparator();
        int int11 = treeMapTestDriver8.size();
        java.lang.Object obj13 = treeMapTestDriver8.get((java.lang.Object) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(comparator7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test052");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        java.lang.Object obj5 = treeMapTestDriver0.remove((java.lang.Object) (short) 1);
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) (short) 100);
        experiment.util.TreeMapTestDriver treeMapTestDriver8 = new experiment.util.TreeMapTestDriver();
        int int9 = treeMapTestDriver8.size();
        experiment.util.Comparator comparator10 = treeMapTestDriver8.comparator();
        experiment.util.Set set11 = treeMapTestDriver8.keySet();
        int int12 = treeMapTestDriver8.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver13 = new experiment.util.TreeMapTestDriver();
        int int14 = treeMapTestDriver13.size();
        experiment.util.Comparator comparator15 = treeMapTestDriver13.comparator();
        experiment.util.Set set16 = treeMapTestDriver13.keySet();
        java.lang.Object obj19 = treeMapTestDriver13.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        java.lang.Object obj20 = treeMapTestDriver8.get((java.lang.Object) 0.0f);
        java.lang.Object obj22 = treeMapTestDriver8.remove((java.lang.Object) '#');
        experiment.util.TreeMapTestDriver treeMapTestDriver24 = new experiment.util.TreeMapTestDriver();
        int int25 = treeMapTestDriver24.size();
        experiment.util.Comparator comparator26 = treeMapTestDriver24.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver28 = new experiment.util.TreeMapTestDriver();
        int int29 = treeMapTestDriver28.size();
        experiment.util.Comparator comparator30 = treeMapTestDriver28.comparator();
        experiment.util.Set set31 = treeMapTestDriver28.keySet();
        java.lang.Object obj34 = treeMapTestDriver28.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        treeMapTestDriver28.clear();
        java.lang.Object obj36 = treeMapTestDriver24.put((java.lang.Object) (short) 1, (java.lang.Object) treeMapTestDriver28);
        int int37 = treeMapTestDriver28.size();
        experiment.util.Set set38 = treeMapTestDriver28.keySet();
        java.lang.Object obj39 = treeMapTestDriver8.put((java.lang.Object) 0L, (java.lang.Object) set38);
        java.lang.Object obj40 = treeMapTestDriver0.remove((java.lang.Object) 0L);
        java.lang.Object obj42 = treeMapTestDriver0.remove((java.lang.Object) (byte) 0);
        experiment.util.TreeMapTestDriver treeMapTestDriver43 = new experiment.util.TreeMapTestDriver();
        int int44 = treeMapTestDriver43.size();
        experiment.util.Comparator comparator45 = treeMapTestDriver43.comparator();
        experiment.util.Set set46 = treeMapTestDriver43.keySet();
        java.lang.Object obj49 = treeMapTestDriver43.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        treeMapTestDriver43.clear();
        treeMapTestDriver43.clear();
        experiment.util.Collection collection52 = treeMapTestDriver43.values();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean53 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver43);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(comparator15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(comparator26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(comparator30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNull(comparator45);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(collection52);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test053");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver4 = new experiment.util.TreeMapTestDriver();
        int int5 = treeMapTestDriver4.size();
        experiment.util.Comparator comparator6 = treeMapTestDriver4.comparator();
        experiment.util.Set set7 = treeMapTestDriver4.keySet();
        java.lang.Object obj10 = treeMapTestDriver4.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        treeMapTestDriver4.clear();
        java.lang.Object obj12 = treeMapTestDriver0.put((java.lang.Object) (short) 1, (java.lang.Object) treeMapTestDriver4);
        int int13 = treeMapTestDriver4.size();
        experiment.util.Set set14 = treeMapTestDriver4.keySet();
        experiment.util.Comparator comparator15 = treeMapTestDriver4.comparator();
        java.lang.Class<?> wildcardClass16 = treeMapTestDriver4.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(comparator15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test054");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver3 = new experiment.util.TreeMapTestDriver();
        int int4 = treeMapTestDriver3.size();
        experiment.util.Comparator comparator5 = treeMapTestDriver3.comparator();
        experiment.util.Set set6 = treeMapTestDriver3.keySet();
        java.lang.Object obj8 = treeMapTestDriver3.remove((java.lang.Object) (short) 1);
        treeMapTestDriver3.clear();
        java.lang.Object obj10 = treeMapTestDriver0.put((java.lang.Object) 1.0d, (java.lang.Object) treeMapTestDriver3);
        experiment.util.Collection collection11 = treeMapTestDriver0.values();
        experiment.util.Set set12 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver13 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set14 = treeMapTestDriver13.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver15 = new experiment.util.TreeMapTestDriver();
        int int16 = treeMapTestDriver15.size();
        experiment.util.Comparator comparator17 = treeMapTestDriver15.comparator();
        experiment.util.Set set18 = treeMapTestDriver15.keySet();
        java.lang.Object obj21 = treeMapTestDriver15.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        experiment.util.TreeMapTestDriver treeMapTestDriver22 = new experiment.util.TreeMapTestDriver();
        int int23 = treeMapTestDriver22.size();
        experiment.util.Comparator comparator24 = treeMapTestDriver22.comparator();
        experiment.util.Set set25 = treeMapTestDriver22.keySet();
        int int26 = treeMapTestDriver22.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver27 = new experiment.util.TreeMapTestDriver();
        int int28 = treeMapTestDriver27.size();
        experiment.util.Comparator comparator29 = treeMapTestDriver27.comparator();
        experiment.util.Set set30 = treeMapTestDriver27.keySet();
        java.lang.Object obj33 = treeMapTestDriver27.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        java.lang.Object obj34 = treeMapTestDriver22.get((java.lang.Object) 0.0f);
        java.lang.Object obj36 = treeMapTestDriver22.remove((java.lang.Object) '#');
        experiment.util.TreeMapTestDriver treeMapTestDriver38 = new experiment.util.TreeMapTestDriver();
        int int39 = treeMapTestDriver38.size();
        experiment.util.Comparator comparator40 = treeMapTestDriver38.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver42 = new experiment.util.TreeMapTestDriver();
        int int43 = treeMapTestDriver42.size();
        experiment.util.Comparator comparator44 = treeMapTestDriver42.comparator();
        experiment.util.Set set45 = treeMapTestDriver42.keySet();
        java.lang.Object obj48 = treeMapTestDriver42.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        treeMapTestDriver42.clear();
        java.lang.Object obj50 = treeMapTestDriver38.put((java.lang.Object) (short) 1, (java.lang.Object) treeMapTestDriver42);
        int int51 = treeMapTestDriver42.size();
        experiment.util.Set set52 = treeMapTestDriver42.keySet();
        java.lang.Object obj53 = treeMapTestDriver22.put((java.lang.Object) 0L, (java.lang.Object) set52);
        java.lang.Object obj54 = treeMapTestDriver13.put((java.lang.Object) 0.0f, (java.lang.Object) treeMapTestDriver22);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean55 = treeMapTestDriver0.containsKey(obj54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(comparator5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(comparator17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(comparator24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(comparator29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNull(comparator40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNull(comparator44);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj54);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test055");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        java.lang.Object obj5 = treeMapTestDriver0.remove((java.lang.Object) (short) 1);
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) (short) 100);
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = treeMapTestDriver0.containsKey(obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test056");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        java.lang.Object obj6 = treeMapTestDriver0.remove((java.lang.Object) (short) 100);
        experiment.util.Comparator comparator7 = treeMapTestDriver0.comparator();
        treeMapTestDriver0.clear();
        int int9 = treeMapTestDriver0.size();
        boolean boolean10 = treeMapTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(comparator7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test057");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        java.lang.Object obj6 = treeMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        treeMapTestDriver0.clear();
        boolean boolean8 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection9 = treeMapTestDriver0.values();
        java.lang.Class<?> wildcardClass10 = collection9.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test058");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        int int3 = treeMapTestDriver0.size();
        java.lang.Object obj5 = treeMapTestDriver0.remove((java.lang.Object) (-1.0f));
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = treeMapTestDriver0.remove(obj7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test059");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        java.lang.Object obj5 = treeMapTestDriver0.remove((java.lang.Object) 100);
        experiment.util.TreeMapTestDriver treeMapTestDriver6 = new experiment.util.TreeMapTestDriver();
        int int7 = treeMapTestDriver6.size();
        experiment.util.Comparator comparator8 = treeMapTestDriver6.comparator();
        experiment.util.Set set9 = treeMapTestDriver6.keySet();
        java.lang.Object obj11 = treeMapTestDriver6.remove((java.lang.Object) (short) 1);
        experiment.util.Collection collection12 = treeMapTestDriver6.values();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(comparator8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test060");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        boolean boolean2 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver3 = new experiment.util.TreeMapTestDriver();
        int int4 = treeMapTestDriver3.size();
        experiment.util.Comparator comparator5 = treeMapTestDriver3.comparator();
        experiment.util.Set set6 = treeMapTestDriver3.keySet();
        java.lang.Object obj8 = treeMapTestDriver3.remove((java.lang.Object) 100);
        experiment.util.Collection collection9 = treeMapTestDriver3.values();
        java.lang.Class<?> wildcardClass10 = collection9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = treeMapTestDriver0.containsKey((java.lang.Object) collection9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.ArrayList cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(comparator5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test061");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        java.lang.Object obj6 = treeMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        treeMapTestDriver0.clear();
        boolean boolean9 = treeMapTestDriver0.containsKey((java.lang.Object) (short) 0);
        experiment.util.Collection collection10 = treeMapTestDriver0.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver11 = new experiment.util.TreeMapTestDriver();
        int int12 = treeMapTestDriver11.size();
        experiment.util.Comparator comparator13 = treeMapTestDriver11.comparator();
        int int14 = treeMapTestDriver11.size();
        experiment.util.Set set15 = treeMapTestDriver11.entrySet();
        experiment.util.Set set16 = treeMapTestDriver11.keySet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(comparator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(set16);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test062");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        int int3 = treeMapTestDriver0.size();
        experiment.util.Collection collection4 = treeMapTestDriver0.values();
        int int5 = treeMapTestDriver0.size();
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = treeMapTestDriver0.remove(obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test063");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver4 = new experiment.util.TreeMapTestDriver();
        int int5 = treeMapTestDriver4.size();
        experiment.util.Comparator comparator6 = treeMapTestDriver4.comparator();
        experiment.util.Set set7 = treeMapTestDriver4.keySet();
        java.lang.Object obj10 = treeMapTestDriver4.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        treeMapTestDriver4.clear();
        java.lang.Object obj12 = treeMapTestDriver0.put((java.lang.Object) (short) 1, (java.lang.Object) treeMapTestDriver4);
        experiment.util.Comparator comparator13 = treeMapTestDriver4.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver14 = new experiment.util.TreeMapTestDriver();
        int int15 = treeMapTestDriver14.size();
        experiment.util.Comparator comparator16 = treeMapTestDriver14.comparator();
        experiment.util.Set set17 = treeMapTestDriver14.keySet();
        treeMapTestDriver14.clear();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = treeMapTestDriver4.containsKey((java.lang.Object) treeMapTestDriver14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(comparator13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(comparator16);
        org.junit.Assert.assertNotNull(set17);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test064");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        java.lang.Object obj5 = treeMapTestDriver0.remove((java.lang.Object) (short) 1);
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        experiment.util.Comparator comparator7 = treeMapTestDriver0.comparator();
        experiment.util.Set set8 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        int int10 = treeMapTestDriver9.size();
        experiment.util.Comparator comparator11 = treeMapTestDriver9.comparator();
        experiment.util.Set set12 = treeMapTestDriver9.keySet();
        java.lang.Object obj14 = treeMapTestDriver9.remove((java.lang.Object) (short) 1);
        java.lang.Object obj16 = treeMapTestDriver9.remove((java.lang.Object) (short) 100);
        experiment.util.TreeMapTestDriver treeMapTestDriver17 = new experiment.util.TreeMapTestDriver();
        int int18 = treeMapTestDriver17.size();
        experiment.util.Comparator comparator19 = treeMapTestDriver17.comparator();
        experiment.util.Set set20 = treeMapTestDriver17.keySet();
        int int21 = treeMapTestDriver17.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver22 = new experiment.util.TreeMapTestDriver();
        int int23 = treeMapTestDriver22.size();
        experiment.util.Comparator comparator24 = treeMapTestDriver22.comparator();
        experiment.util.Set set25 = treeMapTestDriver22.keySet();
        java.lang.Object obj28 = treeMapTestDriver22.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        java.lang.Object obj29 = treeMapTestDriver17.get((java.lang.Object) 0.0f);
        java.lang.Object obj31 = treeMapTestDriver17.remove((java.lang.Object) '#');
        experiment.util.TreeMapTestDriver treeMapTestDriver33 = new experiment.util.TreeMapTestDriver();
        int int34 = treeMapTestDriver33.size();
        experiment.util.Comparator comparator35 = treeMapTestDriver33.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver37 = new experiment.util.TreeMapTestDriver();
        int int38 = treeMapTestDriver37.size();
        experiment.util.Comparator comparator39 = treeMapTestDriver37.comparator();
        experiment.util.Set set40 = treeMapTestDriver37.keySet();
        java.lang.Object obj43 = treeMapTestDriver37.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        treeMapTestDriver37.clear();
        java.lang.Object obj45 = treeMapTestDriver33.put((java.lang.Object) (short) 1, (java.lang.Object) treeMapTestDriver37);
        int int46 = treeMapTestDriver37.size();
        experiment.util.Set set47 = treeMapTestDriver37.keySet();
        java.lang.Object obj48 = treeMapTestDriver17.put((java.lang.Object) 0L, (java.lang.Object) set47);
        java.lang.Object obj49 = treeMapTestDriver9.remove((java.lang.Object) 0L);
        experiment.util.Collection collection50 = treeMapTestDriver9.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver51 = new experiment.util.TreeMapTestDriver();
        int int52 = treeMapTestDriver51.size();
        experiment.util.Comparator comparator53 = treeMapTestDriver51.comparator();
        experiment.util.Set set54 = treeMapTestDriver51.keySet();
        int int55 = treeMapTestDriver51.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver56 = new experiment.util.TreeMapTestDriver();
        int int57 = treeMapTestDriver56.size();
        experiment.util.Comparator comparator58 = treeMapTestDriver56.comparator();
        experiment.util.Set set59 = treeMapTestDriver56.keySet();
        java.lang.Object obj62 = treeMapTestDriver56.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        java.lang.Object obj63 = treeMapTestDriver51.get((java.lang.Object) 0.0f);
        java.lang.Object obj65 = treeMapTestDriver51.remove((java.lang.Object) '#');
        experiment.util.TreeMapTestDriver treeMapTestDriver67 = new experiment.util.TreeMapTestDriver();
        int int68 = treeMapTestDriver67.size();
        experiment.util.Comparator comparator69 = treeMapTestDriver67.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver71 = new experiment.util.TreeMapTestDriver();
        int int72 = treeMapTestDriver71.size();
        experiment.util.Comparator comparator73 = treeMapTestDriver71.comparator();
        experiment.util.Set set74 = treeMapTestDriver71.keySet();
        java.lang.Object obj77 = treeMapTestDriver71.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        treeMapTestDriver71.clear();
        java.lang.Object obj79 = treeMapTestDriver67.put((java.lang.Object) (short) 1, (java.lang.Object) treeMapTestDriver71);
        int int80 = treeMapTestDriver71.size();
        experiment.util.Set set81 = treeMapTestDriver71.keySet();
        java.lang.Object obj82 = treeMapTestDriver51.put((java.lang.Object) 0L, (java.lang.Object) set81);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj83 = treeMapTestDriver0.put((java.lang.Object) treeMapTestDriver9, (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(comparator7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(comparator19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(comparator24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(comparator35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(comparator39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNull(comparator53);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNull(comparator58);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNull(comparator69);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNull(comparator73);
        org.junit.Assert.assertNotNull(set74);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertNotNull(set81);
        org.junit.Assert.assertNull(obj82);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test065");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        treeMapTestDriver0.clear();
        treeMapTestDriver0.clear();
        int int6 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        int int8 = treeMapTestDriver7.size();
        experiment.util.Comparator comparator9 = treeMapTestDriver7.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver11 = new experiment.util.TreeMapTestDriver();
        int int12 = treeMapTestDriver11.size();
        experiment.util.Comparator comparator13 = treeMapTestDriver11.comparator();
        experiment.util.Set set14 = treeMapTestDriver11.keySet();
        java.lang.Object obj17 = treeMapTestDriver11.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        treeMapTestDriver11.clear();
        java.lang.Object obj19 = treeMapTestDriver7.put((java.lang.Object) (short) 1, (java.lang.Object) treeMapTestDriver11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(comparator13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test066");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver3 = new experiment.util.TreeMapTestDriver();
        int int4 = treeMapTestDriver3.size();
        experiment.util.Comparator comparator5 = treeMapTestDriver3.comparator();
        experiment.util.Set set6 = treeMapTestDriver3.keySet();
        java.lang.Object obj8 = treeMapTestDriver3.remove((java.lang.Object) (short) 1);
        treeMapTestDriver3.clear();
        java.lang.Object obj10 = treeMapTestDriver0.put((java.lang.Object) 1.0d, (java.lang.Object) treeMapTestDriver3);
        experiment.util.Set set11 = treeMapTestDriver3.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver12 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set13 = treeMapTestDriver12.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = treeMapTestDriver3.remove((java.lang.Object) treeMapTestDriver12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(comparator5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set13);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test067");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        java.lang.Object obj6 = treeMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        treeMapTestDriver0.clear();
        experiment.util.Collection collection8 = treeMapTestDriver0.values();
        treeMapTestDriver0.clear();
        experiment.util.Comparator comparator10 = treeMapTestDriver0.comparator();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(comparator10);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test068");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        java.lang.Object obj5 = treeMapTestDriver0.remove((java.lang.Object) (short) 1);
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection7 = treeMapTestDriver0.values();
        experiment.util.Set set8 = treeMapTestDriver0.keySet();
        boolean boolean9 = treeMapTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test069");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        java.lang.Object obj5 = treeMapTestDriver0.remove((java.lang.Object) (short) 1);
        treeMapTestDriver0.clear();
        experiment.util.Comparator comparator7 = treeMapTestDriver0.comparator();
        java.lang.Class<?> wildcardClass8 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(comparator7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test070");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        int int4 = treeMapTestDriver0.size();
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        boolean boolean8 = treeMapTestDriver0.containsKey((java.lang.Object) 10.0d);
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        int int10 = treeMapTestDriver9.size();
        experiment.util.Comparator comparator11 = treeMapTestDriver9.comparator();
        experiment.util.Set set12 = treeMapTestDriver9.keySet();
        java.lang.Object obj14 = treeMapTestDriver9.remove((java.lang.Object) (short) 1);
        java.lang.Object obj16 = treeMapTestDriver9.remove((java.lang.Object) (short) 100);
        experiment.util.TreeMapTestDriver treeMapTestDriver17 = new experiment.util.TreeMapTestDriver();
        int int18 = treeMapTestDriver17.size();
        experiment.util.Comparator comparator19 = treeMapTestDriver17.comparator();
        experiment.util.Set set20 = treeMapTestDriver17.keySet();
        int int21 = treeMapTestDriver17.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver22 = new experiment.util.TreeMapTestDriver();
        int int23 = treeMapTestDriver22.size();
        experiment.util.Comparator comparator24 = treeMapTestDriver22.comparator();
        experiment.util.Set set25 = treeMapTestDriver22.keySet();
        java.lang.Object obj28 = treeMapTestDriver22.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        java.lang.Object obj29 = treeMapTestDriver17.get((java.lang.Object) 0.0f);
        java.lang.Object obj31 = treeMapTestDriver17.remove((java.lang.Object) '#');
        experiment.util.TreeMapTestDriver treeMapTestDriver33 = new experiment.util.TreeMapTestDriver();
        int int34 = treeMapTestDriver33.size();
        experiment.util.Comparator comparator35 = treeMapTestDriver33.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver37 = new experiment.util.TreeMapTestDriver();
        int int38 = treeMapTestDriver37.size();
        experiment.util.Comparator comparator39 = treeMapTestDriver37.comparator();
        experiment.util.Set set40 = treeMapTestDriver37.keySet();
        java.lang.Object obj43 = treeMapTestDriver37.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        treeMapTestDriver37.clear();
        java.lang.Object obj45 = treeMapTestDriver33.put((java.lang.Object) (short) 1, (java.lang.Object) treeMapTestDriver37);
        int int46 = treeMapTestDriver37.size();
        experiment.util.Set set47 = treeMapTestDriver37.keySet();
        java.lang.Object obj48 = treeMapTestDriver17.put((java.lang.Object) 0L, (java.lang.Object) set47);
        java.lang.Object obj49 = treeMapTestDriver9.remove((java.lang.Object) 0L);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean50 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(comparator19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(comparator24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(comparator35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(comparator39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj49);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test071");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        int int3 = treeMapTestDriver0.size();
        experiment.util.Collection collection4 = treeMapTestDriver0.values();
        int int5 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver6 = new experiment.util.TreeMapTestDriver();
        int int7 = treeMapTestDriver6.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        int int10 = treeMapTestDriver9.size();
        experiment.util.Comparator comparator11 = treeMapTestDriver9.comparator();
        experiment.util.Set set12 = treeMapTestDriver9.keySet();
        java.lang.Object obj14 = treeMapTestDriver9.remove((java.lang.Object) (short) 1);
        treeMapTestDriver9.clear();
        java.lang.Object obj16 = treeMapTestDriver6.put((java.lang.Object) 1.0d, (java.lang.Object) treeMapTestDriver9);
        treeMapTestDriver9.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test072");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        java.lang.Object obj5 = treeMapTestDriver0.remove((java.lang.Object) (short) 1);
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection7 = treeMapTestDriver0.values();
        experiment.util.Set set8 = treeMapTestDriver0.keySet();
        experiment.util.Collection collection9 = treeMapTestDriver0.values();
        treeMapTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test073");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver2 = new experiment.util.TreeMapTestDriver();
        int int3 = treeMapTestDriver2.size();
        experiment.util.Comparator comparator4 = treeMapTestDriver2.comparator();
        experiment.util.Set set5 = treeMapTestDriver2.keySet();
        java.lang.Object obj8 = treeMapTestDriver2.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        int int10 = treeMapTestDriver9.size();
        experiment.util.Comparator comparator11 = treeMapTestDriver9.comparator();
        experiment.util.Set set12 = treeMapTestDriver9.keySet();
        int int13 = treeMapTestDriver9.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver14 = new experiment.util.TreeMapTestDriver();
        int int15 = treeMapTestDriver14.size();
        experiment.util.Comparator comparator16 = treeMapTestDriver14.comparator();
        experiment.util.Set set17 = treeMapTestDriver14.keySet();
        java.lang.Object obj20 = treeMapTestDriver14.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        java.lang.Object obj21 = treeMapTestDriver9.get((java.lang.Object) 0.0f);
        java.lang.Object obj23 = treeMapTestDriver9.remove((java.lang.Object) '#');
        experiment.util.TreeMapTestDriver treeMapTestDriver25 = new experiment.util.TreeMapTestDriver();
        int int26 = treeMapTestDriver25.size();
        experiment.util.Comparator comparator27 = treeMapTestDriver25.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver29 = new experiment.util.TreeMapTestDriver();
        int int30 = treeMapTestDriver29.size();
        experiment.util.Comparator comparator31 = treeMapTestDriver29.comparator();
        experiment.util.Set set32 = treeMapTestDriver29.keySet();
        java.lang.Object obj35 = treeMapTestDriver29.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        treeMapTestDriver29.clear();
        java.lang.Object obj37 = treeMapTestDriver25.put((java.lang.Object) (short) 1, (java.lang.Object) treeMapTestDriver29);
        int int38 = treeMapTestDriver29.size();
        experiment.util.Set set39 = treeMapTestDriver29.keySet();
        java.lang.Object obj40 = treeMapTestDriver9.put((java.lang.Object) 0L, (java.lang.Object) set39);
        java.lang.Object obj41 = treeMapTestDriver0.put((java.lang.Object) 0.0f, (java.lang.Object) treeMapTestDriver9);
        experiment.util.TreeMapTestDriver treeMapTestDriver42 = new experiment.util.TreeMapTestDriver();
        int int43 = treeMapTestDriver42.size();
        experiment.util.Comparator comparator44 = treeMapTestDriver42.comparator();
        experiment.util.Set set45 = treeMapTestDriver42.keySet();
        java.lang.Object obj47 = treeMapTestDriver42.remove((java.lang.Object) (short) 1);
        boolean boolean48 = treeMapTestDriver42.isEmpty();
        experiment.util.Collection collection49 = treeMapTestDriver42.values();
        experiment.util.Set set50 = treeMapTestDriver42.keySet();
        experiment.util.Collection collection51 = treeMapTestDriver42.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver52 = new experiment.util.TreeMapTestDriver();
        int int53 = treeMapTestDriver52.size();
        experiment.util.Comparator comparator54 = treeMapTestDriver52.comparator();
        experiment.util.Set set55 = treeMapTestDriver52.keySet();
        treeMapTestDriver52.clear();
        boolean boolean57 = treeMapTestDriver52.isEmpty();
        boolean boolean58 = treeMapTestDriver42.containsKey((java.lang.Object) boolean57);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj59 = treeMapTestDriver0.get((java.lang.Object) boolean57);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to java.lang.Boolean");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(comparator16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(comparator27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(comparator31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNull(comparator44);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNull(comparator54);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test074");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        java.lang.Object obj5 = treeMapTestDriver0.remove((java.lang.Object) (short) 1);
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection7 = treeMapTestDriver0.values();
        java.lang.Class<?> wildcardClass8 = collection7.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test075");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        java.lang.Object obj6 = treeMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver8 = new experiment.util.TreeMapTestDriver();
        int int9 = treeMapTestDriver8.size();
        experiment.util.Comparator comparator10 = treeMapTestDriver8.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver12 = new experiment.util.TreeMapTestDriver();
        int int13 = treeMapTestDriver12.size();
        experiment.util.Comparator comparator14 = treeMapTestDriver12.comparator();
        experiment.util.Set set15 = treeMapTestDriver12.keySet();
        java.lang.Object obj18 = treeMapTestDriver12.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        treeMapTestDriver12.clear();
        java.lang.Object obj20 = treeMapTestDriver8.put((java.lang.Object) (short) 1, (java.lang.Object) treeMapTestDriver12);
        boolean boolean21 = treeMapTestDriver0.containsKey((java.lang.Object) (short) 1);
        boolean boolean22 = treeMapTestDriver0.isEmpty();
        experiment.util.Comparator comparator23 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver24 = new experiment.util.TreeMapTestDriver();
        int int25 = treeMapTestDriver24.size();
        experiment.util.Comparator comparator26 = treeMapTestDriver24.comparator();
        experiment.util.Set set27 = treeMapTestDriver24.keySet();
        java.lang.Object obj30 = treeMapTestDriver24.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        treeMapTestDriver24.clear();
        treeMapTestDriver24.clear();
        experiment.util.Collection collection33 = treeMapTestDriver24.values();
        java.lang.Class<?> wildcardClass34 = treeMapTestDriver24.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver24);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(comparator14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(comparator23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(comparator26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test076");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        java.lang.Object obj6 = treeMapTestDriver0.remove((java.lang.Object) (short) 100);
        java.lang.Class<?> wildcardClass7 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test077");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver4 = new experiment.util.TreeMapTestDriver();
        int int5 = treeMapTestDriver4.size();
        experiment.util.Comparator comparator6 = treeMapTestDriver4.comparator();
        experiment.util.Set set7 = treeMapTestDriver4.keySet();
        java.lang.Object obj10 = treeMapTestDriver4.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        treeMapTestDriver4.clear();
        java.lang.Object obj12 = treeMapTestDriver0.put((java.lang.Object) (short) 1, (java.lang.Object) treeMapTestDriver4);
        int int13 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator14 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver15 = new experiment.util.TreeMapTestDriver();
        int int16 = treeMapTestDriver15.size();
        experiment.util.Comparator comparator17 = treeMapTestDriver15.comparator();
        experiment.util.Set set18 = treeMapTestDriver15.keySet();
        java.lang.Object obj20 = treeMapTestDriver15.remove((java.lang.Object) 100);
        java.lang.Object obj22 = treeMapTestDriver15.get((java.lang.Object) 100);
        treeMapTestDriver15.clear();
        java.lang.Object obj25 = treeMapTestDriver15.get((java.lang.Object) "hi!");
        treeMapTestDriver15.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = treeMapTestDriver0.put((java.lang.Object) treeMapTestDriver15, (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(comparator14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(comparator17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test078");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver4 = new experiment.util.TreeMapTestDriver();
        int int5 = treeMapTestDriver4.size();
        experiment.util.Comparator comparator6 = treeMapTestDriver4.comparator();
        experiment.util.Set set7 = treeMapTestDriver4.keySet();
        java.lang.Object obj10 = treeMapTestDriver4.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        treeMapTestDriver4.clear();
        java.lang.Object obj12 = treeMapTestDriver0.put((java.lang.Object) (short) 1, (java.lang.Object) treeMapTestDriver4);
        experiment.util.TreeMapTestDriver treeMapTestDriver13 = new experiment.util.TreeMapTestDriver();
        int int14 = treeMapTestDriver13.size();
        experiment.util.Comparator comparator15 = treeMapTestDriver13.comparator();
        experiment.util.Set set16 = treeMapTestDriver13.keySet();
        java.lang.Object obj18 = treeMapTestDriver13.remove((java.lang.Object) (short) 1);
        java.lang.Object obj19 = treeMapTestDriver4.get((java.lang.Object) (short) 1);
        experiment.util.TreeMapTestDriver treeMapTestDriver20 = new experiment.util.TreeMapTestDriver();
        int int21 = treeMapTestDriver20.size();
        experiment.util.Comparator comparator22 = treeMapTestDriver20.comparator();
        experiment.util.Set set23 = treeMapTestDriver20.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = treeMapTestDriver4.remove((java.lang.Object) treeMapTestDriver20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(comparator15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(comparator22);
        org.junit.Assert.assertNotNull(set23);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test079");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        java.lang.Object obj6 = treeMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver8 = new experiment.util.TreeMapTestDriver();
        int int9 = treeMapTestDriver8.size();
        experiment.util.Comparator comparator10 = treeMapTestDriver8.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver12 = new experiment.util.TreeMapTestDriver();
        int int13 = treeMapTestDriver12.size();
        experiment.util.Comparator comparator14 = treeMapTestDriver12.comparator();
        experiment.util.Set set15 = treeMapTestDriver12.keySet();
        java.lang.Object obj18 = treeMapTestDriver12.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        treeMapTestDriver12.clear();
        java.lang.Object obj20 = treeMapTestDriver8.put((java.lang.Object) (short) 1, (java.lang.Object) treeMapTestDriver12);
        boolean boolean21 = treeMapTestDriver0.containsKey((java.lang.Object) (short) 1);
        experiment.util.Set set22 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver23 = new experiment.util.TreeMapTestDriver();
        int int24 = treeMapTestDriver23.size();
        experiment.util.Comparator comparator25 = treeMapTestDriver23.comparator();
        experiment.util.Set set26 = treeMapTestDriver23.keySet();
        int int27 = treeMapTestDriver23.size();
        experiment.util.Collection collection28 = treeMapTestDriver23.values();
        boolean boolean29 = treeMapTestDriver23.isEmpty();
        boolean boolean31 = treeMapTestDriver23.containsKey((java.lang.Object) 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver23);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(comparator14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(comparator25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test080");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver3 = new experiment.util.TreeMapTestDriver();
        int int4 = treeMapTestDriver3.size();
        experiment.util.Comparator comparator5 = treeMapTestDriver3.comparator();
        experiment.util.Set set6 = treeMapTestDriver3.keySet();
        java.lang.Object obj8 = treeMapTestDriver3.remove((java.lang.Object) (short) 1);
        treeMapTestDriver3.clear();
        java.lang.Object obj10 = treeMapTestDriver0.put((java.lang.Object) 1.0d, (java.lang.Object) treeMapTestDriver3);
        experiment.util.Collection collection11 = treeMapTestDriver0.values();
        experiment.util.Set set12 = treeMapTestDriver0.keySet();
        experiment.util.Set set13 = treeMapTestDriver0.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver14 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set15 = treeMapTestDriver14.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = treeMapTestDriver0.remove((java.lang.Object) set15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(comparator5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set15);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test081");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver4 = new experiment.util.TreeMapTestDriver();
        int int5 = treeMapTestDriver4.size();
        experiment.util.Comparator comparator6 = treeMapTestDriver4.comparator();
        experiment.util.Set set7 = treeMapTestDriver4.keySet();
        java.lang.Object obj10 = treeMapTestDriver4.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        treeMapTestDriver4.clear();
        java.lang.Object obj12 = treeMapTestDriver0.put((java.lang.Object) (short) 1, (java.lang.Object) treeMapTestDriver4);
        experiment.util.TreeMapTestDriver treeMapTestDriver13 = new experiment.util.TreeMapTestDriver();
        int int14 = treeMapTestDriver13.size();
        experiment.util.Comparator comparator15 = treeMapTestDriver13.comparator();
        experiment.util.Set set16 = treeMapTestDriver13.keySet();
        java.lang.Object obj19 = treeMapTestDriver13.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        treeMapTestDriver13.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver21 = new experiment.util.TreeMapTestDriver();
        int int22 = treeMapTestDriver21.size();
        experiment.util.Comparator comparator23 = treeMapTestDriver21.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver25 = new experiment.util.TreeMapTestDriver();
        int int26 = treeMapTestDriver25.size();
        experiment.util.Comparator comparator27 = treeMapTestDriver25.comparator();
        experiment.util.Set set28 = treeMapTestDriver25.keySet();
        java.lang.Object obj31 = treeMapTestDriver25.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        treeMapTestDriver25.clear();
        java.lang.Object obj33 = treeMapTestDriver21.put((java.lang.Object) (short) 1, (java.lang.Object) treeMapTestDriver25);
        boolean boolean34 = treeMapTestDriver13.containsKey((java.lang.Object) (short) 1);
        boolean boolean35 = treeMapTestDriver13.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver36 = new experiment.util.TreeMapTestDriver();
        int int37 = treeMapTestDriver36.size();
        experiment.util.Comparator comparator38 = treeMapTestDriver36.comparator();
        experiment.util.Set set39 = treeMapTestDriver36.keySet();
        treeMapTestDriver36.clear();
        boolean boolean41 = treeMapTestDriver36.isEmpty();
        java.lang.Object obj42 = treeMapTestDriver4.put((java.lang.Object) boolean35, (java.lang.Object) boolean41);
        experiment.util.TreeMapTestDriver treeMapTestDriver43 = new experiment.util.TreeMapTestDriver();
        int int44 = treeMapTestDriver43.size();
        experiment.util.Comparator comparator45 = treeMapTestDriver43.comparator();
        int int46 = treeMapTestDriver43.size();
        int int47 = treeMapTestDriver43.size();
        experiment.util.Collection collection48 = treeMapTestDriver43.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj49 = treeMapTestDriver4.remove((java.lang.Object) collection48);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.ArrayList cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(comparator15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(comparator23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(comparator27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNull(comparator38);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNull(comparator45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(collection48);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test082");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        int int3 = treeMapTestDriver0.size();
        java.lang.Object obj5 = treeMapTestDriver0.remove((java.lang.Object) (-1.0f));
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        int int8 = treeMapTestDriver7.size();
        experiment.util.Comparator comparator9 = treeMapTestDriver7.comparator();
        int int10 = treeMapTestDriver7.size();
        java.lang.Object obj12 = treeMapTestDriver7.get((java.lang.Object) 0.0d);
        experiment.util.Collection collection13 = treeMapTestDriver7.values();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = treeMapTestDriver0.containsKey((java.lang.Object) collection13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.ArrayList cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test083");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        java.lang.Object obj5 = treeMapTestDriver0.remove((java.lang.Object) (short) 1);
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver8 = new experiment.util.TreeMapTestDriver();
        int int9 = treeMapTestDriver8.size();
        experiment.util.Comparator comparator10 = treeMapTestDriver8.comparator();
        experiment.util.Set set11 = treeMapTestDriver8.keySet();
        java.lang.Object obj13 = treeMapTestDriver8.remove((java.lang.Object) (short) 1);
        boolean boolean14 = treeMapTestDriver8.isEmpty();
        experiment.util.Comparator comparator15 = treeMapTestDriver8.comparator();
        experiment.util.Set set16 = treeMapTestDriver8.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(comparator15);
        org.junit.Assert.assertNotNull(set16);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test084");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        int int3 = treeMapTestDriver0.size();
        java.lang.Object obj5 = treeMapTestDriver0.get((java.lang.Object) 0.0d);
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        int int7 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver8 = new experiment.util.TreeMapTestDriver();
        int int9 = treeMapTestDriver8.size();
        experiment.util.Comparator comparator10 = treeMapTestDriver8.comparator();
        experiment.util.Set set11 = treeMapTestDriver8.keySet();
        treeMapTestDriver8.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertNotNull(set11);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test085");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        int int3 = treeMapTestDriver0.size();
        int int4 = treeMapTestDriver0.size();
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver6 = new experiment.util.TreeMapTestDriver();
        int int7 = treeMapTestDriver6.size();
        experiment.util.Comparator comparator8 = treeMapTestDriver6.comparator();
        int int9 = treeMapTestDriver6.size();
        java.lang.Object obj11 = treeMapTestDriver6.get((java.lang.Object) 0.0d);
        experiment.util.Set set12 = treeMapTestDriver6.entrySet();
        experiment.util.Set set13 = treeMapTestDriver6.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(comparator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(set13);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test086");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        java.lang.Object obj5 = treeMapTestDriver0.remove((java.lang.Object) 100);
        java.lang.Object obj7 = treeMapTestDriver0.get((java.lang.Object) 100);
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        int int10 = treeMapTestDriver9.size();
        experiment.util.Comparator comparator11 = treeMapTestDriver9.comparator();
        experiment.util.Set set12 = treeMapTestDriver9.keySet();
        java.lang.Object obj15 = treeMapTestDriver9.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        treeMapTestDriver9.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver17 = new experiment.util.TreeMapTestDriver();
        int int18 = treeMapTestDriver17.size();
        experiment.util.Comparator comparator19 = treeMapTestDriver17.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver21 = new experiment.util.TreeMapTestDriver();
        int int22 = treeMapTestDriver21.size();
        experiment.util.Comparator comparator23 = treeMapTestDriver21.comparator();
        experiment.util.Set set24 = treeMapTestDriver21.keySet();
        java.lang.Object obj27 = treeMapTestDriver21.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        treeMapTestDriver21.clear();
        java.lang.Object obj29 = treeMapTestDriver17.put((java.lang.Object) (short) 1, (java.lang.Object) treeMapTestDriver21);
        boolean boolean30 = treeMapTestDriver9.containsKey((java.lang.Object) (short) 1);
        boolean boolean31 = treeMapTestDriver9.isEmpty();
        experiment.util.Comparator comparator32 = treeMapTestDriver9.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(comparator19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(comparator23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(comparator32);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test087");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver3 = new experiment.util.TreeMapTestDriver();
        int int4 = treeMapTestDriver3.size();
        experiment.util.Comparator comparator5 = treeMapTestDriver3.comparator();
        experiment.util.Set set6 = treeMapTestDriver3.keySet();
        java.lang.Object obj8 = treeMapTestDriver3.remove((java.lang.Object) (short) 1);
        treeMapTestDriver3.clear();
        java.lang.Object obj10 = treeMapTestDriver0.put((java.lang.Object) 1.0d, (java.lang.Object) treeMapTestDriver3);
        experiment.util.Collection collection11 = treeMapTestDriver0.values();
        java.lang.Class<?> wildcardClass12 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(comparator5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test088");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        java.lang.Object obj5 = treeMapTestDriver0.remove((java.lang.Object) 100);
        java.lang.Object obj7 = treeMapTestDriver0.get((java.lang.Object) 100);
        treeMapTestDriver0.clear();
        java.lang.Object obj10 = treeMapTestDriver0.get((java.lang.Object) "hi!");
        experiment.util.TreeMapTestDriver treeMapTestDriver11 = new experiment.util.TreeMapTestDriver();
        int int12 = treeMapTestDriver11.size();
        treeMapTestDriver11.clear();
        int int14 = treeMapTestDriver11.size();
        experiment.util.Set set15 = treeMapTestDriver11.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver16 = new experiment.util.TreeMapTestDriver();
        int int17 = treeMapTestDriver16.size();
        experiment.util.Comparator comparator18 = treeMapTestDriver16.comparator();
        experiment.util.Set set19 = treeMapTestDriver16.keySet();
        java.lang.Object obj22 = treeMapTestDriver16.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        treeMapTestDriver16.clear();
        experiment.util.Collection collection24 = treeMapTestDriver16.values();
        treeMapTestDriver16.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = treeMapTestDriver0.put((java.lang.Object) set15, (java.lang.Object) treeMapTestDriver16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(comparator18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(collection24);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test089");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        java.lang.Object obj6 = treeMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        boolean boolean7 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection8 = treeMapTestDriver0.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        int int10 = treeMapTestDriver9.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver12 = new experiment.util.TreeMapTestDriver();
        int int13 = treeMapTestDriver12.size();
        experiment.util.Comparator comparator14 = treeMapTestDriver12.comparator();
        experiment.util.Set set15 = treeMapTestDriver12.keySet();
        java.lang.Object obj17 = treeMapTestDriver12.remove((java.lang.Object) (short) 1);
        treeMapTestDriver12.clear();
        java.lang.Object obj19 = treeMapTestDriver9.put((java.lang.Object) 1.0d, (java.lang.Object) treeMapTestDriver12);
        experiment.util.TreeMapTestDriver treeMapTestDriver20 = new experiment.util.TreeMapTestDriver();
        int int21 = treeMapTestDriver20.size();
        experiment.util.Comparator comparator22 = treeMapTestDriver20.comparator();
        int int23 = treeMapTestDriver20.size();
        java.lang.Object obj25 = treeMapTestDriver20.get((java.lang.Object) 0.0d);
        experiment.util.TreeMapTestDriver treeMapTestDriver26 = new experiment.util.TreeMapTestDriver();
        int int27 = treeMapTestDriver26.size();
        experiment.util.Comparator comparator28 = treeMapTestDriver26.comparator();
        experiment.util.Set set29 = treeMapTestDriver26.keySet();
        experiment.util.Comparator comparator30 = treeMapTestDriver26.comparator();
        java.lang.Object obj32 = treeMapTestDriver26.remove((java.lang.Object) (short) 100);
        java.lang.Object obj33 = treeMapTestDriver12.put((java.lang.Object) 0.0d, (java.lang.Object) (short) 100);
        experiment.util.Set set34 = treeMapTestDriver12.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj36 = treeMapTestDriver0.put((java.lang.Object) set34, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(comparator14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(comparator22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(comparator28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(comparator30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(set34);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test090");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        java.lang.Object obj6 = treeMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver8 = new experiment.util.TreeMapTestDriver();
        int int9 = treeMapTestDriver8.size();
        experiment.util.Comparator comparator10 = treeMapTestDriver8.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver12 = new experiment.util.TreeMapTestDriver();
        int int13 = treeMapTestDriver12.size();
        experiment.util.Comparator comparator14 = treeMapTestDriver12.comparator();
        experiment.util.Set set15 = treeMapTestDriver12.keySet();
        java.lang.Object obj18 = treeMapTestDriver12.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        treeMapTestDriver12.clear();
        java.lang.Object obj20 = treeMapTestDriver8.put((java.lang.Object) (short) 1, (java.lang.Object) treeMapTestDriver12);
        boolean boolean21 = treeMapTestDriver0.containsKey((java.lang.Object) (short) 1);
        boolean boolean22 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = treeMapTestDriver0.get(obj23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(comparator14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test091");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        java.lang.Object obj6 = treeMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver8 = new experiment.util.TreeMapTestDriver();
        int int9 = treeMapTestDriver8.size();
        experiment.util.Comparator comparator10 = treeMapTestDriver8.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver12 = new experiment.util.TreeMapTestDriver();
        int int13 = treeMapTestDriver12.size();
        experiment.util.Comparator comparator14 = treeMapTestDriver12.comparator();
        experiment.util.Set set15 = treeMapTestDriver12.keySet();
        java.lang.Object obj18 = treeMapTestDriver12.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        treeMapTestDriver12.clear();
        java.lang.Object obj20 = treeMapTestDriver8.put((java.lang.Object) (short) 1, (java.lang.Object) treeMapTestDriver12);
        boolean boolean21 = treeMapTestDriver0.containsKey((java.lang.Object) (short) 1);
        boolean boolean22 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = treeMapTestDriver0.put(obj23, (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(comparator14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test092");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        java.lang.Object obj5 = treeMapTestDriver0.remove((java.lang.Object) 100);
        java.lang.Object obj8 = treeMapTestDriver0.put((java.lang.Object) 100L, (java.lang.Object) '#');
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        int int10 = treeMapTestDriver9.size();
        experiment.util.Comparator comparator11 = treeMapTestDriver9.comparator();
        experiment.util.Set set12 = treeMapTestDriver9.keySet();
        java.lang.Object obj14 = treeMapTestDriver9.remove((java.lang.Object) (short) 1);
        treeMapTestDriver9.clear();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test093");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        int int8 = treeMapTestDriver7.size();
        experiment.util.Comparator comparator9 = treeMapTestDriver7.comparator();
        experiment.util.Set set10 = treeMapTestDriver7.keySet();
        experiment.util.Comparator comparator11 = treeMapTestDriver7.comparator();
        java.lang.Object obj13 = treeMapTestDriver7.remove((java.lang.Object) (short) 100);
        experiment.util.Comparator comparator14 = treeMapTestDriver7.comparator();
        experiment.util.Set set15 = treeMapTestDriver7.keySet();
        java.lang.Object obj16 = treeMapTestDriver0.put((java.lang.Object) "hi!", (java.lang.Object) treeMapTestDriver7);
        experiment.util.TreeMapTestDriver treeMapTestDriver17 = new experiment.util.TreeMapTestDriver();
        int int18 = treeMapTestDriver17.size();
        experiment.util.Comparator comparator19 = treeMapTestDriver17.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver21 = new experiment.util.TreeMapTestDriver();
        int int22 = treeMapTestDriver21.size();
        experiment.util.Comparator comparator23 = treeMapTestDriver21.comparator();
        experiment.util.Set set24 = treeMapTestDriver21.keySet();
        java.lang.Object obj27 = treeMapTestDriver21.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        treeMapTestDriver21.clear();
        java.lang.Object obj29 = treeMapTestDriver17.put((java.lang.Object) (short) 1, (java.lang.Object) treeMapTestDriver21);
        int int30 = treeMapTestDriver21.size();
        experiment.util.Set set31 = treeMapTestDriver21.keySet();
        boolean boolean32 = treeMapTestDriver21.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver33 = new experiment.util.TreeMapTestDriver();
        int int34 = treeMapTestDriver33.size();
        experiment.util.Comparator comparator35 = treeMapTestDriver33.comparator();
        experiment.util.Set set36 = treeMapTestDriver33.keySet();
        java.lang.Object obj38 = treeMapTestDriver33.remove((java.lang.Object) (short) 1);
        treeMapTestDriver33.clear();
        experiment.util.Comparator comparator40 = treeMapTestDriver33.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj41 = treeMapTestDriver7.put((java.lang.Object) treeMapTestDriver21, (java.lang.Object) treeMapTestDriver33);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(comparator14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(comparator19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(comparator23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(comparator35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(comparator40);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test094");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        int int4 = treeMapTestDriver0.size();
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver6 = new experiment.util.TreeMapTestDriver();
        int int7 = treeMapTestDriver6.size();
        experiment.util.Comparator comparator8 = treeMapTestDriver6.comparator();
        experiment.util.Set set9 = treeMapTestDriver6.keySet();
        java.lang.Object obj12 = treeMapTestDriver6.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        treeMapTestDriver6.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver14 = new experiment.util.TreeMapTestDriver();
        int int15 = treeMapTestDriver14.size();
        experiment.util.Comparator comparator16 = treeMapTestDriver14.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver18 = new experiment.util.TreeMapTestDriver();
        int int19 = treeMapTestDriver18.size();
        experiment.util.Comparator comparator20 = treeMapTestDriver18.comparator();
        experiment.util.Set set21 = treeMapTestDriver18.keySet();
        java.lang.Object obj24 = treeMapTestDriver18.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        treeMapTestDriver18.clear();
        java.lang.Object obj26 = treeMapTestDriver14.put((java.lang.Object) (short) 1, (java.lang.Object) treeMapTestDriver18);
        boolean boolean27 = treeMapTestDriver6.containsKey((java.lang.Object) (short) 1);
        boolean boolean28 = treeMapTestDriver0.containsKey((java.lang.Object) boolean27);
        int int29 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver30 = new experiment.util.TreeMapTestDriver();
        int int31 = treeMapTestDriver30.size();
        experiment.util.Comparator comparator32 = treeMapTestDriver30.comparator();
        int int33 = treeMapTestDriver30.size();
        experiment.util.Set set34 = treeMapTestDriver30.entrySet();
        boolean boolean35 = treeMapTestDriver30.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj36 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver30);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(comparator8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(comparator16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(comparator20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(comparator32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test095");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        java.lang.Object obj5 = treeMapTestDriver0.remove((java.lang.Object) (short) 1);
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) (short) 100);
        experiment.util.TreeMapTestDriver treeMapTestDriver8 = new experiment.util.TreeMapTestDriver();
        int int9 = treeMapTestDriver8.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver11 = new experiment.util.TreeMapTestDriver();
        int int12 = treeMapTestDriver11.size();
        experiment.util.Comparator comparator13 = treeMapTestDriver11.comparator();
        experiment.util.Set set14 = treeMapTestDriver11.keySet();
        java.lang.Object obj16 = treeMapTestDriver11.remove((java.lang.Object) (short) 1);
        treeMapTestDriver11.clear();
        java.lang.Object obj18 = treeMapTestDriver8.put((java.lang.Object) 1.0d, (java.lang.Object) treeMapTestDriver11);
        experiment.util.Set set19 = treeMapTestDriver8.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(comparator13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set19);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test096");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        int int3 = treeMapTestDriver0.size();
        java.lang.Object obj5 = treeMapTestDriver0.get((java.lang.Object) 0.0d);
        experiment.util.Set set6 = treeMapTestDriver0.entrySet();
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.Collection collection8 = treeMapTestDriver0.values();
        treeMapTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test097");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        treeMapTestDriver0.clear();
        int int3 = treeMapTestDriver0.size();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver5 = new experiment.util.TreeMapTestDriver();
        int int6 = treeMapTestDriver5.size();
        experiment.util.Comparator comparator7 = treeMapTestDriver5.comparator();
        experiment.util.Set set8 = treeMapTestDriver5.keySet();
        experiment.util.Comparator comparator9 = treeMapTestDriver5.comparator();
        experiment.util.Collection collection10 = treeMapTestDriver5.values();
        experiment.util.Set set11 = treeMapTestDriver5.keySet();
        boolean boolean12 = treeMapTestDriver5.isEmpty();
        experiment.util.Comparator comparator13 = treeMapTestDriver5.comparator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = treeMapTestDriver0.containsKey((java.lang.Object) comparator13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(comparator7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(comparator13);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test098");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        java.lang.Object obj6 = treeMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        int int8 = treeMapTestDriver7.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver10 = new experiment.util.TreeMapTestDriver();
        int int11 = treeMapTestDriver10.size();
        experiment.util.Comparator comparator12 = treeMapTestDriver10.comparator();
        experiment.util.Set set13 = treeMapTestDriver10.keySet();
        java.lang.Object obj15 = treeMapTestDriver10.remove((java.lang.Object) (short) 1);
        treeMapTestDriver10.clear();
        java.lang.Object obj17 = treeMapTestDriver7.put((java.lang.Object) 1.0d, (java.lang.Object) treeMapTestDriver10);
        experiment.util.Set set18 = treeMapTestDriver10.entrySet();
        int int19 = treeMapTestDriver10.size();
        experiment.util.Collection collection20 = treeMapTestDriver10.values();
        treeMapTestDriver10.clear();
        java.lang.Class<?> wildcardClass22 = treeMapTestDriver10.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = treeMapTestDriver0.containsKey((java.lang.Object) wildcardClass22);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test099");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        java.lang.Object obj5 = treeMapTestDriver0.remove((java.lang.Object) 100);
        int int6 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        int int8 = treeMapTestDriver7.size();
        experiment.util.Comparator comparator9 = treeMapTestDriver7.comparator();
        experiment.util.Set set10 = treeMapTestDriver7.keySet();
        int int11 = treeMapTestDriver7.size();
        experiment.util.Collection collection12 = treeMapTestDriver7.values();
        boolean boolean13 = treeMapTestDriver7.isEmpty();
        boolean boolean15 = treeMapTestDriver7.containsKey((java.lang.Object) 10.0d);
        experiment.util.TreeMapTestDriver treeMapTestDriver16 = new experiment.util.TreeMapTestDriver();
        int int17 = treeMapTestDriver16.size();
        experiment.util.Comparator comparator18 = treeMapTestDriver16.comparator();
        experiment.util.Set set19 = treeMapTestDriver16.keySet();
        experiment.util.Comparator comparator20 = treeMapTestDriver16.comparator();
        java.lang.Object obj22 = treeMapTestDriver16.remove((java.lang.Object) (short) 100);
        boolean boolean24 = treeMapTestDriver16.containsKey((java.lang.Object) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = treeMapTestDriver0.put((java.lang.Object) treeMapTestDriver7, (java.lang.Object) boolean24);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(comparator18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(comparator20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test100");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver4 = new experiment.util.TreeMapTestDriver();
        int int5 = treeMapTestDriver4.size();
        experiment.util.Comparator comparator6 = treeMapTestDriver4.comparator();
        experiment.util.Set set7 = treeMapTestDriver4.keySet();
        java.lang.Object obj10 = treeMapTestDriver4.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        treeMapTestDriver4.clear();
        java.lang.Object obj12 = treeMapTestDriver0.put((java.lang.Object) (short) 1, (java.lang.Object) treeMapTestDriver4);
        experiment.util.TreeMapTestDriver treeMapTestDriver13 = new experiment.util.TreeMapTestDriver();
        int int14 = treeMapTestDriver13.size();
        experiment.util.Comparator comparator15 = treeMapTestDriver13.comparator();
        experiment.util.Set set16 = treeMapTestDriver13.keySet();
        java.lang.Object obj18 = treeMapTestDriver13.remove((java.lang.Object) (short) 1);
        java.lang.Object obj19 = treeMapTestDriver4.get((java.lang.Object) (short) 1);
        experiment.util.TreeMapTestDriver treeMapTestDriver20 = new experiment.util.TreeMapTestDriver();
        int int21 = treeMapTestDriver20.size();
        experiment.util.Comparator comparator22 = treeMapTestDriver20.comparator();
        int int23 = treeMapTestDriver20.size();
        java.lang.Object obj25 = treeMapTestDriver20.get((java.lang.Object) 0.0d);
        experiment.util.Collection collection26 = treeMapTestDriver20.values();
        treeMapTestDriver20.clear();
        java.lang.Object obj28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = treeMapTestDriver4.put((java.lang.Object) treeMapTestDriver20, obj28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(comparator15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(comparator22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(collection26);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test101");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        int int4 = treeMapTestDriver0.size();
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        experiment.util.Set set6 = treeMapTestDriver0.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        int int8 = treeMapTestDriver7.size();
        experiment.util.Comparator comparator9 = treeMapTestDriver7.comparator();
        experiment.util.Set set10 = treeMapTestDriver7.keySet();
        experiment.util.Comparator comparator11 = treeMapTestDriver7.comparator();
        java.lang.Object obj13 = treeMapTestDriver7.remove((java.lang.Object) (short) 100);
        experiment.util.Collection collection14 = treeMapTestDriver7.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = treeMapTestDriver0.get((java.lang.Object) collection14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.ArrayList cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test102");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        java.lang.Object obj5 = treeMapTestDriver0.remove((java.lang.Object) 100);
        java.lang.Object obj8 = treeMapTestDriver0.put((java.lang.Object) 100L, (java.lang.Object) '#');
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        int int10 = treeMapTestDriver9.size();
        experiment.util.Comparator comparator11 = treeMapTestDriver9.comparator();
        experiment.util.Set set12 = treeMapTestDriver9.keySet();
        java.lang.Object obj14 = treeMapTestDriver9.remove((java.lang.Object) (short) 1);
        boolean boolean15 = treeMapTestDriver9.isEmpty();
        experiment.util.Collection collection16 = treeMapTestDriver9.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = treeMapTestDriver0.remove((java.lang.Object) collection16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.ArrayList cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test103");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        int int3 = treeMapTestDriver0.size();
        java.lang.Object obj5 = treeMapTestDriver0.get((java.lang.Object) 0.0d);
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        int int7 = treeMapTestDriver0.size();
        experiment.util.Set set8 = treeMapTestDriver0.keySet();
        experiment.util.Collection collection9 = treeMapTestDriver0.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver10 = new experiment.util.TreeMapTestDriver();
        int int11 = treeMapTestDriver10.size();
        experiment.util.Comparator comparator12 = treeMapTestDriver10.comparator();
        experiment.util.Set set13 = treeMapTestDriver10.keySet();
        java.lang.Object obj15 = treeMapTestDriver10.remove((java.lang.Object) 100);
        java.lang.Object obj17 = treeMapTestDriver10.get((java.lang.Object) 100);
        treeMapTestDriver10.clear();
        experiment.util.Set set19 = treeMapTestDriver10.keySet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = treeMapTestDriver0.containsKey((java.lang.Object) set19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set19);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test104");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        int int3 = treeMapTestDriver0.size();
        experiment.util.Collection collection4 = treeMapTestDriver0.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver5 = new experiment.util.TreeMapTestDriver();
        int int6 = treeMapTestDriver5.size();
        experiment.util.Comparator comparator7 = treeMapTestDriver5.comparator();
        experiment.util.Set set8 = treeMapTestDriver5.keySet();
        treeMapTestDriver5.clear();
        boolean boolean10 = treeMapTestDriver5.isEmpty();
        experiment.util.Collection collection11 = treeMapTestDriver5.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(comparator7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test105");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        int int3 = treeMapTestDriver0.size();
        experiment.util.Collection collection4 = treeMapTestDriver0.values();
        experiment.util.Comparator comparator5 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver6 = new experiment.util.TreeMapTestDriver();
        int int7 = treeMapTestDriver6.size();
        experiment.util.Comparator comparator8 = treeMapTestDriver6.comparator();
        experiment.util.Set set9 = treeMapTestDriver6.keySet();
        experiment.util.Comparator comparator10 = treeMapTestDriver6.comparator();
        boolean boolean12 = treeMapTestDriver6.containsKey((java.lang.Object) (short) 10);
        experiment.util.Comparator comparator13 = treeMapTestDriver6.comparator();
        experiment.util.Set set14 = treeMapTestDriver6.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(comparator5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(comparator8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(comparator13);
        org.junit.Assert.assertNotNull(set14);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test106");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver4 = new experiment.util.TreeMapTestDriver();
        int int5 = treeMapTestDriver4.size();
        experiment.util.Comparator comparator6 = treeMapTestDriver4.comparator();
        experiment.util.Set set7 = treeMapTestDriver4.keySet();
        java.lang.Object obj10 = treeMapTestDriver4.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        treeMapTestDriver4.clear();
        java.lang.Object obj12 = treeMapTestDriver0.put((java.lang.Object) (short) 1, (java.lang.Object) treeMapTestDriver4);
        int int13 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator14 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver15 = new experiment.util.TreeMapTestDriver();
        int int16 = treeMapTestDriver15.size();
        experiment.util.Comparator comparator17 = treeMapTestDriver15.comparator();
        experiment.util.Set set18 = treeMapTestDriver15.keySet();
        java.lang.Object obj20 = treeMapTestDriver15.remove((java.lang.Object) (short) 1);
        experiment.util.Collection collection21 = treeMapTestDriver15.values();
        experiment.util.Set set22 = treeMapTestDriver15.keySet();
        java.lang.Class<?> wildcardClass23 = treeMapTestDriver15.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = treeMapTestDriver0.remove((java.lang.Object) wildcardClass23);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(comparator14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(comparator17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test107");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        java.lang.Object obj5 = treeMapTestDriver0.remove((java.lang.Object) (short) 1);
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection7 = treeMapTestDriver0.values();
        experiment.util.Set set8 = treeMapTestDriver0.keySet();
        experiment.util.Collection collection9 = treeMapTestDriver0.values();
        experiment.util.Comparator comparator10 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver11 = new experiment.util.TreeMapTestDriver();
        int int12 = treeMapTestDriver11.size();
        experiment.util.Comparator comparator13 = treeMapTestDriver11.comparator();
        experiment.util.Set set14 = treeMapTestDriver11.keySet();
        int int15 = treeMapTestDriver11.size();
        experiment.util.Collection collection16 = treeMapTestDriver11.values();
        experiment.util.Set set17 = treeMapTestDriver11.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver18 = new experiment.util.TreeMapTestDriver();
        int int19 = treeMapTestDriver18.size();
        experiment.util.Comparator comparator20 = treeMapTestDriver18.comparator();
        experiment.util.Set set21 = treeMapTestDriver18.keySet();
        java.lang.Object obj23 = treeMapTestDriver18.remove((java.lang.Object) (short) 1);
        java.lang.Object obj25 = treeMapTestDriver18.remove((java.lang.Object) (short) 100);
        experiment.util.TreeMapTestDriver treeMapTestDriver26 = new experiment.util.TreeMapTestDriver();
        int int27 = treeMapTestDriver26.size();
        experiment.util.Comparator comparator28 = treeMapTestDriver26.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver30 = new experiment.util.TreeMapTestDriver();
        int int31 = treeMapTestDriver30.size();
        experiment.util.Comparator comparator32 = treeMapTestDriver30.comparator();
        experiment.util.Set set33 = treeMapTestDriver30.keySet();
        java.lang.Object obj36 = treeMapTestDriver30.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        treeMapTestDriver30.clear();
        java.lang.Object obj38 = treeMapTestDriver26.put((java.lang.Object) (short) 1, (java.lang.Object) treeMapTestDriver30);
        experiment.util.Comparator comparator39 = treeMapTestDriver26.comparator();
        boolean boolean40 = treeMapTestDriver26.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver41 = new experiment.util.TreeMapTestDriver();
        int int42 = treeMapTestDriver41.size();
        experiment.util.Comparator comparator43 = treeMapTestDriver41.comparator();
        experiment.util.Set set44 = treeMapTestDriver41.keySet();
        experiment.util.Comparator comparator45 = treeMapTestDriver41.comparator();
        java.lang.Object obj47 = treeMapTestDriver41.remove((java.lang.Object) (short) 100);
        experiment.util.Comparator comparator48 = treeMapTestDriver41.comparator();
        experiment.util.Set set49 = treeMapTestDriver41.keySet();
        java.lang.Object obj50 = treeMapTestDriver18.put((java.lang.Object) boolean40, (java.lang.Object) treeMapTestDriver41);
        experiment.util.Set set51 = treeMapTestDriver41.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj52 = treeMapTestDriver0.put((java.lang.Object) set17, (java.lang.Object) set51);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(comparator13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(comparator20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(comparator28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(comparator32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(comparator39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(comparator43);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNull(comparator45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(comparator48);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(set51);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test108");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        java.lang.Object obj6 = treeMapTestDriver0.remove((java.lang.Object) (short) 100);
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        int int8 = treeMapTestDriver7.size();
        experiment.util.Collection collection9 = treeMapTestDriver7.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test109");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        boolean boolean6 = treeMapTestDriver0.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection7 = treeMapTestDriver0.values();
        java.lang.Class<?> wildcardClass8 = collection7.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test110");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver3 = new experiment.util.TreeMapTestDriver();
        int int4 = treeMapTestDriver3.size();
        experiment.util.Comparator comparator5 = treeMapTestDriver3.comparator();
        experiment.util.Set set6 = treeMapTestDriver3.keySet();
        treeMapTestDriver3.clear();
        boolean boolean8 = treeMapTestDriver3.isEmpty();
        experiment.util.Collection collection9 = treeMapTestDriver3.values();
        boolean boolean10 = treeMapTestDriver3.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(comparator5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test111");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver3 = new experiment.util.TreeMapTestDriver();
        int int4 = treeMapTestDriver3.size();
        experiment.util.Comparator comparator5 = treeMapTestDriver3.comparator();
        experiment.util.Set set6 = treeMapTestDriver3.keySet();
        java.lang.Object obj8 = treeMapTestDriver3.remove((java.lang.Object) (short) 1);
        treeMapTestDriver3.clear();
        java.lang.Object obj10 = treeMapTestDriver0.put((java.lang.Object) 1.0d, (java.lang.Object) treeMapTestDriver3);
        experiment.util.TreeMapTestDriver treeMapTestDriver12 = new experiment.util.TreeMapTestDriver();
        int int13 = treeMapTestDriver12.size();
        experiment.util.Comparator comparator14 = treeMapTestDriver12.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver16 = new experiment.util.TreeMapTestDriver();
        int int17 = treeMapTestDriver16.size();
        experiment.util.Comparator comparator18 = treeMapTestDriver16.comparator();
        experiment.util.Set set19 = treeMapTestDriver16.keySet();
        java.lang.Object obj22 = treeMapTestDriver16.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        treeMapTestDriver16.clear();
        java.lang.Object obj24 = treeMapTestDriver12.put((java.lang.Object) (short) 1, (java.lang.Object) treeMapTestDriver16);
        experiment.util.Set set25 = treeMapTestDriver16.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = treeMapTestDriver0.put((java.lang.Object) "hi!", (java.lang.Object) treeMapTestDriver16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(comparator5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(comparator14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(comparator18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(set25);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test112");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        int int3 = treeMapTestDriver0.size();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver5 = new experiment.util.TreeMapTestDriver();
        int int6 = treeMapTestDriver5.size();
        experiment.util.Comparator comparator7 = treeMapTestDriver5.comparator();
        experiment.util.Set set8 = treeMapTestDriver5.keySet();
        java.lang.Object obj10 = treeMapTestDriver5.remove((java.lang.Object) (short) 1);
        experiment.util.Collection collection11 = treeMapTestDriver5.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = treeMapTestDriver0.get((java.lang.Object) collection11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.ArrayList cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(comparator7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test113");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        experiment.util.Set set6 = treeMapTestDriver0.keySet();
        boolean boolean7 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver8 = new experiment.util.TreeMapTestDriver();
        int int9 = treeMapTestDriver8.size();
        treeMapTestDriver8.clear();
        int int11 = treeMapTestDriver8.size();
        experiment.util.Collection collection12 = treeMapTestDriver8.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = treeMapTestDriver0.get((java.lang.Object) collection12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.ArrayList cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test114");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        java.lang.Object obj5 = treeMapTestDriver0.remove((java.lang.Object) 100);
        java.lang.Object obj7 = treeMapTestDriver0.get((java.lang.Object) 100);
        treeMapTestDriver0.clear();
        boolean boolean9 = treeMapTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test115");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        int int3 = treeMapTestDriver0.size();
        java.lang.Object obj5 = treeMapTestDriver0.remove((java.lang.Object) (-1.0f));
        int int6 = treeMapTestDriver0.size();
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test116");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        treeMapTestDriver0.clear();
        treeMapTestDriver0.clear();
        treeMapTestDriver0.clear();
        java.lang.Class<?> wildcardClass7 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test117");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        int int4 = treeMapTestDriver0.size();
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        boolean boolean8 = treeMapTestDriver0.containsKey((java.lang.Object) 10.0d);
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        int int10 = treeMapTestDriver9.size();
        experiment.util.Comparator comparator11 = treeMapTestDriver9.comparator();
        experiment.util.Set set12 = treeMapTestDriver9.keySet();
        treeMapTestDriver9.clear();
        boolean boolean14 = treeMapTestDriver9.isEmpty();
        experiment.util.Collection collection15 = treeMapTestDriver9.values();
        java.lang.Class<?> wildcardClass16 = collection15.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = treeMapTestDriver0.remove((java.lang.Object) wildcardClass16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test118");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.keySet();
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver3 = new experiment.util.TreeMapTestDriver();
        int int4 = treeMapTestDriver3.size();
        experiment.util.Comparator comparator5 = treeMapTestDriver3.comparator();
        experiment.util.Set set6 = treeMapTestDriver3.keySet();
        java.lang.Object obj8 = treeMapTestDriver3.remove((java.lang.Object) 100);
        java.lang.Object obj10 = treeMapTestDriver3.get((java.lang.Object) 100);
        treeMapTestDriver3.clear();
        experiment.util.Set set12 = treeMapTestDriver3.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver13 = new experiment.util.TreeMapTestDriver();
        int int14 = treeMapTestDriver13.size();
        experiment.util.Comparator comparator15 = treeMapTestDriver13.comparator();
        experiment.util.Set set16 = treeMapTestDriver13.keySet();
        experiment.util.Comparator comparator17 = treeMapTestDriver13.comparator();
        experiment.util.Collection collection18 = treeMapTestDriver13.values();
        experiment.util.Set set19 = treeMapTestDriver13.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver21 = new experiment.util.TreeMapTestDriver();
        int int22 = treeMapTestDriver21.size();
        experiment.util.Comparator comparator23 = treeMapTestDriver21.comparator();
        experiment.util.Set set24 = treeMapTestDriver21.keySet();
        treeMapTestDriver21.clear();
        java.lang.Class<?> wildcardClass26 = treeMapTestDriver21.getClass();
        java.lang.Object obj27 = treeMapTestDriver13.put((java.lang.Object) 0L, (java.lang.Object) wildcardClass26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = treeMapTestDriver0.put((java.lang.Object) treeMapTestDriver3, obj27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(comparator5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(comparator15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(comparator17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(comparator23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test119");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        java.lang.Object obj6 = treeMapTestDriver0.remove((java.lang.Object) (short) 100);
        experiment.util.Collection collection7 = treeMapTestDriver0.values();
        java.lang.Object obj10 = treeMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) 100L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test120");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        java.lang.Object obj5 = treeMapTestDriver0.remove((java.lang.Object) (short) 1);
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        int int8 = treeMapTestDriver7.size();
        treeMapTestDriver7.clear();
        int int10 = treeMapTestDriver7.size();
        experiment.util.Set set11 = treeMapTestDriver7.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(set11);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test121");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        int int8 = treeMapTestDriver7.size();
        experiment.util.Comparator comparator9 = treeMapTestDriver7.comparator();
        experiment.util.Set set10 = treeMapTestDriver7.keySet();
        experiment.util.Comparator comparator11 = treeMapTestDriver7.comparator();
        java.lang.Object obj13 = treeMapTestDriver7.remove((java.lang.Object) (short) 100);
        experiment.util.Comparator comparator14 = treeMapTestDriver7.comparator();
        experiment.util.Set set15 = treeMapTestDriver7.keySet();
        java.lang.Object obj16 = treeMapTestDriver0.put((java.lang.Object) "hi!", (java.lang.Object) treeMapTestDriver7);
        experiment.util.TreeMapTestDriver treeMapTestDriver17 = new experiment.util.TreeMapTestDriver();
        int int18 = treeMapTestDriver17.size();
        experiment.util.Comparator comparator19 = treeMapTestDriver17.comparator();
        experiment.util.Set set20 = treeMapTestDriver17.keySet();
        experiment.util.Comparator comparator21 = treeMapTestDriver17.comparator();
        experiment.util.Collection collection22 = treeMapTestDriver17.values();
        experiment.util.Set set23 = treeMapTestDriver17.keySet();
        experiment.util.Set set24 = treeMapTestDriver17.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = treeMapTestDriver7.remove((java.lang.Object) set24);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(comparator14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(comparator19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(comparator21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(set24);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test122");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver2 = new experiment.util.TreeMapTestDriver();
        int int3 = treeMapTestDriver2.size();
        experiment.util.Comparator comparator4 = treeMapTestDriver2.comparator();
        experiment.util.Set set5 = treeMapTestDriver2.keySet();
        java.lang.Object obj8 = treeMapTestDriver2.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        int int10 = treeMapTestDriver9.size();
        experiment.util.Comparator comparator11 = treeMapTestDriver9.comparator();
        experiment.util.Set set12 = treeMapTestDriver9.keySet();
        int int13 = treeMapTestDriver9.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver14 = new experiment.util.TreeMapTestDriver();
        int int15 = treeMapTestDriver14.size();
        experiment.util.Comparator comparator16 = treeMapTestDriver14.comparator();
        experiment.util.Set set17 = treeMapTestDriver14.keySet();
        java.lang.Object obj20 = treeMapTestDriver14.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        java.lang.Object obj21 = treeMapTestDriver9.get((java.lang.Object) 0.0f);
        java.lang.Object obj23 = treeMapTestDriver9.remove((java.lang.Object) '#');
        experiment.util.TreeMapTestDriver treeMapTestDriver25 = new experiment.util.TreeMapTestDriver();
        int int26 = treeMapTestDriver25.size();
        experiment.util.Comparator comparator27 = treeMapTestDriver25.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver29 = new experiment.util.TreeMapTestDriver();
        int int30 = treeMapTestDriver29.size();
        experiment.util.Comparator comparator31 = treeMapTestDriver29.comparator();
        experiment.util.Set set32 = treeMapTestDriver29.keySet();
        java.lang.Object obj35 = treeMapTestDriver29.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        treeMapTestDriver29.clear();
        java.lang.Object obj37 = treeMapTestDriver25.put((java.lang.Object) (short) 1, (java.lang.Object) treeMapTestDriver29);
        int int38 = treeMapTestDriver29.size();
        experiment.util.Set set39 = treeMapTestDriver29.keySet();
        java.lang.Object obj40 = treeMapTestDriver9.put((java.lang.Object) 0L, (java.lang.Object) set39);
        java.lang.Object obj41 = treeMapTestDriver0.put((java.lang.Object) 0.0f, (java.lang.Object) treeMapTestDriver9);
        experiment.util.TreeMapTestDriver treeMapTestDriver42 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set43 = treeMapTestDriver42.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver44 = new experiment.util.TreeMapTestDriver();
        int int45 = treeMapTestDriver44.size();
        experiment.util.Comparator comparator46 = treeMapTestDriver44.comparator();
        experiment.util.Set set47 = treeMapTestDriver44.keySet();
        java.lang.Object obj50 = treeMapTestDriver44.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        experiment.util.TreeMapTestDriver treeMapTestDriver51 = new experiment.util.TreeMapTestDriver();
        int int52 = treeMapTestDriver51.size();
        experiment.util.Comparator comparator53 = treeMapTestDriver51.comparator();
        experiment.util.Set set54 = treeMapTestDriver51.keySet();
        int int55 = treeMapTestDriver51.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver56 = new experiment.util.TreeMapTestDriver();
        int int57 = treeMapTestDriver56.size();
        experiment.util.Comparator comparator58 = treeMapTestDriver56.comparator();
        experiment.util.Set set59 = treeMapTestDriver56.keySet();
        java.lang.Object obj62 = treeMapTestDriver56.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        java.lang.Object obj63 = treeMapTestDriver51.get((java.lang.Object) 0.0f);
        java.lang.Object obj65 = treeMapTestDriver51.remove((java.lang.Object) '#');
        experiment.util.TreeMapTestDriver treeMapTestDriver67 = new experiment.util.TreeMapTestDriver();
        int int68 = treeMapTestDriver67.size();
        experiment.util.Comparator comparator69 = treeMapTestDriver67.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver71 = new experiment.util.TreeMapTestDriver();
        int int72 = treeMapTestDriver71.size();
        experiment.util.Comparator comparator73 = treeMapTestDriver71.comparator();
        experiment.util.Set set74 = treeMapTestDriver71.keySet();
        java.lang.Object obj77 = treeMapTestDriver71.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        treeMapTestDriver71.clear();
        java.lang.Object obj79 = treeMapTestDriver67.put((java.lang.Object) (short) 1, (java.lang.Object) treeMapTestDriver71);
        int int80 = treeMapTestDriver71.size();
        experiment.util.Set set81 = treeMapTestDriver71.keySet();
        java.lang.Object obj82 = treeMapTestDriver51.put((java.lang.Object) 0L, (java.lang.Object) set81);
        java.lang.Object obj83 = treeMapTestDriver42.put((java.lang.Object) 0.0f, (java.lang.Object) treeMapTestDriver51);
        treeMapTestDriver51.clear();
        experiment.util.Set set85 = treeMapTestDriver51.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj86 = treeMapTestDriver9.remove((java.lang.Object) set85);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(comparator16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(comparator27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(comparator31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNull(comparator46);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNull(comparator53);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNull(comparator58);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNull(comparator69);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNull(comparator73);
        org.junit.Assert.assertNotNull(set74);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertNotNull(set81);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertNotNull(set85);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test123");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        int int3 = treeMapTestDriver0.size();
        java.lang.Object obj5 = treeMapTestDriver0.get((java.lang.Object) 0.0d);
        experiment.util.TreeMapTestDriver treeMapTestDriver6 = new experiment.util.TreeMapTestDriver();
        int int7 = treeMapTestDriver6.size();
        experiment.util.Comparator comparator8 = treeMapTestDriver6.comparator();
        experiment.util.Set set9 = treeMapTestDriver6.keySet();
        java.lang.Object obj11 = treeMapTestDriver6.remove((java.lang.Object) (short) 1);
        experiment.util.Collection collection12 = treeMapTestDriver6.values();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = treeMapTestDriver0.containsKey((java.lang.Object) collection12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.ArrayList cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(comparator8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test124");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        boolean boolean6 = treeMapTestDriver0.containsKey((java.lang.Object) (short) 10);
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver8 = new experiment.util.TreeMapTestDriver();
        int int9 = treeMapTestDriver8.size();
        experiment.util.Comparator comparator10 = treeMapTestDriver8.comparator();
        experiment.util.Set set11 = treeMapTestDriver8.keySet();
        java.lang.Object obj13 = treeMapTestDriver8.remove((java.lang.Object) (short) 1);
        java.lang.Object obj15 = treeMapTestDriver8.remove((java.lang.Object) (short) 100);
        int int16 = treeMapTestDriver8.size();
        experiment.util.Comparator comparator17 = treeMapTestDriver8.comparator();
        experiment.util.Set set18 = treeMapTestDriver8.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver19 = new experiment.util.TreeMapTestDriver();
        int int20 = treeMapTestDriver19.size();
        experiment.util.Comparator comparator21 = treeMapTestDriver19.comparator();
        experiment.util.Set set22 = treeMapTestDriver19.keySet();
        experiment.util.Comparator comparator23 = treeMapTestDriver19.comparator();
        experiment.util.Collection collection24 = treeMapTestDriver19.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver26 = new experiment.util.TreeMapTestDriver();
        int int27 = treeMapTestDriver26.size();
        experiment.util.Comparator comparator28 = treeMapTestDriver26.comparator();
        experiment.util.Set set29 = treeMapTestDriver26.keySet();
        experiment.util.Comparator comparator30 = treeMapTestDriver26.comparator();
        java.lang.Object obj32 = treeMapTestDriver26.remove((java.lang.Object) (short) 100);
        experiment.util.Comparator comparator33 = treeMapTestDriver26.comparator();
        experiment.util.Set set34 = treeMapTestDriver26.keySet();
        java.lang.Object obj35 = treeMapTestDriver19.put((java.lang.Object) "hi!", (java.lang.Object) treeMapTestDriver26);
        experiment.util.Set set36 = treeMapTestDriver26.entrySet();
        java.lang.Class<?> wildcardClass37 = set36.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj38 = treeMapTestDriver0.put((java.lang.Object) set18, (java.lang.Object) wildcardClass37);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(comparator17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(comparator21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(comparator23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(comparator28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(comparator30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(comparator33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test125");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        int int3 = treeMapTestDriver0.size();
        java.lang.Object obj5 = treeMapTestDriver0.get((java.lang.Object) 0.0d);
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        experiment.util.Comparator comparator7 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator8 = treeMapTestDriver0.comparator();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(comparator7);
        org.junit.Assert.assertNull(comparator8);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test126");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        int int4 = treeMapTestDriver0.size();
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver6 = new experiment.util.TreeMapTestDriver();
        int int7 = treeMapTestDriver6.size();
        experiment.util.Comparator comparator8 = treeMapTestDriver6.comparator();
        experiment.util.Set set9 = treeMapTestDriver6.keySet();
        java.lang.Object obj12 = treeMapTestDriver6.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        treeMapTestDriver6.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver14 = new experiment.util.TreeMapTestDriver();
        int int15 = treeMapTestDriver14.size();
        experiment.util.Comparator comparator16 = treeMapTestDriver14.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver18 = new experiment.util.TreeMapTestDriver();
        int int19 = treeMapTestDriver18.size();
        experiment.util.Comparator comparator20 = treeMapTestDriver18.comparator();
        experiment.util.Set set21 = treeMapTestDriver18.keySet();
        java.lang.Object obj24 = treeMapTestDriver18.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        treeMapTestDriver18.clear();
        java.lang.Object obj26 = treeMapTestDriver14.put((java.lang.Object) (short) 1, (java.lang.Object) treeMapTestDriver18);
        boolean boolean27 = treeMapTestDriver6.containsKey((java.lang.Object) (short) 1);
        boolean boolean28 = treeMapTestDriver0.containsKey((java.lang.Object) boolean27);
        experiment.util.TreeMapTestDriver treeMapTestDriver29 = new experiment.util.TreeMapTestDriver();
        int int30 = treeMapTestDriver29.size();
        experiment.util.Comparator comparator31 = treeMapTestDriver29.comparator();
        experiment.util.Set set32 = treeMapTestDriver29.keySet();
        treeMapTestDriver29.clear();
        experiment.util.Set set34 = treeMapTestDriver29.keySet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver29);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(comparator8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(comparator16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(comparator20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(comparator31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(set34);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test127");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        java.lang.Object obj6 = treeMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        boolean boolean7 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection8 = treeMapTestDriver0.values();
        treeMapTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1321793073_1024_0.test128");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver2 = new experiment.util.TreeMapTestDriver();
        int int3 = treeMapTestDriver2.size();
        experiment.util.Comparator comparator4 = treeMapTestDriver2.comparator();
        experiment.util.Set set5 = treeMapTestDriver2.keySet();
        java.lang.Object obj7 = treeMapTestDriver2.remove((java.lang.Object) (short) 1);
        boolean boolean8 = treeMapTestDriver2.isEmpty();
        experiment.util.Collection collection9 = treeMapTestDriver2.values();
        experiment.util.Comparator comparator10 = treeMapTestDriver2.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver11 = new experiment.util.TreeMapTestDriver();
        int int12 = treeMapTestDriver11.size();
        experiment.util.Comparator comparator13 = treeMapTestDriver11.comparator();
        experiment.util.Set set14 = treeMapTestDriver11.keySet();
        java.lang.Object obj16 = treeMapTestDriver11.remove((java.lang.Object) 100);
        java.lang.Object obj19 = treeMapTestDriver11.put((java.lang.Object) 100L, (java.lang.Object) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = treeMapTestDriver0.put((java.lang.Object) comparator10, (java.lang.Object) treeMapTestDriver11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(comparator13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
    }

}
