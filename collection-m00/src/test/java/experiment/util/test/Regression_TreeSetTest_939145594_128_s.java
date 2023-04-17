package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_TreeSetTest_939145594_128_s {

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
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test001");
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
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test002");
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
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test003");
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
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test004");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.TreeSetTestDriver treeSetTestDriver1 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj3 = treeSetTestDriver1.getMatch((java.lang.Object) (-1.0f));
        boolean boolean5 = treeSetTestDriver1.contains((java.lang.Object) '4');
        java.lang.Class<?> wildcardClass6 = treeSetTestDriver1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = treeSetTestDriver0.contains((java.lang.Object) treeSetTestDriver1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test005");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        java.lang.Class<?> wildcardClass2 = treeSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test006");
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
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test007");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        boolean boolean3 = treeSetTestDriver0.add((java.lang.Object) 0L);
        experiment.util.Comparator comparator4 = treeSetTestDriver0.comparator();
        java.lang.Object obj5 = treeSetTestDriver0.last();
        experiment.util.TreeSetTestDriver treeSetTestDriver6 = new experiment.util.TreeSetTestDriver();
        int int7 = treeSetTestDriver6.size();
        boolean boolean9 = treeSetTestDriver6.add((java.lang.Object) 0L);
        experiment.util.Comparator comparator10 = treeSetTestDriver6.comparator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = treeSetTestDriver0.remove((java.lang.Object) treeSetTestDriver6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0L + "'", obj5, 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(comparator10);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test008");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        boolean boolean3 = treeSetTestDriver0.add((java.lang.Object) 0L);
        experiment.util.Comparator comparator4 = treeSetTestDriver0.comparator();
        java.lang.Object obj5 = treeSetTestDriver0.last();
        experiment.util.TreeSetTestDriver treeSetTestDriver6 = new experiment.util.TreeSetTestDriver();
        boolean boolean8 = treeSetTestDriver6.add((java.lang.Object) "hi!");
        experiment.util.Iterator iterator9 = treeSetTestDriver6.iterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = treeSetTestDriver0.remove((java.lang.Object) treeSetTestDriver6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0L + "'", obj5, 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(iterator9);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test009");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        boolean boolean3 = treeSetTestDriver0.remove((java.lang.Object) '4');
        treeSetTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test010");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj2 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = obj2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test011");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        boolean boolean3 = treeSetTestDriver0.add((java.lang.Object) 0L);
        experiment.util.Comparator comparator4 = treeSetTestDriver0.comparator();
        java.lang.Object obj5 = treeSetTestDriver0.last();
        experiment.util.TreeSetTestDriver treeSetTestDriver6 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj8 = treeSetTestDriver6.getMatch((java.lang.Object) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = treeSetTestDriver0.add((java.lang.Object) treeSetTestDriver6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0L + "'", obj5, 0L);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test012");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.add((java.lang.Object) "hi!");
        experiment.util.Iterator iterator3 = treeSetTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to java.lang.Long");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(iterator3);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test013");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj2 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver4 = new experiment.util.TreeSetTestDriver();
        int int5 = treeSetTestDriver4.size();
        boolean boolean7 = treeSetTestDriver4.remove((java.lang.Object) '4');
        java.lang.Object obj8 = treeSetTestDriver0.getMatch((java.lang.Object) '4');
        boolean boolean9 = treeSetTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test014");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        boolean boolean3 = treeSetTestDriver0.remove((java.lang.Object) '4');
        treeSetTestDriver0.clear();
        experiment.util.TreeSetTestDriver treeSetTestDriver5 = new experiment.util.TreeSetTestDriver();
        int int6 = treeSetTestDriver5.size();
        boolean boolean8 = treeSetTestDriver5.remove((java.lang.Object) '4');
        java.lang.Object[] objArray9 = treeSetTestDriver5.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver10 = new experiment.util.TreeSetTestDriver();
        boolean boolean12 = treeSetTestDriver10.add((java.lang.Object) "hi!");
        boolean boolean13 = treeSetTestDriver5.add((java.lang.Object) treeSetTestDriver10);
        boolean boolean14 = treeSetTestDriver0.contains((java.lang.Object) boolean13);
        java.lang.Class<?> wildcardClass15 = treeSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test015");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.add((java.lang.Object) "hi!");
        experiment.util.Iterator iterator3 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver4 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj6 = treeSetTestDriver4.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator7 = treeSetTestDriver4.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = treeSetTestDriver0.getMatch((java.lang.Object) comparator7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(comparator7);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test016");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj2 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        boolean boolean4 = treeSetTestDriver0.contains((java.lang.Object) '4');
        experiment.util.TreeSetTestDriver treeSetTestDriver5 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj7 = treeSetTestDriver5.getMatch((java.lang.Object) (-1.0f));
        boolean boolean9 = treeSetTestDriver5.contains((java.lang.Object) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = treeSetTestDriver0.getMatch((java.lang.Object) treeSetTestDriver5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test017");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj2 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        boolean boolean5 = treeSetTestDriver0.add((java.lang.Object) ' ');
        java.lang.Object[] objArray6 = treeSetTestDriver0.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver7 = new experiment.util.TreeSetTestDriver();
        boolean boolean9 = treeSetTestDriver7.add((java.lang.Object) "hi!");
        experiment.util.Comparator comparator10 = treeSetTestDriver7.comparator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = treeSetTestDriver0.add((java.lang.Object) comparator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[ ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(comparator10);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test018");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.add((java.lang.Object) "hi!");
        experiment.util.TreeSetTestDriver treeSetTestDriver3 = new experiment.util.TreeSetTestDriver();
        int int4 = treeSetTestDriver3.size();
        boolean boolean6 = treeSetTestDriver3.remove((java.lang.Object) '4');
        java.lang.Object[] objArray7 = treeSetTestDriver3.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver8 = new experiment.util.TreeSetTestDriver();
        boolean boolean10 = treeSetTestDriver8.add((java.lang.Object) "hi!");
        boolean boolean11 = treeSetTestDriver3.add((java.lang.Object) treeSetTestDriver8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = treeSetTestDriver0.remove((java.lang.Object) treeSetTestDriver8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test019");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj2 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        boolean boolean4 = treeSetTestDriver0.contains((java.lang.Object) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test020");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        boolean boolean3 = treeSetTestDriver0.add((java.lang.Object) 0L);
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = treeSetTestDriver0.remove(obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Object cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test021");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        boolean boolean3 = treeSetTestDriver0.add((java.lang.Object) 0L);
        experiment.util.Comparator comparator4 = treeSetTestDriver0.comparator();
        java.lang.Object obj5 = treeSetTestDriver0.last();
        experiment.util.TreeSetTestDriver treeSetTestDriver6 = new experiment.util.TreeSetTestDriver();
        int int7 = treeSetTestDriver6.size();
        boolean boolean9 = treeSetTestDriver6.add((java.lang.Object) 0L);
        java.lang.Class<?> wildcardClass10 = treeSetTestDriver6.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = treeSetTestDriver0.getMatch((java.lang.Object) treeSetTestDriver6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0L + "'", obj5, 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test022");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        boolean boolean3 = treeSetTestDriver0.remove((java.lang.Object) '4');
        treeSetTestDriver0.clear();
        experiment.util.TreeSetTestDriver treeSetTestDriver5 = new experiment.util.TreeSetTestDriver();
        int int6 = treeSetTestDriver5.size();
        boolean boolean8 = treeSetTestDriver5.remove((java.lang.Object) '4');
        java.lang.Object[] objArray9 = treeSetTestDriver5.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver10 = new experiment.util.TreeSetTestDriver();
        boolean boolean12 = treeSetTestDriver10.add((java.lang.Object) "hi!");
        boolean boolean13 = treeSetTestDriver5.add((java.lang.Object) treeSetTestDriver10);
        boolean boolean14 = treeSetTestDriver0.contains((java.lang.Object) boolean13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test023");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj2 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        java.lang.Object obj5 = treeSetTestDriver0.getMatch((java.lang.Object) 0L);
        experiment.util.TreeSetTestDriver treeSetTestDriver6 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj8 = treeSetTestDriver6.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator9 = treeSetTestDriver6.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver10 = new experiment.util.TreeSetTestDriver();
        int int11 = treeSetTestDriver10.size();
        boolean boolean13 = treeSetTestDriver10.remove((java.lang.Object) '4');
        java.lang.Object obj14 = treeSetTestDriver6.getMatch((java.lang.Object) '4');
        boolean boolean15 = treeSetTestDriver6.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = treeSetTestDriver0.contains((java.lang.Object) treeSetTestDriver6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test024");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj2 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        experiment.util.TreeSetTestDriver treeSetTestDriver3 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj5 = treeSetTestDriver3.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator6 = treeSetTestDriver3.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver7 = new experiment.util.TreeSetTestDriver();
        int int8 = treeSetTestDriver7.size();
        boolean boolean10 = treeSetTestDriver7.remove((java.lang.Object) '4');
        java.lang.Object obj11 = treeSetTestDriver3.getMatch((java.lang.Object) '4');
        boolean boolean12 = treeSetTestDriver0.equals_CUT((java.lang.Object) treeSetTestDriver3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test025");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj2 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        int int3 = treeSetTestDriver0.size();
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) 100);
        java.lang.Class<?> wildcardClass6 = treeSetTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test026");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj2 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        boolean boolean5 = treeSetTestDriver0.add((java.lang.Object) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = treeSetTestDriver0.getMatch((java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to java.lang.Float");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test027");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        boolean boolean3 = treeSetTestDriver0.add((java.lang.Object) 0L);
        experiment.util.Comparator comparator4 = treeSetTestDriver0.comparator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = treeSetTestDriver0.remove((java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to java.lang.Integer");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(comparator4);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test028");
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
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test029");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj2 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        boolean boolean5 = treeSetTestDriver0.add((java.lang.Object) ' ');
        java.lang.Class<?> wildcardClass6 = treeSetTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test030");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj2 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        java.lang.Object[] objArray4 = treeSetTestDriver0.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver5 = new experiment.util.TreeSetTestDriver();
        int int6 = treeSetTestDriver5.size();
        boolean boolean8 = treeSetTestDriver5.remove((java.lang.Object) '4');
        java.lang.Object[] objArray9 = treeSetTestDriver5.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver10 = new experiment.util.TreeSetTestDriver();
        boolean boolean12 = treeSetTestDriver10.add((java.lang.Object) "hi!");
        boolean boolean13 = treeSetTestDriver5.add((java.lang.Object) treeSetTestDriver10);
        boolean boolean14 = treeSetTestDriver0.equals_CUT((java.lang.Object) treeSetTestDriver10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test031");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj2 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver4 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj6 = treeSetTestDriver4.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator7 = treeSetTestDriver4.comparator();
        java.lang.Object[] objArray8 = treeSetTestDriver4.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = treeSetTestDriver0.getMatch((java.lang.Object) treeSetTestDriver4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(comparator7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test032");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        boolean boolean3 = treeSetTestDriver0.remove((java.lang.Object) '4');
        experiment.util.TreeSetTestDriver treeSetTestDriver4 = new experiment.util.TreeSetTestDriver();
        int int5 = treeSetTestDriver4.size();
        boolean boolean7 = treeSetTestDriver4.add((java.lang.Object) 0L);
        experiment.util.Comparator comparator8 = treeSetTestDriver4.comparator();
        treeSetTestDriver4.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = treeSetTestDriver0.getMatch((java.lang.Object) treeSetTestDriver4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(comparator8);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test033");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNotNull(iterator2);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test034");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj2 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        int int3 = treeSetTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test035");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        boolean boolean3 = treeSetTestDriver0.add((java.lang.Object) 0L);
        experiment.util.Comparator comparator4 = treeSetTestDriver0.comparator();
        treeSetTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(comparator4);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test036");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        boolean boolean3 = treeSetTestDriver0.remove((java.lang.Object) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test037");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.TreeSetTestDriver treeSetTestDriver1 = new experiment.util.TreeSetTestDriver();
        boolean boolean3 = treeSetTestDriver1.add((java.lang.Object) "hi!");
        java.lang.Object obj4 = treeSetTestDriver0.getMatch((java.lang.Object) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test038");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj2 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        experiment.util.TreeSetTestDriver treeSetTestDriver3 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj5 = treeSetTestDriver3.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator6 = treeSetTestDriver3.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver7 = new experiment.util.TreeSetTestDriver();
        int int8 = treeSetTestDriver7.size();
        boolean boolean10 = treeSetTestDriver7.remove((java.lang.Object) '4');
        java.lang.Object obj11 = treeSetTestDriver3.getMatch((java.lang.Object) '4');
        boolean boolean12 = treeSetTestDriver0.equals_CUT((java.lang.Object) treeSetTestDriver3);
        experiment.util.TreeSetTestDriver treeSetTestDriver13 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj15 = treeSetTestDriver13.getMatch((java.lang.Object) (-1.0f));
        experiment.util.TreeSetTestDriver treeSetTestDriver16 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj18 = treeSetTestDriver16.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator19 = treeSetTestDriver16.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver20 = new experiment.util.TreeSetTestDriver();
        int int21 = treeSetTestDriver20.size();
        boolean boolean23 = treeSetTestDriver20.remove((java.lang.Object) '4');
        java.lang.Object obj24 = treeSetTestDriver16.getMatch((java.lang.Object) '4');
        boolean boolean25 = treeSetTestDriver13.equals_CUT((java.lang.Object) treeSetTestDriver16);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = treeSetTestDriver3.contains((java.lang.Object) treeSetTestDriver16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(comparator19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test039");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        boolean boolean3 = treeSetTestDriver0.add((java.lang.Object) 0L);
        experiment.util.Comparator comparator4 = treeSetTestDriver0.comparator();
        java.lang.Object obj5 = treeSetTestDriver0.last();
        int int6 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        boolean boolean8 = treeSetTestDriver0.isEmpty();
        java.lang.Object obj9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = treeSetTestDriver0.remove(obj9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0L + "'", obj5, 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test040");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.add((java.lang.Object) "hi!");
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver4 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj6 = treeSetTestDriver4.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator7 = treeSetTestDriver4.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver8 = new experiment.util.TreeSetTestDriver();
        int int9 = treeSetTestDriver8.size();
        boolean boolean11 = treeSetTestDriver8.remove((java.lang.Object) '4');
        java.lang.Object obj12 = treeSetTestDriver4.getMatch((java.lang.Object) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = treeSetTestDriver0.getMatch((java.lang.Object) treeSetTestDriver4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(comparator7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test041");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj2 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        boolean boolean5 = treeSetTestDriver0.add((java.lang.Object) ' ');
        experiment.util.TreeSetTestDriver treeSetTestDriver6 = new experiment.util.TreeSetTestDriver();
        int int7 = treeSetTestDriver6.size();
        boolean boolean9 = treeSetTestDriver6.remove((java.lang.Object) '4');
        java.lang.Object[] objArray10 = treeSetTestDriver6.toArray();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = treeSetTestDriver0.contains((java.lang.Object) treeSetTestDriver6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test042");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        boolean boolean3 = treeSetTestDriver0.remove((java.lang.Object) '4');
        experiment.util.TreeSetTestDriver treeSetTestDriver4 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj6 = treeSetTestDriver4.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator7 = treeSetTestDriver4.comparator();
        java.lang.Object[] objArray8 = treeSetTestDriver4.toArray();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = treeSetTestDriver0.contains((java.lang.Object) treeSetTestDriver4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(comparator7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test043");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.TreeSetTestDriver treeSetTestDriver1 = new experiment.util.TreeSetTestDriver();
        boolean boolean3 = treeSetTestDriver1.add((java.lang.Object) "hi!");
        java.lang.Object obj4 = treeSetTestDriver0.getMatch((java.lang.Object) "hi!");
        experiment.util.TreeSetTestDriver treeSetTestDriver5 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj7 = treeSetTestDriver5.getMatch((java.lang.Object) (-1.0f));
        int int8 = treeSetTestDriver5.size();
        boolean boolean10 = treeSetTestDriver5.remove((java.lang.Object) 100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = treeSetTestDriver0.contains((java.lang.Object) treeSetTestDriver5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test044");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj2 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        boolean boolean5 = treeSetTestDriver0.add((java.lang.Object) ' ');
        java.lang.Object[] objArray6 = treeSetTestDriver0.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver7 = new experiment.util.TreeSetTestDriver();
        int int8 = treeSetTestDriver7.size();
        boolean boolean10 = treeSetTestDriver7.add((java.lang.Object) 0L);
        experiment.util.Comparator comparator11 = treeSetTestDriver7.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = treeSetTestDriver0.getMatch((java.lang.Object) treeSetTestDriver7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[ ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[ ]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(comparator11);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test045");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        boolean boolean3 = treeSetTestDriver0.remove((java.lang.Object) '4');
        java.lang.Object[] objArray4 = treeSetTestDriver0.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver5 = new experiment.util.TreeSetTestDriver();
        boolean boolean7 = treeSetTestDriver5.add((java.lang.Object) "hi!");
        boolean boolean8 = treeSetTestDriver0.add((java.lang.Object) treeSetTestDriver5);
        experiment.util.TreeSetTestDriver treeSetTestDriver9 = new experiment.util.TreeSetTestDriver();
        int int10 = treeSetTestDriver9.size();
        boolean boolean12 = treeSetTestDriver9.add((java.lang.Object) 0L);
        java.lang.Class<?> wildcardClass13 = treeSetTestDriver9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = treeSetTestDriver5.add((java.lang.Object) treeSetTestDriver9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test046");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj2 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        boolean boolean4 = treeSetTestDriver0.contains((java.lang.Object) '4');
        experiment.util.Comparator comparator5 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver6 = new experiment.util.TreeSetTestDriver();
        int int7 = treeSetTestDriver6.size();
        experiment.util.Comparator comparator8 = treeSetTestDriver6.comparator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = treeSetTestDriver0.add((java.lang.Object) comparator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(comparator5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(comparator8);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test047");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        boolean boolean3 = treeSetTestDriver0.remove((java.lang.Object) '4');
        treeSetTestDriver0.clear();
        experiment.util.TreeSetTestDriver treeSetTestDriver5 = new experiment.util.TreeSetTestDriver();
        int int6 = treeSetTestDriver5.size();
        boolean boolean8 = treeSetTestDriver5.remove((java.lang.Object) '4');
        java.lang.Object[] objArray9 = treeSetTestDriver5.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver10 = new experiment.util.TreeSetTestDriver();
        boolean boolean12 = treeSetTestDriver10.add((java.lang.Object) "hi!");
        boolean boolean13 = treeSetTestDriver5.add((java.lang.Object) treeSetTestDriver10);
        boolean boolean14 = treeSetTestDriver0.contains((java.lang.Object) boolean13);
        java.lang.Object obj16 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass17 = treeSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test048");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj2 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        boolean boolean4 = treeSetTestDriver0.contains((java.lang.Object) '4');
        experiment.util.Comparator comparator5 = treeSetTestDriver0.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(comparator5);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test049");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        boolean boolean3 = treeSetTestDriver0.add((java.lang.Object) 0L);
        experiment.util.Comparator comparator4 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver5 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj7 = treeSetTestDriver5.getMatch((java.lang.Object) (-1.0f));
        boolean boolean9 = treeSetTestDriver5.contains((java.lang.Object) '4');
        experiment.util.Comparator comparator10 = treeSetTestDriver5.comparator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = treeSetTestDriver0.add((java.lang.Object) comparator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(comparator10);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test050");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Class<?> wildcardClass1 = treeSetTestDriver0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test051");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        experiment.util.Comparator comparator2 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver3 = new experiment.util.TreeSetTestDriver();
        int int4 = treeSetTestDriver3.size();
        boolean boolean6 = treeSetTestDriver3.remove((java.lang.Object) '4');
        treeSetTestDriver3.clear();
        experiment.util.TreeSetTestDriver treeSetTestDriver8 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator9 = treeSetTestDriver8.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver10 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj12 = treeSetTestDriver10.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator13 = treeSetTestDriver10.comparator();
        java.lang.Object[] objArray14 = treeSetTestDriver10.toArray();
        boolean boolean15 = treeSetTestDriver8.add((java.lang.Object) treeSetTestDriver10);
        boolean boolean16 = treeSetTestDriver3.equals_CUT((java.lang.Object) treeSetTestDriver8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = treeSetTestDriver0.getMatch((java.lang.Object) treeSetTestDriver8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(comparator13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test052");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.TreeSetTestDriver treeSetTestDriver1 = new experiment.util.TreeSetTestDriver();
        boolean boolean3 = treeSetTestDriver1.add((java.lang.Object) "hi!");
        java.lang.Object obj4 = treeSetTestDriver0.getMatch((java.lang.Object) "hi!");
        boolean boolean6 = treeSetTestDriver0.add((java.lang.Object) (byte) 1);
        experiment.util.TreeSetTestDriver treeSetTestDriver7 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj9 = treeSetTestDriver7.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator10 = treeSetTestDriver7.comparator();
        boolean boolean12 = treeSetTestDriver7.add((java.lang.Object) ' ');
        java.lang.Object[] objArray13 = treeSetTestDriver7.toArray();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = treeSetTestDriver0.contains((java.lang.Object) objArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Ljava.lang.Object; cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[ ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[ ]");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test053");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj2 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        java.lang.Object[] objArray4 = treeSetTestDriver0.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver5 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj7 = treeSetTestDriver5.getMatch((java.lang.Object) (-1.0f));
        boolean boolean8 = treeSetTestDriver0.add((java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass9 = treeSetTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test054");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj2 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        experiment.util.TreeSetTestDriver treeSetTestDriver3 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj5 = treeSetTestDriver3.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator6 = treeSetTestDriver3.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver7 = new experiment.util.TreeSetTestDriver();
        int int8 = treeSetTestDriver7.size();
        boolean boolean10 = treeSetTestDriver7.remove((java.lang.Object) '4');
        java.lang.Object obj11 = treeSetTestDriver3.getMatch((java.lang.Object) '4');
        boolean boolean12 = treeSetTestDriver0.equals_CUT((java.lang.Object) treeSetTestDriver3);
        experiment.util.TreeSetTestDriver treeSetTestDriver13 = new experiment.util.TreeSetTestDriver();
        boolean boolean15 = treeSetTestDriver13.add((java.lang.Object) "hi!");
        experiment.util.Iterator iterator16 = treeSetTestDriver13.iterator();
        boolean boolean17 = treeSetTestDriver0.remove((java.lang.Object) treeSetTestDriver13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = treeSetTestDriver13.contains((java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to java.lang.Integer");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test055");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj2 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        experiment.util.TreeSetTestDriver treeSetTestDriver3 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj5 = treeSetTestDriver3.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator6 = treeSetTestDriver3.comparator();
        java.lang.Object[] objArray7 = treeSetTestDriver3.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = treeSetTestDriver0.getMatch((java.lang.Object) objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Ljava.lang.Object; cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test056");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj2 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        boolean boolean4 = treeSetTestDriver0.contains((java.lang.Object) '4');
        experiment.util.Comparator comparator5 = treeSetTestDriver0.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = comparator5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(comparator5);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test057");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj2 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        boolean boolean5 = treeSetTestDriver0.add((java.lang.Object) ' ');
        java.lang.Object[] objArray6 = treeSetTestDriver0.toArray();
        java.lang.Class<?> wildcardClass7 = treeSetTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[ ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[ ]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test058");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        boolean boolean3 = treeSetTestDriver0.add((java.lang.Object) 0L);
        experiment.util.Comparator comparator4 = treeSetTestDriver0.comparator();
        treeSetTestDriver0.clear();
        experiment.util.Comparator comparator6 = treeSetTestDriver0.comparator();
        treeSetTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertNull(comparator6);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test059");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        boolean boolean3 = treeSetTestDriver0.add((java.lang.Object) 0L);
        experiment.util.Comparator comparator4 = treeSetTestDriver0.comparator();
        java.lang.Object obj5 = treeSetTestDriver0.last();
        int int6 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        experiment.util.TreeSetTestDriver treeSetTestDriver8 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj10 = treeSetTestDriver8.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator11 = treeSetTestDriver8.comparator();
        java.lang.Object[] objArray12 = treeSetTestDriver8.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver13 = new experiment.util.TreeSetTestDriver();
        int int14 = treeSetTestDriver13.size();
        boolean boolean16 = treeSetTestDriver13.remove((java.lang.Object) '4');
        java.lang.Object[] objArray17 = treeSetTestDriver13.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver18 = new experiment.util.TreeSetTestDriver();
        boolean boolean20 = treeSetTestDriver18.add((java.lang.Object) "hi!");
        boolean boolean21 = treeSetTestDriver13.add((java.lang.Object) treeSetTestDriver18);
        boolean boolean22 = treeSetTestDriver8.equals_CUT((java.lang.Object) treeSetTestDriver18);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = treeSetTestDriver0.contains((java.lang.Object) treeSetTestDriver8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0L + "'", obj5, 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test060");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj2 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        boolean boolean5 = treeSetTestDriver0.add((java.lang.Object) ' ');
        java.lang.Object[] objArray6 = treeSetTestDriver0.toArray();
        experiment.util.Comparator comparator7 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver8 = new experiment.util.TreeSetTestDriver();
        int int9 = treeSetTestDriver8.size();
        boolean boolean11 = treeSetTestDriver8.add((java.lang.Object) 0L);
        experiment.util.Comparator comparator12 = treeSetTestDriver8.comparator();
        java.lang.Object obj13 = treeSetTestDriver8.last();
        int int14 = treeSetTestDriver8.size();
        treeSetTestDriver8.clear();
        boolean boolean16 = treeSetTestDriver8.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = treeSetTestDriver0.getMatch((java.lang.Object) treeSetTestDriver8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[ ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[ ]");
        org.junit.Assert.assertNull(comparator7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0L + "'", obj13, 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test061");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj2 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        int int3 = treeSetTestDriver0.size();
        experiment.util.TreeSetTestDriver treeSetTestDriver4 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj6 = treeSetTestDriver4.getMatch((java.lang.Object) (-1.0f));
        int int7 = treeSetTestDriver4.size();
        boolean boolean8 = treeSetTestDriver0.equals_CUT((java.lang.Object) int7);
        treeSetTestDriver0.clear();
        experiment.util.TreeSetTestDriver treeSetTestDriver10 = new experiment.util.TreeSetTestDriver();
        int int11 = treeSetTestDriver10.size();
        boolean boolean13 = treeSetTestDriver10.remove((java.lang.Object) '4');
        treeSetTestDriver10.clear();
        treeSetTestDriver10.clear();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = treeSetTestDriver0.contains((java.lang.Object) treeSetTestDriver10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test062");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNotNull(iterator2);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test063");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        boolean boolean3 = treeSetTestDriver0.remove((java.lang.Object) '4');
        java.lang.Object[] objArray4 = treeSetTestDriver0.toArray();
        java.lang.Object[] objArray5 = treeSetTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test064");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.add((java.lang.Object) "hi!");
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        java.lang.Object obj4 = treeSetTestDriver0.first();
        treeSetTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + "hi!" + "'", obj4, "hi!");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test065");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        boolean boolean3 = treeSetTestDriver0.remove((java.lang.Object) '4');
        treeSetTestDriver0.clear();
        experiment.util.TreeSetTestDriver treeSetTestDriver5 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator6 = treeSetTestDriver5.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver7 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj9 = treeSetTestDriver7.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator10 = treeSetTestDriver7.comparator();
        java.lang.Object[] objArray11 = treeSetTestDriver7.toArray();
        boolean boolean12 = treeSetTestDriver5.add((java.lang.Object) treeSetTestDriver7);
        boolean boolean13 = treeSetTestDriver0.equals_CUT((java.lang.Object) treeSetTestDriver5);
        experiment.util.TreeSetTestDriver treeSetTestDriver14 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj16 = treeSetTestDriver14.getMatch((java.lang.Object) (-1.0f));
        int int17 = treeSetTestDriver14.size();
        boolean boolean19 = treeSetTestDriver14.remove((java.lang.Object) 100);
        java.lang.Object[] objArray20 = treeSetTestDriver14.toArray();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = treeSetTestDriver5.contains((java.lang.Object) treeSetTestDriver14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test066");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.TreeSetTestDriver treeSetTestDriver1 = new experiment.util.TreeSetTestDriver();
        boolean boolean3 = treeSetTestDriver1.add((java.lang.Object) "hi!");
        java.lang.Object obj4 = treeSetTestDriver0.getMatch((java.lang.Object) "hi!");
        boolean boolean6 = treeSetTestDriver0.add((java.lang.Object) (byte) 1);
        experiment.util.TreeSetTestDriver treeSetTestDriver7 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator8 = treeSetTestDriver7.comparator();
        boolean boolean9 = treeSetTestDriver7.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = treeSetTestDriver0.remove((java.lang.Object) treeSetTestDriver7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(comparator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test067");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        boolean boolean3 = treeSetTestDriver0.remove((java.lang.Object) '4');
        treeSetTestDriver0.clear();
        int int5 = treeSetTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test068");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        boolean boolean3 = treeSetTestDriver0.remove((java.lang.Object) '4');
        treeSetTestDriver0.clear();
        experiment.util.TreeSetTestDriver treeSetTestDriver5 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator6 = treeSetTestDriver5.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver7 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj9 = treeSetTestDriver7.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator10 = treeSetTestDriver7.comparator();
        java.lang.Object[] objArray11 = treeSetTestDriver7.toArray();
        boolean boolean12 = treeSetTestDriver5.add((java.lang.Object) treeSetTestDriver7);
        boolean boolean13 = treeSetTestDriver0.equals_CUT((java.lang.Object) treeSetTestDriver5);
        experiment.util.TreeSetTestDriver treeSetTestDriver14 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj16 = treeSetTestDriver14.getMatch((java.lang.Object) (-1.0f));
        boolean boolean17 = treeSetTestDriver14.isEmpty();
        experiment.util.Comparator comparator18 = treeSetTestDriver14.comparator();
        java.lang.Class<?> wildcardClass19 = treeSetTestDriver14.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = treeSetTestDriver5.remove((java.lang.Object) treeSetTestDriver14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(comparator18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test069");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj2 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        boolean boolean5 = treeSetTestDriver0.add((java.lang.Object) ' ');
        java.lang.Object[] objArray6 = treeSetTestDriver0.toArray();
        experiment.util.Comparator comparator7 = treeSetTestDriver0.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = comparator7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[ ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[ ]");
        org.junit.Assert.assertNull(comparator7);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test070");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        boolean boolean3 = treeSetTestDriver0.add((java.lang.Object) 0L);
        experiment.util.Comparator comparator4 = treeSetTestDriver0.comparator();
        java.lang.Object obj5 = treeSetTestDriver0.last();
        int int6 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = treeSetTestDriver0.equals_CUT(obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0L + "'", obj5, 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test071");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        java.lang.Object[] objArray2 = treeSetTestDriver0.toArray();
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(comparator3);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test072");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test073");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.TreeSetTestDriver treeSetTestDriver1 = new experiment.util.TreeSetTestDriver();
        boolean boolean3 = treeSetTestDriver1.add((java.lang.Object) "hi!");
        java.lang.Object obj4 = treeSetTestDriver0.getMatch((java.lang.Object) "hi!");
        experiment.util.Comparator comparator5 = treeSetTestDriver0.comparator();
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = treeSetTestDriver0.equals_CUT(obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(comparator5);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test074");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj2 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        boolean boolean3 = treeSetTestDriver0.isEmpty();
        boolean boolean5 = treeSetTestDriver0.contains((java.lang.Object) 1);
        java.lang.Object[] objArray6 = treeSetTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test075");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj2 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        boolean boolean3 = treeSetTestDriver0.isEmpty();
        boolean boolean5 = treeSetTestDriver0.contains((java.lang.Object) 1);
        boolean boolean6 = treeSetTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test076");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj2 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        boolean boolean3 = treeSetTestDriver0.isEmpty();
        experiment.util.TreeSetTestDriver treeSetTestDriver4 = new experiment.util.TreeSetTestDriver();
        int int5 = treeSetTestDriver4.size();
        experiment.util.Comparator comparator6 = treeSetTestDriver4.comparator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = treeSetTestDriver0.add((java.lang.Object) comparator6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(comparator6);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test077");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj2 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        boolean boolean3 = treeSetTestDriver0.isEmpty();
        boolean boolean5 = treeSetTestDriver0.contains((java.lang.Object) 1);
        experiment.util.TreeSetTestDriver treeSetTestDriver6 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj8 = treeSetTestDriver6.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator9 = treeSetTestDriver6.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver10 = new experiment.util.TreeSetTestDriver();
        int int11 = treeSetTestDriver10.size();
        boolean boolean13 = treeSetTestDriver10.remove((java.lang.Object) '4');
        java.lang.Object obj14 = treeSetTestDriver6.getMatch((java.lang.Object) '4');
        boolean boolean15 = treeSetTestDriver0.add((java.lang.Object) treeSetTestDriver6);
        boolean boolean16 = treeSetTestDriver6.isEmpty();
        experiment.util.TreeSetTestDriver treeSetTestDriver17 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj19 = treeSetTestDriver17.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator20 = treeSetTestDriver17.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver21 = new experiment.util.TreeSetTestDriver();
        int int22 = treeSetTestDriver21.size();
        boolean boolean24 = treeSetTestDriver21.remove((java.lang.Object) '4');
        java.lang.Object obj25 = treeSetTestDriver17.getMatch((java.lang.Object) '4');
        boolean boolean26 = treeSetTestDriver17.isEmpty();
        java.lang.Class<?> wildcardClass27 = treeSetTestDriver17.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = treeSetTestDriver6.contains((java.lang.Object) wildcardClass27);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(comparator20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test078");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj2 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        int int3 = treeSetTestDriver0.size();
        experiment.util.TreeSetTestDriver treeSetTestDriver4 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj6 = treeSetTestDriver4.getMatch((java.lang.Object) (-1.0f));
        int int7 = treeSetTestDriver4.size();
        boolean boolean8 = treeSetTestDriver0.equals_CUT((java.lang.Object) int7);
        treeSetTestDriver0.clear();
        experiment.util.TreeSetTestDriver treeSetTestDriver10 = new experiment.util.TreeSetTestDriver();
        int int11 = treeSetTestDriver10.size();
        boolean boolean13 = treeSetTestDriver10.add((java.lang.Object) 0L);
        experiment.util.Comparator comparator14 = treeSetTestDriver10.comparator();
        java.lang.Object obj15 = treeSetTestDriver10.last();
        int int16 = treeSetTestDriver10.size();
        treeSetTestDriver10.clear();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = treeSetTestDriver0.contains((java.lang.Object) treeSetTestDriver10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(comparator14);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0L + "'", obj15, 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test079");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.add((java.lang.Object) "hi!");
        java.lang.Object obj3 = treeSetTestDriver0.first();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "hi!" + "'", obj3, "hi!");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test080");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        boolean boolean3 = treeSetTestDriver0.remove((java.lang.Object) '4');
        treeSetTestDriver0.clear();
        experiment.util.TreeSetTestDriver treeSetTestDriver5 = new experiment.util.TreeSetTestDriver();
        int int6 = treeSetTestDriver5.size();
        boolean boolean8 = treeSetTestDriver5.remove((java.lang.Object) '4');
        java.lang.Object[] objArray9 = treeSetTestDriver5.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver10 = new experiment.util.TreeSetTestDriver();
        boolean boolean12 = treeSetTestDriver10.add((java.lang.Object) "hi!");
        boolean boolean13 = treeSetTestDriver5.add((java.lang.Object) treeSetTestDriver10);
        boolean boolean14 = treeSetTestDriver0.contains((java.lang.Object) boolean13);
        experiment.util.Iterator iterator15 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver16 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj18 = treeSetTestDriver16.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator19 = treeSetTestDriver16.comparator();
        java.lang.Object obj21 = treeSetTestDriver16.getMatch((java.lang.Object) 0L);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = treeSetTestDriver0.contains((java.lang.Object) treeSetTestDriver16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(comparator19);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test081");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj2 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        java.lang.Object[] objArray4 = treeSetTestDriver0.toArray();
        java.lang.Class<?> wildcardClass5 = treeSetTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test082");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj2 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        boolean boolean3 = treeSetTestDriver0.isEmpty();
        boolean boolean5 = treeSetTestDriver0.contains((java.lang.Object) 1);
        experiment.util.TreeSetTestDriver treeSetTestDriver6 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj8 = treeSetTestDriver6.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator9 = treeSetTestDriver6.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver10 = new experiment.util.TreeSetTestDriver();
        int int11 = treeSetTestDriver10.size();
        boolean boolean13 = treeSetTestDriver10.remove((java.lang.Object) '4');
        java.lang.Object obj14 = treeSetTestDriver6.getMatch((java.lang.Object) '4');
        boolean boolean15 = treeSetTestDriver0.add((java.lang.Object) treeSetTestDriver6);
        experiment.util.Iterator iterator16 = treeSetTestDriver6.iterator();
        java.lang.Class<?> wildcardClass17 = treeSetTestDriver6.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test083");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj2 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        experiment.util.Comparator comparator4 = treeSetTestDriver0.comparator();
        int int5 = treeSetTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test084");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.add((java.lang.Object) "hi!");
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        java.lang.Object obj4 = treeSetTestDriver0.first();
        experiment.util.Comparator comparator5 = treeSetTestDriver0.comparator();
        java.lang.Class<?> wildcardClass6 = treeSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + "hi!" + "'", obj4, "hi!");
        org.junit.Assert.assertNull(comparator5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test085");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        boolean boolean3 = treeSetTestDriver0.remove((java.lang.Object) '4');
        treeSetTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test086");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj2 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        java.lang.Object[] objArray4 = treeSetTestDriver0.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver5 = new experiment.util.TreeSetTestDriver();
        int int6 = treeSetTestDriver5.size();
        boolean boolean8 = treeSetTestDriver5.remove((java.lang.Object) '4');
        java.lang.Object[] objArray9 = treeSetTestDriver5.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver10 = new experiment.util.TreeSetTestDriver();
        boolean boolean12 = treeSetTestDriver10.add((java.lang.Object) "hi!");
        boolean boolean13 = treeSetTestDriver5.add((java.lang.Object) treeSetTestDriver10);
        boolean boolean14 = treeSetTestDriver0.equals_CUT((java.lang.Object) treeSetTestDriver10);
        experiment.util.TreeSetTestDriver treeSetTestDriver15 = new experiment.util.TreeSetTestDriver();
        int int16 = treeSetTestDriver15.size();
        boolean boolean18 = treeSetTestDriver15.remove((java.lang.Object) '4');
        treeSetTestDriver15.clear();
        experiment.util.TreeSetTestDriver treeSetTestDriver20 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator21 = treeSetTestDriver20.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver22 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj24 = treeSetTestDriver22.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator25 = treeSetTestDriver22.comparator();
        java.lang.Object[] objArray26 = treeSetTestDriver22.toArray();
        boolean boolean27 = treeSetTestDriver20.add((java.lang.Object) treeSetTestDriver22);
        boolean boolean28 = treeSetTestDriver15.equals_CUT((java.lang.Object) treeSetTestDriver20);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = treeSetTestDriver10.contains((java.lang.Object) boolean28);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to java.lang.Boolean");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(comparator21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(comparator25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test087");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj2 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        boolean boolean3 = treeSetTestDriver0.isEmpty();
        boolean boolean5 = treeSetTestDriver0.contains((java.lang.Object) 1);
        experiment.util.TreeSetTestDriver treeSetTestDriver6 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj8 = treeSetTestDriver6.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator9 = treeSetTestDriver6.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver10 = new experiment.util.TreeSetTestDriver();
        int int11 = treeSetTestDriver10.size();
        boolean boolean13 = treeSetTestDriver10.remove((java.lang.Object) '4');
        java.lang.Object obj14 = treeSetTestDriver6.getMatch((java.lang.Object) '4');
        boolean boolean15 = treeSetTestDriver0.add((java.lang.Object) treeSetTestDriver6);
        experiment.util.TreeSetTestDriver treeSetTestDriver16 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj18 = treeSetTestDriver16.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator19 = treeSetTestDriver16.comparator();
        java.lang.Object obj21 = treeSetTestDriver16.getMatch((java.lang.Object) 0L);
        java.lang.Object obj22 = treeSetTestDriver6.getMatch((java.lang.Object) 0L);
        treeSetTestDriver6.clear();
        java.lang.Object[] objArray24 = treeSetTestDriver6.toArray();
        java.lang.Class<?> wildcardClass25 = objArray24.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(comparator19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test088");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj2 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        boolean boolean4 = treeSetTestDriver0.contains((java.lang.Object) '4');
        experiment.util.Iterator iterator5 = treeSetTestDriver0.iterator();
        treeSetTestDriver0.clear();
        treeSetTestDriver0.clear();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test089");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.add((java.lang.Object) (byte) -1);
        experiment.util.TreeSetTestDriver treeSetTestDriver3 = new experiment.util.TreeSetTestDriver();
        int int4 = treeSetTestDriver3.size();
        boolean boolean6 = treeSetTestDriver3.remove((java.lang.Object) '4');
        java.lang.Object[] objArray7 = treeSetTestDriver3.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver8 = new experiment.util.TreeSetTestDriver();
        boolean boolean10 = treeSetTestDriver8.add((java.lang.Object) "hi!");
        boolean boolean11 = treeSetTestDriver3.add((java.lang.Object) treeSetTestDriver8);
        boolean boolean12 = treeSetTestDriver3.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = treeSetTestDriver0.remove((java.lang.Object) treeSetTestDriver3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test090");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj2 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        experiment.util.TreeSetTestDriver treeSetTestDriver3 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj5 = treeSetTestDriver3.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator6 = treeSetTestDriver3.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver7 = new experiment.util.TreeSetTestDriver();
        int int8 = treeSetTestDriver7.size();
        boolean boolean10 = treeSetTestDriver7.remove((java.lang.Object) '4');
        java.lang.Object obj11 = treeSetTestDriver3.getMatch((java.lang.Object) '4');
        boolean boolean12 = treeSetTestDriver0.equals_CUT((java.lang.Object) treeSetTestDriver3);
        experiment.util.TreeSetTestDriver treeSetTestDriver13 = new experiment.util.TreeSetTestDriver();
        int int14 = treeSetTestDriver13.size();
        boolean boolean16 = treeSetTestDriver13.remove((java.lang.Object) '4');
        java.lang.Object[] objArray17 = treeSetTestDriver13.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver18 = new experiment.util.TreeSetTestDriver();
        boolean boolean20 = treeSetTestDriver18.add((java.lang.Object) "hi!");
        boolean boolean21 = treeSetTestDriver13.add((java.lang.Object) treeSetTestDriver18);
        experiment.util.Iterator iterator22 = treeSetTestDriver18.iterator();
        treeSetTestDriver18.clear();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = treeSetTestDriver0.contains((java.lang.Object) treeSetTestDriver18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(iterator22);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test091");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj2 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        treeSetTestDriver0.clear();
        experiment.util.TreeSetTestDriver treeSetTestDriver4 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj6 = treeSetTestDriver4.getMatch((java.lang.Object) (-1.0f));
        boolean boolean7 = treeSetTestDriver4.isEmpty();
        boolean boolean9 = treeSetTestDriver4.contains((java.lang.Object) 1);
        experiment.util.TreeSetTestDriver treeSetTestDriver10 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj12 = treeSetTestDriver10.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator13 = treeSetTestDriver10.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver14 = new experiment.util.TreeSetTestDriver();
        int int15 = treeSetTestDriver14.size();
        boolean boolean17 = treeSetTestDriver14.remove((java.lang.Object) '4');
        java.lang.Object obj18 = treeSetTestDriver10.getMatch((java.lang.Object) '4');
        boolean boolean19 = treeSetTestDriver4.add((java.lang.Object) treeSetTestDriver10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = treeSetTestDriver0.getMatch((java.lang.Object) treeSetTestDriver4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(comparator13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test092");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        boolean boolean3 = treeSetTestDriver0.remove((java.lang.Object) '4');
        treeSetTestDriver0.clear();
        experiment.util.TreeSetTestDriver treeSetTestDriver5 = new experiment.util.TreeSetTestDriver();
        int int6 = treeSetTestDriver5.size();
        boolean boolean8 = treeSetTestDriver5.remove((java.lang.Object) '4');
        java.lang.Object[] objArray9 = treeSetTestDriver5.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver10 = new experiment.util.TreeSetTestDriver();
        boolean boolean12 = treeSetTestDriver10.add((java.lang.Object) "hi!");
        boolean boolean13 = treeSetTestDriver5.add((java.lang.Object) treeSetTestDriver10);
        boolean boolean14 = treeSetTestDriver0.contains((java.lang.Object) boolean13);
        experiment.util.Iterator iterator15 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver16 = new experiment.util.TreeSetTestDriver();
        int int17 = treeSetTestDriver16.size();
        boolean boolean19 = treeSetTestDriver16.remove((java.lang.Object) '4');
        experiment.util.Comparator comparator20 = treeSetTestDriver16.comparator();
        java.lang.Object[] objArray21 = treeSetTestDriver16.toArray();
        treeSetTestDriver16.clear();
        experiment.util.TreeSetTestDriver treeSetTestDriver23 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj25 = treeSetTestDriver23.getMatch((java.lang.Object) (-1.0f));
        boolean boolean27 = treeSetTestDriver23.contains((java.lang.Object) '4');
        experiment.util.Iterator iterator28 = treeSetTestDriver23.iterator();
        experiment.util.Iterator iterator29 = treeSetTestDriver23.iterator();
        boolean boolean30 = treeSetTestDriver16.equals_CUT((java.lang.Object) iterator29);
        boolean boolean31 = treeSetTestDriver0.contains((java.lang.Object) boolean30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(comparator20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test093");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver2 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj4 = treeSetTestDriver2.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator5 = treeSetTestDriver2.comparator();
        java.lang.Object[] objArray6 = treeSetTestDriver2.toArray();
        boolean boolean7 = treeSetTestDriver0.add((java.lang.Object) treeSetTestDriver2);
        treeSetTestDriver0.clear();
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(comparator5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test094");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        boolean boolean3 = treeSetTestDriver0.add((java.lang.Object) 0L);
        java.lang.Object[] objArray4 = treeSetTestDriver0.toArray();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0]");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test095");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        boolean boolean3 = treeSetTestDriver0.add((java.lang.Object) 0L);
        java.lang.Object obj4 = treeSetTestDriver0.first();
        treeSetTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0L + "'", obj4, 0L);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test096");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.TreeSetTestDriver treeSetTestDriver1 = new experiment.util.TreeSetTestDriver();
        boolean boolean3 = treeSetTestDriver1.add((java.lang.Object) "hi!");
        java.lang.Object obj4 = treeSetTestDriver0.getMatch((java.lang.Object) "hi!");
        experiment.util.TreeSetTestDriver treeSetTestDriver5 = new experiment.util.TreeSetTestDriver();
        experiment.util.TreeSetTestDriver treeSetTestDriver6 = new experiment.util.TreeSetTestDriver();
        boolean boolean8 = treeSetTestDriver6.add((java.lang.Object) "hi!");
        java.lang.Object obj9 = treeSetTestDriver5.getMatch((java.lang.Object) "hi!");
        boolean boolean10 = treeSetTestDriver0.add((java.lang.Object) treeSetTestDriver5);
        int int11 = treeSetTestDriver5.size();
        experiment.util.TreeSetTestDriver treeSetTestDriver12 = new experiment.util.TreeSetTestDriver();
        int int13 = treeSetTestDriver12.size();
        boolean boolean15 = treeSetTestDriver12.remove((java.lang.Object) '4');
        java.lang.Object[] objArray16 = treeSetTestDriver12.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver17 = new experiment.util.TreeSetTestDriver();
        boolean boolean19 = treeSetTestDriver17.add((java.lang.Object) "hi!");
        boolean boolean20 = treeSetTestDriver12.add((java.lang.Object) treeSetTestDriver17);
        boolean boolean21 = treeSetTestDriver12.isEmpty();
        java.lang.Object obj22 = treeSetTestDriver12.first();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = treeSetTestDriver5.getMatch((java.lang.Object) treeSetTestDriver12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test097");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj2 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        experiment.util.TreeSetTestDriver treeSetTestDriver3 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj5 = treeSetTestDriver3.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator6 = treeSetTestDriver3.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver7 = new experiment.util.TreeSetTestDriver();
        int int8 = treeSetTestDriver7.size();
        boolean boolean10 = treeSetTestDriver7.remove((java.lang.Object) '4');
        java.lang.Object obj11 = treeSetTestDriver3.getMatch((java.lang.Object) '4');
        boolean boolean12 = treeSetTestDriver0.equals_CUT((java.lang.Object) treeSetTestDriver3);
        experiment.util.TreeSetTestDriver treeSetTestDriver13 = new experiment.util.TreeSetTestDriver();
        boolean boolean15 = treeSetTestDriver13.add((java.lang.Object) "hi!");
        experiment.util.Iterator iterator16 = treeSetTestDriver13.iterator();
        boolean boolean17 = treeSetTestDriver0.remove((java.lang.Object) treeSetTestDriver13);
        treeSetTestDriver13.clear();
        experiment.util.TreeSetTestDriver treeSetTestDriver19 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator20 = treeSetTestDriver19.comparator();
        experiment.util.Iterator iterator21 = treeSetTestDriver19.iterator();
        int int22 = treeSetTestDriver19.size();
        java.lang.Object[] objArray23 = treeSetTestDriver19.toArray();
        boolean boolean24 = treeSetTestDriver13.remove((java.lang.Object) objArray23);
        experiment.util.TreeSetTestDriver treeSetTestDriver25 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj27 = treeSetTestDriver25.getMatch((java.lang.Object) (-1.0f));
        int int28 = treeSetTestDriver25.size();
        boolean boolean29 = treeSetTestDriver13.equals_CUT((java.lang.Object) int28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = treeSetTestDriver13.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(comparator20);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test098");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        boolean boolean3 = treeSetTestDriver0.remove((java.lang.Object) '4');
        java.lang.Object[] objArray4 = treeSetTestDriver0.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver5 = new experiment.util.TreeSetTestDriver();
        boolean boolean7 = treeSetTestDriver5.add((java.lang.Object) "hi!");
        boolean boolean8 = treeSetTestDriver0.add((java.lang.Object) treeSetTestDriver5);
        experiment.util.Iterator iterator9 = treeSetTestDriver5.iterator();
        boolean boolean10 = treeSetTestDriver5.isEmpty();
        experiment.util.TreeSetTestDriver treeSetTestDriver11 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj13 = treeSetTestDriver11.getMatch((java.lang.Object) (-1.0f));
        boolean boolean14 = treeSetTestDriver11.isEmpty();
        boolean boolean16 = treeSetTestDriver11.contains((java.lang.Object) 1);
        boolean boolean17 = treeSetTestDriver11.isEmpty();
        java.lang.Object obj19 = treeSetTestDriver11.getMatch((java.lang.Object) 1L);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = treeSetTestDriver5.contains((java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to java.lang.Long");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test099");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj2 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        java.lang.Object[] objArray4 = treeSetTestDriver0.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver5 = new experiment.util.TreeSetTestDriver();
        int int6 = treeSetTestDriver5.size();
        boolean boolean8 = treeSetTestDriver5.remove((java.lang.Object) '4');
        java.lang.Object[] objArray9 = treeSetTestDriver5.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver10 = new experiment.util.TreeSetTestDriver();
        boolean boolean12 = treeSetTestDriver10.add((java.lang.Object) "hi!");
        boolean boolean13 = treeSetTestDriver5.add((java.lang.Object) treeSetTestDriver10);
        boolean boolean14 = treeSetTestDriver0.equals_CUT((java.lang.Object) treeSetTestDriver10);
        java.lang.Object obj15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = treeSetTestDriver0.getMatch(obj15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test100");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.add((java.lang.Object) (byte) -1);
        boolean boolean3 = treeSetTestDriver0.isEmpty();
        treeSetTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test101");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj2 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        experiment.util.TreeSetTestDriver treeSetTestDriver3 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj5 = treeSetTestDriver3.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator6 = treeSetTestDriver3.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver7 = new experiment.util.TreeSetTestDriver();
        int int8 = treeSetTestDriver7.size();
        boolean boolean10 = treeSetTestDriver7.remove((java.lang.Object) '4');
        java.lang.Object obj11 = treeSetTestDriver3.getMatch((java.lang.Object) '4');
        boolean boolean12 = treeSetTestDriver0.equals_CUT((java.lang.Object) treeSetTestDriver3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = treeSetTestDriver3.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test102");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        java.lang.Object[] objArray2 = treeSetTestDriver0.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver3 = new experiment.util.TreeSetTestDriver();
        int int4 = treeSetTestDriver3.size();
        boolean boolean6 = treeSetTestDriver3.remove((java.lang.Object) '4');
        java.lang.Object[] objArray7 = treeSetTestDriver3.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver8 = new experiment.util.TreeSetTestDriver();
        boolean boolean10 = treeSetTestDriver8.add((java.lang.Object) "hi!");
        boolean boolean11 = treeSetTestDriver3.add((java.lang.Object) treeSetTestDriver8);
        experiment.util.Iterator iterator12 = treeSetTestDriver8.iterator();
        treeSetTestDriver8.clear();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = treeSetTestDriver0.contains((java.lang.Object) treeSetTestDriver8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test103");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj2 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test104");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        boolean boolean3 = treeSetTestDriver0.remove((java.lang.Object) '4');
        experiment.util.Comparator comparator4 = treeSetTestDriver0.comparator();
        java.lang.Object[] objArray5 = treeSetTestDriver0.toArray();
        boolean boolean7 = treeSetTestDriver0.add((java.lang.Object) 'a');
        java.lang.Object obj8 = treeSetTestDriver0.last();
        experiment.util.TreeSetTestDriver treeSetTestDriver9 = new experiment.util.TreeSetTestDriver();
        int int10 = treeSetTestDriver9.size();
        boolean boolean12 = treeSetTestDriver9.add((java.lang.Object) 0L);
        experiment.util.Comparator comparator13 = treeSetTestDriver9.comparator();
        java.lang.Object obj14 = treeSetTestDriver9.last();
        int int15 = treeSetTestDriver9.size();
        treeSetTestDriver9.clear();
        boolean boolean17 = treeSetTestDriver9.isEmpty();
        boolean boolean18 = treeSetTestDriver9.isEmpty();
        experiment.util.Comparator comparator19 = treeSetTestDriver9.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = treeSetTestDriver0.getMatch((java.lang.Object) comparator19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 'a' + "'", obj8, 'a');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(comparator13);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0L + "'", obj14, 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(comparator19);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test105");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj2 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        boolean boolean3 = treeSetTestDriver0.isEmpty();
        boolean boolean5 = treeSetTestDriver0.contains((java.lang.Object) 1);
        experiment.util.TreeSetTestDriver treeSetTestDriver6 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj8 = treeSetTestDriver6.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator9 = treeSetTestDriver6.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver10 = new experiment.util.TreeSetTestDriver();
        int int11 = treeSetTestDriver10.size();
        boolean boolean13 = treeSetTestDriver10.remove((java.lang.Object) '4');
        java.lang.Object obj14 = treeSetTestDriver6.getMatch((java.lang.Object) '4');
        boolean boolean15 = treeSetTestDriver0.add((java.lang.Object) treeSetTestDriver6);
        boolean boolean16 = treeSetTestDriver6.isEmpty();
        int int17 = treeSetTestDriver6.size();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test106");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.TreeSetTestDriver treeSetTestDriver1 = new experiment.util.TreeSetTestDriver();
        int int2 = treeSetTestDriver1.size();
        boolean boolean4 = treeSetTestDriver1.add((java.lang.Object) 0L);
        experiment.util.Comparator comparator5 = treeSetTestDriver1.comparator();
        java.lang.Object obj6 = treeSetTestDriver1.last();
        treeSetTestDriver1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = treeSetTestDriver0.getMatch((java.lang.Object) treeSetTestDriver1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(comparator5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0L + "'", obj6, 0L);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test107");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj2 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        boolean boolean3 = treeSetTestDriver0.isEmpty();
        boolean boolean5 = treeSetTestDriver0.contains((java.lang.Object) 1);
        boolean boolean6 = treeSetTestDriver0.isEmpty();
        int int7 = treeSetTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test108");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj2 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        boolean boolean4 = treeSetTestDriver0.contains((java.lang.Object) '4');
        experiment.util.Iterator iterator5 = treeSetTestDriver0.iterator();
        treeSetTestDriver0.clear();
        experiment.util.Comparator comparator7 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver8 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj10 = treeSetTestDriver8.getMatch((java.lang.Object) (-1.0f));
        experiment.util.TreeSetTestDriver treeSetTestDriver11 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj13 = treeSetTestDriver11.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator14 = treeSetTestDriver11.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver15 = new experiment.util.TreeSetTestDriver();
        int int16 = treeSetTestDriver15.size();
        boolean boolean18 = treeSetTestDriver15.remove((java.lang.Object) '4');
        java.lang.Object obj19 = treeSetTestDriver11.getMatch((java.lang.Object) '4');
        boolean boolean20 = treeSetTestDriver8.equals_CUT((java.lang.Object) treeSetTestDriver11);
        experiment.util.Comparator comparator21 = treeSetTestDriver8.comparator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = treeSetTestDriver0.contains((java.lang.Object) comparator21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNull(comparator7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(comparator14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(comparator21);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test109");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.add((java.lang.Object) "hi!");
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        experiment.util.Iterator iterator4 = treeSetTestDriver0.iterator();
        java.lang.Object obj5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = treeSetTestDriver0.equals_CUT(obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(iterator4);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test110");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        boolean boolean3 = treeSetTestDriver0.remove((java.lang.Object) '4');
        treeSetTestDriver0.clear();
        treeSetTestDriver0.clear();
        boolean boolean6 = treeSetTestDriver0.isEmpty();
        experiment.util.TreeSetTestDriver treeSetTestDriver7 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj9 = treeSetTestDriver7.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator10 = treeSetTestDriver7.comparator();
        java.lang.Object[] objArray11 = treeSetTestDriver7.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver12 = new experiment.util.TreeSetTestDriver();
        int int13 = treeSetTestDriver12.size();
        boolean boolean15 = treeSetTestDriver12.remove((java.lang.Object) '4');
        java.lang.Object[] objArray16 = treeSetTestDriver12.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver17 = new experiment.util.TreeSetTestDriver();
        boolean boolean19 = treeSetTestDriver17.add((java.lang.Object) "hi!");
        boolean boolean20 = treeSetTestDriver12.add((java.lang.Object) treeSetTestDriver17);
        boolean boolean21 = treeSetTestDriver7.equals_CUT((java.lang.Object) treeSetTestDriver17);
        boolean boolean22 = treeSetTestDriver0.remove((java.lang.Object) treeSetTestDriver17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test111");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj2 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver4 = new experiment.util.TreeSetTestDriver();
        int int5 = treeSetTestDriver4.size();
        boolean boolean7 = treeSetTestDriver4.remove((java.lang.Object) '4');
        java.lang.Object obj8 = treeSetTestDriver0.getMatch((java.lang.Object) '4');
        boolean boolean9 = treeSetTestDriver0.isEmpty();
        experiment.util.TreeSetTestDriver treeSetTestDriver10 = new experiment.util.TreeSetTestDriver();
        int int11 = treeSetTestDriver10.size();
        boolean boolean13 = treeSetTestDriver10.remove((java.lang.Object) '4');
        experiment.util.Comparator comparator14 = treeSetTestDriver10.comparator();
        java.lang.Object[] objArray15 = treeSetTestDriver10.toArray();
        treeSetTestDriver10.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = treeSetTestDriver0.getMatch((java.lang.Object) treeSetTestDriver10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(comparator14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test112");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        boolean boolean3 = treeSetTestDriver0.remove((java.lang.Object) '4');
        java.lang.Object[] objArray4 = treeSetTestDriver0.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver5 = new experiment.util.TreeSetTestDriver();
        boolean boolean7 = treeSetTestDriver5.add((java.lang.Object) "hi!");
        boolean boolean8 = treeSetTestDriver0.add((java.lang.Object) treeSetTestDriver5);
        boolean boolean9 = treeSetTestDriver0.isEmpty();
        java.lang.Object obj10 = treeSetTestDriver0.first();
        experiment.util.TreeSetTestDriver treeSetTestDriver11 = new experiment.util.TreeSetTestDriver();
        int int12 = treeSetTestDriver11.size();
        boolean boolean14 = treeSetTestDriver11.add((java.lang.Object) 0L);
        experiment.util.Comparator comparator15 = treeSetTestDriver11.comparator();
        java.lang.Object obj16 = treeSetTestDriver11.last();
        int int17 = treeSetTestDriver11.size();
        treeSetTestDriver11.clear();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = treeSetTestDriver0.remove((java.lang.Object) treeSetTestDriver11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(comparator15);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0L + "'", obj16, 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test113");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj2 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        experiment.util.TreeSetTestDriver treeSetTestDriver3 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj5 = treeSetTestDriver3.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator6 = treeSetTestDriver3.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver7 = new experiment.util.TreeSetTestDriver();
        int int8 = treeSetTestDriver7.size();
        boolean boolean10 = treeSetTestDriver7.remove((java.lang.Object) '4');
        java.lang.Object obj11 = treeSetTestDriver3.getMatch((java.lang.Object) '4');
        boolean boolean12 = treeSetTestDriver0.equals_CUT((java.lang.Object) treeSetTestDriver3);
        experiment.util.TreeSetTestDriver treeSetTestDriver13 = new experiment.util.TreeSetTestDriver();
        boolean boolean15 = treeSetTestDriver13.add((java.lang.Object) "hi!");
        experiment.util.Iterator iterator16 = treeSetTestDriver13.iterator();
        boolean boolean17 = treeSetTestDriver0.remove((java.lang.Object) treeSetTestDriver13);
        java.lang.Object obj19 = treeSetTestDriver0.getMatch((java.lang.Object) 100);
        experiment.util.Iterator iterator20 = treeSetTestDriver0.iterator();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(iterator20);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test114");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver2 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj4 = treeSetTestDriver2.getMatch((java.lang.Object) (-1.0f));
        boolean boolean6 = treeSetTestDriver2.contains((java.lang.Object) '4');
        experiment.util.Iterator iterator7 = treeSetTestDriver2.iterator();
        experiment.util.Iterator iterator8 = treeSetTestDriver2.iterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = treeSetTestDriver0.contains((java.lang.Object) iterator8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet$TreeSetIterator cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test115");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        boolean boolean3 = treeSetTestDriver0.add((java.lang.Object) 0L);
        experiment.util.Comparator comparator4 = treeSetTestDriver0.comparator();
        java.lang.Object obj5 = treeSetTestDriver0.last();
        int int6 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        experiment.util.TreeSetTestDriver treeSetTestDriver8 = new experiment.util.TreeSetTestDriver();
        experiment.util.TreeSetTestDriver treeSetTestDriver9 = new experiment.util.TreeSetTestDriver();
        boolean boolean11 = treeSetTestDriver9.add((java.lang.Object) "hi!");
        java.lang.Object obj12 = treeSetTestDriver8.getMatch((java.lang.Object) "hi!");
        java.lang.Object[] objArray13 = treeSetTestDriver8.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = treeSetTestDriver0.getMatch((java.lang.Object) treeSetTestDriver8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0L + "'", obj5, 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test116");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj2 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        boolean boolean3 = treeSetTestDriver0.isEmpty();
        boolean boolean5 = treeSetTestDriver0.contains((java.lang.Object) 1);
        boolean boolean6 = treeSetTestDriver0.isEmpty();
        java.lang.Object[] objArray7 = treeSetTestDriver0.toArray();
        java.lang.Object[] objArray8 = treeSetTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test117");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj2 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        int int3 = treeSetTestDriver0.size();
        experiment.util.TreeSetTestDriver treeSetTestDriver4 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj6 = treeSetTestDriver4.getMatch((java.lang.Object) (-1.0f));
        int int7 = treeSetTestDriver4.size();
        boolean boolean8 = treeSetTestDriver0.equals_CUT((java.lang.Object) int7);
        experiment.util.TreeSetTestDriver treeSetTestDriver9 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj11 = treeSetTestDriver9.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator12 = treeSetTestDriver9.comparator();
        java.lang.Object[] objArray13 = treeSetTestDriver9.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver14 = new experiment.util.TreeSetTestDriver();
        int int15 = treeSetTestDriver14.size();
        boolean boolean17 = treeSetTestDriver14.remove((java.lang.Object) '4');
        java.lang.Object[] objArray18 = treeSetTestDriver14.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver19 = new experiment.util.TreeSetTestDriver();
        boolean boolean21 = treeSetTestDriver19.add((java.lang.Object) "hi!");
        boolean boolean22 = treeSetTestDriver14.add((java.lang.Object) treeSetTestDriver19);
        boolean boolean23 = treeSetTestDriver9.equals_CUT((java.lang.Object) treeSetTestDriver19);
        java.lang.Class<?> wildcardClass24 = treeSetTestDriver19.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = treeSetTestDriver0.contains((java.lang.Object) wildcardClass24);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test118");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj2 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        experiment.util.TreeSetTestDriver treeSetTestDriver3 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj5 = treeSetTestDriver3.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator6 = treeSetTestDriver3.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver7 = new experiment.util.TreeSetTestDriver();
        int int8 = treeSetTestDriver7.size();
        boolean boolean10 = treeSetTestDriver7.remove((java.lang.Object) '4');
        java.lang.Object obj11 = treeSetTestDriver3.getMatch((java.lang.Object) '4');
        boolean boolean12 = treeSetTestDriver0.equals_CUT((java.lang.Object) treeSetTestDriver3);
        experiment.util.Comparator comparator13 = treeSetTestDriver0.comparator();
        int int14 = treeSetTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(comparator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test119");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj2 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        boolean boolean3 = treeSetTestDriver0.isEmpty();
        boolean boolean5 = treeSetTestDriver0.contains((java.lang.Object) 1);
        boolean boolean6 = treeSetTestDriver0.isEmpty();
        int int7 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test120");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        boolean boolean3 = treeSetTestDriver0.add((java.lang.Object) 0L);
        experiment.util.Comparator comparator4 = treeSetTestDriver0.comparator();
        java.lang.Object obj5 = treeSetTestDriver0.last();
        int int6 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        boolean boolean8 = treeSetTestDriver0.isEmpty();
        boolean boolean9 = treeSetTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0L + "'", obj5, 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test121");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj2 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        boolean boolean3 = treeSetTestDriver0.isEmpty();
        boolean boolean5 = treeSetTestDriver0.contains((java.lang.Object) 1);
        java.lang.Object[] objArray6 = treeSetTestDriver0.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver7 = new experiment.util.TreeSetTestDriver();
        int int8 = treeSetTestDriver7.size();
        boolean boolean10 = treeSetTestDriver7.add((java.lang.Object) 0L);
        experiment.util.Comparator comparator11 = treeSetTestDriver7.comparator();
        java.lang.Object obj12 = treeSetTestDriver7.last();
        int int13 = treeSetTestDriver7.size();
        java.lang.Object[] objArray14 = treeSetTestDriver7.toArray();
        boolean boolean15 = treeSetTestDriver0.equals_CUT((java.lang.Object) objArray14);
        experiment.util.TreeSetTestDriver treeSetTestDriver16 = new experiment.util.TreeSetTestDriver();
        int int17 = treeSetTestDriver16.size();
        java.lang.Object[] objArray18 = treeSetTestDriver16.toArray();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = treeSetTestDriver0.contains((java.lang.Object) treeSetTestDriver16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0L + "'", obj12, 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test122");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj2 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        int int3 = treeSetTestDriver0.size();
        boolean boolean5 = treeSetTestDriver0.contains((java.lang.Object) 100L);
        treeSetTestDriver0.clear();
        int int7 = treeSetTestDriver0.size();
        java.lang.Object obj8 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = treeSetTestDriver0.contains(obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Object cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test123");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        int int1 = treeSetTestDriver0.size();
        boolean boolean3 = treeSetTestDriver0.add((java.lang.Object) 0L);
        experiment.util.Comparator comparator4 = treeSetTestDriver0.comparator();
        java.lang.Object obj5 = treeSetTestDriver0.last();
        int int6 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        boolean boolean8 = treeSetTestDriver0.isEmpty();
        boolean boolean9 = treeSetTestDriver0.isEmpty();
        experiment.util.Comparator comparator10 = treeSetTestDriver0.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0L + "'", obj5, 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(comparator10);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test124");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj2 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        int int3 = treeSetTestDriver0.size();
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) 100);
        java.lang.Object[] objArray6 = treeSetTestDriver0.toArray();
        boolean boolean7 = treeSetTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test125");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj2 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        boolean boolean5 = treeSetTestDriver0.add((java.lang.Object) ' ');
        java.lang.Object[] objArray6 = treeSetTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = treeSetTestDriver0.add((java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[ ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[ ]");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test126");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj2 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        experiment.util.TreeSetTestDriver treeSetTestDriver3 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj5 = treeSetTestDriver3.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator6 = treeSetTestDriver3.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver7 = new experiment.util.TreeSetTestDriver();
        int int8 = treeSetTestDriver7.size();
        boolean boolean10 = treeSetTestDriver7.remove((java.lang.Object) '4');
        java.lang.Object obj11 = treeSetTestDriver3.getMatch((java.lang.Object) '4');
        boolean boolean12 = treeSetTestDriver0.equals_CUT((java.lang.Object) treeSetTestDriver3);
        treeSetTestDriver0.clear();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test127");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj2 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        java.lang.Object obj5 = treeSetTestDriver0.getMatch((java.lang.Object) 0L);
        experiment.util.TreeSetTestDriver treeSetTestDriver6 = new experiment.util.TreeSetTestDriver();
        int int7 = treeSetTestDriver6.size();
        boolean boolean9 = treeSetTestDriver6.remove((java.lang.Object) '4');
        java.lang.Object[] objArray10 = treeSetTestDriver6.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver11 = new experiment.util.TreeSetTestDriver();
        boolean boolean13 = treeSetTestDriver11.add((java.lang.Object) "hi!");
        boolean boolean14 = treeSetTestDriver6.add((java.lang.Object) treeSetTestDriver11);
        treeSetTestDriver6.clear();
        boolean boolean16 = treeSetTestDriver0.remove((java.lang.Object) treeSetTestDriver6);
        experiment.util.TreeSetTestDriver treeSetTestDriver17 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj19 = treeSetTestDriver17.getMatch((java.lang.Object) (-1.0f));
        boolean boolean20 = treeSetTestDriver17.isEmpty();
        boolean boolean22 = treeSetTestDriver17.contains((java.lang.Object) 1);
        boolean boolean23 = treeSetTestDriver17.isEmpty();
        java.lang.Object obj25 = treeSetTestDriver17.getMatch((java.lang.Object) 1L);
        boolean boolean26 = treeSetTestDriver17.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = treeSetTestDriver6.getMatch((java.lang.Object) treeSetTestDriver17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_939145594_1024_0.test128");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj2 = treeSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        boolean boolean3 = treeSetTestDriver0.isEmpty();
        boolean boolean5 = treeSetTestDriver0.contains((java.lang.Object) 1);
        boolean boolean6 = treeSetTestDriver0.isEmpty();
        experiment.util.TreeSetTestDriver treeSetTestDriver7 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj9 = treeSetTestDriver7.getMatch((java.lang.Object) (-1.0f));
        experiment.util.TreeSetTestDriver treeSetTestDriver10 = new experiment.util.TreeSetTestDriver();
        java.lang.Object obj12 = treeSetTestDriver10.getMatch((java.lang.Object) (-1.0f));
        experiment.util.Comparator comparator13 = treeSetTestDriver10.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver14 = new experiment.util.TreeSetTestDriver();
        int int15 = treeSetTestDriver14.size();
        boolean boolean17 = treeSetTestDriver14.remove((java.lang.Object) '4');
        java.lang.Object obj18 = treeSetTestDriver10.getMatch((java.lang.Object) '4');
        boolean boolean19 = treeSetTestDriver7.equals_CUT((java.lang.Object) treeSetTestDriver10);
        experiment.util.TreeSetTestDriver treeSetTestDriver20 = new experiment.util.TreeSetTestDriver();
        boolean boolean22 = treeSetTestDriver20.add((java.lang.Object) "hi!");
        experiment.util.Iterator iterator23 = treeSetTestDriver20.iterator();
        boolean boolean24 = treeSetTestDriver7.remove((java.lang.Object) treeSetTestDriver20);
        treeSetTestDriver20.clear();
        experiment.util.TreeSetTestDriver treeSetTestDriver26 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator27 = treeSetTestDriver26.comparator();
        experiment.util.Iterator iterator28 = treeSetTestDriver26.iterator();
        int int29 = treeSetTestDriver26.size();
        java.lang.Object[] objArray30 = treeSetTestDriver26.toArray();
        boolean boolean31 = treeSetTestDriver20.remove((java.lang.Object) objArray30);
        experiment.util.TreeSetTestDriver treeSetTestDriver32 = new experiment.util.TreeSetTestDriver();
        int int33 = treeSetTestDriver32.size();
        experiment.util.Comparator comparator34 = treeSetTestDriver32.comparator();
        java.lang.Object[] objArray35 = treeSetTestDriver32.toArray();
        boolean boolean36 = treeSetTestDriver20.equals_CUT((java.lang.Object) objArray35);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj37 = treeSetTestDriver0.getMatch((java.lang.Object) objArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Ljava.lang.Object; cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(comparator13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(comparator27);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(comparator34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

}
