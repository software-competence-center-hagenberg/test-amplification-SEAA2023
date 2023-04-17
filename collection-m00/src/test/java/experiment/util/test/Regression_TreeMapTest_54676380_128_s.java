package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_TreeMapTest_54676380_128_s {

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
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test001");
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
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test002");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = obj4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test003");
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
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test004");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Comparator comparator1 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver2 = new experiment.util.TreeMapTestDriver();
        java.lang.Class<?> wildcardClass3 = treeMapTestDriver2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = treeMapTestDriver0.put((java.lang.Object) wildcardClass3, (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test005");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = obj7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test006");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) (-1));
        experiment.util.TreeMapTestDriver treeMapTestDriver6 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj8 = treeMapTestDriver6.get((java.lang.Object) 100);
        experiment.util.Comparator comparator9 = treeMapTestDriver6.comparator();
        experiment.util.Set set10 = treeMapTestDriver6.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = treeMapTestDriver0.get((java.lang.Object) set10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertNotNull(set10);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test007");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.TreeMapTestDriver treeMapTestDriver3 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj5 = treeMapTestDriver3.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj7 = treeMapTestDriver3.remove((java.lang.Object) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test008");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver5 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj7 = treeMapTestDriver5.get((java.lang.Object) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = treeMapTestDriver0.remove(obj7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test009");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        java.lang.Object obj7 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = treeMapTestDriver0.remove(obj7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Object cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test010");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver8 = new experiment.util.TreeMapTestDriver();
        experiment.util.Comparator comparator9 = treeMapTestDriver8.comparator();
        boolean boolean11 = treeMapTestDriver8.containsKey((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass12 = treeMapTestDriver8.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test011");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Comparator comparator1 = treeMapTestDriver0.comparator();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        java.lang.Class<?> wildcardClass3 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test012");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        experiment.util.Comparator comparator8 = treeMapTestDriver7.comparator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(comparator8);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test013");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) 100);
        boolean boolean8 = treeMapTestDriver0.isEmpty();
        boolean boolean9 = treeMapTestDriver0.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test014");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) (-1));
        boolean boolean7 = treeMapTestDriver0.containsKey((java.lang.Object) 10.0d);
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj11 = treeMapTestDriver9.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator12 = treeMapTestDriver9.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = treeMapTestDriver0.put((java.lang.Object) 'a', (java.lang.Object) comparator12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(comparator12);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test015");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver5 = new experiment.util.TreeMapTestDriver();
        experiment.util.Comparator comparator6 = treeMapTestDriver5.comparator();
        experiment.util.Collection collection7 = treeMapTestDriver5.values();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = treeMapTestDriver0.containsKey((java.lang.Object) collection7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.ArrayList cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test016");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.Collection collection8 = treeMapTestDriver0.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj11 = treeMapTestDriver9.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj13 = treeMapTestDriver9.remove((java.lang.Object) 0.0f);
        java.lang.Object obj15 = treeMapTestDriver9.get((java.lang.Object) 1L);
        experiment.util.Set set16 = treeMapTestDriver9.keySet();
        experiment.util.Set set17 = treeMapTestDriver9.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver18 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj20 = treeMapTestDriver18.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator21 = treeMapTestDriver18.comparator();
        treeMapTestDriver18.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = treeMapTestDriver0.put((java.lang.Object) treeMapTestDriver9, (java.lang.Object) treeMapTestDriver18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(comparator21);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test017");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj9 = treeMapTestDriver7.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj11 = treeMapTestDriver7.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection12 = treeMapTestDriver7.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test018");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver4 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj6 = treeMapTestDriver4.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator7 = treeMapTestDriver4.comparator();
        boolean boolean9 = treeMapTestDriver4.containsKey((java.lang.Object) 1L);
        boolean boolean10 = treeMapTestDriver4.isEmpty();
        experiment.util.Collection collection11 = treeMapTestDriver4.values();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = treeMapTestDriver0.containsKey((java.lang.Object) collection11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.ArrayList cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(comparator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test019");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj9 = treeMapTestDriver7.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator10 = treeMapTestDriver7.comparator();
        experiment.util.Set set11 = treeMapTestDriver7.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = treeMapTestDriver0.containsKey((java.lang.Object) set11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertNotNull(set11);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test020");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 1L);
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.Set set8 = treeMapTestDriver0.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj11 = treeMapTestDriver9.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator12 = treeMapTestDriver9.comparator();
        boolean boolean14 = treeMapTestDriver9.containsKey((java.lang.Object) 1L);
        boolean boolean15 = treeMapTestDriver9.isEmpty();
        experiment.util.Collection collection16 = treeMapTestDriver9.values();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = treeMapTestDriver0.containsKey((java.lang.Object) collection16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.ArrayList cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test021");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = comparator3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test022");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver4 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj6 = treeMapTestDriver4.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = treeMapTestDriver4.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection9 = treeMapTestDriver4.values();
        treeMapTestDriver4.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = treeMapTestDriver0.put((java.lang.Object) treeMapTestDriver4, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test023");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        java.lang.Object obj9 = treeMapTestDriver0.put((java.lang.Object) false, (java.lang.Object) (-1));
        java.lang.Object obj10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = treeMapTestDriver0.remove(obj10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test024");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver5 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj7 = treeMapTestDriver5.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj9 = treeMapTestDriver5.remove((java.lang.Object) 0.0f);
        java.lang.Object obj11 = treeMapTestDriver5.get((java.lang.Object) 1L);
        experiment.util.Set set12 = treeMapTestDriver5.keySet();
        java.lang.Object obj13 = treeMapTestDriver0.put((java.lang.Object) 0L, (java.lang.Object) set12);
        experiment.util.TreeMapTestDriver treeMapTestDriver14 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj16 = treeMapTestDriver14.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = treeMapTestDriver14.remove((java.lang.Object) 0.0f);
        java.lang.Object obj20 = treeMapTestDriver14.get((java.lang.Object) 1L);
        experiment.util.Set set21 = treeMapTestDriver14.keySet();
        experiment.util.Collection collection22 = treeMapTestDriver14.values();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = treeMapTestDriver0.containsKey((java.lang.Object) collection22);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.ArrayList cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(collection22);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test025");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        java.lang.Object obj8 = treeMapTestDriver0.get((java.lang.Object) 0);
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj11 = treeMapTestDriver9.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj13 = treeMapTestDriver9.remove((java.lang.Object) (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test026");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        experiment.util.Set set5 = treeMapTestDriver0.keySet();
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) (byte) 1);
        int int8 = treeMapTestDriver0.size();
        java.lang.Object obj9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = treeMapTestDriver0.get(obj9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test027");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver6 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj8 = treeMapTestDriver6.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = treeMapTestDriver6.remove((java.lang.Object) 0.0f);
        java.lang.Object obj12 = treeMapTestDriver6.get((java.lang.Object) 1L);
        experiment.util.Set set13 = treeMapTestDriver6.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test028");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj10 = treeMapTestDriver0.put((java.lang.Object) (byte) -1, (java.lang.Object) treeMapTestDriver9);
        experiment.util.TreeMapTestDriver treeMapTestDriver11 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj13 = treeMapTestDriver11.get((java.lang.Object) 100);
        experiment.util.Comparator comparator14 = treeMapTestDriver11.comparator();
        experiment.util.Comparator comparator15 = treeMapTestDriver11.comparator();
        boolean boolean16 = treeMapTestDriver11.isEmpty();
        experiment.util.Set set17 = treeMapTestDriver11.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver18 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj20 = treeMapTestDriver18.get((java.lang.Object) 100);
        experiment.util.Comparator comparator21 = treeMapTestDriver18.comparator();
        experiment.util.Comparator comparator22 = treeMapTestDriver18.comparator();
        boolean boolean23 = treeMapTestDriver18.isEmpty();
        treeMapTestDriver18.clear();
        experiment.util.Set set25 = treeMapTestDriver18.entrySet();
        experiment.util.Collection collection26 = treeMapTestDriver18.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = treeMapTestDriver9.put((java.lang.Object) treeMapTestDriver11, (java.lang.Object) collection26);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(comparator14);
        org.junit.Assert.assertNull(comparator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(comparator21);
        org.junit.Assert.assertNull(comparator22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(collection26);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test029");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver4 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj6 = treeMapTestDriver4.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = treeMapTestDriver4.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection9 = treeMapTestDriver4.values();
        treeMapTestDriver4.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test030");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        experiment.util.Set set6 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        experiment.util.Comparator comparator8 = treeMapTestDriver7.comparator();
        experiment.util.Collection collection9 = treeMapTestDriver7.values();
        experiment.util.Set set10 = treeMapTestDriver7.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(comparator8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(set10);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test031");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver5 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj7 = treeMapTestDriver5.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator8 = treeMapTestDriver5.comparator();
        experiment.util.Set set9 = treeMapTestDriver5.entrySet();
        experiment.util.Set set10 = treeMapTestDriver5.keySet();
        java.lang.Object obj12 = treeMapTestDriver5.remove((java.lang.Object) (byte) 1);
        experiment.util.Set set13 = treeMapTestDriver5.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(comparator8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test032");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj10 = treeMapTestDriver0.put((java.lang.Object) (byte) -1, (java.lang.Object) treeMapTestDriver9);
        experiment.util.TreeMapTestDriver treeMapTestDriver11 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj13 = treeMapTestDriver11.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator14 = treeMapTestDriver11.comparator();
        experiment.util.Set set15 = treeMapTestDriver11.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(comparator14);
        org.junit.Assert.assertNotNull(set15);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test033");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        java.lang.Class<?> wildcardClass6 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test034");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        treeMapTestDriver0.clear();
        boolean boolean8 = treeMapTestDriver0.isEmpty();
        experiment.util.Set set9 = treeMapTestDriver0.keySet();
        java.lang.Class<?> wildcardClass10 = set9.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test035");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver4 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj6 = treeMapTestDriver4.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = treeMapTestDriver4.remove((java.lang.Object) 0.0f);
        boolean boolean9 = treeMapTestDriver4.isEmpty();
        experiment.util.Collection collection10 = treeMapTestDriver4.values();
        experiment.util.Set set11 = treeMapTestDriver4.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver12 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj14 = treeMapTestDriver12.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj16 = treeMapTestDriver12.remove((java.lang.Object) 0.0f);
        boolean boolean17 = treeMapTestDriver12.isEmpty();
        experiment.util.Collection collection18 = treeMapTestDriver12.values();
        treeMapTestDriver12.clear();
        boolean boolean20 = treeMapTestDriver12.isEmpty();
        experiment.util.Set set21 = treeMapTestDriver12.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = treeMapTestDriver0.put((java.lang.Object) treeMapTestDriver4, (java.lang.Object) set21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(set21);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test036");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        treeMapTestDriver0.clear();
        boolean boolean7 = treeMapTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass8 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test037");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        experiment.util.Set set5 = treeMapTestDriver0.keySet();
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) (byte) 1);
        int int8 = treeMapTestDriver0.size();
        int int9 = treeMapTestDriver0.size();
        java.lang.Class<?> wildcardClass10 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test038");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj10 = treeMapTestDriver0.put((java.lang.Object) (byte) -1, (java.lang.Object) treeMapTestDriver9);
        java.lang.Object obj11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = treeMapTestDriver9.containsKey(obj11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test039");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 1L);
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.Set set8 = treeMapTestDriver0.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj11 = treeMapTestDriver9.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj13 = treeMapTestDriver9.remove((java.lang.Object) 0.0f);
        java.lang.Object obj15 = treeMapTestDriver9.get((java.lang.Object) 1L);
        experiment.util.Set set16 = treeMapTestDriver9.keySet();
        experiment.util.Collection collection17 = treeMapTestDriver9.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver18 = new experiment.util.TreeMapTestDriver();
        experiment.util.Comparator comparator19 = treeMapTestDriver18.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = treeMapTestDriver0.put((java.lang.Object) treeMapTestDriver9, (java.lang.Object) treeMapTestDriver18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(comparator19);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test040");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        experiment.util.Set set5 = treeMapTestDriver0.keySet();
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) (byte) 1);
        int int8 = treeMapTestDriver0.size();
        int int9 = treeMapTestDriver0.size();
        boolean boolean10 = treeMapTestDriver0.isEmpty();
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver12 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj14 = treeMapTestDriver12.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator15 = treeMapTestDriver12.comparator();
        experiment.util.Set set16 = treeMapTestDriver12.entrySet();
        java.lang.Class<?> wildcardClass17 = treeMapTestDriver12.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(comparator15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test041");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 100);
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = treeMapTestDriver0.remove(obj7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test042");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Comparator comparator1 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver2 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj4 = treeMapTestDriver2.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj6 = treeMapTestDriver2.remove((java.lang.Object) 0.0f);
        boolean boolean7 = treeMapTestDriver2.isEmpty();
        experiment.util.Collection collection8 = treeMapTestDriver2.values();
        treeMapTestDriver2.clear();
        boolean boolean10 = treeMapTestDriver2.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test043");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        treeMapTestDriver0.clear();
        experiment.util.Set set7 = treeMapTestDriver0.entrySet();
        experiment.util.Collection collection8 = treeMapTestDriver0.values();
        java.lang.Class<?> wildcardClass9 = collection8.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test044");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver5 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj7 = treeMapTestDriver5.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj9 = treeMapTestDriver5.remove((java.lang.Object) 0.0f);
        java.lang.Object obj11 = treeMapTestDriver5.get((java.lang.Object) 1L);
        experiment.util.Set set12 = treeMapTestDriver5.keySet();
        java.lang.Object obj13 = treeMapTestDriver0.put((java.lang.Object) 0L, (java.lang.Object) set12);
        experiment.util.TreeMapTestDriver treeMapTestDriver14 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj16 = treeMapTestDriver14.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = treeMapTestDriver14.remove((java.lang.Object) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test045");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        experiment.util.Comparator comparator6 = treeMapTestDriver0.comparator();
        treeMapTestDriver0.clear();
        java.lang.Class<?> wildcardClass8 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test046");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        int int7 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj11 = treeMapTestDriver9.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator12 = treeMapTestDriver9.comparator();
        treeMapTestDriver9.clear();
        java.lang.Object obj14 = treeMapTestDriver0.put((java.lang.Object) (-1), (java.lang.Object) treeMapTestDriver9);
        experiment.util.Collection collection15 = treeMapTestDriver0.values();
        java.lang.Class<?> wildcardClass16 = collection15.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test047");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        experiment.util.Set set6 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj9 = treeMapTestDriver7.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj11 = treeMapTestDriver7.remove((java.lang.Object) (-1));
        boolean boolean12 = treeMapTestDriver7.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test048");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver4 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj6 = treeMapTestDriver4.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = treeMapTestDriver4.remove((java.lang.Object) (-1));
        experiment.util.Collection collection9 = treeMapTestDriver4.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = treeMapTestDriver0.remove((java.lang.Object) collection9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.ArrayList cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test049");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        experiment.util.Set set5 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver6 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj8 = treeMapTestDriver6.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = treeMapTestDriver6.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection11 = treeMapTestDriver6.values();
        experiment.util.Collection collection12 = treeMapTestDriver6.values();
        java.lang.Object obj15 = treeMapTestDriver6.put((java.lang.Object) false, (java.lang.Object) (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test050");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        experiment.util.Set set5 = treeMapTestDriver0.keySet();
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) (byte) 1);
        int int8 = treeMapTestDriver0.size();
        int int9 = treeMapTestDriver0.size();
        boolean boolean10 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj11 = null;
        experiment.util.TreeMapTestDriver treeMapTestDriver12 = new experiment.util.TreeMapTestDriver();
        experiment.util.Comparator comparator13 = treeMapTestDriver12.comparator();
        boolean boolean15 = treeMapTestDriver12.containsKey((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass16 = treeMapTestDriver12.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = treeMapTestDriver0.put(obj11, (java.lang.Object) wildcardClass16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(comparator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test051");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) (-1));
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver6 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj8 = treeMapTestDriver6.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = treeMapTestDriver6.remove((java.lang.Object) 0.0f);
        boolean boolean11 = treeMapTestDriver6.isEmpty();
        experiment.util.Comparator comparator12 = treeMapTestDriver6.comparator();
        treeMapTestDriver6.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(comparator12);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test052");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        int int4 = treeMapTestDriver0.size();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        int int6 = treeMapTestDriver0.size();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test053");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        experiment.util.Set set6 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        experiment.util.Comparator comparator8 = treeMapTestDriver7.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(comparator8);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test054");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) 100);
        boolean boolean8 = treeMapTestDriver0.isEmpty();
        experiment.util.Comparator comparator9 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver10 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj12 = treeMapTestDriver10.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator13 = treeMapTestDriver10.comparator();
        boolean boolean15 = treeMapTestDriver10.containsKey((java.lang.Object) 1L);
        boolean boolean16 = treeMapTestDriver10.isEmpty();
        experiment.util.Collection collection17 = treeMapTestDriver10.values();
        experiment.util.Set set18 = treeMapTestDriver10.keySet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = treeMapTestDriver0.containsKey((java.lang.Object) set18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(comparator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set18);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test055");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        experiment.util.Comparator comparator6 = treeMapTestDriver0.comparator();
        java.lang.Class<?> wildcardClass7 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test056");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Comparator comparator1 = treeMapTestDriver0.comparator();
        boolean boolean3 = treeMapTestDriver0.containsKey((java.lang.Object) 10);
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = treeMapTestDriver0.containsKey(obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test057");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Set set3 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver4 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj6 = treeMapTestDriver4.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator7 = treeMapTestDriver4.comparator();
        experiment.util.Set set8 = treeMapTestDriver4.entrySet();
        experiment.util.Set set9 = treeMapTestDriver4.keySet();
        java.lang.Object obj11 = treeMapTestDriver4.remove((java.lang.Object) (byte) 1);
        experiment.util.TreeMapTestDriver treeMapTestDriver12 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj14 = treeMapTestDriver12.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj16 = treeMapTestDriver12.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection17 = treeMapTestDriver12.values();
        experiment.util.Collection collection18 = treeMapTestDriver12.values();
        experiment.util.Set set19 = treeMapTestDriver12.keySet();
        experiment.util.Comparator comparator20 = treeMapTestDriver12.comparator();
        boolean boolean21 = treeMapTestDriver12.isEmpty();
        java.lang.Object obj22 = treeMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) treeMapTestDriver12);
        experiment.util.Set set23 = treeMapTestDriver12.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver24 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj26 = treeMapTestDriver24.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj28 = treeMapTestDriver24.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection29 = treeMapTestDriver24.values();
        treeMapTestDriver24.clear();
        experiment.util.Set set31 = treeMapTestDriver24.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = treeMapTestDriver12.containsKey((java.lang.Object) set31);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(comparator7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(comparator20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(set31);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test058");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        experiment.util.Set set5 = treeMapTestDriver0.keySet();
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) (byte) 1);
        int int8 = treeMapTestDriver0.size();
        int int9 = treeMapTestDriver0.size();
        boolean boolean10 = treeMapTestDriver0.isEmpty();
        int int11 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver12 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj14 = treeMapTestDriver12.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator15 = treeMapTestDriver12.comparator();
        boolean boolean17 = treeMapTestDriver12.containsKey((java.lang.Object) 1L);
        boolean boolean18 = treeMapTestDriver12.isEmpty();
        experiment.util.Set set19 = treeMapTestDriver12.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(comparator15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(set19);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test059");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj10 = treeMapTestDriver0.put((java.lang.Object) (byte) -1, (java.lang.Object) treeMapTestDriver9);
        experiment.util.Set set11 = treeMapTestDriver9.keySet();
        experiment.util.Comparator comparator12 = treeMapTestDriver9.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver13 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj15 = treeMapTestDriver13.get((java.lang.Object) 100);
        experiment.util.Comparator comparator16 = treeMapTestDriver13.comparator();
        experiment.util.Comparator comparator17 = treeMapTestDriver13.comparator();
        boolean boolean18 = treeMapTestDriver13.isEmpty();
        experiment.util.Set set19 = treeMapTestDriver13.keySet();
        boolean boolean20 = treeMapTestDriver13.isEmpty();
        experiment.util.Set set21 = treeMapTestDriver13.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver22 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj24 = treeMapTestDriver22.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj26 = treeMapTestDriver22.remove((java.lang.Object) 0.0f);
        boolean boolean27 = treeMapTestDriver22.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = treeMapTestDriver9.put((java.lang.Object) set21, (java.lang.Object) treeMapTestDriver22);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(comparator16);
        org.junit.Assert.assertNull(comparator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test060");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        treeMapTestDriver0.clear();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator4);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test061");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Comparator comparator1 = treeMapTestDriver0.comparator();
        boolean boolean3 = treeMapTestDriver0.containsKey((java.lang.Object) 10);
        experiment.util.TreeMapTestDriver treeMapTestDriver4 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj6 = treeMapTestDriver4.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator7 = treeMapTestDriver4.comparator();
        experiment.util.Set set8 = treeMapTestDriver4.entrySet();
        java.lang.Object obj10 = treeMapTestDriver4.get((java.lang.Object) 100);
        treeMapTestDriver4.clear();
        experiment.util.Comparator comparator12 = treeMapTestDriver4.comparator();
        boolean boolean13 = treeMapTestDriver4.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(comparator7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test062");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        treeMapTestDriver0.clear();
        boolean boolean7 = treeMapTestDriver0.isEmpty();
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj11 = treeMapTestDriver9.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator12 = treeMapTestDriver9.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(comparator12);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test063");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 1L);
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.Set set8 = treeMapTestDriver0.entrySet();
        treeMapTestDriver0.clear();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test064");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.Collection collection8 = treeMapTestDriver0.values();
        boolean boolean9 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver10 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj12 = treeMapTestDriver10.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator13 = treeMapTestDriver10.comparator();
        boolean boolean15 = treeMapTestDriver10.containsKey((java.lang.Object) 1L);
        int int16 = treeMapTestDriver10.size();
        experiment.util.Set set17 = treeMapTestDriver10.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(comparator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(set17);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test065");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        treeMapTestDriver0.clear();
        experiment.util.Set set7 = treeMapTestDriver0.entrySet();
        experiment.util.Set set8 = treeMapTestDriver0.entrySet();
        experiment.util.Set set9 = treeMapTestDriver0.keySet();
        java.lang.Class<?> wildcardClass10 = set9.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test066");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        treeMapTestDriver0.clear();
        boolean boolean8 = treeMapTestDriver0.isEmpty();
        experiment.util.Set set9 = treeMapTestDriver0.keySet();
        experiment.util.Set set10 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver11 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj13 = treeMapTestDriver11.get((java.lang.Object) 100);
        experiment.util.Comparator comparator14 = treeMapTestDriver11.comparator();
        experiment.util.Comparator comparator15 = treeMapTestDriver11.comparator();
        boolean boolean16 = treeMapTestDriver11.isEmpty();
        experiment.util.Set set17 = treeMapTestDriver11.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = treeMapTestDriver0.get((java.lang.Object) set17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(comparator14);
        org.junit.Assert.assertNull(comparator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(set17);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test067");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        experiment.util.Set set5 = treeMapTestDriver0.keySet();
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) (byte) 1);
        int int8 = treeMapTestDriver0.size();
        int int9 = treeMapTestDriver0.size();
        boolean boolean10 = treeMapTestDriver0.isEmpty();
        int int11 = treeMapTestDriver0.size();
        experiment.util.Set set12 = treeMapTestDriver0.entrySet();
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver14 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj16 = treeMapTestDriver14.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator17 = treeMapTestDriver14.comparator();
        boolean boolean19 = treeMapTestDriver14.containsKey((java.lang.Object) 1L);
        int int20 = treeMapTestDriver14.size();
        experiment.util.Set set21 = treeMapTestDriver14.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(comparator17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(set21);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test068");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) 100);
        boolean boolean8 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj11 = treeMapTestDriver9.get((java.lang.Object) 100);
        experiment.util.Comparator comparator12 = treeMapTestDriver9.comparator();
        experiment.util.Set set13 = treeMapTestDriver9.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertNotNull(set13);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test069");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection7 = treeMapTestDriver0.values();
        experiment.util.Set set8 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj11 = treeMapTestDriver9.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator12 = treeMapTestDriver9.comparator();
        experiment.util.Set set13 = treeMapTestDriver9.entrySet();
        java.lang.Object obj15 = treeMapTestDriver9.get((java.lang.Object) 100);
        boolean boolean16 = treeMapTestDriver0.containsKey((java.lang.Object) 100);
        experiment.util.Set set17 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver18 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj20 = treeMapTestDriver18.get((java.lang.Object) 100);
        experiment.util.Comparator comparator21 = treeMapTestDriver18.comparator();
        experiment.util.Comparator comparator22 = treeMapTestDriver18.comparator();
        boolean boolean23 = treeMapTestDriver18.isEmpty();
        treeMapTestDriver18.clear();
        boolean boolean25 = treeMapTestDriver18.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(comparator21);
        org.junit.Assert.assertNull(comparator22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test070");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 1L);
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.Set set8 = treeMapTestDriver0.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj11 = treeMapTestDriver9.get((java.lang.Object) 100);
        experiment.util.Set set12 = treeMapTestDriver9.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver13 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj15 = treeMapTestDriver13.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator16 = treeMapTestDriver13.comparator();
        experiment.util.Set set17 = treeMapTestDriver13.entrySet();
        experiment.util.Set set18 = treeMapTestDriver13.keySet();
        java.lang.Object obj20 = treeMapTestDriver13.remove((java.lang.Object) (byte) 1);
        experiment.util.TreeMapTestDriver treeMapTestDriver21 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj23 = treeMapTestDriver21.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj25 = treeMapTestDriver21.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection26 = treeMapTestDriver21.values();
        experiment.util.Collection collection27 = treeMapTestDriver21.values();
        experiment.util.Set set28 = treeMapTestDriver21.keySet();
        experiment.util.Comparator comparator29 = treeMapTestDriver21.comparator();
        boolean boolean30 = treeMapTestDriver21.isEmpty();
        java.lang.Object obj31 = treeMapTestDriver9.put((java.lang.Object) (byte) 1, (java.lang.Object) treeMapTestDriver21);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(comparator16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(comparator29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(obj31);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test071");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        int int7 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver8 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj10 = treeMapTestDriver8.get((java.lang.Object) 100);
        experiment.util.Set set11 = treeMapTestDriver8.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver12 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj14 = treeMapTestDriver12.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator15 = treeMapTestDriver12.comparator();
        experiment.util.Set set16 = treeMapTestDriver12.entrySet();
        experiment.util.Set set17 = treeMapTestDriver12.keySet();
        java.lang.Object obj19 = treeMapTestDriver12.remove((java.lang.Object) (byte) 1);
        experiment.util.TreeMapTestDriver treeMapTestDriver20 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj22 = treeMapTestDriver20.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj24 = treeMapTestDriver20.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection25 = treeMapTestDriver20.values();
        experiment.util.Collection collection26 = treeMapTestDriver20.values();
        experiment.util.Set set27 = treeMapTestDriver20.keySet();
        experiment.util.Comparator comparator28 = treeMapTestDriver20.comparator();
        boolean boolean29 = treeMapTestDriver20.isEmpty();
        java.lang.Object obj30 = treeMapTestDriver8.put((java.lang.Object) (byte) 1, (java.lang.Object) treeMapTestDriver20);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(comparator15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNull(comparator28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test072");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) (-1));
        experiment.util.Set set5 = treeMapTestDriver0.entrySet();
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        int int7 = treeMapTestDriver0.size();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test073");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Comparator comparator1 = treeMapTestDriver0.comparator();
        boolean boolean3 = treeMapTestDriver0.containsKey((java.lang.Object) 10);
        int int4 = treeMapTestDriver0.size();
        experiment.util.Set set5 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver6 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj8 = treeMapTestDriver6.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator9 = treeMapTestDriver6.comparator();
        experiment.util.Set set10 = treeMapTestDriver6.entrySet();
        java.lang.Object obj12 = treeMapTestDriver6.get((java.lang.Object) 100);
        experiment.util.Set set13 = treeMapTestDriver6.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver14 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj16 = treeMapTestDriver14.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = treeMapTestDriver14.remove((java.lang.Object) 0.0f);
        boolean boolean19 = treeMapTestDriver14.isEmpty();
        experiment.util.Comparator comparator20 = treeMapTestDriver14.comparator();
        boolean boolean22 = treeMapTestDriver14.containsKey((java.lang.Object) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = treeMapTestDriver0.put((java.lang.Object) treeMapTestDriver6, (java.lang.Object) treeMapTestDriver14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(comparator20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test074");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        experiment.util.Comparator comparator6 = treeMapTestDriver0.comparator();
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver8 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj10 = treeMapTestDriver8.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj12 = treeMapTestDriver8.remove((java.lang.Object) 0.0f);
        boolean boolean13 = treeMapTestDriver8.isEmpty();
        experiment.util.Collection collection14 = treeMapTestDriver8.values();
        int int15 = treeMapTestDriver8.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver17 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj19 = treeMapTestDriver17.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator20 = treeMapTestDriver17.comparator();
        treeMapTestDriver17.clear();
        java.lang.Object obj22 = treeMapTestDriver8.put((java.lang.Object) (-1), (java.lang.Object) treeMapTestDriver17);
        experiment.util.Collection collection23 = treeMapTestDriver8.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = treeMapTestDriver0.get((java.lang.Object) collection23);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.ArrayList cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(comparator20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(collection23);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test075");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.Set set8 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj11 = treeMapTestDriver9.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj13 = treeMapTestDriver9.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection14 = treeMapTestDriver9.values();
        experiment.util.Collection collection15 = treeMapTestDriver9.values();
        experiment.util.Set set16 = treeMapTestDriver9.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver18 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj19 = treeMapTestDriver9.put((java.lang.Object) (byte) -1, (java.lang.Object) treeMapTestDriver18);
        java.lang.Class<?> wildcardClass20 = treeMapTestDriver18.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = treeMapTestDriver0.containsKey((java.lang.Object) wildcardClass20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test076");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        experiment.util.Set set6 = treeMapTestDriver0.keySet();
        java.lang.Class<?> wildcardClass7 = set6.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test077");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) 100);
        boolean boolean8 = treeMapTestDriver0.isEmpty();
        experiment.util.Comparator comparator9 = treeMapTestDriver0.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = comparator9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(comparator9);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test078");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver6 = new experiment.util.TreeMapTestDriver();
        experiment.util.Comparator comparator7 = treeMapTestDriver6.comparator();
        boolean boolean9 = treeMapTestDriver6.containsKey((java.lang.Object) 10);
        int int10 = treeMapTestDriver6.size();
        experiment.util.Set set11 = treeMapTestDriver6.keySet();
        java.lang.Class<?> wildcardClass12 = set11.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = treeMapTestDriver0.remove((java.lang.Object) wildcardClass12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(comparator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test079");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        boolean boolean7 = treeMapTestDriver0.isEmpty();
        experiment.util.Comparator comparator8 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj11 = treeMapTestDriver9.get((java.lang.Object) 100);
        experiment.util.Comparator comparator12 = treeMapTestDriver9.comparator();
        experiment.util.Set set13 = treeMapTestDriver9.entrySet();
        experiment.util.Collection collection14 = treeMapTestDriver9.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = treeMapTestDriver0.put((java.lang.Object) treeMapTestDriver9, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(comparator8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test080");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) (-1));
        experiment.util.Comparator comparator6 = treeMapTestDriver0.comparator();
        treeMapTestDriver0.clear();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(comparator6);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test081");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 100);
        java.lang.Object obj8 = treeMapTestDriver0.remove((java.lang.Object) 10.0f);
        experiment.util.Set set9 = treeMapTestDriver0.entrySet();
        experiment.util.Comparator comparator10 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver11 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj13 = treeMapTestDriver11.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj15 = treeMapTestDriver11.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection16 = treeMapTestDriver11.values();
        treeMapTestDriver11.clear();
        experiment.util.Set set18 = treeMapTestDriver11.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = treeMapTestDriver0.containsKey((java.lang.Object) set18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(set18);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test082");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) (-1));
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver6 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj8 = treeMapTestDriver6.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator9 = treeMapTestDriver6.comparator();
        experiment.util.Set set10 = treeMapTestDriver6.entrySet();
        java.lang.Object obj12 = treeMapTestDriver6.get((java.lang.Object) 100);
        treeMapTestDriver6.clear();
        experiment.util.Comparator comparator14 = treeMapTestDriver6.comparator();
        boolean boolean15 = treeMapTestDriver6.isEmpty();
        java.lang.Object obj17 = treeMapTestDriver0.put((java.lang.Object) boolean15, (java.lang.Object) (short) 10);
        experiment.util.TreeMapTestDriver treeMapTestDriver18 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj20 = treeMapTestDriver18.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj22 = treeMapTestDriver18.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection23 = treeMapTestDriver18.values();
        experiment.util.Collection collection24 = treeMapTestDriver18.values();
        experiment.util.Set set25 = treeMapTestDriver18.keySet();
        experiment.util.Set set26 = treeMapTestDriver18.keySet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(comparator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(set26);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test083");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        experiment.util.Comparator comparator6 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj9 = treeMapTestDriver7.get((java.lang.Object) 100);
        experiment.util.Comparator comparator10 = treeMapTestDriver7.comparator();
        experiment.util.Comparator comparator11 = treeMapTestDriver7.comparator();
        boolean boolean12 = treeMapTestDriver7.isEmpty();
        treeMapTestDriver7.clear();
        experiment.util.Set set14 = treeMapTestDriver7.entrySet();
        experiment.util.Set set15 = treeMapTestDriver7.keySet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = treeMapTestDriver0.containsKey((java.lang.Object) set15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set15);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test084");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        treeMapTestDriver0.clear();
        experiment.util.Set set7 = treeMapTestDriver0.entrySet();
        experiment.util.Set set8 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj11 = treeMapTestDriver9.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj13 = treeMapTestDriver9.remove((java.lang.Object) 0.0f);
        java.lang.Object obj15 = treeMapTestDriver9.get((java.lang.Object) 1L);
        experiment.util.Set set16 = treeMapTestDriver9.keySet();
        experiment.util.Set set17 = treeMapTestDriver9.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(set17);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test085");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        treeMapTestDriver0.clear();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test086");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        experiment.util.Set set5 = treeMapTestDriver0.keySet();
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) (byte) 1);
        experiment.util.TreeMapTestDriver treeMapTestDriver8 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj10 = treeMapTestDriver8.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator11 = treeMapTestDriver8.comparator();
        boolean boolean13 = treeMapTestDriver8.containsKey((java.lang.Object) 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test087");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        treeMapTestDriver0.clear();
        boolean boolean8 = treeMapTestDriver0.isEmpty();
        experiment.util.Set set9 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver10 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj12 = treeMapTestDriver10.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj14 = treeMapTestDriver10.remove((java.lang.Object) 0.0f);
        boolean boolean15 = treeMapTestDriver10.isEmpty();
        experiment.util.Collection collection16 = treeMapTestDriver10.values();
        int int17 = treeMapTestDriver10.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver19 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj21 = treeMapTestDriver19.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator22 = treeMapTestDriver19.comparator();
        treeMapTestDriver19.clear();
        java.lang.Object obj24 = treeMapTestDriver10.put((java.lang.Object) (-1), (java.lang.Object) treeMapTestDriver19);
        experiment.util.Collection collection25 = treeMapTestDriver10.values();
        java.lang.Class<?> wildcardClass26 = treeMapTestDriver10.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = treeMapTestDriver0.get((java.lang.Object) wildcardClass26);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(comparator22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test088");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        int int7 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver8 = new experiment.util.TreeMapTestDriver();
        experiment.util.Comparator comparator9 = treeMapTestDriver8.comparator();
        experiment.util.Collection collection10 = treeMapTestDriver8.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test089");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 100);
        java.lang.Object obj8 = treeMapTestDriver0.remove((java.lang.Object) 10.0f);
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj11 = treeMapTestDriver9.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj13 = treeMapTestDriver9.remove((java.lang.Object) (-1));
        treeMapTestDriver9.clear();
        boolean boolean15 = treeMapTestDriver9.isEmpty();
        experiment.util.Set set16 = treeMapTestDriver9.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = treeMapTestDriver0.get((java.lang.Object) set16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(set16);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test090");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.TreeMapTestDriver treeMapTestDriver3 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj5 = treeMapTestDriver3.get((java.lang.Object) 100);
        experiment.util.Comparator comparator6 = treeMapTestDriver3.comparator();
        experiment.util.Comparator comparator7 = treeMapTestDriver3.comparator();
        boolean boolean8 = treeMapTestDriver3.isEmpty();
        treeMapTestDriver3.clear();
        experiment.util.Set set10 = treeMapTestDriver3.entrySet();
        experiment.util.Collection collection11 = treeMapTestDriver3.values();
        experiment.util.Collection collection12 = treeMapTestDriver3.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = treeMapTestDriver0.put((java.lang.Object) treeMapTestDriver3, (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertNull(comparator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test091");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Collection collection3 = treeMapTestDriver0.values();
        experiment.util.Set set4 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver5 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj7 = treeMapTestDriver5.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj9 = treeMapTestDriver5.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection10 = treeMapTestDriver5.values();
        experiment.util.Collection collection11 = treeMapTestDriver5.values();
        experiment.util.Set set12 = treeMapTestDriver5.keySet();
        experiment.util.Comparator comparator13 = treeMapTestDriver5.comparator();
        experiment.util.Set set14 = treeMapTestDriver5.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = treeMapTestDriver0.containsKey((java.lang.Object) set14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(comparator13);
        org.junit.Assert.assertNotNull(set14);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test092");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        experiment.util.Comparator comparator6 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj9 = treeMapTestDriver7.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator10 = treeMapTestDriver7.comparator();
        experiment.util.Set set11 = treeMapTestDriver7.entrySet();
        java.lang.Object obj13 = treeMapTestDriver7.get((java.lang.Object) 100);
        treeMapTestDriver7.clear();
        experiment.util.Comparator comparator15 = treeMapTestDriver7.comparator();
        int int16 = treeMapTestDriver7.size();
        java.lang.Object obj17 = treeMapTestDriver0.remove((java.lang.Object) int16);
        experiment.util.TreeMapTestDriver treeMapTestDriver18 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj20 = treeMapTestDriver18.get((java.lang.Object) 100);
        experiment.util.Comparator comparator21 = treeMapTestDriver18.comparator();
        experiment.util.Comparator comparator22 = treeMapTestDriver18.comparator();
        boolean boolean23 = treeMapTestDriver18.isEmpty();
        treeMapTestDriver18.clear();
        experiment.util.Set set25 = treeMapTestDriver18.entrySet();
        experiment.util.Collection collection26 = treeMapTestDriver18.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(comparator15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(comparator21);
        org.junit.Assert.assertNull(comparator22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(collection26);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test093");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        java.lang.Object obj8 = treeMapTestDriver0.get((java.lang.Object) 0);
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj11 = treeMapTestDriver9.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj13 = treeMapTestDriver9.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection14 = treeMapTestDriver9.values();
        treeMapTestDriver9.clear();
        boolean boolean16 = treeMapTestDriver9.isEmpty();
        treeMapTestDriver9.clear();
        int int18 = treeMapTestDriver9.size();
        java.lang.Object obj19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = treeMapTestDriver0.put((java.lang.Object) treeMapTestDriver9, obj19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test094");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.Set set8 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj11 = treeMapTestDriver9.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator12 = treeMapTestDriver9.comparator();
        boolean boolean14 = treeMapTestDriver9.containsKey((java.lang.Object) 1L);
        int int15 = treeMapTestDriver9.size();
        java.lang.Class<?> wildcardClass16 = treeMapTestDriver9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test095");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 100);
        treeMapTestDriver0.clear();
        experiment.util.Collection collection8 = treeMapTestDriver0.values();
        boolean boolean9 = treeMapTestDriver0.isEmpty();
        experiment.util.Comparator comparator10 = treeMapTestDriver0.comparator();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(comparator10);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test096");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        experiment.util.Set set5 = treeMapTestDriver0.keySet();
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) (byte) 1);
        int int8 = treeMapTestDriver0.size();
        experiment.util.Collection collection9 = treeMapTestDriver0.values();
        experiment.util.Set set10 = treeMapTestDriver0.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver11 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj13 = treeMapTestDriver11.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator14 = treeMapTestDriver11.comparator();
        experiment.util.Set set15 = treeMapTestDriver11.entrySet();
        experiment.util.Set set16 = treeMapTestDriver11.keySet();
        java.lang.Object obj18 = treeMapTestDriver11.remove((java.lang.Object) true);
        experiment.util.Set set19 = treeMapTestDriver11.entrySet();
        boolean boolean20 = treeMapTestDriver11.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(comparator14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test097");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        treeMapTestDriver0.clear();
        experiment.util.Set set7 = treeMapTestDriver0.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver8 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj10 = treeMapTestDriver8.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator11 = treeMapTestDriver8.comparator();
        boolean boolean13 = treeMapTestDriver8.containsKey((java.lang.Object) 1L);
        java.lang.Object obj15 = treeMapTestDriver8.remove((java.lang.Object) 100);
        boolean boolean16 = treeMapTestDriver8.isEmpty();
        experiment.util.Set set17 = treeMapTestDriver8.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(set17);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test098");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        treeMapTestDriver0.clear();
        boolean boolean8 = treeMapTestDriver0.isEmpty();
        experiment.util.Set set9 = treeMapTestDriver0.keySet();
        experiment.util.Set set10 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver11 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj13 = treeMapTestDriver11.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj15 = treeMapTestDriver11.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection16 = treeMapTestDriver11.values();
        experiment.util.Collection collection17 = treeMapTestDriver11.values();
        experiment.util.Set set18 = treeMapTestDriver11.keySet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set18);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test099");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection7 = treeMapTestDriver0.values();
        experiment.util.Set set8 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj11 = treeMapTestDriver9.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator12 = treeMapTestDriver9.comparator();
        experiment.util.Set set13 = treeMapTestDriver9.entrySet();
        java.lang.Object obj15 = treeMapTestDriver9.get((java.lang.Object) 100);
        boolean boolean16 = treeMapTestDriver0.containsKey((java.lang.Object) 100);
        experiment.util.Set set17 = treeMapTestDriver0.keySet();
        boolean boolean18 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver19 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set20 = treeMapTestDriver19.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver21 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj23 = treeMapTestDriver21.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator24 = treeMapTestDriver21.comparator();
        boolean boolean26 = treeMapTestDriver21.containsKey((java.lang.Object) 1L);
        boolean boolean27 = treeMapTestDriver21.isEmpty();
        boolean boolean28 = treeMapTestDriver21.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = treeMapTestDriver0.put((java.lang.Object) treeMapTestDriver19, (java.lang.Object) boolean28);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(comparator24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test100");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Comparator comparator1 = treeMapTestDriver0.comparator();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver4 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj6 = treeMapTestDriver4.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = treeMapTestDriver4.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection9 = treeMapTestDriver4.values();
        treeMapTestDriver4.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test101");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        int int6 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj9 = treeMapTestDriver7.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj11 = treeMapTestDriver7.remove((java.lang.Object) (-1));
        experiment.util.Collection collection12 = treeMapTestDriver7.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = treeMapTestDriver0.remove((java.lang.Object) collection12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.ArrayList cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test102");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        treeMapTestDriver0.clear();
        boolean boolean7 = treeMapTestDriver0.isEmpty();
        treeMapTestDriver0.clear();
        int int9 = treeMapTestDriver0.size();
        java.lang.Class<?> wildcardClass10 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test103");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        int int5 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver6 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj8 = treeMapTestDriver6.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator9 = treeMapTestDriver6.comparator();
        boolean boolean11 = treeMapTestDriver6.containsKey((java.lang.Object) 1L);
        boolean boolean12 = treeMapTestDriver6.isEmpty();
        boolean boolean13 = treeMapTestDriver6.isEmpty();
        java.lang.Object obj14 = treeMapTestDriver0.remove((java.lang.Object) boolean13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = obj14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test104");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass6 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test105");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        experiment.util.Set set5 = treeMapTestDriver0.keySet();
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) (byte) 1);
        experiment.util.Set set8 = treeMapTestDriver0.entrySet();
        boolean boolean9 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = treeMapTestDriver0.containsKey(obj10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test106");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        experiment.util.Set set5 = treeMapTestDriver0.keySet();
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) true);
        experiment.util.Set set8 = treeMapTestDriver0.entrySet();
        boolean boolean9 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver10 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj12 = treeMapTestDriver10.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator13 = treeMapTestDriver10.comparator();
        boolean boolean15 = treeMapTestDriver10.containsKey((java.lang.Object) 1L);
        int int16 = treeMapTestDriver10.size();
        boolean boolean17 = treeMapTestDriver0.containsKey((java.lang.Object) int16);
        experiment.util.Collection collection18 = treeMapTestDriver0.values();
        java.lang.Object obj20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = treeMapTestDriver0.put((java.lang.Object) 1L, obj20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(comparator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test107");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        java.lang.Object obj9 = treeMapTestDriver0.put((java.lang.Object) false, (java.lang.Object) (-1));
        experiment.util.TreeMapTestDriver treeMapTestDriver10 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj12 = treeMapTestDriver10.get((java.lang.Object) 100);
        experiment.util.Collection collection13 = treeMapTestDriver10.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = treeMapTestDriver0.put((java.lang.Object) collection13, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.ArrayList cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test108");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection7 = treeMapTestDriver0.values();
        experiment.util.Comparator comparator8 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj11 = treeMapTestDriver9.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj13 = treeMapTestDriver9.remove((java.lang.Object) 0.0f);
        java.lang.Object obj15 = treeMapTestDriver9.get((java.lang.Object) 1L);
        experiment.util.Set set16 = treeMapTestDriver9.keySet();
        treeMapTestDriver9.clear();
        experiment.util.Set set18 = treeMapTestDriver9.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(comparator8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(set18);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test109");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        int int6 = treeMapTestDriver0.size();
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver8 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj10 = treeMapTestDriver8.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator11 = treeMapTestDriver8.comparator();
        experiment.util.Set set12 = treeMapTestDriver8.entrySet();
        experiment.util.Set set13 = treeMapTestDriver8.keySet();
        java.lang.Object obj15 = treeMapTestDriver8.remove((java.lang.Object) true);
        experiment.util.Set set16 = treeMapTestDriver8.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test110");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        treeMapTestDriver0.clear();
        treeMapTestDriver0.clear();
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj11 = treeMapTestDriver9.get((java.lang.Object) 100);
        experiment.util.Comparator comparator12 = treeMapTestDriver9.comparator();
        boolean boolean14 = treeMapTestDriver9.containsKey((java.lang.Object) (-1));
        boolean boolean16 = treeMapTestDriver9.containsKey((java.lang.Object) 10.0d);
        treeMapTestDriver9.clear();
        experiment.util.Set set18 = treeMapTestDriver9.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = treeMapTestDriver0.get((java.lang.Object) set18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(set18);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test111");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj10 = treeMapTestDriver0.put((java.lang.Object) (byte) -1, (java.lang.Object) treeMapTestDriver9);
        int int11 = treeMapTestDriver9.size();
        int int12 = treeMapTestDriver9.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver13 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj15 = treeMapTestDriver13.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj17 = treeMapTestDriver13.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection18 = treeMapTestDriver13.values();
        experiment.util.Collection collection19 = treeMapTestDriver13.values();
        experiment.util.Set set20 = treeMapTestDriver13.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver22 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj23 = treeMapTestDriver13.put((java.lang.Object) (byte) -1, (java.lang.Object) treeMapTestDriver22);
        int int24 = treeMapTestDriver22.size();
        int int25 = treeMapTestDriver22.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = treeMapTestDriver9.get((java.lang.Object) treeMapTestDriver22);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test112");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 1L);
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj9 = treeMapTestDriver7.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj11 = treeMapTestDriver7.remove((java.lang.Object) (-1));
        experiment.util.Set set12 = treeMapTestDriver7.entrySet();
        treeMapTestDriver7.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test113");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        int int4 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver5 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj7 = treeMapTestDriver5.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj9 = treeMapTestDriver5.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection10 = treeMapTestDriver5.values();
        experiment.util.Collection collection11 = treeMapTestDriver5.values();
        experiment.util.Set set12 = treeMapTestDriver5.keySet();
        experiment.util.Comparator comparator13 = treeMapTestDriver5.comparator();
        experiment.util.Set set14 = treeMapTestDriver5.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = treeMapTestDriver0.remove((java.lang.Object) set14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(comparator13);
        org.junit.Assert.assertNotNull(set14);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test114");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) (-1));
        experiment.util.TreeMapTestDriver treeMapTestDriver5 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj7 = treeMapTestDriver5.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator8 = treeMapTestDriver5.comparator();
        experiment.util.Set set9 = treeMapTestDriver5.entrySet();
        experiment.util.Set set10 = treeMapTestDriver5.keySet();
        java.lang.Object obj12 = treeMapTestDriver5.remove((java.lang.Object) (byte) 1);
        experiment.util.Set set13 = treeMapTestDriver5.entrySet();
        boolean boolean14 = treeMapTestDriver5.isEmpty();
        experiment.util.Set set15 = treeMapTestDriver5.keySet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = treeMapTestDriver0.containsKey((java.lang.Object) set15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(comparator8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(set15);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test115");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 100);
        java.lang.Object obj8 = treeMapTestDriver0.remove((java.lang.Object) 10.0f);
        experiment.util.Set set9 = treeMapTestDriver0.entrySet();
        experiment.util.Comparator comparator10 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver11 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj13 = treeMapTestDriver11.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator14 = treeMapTestDriver11.comparator();
        java.lang.Class<?> wildcardClass15 = treeMapTestDriver11.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(comparator14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test116");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver2 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj4 = treeMapTestDriver2.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj6 = treeMapTestDriver2.remove((java.lang.Object) 0.0f);
        java.lang.Object obj8 = treeMapTestDriver2.get((java.lang.Object) 1L);
        experiment.util.Set set9 = treeMapTestDriver2.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver10 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj12 = treeMapTestDriver10.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj14 = treeMapTestDriver10.remove((java.lang.Object) (-1));
        experiment.util.Collection collection15 = treeMapTestDriver10.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = treeMapTestDriver0.put((java.lang.Object) set9, (java.lang.Object) treeMapTestDriver10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test117");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.Collection collection8 = treeMapTestDriver0.values();
        java.lang.Class<?> wildcardClass9 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test118");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        experiment.util.Comparator comparator6 = treeMapTestDriver0.comparator();
        boolean boolean8 = treeMapTestDriver0.containsKey((java.lang.Object) 1.0f);
        boolean boolean9 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver10 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj12 = treeMapTestDriver10.get((java.lang.Object) 100);
        experiment.util.Comparator comparator13 = treeMapTestDriver10.comparator();
        experiment.util.Comparator comparator14 = treeMapTestDriver10.comparator();
        boolean boolean15 = treeMapTestDriver10.isEmpty();
        treeMapTestDriver10.clear();
        experiment.util.Set set17 = treeMapTestDriver10.entrySet();
        experiment.util.Set set18 = treeMapTestDriver10.entrySet();
        experiment.util.Set set19 = treeMapTestDriver10.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = treeMapTestDriver0.remove((java.lang.Object) set19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(comparator13);
        org.junit.Assert.assertNull(comparator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test119");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        int int7 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj11 = treeMapTestDriver9.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator12 = treeMapTestDriver9.comparator();
        treeMapTestDriver9.clear();
        java.lang.Object obj14 = treeMapTestDriver0.put((java.lang.Object) (-1), (java.lang.Object) treeMapTestDriver9);
        experiment.util.Collection collection15 = treeMapTestDriver9.values();
        java.lang.Class<?> wildcardClass16 = treeMapTestDriver9.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test120");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.Comparator comparator8 = treeMapTestDriver0.comparator();
        boolean boolean9 = treeMapTestDriver0.isEmpty();
        experiment.util.Set set10 = treeMapTestDriver0.entrySet();
        int int11 = treeMapTestDriver0.size();
        java.lang.Object obj13 = treeMapTestDriver0.remove((java.lang.Object) (-1L));
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(comparator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test121");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        experiment.util.Set set6 = treeMapTestDriver0.keySet();
        boolean boolean7 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver8 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj10 = treeMapTestDriver8.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator11 = treeMapTestDriver8.comparator();
        boolean boolean13 = treeMapTestDriver8.containsKey((java.lang.Object) 1L);
        int int14 = treeMapTestDriver8.size();
        experiment.util.Set set15 = treeMapTestDriver8.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver16 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj18 = treeMapTestDriver16.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator19 = treeMapTestDriver16.comparator();
        experiment.util.Set set20 = treeMapTestDriver16.entrySet();
        experiment.util.Set set21 = treeMapTestDriver16.keySet();
        java.lang.Object obj23 = treeMapTestDriver16.remove((java.lang.Object) (byte) 1);
        int int24 = treeMapTestDriver16.size();
        experiment.util.Collection collection25 = treeMapTestDriver16.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver26 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj28 = treeMapTestDriver26.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj30 = treeMapTestDriver26.remove((java.lang.Object) 0.0f);
        boolean boolean31 = treeMapTestDriver26.isEmpty();
        experiment.util.Comparator comparator32 = treeMapTestDriver26.comparator();
        boolean boolean34 = treeMapTestDriver26.containsKey((java.lang.Object) 1.0f);
        java.lang.Object obj35 = treeMapTestDriver16.remove((java.lang.Object) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj36 = treeMapTestDriver0.put((java.lang.Object) treeMapTestDriver8, (java.lang.Object) treeMapTestDriver16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(comparator19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(comparator32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(obj35);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test122");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver4 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj6 = treeMapTestDriver4.get((java.lang.Object) 100);
        experiment.util.Comparator comparator7 = treeMapTestDriver4.comparator();
        int int8 = treeMapTestDriver4.size();
        treeMapTestDriver4.clear();
        experiment.util.Set set10 = treeMapTestDriver4.entrySet();
        experiment.util.Set set11 = treeMapTestDriver4.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(comparator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test123");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 100);
        treeMapTestDriver0.clear();
        experiment.util.Comparator comparator8 = treeMapTestDriver0.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = comparator8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(comparator8);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test124");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj9 = treeMapTestDriver7.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator10 = treeMapTestDriver7.comparator();
        experiment.util.Set set11 = treeMapTestDriver7.entrySet();
        experiment.util.Set set12 = treeMapTestDriver7.keySet();
        java.lang.Object obj14 = treeMapTestDriver7.remove((java.lang.Object) (byte) 1);
        int int15 = treeMapTestDriver7.size();
        int int16 = treeMapTestDriver7.size();
        boolean boolean17 = treeMapTestDriver0.containsKey((java.lang.Object) int16);
        experiment.util.Comparator comparator18 = treeMapTestDriver0.comparator();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(comparator18);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test125");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        treeMapTestDriver0.clear();
        boolean boolean7 = treeMapTestDriver0.isEmpty();
        experiment.util.Set set8 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj11 = treeMapTestDriver9.get((java.lang.Object) 100);
        experiment.util.Comparator comparator12 = treeMapTestDriver9.comparator();
        experiment.util.Comparator comparator13 = treeMapTestDriver9.comparator();
        boolean boolean14 = treeMapTestDriver9.isEmpty();
        experiment.util.Set set15 = treeMapTestDriver9.keySet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = treeMapTestDriver0.containsKey((java.lang.Object) set15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertNull(comparator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(set15);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test126");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        experiment.util.Set set5 = treeMapTestDriver0.keySet();
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) (byte) 1);
        int int8 = treeMapTestDriver0.size();
        int int9 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver10 = new experiment.util.TreeMapTestDriver();
        experiment.util.Comparator comparator11 = treeMapTestDriver10.comparator();
        boolean boolean13 = treeMapTestDriver10.containsKey((java.lang.Object) 10);
        int int14 = treeMapTestDriver10.size();
        int int15 = treeMapTestDriver10.size();
        boolean boolean16 = treeMapTestDriver10.isEmpty();
        boolean boolean17 = treeMapTestDriver0.containsKey((java.lang.Object) boolean16);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test127");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        experiment.util.Set set5 = treeMapTestDriver0.keySet();
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) (byte) 1);
        experiment.util.Set set8 = treeMapTestDriver0.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj11 = treeMapTestDriver9.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj13 = treeMapTestDriver9.remove((java.lang.Object) 0.0f);
        boolean boolean14 = treeMapTestDriver9.isEmpty();
        experiment.util.Collection collection15 = treeMapTestDriver9.values();
        java.lang.Class<?> wildcardClass16 = treeMapTestDriver9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = treeMapTestDriver0.containsKey((java.lang.Object) wildcardClass16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test128");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Comparator comparator1 = treeMapTestDriver0.comparator();
        boolean boolean3 = treeMapTestDriver0.containsKey((java.lang.Object) 10);
        int int4 = treeMapTestDriver0.size();
        experiment.util.Set set5 = treeMapTestDriver0.keySet();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        experiment.util.Set set7 = treeMapTestDriver0.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver8 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj10 = treeMapTestDriver8.get((java.lang.Object) 100);
        experiment.util.Comparator comparator11 = treeMapTestDriver8.comparator();
        experiment.util.Comparator comparator12 = treeMapTestDriver8.comparator();
        boolean boolean13 = treeMapTestDriver8.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver14 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj16 = treeMapTestDriver14.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = treeMapTestDriver14.remove((java.lang.Object) 0.0f);
        boolean boolean19 = treeMapTestDriver14.isEmpty();
        experiment.util.Collection collection20 = treeMapTestDriver14.values();
        int int21 = treeMapTestDriver14.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver22 = new experiment.util.TreeMapTestDriver();
        experiment.util.Comparator comparator23 = treeMapTestDriver22.comparator();
        boolean boolean25 = treeMapTestDriver22.containsKey((java.lang.Object) 10);
        experiment.util.TreeMapTestDriver treeMapTestDriver26 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj28 = treeMapTestDriver26.get((java.lang.Object) 100);
        experiment.util.Comparator comparator29 = treeMapTestDriver26.comparator();
        experiment.util.Set set30 = treeMapTestDriver26.entrySet();
        java.lang.Object obj31 = treeMapTestDriver14.put((java.lang.Object) 10, (java.lang.Object) set30);
        boolean boolean32 = treeMapTestDriver14.isEmpty();
        boolean boolean33 = treeMapTestDriver8.containsKey((java.lang.Object) boolean32);
        java.lang.Object obj34 = treeMapTestDriver0.remove((java.lang.Object) boolean33);
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(comparator23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(comparator29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(obj34);
    }

}
