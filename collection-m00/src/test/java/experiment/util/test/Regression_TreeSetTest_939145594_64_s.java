package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_TreeSetTest_939145594_64_s {

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

}
