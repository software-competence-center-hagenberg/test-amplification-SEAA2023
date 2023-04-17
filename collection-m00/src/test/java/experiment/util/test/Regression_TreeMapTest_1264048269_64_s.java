package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_TreeMapTest_1264048269_64_s {

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
            System.out.format("%n%s%n", "Regression_TreeMapTest_1264048269_1024_0.test001");
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
            System.out.format("%n%s%n", "Regression_TreeMapTest_1264048269_1024_0.test002");
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
            System.out.format("%n%s%n", "Regression_TreeMapTest_1264048269_1024_0.test003");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) '4');
        java.lang.Class<?> wildcardClass3 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1264048269_1024_0.test004");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) '4');
        boolean boolean3 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj5 = treeMapTestDriver0.get((java.lang.Object) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = obj5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1264048269_1024_0.test005");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver0.clear();
        java.lang.Class<?> wildcardClass2 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1264048269_1024_0.test006");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = treeMapTestDriver0.get(obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1264048269_1024_0.test007");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver0.clear();
        experiment.util.Set set2 = treeMapTestDriver0.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver3 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj5 = treeMapTestDriver3.remove((java.lang.Object) '4');
        boolean boolean6 = treeMapTestDriver3.isEmpty();
        java.lang.Object obj7 = treeMapTestDriver0.get((java.lang.Object) boolean6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = obj7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1264048269_1024_0.test008");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean2 = treeMapTestDriver0.containsKey((java.lang.Object) 100L);
        experiment.util.TreeMapTestDriver treeMapTestDriver3 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj5 = treeMapTestDriver3.remove((java.lang.Object) '4');
        boolean boolean6 = treeMapTestDriver3.isEmpty();
        experiment.util.Collection collection7 = treeMapTestDriver3.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1264048269_1024_0.test009");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver0.clear();
        experiment.util.Set set2 = treeMapTestDriver0.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver3 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj5 = treeMapTestDriver3.remove((java.lang.Object) '4');
        boolean boolean6 = treeMapTestDriver3.isEmpty();
        java.lang.Object obj7 = treeMapTestDriver0.get((java.lang.Object) boolean6);
        experiment.util.Comparator comparator8 = treeMapTestDriver0.comparator();
        java.lang.Object obj9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = treeMapTestDriver0.containsKey(obj9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(comparator8);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1264048269_1024_0.test010");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) '4');
        experiment.util.TreeMapTestDriver treeMapTestDriver3 = new experiment.util.TreeMapTestDriver();
        experiment.util.Comparator comparator4 = treeMapTestDriver3.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = treeMapTestDriver0.remove((java.lang.Object) comparator4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator4);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1264048269_1024_0.test011");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Comparator comparator1 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver2 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj4 = treeMapTestDriver2.remove((java.lang.Object) '4');
        boolean boolean5 = treeMapTestDriver2.isEmpty();
        experiment.util.Collection collection6 = treeMapTestDriver2.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1264048269_1024_0.test012");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) '4');
        boolean boolean3 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj5 = treeMapTestDriver0.get((java.lang.Object) (byte) 10);
        treeMapTestDriver0.clear();
        int int7 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator8 = treeMapTestDriver0.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = comparator8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(comparator8);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1264048269_1024_0.test013");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Collection collection1 = treeMapTestDriver0.values();
        java.lang.Class<?> wildcardClass2 = collection1.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1264048269_1024_0.test014");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean2 = treeMapTestDriver0.containsKey((java.lang.Object) 100L);
        experiment.util.TreeMapTestDriver treeMapTestDriver3 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj5 = treeMapTestDriver3.remove((java.lang.Object) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1264048269_1024_0.test015");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) '4');
        boolean boolean3 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver4 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj6 = treeMapTestDriver4.remove((java.lang.Object) '4');
        boolean boolean7 = treeMapTestDriver4.isEmpty();
        java.lang.Object obj9 = treeMapTestDriver4.get((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = treeMapTestDriver0.get((java.lang.Object) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = obj10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1264048269_1024_0.test016");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) '4');
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = treeMapTestDriver0.get(obj3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1264048269_1024_0.test017");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) '4');
        boolean boolean3 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection4 = treeMapTestDriver0.values();
        experiment.util.Set set5 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver6 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver6.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1264048269_1024_0.test018");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) '4');
        boolean boolean3 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection4 = treeMapTestDriver0.values();
        experiment.util.Set set5 = treeMapTestDriver0.keySet();
        experiment.util.Comparator comparator6 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj9 = treeMapTestDriver7.remove((java.lang.Object) '4');
        boolean boolean10 = treeMapTestDriver7.isEmpty();
        experiment.util.Collection collection11 = treeMapTestDriver7.values();
        experiment.util.Set set12 = treeMapTestDriver7.keySet();
        experiment.util.Comparator comparator13 = treeMapTestDriver7.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = treeMapTestDriver0.put((java.lang.Object) treeMapTestDriver7, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(comparator13);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1264048269_1024_0.test019");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) '4');
        boolean boolean3 = treeMapTestDriver0.isEmpty();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = treeMapTestDriver0.remove(obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1264048269_1024_0.test020");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        boolean boolean2 = treeMapTestDriver0.containsKey((java.lang.Object) 100L);
        experiment.util.TreeMapTestDriver treeMapTestDriver3 = new experiment.util.TreeMapTestDriver();
        boolean boolean5 = treeMapTestDriver3.containsKey((java.lang.Object) 100L);
        java.lang.Class<?> wildcardClass6 = treeMapTestDriver3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1264048269_1024_0.test021");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = treeMapTestDriver0.remove(obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Object cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1264048269_1024_0.test022");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) '4');
        boolean boolean3 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj5 = treeMapTestDriver0.get((java.lang.Object) (byte) 10);
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj9 = treeMapTestDriver7.remove((java.lang.Object) '4');
        boolean boolean10 = treeMapTestDriver7.isEmpty();
        java.lang.Object obj12 = treeMapTestDriver7.get((java.lang.Object) (byte) 10);
        treeMapTestDriver7.clear();
        int int14 = treeMapTestDriver7.size();
        experiment.util.Comparator comparator15 = treeMapTestDriver7.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(comparator15);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1264048269_1024_0.test023");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) '4');
        boolean boolean3 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj5 = treeMapTestDriver0.get((java.lang.Object) (byte) 10);
        treeMapTestDriver0.clear();
        int int7 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator8 = treeMapTestDriver0.comparator();
        experiment.util.Comparator comparator9 = treeMapTestDriver0.comparator();
        java.lang.Object obj12 = treeMapTestDriver0.put((java.lang.Object) (short) 1, (java.lang.Object) (byte) 10);
        experiment.util.TreeMapTestDriver treeMapTestDriver13 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj15 = treeMapTestDriver13.remove((java.lang.Object) '4');
        boolean boolean16 = treeMapTestDriver13.isEmpty();
        java.lang.Object obj18 = treeMapTestDriver13.get((java.lang.Object) (byte) 10);
        treeMapTestDriver13.clear();
        experiment.util.Set set20 = treeMapTestDriver13.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver21 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj23 = treeMapTestDriver21.remove((java.lang.Object) '4');
        boolean boolean24 = treeMapTestDriver21.isEmpty();
        java.lang.Object obj26 = treeMapTestDriver21.get((java.lang.Object) (byte) 10);
        treeMapTestDriver21.clear();
        int int28 = treeMapTestDriver21.size();
        experiment.util.Comparator comparator29 = treeMapTestDriver21.comparator();
        experiment.util.Comparator comparator30 = treeMapTestDriver21.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = treeMapTestDriver0.put((java.lang.Object) set20, (java.lang.Object) comparator30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(comparator8);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(comparator29);
        org.junit.Assert.assertNull(comparator30);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1264048269_1024_0.test024");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver2 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj4 = treeMapTestDriver2.remove((java.lang.Object) '4');
        boolean boolean5 = treeMapTestDriver2.isEmpty();
        java.lang.Object obj7 = treeMapTestDriver2.get((java.lang.Object) (byte) 10);
        treeMapTestDriver2.clear();
        int int9 = treeMapTestDriver2.size();
        experiment.util.Set set10 = treeMapTestDriver2.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = treeMapTestDriver0.remove((java.lang.Object) set10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(set10);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1264048269_1024_0.test025");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.TreeMapTestDriver treeMapTestDriver1 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj3 = treeMapTestDriver1.remove((java.lang.Object) '4');
        boolean boolean4 = treeMapTestDriver1.isEmpty();
        experiment.util.Collection collection5 = treeMapTestDriver1.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(collection5);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1264048269_1024_0.test026");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Comparator comparator1 = treeMapTestDriver0.comparator();
        experiment.util.Set set2 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver3 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver3.clear();
        experiment.util.Set set5 = treeMapTestDriver3.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = treeMapTestDriver0.get((java.lang.Object) set5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1264048269_1024_0.test027");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver0.clear();
        int int2 = treeMapTestDriver0.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver3 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj5 = treeMapTestDriver3.remove((java.lang.Object) '4');
        boolean boolean6 = treeMapTestDriver3.isEmpty();
        boolean boolean7 = treeMapTestDriver3.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver8 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set9 = treeMapTestDriver8.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = treeMapTestDriver0.put((java.lang.Object) treeMapTestDriver3, (java.lang.Object) set9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1264048269_1024_0.test028");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Collection collection1 = treeMapTestDriver0.values();
        experiment.util.Set set2 = treeMapTestDriver0.keySet();
        experiment.util.Collection collection3 = treeMapTestDriver0.values();
        java.lang.Class<?> wildcardClass4 = collection3.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1264048269_1024_0.test029");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Comparator comparator1 = treeMapTestDriver0.comparator();
        experiment.util.Set set2 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver3 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj5 = treeMapTestDriver3.remove((java.lang.Object) '4');
        boolean boolean6 = treeMapTestDriver3.isEmpty();
        java.lang.Object obj8 = treeMapTestDriver3.get((java.lang.Object) (byte) 10);
        treeMapTestDriver3.clear();
        int int10 = treeMapTestDriver3.size();
        experiment.util.Comparator comparator11 = treeMapTestDriver3.comparator();
        experiment.util.Comparator comparator12 = treeMapTestDriver3.comparator();
        experiment.util.Set set13 = treeMapTestDriver3.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver14 = new experiment.util.TreeMapTestDriver();
        experiment.util.Comparator comparator15 = treeMapTestDriver14.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = treeMapTestDriver0.put((java.lang.Object) set13, (java.lang.Object) treeMapTestDriver14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(comparator15);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1264048269_1024_0.test030");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver2 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver2.clear();
        experiment.util.Set set4 = treeMapTestDriver2.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(set4);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1264048269_1024_0.test031");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) '4');
        boolean boolean3 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj5 = treeMapTestDriver0.get((java.lang.Object) (byte) 10);
        treeMapTestDriver0.clear();
        experiment.util.Set set7 = treeMapTestDriver0.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver8 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj10 = treeMapTestDriver8.remove((java.lang.Object) '4');
        boolean boolean11 = treeMapTestDriver8.isEmpty();
        boolean boolean12 = treeMapTestDriver8.isEmpty();
        int int13 = treeMapTestDriver8.size();
        experiment.util.TreeMapTestDriver treeMapTestDriver14 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver14.clear();
        experiment.util.Set set16 = treeMapTestDriver14.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver17 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj19 = treeMapTestDriver17.remove((java.lang.Object) '4');
        boolean boolean20 = treeMapTestDriver17.isEmpty();
        java.lang.Object obj21 = treeMapTestDriver14.get((java.lang.Object) boolean20);
        treeMapTestDriver14.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = treeMapTestDriver0.put((java.lang.Object) treeMapTestDriver8, (java.lang.Object) treeMapTestDriver14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1264048269_1024_0.test032");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver0.clear();
        experiment.util.Set set2 = treeMapTestDriver0.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver3 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj5 = treeMapTestDriver3.remove((java.lang.Object) '4');
        boolean boolean6 = treeMapTestDriver3.isEmpty();
        java.lang.Object obj7 = treeMapTestDriver0.get((java.lang.Object) boolean6);
        experiment.util.Collection collection8 = treeMapTestDriver0.values();
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver10 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver10.clear();
        experiment.util.Set set12 = treeMapTestDriver10.entrySet();
        int int13 = treeMapTestDriver10.size();
        int int14 = treeMapTestDriver10.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1264048269_1024_0.test033");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) '4');
        boolean boolean3 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj5 = treeMapTestDriver0.get((java.lang.Object) (byte) 10);
        experiment.util.Comparator comparator6 = treeMapTestDriver0.comparator();
        java.lang.Object obj8 = treeMapTestDriver0.get((java.lang.Object) 'a');
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        experiment.util.Comparator comparator10 = treeMapTestDriver9.comparator();
        experiment.util.Set set11 = treeMapTestDriver9.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = treeMapTestDriver0.remove((java.lang.Object) set11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertNotNull(set11);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1264048269_1024_0.test034");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver0.clear();
        experiment.util.Set set2 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver3 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj5 = treeMapTestDriver3.remove((java.lang.Object) '4');
        experiment.util.Set set6 = treeMapTestDriver3.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = treeMapTestDriver0.get((java.lang.Object) set6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1264048269_1024_0.test035");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) '4');
        boolean boolean3 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj5 = treeMapTestDriver0.get((java.lang.Object) (byte) 10);
        treeMapTestDriver0.clear();
        int int7 = treeMapTestDriver0.size();
        experiment.util.Set set8 = treeMapTestDriver0.entrySet();
        java.lang.Object obj10 = treeMapTestDriver0.get((java.lang.Object) 100.0f);
        experiment.util.TreeMapTestDriver treeMapTestDriver11 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver11.clear();
        experiment.util.Set set13 = treeMapTestDriver11.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver14 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj16 = treeMapTestDriver14.remove((java.lang.Object) '4');
        boolean boolean17 = treeMapTestDriver14.isEmpty();
        java.lang.Object obj18 = treeMapTestDriver11.get((java.lang.Object) boolean17);
        experiment.util.Set set19 = treeMapTestDriver11.entrySet();
        java.lang.Object obj20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = treeMapTestDriver0.put((java.lang.Object) set19, obj20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set19);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1264048269_1024_0.test036");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) '4');
        boolean boolean3 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj5 = treeMapTestDriver0.get((java.lang.Object) (byte) 10);
        experiment.util.Comparator comparator6 = treeMapTestDriver0.comparator();
        java.lang.Object obj8 = treeMapTestDriver0.get((java.lang.Object) 'a');
        treeMapTestDriver0.clear();
        boolean boolean10 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver11 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj13 = treeMapTestDriver11.remove((java.lang.Object) '4');
        boolean boolean14 = treeMapTestDriver11.isEmpty();
        java.lang.Object obj16 = treeMapTestDriver11.get((java.lang.Object) (byte) 10);
        experiment.util.Comparator comparator17 = treeMapTestDriver11.comparator();
        java.lang.Object obj19 = treeMapTestDriver11.get((java.lang.Object) 'a');
        experiment.util.TreeMapTestDriver treeMapTestDriver20 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj22 = treeMapTestDriver20.remove((java.lang.Object) '4');
        boolean boolean23 = treeMapTestDriver20.isEmpty();
        java.lang.Object obj25 = treeMapTestDriver20.get((java.lang.Object) (byte) 10);
        experiment.util.Comparator comparator26 = treeMapTestDriver20.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = treeMapTestDriver0.put(obj19, (java.lang.Object) comparator26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(comparator17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(comparator26);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1264048269_1024_0.test037");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) '4');
        boolean boolean3 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection4 = treeMapTestDriver0.values();
        experiment.util.Set set5 = treeMapTestDriver0.keySet();
        java.lang.Class<?> wildcardClass6 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1264048269_1024_0.test038");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) '4');
        boolean boolean3 = treeMapTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass4 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1264048269_1024_0.test039");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) '4');
        boolean boolean3 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj5 = treeMapTestDriver0.get((java.lang.Object) (byte) 10);
        experiment.util.Comparator comparator6 = treeMapTestDriver0.comparator();
        java.lang.Object obj8 = treeMapTestDriver0.get((java.lang.Object) 'a');
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        experiment.util.Collection collection10 = treeMapTestDriver9.values();
        experiment.util.Set set11 = treeMapTestDriver9.keySet();
        experiment.util.Collection collection12 = treeMapTestDriver9.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver13 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver13.clear();
        experiment.util.Set set15 = treeMapTestDriver13.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver16 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj18 = treeMapTestDriver16.remove((java.lang.Object) '4');
        boolean boolean19 = treeMapTestDriver16.isEmpty();
        java.lang.Object obj20 = treeMapTestDriver13.get((java.lang.Object) boolean19);
        experiment.util.Collection collection21 = treeMapTestDriver13.values();
        treeMapTestDriver13.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = treeMapTestDriver0.put((java.lang.Object) collection12, (java.lang.Object) treeMapTestDriver13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.ArrayList cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(collection21);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1264048269_1024_0.test040");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Collection collection1 = treeMapTestDriver0.values();
        experiment.util.Set set2 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver3 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj5 = treeMapTestDriver3.remove((java.lang.Object) '4');
        boolean boolean6 = treeMapTestDriver3.isEmpty();
        java.lang.Object obj8 = treeMapTestDriver3.get((java.lang.Object) (byte) 10);
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver9.clear();
        experiment.util.Set set11 = treeMapTestDriver9.entrySet();
        int int12 = treeMapTestDriver9.size();
        java.lang.Object obj13 = treeMapTestDriver3.get((java.lang.Object) int12);
        experiment.util.Comparator comparator14 = treeMapTestDriver3.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(comparator14);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1264048269_1024_0.test041");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Collection collection1 = treeMapTestDriver0.values();
        experiment.util.Set set2 = treeMapTestDriver0.keySet();
        experiment.util.Collection collection3 = treeMapTestDriver0.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver4 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj6 = treeMapTestDriver4.remove((java.lang.Object) '4');
        boolean boolean7 = treeMapTestDriver4.isEmpty();
        java.lang.Object obj9 = treeMapTestDriver4.get((java.lang.Object) (byte) 10);
        treeMapTestDriver4.clear();
        int int11 = treeMapTestDriver4.size();
        experiment.util.Collection collection12 = treeMapTestDriver4.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = treeMapTestDriver0.get((java.lang.Object) collection12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.ArrayList cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1264048269_1024_0.test042");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) '4');
        boolean boolean3 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj5 = treeMapTestDriver0.get((java.lang.Object) (byte) 10);
        experiment.util.Comparator comparator6 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        experiment.util.Collection collection8 = treeMapTestDriver7.values();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = treeMapTestDriver0.containsKey((java.lang.Object) collection8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.ArrayList cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1264048269_1024_0.test043");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) '4');
        boolean boolean3 = treeMapTestDriver0.isEmpty();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver5 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj7 = treeMapTestDriver5.remove((java.lang.Object) '4');
        boolean boolean8 = treeMapTestDriver5.isEmpty();
        java.lang.Object obj10 = treeMapTestDriver5.get((java.lang.Object) (byte) 10);
        treeMapTestDriver5.clear();
        int int12 = treeMapTestDriver5.size();
        experiment.util.Comparator comparator13 = treeMapTestDriver5.comparator();
        experiment.util.Comparator comparator14 = treeMapTestDriver5.comparator();
        experiment.util.Set set15 = treeMapTestDriver5.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(comparator13);
        org.junit.Assert.assertNull(comparator14);
        org.junit.Assert.assertNotNull(set15);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1264048269_1024_0.test044");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) '4');
        boolean boolean3 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj5 = treeMapTestDriver0.get((java.lang.Object) (byte) 10);
        treeMapTestDriver0.clear();
        int int7 = treeMapTestDriver0.size();
        experiment.util.Set set8 = treeMapTestDriver0.entrySet();
        boolean boolean10 = treeMapTestDriver0.containsKey((java.lang.Object) 10);
        experiment.util.TreeMapTestDriver treeMapTestDriver11 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj13 = treeMapTestDriver11.remove((java.lang.Object) '4');
        boolean boolean14 = treeMapTestDriver11.isEmpty();
        java.lang.Object obj16 = treeMapTestDriver11.get((java.lang.Object) (byte) 10);
        experiment.util.Comparator comparator17 = treeMapTestDriver11.comparator();
        java.lang.Object obj19 = treeMapTestDriver11.get((java.lang.Object) 'a');
        treeMapTestDriver11.clear();
        boolean boolean21 = treeMapTestDriver11.isEmpty();
        java.lang.Object obj23 = treeMapTestDriver0.put((java.lang.Object) boolean21, (java.lang.Object) 10);
        java.lang.Class<?> wildcardClass24 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(comparator17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1264048269_1024_0.test045");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) '4');
        boolean boolean3 = treeMapTestDriver0.isEmpty();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = treeMapTestDriver0.put(obj5, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1264048269_1024_0.test046");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) '4');
        boolean boolean3 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj5 = treeMapTestDriver0.get((java.lang.Object) (byte) 10);
        experiment.util.Comparator comparator6 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj9 = treeMapTestDriver7.remove((java.lang.Object) '4');
        boolean boolean10 = treeMapTestDriver7.isEmpty();
        java.lang.Object obj12 = treeMapTestDriver7.get((java.lang.Object) (byte) 10);
        experiment.util.Comparator comparator13 = treeMapTestDriver7.comparator();
        java.lang.Object obj15 = treeMapTestDriver7.get((java.lang.Object) 'a');
        treeMapTestDriver7.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver17 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj19 = treeMapTestDriver17.remove((java.lang.Object) '4');
        boolean boolean20 = treeMapTestDriver17.isEmpty();
        boolean boolean21 = treeMapTestDriver17.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver22 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj24 = treeMapTestDriver22.remove((java.lang.Object) '4');
        boolean boolean25 = treeMapTestDriver22.isEmpty();
        experiment.util.Collection collection26 = treeMapTestDriver22.values();
        java.lang.Object obj27 = treeMapTestDriver7.put((java.lang.Object) boolean21, (java.lang.Object) collection26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = treeMapTestDriver0.get((java.lang.Object) treeMapTestDriver7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(comparator13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1264048269_1024_0.test047");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Comparator comparator1 = treeMapTestDriver0.comparator();
        experiment.util.Set set2 = treeMapTestDriver0.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver3 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj5 = treeMapTestDriver3.remove((java.lang.Object) '4');
        boolean boolean6 = treeMapTestDriver3.isEmpty();
        java.lang.Object obj8 = treeMapTestDriver3.get((java.lang.Object) (byte) 10);
        experiment.util.Comparator comparator9 = treeMapTestDriver3.comparator();
        java.lang.Object obj11 = treeMapTestDriver3.get((java.lang.Object) 'a');
        treeMapTestDriver3.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver13 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj15 = treeMapTestDriver13.remove((java.lang.Object) '4');
        boolean boolean16 = treeMapTestDriver13.isEmpty();
        boolean boolean17 = treeMapTestDriver13.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver18 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj20 = treeMapTestDriver18.remove((java.lang.Object) '4');
        boolean boolean21 = treeMapTestDriver18.isEmpty();
        experiment.util.Collection collection22 = treeMapTestDriver18.values();
        java.lang.Object obj23 = treeMapTestDriver3.put((java.lang.Object) boolean17, (java.lang.Object) collection22);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1264048269_1024_0.test048");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) '4');
        boolean boolean3 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection4 = treeMapTestDriver0.values();
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver6 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj8 = treeMapTestDriver6.remove((java.lang.Object) '4');
        boolean boolean9 = treeMapTestDriver6.isEmpty();
        java.lang.Object obj11 = treeMapTestDriver6.get((java.lang.Object) (byte) 10);
        treeMapTestDriver6.clear();
        int int13 = treeMapTestDriver6.size();
        experiment.util.Set set14 = treeMapTestDriver6.entrySet();
        boolean boolean16 = treeMapTestDriver6.containsKey((java.lang.Object) 10);
        treeMapTestDriver6.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1264048269_1024_0.test049");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) '4');
        boolean boolean3 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj5 = treeMapTestDriver0.get((java.lang.Object) (byte) 10);
        treeMapTestDriver0.clear();
        int int7 = treeMapTestDriver0.size();
        experiment.util.Collection collection8 = treeMapTestDriver0.values();
        java.lang.Object obj9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = treeMapTestDriver0.remove(obj9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1264048269_1024_0.test050");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) '4');
        boolean boolean3 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj5 = treeMapTestDriver0.get((java.lang.Object) (byte) 10);
        treeMapTestDriver0.clear();
        experiment.util.Set set7 = treeMapTestDriver0.entrySet();
        experiment.util.Set set8 = treeMapTestDriver0.keySet();
        experiment.util.Set set9 = treeMapTestDriver0.keySet();
        java.lang.Class<?> wildcardClass10 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1264048269_1024_0.test051");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) '4');
        boolean boolean3 = treeMapTestDriver0.isEmpty();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        experiment.util.Collection collection5 = treeMapTestDriver0.values();
        java.lang.Class<?> wildcardClass6 = treeMapTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1264048269_1024_0.test052");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) '4');
        boolean boolean3 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj5 = treeMapTestDriver0.get((java.lang.Object) (byte) 10);
        treeMapTestDriver0.clear();
        int int7 = treeMapTestDriver0.size();
        experiment.util.Set set8 = treeMapTestDriver0.entrySet();
        boolean boolean10 = treeMapTestDriver0.containsKey((java.lang.Object) 10);
        experiment.util.TreeMapTestDriver treeMapTestDriver11 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj13 = treeMapTestDriver11.remove((java.lang.Object) '4');
        boolean boolean14 = treeMapTestDriver11.isEmpty();
        java.lang.Object obj16 = treeMapTestDriver11.get((java.lang.Object) (byte) 10);
        experiment.util.Comparator comparator17 = treeMapTestDriver11.comparator();
        java.lang.Object obj19 = treeMapTestDriver11.get((java.lang.Object) 'a');
        treeMapTestDriver11.clear();
        boolean boolean21 = treeMapTestDriver11.isEmpty();
        java.lang.Object obj23 = treeMapTestDriver0.put((java.lang.Object) boolean21, (java.lang.Object) 10);
        boolean boolean24 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver25 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver25.clear();
        experiment.util.Set set27 = treeMapTestDriver25.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver28 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj30 = treeMapTestDriver28.remove((java.lang.Object) '4');
        boolean boolean31 = treeMapTestDriver28.isEmpty();
        java.lang.Object obj32 = treeMapTestDriver25.get((java.lang.Object) boolean31);
        experiment.util.Comparator comparator33 = treeMapTestDriver25.comparator();
        experiment.util.Set set34 = treeMapTestDriver25.entrySet();
        java.lang.Class<?> wildcardClass35 = treeMapTestDriver25.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj36 = treeMapTestDriver0.get((java.lang.Object) wildcardClass35);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(comparator17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(comparator33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1264048269_1024_0.test053");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Comparator comparator1 = treeMapTestDriver0.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = comparator1.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1264048269_1024_0.test054");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) '4');
        boolean boolean3 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj5 = treeMapTestDriver0.get((java.lang.Object) (byte) 10);
        experiment.util.TreeMapTestDriver treeMapTestDriver6 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver6.clear();
        experiment.util.Set set8 = treeMapTestDriver6.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj11 = treeMapTestDriver9.remove((java.lang.Object) '4');
        boolean boolean12 = treeMapTestDriver9.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver13 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj15 = treeMapTestDriver13.remove((java.lang.Object) '4');
        boolean boolean16 = treeMapTestDriver13.isEmpty();
        java.lang.Object obj18 = treeMapTestDriver13.get((java.lang.Object) (byte) 10);
        java.lang.Object obj19 = treeMapTestDriver9.get((java.lang.Object) (byte) 10);
        java.lang.Object obj20 = treeMapTestDriver6.remove((java.lang.Object) (byte) 10);
        experiment.util.Set set21 = treeMapTestDriver6.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set21);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1264048269_1024_0.test055");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver0.clear();
        experiment.util.Set set2 = treeMapTestDriver0.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver3 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj5 = treeMapTestDriver3.remove((java.lang.Object) '4');
        boolean boolean6 = treeMapTestDriver3.isEmpty();
        java.lang.Object obj7 = treeMapTestDriver0.get((java.lang.Object) boolean6);
        experiment.util.Set set8 = treeMapTestDriver0.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj11 = treeMapTestDriver9.remove((java.lang.Object) '4');
        boolean boolean12 = treeMapTestDriver9.isEmpty();
        experiment.util.Collection collection13 = treeMapTestDriver9.values();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = treeMapTestDriver0.containsKey((java.lang.Object) treeMapTestDriver9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1264048269_1024_0.test056");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) '4');
        boolean boolean3 = treeMapTestDriver0.isEmpty();
        boolean boolean4 = treeMapTestDriver0.isEmpty();
        experiment.util.Comparator comparator5 = treeMapTestDriver0.comparator();
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj9 = treeMapTestDriver7.remove((java.lang.Object) '4');
        boolean boolean10 = treeMapTestDriver7.isEmpty();
        java.lang.Object obj12 = treeMapTestDriver7.get((java.lang.Object) (byte) 10);
        treeMapTestDriver7.clear();
        int int14 = treeMapTestDriver7.size();
        experiment.util.Comparator comparator15 = treeMapTestDriver7.comparator();
        experiment.util.Comparator comparator16 = treeMapTestDriver7.comparator();
        java.lang.Object obj19 = treeMapTestDriver7.put((java.lang.Object) (short) 1, (java.lang.Object) (byte) 10);
        experiment.util.TreeMapTestDriver treeMapTestDriver20 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver20.clear();
        experiment.util.Set set22 = treeMapTestDriver20.keySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver23 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj25 = treeMapTestDriver23.remove((java.lang.Object) '4');
        boolean boolean26 = treeMapTestDriver23.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver27 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj29 = treeMapTestDriver27.remove((java.lang.Object) '4');
        boolean boolean30 = treeMapTestDriver27.isEmpty();
        java.lang.Object obj32 = treeMapTestDriver27.get((java.lang.Object) (byte) 10);
        java.lang.Object obj33 = treeMapTestDriver23.get((java.lang.Object) (byte) 10);
        java.lang.Object obj34 = treeMapTestDriver20.remove((java.lang.Object) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = treeMapTestDriver0.put((java.lang.Object) treeMapTestDriver7, obj34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(comparator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(comparator15);
        org.junit.Assert.assertNull(comparator16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj34);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1264048269_1024_0.test057");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) '4');
        boolean boolean3 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj5 = treeMapTestDriver0.get((java.lang.Object) (byte) 10);
        treeMapTestDriver0.clear();
        int int7 = treeMapTestDriver0.size();
        experiment.util.Comparator comparator8 = treeMapTestDriver0.comparator();
        boolean boolean9 = treeMapTestDriver0.isEmpty();
        experiment.util.TreeMapTestDriver treeMapTestDriver10 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver10.clear();
        experiment.util.Set set12 = treeMapTestDriver10.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver13 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj15 = treeMapTestDriver13.remove((java.lang.Object) '4');
        boolean boolean16 = treeMapTestDriver13.isEmpty();
        java.lang.Object obj17 = treeMapTestDriver10.get((java.lang.Object) boolean16);
        experiment.util.Comparator comparator18 = treeMapTestDriver10.comparator();
        experiment.util.Set set19 = treeMapTestDriver10.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver20 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj22 = treeMapTestDriver20.remove((java.lang.Object) '4');
        boolean boolean23 = treeMapTestDriver20.isEmpty();
        java.lang.Object obj25 = treeMapTestDriver20.get((java.lang.Object) (byte) 10);
        experiment.util.Comparator comparator26 = treeMapTestDriver20.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = treeMapTestDriver0.put((java.lang.Object) set19, (java.lang.Object) comparator26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(comparator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(comparator18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(comparator26);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1264048269_1024_0.test058");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver0.clear();
        int int2 = treeMapTestDriver0.size();
        boolean boolean3 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj5 = treeMapTestDriver0.remove((java.lang.Object) (short) 0);
        boolean boolean6 = treeMapTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1264048269_1024_0.test059");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Comparator comparator1 = treeMapTestDriver0.comparator();
        experiment.util.TreeMapTestDriver treeMapTestDriver2 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver2.clear();
        experiment.util.Comparator comparator4 = treeMapTestDriver2.comparator();
        experiment.util.Set set5 = treeMapTestDriver2.entrySet();
        experiment.util.Set set6 = treeMapTestDriver2.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) set6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1264048269_1024_0.test060");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) '4');
        int int3 = treeMapTestDriver0.size();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1264048269_1024_0.test061");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) '4');
        boolean boolean3 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj5 = treeMapTestDriver0.get((java.lang.Object) (byte) 10);
        treeMapTestDriver0.clear();
        experiment.util.Set set7 = treeMapTestDriver0.entrySet();
        experiment.util.Set set8 = treeMapTestDriver0.keySet();
        experiment.util.Set set9 = treeMapTestDriver0.keySet();
        experiment.util.Set set10 = treeMapTestDriver0.keySet();
        treeMapTestDriver0.clear();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1264048269_1024_0.test062");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) '4');
        boolean boolean3 = treeMapTestDriver0.isEmpty();
        java.lang.Object obj5 = treeMapTestDriver0.get((java.lang.Object) (byte) 10);
        experiment.util.TreeMapTestDriver treeMapTestDriver6 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver6.clear();
        experiment.util.Set set8 = treeMapTestDriver6.entrySet();
        int int9 = treeMapTestDriver6.size();
        java.lang.Object obj10 = treeMapTestDriver0.get((java.lang.Object) int9);
        experiment.util.Comparator comparator11 = treeMapTestDriver0.comparator();
        experiment.util.Set set12 = treeMapTestDriver0.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver13 = new experiment.util.TreeMapTestDriver();
        experiment.util.Collection collection14 = treeMapTestDriver13.values();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = treeMapTestDriver0.containsKey((java.lang.Object) collection14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.ArrayList cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1264048269_1024_0.test063");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver0.clear();
        experiment.util.Set set2 = treeMapTestDriver0.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver3 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj5 = treeMapTestDriver3.remove((java.lang.Object) '4');
        boolean boolean6 = treeMapTestDriver3.isEmpty();
        java.lang.Object obj7 = treeMapTestDriver0.get((java.lang.Object) boolean6);
        experiment.util.Comparator comparator8 = treeMapTestDriver0.comparator();
        experiment.util.Set set9 = treeMapTestDriver0.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver10 = new experiment.util.TreeMapTestDriver();
        experiment.util.Collection collection11 = treeMapTestDriver10.values();
        experiment.util.Set set12 = treeMapTestDriver10.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = treeMapTestDriver0.remove((java.lang.Object) set12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(comparator8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(set12);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_1264048269_1024_0.test064");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.Set set1 = treeMapTestDriver0.keySet();
        experiment.util.Comparator comparator2 = treeMapTestDriver0.comparator();
        treeMapTestDriver0.clear();
        experiment.util.Collection collection4 = treeMapTestDriver0.values();
        experiment.util.TreeMapTestDriver treeMapTestDriver5 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver5.clear();
        experiment.util.Set set7 = treeMapTestDriver5.entrySet();
        experiment.util.TreeMapTestDriver treeMapTestDriver8 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj10 = treeMapTestDriver8.remove((java.lang.Object) '4');
        boolean boolean11 = treeMapTestDriver8.isEmpty();
        java.lang.Object obj12 = treeMapTestDriver5.get((java.lang.Object) boolean11);
        experiment.util.Comparator comparator13 = treeMapTestDriver5.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(comparator13);
    }

}
