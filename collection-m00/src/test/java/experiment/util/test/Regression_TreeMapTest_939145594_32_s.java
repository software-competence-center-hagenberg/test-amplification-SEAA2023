package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_TreeMapTest_939145594_32_s {

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

}
