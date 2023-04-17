package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_TreeMapTest_54676380_512_s {

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

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test129");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        experiment.util.Set set5 = treeMapTestDriver0.keySet();
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) true);
        experiment.util.Comparator comparator8 = treeMapTestDriver0.comparator();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(comparator8);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test130");
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
        experiment.util.TreeMapTestDriver treeMapTestDriver16 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj18 = treeMapTestDriver16.get((java.lang.Object) 100);
        experiment.util.Comparator comparator19 = treeMapTestDriver16.comparator();
        int int20 = treeMapTestDriver16.size();
        treeMapTestDriver16.clear();
        experiment.util.Set set22 = treeMapTestDriver16.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver23 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj25 = treeMapTestDriver23.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator26 = treeMapTestDriver23.comparator();
        experiment.util.Set set27 = treeMapTestDriver23.entrySet();
        java.lang.Object obj29 = treeMapTestDriver23.get((java.lang.Object) 100);
        java.lang.Object obj31 = treeMapTestDriver23.remove((java.lang.Object) 10.0f);
        experiment.util.Collection collection32 = treeMapTestDriver23.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = treeMapTestDriver0.put((java.lang.Object) treeMapTestDriver16, (java.lang.Object) treeMapTestDriver23);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(comparator19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(comparator26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(collection32);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test131");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        experiment.util.Comparator comparator6 = treeMapTestDriver0.comparator();
        boolean boolean8 = treeMapTestDriver0.containsKey((java.lang.Object) 1.0f);
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj11 = treeMapTestDriver9.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj13 = treeMapTestDriver9.remove((java.lang.Object) (-1));
        treeMapTestDriver9.clear();
        boolean boolean15 = treeMapTestDriver9.isEmpty();
        java.lang.Object obj16 = treeMapTestDriver0.get((java.lang.Object) boolean15);
        treeMapTestDriver0.clear();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test132");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) (-1));
        boolean boolean7 = treeMapTestDriver0.containsKey((java.lang.Object) 10.0d);
        int int8 = treeMapTestDriver0.size();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test133");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        int int4 = treeMapTestDriver0.size();
        treeMapTestDriver0.clear();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj9 = treeMapTestDriver7.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator10 = treeMapTestDriver7.comparator();
        experiment.util.Set set11 = treeMapTestDriver7.entrySet();
        experiment.util.Set set12 = treeMapTestDriver7.keySet();
        java.lang.Object obj14 = treeMapTestDriver7.remove((java.lang.Object) (byte) 1);
        int int15 = treeMapTestDriver7.size();
        int int16 = treeMapTestDriver7.size();
        boolean boolean17 = treeMapTestDriver7.isEmpty();
        int int18 = treeMapTestDriver7.size();
        experiment.util.Set set19 = treeMapTestDriver7.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = treeMapTestDriver0.remove((java.lang.Object) set19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(set19);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test134");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver5 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj7 = treeMapTestDriver5.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator8 = treeMapTestDriver5.comparator();
        experiment.util.Set set9 = treeMapTestDriver5.entrySet();
        experiment.util.Set set10 = treeMapTestDriver5.keySet();
        java.lang.Object obj12 = treeMapTestDriver5.remove((java.lang.Object) (byte) 1);
        int int13 = treeMapTestDriver5.size();
        int int14 = treeMapTestDriver5.size();
        boolean boolean15 = treeMapTestDriver5.isEmpty();
        treeMapTestDriver5.clear();
        boolean boolean17 = treeMapTestDriver5.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver18 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj20 = treeMapTestDriver18.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj22 = treeMapTestDriver18.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection23 = treeMapTestDriver18.values();
        java.lang.Object obj24 = treeMapTestDriver0.put((java.lang.Object) boolean17, (java.lang.Object) treeMapTestDriver18);
        experiment.util.TreeMapTestDriver treeMapTestDriver25 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj27 = treeMapTestDriver25.get((java.lang.Object) 100);
        experiment.util.Comparator comparator28 = treeMapTestDriver25.comparator();
        boolean boolean30 = treeMapTestDriver25.containsKey((java.lang.Object) (-1));
        boolean boolean32 = treeMapTestDriver25.containsKey((java.lang.Object) 10.0d);
        treeMapTestDriver25.clear();
        experiment.util.Set set34 = treeMapTestDriver25.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = treeMapTestDriver0.remove((java.lang.Object) set34);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(comparator8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(comparator28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(set34);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test135");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        int int8 = treeMapTestDriver0.size();
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver10 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj12 = treeMapTestDriver10.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator13 = treeMapTestDriver10.comparator();
        experiment.util.Set set14 = treeMapTestDriver10.entrySet();
        experiment.util.Set set15 = treeMapTestDriver10.keySet();
        java.lang.Object obj17 = treeMapTestDriver10.remove((java.lang.Object) true);
        experiment.util.Collection collection18 = treeMapTestDriver10.values();
        experiment.util.Set set19 = treeMapTestDriver10.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(comparator13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(set19);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test136");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver5 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj7 = treeMapTestDriver5.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj9 = treeMapTestDriver5.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection10 = treeMapTestDriver5.values();
        experiment.util.Collection collection11 = treeMapTestDriver5.values();
        java.lang.Object obj14 = treeMapTestDriver5.put((java.lang.Object) false, (java.lang.Object) (-1));
        java.lang.Object obj15 = treeMapTestDriver0.get((java.lang.Object) (-1));
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test137");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) 100);
        boolean boolean8 = treeMapTestDriver0.isEmpty();
        experiment.util.Comparator comparator9 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver10 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj12 = treeMapTestDriver10.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj14 = treeMapTestDriver10.remove((java.lang.Object) (-1));
        treeMapTestDriver10.clear();
        boolean boolean16 = treeMapTestDriver10.isEmpty();
        experiment.util.Set set17 = treeMapTestDriver10.entrySet();
        int int18 = treeMapTestDriver10.size();
        java.lang.Object obj19 = treeMapTestDriver0.get((java.lang.Object) int18);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test138");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        int int4 = treeMapTestDriver0.size();
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver6 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj8 = treeMapTestDriver6.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = treeMapTestDriver6.remove((java.lang.Object) 0.0f);
        boolean boolean11 = treeMapTestDriver6.isEmpty();
        experiment.util.Collection collection12 = treeMapTestDriver6.values();
        int int13 = treeMapTestDriver6.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver14 = new experiment.util.TreeMapTestDriver();
        experiment.util.Comparator comparator15 = treeMapTestDriver14.comparator();
        boolean boolean17 = treeMapTestDriver14.containsKey((java.lang.Object) 10);
        experiment.util.TreeMapTestDriver treeMapTestDriver18 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj20 = treeMapTestDriver18.get((java.lang.Object) 100);
        experiment.util.Comparator comparator21 = treeMapTestDriver18.comparator();
        experiment.util.Set set22 = treeMapTestDriver18.entrySet();
        java.lang.Object obj23 = treeMapTestDriver6.put((java.lang.Object) 10, (java.lang.Object) set22);
        boolean boolean24 = treeMapTestDriver6.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver25 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj27 = treeMapTestDriver25.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj29 = treeMapTestDriver25.remove((java.lang.Object) (-1));
        treeMapTestDriver25.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = treeMapTestDriver0.put((java.lang.Object) treeMapTestDriver6, (java.lang.Object) treeMapTestDriver25);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(comparator15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(comparator21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test139");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) 100);
        boolean boolean8 = treeMapTestDriver0.isEmpty();
        experiment.util.Comparator comparator9 = treeMapTestDriver0.comparator();
        experiment.util.Collection collection10 = treeMapTestDriver0.values();
        java.lang.Object obj11 = null;
        experiment.util.TreeMapTestDriver treeMapTestDriver12 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj14 = treeMapTestDriver12.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator15 = treeMapTestDriver12.comparator();
        experiment.util.Set set16 = treeMapTestDriver12.entrySet();
        experiment.util.Set set17 = treeMapTestDriver12.keySet();
        experiment.util.Collection collection18 = treeMapTestDriver12.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = treeMapTestDriver0.put(obj11, (java.lang.Object) treeMapTestDriver12);
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
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(comparator15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test140");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Comparator comparator1 = treeMapTestDriver0.comparator();
        boolean boolean3 = treeMapTestDriver0.containsKey((java.lang.Object) 10);
        int int4 = treeMapTestDriver0.size();
        int int5 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver6 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj8 = treeMapTestDriver6.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = treeMapTestDriver6.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection11 = treeMapTestDriver6.values();
        experiment.util.Collection collection12 = treeMapTestDriver6.values();
        experiment.util.Set set13 = treeMapTestDriver6.keySet();
        experiment.util.Comparator comparator14 = treeMapTestDriver6.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = treeMapTestDriver0.get((java.lang.Object) comparator14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(comparator14);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test141");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) (-1));
        treeMapTestDriver0.clear();
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass7 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test142");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) (-1));
        boolean boolean7 = treeMapTestDriver0.containsKey((java.lang.Object) 10.0d);
        treeMapTestDriver0.clear();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test143");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        treeMapTestDriver0.clear();
        boolean boolean7 = treeMapTestDriver0.isEmpty();
        treeMapTestDriver0.clear();
        int int9 = treeMapTestDriver0.size();
        boolean boolean10 = treeMapTestDriver0.isEmpty();
        experiment.util.Comparator comparator11 = treeMapTestDriver0.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = comparator11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(comparator11);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test144");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        int int6 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj9 = treeMapTestDriver7.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj11 = treeMapTestDriver7.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection12 = treeMapTestDriver7.values();
        experiment.util.Collection collection13 = treeMapTestDriver7.values();
        experiment.util.Set set14 = treeMapTestDriver7.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver16 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj17 = treeMapTestDriver7.put((java.lang.Object) (byte) -1, (java.lang.Object) treeMapTestDriver16);
        java.lang.Class<?> wildcardClass18 = treeMapTestDriver16.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = treeMapTestDriver0.get((java.lang.Object) wildcardClass18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test145");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver2 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj4 = treeMapTestDriver2.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj6 = treeMapTestDriver2.remove((java.lang.Object) 0.0f);
        java.lang.Object obj8 = treeMapTestDriver2.get((java.lang.Object) 1L);
        experiment.util.Set set9 = treeMapTestDriver2.keySet();
        experiment.util.Collection collection10 = treeMapTestDriver2.values();
        int int11 = treeMapTestDriver2.size();
        treeMapTestDriver2.clear();
        experiment.util.Set set13 = treeMapTestDriver2.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = treeMapTestDriver0.remove((java.lang.Object) set13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(set13);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test146");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        treeMapTestDriver0.clear();
        treeMapTestDriver0.clear();
        boolean boolean8 = treeMapTestDriver0.isEmpty();
        treeMapTestDriver0.clear();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test147");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        experiment.util.Set set5 = treeMapTestDriver0.keySet();
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) true);
        experiment.util.Collection collection8 = treeMapTestDriver0.values();
        experiment.util.Set set9 = treeMapTestDriver0.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver10 = new experiment.util.TreeMapTestDriver();
        experiment.util.Comparator comparator11 = treeMapTestDriver10.comparator();
        boolean boolean13 = treeMapTestDriver10.containsKey((java.lang.Object) 10);
        int int14 = treeMapTestDriver10.size();
        experiment.util.Set set15 = treeMapTestDriver10.keySet();
        experiment.util.Collection collection16 = treeMapTestDriver10.values();
        experiment.util.Set set17 = treeMapTestDriver10.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(set17);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test148");
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
        experiment.util.TreeMapTestDriver treeMapTestDriver15 = new experiment.util.TreeMapTestDriver();
        experiment.util.Comparator comparator16 = treeMapTestDriver15.comparator();
        boolean boolean18 = treeMapTestDriver15.containsKey((java.lang.Object) 10);
        int int19 = treeMapTestDriver15.size();
        int int20 = treeMapTestDriver15.size();
        java.lang.Object obj21 = treeMapTestDriver0.remove((java.lang.Object) int20);
        experiment.util.Set set22 = treeMapTestDriver0.entrySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(comparator16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(set22);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test149");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 100);
        treeMapTestDriver0.clear();
        experiment.util.Comparator comparator8 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        experiment.util.Comparator comparator10 = treeMapTestDriver9.comparator();
        boolean boolean12 = treeMapTestDriver9.containsKey((java.lang.Object) 10);
        int int13 = treeMapTestDriver9.size();
        experiment.util.Set set14 = treeMapTestDriver9.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(comparator8);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(set14);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test150");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        experiment.util.Set set5 = treeMapTestDriver0.keySet();
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) (byte) 1);
        int int8 = treeMapTestDriver0.size();
        int int9 = treeMapTestDriver0.size();
        boolean boolean10 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection11 = treeMapTestDriver0.values();
        experiment.util.Collection collection12 = treeMapTestDriver0.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver13 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj15 = treeMapTestDriver13.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj17 = treeMapTestDriver13.remove((java.lang.Object) (-1));
        treeMapTestDriver13.clear();
        boolean boolean19 = treeMapTestDriver13.isEmpty();
        experiment.util.Set set20 = treeMapTestDriver13.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver13);
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
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(set20);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test151");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection7 = treeMapTestDriver0.values();
        experiment.util.Comparator comparator8 = treeMapTestDriver0.comparator();
        int int9 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver10 = new experiment.util.TreeMapTestDriver();
        experiment.util.Comparator comparator11 = treeMapTestDriver10.comparator();
        experiment.util.Collection collection12 = treeMapTestDriver10.values();
        experiment.util.Set set13 = treeMapTestDriver10.keySet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver10);
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(set13);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test152");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass5 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test153");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        treeMapTestDriver0.clear();
        experiment.util.Collection collection8 = treeMapTestDriver0.values();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test154");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        experiment.util.Set set5 = treeMapTestDriver0.keySet();
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) (byte) 1);
        experiment.util.Set set8 = treeMapTestDriver0.entrySet();
        boolean boolean9 = treeMapTestDriver0.isEmpty();
        experiment.util.Set set10 = treeMapTestDriver0.keySet();
        experiment.util.Comparator comparator11 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver12 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj14 = treeMapTestDriver12.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj16 = treeMapTestDriver12.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection17 = treeMapTestDriver12.values();
        experiment.util.Collection collection18 = treeMapTestDriver12.values();
        experiment.util.Set set19 = treeMapTestDriver12.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver21 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj22 = treeMapTestDriver12.put((java.lang.Object) (byte) -1, (java.lang.Object) treeMapTestDriver21);
        int int23 = treeMapTestDriver21.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test155");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection7 = treeMapTestDriver0.values();
        experiment.util.Set set8 = treeMapTestDriver0.keySet();
        experiment.util.Collection collection9 = treeMapTestDriver0.values();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test156");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        experiment.util.Set set5 = treeMapTestDriver0.keySet();
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) (byte) 1);
        int int8 = treeMapTestDriver0.size();
        experiment.util.Collection collection9 = treeMapTestDriver0.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver10 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj12 = treeMapTestDriver10.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj14 = treeMapTestDriver10.remove((java.lang.Object) 0.0f);
        boolean boolean15 = treeMapTestDriver10.isEmpty();
        experiment.util.Comparator comparator16 = treeMapTestDriver10.comparator();
        boolean boolean18 = treeMapTestDriver10.containsKey((java.lang.Object) 1.0f);
        java.lang.Object obj19 = treeMapTestDriver0.remove((java.lang.Object) 1.0f);
        experiment.util.Collection collection20 = treeMapTestDriver0.values();
        treeMapTestDriver0.clear();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(comparator16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(collection20);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test157");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) 100);
        boolean boolean8 = treeMapTestDriver0.isEmpty();
        experiment.util.Set set9 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver10 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj12 = treeMapTestDriver10.get((java.lang.Object) 100);
        experiment.util.Comparator comparator13 = treeMapTestDriver10.comparator();
        boolean boolean15 = treeMapTestDriver10.containsKey((java.lang.Object) (-1));
        boolean boolean17 = treeMapTestDriver10.containsKey((java.lang.Object) 10.0d);
        treeMapTestDriver10.clear();
        experiment.util.Set set19 = treeMapTestDriver10.entrySet();
        experiment.util.Set set20 = treeMapTestDriver10.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver21 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj23 = treeMapTestDriver21.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj25 = treeMapTestDriver21.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection26 = treeMapTestDriver21.values();
        experiment.util.Collection collection27 = treeMapTestDriver21.values();
        experiment.util.Set set28 = treeMapTestDriver21.keySet();
        experiment.util.Collection collection29 = treeMapTestDriver21.values();
        experiment.util.Set set30 = treeMapTestDriver21.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = treeMapTestDriver0.put((java.lang.Object) set20, (java.lang.Object) treeMapTestDriver21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(comparator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(set30);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test158");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        int int6 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator7 = treeMapTestDriver0.comparator();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(comparator7);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test159");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 1L);
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.Collection collection8 = treeMapTestDriver0.values();
        int int9 = treeMapTestDriver0.size();
        experiment.util.Set set10 = treeMapTestDriver0.keySet();
        boolean boolean11 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver12 = new experiment.util.TreeMapTestDriver();
        experiment.util.Comparator comparator13 = treeMapTestDriver12.comparator();
        boolean boolean15 = treeMapTestDriver12.containsKey((java.lang.Object) 10);
        int int16 = treeMapTestDriver12.size();
        experiment.util.Set set17 = treeMapTestDriver12.keySet();
        java.lang.Class<?> wildcardClass18 = set17.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = treeMapTestDriver0.containsKey((java.lang.Object) set17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(comparator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test160");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        boolean boolean7 = treeMapTestDriver0.isEmpty();
        experiment.util.Comparator comparator8 = treeMapTestDriver0.comparator();
        int int9 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver10 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj12 = treeMapTestDriver10.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator13 = treeMapTestDriver10.comparator();
        boolean boolean15 = treeMapTestDriver10.containsKey((java.lang.Object) 1L);
        boolean boolean16 = treeMapTestDriver10.isEmpty();
        int int17 = treeMapTestDriver10.size();
        experiment.util.Collection collection18 = treeMapTestDriver10.values();
        experiment.util.Collection collection19 = treeMapTestDriver10.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = treeMapTestDriver0.remove((java.lang.Object) collection19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.ArrayList cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(comparator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(comparator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(collection19);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test161");
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
        boolean boolean15 = treeMapTestDriver9.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver16 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj18 = treeMapTestDriver16.get((java.lang.Object) 100);
        experiment.util.Set set19 = treeMapTestDriver16.keySet();
        java.lang.Class<?> wildcardClass20 = treeMapTestDriver16.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = treeMapTestDriver9.remove((java.lang.Object) wildcardClass20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test162");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 1L);
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        treeMapTestDriver0.clear();
        experiment.util.Collection collection9 = treeMapTestDriver0.values();
        treeMapTestDriver0.clear();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test163");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 1L);
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.Collection collection8 = treeMapTestDriver0.values();
        experiment.util.Set set9 = treeMapTestDriver0.keySet();
        experiment.util.Comparator comparator10 = treeMapTestDriver0.comparator();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(comparator10);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test164");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Comparator comparator1 = treeMapTestDriver0.comparator();
        boolean boolean3 = treeMapTestDriver0.containsKey((java.lang.Object) 10);
        int int4 = treeMapTestDriver0.size();
        int int5 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver6 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj8 = treeMapTestDriver6.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = treeMapTestDriver6.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection11 = treeMapTestDriver6.values();
        experiment.util.Collection collection12 = treeMapTestDriver6.values();
        experiment.util.Set set13 = treeMapTestDriver6.keySet();
        experiment.util.Collection collection14 = treeMapTestDriver6.values();
        experiment.util.Set set15 = treeMapTestDriver6.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver16 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj18 = treeMapTestDriver16.get((java.lang.Object) 100);
        experiment.util.Comparator comparator19 = treeMapTestDriver16.comparator();
        experiment.util.Comparator comparator20 = treeMapTestDriver16.comparator();
        boolean boolean21 = treeMapTestDriver16.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver22 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj24 = treeMapTestDriver22.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj26 = treeMapTestDriver22.remove((java.lang.Object) 0.0f);
        boolean boolean27 = treeMapTestDriver22.isEmpty();
        experiment.util.Collection collection28 = treeMapTestDriver22.values();
        int int29 = treeMapTestDriver22.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver30 = new experiment.util.TreeMapTestDriver();
        experiment.util.Comparator comparator31 = treeMapTestDriver30.comparator();
        boolean boolean33 = treeMapTestDriver30.containsKey((java.lang.Object) 10);
        experiment.util.TreeMapTestDriver treeMapTestDriver34 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj36 = treeMapTestDriver34.get((java.lang.Object) 100);
        experiment.util.Comparator comparator37 = treeMapTestDriver34.comparator();
        experiment.util.Set set38 = treeMapTestDriver34.entrySet();
        java.lang.Object obj39 = treeMapTestDriver22.put((java.lang.Object) 10, (java.lang.Object) set38);
        boolean boolean40 = treeMapTestDriver22.isEmpty();
        boolean boolean41 = treeMapTestDriver16.containsKey((java.lang.Object) boolean40);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj42 = treeMapTestDriver0.put((java.lang.Object) treeMapTestDriver6, (java.lang.Object) boolean40);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(comparator19);
        org.junit.Assert.assertNull(comparator20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(comparator31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(comparator37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test165");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.TreeMapTestDriver treeMapTestDriver3 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj5 = treeMapTestDriver3.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator6 = treeMapTestDriver3.comparator();
        experiment.util.Set set7 = treeMapTestDriver3.entrySet();
        experiment.util.Set set8 = treeMapTestDriver3.keySet();
        java.lang.Object obj10 = treeMapTestDriver3.remove((java.lang.Object) (byte) 1);
        experiment.util.Set set11 = treeMapTestDriver3.entrySet();
        experiment.util.Set set12 = treeMapTestDriver3.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set12);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test166");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver5 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj7 = treeMapTestDriver5.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator8 = treeMapTestDriver5.comparator();
        experiment.util.Set set9 = treeMapTestDriver5.entrySet();
        experiment.util.Set set10 = treeMapTestDriver5.keySet();
        java.lang.Object obj12 = treeMapTestDriver5.remove((java.lang.Object) (byte) 1);
        int int13 = treeMapTestDriver5.size();
        int int14 = treeMapTestDriver5.size();
        boolean boolean15 = treeMapTestDriver5.isEmpty();
        treeMapTestDriver5.clear();
        boolean boolean17 = treeMapTestDriver5.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver18 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj20 = treeMapTestDriver18.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj22 = treeMapTestDriver18.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection23 = treeMapTestDriver18.values();
        java.lang.Object obj24 = treeMapTestDriver0.put((java.lang.Object) boolean17, (java.lang.Object) treeMapTestDriver18);
        experiment.util.TreeMapTestDriver treeMapTestDriver25 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj27 = treeMapTestDriver25.get((java.lang.Object) 100);
        experiment.util.Comparator comparator28 = treeMapTestDriver25.comparator();
        experiment.util.Comparator comparator29 = treeMapTestDriver25.comparator();
        boolean boolean30 = treeMapTestDriver25.isEmpty();
        int int31 = treeMapTestDriver25.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver32 = new experiment.util.TreeMapTestDriver();
        experiment.util.Comparator comparator33 = treeMapTestDriver32.comparator();
        boolean boolean35 = treeMapTestDriver32.containsKey((java.lang.Object) 10);
        int int36 = treeMapTestDriver32.size();
        experiment.util.Set set37 = treeMapTestDriver32.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj38 = treeMapTestDriver0.put((java.lang.Object) int31, (java.lang.Object) treeMapTestDriver32);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to java.lang.Integer");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(comparator8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(comparator28);
        org.junit.Assert.assertNull(comparator29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(comparator33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(set37);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test167");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection7 = treeMapTestDriver0.values();
        experiment.util.Comparator comparator8 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj11 = treeMapTestDriver9.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator12 = treeMapTestDriver9.comparator();
        experiment.util.Set set13 = treeMapTestDriver9.entrySet();
        experiment.util.Set set14 = treeMapTestDriver9.keySet();
        java.lang.Object obj16 = treeMapTestDriver9.remove((java.lang.Object) (byte) 1);
        experiment.util.Set set17 = treeMapTestDriver9.entrySet();
        java.lang.Class<?> wildcardClass18 = set17.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = treeMapTestDriver0.remove((java.lang.Object) wildcardClass18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to java.lang.Comparable");
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
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test168");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        treeMapTestDriver0.clear();
        boolean boolean8 = treeMapTestDriver0.isEmpty();
        experiment.util.Set set9 = treeMapTestDriver0.entrySet();
        int int10 = treeMapTestDriver0.size();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test169");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        int int7 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver8 = new experiment.util.TreeMapTestDriver();
        experiment.util.Comparator comparator9 = treeMapTestDriver8.comparator();
        boolean boolean11 = treeMapTestDriver8.containsKey((java.lang.Object) 10);
        int int12 = treeMapTestDriver8.size();
        int int13 = treeMapTestDriver8.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver8);
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test170");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection7 = treeMapTestDriver0.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver8 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj10 = treeMapTestDriver8.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj12 = treeMapTestDriver8.remove((java.lang.Object) 0.0f);
        boolean boolean13 = treeMapTestDriver8.isEmpty();
        experiment.util.Collection collection14 = treeMapTestDriver8.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver15 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj17 = treeMapTestDriver15.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj19 = treeMapTestDriver15.remove((java.lang.Object) (-1));
        experiment.util.Set set20 = treeMapTestDriver15.entrySet();
        boolean boolean21 = treeMapTestDriver15.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = treeMapTestDriver0.put((java.lang.Object) treeMapTestDriver8, (java.lang.Object) boolean21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test171");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.Comparator comparator8 = treeMapTestDriver0.comparator();
        boolean boolean9 = treeMapTestDriver0.isEmpty();
        experiment.util.Set set10 = treeMapTestDriver0.entrySet();
        java.lang.Class<?> wildcardClass11 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(comparator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test172");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        treeMapTestDriver0.clear();
        experiment.util.Comparator comparator7 = treeMapTestDriver0.comparator();
        int int8 = treeMapTestDriver0.size();
        java.lang.Class<?> wildcardClass9 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(comparator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test173");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection7 = treeMapTestDriver0.values();
        experiment.util.Comparator comparator8 = treeMapTestDriver0.comparator();
        experiment.util.Set set9 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver10 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj12 = treeMapTestDriver10.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator13 = treeMapTestDriver10.comparator();
        experiment.util.Set set14 = treeMapTestDriver10.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = treeMapTestDriver0.get((java.lang.Object) set14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(comparator8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(comparator13);
        org.junit.Assert.assertNotNull(set14);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test174");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) (-1));
        experiment.util.Set set5 = treeMapTestDriver0.entrySet();
        treeMapTestDriver0.clear();
        treeMapTestDriver0.clear();
        experiment.util.Collection collection8 = treeMapTestDriver0.values();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test175");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj9 = treeMapTestDriver7.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj11 = treeMapTestDriver7.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection12 = treeMapTestDriver7.values();
        experiment.util.Comparator comparator13 = treeMapTestDriver7.comparator();
        boolean boolean14 = treeMapTestDriver7.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(comparator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test176");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) (-1));
        experiment.util.Set set5 = treeMapTestDriver0.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver6 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj8 = treeMapTestDriver6.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = treeMapTestDriver6.remove((java.lang.Object) (-1));
        treeMapTestDriver6.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver12 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj14 = treeMapTestDriver12.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator15 = treeMapTestDriver12.comparator();
        experiment.util.Set set16 = treeMapTestDriver12.entrySet();
        java.lang.Object obj18 = treeMapTestDriver12.get((java.lang.Object) 100);
        treeMapTestDriver12.clear();
        experiment.util.Comparator comparator20 = treeMapTestDriver12.comparator();
        boolean boolean21 = treeMapTestDriver12.isEmpty();
        java.lang.Object obj23 = treeMapTestDriver6.put((java.lang.Object) boolean21, (java.lang.Object) (short) 10);
        boolean boolean24 = treeMapTestDriver6.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver25 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj27 = treeMapTestDriver25.get((java.lang.Object) 100);
        experiment.util.Collection collection28 = treeMapTestDriver25.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = treeMapTestDriver0.put((java.lang.Object) treeMapTestDriver6, (java.lang.Object) collection28);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(comparator15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(comparator20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test177");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 100);
        treeMapTestDriver0.clear();
        java.lang.Class<?> wildcardClass8 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test178");
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
        java.lang.Object obj18 = treeMapTestDriver14.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection19 = treeMapTestDriver14.values();
        experiment.util.Collection collection20 = treeMapTestDriver14.values();
        experiment.util.Set set21 = treeMapTestDriver14.keySet();
        experiment.util.Comparator comparator22 = treeMapTestDriver14.comparator();
        experiment.util.Set set23 = treeMapTestDriver14.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver14);
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
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(comparator22);
        org.junit.Assert.assertNotNull(set23);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test179");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        treeMapTestDriver0.clear();
        boolean boolean9 = treeMapTestDriver0.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test180");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.Set set8 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver10 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj12 = treeMapTestDriver10.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj14 = treeMapTestDriver10.remove((java.lang.Object) 0.0f);
        java.lang.Object obj16 = treeMapTestDriver10.get((java.lang.Object) 1L);
        experiment.util.Set set17 = treeMapTestDriver10.keySet();
        experiment.util.Collection collection18 = treeMapTestDriver10.values();
        int int19 = treeMapTestDriver10.size();
        experiment.util.Set set20 = treeMapTestDriver10.keySet();
        boolean boolean21 = treeMapTestDriver10.isEmpty();
        treeMapTestDriver10.clear();
        java.lang.Object obj23 = treeMapTestDriver0.put((java.lang.Object) (short) 0, (java.lang.Object) treeMapTestDriver10);
        experiment.util.Set set24 = treeMapTestDriver0.entrySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set24);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test181");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection7 = treeMapTestDriver0.values();
        experiment.util.Set set8 = treeMapTestDriver0.keySet();
        experiment.util.Set set9 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver10 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj12 = treeMapTestDriver10.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator13 = treeMapTestDriver10.comparator();
        experiment.util.Set set14 = treeMapTestDriver10.entrySet();
        experiment.util.Set set15 = treeMapTestDriver10.keySet();
        java.lang.Object obj17 = treeMapTestDriver10.remove((java.lang.Object) (byte) 1);
        int int18 = treeMapTestDriver10.size();
        int int19 = treeMapTestDriver10.size();
        boolean boolean20 = treeMapTestDriver10.isEmpty();
        treeMapTestDriver10.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver10);
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
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(comparator13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test182");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 1L);
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.Collection collection8 = treeMapTestDriver0.values();
        int int9 = treeMapTestDriver0.size();
        experiment.util.Set set10 = treeMapTestDriver0.keySet();
        boolean boolean11 = treeMapTestDriver0.isEmpty();
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver13 = new experiment.util.TreeMapTestDriver();
        experiment.util.Comparator comparator14 = treeMapTestDriver13.comparator();
        experiment.util.Collection collection15 = treeMapTestDriver13.values();
        treeMapTestDriver13.clear();
        experiment.util.Set set17 = treeMapTestDriver13.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = treeMapTestDriver0.get((java.lang.Object) set17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(comparator14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(set17);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test183");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver8 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj10 = treeMapTestDriver8.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj12 = treeMapTestDriver8.remove((java.lang.Object) 0.0f);
        boolean boolean13 = treeMapTestDriver8.isEmpty();
        experiment.util.Collection collection14 = treeMapTestDriver8.values();
        experiment.util.Set set15 = treeMapTestDriver8.keySet();
        int int16 = treeMapTestDriver8.size();
        treeMapTestDriver8.clear();
        experiment.util.Comparator comparator18 = treeMapTestDriver8.comparator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = treeMapTestDriver0.containsKey((java.lang.Object) comparator18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(comparator18);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test184");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection7 = treeMapTestDriver0.values();
        experiment.util.Comparator comparator8 = treeMapTestDriver0.comparator();
        experiment.util.Set set9 = treeMapTestDriver0.keySet();
        java.lang.Object obj11 = treeMapTestDriver0.remove((java.lang.Object) false);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(comparator8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test185");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        boolean boolean7 = treeMapTestDriver0.isEmpty();
        experiment.util.Comparator comparator8 = treeMapTestDriver0.comparator();
        int int9 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver10 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj12 = treeMapTestDriver10.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj14 = treeMapTestDriver10.remove((java.lang.Object) 0.0f);
        boolean boolean15 = treeMapTestDriver10.isEmpty();
        experiment.util.Collection collection16 = treeMapTestDriver10.values();
        treeMapTestDriver10.clear();
        boolean boolean18 = treeMapTestDriver10.isEmpty();
        java.lang.Object obj19 = treeMapTestDriver0.get((java.lang.Object) boolean18);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(comparator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test186");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Comparator comparator1 = treeMapTestDriver0.comparator();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        treeMapTestDriver0.clear();
        experiment.util.Set set4 = treeMapTestDriver0.keySet();
        java.lang.Class<?> wildcardClass5 = set4.getClass();
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test187");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        treeMapTestDriver0.clear();
        boolean boolean7 = treeMapTestDriver0.isEmpty();
        treeMapTestDriver0.clear();
        int int9 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator10 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver11 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj13 = treeMapTestDriver11.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator14 = treeMapTestDriver11.comparator();
        boolean boolean16 = treeMapTestDriver11.containsKey((java.lang.Object) 1L);
        java.lang.Object obj18 = treeMapTestDriver11.remove((java.lang.Object) 100);
        boolean boolean19 = treeMapTestDriver11.isEmpty();
        experiment.util.Comparator comparator20 = treeMapTestDriver11.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(comparator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(comparator20);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test188");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        treeMapTestDriver0.clear();
        boolean boolean7 = treeMapTestDriver0.isEmpty();
        treeMapTestDriver0.clear();
        int int9 = treeMapTestDriver0.size();
        boolean boolean10 = treeMapTestDriver0.isEmpty();
        experiment.util.Comparator comparator11 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver12 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj14 = treeMapTestDriver12.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator15 = treeMapTestDriver12.comparator();
        treeMapTestDriver12.clear();
        experiment.util.Set set17 = treeMapTestDriver12.entrySet();
        experiment.util.Comparator comparator18 = treeMapTestDriver12.comparator();
        experiment.util.Set set19 = treeMapTestDriver12.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = treeMapTestDriver0.remove((java.lang.Object) set19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(comparator15);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(comparator18);
        org.junit.Assert.assertNotNull(set19);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test189");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        int int7 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver8 = new experiment.util.TreeMapTestDriver();
        experiment.util.Comparator comparator9 = treeMapTestDriver8.comparator();
        boolean boolean11 = treeMapTestDriver8.containsKey((java.lang.Object) 10);
        int int12 = treeMapTestDriver8.size();
        experiment.util.Set set13 = treeMapTestDriver8.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver14 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj16 = treeMapTestDriver14.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = treeMapTestDriver14.remove((java.lang.Object) (-1));
        experiment.util.Collection collection19 = treeMapTestDriver14.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = treeMapTestDriver0.put((java.lang.Object) set13, (java.lang.Object) treeMapTestDriver14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(collection19);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test190");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) (-1));
        treeMapTestDriver0.clear();
        experiment.util.Comparator comparator6 = treeMapTestDriver0.comparator();
        experiment.util.Collection collection7 = treeMapTestDriver0.values();
        java.lang.Class<?> wildcardClass8 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test191");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        experiment.util.Set set5 = treeMapTestDriver0.keySet();
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) true);
        experiment.util.Set set8 = treeMapTestDriver0.entrySet();
        experiment.util.Collection collection9 = treeMapTestDriver0.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver10 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj12 = treeMapTestDriver10.get((java.lang.Object) 100);
        experiment.util.Comparator comparator13 = treeMapTestDriver10.comparator();
        experiment.util.Comparator comparator14 = treeMapTestDriver10.comparator();
        boolean boolean15 = treeMapTestDriver10.isEmpty();
        treeMapTestDriver10.clear();
        treeMapTestDriver10.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver18 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj20 = treeMapTestDriver18.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator21 = treeMapTestDriver18.comparator();
        boolean boolean23 = treeMapTestDriver18.containsKey((java.lang.Object) 1L);
        boolean boolean24 = treeMapTestDriver18.isEmpty();
        experiment.util.Collection collection25 = treeMapTestDriver18.values();
        experiment.util.Comparator comparator26 = treeMapTestDriver18.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = treeMapTestDriver0.put((java.lang.Object) treeMapTestDriver10, (java.lang.Object) treeMapTestDriver18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(comparator13);
        org.junit.Assert.assertNull(comparator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(comparator21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNull(comparator26);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test192");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) (-1));
        treeMapTestDriver0.clear();
        java.lang.Class<?> wildcardClass6 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test193");
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
        java.lang.Object obj16 = treeMapTestDriver14.get((java.lang.Object) 100);
        experiment.util.Comparator comparator17 = treeMapTestDriver14.comparator();
        boolean boolean19 = treeMapTestDriver14.containsKey((java.lang.Object) (-1));
        boolean boolean21 = treeMapTestDriver14.containsKey((java.lang.Object) 10.0d);
        treeMapTestDriver14.clear();
        experiment.util.Set set23 = treeMapTestDriver14.entrySet();
        experiment.util.Set set24 = treeMapTestDriver14.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = treeMapTestDriver0.remove((java.lang.Object) set24);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet cannot be cast to java.lang.Comparable");
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(set24);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test194");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        experiment.util.Set set5 = treeMapTestDriver0.keySet();
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) true);
        experiment.util.Set set8 = treeMapTestDriver0.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set10 = treeMapTestDriver9.keySet();
        experiment.util.Comparator comparator11 = treeMapTestDriver9.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver12 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj14 = treeMapTestDriver12.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator15 = treeMapTestDriver12.comparator();
        boolean boolean17 = treeMapTestDriver12.containsKey((java.lang.Object) 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = treeMapTestDriver0.put((java.lang.Object) comparator11, (java.lang.Object) boolean17);
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
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(comparator15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test195");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        treeMapTestDriver0.clear();
        experiment.util.Set set7 = treeMapTestDriver0.entrySet();
        experiment.util.Collection collection8 = treeMapTestDriver0.values();
        experiment.util.Collection collection9 = treeMapTestDriver0.values();
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver11 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set12 = treeMapTestDriver11.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = treeMapTestDriver0.remove((java.lang.Object) set12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(set12);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test196");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) 100);
        experiment.util.Set set8 = treeMapTestDriver0.entrySet();
        treeMapTestDriver0.clear();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test197");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) (-1));
        boolean boolean7 = treeMapTestDriver0.containsKey((java.lang.Object) 10.0d);
        treeMapTestDriver0.clear();
        experiment.util.Set set9 = treeMapTestDriver0.entrySet();
        experiment.util.Set set10 = treeMapTestDriver0.entrySet();
        int int11 = treeMapTestDriver0.size();
        java.lang.Class<?> wildcardClass12 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test198");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.TreeMapTestDriver treeMapTestDriver3 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj5 = treeMapTestDriver3.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj7 = treeMapTestDriver3.remove((java.lang.Object) 0.0f);
        boolean boolean8 = treeMapTestDriver3.isEmpty();
        experiment.util.Collection collection9 = treeMapTestDriver3.values();
        experiment.util.Set set10 = treeMapTestDriver3.keySet();
        experiment.util.Collection collection11 = treeMapTestDriver3.values();
        boolean boolean12 = treeMapTestDriver3.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver13 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj15 = treeMapTestDriver13.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj17 = treeMapTestDriver13.remove((java.lang.Object) (-1));
        treeMapTestDriver13.clear();
        experiment.util.Comparator comparator19 = treeMapTestDriver13.comparator();
        experiment.util.Collection collection20 = treeMapTestDriver13.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = treeMapTestDriver0.put((java.lang.Object) treeMapTestDriver3, (java.lang.Object) treeMapTestDriver13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(comparator19);
        org.junit.Assert.assertNotNull(collection20);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test199");
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
        treeMapTestDriver9.clear();
        boolean boolean17 = treeMapTestDriver9.containsKey((java.lang.Object) 100.0d);
        int int18 = treeMapTestDriver9.size();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test200");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) (-1));
        treeMapTestDriver0.clear();
        experiment.util.Comparator comparator6 = treeMapTestDriver0.comparator();
        experiment.util.Collection collection7 = treeMapTestDriver0.values();
        experiment.util.Set set8 = treeMapTestDriver0.keySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test201");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) 100);
        boolean boolean8 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj11 = treeMapTestDriver9.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator12 = treeMapTestDriver9.comparator();
        boolean boolean14 = treeMapTestDriver9.containsKey((java.lang.Object) 1L);
        java.lang.Object obj16 = treeMapTestDriver9.remove((java.lang.Object) 100);
        experiment.util.Set set17 = treeMapTestDriver9.keySet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = treeMapTestDriver0.containsKey((java.lang.Object) set17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet cannot be cast to java.lang.Comparable");
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test202");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Comparator comparator1 = treeMapTestDriver0.comparator();
        boolean boolean3 = treeMapTestDriver0.containsKey((java.lang.Object) 10);
        int int4 = treeMapTestDriver0.size();
        int int5 = treeMapTestDriver0.size();
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj9 = treeMapTestDriver7.get((java.lang.Object) 100);
        experiment.util.Comparator comparator10 = treeMapTestDriver7.comparator();
        experiment.util.Comparator comparator11 = treeMapTestDriver7.comparator();
        boolean boolean12 = treeMapTestDriver7.isEmpty();
        treeMapTestDriver7.clear();
        experiment.util.Set set14 = treeMapTestDriver7.entrySet();
        experiment.util.Collection collection15 = treeMapTestDriver7.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test203");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        treeMapTestDriver0.clear();
        experiment.util.Set set7 = treeMapTestDriver0.entrySet();
        experiment.util.Set set8 = treeMapTestDriver0.keySet();
        int int9 = treeMapTestDriver0.size();
        experiment.util.Set set10 = treeMapTestDriver0.keySet();
        java.lang.Object obj12 = treeMapTestDriver0.remove((java.lang.Object) (byte) 10);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test204");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver8 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj10 = treeMapTestDriver8.get((java.lang.Object) 100);
        experiment.util.Set set11 = treeMapTestDriver8.keySet();
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
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test205");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        int int6 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj9 = treeMapTestDriver7.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj11 = treeMapTestDriver7.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection12 = treeMapTestDriver7.values();
        experiment.util.Collection collection13 = treeMapTestDriver7.values();
        experiment.util.Set set14 = treeMapTestDriver7.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver16 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj17 = treeMapTestDriver7.put((java.lang.Object) (byte) -1, (java.lang.Object) treeMapTestDriver16);
        experiment.util.Comparator comparator18 = treeMapTestDriver16.comparator();
        treeMapTestDriver16.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
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
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(comparator18);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test206");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        treeMapTestDriver0.clear();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test207");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 1L);
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.Collection collection8 = treeMapTestDriver0.values();
        boolean boolean9 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = treeMapTestDriver0.get(obj10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test208");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Comparator comparator1 = treeMapTestDriver0.comparator();
        boolean boolean3 = treeMapTestDriver0.containsKey((java.lang.Object) 10);
        int int4 = treeMapTestDriver0.size();
        int int5 = treeMapTestDriver0.size();
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        experiment.util.Set set7 = treeMapTestDriver0.entrySet();
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test209");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.Comparator comparator8 = treeMapTestDriver0.comparator();
        experiment.util.Collection collection9 = treeMapTestDriver0.values();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(comparator8);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test210");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        experiment.util.Comparator comparator6 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj9 = treeMapTestDriver7.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator10 = treeMapTestDriver7.comparator();
        treeMapTestDriver7.clear();
        experiment.util.Set set12 = treeMapTestDriver7.entrySet();
        experiment.util.Comparator comparator13 = treeMapTestDriver7.comparator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = treeMapTestDriver0.containsKey((java.lang.Object) comparator13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(comparator13);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test211");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        int int7 = treeMapTestDriver0.size();
        experiment.util.Set set8 = treeMapTestDriver0.keySet();
        boolean boolean9 = treeMapTestDriver0.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test212");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        experiment.util.Comparator comparator6 = treeMapTestDriver0.comparator();
        boolean boolean8 = treeMapTestDriver0.containsKey((java.lang.Object) 1.0f);
        experiment.util.Set set9 = treeMapTestDriver0.entrySet();
        experiment.util.Comparator comparator10 = treeMapTestDriver0.comparator();
        int int11 = treeMapTestDriver0.size();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test213");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        treeMapTestDriver0.clear();
        boolean boolean7 = treeMapTestDriver0.isEmpty();
        treeMapTestDriver0.clear();
        int int9 = treeMapTestDriver0.size();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test214");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Comparator comparator1 = treeMapTestDriver0.comparator();
        boolean boolean3 = treeMapTestDriver0.containsKey((java.lang.Object) 10);
        int int4 = treeMapTestDriver0.size();
        experiment.util.Set set5 = treeMapTestDriver0.keySet();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj9 = treeMapTestDriver7.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator10 = treeMapTestDriver7.comparator();
        experiment.util.Set set11 = treeMapTestDriver7.entrySet();
        experiment.util.Set set12 = treeMapTestDriver7.keySet();
        java.lang.Object obj14 = treeMapTestDriver7.remove((java.lang.Object) (byte) 1);
        int int15 = treeMapTestDriver7.size();
        experiment.util.Collection collection16 = treeMapTestDriver7.values();
        java.lang.Class<?> wildcardClass17 = treeMapTestDriver7.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test215");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) (-1));
        boolean boolean7 = treeMapTestDriver0.containsKey((java.lang.Object) 10.0d);
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj11 = treeMapTestDriver9.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj13 = treeMapTestDriver9.remove((java.lang.Object) 0.0f);
        java.lang.Object obj15 = treeMapTestDriver9.get((java.lang.Object) 1L);
        experiment.util.Set set16 = treeMapTestDriver9.keySet();
        experiment.util.Set set17 = treeMapTestDriver9.entrySet();
        experiment.util.Collection collection18 = treeMapTestDriver9.values();
        experiment.util.Collection collection19 = treeMapTestDriver9.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(collection19);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test216");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        treeMapTestDriver0.clear();
        experiment.util.Set set7 = treeMapTestDriver0.entrySet();
        experiment.util.Collection collection8 = treeMapTestDriver0.values();
        experiment.util.Collection collection9 = treeMapTestDriver0.values();
        treeMapTestDriver0.clear();
        int int11 = treeMapTestDriver0.size();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test217");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.entrySet();
        experiment.util.Set set2 = treeMapTestDriver0.keySet();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(set2);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test218");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Comparator comparator1 = treeMapTestDriver0.comparator();
        boolean boolean3 = treeMapTestDriver0.containsKey((java.lang.Object) 10);
        int int4 = treeMapTestDriver0.size();
        int int5 = treeMapTestDriver0.size();
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        experiment.util.Comparator comparator7 = treeMapTestDriver0.comparator();
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(comparator7);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test219");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 1L);
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.Collection collection8 = treeMapTestDriver0.values();
        int int9 = treeMapTestDriver0.size();
        experiment.util.Set set10 = treeMapTestDriver0.keySet();
        java.lang.Class<?> wildcardClass11 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test220");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        int int6 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj9 = treeMapTestDriver7.get((java.lang.Object) 100);
        java.lang.Object obj11 = treeMapTestDriver0.put((java.lang.Object) 100, (java.lang.Object) 1.0f);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test221");
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
        experiment.util.TreeMapTestDriver treeMapTestDriver15 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj17 = treeMapTestDriver15.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator18 = treeMapTestDriver15.comparator();
        experiment.util.Set set19 = treeMapTestDriver15.entrySet();
        treeMapTestDriver15.clear();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = treeMapTestDriver9.containsKey((java.lang.Object) treeMapTestDriver15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(comparator18);
        org.junit.Assert.assertNotNull(set19);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test222");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.Set set8 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        experiment.util.Comparator comparator10 = treeMapTestDriver9.comparator();
        boolean boolean12 = treeMapTestDriver9.containsKey((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass13 = treeMapTestDriver9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test223");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        treeMapTestDriver0.clear();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test224");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver4 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj6 = treeMapTestDriver4.get((java.lang.Object) 100);
        experiment.util.Comparator comparator7 = treeMapTestDriver4.comparator();
        boolean boolean9 = treeMapTestDriver4.containsKey((java.lang.Object) (-1));
        boolean boolean11 = treeMapTestDriver4.containsKey((java.lang.Object) 10.0d);
        treeMapTestDriver4.clear();
        experiment.util.Set set13 = treeMapTestDriver4.entrySet();
        experiment.util.Set set14 = treeMapTestDriver4.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver16 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj18 = treeMapTestDriver16.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj20 = treeMapTestDriver16.remove((java.lang.Object) 0.0f);
        boolean boolean21 = treeMapTestDriver16.isEmpty();
        experiment.util.Collection collection22 = treeMapTestDriver16.values();
        treeMapTestDriver16.clear();
        boolean boolean24 = treeMapTestDriver16.isEmpty();
        java.lang.Object obj25 = treeMapTestDriver4.put((java.lang.Object) 100.0f, (java.lang.Object) boolean24);
        experiment.util.Collection collection26 = treeMapTestDriver4.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = treeMapTestDriver0.remove((java.lang.Object) collection26);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(comparator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(collection26);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test225");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        experiment.util.Comparator comparator6 = treeMapTestDriver0.comparator();
        boolean boolean8 = treeMapTestDriver0.containsKey((java.lang.Object) 1.0f);
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj11 = treeMapTestDriver9.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj13 = treeMapTestDriver9.remove((java.lang.Object) (-1));
        treeMapTestDriver9.clear();
        boolean boolean15 = treeMapTestDriver9.isEmpty();
        java.lang.Object obj16 = treeMapTestDriver0.get((java.lang.Object) boolean15);
        experiment.util.Set set17 = treeMapTestDriver0.entrySet();
        java.lang.Class<?> wildcardClass18 = set17.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test226");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj9 = treeMapTestDriver7.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj11 = treeMapTestDriver7.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection12 = treeMapTestDriver7.values();
        experiment.util.Collection collection13 = treeMapTestDriver7.values();
        experiment.util.Set set14 = treeMapTestDriver7.keySet();
        experiment.util.Set set15 = treeMapTestDriver7.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver17 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj19 = treeMapTestDriver17.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj21 = treeMapTestDriver17.remove((java.lang.Object) 0.0f);
        java.lang.Object obj23 = treeMapTestDriver17.get((java.lang.Object) 1L);
        experiment.util.Set set24 = treeMapTestDriver17.keySet();
        experiment.util.Collection collection25 = treeMapTestDriver17.values();
        int int26 = treeMapTestDriver17.size();
        experiment.util.Set set27 = treeMapTestDriver17.keySet();
        boolean boolean28 = treeMapTestDriver17.isEmpty();
        treeMapTestDriver17.clear();
        java.lang.Object obj30 = treeMapTestDriver7.put((java.lang.Object) (short) 0, (java.lang.Object) treeMapTestDriver17);
        experiment.util.TreeMapTestDriver treeMapTestDriver31 = new experiment.util.TreeMapTestDriver();
        experiment.util.Comparator comparator32 = treeMapTestDriver31.comparator();
        boolean boolean34 = treeMapTestDriver31.containsKey((java.lang.Object) 10);
        int int35 = treeMapTestDriver31.size();
        experiment.util.Set set36 = treeMapTestDriver31.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj37 = treeMapTestDriver0.put((java.lang.Object) treeMapTestDriver7, (java.lang.Object) set36);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(comparator32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(set36);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test227");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        java.lang.Class<?> wildcardClass3 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test228");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        experiment.util.Set set5 = treeMapTestDriver0.keySet();
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) (byte) 1);
        int int8 = treeMapTestDriver0.size();
        experiment.util.Collection collection9 = treeMapTestDriver0.values();
        experiment.util.Set set10 = treeMapTestDriver0.entrySet();
        java.lang.Class<?> wildcardClass11 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test229");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Comparator comparator1 = treeMapTestDriver0.comparator();
        boolean boolean3 = treeMapTestDriver0.containsKey((java.lang.Object) 10);
        int int4 = treeMapTestDriver0.size();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test230");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        experiment.util.Set set5 = treeMapTestDriver0.keySet();
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) (byte) 1);
        int int8 = treeMapTestDriver0.size();
        int int9 = treeMapTestDriver0.size();
        boolean boolean10 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection11 = treeMapTestDriver0.values();
        experiment.util.Collection collection12 = treeMapTestDriver0.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver13 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj15 = treeMapTestDriver13.remove((java.lang.Object) (byte) -1);
        boolean boolean16 = treeMapTestDriver13.isEmpty();
        java.lang.Object obj17 = treeMapTestDriver0.remove((java.lang.Object) boolean16);
        experiment.util.Collection collection18 = treeMapTestDriver0.values();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test231");
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
        experiment.util.Comparator comparator16 = treeMapTestDriver13.comparator();
        boolean boolean18 = treeMapTestDriver13.containsKey((java.lang.Object) 1L);
        boolean boolean19 = treeMapTestDriver13.isEmpty();
        boolean boolean20 = treeMapTestDriver13.isEmpty();
        experiment.util.Comparator comparator21 = treeMapTestDriver13.comparator();
        java.lang.Object obj22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = treeMapTestDriver9.put((java.lang.Object) comparator21, obj22);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(comparator16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(comparator21);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test232");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) 100);
        boolean boolean8 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj11 = treeMapTestDriver9.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator12 = treeMapTestDriver9.comparator();
        boolean boolean14 = treeMapTestDriver9.containsKey((java.lang.Object) 1L);
        java.lang.Object obj16 = treeMapTestDriver9.remove((java.lang.Object) 100);
        boolean boolean17 = treeMapTestDriver9.isEmpty();
        experiment.util.Comparator comparator18 = treeMapTestDriver9.comparator();
        boolean boolean19 = treeMapTestDriver9.isEmpty();
        java.lang.Class<?> wildcardClass20 = treeMapTestDriver9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(comparator18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test233");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        int int7 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver8 = new experiment.util.TreeMapTestDriver();
        experiment.util.Comparator comparator9 = treeMapTestDriver8.comparator();
        boolean boolean11 = treeMapTestDriver8.containsKey((java.lang.Object) 10);
        experiment.util.TreeMapTestDriver treeMapTestDriver12 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj14 = treeMapTestDriver12.get((java.lang.Object) 100);
        experiment.util.Comparator comparator15 = treeMapTestDriver12.comparator();
        experiment.util.Set set16 = treeMapTestDriver12.entrySet();
        java.lang.Object obj17 = treeMapTestDriver0.put((java.lang.Object) 10, (java.lang.Object) set16);
        boolean boolean18 = treeMapTestDriver0.isEmpty();
        treeMapTestDriver0.clear();
        treeMapTestDriver0.clear();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(comparator15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test234");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        experiment.util.Set set6 = treeMapTestDriver0.keySet();
        boolean boolean7 = treeMapTestDriver0.isEmpty();
        experiment.util.Set set8 = treeMapTestDriver0.entrySet();
        int int9 = treeMapTestDriver0.size();
        java.lang.Class<?> wildcardClass10 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test235");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        treeMapTestDriver0.clear();
        treeMapTestDriver0.clear();
        experiment.util.Comparator comparator8 = treeMapTestDriver0.comparator();
        boolean boolean9 = treeMapTestDriver0.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(comparator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test236");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        int int7 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver8 = new experiment.util.TreeMapTestDriver();
        experiment.util.Comparator comparator9 = treeMapTestDriver8.comparator();
        boolean boolean11 = treeMapTestDriver8.containsKey((java.lang.Object) 10);
        experiment.util.TreeMapTestDriver treeMapTestDriver12 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj14 = treeMapTestDriver12.get((java.lang.Object) 100);
        experiment.util.Comparator comparator15 = treeMapTestDriver12.comparator();
        experiment.util.Set set16 = treeMapTestDriver12.entrySet();
        java.lang.Object obj17 = treeMapTestDriver0.put((java.lang.Object) 10, (java.lang.Object) set16);
        experiment.util.Collection collection18 = treeMapTestDriver0.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver19 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj21 = treeMapTestDriver19.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj23 = treeMapTestDriver19.remove((java.lang.Object) (-1));
        treeMapTestDriver19.clear();
        boolean boolean25 = treeMapTestDriver19.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver26 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj28 = treeMapTestDriver26.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator29 = treeMapTestDriver26.comparator();
        experiment.util.Set set30 = treeMapTestDriver26.entrySet();
        java.lang.Object obj32 = treeMapTestDriver26.get((java.lang.Object) 100);
        treeMapTestDriver26.clear();
        experiment.util.Comparator comparator34 = treeMapTestDriver26.comparator();
        int int35 = treeMapTestDriver26.size();
        java.lang.Object obj37 = treeMapTestDriver19.put((java.lang.Object) int35, (java.lang.Object) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj38 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(comparator15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(comparator29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(comparator34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(obj37);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test237");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        treeMapTestDriver0.clear();
        boolean boolean7 = treeMapTestDriver0.isEmpty();
        experiment.util.Set set8 = treeMapTestDriver0.entrySet();
        int int9 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver10 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj12 = treeMapTestDriver10.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator13 = treeMapTestDriver10.comparator();
        boolean boolean15 = treeMapTestDriver10.containsKey((java.lang.Object) 1L);
        boolean boolean16 = treeMapTestDriver10.isEmpty();
        int int17 = treeMapTestDriver10.size();
        experiment.util.Collection collection18 = treeMapTestDriver10.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(comparator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test238");
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
        java.lang.Object obj15 = treeMapTestDriver11.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection16 = treeMapTestDriver11.values();
        experiment.util.Collection collection17 = treeMapTestDriver11.values();
        experiment.util.Set set18 = treeMapTestDriver11.keySet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = treeMapTestDriver0.containsKey((java.lang.Object) set18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
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
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set18);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test239");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 100);
        java.lang.Object obj8 = treeMapTestDriver0.remove((java.lang.Object) 10.0f);
        experiment.util.Collection collection9 = treeMapTestDriver0.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver10 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj12 = treeMapTestDriver10.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj14 = treeMapTestDriver10.remove((java.lang.Object) 0.0f);
        java.lang.Object obj16 = treeMapTestDriver10.get((java.lang.Object) 1L);
        experiment.util.Set set17 = treeMapTestDriver10.keySet();
        experiment.util.Collection collection18 = treeMapTestDriver10.values();
        int int19 = treeMapTestDriver10.size();
        treeMapTestDriver10.clear();
        experiment.util.Set set21 = treeMapTestDriver10.entrySet();
        experiment.util.Collection collection22 = treeMapTestDriver10.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = treeMapTestDriver0.put((java.lang.Object) collection22, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(collection22);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test240");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) (-1));
        treeMapTestDriver0.clear();
        experiment.util.Comparator comparator6 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set8 = treeMapTestDriver7.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test241");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        treeMapTestDriver0.clear();
        experiment.util.Set set7 = treeMapTestDriver0.entrySet();
        experiment.util.Set set8 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj11 = treeMapTestDriver9.get((java.lang.Object) 100);
        experiment.util.Comparator comparator12 = treeMapTestDriver9.comparator();
        int int13 = treeMapTestDriver9.size();
        treeMapTestDriver9.clear();
        experiment.util.Set set15 = treeMapTestDriver9.entrySet();
        int int16 = treeMapTestDriver9.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver17 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj19 = treeMapTestDriver17.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj21 = treeMapTestDriver17.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection22 = treeMapTestDriver17.values();
        experiment.util.Collection collection23 = treeMapTestDriver17.values();
        experiment.util.Set set24 = treeMapTestDriver17.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver26 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj27 = treeMapTestDriver17.put((java.lang.Object) (byte) -1, (java.lang.Object) treeMapTestDriver26);
        java.lang.Class<?> wildcardClass28 = treeMapTestDriver26.getClass();
        java.lang.Object obj29 = treeMapTestDriver0.put((java.lang.Object) int16, (java.lang.Object) wildcardClass28);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test242");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.TreeMapTestDriver treeMapTestDriver5 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj7 = treeMapTestDriver5.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj9 = treeMapTestDriver5.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection10 = treeMapTestDriver5.values();
        treeMapTestDriver5.clear();
        boolean boolean12 = treeMapTestDriver5.isEmpty();
        treeMapTestDriver5.clear();
        int int14 = treeMapTestDriver5.size();
        boolean boolean15 = treeMapTestDriver5.isEmpty();
        experiment.util.Comparator comparator16 = treeMapTestDriver5.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(comparator16);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test243");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection7 = treeMapTestDriver0.values();
        experiment.util.Set set8 = treeMapTestDriver0.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj11 = treeMapTestDriver9.remove((java.lang.Object) (byte) -1);
        treeMapTestDriver9.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
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
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test244");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.Comparator comparator8 = treeMapTestDriver0.comparator();
        boolean boolean9 = treeMapTestDriver0.isEmpty();
        experiment.util.Set set10 = treeMapTestDriver0.entrySet();
        boolean boolean11 = treeMapTestDriver0.isEmpty();
        boolean boolean12 = treeMapTestDriver0.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(comparator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test245");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) (-1));
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver6 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj8 = treeMapTestDriver6.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator9 = treeMapTestDriver6.comparator();
        boolean boolean11 = treeMapTestDriver6.containsKey((java.lang.Object) 1L);
        boolean boolean12 = treeMapTestDriver6.isEmpty();
        experiment.util.Collection collection13 = treeMapTestDriver6.values();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = treeMapTestDriver0.containsKey((java.lang.Object) collection13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test246");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        treeMapTestDriver0.clear();
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver8 = new experiment.util.TreeMapTestDriver();
        experiment.util.Comparator comparator9 = treeMapTestDriver8.comparator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(comparator9);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test247");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass6 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test248");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 1L);
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.Collection collection8 = treeMapTestDriver0.values();
        experiment.util.Comparator comparator9 = treeMapTestDriver0.comparator();
        int int10 = treeMapTestDriver0.size();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test249");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) (-1));
        experiment.util.Set set5 = treeMapTestDriver0.entrySet();
        treeMapTestDriver0.clear();
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver8 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj10 = treeMapTestDriver8.get((java.lang.Object) 100);
        experiment.util.Comparator comparator11 = treeMapTestDriver8.comparator();
        experiment.util.Comparator comparator12 = treeMapTestDriver8.comparator();
        boolean boolean13 = treeMapTestDriver8.isEmpty();
        treeMapTestDriver8.clear();
        experiment.util.Set set15 = treeMapTestDriver8.entrySet();
        experiment.util.Collection collection16 = treeMapTestDriver8.values();
        experiment.util.Collection collection17 = treeMapTestDriver8.values();
        treeMapTestDriver8.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver19 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj21 = treeMapTestDriver19.get((java.lang.Object) 100);
        experiment.util.Comparator comparator22 = treeMapTestDriver19.comparator();
        experiment.util.Comparator comparator23 = treeMapTestDriver19.comparator();
        boolean boolean24 = treeMapTestDriver19.isEmpty();
        treeMapTestDriver19.clear();
        experiment.util.Set set26 = treeMapTestDriver19.entrySet();
        experiment.util.Set set27 = treeMapTestDriver19.entrySet();
        experiment.util.Comparator comparator28 = treeMapTestDriver19.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = treeMapTestDriver0.put((java.lang.Object) treeMapTestDriver8, (java.lang.Object) treeMapTestDriver19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(comparator22);
        org.junit.Assert.assertNull(comparator23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNull(comparator28);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test250");
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
        java.lang.Object obj20 = treeMapTestDriver18.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj22 = treeMapTestDriver18.remove((java.lang.Object) (-1));
        experiment.util.Set set23 = treeMapTestDriver18.entrySet();
        treeMapTestDriver18.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver25 = new experiment.util.TreeMapTestDriver();
        experiment.util.Comparator comparator26 = treeMapTestDriver25.comparator();
        experiment.util.Collection collection27 = treeMapTestDriver25.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = treeMapTestDriver0.put((java.lang.Object) treeMapTestDriver18, (java.lang.Object) collection27);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
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
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(comparator26);
        org.junit.Assert.assertNotNull(collection27);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test251");
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
        experiment.util.Comparator comparator24 = treeMapTestDriver12.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver25 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj27 = treeMapTestDriver25.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj29 = treeMapTestDriver25.remove((java.lang.Object) 0.0f);
        boolean boolean30 = treeMapTestDriver25.isEmpty();
        experiment.util.Collection collection31 = treeMapTestDriver25.values();
        treeMapTestDriver25.clear();
        boolean boolean33 = treeMapTestDriver25.isEmpty();
        experiment.util.Set set34 = treeMapTestDriver25.entrySet();
        boolean boolean35 = treeMapTestDriver25.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver36 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj38 = treeMapTestDriver36.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj40 = treeMapTestDriver36.remove((java.lang.Object) 0.0f);
        boolean boolean41 = treeMapTestDriver36.isEmpty();
        experiment.util.Collection collection42 = treeMapTestDriver36.values();
        java.lang.Object obj44 = treeMapTestDriver36.get((java.lang.Object) 0);
        java.lang.Object obj45 = treeMapTestDriver12.put((java.lang.Object) boolean35, (java.lang.Object) treeMapTestDriver36);
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
        org.junit.Assert.assertNull(comparator24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj45);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test252");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        experiment.util.Set set5 = treeMapTestDriver0.keySet();
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) (byte) 1);
        int int8 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        experiment.util.Comparator comparator10 = treeMapTestDriver9.comparator();
        boolean boolean12 = treeMapTestDriver9.containsKey((java.lang.Object) 10);
        int int13 = treeMapTestDriver9.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test253");
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
        treeMapTestDriver0.clear();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test254");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) (-1));
        experiment.util.Set set5 = treeMapTestDriver0.entrySet();
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj9 = treeMapTestDriver7.get((java.lang.Object) 100);
        experiment.util.Collection collection10 = treeMapTestDriver7.values();
        experiment.util.Set set11 = treeMapTestDriver7.keySet();
        treeMapTestDriver7.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver13 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj15 = treeMapTestDriver13.get((java.lang.Object) 100);
        experiment.util.Comparator comparator16 = treeMapTestDriver13.comparator();
        boolean boolean18 = treeMapTestDriver13.containsKey((java.lang.Object) (-1));
        boolean boolean20 = treeMapTestDriver13.containsKey((java.lang.Object) 10.0d);
        treeMapTestDriver13.clear();
        experiment.util.Set set22 = treeMapTestDriver13.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = treeMapTestDriver0.put((java.lang.Object) treeMapTestDriver7, (java.lang.Object) treeMapTestDriver13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(comparator16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(set22);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test255");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        treeMapTestDriver0.clear();
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        treeMapTestDriver0.clear();
        experiment.util.Set set9 = treeMapTestDriver0.entrySet();
        int int10 = treeMapTestDriver0.size();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test256");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        treeMapTestDriver0.clear();
        boolean boolean7 = treeMapTestDriver0.isEmpty();
        treeMapTestDriver0.clear();
        int int9 = treeMapTestDriver0.size();
        boolean boolean10 = treeMapTestDriver0.isEmpty();
        experiment.util.Comparator comparator11 = treeMapTestDriver0.comparator();
        java.lang.Class<?> wildcardClass12 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test257");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        experiment.util.Set set5 = treeMapTestDriver0.keySet();
        treeMapTestDriver0.clear();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test258");
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
        experiment.util.Set set13 = treeMapTestDriver9.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver14 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set15 = treeMapTestDriver14.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = treeMapTestDriver9.get((java.lang.Object) set15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
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
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set15);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test259");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Comparator comparator1 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver3 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj5 = treeMapTestDriver3.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator6 = treeMapTestDriver3.comparator();
        boolean boolean8 = treeMapTestDriver3.containsKey((java.lang.Object) 1L);
        boolean boolean9 = treeMapTestDriver3.isEmpty();
        experiment.util.Collection collection10 = treeMapTestDriver3.values();
        experiment.util.Comparator comparator11 = treeMapTestDriver3.comparator();
        int int12 = treeMapTestDriver3.size();
        java.lang.Object obj13 = treeMapTestDriver0.put((java.lang.Object) (-1.0d), (java.lang.Object) treeMapTestDriver3);
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test260");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.Set set8 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver10 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj12 = treeMapTestDriver10.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj14 = treeMapTestDriver10.remove((java.lang.Object) 0.0f);
        java.lang.Object obj16 = treeMapTestDriver10.get((java.lang.Object) 1L);
        experiment.util.Set set17 = treeMapTestDriver10.keySet();
        experiment.util.Collection collection18 = treeMapTestDriver10.values();
        int int19 = treeMapTestDriver10.size();
        experiment.util.Set set20 = treeMapTestDriver10.keySet();
        boolean boolean21 = treeMapTestDriver10.isEmpty();
        treeMapTestDriver10.clear();
        java.lang.Object obj23 = treeMapTestDriver0.put((java.lang.Object) (short) 0, (java.lang.Object) treeMapTestDriver10);
        experiment.util.TreeMapTestDriver treeMapTestDriver24 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj26 = treeMapTestDriver24.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator27 = treeMapTestDriver24.comparator();
        boolean boolean29 = treeMapTestDriver24.containsKey((java.lang.Object) 1L);
        boolean boolean30 = treeMapTestDriver24.isEmpty();
        experiment.util.Collection collection31 = treeMapTestDriver24.values();
        experiment.util.Comparator comparator32 = treeMapTestDriver24.comparator();
        int int33 = treeMapTestDriver24.size();
        boolean boolean34 = treeMapTestDriver10.containsKey((java.lang.Object) int33);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(comparator27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNull(comparator32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test261");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.keySet();
        boolean boolean2 = treeMapTestDriver0.isEmpty();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test262");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        experiment.util.Set set5 = treeMapTestDriver0.keySet();
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) (byte) 1);
        experiment.util.Set set8 = treeMapTestDriver0.entrySet();
        experiment.util.Set set9 = treeMapTestDriver0.keySet();
        experiment.util.Set set10 = treeMapTestDriver0.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver11 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj13 = treeMapTestDriver11.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator14 = treeMapTestDriver11.comparator();
        experiment.util.Set set15 = treeMapTestDriver11.entrySet();
        experiment.util.Set set16 = treeMapTestDriver11.keySet();
        java.lang.Object obj18 = treeMapTestDriver11.remove((java.lang.Object) (byte) 1);
        int int19 = treeMapTestDriver11.size();
        int int20 = treeMapTestDriver11.size();
        boolean boolean21 = treeMapTestDriver11.isEmpty();
        experiment.util.Collection collection22 = treeMapTestDriver11.values();
        experiment.util.Collection collection23 = treeMapTestDriver11.values();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(comparator14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(collection23);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test263");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        treeMapTestDriver0.clear();
        experiment.util.Set set7 = treeMapTestDriver0.entrySet();
        experiment.util.Set set8 = treeMapTestDriver0.keySet();
        int int9 = treeMapTestDriver0.size();
        experiment.util.Set set10 = treeMapTestDriver0.keySet();
        experiment.util.Comparator comparator11 = treeMapTestDriver0.comparator();
        experiment.util.Set set12 = treeMapTestDriver0.keySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertNotNull(set12);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test264");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) 100);
        boolean boolean8 = treeMapTestDriver0.isEmpty();
        experiment.util.Comparator comparator9 = treeMapTestDriver0.comparator();
        boolean boolean10 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver11 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj13 = treeMapTestDriver11.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator14 = treeMapTestDriver11.comparator();
        treeMapTestDriver11.clear();
        experiment.util.Set set16 = treeMapTestDriver11.entrySet();
        experiment.util.Comparator comparator17 = treeMapTestDriver11.comparator();
        experiment.util.Set set18 = treeMapTestDriver11.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = treeMapTestDriver0.get((java.lang.Object) set18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(comparator14);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(comparator17);
        org.junit.Assert.assertNotNull(set18);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test265");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) 100);
        experiment.util.Set set8 = treeMapTestDriver0.entrySet();
        boolean boolean9 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver10 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj12 = treeMapTestDriver10.get((java.lang.Object) 100);
        experiment.util.Set set13 = treeMapTestDriver10.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver14 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj16 = treeMapTestDriver14.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator17 = treeMapTestDriver14.comparator();
        experiment.util.Set set18 = treeMapTestDriver14.entrySet();
        experiment.util.Set set19 = treeMapTestDriver14.keySet();
        java.lang.Object obj21 = treeMapTestDriver14.remove((java.lang.Object) (byte) 1);
        experiment.util.TreeMapTestDriver treeMapTestDriver22 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj24 = treeMapTestDriver22.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj26 = treeMapTestDriver22.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection27 = treeMapTestDriver22.values();
        experiment.util.Collection collection28 = treeMapTestDriver22.values();
        experiment.util.Set set29 = treeMapTestDriver22.keySet();
        experiment.util.Comparator comparator30 = treeMapTestDriver22.comparator();
        boolean boolean31 = treeMapTestDriver22.isEmpty();
        java.lang.Object obj32 = treeMapTestDriver10.put((java.lang.Object) (byte) 1, (java.lang.Object) treeMapTestDriver22);
        experiment.util.Set set33 = treeMapTestDriver22.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = treeMapTestDriver0.get((java.lang.Object) set33);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(comparator17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(comparator30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(set33);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test266");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        int int6 = treeMapTestDriver0.size();
        int int7 = treeMapTestDriver0.size();
        experiment.util.Set set8 = treeMapTestDriver0.keySet();
        int int9 = treeMapTestDriver0.size();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test267");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        experiment.util.Comparator comparator6 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj9 = treeMapTestDriver7.get((java.lang.Object) 100);
        experiment.util.Collection collection10 = treeMapTestDriver7.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver11 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj13 = treeMapTestDriver11.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj15 = treeMapTestDriver11.remove((java.lang.Object) 0.0f);
        boolean boolean16 = treeMapTestDriver11.isEmpty();
        experiment.util.Collection collection17 = treeMapTestDriver11.values();
        experiment.util.Set set18 = treeMapTestDriver11.keySet();
        treeMapTestDriver11.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = treeMapTestDriver0.put((java.lang.Object) treeMapTestDriver7, (java.lang.Object) treeMapTestDriver11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set18);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test268");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        int int7 = treeMapTestDriver0.size();
        experiment.util.Collection collection8 = treeMapTestDriver0.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj11 = treeMapTestDriver9.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj13 = treeMapTestDriver9.remove((java.lang.Object) 0.0f);
        boolean boolean14 = treeMapTestDriver9.isEmpty();
        experiment.util.Collection collection15 = treeMapTestDriver9.values();
        java.lang.Class<?> wildcardClass16 = treeMapTestDriver9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test269");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.Comparator comparator8 = treeMapTestDriver0.comparator();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(comparator8);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test270");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        int int5 = treeMapTestDriver0.size();
        experiment.util.Set set6 = treeMapTestDriver0.keySet();
        java.lang.Class<?> wildcardClass7 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test271");
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
        boolean boolean18 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection19 = treeMapTestDriver0.values();
        treeMapTestDriver0.clear();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(comparator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(collection19);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test272");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        treeMapTestDriver0.clear();
        experiment.util.Set set6 = treeMapTestDriver0.entrySet();
        int int7 = treeMapTestDriver0.size();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test273");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        experiment.util.Set set6 = treeMapTestDriver0.keySet();
        experiment.util.Collection collection7 = treeMapTestDriver0.values();
        java.lang.Class<?> wildcardClass8 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test274");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 100);
        java.lang.Object obj8 = treeMapTestDriver0.remove((java.lang.Object) 10.0f);
        experiment.util.Comparator comparator9 = treeMapTestDriver0.comparator();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(comparator9);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test275");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver8 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj10 = treeMapTestDriver8.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj12 = treeMapTestDriver8.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection13 = treeMapTestDriver8.values();
        experiment.util.Collection collection14 = treeMapTestDriver8.values();
        experiment.util.Set set15 = treeMapTestDriver8.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver17 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj18 = treeMapTestDriver8.put((java.lang.Object) (byte) -1, (java.lang.Object) treeMapTestDriver17);
        experiment.util.Comparator comparator19 = treeMapTestDriver17.comparator();
        treeMapTestDriver17.clear();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(comparator19);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test276");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) (-1));
        treeMapTestDriver0.clear();
        experiment.util.Comparator comparator6 = treeMapTestDriver0.comparator();
        experiment.util.Collection collection7 = treeMapTestDriver0.values();
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
            boolean boolean24 = treeMapTestDriver0.containsKey((java.lang.Object) collection23);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertNotNull(collection7);
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
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test277");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Comparator comparator1 = treeMapTestDriver0.comparator();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver3 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj5 = treeMapTestDriver3.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj7 = treeMapTestDriver3.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection8 = treeMapTestDriver3.values();
        treeMapTestDriver3.clear();
        experiment.util.Comparator comparator10 = treeMapTestDriver3.comparator();
        experiment.util.Set set11 = treeMapTestDriver3.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertNotNull(set11);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test278");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        treeMapTestDriver0.clear();
        experiment.util.Comparator comparator7 = treeMapTestDriver0.comparator();
        experiment.util.Set set8 = treeMapTestDriver0.keySet();
        experiment.util.Set set9 = treeMapTestDriver0.entrySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(comparator7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test279");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        int int6 = treeMapTestDriver0.size();
        int int7 = treeMapTestDriver0.size();
        experiment.util.Set set8 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj11 = treeMapTestDriver9.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator12 = treeMapTestDriver9.comparator();
        boolean boolean14 = treeMapTestDriver9.containsKey((java.lang.Object) 1L);
        boolean boolean15 = treeMapTestDriver9.isEmpty();
        int int16 = treeMapTestDriver9.size();
        experiment.util.Collection collection17 = treeMapTestDriver9.values();
        java.lang.Object obj18 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = treeMapTestDriver0.put((java.lang.Object) treeMapTestDriver9, obj18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(collection17);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test280");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        treeMapTestDriver0.clear();
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        treeMapTestDriver0.clear();
        experiment.util.Set set9 = treeMapTestDriver0.entrySet();
        experiment.util.Set set10 = treeMapTestDriver0.keySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test281");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) (-1));
        experiment.util.Set set5 = treeMapTestDriver0.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver6 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj8 = treeMapTestDriver6.get((java.lang.Object) 100);
        experiment.util.Comparator comparator9 = treeMapTestDriver6.comparator();
        int int10 = treeMapTestDriver6.size();
        treeMapTestDriver6.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test282");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        boolean boolean7 = treeMapTestDriver0.containsKey((java.lang.Object) (-1.0d));
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test283");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        treeMapTestDriver0.clear();
        experiment.util.Set set5 = treeMapTestDriver0.entrySet();
        experiment.util.Comparator comparator6 = treeMapTestDriver0.comparator();
        int int7 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver8 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj10 = treeMapTestDriver8.get((java.lang.Object) 100);
        experiment.util.Comparator comparator11 = treeMapTestDriver8.comparator();
        experiment.util.Comparator comparator12 = treeMapTestDriver8.comparator();
        boolean boolean13 = treeMapTestDriver8.isEmpty();
        treeMapTestDriver8.clear();
        experiment.util.Set set15 = treeMapTestDriver8.entrySet();
        experiment.util.Set set16 = treeMapTestDriver8.keySet();
        experiment.util.Collection collection17 = treeMapTestDriver8.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = treeMapTestDriver0.remove((java.lang.Object) collection17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(collection17);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test284");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver5 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj7 = treeMapTestDriver5.get((java.lang.Object) 100);
        experiment.util.Set set8 = treeMapTestDriver5.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test285");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) (-1));
        experiment.util.Set set5 = treeMapTestDriver0.entrySet();
        treeMapTestDriver0.clear();
        treeMapTestDriver0.clear();
        int int8 = treeMapTestDriver0.size();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test286");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.Set set8 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver10 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj12 = treeMapTestDriver10.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj14 = treeMapTestDriver10.remove((java.lang.Object) 0.0f);
        java.lang.Object obj16 = treeMapTestDriver10.get((java.lang.Object) 1L);
        experiment.util.Set set17 = treeMapTestDriver10.keySet();
        experiment.util.Collection collection18 = treeMapTestDriver10.values();
        int int19 = treeMapTestDriver10.size();
        experiment.util.Set set20 = treeMapTestDriver10.keySet();
        boolean boolean21 = treeMapTestDriver10.isEmpty();
        treeMapTestDriver10.clear();
        java.lang.Object obj23 = treeMapTestDriver0.put((java.lang.Object) (short) 0, (java.lang.Object) treeMapTestDriver10);
        java.lang.Class<?> wildcardClass24 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test287");
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
        experiment.util.Set set13 = treeMapTestDriver9.entrySet();
        treeMapTestDriver9.clear();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertNotNull(set13);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test288");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        experiment.util.Set set5 = treeMapTestDriver0.keySet();
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) true);
        experiment.util.Set set8 = treeMapTestDriver0.entrySet();
        experiment.util.Collection collection9 = treeMapTestDriver0.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver10 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj12 = treeMapTestDriver10.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj14 = treeMapTestDriver10.remove((java.lang.Object) 0.0f);
        boolean boolean15 = treeMapTestDriver10.isEmpty();
        experiment.util.Comparator comparator16 = treeMapTestDriver10.comparator();
        boolean boolean18 = treeMapTestDriver10.containsKey((java.lang.Object) 1.0f);
        experiment.util.Set set19 = treeMapTestDriver10.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = treeMapTestDriver0.put((java.lang.Object) set19, (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(comparator16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(set19);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test289");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        int int6 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj9 = treeMapTestDriver7.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj11 = treeMapTestDriver7.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection12 = treeMapTestDriver7.values();
        experiment.util.Collection collection13 = treeMapTestDriver7.values();
        experiment.util.Set set14 = treeMapTestDriver7.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver16 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj17 = treeMapTestDriver7.put((java.lang.Object) (byte) -1, (java.lang.Object) treeMapTestDriver16);
        int int18 = treeMapTestDriver16.size();
        int int19 = treeMapTestDriver16.size();
        int int20 = treeMapTestDriver16.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver21 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj23 = treeMapTestDriver21.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator24 = treeMapTestDriver21.comparator();
        boolean boolean26 = treeMapTestDriver21.containsKey((java.lang.Object) 1L);
        boolean boolean27 = treeMapTestDriver21.isEmpty();
        experiment.util.Comparator comparator28 = treeMapTestDriver21.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver29 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj31 = treeMapTestDriver29.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj33 = treeMapTestDriver29.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection34 = treeMapTestDriver29.values();
        experiment.util.Collection collection35 = treeMapTestDriver29.values();
        experiment.util.Set set36 = treeMapTestDriver29.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver38 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj39 = treeMapTestDriver29.put((java.lang.Object) (byte) -1, (java.lang.Object) treeMapTestDriver38);
        int int40 = treeMapTestDriver38.size();
        int int41 = treeMapTestDriver38.size();
        boolean boolean42 = treeMapTestDriver21.containsKey((java.lang.Object) int41);
        java.lang.Object obj43 = treeMapTestDriver0.put((java.lang.Object) int20, (java.lang.Object) int41);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(comparator24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(comparator28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(obj43);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test290");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Comparator comparator1 = treeMapTestDriver0.comparator();
        experiment.util.Collection collection2 = treeMapTestDriver0.values();
        treeMapTestDriver0.clear();
        experiment.util.Collection collection4 = treeMapTestDriver0.values();
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection4);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test291");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) 100);
        experiment.util.Comparator comparator8 = treeMapTestDriver0.comparator();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(comparator8);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test292");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        experiment.util.Comparator comparator6 = treeMapTestDriver0.comparator();
        boolean boolean7 = treeMapTestDriver0.isEmpty();
        boolean boolean8 = treeMapTestDriver0.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test293");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean1 = treeMapTestDriver0.isEmpty();
        boolean boolean2 = treeMapTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test294");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 1L);
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        treeMapTestDriver0.clear();
        treeMapTestDriver0.clear();
        java.lang.Class<?> wildcardClass10 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test295");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Comparator comparator1 = treeMapTestDriver0.comparator();
        boolean boolean3 = treeMapTestDriver0.containsKey((java.lang.Object) 10);
        int int4 = treeMapTestDriver0.size();
        int int5 = treeMapTestDriver0.size();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj9 = treeMapTestDriver7.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator10 = treeMapTestDriver7.comparator();
        experiment.util.Set set11 = treeMapTestDriver7.entrySet();
        experiment.util.Set set12 = treeMapTestDriver7.keySet();
        java.lang.Object obj14 = treeMapTestDriver7.remove((java.lang.Object) (byte) 1);
        int int15 = treeMapTestDriver7.size();
        int int16 = treeMapTestDriver7.size();
        boolean boolean17 = treeMapTestDriver7.isEmpty();
        experiment.util.Collection collection18 = treeMapTestDriver7.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = treeMapTestDriver0.get((java.lang.Object) collection18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test296");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        experiment.util.Set set5 = treeMapTestDriver0.keySet();
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) (byte) 1);
        int int8 = treeMapTestDriver0.size();
        experiment.util.Collection collection9 = treeMapTestDriver0.values();
        java.lang.Class<?> wildcardClass10 = collection9.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test297");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        experiment.util.Comparator comparator6 = treeMapTestDriver0.comparator();
        boolean boolean8 = treeMapTestDriver0.containsKey((java.lang.Object) 1.0f);
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj11 = treeMapTestDriver9.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj13 = treeMapTestDriver9.remove((java.lang.Object) (-1));
        treeMapTestDriver9.clear();
        boolean boolean15 = treeMapTestDriver9.isEmpty();
        java.lang.Object obj16 = treeMapTestDriver0.get((java.lang.Object) boolean15);
        experiment.util.Set set17 = treeMapTestDriver0.entrySet();
        experiment.util.Set set18 = treeMapTestDriver0.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver19 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj21 = treeMapTestDriver19.get((java.lang.Object) 100);
        experiment.util.Comparator comparator22 = treeMapTestDriver19.comparator();
        boolean boolean24 = treeMapTestDriver19.containsKey((java.lang.Object) (-1));
        boolean boolean26 = treeMapTestDriver19.containsKey((java.lang.Object) 10.0d);
        treeMapTestDriver19.clear();
        experiment.util.Set set28 = treeMapTestDriver19.entrySet();
        experiment.util.Set set29 = treeMapTestDriver19.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver31 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj33 = treeMapTestDriver31.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj35 = treeMapTestDriver31.remove((java.lang.Object) 0.0f);
        boolean boolean36 = treeMapTestDriver31.isEmpty();
        experiment.util.Collection collection37 = treeMapTestDriver31.values();
        treeMapTestDriver31.clear();
        boolean boolean39 = treeMapTestDriver31.isEmpty();
        java.lang.Object obj40 = treeMapTestDriver19.put((java.lang.Object) 100.0f, (java.lang.Object) boolean39);
        experiment.util.Collection collection41 = treeMapTestDriver19.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj42 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(comparator22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(collection41);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test298");
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
        experiment.util.Set set19 = treeMapTestDriver0.keySet();
        boolean boolean20 = treeMapTestDriver0.isEmpty();
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
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test299");
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
        treeMapTestDriver9.clear();
        int int16 = treeMapTestDriver9.size();
        experiment.util.Collection collection17 = treeMapTestDriver9.values();
        java.lang.Class<?> wildcardClass18 = collection17.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test300");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 100);
        treeMapTestDriver0.clear();
        experiment.util.Comparator comparator8 = treeMapTestDriver0.comparator();
        experiment.util.Collection collection9 = treeMapTestDriver0.values();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(comparator8);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test301");
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
        experiment.util.TreeMapTestDriver treeMapTestDriver13 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj15 = treeMapTestDriver13.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj17 = treeMapTestDriver13.remove((java.lang.Object) 0.0f);
        boolean boolean18 = treeMapTestDriver13.isEmpty();
        experiment.util.Comparator comparator19 = treeMapTestDriver13.comparator();
        boolean boolean21 = treeMapTestDriver13.containsKey((java.lang.Object) 1.0f);
        experiment.util.Collection collection22 = treeMapTestDriver13.values();
        experiment.util.Set set23 = treeMapTestDriver13.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = treeMapTestDriver0.remove((java.lang.Object) set23);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
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
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(comparator19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(set23);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test302");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 100);
        java.lang.Object obj8 = treeMapTestDriver0.remove((java.lang.Object) 10.0f);
        experiment.util.Collection collection9 = treeMapTestDriver0.values();
        experiment.util.Collection collection10 = treeMapTestDriver0.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver11 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj13 = treeMapTestDriver11.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator14 = treeMapTestDriver11.comparator();
        boolean boolean16 = treeMapTestDriver11.containsKey((java.lang.Object) 1L);
        boolean boolean17 = treeMapTestDriver11.isEmpty();
        experiment.util.Set set18 = treeMapTestDriver11.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(comparator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(set18);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test303");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        experiment.util.Set set5 = treeMapTestDriver0.keySet();
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) (byte) 1);
        int int8 = treeMapTestDriver0.size();
        int int9 = treeMapTestDriver0.size();
        boolean boolean10 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection11 = treeMapTestDriver0.values();
        treeMapTestDriver0.clear();
        treeMapTestDriver0.clear();
        boolean boolean14 = treeMapTestDriver0.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test304");
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
        experiment.util.Set set19 = treeMapTestDriver0.keySet();
        experiment.util.Set set20 = treeMapTestDriver0.entrySet();
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
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(set20);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test305");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        treeMapTestDriver0.clear();
        boolean boolean7 = treeMapTestDriver0.isEmpty();
        treeMapTestDriver0.clear();
        treeMapTestDriver0.clear();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test306");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        treeMapTestDriver0.clear();
        experiment.util.Set set5 = treeMapTestDriver0.entrySet();
        experiment.util.Comparator comparator6 = treeMapTestDriver0.comparator();
        int int7 = treeMapTestDriver0.size();
        boolean boolean8 = treeMapTestDriver0.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test307");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        treeMapTestDriver0.clear();
        boolean boolean8 = treeMapTestDriver0.isEmpty();
        experiment.util.Set set9 = treeMapTestDriver0.keySet();
        experiment.util.Set set10 = treeMapTestDriver0.keySet();
        treeMapTestDriver0.clear();
        java.lang.Class<?> wildcardClass12 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test308");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) 100);
        boolean boolean8 = treeMapTestDriver0.isEmpty();
        experiment.util.Set set9 = treeMapTestDriver0.keySet();
        boolean boolean10 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver11 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj13 = treeMapTestDriver11.get((java.lang.Object) 100);
        experiment.util.Set set14 = treeMapTestDriver11.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver16 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj18 = treeMapTestDriver16.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj20 = treeMapTestDriver16.remove((java.lang.Object) 0.0f);
        java.lang.Object obj22 = treeMapTestDriver16.get((java.lang.Object) 1L);
        experiment.util.Set set23 = treeMapTestDriver16.keySet();
        java.lang.Object obj24 = treeMapTestDriver11.put((java.lang.Object) 0L, (java.lang.Object) set23);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = treeMapTestDriver0.containsKey((java.lang.Object) set23);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test309");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Comparator comparator1 = treeMapTestDriver0.comparator();
        boolean boolean3 = treeMapTestDriver0.containsKey((java.lang.Object) 10);
        int int4 = treeMapTestDriver0.size();
        experiment.util.Set set5 = treeMapTestDriver0.keySet();
        int int6 = treeMapTestDriver0.size();
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test310");
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
        experiment.util.Comparator comparator12 = treeMapTestDriver0.comparator();
        experiment.util.Collection collection13 = treeMapTestDriver0.values();
        int int14 = treeMapTestDriver0.size();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(comparator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test311");
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
        treeMapTestDriver9.clear();
        int int16 = treeMapTestDriver9.size();
        experiment.util.Set set17 = treeMapTestDriver9.entrySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(set17);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test312");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj10 = treeMapTestDriver0.put((java.lang.Object) (byte) -1, (java.lang.Object) treeMapTestDriver9);
        experiment.util.Set set11 = treeMapTestDriver0.keySet();
        treeMapTestDriver0.clear();
        experiment.util.Collection collection13 = treeMapTestDriver0.values();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test313");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        treeMapTestDriver0.clear();
        experiment.util.Comparator comparator7 = treeMapTestDriver0.comparator();
        int int8 = treeMapTestDriver0.size();
        int int9 = treeMapTestDriver0.size();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(comparator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test314");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        treeMapTestDriver0.clear();
        int int4 = treeMapTestDriver0.size();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass6 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test315");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 100);
        treeMapTestDriver0.clear();
        experiment.util.Comparator comparator8 = treeMapTestDriver0.comparator();
        boolean boolean9 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection10 = treeMapTestDriver0.values();
        boolean boolean11 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver12 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj14 = treeMapTestDriver12.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj16 = treeMapTestDriver12.remove((java.lang.Object) 0.0f);
        java.lang.Object obj18 = treeMapTestDriver12.get((java.lang.Object) 1L);
        experiment.util.Set set19 = treeMapTestDriver12.keySet();
        treeMapTestDriver12.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(comparator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set19);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test316");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 1L);
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.Set set8 = treeMapTestDriver0.entrySet();
        java.lang.Object obj10 = treeMapTestDriver0.get((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass11 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test317");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver6 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj8 = treeMapTestDriver6.get((java.lang.Object) 100);
        experiment.util.Comparator comparator9 = treeMapTestDriver6.comparator();
        experiment.util.Comparator comparator10 = treeMapTestDriver6.comparator();
        boolean boolean11 = treeMapTestDriver6.isEmpty();
        treeMapTestDriver6.clear();
        boolean boolean13 = treeMapTestDriver6.isEmpty();
        treeMapTestDriver6.clear();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test318");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        experiment.util.Set set5 = treeMapTestDriver0.keySet();
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) true);
        experiment.util.Set set8 = treeMapTestDriver0.entrySet();
        experiment.util.Collection collection9 = treeMapTestDriver0.values();
        experiment.util.Set set10 = treeMapTestDriver0.entrySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(set10);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test319");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) 100);
        boolean boolean8 = treeMapTestDriver0.isEmpty();
        experiment.util.Comparator comparator9 = treeMapTestDriver0.comparator();
        experiment.util.Collection collection10 = treeMapTestDriver0.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver11 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj13 = treeMapTestDriver11.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj15 = treeMapTestDriver11.remove((java.lang.Object) (-1));
        treeMapTestDriver11.clear();
        boolean boolean17 = treeMapTestDriver11.isEmpty();
        experiment.util.Comparator comparator18 = treeMapTestDriver11.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = treeMapTestDriver0.remove((java.lang.Object) comparator18);
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
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(comparator18);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test320");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver6 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj8 = treeMapTestDriver6.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = treeMapTestDriver6.remove((java.lang.Object) (-1));
        treeMapTestDriver6.clear();
        treeMapTestDriver6.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test321");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        int int4 = treeMapTestDriver0.size();
        treeMapTestDriver0.clear();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        treeMapTestDriver0.clear();
        java.lang.Class<?> wildcardClass8 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test322");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator5 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver6 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj8 = treeMapTestDriver6.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator9 = treeMapTestDriver6.comparator();
        experiment.util.Set set10 = treeMapTestDriver6.entrySet();
        experiment.util.Set set11 = treeMapTestDriver6.keySet();
        java.lang.Object obj13 = treeMapTestDriver6.remove((java.lang.Object) (byte) 1);
        int int14 = treeMapTestDriver6.size();
        java.lang.Object obj15 = treeMapTestDriver0.remove((java.lang.Object) int14);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertNull(comparator5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test323");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) (-1));
        boolean boolean7 = treeMapTestDriver0.containsKey((java.lang.Object) 10.0d);
        treeMapTestDriver0.clear();
        experiment.util.Set set9 = treeMapTestDriver0.entrySet();
        experiment.util.Set set10 = treeMapTestDriver0.entrySet();
        int int11 = treeMapTestDriver0.size();
        experiment.util.Collection collection12 = treeMapTestDriver0.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver13 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj15 = treeMapTestDriver13.get((java.lang.Object) 100);
        experiment.util.Comparator comparator16 = treeMapTestDriver13.comparator();
        boolean boolean18 = treeMapTestDriver13.containsKey((java.lang.Object) (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(comparator16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test324");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        boolean boolean8 = treeMapTestDriver0.isEmpty();
        experiment.util.Set set9 = treeMapTestDriver0.entrySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test325");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 1L);
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.Collection collection8 = treeMapTestDriver0.values();
        experiment.util.Comparator comparator9 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator10 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator11 = treeMapTestDriver0.comparator();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertNull(comparator11);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test326");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 1L);
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.Collection collection8 = treeMapTestDriver0.values();
        experiment.util.Comparator comparator9 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver10 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj12 = treeMapTestDriver10.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj14 = treeMapTestDriver10.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection15 = treeMapTestDriver10.values();
        experiment.util.Collection collection16 = treeMapTestDriver10.values();
        experiment.util.Set set17 = treeMapTestDriver10.keySet();
        experiment.util.Comparator comparator18 = treeMapTestDriver10.comparator();
        boolean boolean19 = treeMapTestDriver10.isEmpty();
        experiment.util.Set set20 = treeMapTestDriver10.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(comparator18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(set20);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test327");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) (-1));
        boolean boolean7 = treeMapTestDriver0.containsKey((java.lang.Object) 10.0d);
        treeMapTestDriver0.clear();
        boolean boolean9 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection10 = treeMapTestDriver0.values();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test328");
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
        boolean boolean12 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj14 = treeMapTestDriver0.get((java.lang.Object) 100.0f);
        experiment.util.TreeMapTestDriver treeMapTestDriver15 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj17 = treeMapTestDriver15.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj19 = treeMapTestDriver15.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection20 = treeMapTestDriver15.values();
        experiment.util.Collection collection21 = treeMapTestDriver15.values();
        experiment.util.Set set22 = treeMapTestDriver15.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver24 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj25 = treeMapTestDriver15.put((java.lang.Object) (byte) -1, (java.lang.Object) treeMapTestDriver24);
        experiment.util.Set set26 = treeMapTestDriver24.keySet();
        experiment.util.Comparator comparator27 = treeMapTestDriver24.comparator();
        experiment.util.Set set28 = treeMapTestDriver24.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver24);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNull(comparator27);
        org.junit.Assert.assertNotNull(set28);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test329");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        experiment.util.Set set7 = treeMapTestDriver0.entrySet();
        boolean boolean8 = treeMapTestDriver0.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test330");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 100);
        treeMapTestDriver0.clear();
        experiment.util.Collection collection8 = treeMapTestDriver0.values();
        experiment.util.Comparator comparator9 = treeMapTestDriver0.comparator();
        experiment.util.Set set10 = treeMapTestDriver0.entrySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertNotNull(set10);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test331");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        int int6 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj9 = treeMapTestDriver7.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj11 = treeMapTestDriver7.remove((java.lang.Object) 0.0f);
        java.lang.Object obj13 = treeMapTestDriver7.get((java.lang.Object) 1L);
        experiment.util.Set set14 = treeMapTestDriver7.keySet();
        treeMapTestDriver7.clear();
        experiment.util.Set set16 = treeMapTestDriver7.keySet();
        experiment.util.Set set17 = treeMapTestDriver7.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = treeMapTestDriver0.get((java.lang.Object) set17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(set17);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test332");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) (-1));
        experiment.util.Set set5 = treeMapTestDriver0.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver6 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj8 = treeMapTestDriver6.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = treeMapTestDriver6.remove((java.lang.Object) 0.0f);
        java.lang.Object obj12 = treeMapTestDriver6.get((java.lang.Object) 1L);
        experiment.util.Set set13 = treeMapTestDriver6.keySet();
        experiment.util.Set set14 = treeMapTestDriver6.entrySet();
        experiment.util.Collection collection15 = treeMapTestDriver6.values();
        experiment.util.Collection collection16 = treeMapTestDriver6.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver17 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj19 = treeMapTestDriver17.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj21 = treeMapTestDriver17.remove((java.lang.Object) 0.0f);
        boolean boolean22 = treeMapTestDriver17.isEmpty();
        experiment.util.Collection collection23 = treeMapTestDriver17.values();
        experiment.util.Set set24 = treeMapTestDriver17.keySet();
        experiment.util.Set set25 = treeMapTestDriver17.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = treeMapTestDriver0.put((java.lang.Object) treeMapTestDriver6, (java.lang.Object) set25);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(set25);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test333");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) (-1));
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        experiment.util.Comparator comparator6 = treeMapTestDriver0.comparator();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(comparator6);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test334");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 1L);
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.Collection collection8 = treeMapTestDriver0.values();
        int int9 = treeMapTestDriver0.size();
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver11 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj13 = treeMapTestDriver11.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator14 = treeMapTestDriver11.comparator();
        treeMapTestDriver11.clear();
        experiment.util.Set set16 = treeMapTestDriver11.entrySet();
        experiment.util.Comparator comparator17 = treeMapTestDriver11.comparator();
        int int18 = treeMapTestDriver11.size();
        java.lang.Object obj19 = treeMapTestDriver0.get((java.lang.Object) int18);
        experiment.util.TreeMapTestDriver treeMapTestDriver20 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj22 = treeMapTestDriver20.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator23 = treeMapTestDriver20.comparator();
        experiment.util.Set set24 = treeMapTestDriver20.entrySet();
        experiment.util.Set set25 = treeMapTestDriver20.keySet();
        java.lang.Object obj27 = treeMapTestDriver20.remove((java.lang.Object) (byte) 1);
        experiment.util.Set set28 = treeMapTestDriver20.entrySet();
        experiment.util.Set set29 = treeMapTestDriver20.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver30 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj32 = treeMapTestDriver30.get((java.lang.Object) 100);
        experiment.util.Set set33 = treeMapTestDriver30.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver34 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj36 = treeMapTestDriver34.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator37 = treeMapTestDriver34.comparator();
        experiment.util.Set set38 = treeMapTestDriver34.entrySet();
        experiment.util.Set set39 = treeMapTestDriver34.keySet();
        java.lang.Object obj41 = treeMapTestDriver34.remove((java.lang.Object) (byte) 1);
        experiment.util.TreeMapTestDriver treeMapTestDriver42 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj44 = treeMapTestDriver42.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj46 = treeMapTestDriver42.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection47 = treeMapTestDriver42.values();
        experiment.util.Collection collection48 = treeMapTestDriver42.values();
        experiment.util.Set set49 = treeMapTestDriver42.keySet();
        experiment.util.Comparator comparator50 = treeMapTestDriver42.comparator();
        boolean boolean51 = treeMapTestDriver42.isEmpty();
        java.lang.Object obj52 = treeMapTestDriver30.put((java.lang.Object) (byte) 1, (java.lang.Object) treeMapTestDriver42);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj53 = treeMapTestDriver0.put((java.lang.Object) set29, obj52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(comparator14);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(comparator17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(comparator23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(comparator37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNull(comparator50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNull(obj52);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test335");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) (-1));
        boolean boolean7 = treeMapTestDriver0.containsKey((java.lang.Object) 10.0d);
        treeMapTestDriver0.clear();
        experiment.util.Set set9 = treeMapTestDriver0.entrySet();
        experiment.util.Set set10 = treeMapTestDriver0.entrySet();
        int int11 = treeMapTestDriver0.size();
        experiment.util.Set set12 = treeMapTestDriver0.entrySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(set12);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test336");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Comparator comparator1 = treeMapTestDriver0.comparator();
        boolean boolean3 = treeMapTestDriver0.containsKey((java.lang.Object) 10);
        int int4 = treeMapTestDriver0.size();
        experiment.util.Set set5 = treeMapTestDriver0.keySet();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = treeMapTestDriver0.remove(obj7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test337");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver5 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj7 = treeMapTestDriver5.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator8 = treeMapTestDriver5.comparator();
        experiment.util.Set set9 = treeMapTestDriver5.entrySet();
        experiment.util.Set set10 = treeMapTestDriver5.keySet();
        java.lang.Object obj12 = treeMapTestDriver5.remove((java.lang.Object) (byte) 1);
        int int13 = treeMapTestDriver5.size();
        int int14 = treeMapTestDriver5.size();
        boolean boolean15 = treeMapTestDriver5.isEmpty();
        treeMapTestDriver5.clear();
        boolean boolean17 = treeMapTestDriver5.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver18 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj20 = treeMapTestDriver18.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj22 = treeMapTestDriver18.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection23 = treeMapTestDriver18.values();
        java.lang.Object obj24 = treeMapTestDriver0.put((java.lang.Object) boolean17, (java.lang.Object) treeMapTestDriver18);
        experiment.util.TreeMapTestDriver treeMapTestDriver25 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj27 = treeMapTestDriver25.get((java.lang.Object) 100);
        experiment.util.Comparator comparator28 = treeMapTestDriver25.comparator();
        int int29 = treeMapTestDriver25.size();
        boolean boolean30 = treeMapTestDriver25.isEmpty();
        java.lang.Object obj31 = treeMapTestDriver18.get((java.lang.Object) boolean30);
        experiment.util.TreeMapTestDriver treeMapTestDriver32 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj34 = treeMapTestDriver32.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj36 = treeMapTestDriver32.remove((java.lang.Object) 0.0f);
        boolean boolean37 = treeMapTestDriver32.isEmpty();
        experiment.util.Collection collection38 = treeMapTestDriver32.values();
        experiment.util.Set set39 = treeMapTestDriver32.keySet();
        int int40 = treeMapTestDriver32.size();
        treeMapTestDriver32.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj42 = treeMapTestDriver18.get((java.lang.Object) treeMapTestDriver32);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(comparator8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(comparator28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test338");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver5 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj7 = treeMapTestDriver5.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator8 = treeMapTestDriver5.comparator();
        experiment.util.Set set9 = treeMapTestDriver5.entrySet();
        experiment.util.Set set10 = treeMapTestDriver5.keySet();
        java.lang.Object obj12 = treeMapTestDriver5.remove((java.lang.Object) (byte) 1);
        int int13 = treeMapTestDriver5.size();
        int int14 = treeMapTestDriver5.size();
        boolean boolean15 = treeMapTestDriver5.isEmpty();
        treeMapTestDriver5.clear();
        boolean boolean17 = treeMapTestDriver5.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver18 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj20 = treeMapTestDriver18.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj22 = treeMapTestDriver18.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection23 = treeMapTestDriver18.values();
        java.lang.Object obj24 = treeMapTestDriver0.put((java.lang.Object) boolean17, (java.lang.Object) treeMapTestDriver18);
        experiment.util.TreeMapTestDriver treeMapTestDriver25 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj27 = treeMapTestDriver25.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator28 = treeMapTestDriver25.comparator();
        experiment.util.Set set29 = treeMapTestDriver25.entrySet();
        experiment.util.Set set30 = treeMapTestDriver25.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = treeMapTestDriver18.get((java.lang.Object) set30);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(comparator8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(comparator28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(set30);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test339");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        int int8 = treeMapTestDriver0.size();
        treeMapTestDriver0.clear();
        experiment.util.Comparator comparator10 = treeMapTestDriver0.comparator();
        experiment.util.Set set11 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver12 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj14 = treeMapTestDriver12.get((java.lang.Object) 100);
        experiment.util.Set set15 = treeMapTestDriver12.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver16 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj18 = treeMapTestDriver16.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator19 = treeMapTestDriver16.comparator();
        experiment.util.Set set20 = treeMapTestDriver16.entrySet();
        experiment.util.Set set21 = treeMapTestDriver16.keySet();
        java.lang.Object obj23 = treeMapTestDriver16.remove((java.lang.Object) (byte) 1);
        experiment.util.TreeMapTestDriver treeMapTestDriver24 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj26 = treeMapTestDriver24.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj28 = treeMapTestDriver24.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection29 = treeMapTestDriver24.values();
        experiment.util.Collection collection30 = treeMapTestDriver24.values();
        experiment.util.Set set31 = treeMapTestDriver24.keySet();
        experiment.util.Comparator comparator32 = treeMapTestDriver24.comparator();
        boolean boolean33 = treeMapTestDriver24.isEmpty();
        java.lang.Object obj34 = treeMapTestDriver12.put((java.lang.Object) (byte) 1, (java.lang.Object) treeMapTestDriver24);
        experiment.util.Set set35 = treeMapTestDriver24.entrySet();
        experiment.util.Comparator comparator36 = treeMapTestDriver24.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj37 = treeMapTestDriver0.get((java.lang.Object) comparator36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(comparator19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNull(comparator32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(comparator36);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test340");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        treeMapTestDriver0.clear();
        boolean boolean7 = treeMapTestDriver0.isEmpty();
        experiment.util.Set set8 = treeMapTestDriver0.entrySet();
        experiment.util.Set set9 = treeMapTestDriver0.keySet();
        treeMapTestDriver0.clear();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test341");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection7 = treeMapTestDriver0.values();
        experiment.util.Collection collection8 = treeMapTestDriver0.values();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test342");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        treeMapTestDriver0.clear();
        boolean boolean8 = treeMapTestDriver0.isEmpty();
        experiment.util.Set set9 = treeMapTestDriver0.entrySet();
        boolean boolean10 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver11 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj13 = treeMapTestDriver11.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj15 = treeMapTestDriver11.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection16 = treeMapTestDriver11.values();
        experiment.util.Collection collection17 = treeMapTestDriver11.values();
        experiment.util.Set set18 = treeMapTestDriver11.keySet();
        experiment.util.Collection collection19 = treeMapTestDriver11.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(collection19);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test343");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 1L);
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.Collection collection8 = treeMapTestDriver0.values();
        int int9 = treeMapTestDriver0.size();
        treeMapTestDriver0.clear();
        experiment.util.Comparator comparator11 = treeMapTestDriver0.comparator();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(comparator11);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test344");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        treeMapTestDriver0.clear();
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test345");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        experiment.util.Set set5 = treeMapTestDriver0.keySet();
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) (byte) 1);
        int int8 = treeMapTestDriver0.size();
        experiment.util.Collection collection9 = treeMapTestDriver0.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver10 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj12 = treeMapTestDriver10.get((java.lang.Object) 100);
        experiment.util.Set set13 = treeMapTestDriver10.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver14 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj16 = treeMapTestDriver14.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator17 = treeMapTestDriver14.comparator();
        experiment.util.Set set18 = treeMapTestDriver14.entrySet();
        experiment.util.Set set19 = treeMapTestDriver14.keySet();
        java.lang.Object obj21 = treeMapTestDriver14.remove((java.lang.Object) (byte) 1);
        experiment.util.TreeMapTestDriver treeMapTestDriver22 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj24 = treeMapTestDriver22.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj26 = treeMapTestDriver22.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection27 = treeMapTestDriver22.values();
        experiment.util.Collection collection28 = treeMapTestDriver22.values();
        experiment.util.Set set29 = treeMapTestDriver22.keySet();
        experiment.util.Comparator comparator30 = treeMapTestDriver22.comparator();
        boolean boolean31 = treeMapTestDriver22.isEmpty();
        java.lang.Object obj32 = treeMapTestDriver10.put((java.lang.Object) (byte) 1, (java.lang.Object) treeMapTestDriver22);
        experiment.util.Set set33 = treeMapTestDriver22.entrySet();
        java.lang.Class<?> wildcardClass34 = set33.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = treeMapTestDriver0.get((java.lang.Object) wildcardClass34);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
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
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(comparator17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(comparator30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test346");
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
        experiment.util.TreeMapTestDriver treeMapTestDriver19 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj21 = treeMapTestDriver19.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator22 = treeMapTestDriver19.comparator();
        experiment.util.Set set23 = treeMapTestDriver19.entrySet();
        experiment.util.Set set24 = treeMapTestDriver19.keySet();
        java.lang.Object obj26 = treeMapTestDriver19.remove((java.lang.Object) (byte) 1);
        int int27 = treeMapTestDriver19.size();
        int int28 = treeMapTestDriver19.size();
        boolean boolean29 = treeMapTestDriver19.isEmpty();
        experiment.util.Collection collection30 = treeMapTestDriver19.values();
        experiment.util.Collection collection31 = treeMapTestDriver19.values();
        treeMapTestDriver19.clear();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
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
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(comparator22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(collection31);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test347");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 1L);
        experiment.util.Set set7 = treeMapTestDriver0.entrySet();
        boolean boolean8 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = treeMapTestDriver0.remove(obj9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test348");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        experiment.util.Comparator comparator6 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator7 = treeMapTestDriver0.comparator();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertNull(comparator7);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test349");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        int int4 = treeMapTestDriver0.size();
        treeMapTestDriver0.clear();
        experiment.util.Comparator comparator6 = treeMapTestDriver0.comparator();
        boolean boolean7 = treeMapTestDriver0.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test350");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        treeMapTestDriver0.clear();
        experiment.util.Set set7 = treeMapTestDriver0.entrySet();
        experiment.util.Collection collection8 = treeMapTestDriver0.values();
        experiment.util.Collection collection9 = treeMapTestDriver0.values();
        experiment.util.Comparator comparator10 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver11 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj13 = treeMapTestDriver11.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator14 = treeMapTestDriver11.comparator();
        boolean boolean16 = treeMapTestDriver11.containsKey((java.lang.Object) 1L);
        boolean boolean17 = treeMapTestDriver11.isEmpty();
        experiment.util.Collection collection18 = treeMapTestDriver11.values();
        experiment.util.Comparator comparator19 = treeMapTestDriver11.comparator();
        experiment.util.Set set20 = treeMapTestDriver11.keySet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(comparator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNull(comparator19);
        org.junit.Assert.assertNotNull(set20);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test351");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) (-1));
        boolean boolean7 = treeMapTestDriver0.containsKey((java.lang.Object) 10.0d);
        treeMapTestDriver0.clear();
        experiment.util.Set set9 = treeMapTestDriver0.entrySet();
        experiment.util.Set set10 = treeMapTestDriver0.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver12 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj14 = treeMapTestDriver12.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj16 = treeMapTestDriver12.remove((java.lang.Object) 0.0f);
        boolean boolean17 = treeMapTestDriver12.isEmpty();
        experiment.util.Collection collection18 = treeMapTestDriver12.values();
        treeMapTestDriver12.clear();
        boolean boolean20 = treeMapTestDriver12.isEmpty();
        java.lang.Object obj21 = treeMapTestDriver0.put((java.lang.Object) 100.0f, (java.lang.Object) boolean20);
        int int22 = treeMapTestDriver0.size();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test352");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        experiment.util.Set set5 = treeMapTestDriver0.keySet();
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) true);
        int int8 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj11 = treeMapTestDriver9.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator12 = treeMapTestDriver9.comparator();
        experiment.util.Set set13 = treeMapTestDriver9.entrySet();
        java.lang.Object obj15 = treeMapTestDriver9.get((java.lang.Object) 100);
        treeMapTestDriver9.clear();
        experiment.util.Comparator comparator17 = treeMapTestDriver9.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(comparator17);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test353");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 100);
        treeMapTestDriver0.clear();
        experiment.util.Comparator comparator8 = treeMapTestDriver0.comparator();
        boolean boolean9 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection10 = treeMapTestDriver0.values();
        int int11 = treeMapTestDriver0.size();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(comparator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test354");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        treeMapTestDriver0.clear();
        experiment.util.Set set8 = treeMapTestDriver0.keySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test355");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 1L);
        experiment.util.Comparator comparator7 = treeMapTestDriver0.comparator();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(comparator7);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test356");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        experiment.util.Set set5 = treeMapTestDriver0.keySet();
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) (byte) 1);
        int int8 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj11 = treeMapTestDriver9.get((java.lang.Object) 100);
        experiment.util.Comparator comparator12 = treeMapTestDriver9.comparator();
        int int13 = treeMapTestDriver9.size();
        boolean boolean14 = treeMapTestDriver9.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver15 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj17 = treeMapTestDriver15.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj19 = treeMapTestDriver15.remove((java.lang.Object) (-1));
        treeMapTestDriver15.clear();
        boolean boolean21 = treeMapTestDriver15.isEmpty();
        experiment.util.Set set22 = treeMapTestDriver15.entrySet();
        java.lang.Object obj23 = treeMapTestDriver0.put((java.lang.Object) boolean14, (java.lang.Object) treeMapTestDriver15);
        experiment.util.Collection collection24 = treeMapTestDriver0.values();
        boolean boolean25 = treeMapTestDriver0.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test357");
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
        boolean boolean12 = treeMapTestDriver0.isEmpty();
        int int13 = treeMapTestDriver0.size();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test358");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) (-1));
        treeMapTestDriver0.clear();
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        experiment.util.Comparator comparator7 = treeMapTestDriver0.comparator();
        experiment.util.Set set8 = treeMapTestDriver0.entrySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(comparator7);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test359");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        boolean boolean7 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver8 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj10 = treeMapTestDriver8.get((java.lang.Object) 100);
        experiment.util.Comparator comparator11 = treeMapTestDriver8.comparator();
        int int12 = treeMapTestDriver8.size();
        treeMapTestDriver8.clear();
        experiment.util.Set set14 = treeMapTestDriver8.entrySet();
        experiment.util.Set set15 = treeMapTestDriver8.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver16 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj18 = treeMapTestDriver16.get((java.lang.Object) 100);
        experiment.util.Comparator comparator19 = treeMapTestDriver16.comparator();
        boolean boolean21 = treeMapTestDriver16.containsKey((java.lang.Object) (-1));
        boolean boolean23 = treeMapTestDriver16.containsKey((java.lang.Object) 10.0d);
        treeMapTestDriver16.clear();
        experiment.util.Set set25 = treeMapTestDriver16.entrySet();
        experiment.util.Set set26 = treeMapTestDriver16.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver28 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj30 = treeMapTestDriver28.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj32 = treeMapTestDriver28.remove((java.lang.Object) 0.0f);
        boolean boolean33 = treeMapTestDriver28.isEmpty();
        experiment.util.Collection collection34 = treeMapTestDriver28.values();
        treeMapTestDriver28.clear();
        boolean boolean36 = treeMapTestDriver28.isEmpty();
        java.lang.Object obj37 = treeMapTestDriver16.put((java.lang.Object) 100.0f, (java.lang.Object) boolean36);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj38 = treeMapTestDriver0.put((java.lang.Object) treeMapTestDriver8, (java.lang.Object) treeMapTestDriver16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(comparator19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(obj37);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test360");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        experiment.util.Comparator comparator7 = treeMapTestDriver0.comparator();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(comparator7);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test361");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        treeMapTestDriver0.clear();
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver8 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj10 = treeMapTestDriver8.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj12 = treeMapTestDriver8.remove((java.lang.Object) 0.0f);
        boolean boolean13 = treeMapTestDriver8.isEmpty();
        experiment.util.Collection collection14 = treeMapTestDriver8.values();
        java.lang.Class<?> wildcardClass15 = treeMapTestDriver8.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = treeMapTestDriver0.containsKey((java.lang.Object) wildcardClass15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test362");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        experiment.util.Set set5 = treeMapTestDriver0.keySet();
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) true);
        int int8 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj11 = treeMapTestDriver9.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj13 = treeMapTestDriver9.remove((java.lang.Object) 0.0f);
        java.lang.Object obj15 = treeMapTestDriver9.get((java.lang.Object) 1L);
        experiment.util.Set set16 = treeMapTestDriver9.keySet();
        experiment.util.Collection collection17 = treeMapTestDriver9.values();
        int int18 = treeMapTestDriver9.size();
        treeMapTestDriver9.clear();
        experiment.util.Set set20 = treeMapTestDriver9.entrySet();
        experiment.util.Collection collection21 = treeMapTestDriver9.values();
        treeMapTestDriver9.clear();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(collection21);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test363");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) 100);
        boolean boolean8 = treeMapTestDriver0.isEmpty();
        experiment.util.Comparator comparator9 = treeMapTestDriver0.comparator();
        boolean boolean10 = treeMapTestDriver0.isEmpty();
        boolean boolean11 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver12 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj14 = treeMapTestDriver12.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator15 = treeMapTestDriver12.comparator();
        experiment.util.Set set16 = treeMapTestDriver12.entrySet();
        experiment.util.Set set17 = treeMapTestDriver12.keySet();
        java.lang.Object obj19 = treeMapTestDriver12.remove((java.lang.Object) (byte) 1);
        int int20 = treeMapTestDriver12.size();
        experiment.util.Collection collection21 = treeMapTestDriver12.values();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = treeMapTestDriver0.containsKey((java.lang.Object) collection21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(comparator15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(collection21);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test364");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) (-1));
        boolean boolean7 = treeMapTestDriver0.containsKey((java.lang.Object) 10.0d);
        treeMapTestDriver0.clear();
        boolean boolean9 = treeMapTestDriver0.isEmpty();
        experiment.util.Comparator comparator10 = treeMapTestDriver0.comparator();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(comparator10);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test365");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Collection collection3 = treeMapTestDriver0.values();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set4);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test366");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        boolean boolean3 = treeMapTestDriver0.isEmpty();
        experiment.util.Set set4 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver5 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj7 = treeMapTestDriver5.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator8 = treeMapTestDriver5.comparator();
        experiment.util.Set set9 = treeMapTestDriver5.entrySet();
        experiment.util.Set set10 = treeMapTestDriver5.keySet();
        java.lang.Object obj12 = treeMapTestDriver5.remove((java.lang.Object) (byte) 1);
        boolean boolean13 = treeMapTestDriver5.isEmpty();
        int int14 = treeMapTestDriver5.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(comparator8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test367");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        int int5 = treeMapTestDriver0.size();
        experiment.util.Set set6 = treeMapTestDriver0.keySet();
        java.lang.Class<?> wildcardClass7 = set6.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test368");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 1L);
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.Collection collection8 = treeMapTestDriver0.values();
        experiment.util.Comparator comparator9 = treeMapTestDriver0.comparator();
        experiment.util.Collection collection10 = treeMapTestDriver0.values();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test369");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        boolean boolean8 = treeMapTestDriver0.isEmpty();
        boolean boolean9 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection10 = treeMapTestDriver0.values();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test370");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        experiment.util.Set set5 = treeMapTestDriver0.keySet();
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) (byte) 1);
        boolean boolean8 = treeMapTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass9 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test371");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        treeMapTestDriver0.clear();
        boolean boolean7 = treeMapTestDriver0.isEmpty();
        experiment.util.Set set8 = treeMapTestDriver0.entrySet();
        int int9 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator10 = treeMapTestDriver0.comparator();
        experiment.util.Collection collection11 = treeMapTestDriver0.values();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test372");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) (-1));
        experiment.util.Set set5 = treeMapTestDriver0.entrySet();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        boolean boolean7 = treeMapTestDriver0.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test373");
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
        experiment.util.Comparator comparator16 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator17 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver18 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj20 = treeMapTestDriver18.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj22 = treeMapTestDriver18.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection23 = treeMapTestDriver18.values();
        experiment.util.Collection collection24 = treeMapTestDriver18.values();
        experiment.util.Set set25 = treeMapTestDriver18.keySet();
        experiment.util.Comparator comparator26 = treeMapTestDriver18.comparator();
        boolean boolean27 = treeMapTestDriver18.isEmpty();
        experiment.util.Set set28 = treeMapTestDriver18.entrySet();
        int int29 = treeMapTestDriver18.size();
        experiment.util.Comparator comparator30 = treeMapTestDriver18.comparator();
        experiment.util.Collection collection31 = treeMapTestDriver18.values();
        experiment.util.Set set32 = treeMapTestDriver18.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = treeMapTestDriver0.get((java.lang.Object) set32);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(comparator16);
        org.junit.Assert.assertNull(comparator17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNull(comparator26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(comparator30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(set32);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test374");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        experiment.util.Comparator comparator6 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj9 = treeMapTestDriver7.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator10 = treeMapTestDriver7.comparator();
        boolean boolean12 = treeMapTestDriver7.containsKey((java.lang.Object) 1L);
        boolean boolean13 = treeMapTestDriver7.isEmpty();
        experiment.util.Collection collection14 = treeMapTestDriver7.values();
        experiment.util.Comparator comparator15 = treeMapTestDriver7.comparator();
        experiment.util.Comparator comparator16 = treeMapTestDriver7.comparator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(comparator15);
        org.junit.Assert.assertNull(comparator16);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test375");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) 100);
        boolean boolean8 = treeMapTestDriver0.isEmpty();
        experiment.util.Set set9 = treeMapTestDriver0.keySet();
        experiment.util.Set set10 = treeMapTestDriver0.entrySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test376");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        experiment.util.Set set6 = treeMapTestDriver0.keySet();
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.Comparator comparator8 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator9 = treeMapTestDriver0.comparator();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(comparator8);
        org.junit.Assert.assertNull(comparator9);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test377");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 1L);
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        treeMapTestDriver0.clear();
        experiment.util.Set set9 = treeMapTestDriver0.keySet();
        experiment.util.Set set10 = treeMapTestDriver0.keySet();
        java.lang.Class<?> wildcardClass11 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test378");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) 100);
        experiment.util.Set set8 = treeMapTestDriver0.keySet();
        treeMapTestDriver0.clear();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test379");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        experiment.util.Set set5 = treeMapTestDriver0.keySet();
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) (byte) 1);
        int int8 = treeMapTestDriver0.size();
        int int9 = treeMapTestDriver0.size();
        boolean boolean10 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection11 = treeMapTestDriver0.values();
        treeMapTestDriver0.clear();
        experiment.util.Comparator comparator13 = treeMapTestDriver0.comparator();
        experiment.util.Collection collection14 = treeMapTestDriver0.values();
        java.lang.Object obj15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = treeMapTestDriver0.containsKey(obj15);
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
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(comparator13);
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test380");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        int int7 = treeMapTestDriver0.size();
        experiment.util.Set set8 = treeMapTestDriver0.entrySet();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test381");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) (-1));
        treeMapTestDriver0.clear();
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj9 = treeMapTestDriver7.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator10 = treeMapTestDriver7.comparator();
        experiment.util.Set set11 = treeMapTestDriver7.entrySet();
        java.lang.Object obj13 = treeMapTestDriver7.get((java.lang.Object) 100);
        treeMapTestDriver7.clear();
        experiment.util.Comparator comparator15 = treeMapTestDriver7.comparator();
        int int16 = treeMapTestDriver7.size();
        java.lang.Object obj18 = treeMapTestDriver0.put((java.lang.Object) int16, (java.lang.Object) (byte) 100);
        experiment.util.Set set19 = treeMapTestDriver0.keySet();
        java.lang.Class<?> wildcardClass20 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(comparator15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test382");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 100);
        treeMapTestDriver0.clear();
        experiment.util.Collection collection8 = treeMapTestDriver0.values();
        treeMapTestDriver0.clear();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test383");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.Set set8 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver10 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj12 = treeMapTestDriver10.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj14 = treeMapTestDriver10.remove((java.lang.Object) 0.0f);
        java.lang.Object obj16 = treeMapTestDriver10.get((java.lang.Object) 1L);
        experiment.util.Set set17 = treeMapTestDriver10.keySet();
        experiment.util.Collection collection18 = treeMapTestDriver10.values();
        int int19 = treeMapTestDriver10.size();
        experiment.util.Set set20 = treeMapTestDriver10.keySet();
        boolean boolean21 = treeMapTestDriver10.isEmpty();
        treeMapTestDriver10.clear();
        java.lang.Object obj23 = treeMapTestDriver0.put((java.lang.Object) (short) 0, (java.lang.Object) treeMapTestDriver10);
        experiment.util.Set set24 = treeMapTestDriver0.keySet();
        experiment.util.Comparator comparator25 = treeMapTestDriver0.comparator();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNull(comparator25);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test384");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        int int6 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj9 = treeMapTestDriver7.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj11 = treeMapTestDriver7.remove((java.lang.Object) (-1));
        treeMapTestDriver7.clear();
        experiment.util.Collection collection13 = treeMapTestDriver7.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver14 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj16 = treeMapTestDriver14.get((java.lang.Object) 100);
        experiment.util.Comparator comparator17 = treeMapTestDriver14.comparator();
        int int18 = treeMapTestDriver14.size();
        boolean boolean19 = treeMapTestDriver14.isEmpty();
        boolean boolean20 = treeMapTestDriver7.containsKey((java.lang.Object) boolean19);
        experiment.util.Comparator comparator21 = treeMapTestDriver7.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = treeMapTestDriver0.get((java.lang.Object) comparator21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(comparator17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(comparator21);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test385");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        treeMapTestDriver0.clear();
        experiment.util.Set set8 = treeMapTestDriver0.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj11 = treeMapTestDriver9.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj13 = treeMapTestDriver9.remove((java.lang.Object) 0.0f);
        java.lang.Object obj15 = treeMapTestDriver9.get((java.lang.Object) 1L);
        experiment.util.Set set16 = treeMapTestDriver9.keySet();
        treeMapTestDriver9.clear();
        experiment.util.Comparator comparator18 = treeMapTestDriver9.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(comparator18);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test386");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 1L);
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.Collection collection8 = treeMapTestDriver0.values();
        boolean boolean9 = treeMapTestDriver0.isEmpty();
        int int10 = treeMapTestDriver0.size();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test387");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.Set set8 = treeMapTestDriver0.keySet();
        java.lang.Class<?> wildcardClass9 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test388");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj10 = treeMapTestDriver0.put((java.lang.Object) (byte) -1, (java.lang.Object) treeMapTestDriver9);
        experiment.util.Set set11 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver12 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj14 = treeMapTestDriver12.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj16 = treeMapTestDriver12.remove((java.lang.Object) 0.0f);
        boolean boolean17 = treeMapTestDriver12.isEmpty();
        experiment.util.Collection collection18 = treeMapTestDriver12.values();
        experiment.util.Set set19 = treeMapTestDriver12.keySet();
        experiment.util.Collection collection20 = treeMapTestDriver12.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
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
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(collection20);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test389");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver5 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj7 = treeMapTestDriver5.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj9 = treeMapTestDriver5.remove((java.lang.Object) 0.0f);
        java.lang.Object obj11 = treeMapTestDriver5.get((java.lang.Object) 1L);
        experiment.util.Set set12 = treeMapTestDriver5.keySet();
        experiment.util.Collection collection13 = treeMapTestDriver5.values();
        int int14 = treeMapTestDriver5.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver15 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj17 = treeMapTestDriver15.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator18 = treeMapTestDriver15.comparator();
        boolean boolean20 = treeMapTestDriver15.containsKey((java.lang.Object) 1L);
        boolean boolean21 = treeMapTestDriver15.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver22 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj24 = treeMapTestDriver22.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator25 = treeMapTestDriver22.comparator();
        experiment.util.Set set26 = treeMapTestDriver22.entrySet();
        experiment.util.Set set27 = treeMapTestDriver22.keySet();
        java.lang.Object obj29 = treeMapTestDriver22.remove((java.lang.Object) (byte) 1);
        int int30 = treeMapTestDriver22.size();
        int int31 = treeMapTestDriver22.size();
        boolean boolean32 = treeMapTestDriver22.isEmpty();
        experiment.util.Collection collection33 = treeMapTestDriver22.values();
        java.lang.Object obj34 = treeMapTestDriver5.put((java.lang.Object) boolean21, (java.lang.Object) treeMapTestDriver22);
        experiment.util.Set set35 = treeMapTestDriver5.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver36 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj38 = treeMapTestDriver36.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj40 = treeMapTestDriver36.remove((java.lang.Object) 0.0f);
        boolean boolean41 = treeMapTestDriver36.isEmpty();
        experiment.util.Collection collection42 = treeMapTestDriver36.values();
        treeMapTestDriver36.clear();
        boolean boolean44 = treeMapTestDriver36.isEmpty();
        experiment.util.Set set45 = treeMapTestDriver36.keySet();
        experiment.util.Set set46 = treeMapTestDriver36.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj47 = treeMapTestDriver0.put((java.lang.Object) set35, (java.lang.Object) treeMapTestDriver36);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(comparator18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(comparator25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNotNull(set46);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test390");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver6 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj8 = treeMapTestDriver6.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = treeMapTestDriver6.remove((java.lang.Object) 0.0f);
        boolean boolean11 = treeMapTestDriver6.isEmpty();
        experiment.util.Collection collection12 = treeMapTestDriver6.values();
        int int13 = treeMapTestDriver6.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver14 = new experiment.util.TreeMapTestDriver();
        experiment.util.Comparator comparator15 = treeMapTestDriver14.comparator();
        boolean boolean17 = treeMapTestDriver14.containsKey((java.lang.Object) 10);
        experiment.util.TreeMapTestDriver treeMapTestDriver18 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj20 = treeMapTestDriver18.get((java.lang.Object) 100);
        experiment.util.Comparator comparator21 = treeMapTestDriver18.comparator();
        experiment.util.Set set22 = treeMapTestDriver18.entrySet();
        java.lang.Object obj23 = treeMapTestDriver6.put((java.lang.Object) 10, (java.lang.Object) set22);
        boolean boolean24 = treeMapTestDriver6.isEmpty();
        boolean boolean25 = treeMapTestDriver0.containsKey((java.lang.Object) boolean24);
        experiment.util.TreeMapTestDriver treeMapTestDriver26 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj28 = treeMapTestDriver26.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator29 = treeMapTestDriver26.comparator();
        boolean boolean31 = treeMapTestDriver26.containsKey((java.lang.Object) 1L);
        boolean boolean32 = treeMapTestDriver26.isEmpty();
        experiment.util.Set set33 = treeMapTestDriver26.keySet();
        boolean boolean34 = treeMapTestDriver26.isEmpty();
        int int35 = treeMapTestDriver26.size();
        java.lang.Object obj36 = treeMapTestDriver0.get((java.lang.Object) int35);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(comparator15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(comparator21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(comparator29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test391");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        treeMapTestDriver0.clear();
        boolean boolean7 = treeMapTestDriver0.isEmpty();
        treeMapTestDriver0.clear();
        int int9 = treeMapTestDriver0.size();
        boolean boolean10 = treeMapTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass11 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test392");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        int int7 = treeMapTestDriver0.size();
        experiment.util.Set set8 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj11 = treeMapTestDriver9.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj13 = treeMapTestDriver9.remove((java.lang.Object) 0.0f);
        java.lang.Object obj15 = treeMapTestDriver9.get((java.lang.Object) 1L);
        experiment.util.Set set16 = treeMapTestDriver9.keySet();
        experiment.util.Set set17 = treeMapTestDriver9.entrySet();
        experiment.util.Collection collection18 = treeMapTestDriver9.values();
        experiment.util.Collection collection19 = treeMapTestDriver9.values();
        int int20 = treeMapTestDriver9.size();
        experiment.util.Set set21 = treeMapTestDriver9.entrySet();
        java.lang.Object obj22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = treeMapTestDriver0.put((java.lang.Object) set21, obj22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(set21);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test393");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        int int8 = treeMapTestDriver0.size();
        treeMapTestDriver0.clear();
        boolean boolean10 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver11 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj13 = treeMapTestDriver11.get((java.lang.Object) 100);
        experiment.util.Comparator comparator14 = treeMapTestDriver11.comparator();
        experiment.util.Set set15 = treeMapTestDriver11.entrySet();
        experiment.util.Collection collection16 = treeMapTestDriver11.values();
        boolean boolean17 = treeMapTestDriver11.isEmpty();
        experiment.util.Collection collection18 = treeMapTestDriver11.values();
        int int19 = treeMapTestDriver11.size();
        java.lang.Object obj20 = treeMapTestDriver0.remove((java.lang.Object) int19);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(comparator14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test394");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection7 = treeMapTestDriver0.values();
        experiment.util.Comparator comparator8 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator9 = treeMapTestDriver0.comparator();
        boolean boolean10 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver11 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj13 = treeMapTestDriver11.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj15 = treeMapTestDriver11.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection16 = treeMapTestDriver11.values();
        experiment.util.Set set17 = treeMapTestDriver11.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(comparator8);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(set17);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test395");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 1L);
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.Collection collection8 = treeMapTestDriver0.values();
        int int9 = treeMapTestDriver0.size();
        treeMapTestDriver0.clear();
        experiment.util.Set set11 = treeMapTestDriver0.entrySet();
        experiment.util.Collection collection12 = treeMapTestDriver0.values();
        treeMapTestDriver0.clear();
        int int14 = treeMapTestDriver0.size();
        java.lang.Class<?> wildcardClass15 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test396");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        experiment.util.Set set5 = treeMapTestDriver0.keySet();
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) (byte) 1);
        experiment.util.Set set8 = treeMapTestDriver0.entrySet();
        experiment.util.Set set9 = treeMapTestDriver0.entrySet();
        experiment.util.Set set10 = treeMapTestDriver0.entrySet();
        experiment.util.Comparator comparator11 = treeMapTestDriver0.comparator();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(comparator11);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test397");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.Collection collection8 = treeMapTestDriver0.values();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test398");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Collection collection3 = treeMapTestDriver0.values();
        experiment.util.Set set4 = treeMapTestDriver0.keySet();
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver6 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj8 = treeMapTestDriver6.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator9 = treeMapTestDriver6.comparator();
        experiment.util.Set set10 = treeMapTestDriver6.entrySet();
        experiment.util.Set set11 = treeMapTestDriver6.keySet();
        java.lang.Object obj13 = treeMapTestDriver6.remove((java.lang.Object) (byte) 1);
        int int14 = treeMapTestDriver6.size();
        int int15 = treeMapTestDriver6.size();
        boolean boolean16 = treeMapTestDriver6.isEmpty();
        int int17 = treeMapTestDriver6.size();
        experiment.util.Set set18 = treeMapTestDriver6.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(set18);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test399");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        treeMapTestDriver0.clear();
        experiment.util.Set set5 = treeMapTestDriver0.entrySet();
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test400");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        experiment.util.Set set5 = treeMapTestDriver0.keySet();
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) (byte) 1);
        experiment.util.Set set8 = treeMapTestDriver0.entrySet();
        boolean boolean9 = treeMapTestDriver0.isEmpty();
        experiment.util.Set set10 = treeMapTestDriver0.keySet();
        java.lang.Class<?> wildcardClass11 = set10.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test401");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        int int7 = treeMapTestDriver0.size();
        experiment.util.Collection collection8 = treeMapTestDriver0.values();
        experiment.util.Collection collection9 = treeMapTestDriver0.values();
        treeMapTestDriver0.clear();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test402");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 100);
        treeMapTestDriver0.clear();
        treeMapTestDriver0.clear();
        boolean boolean9 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver10 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj12 = treeMapTestDriver10.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj14 = treeMapTestDriver10.remove((java.lang.Object) 0.0f);
        boolean boolean15 = treeMapTestDriver10.isEmpty();
        experiment.util.Comparator comparator16 = treeMapTestDriver10.comparator();
        boolean boolean18 = treeMapTestDriver10.containsKey((java.lang.Object) 1.0f);
        experiment.util.Collection collection19 = treeMapTestDriver10.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(comparator16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(collection19);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test403");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.Comparator comparator8 = treeMapTestDriver0.comparator();
        int int9 = treeMapTestDriver0.size();
        java.lang.Object obj10 = null;
        experiment.util.TreeMapTestDriver treeMapTestDriver11 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj13 = treeMapTestDriver11.get((java.lang.Object) 100);
        experiment.util.Comparator comparator14 = treeMapTestDriver11.comparator();
        int int15 = treeMapTestDriver11.size();
        treeMapTestDriver11.clear();
        experiment.util.Set set17 = treeMapTestDriver11.entrySet();
        experiment.util.Set set18 = treeMapTestDriver11.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = treeMapTestDriver0.put(obj10, (java.lang.Object) set18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(comparator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(comparator14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set18);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test404");
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
        treeMapTestDriver9.clear();
        boolean boolean17 = treeMapTestDriver9.containsKey((java.lang.Object) 100.0d);
        experiment.util.TreeMapTestDriver treeMapTestDriver18 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj20 = treeMapTestDriver18.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj22 = treeMapTestDriver18.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection23 = treeMapTestDriver18.values();
        experiment.util.Collection collection24 = treeMapTestDriver18.values();
        experiment.util.Set set25 = treeMapTestDriver18.keySet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = treeMapTestDriver9.containsKey((java.lang.Object) treeMapTestDriver18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(set25);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test405");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection7 = treeMapTestDriver0.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver8 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj10 = treeMapTestDriver8.get((java.lang.Object) 100);
        experiment.util.Comparator comparator11 = treeMapTestDriver8.comparator();
        boolean boolean13 = treeMapTestDriver8.containsKey((java.lang.Object) (-1));
        boolean boolean15 = treeMapTestDriver8.containsKey((java.lang.Object) 10.0d);
        treeMapTestDriver8.clear();
        experiment.util.Set set17 = treeMapTestDriver8.entrySet();
        experiment.util.Set set18 = treeMapTestDriver8.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver20 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj22 = treeMapTestDriver20.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj24 = treeMapTestDriver20.remove((java.lang.Object) 0.0f);
        boolean boolean25 = treeMapTestDriver20.isEmpty();
        experiment.util.Collection collection26 = treeMapTestDriver20.values();
        treeMapTestDriver20.clear();
        boolean boolean28 = treeMapTestDriver20.isEmpty();
        java.lang.Object obj29 = treeMapTestDriver8.put((java.lang.Object) 100.0f, (java.lang.Object) boolean28);
        java.lang.Object obj30 = treeMapTestDriver0.remove((java.lang.Object) 100.0f);
        experiment.util.Set set31 = treeMapTestDriver0.entrySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(set31);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test406");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        experiment.util.Comparator comparator6 = treeMapTestDriver0.comparator();
        boolean boolean8 = treeMapTestDriver0.containsKey((java.lang.Object) 1.0f);
        treeMapTestDriver0.clear();
        experiment.util.Set set10 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver11 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj13 = treeMapTestDriver11.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj15 = treeMapTestDriver11.remove((java.lang.Object) 0.0f);
        boolean boolean16 = treeMapTestDriver11.isEmpty();
        experiment.util.Comparator comparator17 = treeMapTestDriver11.comparator();
        boolean boolean19 = treeMapTestDriver11.containsKey((java.lang.Object) 1.0f);
        experiment.util.Set set20 = treeMapTestDriver11.entrySet();
        boolean boolean21 = treeMapTestDriver11.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(comparator17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test407");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) 100);
        int int8 = treeMapTestDriver0.size();
        boolean boolean9 = treeMapTestDriver0.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test408");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        experiment.util.Set set5 = treeMapTestDriver0.keySet();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        treeMapTestDriver0.clear();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test409");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj10 = treeMapTestDriver0.put((java.lang.Object) (byte) -1, (java.lang.Object) treeMapTestDriver9);
        experiment.util.Comparator comparator11 = treeMapTestDriver9.comparator();
        treeMapTestDriver9.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver13 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj15 = treeMapTestDriver13.get((java.lang.Object) 100);
        experiment.util.Comparator comparator16 = treeMapTestDriver13.comparator();
        experiment.util.Comparator comparator17 = treeMapTestDriver13.comparator();
        experiment.util.Collection collection18 = treeMapTestDriver13.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = treeMapTestDriver9.remove((java.lang.Object) treeMapTestDriver13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(comparator16);
        org.junit.Assert.assertNull(comparator17);
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test410");
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
        java.lang.Object obj15 = treeMapTestDriver11.remove((java.lang.Object) 0.0f);
        boolean boolean16 = treeMapTestDriver11.isEmpty();
        experiment.util.Collection collection17 = treeMapTestDriver11.values();
        experiment.util.Set set18 = treeMapTestDriver11.keySet();
        int int19 = treeMapTestDriver11.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver20 = new experiment.util.TreeMapTestDriver();
        experiment.util.Comparator comparator21 = treeMapTestDriver20.comparator();
        boolean boolean23 = treeMapTestDriver20.containsKey((java.lang.Object) 10);
        int int24 = treeMapTestDriver20.size();
        experiment.util.Set set25 = treeMapTestDriver20.keySet();
        java.lang.Object obj26 = treeMapTestDriver9.put((java.lang.Object) int19, (java.lang.Object) treeMapTestDriver20);
        treeMapTestDriver9.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver28 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj30 = treeMapTestDriver28.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator31 = treeMapTestDriver28.comparator();
        boolean boolean33 = treeMapTestDriver28.containsKey((java.lang.Object) 1L);
        boolean boolean34 = treeMapTestDriver28.isEmpty();
        experiment.util.Collection collection35 = treeMapTestDriver28.values();
        experiment.util.Set set36 = treeMapTestDriver28.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver37 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj39 = treeMapTestDriver37.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator40 = treeMapTestDriver37.comparator();
        experiment.util.Set set41 = treeMapTestDriver37.entrySet();
        java.lang.Object obj43 = treeMapTestDriver37.get((java.lang.Object) 100);
        boolean boolean44 = treeMapTestDriver28.containsKey((java.lang.Object) 100);
        experiment.util.Set set45 = treeMapTestDriver28.keySet();
        boolean boolean46 = treeMapTestDriver28.isEmpty();
        experiment.util.Set set47 = treeMapTestDriver28.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver48 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj50 = treeMapTestDriver48.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj52 = treeMapTestDriver48.remove((java.lang.Object) 0.0f);
        java.lang.Object obj54 = treeMapTestDriver48.get((java.lang.Object) 1L);
        experiment.util.Set set55 = treeMapTestDriver48.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj56 = treeMapTestDriver9.put((java.lang.Object) treeMapTestDriver28, (java.lang.Object) treeMapTestDriver48);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
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
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(comparator21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(comparator31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(comparator40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(set55);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test411");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        experiment.util.Set set5 = treeMapTestDriver0.keySet();
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) (byte) 1);
        int int8 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj11 = treeMapTestDriver9.get((java.lang.Object) 100);
        experiment.util.Comparator comparator12 = treeMapTestDriver9.comparator();
        int int13 = treeMapTestDriver9.size();
        boolean boolean14 = treeMapTestDriver9.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver15 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj17 = treeMapTestDriver15.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj19 = treeMapTestDriver15.remove((java.lang.Object) (-1));
        treeMapTestDriver15.clear();
        boolean boolean21 = treeMapTestDriver15.isEmpty();
        experiment.util.Set set22 = treeMapTestDriver15.entrySet();
        java.lang.Object obj23 = treeMapTestDriver0.put((java.lang.Object) boolean14, (java.lang.Object) treeMapTestDriver15);
        experiment.util.Collection collection24 = treeMapTestDriver0.values();
        experiment.util.Set set25 = treeMapTestDriver0.entrySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(set25);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test412");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj10 = treeMapTestDriver0.put((java.lang.Object) (byte) -1, (java.lang.Object) treeMapTestDriver9);
        int int11 = treeMapTestDriver9.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver12 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj14 = treeMapTestDriver12.get((java.lang.Object) 100);
        experiment.util.Comparator comparator15 = treeMapTestDriver12.comparator();
        experiment.util.Comparator comparator16 = treeMapTestDriver12.comparator();
        boolean boolean17 = treeMapTestDriver12.isEmpty();
        treeMapTestDriver12.clear();
        treeMapTestDriver12.clear();
        treeMapTestDriver12.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver21 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj23 = treeMapTestDriver21.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj25 = treeMapTestDriver21.remove((java.lang.Object) 0.0f);
        boolean boolean26 = treeMapTestDriver21.isEmpty();
        experiment.util.Comparator comparator27 = treeMapTestDriver21.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = treeMapTestDriver9.put((java.lang.Object) treeMapTestDriver12, (java.lang.Object) treeMapTestDriver21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
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
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(comparator15);
        org.junit.Assert.assertNull(comparator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(comparator27);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test413");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection7 = treeMapTestDriver0.values();
        experiment.util.Set set8 = treeMapTestDriver0.keySet();
        int int9 = treeMapTestDriver0.size();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test414");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean6 = treeMapTestDriver0.containsKey((java.lang.Object) (byte) 10);
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj9 = treeMapTestDriver7.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj11 = treeMapTestDriver7.remove((java.lang.Object) 0.0f);
        boolean boolean12 = treeMapTestDriver7.isEmpty();
        experiment.util.Collection collection13 = treeMapTestDriver7.values();
        experiment.util.Set set14 = treeMapTestDriver7.keySet();
        experiment.util.Collection collection15 = treeMapTestDriver7.values();
        boolean boolean16 = treeMapTestDriver7.isEmpty();
        boolean boolean17 = treeMapTestDriver7.isEmpty();
        java.lang.Object obj18 = treeMapTestDriver0.get((java.lang.Object) boolean17);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test415");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        treeMapTestDriver0.clear();
        experiment.util.Set set7 = treeMapTestDriver0.entrySet();
        experiment.util.Collection collection8 = treeMapTestDriver0.values();
        experiment.util.Collection collection9 = treeMapTestDriver0.values();
        treeMapTestDriver0.clear();
        treeMapTestDriver0.clear();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test416");
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
        experiment.util.TreeMapTestDriver treeMapTestDriver19 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj21 = treeMapTestDriver19.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj23 = treeMapTestDriver19.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection24 = treeMapTestDriver19.values();
        experiment.util.Collection collection25 = treeMapTestDriver19.values();
        experiment.util.Set set26 = treeMapTestDriver19.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver28 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj29 = treeMapTestDriver19.put((java.lang.Object) (byte) -1, (java.lang.Object) treeMapTestDriver28);
        java.lang.Class<?> wildcardClass30 = treeMapTestDriver28.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver28);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
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
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test417");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        treeMapTestDriver0.clear();
        experiment.util.Set set7 = treeMapTestDriver0.entrySet();
        experiment.util.Collection collection8 = treeMapTestDriver0.values();
        experiment.util.Collection collection9 = treeMapTestDriver0.values();
        experiment.util.Comparator comparator10 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver11 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj13 = treeMapTestDriver11.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj15 = treeMapTestDriver11.remove((java.lang.Object) 0.0f);
        boolean boolean16 = treeMapTestDriver11.isEmpty();
        experiment.util.Collection collection17 = treeMapTestDriver11.values();
        int int18 = treeMapTestDriver11.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver20 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj22 = treeMapTestDriver20.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator23 = treeMapTestDriver20.comparator();
        treeMapTestDriver20.clear();
        java.lang.Object obj25 = treeMapTestDriver11.put((java.lang.Object) (-1), (java.lang.Object) treeMapTestDriver20);
        treeMapTestDriver20.clear();
        int int27 = treeMapTestDriver20.size();
        experiment.util.Comparator comparator28 = treeMapTestDriver20.comparator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = treeMapTestDriver0.containsKey((java.lang.Object) comparator28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(comparator23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(comparator28);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test418");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        treeMapTestDriver0.clear();
        boolean boolean7 = treeMapTestDriver0.isEmpty();
        treeMapTestDriver0.clear();
        boolean boolean9 = treeMapTestDriver0.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test419");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        treeMapTestDriver0.clear();
        int int8 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj11 = treeMapTestDriver9.get((java.lang.Object) 100);
        experiment.util.Comparator comparator12 = treeMapTestDriver9.comparator();
        experiment.util.Comparator comparator13 = treeMapTestDriver9.comparator();
        boolean boolean14 = treeMapTestDriver9.isEmpty();
        treeMapTestDriver9.clear();
        experiment.util.Set set16 = treeMapTestDriver9.entrySet();
        experiment.util.Collection collection17 = treeMapTestDriver9.values();
        experiment.util.Collection collection18 = treeMapTestDriver9.values();
        experiment.util.Comparator comparator19 = treeMapTestDriver9.comparator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertNull(comparator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNull(comparator19);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test420");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        boolean boolean7 = treeMapTestDriver0.isEmpty();
        experiment.util.Comparator comparator8 = treeMapTestDriver0.comparator();
        int int9 = treeMapTestDriver0.size();
        treeMapTestDriver0.clear();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(comparator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test421");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Collection collection3 = treeMapTestDriver0.values();
        experiment.util.Set set4 = treeMapTestDriver0.keySet();
        treeMapTestDriver0.clear();
        experiment.util.Set set6 = treeMapTestDriver0.keySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test422");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 1L);
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.Collection collection8 = treeMapTestDriver0.values();
        int int9 = treeMapTestDriver0.size();
        experiment.util.Set set10 = treeMapTestDriver0.keySet();
        boolean boolean11 = treeMapTestDriver0.isEmpty();
        treeMapTestDriver0.clear();
        int int13 = treeMapTestDriver0.size();
        experiment.util.Set set14 = treeMapTestDriver0.keySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(set14);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test423");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        experiment.util.Set set5 = treeMapTestDriver0.keySet();
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) (byte) 1);
        int int8 = treeMapTestDriver0.size();
        int int9 = treeMapTestDriver0.size();
        boolean boolean10 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection11 = treeMapTestDriver0.values();
        treeMapTestDriver0.clear();
        experiment.util.Set set13 = treeMapTestDriver0.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver14 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj16 = treeMapTestDriver14.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = treeMapTestDriver14.remove((java.lang.Object) 0.0f);
        java.lang.Object obj20 = treeMapTestDriver14.get((java.lang.Object) 1L);
        experiment.util.Set set21 = treeMapTestDriver14.keySet();
        experiment.util.Set set22 = treeMapTestDriver14.entrySet();
        experiment.util.Collection collection23 = treeMapTestDriver14.values();
        experiment.util.Collection collection24 = treeMapTestDriver14.values();
        experiment.util.Set set25 = treeMapTestDriver14.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
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
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(set25);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test424");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver4 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj6 = treeMapTestDriver4.get((java.lang.Object) 100);
        experiment.util.Comparator comparator7 = treeMapTestDriver4.comparator();
        experiment.util.Comparator comparator8 = treeMapTestDriver4.comparator();
        boolean boolean9 = treeMapTestDriver4.isEmpty();
        treeMapTestDriver4.clear();
        experiment.util.Set set11 = treeMapTestDriver4.entrySet();
        experiment.util.Set set12 = treeMapTestDriver4.keySet();
        int int13 = treeMapTestDriver4.size();
        experiment.util.Set set14 = treeMapTestDriver4.keySet();
        java.lang.Class<?> wildcardClass15 = treeMapTestDriver4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(comparator7);
        org.junit.Assert.assertNull(comparator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test425");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        boolean boolean7 = treeMapTestDriver0.isEmpty();
        experiment.util.Comparator comparator8 = treeMapTestDriver0.comparator();
        treeMapTestDriver0.clear();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(comparator8);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test426");
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
        experiment.util.Comparator comparator12 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator13 = treeMapTestDriver0.comparator();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(comparator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertNull(comparator13);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test427");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        treeMapTestDriver0.clear();
        experiment.util.Set set5 = treeMapTestDriver0.entrySet();
        experiment.util.Comparator comparator6 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator7 = treeMapTestDriver0.comparator();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertNull(comparator7);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test428");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.Comparator comparator8 = treeMapTestDriver0.comparator();
        boolean boolean9 = treeMapTestDriver0.isEmpty();
        experiment.util.Comparator comparator10 = treeMapTestDriver0.comparator();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(comparator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(comparator10);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test429");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 1L);
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.Collection collection8 = treeMapTestDriver0.values();
        int int9 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver10 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj12 = treeMapTestDriver10.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator13 = treeMapTestDriver10.comparator();
        boolean boolean15 = treeMapTestDriver10.containsKey((java.lang.Object) 1L);
        boolean boolean16 = treeMapTestDriver10.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver17 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj19 = treeMapTestDriver17.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator20 = treeMapTestDriver17.comparator();
        experiment.util.Set set21 = treeMapTestDriver17.entrySet();
        experiment.util.Set set22 = treeMapTestDriver17.keySet();
        java.lang.Object obj24 = treeMapTestDriver17.remove((java.lang.Object) (byte) 1);
        int int25 = treeMapTestDriver17.size();
        int int26 = treeMapTestDriver17.size();
        boolean boolean27 = treeMapTestDriver17.isEmpty();
        experiment.util.Collection collection28 = treeMapTestDriver17.values();
        java.lang.Object obj29 = treeMapTestDriver0.put((java.lang.Object) boolean16, (java.lang.Object) treeMapTestDriver17);
        experiment.util.TreeMapTestDriver treeMapTestDriver30 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj32 = treeMapTestDriver30.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator33 = treeMapTestDriver30.comparator();
        boolean boolean35 = treeMapTestDriver30.containsKey((java.lang.Object) 1L);
        int int36 = treeMapTestDriver30.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj37 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver30);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(comparator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(comparator20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(comparator33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test430");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        int int7 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver8 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj10 = treeMapTestDriver8.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator11 = treeMapTestDriver8.comparator();
        boolean boolean13 = treeMapTestDriver8.containsKey((java.lang.Object) 1L);
        java.lang.Object obj15 = treeMapTestDriver8.remove((java.lang.Object) 100);
        experiment.util.Set set16 = treeMapTestDriver8.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = treeMapTestDriver0.get((java.lang.Object) set16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test431");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj9 = treeMapTestDriver7.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator10 = treeMapTestDriver7.comparator();
        boolean boolean12 = treeMapTestDriver7.containsKey((java.lang.Object) 1L);
        int int13 = treeMapTestDriver7.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test432");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        treeMapTestDriver0.clear();
        experiment.util.Comparator comparator7 = treeMapTestDriver0.comparator();
        int int8 = treeMapTestDriver0.size();
        experiment.util.Set set9 = treeMapTestDriver0.entrySet();
        experiment.util.Set set10 = treeMapTestDriver0.keySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(comparator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test433");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 1L);
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.Collection collection8 = treeMapTestDriver0.values();
        int int9 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver10 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj12 = treeMapTestDriver10.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator13 = treeMapTestDriver10.comparator();
        boolean boolean15 = treeMapTestDriver10.containsKey((java.lang.Object) 1L);
        boolean boolean16 = treeMapTestDriver10.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver17 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj19 = treeMapTestDriver17.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator20 = treeMapTestDriver17.comparator();
        experiment.util.Set set21 = treeMapTestDriver17.entrySet();
        experiment.util.Set set22 = treeMapTestDriver17.keySet();
        java.lang.Object obj24 = treeMapTestDriver17.remove((java.lang.Object) (byte) 1);
        int int25 = treeMapTestDriver17.size();
        int int26 = treeMapTestDriver17.size();
        boolean boolean27 = treeMapTestDriver17.isEmpty();
        experiment.util.Collection collection28 = treeMapTestDriver17.values();
        java.lang.Object obj29 = treeMapTestDriver0.put((java.lang.Object) boolean16, (java.lang.Object) treeMapTestDriver17);
        experiment.util.Set set30 = treeMapTestDriver0.entrySet();
        treeMapTestDriver0.clear();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(comparator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(comparator20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set30);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test434");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        treeMapTestDriver0.clear();
        treeMapTestDriver0.clear();
        boolean boolean8 = treeMapTestDriver0.isEmpty();
        boolean boolean9 = treeMapTestDriver0.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test435");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) 100);
        int int8 = treeMapTestDriver0.size();
        experiment.util.Set set9 = treeMapTestDriver0.entrySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test436");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection7 = treeMapTestDriver0.values();
        experiment.util.Set set8 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj11 = treeMapTestDriver9.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj13 = treeMapTestDriver9.remove((java.lang.Object) 0.0f);
        boolean boolean14 = treeMapTestDriver9.isEmpty();
        experiment.util.Comparator comparator15 = treeMapTestDriver9.comparator();
        boolean boolean17 = treeMapTestDriver9.containsKey((java.lang.Object) 1.0f);
        experiment.util.TreeMapTestDriver treeMapTestDriver18 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj20 = treeMapTestDriver18.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj22 = treeMapTestDriver18.remove((java.lang.Object) (-1));
        treeMapTestDriver18.clear();
        boolean boolean24 = treeMapTestDriver18.isEmpty();
        java.lang.Object obj25 = treeMapTestDriver9.get((java.lang.Object) boolean24);
        experiment.util.Set set26 = treeMapTestDriver9.entrySet();
        experiment.util.Set set27 = treeMapTestDriver9.entrySet();
        int int28 = treeMapTestDriver9.size();
        experiment.util.Collection collection29 = treeMapTestDriver9.values();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
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
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(comparator15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(collection29);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test437");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        treeMapTestDriver0.clear();
        experiment.util.Comparator comparator7 = treeMapTestDriver0.comparator();
        experiment.util.Set set8 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj11 = treeMapTestDriver9.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj13 = treeMapTestDriver9.remove((java.lang.Object) 0.0f);
        java.lang.Object obj15 = treeMapTestDriver9.get((java.lang.Object) 1L);
        experiment.util.Set set16 = treeMapTestDriver9.keySet();
        experiment.util.Set set17 = treeMapTestDriver9.entrySet();
        experiment.util.Collection collection18 = treeMapTestDriver9.values();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = treeMapTestDriver0.containsKey((java.lang.Object) collection18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(comparator7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test438");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        treeMapTestDriver0.clear();
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        boolean boolean8 = treeMapTestDriver0.isEmpty();
        boolean boolean9 = treeMapTestDriver0.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test439");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        int int6 = treeMapTestDriver0.size();
        int int7 = treeMapTestDriver0.size();
        experiment.util.Set set8 = treeMapTestDriver0.keySet();
        experiment.util.Comparator comparator9 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver10 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj12 = treeMapTestDriver10.get((java.lang.Object) 100);
        experiment.util.Comparator comparator13 = treeMapTestDriver10.comparator();
        experiment.util.Comparator comparator14 = treeMapTestDriver10.comparator();
        boolean boolean15 = treeMapTestDriver10.isEmpty();
        treeMapTestDriver10.clear();
        treeMapTestDriver10.clear();
        boolean boolean18 = treeMapTestDriver10.isEmpty();
        experiment.util.Collection collection19 = treeMapTestDriver10.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(comparator13);
        org.junit.Assert.assertNull(comparator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(collection19);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test440");
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
        boolean boolean15 = treeMapTestDriver9.isEmpty();
        boolean boolean16 = treeMapTestDriver9.isEmpty();
        experiment.util.Comparator comparator17 = treeMapTestDriver9.comparator();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(comparator17);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test441");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        int int7 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver8 = new experiment.util.TreeMapTestDriver();
        experiment.util.Comparator comparator9 = treeMapTestDriver8.comparator();
        boolean boolean11 = treeMapTestDriver8.containsKey((java.lang.Object) 10);
        experiment.util.TreeMapTestDriver treeMapTestDriver12 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj14 = treeMapTestDriver12.get((java.lang.Object) 100);
        experiment.util.Comparator comparator15 = treeMapTestDriver12.comparator();
        experiment.util.Set set16 = treeMapTestDriver12.entrySet();
        java.lang.Object obj17 = treeMapTestDriver0.put((java.lang.Object) 10, (java.lang.Object) set16);
        boolean boolean18 = treeMapTestDriver0.isEmpty();
        int int19 = treeMapTestDriver0.size();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(comparator15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test442");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        experiment.util.Set set6 = treeMapTestDriver0.keySet();
        experiment.util.Set set7 = treeMapTestDriver0.entrySet();
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
        boolean boolean23 = treeMapTestDriver0.containsKey((java.lang.Object) (-1));
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(comparator20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test443");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj10 = treeMapTestDriver0.put((java.lang.Object) (byte) -1, (java.lang.Object) treeMapTestDriver9);
        experiment.util.Set set11 = treeMapTestDriver0.keySet();
        boolean boolean12 = treeMapTestDriver0.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test444");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        treeMapTestDriver0.clear();
        boolean boolean7 = treeMapTestDriver0.isEmpty();
        treeMapTestDriver0.clear();
        experiment.util.Set set9 = treeMapTestDriver0.entrySet();
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver11 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj13 = treeMapTestDriver11.get((java.lang.Object) 100);
        experiment.util.Comparator comparator14 = treeMapTestDriver11.comparator();
        experiment.util.Comparator comparator15 = treeMapTestDriver11.comparator();
        boolean boolean16 = treeMapTestDriver11.isEmpty();
        treeMapTestDriver11.clear();
        boolean boolean18 = treeMapTestDriver11.isEmpty();
        experiment.util.Set set19 = treeMapTestDriver11.entrySet();
        experiment.util.Set set20 = treeMapTestDriver11.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = treeMapTestDriver0.get((java.lang.Object) set20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(comparator14);
        org.junit.Assert.assertNull(comparator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(set20);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test445");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Collection collection3 = treeMapTestDriver0.values();
        experiment.util.Set set4 = treeMapTestDriver0.keySet();
        treeMapTestDriver0.clear();
        experiment.util.Set set6 = treeMapTestDriver0.entrySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test446");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        int int7 = treeMapTestDriver0.size();
        experiment.util.Collection collection8 = treeMapTestDriver0.values();
        experiment.util.Collection collection9 = treeMapTestDriver0.values();
        experiment.util.Comparator comparator10 = treeMapTestDriver0.comparator();
        treeMapTestDriver0.clear();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(comparator10);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test447");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        treeMapTestDriver0.clear();
        experiment.util.Set set7 = treeMapTestDriver0.entrySet();
        experiment.util.Collection collection8 = treeMapTestDriver0.values();
        experiment.util.Collection collection9 = treeMapTestDriver0.values();
        treeMapTestDriver0.clear();
        experiment.util.Set set11 = treeMapTestDriver0.entrySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(set11);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test448");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) (-1));
        treeMapTestDriver0.clear();
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj9 = treeMapTestDriver7.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator10 = treeMapTestDriver7.comparator();
        experiment.util.Set set11 = treeMapTestDriver7.entrySet();
        java.lang.Object obj13 = treeMapTestDriver7.get((java.lang.Object) 100);
        treeMapTestDriver7.clear();
        experiment.util.Comparator comparator15 = treeMapTestDriver7.comparator();
        int int16 = treeMapTestDriver7.size();
        java.lang.Object obj18 = treeMapTestDriver0.put((java.lang.Object) int16, (java.lang.Object) (byte) 100);
        experiment.util.Set set19 = treeMapTestDriver0.keySet();
        treeMapTestDriver0.clear();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(comparator15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set19);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test449");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) (-1));
        experiment.util.TreeMapTestDriver treeMapTestDriver5 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj7 = treeMapTestDriver5.get((java.lang.Object) 100);
        experiment.util.Comparator comparator8 = treeMapTestDriver5.comparator();
        boolean boolean10 = treeMapTestDriver5.containsKey((java.lang.Object) (-1));
        boolean boolean12 = treeMapTestDriver5.containsKey((java.lang.Object) 10.0d);
        treeMapTestDriver5.clear();
        experiment.util.Set set14 = treeMapTestDriver5.entrySet();
        experiment.util.Set set15 = treeMapTestDriver5.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver17 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj19 = treeMapTestDriver17.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj21 = treeMapTestDriver17.remove((java.lang.Object) 0.0f);
        boolean boolean22 = treeMapTestDriver17.isEmpty();
        experiment.util.Collection collection23 = treeMapTestDriver17.values();
        treeMapTestDriver17.clear();
        boolean boolean25 = treeMapTestDriver17.isEmpty();
        java.lang.Object obj26 = treeMapTestDriver5.put((java.lang.Object) 100.0f, (java.lang.Object) boolean25);
        experiment.util.Collection collection27 = treeMapTestDriver5.values();
        experiment.util.Set set28 = treeMapTestDriver5.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver29 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj31 = treeMapTestDriver29.remove((java.lang.Object) (byte) -1);
        treeMapTestDriver29.clear();
        experiment.util.Set set33 = treeMapTestDriver29.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = treeMapTestDriver0.put((java.lang.Object) treeMapTestDriver5, (java.lang.Object) set33);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(comparator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set33);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test450");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        experiment.util.Set set6 = treeMapTestDriver0.keySet();
        experiment.util.Set set7 = treeMapTestDriver0.entrySet();
        boolean boolean8 = treeMapTestDriver0.isEmpty();
        treeMapTestDriver0.clear();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test451");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test452");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) (-1));
        treeMapTestDriver0.clear();
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        experiment.util.Comparator comparator7 = treeMapTestDriver0.comparator();
        java.lang.Class<?> wildcardClass8 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(comparator7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test453");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 1L);
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.Collection collection8 = treeMapTestDriver0.values();
        int int9 = treeMapTestDriver0.size();
        experiment.util.Set set10 = treeMapTestDriver0.keySet();
        boolean boolean11 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = treeMapTestDriver0.get(obj12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test454");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) (-1));
        boolean boolean7 = treeMapTestDriver0.containsKey((java.lang.Object) 10.0d);
        treeMapTestDriver0.clear();
        experiment.util.Set set9 = treeMapTestDriver0.entrySet();
        java.lang.Class<?> wildcardClass10 = set9.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test455");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        experiment.util.Set set5 = treeMapTestDriver0.keySet();
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) (byte) 1);
        experiment.util.Set set8 = treeMapTestDriver0.entrySet();
        experiment.util.Set set9 = treeMapTestDriver0.entrySet();
        java.lang.Class<?> wildcardClass10 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test456");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj10 = treeMapTestDriver0.put((java.lang.Object) (byte) -1, (java.lang.Object) treeMapTestDriver9);
        experiment.util.Comparator comparator11 = treeMapTestDriver9.comparator();
        treeMapTestDriver9.clear();
        boolean boolean13 = treeMapTestDriver9.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test457");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) (-1));
        experiment.util.Set set5 = treeMapTestDriver0.entrySet();
        experiment.util.Set set6 = treeMapTestDriver0.keySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test458");
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
        boolean boolean18 = treeMapTestDriver0.isEmpty();
        boolean boolean19 = treeMapTestDriver0.isEmpty();
        experiment.util.Set set20 = treeMapTestDriver0.keySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(comparator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(set20);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test459");
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
        boolean boolean12 = treeMapTestDriver0.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(comparator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test460");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        experiment.util.Set set6 = treeMapTestDriver0.keySet();
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.Comparator comparator8 = treeMapTestDriver0.comparator();
        experiment.util.Set set9 = treeMapTestDriver0.keySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(comparator8);
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test461");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 100);
        treeMapTestDriver0.clear();
        experiment.util.Collection collection8 = treeMapTestDriver0.values();
        experiment.util.Comparator comparator9 = treeMapTestDriver0.comparator();
        experiment.util.Set set10 = treeMapTestDriver0.keySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertNotNull(set10);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test462");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 100);
        treeMapTestDriver0.clear();
        experiment.util.Comparator comparator8 = treeMapTestDriver0.comparator();
        int int9 = treeMapTestDriver0.size();
        int int10 = treeMapTestDriver0.size();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(comparator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test463");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 1L);
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.Collection collection8 = treeMapTestDriver0.values();
        int int9 = treeMapTestDriver0.size();
        treeMapTestDriver0.clear();
        experiment.util.Set set11 = treeMapTestDriver0.entrySet();
        treeMapTestDriver0.clear();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(set11);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test464");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver6 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj8 = treeMapTestDriver6.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = treeMapTestDriver6.remove((java.lang.Object) 0.0f);
        boolean boolean11 = treeMapTestDriver6.isEmpty();
        experiment.util.Collection collection12 = treeMapTestDriver6.values();
        int int13 = treeMapTestDriver6.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver14 = new experiment.util.TreeMapTestDriver();
        experiment.util.Comparator comparator15 = treeMapTestDriver14.comparator();
        boolean boolean17 = treeMapTestDriver14.containsKey((java.lang.Object) 10);
        experiment.util.TreeMapTestDriver treeMapTestDriver18 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj20 = treeMapTestDriver18.get((java.lang.Object) 100);
        experiment.util.Comparator comparator21 = treeMapTestDriver18.comparator();
        experiment.util.Set set22 = treeMapTestDriver18.entrySet();
        java.lang.Object obj23 = treeMapTestDriver6.put((java.lang.Object) 10, (java.lang.Object) set22);
        boolean boolean24 = treeMapTestDriver6.isEmpty();
        boolean boolean25 = treeMapTestDriver0.containsKey((java.lang.Object) boolean24);
        boolean boolean26 = treeMapTestDriver0.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(comparator15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(comparator21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test465");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 1L);
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.Collection collection8 = treeMapTestDriver0.values();
        experiment.util.Set set9 = treeMapTestDriver0.keySet();
        int int10 = treeMapTestDriver0.size();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test466");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 100);
        treeMapTestDriver0.clear();
        experiment.util.Comparator comparator8 = treeMapTestDriver0.comparator();
        int int9 = treeMapTestDriver0.size();
        treeMapTestDriver0.clear();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(comparator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test467");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) 100);
        experiment.util.Set set8 = treeMapTestDriver0.entrySet();
        boolean boolean9 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection10 = treeMapTestDriver0.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver11 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj13 = treeMapTestDriver11.get((java.lang.Object) 100);
        experiment.util.Comparator comparator14 = treeMapTestDriver11.comparator();
        boolean boolean16 = treeMapTestDriver11.containsKey((java.lang.Object) (-1));
        boolean boolean18 = treeMapTestDriver11.containsKey((java.lang.Object) 10.0d);
        treeMapTestDriver11.clear();
        experiment.util.Set set20 = treeMapTestDriver11.entrySet();
        experiment.util.Set set21 = treeMapTestDriver11.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver23 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj25 = treeMapTestDriver23.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj27 = treeMapTestDriver23.remove((java.lang.Object) 0.0f);
        boolean boolean28 = treeMapTestDriver23.isEmpty();
        experiment.util.Collection collection29 = treeMapTestDriver23.values();
        treeMapTestDriver23.clear();
        boolean boolean31 = treeMapTestDriver23.isEmpty();
        java.lang.Object obj32 = treeMapTestDriver11.put((java.lang.Object) 100.0f, (java.lang.Object) boolean31);
        experiment.util.Collection collection33 = treeMapTestDriver11.values();
        experiment.util.Set set34 = treeMapTestDriver11.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(comparator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(set34);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test468");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        treeMapTestDriver0.clear();
        experiment.util.Comparator comparator7 = treeMapTestDriver0.comparator();
        experiment.util.Set set8 = treeMapTestDriver0.entrySet();
        java.lang.Class<?> wildcardClass9 = set8.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(comparator7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test469");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 100);
        java.lang.Object obj8 = treeMapTestDriver0.remove((java.lang.Object) 10.0f);
        experiment.util.Collection collection9 = treeMapTestDriver0.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver10 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj12 = treeMapTestDriver10.get((java.lang.Object) 100);
        experiment.util.Comparator comparator13 = treeMapTestDriver10.comparator();
        experiment.util.Set set14 = treeMapTestDriver10.entrySet();
        experiment.util.Collection collection15 = treeMapTestDriver10.values();
        boolean boolean16 = treeMapTestDriver10.isEmpty();
        treeMapTestDriver10.clear();
        int int18 = treeMapTestDriver10.size();
        java.lang.Class<?> wildcardClass19 = treeMapTestDriver10.getClass();
        experiment.util.TreeMapTestDriver treeMapTestDriver20 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj22 = treeMapTestDriver20.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj24 = treeMapTestDriver20.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection25 = treeMapTestDriver20.values();
        experiment.util.Set set26 = treeMapTestDriver20.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = treeMapTestDriver0.put((java.lang.Object) treeMapTestDriver10, (java.lang.Object) set26);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(comparator13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(set26);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test470");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) (-1));
        experiment.util.Set set5 = treeMapTestDriver0.entrySet();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        experiment.util.Set set7 = treeMapTestDriver0.entrySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test471");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        treeMapTestDriver0.clear();
        treeMapTestDriver0.clear();
        experiment.util.Comparator comparator8 = treeMapTestDriver0.comparator();
        treeMapTestDriver0.clear();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(comparator8);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test472");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.Collection collection8 = treeMapTestDriver0.values();
        boolean boolean9 = treeMapTestDriver0.isEmpty();
        boolean boolean10 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection11 = treeMapTestDriver0.values();
        boolean boolean12 = treeMapTestDriver0.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test473");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        experiment.util.Set set5 = treeMapTestDriver0.keySet();
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) (byte) 1);
        int int8 = treeMapTestDriver0.size();
        int int9 = treeMapTestDriver0.size();
        int int10 = treeMapTestDriver0.size();
        experiment.util.Set set11 = treeMapTestDriver0.entrySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(set11);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test474");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        experiment.util.Comparator comparator6 = treeMapTestDriver0.comparator();
        boolean boolean8 = treeMapTestDriver0.containsKey((java.lang.Object) 1.0f);
        experiment.util.Collection collection9 = treeMapTestDriver0.values();
        experiment.util.Comparator comparator10 = treeMapTestDriver0.comparator();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(comparator10);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test475");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 1L);
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.Set set8 = treeMapTestDriver0.entrySet();
        experiment.util.Collection collection9 = treeMapTestDriver0.values();
        experiment.util.Collection collection10 = treeMapTestDriver0.values();
        int int11 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver12 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj14 = treeMapTestDriver12.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj16 = treeMapTestDriver12.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection17 = treeMapTestDriver12.values();
        experiment.util.Collection collection18 = treeMapTestDriver12.values();
        experiment.util.Set set19 = treeMapTestDriver12.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver21 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj22 = treeMapTestDriver12.put((java.lang.Object) (byte) -1, (java.lang.Object) treeMapTestDriver21);
        experiment.util.Set set23 = treeMapTestDriver21.keySet();
        experiment.util.Comparator comparator24 = treeMapTestDriver21.comparator();
        experiment.util.Set set25 = treeMapTestDriver21.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = treeMapTestDriver0.containsKey((java.lang.Object) set25);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(comparator24);
        org.junit.Assert.assertNotNull(set25);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test476");
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
        java.lang.Object obj15 = treeMapTestDriver11.remove((java.lang.Object) 0.0f);
        boolean boolean16 = treeMapTestDriver11.isEmpty();
        experiment.util.Collection collection17 = treeMapTestDriver11.values();
        experiment.util.Set set18 = treeMapTestDriver11.keySet();
        int int19 = treeMapTestDriver11.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver20 = new experiment.util.TreeMapTestDriver();
        experiment.util.Comparator comparator21 = treeMapTestDriver20.comparator();
        boolean boolean23 = treeMapTestDriver20.containsKey((java.lang.Object) 10);
        int int24 = treeMapTestDriver20.size();
        experiment.util.Set set25 = treeMapTestDriver20.keySet();
        java.lang.Object obj26 = treeMapTestDriver9.put((java.lang.Object) int19, (java.lang.Object) treeMapTestDriver20);
        treeMapTestDriver9.clear();
        experiment.util.Comparator comparator28 = treeMapTestDriver9.comparator();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(comparator21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(comparator28);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test477");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) 100);
        boolean boolean8 = treeMapTestDriver0.isEmpty();
        experiment.util.Comparator comparator9 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator10 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver11 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj13 = treeMapTestDriver11.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator14 = treeMapTestDriver11.comparator();
        boolean boolean16 = treeMapTestDriver11.containsKey((java.lang.Object) 1L);
        boolean boolean17 = treeMapTestDriver11.isEmpty();
        experiment.util.Collection collection18 = treeMapTestDriver11.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = treeMapTestDriver0.get((java.lang.Object) collection18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(comparator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test478");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) (-1));
        treeMapTestDriver0.clear();
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj9 = treeMapTestDriver7.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator10 = treeMapTestDriver7.comparator();
        experiment.util.Set set11 = treeMapTestDriver7.entrySet();
        java.lang.Object obj13 = treeMapTestDriver7.get((java.lang.Object) 100);
        treeMapTestDriver7.clear();
        experiment.util.Comparator comparator15 = treeMapTestDriver7.comparator();
        int int16 = treeMapTestDriver7.size();
        java.lang.Object obj18 = treeMapTestDriver0.put((java.lang.Object) int16, (java.lang.Object) (byte) 100);
        experiment.util.Set set19 = treeMapTestDriver0.keySet();
        int int20 = treeMapTestDriver0.size();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(comparator15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test479");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.Collection collection8 = treeMapTestDriver0.values();
        experiment.util.Collection collection9 = treeMapTestDriver0.values();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test480");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        int int4 = treeMapTestDriver0.size();
        treeMapTestDriver0.clear();
        experiment.util.Set set6 = treeMapTestDriver0.entrySet();
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        treeMapTestDriver0.clear();
        experiment.util.Set set9 = treeMapTestDriver0.keySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test481");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) 100);
        boolean boolean8 = treeMapTestDriver0.isEmpty();
        experiment.util.Comparator comparator9 = treeMapTestDriver0.comparator();
        experiment.util.Collection collection10 = treeMapTestDriver0.values();
        experiment.util.Comparator comparator11 = treeMapTestDriver0.comparator();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(comparator11);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test482");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        experiment.util.Comparator comparator6 = treeMapTestDriver0.comparator();
        boolean boolean8 = treeMapTestDriver0.containsKey((java.lang.Object) 1.0f);
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj11 = treeMapTestDriver9.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj13 = treeMapTestDriver9.remove((java.lang.Object) 0.0f);
        java.lang.Object obj15 = treeMapTestDriver9.get((java.lang.Object) 1L);
        experiment.util.Set set16 = treeMapTestDriver9.keySet();
        experiment.util.Set set17 = treeMapTestDriver9.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver18 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj20 = treeMapTestDriver18.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator21 = treeMapTestDriver18.comparator();
        boolean boolean23 = treeMapTestDriver18.containsKey((java.lang.Object) 1L);
        boolean boolean24 = treeMapTestDriver18.isEmpty();
        int int25 = treeMapTestDriver18.size();
        experiment.util.Set set26 = treeMapTestDriver18.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = treeMapTestDriver0.put((java.lang.Object) set17, (java.lang.Object) treeMapTestDriver18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(comparator21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(set26);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test483");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        boolean boolean7 = treeMapTestDriver0.isEmpty();
        experiment.util.Comparator comparator8 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj11 = treeMapTestDriver9.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator12 = treeMapTestDriver9.comparator();
        experiment.util.Set set13 = treeMapTestDriver9.entrySet();
        experiment.util.Set set14 = treeMapTestDriver9.keySet();
        java.lang.Object obj16 = treeMapTestDriver9.remove((java.lang.Object) (byte) 1);
        int int17 = treeMapTestDriver9.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver18 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj20 = treeMapTestDriver18.get((java.lang.Object) 100);
        experiment.util.Comparator comparator21 = treeMapTestDriver18.comparator();
        int int22 = treeMapTestDriver18.size();
        boolean boolean23 = treeMapTestDriver18.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver24 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj26 = treeMapTestDriver24.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj28 = treeMapTestDriver24.remove((java.lang.Object) (-1));
        treeMapTestDriver24.clear();
        boolean boolean30 = treeMapTestDriver24.isEmpty();
        experiment.util.Set set31 = treeMapTestDriver24.entrySet();
        java.lang.Object obj32 = treeMapTestDriver9.put((java.lang.Object) boolean23, (java.lang.Object) treeMapTestDriver24);
        int int33 = treeMapTestDriver24.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver24);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
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
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(comparator21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test484");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.containsKey((java.lang.Object) 1L);
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        boolean boolean8 = treeMapTestDriver0.isEmpty();
        int int9 = treeMapTestDriver0.size();
        treeMapTestDriver0.clear();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test485");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        experiment.util.Set set5 = treeMapTestDriver0.keySet();
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) true);
        experiment.util.Collection collection8 = treeMapTestDriver0.values();
        experiment.util.Set set9 = treeMapTestDriver0.entrySet();
        experiment.util.Collection collection10 = treeMapTestDriver0.values();
        boolean boolean11 = treeMapTestDriver0.isEmpty();
        treeMapTestDriver0.clear();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test486");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator4 = treeMapTestDriver0.comparator();
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        treeMapTestDriver0.clear();
        boolean boolean7 = treeMapTestDriver0.isEmpty();
        experiment.util.Set set8 = treeMapTestDriver0.entrySet();
        experiment.util.Set set9 = treeMapTestDriver0.keySet();
        java.lang.Class<?> wildcardClass10 = set9.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test487");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 1L);
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.Set set8 = treeMapTestDriver0.entrySet();
        experiment.util.Comparator comparator9 = treeMapTestDriver0.comparator();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(comparator9);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test488");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        treeMapTestDriver0.clear();
        int int8 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj11 = treeMapTestDriver9.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj13 = treeMapTestDriver9.remove((java.lang.Object) 0.0f);
        boolean boolean14 = treeMapTestDriver9.isEmpty();
        experiment.util.Comparator comparator15 = treeMapTestDriver9.comparator();
        boolean boolean17 = treeMapTestDriver9.containsKey((java.lang.Object) 1.0f);
        experiment.util.Set set18 = treeMapTestDriver9.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = treeMapTestDriver0.remove((java.lang.Object) set18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(comparator15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(set18);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test489");
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
        experiment.util.Comparator comparator15 = treeMapTestDriver0.comparator();
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
        org.junit.Assert.assertNull(comparator15);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test490");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver5 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj7 = treeMapTestDriver5.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator8 = treeMapTestDriver5.comparator();
        experiment.util.Set set9 = treeMapTestDriver5.entrySet();
        experiment.util.Set set10 = treeMapTestDriver5.keySet();
        java.lang.Object obj12 = treeMapTestDriver5.remove((java.lang.Object) (byte) 1);
        int int13 = treeMapTestDriver5.size();
        int int14 = treeMapTestDriver5.size();
        boolean boolean15 = treeMapTestDriver5.isEmpty();
        treeMapTestDriver5.clear();
        boolean boolean17 = treeMapTestDriver5.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver18 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj20 = treeMapTestDriver18.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj22 = treeMapTestDriver18.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection23 = treeMapTestDriver18.values();
        java.lang.Object obj24 = treeMapTestDriver0.put((java.lang.Object) boolean17, (java.lang.Object) treeMapTestDriver18);
        experiment.util.TreeMapTestDriver treeMapTestDriver25 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj27 = treeMapTestDriver25.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator28 = treeMapTestDriver25.comparator();
        experiment.util.Set set29 = treeMapTestDriver25.entrySet();
        java.lang.Object obj31 = treeMapTestDriver25.get((java.lang.Object) 100);
        treeMapTestDriver25.clear();
        treeMapTestDriver25.clear();
        boolean boolean34 = treeMapTestDriver25.isEmpty();
        experiment.util.Comparator comparator35 = treeMapTestDriver25.comparator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean36 = treeMapTestDriver18.containsKey((java.lang.Object) comparator35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(comparator8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(comparator28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(comparator35);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test491");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.Comparator comparator8 = treeMapTestDriver0.comparator();
        boolean boolean9 = treeMapTestDriver0.isEmpty();
        experiment.util.Set set10 = treeMapTestDriver0.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver11 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj13 = treeMapTestDriver11.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj15 = treeMapTestDriver11.remove((java.lang.Object) (-1));
        treeMapTestDriver11.clear();
        boolean boolean17 = treeMapTestDriver11.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver18 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj20 = treeMapTestDriver18.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator21 = treeMapTestDriver18.comparator();
        experiment.util.Set set22 = treeMapTestDriver18.entrySet();
        java.lang.Object obj24 = treeMapTestDriver18.get((java.lang.Object) 100);
        treeMapTestDriver18.clear();
        experiment.util.Comparator comparator26 = treeMapTestDriver18.comparator();
        int int27 = treeMapTestDriver18.size();
        java.lang.Object obj29 = treeMapTestDriver11.put((java.lang.Object) int27, (java.lang.Object) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = treeMapTestDriver0.get(obj29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(comparator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(comparator21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(comparator26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test492");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean5 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection6 = treeMapTestDriver0.values();
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        int int8 = treeMapTestDriver0.size();
        treeMapTestDriver0.clear();
        experiment.util.Comparator comparator10 = treeMapTestDriver0.comparator();
        experiment.util.Set set11 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver12 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj14 = treeMapTestDriver12.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj16 = treeMapTestDriver12.remove((java.lang.Object) 0.0f);
        experiment.util.Collection collection17 = treeMapTestDriver12.values();
        experiment.util.Comparator comparator18 = treeMapTestDriver12.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(comparator18);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test493");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 1L);
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.Collection collection8 = treeMapTestDriver0.values();
        int int9 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver10 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj12 = treeMapTestDriver10.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator13 = treeMapTestDriver10.comparator();
        boolean boolean15 = treeMapTestDriver10.containsKey((java.lang.Object) 1L);
        boolean boolean16 = treeMapTestDriver10.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver17 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj19 = treeMapTestDriver17.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator20 = treeMapTestDriver17.comparator();
        experiment.util.Set set21 = treeMapTestDriver17.entrySet();
        experiment.util.Set set22 = treeMapTestDriver17.keySet();
        java.lang.Object obj24 = treeMapTestDriver17.remove((java.lang.Object) (byte) 1);
        int int25 = treeMapTestDriver17.size();
        int int26 = treeMapTestDriver17.size();
        boolean boolean27 = treeMapTestDriver17.isEmpty();
        experiment.util.Collection collection28 = treeMapTestDriver17.values();
        java.lang.Object obj29 = treeMapTestDriver0.put((java.lang.Object) boolean16, (java.lang.Object) treeMapTestDriver17);
        experiment.util.Set set30 = treeMapTestDriver0.entrySet();
        experiment.util.Collection collection31 = treeMapTestDriver0.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver32 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj34 = treeMapTestDriver32.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj36 = treeMapTestDriver32.remove((java.lang.Object) 0.0f);
        java.lang.Object obj38 = treeMapTestDriver32.get((java.lang.Object) 1L);
        experiment.util.Set set39 = treeMapTestDriver32.keySet();
        experiment.util.Collection collection40 = treeMapTestDriver32.values();
        int int41 = treeMapTestDriver32.size();
        experiment.util.Set set42 = treeMapTestDriver32.keySet();
        boolean boolean43 = treeMapTestDriver32.isEmpty();
        treeMapTestDriver32.clear();
        int int45 = treeMapTestDriver32.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver46 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set47 = treeMapTestDriver46.keySet();
        experiment.util.Comparator comparator48 = treeMapTestDriver46.comparator();
        experiment.util.Set set49 = treeMapTestDriver46.entrySet();
        java.lang.Object obj51 = treeMapTestDriver46.remove((java.lang.Object) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj52 = treeMapTestDriver0.put((java.lang.Object) treeMapTestDriver32, obj51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(comparator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(comparator20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNull(comparator48);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNull(obj51);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test494");
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
        experiment.util.Comparator comparator18 = treeMapTestDriver0.comparator();
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
        org.junit.Assert.assertNull(comparator18);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test495");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 100);
        java.lang.Object obj8 = treeMapTestDriver0.remove((java.lang.Object) 10.0f);
        experiment.util.Set set9 = treeMapTestDriver0.entrySet();
        experiment.util.Comparator comparator10 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator11 = treeMapTestDriver0.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = comparator11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertNull(comparator11);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test496");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        experiment.util.Set set5 = treeMapTestDriver0.keySet();
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) (byte) 1);
        int int8 = treeMapTestDriver0.size();
        int int9 = treeMapTestDriver0.size();
        boolean boolean10 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection11 = treeMapTestDriver0.values();
        experiment.util.Collection collection12 = treeMapTestDriver0.values();
        treeMapTestDriver0.clear();
        boolean boolean14 = treeMapTestDriver0.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test497");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 0.0f);
        java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) 1L);
        experiment.util.Set set7 = treeMapTestDriver0.keySet();
        experiment.util.Collection collection8 = treeMapTestDriver0.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj11 = treeMapTestDriver9.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator12 = treeMapTestDriver9.comparator();
        experiment.util.Set set13 = treeMapTestDriver9.entrySet();
        experiment.util.Set set14 = treeMapTestDriver9.keySet();
        java.lang.Object obj16 = treeMapTestDriver9.remove((java.lang.Object) (byte) 1);
        int int17 = treeMapTestDriver9.size();
        experiment.util.Collection collection18 = treeMapTestDriver9.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = treeMapTestDriver0.get((java.lang.Object) collection18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test498");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        experiment.util.Set set4 = treeMapTestDriver0.entrySet();
        experiment.util.Set set5 = treeMapTestDriver0.keySet();
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) (byte) 1);
        experiment.util.Set set8 = treeMapTestDriver0.entrySet();
        boolean boolean9 = treeMapTestDriver0.isEmpty();
        experiment.util.Set set10 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver11 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj13 = treeMapTestDriver11.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj15 = treeMapTestDriver11.remove((java.lang.Object) 0.0f);
        boolean boolean16 = treeMapTestDriver11.isEmpty();
        experiment.util.Comparator comparator17 = treeMapTestDriver11.comparator();
        boolean boolean19 = treeMapTestDriver11.containsKey((java.lang.Object) 1.0f);
        experiment.util.TreeMapTestDriver treeMapTestDriver20 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj22 = treeMapTestDriver20.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj24 = treeMapTestDriver20.remove((java.lang.Object) (-1));
        treeMapTestDriver20.clear();
        boolean boolean26 = treeMapTestDriver20.isEmpty();
        java.lang.Object obj27 = treeMapTestDriver11.get((java.lang.Object) boolean26);
        experiment.util.Set set28 = treeMapTestDriver11.entrySet();
        experiment.util.Set set29 = treeMapTestDriver11.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(comparator17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(set29);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test499");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        int int4 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver5 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj7 = treeMapTestDriver5.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj9 = treeMapTestDriver5.remove((java.lang.Object) (-1));
        treeMapTestDriver5.clear();
        experiment.util.Collection collection11 = treeMapTestDriver5.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_54676380_1024_0.test500");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.get((java.lang.Object) 100);
        experiment.util.Comparator comparator3 = treeMapTestDriver0.comparator();
        int int4 = treeMapTestDriver0.size();
        treeMapTestDriver0.clear();
        experiment.util.Comparator comparator6 = treeMapTestDriver0.comparator();
        java.lang.Class<?> wildcardClass7 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }
}
