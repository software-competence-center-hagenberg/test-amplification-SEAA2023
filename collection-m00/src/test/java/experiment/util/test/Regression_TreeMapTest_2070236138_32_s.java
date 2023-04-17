package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_TreeMapTest_2070236138_32_s {

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

}
