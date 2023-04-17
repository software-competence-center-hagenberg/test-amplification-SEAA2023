package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_TreeMapTest_2070236138_128_s {

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
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test001");
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
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test002");
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
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test003");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 1.0f);
        experiment.util.TreeMapTestDriver treeMapTestDriver3 = new experiment.util.TreeMapTestDriver();
        boolean boolean4 = treeMapTestDriver3.isEmpty();
        experiment.util.Collection collection5 = treeMapTestDriver3.values();
        experiment.util.Collection collection6 = treeMapTestDriver3.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = treeMapTestDriver0.put((java.lang.Object) treeMapTestDriver3, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test004");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = treeMapTestDriver0.get(obj3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test005");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 1.0f);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        int int4 = treeMapTestDriver0.size();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver6 = new experiment.util.TreeMapTestDriver();
        boolean boolean7 = treeMapTestDriver6.isEmpty();
        experiment.util.Collection collection8 = treeMapTestDriver6.values();
        experiment.util.Collection collection9 = treeMapTestDriver6.values();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test006");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver5 = new experiment.util.TreeMapTestDriver();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test007");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 'a');
        java.lang.Object obj8 = treeMapTestDriver0.get((java.lang.Object) 0L);
        experiment.util.Comparator comparator9 = treeMapTestDriver0.comparator();
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver11 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj13 = treeMapTestDriver11.get((java.lang.Object) 1.0f);
        experiment.util.Comparator comparator14 = treeMapTestDriver11.comparator();
        int int15 = treeMapTestDriver11.size();
        java.lang.Object obj16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = treeMapTestDriver0.put((java.lang.Object) int15, obj16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(comparator14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test008");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 'a');
        java.lang.Object obj8 = treeMapTestDriver0.get((java.lang.Object) 0L);
        experiment.util.Comparator comparator9 = treeMapTestDriver0.comparator();
        java.lang.Class<?> wildcardClass10 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test009");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        java.lang.Class<?> wildcardClass3 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test010");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) (-1.0d));
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        boolean boolean8 = treeMapTestDriver7.isEmpty();
        experiment.util.Collection collection9 = treeMapTestDriver7.values();
        experiment.util.Set set10 = treeMapTestDriver7.keySet();
        boolean boolean11 = treeMapTestDriver7.isEmpty();
        java.lang.Object obj13 = treeMapTestDriver7.get((java.lang.Object) 'a');
        experiment.util.TreeMapTestDriver treeMapTestDriver14 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj16 = treeMapTestDriver14.get((java.lang.Object) 1.0f);
        experiment.util.Comparator comparator17 = treeMapTestDriver14.comparator();
        experiment.util.Collection collection18 = treeMapTestDriver14.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = treeMapTestDriver0.put((java.lang.Object) treeMapTestDriver7, (java.lang.Object) collection18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(comparator17);
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test011");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver5 = new experiment.util.TreeMapTestDriver();
        boolean boolean6 = treeMapTestDriver5.isEmpty();
        experiment.util.Collection collection7 = treeMapTestDriver5.values();
        experiment.util.Set set8 = treeMapTestDriver5.keySet();
        boolean boolean9 = treeMapTestDriver5.isEmpty();
        java.lang.Object obj11 = treeMapTestDriver5.get((java.lang.Object) (-1.0d));
        experiment.util.Collection collection12 = treeMapTestDriver5.values();
        java.lang.Object obj13 = treeMapTestDriver0.put((java.lang.Object) 10.0f, (java.lang.Object) collection12);
        boolean boolean14 = treeMapTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test012");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver5 = new experiment.util.TreeMapTestDriver();
        boolean boolean6 = treeMapTestDriver5.isEmpty();
        experiment.util.Collection collection7 = treeMapTestDriver5.values();
        experiment.util.Set set8 = treeMapTestDriver5.keySet();
        boolean boolean9 = treeMapTestDriver5.isEmpty();
        java.lang.Object obj11 = treeMapTestDriver5.get((java.lang.Object) (-1.0d));
        experiment.util.Collection collection12 = treeMapTestDriver5.values();
        java.lang.Object obj13 = treeMapTestDriver0.put((java.lang.Object) 10.0f, (java.lang.Object) collection12);
        experiment.util.TreeMapTestDriver treeMapTestDriver14 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj16 = treeMapTestDriver14.get((java.lang.Object) 1.0f);
        experiment.util.Comparator comparator17 = treeMapTestDriver14.comparator();
        experiment.util.Collection collection18 = treeMapTestDriver14.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver19 = new experiment.util.TreeMapTestDriver();
        boolean boolean20 = treeMapTestDriver19.isEmpty();
        experiment.util.Collection collection21 = treeMapTestDriver19.values();
        experiment.util.Set set22 = treeMapTestDriver19.keySet();
        boolean boolean23 = treeMapTestDriver19.isEmpty();
        java.lang.Object obj25 = treeMapTestDriver19.get((java.lang.Object) 'a');
        java.lang.Object obj27 = treeMapTestDriver19.get((java.lang.Object) 0L);
        boolean boolean28 = treeMapTestDriver19.isEmpty();
        int int29 = treeMapTestDriver19.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = treeMapTestDriver0.put((java.lang.Object) collection18, (java.lang.Object) treeMapTestDriver19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.ArrayList cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(comparator17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test013");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver5 = new experiment.util.TreeMapTestDriver();
        boolean boolean6 = treeMapTestDriver5.isEmpty();
        experiment.util.Collection collection7 = treeMapTestDriver5.values();
        experiment.util.Set set8 = treeMapTestDriver5.keySet();
        boolean boolean9 = treeMapTestDriver5.isEmpty();
        java.lang.Object obj11 = treeMapTestDriver5.get((java.lang.Object) (-1.0d));
        experiment.util.Collection collection12 = treeMapTestDriver5.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = treeMapTestDriver0.get((java.lang.Object) collection12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.ArrayList cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test014");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        boolean boolean2 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver3 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj5 = treeMapTestDriver3.get((java.lang.Object) 1.0f);
        experiment.util.Comparator comparator6 = treeMapTestDriver3.comparator();
        experiment.util.Collection collection7 = treeMapTestDriver3.values();
        experiment.util.Set set8 = treeMapTestDriver3.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        boolean boolean10 = treeMapTestDriver9.isEmpty();
        experiment.util.Collection collection11 = treeMapTestDriver9.values();
        experiment.util.Set set12 = treeMapTestDriver9.keySet();
        boolean boolean13 = treeMapTestDriver9.isEmpty();
        java.lang.Object obj15 = treeMapTestDriver9.get((java.lang.Object) (-1.0d));
        experiment.util.Set set16 = treeMapTestDriver9.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = treeMapTestDriver0.put((java.lang.Object) set8, (java.lang.Object) set16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test015");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        experiment.util.Comparator comparator5 = treeMapTestDriver0.comparator();
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = obj7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(comparator5);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test016");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) (-1.0d));
        boolean boolean7 = treeMapTestDriver0.isEmpty();
        experiment.util.Set set8 = treeMapTestDriver0.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        boolean boolean10 = treeMapTestDriver9.isEmpty();
        experiment.util.Collection collection11 = treeMapTestDriver9.values();
        experiment.util.Set set12 = treeMapTestDriver9.keySet();
        boolean boolean13 = treeMapTestDriver9.isEmpty();
        experiment.util.Comparator comparator14 = treeMapTestDriver9.comparator();
        experiment.util.Comparator comparator15 = treeMapTestDriver9.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = treeMapTestDriver0.put((java.lang.Object) treeMapTestDriver9, (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(comparator14);
        org.junit.Assert.assertNull(comparator15);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test017");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        treeMapTestDriver0.clear();
        java.lang.Object obj5 = treeMapTestDriver0.get((java.lang.Object) 100.0d);
        int int6 = treeMapTestDriver0.size();
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = treeMapTestDriver0.remove(obj7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test018");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        int int2 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver6 = new experiment.util.TreeMapTestDriver();
        boolean boolean7 = treeMapTestDriver6.isEmpty();
        experiment.util.Collection collection8 = treeMapTestDriver6.values();
        treeMapTestDriver6.clear();
        java.lang.Object obj11 = treeMapTestDriver6.get((java.lang.Object) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = treeMapTestDriver0.get(obj11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test019");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 1.0f);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        int int4 = treeMapTestDriver0.size();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver6 = new experiment.util.TreeMapTestDriver();
        boolean boolean7 = treeMapTestDriver6.isEmpty();
        experiment.util.Collection collection8 = treeMapTestDriver6.values();
        experiment.util.Set set9 = treeMapTestDriver6.keySet();
        boolean boolean10 = treeMapTestDriver6.isEmpty();
        java.lang.Object obj12 = treeMapTestDriver6.get((java.lang.Object) (-1.0d));
        boolean boolean13 = treeMapTestDriver6.isEmpty();
        experiment.util.Set set14 = treeMapTestDriver6.entrySet();
        int int15 = treeMapTestDriver6.size();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test020");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 1.0f);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        int int4 = treeMapTestDriver0.size();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        int int6 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        boolean boolean8 = treeMapTestDriver7.isEmpty();
        experiment.util.Collection collection9 = treeMapTestDriver7.values();
        experiment.util.Set set10 = treeMapTestDriver7.keySet();
        boolean boolean11 = treeMapTestDriver7.isEmpty();
        experiment.util.Set set12 = treeMapTestDriver7.keySet();
        experiment.util.Set set13 = treeMapTestDriver7.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver14 = new experiment.util.TreeMapTestDriver();
        boolean boolean15 = treeMapTestDriver14.isEmpty();
        experiment.util.Collection collection16 = treeMapTestDriver14.values();
        experiment.util.Set set17 = treeMapTestDriver14.keySet();
        boolean boolean18 = treeMapTestDriver14.isEmpty();
        experiment.util.Comparator comparator19 = treeMapTestDriver14.comparator();
        java.lang.Object obj21 = treeMapTestDriver14.remove((java.lang.Object) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = treeMapTestDriver0.put((java.lang.Object) set13, (java.lang.Object) treeMapTestDriver14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(comparator19);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test021");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        experiment.util.Set set5 = treeMapTestDriver0.keySet();
        experiment.util.Set set6 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        boolean boolean8 = treeMapTestDriver7.isEmpty();
        experiment.util.Collection collection9 = treeMapTestDriver7.values();
        experiment.util.Set set10 = treeMapTestDriver7.keySet();
        boolean boolean11 = treeMapTestDriver7.isEmpty();
        java.lang.Object obj13 = treeMapTestDriver7.get((java.lang.Object) 'a');
        java.lang.Object obj15 = treeMapTestDriver7.get((java.lang.Object) 0L);
        boolean boolean16 = treeMapTestDriver7.isEmpty();
        int int17 = treeMapTestDriver7.size();
        experiment.util.Collection collection18 = treeMapTestDriver7.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = treeMapTestDriver0.get((java.lang.Object) collection18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.ArrayList cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test022");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        treeMapTestDriver0.clear();
        java.lang.Object obj5 = treeMapTestDriver0.get((java.lang.Object) 100.0d);
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj9 = treeMapTestDriver7.get((java.lang.Object) 1.0f);
        experiment.util.Comparator comparator10 = treeMapTestDriver7.comparator();
        experiment.util.Collection collection11 = treeMapTestDriver7.values();
        int int12 = treeMapTestDriver7.size();
        java.lang.Class<?> wildcardClass13 = treeMapTestDriver7.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = treeMapTestDriver0.get((java.lang.Object) wildcardClass13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test023");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 1.0f);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Collection collection4 = treeMapTestDriver0.values();
        int int5 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator6 = treeMapTestDriver0.comparator();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(comparator6);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test024");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        int int5 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver6 = new experiment.util.TreeMapTestDriver();
        boolean boolean7 = treeMapTestDriver6.isEmpty();
        experiment.util.Collection collection8 = treeMapTestDriver6.values();
        experiment.util.Set set9 = treeMapTestDriver6.keySet();
        boolean boolean10 = treeMapTestDriver6.isEmpty();
        experiment.util.Set set11 = treeMapTestDriver6.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = treeMapTestDriver0.remove((java.lang.Object) set11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(set11);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test025");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = obj6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test026");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) (-1.0d));
        boolean boolean7 = treeMapTestDriver0.isEmpty();
        experiment.util.Set set8 = treeMapTestDriver0.entrySet();
        int int9 = treeMapTestDriver0.size();
        treeMapTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test027");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 'a');
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        boolean boolean8 = treeMapTestDriver7.isEmpty();
        experiment.util.Collection collection9 = treeMapTestDriver7.values();
        experiment.util.Set set10 = treeMapTestDriver7.keySet();
        boolean boolean11 = treeMapTestDriver7.isEmpty();
        java.lang.Object obj13 = treeMapTestDriver7.get((java.lang.Object) (-1.0d));
        experiment.util.Collection collection14 = treeMapTestDriver7.values();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test028");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) (-1.0d));
        java.lang.Object obj8 = treeMapTestDriver0.remove((java.lang.Object) '4');
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        boolean boolean10 = treeMapTestDriver9.isEmpty();
        experiment.util.Collection collection11 = treeMapTestDriver9.values();
        experiment.util.Collection collection12 = treeMapTestDriver9.values();
        experiment.util.Comparator comparator13 = treeMapTestDriver9.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = treeMapTestDriver0.put((java.lang.Object) comparator13, (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(comparator13);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test029");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Set set2 = treeMapTestDriver0.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver3 = new experiment.util.TreeMapTestDriver();
        boolean boolean4 = treeMapTestDriver3.isEmpty();
        int int5 = treeMapTestDriver3.size();
        experiment.util.Comparator comparator6 = treeMapTestDriver3.comparator();
        treeMapTestDriver3.clear();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(comparator6);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test030");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 1.0f);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        int int4 = treeMapTestDriver0.size();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj7 = treeMapTestDriver0.get((java.lang.Object) ' ');
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj11 = treeMapTestDriver9.get((java.lang.Object) 1.0f);
        experiment.util.Collection collection12 = treeMapTestDriver9.values();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = treeMapTestDriver0.containsKey((java.lang.Object) collection12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.ArrayList cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test031");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) (-1.0d));
        boolean boolean7 = treeMapTestDriver0.isEmpty();
        experiment.util.Set set8 = treeMapTestDriver0.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj11 = treeMapTestDriver9.get((java.lang.Object) 1.0f);
        experiment.util.Comparator comparator12 = treeMapTestDriver9.comparator();
        experiment.util.Collection collection13 = treeMapTestDriver9.values();
        experiment.util.Set set14 = treeMapTestDriver9.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(set14);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test032");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 'a');
        java.lang.Object obj8 = treeMapTestDriver0.get((java.lang.Object) 0L);
        treeMapTestDriver0.clear();
        experiment.util.Set set10 = treeMapTestDriver0.entrySet();
        java.lang.Class<?> wildcardClass11 = set10.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test033");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.keySet();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        boolean boolean3 = treeMapTestDriver0.isEmpty();
        int int4 = treeMapTestDriver0.size();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test034");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj2 = null;
        experiment.util.TreeMapTestDriver treeMapTestDriver3 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj5 = treeMapTestDriver3.get((java.lang.Object) 1.0f);
        java.lang.Class<?> wildcardClass6 = treeMapTestDriver3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = treeMapTestDriver0.put(obj2, (java.lang.Object) treeMapTestDriver3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test035");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        int int2 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        int int6 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        boolean boolean8 = treeMapTestDriver7.isEmpty();
        experiment.util.Collection collection9 = treeMapTestDriver7.values();
        experiment.util.Set set10 = treeMapTestDriver7.keySet();
        boolean boolean11 = treeMapTestDriver7.isEmpty();
        java.lang.Object obj13 = treeMapTestDriver7.get((java.lang.Object) 'a');
        java.lang.Object obj15 = treeMapTestDriver7.get((java.lang.Object) 0L);
        boolean boolean16 = treeMapTestDriver7.isEmpty();
        experiment.util.Comparator comparator17 = treeMapTestDriver7.comparator();
        experiment.util.Set set18 = treeMapTestDriver7.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver19 = new experiment.util.TreeMapTestDriver();
        boolean boolean20 = treeMapTestDriver19.isEmpty();
        int int21 = treeMapTestDriver19.size();
        experiment.util.Comparator comparator22 = treeMapTestDriver19.comparator();
        treeMapTestDriver19.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = treeMapTestDriver0.put((java.lang.Object) treeMapTestDriver7, (java.lang.Object) treeMapTestDriver19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(comparator17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(comparator22);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test036");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        experiment.util.Comparator comparator5 = treeMapTestDriver0.comparator();
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) (short) 10);
        experiment.util.TreeMapTestDriver treeMapTestDriver8 = new experiment.util.TreeMapTestDriver();
        boolean boolean9 = treeMapTestDriver8.isEmpty();
        experiment.util.Collection collection10 = treeMapTestDriver8.values();
        experiment.util.Set set11 = treeMapTestDriver8.keySet();
        boolean boolean12 = treeMapTestDriver8.isEmpty();
        java.lang.Object obj14 = treeMapTestDriver8.get((java.lang.Object) 'a');
        java.lang.Object obj16 = treeMapTestDriver8.get((java.lang.Object) 0L);
        boolean boolean17 = treeMapTestDriver8.isEmpty();
        int int18 = treeMapTestDriver8.size();
        experiment.util.Set set19 = treeMapTestDriver8.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(comparator5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(set19);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test037");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 'a');
        java.lang.Object obj8 = treeMapTestDriver0.get((java.lang.Object) 0L);
        boolean boolean9 = treeMapTestDriver0.isEmpty();
        int int10 = treeMapTestDriver0.size();
        int int11 = treeMapTestDriver0.size();
        experiment.util.Collection collection12 = treeMapTestDriver0.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver13 = new experiment.util.TreeMapTestDriver();
        boolean boolean14 = treeMapTestDriver13.isEmpty();
        experiment.util.Collection collection15 = treeMapTestDriver13.values();
        experiment.util.Set set16 = treeMapTestDriver13.keySet();
        boolean boolean17 = treeMapTestDriver13.isEmpty();
        java.lang.Object obj19 = treeMapTestDriver13.get((java.lang.Object) 'a');
        java.lang.Object obj21 = treeMapTestDriver13.get((java.lang.Object) 0L);
        boolean boolean22 = treeMapTestDriver13.isEmpty();
        experiment.util.Comparator comparator23 = treeMapTestDriver13.comparator();
        experiment.util.Set set24 = treeMapTestDriver13.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = treeMapTestDriver0.remove((java.lang.Object) set24);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(comparator23);
        org.junit.Assert.assertNotNull(set24);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test038");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        int int2 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        boolean boolean8 = treeMapTestDriver7.isEmpty();
        experiment.util.Collection collection9 = treeMapTestDriver7.values();
        experiment.util.Set set10 = treeMapTestDriver7.keySet();
        boolean boolean11 = treeMapTestDriver7.isEmpty();
        experiment.util.Comparator comparator12 = treeMapTestDriver7.comparator();
        boolean boolean14 = treeMapTestDriver7.containsKey((java.lang.Object) 1L);
        experiment.util.Set set15 = treeMapTestDriver7.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = treeMapTestDriver0.get((java.lang.Object) set15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(set15);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test039");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        int int2 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        int int5 = treeMapTestDriver0.size();
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        boolean boolean10 = treeMapTestDriver9.isEmpty();
        int int11 = treeMapTestDriver9.size();
        experiment.util.Comparator comparator12 = treeMapTestDriver9.comparator();
        experiment.util.Comparator comparator13 = treeMapTestDriver9.comparator();
        int int14 = treeMapTestDriver9.size();
        boolean boolean15 = treeMapTestDriver9.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = treeMapTestDriver0.put((java.lang.Object) wildcardClass8, (java.lang.Object) boolean15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertNull(comparator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test040");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver4 = new experiment.util.TreeMapTestDriver();
        boolean boolean5 = treeMapTestDriver4.isEmpty();
        experiment.util.Collection collection6 = treeMapTestDriver4.values();
        experiment.util.Set set7 = treeMapTestDriver4.keySet();
        boolean boolean8 = treeMapTestDriver4.isEmpty();
        java.lang.Object obj10 = treeMapTestDriver4.get((java.lang.Object) 'a');
        java.lang.Object obj12 = treeMapTestDriver4.get((java.lang.Object) 0L);
        boolean boolean13 = treeMapTestDriver4.isEmpty();
        experiment.util.Comparator comparator14 = treeMapTestDriver4.comparator();
        treeMapTestDriver4.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(comparator14);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test041");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) (-1.0d));
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver8 = new experiment.util.TreeMapTestDriver();
        boolean boolean9 = treeMapTestDriver8.isEmpty();
        experiment.util.Collection collection10 = treeMapTestDriver8.values();
        treeMapTestDriver8.clear();
        java.lang.Object obj13 = treeMapTestDriver8.get((java.lang.Object) 100.0d);
        int int14 = treeMapTestDriver8.size();
        experiment.util.Set set15 = treeMapTestDriver8.entrySet();
        int int16 = treeMapTestDriver8.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test042");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 1.0f);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        int int4 = treeMapTestDriver0.size();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj7 = treeMapTestDriver0.get((java.lang.Object) ' ');
        experiment.util.TreeMapTestDriver treeMapTestDriver8 = new experiment.util.TreeMapTestDriver();
        boolean boolean9 = treeMapTestDriver8.isEmpty();
        int int10 = treeMapTestDriver8.size();
        experiment.util.Comparator comparator11 = treeMapTestDriver8.comparator();
        experiment.util.Comparator comparator12 = treeMapTestDriver8.comparator();
        experiment.util.Collection collection13 = treeMapTestDriver8.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = treeMapTestDriver0.remove((java.lang.Object) collection13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.ArrayList cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test043");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        int int2 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver4 = new experiment.util.TreeMapTestDriver();
        boolean boolean5 = treeMapTestDriver4.isEmpty();
        experiment.util.Collection collection6 = treeMapTestDriver4.values();
        treeMapTestDriver4.clear();
        java.lang.Object obj9 = treeMapTestDriver4.get((java.lang.Object) 100.0d);
        int int10 = treeMapTestDriver4.size();
        experiment.util.Set set11 = treeMapTestDriver4.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = treeMapTestDriver0.get((java.lang.Object) set11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(set11);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test044");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        int int2 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        int int6 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        boolean boolean8 = treeMapTestDriver7.isEmpty();
        int int9 = treeMapTestDriver7.size();
        experiment.util.Comparator comparator10 = treeMapTestDriver7.comparator();
        boolean boolean12 = treeMapTestDriver7.containsKey((java.lang.Object) (byte) 100);
        boolean boolean13 = treeMapTestDriver0.containsKey((java.lang.Object) boolean12);
        experiment.util.Set set14 = treeMapTestDriver0.keySet();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(set14);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test045");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        treeMapTestDriver0.clear();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass5 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test046");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 'a');
        java.lang.Object obj8 = treeMapTestDriver0.get((java.lang.Object) 0L);
        boolean boolean9 = treeMapTestDriver0.isEmpty();
        int int10 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver11 = new experiment.util.TreeMapTestDriver();
        boolean boolean12 = treeMapTestDriver11.isEmpty();
        experiment.util.Collection collection13 = treeMapTestDriver11.values();
        experiment.util.Set set14 = treeMapTestDriver11.keySet();
        boolean boolean15 = treeMapTestDriver11.isEmpty();
        java.lang.Object obj17 = treeMapTestDriver11.get((java.lang.Object) 'a');
        java.lang.Object obj19 = treeMapTestDriver11.get((java.lang.Object) 0L);
        experiment.util.Comparator comparator20 = treeMapTestDriver11.comparator();
        java.lang.Object obj22 = treeMapTestDriver11.remove((java.lang.Object) (byte) 0);
        experiment.util.TreeMapTestDriver treeMapTestDriver23 = new experiment.util.TreeMapTestDriver();
        boolean boolean24 = treeMapTestDriver23.isEmpty();
        experiment.util.Collection collection25 = treeMapTestDriver23.values();
        experiment.util.Set set26 = treeMapTestDriver23.keySet();
        boolean boolean27 = treeMapTestDriver23.isEmpty();
        java.lang.Object obj29 = treeMapTestDriver23.get((java.lang.Object) 'a');
        java.lang.Object obj31 = treeMapTestDriver23.get((java.lang.Object) 0L);
        treeMapTestDriver23.clear();
        experiment.util.Set set33 = treeMapTestDriver23.entrySet();
        java.lang.Object obj34 = treeMapTestDriver0.put((java.lang.Object) (byte) 0, (java.lang.Object) treeMapTestDriver23);
        int int35 = treeMapTestDriver0.size();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(comparator20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test047");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) (-1.0d));
        java.lang.Object obj8 = treeMapTestDriver0.remove((java.lang.Object) '4');
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        boolean boolean10 = treeMapTestDriver9.isEmpty();
        experiment.util.Collection collection11 = treeMapTestDriver9.values();
        experiment.util.Set set12 = treeMapTestDriver9.keySet();
        boolean boolean13 = treeMapTestDriver9.isEmpty();
        java.lang.Object obj15 = treeMapTestDriver9.get((java.lang.Object) 'a');
        java.lang.Object obj17 = treeMapTestDriver9.get((java.lang.Object) 0L);
        boolean boolean18 = treeMapTestDriver9.isEmpty();
        int int19 = treeMapTestDriver9.size();
        experiment.util.Collection collection20 = treeMapTestDriver9.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver21 = new experiment.util.TreeMapTestDriver();
        boolean boolean22 = treeMapTestDriver21.isEmpty();
        experiment.util.Collection collection23 = treeMapTestDriver21.values();
        experiment.util.Set set24 = treeMapTestDriver21.keySet();
        boolean boolean25 = treeMapTestDriver21.isEmpty();
        java.lang.Object obj27 = treeMapTestDriver21.get((java.lang.Object) (-1.0d));
        experiment.util.Set set28 = treeMapTestDriver21.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = treeMapTestDriver0.put((java.lang.Object) collection20, (java.lang.Object) treeMapTestDriver21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.ArrayList cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set28);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test048");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 'a');
        java.lang.Object obj8 = treeMapTestDriver0.get((java.lang.Object) 0L);
        boolean boolean9 = treeMapTestDriver0.isEmpty();
        int int10 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver11 = new experiment.util.TreeMapTestDriver();
        boolean boolean12 = treeMapTestDriver11.isEmpty();
        experiment.util.Collection collection13 = treeMapTestDriver11.values();
        experiment.util.Set set14 = treeMapTestDriver11.keySet();
        boolean boolean15 = treeMapTestDriver11.isEmpty();
        java.lang.Object obj17 = treeMapTestDriver11.get((java.lang.Object) 'a');
        java.lang.Object obj19 = treeMapTestDriver11.get((java.lang.Object) 0L);
        experiment.util.Comparator comparator20 = treeMapTestDriver11.comparator();
        java.lang.Object obj22 = treeMapTestDriver11.remove((java.lang.Object) (byte) 0);
        experiment.util.TreeMapTestDriver treeMapTestDriver23 = new experiment.util.TreeMapTestDriver();
        boolean boolean24 = treeMapTestDriver23.isEmpty();
        experiment.util.Collection collection25 = treeMapTestDriver23.values();
        experiment.util.Set set26 = treeMapTestDriver23.keySet();
        boolean boolean27 = treeMapTestDriver23.isEmpty();
        java.lang.Object obj29 = treeMapTestDriver23.get((java.lang.Object) 'a');
        java.lang.Object obj31 = treeMapTestDriver23.get((java.lang.Object) 0L);
        treeMapTestDriver23.clear();
        experiment.util.Set set33 = treeMapTestDriver23.entrySet();
        java.lang.Object obj34 = treeMapTestDriver0.put((java.lang.Object) (byte) 0, (java.lang.Object) treeMapTestDriver23);
        experiment.util.Set set35 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver36 = new experiment.util.TreeMapTestDriver();
        boolean boolean37 = treeMapTestDriver36.isEmpty();
        experiment.util.Collection collection38 = treeMapTestDriver36.values();
        experiment.util.Set set39 = treeMapTestDriver36.keySet();
        boolean boolean40 = treeMapTestDriver36.isEmpty();
        java.lang.Object obj42 = treeMapTestDriver36.get((java.lang.Object) 'a');
        java.lang.Object obj44 = treeMapTestDriver36.get((java.lang.Object) 0L);
        boolean boolean45 = treeMapTestDriver36.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj46 = treeMapTestDriver0.get((java.lang.Object) boolean45);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to java.lang.Boolean");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(comparator20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test049");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        experiment.util.Comparator comparator5 = treeMapTestDriver0.comparator();
        boolean boolean7 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        experiment.util.TreeMapTestDriver treeMapTestDriver8 = new experiment.util.TreeMapTestDriver();
        boolean boolean9 = treeMapTestDriver8.isEmpty();
        experiment.util.Collection collection10 = treeMapTestDriver8.values();
        experiment.util.Set set11 = treeMapTestDriver8.keySet();
        boolean boolean12 = treeMapTestDriver8.isEmpty();
        experiment.util.Comparator comparator13 = treeMapTestDriver8.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = treeMapTestDriver0.remove((java.lang.Object) comparator13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(comparator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(comparator13);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test050");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        int int2 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver6 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj8 = treeMapTestDriver6.get((java.lang.Object) 1.0f);
        experiment.util.Comparator comparator9 = treeMapTestDriver6.comparator();
        int int10 = treeMapTestDriver6.size();
        boolean boolean11 = treeMapTestDriver6.isEmpty();
        java.lang.Object obj13 = treeMapTestDriver6.get((java.lang.Object) ' ');
        experiment.util.Set set14 = treeMapTestDriver6.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set14);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test051");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 1.0f);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        int int4 = treeMapTestDriver0.size();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj7 = treeMapTestDriver0.get((java.lang.Object) ' ');
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        boolean boolean10 = treeMapTestDriver9.isEmpty();
        experiment.util.Collection collection11 = treeMapTestDriver9.values();
        experiment.util.Set set12 = treeMapTestDriver9.keySet();
        boolean boolean13 = treeMapTestDriver9.isEmpty();
        java.lang.Object obj15 = treeMapTestDriver9.get((java.lang.Object) 'a');
        java.lang.Object obj17 = treeMapTestDriver9.get((java.lang.Object) 0L);
        boolean boolean18 = treeMapTestDriver9.isEmpty();
        experiment.util.Comparator comparator19 = treeMapTestDriver9.comparator();
        boolean boolean20 = treeMapTestDriver9.isEmpty();
        experiment.util.Set set21 = treeMapTestDriver9.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = treeMapTestDriver0.remove((java.lang.Object) set21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(comparator19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(set21);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test052");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 'a');
        java.lang.Object obj8 = treeMapTestDriver0.get((java.lang.Object) 0L);
        boolean boolean9 = treeMapTestDriver0.isEmpty();
        experiment.util.Comparator comparator10 = treeMapTestDriver0.comparator();
        experiment.util.Set set11 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver12 = new experiment.util.TreeMapTestDriver();
        boolean boolean13 = treeMapTestDriver12.isEmpty();
        experiment.util.Collection collection14 = treeMapTestDriver12.values();
        experiment.util.Set set15 = treeMapTestDriver12.keySet();
        boolean boolean16 = treeMapTestDriver12.isEmpty();
        java.lang.Object obj18 = treeMapTestDriver12.get((java.lang.Object) (-1.0d));
        boolean boolean19 = treeMapTestDriver12.isEmpty();
        experiment.util.Set set20 = treeMapTestDriver12.entrySet();
        experiment.util.Collection collection21 = treeMapTestDriver12.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(collection21);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test053");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 1.0f);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Collection collection4 = treeMapTestDriver0.values();
        experiment.util.Comparator comparator5 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver6 = new experiment.util.TreeMapTestDriver();
        boolean boolean7 = treeMapTestDriver6.isEmpty();
        experiment.util.Collection collection8 = treeMapTestDriver6.values();
        experiment.util.Set set9 = treeMapTestDriver6.keySet();
        boolean boolean10 = treeMapTestDriver6.isEmpty();
        java.lang.Object obj12 = treeMapTestDriver6.get((java.lang.Object) 'a');
        java.lang.Object obj14 = treeMapTestDriver6.get((java.lang.Object) 0L);
        boolean boolean15 = treeMapTestDriver6.isEmpty();
        int int16 = treeMapTestDriver6.size();
        int int17 = treeMapTestDriver6.size();
        experiment.util.Collection collection18 = treeMapTestDriver6.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(comparator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test054");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 'a');
        java.lang.Object obj8 = treeMapTestDriver0.get((java.lang.Object) 0L);
        boolean boolean9 = treeMapTestDriver0.isEmpty();
        int int10 = treeMapTestDriver0.size();
        int int11 = treeMapTestDriver0.size();
        experiment.util.Collection collection12 = treeMapTestDriver0.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver13 = new experiment.util.TreeMapTestDriver();
        boolean boolean14 = treeMapTestDriver13.isEmpty();
        experiment.util.Collection collection15 = treeMapTestDriver13.values();
        experiment.util.Set set16 = treeMapTestDriver13.keySet();
        boolean boolean17 = treeMapTestDriver13.isEmpty();
        experiment.util.Comparator comparator18 = treeMapTestDriver13.comparator();
        experiment.util.Comparator comparator19 = treeMapTestDriver13.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = treeMapTestDriver0.remove((java.lang.Object) comparator19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(comparator18);
        org.junit.Assert.assertNull(comparator19);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test055");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        int int5 = treeMapTestDriver0.size();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj9 = treeMapTestDriver7.get((java.lang.Object) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test056");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 'a');
        java.lang.Object obj8 = treeMapTestDriver0.get((java.lang.Object) 0L);
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        boolean boolean10 = treeMapTestDriver9.isEmpty();
        experiment.util.Collection collection11 = treeMapTestDriver9.values();
        experiment.util.Set set12 = treeMapTestDriver9.keySet();
        boolean boolean13 = treeMapTestDriver9.isEmpty();
        java.lang.Object obj15 = treeMapTestDriver9.get((java.lang.Object) (-1.0d));
        experiment.util.Collection collection16 = treeMapTestDriver9.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver17 = new experiment.util.TreeMapTestDriver();
        boolean boolean18 = treeMapTestDriver17.isEmpty();
        int int19 = treeMapTestDriver17.size();
        experiment.util.Comparator comparator20 = treeMapTestDriver17.comparator();
        experiment.util.Comparator comparator21 = treeMapTestDriver17.comparator();
        boolean boolean22 = treeMapTestDriver17.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = treeMapTestDriver0.put((java.lang.Object) collection16, (java.lang.Object) treeMapTestDriver17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.ArrayList cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(comparator20);
        org.junit.Assert.assertNull(comparator21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test057");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        experiment.util.Comparator comparator5 = treeMapTestDriver0.comparator();
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass8 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(comparator5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test058");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        int int2 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver5 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj7 = treeMapTestDriver5.get((java.lang.Object) 1.0f);
        experiment.util.Collection collection8 = treeMapTestDriver5.values();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test059");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) (-1.0d));
        boolean boolean7 = treeMapTestDriver0.isEmpty();
        experiment.util.Set set8 = treeMapTestDriver0.entrySet();
        experiment.util.Collection collection9 = treeMapTestDriver0.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver10 = new experiment.util.TreeMapTestDriver();
        boolean boolean11 = treeMapTestDriver10.isEmpty();
        experiment.util.Collection collection12 = treeMapTestDriver10.values();
        experiment.util.Set set13 = treeMapTestDriver10.keySet();
        boolean boolean14 = treeMapTestDriver10.isEmpty();
        java.lang.Object obj16 = treeMapTestDriver10.get((java.lang.Object) 'a');
        java.lang.Object obj18 = treeMapTestDriver10.get((java.lang.Object) 0L);
        boolean boolean19 = treeMapTestDriver10.isEmpty();
        int int20 = treeMapTestDriver10.size();
        int int21 = treeMapTestDriver10.size();
        experiment.util.Collection collection22 = treeMapTestDriver10.values();
        experiment.util.Collection collection23 = treeMapTestDriver10.values();
        experiment.util.Collection collection24 = treeMapTestDriver10.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver25 = new experiment.util.TreeMapTestDriver();
        boolean boolean26 = treeMapTestDriver25.isEmpty();
        experiment.util.Collection collection27 = treeMapTestDriver25.values();
        experiment.util.Set set28 = treeMapTestDriver25.keySet();
        boolean boolean29 = treeMapTestDriver25.isEmpty();
        java.lang.Object obj31 = treeMapTestDriver25.get((java.lang.Object) (-1.0d));
        experiment.util.Collection collection32 = treeMapTestDriver25.values();
        experiment.util.Comparator comparator33 = treeMapTestDriver25.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = treeMapTestDriver0.put((java.lang.Object) treeMapTestDriver10, (java.lang.Object) comparator33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNull(comparator33);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test060");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        int int2 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        boolean boolean8 = treeMapTestDriver7.isEmpty();
        experiment.util.Collection collection9 = treeMapTestDriver7.values();
        experiment.util.Set set10 = treeMapTestDriver7.keySet();
        boolean boolean11 = treeMapTestDriver7.isEmpty();
        experiment.util.Set set12 = treeMapTestDriver7.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = treeMapTestDriver0.remove((java.lang.Object) set12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(set12);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test061");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 1.0f);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Collection collection4 = treeMapTestDriver0.values();
        experiment.util.Comparator comparator5 = treeMapTestDriver0.comparator();
        java.lang.Object obj7 = treeMapTestDriver0.get((java.lang.Object) (short) 1);
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = treeMapTestDriver0.get(obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(comparator5);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test062");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 'a');
        java.lang.Object obj8 = treeMapTestDriver0.get((java.lang.Object) 0L);
        boolean boolean9 = treeMapTestDriver0.isEmpty();
        int int10 = treeMapTestDriver0.size();
        experiment.util.Set set11 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver12 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj14 = treeMapTestDriver12.get((java.lang.Object) 1.0f);
        experiment.util.Comparator comparator15 = treeMapTestDriver12.comparator();
        experiment.util.Set set16 = treeMapTestDriver12.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = treeMapTestDriver0.containsKey((java.lang.Object) set16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(comparator15);
        org.junit.Assert.assertNotNull(set16);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test063");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        experiment.util.Comparator comparator5 = treeMapTestDriver0.comparator();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        boolean boolean8 = treeMapTestDriver7.isEmpty();
        experiment.util.Collection collection9 = treeMapTestDriver7.values();
        experiment.util.Set set10 = treeMapTestDriver7.keySet();
        boolean boolean11 = treeMapTestDriver7.isEmpty();
        experiment.util.Comparator comparator12 = treeMapTestDriver7.comparator();
        boolean boolean14 = treeMapTestDriver7.containsKey((java.lang.Object) 1L);
        java.lang.Object obj15 = treeMapTestDriver0.get((java.lang.Object) boolean14);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(comparator5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test064");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        int int2 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver6 = new experiment.util.TreeMapTestDriver();
        boolean boolean7 = treeMapTestDriver6.isEmpty();
        experiment.util.Collection collection8 = treeMapTestDriver6.values();
        experiment.util.Set set9 = treeMapTestDriver6.keySet();
        boolean boolean10 = treeMapTestDriver6.isEmpty();
        java.lang.Object obj12 = treeMapTestDriver6.get((java.lang.Object) 'a');
        java.lang.Object obj14 = treeMapTestDriver6.get((java.lang.Object) 0L);
        boolean boolean15 = treeMapTestDriver6.isEmpty();
        int int16 = treeMapTestDriver6.size();
        int int17 = treeMapTestDriver6.size();
        experiment.util.Collection collection18 = treeMapTestDriver6.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = treeMapTestDriver0.remove((java.lang.Object) collection18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.ArrayList cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test065");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) (-1.0d));
        boolean boolean7 = treeMapTestDriver0.isEmpty();
        experiment.util.Set set8 = treeMapTestDriver0.entrySet();
        experiment.util.Collection collection9 = treeMapTestDriver0.values();
        java.lang.Object obj11 = treeMapTestDriver0.get((java.lang.Object) 10L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test066");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver4 = new experiment.util.TreeMapTestDriver();
        boolean boolean5 = treeMapTestDriver4.isEmpty();
        experiment.util.Collection collection6 = treeMapTestDriver4.values();
        experiment.util.Set set7 = treeMapTestDriver4.keySet();
        boolean boolean8 = treeMapTestDriver4.isEmpty();
        java.lang.Object obj10 = treeMapTestDriver4.get((java.lang.Object) 'a');
        java.lang.Object obj12 = treeMapTestDriver4.get((java.lang.Object) 0L);
        boolean boolean13 = treeMapTestDriver4.isEmpty();
        int int14 = treeMapTestDriver4.size();
        int int15 = treeMapTestDriver4.size();
        java.lang.Object obj18 = treeMapTestDriver4.put((java.lang.Object) (-1), (java.lang.Object) true);
        experiment.util.Set set19 = treeMapTestDriver4.keySet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set19);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test067");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 'a');
        java.lang.Object obj8 = treeMapTestDriver0.get((java.lang.Object) 0L);
        boolean boolean9 = treeMapTestDriver0.isEmpty();
        int int10 = treeMapTestDriver0.size();
        experiment.util.Set set11 = treeMapTestDriver0.keySet();
        java.lang.Class<?> wildcardClass12 = set11.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test068");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 'a');
        java.lang.Object obj8 = treeMapTestDriver0.get((java.lang.Object) 0L);
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        boolean boolean10 = treeMapTestDriver9.isEmpty();
        experiment.util.Collection collection11 = treeMapTestDriver9.values();
        experiment.util.Set set12 = treeMapTestDriver9.keySet();
        boolean boolean13 = treeMapTestDriver9.isEmpty();
        java.lang.Object obj15 = treeMapTestDriver9.get((java.lang.Object) (-1.0d));
        boolean boolean16 = treeMapTestDriver9.isEmpty();
        treeMapTestDriver9.clear();
        java.lang.Object obj19 = treeMapTestDriver9.remove((java.lang.Object) 0.0d);
        experiment.util.TreeMapTestDriver treeMapTestDriver20 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set21 = treeMapTestDriver20.keySet();
        experiment.util.Collection collection22 = treeMapTestDriver20.values();
        java.lang.Object obj23 = treeMapTestDriver0.put((java.lang.Object) 0.0d, (java.lang.Object) treeMapTestDriver20);
        experiment.util.Collection collection24 = treeMapTestDriver0.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver25 = new experiment.util.TreeMapTestDriver();
        boolean boolean26 = treeMapTestDriver25.isEmpty();
        experiment.util.Collection collection27 = treeMapTestDriver25.values();
        experiment.util.Set set28 = treeMapTestDriver25.keySet();
        experiment.util.Set set29 = treeMapTestDriver25.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = treeMapTestDriver0.containsKey((java.lang.Object) set29);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(set29);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test069");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        experiment.util.Comparator comparator5 = treeMapTestDriver0.comparator();
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) (short) 10);
        boolean boolean8 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        boolean boolean10 = treeMapTestDriver9.isEmpty();
        int int11 = treeMapTestDriver9.size();
        experiment.util.Comparator comparator12 = treeMapTestDriver9.comparator();
        experiment.util.Set set13 = treeMapTestDriver9.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(comparator5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertNotNull(set13);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test070");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) (-1.0d));
        java.lang.Object obj8 = treeMapTestDriver0.remove((java.lang.Object) '4');
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        boolean boolean10 = treeMapTestDriver9.isEmpty();
        experiment.util.Collection collection11 = treeMapTestDriver9.values();
        experiment.util.Set set12 = treeMapTestDriver9.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver13 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj15 = treeMapTestDriver13.get((java.lang.Object) 1.0f);
        experiment.util.Collection collection16 = treeMapTestDriver13.values();
        experiment.util.Comparator comparator17 = treeMapTestDriver13.comparator();
        experiment.util.Set set18 = treeMapTestDriver13.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = treeMapTestDriver0.put((java.lang.Object) treeMapTestDriver9, (java.lang.Object) set18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNull(comparator17);
        org.junit.Assert.assertNotNull(set18);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test071");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 'a');
        java.lang.Object obj8 = treeMapTestDriver0.get((java.lang.Object) 0L);
        boolean boolean9 = treeMapTestDriver0.isEmpty();
        experiment.util.Comparator comparator10 = treeMapTestDriver0.comparator();
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver12 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj14 = treeMapTestDriver12.get((java.lang.Object) 1.0f);
        experiment.util.Comparator comparator15 = treeMapTestDriver12.comparator();
        experiment.util.Set set16 = treeMapTestDriver12.entrySet();
        experiment.util.Set set17 = treeMapTestDriver12.entrySet();
        java.lang.Class<?> wildcardClass18 = treeMapTestDriver12.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(comparator15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test072");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        int int5 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver6 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj8 = treeMapTestDriver6.get((java.lang.Object) 1.0f);
        experiment.util.Comparator comparator9 = treeMapTestDriver6.comparator();
        experiment.util.Set set10 = treeMapTestDriver6.keySet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertNotNull(set10);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test073");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) (-1.0d));
        boolean boolean7 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = treeMapTestDriver0.remove(obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test074");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        int int2 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        int int6 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set8 = treeMapTestDriver7.keySet();
        experiment.util.Collection collection9 = treeMapTestDriver7.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver10 = new experiment.util.TreeMapTestDriver();
        boolean boolean11 = treeMapTestDriver10.isEmpty();
        experiment.util.Collection collection12 = treeMapTestDriver10.values();
        experiment.util.Set set13 = treeMapTestDriver10.keySet();
        boolean boolean14 = treeMapTestDriver10.isEmpty();
        java.lang.Object obj16 = treeMapTestDriver10.get((java.lang.Object) (-1.0d));
        boolean boolean17 = treeMapTestDriver10.isEmpty();
        experiment.util.Set set18 = treeMapTestDriver10.entrySet();
        int int19 = treeMapTestDriver10.size();
        int int20 = treeMapTestDriver10.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = treeMapTestDriver0.put((java.lang.Object) treeMapTestDriver7, (java.lang.Object) int20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test075");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 1.0f);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        int int4 = treeMapTestDriver0.size();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        int int6 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj9 = treeMapTestDriver7.get((java.lang.Object) 1.0f);
        experiment.util.Comparator comparator10 = treeMapTestDriver7.comparator();
        int int11 = treeMapTestDriver7.size();
        boolean boolean12 = treeMapTestDriver7.isEmpty();
        java.lang.Object obj14 = treeMapTestDriver7.get((java.lang.Object) ' ');
        treeMapTestDriver7.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test076");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 1.0f);
        experiment.util.Collection collection3 = treeMapTestDriver0.values();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator5 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver6 = new experiment.util.TreeMapTestDriver();
        boolean boolean7 = treeMapTestDriver6.isEmpty();
        int int8 = treeMapTestDriver6.size();
        experiment.util.Comparator comparator9 = treeMapTestDriver6.comparator();
        experiment.util.Comparator comparator10 = treeMapTestDriver6.comparator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertNull(comparator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertNull(comparator10);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test077");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) (-1.0d));
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        int int8 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj11 = treeMapTestDriver9.get((java.lang.Object) 1.0f);
        experiment.util.Collection collection12 = treeMapTestDriver9.values();
        experiment.util.Set set13 = treeMapTestDriver9.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(set13);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test078");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) (-1.0d));
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        int int8 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        boolean boolean10 = treeMapTestDriver9.isEmpty();
        experiment.util.Collection collection11 = treeMapTestDriver9.values();
        experiment.util.Set set12 = treeMapTestDriver9.keySet();
        boolean boolean13 = treeMapTestDriver9.isEmpty();
        experiment.util.Comparator comparator14 = treeMapTestDriver9.comparator();
        experiment.util.Comparator comparator15 = treeMapTestDriver9.comparator();
        experiment.util.Comparator comparator16 = treeMapTestDriver9.comparator();
        experiment.util.Set set17 = treeMapTestDriver9.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver18 = new experiment.util.TreeMapTestDriver();
        boolean boolean19 = treeMapTestDriver18.isEmpty();
        experiment.util.Collection collection20 = treeMapTestDriver18.values();
        experiment.util.Set set21 = treeMapTestDriver18.keySet();
        boolean boolean22 = treeMapTestDriver18.isEmpty();
        java.lang.Object obj24 = treeMapTestDriver18.get((java.lang.Object) 'a');
        java.lang.Object obj26 = treeMapTestDriver18.get((java.lang.Object) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = treeMapTestDriver0.put((java.lang.Object) set17, (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(comparator14);
        org.junit.Assert.assertNull(comparator15);
        org.junit.Assert.assertNull(comparator16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test079");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        int int2 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver5 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj7 = treeMapTestDriver5.get((java.lang.Object) 1.0f);
        experiment.util.Comparator comparator8 = treeMapTestDriver5.comparator();
        int int9 = treeMapTestDriver5.size();
        boolean boolean10 = treeMapTestDriver5.isEmpty();
        java.lang.Object obj12 = treeMapTestDriver5.get((java.lang.Object) ' ');
        experiment.util.Set set13 = treeMapTestDriver5.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = treeMapTestDriver0.remove((java.lang.Object) set13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(comparator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test080");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        boolean boolean3 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver4 = new experiment.util.TreeMapTestDriver();
        boolean boolean5 = treeMapTestDriver4.isEmpty();
        experiment.util.Collection collection6 = treeMapTestDriver4.values();
        experiment.util.Set set7 = treeMapTestDriver4.keySet();
        boolean boolean8 = treeMapTestDriver4.isEmpty();
        java.lang.Object obj10 = treeMapTestDriver4.get((java.lang.Object) (-1.0d));
        java.lang.Object obj12 = treeMapTestDriver4.remove((java.lang.Object) '4');
        treeMapTestDriver4.clear();
        experiment.util.Set set14 = treeMapTestDriver4.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set14);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test081");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        int int2 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver5 = new experiment.util.TreeMapTestDriver();
        boolean boolean6 = treeMapTestDriver5.isEmpty();
        int int7 = treeMapTestDriver5.size();
        experiment.util.Comparator comparator8 = treeMapTestDriver5.comparator();
        experiment.util.Comparator comparator9 = treeMapTestDriver5.comparator();
        experiment.util.Collection collection10 = treeMapTestDriver5.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(comparator8);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test082");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) (-1.0d));
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.Comparator comparator8 = treeMapTestDriver0.comparator();
        boolean boolean9 = treeMapTestDriver0.isEmpty();
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver11 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj13 = treeMapTestDriver11.get((java.lang.Object) 1.0f);
        experiment.util.Comparator comparator14 = treeMapTestDriver11.comparator();
        experiment.util.Set set15 = treeMapTestDriver11.keySet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(comparator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(comparator14);
        org.junit.Assert.assertNotNull(set15);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test083");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 'a');
        java.lang.Object obj8 = treeMapTestDriver0.get((java.lang.Object) 0L);
        experiment.util.Comparator comparator9 = treeMapTestDriver0.comparator();
        treeMapTestDriver0.clear();
        experiment.util.Collection collection11 = treeMapTestDriver0.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver12 = new experiment.util.TreeMapTestDriver();
        boolean boolean13 = treeMapTestDriver12.isEmpty();
        int int14 = treeMapTestDriver12.size();
        experiment.util.Comparator comparator15 = treeMapTestDriver12.comparator();
        treeMapTestDriver12.clear();
        treeMapTestDriver12.clear();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(comparator15);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test084");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 'a');
        java.lang.Object obj8 = treeMapTestDriver0.get((java.lang.Object) 0L);
        boolean boolean9 = treeMapTestDriver0.isEmpty();
        int int10 = treeMapTestDriver0.size();
        int int11 = treeMapTestDriver0.size();
        java.lang.Object obj14 = treeMapTestDriver0.put((java.lang.Object) (-1), (java.lang.Object) true);
        experiment.util.Set set15 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver16 = new experiment.util.TreeMapTestDriver();
        boolean boolean17 = treeMapTestDriver16.isEmpty();
        experiment.util.Collection collection18 = treeMapTestDriver16.values();
        experiment.util.Set set19 = treeMapTestDriver16.keySet();
        boolean boolean20 = treeMapTestDriver16.isEmpty();
        java.lang.Object obj22 = treeMapTestDriver16.get((java.lang.Object) (-1.0d));
        boolean boolean23 = treeMapTestDriver16.isEmpty();
        experiment.util.Set set24 = treeMapTestDriver16.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver25 = new experiment.util.TreeMapTestDriver();
        boolean boolean26 = treeMapTestDriver25.isEmpty();
        experiment.util.Collection collection27 = treeMapTestDriver25.values();
        experiment.util.Set set28 = treeMapTestDriver25.keySet();
        boolean boolean29 = treeMapTestDriver25.isEmpty();
        experiment.util.Set set30 = treeMapTestDriver25.keySet();
        experiment.util.Set set31 = treeMapTestDriver25.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = treeMapTestDriver0.put((java.lang.Object) treeMapTestDriver16, (java.lang.Object) treeMapTestDriver25);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(set31);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test085");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 1.0f);
        experiment.util.TreeMapTestDriver treeMapTestDriver3 = new experiment.util.TreeMapTestDriver();
        boolean boolean4 = treeMapTestDriver3.isEmpty();
        experiment.util.Collection collection5 = treeMapTestDriver3.values();
        experiment.util.Set set6 = treeMapTestDriver3.keySet();
        boolean boolean7 = treeMapTestDriver3.isEmpty();
        java.lang.Object obj9 = treeMapTestDriver3.get((java.lang.Object) 'a');
        java.lang.Object obj11 = treeMapTestDriver3.get((java.lang.Object) 0L);
        boolean boolean12 = treeMapTestDriver3.isEmpty();
        experiment.util.Comparator comparator13 = treeMapTestDriver3.comparator();
        experiment.util.Set set14 = treeMapTestDriver3.keySet();
        treeMapTestDriver3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(comparator13);
        org.junit.Assert.assertNotNull(set14);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test086");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        treeMapTestDriver0.clear();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver5 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj7 = treeMapTestDriver5.get((java.lang.Object) 1.0f);
        experiment.util.Collection collection8 = treeMapTestDriver5.values();
        experiment.util.Comparator comparator9 = treeMapTestDriver5.comparator();
        experiment.util.Set set10 = treeMapTestDriver5.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = treeMapTestDriver0.put((java.lang.Object) treeMapTestDriver5, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertNotNull(set10);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test087");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        int int2 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        int int6 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        boolean boolean8 = treeMapTestDriver7.isEmpty();
        int int9 = treeMapTestDriver7.size();
        experiment.util.Comparator comparator10 = treeMapTestDriver7.comparator();
        boolean boolean12 = treeMapTestDriver7.containsKey((java.lang.Object) (byte) 100);
        boolean boolean13 = treeMapTestDriver0.containsKey((java.lang.Object) boolean12);
        experiment.util.TreeMapTestDriver treeMapTestDriver14 = new experiment.util.TreeMapTestDriver();
        boolean boolean15 = treeMapTestDriver14.isEmpty();
        experiment.util.Collection collection16 = treeMapTestDriver14.values();
        experiment.util.Set set17 = treeMapTestDriver14.keySet();
        boolean boolean18 = treeMapTestDriver14.isEmpty();
        java.lang.Object obj20 = treeMapTestDriver14.get((java.lang.Object) 'a');
        java.lang.Object obj22 = treeMapTestDriver14.get((java.lang.Object) 0L);
        boolean boolean23 = treeMapTestDriver14.isEmpty();
        int int24 = treeMapTestDriver14.size();
        int int25 = treeMapTestDriver14.size();
        experiment.util.Collection collection26 = treeMapTestDriver14.values();
        experiment.util.Collection collection27 = treeMapTestDriver14.values();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = treeMapTestDriver0.containsKey((java.lang.Object) collection27);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.ArrayList cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(collection27);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test088");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver5 = new experiment.util.TreeMapTestDriver();
        boolean boolean6 = treeMapTestDriver5.isEmpty();
        experiment.util.Collection collection7 = treeMapTestDriver5.values();
        experiment.util.Set set8 = treeMapTestDriver5.keySet();
        boolean boolean9 = treeMapTestDriver5.isEmpty();
        java.lang.Object obj11 = treeMapTestDriver5.get((java.lang.Object) (-1.0d));
        experiment.util.Collection collection12 = treeMapTestDriver5.values();
        java.lang.Object obj13 = treeMapTestDriver0.put((java.lang.Object) 10.0f, (java.lang.Object) collection12);
        experiment.util.TreeMapTestDriver treeMapTestDriver14 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set15 = treeMapTestDriver14.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver16 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj18 = treeMapTestDriver16.get((java.lang.Object) 1.0f);
        int int19 = treeMapTestDriver16.size();
        boolean boolean20 = treeMapTestDriver14.containsKey((java.lang.Object) int19);
        experiment.util.Collection collection21 = treeMapTestDriver14.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = treeMapTestDriver0.put((java.lang.Object) collection21, (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.ArrayList cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(collection21);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test089");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 1.0f);
        experiment.util.Collection collection3 = treeMapTestDriver0.values();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        experiment.util.Set set5 = treeMapTestDriver0.keySet();
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        boolean boolean8 = treeMapTestDriver7.isEmpty();
        experiment.util.Collection collection9 = treeMapTestDriver7.values();
        experiment.util.Set set10 = treeMapTestDriver7.keySet();
        boolean boolean11 = treeMapTestDriver7.isEmpty();
        java.lang.Object obj13 = treeMapTestDriver7.get((java.lang.Object) 'a');
        java.lang.Object obj15 = treeMapTestDriver7.get((java.lang.Object) 0L);
        boolean boolean16 = treeMapTestDriver7.isEmpty();
        experiment.util.Collection collection17 = treeMapTestDriver7.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = treeMapTestDriver0.remove((java.lang.Object) collection17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.ArrayList cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(collection17);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test090");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        int int2 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        int int5 = treeMapTestDriver0.size();
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        int int7 = treeMapTestDriver0.size();
        experiment.util.Collection collection8 = treeMapTestDriver0.values();
        experiment.util.Comparator comparator9 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver10 = new experiment.util.TreeMapTestDriver();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(comparator9);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test091");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        int int2 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        int int5 = treeMapTestDriver0.size();
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        int int7 = treeMapTestDriver0.size();
        experiment.util.Collection collection8 = treeMapTestDriver0.values();
        experiment.util.Comparator comparator9 = treeMapTestDriver0.comparator();
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver11 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set12 = treeMapTestDriver11.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver13 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj15 = treeMapTestDriver13.get((java.lang.Object) 1.0f);
        int int16 = treeMapTestDriver13.size();
        boolean boolean17 = treeMapTestDriver11.containsKey((java.lang.Object) int16);
        experiment.util.Collection collection18 = treeMapTestDriver11.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test092");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        int int2 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        int int5 = treeMapTestDriver0.size();
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        boolean boolean8 = treeMapTestDriver7.isEmpty();
        experiment.util.Collection collection9 = treeMapTestDriver7.values();
        experiment.util.Set set10 = treeMapTestDriver7.keySet();
        experiment.util.Set set11 = treeMapTestDriver7.entrySet();
        int int12 = treeMapTestDriver7.size();
        experiment.util.Collection collection13 = treeMapTestDriver7.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = treeMapTestDriver0.get((java.lang.Object) collection13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.ArrayList cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test093");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 1.0f);
        experiment.util.Collection collection3 = treeMapTestDriver0.values();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator5 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver6 = new experiment.util.TreeMapTestDriver();
        boolean boolean7 = treeMapTestDriver6.isEmpty();
        int int8 = treeMapTestDriver6.size();
        experiment.util.Comparator comparator9 = treeMapTestDriver6.comparator();
        boolean boolean10 = treeMapTestDriver6.isEmpty();
        boolean boolean11 = treeMapTestDriver6.isEmpty();
        experiment.util.Collection collection12 = treeMapTestDriver6.values();
        experiment.util.Set set13 = treeMapTestDriver6.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver14 = new experiment.util.TreeMapTestDriver();
        boolean boolean15 = treeMapTestDriver14.isEmpty();
        experiment.util.Collection collection16 = treeMapTestDriver14.values();
        experiment.util.Set set17 = treeMapTestDriver14.keySet();
        boolean boolean18 = treeMapTestDriver14.isEmpty();
        java.lang.Object obj20 = treeMapTestDriver14.get((java.lang.Object) (-1.0d));
        boolean boolean21 = treeMapTestDriver14.isEmpty();
        treeMapTestDriver14.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = treeMapTestDriver0.put((java.lang.Object) treeMapTestDriver6, (java.lang.Object) treeMapTestDriver14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertNull(comparator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test094");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 1.0f);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Collection collection4 = treeMapTestDriver0.values();
        java.lang.Class<?> wildcardClass5 = collection4.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test095");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        int int2 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver5 = new experiment.util.TreeMapTestDriver();
        boolean boolean6 = treeMapTestDriver5.isEmpty();
        experiment.util.Set set7 = treeMapTestDriver5.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test096");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) (-1.0d));
        boolean boolean7 = treeMapTestDriver0.isEmpty();
        experiment.util.Set set8 = treeMapTestDriver0.entrySet();
        experiment.util.Set set9 = treeMapTestDriver0.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver10 = new experiment.util.TreeMapTestDriver();
        boolean boolean11 = treeMapTestDriver10.isEmpty();
        experiment.util.Collection collection12 = treeMapTestDriver10.values();
        treeMapTestDriver10.clear();
        java.lang.Object obj15 = treeMapTestDriver10.get((java.lang.Object) 100.0d);
        experiment.util.Collection collection16 = treeMapTestDriver10.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test097");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 'a');
        java.lang.Object obj8 = treeMapTestDriver0.get((java.lang.Object) 0L);
        experiment.util.Comparator comparator9 = treeMapTestDriver0.comparator();
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver11 = new experiment.util.TreeMapTestDriver();
        boolean boolean12 = treeMapTestDriver11.isEmpty();
        experiment.util.Collection collection13 = treeMapTestDriver11.values();
        treeMapTestDriver11.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver16 = new experiment.util.TreeMapTestDriver();
        boolean boolean17 = treeMapTestDriver16.isEmpty();
        experiment.util.Collection collection18 = treeMapTestDriver16.values();
        experiment.util.Set set19 = treeMapTestDriver16.keySet();
        boolean boolean20 = treeMapTestDriver16.isEmpty();
        java.lang.Object obj22 = treeMapTestDriver16.get((java.lang.Object) (-1.0d));
        experiment.util.Collection collection23 = treeMapTestDriver16.values();
        java.lang.Object obj24 = treeMapTestDriver11.put((java.lang.Object) 10.0f, (java.lang.Object) collection23);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test098");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        int int2 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver5 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set6 = treeMapTestDriver5.keySet();
        experiment.util.Collection collection7 = treeMapTestDriver5.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver8 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj10 = treeMapTestDriver8.get((java.lang.Object) 1.0f);
        experiment.util.Collection collection11 = treeMapTestDriver8.values();
        experiment.util.Comparator comparator12 = treeMapTestDriver8.comparator();
        experiment.util.Comparator comparator13 = treeMapTestDriver8.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = treeMapTestDriver0.put((java.lang.Object) treeMapTestDriver5, (java.lang.Object) treeMapTestDriver8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertNull(comparator13);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test099");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.keySet();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        boolean boolean3 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver4 = new experiment.util.TreeMapTestDriver();
        boolean boolean5 = treeMapTestDriver4.isEmpty();
        experiment.util.Collection collection6 = treeMapTestDriver4.values();
        experiment.util.Set set7 = treeMapTestDriver4.keySet();
        boolean boolean8 = treeMapTestDriver4.isEmpty();
        java.lang.Object obj10 = treeMapTestDriver4.get((java.lang.Object) 'a');
        java.lang.Object obj12 = treeMapTestDriver4.get((java.lang.Object) 0L);
        boolean boolean13 = treeMapTestDriver4.isEmpty();
        int int14 = treeMapTestDriver4.size();
        int int15 = treeMapTestDriver4.size();
        experiment.util.Collection collection16 = treeMapTestDriver4.values();
        java.lang.Object obj18 = treeMapTestDriver4.remove((java.lang.Object) (short) 100);
        experiment.util.Collection collection19 = treeMapTestDriver4.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver20 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj22 = treeMapTestDriver20.get((java.lang.Object) 1.0f);
        experiment.util.Comparator comparator23 = treeMapTestDriver20.comparator();
        int int24 = treeMapTestDriver20.size();
        boolean boolean25 = treeMapTestDriver20.isEmpty();
        java.lang.Object obj27 = treeMapTestDriver20.get((java.lang.Object) ' ');
        treeMapTestDriver20.clear();
        boolean boolean29 = treeMapTestDriver20.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = treeMapTestDriver0.put((java.lang.Object) collection19, (java.lang.Object) treeMapTestDriver20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.ArrayList cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(comparator23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test100");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 'a');
        java.lang.Object obj8 = treeMapTestDriver0.get((java.lang.Object) 0L);
        experiment.util.Comparator comparator9 = treeMapTestDriver0.comparator();
        java.lang.Object obj11 = treeMapTestDriver0.remove((java.lang.Object) (byte) 0);
        experiment.util.TreeMapTestDriver treeMapTestDriver12 = new experiment.util.TreeMapTestDriver();
        boolean boolean13 = treeMapTestDriver12.isEmpty();
        experiment.util.Collection collection14 = treeMapTestDriver12.values();
        experiment.util.Set set15 = treeMapTestDriver12.keySet();
        boolean boolean16 = treeMapTestDriver12.isEmpty();
        java.lang.Object obj18 = treeMapTestDriver12.get((java.lang.Object) 'a');
        experiment.util.Collection collection19 = treeMapTestDriver12.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(collection19);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test101");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 1.0f);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        int int4 = treeMapTestDriver0.size();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj7 = treeMapTestDriver0.get((java.lang.Object) ' ');
        experiment.util.Set set8 = treeMapTestDriver0.keySet();
        treeMapTestDriver0.clear();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test102");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        treeMapTestDriver0.clear();
        treeMapTestDriver0.clear();
        experiment.util.Set set5 = treeMapTestDriver0.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver6 = new experiment.util.TreeMapTestDriver();
        boolean boolean7 = treeMapTestDriver6.isEmpty();
        experiment.util.Collection collection8 = treeMapTestDriver6.values();
        experiment.util.Set set9 = treeMapTestDriver6.keySet();
        boolean boolean10 = treeMapTestDriver6.isEmpty();
        java.lang.Object obj12 = treeMapTestDriver6.get((java.lang.Object) (-1.0d));
        experiment.util.Collection collection13 = treeMapTestDriver6.values();
        experiment.util.Comparator comparator14 = treeMapTestDriver6.comparator();
        experiment.util.Set set15 = treeMapTestDriver6.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver16 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set17 = treeMapTestDriver16.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = treeMapTestDriver0.put((java.lang.Object) treeMapTestDriver6, (java.lang.Object) set17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(comparator14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(set17);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test103");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        treeMapTestDriver0.clear();
        java.lang.Object obj5 = treeMapTestDriver0.get((java.lang.Object) 100.0d);
        experiment.util.TreeMapTestDriver treeMapTestDriver6 = new experiment.util.TreeMapTestDriver();
        boolean boolean7 = treeMapTestDriver6.isEmpty();
        experiment.util.Collection collection8 = treeMapTestDriver6.values();
        experiment.util.Set set9 = treeMapTestDriver6.keySet();
        boolean boolean10 = treeMapTestDriver6.isEmpty();
        experiment.util.Comparator comparator11 = treeMapTestDriver6.comparator();
        experiment.util.Collection collection12 = treeMapTestDriver6.values();
        experiment.util.Set set13 = treeMapTestDriver6.entrySet();
        experiment.util.Collection collection14 = treeMapTestDriver6.values();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = treeMapTestDriver0.containsKey((java.lang.Object) collection14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.ArrayList cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test104");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) (-1.0d));
        boolean boolean7 = treeMapTestDriver0.isEmpty();
        treeMapTestDriver0.clear();
        java.lang.Object obj10 = treeMapTestDriver0.remove((java.lang.Object) 0.0d);
        experiment.util.TreeMapTestDriver treeMapTestDriver11 = new experiment.util.TreeMapTestDriver();
        boolean boolean12 = treeMapTestDriver11.isEmpty();
        experiment.util.Collection collection13 = treeMapTestDriver11.values();
        treeMapTestDriver11.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver16 = new experiment.util.TreeMapTestDriver();
        boolean boolean17 = treeMapTestDriver16.isEmpty();
        experiment.util.Collection collection18 = treeMapTestDriver16.values();
        experiment.util.Set set19 = treeMapTestDriver16.keySet();
        boolean boolean20 = treeMapTestDriver16.isEmpty();
        java.lang.Object obj22 = treeMapTestDriver16.get((java.lang.Object) (-1.0d));
        experiment.util.Collection collection23 = treeMapTestDriver16.values();
        java.lang.Object obj24 = treeMapTestDriver11.put((java.lang.Object) 10.0f, (java.lang.Object) collection23);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = treeMapTestDriver0.containsKey((java.lang.Object) collection23);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.ArrayList cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test105");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        int int2 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) (byte) 100);
        experiment.util.TreeMapTestDriver treeMapTestDriver6 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj8 = treeMapTestDriver6.get((java.lang.Object) 1.0f);
        experiment.util.Comparator comparator9 = treeMapTestDriver6.comparator();
        experiment.util.Collection collection10 = treeMapTestDriver6.values();
        experiment.util.Set set11 = treeMapTestDriver6.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver12 = new experiment.util.TreeMapTestDriver();
        boolean boolean13 = treeMapTestDriver12.isEmpty();
        experiment.util.Collection collection14 = treeMapTestDriver12.values();
        experiment.util.Set set15 = treeMapTestDriver12.keySet();
        boolean boolean16 = treeMapTestDriver12.isEmpty();
        experiment.util.Set set17 = treeMapTestDriver12.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = treeMapTestDriver0.put((java.lang.Object) set11, (java.lang.Object) treeMapTestDriver12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(set17);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test106");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 'a');
        java.lang.Object obj8 = treeMapTestDriver0.get((java.lang.Object) 0L);
        boolean boolean9 = treeMapTestDriver0.isEmpty();
        int int10 = treeMapTestDriver0.size();
        int int11 = treeMapTestDriver0.size();
        experiment.util.Collection collection12 = treeMapTestDriver0.values();
        experiment.util.Collection collection13 = treeMapTestDriver0.values();
        java.lang.Class<?> wildcardClass14 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test107");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 'a');
        java.lang.Object obj8 = treeMapTestDriver0.get((java.lang.Object) 0L);
        boolean boolean9 = treeMapTestDriver0.isEmpty();
        experiment.util.Comparator comparator10 = treeMapTestDriver0.comparator();
        experiment.util.Set set11 = treeMapTestDriver0.keySet();
        java.lang.Class<?> wildcardClass12 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test108");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 1.0f);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        int int4 = treeMapTestDriver0.size();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        int int6 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator7 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver8 = new experiment.util.TreeMapTestDriver();
        boolean boolean9 = treeMapTestDriver8.isEmpty();
        experiment.util.Collection collection10 = treeMapTestDriver8.values();
        experiment.util.Collection collection11 = treeMapTestDriver8.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver12 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj14 = treeMapTestDriver12.get((java.lang.Object) 1.0f);
        experiment.util.Comparator comparator15 = treeMapTestDriver12.comparator();
        int int16 = treeMapTestDriver12.size();
        boolean boolean17 = treeMapTestDriver12.isEmpty();
        int int18 = treeMapTestDriver12.size();
        boolean boolean19 = treeMapTestDriver8.containsKey((java.lang.Object) int18);
        experiment.util.Set set20 = treeMapTestDriver8.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = treeMapTestDriver0.get((java.lang.Object) set20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(comparator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(comparator15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(set20);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test109");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 1.0f);
        experiment.util.Collection collection3 = treeMapTestDriver0.values();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        experiment.util.Set set5 = treeMapTestDriver0.keySet();
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        treeMapTestDriver0.clear();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test110");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 'a');
        java.lang.Object obj8 = treeMapTestDriver0.get((java.lang.Object) 0L);
        boolean boolean9 = treeMapTestDriver0.isEmpty();
        experiment.util.Comparator comparator10 = treeMapTestDriver0.comparator();
        boolean boolean11 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver12 = new experiment.util.TreeMapTestDriver();
        boolean boolean13 = treeMapTestDriver12.isEmpty();
        experiment.util.Collection collection14 = treeMapTestDriver12.values();
        experiment.util.Set set15 = treeMapTestDriver12.keySet();
        boolean boolean16 = treeMapTestDriver12.isEmpty();
        java.lang.Object obj18 = treeMapTestDriver12.get((java.lang.Object) (-1.0d));
        java.lang.Object obj20 = treeMapTestDriver12.remove((java.lang.Object) '4');
        treeMapTestDriver12.clear();
        experiment.util.Set set22 = treeMapTestDriver12.keySet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set22);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test111");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 'a');
        java.lang.Object obj8 = treeMapTestDriver0.get((java.lang.Object) 0L);
        treeMapTestDriver0.clear();
        experiment.util.Set set10 = treeMapTestDriver0.entrySet();
        experiment.util.Collection collection11 = treeMapTestDriver0.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver12 = new experiment.util.TreeMapTestDriver();
        boolean boolean13 = treeMapTestDriver12.isEmpty();
        java.lang.Object obj14 = treeMapTestDriver0.remove((java.lang.Object) boolean13);
        experiment.util.Collection collection15 = treeMapTestDriver0.values();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test112");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        experiment.util.Comparator comparator5 = treeMapTestDriver0.comparator();
        boolean boolean7 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        int int8 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        boolean boolean10 = treeMapTestDriver9.isEmpty();
        experiment.util.Collection collection11 = treeMapTestDriver9.values();
        experiment.util.Set set12 = treeMapTestDriver9.keySet();
        boolean boolean13 = treeMapTestDriver9.isEmpty();
        experiment.util.Comparator comparator14 = treeMapTestDriver9.comparator();
        java.lang.Object obj16 = treeMapTestDriver9.remove((java.lang.Object) (short) 10);
        boolean boolean17 = treeMapTestDriver9.isEmpty();
        java.lang.Object obj18 = treeMapTestDriver0.get((java.lang.Object) boolean17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = obj18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(comparator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(comparator14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test113");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 'a');
        java.lang.Object obj8 = treeMapTestDriver0.get((java.lang.Object) 0L);
        experiment.util.Comparator comparator9 = treeMapTestDriver0.comparator();
        java.lang.Object obj11 = treeMapTestDriver0.remove((java.lang.Object) (byte) 0);
        experiment.util.TreeMapTestDriver treeMapTestDriver12 = new experiment.util.TreeMapTestDriver();
        boolean boolean13 = treeMapTestDriver12.isEmpty();
        experiment.util.Collection collection14 = treeMapTestDriver12.values();
        experiment.util.Set set15 = treeMapTestDriver12.keySet();
        boolean boolean16 = treeMapTestDriver12.isEmpty();
        experiment.util.Comparator comparator17 = treeMapTestDriver12.comparator();
        experiment.util.Collection collection18 = treeMapTestDriver12.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(comparator17);
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test114");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        int int2 = treeMapTestDriver0.size();
        experiment.util.Collection collection3 = treeMapTestDriver0.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver4 = new experiment.util.TreeMapTestDriver();
        boolean boolean5 = treeMapTestDriver4.isEmpty();
        experiment.util.Collection collection6 = treeMapTestDriver4.values();
        experiment.util.Collection collection7 = treeMapTestDriver4.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver8 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj10 = treeMapTestDriver8.get((java.lang.Object) 1.0f);
        experiment.util.Comparator comparator11 = treeMapTestDriver8.comparator();
        int int12 = treeMapTestDriver8.size();
        boolean boolean13 = treeMapTestDriver8.isEmpty();
        int int14 = treeMapTestDriver8.size();
        boolean boolean15 = treeMapTestDriver4.containsKey((java.lang.Object) int14);
        experiment.util.Set set16 = treeMapTestDriver4.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(set16);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test115");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver2 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj4 = treeMapTestDriver2.get((java.lang.Object) 1.0f);
        int int5 = treeMapTestDriver2.size();
        boolean boolean6 = treeMapTestDriver0.containsKey((java.lang.Object) int5);
        experiment.util.Collection collection7 = treeMapTestDriver0.values();
        java.lang.Class<?> wildcardClass8 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test116");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        experiment.util.Collection collection3 = treeMapTestDriver0.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver4 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj6 = treeMapTestDriver4.get((java.lang.Object) 1.0f);
        experiment.util.Comparator comparator7 = treeMapTestDriver4.comparator();
        int int8 = treeMapTestDriver4.size();
        boolean boolean9 = treeMapTestDriver4.isEmpty();
        int int10 = treeMapTestDriver4.size();
        boolean boolean11 = treeMapTestDriver0.containsKey((java.lang.Object) int10);
        experiment.util.Set set12 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver13 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj15 = treeMapTestDriver13.get((java.lang.Object) 1.0f);
        experiment.util.Collection collection16 = treeMapTestDriver13.values();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = treeMapTestDriver0.containsKey((java.lang.Object) collection16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.ArrayList cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(comparator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test117");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 1.0f);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Collection collection4 = treeMapTestDriver0.values();
        experiment.util.Set set5 = treeMapTestDriver0.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver6 = new experiment.util.TreeMapTestDriver();
        boolean boolean7 = treeMapTestDriver6.isEmpty();
        experiment.util.Collection collection8 = treeMapTestDriver6.values();
        treeMapTestDriver6.clear();
        java.lang.Object obj11 = treeMapTestDriver6.get((java.lang.Object) 100.0d);
        java.lang.Object obj12 = treeMapTestDriver0.get((java.lang.Object) 100.0d);
        int int13 = treeMapTestDriver0.size();
        experiment.util.Set set14 = treeMapTestDriver0.keySet();
        java.lang.Class<?> wildcardClass15 = set14.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test118");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        experiment.util.Collection collection3 = treeMapTestDriver0.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver4 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj6 = treeMapTestDriver4.get((java.lang.Object) 1.0f);
        experiment.util.Comparator comparator7 = treeMapTestDriver4.comparator();
        int int8 = treeMapTestDriver4.size();
        boolean boolean9 = treeMapTestDriver4.isEmpty();
        int int10 = treeMapTestDriver4.size();
        boolean boolean11 = treeMapTestDriver0.containsKey((java.lang.Object) int10);
        experiment.util.Set set12 = treeMapTestDriver0.keySet();
        java.lang.Class<?> wildcardClass13 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(comparator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test119");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        int int5 = treeMapTestDriver0.size();
        int int6 = treeMapTestDriver0.size();
        experiment.util.Set set7 = treeMapTestDriver0.entrySet();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test120");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 'a');
        java.lang.Object obj8 = treeMapTestDriver0.get((java.lang.Object) 0L);
        boolean boolean9 = treeMapTestDriver0.isEmpty();
        int int10 = treeMapTestDriver0.size();
        int int11 = treeMapTestDriver0.size();
        java.lang.Object obj14 = treeMapTestDriver0.put((java.lang.Object) (-1), (java.lang.Object) true);
        experiment.util.Set set15 = treeMapTestDriver0.keySet();
        experiment.util.Set set16 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver17 = new experiment.util.TreeMapTestDriver();
        boolean boolean18 = treeMapTestDriver17.isEmpty();
        experiment.util.Collection collection19 = treeMapTestDriver17.values();
        experiment.util.Set set20 = treeMapTestDriver17.keySet();
        experiment.util.Set set21 = treeMapTestDriver17.entrySet();
        boolean boolean22 = treeMapTestDriver17.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver23 = new experiment.util.TreeMapTestDriver();
        boolean boolean24 = treeMapTestDriver23.isEmpty();
        experiment.util.Collection collection25 = treeMapTestDriver23.values();
        experiment.util.Set set26 = treeMapTestDriver23.keySet();
        boolean boolean27 = treeMapTestDriver23.isEmpty();
        java.lang.Object obj29 = treeMapTestDriver23.get((java.lang.Object) 'a');
        experiment.util.Collection collection30 = treeMapTestDriver23.values();
        experiment.util.Set set31 = treeMapTestDriver23.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = treeMapTestDriver0.put((java.lang.Object) treeMapTestDriver17, (java.lang.Object) set31);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(set31);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test121");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 1.0f);
        experiment.util.Collection collection3 = treeMapTestDriver0.values();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        java.lang.Class<?> wildcardClass5 = set4.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test122");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 'a');
        java.lang.Object obj8 = treeMapTestDriver0.get((java.lang.Object) 0L);
        boolean boolean9 = treeMapTestDriver0.isEmpty();
        int int10 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver11 = new experiment.util.TreeMapTestDriver();
        boolean boolean12 = treeMapTestDriver11.isEmpty();
        experiment.util.Collection collection13 = treeMapTestDriver11.values();
        experiment.util.Set set14 = treeMapTestDriver11.keySet();
        boolean boolean15 = treeMapTestDriver11.isEmpty();
        java.lang.Object obj17 = treeMapTestDriver11.get((java.lang.Object) 'a');
        java.lang.Object obj19 = treeMapTestDriver11.get((java.lang.Object) 0L);
        experiment.util.Comparator comparator20 = treeMapTestDriver11.comparator();
        java.lang.Object obj22 = treeMapTestDriver11.remove((java.lang.Object) (byte) 0);
        experiment.util.TreeMapTestDriver treeMapTestDriver23 = new experiment.util.TreeMapTestDriver();
        boolean boolean24 = treeMapTestDriver23.isEmpty();
        experiment.util.Collection collection25 = treeMapTestDriver23.values();
        experiment.util.Set set26 = treeMapTestDriver23.keySet();
        boolean boolean27 = treeMapTestDriver23.isEmpty();
        java.lang.Object obj29 = treeMapTestDriver23.get((java.lang.Object) 'a');
        java.lang.Object obj31 = treeMapTestDriver23.get((java.lang.Object) 0L);
        treeMapTestDriver23.clear();
        experiment.util.Set set33 = treeMapTestDriver23.entrySet();
        java.lang.Object obj34 = treeMapTestDriver0.put((java.lang.Object) (byte) 0, (java.lang.Object) treeMapTestDriver23);
        experiment.util.Set set35 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver36 = new experiment.util.TreeMapTestDriver();
        boolean boolean37 = treeMapTestDriver36.isEmpty();
        experiment.util.Collection collection38 = treeMapTestDriver36.values();
        experiment.util.Set set39 = treeMapTestDriver36.keySet();
        boolean boolean40 = treeMapTestDriver36.isEmpty();
        java.lang.Object obj42 = treeMapTestDriver36.get((java.lang.Object) 'a');
        java.lang.Object obj44 = treeMapTestDriver36.get((java.lang.Object) 0L);
        boolean boolean45 = treeMapTestDriver36.isEmpty();
        experiment.util.Comparator comparator46 = treeMapTestDriver36.comparator();
        boolean boolean47 = treeMapTestDriver36.isEmpty();
        java.lang.Class<?> wildcardClass48 = treeMapTestDriver36.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj49 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver36);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(comparator20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNull(comparator46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test123");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        int int5 = treeMapTestDriver0.size();
        int int6 = treeMapTestDriver0.size();
        java.lang.Class<?> wildcardClass7 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test124");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) (-1.0d));
        boolean boolean7 = treeMapTestDriver0.isEmpty();
        experiment.util.Set set8 = treeMapTestDriver0.entrySet();
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver10 = new experiment.util.TreeMapTestDriver();
        boolean boolean11 = treeMapTestDriver10.isEmpty();
        experiment.util.Collection collection12 = treeMapTestDriver10.values();
        experiment.util.Set set13 = treeMapTestDriver10.keySet();
        boolean boolean14 = treeMapTestDriver10.isEmpty();
        java.lang.Object obj16 = treeMapTestDriver10.get((java.lang.Object) 'a');
        java.lang.Object obj18 = treeMapTestDriver10.get((java.lang.Object) 0L);
        boolean boolean19 = treeMapTestDriver10.isEmpty();
        int int20 = treeMapTestDriver10.size();
        experiment.util.Set set21 = treeMapTestDriver10.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = treeMapTestDriver0.get((java.lang.Object) set21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(set21);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test125");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) (-1.0d));
        boolean boolean7 = treeMapTestDriver0.isEmpty();
        experiment.util.Set set8 = treeMapTestDriver0.entrySet();
        experiment.util.Collection collection9 = treeMapTestDriver0.values();
        experiment.util.Collection collection10 = treeMapTestDriver0.values();
        boolean boolean11 = treeMapTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test126");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        int int2 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver3 = new experiment.util.TreeMapTestDriver();
        boolean boolean4 = treeMapTestDriver3.isEmpty();
        int int5 = treeMapTestDriver3.size();
        experiment.util.Comparator comparator6 = treeMapTestDriver3.comparator();
        experiment.util.Comparator comparator7 = treeMapTestDriver3.comparator();
        int int8 = treeMapTestDriver3.size();
        boolean boolean9 = treeMapTestDriver3.isEmpty();
        int int10 = treeMapTestDriver3.size();
        int int11 = treeMapTestDriver3.size();
        boolean boolean12 = treeMapTestDriver0.containsKey((java.lang.Object) int11);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertNull(comparator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test127");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) (-1.0d));
        boolean boolean7 = treeMapTestDriver0.isEmpty();
        experiment.util.Set set8 = treeMapTestDriver0.entrySet();
        treeMapTestDriver0.clear();
        int int10 = treeMapTestDriver0.size();
        java.lang.Class<?> wildcardClass11 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_2070236138_1024_0.test128");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver5 = new experiment.util.TreeMapTestDriver();
        boolean boolean6 = treeMapTestDriver5.isEmpty();
        experiment.util.Collection collection7 = treeMapTestDriver5.values();
        experiment.util.Set set8 = treeMapTestDriver5.keySet();
        boolean boolean9 = treeMapTestDriver5.isEmpty();
        java.lang.Object obj11 = treeMapTestDriver5.get((java.lang.Object) (-1.0d));
        experiment.util.Collection collection12 = treeMapTestDriver5.values();
        java.lang.Object obj13 = treeMapTestDriver0.put((java.lang.Object) 10.0f, (java.lang.Object) collection12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = obj13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj13);
    }

}
