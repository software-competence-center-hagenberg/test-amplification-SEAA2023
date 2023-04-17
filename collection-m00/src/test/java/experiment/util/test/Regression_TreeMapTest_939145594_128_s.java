package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_TreeMapTest_939145594_128_s {

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
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test001");
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
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test002");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test003");
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
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test004");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver3 = new experiment.util.TreeMapTestDriver();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test005");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        java.lang.Object obj4 = treeMapTestDriver0.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test006");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Set set2 = treeMapTestDriver0.entrySet();
        experiment.util.Set set3 = treeMapTestDriver0.entrySet();
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = treeMapTestDriver0.put(obj4, (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test007");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass5 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test008");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver5 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver5.clear();
        java.lang.Class<?> wildcardClass7 = treeMapTestDriver5.getClass();
        java.lang.Object obj8 = treeMapTestDriver0.put((java.lang.Object) 'a', (java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = treeMapTestDriver0.put(obj9, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Object cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test009");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Set set2 = treeMapTestDriver0.entrySet();
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver4 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set5 = treeMapTestDriver4.entrySet();
        treeMapTestDriver4.clear();
        experiment.util.Set set7 = treeMapTestDriver4.keySet();
        treeMapTestDriver4.clear();
        experiment.util.Set set9 = treeMapTestDriver4.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test010");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        treeMapTestDriver0.clear();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver4 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set5 = treeMapTestDriver4.entrySet();
        treeMapTestDriver4.clear();
        experiment.util.Set set7 = treeMapTestDriver4.keySet();
        treeMapTestDriver4.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test011");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        treeMapTestDriver0.clear();
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = treeMapTestDriver0.containsKey(obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test012");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver3 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set4 = treeMapTestDriver3.entrySet();
        java.lang.Object obj7 = treeMapTestDriver3.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test013");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Set set2 = treeMapTestDriver0.entrySet();
        boolean boolean4 = treeMapTestDriver0.containsKey((java.lang.Object) (-1));
        treeMapTestDriver0.clear();
        experiment.util.Set set6 = treeMapTestDriver0.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set8 = treeMapTestDriver7.entrySet();
        experiment.util.Comparator comparator9 = treeMapTestDriver7.comparator();
        java.lang.Object obj12 = treeMapTestDriver7.put((java.lang.Object) 0L, (java.lang.Object) "hi!");
        boolean boolean13 = treeMapTestDriver7.isEmpty();
        boolean boolean14 = treeMapTestDriver7.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test014");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        java.lang.Object obj5 = treeMapTestDriver0.put((java.lang.Object) 0L, (java.lang.Object) "hi!");
        int int6 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set8 = treeMapTestDriver7.entrySet();
        experiment.util.Set set9 = treeMapTestDriver7.entrySet();
        boolean boolean11 = treeMapTestDriver7.containsKey((java.lang.Object) (-1));
        treeMapTestDriver7.clear();
        experiment.util.Set set13 = treeMapTestDriver7.entrySet();
        experiment.util.Set set14 = treeMapTestDriver7.keySet();
        java.lang.Object obj16 = treeMapTestDriver7.remove((java.lang.Object) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = treeMapTestDriver0.containsKey((java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to java.lang.Float");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test015");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        java.lang.Object obj5 = treeMapTestDriver0.put((java.lang.Object) 0L, (java.lang.Object) "hi!");
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        java.lang.Class<?> wildcardClass7 = collection6.getClass();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test016");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Set set2 = treeMapTestDriver0.entrySet();
        treeMapTestDriver0.clear();
        experiment.util.Collection collection4 = treeMapTestDriver0.values();
        java.lang.Class<?> wildcardClass5 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test017");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        java.lang.Object obj5 = treeMapTestDriver0.put((java.lang.Object) 0L, (java.lang.Object) "hi!");
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        boolean boolean7 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver8 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set9 = treeMapTestDriver8.entrySet();
        treeMapTestDriver8.clear();
        java.lang.Class<?> wildcardClass11 = treeMapTestDriver8.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test018");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver5 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver5.clear();
        java.lang.Class<?> wildcardClass7 = treeMapTestDriver5.getClass();
        java.lang.Object obj8 = treeMapTestDriver0.put((java.lang.Object) 'a', (java.lang.Object) wildcardClass7);
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set10 = treeMapTestDriver9.entrySet();
        experiment.util.Comparator comparator11 = treeMapTestDriver9.comparator();
        experiment.util.Comparator comparator12 = treeMapTestDriver9.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver14 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver14.clear();
        java.lang.Class<?> wildcardClass16 = treeMapTestDriver14.getClass();
        java.lang.Object obj17 = treeMapTestDriver9.put((java.lang.Object) 'a', (java.lang.Object) wildcardClass16);
        boolean boolean18 = treeMapTestDriver9.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test019");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        treeMapTestDriver0.clear();
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) (-1.0f));
        int int8 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set10 = treeMapTestDriver9.entrySet();
        treeMapTestDriver9.clear();
        experiment.util.Comparator comparator12 = treeMapTestDriver9.comparator();
        treeMapTestDriver9.clear();
        boolean boolean14 = treeMapTestDriver9.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test020");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) 1);
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        java.lang.Object obj4 = null;
        experiment.util.TreeMapTestDriver treeMapTestDriver5 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set6 = treeMapTestDriver5.entrySet();
        experiment.util.Comparator comparator7 = treeMapTestDriver5.comparator();
        java.lang.Object obj9 = treeMapTestDriver5.remove((java.lang.Object) 0.0f);
        treeMapTestDriver5.clear();
        java.lang.Object obj12 = treeMapTestDriver5.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj14 = treeMapTestDriver5.get((java.lang.Object) (short) -1);
        int int15 = treeMapTestDriver5.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = treeMapTestDriver0.put(obj4, (java.lang.Object) treeMapTestDriver5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(comparator7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test021");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        treeMapTestDriver0.clear();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        treeMapTestDriver0.clear();
        experiment.util.Set set5 = treeMapTestDriver0.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver6 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set7 = treeMapTestDriver6.entrySet();
        experiment.util.Set set8 = treeMapTestDriver6.entrySet();
        boolean boolean10 = treeMapTestDriver6.containsKey((java.lang.Object) (-1));
        treeMapTestDriver6.clear();
        experiment.util.Set set12 = treeMapTestDriver6.entrySet();
        experiment.util.Set set13 = treeMapTestDriver6.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(set13);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test022");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        java.lang.Object obj5 = treeMapTestDriver0.put((java.lang.Object) 0L, (java.lang.Object) "hi!");
        experiment.util.TreeMapTestDriver treeMapTestDriver6 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set7 = treeMapTestDriver6.entrySet();
        experiment.util.Set set8 = treeMapTestDriver6.entrySet();
        experiment.util.Set set9 = treeMapTestDriver6.entrySet();
        java.lang.Object obj11 = treeMapTestDriver6.get((java.lang.Object) 100);
        experiment.util.TreeMapTestDriver treeMapTestDriver12 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set13 = treeMapTestDriver12.entrySet();
        experiment.util.Comparator comparator14 = treeMapTestDriver12.comparator();
        java.lang.Object obj17 = treeMapTestDriver12.put((java.lang.Object) 0L, (java.lang.Object) "hi!");
        int int18 = treeMapTestDriver12.size();
        java.lang.Object obj19 = treeMapTestDriver6.remove((java.lang.Object) int18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = treeMapTestDriver0.remove(obj19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(comparator14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test023");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver5 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver5.clear();
        java.lang.Class<?> wildcardClass7 = treeMapTestDriver5.getClass();
        java.lang.Object obj8 = treeMapTestDriver0.put((java.lang.Object) 'a', (java.lang.Object) wildcardClass7);
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set10 = treeMapTestDriver9.entrySet();
        experiment.util.Comparator comparator11 = treeMapTestDriver9.comparator();
        java.lang.Object obj14 = treeMapTestDriver9.put((java.lang.Object) 0L, (java.lang.Object) "hi!");
        boolean boolean15 = treeMapTestDriver9.isEmpty();
        experiment.util.Comparator comparator16 = treeMapTestDriver9.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(comparator16);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test024");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver2 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set3 = treeMapTestDriver2.entrySet();
        treeMapTestDriver2.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set3);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test025");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        treeMapTestDriver0.clear();
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = treeMapTestDriver0.get((java.lang.Object) (short) -1);
        int int10 = treeMapTestDriver0.size();
        experiment.util.Collection collection11 = treeMapTestDriver0.values();
        java.lang.Class<?> wildcardClass12 = collection11.getClass();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test026");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Set set2 = treeMapTestDriver0.entrySet();
        experiment.util.Set set3 = treeMapTestDriver0.entrySet();
        java.lang.Object obj5 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.TreeMapTestDriver treeMapTestDriver6 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set7 = treeMapTestDriver6.entrySet();
        experiment.util.Comparator comparator8 = treeMapTestDriver6.comparator();
        java.lang.Object obj11 = treeMapTestDriver6.put((java.lang.Object) 0L, (java.lang.Object) "hi!");
        experiment.util.Collection collection12 = treeMapTestDriver6.values();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(comparator8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test027");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        treeMapTestDriver0.clear();
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver5 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver5.clear();
        java.lang.Class<?> wildcardClass7 = treeMapTestDriver5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = treeMapTestDriver0.get((java.lang.Object) wildcardClass7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test028");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        treeMapTestDriver0.clear();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver5 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set6 = treeMapTestDriver5.entrySet();
        treeMapTestDriver5.clear();
        experiment.util.Comparator comparator8 = treeMapTestDriver5.comparator();
        treeMapTestDriver5.clear();
        treeMapTestDriver5.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(comparator8);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test029");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Set set2 = treeMapTestDriver0.entrySet();
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver4 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set5 = treeMapTestDriver4.entrySet();
        experiment.util.Comparator comparator6 = treeMapTestDriver4.comparator();
        java.lang.Object obj8 = treeMapTestDriver4.remove((java.lang.Object) 0.0f);
        treeMapTestDriver4.clear();
        java.lang.Object obj11 = treeMapTestDriver4.remove((java.lang.Object) (-1.0f));
        int int12 = treeMapTestDriver4.size();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test030");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        treeMapTestDriver0.clear();
        boolean boolean7 = treeMapTestDriver0.containsKey((java.lang.Object) (short) 10);
        int int8 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set10 = treeMapTestDriver9.entrySet();
        treeMapTestDriver9.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver13 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set14 = treeMapTestDriver13.entrySet();
        java.lang.Object obj15 = treeMapTestDriver9.put((java.lang.Object) (-1L), (java.lang.Object) set14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = treeMapTestDriver0.get((java.lang.Object) set14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test031");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Set set2 = treeMapTestDriver0.entrySet();
        boolean boolean4 = treeMapTestDriver0.containsKey((java.lang.Object) (-1));
        treeMapTestDriver0.clear();
        experiment.util.Set set6 = treeMapTestDriver0.entrySet();
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        treeMapTestDriver0.clear();
        treeMapTestDriver0.clear();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test032");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Set set2 = treeMapTestDriver0.entrySet();
        boolean boolean4 = treeMapTestDriver0.containsKey((java.lang.Object) (-1));
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver6 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set7 = treeMapTestDriver6.entrySet();
        experiment.util.Set set8 = treeMapTestDriver6.entrySet();
        experiment.util.Set set9 = treeMapTestDriver6.entrySet();
        int int10 = treeMapTestDriver6.size();
        treeMapTestDriver6.clear();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test033");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver4 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set5 = treeMapTestDriver4.entrySet();
        java.lang.Object obj6 = treeMapTestDriver0.put((java.lang.Object) (-1L), (java.lang.Object) set5);
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set8 = treeMapTestDriver7.entrySet();
        experiment.util.Comparator comparator9 = treeMapTestDriver7.comparator();
        java.lang.Object obj11 = treeMapTestDriver7.remove((java.lang.Object) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to java.lang.Float");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test034");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) 1);
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        int int4 = treeMapTestDriver0.size();
        experiment.util.Set set5 = treeMapTestDriver0.entrySet();
        experiment.util.Comparator comparator6 = treeMapTestDriver0.comparator();
        java.lang.Object obj9 = treeMapTestDriver0.put((java.lang.Object) 1.0f, (java.lang.Object) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = treeMapTestDriver0.remove((java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to java.lang.Double");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test035");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        treeMapTestDriver0.clear();
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = treeMapTestDriver0.get((java.lang.Object) (short) -1);
        int int10 = treeMapTestDriver0.size();
        experiment.util.Collection collection11 = treeMapTestDriver0.values();
        boolean boolean12 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver13 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set14 = treeMapTestDriver13.entrySet();
        experiment.util.Comparator comparator15 = treeMapTestDriver13.comparator();
        java.lang.Object obj17 = treeMapTestDriver13.remove((java.lang.Object) 0.0f);
        treeMapTestDriver13.clear();
        java.lang.Object obj20 = treeMapTestDriver13.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj22 = treeMapTestDriver13.get((java.lang.Object) (short) -1);
        int int23 = treeMapTestDriver13.size();
        experiment.util.Collection collection24 = treeMapTestDriver13.values();
        boolean boolean25 = treeMapTestDriver13.isEmpty();
        experiment.util.Collection collection26 = treeMapTestDriver13.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = treeMapTestDriver0.remove((java.lang.Object) collection26);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.ArrayList cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(comparator15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(collection26);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test036");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        int int2 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Collection collection4 = treeMapTestDriver0.values();
        java.lang.Class<?> wildcardClass5 = collection4.getClass();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test037");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) 1);
        experiment.util.Set set3 = treeMapTestDriver0.entrySet();
        experiment.util.Set set4 = treeMapTestDriver0.keySet();
        experiment.util.Comparator comparator5 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver6 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set7 = treeMapTestDriver6.entrySet();
        experiment.util.Set set8 = treeMapTestDriver6.entrySet();
        experiment.util.Set set9 = treeMapTestDriver6.entrySet();
        boolean boolean11 = treeMapTestDriver6.containsKey((java.lang.Object) "");
        experiment.util.Collection collection12 = treeMapTestDriver6.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver13 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set14 = treeMapTestDriver13.entrySet();
        experiment.util.Set set15 = treeMapTestDriver13.entrySet();
        treeMapTestDriver13.clear();
        experiment.util.Collection collection17 = treeMapTestDriver13.values();
        experiment.util.Collection collection18 = treeMapTestDriver13.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = treeMapTestDriver0.put((java.lang.Object) treeMapTestDriver6, (java.lang.Object) treeMapTestDriver13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(comparator5);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test038");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) 1);
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        java.lang.Object obj5 = treeMapTestDriver0.get((java.lang.Object) '4');
        experiment.util.TreeMapTestDriver treeMapTestDriver6 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set7 = treeMapTestDriver6.entrySet();
        experiment.util.Set set8 = treeMapTestDriver6.entrySet();
        experiment.util.Set set9 = treeMapTestDriver6.entrySet();
        int int10 = treeMapTestDriver6.size();
        treeMapTestDriver6.clear();
        int int12 = treeMapTestDriver6.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test039");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Set set2 = treeMapTestDriver0.entrySet();
        boolean boolean4 = treeMapTestDriver0.containsKey((java.lang.Object) (-1));
        treeMapTestDriver0.clear();
        experiment.util.Set set6 = treeMapTestDriver0.entrySet();
        boolean boolean7 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set10 = treeMapTestDriver9.entrySet();
        experiment.util.Set set11 = treeMapTestDriver9.entrySet();
        boolean boolean13 = treeMapTestDriver9.containsKey((java.lang.Object) (-1));
        treeMapTestDriver9.clear();
        experiment.util.Set set15 = treeMapTestDriver9.entrySet();
        experiment.util.Collection collection16 = treeMapTestDriver9.values();
        java.lang.Object obj17 = treeMapTestDriver0.put((java.lang.Object) 10.0d, (java.lang.Object) treeMapTestDriver9);
        experiment.util.TreeMapTestDriver treeMapTestDriver18 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set19 = treeMapTestDriver18.entrySet();
        treeMapTestDriver18.clear();
        experiment.util.Set set21 = treeMapTestDriver18.keySet();
        experiment.util.Comparator comparator22 = treeMapTestDriver18.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(comparator22);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test040");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Set set2 = treeMapTestDriver0.entrySet();
        experiment.util.Set set3 = treeMapTestDriver0.entrySet();
        int int4 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver5 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set6 = treeMapTestDriver5.entrySet();
        experiment.util.Set set7 = treeMapTestDriver5.entrySet();
        experiment.util.Set set8 = treeMapTestDriver5.entrySet();
        treeMapTestDriver5.clear();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test041");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Set set2 = treeMapTestDriver0.entrySet();
        experiment.util.Set set3 = treeMapTestDriver0.entrySet();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) "");
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver7.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test042");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        java.lang.Object obj5 = treeMapTestDriver0.put((java.lang.Object) 0L, (java.lang.Object) "hi!");
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set8 = treeMapTestDriver7.entrySet();
        treeMapTestDriver7.clear();
        java.lang.Class<?> wildcardClass10 = treeMapTestDriver7.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test043");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.entrySet();
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver5 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set6 = treeMapTestDriver5.entrySet();
        treeMapTestDriver5.clear();
        experiment.util.Set set8 = treeMapTestDriver5.keySet();
        treeMapTestDriver5.clear();
        experiment.util.Set set10 = treeMapTestDriver5.entrySet();
        java.lang.Class<?> wildcardClass11 = treeMapTestDriver5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = treeMapTestDriver0.put((java.lang.Object) wildcardClass11, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test044");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver6 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set7 = treeMapTestDriver6.entrySet();
        treeMapTestDriver6.clear();
        java.lang.Class<?> wildcardClass9 = treeMapTestDriver6.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test045");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        treeMapTestDriver0.clear();
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = treeMapTestDriver0.get((java.lang.Object) (short) -1);
        int int10 = treeMapTestDriver0.size();
        experiment.util.Collection collection11 = treeMapTestDriver0.values();
        boolean boolean12 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection13 = treeMapTestDriver0.values();
        experiment.util.Collection collection14 = treeMapTestDriver0.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver15 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set16 = treeMapTestDriver15.entrySet();
        experiment.util.Set set17 = treeMapTestDriver15.entrySet();
        experiment.util.Set set18 = treeMapTestDriver15.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver19 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set20 = treeMapTestDriver19.entrySet();
        experiment.util.Comparator comparator21 = treeMapTestDriver19.comparator();
        experiment.util.Comparator comparator22 = treeMapTestDriver19.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver24 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver24.clear();
        java.lang.Class<?> wildcardClass26 = treeMapTestDriver24.getClass();
        java.lang.Object obj27 = treeMapTestDriver19.put((java.lang.Object) 'a', (java.lang.Object) wildcardClass26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = treeMapTestDriver0.put((java.lang.Object) treeMapTestDriver15, (java.lang.Object) wildcardClass26);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(comparator21);
        org.junit.Assert.assertNull(comparator22);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test046");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        java.lang.Object obj5 = treeMapTestDriver0.put((java.lang.Object) 0L, (java.lang.Object) "hi!");
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        experiment.util.Comparator comparator7 = treeMapTestDriver0.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = treeMapTestDriver0.remove((java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to java.lang.Double");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(comparator7);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test047");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver5 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set6 = treeMapTestDriver5.entrySet();
        experiment.util.Set set7 = treeMapTestDriver5.entrySet();
        experiment.util.Set set8 = treeMapTestDriver5.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = treeMapTestDriver0.remove((java.lang.Object) set8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test048");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Set set2 = treeMapTestDriver0.entrySet();
        boolean boolean4 = treeMapTestDriver0.containsKey((java.lang.Object) (-1));
        treeMapTestDriver0.clear();
        experiment.util.Set set6 = treeMapTestDriver0.entrySet();
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        treeMapTestDriver0.clear();
        experiment.util.Collection collection9 = treeMapTestDriver0.values();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test049");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Set set2 = treeMapTestDriver0.entrySet();
        boolean boolean4 = treeMapTestDriver0.containsKey((java.lang.Object) false);
        boolean boolean6 = treeMapTestDriver0.containsKey((java.lang.Object) true);
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test050");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        java.lang.Object obj4 = treeMapTestDriver0.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        experiment.util.Set set5 = treeMapTestDriver0.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to java.lang.Boolean");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test051");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Set set2 = treeMapTestDriver0.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver3 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set4 = treeMapTestDriver3.entrySet();
        experiment.util.Comparator comparator5 = treeMapTestDriver3.comparator();
        java.lang.Object obj7 = treeMapTestDriver3.remove((java.lang.Object) 0.0f);
        treeMapTestDriver3.clear();
        java.lang.Object obj10 = treeMapTestDriver3.remove((java.lang.Object) (-1.0f));
        int int11 = treeMapTestDriver3.size();
        experiment.util.Collection collection12 = treeMapTestDriver3.values();
        experiment.util.Comparator comparator13 = treeMapTestDriver3.comparator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(comparator5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(comparator13);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test052");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        int int2 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Collection collection4 = treeMapTestDriver0.values();
        int int5 = treeMapTestDriver0.size();
        java.lang.Class<?> wildcardClass6 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test053");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) 1);
        experiment.util.Set set3 = treeMapTestDriver0.entrySet();
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = treeMapTestDriver0.containsKey(obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(set3);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test054");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver4 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set5 = treeMapTestDriver4.entrySet();
        java.lang.Object obj6 = treeMapTestDriver0.put((java.lang.Object) (-1L), (java.lang.Object) set5);
        experiment.util.Comparator comparator7 = treeMapTestDriver0.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = comparator7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(comparator7);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test055");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        java.lang.Object obj5 = treeMapTestDriver0.put((java.lang.Object) 0L, (java.lang.Object) "hi!");
        int int6 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set8 = treeMapTestDriver7.entrySet();
        experiment.util.Comparator comparator9 = treeMapTestDriver7.comparator();
        java.lang.Object obj11 = treeMapTestDriver7.remove((java.lang.Object) 0.0f);
        treeMapTestDriver7.clear();
        java.lang.Object obj14 = treeMapTestDriver7.remove((java.lang.Object) (-1.0f));
        int int15 = treeMapTestDriver7.size();
        experiment.util.Collection collection16 = treeMapTestDriver7.values();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = treeMapTestDriver0.containsKey((java.lang.Object) collection16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.ArrayList cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test056");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Set set2 = treeMapTestDriver0.entrySet();
        experiment.util.Set set3 = treeMapTestDriver0.entrySet();
        int int4 = treeMapTestDriver0.size();
        treeMapTestDriver0.clear();
        java.lang.Class<?> wildcardClass6 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test057");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Set set2 = treeMapTestDriver0.entrySet();
        treeMapTestDriver0.clear();
        experiment.util.Collection collection4 = treeMapTestDriver0.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver5 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set6 = treeMapTestDriver5.entrySet();
        treeMapTestDriver5.clear();
        experiment.util.Set set8 = treeMapTestDriver5.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = treeMapTestDriver0.put((java.lang.Object) set8, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test058");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        int int1 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver2 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set3 = treeMapTestDriver2.entrySet();
        experiment.util.Comparator comparator4 = treeMapTestDriver2.comparator();
        java.lang.Object obj6 = treeMapTestDriver2.remove((java.lang.Object) 0.0f);
        treeMapTestDriver2.clear();
        java.lang.Object obj9 = treeMapTestDriver2.remove((java.lang.Object) (-1.0f));
        int int10 = treeMapTestDriver2.size();
        experiment.util.Collection collection11 = treeMapTestDriver2.values();
        experiment.util.Comparator comparator12 = treeMapTestDriver2.comparator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(comparator12);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test059");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        treeMapTestDriver0.clear();
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = treeMapTestDriver0.put((java.lang.Object) "hi!", obj7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test060");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        treeMapTestDriver0.clear();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver5 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set6 = treeMapTestDriver5.entrySet();
        experiment.util.Set set7 = treeMapTestDriver5.entrySet();
        experiment.util.Set set8 = treeMapTestDriver5.entrySet();
        java.lang.Object obj10 = treeMapTestDriver5.get((java.lang.Object) 100);
        java.lang.Object obj11 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.TreeMapTestDriver treeMapTestDriver12 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set13 = treeMapTestDriver12.entrySet();
        experiment.util.Set set14 = treeMapTestDriver12.entrySet();
        experiment.util.Set set15 = treeMapTestDriver12.entrySet();
        treeMapTestDriver12.clear();
        experiment.util.Set set17 = treeMapTestDriver12.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver18 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj20 = treeMapTestDriver18.remove((java.lang.Object) 1);
        boolean boolean21 = treeMapTestDriver18.isEmpty();
        java.lang.Class<?> wildcardClass22 = treeMapTestDriver18.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = treeMapTestDriver0.put((java.lang.Object) set17, (java.lang.Object) treeMapTestDriver18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test061");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        treeMapTestDriver0.clear();
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = treeMapTestDriver0.get((java.lang.Object) (short) -1);
        boolean boolean11 = treeMapTestDriver0.containsKey((java.lang.Object) 100.0f);
        experiment.util.TreeMapTestDriver treeMapTestDriver12 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set13 = treeMapTestDriver12.entrySet();
        experiment.util.Comparator comparator14 = treeMapTestDriver12.comparator();
        experiment.util.Comparator comparator15 = treeMapTestDriver12.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver17 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver17.clear();
        java.lang.Class<?> wildcardClass19 = treeMapTestDriver17.getClass();
        java.lang.Object obj20 = treeMapTestDriver12.put((java.lang.Object) 'a', (java.lang.Object) wildcardClass19);
        experiment.util.Set set21 = treeMapTestDriver12.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(comparator14);
        org.junit.Assert.assertNull(comparator15);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set21);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test062");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Set set2 = treeMapTestDriver0.entrySet();
        experiment.util.Set set3 = treeMapTestDriver0.entrySet();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) "");
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        int int7 = treeMapTestDriver0.size();
        experiment.util.Set set8 = treeMapTestDriver0.keySet();
        java.lang.Object obj10 = treeMapTestDriver0.get((java.lang.Object) (byte) 1);
        experiment.util.TreeMapTestDriver treeMapTestDriver11 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set12 = treeMapTestDriver11.entrySet();
        experiment.util.Set set13 = treeMapTestDriver11.entrySet();
        experiment.util.Set set14 = treeMapTestDriver11.entrySet();
        int int15 = treeMapTestDriver11.size();
        treeMapTestDriver11.clear();
        int int17 = treeMapTestDriver11.size();
        treeMapTestDriver11.clear();
        treeMapTestDriver11.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = treeMapTestDriver0.put((java.lang.Object) treeMapTestDriver11, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test063");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) 1);
        experiment.util.Set set3 = treeMapTestDriver0.entrySet();
        experiment.util.Set set4 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver5 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj7 = treeMapTestDriver5.remove((java.lang.Object) 1);
        experiment.util.Set set8 = treeMapTestDriver5.keySet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = treeMapTestDriver0.containsKey((java.lang.Object) set8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test064");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) 1);
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        int int4 = treeMapTestDriver0.size();
        experiment.util.Set set5 = treeMapTestDriver0.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver6 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj8 = treeMapTestDriver6.remove((java.lang.Object) 1);
        experiment.util.Set set9 = treeMapTestDriver6.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver10 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj12 = treeMapTestDriver10.remove((java.lang.Object) 1);
        experiment.util.Set set13 = treeMapTestDriver10.entrySet();
        experiment.util.Set set14 = treeMapTestDriver10.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = treeMapTestDriver0.put((java.lang.Object) set9, (java.lang.Object) set14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set14);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test065");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Set set2 = treeMapTestDriver0.entrySet();
        experiment.util.Set set3 = treeMapTestDriver0.entrySet();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) "");
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver8 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set9 = treeMapTestDriver8.entrySet();
        experiment.util.Comparator comparator10 = treeMapTestDriver8.comparator();
        java.lang.Object obj13 = treeMapTestDriver8.put((java.lang.Object) 0L, (java.lang.Object) "hi!");
        experiment.util.Collection collection14 = treeMapTestDriver8.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test066");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver5 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver5.clear();
        java.lang.Class<?> wildcardClass7 = treeMapTestDriver5.getClass();
        java.lang.Object obj8 = treeMapTestDriver0.put((java.lang.Object) 'a', (java.lang.Object) wildcardClass7);
        experiment.util.Set set9 = treeMapTestDriver0.keySet();
        java.lang.Class<?> wildcardClass10 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test067");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        java.lang.Object obj5 = treeMapTestDriver0.put((java.lang.Object) 0L, (java.lang.Object) "hi!");
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        java.lang.Class<?> wildcardClass8 = treeMapTestDriver7.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = treeMapTestDriver0.get((java.lang.Object) wildcardClass8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test068");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        int int2 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver5 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set6 = treeMapTestDriver5.entrySet();
        experiment.util.Set set7 = treeMapTestDriver5.entrySet();
        experiment.util.Set set8 = treeMapTestDriver5.entrySet();
        int int9 = treeMapTestDriver5.size();
        java.lang.Object obj10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = treeMapTestDriver0.put((java.lang.Object) int9, obj10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test069");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        treeMapTestDriver0.clear();
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        treeMapTestDriver0.clear();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set8 = treeMapTestDriver7.entrySet();
        experiment.util.Comparator comparator9 = treeMapTestDriver7.comparator();
        java.lang.Object obj11 = treeMapTestDriver7.remove((java.lang.Object) 0.0f);
        treeMapTestDriver7.clear();
        java.lang.Object obj14 = treeMapTestDriver7.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj16 = treeMapTestDriver7.get((java.lang.Object) (short) -1);
        int int17 = treeMapTestDriver7.size();
        experiment.util.Collection collection18 = treeMapTestDriver7.values();
        boolean boolean19 = treeMapTestDriver7.isEmpty();
        experiment.util.Collection collection20 = treeMapTestDriver7.values();
        experiment.util.Collection collection21 = treeMapTestDriver7.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(collection21);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test070");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        java.lang.Object obj5 = treeMapTestDriver0.put((java.lang.Object) 0L, (java.lang.Object) "hi!");
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver8 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj10 = treeMapTestDriver8.remove((java.lang.Object) 1);
        experiment.util.Set set11 = treeMapTestDriver8.keySet();
        int int12 = treeMapTestDriver8.size();
        experiment.util.Set set13 = treeMapTestDriver8.entrySet();
        experiment.util.Comparator comparator14 = treeMapTestDriver8.comparator();
        java.lang.Object obj17 = treeMapTestDriver8.put((java.lang.Object) 1.0f, (java.lang.Object) "hi!");
        experiment.util.TreeMapTestDriver treeMapTestDriver18 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set19 = treeMapTestDriver18.entrySet();
        experiment.util.Comparator comparator20 = treeMapTestDriver18.comparator();
        java.lang.Object obj22 = treeMapTestDriver18.remove((java.lang.Object) 0.0f);
        treeMapTestDriver18.clear();
        java.lang.Object obj25 = treeMapTestDriver18.remove((java.lang.Object) (-1.0f));
        experiment.util.Set set26 = treeMapTestDriver18.keySet();
        java.lang.Object obj27 = treeMapTestDriver0.put((java.lang.Object) "hi!", (java.lang.Object) treeMapTestDriver18);
        experiment.util.TreeMapTestDriver treeMapTestDriver28 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj30 = treeMapTestDriver28.remove((java.lang.Object) 1);
        experiment.util.Set set31 = treeMapTestDriver28.entrySet();
        experiment.util.Set set32 = treeMapTestDriver28.keySet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = treeMapTestDriver18.containsKey((java.lang.Object) set32);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(comparator14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(comparator20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(set32);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test071");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver5 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver5.clear();
        java.lang.Class<?> wildcardClass7 = treeMapTestDriver5.getClass();
        java.lang.Object obj8 = treeMapTestDriver0.put((java.lang.Object) 'a', (java.lang.Object) wildcardClass7);
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver10 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set11 = treeMapTestDriver10.entrySet();
        experiment.util.Comparator comparator12 = treeMapTestDriver10.comparator();
        java.lang.Object obj14 = treeMapTestDriver10.remove((java.lang.Object) 0.0f);
        treeMapTestDriver10.clear();
        java.lang.Object obj17 = treeMapTestDriver10.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj19 = treeMapTestDriver10.get((java.lang.Object) (short) -1);
        java.lang.Object obj20 = treeMapTestDriver0.get((java.lang.Object) (short) -1);
        experiment.util.TreeMapTestDriver treeMapTestDriver22 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set23 = treeMapTestDriver22.entrySet();
        experiment.util.Comparator comparator24 = treeMapTestDriver22.comparator();
        java.lang.Object obj27 = treeMapTestDriver22.put((java.lang.Object) 0L, (java.lang.Object) "hi!");
        boolean boolean28 = treeMapTestDriver22.isEmpty();
        experiment.util.Collection collection29 = treeMapTestDriver22.values();
        java.lang.Object obj30 = treeMapTestDriver0.put((java.lang.Object) (short) 1, (java.lang.Object) treeMapTestDriver22);
        experiment.util.TreeMapTestDriver treeMapTestDriver31 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set32 = treeMapTestDriver31.entrySet();
        experiment.util.Comparator comparator33 = treeMapTestDriver31.comparator();
        java.lang.Object obj35 = treeMapTestDriver31.remove((java.lang.Object) 0.0f);
        treeMapTestDriver31.clear();
        java.lang.Object obj38 = treeMapTestDriver31.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj40 = treeMapTestDriver31.get((java.lang.Object) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj41 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver31);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(comparator24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNull(comparator33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj40);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test072");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        treeMapTestDriver0.clear();
        boolean boolean7 = treeMapTestDriver0.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection8 = treeMapTestDriver0.values();
        java.lang.Object obj9 = null;
        experiment.util.TreeMapTestDriver treeMapTestDriver10 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set11 = treeMapTestDriver10.entrySet();
        experiment.util.Set set12 = treeMapTestDriver10.entrySet();
        experiment.util.Set set13 = treeMapTestDriver10.entrySet();
        boolean boolean15 = treeMapTestDriver10.containsKey((java.lang.Object) "");
        experiment.util.Collection collection16 = treeMapTestDriver10.values();
        treeMapTestDriver10.clear();
        experiment.util.Set set18 = treeMapTestDriver10.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = treeMapTestDriver0.put(obj9, (java.lang.Object) set18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(set18);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test073");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) 1);
        boolean boolean3 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver4 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set5 = treeMapTestDriver4.entrySet();
        treeMapTestDriver4.clear();
        experiment.util.Set set7 = treeMapTestDriver4.keySet();
        treeMapTestDriver4.clear();
        boolean boolean10 = treeMapTestDriver4.containsKey((java.lang.Object) 1.0d);
        java.lang.Object obj11 = treeMapTestDriver0.remove((java.lang.Object) 1.0d);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test074");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        java.lang.Object obj5 = treeMapTestDriver0.put((java.lang.Object) 0L, (java.lang.Object) "hi!");
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        boolean boolean7 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver8 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj10 = treeMapTestDriver8.remove((java.lang.Object) 1);
        experiment.util.Set set11 = treeMapTestDriver8.keySet();
        int int12 = treeMapTestDriver8.size();
        experiment.util.Set set13 = treeMapTestDriver8.entrySet();
        experiment.util.Collection collection14 = treeMapTestDriver8.values();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = treeMapTestDriver0.containsKey((java.lang.Object) collection14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.ArrayList cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test075");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        java.lang.Object obj5 = treeMapTestDriver0.put((java.lang.Object) 0L, (java.lang.Object) "hi!");
        int int6 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set8 = treeMapTestDriver7.entrySet();
        experiment.util.Comparator comparator9 = treeMapTestDriver7.comparator();
        experiment.util.Comparator comparator10 = treeMapTestDriver7.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver12 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver12.clear();
        java.lang.Class<?> wildcardClass14 = treeMapTestDriver12.getClass();
        java.lang.Object obj15 = treeMapTestDriver7.put((java.lang.Object) 'a', (java.lang.Object) wildcardClass14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test076");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Set set2 = treeMapTestDriver0.entrySet();
        boolean boolean4 = treeMapTestDriver0.containsKey((java.lang.Object) (-1));
        treeMapTestDriver0.clear();
        experiment.util.Set set6 = treeMapTestDriver0.entrySet();
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        treeMapTestDriver0.clear();
        experiment.util.Set set9 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver10 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set11 = treeMapTestDriver10.entrySet();
        experiment.util.Comparator comparator12 = treeMapTestDriver10.comparator();
        java.lang.Object obj14 = treeMapTestDriver10.remove((java.lang.Object) 0.0f);
        treeMapTestDriver10.clear();
        java.lang.Object obj17 = treeMapTestDriver10.remove((java.lang.Object) (-1.0f));
        int int18 = treeMapTestDriver10.size();
        experiment.util.Collection collection19 = treeMapTestDriver10.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = treeMapTestDriver0.put((java.lang.Object) collection19, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.ArrayList cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(collection19);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test077");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) 1);
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        int int4 = treeMapTestDriver0.size();
        experiment.util.Set set5 = treeMapTestDriver0.entrySet();
        experiment.util.Comparator comparator6 = treeMapTestDriver0.comparator();
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        boolean boolean8 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set10 = treeMapTestDriver9.entrySet();
        treeMapTestDriver9.clear();
        experiment.util.Set set12 = treeMapTestDriver9.keySet();
        treeMapTestDriver9.clear();
        experiment.util.Set set14 = treeMapTestDriver9.entrySet();
        experiment.util.Comparator comparator15 = treeMapTestDriver9.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(comparator15);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test078");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        treeMapTestDriver0.clear();
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = treeMapTestDriver0.get((java.lang.Object) (short) -1);
        int int10 = treeMapTestDriver0.size();
        experiment.util.Collection collection11 = treeMapTestDriver0.values();
        boolean boolean12 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection13 = treeMapTestDriver0.values();
        experiment.util.Collection collection14 = treeMapTestDriver0.values();
        java.lang.Class<?> wildcardClass15 = collection14.getClass();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test079");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver5 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set6 = treeMapTestDriver5.entrySet();
        experiment.util.Comparator comparator7 = treeMapTestDriver5.comparator();
        java.lang.Object obj10 = treeMapTestDriver5.put((java.lang.Object) 0L, (java.lang.Object) "hi!");
        boolean boolean11 = treeMapTestDriver5.isEmpty();
        experiment.util.Collection collection12 = treeMapTestDriver5.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = treeMapTestDriver0.remove((java.lang.Object) collection12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.ArrayList cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(comparator7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test080");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        treeMapTestDriver0.clear();
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = treeMapTestDriver0.get((java.lang.Object) (short) -1);
        boolean boolean11 = treeMapTestDriver0.containsKey((java.lang.Object) 100.0f);
        experiment.util.TreeMapTestDriver treeMapTestDriver12 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set13 = treeMapTestDriver12.entrySet();
        treeMapTestDriver12.clear();
        experiment.util.Comparator comparator15 = treeMapTestDriver12.comparator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(comparator15);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test081");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Set set2 = treeMapTestDriver0.entrySet();
        experiment.util.Set set3 = treeMapTestDriver0.entrySet();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) "");
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        int int7 = treeMapTestDriver0.size();
        experiment.util.Set set8 = treeMapTestDriver0.keySet();
        java.lang.Class<?> wildcardClass9 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test082");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver3 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set4 = treeMapTestDriver3.entrySet();
        experiment.util.Comparator comparator5 = treeMapTestDriver3.comparator();
        java.lang.Object obj7 = treeMapTestDriver3.remove((java.lang.Object) 0.0f);
        treeMapTestDriver3.clear();
        boolean boolean10 = treeMapTestDriver3.containsKey((java.lang.Object) (short) 10);
        int int11 = treeMapTestDriver3.size();
        treeMapTestDriver3.clear();
        java.lang.Object obj13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = treeMapTestDriver0.put((java.lang.Object) treeMapTestDriver3, obj13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(comparator5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test083");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        boolean boolean3 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver4 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set5 = treeMapTestDriver4.entrySet();
        experiment.util.Set set6 = treeMapTestDriver4.entrySet();
        boolean boolean8 = treeMapTestDriver4.containsKey((java.lang.Object) false);
        boolean boolean9 = treeMapTestDriver0.containsKey((java.lang.Object) boolean8);
        experiment.util.Set set10 = treeMapTestDriver0.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver11 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set12 = treeMapTestDriver11.entrySet();
        experiment.util.Set set13 = treeMapTestDriver11.entrySet();
        experiment.util.Set set14 = treeMapTestDriver11.entrySet();
        int int15 = treeMapTestDriver11.size();
        treeMapTestDriver11.clear();
        java.lang.Object obj18 = treeMapTestDriver11.get((java.lang.Object) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test084");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        treeMapTestDriver0.clear();
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = treeMapTestDriver0.get((java.lang.Object) (short) -1);
        experiment.util.TreeMapTestDriver treeMapTestDriver10 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set11 = treeMapTestDriver10.entrySet();
        experiment.util.Set set12 = treeMapTestDriver10.entrySet();
        boolean boolean14 = treeMapTestDriver10.containsKey((java.lang.Object) false);
        experiment.util.Set set15 = treeMapTestDriver10.entrySet();
        experiment.util.Collection collection16 = treeMapTestDriver10.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test085");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        treeMapTestDriver0.clear();
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver5 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set6 = treeMapTestDriver5.entrySet();
        experiment.util.Comparator comparator7 = treeMapTestDriver5.comparator();
        java.lang.Object obj9 = treeMapTestDriver5.remove((java.lang.Object) 0.0f);
        treeMapTestDriver5.clear();
        java.lang.Object obj12 = treeMapTestDriver5.remove((java.lang.Object) (-1.0f));
        int int13 = treeMapTestDriver5.size();
        experiment.util.Collection collection14 = treeMapTestDriver5.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver15 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set16 = treeMapTestDriver15.entrySet();
        experiment.util.Set set17 = treeMapTestDriver15.entrySet();
        boolean boolean19 = treeMapTestDriver15.containsKey((java.lang.Object) (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = treeMapTestDriver0.put((java.lang.Object) collection14, (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.ArrayList cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(comparator7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test086");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver3 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set4 = treeMapTestDriver3.entrySet();
        experiment.util.Set set5 = treeMapTestDriver3.entrySet();
        experiment.util.Set set6 = treeMapTestDriver3.entrySet();
        int int7 = treeMapTestDriver3.size();
        treeMapTestDriver3.clear();
        int int9 = treeMapTestDriver3.size();
        treeMapTestDriver3.clear();
        int int11 = treeMapTestDriver3.size();
        experiment.util.Collection collection12 = treeMapTestDriver3.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver13 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set14 = treeMapTestDriver13.entrySet();
        int int15 = treeMapTestDriver13.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = treeMapTestDriver0.put((java.lang.Object) collection12, (java.lang.Object) treeMapTestDriver13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.ArrayList cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test087");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) 1);
        experiment.util.Set set3 = treeMapTestDriver0.entrySet();
        experiment.util.Set set4 = treeMapTestDriver0.keySet();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = obj6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test088");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        treeMapTestDriver0.clear();
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = treeMapTestDriver0.get((java.lang.Object) (short) -1);
        int int10 = treeMapTestDriver0.size();
        experiment.util.Collection collection11 = treeMapTestDriver0.values();
        java.lang.Class<?> wildcardClass12 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test089");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Set set2 = treeMapTestDriver0.entrySet();
        boolean boolean4 = treeMapTestDriver0.containsKey((java.lang.Object) (-1));
        treeMapTestDriver0.clear();
        experiment.util.Set set6 = treeMapTestDriver0.entrySet();
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        java.lang.Object obj9 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        int int10 = treeMapTestDriver0.size();
        java.lang.Object obj11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = treeMapTestDriver0.containsKey(obj11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test090");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver2 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set3 = treeMapTestDriver2.entrySet();
        int int4 = treeMapTestDriver2.size();
        experiment.util.Comparator comparator5 = treeMapTestDriver2.comparator();
        experiment.util.Collection collection6 = treeMapTestDriver2.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set8 = treeMapTestDriver7.entrySet();
        experiment.util.Comparator comparator9 = treeMapTestDriver7.comparator();
        experiment.util.Comparator comparator10 = treeMapTestDriver7.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver12 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver12.clear();
        java.lang.Class<?> wildcardClass14 = treeMapTestDriver12.getClass();
        java.lang.Object obj15 = treeMapTestDriver7.put((java.lang.Object) 'a', (java.lang.Object) wildcardClass14);
        treeMapTestDriver7.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver17 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set18 = treeMapTestDriver17.entrySet();
        experiment.util.Comparator comparator19 = treeMapTestDriver17.comparator();
        java.lang.Object obj21 = treeMapTestDriver17.remove((java.lang.Object) 0.0f);
        treeMapTestDriver17.clear();
        java.lang.Object obj24 = treeMapTestDriver17.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj26 = treeMapTestDriver17.get((java.lang.Object) (short) -1);
        java.lang.Object obj27 = treeMapTestDriver7.get((java.lang.Object) (short) -1);
        experiment.util.TreeMapTestDriver treeMapTestDriver29 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set30 = treeMapTestDriver29.entrySet();
        experiment.util.Comparator comparator31 = treeMapTestDriver29.comparator();
        java.lang.Object obj34 = treeMapTestDriver29.put((java.lang.Object) 0L, (java.lang.Object) "hi!");
        boolean boolean35 = treeMapTestDriver29.isEmpty();
        experiment.util.Collection collection36 = treeMapTestDriver29.values();
        java.lang.Object obj37 = treeMapTestDriver7.put((java.lang.Object) (short) 1, (java.lang.Object) treeMapTestDriver29);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj38 = treeMapTestDriver0.put((java.lang.Object) collection6, (java.lang.Object) treeMapTestDriver29);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.ArrayList cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(comparator5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(comparator19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(comparator31);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNull(obj37);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test091");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver5 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver5.clear();
        java.lang.Class<?> wildcardClass7 = treeMapTestDriver5.getClass();
        java.lang.Object obj8 = treeMapTestDriver0.put((java.lang.Object) 'a', (java.lang.Object) wildcardClass7);
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver10 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set11 = treeMapTestDriver10.entrySet();
        experiment.util.Set set12 = treeMapTestDriver10.entrySet();
        experiment.util.Set set13 = treeMapTestDriver10.entrySet();
        int int14 = treeMapTestDriver10.size();
        treeMapTestDriver10.clear();
        int int16 = treeMapTestDriver10.size();
        treeMapTestDriver10.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver18 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set19 = treeMapTestDriver18.entrySet();
        experiment.util.Comparator comparator20 = treeMapTestDriver18.comparator();
        java.lang.Object obj23 = treeMapTestDriver18.put((java.lang.Object) 0L, (java.lang.Object) "hi!");
        experiment.util.Collection collection24 = treeMapTestDriver18.values();
        treeMapTestDriver18.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver26 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj28 = treeMapTestDriver26.remove((java.lang.Object) 1);
        experiment.util.Set set29 = treeMapTestDriver26.keySet();
        int int30 = treeMapTestDriver26.size();
        experiment.util.Set set31 = treeMapTestDriver26.entrySet();
        experiment.util.Comparator comparator32 = treeMapTestDriver26.comparator();
        java.lang.Object obj35 = treeMapTestDriver26.put((java.lang.Object) 1.0f, (java.lang.Object) "hi!");
        experiment.util.TreeMapTestDriver treeMapTestDriver36 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set37 = treeMapTestDriver36.entrySet();
        experiment.util.Comparator comparator38 = treeMapTestDriver36.comparator();
        java.lang.Object obj40 = treeMapTestDriver36.remove((java.lang.Object) 0.0f);
        treeMapTestDriver36.clear();
        java.lang.Object obj43 = treeMapTestDriver36.remove((java.lang.Object) (-1.0f));
        experiment.util.Set set44 = treeMapTestDriver36.keySet();
        java.lang.Object obj45 = treeMapTestDriver18.put((java.lang.Object) "hi!", (java.lang.Object) treeMapTestDriver36);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj46 = treeMapTestDriver0.put((java.lang.Object) treeMapTestDriver10, obj45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(comparator20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNull(comparator32);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(comparator38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNull(obj45);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test092");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Set set2 = treeMapTestDriver0.entrySet();
        experiment.util.Set set3 = treeMapTestDriver0.entrySet();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) "");
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        int int7 = treeMapTestDriver0.size();
        experiment.util.Set set8 = treeMapTestDriver0.keySet();
        experiment.util.Set set9 = treeMapTestDriver0.keySet();
        java.lang.Class<?> wildcardClass10 = set9.getClass();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test093");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        treeMapTestDriver0.clear();
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = treeMapTestDriver0.get((java.lang.Object) (short) -1);
        int int10 = treeMapTestDriver0.size();
        experiment.util.Collection collection11 = treeMapTestDriver0.values();
        boolean boolean12 = treeMapTestDriver0.isEmpty();
        experiment.util.Set set13 = treeMapTestDriver0.keySet();
        java.lang.Class<?> wildcardClass14 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test094");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        java.lang.Object obj4 = treeMapTestDriver0.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        experiment.util.Set set5 = treeMapTestDriver0.keySet();
        int int6 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set8 = treeMapTestDriver7.entrySet();
        experiment.util.Comparator comparator9 = treeMapTestDriver7.comparator();
        experiment.util.Comparator comparator10 = treeMapTestDriver7.comparator();
        treeMapTestDriver7.clear();
        boolean boolean12 = treeMapTestDriver7.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = treeMapTestDriver0.remove((java.lang.Object) boolean12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to java.lang.Boolean");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test095");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        treeMapTestDriver0.clear();
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = treeMapTestDriver0.get((java.lang.Object) (short) -1);
        int int10 = treeMapTestDriver0.size();
        experiment.util.Collection collection11 = treeMapTestDriver0.values();
        boolean boolean12 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection13 = treeMapTestDriver0.values();
        experiment.util.Collection collection14 = treeMapTestDriver0.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver15 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set16 = treeMapTestDriver15.entrySet();
        experiment.util.Comparator comparator17 = treeMapTestDriver15.comparator();
        experiment.util.Set set18 = treeMapTestDriver15.entrySet();
        treeMapTestDriver15.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(comparator17);
        org.junit.Assert.assertNotNull(set18);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test096");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        int int2 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Collection collection4 = treeMapTestDriver0.values();
        int int5 = treeMapTestDriver0.size();
        int int6 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set8 = treeMapTestDriver7.entrySet();
        experiment.util.Set set9 = treeMapTestDriver7.entrySet();
        treeMapTestDriver7.clear();
        experiment.util.Collection collection11 = treeMapTestDriver7.values();
        experiment.util.Collection collection12 = treeMapTestDriver7.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test097");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Set set2 = treeMapTestDriver0.entrySet();
        treeMapTestDriver0.clear();
        experiment.util.Collection collection4 = treeMapTestDriver0.values();
        java.lang.Class<?> wildcardClass5 = collection4.getClass();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test098");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        int int2 = treeMapTestDriver0.size();
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver4 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set5 = treeMapTestDriver4.entrySet();
        experiment.util.Comparator comparator6 = treeMapTestDriver4.comparator();
        experiment.util.Comparator comparator7 = treeMapTestDriver4.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver9.clear();
        java.lang.Class<?> wildcardClass11 = treeMapTestDriver9.getClass();
        java.lang.Object obj12 = treeMapTestDriver4.put((java.lang.Object) 'a', (java.lang.Object) wildcardClass11);
        experiment.util.Set set13 = treeMapTestDriver4.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = treeMapTestDriver0.containsKey((java.lang.Object) set13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertNull(comparator7);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test099");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Set set2 = treeMapTestDriver0.entrySet();
        boolean boolean4 = treeMapTestDriver0.containsKey((java.lang.Object) (-1));
        treeMapTestDriver0.clear();
        experiment.util.Set set6 = treeMapTestDriver0.entrySet();
        boolean boolean7 = treeMapTestDriver0.isEmpty();
        boolean boolean9 = treeMapTestDriver0.containsKey((java.lang.Object) (byte) 10);
        java.lang.Class<?> wildcardClass10 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test100");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver5 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver5.clear();
        java.lang.Class<?> wildcardClass7 = treeMapTestDriver5.getClass();
        java.lang.Object obj8 = treeMapTestDriver0.put((java.lang.Object) 'a', (java.lang.Object) wildcardClass7);
        boolean boolean9 = treeMapTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = treeMapTestDriver0.remove((java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to java.lang.Integer");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test101");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver4 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set5 = treeMapTestDriver4.entrySet();
        java.lang.Object obj6 = treeMapTestDriver0.put((java.lang.Object) (-1L), (java.lang.Object) set5);
        treeMapTestDriver0.clear();
        treeMapTestDriver0.clear();
        java.lang.Class<?> wildcardClass9 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test102");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        java.lang.Object obj5 = treeMapTestDriver0.put((java.lang.Object) 0L, (java.lang.Object) "hi!");
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        int int7 = treeMapTestDriver0.size();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test103");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Set set3 = treeMapTestDriver0.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver4 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set5 = treeMapTestDriver4.entrySet();
        experiment.util.Set set6 = treeMapTestDriver4.entrySet();
        experiment.util.Set set7 = treeMapTestDriver4.entrySet();
        treeMapTestDriver4.clear();
        treeMapTestDriver4.clear();
        experiment.util.Set set10 = treeMapTestDriver4.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = treeMapTestDriver0.put((java.lang.Object) treeMapTestDriver4, (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set10);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test104");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        treeMapTestDriver0.clear();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        treeMapTestDriver0.clear();
        experiment.util.Set set5 = treeMapTestDriver0.entrySet();
        experiment.util.Comparator comparator6 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set8 = treeMapTestDriver7.entrySet();
        experiment.util.Comparator comparator9 = treeMapTestDriver7.comparator();
        java.lang.Object obj11 = treeMapTestDriver7.remove((java.lang.Object) 0.0f);
        treeMapTestDriver7.clear();
        java.lang.Object obj14 = treeMapTestDriver7.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj16 = treeMapTestDriver7.get((java.lang.Object) (short) -1);
        int int17 = treeMapTestDriver7.size();
        experiment.util.Collection collection18 = treeMapTestDriver7.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test105");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        int int2 = treeMapTestDriver0.size();
        java.lang.Object obj3 = new java.lang.Object();
        experiment.util.TreeMapTestDriver treeMapTestDriver4 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set5 = treeMapTestDriver4.entrySet();
        treeMapTestDriver4.clear();
        experiment.util.Comparator comparator7 = treeMapTestDriver4.comparator();
        treeMapTestDriver4.clear();
        treeMapTestDriver4.clear();
        experiment.util.Set set10 = treeMapTestDriver4.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = treeMapTestDriver0.put(obj3, (java.lang.Object) treeMapTestDriver4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Object cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(comparator7);
        org.junit.Assert.assertNotNull(set10);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test106");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        treeMapTestDriver0.clear();
        experiment.util.Collection collection3 = treeMapTestDriver0.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver4 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set5 = treeMapTestDriver4.entrySet();
        int int6 = treeMapTestDriver4.size();
        treeMapTestDriver4.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver8 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set9 = treeMapTestDriver8.entrySet();
        experiment.util.Comparator comparator10 = treeMapTestDriver8.comparator();
        java.lang.Object obj13 = treeMapTestDriver8.put((java.lang.Object) 0L, (java.lang.Object) "hi!");
        experiment.util.Collection collection14 = treeMapTestDriver8.values();
        treeMapTestDriver8.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = treeMapTestDriver0.put((java.lang.Object) treeMapTestDriver4, (java.lang.Object) treeMapTestDriver8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test107");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        java.lang.Object obj5 = treeMapTestDriver0.put((java.lang.Object) 0L, (java.lang.Object) "hi!");
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver8 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj10 = treeMapTestDriver8.remove((java.lang.Object) 1);
        experiment.util.Set set11 = treeMapTestDriver8.keySet();
        int int12 = treeMapTestDriver8.size();
        experiment.util.Set set13 = treeMapTestDriver8.entrySet();
        experiment.util.Comparator comparator14 = treeMapTestDriver8.comparator();
        java.lang.Object obj17 = treeMapTestDriver8.put((java.lang.Object) 1.0f, (java.lang.Object) "hi!");
        experiment.util.TreeMapTestDriver treeMapTestDriver18 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set19 = treeMapTestDriver18.entrySet();
        experiment.util.Comparator comparator20 = treeMapTestDriver18.comparator();
        java.lang.Object obj22 = treeMapTestDriver18.remove((java.lang.Object) 0.0f);
        treeMapTestDriver18.clear();
        java.lang.Object obj25 = treeMapTestDriver18.remove((java.lang.Object) (-1.0f));
        experiment.util.Set set26 = treeMapTestDriver18.keySet();
        java.lang.Object obj27 = treeMapTestDriver0.put((java.lang.Object) "hi!", (java.lang.Object) treeMapTestDriver18);
        experiment.util.TreeMapTestDriver treeMapTestDriver28 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set29 = treeMapTestDriver28.entrySet();
        experiment.util.Set set30 = treeMapTestDriver28.entrySet();
        experiment.util.Set set31 = treeMapTestDriver28.entrySet();
        int int32 = treeMapTestDriver28.size();
        treeMapTestDriver28.clear();
        int int34 = treeMapTestDriver28.size();
        treeMapTestDriver28.clear();
        int int36 = treeMapTestDriver28.size();
        experiment.util.Collection collection37 = treeMapTestDriver28.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj38 = treeMapTestDriver18.get((java.lang.Object) treeMapTestDriver28);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(comparator14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(comparator20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(collection37);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test108");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        boolean boolean3 = treeMapTestDriver0.isEmpty();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        experiment.util.Set set5 = treeMapTestDriver0.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver6 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set7 = treeMapTestDriver6.entrySet();
        experiment.util.Comparator comparator8 = treeMapTestDriver6.comparator();
        boolean boolean9 = treeMapTestDriver6.isEmpty();
        experiment.util.Comparator comparator10 = treeMapTestDriver6.comparator();
        experiment.util.Set set11 = treeMapTestDriver6.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(comparator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertNotNull(set11);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test109");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver5 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver5.clear();
        java.lang.Class<?> wildcardClass7 = treeMapTestDriver5.getClass();
        java.lang.Object obj8 = treeMapTestDriver0.put((java.lang.Object) 'a', (java.lang.Object) wildcardClass7);
        boolean boolean9 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver10 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set11 = treeMapTestDriver10.entrySet();
        experiment.util.Comparator comparator12 = treeMapTestDriver10.comparator();
        java.lang.Object obj14 = treeMapTestDriver10.remove((java.lang.Object) 0.0f);
        treeMapTestDriver10.clear();
        java.lang.Object obj17 = treeMapTestDriver10.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj19 = treeMapTestDriver10.get((java.lang.Object) (short) -1);
        int int20 = treeMapTestDriver10.size();
        experiment.util.Collection collection21 = treeMapTestDriver10.values();
        boolean boolean22 = treeMapTestDriver10.isEmpty();
        experiment.util.Collection collection23 = treeMapTestDriver10.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver24 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set25 = treeMapTestDriver24.entrySet();
        experiment.util.Comparator comparator26 = treeMapTestDriver24.comparator();
        experiment.util.Set set27 = treeMapTestDriver24.entrySet();
        treeMapTestDriver24.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = treeMapTestDriver0.put((java.lang.Object) treeMapTestDriver10, (java.lang.Object) treeMapTestDriver24);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNull(comparator26);
        org.junit.Assert.assertNotNull(set27);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test110");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) 1);
        experiment.util.Set set3 = treeMapTestDriver0.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver4 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set5 = treeMapTestDriver4.entrySet();
        experiment.util.Comparator comparator6 = treeMapTestDriver4.comparator();
        boolean boolean7 = treeMapTestDriver4.isEmpty();
        experiment.util.Comparator comparator8 = treeMapTestDriver4.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = treeMapTestDriver0.remove((java.lang.Object) comparator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(comparator8);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test111");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) 1);
        experiment.util.Set set3 = treeMapTestDriver0.entrySet();
        experiment.util.Set set4 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver5 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set6 = treeMapTestDriver5.entrySet();
        experiment.util.Comparator comparator7 = treeMapTestDriver5.comparator();
        java.lang.Object obj9 = treeMapTestDriver5.remove((java.lang.Object) 0.0f);
        treeMapTestDriver5.clear();
        java.lang.Object obj12 = treeMapTestDriver5.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj14 = treeMapTestDriver5.get((java.lang.Object) (short) -1);
        int int15 = treeMapTestDriver5.size();
        experiment.util.Collection collection16 = treeMapTestDriver5.values();
        boolean boolean17 = treeMapTestDriver5.isEmpty();
        experiment.util.Collection collection18 = treeMapTestDriver5.values();
        experiment.util.Collection collection19 = treeMapTestDriver5.values();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(comparator7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(collection19);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test112");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Set set2 = treeMapTestDriver0.entrySet();
        experiment.util.Set set3 = treeMapTestDriver0.entrySet();
        int int4 = treeMapTestDriver0.size();
        treeMapTestDriver0.clear();
        int int6 = treeMapTestDriver0.size();
        treeMapTestDriver0.clear();
        treeMapTestDriver0.clear();
        java.lang.Object obj9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = treeMapTestDriver0.remove(obj9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test113");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        boolean boolean3 = treeMapTestDriver0.isEmpty();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver6 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set7 = treeMapTestDriver6.entrySet();
        experiment.util.Set set8 = treeMapTestDriver6.entrySet();
        experiment.util.Set set9 = treeMapTestDriver6.entrySet();
        treeMapTestDriver6.clear();
        experiment.util.Set set11 = treeMapTestDriver6.keySet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = treeMapTestDriver0.containsKey((java.lang.Object) set11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set11);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test114");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        treeMapTestDriver0.clear();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        treeMapTestDriver0.clear();
        experiment.util.Comparator comparator5 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver6 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set7 = treeMapTestDriver6.entrySet();
        experiment.util.Comparator comparator8 = treeMapTestDriver6.comparator();
        java.lang.Object obj10 = treeMapTestDriver6.remove((java.lang.Object) 0.0f);
        treeMapTestDriver6.clear();
        java.lang.Object obj13 = treeMapTestDriver6.remove((java.lang.Object) (-1.0f));
        int int14 = treeMapTestDriver6.size();
        experiment.util.Collection collection15 = treeMapTestDriver6.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = treeMapTestDriver0.get((java.lang.Object) collection15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.ArrayList cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(comparator5);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(comparator8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test115");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver5 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set6 = treeMapTestDriver5.entrySet();
        treeMapTestDriver5.clear();
        experiment.util.Comparator comparator8 = treeMapTestDriver5.comparator();
        treeMapTestDriver5.clear();
        treeMapTestDriver5.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(comparator8);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test116");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Set set2 = treeMapTestDriver0.entrySet();
        experiment.util.Set set3 = treeMapTestDriver0.entrySet();
        int int4 = treeMapTestDriver0.size();
        treeMapTestDriver0.clear();
        int int6 = treeMapTestDriver0.size();
        treeMapTestDriver0.clear();
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set10 = treeMapTestDriver9.entrySet();
        experiment.util.Comparator comparator11 = treeMapTestDriver9.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver12 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set13 = treeMapTestDriver12.entrySet();
        experiment.util.Comparator comparator14 = treeMapTestDriver12.comparator();
        experiment.util.Comparator comparator15 = treeMapTestDriver12.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver17 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver17.clear();
        java.lang.Class<?> wildcardClass19 = treeMapTestDriver17.getClass();
        java.lang.Object obj20 = treeMapTestDriver12.put((java.lang.Object) 'a', (java.lang.Object) wildcardClass19);
        treeMapTestDriver12.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver22 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set23 = treeMapTestDriver22.entrySet();
        experiment.util.Comparator comparator24 = treeMapTestDriver22.comparator();
        java.lang.Object obj26 = treeMapTestDriver22.remove((java.lang.Object) 0.0f);
        treeMapTestDriver22.clear();
        java.lang.Object obj29 = treeMapTestDriver22.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj31 = treeMapTestDriver22.get((java.lang.Object) (short) -1);
        java.lang.Object obj32 = treeMapTestDriver12.get((java.lang.Object) (short) -1);
        experiment.util.TreeMapTestDriver treeMapTestDriver34 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set35 = treeMapTestDriver34.entrySet();
        experiment.util.Comparator comparator36 = treeMapTestDriver34.comparator();
        java.lang.Object obj39 = treeMapTestDriver34.put((java.lang.Object) 0L, (java.lang.Object) "hi!");
        boolean boolean40 = treeMapTestDriver34.isEmpty();
        experiment.util.Collection collection41 = treeMapTestDriver34.values();
        java.lang.Object obj42 = treeMapTestDriver12.put((java.lang.Object) (short) 1, (java.lang.Object) treeMapTestDriver34);
        experiment.util.TreeMapTestDriver treeMapTestDriver43 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set44 = treeMapTestDriver43.entrySet();
        experiment.util.Set set45 = treeMapTestDriver43.entrySet();
        experiment.util.Set set46 = treeMapTestDriver43.entrySet();
        int int47 = treeMapTestDriver43.size();
        treeMapTestDriver43.clear();
        int int49 = treeMapTestDriver43.size();
        treeMapTestDriver43.clear();
        int int51 = treeMapTestDriver43.size();
        experiment.util.Collection collection52 = treeMapTestDriver43.values();
        java.lang.Object obj53 = treeMapTestDriver9.put((java.lang.Object) (short) 1, (java.lang.Object) collection52);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean54 = treeMapTestDriver0.containsKey((java.lang.Object) collection52);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.ArrayList cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(comparator14);
        org.junit.Assert.assertNull(comparator15);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(comparator24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(comparator36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNull(obj53);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test117");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Set set2 = treeMapTestDriver0.entrySet();
        boolean boolean4 = treeMapTestDriver0.containsKey((java.lang.Object) (-1));
        treeMapTestDriver0.clear();
        experiment.util.Set set6 = treeMapTestDriver0.entrySet();
        experiment.util.Collection collection7 = treeMapTestDriver0.values();
        boolean boolean9 = treeMapTestDriver0.containsKey((java.lang.Object) false);
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test118");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        treeMapTestDriver0.clear();
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = treeMapTestDriver0.get((java.lang.Object) (short) -1);
        int int10 = treeMapTestDriver0.size();
        experiment.util.Collection collection11 = treeMapTestDriver0.values();
        boolean boolean12 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection13 = treeMapTestDriver0.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver14 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set15 = treeMapTestDriver14.entrySet();
        experiment.util.Comparator comparator16 = treeMapTestDriver14.comparator();
        experiment.util.Comparator comparator17 = treeMapTestDriver14.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver19 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver19.clear();
        java.lang.Class<?> wildcardClass21 = treeMapTestDriver19.getClass();
        java.lang.Object obj22 = treeMapTestDriver14.put((java.lang.Object) 'a', (java.lang.Object) wildcardClass21);
        experiment.util.Set set23 = treeMapTestDriver14.entrySet();
        treeMapTestDriver14.clear();
        experiment.util.Set set25 = treeMapTestDriver14.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver26 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set27 = treeMapTestDriver26.entrySet();
        treeMapTestDriver26.clear();
        experiment.util.Set set29 = treeMapTestDriver26.keySet();
        boolean boolean30 = treeMapTestDriver26.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = treeMapTestDriver0.put((java.lang.Object) set25, (java.lang.Object) treeMapTestDriver26);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(comparator16);
        org.junit.Assert.assertNull(comparator17);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test119");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Set set2 = treeMapTestDriver0.entrySet();
        experiment.util.Set set3 = treeMapTestDriver0.entrySet();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) "");
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        int int7 = treeMapTestDriver0.size();
        experiment.util.Set set8 = treeMapTestDriver0.keySet();
        experiment.util.Set set9 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver10 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set11 = treeMapTestDriver10.entrySet();
        experiment.util.Comparator comparator12 = treeMapTestDriver10.comparator();
        java.lang.Object obj14 = treeMapTestDriver10.remove((java.lang.Object) 0.0f);
        treeMapTestDriver10.clear();
        boolean boolean17 = treeMapTestDriver10.containsKey((java.lang.Object) (short) 10);
        int int18 = treeMapTestDriver10.size();
        treeMapTestDriver10.clear();
        boolean boolean20 = treeMapTestDriver10.isEmpty();
        boolean boolean21 = treeMapTestDriver10.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test120");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        java.lang.Object obj5 = treeMapTestDriver0.put((java.lang.Object) 0L, (java.lang.Object) "hi!");
        int int6 = treeMapTestDriver0.size();
        treeMapTestDriver0.clear();
        experiment.util.Set set8 = treeMapTestDriver0.entrySet();
        java.lang.Class<?> wildcardClass9 = set8.getClass();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test121");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver4 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set5 = treeMapTestDriver4.entrySet();
        java.lang.Object obj6 = treeMapTestDriver0.put((java.lang.Object) (-1L), (java.lang.Object) set5);
        experiment.util.Comparator comparator7 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set10 = treeMapTestDriver9.entrySet();
        experiment.util.Set set11 = treeMapTestDriver9.entrySet();
        treeMapTestDriver9.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = treeMapTestDriver0.put((java.lang.Object) (short) 10, (java.lang.Object) treeMapTestDriver9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to java.lang.Short");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(comparator7);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test122");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        treeMapTestDriver0.clear();
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = treeMapTestDriver0.get((java.lang.Object) (short) -1);
        int int10 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver11 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set12 = treeMapTestDriver11.entrySet();
        experiment.util.Comparator comparator13 = treeMapTestDriver11.comparator();
        java.lang.Object obj15 = treeMapTestDriver11.remove((java.lang.Object) 0.0f);
        treeMapTestDriver11.clear();
        java.lang.Object obj18 = treeMapTestDriver11.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj20 = treeMapTestDriver11.get((java.lang.Object) (short) -1);
        int int21 = treeMapTestDriver11.size();
        boolean boolean22 = treeMapTestDriver0.containsKey((java.lang.Object) int21);
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver24 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set25 = treeMapTestDriver24.entrySet();
        experiment.util.Comparator comparator26 = treeMapTestDriver24.comparator();
        boolean boolean27 = treeMapTestDriver24.isEmpty();
        experiment.util.Comparator comparator28 = treeMapTestDriver24.comparator();
        experiment.util.Set set29 = treeMapTestDriver24.entrySet();
        treeMapTestDriver24.clear();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver24);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(comparator13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNull(comparator26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(comparator28);
        org.junit.Assert.assertNotNull(set29);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test123");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver4 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set5 = treeMapTestDriver4.entrySet();
        java.lang.Object obj6 = treeMapTestDriver0.put((java.lang.Object) (-1L), (java.lang.Object) set5);
        treeMapTestDriver0.clear();
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set10 = treeMapTestDriver9.entrySet();
        experiment.util.Set set11 = treeMapTestDriver9.entrySet();
        experiment.util.Set set12 = treeMapTestDriver9.entrySet();
        int int13 = treeMapTestDriver9.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver14 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set15 = treeMapTestDriver14.entrySet();
        experiment.util.Set set16 = treeMapTestDriver14.entrySet();
        boolean boolean18 = treeMapTestDriver14.containsKey((java.lang.Object) (-1));
        treeMapTestDriver14.clear();
        experiment.util.Set set20 = treeMapTestDriver14.entrySet();
        experiment.util.Set set21 = treeMapTestDriver14.keySet();
        java.lang.Object obj23 = treeMapTestDriver14.remove((java.lang.Object) 0.0f);
        int int24 = treeMapTestDriver14.size();
        java.lang.Object obj25 = treeMapTestDriver0.put((java.lang.Object) int13, (java.lang.Object) int24);
        experiment.util.TreeMapTestDriver treeMapTestDriver26 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set27 = treeMapTestDriver26.entrySet();
        experiment.util.Comparator comparator28 = treeMapTestDriver26.comparator();
        java.lang.Object obj31 = treeMapTestDriver26.put((java.lang.Object) 0L, (java.lang.Object) "hi!");
        boolean boolean32 = treeMapTestDriver26.isEmpty();
        treeMapTestDriver26.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver34 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set35 = treeMapTestDriver34.entrySet();
        treeMapTestDriver34.clear();
        experiment.util.Comparator comparator37 = treeMapTestDriver34.comparator();
        treeMapTestDriver34.clear();
        experiment.util.Set set39 = treeMapTestDriver34.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj40 = treeMapTestDriver0.put((java.lang.Object) treeMapTestDriver26, (java.lang.Object) treeMapTestDriver34);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNull(comparator28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(comparator37);
        org.junit.Assert.assertNotNull(set39);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test124");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver6 = new experiment.util.TreeMapTestDriver();
        java.lang.Class<?> wildcardClass7 = treeMapTestDriver6.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = treeMapTestDriver0.remove((java.lang.Object) wildcardClass7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test125");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        treeMapTestDriver0.clear();
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        treeMapTestDriver0.clear();
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(collection5);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test126");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        java.lang.Object obj5 = treeMapTestDriver0.put((java.lang.Object) 0L, (java.lang.Object) "hi!");
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        experiment.util.Comparator comparator7 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver8 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj10 = treeMapTestDriver8.remove((java.lang.Object) 1);
        experiment.util.Set set11 = treeMapTestDriver8.keySet();
        treeMapTestDriver8.clear();
        experiment.util.Set set13 = treeMapTestDriver8.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(comparator7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set13);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test127");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        int int3 = treeMapTestDriver0.size();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_939145594_1024_0.test128");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Set set2 = treeMapTestDriver0.entrySet();
        experiment.util.Set set3 = treeMapTestDriver0.entrySet();
        treeMapTestDriver0.clear();
        treeMapTestDriver0.clear();
        experiment.util.Set set6 = treeMapTestDriver0.entrySet();
        boolean boolean8 = treeMapTestDriver0.containsKey((java.lang.Object) 0L);
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

}
